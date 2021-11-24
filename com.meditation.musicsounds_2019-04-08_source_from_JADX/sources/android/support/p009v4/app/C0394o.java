package android.support.p009v4.app;

import android.os.Parcelable;
import android.support.p009v4.view.C0623p;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.app.o */
public abstract class C0394o extends C0623p {

    /* renamed from: a */
    private final C0374l f1165a;

    /* renamed from: b */
    private C0396q f1166b = null;

    /* renamed from: c */
    private Fragment f1167c = null;

    public C0394o(C0374l lVar) {
        this.f1165a = lVar;
    }

    /* renamed from: a */
    private static String m1790a(int i, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("android:switcher:");
        sb.append(i);
        sb.append(":");
        sb.append(j);
        return sb.toString();
    }

    /* renamed from: a */
    public Parcelable mo1654a() {
        return null;
    }

    /* renamed from: a */
    public abstract Fragment mo1655a(int i);

    /* renamed from: a */
    public Object mo1656a(ViewGroup viewGroup, int i) {
        if (this.f1166b == null) {
            this.f1166b = this.f1165a.mo1536a();
        }
        long b = mo1661b(i);
        Fragment a = this.f1165a.mo1535a(m1790a(viewGroup.getId(), b));
        if (a != null) {
            this.f1166b.mo1433e(a);
        } else {
            a = mo1655a(i);
            this.f1166b.mo1411a(viewGroup.getId(), a, m1790a(viewGroup.getId(), b));
        }
        if (a != this.f1167c) {
            a.mo1287f(false);
            a.mo1290g(false);
        }
        return a;
    }

    /* renamed from: a */
    public void mo1657a(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* renamed from: a */
    public void mo1658a(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewPager with adapter ");
            sb.append(this);
            sb.append(" requires a view id");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo1659a(ViewGroup viewGroup, int i, Object obj) {
        if (this.f1166b == null) {
            this.f1166b = this.f1165a.mo1536a();
        }
        this.f1166b.mo1432d((Fragment) obj);
    }

    /* renamed from: a */
    public boolean mo1660a(View view, Object obj) {
        return ((Fragment) obj).mo1199I() == view;
    }

    /* renamed from: b */
    public long mo1661b(int i) {
        return (long) i;
    }

    /* renamed from: b */
    public void mo1662b(ViewGroup viewGroup) {
        if (this.f1166b != null) {
            this.f1166b.mo1434e();
            this.f1166b = null;
        }
    }

    /* renamed from: b */
    public void mo1663b(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f1167c) {
            if (this.f1167c != null) {
                this.f1167c.mo1287f(false);
                this.f1167c.mo1290g(false);
            }
            if (fragment != null) {
                fragment.mo1287f(true);
                fragment.mo1290g(true);
            }
            this.f1167c = fragment;
        }
    }
}
