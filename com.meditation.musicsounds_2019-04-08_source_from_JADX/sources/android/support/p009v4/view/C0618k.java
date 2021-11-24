package android.support.p009v4.view;

import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.v4.view.k */
public class C0618k {

    /* renamed from: a */
    private ViewParent f1778a;

    /* renamed from: b */
    private ViewParent f1779b;

    /* renamed from: c */
    private final View f1780c;

    /* renamed from: d */
    private boolean f1781d;

    /* renamed from: e */
    private int[] f1782e;

    public C0618k(View view) {
        this.f1780c = view;
    }

    /* renamed from: a */
    private void m2784a(int i, ViewParent viewParent) {
        switch (i) {
            case 0:
                this.f1778a = viewParent;
                return;
            case 1:
                this.f1779b = viewParent;
                return;
            default:
                return;
        }
    }

    /* renamed from: d */
    private ViewParent m2785d(int i) {
        switch (i) {
            case 0:
                return this.f1778a;
            case 1:
                return this.f1779b;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public void mo2456a(boolean z) {
        if (this.f1781d) {
            C0626s.m2879v(this.f1780c);
        }
        this.f1781d = z;
    }

    /* renamed from: a */
    public boolean mo2457a() {
        return this.f1781d;
    }

    /* renamed from: a */
    public boolean mo2458a(float f, float f2) {
        if (mo2457a()) {
            ViewParent d = m2785d(0);
            if (d != null) {
                return C0643v.m2996a(d, this.f1780c, f, f2);
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo2459a(float f, float f2, boolean z) {
        if (mo2457a()) {
            ViewParent d = m2785d(0);
            if (d != null) {
                return C0643v.m2997a(d, this.f1780c, f, f2, z);
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo2460a(int i) {
        return m2785d(i) != null;
    }

    /* renamed from: a */
    public boolean mo2461a(int i, int i2) {
        if (mo2460a(i2)) {
            return true;
        }
        if (mo2457a()) {
            View view = this.f1780c;
            for (ViewParent parent = this.f1780c.getParent(); parent != null; parent = parent.getParent()) {
                if (C0643v.m2998a(parent, view, this.f1780c, i, i2)) {
                    m2784a(i2, parent);
                    C0643v.m2999b(parent, view, this.f1780c, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo2462a(int i, int i2, int i3, int i4, int[] iArr) {
        return mo2463a(i, i2, i3, i4, iArr, 0);
    }

    /* renamed from: a */
    public boolean mo2463a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        int i6;
        int i7;
        int[] iArr2 = iArr;
        if (mo2457a()) {
            ViewParent d = m2785d(i5);
            if (d == null) {
                return false;
            }
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr2 != null) {
                    this.f1780c.getLocationInWindow(iArr2);
                    i7 = iArr2[0];
                    i6 = iArr2[1];
                } else {
                    i7 = 0;
                    i6 = 0;
                }
                C0643v.m2994a(d, this.f1780c, i, i2, i3, i4, i5);
                if (iArr2 != null) {
                    this.f1780c.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i7;
                    iArr2[1] = iArr2[1] - i6;
                }
                return true;
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo2464a(int i, int i2, int[] iArr, int[] iArr2) {
        return mo2465a(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: a */
    public boolean mo2465a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        int i4;
        int i5;
        if (mo2457a()) {
            ViewParent d = m2785d(i3);
            if (d == null) {
                return false;
            }
            boolean z = true;
            if (i != 0 || i2 != 0) {
                if (iArr2 != null) {
                    this.f1780c.getLocationInWindow(iArr2);
                    i5 = iArr2[0];
                    i4 = iArr2[1];
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                if (iArr == null) {
                    if (this.f1782e == null) {
                        this.f1782e = new int[2];
                    }
                    iArr = this.f1782e;
                }
                iArr[0] = 0;
                iArr[1] = 0;
                C0643v.m2995a(d, this.f1780c, i, i2, iArr, i3);
                if (iArr2 != null) {
                    this.f1780c.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i5;
                    iArr2[1] = iArr2[1] - i4;
                }
                if (iArr[0] == 0 && iArr[1] == 0) {
                    z = false;
                }
                return z;
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo2466b() {
        return mo2460a(0);
    }

    /* renamed from: b */
    public boolean mo2467b(int i) {
        return mo2461a(i, 0);
    }

    /* renamed from: c */
    public void mo2468c() {
        mo2469c(0);
    }

    /* renamed from: c */
    public void mo2469c(int i) {
        ViewParent d = m2785d(i);
        if (d != null) {
            C0643v.m2993a(d, this.f1780c, i);
            m2784a(i, (ViewParent) null);
        }
    }
}
