package com.bumptech.glide.request;

/* renamed from: com.bumptech.glide.request.a */
public final class C1571a implements C1589c, C1590d {

    /* renamed from: a */
    private final C1590d f5107a;

    /* renamed from: b */
    private C1589c f5108b;

    /* renamed from: c */
    private C1589c f5109c;

    public C1571a(C1590d dVar) {
        this.f5107a = dVar;
    }

    /* renamed from: g */
    private boolean m7787g(C1589c cVar) {
        return cVar.equals(this.f5108b) || (this.f5108b.mo6425h() && cVar.equals(this.f5109c));
    }

    /* renamed from: k */
    private boolean m7788k() {
        return this.f5107a == null || this.f5107a.mo6430b(this);
    }

    /* renamed from: l */
    private boolean m7789l() {
        return this.f5107a == null || this.f5107a.mo6432d(this);
    }

    /* renamed from: m */
    private boolean m7790m() {
        return this.f5107a == null || this.f5107a.mo6431c(this);
    }

    /* renamed from: n */
    private boolean m7791n() {
        return this.f5107a != null && this.f5107a.mo6435j();
    }

    /* renamed from: a */
    public void mo6414a() {
        if (!this.f5108b.mo6421d()) {
            this.f5108b.mo6414a();
        }
    }

    /* renamed from: a */
    public void mo6429a(C1589c cVar, C1589c cVar2) {
        this.f5108b = cVar;
        this.f5109c = cVar2;
    }

    /* renamed from: a */
    public boolean mo6418a(C1589c cVar) {
        if (!(cVar instanceof C1571a)) {
            return false;
        }
        C1571a aVar = (C1571a) cVar;
        return this.f5108b.mo6418a(aVar.f5108b) && this.f5109c.mo6418a(aVar.f5109c);
    }

    /* renamed from: b */
    public void mo6419b() {
        if (!this.f5108b.mo6425h()) {
            this.f5108b.mo6419b();
        }
        if (this.f5109c.mo6421d()) {
            this.f5109c.mo6419b();
        }
    }

    /* renamed from: b */
    public boolean mo6430b(C1589c cVar) {
        return m7788k() && m7787g(cVar);
    }

    /* renamed from: c */
    public void mo6420c() {
        this.f5108b.mo6420c();
        if (this.f5109c.mo6421d()) {
            this.f5109c.mo6420c();
        }
    }

    /* renamed from: c */
    public boolean mo6431c(C1589c cVar) {
        return m7790m() && m7787g(cVar);
    }

    /* renamed from: d */
    public boolean mo6421d() {
        return (this.f5108b.mo6425h() ? this.f5109c : this.f5108b).mo6421d();
    }

    /* renamed from: d */
    public boolean mo6432d(C1589c cVar) {
        return m7789l() && m7787g(cVar);
    }

    /* renamed from: e */
    public void mo6433e(C1589c cVar) {
        if (this.f5107a != null) {
            this.f5107a.mo6433e(this);
        }
    }

    /* renamed from: e */
    public boolean mo6422e() {
        return (this.f5108b.mo6425h() ? this.f5109c : this.f5108b).mo6422e();
    }

    /* renamed from: f */
    public void mo6434f(C1589c cVar) {
        if (!cVar.equals(this.f5109c)) {
            if (!this.f5109c.mo6421d()) {
                this.f5109c.mo6414a();
            }
            return;
        }
        if (this.f5107a != null) {
            this.f5107a.mo6434f(this);
        }
    }

    /* renamed from: f */
    public boolean mo6423f() {
        return (this.f5108b.mo6425h() ? this.f5109c : this.f5108b).mo6423f();
    }

    /* renamed from: g */
    public boolean mo6424g() {
        return (this.f5108b.mo6425h() ? this.f5109c : this.f5108b).mo6424g();
    }

    /* renamed from: h */
    public boolean mo6425h() {
        return this.f5108b.mo6425h() && this.f5109c.mo6425h();
    }

    /* renamed from: i */
    public void mo6426i() {
        this.f5108b.mo6426i();
        this.f5109c.mo6426i();
    }

    /* renamed from: j */
    public boolean mo6435j() {
        return m7791n() || mo6423f();
    }
}
