package android.support.p023v7.widget;

/* renamed from: android.support.v7.widget.az */
class C1058az {

    /* renamed from: a */
    private int f3670a = 0;

    /* renamed from: b */
    private int f3671b = 0;

    /* renamed from: c */
    private int f3672c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f3673d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f3674e = 0;

    /* renamed from: f */
    private int f3675f = 0;

    /* renamed from: g */
    private boolean f3676g = false;

    /* renamed from: h */
    private boolean f3677h = false;

    C1058az() {
    }

    /* renamed from: a */
    public int mo5282a() {
        return this.f3670a;
    }

    /* renamed from: a */
    public void mo5283a(int i, int i2) {
        this.f3672c = i;
        this.f3673d = i2;
        this.f3677h = true;
        if (this.f3676g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f3670a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f3671b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f3670a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f3671b = i2;
        }
    }

    /* renamed from: a */
    public void mo5284a(boolean z) {
        int i;
        if (z != this.f3676g) {
            this.f3676g = z;
            if (!this.f3677h) {
                this.f3670a = this.f3674e;
            } else if (z) {
                this.f3670a = this.f3673d != Integer.MIN_VALUE ? this.f3673d : this.f3674e;
                if (this.f3672c != Integer.MIN_VALUE) {
                    i = this.f3672c;
                    this.f3671b = i;
                }
            } else {
                this.f3670a = this.f3672c != Integer.MIN_VALUE ? this.f3672c : this.f3674e;
                if (this.f3673d != Integer.MIN_VALUE) {
                    i = this.f3673d;
                    this.f3671b = i;
                }
            }
            i = this.f3675f;
            this.f3671b = i;
        }
    }

    /* renamed from: b */
    public int mo5285b() {
        return this.f3671b;
    }

    /* renamed from: b */
    public void mo5286b(int i, int i2) {
        this.f3677h = false;
        if (i != Integer.MIN_VALUE) {
            this.f3674e = i;
            this.f3670a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f3675f = i2;
            this.f3671b = i2;
        }
    }

    /* renamed from: c */
    public int mo5287c() {
        return this.f3676g ? this.f3671b : this.f3670a;
    }

    /* renamed from: d */
    public int mo5288d() {
        return this.f3676g ? this.f3670a : this.f3671b;
    }
}
