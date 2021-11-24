package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C3266s;

/* renamed from: com.google.android.gms.measurement.internal.em */
final class C4738em {

    /* renamed from: A */
    private boolean f17056A;

    /* renamed from: B */
    private long f17057B;

    /* renamed from: C */
    private long f17058C;

    /* renamed from: a */
    private final C4638av f17059a;

    /* renamed from: b */
    private final String f17060b;

    /* renamed from: c */
    private String f17061c;

    /* renamed from: d */
    private String f17062d;

    /* renamed from: e */
    private String f17063e;

    /* renamed from: f */
    private String f17064f;

    /* renamed from: g */
    private long f17065g;

    /* renamed from: h */
    private long f17066h;

    /* renamed from: i */
    private long f17067i;

    /* renamed from: j */
    private String f17068j;

    /* renamed from: k */
    private long f17069k;

    /* renamed from: l */
    private String f17070l;

    /* renamed from: m */
    private long f17071m;

    /* renamed from: n */
    private long f17072n;

    /* renamed from: o */
    private boolean f17073o;

    /* renamed from: p */
    private long f17074p;

    /* renamed from: q */
    private boolean f17075q;

    /* renamed from: r */
    private boolean f17076r;

    /* renamed from: s */
    private String f17077s;

    /* renamed from: t */
    private long f17078t;

    /* renamed from: u */
    private long f17079u;

    /* renamed from: v */
    private long f17080v;

    /* renamed from: w */
    private long f17081w;

    /* renamed from: x */
    private long f17082x;

    /* renamed from: y */
    private long f17083y;

    /* renamed from: z */
    private String f17084z;

    C4738em(C4638av avVar, String str) {
        C3266s.m14913a(avVar);
        C3266s.m14915a(str);
        this.f17059a = avVar;
        this.f17060b = str;
        this.f17059a.mo15252q().mo15239d();
    }

    /* renamed from: A */
    public final String mo15610A() {
        this.f17059a.mo15252q().mo15239d();
        String str = this.f17084z;
        mo15640h((String) null);
        return str;
    }

    /* renamed from: B */
    public final long mo15611B() {
        this.f17059a.mo15252q().mo15239d();
        return this.f17074p;
    }

    /* renamed from: C */
    public final boolean mo15612C() {
        this.f17059a.mo15252q().mo15239d();
        return this.f17075q;
    }

    /* renamed from: D */
    public final boolean mo15613D() {
        this.f17059a.mo15252q().mo15239d();
        return this.f17076r;
    }

    /* renamed from: a */
    public final void mo15614a() {
        this.f17059a.mo15252q().mo15239d();
        this.f17056A = false;
    }

    /* renamed from: a */
    public final void mo15615a(long j) {
        this.f17059a.mo15252q().mo15239d();
        this.f17056A |= this.f17066h != j;
        this.f17066h = j;
    }

    /* renamed from: a */
    public final void mo15616a(String str) {
        this.f17059a.mo15252q().mo15239d();
        this.f17056A |= !C4736ek.m23540c(this.f17061c, str);
        this.f17061c = str;
    }

    /* renamed from: a */
    public final void mo15617a(boolean z) {
        this.f17059a.mo15252q().mo15239d();
        this.f17056A |= this.f17073o != z;
        this.f17073o = z;
    }

    /* renamed from: b */
    public final String mo15618b() {
        this.f17059a.mo15252q().mo15239d();
        return this.f17060b;
    }

    /* renamed from: b */
    public final void mo15619b(long j) {
        this.f17059a.mo15252q().mo15239d();
        this.f17056A |= this.f17067i != j;
        this.f17067i = j;
    }

    /* renamed from: b */
    public final void mo15620b(String str) {
        this.f17059a.mo15252q().mo15239d();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f17056A |= !C4736ek.m23540c(this.f17062d, str);
        this.f17062d = str;
    }

    /* renamed from: b */
    public final void mo15621b(boolean z) {
        this.f17059a.mo15252q().mo15239d();
        this.f17056A = this.f17075q != z;
        this.f17075q = z;
    }

    /* renamed from: c */
    public final String mo15622c() {
        this.f17059a.mo15252q().mo15239d();
        return this.f17061c;
    }

    /* renamed from: c */
    public final void mo15623c(long j) {
        this.f17059a.mo15252q().mo15239d();
        this.f17056A |= this.f17069k != j;
        this.f17069k = j;
    }

    /* renamed from: c */
    public final void mo15624c(String str) {
        this.f17059a.mo15252q().mo15239d();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f17056A |= !C4736ek.m23540c(this.f17077s, str);
        this.f17077s = str;
    }

    /* renamed from: c */
    public final void mo15625c(boolean z) {
        this.f17059a.mo15252q().mo15239d();
        this.f17056A = this.f17076r != z;
        this.f17076r = z;
    }

    /* renamed from: d */
    public final String mo15626d() {
        this.f17059a.mo15252q().mo15239d();
        return this.f17062d;
    }

    /* renamed from: d */
    public final void mo15627d(long j) {
        this.f17059a.mo15252q().mo15239d();
        this.f17056A |= this.f17071m != j;
        this.f17071m = j;
    }

    /* renamed from: d */
    public final void mo15628d(String str) {
        this.f17059a.mo15252q().mo15239d();
        this.f17056A |= !C4736ek.m23540c(this.f17063e, str);
        this.f17063e = str;
    }

    /* renamed from: e */
    public final String mo15629e() {
        this.f17059a.mo15252q().mo15239d();
        return this.f17077s;
    }

    /* renamed from: e */
    public final void mo15630e(long j) {
        this.f17059a.mo15252q().mo15239d();
        this.f17056A |= this.f17072n != j;
        this.f17072n = j;
    }

    /* renamed from: e */
    public final void mo15631e(String str) {
        this.f17059a.mo15252q().mo15239d();
        this.f17056A |= !C4736ek.m23540c(this.f17064f, str);
        this.f17064f = str;
    }

    /* renamed from: f */
    public final String mo15632f() {
        this.f17059a.mo15252q().mo15239d();
        return this.f17063e;
    }

    /* renamed from: f */
    public final void mo15633f(long j) {
        boolean z = false;
        C3266s.m14923b(j >= 0);
        this.f17059a.mo15252q().mo15239d();
        boolean z2 = this.f17056A;
        if (this.f17065g != j) {
            z = true;
        }
        this.f17056A = z | z2;
        this.f17065g = j;
    }

    /* renamed from: f */
    public final void mo15634f(String str) {
        this.f17059a.mo15252q().mo15239d();
        this.f17056A |= !C4736ek.m23540c(this.f17068j, str);
        this.f17068j = str;
    }

    /* renamed from: g */
    public final String mo15635g() {
        this.f17059a.mo15252q().mo15239d();
        return this.f17064f;
    }

    /* renamed from: g */
    public final void mo15636g(long j) {
        this.f17059a.mo15252q().mo15239d();
        this.f17056A |= this.f17057B != j;
        this.f17057B = j;
    }

    /* renamed from: g */
    public final void mo15637g(String str) {
        this.f17059a.mo15252q().mo15239d();
        this.f17056A |= !C4736ek.m23540c(this.f17070l, str);
        this.f17070l = str;
    }

    /* renamed from: h */
    public final long mo15638h() {
        this.f17059a.mo15252q().mo15239d();
        return this.f17066h;
    }

    /* renamed from: h */
    public final void mo15639h(long j) {
        this.f17059a.mo15252q().mo15239d();
        this.f17056A |= this.f17058C != j;
        this.f17058C = j;
    }

    /* renamed from: h */
    public final void mo15640h(String str) {
        this.f17059a.mo15252q().mo15239d();
        this.f17056A |= !C4736ek.m23540c(this.f17084z, str);
        this.f17084z = str;
    }

    /* renamed from: i */
    public final long mo15641i() {
        this.f17059a.mo15252q().mo15239d();
        return this.f17067i;
    }

    /* renamed from: i */
    public final void mo15642i(long j) {
        this.f17059a.mo15252q().mo15239d();
        this.f17056A |= this.f17078t != j;
        this.f17078t = j;
    }

    /* renamed from: j */
    public final String mo15643j() {
        this.f17059a.mo15252q().mo15239d();
        return this.f17068j;
    }

    /* renamed from: j */
    public final void mo15644j(long j) {
        this.f17059a.mo15252q().mo15239d();
        this.f17056A |= this.f17079u != j;
        this.f17079u = j;
    }

    /* renamed from: k */
    public final long mo15645k() {
        this.f17059a.mo15252q().mo15239d();
        return this.f17069k;
    }

    /* renamed from: k */
    public final void mo15646k(long j) {
        this.f17059a.mo15252q().mo15239d();
        this.f17056A |= this.f17080v != j;
        this.f17080v = j;
    }

    /* renamed from: l */
    public final String mo15647l() {
        this.f17059a.mo15252q().mo15239d();
        return this.f17070l;
    }

    /* renamed from: l */
    public final void mo15648l(long j) {
        this.f17059a.mo15252q().mo15239d();
        this.f17056A |= this.f17081w != j;
        this.f17081w = j;
    }

    /* renamed from: m */
    public final long mo15649m() {
        this.f17059a.mo15252q().mo15239d();
        return this.f17071m;
    }

    /* renamed from: m */
    public final void mo15650m(long j) {
        this.f17059a.mo15252q().mo15239d();
        this.f17056A |= this.f17083y != j;
        this.f17083y = j;
    }

    /* renamed from: n */
    public final long mo15651n() {
        this.f17059a.mo15252q().mo15239d();
        return this.f17072n;
    }

    /* renamed from: n */
    public final void mo15652n(long j) {
        this.f17059a.mo15252q().mo15239d();
        this.f17056A |= this.f17082x != j;
        this.f17082x = j;
    }

    /* renamed from: o */
    public final void mo15653o(long j) {
        this.f17059a.mo15252q().mo15239d();
        this.f17056A |= this.f17074p != j;
        this.f17074p = j;
    }

    /* renamed from: o */
    public final boolean mo15654o() {
        this.f17059a.mo15252q().mo15239d();
        return this.f17073o;
    }

    /* renamed from: p */
    public final long mo15655p() {
        this.f17059a.mo15252q().mo15239d();
        return this.f17065g;
    }

    /* renamed from: q */
    public final long mo15656q() {
        this.f17059a.mo15252q().mo15239d();
        return this.f17057B;
    }

    /* renamed from: r */
    public final long mo15657r() {
        this.f17059a.mo15252q().mo15239d();
        return this.f17058C;
    }

    /* renamed from: s */
    public final void mo15658s() {
        this.f17059a.mo15252q().mo15239d();
        long j = this.f17065g + 1;
        if (j > 2147483647L) {
            this.f17059a.mo15253r().mo15849i().mo15859a("Bundle index overflow. appId", C4767r.m23924a(this.f17060b));
            j = 0;
        }
        this.f17056A = true;
        this.f17065g = j;
    }

    /* renamed from: t */
    public final long mo15659t() {
        this.f17059a.mo15252q().mo15239d();
        return this.f17078t;
    }

    /* renamed from: u */
    public final long mo15660u() {
        this.f17059a.mo15252q().mo15239d();
        return this.f17079u;
    }

    /* renamed from: v */
    public final long mo15661v() {
        this.f17059a.mo15252q().mo15239d();
        return this.f17080v;
    }

    /* renamed from: w */
    public final long mo15662w() {
        this.f17059a.mo15252q().mo15239d();
        return this.f17081w;
    }

    /* renamed from: x */
    public final long mo15663x() {
        this.f17059a.mo15252q().mo15239d();
        return this.f17083y;
    }

    /* renamed from: y */
    public final long mo15664y() {
        this.f17059a.mo15252q().mo15239d();
        return this.f17082x;
    }

    /* renamed from: z */
    public final String mo15665z() {
        this.f17059a.mo15252q().mo15239d();
        return this.f17084z;
    }
}
