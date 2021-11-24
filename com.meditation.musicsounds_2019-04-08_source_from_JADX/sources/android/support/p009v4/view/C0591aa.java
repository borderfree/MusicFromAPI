package android.support.p009v4.view;

import android.os.Build.VERSION;
import android.view.WindowInsets;

/* renamed from: android.support.v4.view.aa */
public class C0591aa {

    /* renamed from: a */
    private final Object f1737a;

    private C0591aa(Object obj) {
        this.f1737a = obj;
    }

    /* renamed from: a */
    static C0591aa m2705a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0591aa(obj);
    }

    /* renamed from: a */
    static Object m2706a(C0591aa aaVar) {
        if (aaVar == null) {
            return null;
        }
        return aaVar.f1737a;
    }

    /* renamed from: a */
    public int mo2413a() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1737a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    /* renamed from: a */
    public C0591aa mo2414a(int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 20) {
            return new C0591aa(((WindowInsets) this.f1737a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    /* renamed from: b */
    public int mo2415b() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1737a).getSystemWindowInsetTop();
        }
        return 0;
    }

    /* renamed from: c */
    public int mo2416c() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1737a).getSystemWindowInsetRight();
        }
        return 0;
    }

    /* renamed from: d */
    public int mo2417d() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1737a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    /* renamed from: e */
    public boolean mo2418e() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1737a).hasSystemWindowInsets();
        }
        return false;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0591aa aaVar = (C0591aa) obj;
        if (this.f1737a != null) {
            z = this.f1737a.equals(aaVar.f1737a);
        } else if (aaVar.f1737a != null) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public boolean mo2420f() {
        if (VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f1737a).isConsumed();
        }
        return false;
    }

    /* renamed from: g */
    public C0591aa mo2421g() {
        if (VERSION.SDK_INT >= 20) {
            return new C0591aa(((WindowInsets) this.f1737a).consumeSystemWindowInsets());
        }
        return null;
    }

    public int hashCode() {
        if (this.f1737a == null) {
            return 0;
        }
        return this.f1737a.hashCode();
    }
}
