package android.support.p009v4.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.p009v4.content.C0452b;
import android.support.p009v4.p010a.p011a.C0311a;
import android.support.p009v4.view.AbsSavedState;
import android.support.p009v4.view.C0577a;
import android.support.p009v4.view.C0604d;
import android.support.p009v4.view.C0626s;
import android.support.p009v4.view.p021a.C0583b;
import android.support.p009v4.view.p021a.C0583b.C0584a;
import android.support.p009v4.widget.C0721s.C0724a;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.widget.DrawerLayout */
public class DrawerLayout extends ViewGroup {

    /* renamed from: a */
    static final int[] f1816a = {16842931};

    /* renamed from: b */
    static final boolean f1817b = (VERSION.SDK_INT >= 19);

    /* renamed from: c */
    private static final int[] f1818c = {16843828};

    /* renamed from: d */
    private static final boolean f1819d;

    /* renamed from: A */
    private float f1820A;

    /* renamed from: B */
    private Drawable f1821B;

    /* renamed from: C */
    private Drawable f1822C;

    /* renamed from: D */
    private Drawable f1823D;

    /* renamed from: E */
    private CharSequence f1824E;

    /* renamed from: F */
    private CharSequence f1825F;

    /* renamed from: G */
    private Object f1826G;

    /* renamed from: H */
    private boolean f1827H;

    /* renamed from: I */
    private Drawable f1828I;

    /* renamed from: J */
    private Drawable f1829J;

    /* renamed from: K */
    private Drawable f1830K;

    /* renamed from: L */
    private Drawable f1831L;

    /* renamed from: M */
    private final ArrayList<View> f1832M;

    /* renamed from: e */
    private final C0657b f1833e;

    /* renamed from: f */
    private float f1834f;

    /* renamed from: g */
    private int f1835g;

    /* renamed from: h */
    private int f1836h;

    /* renamed from: i */
    private float f1837i;

    /* renamed from: j */
    private Paint f1838j;

    /* renamed from: k */
    private final C0721s f1839k;

    /* renamed from: l */
    private final C0721s f1840l;

    /* renamed from: m */
    private final C0660e f1841m;

    /* renamed from: n */
    private final C0660e f1842n;

    /* renamed from: o */
    private int f1843o;

    /* renamed from: p */
    private boolean f1844p;

    /* renamed from: q */
    private boolean f1845q;

    /* renamed from: r */
    private int f1846r;

    /* renamed from: s */
    private int f1847s;

    /* renamed from: t */
    private int f1848t;

    /* renamed from: u */
    private int f1849u;

    /* renamed from: v */
    private boolean f1850v;

    /* renamed from: w */
    private boolean f1851w;

    /* renamed from: x */
    private C0658c f1852x;

    /* renamed from: y */
    private List<C0658c> f1853y;

    /* renamed from: z */
    private float f1854z;

    /* renamed from: android.support.v4.widget.DrawerLayout$SavedState */
    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        /* renamed from: a */
        int f1856a = 0;

        /* renamed from: b */
        int f1857b;

        /* renamed from: c */
        int f1858c;

        /* renamed from: e */
        int f1859e;

        /* renamed from: f */
        int f1860f;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1856a = parcel.readInt();
            this.f1857b = parcel.readInt();
            this.f1858c = parcel.readInt();
            this.f1859e = parcel.readInt();
            this.f1860f = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1856a);
            parcel.writeInt(this.f1857b);
            parcel.writeInt(this.f1858c);
            parcel.writeInt(this.f1859e);
            parcel.writeInt(this.f1860f);
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$a */
    class C0656a extends C0577a {

        /* renamed from: c */
        private final Rect f1862c = new Rect();

        C0656a() {
        }

        /* renamed from: a */
        private void m3084a(C0583b bVar, C0583b bVar2) {
            Rect rect = this.f1862c;
            bVar2.mo2352a(rect);
            bVar.mo2359b(rect);
            bVar2.mo2364c(rect);
            bVar.mo2369d(rect);
            bVar.mo2375e(bVar2.mo2381g());
            bVar.mo2354a(bVar2.mo2395o());
            bVar.mo2361b(bVar2.mo2396p());
            bVar.mo2371d(bVar2.mo2398r());
            bVar.mo2387j(bVar2.mo2392l());
            bVar.mo2382h(bVar2.mo2388j());
            bVar.mo2367c(bVar2.mo2376e());
            bVar.mo2372d(bVar2.mo2379f());
            bVar.mo2378f(bVar2.mo2383h());
            bVar.mo2380g(bVar2.mo2386i());
            bVar.mo2385i(bVar2.mo2390k());
            bVar.mo2351a(bVar2.mo2358b());
        }

        /* renamed from: a */
        private void m3085a(C0583b bVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.m3043l(childAt)) {
                    bVar.mo2360b(childAt);
                }
            }
        }

        /* renamed from: a */
        public void mo285a(View view, C0583b bVar) {
            if (DrawerLayout.f1817b) {
                super.mo285a(view, bVar);
            } else {
                C0583b a = C0583b.m2644a(bVar);
                super.mo285a(view, a);
                bVar.mo2353a(view);
                ViewParent f = C0626s.m2863f(view);
                if (f instanceof View) {
                    bVar.mo2365c((View) f);
                }
                m3084a(bVar, a);
                a.mo2399s();
                m3085a(bVar, (ViewGroup) view);
            }
            bVar.mo2361b((CharSequence) DrawerLayout.class.getName());
            bVar.mo2367c(false);
            bVar.mo2372d(false);
            bVar.mo2357a(C0584a.f1705a);
            bVar.mo2357a(C0584a.f1706b);
        }

        /* renamed from: a */
        public void mo474a(View view, AccessibilityEvent accessibilityEvent) {
            super.mo474a(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        /* renamed from: a */
        public boolean mo2328a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f1817b || DrawerLayout.m3043l(view)) {
                return super.mo2328a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        /* renamed from: d */
        public boolean mo2330d(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.mo2330d(view, accessibilityEvent);
            }
            List text = accessibilityEvent.getText();
            View c = DrawerLayout.this.mo2591c();
            if (c != null) {
                CharSequence b = DrawerLayout.this.mo2584b(DrawerLayout.this.mo2600e(c));
                if (b != null) {
                    text.add(b);
                }
            }
            return true;
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$b */
    static final class C0657b extends C0577a {
        C0657b() {
        }

        /* renamed from: a */
        public void mo285a(View view, C0583b bVar) {
            super.mo285a(view, bVar);
            if (!DrawerLayout.m3043l(view)) {
                bVar.mo2365c((View) null);
            }
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$c */
    public interface C0658c {
        /* renamed from: a */
        void mo2644a(int i);

        /* renamed from: a */
        void mo2645a(View view);

        /* renamed from: a */
        void mo2646a(View view, float f);

        /* renamed from: b */
        void mo2647b(View view);
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$d */
    public static class C0659d extends MarginLayoutParams {

        /* renamed from: a */
        public int f1863a = 0;

        /* renamed from: b */
        float f1864b;

        /* renamed from: c */
        boolean f1865c;

        /* renamed from: d */
        int f1866d;

        public C0659d(int i, int i2) {
            super(i, i2);
        }

        public C0659d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f1816a);
            this.f1863a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0659d(C0659d dVar) {
            super(dVar);
            this.f1863a = dVar.f1863a;
        }

        public C0659d(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0659d(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$e */
    private class C0660e extends C0724a {

        /* renamed from: b */
        private final int f1868b;

        /* renamed from: c */
        private C0721s f1869c;

        /* renamed from: d */
        private final Runnable f1870d = new Runnable() {
            public void run() {
                C0660e.this.mo2651b();
            }
        };

        C0660e(int i) {
            this.f1868b = i;
        }

        /* renamed from: c */
        private void m3095c() {
            int i = 3;
            if (this.f1868b == 3) {
                i = 5;
            }
            View c = DrawerLayout.this.mo2592c(i);
            if (c != null) {
                DrawerLayout.this.mo2613i(c);
            }
        }

        /* renamed from: a */
        public int mo455a(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: a */
        public void mo2648a() {
            DrawerLayout.this.removeCallbacks(this.f1870d);
        }

        /* renamed from: a */
        public void mo456a(int i) {
            DrawerLayout.this.mo2574a(this.f1868b, i, this.f1869c.mo2927c());
        }

        /* renamed from: a */
        public void mo2649a(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f1870d, 160);
        }

        /* renamed from: a */
        public void mo2650a(C0721s sVar) {
            this.f1869c = sVar;
        }

        /* renamed from: a */
        public void mo457a(View view, float f, float f2) {
            int i;
            float d = DrawerLayout.this.mo2597d(view);
            int width = view.getWidth();
            if (DrawerLayout.this.mo2581a(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && d > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && d > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f1869c.mo2917a(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        /* renamed from: a */
        public void mo458a(View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.mo2581a(view, 3) ? (float) (i + width) : (float) (DrawerLayout.this.getWidth() - i)) / ((float) width);
            DrawerLayout.this.mo2589b(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        /* renamed from: a */
        public boolean mo459a(View view, int i) {
            return DrawerLayout.this.mo2605g(view) && DrawerLayout.this.mo2581a(view, this.f1868b) && DrawerLayout.this.mo2571a(view) == 0;
        }

        /* renamed from: b */
        public int mo654b(View view) {
            if (DrawerLayout.this.mo2605g(view)) {
                return view.getWidth();
            }
            return 0;
        }

        /* renamed from: b */
        public int mo460b(View view, int i, int i2) {
            int width;
            int width2;
            if (DrawerLayout.this.mo2581a(view, 3)) {
                width2 = -view.getWidth();
                width = 0;
            } else {
                width = DrawerLayout.this.getWidth();
                width2 = width - view.getWidth();
            }
            return Math.max(width2, Math.min(i, width));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo2651b() {
            View view;
            int i;
            int b = this.f1869c.mo2921b();
            int i2 = 0;
            boolean z = this.f1868b == 3;
            if (z) {
                view = DrawerLayout.this.mo2592c(3);
                if (view != null) {
                    i2 = -view.getWidth();
                }
                i = i2 + b;
            } else {
                view = DrawerLayout.this.mo2592c(5);
                i = DrawerLayout.this.getWidth() - b;
            }
            if (view == null) {
                return;
            }
            if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.mo2571a(view) == 0) {
                C0659d dVar = (C0659d) view.getLayoutParams();
                this.f1869c.mo2919a(view, i, view.getTop());
                dVar.f1865c = true;
                DrawerLayout.this.invalidate();
                m3095c();
                DrawerLayout.this.mo2598d();
            }
        }

        /* renamed from: b */
        public void mo2652b(int i, int i2) {
            DrawerLayout drawerLayout;
            int i3;
            if ((i & 1) == 1) {
                drawerLayout = DrawerLayout.this;
                i3 = 3;
            } else {
                drawerLayout = DrawerLayout.this;
                i3 = 5;
            }
            View c = drawerLayout.mo2592c(i3);
            if (c != null && DrawerLayout.this.mo2571a(c) == 0) {
                this.f1869c.mo2916a(c, i2);
            }
        }

        /* renamed from: b */
        public void mo655b(View view, int i) {
            ((C0659d) view.getLayoutParams()).f1865c = false;
            m3095c();
        }

        /* renamed from: b */
        public boolean mo2653b(int i) {
            return false;
        }
    }

    static {
        boolean z = true;
        if (VERSION.SDK_INT < 21) {
            z = false;
        }
        f1819d = z;
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1833e = new C0657b();
        this.f1836h = -1728053248;
        this.f1838j = new Paint();
        this.f1845q = true;
        this.f1846r = 3;
        this.f1847s = 3;
        this.f1848t = 3;
        this.f1849u = 3;
        this.f1828I = null;
        this.f1829J = null;
        this.f1830K = null;
        this.f1831L = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f1835g = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        this.f1841m = new C0660e(3);
        this.f1842n = new C0660e(5);
        this.f1839k = C0721s.m3350a((ViewGroup) this, 1.0f, (C0724a) this.f1841m);
        this.f1839k.mo2915a(1);
        this.f1839k.mo2914a(f2);
        this.f1841m.mo2650a(this.f1839k);
        this.f1840l = C0721s.m3350a((ViewGroup) this, 1.0f, (C0724a) this.f1842n);
        this.f1840l.mo2915a(2);
        this.f1840l.mo2914a(f2);
        this.f1842n.mo2650a(this.f1840l);
        setFocusableInTouchMode(true);
        C0626s.m2854b((View) this, 1);
        C0626s.m2844a((View) this, (C0577a) new C0656a());
        setMotionEventSplittingEnabled(false);
        if (C0626s.m2873p(this)) {
            if (VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new OnApplyWindowInsetsListener() {
                    @TargetApi(21)
                    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        ((DrawerLayout) view).mo2579a((Object) windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
                        return windowInsets.consumeSystemWindowInsets();
                    }
                });
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f1818c);
                try {
                    this.f1821B = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.f1821B = null;
            }
        }
        this.f1834f = f * 10.0f;
        this.f1832M = new ArrayList<>();
    }

    /* renamed from: a */
    private boolean m3035a(Drawable drawable, int i) {
        if (drawable == null || !C0311a.m1180b(drawable)) {
            return false;
        }
        C0311a.m1181b(drawable, i);
        return true;
    }

    /* renamed from: c */
    private void m3036c(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0626s.m2854b(childAt, ((z || mo2605g(childAt)) && (!z || childAt != view)) ? 4 : 1);
        }
    }

    /* renamed from: d */
    static String m3037d(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    /* renamed from: e */
    private void m3038e() {
        if (!f1819d) {
            this.f1822C = m3039f();
            this.f1823D = m3040g();
        }
    }

    /* renamed from: f */
    private Drawable m3039f() {
        int e = C0626s.m2861e(this);
        if (e == 0) {
            if (this.f1828I != null) {
                m3035a(this.f1828I, e);
                return this.f1828I;
            }
        } else if (this.f1829J != null) {
            m3035a(this.f1829J, e);
            return this.f1829J;
        }
        return this.f1830K;
    }

    /* renamed from: g */
    private Drawable m3040g() {
        int e = C0626s.m2861e(this);
        if (e == 0) {
            if (this.f1829J != null) {
                m3035a(this.f1829J, e);
                return this.f1829J;
            }
        } else if (this.f1828I != null) {
            m3035a(this.f1828I, e);
            return this.f1828I;
        }
        return this.f1831L;
    }

    /* renamed from: h */
    private boolean m3041h() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C0659d) getChildAt(i).getLayoutParams()).f1865c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private boolean m3042i() {
        return mo2591c() != null;
    }

    /* renamed from: l */
    static boolean m3043l(View view) {
        return (C0626s.m2859d(view) == 4 || C0626s.m2859d(view) == 2) ? false : true;
    }

    /* renamed from: m */
    private static boolean m3044m(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    /* renamed from: a */
    public int mo2570a(int i) {
        int e = C0626s.m2861e(this);
        if (i != 3) {
            if (i != 5) {
                if (i != 8388611) {
                    if (i == 8388613) {
                        if (this.f1849u != 3) {
                            return this.f1849u;
                        }
                        int i2 = e == 0 ? this.f1847s : this.f1846r;
                        if (i2 != 3) {
                            return i2;
                        }
                    }
                } else if (this.f1848t != 3) {
                    return this.f1848t;
                } else {
                    int i3 = e == 0 ? this.f1846r : this.f1847s;
                    if (i3 != 3) {
                        return i3;
                    }
                }
            } else if (this.f1847s != 3) {
                return this.f1847s;
            } else {
                int i4 = e == 0 ? this.f1849u : this.f1848t;
                if (i4 != 3) {
                    return i4;
                }
            }
        } else if (this.f1846r != 3) {
            return this.f1846r;
        } else {
            int i5 = e == 0 ? this.f1848t : this.f1849u;
            if (i5 != 3) {
                return i5;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public int mo2571a(View view) {
        if (mo2605g(view)) {
            return mo2570a(((C0659d) view.getLayoutParams()).f1863a);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo2572a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((C0659d) childAt.getLayoutParams()).f1866d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo2573a(int i, int i2) {
        int a = C0604d.m2741a(i2, C0626s.m2861e(this));
        if (i2 == 3) {
            this.f1846r = i;
        } else if (i2 == 5) {
            this.f1847s = i;
        } else if (i2 == 8388611) {
            this.f1848t = i;
        } else if (i2 == 8388613) {
            this.f1849u = i;
        }
        if (i != 0) {
            (a == 3 ? this.f1839k : this.f1840l).mo2933e();
        }
        switch (i) {
            case 1:
                View c = mo2592c(a);
                if (c != null) {
                    mo2613i(c);
                    return;
                }
                return;
            case 2:
                View c2 = mo2592c(a);
                if (c2 != null) {
                    mo2611h(c2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2574a(int i, int i2, View view) {
        int a = this.f1839k.mo2913a();
        int a2 = this.f1840l.mo2913a();
        int i3 = 2;
        if (a == 1 || a2 == 1) {
            i3 = 1;
        } else if (!(a == 2 || a2 == 2)) {
            i3 = 0;
        }
        if (view != null && i2 == 0) {
            C0659d dVar = (C0659d) view.getLayoutParams();
            if (dVar.f1864b == 0.0f) {
                mo2588b(view);
            } else if (dVar.f1864b == 1.0f) {
                mo2593c(view);
            }
        }
        if (i3 != this.f1843o) {
            this.f1843o = i3;
            if (this.f1853y != null) {
                for (int size = this.f1853y.size() - 1; size >= 0; size--) {
                    ((C0658c) this.f1853y.get(size)).mo2644a(i3);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2575a(int i, boolean z) {
        View c = mo2592c(i);
        if (c != null) {
            mo2578a(c, z);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No drawer view found with gravity ");
        sb.append(m3037d(i));
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public void mo2576a(C0658c cVar) {
        if (cVar != null) {
            if (this.f1853y == null) {
                this.f1853y = new ArrayList();
            }
            this.f1853y.add(cVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2577a(View view, float f) {
        if (this.f1853y != null) {
            for (int size = this.f1853y.size() - 1; size >= 0; size--) {
                ((C0658c) this.f1853y.get(size)).mo2646a(view, f);
            }
        }
    }

    /* renamed from: a */
    public void mo2578a(View view, boolean z) {
        if (mo2605g(view)) {
            C0659d dVar = (C0659d) view.getLayoutParams();
            if (this.f1845q) {
                dVar.f1864b = 1.0f;
                dVar.f1866d = 1;
                m3036c(view, true);
            } else if (z) {
                dVar.f1866d |= 2;
                if (mo2581a(view, 3)) {
                    this.f1839k.mo2919a(view, 0, view.getTop());
                } else {
                    this.f1840l.mo2919a(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                mo2594c(view, 1.0f);
                mo2574a(dVar.f1863a, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public void mo2579a(Object obj, boolean z) {
        this.f1826G = obj;
        this.f1827H = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2580a(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0659d dVar = (C0659d) childAt.getLayoutParams();
            if (mo2605g(childAt) && (!z || dVar.f1865c)) {
                z2 |= mo2581a(childAt, 3) ? this.f1839k.mo2919a(childAt, -childAt.getWidth(), childAt.getTop()) : this.f1840l.mo2919a(childAt, getWidth(), childAt.getTop());
                dVar.f1865c = false;
            }
        }
        this.f1841m.mo2648a();
        this.f1842n.mo2648a();
        if (z2) {
            invalidate();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2581a(View view, int i) {
        return (mo2600e(view) & i) == i;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!mo2605g(childAt)) {
                    this.f1832M.add(childAt);
                } else if (mo2614j(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
            if (!z) {
                int size = this.f1832M.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = (View) this.f1832M.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.f1832M.clear();
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        C0626s.m2854b(view, (mo2572a() != null || mo2605g(view)) ? 4 : 1);
        if (!f1817b) {
            C0626s.m2844a(view, (C0577a) this.f1833e);
        }
    }

    /* renamed from: b */
    public CharSequence mo2584b(int i) {
        int a = C0604d.m2741a(i, C0626s.m2861e(this));
        if (a == 3) {
            return this.f1824E;
        }
        if (a == 5) {
            return this.f1825F;
        }
        return null;
    }

    /* renamed from: b */
    public void mo2585b() {
        mo2580a(false);
    }

    /* renamed from: b */
    public void mo2586b(int i, boolean z) {
        View c = mo2592c(i);
        if (c != null) {
            mo2590b(c, z);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No drawer view found with gravity ");
        sb.append(m3037d(i));
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public void mo2587b(C0658c cVar) {
        if (cVar != null && this.f1853y != null) {
            this.f1853y.remove(cVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2588b(View view) {
        C0659d dVar = (C0659d) view.getLayoutParams();
        if ((dVar.f1866d & 1) == 1) {
            dVar.f1866d = 0;
            if (this.f1853y != null) {
                for (int size = this.f1853y.size() - 1; size >= 0; size--) {
                    ((C0658c) this.f1853y.get(size)).mo2647b(view);
                }
            }
            m3036c(view, false);
            if (hasWindowFocus()) {
                View rootView = getRootView();
                if (rootView != null) {
                    rootView.sendAccessibilityEvent(32);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2589b(View view, float f) {
        C0659d dVar = (C0659d) view.getLayoutParams();
        if (f != dVar.f1864b) {
            dVar.f1864b = f;
            mo2577a(view, f);
        }
    }

    /* renamed from: b */
    public void mo2590b(View view, boolean z) {
        C0721s sVar;
        int width;
        if (mo2605g(view)) {
            C0659d dVar = (C0659d) view.getLayoutParams();
            if (this.f1845q) {
                dVar.f1864b = 0.0f;
                dVar.f1866d = 0;
            } else if (z) {
                dVar.f1866d |= 4;
                if (mo2581a(view, 3)) {
                    sVar = this.f1839k;
                    width = -view.getWidth();
                } else {
                    sVar = this.f1840l;
                    width = getWidth();
                }
                sVar.mo2919a(view, width, view.getTop());
            } else {
                mo2594c(view, 0.0f);
                mo2574a(dVar.f1863a, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public View mo2591c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (mo2605g(childAt) && mo2615k(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public View mo2592c(int i) {
        int a = C0604d.m2741a(i, C0626s.m2861e(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((mo2600e(childAt) & 7) == a) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2593c(View view) {
        C0659d dVar = (C0659d) view.getLayoutParams();
        if ((dVar.f1866d & 1) == 0) {
            dVar.f1866d = 1;
            if (this.f1853y != null) {
                for (int size = this.f1853y.size() - 1; size >= 0; size--) {
                    ((C0658c) this.f1853y.get(size)).mo2645a(view);
                }
            }
            m3036c(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2594c(View view, float f) {
        float width = (float) view.getWidth();
        int i = (int) (width * f);
        int d = i - ((int) (mo2597d(view) * width));
        if (!mo2581a(view, 3)) {
            d = -d;
        }
        view.offsetLeftAndRight(d);
        mo2589b(view, f);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0659d) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((C0659d) getChildAt(i).getLayoutParams()).f1864b);
        }
        this.f1837i = f;
        boolean a = this.f1839k.mo2920a(true);
        boolean a2 = this.f1840l.mo2920a(true);
        if (a || a2) {
            C0626s.m2857c(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public float mo2597d(View view) {
        return ((C0659d) view.getLayoutParams()).f1864b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo2598d() {
        if (!this.f1851w) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.f1851w = true;
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        Drawable drawable;
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean f = mo2603f(view2);
        int width = getWidth();
        int save = canvas.save();
        int i2 = 0;
        if (f) {
            int childCount = getChildCount();
            i = width;
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view2 && childAt.getVisibility() == 0 && m3044m(childAt) && mo2605g(childAt) && childAt.getHeight() >= height) {
                    if (mo2581a(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i3) {
                            i3 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < i) {
                            i = left;
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, i, getHeight());
            i2 = i3;
        } else {
            i = width;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        if (this.f1837i <= 0.0f || !f) {
            if (this.f1822C != null && mo2581a(view2, 3)) {
                int intrinsicWidth = this.f1822C.getIntrinsicWidth();
                int right2 = view.getRight();
                float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.f1839k.mo2921b()), 1.0f));
                this.f1822C.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
                this.f1822C.setAlpha((int) (max * 255.0f));
                drawable = this.f1822C;
            } else if (this.f1823D != null && mo2581a(view2, 5)) {
                int intrinsicWidth2 = this.f1823D.getIntrinsicWidth();
                int left2 = view.getLeft();
                float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.f1840l.mo2921b()), 1.0f));
                this.f1823D.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
                this.f1823D.setAlpha((int) (max2 * 255.0f));
                drawable = this.f1823D;
            }
            drawable.draw(canvas);
        } else {
            this.f1838j.setColor((((int) (((float) ((this.f1836h & -16777216) >>> 24)) * this.f1837i)) << 24) | (this.f1836h & 16777215));
            canvas.drawRect((float) i2, 0.0f, (float) i, (float) getHeight(), this.f1838j);
        }
        return drawChild;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo2600e(View view) {
        return C0604d.m2741a(((C0659d) view.getLayoutParams()).f1863a, C0626s.m2861e(this));
    }

    /* renamed from: e */
    public void mo2601e(int i) {
        mo2575a(i, true);
    }

    /* renamed from: f */
    public void mo2602f(int i) {
        mo2586b(i, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo2603f(View view) {
        return ((C0659d) view.getLayoutParams()).f1863a == 0;
    }

    /* renamed from: g */
    public boolean mo2604g(int i) {
        View c = mo2592c(i);
        if (c != null) {
            return mo2614j(c);
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo2605g(View view) {
        int a = C0604d.m2741a(((C0659d) view.getLayoutParams()).f1863a, C0626s.m2861e(view));
        return ((a & 3) == 0 && (a & 5) == 0) ? false : true;
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new C0659d(-1, -1);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0659d(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0659d ? new C0659d((C0659d) layoutParams) : layoutParams instanceof MarginLayoutParams ? new C0659d((MarginLayoutParams) layoutParams) : new C0659d(layoutParams);
    }

    public float getDrawerElevation() {
        if (f1819d) {
            return this.f1834f;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f1821B;
    }

    /* renamed from: h */
    public void mo2611h(View view) {
        mo2578a(view, true);
    }

    /* renamed from: h */
    public boolean mo2612h(int i) {
        View c = mo2592c(i);
        if (c != null) {
            return mo2615k(c);
        }
        return false;
    }

    /* renamed from: i */
    public void mo2613i(View view) {
        mo2590b(view, true);
    }

    /* renamed from: j */
    public boolean mo2614j(View view) {
        if (mo2605g(view)) {
            return (((C0659d) view.getLayoutParams()).f1866d & 1) == 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: k */
    public boolean mo2615k(View view) {
        if (mo2605g(view)) {
            return ((C0659d) view.getLayoutParams()).f1864b > 0.0f;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1845q = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1845q = true;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1827H && this.f1821B != null) {
            int systemWindowInsetTop = (VERSION.SDK_INT < 21 || this.f1826G == null) ? 0 : ((WindowInsets) this.f1826G).getSystemWindowInsetTop();
            if (systemWindowInsetTop > 0) {
                this.f1821B.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.f1821B.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean a = this.f1839k.mo2918a(motionEvent) | this.f1840l.mo2918a(motionEvent);
        switch (motionEvent.getActionMasked()) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f1854z = x;
                this.f1820A = y;
                if (this.f1837i > 0.0f) {
                    View d = this.f1839k.mo2931d((int) x, (int) y);
                    if (d != null && mo2603f(d)) {
                        z = true;
                        this.f1850v = false;
                        this.f1851w = false;
                        break;
                    }
                }
                z = false;
                this.f1850v = false;
                this.f1851w = false;
            case 1:
            case 3:
                mo2580a(true);
                this.f1850v = false;
                this.f1851w = false;
                break;
            case 2:
                if (this.f1839k.mo2932d(3)) {
                    this.f1841m.mo2648a();
                    this.f1842n.mo2648a();
                    break;
                }
                break;
        }
        z = false;
        return a || z || m3041h() || this.f1851w;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !m3042i()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View c = mo2591c();
        if (c != null && mo2571a(c) == 0) {
            mo2585b();
        }
        return c != null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        this.f1844p = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C0659d dVar = (C0659d) childAt.getLayoutParams();
                if (mo2603f(childAt)) {
                    childAt.layout(dVar.leftMargin, dVar.topMargin, dVar.leftMargin + childAt.getMeasuredWidth(), dVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (mo2581a(childAt, 3)) {
                        float f2 = (float) measuredWidth;
                        i5 = (-measuredWidth) + ((int) (dVar.f1864b * f2));
                        f = ((float) (measuredWidth + i5)) / f2;
                    } else {
                        float f3 = (float) measuredWidth;
                        int i8 = i6 - ((int) (dVar.f1864b * f3));
                        f = ((float) (i6 - i8)) / f3;
                        i5 = i8;
                    }
                    boolean z2 = f != dVar.f1864b;
                    int i9 = dVar.f1863a & 112;
                    if (i9 == 16) {
                        int i10 = i4 - i2;
                        int i11 = (i10 - measuredHeight) / 2;
                        if (i11 < dVar.topMargin) {
                            i11 = dVar.topMargin;
                        } else if (i11 + measuredHeight > i10 - dVar.bottomMargin) {
                            i11 = (i10 - dVar.bottomMargin) - measuredHeight;
                        }
                        childAt.layout(i5, i11, measuredWidth + i5, measuredHeight + i11);
                    } else if (i9 != 80) {
                        childAt.layout(i5, dVar.topMargin, measuredWidth + i5, dVar.topMargin + measuredHeight);
                    } else {
                        int i12 = i4 - i2;
                        childAt.layout(i5, (i12 - dVar.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i12 - dVar.bottomMargin);
                    }
                    if (z2) {
                        mo2589b(childAt, f);
                    }
                    int i13 = dVar.f1864b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i13) {
                        childAt.setVisibility(i13);
                    }
                }
            }
        }
        this.f1844p = false;
        this.f1845q = false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        boolean z = this.f1826G != null && C0626s.m2873p(this);
        int e = C0626s.m2861e(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0659d dVar = (C0659d) childAt.getLayoutParams();
                if (z) {
                    int a = C0604d.m2741a(dVar.f1863a, e);
                    if (C0626s.m2873p(childAt)) {
                        if (VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.f1826G;
                            if (a == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (a == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.f1826G;
                        if (a == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (a == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        dVar.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        dVar.topMargin = windowInsets2.getSystemWindowInsetTop();
                        dVar.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        dVar.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (mo2603f(childAt)) {
                    childAt.measure(MeasureSpec.makeMeasureSpec((size - dVar.leftMargin) - dVar.rightMargin, 1073741824), MeasureSpec.makeMeasureSpec((size2 - dVar.topMargin) - dVar.bottomMargin, 1073741824));
                } else if (mo2605g(childAt)) {
                    if (f1819d && C0626s.m2869l(childAt) != this.f1834f) {
                        C0626s.m2837a(childAt, this.f1834f);
                    }
                    int e2 = mo2600e(childAt) & 7;
                    boolean z4 = e2 == 3;
                    if ((!z4 || !z2) && (z4 || !z3)) {
                        if (z4) {
                            z2 = true;
                        } else {
                            z3 = true;
                        }
                        childAt.measure(getChildMeasureSpec(i, this.f1835g + dVar.leftMargin + dVar.rightMargin, dVar.width), getChildMeasureSpec(i2, dVar.topMargin + dVar.bottomMargin, dVar.height));
                        i4++;
                        i3 = 0;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Child drawer has absolute gravity ");
                        sb.append(m3037d(e2));
                        sb.append(" but this ");
                        sb.append("DrawerLayout");
                        sb.append(" already has a ");
                        sb.append("drawer view along that edge");
                        throw new IllegalStateException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Child ");
                    sb2.append(childAt);
                    sb2.append(" at index ");
                    sb2.append(i4);
                    sb2.append(" does not have a valid layout_gravity - must be Gravity.LEFT, ");
                    sb2.append("Gravity.RIGHT or Gravity.NO_GRAVITY");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            int i5 = i;
            int i6 = i2;
            i4++;
            i3 = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo2234a());
        if (savedState.f1856a != 0) {
            View c = mo2592c(savedState.f1856a);
            if (c != null) {
                mo2611h(c);
            }
        }
        if (savedState.f1857b != 3) {
            mo2573a(savedState.f1857b, 3);
        }
        if (savedState.f1858c != 3) {
            mo2573a(savedState.f1858c, 5);
        }
        if (savedState.f1859e != 3) {
            mo2573a(savedState.f1859e, 8388611);
        }
        if (savedState.f1860f != 3) {
            mo2573a(savedState.f1860f, 8388613);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        m3038e();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            C0659d dVar = (C0659d) getChildAt(i).getLayoutParams();
            boolean z = true;
            boolean z2 = dVar.f1866d == 1;
            if (dVar.f1866d != 2) {
                z = false;
            }
            if (z2 || z) {
                savedState.f1856a = dVar.f1863a;
            } else {
                i++;
            }
        }
        savedState.f1857b = this.f1846r;
        savedState.f1858c = this.f1847s;
        savedState.f1859e = this.f1848t;
        savedState.f1860f = this.f1849u;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        this.f1839k.mo2922b(motionEvent);
        this.f1840l.mo2922b(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 3) {
            switch (action) {
                case 0:
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    this.f1854z = x;
                    this.f1820A = y;
                    break;
                case 1:
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    View d = this.f1839k.mo2931d((int) x2, (int) y2);
                    if (d != null && mo2603f(d)) {
                        float f = x2 - this.f1854z;
                        float f2 = y2 - this.f1820A;
                        int d2 = this.f1839k.mo2930d();
                        if ((f * f) + (f2 * f2) < ((float) (d2 * d2))) {
                            View a = mo2572a();
                            if (!(a == null || mo2571a(a) == 2)) {
                                z = false;
                                mo2580a(z);
                                this.f1850v = false;
                                break;
                            }
                        }
                    }
                    z = true;
                    mo2580a(z);
                    this.f1850v = false;
            }
        } else {
            mo2580a(true);
        }
        this.f1850v = false;
        this.f1851w = false;
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f1850v = z;
        if (z) {
            mo2580a(true);
        }
    }

    public void requestLayout() {
        if (!this.f1844p) {
            super.requestLayout();
        }
    }

    public void setDrawerElevation(float f) {
        this.f1834f = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (mo2605g(childAt)) {
                C0626s.m2837a(childAt, this.f1834f);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(C0658c cVar) {
        if (this.f1852x != null) {
            mo2587b(this.f1852x);
        }
        if (cVar != null) {
            mo2576a(cVar);
        }
        this.f1852x = cVar;
    }

    public void setDrawerLockMode(int i) {
        mo2573a(i, 3);
        mo2573a(i, 5);
    }

    public void setScrimColor(int i) {
        this.f1836h = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.f1821B = i != 0 ? C0452b.m2059a(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f1821B = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f1821B = new ColorDrawable(i);
        invalidate();
    }
}
