package com.bumptech.glide.request;

/* renamed from: com.bumptech.glide.request.i */
public class C1596i implements C1589c, C1590d {

    /* renamed from: a */
    private final C1590d f5167a;

    /* renamed from: b */
    private C1589c f5168b;

    /* renamed from: c */
    private C1589c f5169c;

    /* renamed from: d */
    private boolean f5170d;

    C1596i() {
        this(null);
    }

    public C1596i(C1590d dVar) {
        this.f5167a = dVar;
    }

    /* renamed from: k */
    private boolean m7964k() {
        return this.f5167a == null || this.f5167a.mo6430b(this);
    }

    /* renamed from: l */
    private boolean m7965l() {
        return this.f5167a == null || this.f5167a.mo6432d(this);
    }

    /* renamed from: m */
    private boolean m7966m() {
        return this.f5167a == null || this.f5167a.mo6431c(this);
    }

    /* renamed from: n */
    private boolean m7967n() {
        return this.f5167a != null && this.f5167a.mo6435j();
    }

    /* renamed from: a */
    public void mo6414a() {
        this.f5170d = true;
        if (!this.f5168b.mo6422e() && !this.f5169c.mo6421d()) {
            this.f5169c.mo6414a();
        }
        if (this.f5170d && !this.f5168b.mo6421d()) {
            this.f5168b.mo6414a();
        }
    }

    /* renamed from: a */
    public void mo6517a(C1589c cVar, C1589c cVar2) {
        this.f5168b = cVar;
        this.f5169c = cVar2;
    }

    /* renamed from: a */
    public boolean mo6418a(C1589c cVar) {
        if (!(cVar instanceof C1596i)) {
            return false;
        }
        C1596i iVar = (C1596i) cVar;
        if (this.f5168b == null) {
            if (iVar.f5168b != null) {
                return false;
            }
        } else if (!this.f5168b.mo6418a(iVar.f5168b)) {
            return false;
        }
        if (this.f5169c == null) {
            if (iVar.f5169c != null) {
                return false;
            }
        } else if (!this.f5169c.mo6418a(iVar.f5169c)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo6419b() {
        this.f5170d = false;
        this.f5168b.mo6419b();
        this.f5169c.mo6419b();
    }

    /* renamed from: b */
    public boolean mo6430b(C1589c cVar) {
        return m7964k() && (cVar.equals(this.f5168b) || !this.f5168b.mo6423f());
    }

    /* renamed from: c */
    public void mo6420c() {
        this.f5170d = false;
        this.f5169c.mo6420c();
        this.f5168b.mo6420c();
    }

    /* renamed from: c */
    public boolean mo6431c(C1589c cVar) {
        return m7966m() && cVar.equals(this.f5168b) && !mo6435j();
    }

    /* renamed from: d */
    public boolean mo6421d() {
        return this.f5168b.mo6421d();
    }

    /* renamed from: d */
    public boolean mo6432d(C1589c cVar) {
        return m7965l() && cVar.equals(this.f5168b);
    }

    /* renamed from: e */
    public void mo6433e(C1589c cVar) {
        if (!cVar.equals(this.f5169c)) {
            if (this.f5167a != null) {
                this.f5167a.mo6433e(this);
            }
            if (!this.f5169c.mo6422e()) {
                this.f5169c.mo6420c();
            }
        }
    }

    /* renamed from: e */
    public boolean mo6422e() {
        return this.f5168b.mo6422e() || this.f5169c.mo6422e();
    }

    /* renamed from: f */
    public void mo6434f(C1589c cVar) {
        if (cVar.equals(this.f5168b) && this.f5167a != null) {
            this.f5167a.mo6434f(this);
        }
    }

    /* renamed from: f */
    public boolean mo6423f() {
        return this.f5168b.mo6423f() || this.f5169c.mo6423f();
    }

    /* renamed from: g */
    public boolean mo6424g() {
        return this.f5168b.mo6424g();
    }

    /* renamed from: h */
    public boolean mo6425h() {
        return this.f5168b.mo6425h();
    }

    /* renamed from: i */
    public void mo6426i() {
        this.f5168b.mo6426i();
        this.f5169c.mo6426i();
    }

    /* renamed from: j */
    public boolean mo6435j() {
        return m7967n() || mo6423f();
    }
}
