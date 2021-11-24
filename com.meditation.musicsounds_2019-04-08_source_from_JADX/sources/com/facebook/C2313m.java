package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.m */
class C2313m extends OutputStream implements C2316o {

    /* renamed from: a */
    private final Map<GraphRequest, C2317p> f7411a = new HashMap();

    /* renamed from: b */
    private final Handler f7412b;

    /* renamed from: c */
    private GraphRequest f7413c;

    /* renamed from: d */
    private C2317p f7414d;

    /* renamed from: e */
    private int f7415e;

    C2313m(Handler handler) {
        this.f7412b = handler;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo8089a() {
        return this.f7415e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8090a(long j) {
        if (this.f7414d == null) {
            this.f7414d = new C2317p(this.f7412b, this.f7413c);
            this.f7411a.put(this.f7413c, this.f7414d);
        }
        this.f7414d.mo8103b(j);
        this.f7415e = (int) (((long) this.f7415e) + j);
    }

    /* renamed from: a */
    public void mo8091a(GraphRequest graphRequest) {
        this.f7413c = graphRequest;
        this.f7414d = graphRequest != null ? (C2317p) this.f7411a.get(graphRequest) : null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Map<GraphRequest, C2317p> mo8092b() {
        return this.f7411a;
    }

    public void write(int i) {
        mo8090a(1);
    }

    public void write(byte[] bArr) {
        mo8090a((long) bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        mo8090a((long) i2);
    }
}
