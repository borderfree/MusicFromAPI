package com.facebook;

import android.os.Handler;
import com.facebook.GraphRequest.C1609b;
import com.facebook.GraphRequest.C1612e;

/* renamed from: com.facebook.p */
class C2317p {

    /* renamed from: a */
    private final GraphRequest f7425a;

    /* renamed from: b */
    private final Handler f7426b;

    /* renamed from: c */
    private final long f7427c = C2189f.m10095i();

    /* renamed from: d */
    private long f7428d;

    /* renamed from: e */
    private long f7429e;

    /* renamed from: f */
    private long f7430f;

    C2317p(Handler handler, GraphRequest graphRequest) {
        this.f7425a = graphRequest;
        this.f7426b = handler;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8101a() {
        if (this.f7428d > this.f7429e) {
            C1609b g = this.f7425a.mo6582g();
            if (this.f7430f > 0 && (g instanceof C1612e)) {
                final long j = this.f7428d;
                final long j2 = this.f7430f;
                final C1612e eVar = (C1612e) g;
                if (this.f7426b == null) {
                    eVar.mo6603a(j, j2);
                } else {
                    Handler handler = this.f7426b;
                    C23181 r2 = new Runnable() {
                        public void run() {
                            eVar.mo6603a(j, j2);
                        }
                    };
                    handler.post(r2);
                }
                this.f7429e = this.f7428d;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8102a(long j) {
        this.f7428d += j;
        if (this.f7428d >= this.f7429e + this.f7427c || this.f7428d >= this.f7430f) {
            mo8101a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8103b(long j) {
        this.f7430f += j;
    }
}
