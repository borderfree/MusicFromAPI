package android.support.p023v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.bq */
class C1088bq {

    /* renamed from: a */
    final C1090b f3796a;

    /* renamed from: b */
    C1089a f3797b = new C1089a();

    /* renamed from: android.support.v7.widget.bq$a */
    static class C1089a {

        /* renamed from: a */
        int f3798a = 0;

        /* renamed from: b */
        int f3799b;

        /* renamed from: c */
        int f3800c;

        /* renamed from: d */
        int f3801d;

        /* renamed from: e */
        int f3802e;

        C1089a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo5389a(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5390a() {
            this.f3798a = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5391a(int i) {
            this.f3798a = i | this.f3798a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5392a(int i, int i2, int i3, int i4) {
            this.f3799b = i;
            this.f3800c = i2;
            this.f3801d = i3;
            this.f3802e = i4;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo5393b() {
            if ((this.f3798a & 7) != 0 && (this.f3798a & (mo5389a(this.f3801d, this.f3799b) << 0)) == 0) {
                return false;
            }
            if ((this.f3798a & 112) != 0 && (this.f3798a & (mo5389a(this.f3801d, this.f3800c) << 4)) == 0) {
                return false;
            }
            if ((this.f3798a & 1792) == 0 || (this.f3798a & (mo5389a(this.f3802e, this.f3799b) << 8)) != 0) {
                return (this.f3798a & 28672) == 0 || (this.f3798a & (mo5389a(this.f3802e, this.f3800c) << 12)) != 0;
            }
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.bq$b */
    interface C1090b {
        /* renamed from: a */
        int mo4469a();

        /* renamed from: a */
        int mo4470a(View view);

        /* renamed from: a */
        View mo4471a(int i);

        /* renamed from: b */
        int mo4472b();

        /* renamed from: b */
        int mo4473b(View view);
    }

    C1088bq(C1090b bVar) {
        this.f3796a = bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo5387a(int i, int i2, int i3, int i4) {
        int a = this.f3796a.mo4469a();
        int b = this.f3796a.mo4472b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a2 = this.f3796a.mo4471a(i);
            this.f3797b.mo5392a(a, b, this.f3796a.mo4470a(a2), this.f3796a.mo4473b(a2));
            if (i3 != 0) {
                this.f3797b.mo5390a();
                this.f3797b.mo5391a(i3);
                if (this.f3797b.mo5393b()) {
                    return a2;
                }
            }
            if (i4 != 0) {
                this.f3797b.mo5390a();
                this.f3797b.mo5391a(i4);
                if (this.f3797b.mo5393b()) {
                    view = a2;
                }
            }
            i += i5;
        }
        return view;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5388a(View view, int i) {
        this.f3797b.mo5392a(this.f3796a.mo4469a(), this.f3796a.mo4472b(), this.f3796a.mo4470a(view), this.f3796a.mo4473b(view));
        if (i == 0) {
            return false;
        }
        this.f3797b.mo5390a();
        this.f3797b.mo5391a(i);
        return this.f3797b.mo5393b();
    }
}
