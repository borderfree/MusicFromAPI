package com.facebook.ads.internal.p073r.p075b;

import android.text.TextUtils;
import com.facebook.ads.internal.p073r.p075b.p076a.C1754b;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Locale;

/* renamed from: com.facebook.ads.internal.r.b.e */
class C1766e extends C1778k {

    /* renamed from: a */
    private final C1775h f5771a;

    /* renamed from: b */
    private final C1754b f5772b;

    /* renamed from: c */
    private C1763b f5773c;

    public C1766e(C1775h hVar, C1754b bVar) {
        super(hVar, bVar);
        this.f5772b = bVar;
        this.f5771a = hVar;
    }

    /* renamed from: a */
    private void m8797a(OutputStream outputStream, long j) {
        byte[] bArr = new byte[8192];
        while (true) {
            int a = mo7049a(bArr, j, bArr.length);
            if (a != -1) {
                outputStream.write(bArr, 0, a);
                j += (long) a;
            } else {
                outputStream.flush();
                return;
            }
        }
    }

    /* renamed from: a */
    private boolean m8798a(C1765d dVar) {
        int a = this.f5771a.mo7043a();
        return !(a > 0) || !dVar.f5770c || ((float) dVar.f5769b) <= ((float) this.f5772b.mo7014a()) + (((float) a) * 0.2f);
    }

    /* renamed from: b */
    private String m8799b(C1765d dVar) {
        String c = this.f5771a.mo7047c();
        boolean z = !TextUtils.isEmpty(c);
        int a = this.f5772b.mo7019d() ? this.f5772b.mo7014a() : this.f5771a.mo7043a();
        boolean z2 = a >= 0;
        long j = dVar.f5770c ? ((long) a) - dVar.f5769b : (long) a;
        boolean z3 = z2 && dVar.f5770c;
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.f5770c ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n");
        sb.append("Accept-Ranges: bytes\n");
        sb.append(z2 ? String.format(Locale.US, "Content-Length: %d\n", new Object[]{Long.valueOf(j)}) : "");
        sb.append(z3 ? String.format(Locale.US, "Content-Range: bytes %d-%d/%d\n", new Object[]{Long.valueOf(dVar.f5769b), Integer.valueOf(a - 1), Integer.valueOf(a)}) : "");
        sb.append(z ? String.format(Locale.US, "Content-Type: %s\n", new Object[]{c}) : "");
        sb.append("\n");
        return sb.toString();
    }

    /* renamed from: b */
    private void m8800b(OutputStream outputStream, long j) {
        try {
            C1775h hVar = new C1775h(this.f5771a);
            hVar.mo7045a((int) j);
            byte[] bArr = new byte[8192];
            while (true) {
                int a = hVar.mo7044a(bArr);
                if (a != -1) {
                    outputStream.write(bArr, 0, a);
                } else {
                    outputStream.flush();
                    return;
                }
            }
        } finally {
            this.f5771a.mo7046b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7030a(int i) {
        if (this.f5773c != null) {
            this.f5773c.mo7027a(this.f5772b.f5756a, this.f5771a.f5798a, i);
        }
    }

    /* renamed from: a */
    public void mo7031a(C1763b bVar) {
        this.f5773c = bVar;
    }

    /* renamed from: a */
    public void mo7032a(C1765d dVar, Socket socket) {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(m8799b(dVar).getBytes("UTF-8"));
        long j = dVar.f5769b;
        if (m8798a(dVar)) {
            m8797a((OutputStream) bufferedOutputStream, j);
        } else {
            m8800b(bufferedOutputStream, j);
        }
    }
}
