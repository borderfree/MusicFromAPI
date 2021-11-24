package android.support.p009v4.app;

import android.animation.Animator;
import android.app.Activity;
import android.arch.lifecycle.C0023d;
import android.arch.lifecycle.C0024e;
import android.arch.lifecycle.C0038o;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p009v4.p019g.C0493d;
import android.support.p009v4.p019g.C0510m;
import android.support.p009v4.view.C0605e;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

/* renamed from: android.support.v4.app.Fragment */
public class Fragment implements C0023d, ComponentCallbacks, OnCreateContextMenuListener {

    /* renamed from: a */
    private static final C0510m<String, Class<?>> f905a = new C0510m<>();

    /* renamed from: j */
    static final Object f906j = new Object();

    /* renamed from: A */
    int f907A;

    /* renamed from: B */
    C0377m f908B;

    /* renamed from: C */
    C0373k f909C;

    /* renamed from: D */
    C0377m f910D;

    /* renamed from: E */
    C0393n f911E;

    /* renamed from: F */
    C0038o f912F;

    /* renamed from: G */
    Fragment f913G;

    /* renamed from: H */
    int f914H;

    /* renamed from: I */
    int f915I;

    /* renamed from: J */
    String f916J;

    /* renamed from: K */
    boolean f917K;

    /* renamed from: L */
    boolean f918L;

    /* renamed from: M */
    boolean f919M;

    /* renamed from: N */
    boolean f920N;

    /* renamed from: O */
    boolean f921O;

    /* renamed from: P */
    boolean f922P = true;

    /* renamed from: Q */
    boolean f923Q;

    /* renamed from: R */
    ViewGroup f924R;

    /* renamed from: S */
    View f925S;

    /* renamed from: T */
    View f926T;

    /* renamed from: U */
    boolean f927U;

    /* renamed from: V */
    boolean f928V = true;

    /* renamed from: W */
    LoaderManagerImpl f929W;

    /* renamed from: X */
    C0338a f930X;

    /* renamed from: Y */
    boolean f931Y;

    /* renamed from: Z */
    boolean f932Z;

    /* renamed from: aa */
    float f933aa;

    /* renamed from: ab */
    LayoutInflater f934ab;

    /* renamed from: ac */
    boolean f935ac;

    /* renamed from: ad */
    C0024e f936ad = new C0024e(this);

    /* renamed from: k */
    int f937k = 0;

    /* renamed from: l */
    Bundle f938l;

    /* renamed from: m */
    SparseArray<Parcelable> f939m;

    /* renamed from: n */
    Boolean f940n;

    /* renamed from: o */
    int f941o = -1;

    /* renamed from: p */
    String f942p;

    /* renamed from: q */
    Bundle f943q;

    /* renamed from: r */
    Fragment f944r;

    /* renamed from: s */
    int f945s = -1;

    /* renamed from: t */
    int f946t;

    /* renamed from: u */
    boolean f947u;

    /* renamed from: v */
    boolean f948v;

    /* renamed from: w */
    boolean f949w;

    /* renamed from: x */
    boolean f950x;

    /* renamed from: y */
    boolean f951y;

    /* renamed from: z */
    boolean f952z;

    /* renamed from: android.support.v4.app.Fragment$InstantiationException */
    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: android.support.v4.app.Fragment$SavedState */
    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        /* renamed from: a */
        final Bundle f955a;

        SavedState(Bundle bundle) {
            this.f955a = bundle;
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            this.f955a = parcel.readBundle();
            if (classLoader != null && this.f955a != null) {
                this.f955a.setClassLoader(classLoader);
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f955a);
        }
    }

    /* renamed from: android.support.v4.app.Fragment$a */
    static class C0338a {

        /* renamed from: a */
        View f956a;

        /* renamed from: b */
        Animator f957b;

        /* renamed from: c */
        int f958c;

        /* renamed from: d */
        int f959d;

        /* renamed from: e */
        int f960e;

        /* renamed from: f */
        int f961f;

        /* renamed from: g */
        C0353ad f962g = null;

        /* renamed from: h */
        C0353ad f963h = null;

        /* renamed from: i */
        boolean f964i;

        /* renamed from: j */
        C0339b f965j;

        /* renamed from: k */
        boolean f966k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public Object f967l = null;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public Object f968m = Fragment.f906j;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public Object f969n = null;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public Object f970o = Fragment.f906j;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public Object f971p = null;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public Object f972q = Fragment.f906j;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public Boolean f973r;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public Boolean f974s;

        C0338a() {
        }
    }

    /* renamed from: android.support.v4.app.Fragment$b */
    interface C0339b {
        /* renamed from: a */
        void mo1338a();

        /* renamed from: b */
        void mo1339b();
    }

    /* renamed from: a */
    public static Fragment m1270a(Context context, String str) {
        return m1271a(context, str, (Bundle) null);
    }

    /* renamed from: a */
    public static Fragment m1271a(Context context, String str, Bundle bundle) {
        try {
            Class cls = (Class) f905a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f905a.put(str, cls);
            }
            Fragment fragment = (Fragment) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.mo1289g(bundle);
            }
            return fragment;
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to instantiate fragment ");
            sb.append(str);
            sb.append(": make sure class name exists, is public, and has an");
            sb.append(" empty constructor that is public");
            throw new InstantiationException(sb.toString(), e);
        } catch (InstantiationException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to instantiate fragment ");
            sb2.append(str);
            sb2.append(": make sure class name exists, is public, and has an");
            sb2.append(" empty constructor that is public");
            throw new InstantiationException(sb2.toString(), e2);
        } catch (IllegalAccessException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unable to instantiate fragment ");
            sb3.append(str);
            sb3.append(": make sure class name exists, is public, and has an");
            sb3.append(" empty constructor that is public");
            throw new InstantiationException(sb3.toString(), e3);
        } catch (NoSuchMethodException e4) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Unable to instantiate fragment ");
            sb4.append(str);
            sb4.append(": could not find Fragment constructor");
            throw new InstantiationException(sb4.toString(), e4);
        } catch (InvocationTargetException e5) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Unable to instantiate fragment ");
            sb5.append(str);
            sb5.append(": calling Fragment constructor caused an exception");
            throw new InstantiationException(sb5.toString(), e5);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo1450b() {
        C0339b bVar;
        if (this.f930X == null) {
            bVar = null;
        } else {
            this.f930X.f964i = false;
            bVar = this.f930X.f965j;
            this.f930X.f965j = null;
        }
        if (bVar != null) {
            bVar.mo1338a();
        }
    }

    /* renamed from: b */
    static boolean m1274b(Context context, String str) {
        try {
            Class cls = (Class) f905a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f905a.put(str, cls);
            }
            return Fragment.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private C0338a mo1453c() {
        if (this.f930X == null) {
            this.f930X = new C0338a();
        }
        return this.f930X;
    }

    /* renamed from: A */
    public final boolean mo1191A() {
        return this.f948v;
    }

    /* renamed from: B */
    public final boolean mo1192B() {
        return this.f937k >= 5;
    }

    /* renamed from: B_ */
    public Lifecycle mo65B_() {
        return this.f936ad;
    }

    /* renamed from: C */
    public final boolean mo1193C() {
        return mo1326y() && !mo1194D() && this.f925S != null && this.f925S.getWindowToken() != null && this.f925S.getVisibility() == 0;
    }

    /* renamed from: D */
    public final boolean mo1194D() {
        return this.f917K;
    }

    /* renamed from: E */
    public final boolean mo1195E() {
        return this.f922P;
    }

    /* renamed from: F */
    public final boolean mo1196F() {
        return this.f919M;
    }

    /* renamed from: G */
    public boolean mo1197G() {
        return this.f928V;
    }

    /* renamed from: H */
    public C0415v mo1198H() {
        if (this.f929W != null) {
            return this.f929W;
        }
        this.f929W = new LoaderManagerImpl(this, mo1298j());
        return this.f929W;
    }

    /* renamed from: I */
    public View mo1199I() {
        return this.f925S;
    }

    /* renamed from: J */
    public void mo1200J() {
        this.f923Q = true;
    }

    /* renamed from: K */
    public void mo1201K() {
        this.f923Q = true;
    }

    /* renamed from: L */
    public void mo1202L() {
        this.f923Q = true;
        if (this.f912F != null && !this.f909C.f1093d.f1123s) {
            this.f912F.mo86a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: M */
    public void mo1203M() {
        this.f941o = -1;
        this.f942p = null;
        this.f947u = false;
        this.f948v = false;
        this.f949w = false;
        this.f950x = false;
        this.f951y = false;
        this.f907A = 0;
        this.f908B = null;
        this.f910D = null;
        this.f909C = null;
        this.f914H = 0;
        this.f915I = 0;
        this.f916J = null;
        this.f917K = false;
        this.f918L = false;
        this.f920N = false;
    }

    /* renamed from: N */
    public void mo1204N() {
    }

    /* renamed from: O */
    public Object mo1205O() {
        if (this.f930X == null) {
            return null;
        }
        return this.f930X.f967l;
    }

    /* renamed from: P */
    public Object mo1206P() {
        if (this.f930X == null) {
            return null;
        }
        return this.f930X.f968m == f906j ? mo1205O() : this.f930X.f968m;
    }

    /* renamed from: Q */
    public Object mo1207Q() {
        if (this.f930X == null) {
            return null;
        }
        return this.f930X.f969n;
    }

    /* renamed from: R */
    public Object mo1208R() {
        if (this.f930X == null) {
            return null;
        }
        return this.f930X.f970o == f906j ? mo1207Q() : this.f930X.f970o;
    }

    /* renamed from: S */
    public Object mo1209S() {
        if (this.f930X == null) {
            return null;
        }
        return this.f930X.f971p;
    }

    /* renamed from: T */
    public Object mo1210T() {
        if (this.f930X == null) {
            return null;
        }
        return this.f930X.f972q == f906j ? mo1209S() : this.f930X.f972q;
    }

    /* renamed from: U */
    public boolean mo1211U() {
        if (this.f930X == null || this.f930X.f974s == null) {
            return true;
        }
        return this.f930X.f974s.booleanValue();
    }

    /* renamed from: V */
    public boolean mo1212V() {
        if (this.f930X == null || this.f930X.f973r == null) {
            return true;
        }
        return this.f930X.f973r.booleanValue();
    }

    /* renamed from: W */
    public void mo1213W() {
        if (this.f908B == null || this.f908B.f1118m == null) {
            mo1453c().f964i = false;
        } else if (Looper.myLooper() != this.f908B.f1118m.mo1530h().getLooper()) {
            this.f908B.f1118m.mo1530h().postAtFrontOfQueue(new Runnable() {
                public void run() {
                    Fragment.this.mo1450b();
                }
            });
        } else {
            mo1450b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: X */
    public void mo1214X() {
        if (this.f909C != null) {
            this.f910D = new C0377m();
            this.f910D.mo1571a(this.f909C, (C0371i) new C0371i() {
                /* renamed from: a */
                public Fragment mo1329a(Context context, String str, Bundle bundle) {
                    return Fragment.this.f909C.mo1329a(context, str, bundle);
                }

                /* renamed from: a */
                public View mo1330a(int i) {
                    if (Fragment.this.f925S != null) {
                        return Fragment.this.f925S.findViewById(i);
                    }
                    throw new IllegalStateException("Fragment does not have a view");
                }

                /* renamed from: a */
                public boolean mo1331a() {
                    return Fragment.this.f925S != null;
                }
            }, this);
            return;
        }
        throw new IllegalStateException("Fragment has not been attached yet.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Y */
    public void mo1215Y() {
        if (this.f910D != null) {
            this.f910D.mo1616n();
            this.f910D.mo1605h();
        }
        this.f937k = 4;
        this.f923Q = false;
        mo1288g();
        if (this.f923Q) {
            if (this.f910D != null) {
                this.f910D.mo1624q();
            }
            this.f936ad.mo66a(Event.ON_START);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onStart()");
        throw new SuperNotCalledException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Z */
    public void mo1216Z() {
        if (this.f910D != null) {
            this.f910D.mo1616n();
            this.f910D.mo1605h();
        }
        this.f937k = 5;
        this.f923Q = false;
        mo1200J();
        if (this.f923Q) {
            if (this.f910D != null) {
                this.f910D.mo1625r();
                this.f910D.mo1605h();
            }
            this.f936ad.mo66a(Event.ON_RESUME);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onResume()");
        throw new SuperNotCalledException(sb.toString());
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* renamed from: a */
    public Animation mo1218a(int i, boolean z, int i2) {
        return null;
    }

    /* renamed from: a */
    public final String mo1219a(int i) {
        return mo1320t().getString(i);
    }

    /* renamed from: a */
    public final String mo1220a(int i, Object... objArr) {
        return mo1320t().getString(i, objArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1221a(int i, int i2) {
        if (this.f930X != null || i != 0 || i2 != 0) {
            mo1453c();
            this.f930X.f960e = i;
            this.f930X.f961f = i2;
        }
    }

    /* renamed from: a */
    public void mo1222a(int i, int i2, Intent intent) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1223a(int i, Fragment fragment) {
        StringBuilder sb;
        String str;
        this.f941o = i;
        if (fragment != null) {
            sb = new StringBuilder();
            sb.append(fragment.f942p);
            str = ":";
        } else {
            sb = new StringBuilder();
            str = "android:fragment:";
        }
        sb.append(str);
        sb.append(this.f941o);
        this.f942p = sb.toString();
    }

    /* renamed from: a */
    public void mo1224a(int i, String[] strArr, int[] iArr) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1225a(Animator animator) {
        mo1453c().f957b = animator;
    }

    @Deprecated
    /* renamed from: a */
    public void mo1226a(Activity activity) {
        this.f923Q = true;
    }

    @Deprecated
    /* renamed from: a */
    public void mo1227a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f923Q = true;
    }

    /* renamed from: a */
    public void mo1228a(Context context) {
        this.f923Q = true;
        Activity f = this.f909C == null ? null : this.f909C.mo1528f();
        if (f != null) {
            this.f923Q = false;
            mo1226a(f);
        }
    }

    /* renamed from: a */
    public void mo1229a(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f923Q = true;
        Activity f = this.f909C == null ? null : this.f909C.mo1528f();
        if (f != null) {
            this.f923Q = false;
            mo1227a(f, attributeSet, bundle);
        }
    }

    /* renamed from: a */
    public void mo1230a(Intent intent) {
        mo1232a(intent, (Bundle) null);
    }

    /* renamed from: a */
    public void mo1231a(Intent intent, int i, Bundle bundle) {
        if (this.f909C != null) {
            this.f909C.mo1492a(this, intent, i, bundle);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public void mo1232a(Intent intent, Bundle bundle) {
        if (this.f909C != null) {
            this.f909C.mo1492a(this, intent, -1, bundle);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1233a(Configuration configuration) {
        onConfigurationChanged(configuration);
        if (this.f910D != null) {
            this.f910D.mo1564a(configuration);
        }
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        this.f923Q = true;
        mo1299j(bundle);
        if (this.f910D != null && !this.f910D.mo1587b(1)) {
            this.f910D.mo1619o();
        }
    }

    /* renamed from: a */
    public void mo1235a(SavedState savedState) {
        if (this.f941o < 0) {
            this.f938l = (savedState == null || savedState.f955a == null) ? null : savedState.f955a;
            return;
        }
        throw new IllegalStateException("Fragment already active");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1236a(C0339b bVar) {
        mo1453c();
        if (bVar != this.f930X.f965j) {
            if (bVar == null || this.f930X.f965j == null) {
                if (this.f930X.f964i) {
                    this.f930X.f965j = bVar;
                }
                if (bVar != null) {
                    bVar.mo1339b();
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Trying to set a replacement startPostponedEnterTransition on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo1237a(Fragment fragment) {
    }

    /* renamed from: a */
    public void mo1238a(Fragment fragment, int i) {
        C0374l u = mo1322u();
        C0374l u2 = fragment != null ? fragment.mo1322u() : null;
        if (u == null || u2 == null || u == u2) {
            Fragment fragment2 = fragment;
            while (fragment2 != null) {
                if (fragment2 != this) {
                    fragment2 = fragment2.mo1311o();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Setting ");
                    sb.append(fragment);
                    sb.append(" as the target of ");
                    sb.append(this);
                    sb.append(" would create a target cycle");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.f944r = fragment;
            this.f946t = i;
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Fragment ");
        sb2.append(fragment);
        sb2.append(" must share the same FragmentManager to be set as a target fragment");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: a */
    public void mo1239a(Menu menu) {
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
    }

    /* renamed from: a */
    public void mo1241a(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
    }

    /* renamed from: a */
    public void mo1243a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f914H));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f915I));
        printWriter.print(" mTag=");
        printWriter.println(this.f916J);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f937k);
        printWriter.print(" mIndex=");
        printWriter.print(this.f941o);
        printWriter.print(" mWho=");
        printWriter.print(this.f942p);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f907A);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f947u);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f948v);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f949w);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f950x);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f917K);
        printWriter.print(" mDetached=");
        printWriter.print(this.f918L);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f922P);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f921O);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f919M);
        printWriter.print(" mRetaining=");
        printWriter.print(this.f920N);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f928V);
        if (this.f908B != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f908B);
        }
        if (this.f909C != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f909C);
        }
        if (this.f913G != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f913G);
        }
        if (this.f943q != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f943q);
        }
        if (this.f938l != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f938l);
        }
        if (this.f939m != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f939m);
        }
        if (this.f944r != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.f944r);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f946t);
        }
        if (mo1254ai() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(mo1254ai());
        }
        if (this.f924R != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f924R);
        }
        if (this.f925S != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f925S);
        }
        if (this.f926T != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.f925S);
        }
        if (mo1259an() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(mo1259an());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(mo1261ap());
        }
        if (this.f929W != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            LoaderManagerImpl loaderManagerImpl = this.f929W;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            loaderManagerImpl.mo1355a(sb.toString(), fileDescriptor, printWriter, strArr);
        }
        if (this.f910D != null) {
            printWriter.print(str);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Child ");
            sb2.append(this.f910D);
            sb2.append(":");
            printWriter.println(sb2.toString());
            C0377m mVar = this.f910D;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append("  ");
            mVar.mo1539a(sb3.toString(), fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: a */
    public final void mo1244a(String[] strArr, int i) {
        if (this.f909C != null) {
            this.f909C.mo1493a(this, strArr, i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: aa */
    public void mo1246aa() {
        if (this.f910D != null) {
            this.f910D.mo1616n();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ab */
    public void mo1247ab() {
        onLowMemory();
        if (this.f910D != null) {
            this.f910D.mo1632x();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ac */
    public void mo1248ac() {
        this.f936ad.mo66a(Event.ON_PAUSE);
        if (this.f910D != null) {
            this.f910D.mo1626s();
        }
        this.f937k = 4;
        this.f923Q = false;
        mo1201K();
        if (!this.f923Q) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onPause()");
            throw new SuperNotCalledException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ad */
    public void mo1249ad() {
        this.f936ad.mo66a(Event.ON_STOP);
        if (this.f910D != null) {
            this.f910D.mo1627t();
        }
        this.f937k = 3;
        this.f923Q = false;
        mo1292h();
        if (!this.f923Q) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onStop()");
            throw new SuperNotCalledException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ae */
    public void mo1250ae() {
        if (this.f910D != null) {
            this.f910D.mo1629u();
        }
        this.f937k = 2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: af */
    public void mo1251af() {
        if (this.f910D != null) {
            this.f910D.mo1630v();
        }
        this.f937k = 1;
        this.f923Q = false;
        mo1296i();
        if (this.f923Q) {
            if (this.f929W != null) {
                this.f929W.mo1354a();
            }
            this.f952z = false;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDestroyView()");
        throw new SuperNotCalledException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ag */
    public void mo1252ag() {
        this.f936ad.mo66a(Event.ON_DESTROY);
        if (this.f910D != null) {
            this.f910D.mo1631w();
        }
        this.f937k = 0;
        this.f923Q = false;
        this.f935ac = false;
        mo1202L();
        if (this.f923Q) {
            this.f910D = null;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDestroy()");
        throw new SuperNotCalledException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ah */
    public void mo1253ah() {
        this.f923Q = false;
        mo1285f();
        this.f934ab = null;
        if (!this.f923Q) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onDetach()");
            throw new SuperNotCalledException(sb.toString());
        } else if (this.f910D == null) {
        } else {
            if (this.f920N) {
                this.f910D.mo1631w();
                this.f910D = null;
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Child FragmentManager of ");
            sb2.append(this);
            sb2.append(" was not ");
            sb2.append(" destroyed and this fragment is not retaining instance");
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ai */
    public int mo1254ai() {
        if (this.f930X == null) {
            return 0;
        }
        return this.f930X.f959d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: aj */
    public int mo1255aj() {
        if (this.f930X == null) {
            return 0;
        }
        return this.f930X.f960e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ak */
    public int mo1256ak() {
        if (this.f930X == null) {
            return 0;
        }
        return this.f930X.f961f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: al */
    public C0353ad mo1257al() {
        if (this.f930X == null) {
            return null;
        }
        return this.f930X.f962g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: am */
    public C0353ad mo1258am() {
        if (this.f930X == null) {
            return null;
        }
        return this.f930X.f963h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: an */
    public View mo1259an() {
        if (this.f930X == null) {
            return null;
        }
        return this.f930X.f956a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ao */
    public Animator mo1260ao() {
        if (this.f930X == null) {
            return null;
        }
        return this.f930X.f957b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ap */
    public int mo1261ap() {
        if (this.f930X == null) {
            return 0;
        }
        return this.f930X.f958c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: aq */
    public boolean mo1262aq() {
        if (this.f930X == null) {
            return false;
        }
        return this.f930X.f964i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ar */
    public boolean mo1263ar() {
        if (this.f930X == null) {
            return false;
        }
        return this.f930X.f966k;
    }

    /* renamed from: b */
    public Animator mo1264b(int i, boolean z, int i2) {
        return null;
    }

    /* renamed from: b */
    public LayoutInflater mo1265b(Bundle bundle) {
        return mo1295i(bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public View mo1266b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f910D != null) {
            this.f910D.mo1616n();
        }
        this.f952z = true;
        return mo1217a(layoutInflater, viewGroup, bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1267b(int i) {
        if (this.f930X != null || i != 0) {
            mo1453c().f959d = i;
        }
    }

    /* renamed from: b */
    public void mo1268b(Menu menu) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1269b(View view) {
        mo1453c().f956a = view;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo1270b(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f917K) {
            return false;
        }
        if (this.f921O && this.f922P) {
            z = true;
            mo1240a(menu, menuInflater);
        }
        return this.f910D != null ? z | this.f910D.mo1575a(menu, menuInflater) : z;
    }

    /* renamed from: b */
    public boolean mo1271b(MenuItem menuItem) {
        return false;
    }

    /* renamed from: b_ */
    public boolean mo1272b_(String str) {
        if (this.f909C != null) {
            return this.f909C.mo1496a(str);
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1273c(int i) {
        mo1453c().f958c = i;
    }

    /* renamed from: c */
    public void mo1274c(boolean z) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo1275c(Menu menu) {
        boolean z = false;
        if (this.f917K) {
            return false;
        }
        if (this.f921O && this.f922P) {
            z = true;
            mo1239a(menu);
        }
        return this.f910D != null ? z | this.f910D.mo1574a(menu) : z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo1276c(MenuItem menuItem) {
        if (!this.f917K) {
            if (this.f921O && this.f922P && mo1245a(menuItem)) {
                return true;
            }
            if (this.f910D != null && this.f910D.mo1576a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c_ */
    public Fragment mo1277c_(String str) {
        if (str.equals(this.f942p)) {
            return this;
        }
        if (this.f910D != null) {
            return this.f910D.mo1578b(str);
        }
        return null;
    }

    /* renamed from: d */
    public void mo1278d(Bundle bundle) {
        this.f923Q = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo1279d(Menu menu) {
        if (!this.f917K) {
            if (this.f921O && this.f922P) {
                mo1268b(menu);
            }
            if (this.f910D != null) {
                this.f910D.mo1585b(menu);
            }
        }
    }

    /* renamed from: d */
    public void mo1280d(boolean z) {
        this.f919M = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo1281d(MenuItem menuItem) {
        if (!this.f917K) {
            if (mo1271b(menuItem)) {
                return true;
            }
            if (this.f910D != null && this.f910D.mo1588b(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
    }

    /* renamed from: e */
    public void mo1283e(boolean z) {
        if (this.f921O != z) {
            this.f921O = z;
            if (mo1326y() && !mo1194D()) {
                this.f909C.mo1499c();
            }
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public void mo1285f() {
        this.f923Q = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo1286f(Bundle bundle) {
        if (this.f939m != null) {
            this.f926T.restoreHierarchyState(this.f939m);
            this.f939m = null;
        }
        this.f923Q = false;
        mo1301k(bundle);
        if (!this.f923Q) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onViewStateRestored()");
            throw new SuperNotCalledException(sb.toString());
        }
    }

    /* renamed from: f */
    public void mo1287f(boolean z) {
        if (this.f922P != z) {
            this.f922P = z;
            if (this.f921O && mo1326y() && !mo1194D()) {
                this.f909C.mo1499c();
            }
        }
    }

    /* renamed from: g */
    public void mo1288g() {
        this.f923Q = true;
    }

    /* renamed from: g */
    public void mo1289g(Bundle bundle) {
        if (this.f941o < 0 || !mo1310n()) {
            this.f943q = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already active and state has been saved");
    }

    /* renamed from: g */
    public void mo1290g(boolean z) {
        if (!this.f928V && z && this.f937k < 4 && this.f908B != null && mo1326y()) {
            this.f908B.mo1579b(this);
        }
        this.f928V = z;
        this.f927U = this.f937k < 4 && !z;
        if (this.f938l != null) {
            this.f940n = Boolean.valueOf(this.f928V);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public LayoutInflater mo1291h(Bundle bundle) {
        this.f934ab = mo1265b(bundle);
        return this.f934ab;
    }

    /* renamed from: h */
    public void mo1292h() {
        this.f923Q = true;
    }

    /* renamed from: h */
    public void mo1293h(boolean z) {
    }

    public final int hashCode() {
        return super.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public LayoutInflater mo1295i(Bundle bundle) {
        if (this.f909C != null) {
            LayoutInflater b = this.f909C.mo1497b();
            mo1323v();
            C0605e.m2744b(b, this.f910D.mo1634z());
            return b;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* renamed from: i */
    public void mo1296i() {
        this.f923Q = true;
    }

    /* renamed from: i */
    public void mo1297i(boolean z) {
    }

    /* renamed from: j */
    public C0038o mo1298j() {
        if (mo1316q() != null) {
            if (this.f912F == null) {
                this.f912F = new C0038o();
            }
            return this.f912F;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo1299j(Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                if (this.f910D == null) {
                    mo1214X();
                }
                this.f910D.mo1565a(parcelable, this.f911E);
                this.f911E = null;
                this.f910D.mo1619o();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo1300j(boolean z) {
        mo1293h(z);
        if (this.f910D != null) {
            this.f910D.mo1573a(z);
        }
    }

    /* renamed from: k */
    public void mo1301k(Bundle bundle) {
        this.f923Q = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo1302k(boolean z) {
        mo1297i(z);
        if (this.f910D != null) {
            this.f910D.mo1586b(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final boolean mo1303k() {
        return this.f907A > 0;
    }

    /* renamed from: l */
    public final String mo1304l() {
        return this.f916J;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo1305l(Bundle bundle) {
        if (this.f910D != null) {
            this.f910D.mo1616n();
        }
        this.f937k = 1;
        this.f923Q = false;
        mo1234a(bundle);
        this.f935ac = true;
        if (this.f923Q) {
            this.f936ad.mo66a(Event.ON_CREATE);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onCreate()");
        throw new SuperNotCalledException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo1306l(boolean z) {
        mo1453c().f966k = z;
    }

    /* renamed from: m */
    public final Bundle mo1307m() {
        return this.f943q;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo1308m(Bundle bundle) {
        if (this.f910D != null) {
            this.f910D.mo1616n();
        }
        this.f937k = 2;
        this.f923Q = false;
        mo1278d(bundle);
        if (!this.f923Q) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onActivityCreated()");
            throw new SuperNotCalledException(sb.toString());
        } else if (this.f910D != null) {
            this.f910D.mo1622p();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo1309n(Bundle bundle) {
        mo1282e(bundle);
        if (this.f910D != null) {
            Parcelable m = this.f910D.mo1614m();
            if (m != null) {
                bundle.putParcelable("android:support:fragments", m);
            }
        }
    }

    /* renamed from: n */
    public final boolean mo1310n() {
        if (this.f908B == null) {
            return false;
        }
        return this.f908B.mo1544f();
    }

    /* renamed from: o */
    public final Fragment mo1311o() {
        return this.f944r;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f923Q = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        mo1318s().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.f923Q = true;
    }

    /* renamed from: p */
    public final int mo1315p() {
        return this.f946t;
    }

    /* renamed from: q */
    public Context mo1316q() {
        if (this.f909C == null) {
            return null;
        }
        return this.f909C.mo1529g();
    }

    /* renamed from: r */
    public final Context mo1317r() {
        Context q = mo1316q();
        if (q != null) {
            return q;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to a context.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: s */
    public final C0367h mo1318s() {
        if (this.f909C == null) {
            return null;
        }
        return (C0367h) this.f909C.mo1528f();
    }

    public void startActivityForResult(Intent intent, int i) {
        mo1231a(intent, i, (Bundle) null);
    }

    /* renamed from: t */
    public final Resources mo1320t() {
        return mo1317r().getResources();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C0493d.m2201a(this, sb);
        if (this.f941o >= 0) {
            sb.append(" #");
            sb.append(this.f941o);
        }
        if (this.f914H != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f914H));
        }
        if (this.f916J != null) {
            sb.append(" ");
            sb.append(this.f916J);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public final C0374l mo1322u() {
        return this.f908B;
    }

    /* renamed from: v */
    public final C0374l mo1323v() {
        if (this.f910D == null) {
            mo1214X();
            if (this.f937k >= 5) {
                this.f910D.mo1625r();
            } else if (this.f937k >= 4) {
                this.f910D.mo1624q();
            } else if (this.f937k >= 2) {
                this.f910D.mo1622p();
            } else if (this.f937k >= 1) {
                this.f910D.mo1619o();
            }
        }
        return this.f910D;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public C0374l mo1324w() {
        return this.f910D;
    }

    /* renamed from: x */
    public final Fragment mo1325x() {
        return this.f913G;
    }

    /* renamed from: y */
    public final boolean mo1326y() {
        return this.f909C != null && this.f947u;
    }

    /* renamed from: z */
    public final boolean mo1327z() {
        return this.f918L;
    }
}
