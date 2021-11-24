package com.facebook.ads.internal.p073r.p075b;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.ads.internal.p073r.p075b.p076a.C1753a;
import com.facebook.ads.internal.p073r.p075b.p076a.C1755c;
import com.facebook.ads.internal.p073r.p075b.p076a.C1761f;
import com.facebook.ads.internal.p073r.p075b.p076a.C1762g;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.facebook.ads.internal.r.b.f */
public class C1767f {

    /* renamed from: a */
    private final Object f5774a;

    /* renamed from: b */
    private final ExecutorService f5775b;

    /* renamed from: c */
    private final Map<String, C1773g> f5776c;

    /* renamed from: d */
    private final ServerSocket f5777d;

    /* renamed from: e */
    private final int f5778e;

    /* renamed from: f */
    private final Thread f5779f;

    /* renamed from: g */
    private final C1764c f5780g;

    /* renamed from: h */
    private boolean f5781h;

    /* renamed from: com.facebook.ads.internal.r.b.f$a */
    public static final class C1769a {

        /* renamed from: a */
        private File f5782a;

        /* renamed from: b */
        private C1755c f5783b = new C1761f();

        /* renamed from: c */
        private C1753a f5784c = new C1762g(67108864);

        public C1769a(Context context) {
            this.f5782a = C1784o.m8869a(context);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C1764c m8823a() {
            return new C1764c(this.f5782a, this.f5783b, this.f5784c);
        }
    }

    /* renamed from: com.facebook.ads.internal.r.b.f$b */
    private class C1770b implements Callable<Boolean> {
        private C1770b() {
        }

        /* renamed from: a */
        public Boolean call() {
            return Boolean.valueOf(C1767f.this.m8814c());
        }
    }

    /* renamed from: com.facebook.ads.internal.r.b.f$c */
    private final class C1771c implements Runnable {

        /* renamed from: b */
        private final Socket f5787b;

        public C1771c(Socket socket) {
            this.f5787b = socket;
        }

        public void run() {
            C1767f.this.m8807a(this.f5787b);
        }
    }

    /* renamed from: com.facebook.ads.internal.r.b.f$d */
    private final class C1772d implements Runnable {

        /* renamed from: b */
        private final CountDownLatch f5789b;

        public C1772d(CountDownLatch countDownLatch) {
            this.f5789b = countDownLatch;
        }

        public void run() {
            this.f5789b.countDown();
            C1767f.this.m8817e();
        }
    }

    public C1767f(Context context) {
        this(new C1769a(context).m8823a());
    }

    private C1767f(C1764c cVar) {
        this.f5774a = new Object();
        this.f5775b = Executors.newFixedThreadPool(8);
        this.f5776c = new ConcurrentHashMap();
        this.f5780g = (C1764c) C1777j.m8841a(cVar);
        try {
            this.f5777d = new ServerSocket(0, 8, InetAddress.getByName("127.0.0.1"));
            this.f5778e = this.f5777d.getLocalPort();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            this.f5779f = new Thread(new C1772d(countDownLatch));
            this.f5779f.start();
            countDownLatch.await();
            Log.i("ProxyCache", "Proxy cache server started. Ping it...");
            m8809b();
        } catch (IOException | InterruptedException e) {
            this.f5775b.shutdown();
            throw new IllegalStateException("Error starting local proxy server", e);
        }
    }

    /* renamed from: a */
    private void m8806a(Throwable th) {
        Log.e("ProxyCache", "HttpProxyCacheServer error", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8807a(Socket socket) {
        String str;
        StringBuilder sb;
        try {
            C1765d a = C1765d.m8795a(socket.getInputStream());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Request to cache proxy:");
            sb2.append(a);
            Log.i("ProxyCache", sb2.toString());
            String c = C1782m.m8863c(a.f5768a);
            if ("ping".equals(c)) {
                m8810b(socket);
            } else {
                m8812c(c).mo7040a(a, socket);
            }
            m8813c(socket);
            str = "ProxyCache";
            sb = new StringBuilder();
        } catch (SocketException unused) {
            Log.d("ProxyCache", "Closing socket... Socket is closed by client.");
            m8813c(socket);
            str = "ProxyCache";
            sb = new StringBuilder();
        } catch (C1781l | IOException e) {
            m8806a((Throwable) new C1781l("Error processing request", e));
            m8813c(socket);
            str = "ProxyCache";
            sb = new StringBuilder();
        } catch (Throwable th) {
            m8813c(socket);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Opened connections: ");
            sb3.append(m8819f());
            Log.d("ProxyCache", sb3.toString());
            throw th;
        }
        sb.append("Opened connections: ");
        sb.append(m8819f());
        Log.d(str, sb.toString());
    }

    /* renamed from: b */
    private String m8808b(String str) {
        return String.format(Locale.US, "http://%s:%d/%s", new Object[]{"127.0.0.1", Integer.valueOf(this.f5778e), C1782m.m8862b(str)});
    }

    /* renamed from: b */
    private void m8809b() {
        int i = 300;
        int i2 = 0;
        while (i2 < 3) {
            try {
                Future submit = this.f5775b.submit(new C1770b());
                long j = (long) i;
                this.f5781h = ((Boolean) submit.get(j, TimeUnit.MILLISECONDS)).booleanValue();
                if (!this.f5781h) {
                    SystemClock.sleep(j);
                    i2++;
                    i *= 2;
                } else {
                    return;
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error pinging server [attempt: ");
                sb.append(i2);
                sb.append(", timeout: ");
                sb.append(i);
                sb.append("]. ");
                Log.e("ProxyCache", sb.toString(), e);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Shutdown server... Error pinging server [attempts: ");
        sb2.append(i2);
        sb2.append(", max timeout: ");
        sb2.append(i / 2);
        sb2.append("].");
        Log.e("ProxyCache", sb2.toString());
        mo7034a();
    }

    /* renamed from: b */
    private void m8810b(Socket socket) {
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("HTTP/1.1 200 OK\n\n".getBytes());
        outputStream.write("ping ok".getBytes());
    }

    /* renamed from: c */
    private C1773g m8812c(String str) {
        C1773g gVar;
        synchronized (this.f5774a) {
            gVar = (C1773g) this.f5776c.get(str);
            if (gVar == null) {
                gVar = new C1773g(str, this.f5780g);
                this.f5776c.put(str, gVar);
            }
        }
        return gVar;
    }

    /* renamed from: c */
    private void m8813c(Socket socket) {
        m8816d(socket);
        m8818e(socket);
        m8820f(socket);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m8814c() {
        C1775h hVar = new C1775h(m8808b("ping"));
        try {
            byte[] bytes = "ping ok".getBytes();
            hVar.mo7045a(0);
            byte[] bArr = new byte[bytes.length];
            hVar.mo7044a(bArr);
            boolean equals = Arrays.equals(bytes, bArr);
            StringBuilder sb = new StringBuilder();
            sb.append("Ping response: `");
            sb.append(new String(bArr));
            sb.append("`, pinged? ");
            sb.append(equals);
            Log.d("ProxyCache", sb.toString());
            return equals;
        } catch (C1781l e) {
            Log.e("ProxyCache", "Error reading ping response", e);
            return false;
        } finally {
            hVar.mo7046b();
        }
    }

    /* renamed from: d */
    private void m8815d() {
        synchronized (this.f5774a) {
            for (C1773g a : this.f5776c.values()) {
                a.mo7039a();
            }
            this.f5776c.clear();
        }
    }

    /* renamed from: d */
    private void m8816d(Socket socket) {
        try {
            if (!socket.isInputShutdown()) {
                socket.shutdownInput();
            }
        } catch (SocketException unused) {
            Log.d("ProxyCache", "Releasing input stream... Socket is closed by client.");
        } catch (IOException e) {
            m8806a((Throwable) new C1781l("Error closing socket input stream", e));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m8817e() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Socket accept = this.f5777d.accept();
                StringBuilder sb = new StringBuilder();
                sb.append("Accept new socket ");
                sb.append(accept);
                Log.d("ProxyCache", sb.toString());
                this.f5775b.submit(new C1771c(accept));
            } catch (IOException e) {
                m8806a((Throwable) new C1781l("Error during waiting connection", e));
                return;
            }
        }
    }

    /* renamed from: e */
    private void m8818e(Socket socket) {
        try {
            if (socket.isOutputShutdown()) {
                socket.shutdownOutput();
            }
        } catch (IOException e) {
            m8806a((Throwable) new C1781l("Error closing socket output stream", e));
        }
    }

    /* renamed from: f */
    private int m8819f() {
        int i;
        synchronized (this.f5774a) {
            i = 0;
            for (C1773g b : this.f5776c.values()) {
                i += b.mo7041b();
            }
        }
        return i;
    }

    /* renamed from: f */
    private void m8820f(Socket socket) {
        try {
            if (!socket.isClosed()) {
                socket.close();
            }
        } catch (IOException e) {
            m8806a((Throwable) new C1781l("Error closing socket", e));
        }
    }

    /* renamed from: a */
    public String mo7033a(String str) {
        if (!this.f5781h) {
            Log.e("ProxyCache", "Proxy server isn't pinged. Caching doesn't work.");
        }
        return this.f5781h ? m8808b(str) : str;
    }

    /* renamed from: a */
    public void mo7034a() {
        Log.i("ProxyCache", "Shutdown proxy server");
        m8815d();
        this.f5779f.interrupt();
        try {
            if (!this.f5777d.isClosed()) {
                this.f5777d.close();
            }
        } catch (IOException e) {
            m8806a((Throwable) new C1781l("Error shutting down proxy server", e));
        }
    }
}
