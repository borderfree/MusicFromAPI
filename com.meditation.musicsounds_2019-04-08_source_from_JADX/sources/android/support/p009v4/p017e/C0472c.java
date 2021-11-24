package android.support.p009v4.p017e;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;

/* renamed from: android.support.v4.e.c */
public class C0472c {

    /* renamed from: a */
    private final Object f1417a = new Object();

    /* renamed from: b */
    private HandlerThread f1418b;

    /* renamed from: c */
    private Handler f1419c;

    /* renamed from: d */
    private int f1420d;

    /* renamed from: e */
    private Callback f1421e = new Callback() {
        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    C0472c.this.m2140a();
                    return true;
                case 1:
                    C0472c.this.m2144b((Runnable) message.obj);
                    return true;
                default:
                    return true;
            }
        }
    };

    /* renamed from: f */
    private final int f1422f;

    /* renamed from: g */
    private final int f1423g;

    /* renamed from: h */
    private final String f1424h;

    /* renamed from: android.support.v4.e.c$a */
    public interface C0477a<T> {
        /* renamed from: a */
        void mo1858a(T t);
    }

    public C0472c(String str, int i, int i2) {
        this.f1424h = str;
        this.f1423g = i;
        this.f1422f = i2;
        this.f1420d = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2140a() {
        synchronized (this.f1417a) {
            if (!this.f1419c.hasMessages(1)) {
                this.f1418b.quit();
                this.f1418b = null;
                this.f1419c = null;
            }
        }
    }

    /* renamed from: a */
    private void m2143a(Runnable runnable) {
        synchronized (this.f1417a) {
            if (this.f1418b == null) {
                this.f1418b = new HandlerThread(this.f1424h, this.f1423g);
                this.f1418b.start();
                this.f1419c = new Handler(this.f1418b.getLooper(), this.f1421e);
                this.f1420d++;
            }
            this.f1419c.removeMessages(0);
            this.f1419c.sendMessage(this.f1419c.obtainMessage(1, runnable));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m2144b(Runnable runnable) {
        runnable.run();
        synchronized (this.f1417a) {
            this.f1419c.removeMessages(0);
            this.f1419c.sendMessageDelayed(this.f1419c.obtainMessage(0), (long) this.f1422f);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|11|12|13|(4:26|15|16|17)(1:18)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0040 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0046 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T mo1869a(java.util.concurrent.Callable<T> r13, int r14) {
        /*
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            java.util.concurrent.locks.Condition r8 = r7.newCondition()
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r10.<init>(r0)
            android.support.v4.e.c$3 r11 = new android.support.v4.e.c$3
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r8
            r0.<init>(r2, r3, r4, r5, r6)
            r12.m2143a(r11)
            r7.lock()
            boolean r13 = r10.get()     // Catch:{ all -> 0x005d }
            if (r13 != 0) goto L_0x0034
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005d }
            r7.unlock()
            return r13
        L_0x0034:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x005d }
            long r0 = (long) r14     // Catch:{ all -> 0x005d }
            long r13 = r13.toNanos(r0)     // Catch:{ all -> 0x005d }
        L_0x003b:
            long r0 = r8.awaitNanos(r13)     // Catch:{ InterruptedException -> 0x0040 }
            r13 = r0
        L_0x0040:
            boolean r0 = r10.get()     // Catch:{ all -> 0x005d }
            if (r0 != 0) goto L_0x004e
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005d }
            r7.unlock()
            return r13
        L_0x004e:
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0055
            goto L_0x003b
        L_0x0055:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException     // Catch:{ all -> 0x005d }
            java.lang.String r14 = "timeout"
            r13.<init>(r14)     // Catch:{ all -> 0x005d }
            throw r13     // Catch:{ all -> 0x005d }
        L_0x005d:
            r13 = move-exception
            r7.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p009v4.p017e.C0472c.mo1869a(java.util.concurrent.Callable, int):java.lang.Object");
    }

    /* renamed from: a */
    public <T> void mo1870a(final Callable<T> callable, final C0477a<T> aVar) {
        final Handler handler = new Handler();
        m2143a((Runnable) new Runnable() {
            public void run() {
                final Object obj;
                try {
                    obj = callable.call();
                } catch (Exception unused) {
                    obj = null;
                }
                handler.post(new Runnable() {
                    public void run() {
                        aVar.mo1858a(obj);
                    }
                });
            }
        });
    }
}
