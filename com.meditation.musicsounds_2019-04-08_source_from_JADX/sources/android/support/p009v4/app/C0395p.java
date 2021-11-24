package android.support.p009v4.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p009v4.app.Fragment.SavedState;
import android.support.p009v4.view.C0623p;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.p */
public abstract class C0395p extends C0623p {

    /* renamed from: a */
    private final C0374l f1168a;

    /* renamed from: b */
    private C0396q f1169b = null;

    /* renamed from: c */
    private ArrayList<SavedState> f1170c = new ArrayList<>();

    /* renamed from: d */
    private ArrayList<Fragment> f1171d = new ArrayList<>();

    /* renamed from: e */
    private Fragment f1172e = null;

    public C0395p(C0374l lVar) {
        this.f1168a = lVar;
    }

    /* renamed from: a */
    public Parcelable mo1654a() {
        Bundle bundle;
        if (this.f1170c.size() > 0) {
            bundle = new Bundle();
            SavedState[] savedStateArr = new SavedState[this.f1170c.size()];
            this.f1170c.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.f1171d.size(); i++) {
            Fragment fragment = (Fragment) this.f1171d.get(i);
            if (fragment != null && fragment.mo1326y()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("f");
                sb.append(i);
                this.f1168a.mo1538a(bundle, sb.toString(), fragment);
            }
        }
        return bundle;
    }

    /* renamed from: a */
    public abstract Fragment mo1664a(int i);

    /* renamed from: a */
    public Object mo1656a(ViewGroup viewGroup, int i) {
        if (this.f1171d.size() > i) {
            Fragment fragment = (Fragment) this.f1171d.get(i);
            if (fragment != null) {
                return fragment;
            }
        }
        if (this.f1169b == null) {
            this.f1169b = this.f1168a.mo1536a();
        }
        Fragment a = mo1664a(i);
        if (this.f1170c.size() > i) {
            SavedState savedState = (SavedState) this.f1170c.get(i);
            if (savedState != null) {
                a.mo1235a(savedState);
            }
        }
        while (this.f1171d.size() <= i) {
            this.f1171d.add(null);
        }
        a.mo1287f(false);
        a.mo1290g(false);
        this.f1171d.set(i, a);
        this.f1169b.mo1410a(viewGroup.getId(), a);
        return a;
    }

    /* renamed from: a */
    public void mo1657a(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f1170c.clear();
            this.f1171d.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f1170c.add((SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment a = this.f1168a.mo1534a(bundle, str);
                    if (a != null) {
                        while (this.f1171d.size() <= parseInt) {
                            this.f1171d.add(null);
                        }
                        a.mo1287f(false);
                        this.f1171d.set(parseInt, a);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Bad fragment at key ");
                        sb.append(str);
                        Log.w("FragmentStatePagerAdapt", sb.toString());
                    }
                }
            }
        }
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
        Fragment fragment = (Fragment) obj;
        if (this.f1169b == null) {
            this.f1169b = this.f1168a.mo1536a();
        }
        while (this.f1170c.size() <= i) {
            this.f1170c.add(null);
        }
        this.f1170c.set(i, fragment.mo1326y() ? this.f1168a.mo1532a(fragment) : null);
        this.f1171d.set(i, null);
        this.f1169b.mo1412a(fragment);
    }

    /* renamed from: a */
    public boolean mo1660a(View view, Object obj) {
        return ((Fragment) obj).mo1199I() == view;
    }

    /* renamed from: b */
    public void mo1662b(ViewGroup viewGroup) {
        if (this.f1169b != null) {
            this.f1169b.mo1434e();
            this.f1169b = null;
        }
    }

    /* renamed from: b */
    public void mo1663b(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f1172e) {
            if (this.f1172e != null) {
                this.f1172e.mo1287f(false);
                this.f1172e.mo1290g(false);
            }
            if (fragment != null) {
                fragment.mo1287f(true);
                fragment.mo1290g(true);
            }
            this.f1172e = fragment;
        }
    }
}
