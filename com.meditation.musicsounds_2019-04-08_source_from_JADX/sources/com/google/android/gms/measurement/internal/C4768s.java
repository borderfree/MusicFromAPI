package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.s */
final class C4768s implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f17230a;

    /* renamed from: b */
    private final /* synthetic */ String f17231b;

    /* renamed from: c */
    private final /* synthetic */ Object f17232c;

    /* renamed from: d */
    private final /* synthetic */ Object f17233d;

    /* renamed from: e */
    private final /* synthetic */ Object f17234e;

    /* renamed from: f */
    private final /* synthetic */ C4767r f17235f;

    C4768s(C4767r rVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f17235f = rVar;
        this.f17230a = i;
        this.f17231b = str;
        this.f17232c = obj;
        this.f17233d = obj2;
        this.f17234e = obj3;
    }

    public final void run() {
        C4767r rVar;
        char c;
        C4620ad c2 = this.f17235f.f16825q.mo15336c();
        if (!c2.mo15398z()) {
            this.f17235f.mo15844a(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.f17235f.f17218a == 0) {
            if (this.f17235f.mo15255t().mo15744g()) {
                rVar = this.f17235f;
                this.f17235f.mo15256u();
                c = 'C';
            } else {
                rVar = this.f17235f;
                this.f17235f.mo15256u();
                c = 'c';
            }
            rVar.f17218a = c;
        }
        if (this.f17235f.f17219b < 0) {
            this.f17235f.f17219b = this.f17235f.mo15255t().mo15742f();
        }
        char charAt = "01VDIWEA?".charAt(this.f17230a);
        char a = this.f17235f.f17218a;
        long b = this.f17235f.f17219b;
        String a2 = C4767r.m23926a(true, this.f17231b, this.f17232c, this.f17233d, this.f17234e);
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 24);
        sb.append("2");
        sb.append(charAt);
        sb.append(a);
        sb.append(b);
        sb.append(":");
        sb.append(a2);
        String sb2 = sb.toString();
        if (sb2.length() > 1024) {
            sb2 = this.f17231b.substring(0, 1024);
        }
        c2.f16646b.mo15286a(sb2, 1);
    }
}
