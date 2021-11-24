package com.facebook;

import android.os.Handler;
import com.facebook.C2196h.C2197a;
import com.facebook.C2196h.C2198b;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Map;

/* renamed from: com.facebook.n */
class C2314n extends FilterOutputStream implements C2316o {

    /* renamed from: a */
    private final Map<GraphRequest, C2317p> f7416a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2196h f7417b;

    /* renamed from: c */
    private final long f7418c = C2189f.m10095i();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f7419d;

    /* renamed from: e */
    private long f7420e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f7421f;

    /* renamed from: g */
    private C2317p f7422g;

    C2314n(OutputStream outputStream, C2196h hVar, Map<GraphRequest, C2317p> map, long j) {
        super(outputStream);
        this.f7417b = hVar;
        this.f7416a = map;
        this.f7421f = j;
    }

    /* renamed from: a */
    private void m10728a() {
        if (this.f7419d > this.f7420e) {
            for (C2197a aVar : this.f7417b.mo7784e()) {
                if (aVar instanceof C2198b) {
                    Handler c = this.f7417b.mo7781c();
                    final C2198b bVar = (C2198b) aVar;
                    if (c == null) {
                        bVar.mo7794a(this.f7417b, this.f7419d, this.f7421f);
                    } else {
                        c.post(new Runnable() {
                            public void run() {
                                bVar.mo7794a(C2314n.this.f7417b, C2314n.this.f7419d, C2314n.this.f7421f);
                            }
                        });
                    }
                }
            }
            this.f7420e = this.f7419d;
        }
    }

    /* renamed from: a */
    private void m10729a(long j) {
        if (this.f7422g != null) {
            this.f7422g.mo8102a(j);
        }
        this.f7419d += j;
        if (this.f7419d >= this.f7420e + this.f7418c || this.f7419d >= this.f7421f) {
            m10728a();
        }
    }

    /* renamed from: a */
    public void mo8091a(GraphRequest graphRequest) {
        this.f7422g = graphRequest != null ? (C2317p) this.f7416a.get(graphRequest) : null;
    }

    public void close() {
        super.close();
        for (C2317p a : this.f7416a.values()) {
            a.mo8101a();
        }
        m10728a();
    }

    public void write(int i) {
        this.out.write(i);
        m10729a(1);
    }

    public void write(byte[] bArr) {
        this.out.write(bArr);
        m10729a((long) bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        m10729a((long) i2);
    }
}
