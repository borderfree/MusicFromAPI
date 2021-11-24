package android.support.p023v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.p009v4.p019g.C0509l;
import android.support.p009v4.p020os.C0560c;
import android.support.p009v4.view.AbsSavedState;
import android.support.p009v4.view.C0577a;
import android.support.p009v4.view.C0615h;
import android.support.p009v4.view.C0617j;
import android.support.p009v4.view.C0618k;
import android.support.p009v4.view.C0626s;
import android.support.p009v4.view.C0638t;
import android.support.p009v4.view.p021a.C0582a;
import android.support.p009v4.view.p021a.C0583b;
import android.support.p009v4.view.p021a.C0583b.C0585b;
import android.support.p009v4.view.p021a.C0583b.C0586c;
import android.support.p023v7.p030e.C0822a.C0823a;
import android.support.p023v7.p030e.C0822a.C0824b;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.google.android.gms.ads.AdRequest;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: android.support.v7.widget.RecyclerView */
public class RecyclerView extends ViewGroup implements C0617j {

    /* renamed from: I */
    static final Interpolator f2972I = new Interpolator() {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: J */
    private static final int[] f2973J = {16843830};

    /* renamed from: K */
    private static final int[] f2974K = {16842987};
    /* access modifiers changed from: private */

    /* renamed from: L */
    public static final boolean f2975L = (VERSION.SDK_INT >= 21);

    /* renamed from: M */
    private static final boolean f2976M = (VERSION.SDK_INT <= 15);

    /* renamed from: N */
    private static final boolean f2977N = (VERSION.SDK_INT <= 15);

    /* renamed from: O */
    private static final Class<?>[] f2978O = {Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};

    /* renamed from: a */
    static final boolean f2979a = (VERSION.SDK_INT == 18 || VERSION.SDK_INT == 19 || VERSION.SDK_INT == 20);

    /* renamed from: b */
    static final boolean f2980b = (VERSION.SDK_INT >= 23);

    /* renamed from: c */
    static final boolean f2981c = (VERSION.SDK_INT >= 16);

    /* renamed from: A */
    C1026al f2982A;

    /* renamed from: B */
    C1028a f2983B;

    /* renamed from: C */
    final C0955t f2984C;

    /* renamed from: D */
    boolean f2985D;

    /* renamed from: E */
    boolean f2986E;

    /* renamed from: F */
    boolean f2987F;

    /* renamed from: G */
    C1052av f2988G;

    /* renamed from: H */
    final List<C0958w> f2989H;

    /* renamed from: P */
    private final C0951r f2990P;

    /* renamed from: Q */
    private SavedState f2991Q;

    /* renamed from: R */
    private final Rect f2992R;

    /* renamed from: S */
    private final ArrayList<C0945m> f2993S;

    /* renamed from: T */
    private C0945m f2994T;

    /* renamed from: U */
    private int f2995U;

    /* renamed from: V */
    private boolean f2996V;

    /* renamed from: W */
    private int f2997W;

    /* renamed from: aA */
    private C0929d f2998aA;

    /* renamed from: aB */
    private final int[] f2999aB;

    /* renamed from: aC */
    private C0618k f3000aC;

    /* renamed from: aD */
    private final int[] f3001aD;
    /* access modifiers changed from: private */

    /* renamed from: aE */
    public final int[] f3002aE;

    /* renamed from: aF */
    private final int[] f3003aF;

    /* renamed from: aG */
    private Runnable f3004aG;

    /* renamed from: aH */
    private final C1093b f3005aH;

    /* renamed from: aa */
    private final AccessibilityManager f3006aa;

    /* renamed from: ab */
    private List<C0943k> f3007ab;

    /* renamed from: ac */
    private int f3008ac;

    /* renamed from: ad */
    private int f3009ad;

    /* renamed from: ae */
    private C0930e f3010ae;

    /* renamed from: af */
    private EdgeEffect f3011af;

    /* renamed from: ag */
    private EdgeEffect f3012ag;

    /* renamed from: ah */
    private EdgeEffect f3013ah;

    /* renamed from: ai */
    private EdgeEffect f3014ai;

    /* renamed from: aj */
    private int f3015aj;

    /* renamed from: ak */
    private int f3016ak;

    /* renamed from: al */
    private VelocityTracker f3017al;

    /* renamed from: am */
    private int f3018am;

    /* renamed from: an */
    private int f3019an;

    /* renamed from: ao */
    private int f3020ao;

    /* renamed from: ap */
    private int f3021ap;

    /* renamed from: aq */
    private int f3022aq;

    /* renamed from: ar */
    private C0944l f3023ar;

    /* renamed from: as */
    private final int f3024as;

    /* renamed from: at */
    private final int f3025at;

    /* renamed from: au */
    private float f3026au;

    /* renamed from: av */
    private float f3027av;

    /* renamed from: aw */
    private boolean f3028aw;

    /* renamed from: ax */
    private C0946n f3029ax;

    /* renamed from: ay */
    private List<C0946n> f3030ay;

    /* renamed from: az */
    private C0933b f3031az;

    /* renamed from: d */
    final C0949p f3032d;

    /* renamed from: e */
    C1103e f3033e;

    /* renamed from: f */
    C0995ac f3034f;

    /* renamed from: g */
    final C1091br f3035g;

    /* renamed from: h */
    boolean f3036h;

    /* renamed from: i */
    final Runnable f3037i;

    /* renamed from: j */
    final Rect f3038j;

    /* renamed from: k */
    final RectF f3039k;

    /* renamed from: l */
    C0926a f3040l;

    /* renamed from: m */
    C0937i f3041m;

    /* renamed from: n */
    C0950q f3042n;

    /* renamed from: o */
    final ArrayList<C0936h> f3043o;

    /* renamed from: p */
    boolean f3044p;

    /* renamed from: q */
    boolean f3045q;

    /* renamed from: r */
    boolean f3046r;

    /* renamed from: s */
    boolean f3047s;

    /* renamed from: t */
    boolean f3048t;

    /* renamed from: u */
    boolean f3049u;

    /* renamed from: v */
    boolean f3050v;

    /* renamed from: w */
    boolean f3051w;

    /* renamed from: x */
    boolean f3052x;

    /* renamed from: y */
    C0931f f3053y;

    /* renamed from: z */
    final C0957v f3054z;

    /* renamed from: android.support.v7.widget.RecyclerView$SavedState */
    public static class SavedState extends AbsSavedState {
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
        Parcelable f3060a;

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = C0937i.class.getClassLoader();
            }
            this.f3060a = parcel.readParcelable(classLoader);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4317a(SavedState savedState) {
            this.f3060a = savedState.f3060a;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f3060a, 0);
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$a */
    public static abstract class C0926a<VH extends C0958w> {

        /* renamed from: a */
        private final C0927b f3061a = new C0927b();

        /* renamed from: b */
        private boolean f3062b = false;

        /* renamed from: a */
        public abstract int mo342a();

        /* renamed from: a */
        public long mo343a(int i) {
            return -1;
        }

        /* renamed from: a */
        public void mo4324a(C0928c cVar) {
            this.f3061a.registerObserver(cVar);
        }

        /* renamed from: a */
        public void mo349a(VH vh) {
        }

        /* renamed from: a */
        public abstract void mo350a(VH vh, int i);

        /* renamed from: a */
        public void mo4325a(VH vh, int i, List<Object> list) {
            mo350a(vh, i);
        }

        /* renamed from: a */
        public void mo4326a(RecyclerView recyclerView) {
        }

        /* renamed from: b */
        public int mo352b(int i) {
            return 0;
        }

        /* renamed from: b */
        public abstract VH mo353b(ViewGroup viewGroup, int i);

        /* renamed from: b */
        public void mo4327b(C0928c cVar) {
            this.f3061a.unregisterObserver(cVar);
        }

        /* renamed from: b */
        public final void mo4328b(VH vh, int i) {
            vh.f3159c = i;
            if (mo4335d()) {
                vh.f3161e = mo343a(i);
            }
            vh.mo4574a(1, 519);
            C0560c.m2558a("RV OnBindView");
            mo4325a(vh, i, vh.mo4602u());
            vh.mo4600t();
            LayoutParams layoutParams = vh.f3157a.getLayoutParams();
            if (layoutParams instanceof C0942j) {
                ((C0942j) layoutParams).f3100e = true;
            }
            C0560c.m2557a();
        }

        /* renamed from: b */
        public void mo4329b(RecyclerView recyclerView) {
        }

        /* renamed from: b */
        public boolean mo4330b(VH vh) {
            return false;
        }

        /* renamed from: c */
        public final VH mo4331c(ViewGroup viewGroup, int i) {
            try {
                C0560c.m2558a("RV CreateView");
                VH b = mo353b(viewGroup, i);
                if (b.f3157a.getParent() == null) {
                    b.f3162f = i;
                    return b;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C0560c.m2557a();
            }
        }

        /* renamed from: c */
        public final void mo4332c(int i) {
            this.f3061a.mo4338a(i, 1);
        }

        /* renamed from: c */
        public void mo4333c(VH vh) {
        }

        /* renamed from: d */
        public void mo4334d(VH vh) {
        }

        /* renamed from: d */
        public final boolean mo4335d() {
            return this.f3062b;
        }

        /* renamed from: e */
        public final void mo4336e() {
            this.f3061a.mo4337a();
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$b */
    static class C0927b extends Observable<C0928c> {
        C0927b() {
        }

        /* renamed from: a */
        public void mo4337a() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0928c) this.mObservers.get(size)).mo4340a();
            }
        }

        /* renamed from: a */
        public void mo4338a(int i, int i2) {
            mo4339a(i, i2, null);
        }

        /* renamed from: a */
        public void mo4339a(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0928c) this.mObservers.get(size)).mo4342a(i, i2, obj);
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$c */
    public static abstract class C0928c {
        /* renamed from: a */
        public void mo4340a() {
        }

        /* renamed from: a */
        public void mo4341a(int i, int i2) {
        }

        /* renamed from: a */
        public void mo4342a(int i, int i2, Object obj) {
            mo4341a(i, i2);
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$d */
    public interface C0929d {
        /* renamed from: a */
        int mo4343a(int i, int i2);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$e */
    public static class C0930e {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public EdgeEffect mo4344a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$f */
    public static abstract class C0931f {

        /* renamed from: a */
        private C0933b f3063a = null;

        /* renamed from: b */
        private ArrayList<C0932a> f3064b = new ArrayList<>();

        /* renamed from: c */
        private long f3065c = 120;

        /* renamed from: d */
        private long f3066d = 120;

        /* renamed from: e */
        private long f3067e = 250;

        /* renamed from: f */
        private long f3068f = 250;

        /* renamed from: android.support.v7.widget.RecyclerView$f$a */
        public interface C0932a {
            /* renamed from: a */
            void mo4366a();
        }

        /* renamed from: android.support.v7.widget.RecyclerView$f$b */
        interface C0933b {
            /* renamed from: a */
            void mo4367a(C0958w wVar);
        }

        /* renamed from: android.support.v7.widget.RecyclerView$f$c */
        public static class C0934c {

            /* renamed from: a */
            public int f3069a;

            /* renamed from: b */
            public int f3070b;

            /* renamed from: c */
            public int f3071c;

            /* renamed from: d */
            public int f3072d;

            /* renamed from: a */
            public C0934c mo4368a(C0958w wVar) {
                return mo4369a(wVar, 0);
            }

            /* renamed from: a */
            public C0934c mo4369a(C0958w wVar, int i) {
                View view = wVar.f3157a;
                this.f3069a = view.getLeft();
                this.f3070b = view.getTop();
                this.f3071c = view.getRight();
                this.f3072d = view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        static int m4759e(C0958w wVar) {
            int d = wVar.f3170n & 14;
            if (wVar.mo4594n()) {
                return 4;
            }
            if ((d & 4) == 0) {
                int f = wVar.mo4586f();
                int e = wVar.mo4585e();
                if (!(f == -1 || e == -1 || f == e)) {
                    d |= 2048;
                }
            }
            return d;
        }

        /* renamed from: a */
        public C0934c mo4345a(C0955t tVar, C0958w wVar) {
            return mo4365j().mo4368a(wVar);
        }

        /* renamed from: a */
        public C0934c mo4346a(C0955t tVar, C0958w wVar, int i, List<Object> list) {
            return mo4365j().mo4368a(wVar);
        }

        /* renamed from: a */
        public abstract void mo4347a();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4348a(C0933b bVar) {
            this.f3063a = bVar;
        }

        /* renamed from: a */
        public abstract boolean mo4349a(C0958w wVar, C0934c cVar, C0934c cVar2);

        /* renamed from: a */
        public abstract boolean mo4350a(C0958w wVar, C0958w wVar2, C0934c cVar, C0934c cVar2);

        /* renamed from: a */
        public boolean mo4351a(C0958w wVar, List<Object> list) {
            return mo4363h(wVar);
        }

        /* renamed from: b */
        public abstract boolean mo4352b();

        /* renamed from: b */
        public abstract boolean mo4353b(C0958w wVar, C0934c cVar, C0934c cVar2);

        /* renamed from: c */
        public abstract boolean mo4354c(C0958w wVar, C0934c cVar, C0934c cVar2);

        /* renamed from: d */
        public abstract void mo4355d();

        /* renamed from: d */
        public abstract void mo4356d(C0958w wVar);

        /* renamed from: e */
        public long mo4357e() {
            return this.f3067e;
        }

        /* renamed from: f */
        public long mo4358f() {
            return this.f3065c;
        }

        /* renamed from: f */
        public final void mo4359f(C0958w wVar) {
            mo4361g(wVar);
            if (this.f3063a != null) {
                this.f3063a.mo4367a(wVar);
            }
        }

        /* renamed from: g */
        public long mo4360g() {
            return this.f3066d;
        }

        /* renamed from: g */
        public void mo4361g(C0958w wVar) {
        }

        /* renamed from: h */
        public long mo4362h() {
            return this.f3068f;
        }

        /* renamed from: h */
        public boolean mo4363h(C0958w wVar) {
            return true;
        }

        /* renamed from: i */
        public final void mo4364i() {
            int size = this.f3064b.size();
            for (int i = 0; i < size; i++) {
                ((C0932a) this.f3064b.get(i)).mo4366a();
            }
            this.f3064b.clear();
        }

        /* renamed from: j */
        public C0934c mo4365j() {
            return new C0934c();
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$g */
    private class C0935g implements C0933b {
        C0935g() {
        }

        /* renamed from: a */
        public void mo4367a(C0958w wVar) {
            wVar.mo4579a(true);
            if (wVar.f3164h != null && wVar.f3165i == null) {
                wVar.f3164h = null;
            }
            wVar.f3165i = null;
            if (!wVar.m5070z() && !RecyclerView.this.mo4154a(wVar.f3157a) && wVar.mo4598r()) {
                RecyclerView.this.removeDetachedView(wVar.f3157a, false);
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$h */
    public static abstract class C0936h {
        @Deprecated
        /* renamed from: a */
        public void mo4370a(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: a */
        public void mo4371a(Canvas canvas, RecyclerView recyclerView, C0955t tVar) {
            mo4374b(canvas, recyclerView);
        }

        @Deprecated
        /* renamed from: a */
        public void mo4372a(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: a */
        public void mo4373a(Rect rect, View view, RecyclerView recyclerView, C0955t tVar) {
            mo4372a(rect, ((C0942j) view.getLayoutParams()).mo4478f(), recyclerView);
        }

        @Deprecated
        /* renamed from: b */
        public void mo4374b(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: b */
        public void mo4375b(Canvas canvas, RecyclerView recyclerView, C0955t tVar) {
            mo4370a(canvas, recyclerView);
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$i */
    public static abstract class C0937i {

        /* renamed from: a */
        private final C1090b f3074a = new C1090b() {
            /* renamed from: a */
            public int mo4469a() {
                return C0937i.this.mo4377B();
            }

            /* renamed from: a */
            public int mo4470a(View view) {
                return C0937i.this.mo4445h(view) - ((C0942j) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: a */
            public View mo4471a(int i) {
                return C0937i.this.mo4448i(i);
            }

            /* renamed from: b */
            public int mo4472b() {
                return C0937i.this.mo4468z() - C0937i.this.mo4379D();
            }

            /* renamed from: b */
            public int mo4473b(View view) {
                return C0937i.this.mo4449j(view) + ((C0942j) view.getLayoutParams()).rightMargin;
            }
        };

        /* renamed from: b */
        private final C1090b f3075b = new C1090b() {
            /* renamed from: a */
            public int mo4469a() {
                return C0937i.this.mo4378C();
            }

            /* renamed from: a */
            public int mo4470a(View view) {
                return C0937i.this.mo4447i(view) - ((C0942j) view.getLayoutParams()).topMargin;
            }

            /* renamed from: a */
            public View mo4471a(int i) {
                return C0937i.this.mo4448i(i);
            }

            /* renamed from: b */
            public int mo4472b() {
                return C0937i.this.mo4376A() - C0937i.this.mo4380E();
            }

            /* renamed from: b */
            public int mo4473b(View view) {
                return C0937i.this.mo4451k(view) + ((C0942j) view.getLayoutParams()).bottomMargin;
            }
        };

        /* renamed from: c */
        private boolean f3076c = true;

        /* renamed from: d */
        private boolean f3077d = true;

        /* renamed from: e */
        private int f3078e;

        /* renamed from: f */
        private int f3079f;

        /* renamed from: g */
        private int f3080g;

        /* renamed from: h */
        private int f3081h;

        /* renamed from: p */
        C0995ac f3082p;

        /* renamed from: q */
        RecyclerView f3083q;

        /* renamed from: r */
        C1088bq f3084r = new C1088bq(this.f3074a);

        /* renamed from: s */
        C1088bq f3085s = new C1088bq(this.f3075b);

        /* renamed from: t */
        C0952s f3086t;

        /* renamed from: u */
        boolean f3087u = false;

        /* renamed from: v */
        boolean f3088v = false;

        /* renamed from: w */
        boolean f3089w = false;

        /* renamed from: x */
        int f3090x;

        /* renamed from: y */
        boolean f3091y;

        /* renamed from: android.support.v7.widget.RecyclerView$i$a */
        public interface C0940a {
            /* renamed from: b */
            void mo4474b(int i, int i2);
        }

        /* renamed from: android.support.v7.widget.RecyclerView$i$b */
        public static class C0941b {

            /* renamed from: a */
            public int f3094a;

            /* renamed from: b */
            public int f3095b;

            /* renamed from: c */
            public boolean f3096c;

            /* renamed from: d */
            public boolean f3097d;
        }

        /* renamed from: a */
        public static int m4792a(int i, int i2, int i3) {
            int mode = MeasureSpec.getMode(i);
            int size = MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE) {
                return Math.min(size, Math.max(i2, i3));
            }
            if (mode != 1073741824) {
                size = Math.max(i2, i3);
            }
            return size;
        }

        /* renamed from: a */
        public static int m4793a(int i, int i2, int i3, int i4, boolean z) {
            int i5;
            int i6 = i - i3;
            int i7 = 0;
            int max = Math.max(0, i6);
            if (z) {
                if (i4 < 0) {
                    if (i4 == -1) {
                        if (i2 == Integer.MIN_VALUE || (i2 != 0 && i2 == 1073741824)) {
                            i5 = max;
                        } else {
                            i2 = 0;
                            i5 = 0;
                        }
                        i7 = i2;
                        max = i5;
                        return MeasureSpec.makeMeasureSpec(max, i7);
                    }
                    max = 0;
                    return MeasureSpec.makeMeasureSpec(max, i7);
                }
            } else if (i4 < 0) {
                if (i4 == -1) {
                    i7 = i2;
                } else {
                    if (i4 == -2) {
                        if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                            i7 = Integer.MIN_VALUE;
                        }
                    }
                    max = 0;
                }
                return MeasureSpec.makeMeasureSpec(max, i7);
            }
            max = i4;
            i7 = 1073741824;
            return MeasureSpec.makeMeasureSpec(max, i7);
        }

        /* renamed from: a */
        public static C0941b m4794a(Context context, AttributeSet attributeSet, int i, int i2) {
            C0941b bVar = new C0941b();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0824b.RecyclerView, i, i2);
            bVar.f3094a = obtainStyledAttributes.getInt(C0824b.RecyclerView_android_orientation, 1);
            bVar.f3095b = obtainStyledAttributes.getInt(C0824b.RecyclerView_spanCount, 1);
            bVar.f3096c = obtainStyledAttributes.getBoolean(C0824b.RecyclerView_reverseLayout, false);
            bVar.f3097d = obtainStyledAttributes.getBoolean(C0824b.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return bVar;
        }

        /* renamed from: a */
        private void m4795a(int i, View view) {
            this.f3082p.mo4959e(i);
        }

        /* renamed from: a */
        private void m4797a(C0949p pVar, int i, View view) {
            C0958w e = RecyclerView.m4616e(view);
            if (!e.mo4583c()) {
                if (!e.mo4594n() || e.mo4597q() || this.f3083q.f3040l.mo4335d()) {
                    mo4446h(i);
                    pVar.mo4521c(view);
                    this.f3083q.f3035g.mo5409h(e);
                } else {
                    mo4443g(i);
                    pVar.mo4515b(e);
                }
            }
        }

        /* renamed from: a */
        private void m4798a(View view, int i, boolean z) {
            C0958w e = RecyclerView.m4616e(view);
            if (z || e.mo4597q()) {
                this.f3083q.f3035g.mo5406e(e);
            } else {
                this.f3083q.f3035g.mo5407f(e);
            }
            C0942j jVar = (C0942j) view.getLayoutParams();
            if (e.mo4591k() || e.mo4589i()) {
                if (e.mo4589i()) {
                    e.mo4590j();
                } else {
                    e.mo4592l();
                }
                this.f3082p.mo4948a(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f3083q) {
                int b = this.f3082p.mo4952b(view);
                if (i == -1) {
                    i = this.f3082p.mo4951b();
                }
                if (b == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.f3083q.indexOfChild(view));
                    sb.append(this.f3083q.mo4134a());
                    throw new IllegalStateException(sb.toString());
                } else if (b != i) {
                    this.f3083q.f3041m.mo4440f(b, i);
                }
            } else {
                this.f3082p.mo4949a(view, i, false);
                jVar.f3100e = true;
                if (this.f3086t != null && this.f3086t.mo4548h()) {
                    this.f3086t.mo4542b(view);
                }
            }
            if (jVar.f3101f) {
                e.f3157a.invalidate();
                jVar.f3101f = false;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m4799b(C0952s sVar) {
            if (this.f3086t == sVar) {
                this.f3086t = null;
            }
        }

        /* renamed from: b */
        private static boolean m4800b(int i, int i2, int i3) {
            int mode = MeasureSpec.getMode(i2);
            int size = MeasureSpec.getSize(i2);
            boolean z = false;
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                if (size >= i) {
                    z = true;
                }
                return z;
            } else if (mode == 0) {
                return true;
            } else {
                if (mode != 1073741824) {
                    return false;
                }
                if (size == i) {
                    z = true;
                }
                return z;
            }
        }

        /* renamed from: b */
        private int[] m4801b(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            int[] iArr = new int[2];
            int B = mo4377B();
            int C = mo4378C();
            int z2 = mo4468z() - mo4379D();
            int A = mo4376A() - mo4380E();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - B;
            int min = Math.min(0, i);
            int i2 = top - C;
            int min2 = Math.min(0, i2);
            int i3 = width - z2;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - A);
            if (mo4463u() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: d */
        private boolean m4802d(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int B = mo4377B();
            int C = mo4378C();
            int z = mo4468z() - mo4379D();
            int A = mo4376A() - mo4380E();
            Rect rect = this.f3083q.f3038j;
            mo4401a(focusedChild, rect);
            return rect.left - i < z && rect.right - i > B && rect.top - i2 < A && rect.bottom - i2 > C;
        }

        /* renamed from: A */
        public int mo4376A() {
            return this.f3081h;
        }

        /* renamed from: B */
        public int mo4377B() {
            if (this.f3083q != null) {
                return this.f3083q.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: C */
        public int mo4378C() {
            if (this.f3083q != null) {
                return this.f3083q.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: D */
        public int mo4379D() {
            if (this.f3083q != null) {
                return this.f3083q.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: E */
        public int mo4380E() {
            if (this.f3083q != null) {
                return this.f3083q.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: F */
        public View mo4381F() {
            if (this.f3083q == null) {
                return null;
            }
            View focusedChild = this.f3083q.getFocusedChild();
            if (focusedChild == null || this.f3082p.mo4956c(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: G */
        public int mo4382G() {
            C0926a adapter = this.f3083q != null ? this.f3083q.getAdapter() : null;
            if (adapter != null) {
                return adapter.mo342a();
            }
            return 0;
        }

        /* renamed from: H */
        public int mo4383H() {
            return C0626s.m2866i(this.f3083q);
        }

        /* renamed from: I */
        public int mo4384I() {
            return C0626s.m2867j(this.f3083q);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: J */
        public void mo4385J() {
            if (this.f3086t != null) {
                this.f3086t.mo4546f();
            }
        }

        /* renamed from: K */
        public void mo4386K() {
            this.f3087u = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: L */
        public boolean mo4387L() {
            int w = mo4465w();
            for (int i = 0; i < w; i++) {
                LayoutParams layoutParams = mo4448i(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public int mo4041a(int i, C0949p pVar, C0955t tVar) {
            return 0;
        }

        /* renamed from: a */
        public int mo4042a(C0949p pVar, C0955t tVar) {
            if (this.f3083q == null || this.f3083q.f3040l == null || !mo4099f()) {
                return 1;
            }
            return this.f3083q.f3040l.mo342a();
        }

        /* renamed from: a */
        public abstract C0942j mo4043a();

        /* renamed from: a */
        public C0942j mo4044a(Context context, AttributeSet attributeSet) {
            return new C0942j(context, attributeSet);
        }

        /* renamed from: a */
        public C0942j mo4045a(LayoutParams layoutParams) {
            return layoutParams instanceof C0942j ? new C0942j((C0942j) layoutParams) : layoutParams instanceof MarginLayoutParams ? new C0942j((MarginLayoutParams) layoutParams) : new C0942j(layoutParams);
        }

        /* renamed from: a */
        public View mo4047a(View view, int i, C0949p pVar, C0955t tVar) {
            return null;
        }

        /* renamed from: a */
        public void mo4076a(int i, int i2, C0955t tVar, C0940a aVar) {
        }

        /* renamed from: a */
        public void mo4077a(int i, C0940a aVar) {
        }

        /* renamed from: a */
        public void mo4388a(int i, C0949p pVar) {
            View i2 = mo4448i(i);
            mo4443g(i);
            pVar.mo4509a(i2);
        }

        /* renamed from: a */
        public void mo4049a(Rect rect, int i, int i2) {
            mo4444g(m4792a(i, rect.width() + mo4377B() + mo4379D(), mo4383H()), m4792a(i2, rect.height() + mo4378C() + mo4380E(), mo4384I()));
        }

        /* renamed from: a */
        public void mo4078a(Parcelable parcelable) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4389a(C0583b bVar) {
            mo4393a(this.f3083q.f3032d, this.f3083q.f2984C, bVar);
        }

        /* renamed from: a */
        public void mo4390a(C0926a aVar, C0926a aVar2) {
        }

        /* renamed from: a */
        public void mo4391a(C0949p pVar) {
            for (int w = mo4465w() - 1; w >= 0; w--) {
                m4797a(pVar, w, mo4448i(w));
            }
        }

        /* renamed from: a */
        public void mo4392a(C0949p pVar, C0955t tVar, int i, int i2) {
            this.f3083q.mo4194e(i, i2);
        }

        /* renamed from: a */
        public void mo4393a(C0949p pVar, C0955t tVar, C0583b bVar) {
            if (this.f3083q.canScrollVertically(-1) || this.f3083q.canScrollHorizontally(-1)) {
                bVar.mo2351a(8192);
                bVar.mo2389k(true);
            }
            if (this.f3083q.canScrollVertically(1) || this.f3083q.canScrollHorizontally(1)) {
                bVar.mo2351a(4096);
                bVar.mo2389k(true);
            }
            bVar.mo2355a((Object) C0585b.m2696a(mo4042a(pVar, tVar), mo4062b(pVar, tVar), mo4438e(pVar, tVar), mo4430d(pVar, tVar)));
        }

        /* renamed from: a */
        public void mo4052a(C0949p pVar, C0955t tVar, View view, C0583b bVar) {
            bVar.mo2362b((Object) C0586c.m2697a(mo4099f() ? mo4431d(view) : 0, 1, mo4096e() ? mo4431d(view) : 0, 1, false, false));
        }

        /* renamed from: a */
        public void mo4394a(C0949p pVar, C0955t tVar, AccessibilityEvent accessibilityEvent) {
            if (this.f3083q != null && accessibilityEvent != null) {
                boolean z = true;
                if (!this.f3083q.canScrollVertically(1) && !this.f3083q.canScrollVertically(-1) && !this.f3083q.canScrollHorizontally(-1) && !this.f3083q.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                if (this.f3083q.f3040l != null) {
                    accessibilityEvent.setItemCount(this.f3083q.f3040l.mo342a());
                }
            }
        }

        /* renamed from: a */
        public void mo4395a(C0952s sVar) {
            if (!(this.f3086t == null || sVar == this.f3086t || !this.f3086t.mo4548h())) {
                this.f3086t.mo4546f();
            }
            this.f3086t = sVar;
            this.f3086t.mo4539a(this.f3083q, this);
        }

        /* renamed from: a */
        public void mo4053a(C0955t tVar) {
        }

        /* renamed from: a */
        public void mo4055a(RecyclerView recyclerView) {
        }

        /* renamed from: a */
        public void mo4056a(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: a */
        public void mo4057a(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: a */
        public void mo4058a(RecyclerView recyclerView, int i, int i2, Object obj) {
            mo4426c(recyclerView, i, i2);
        }

        /* renamed from: a */
        public void mo4079a(RecyclerView recyclerView, C0949p pVar) {
            mo4437e(recyclerView);
        }

        /* renamed from: a */
        public void mo4396a(View view) {
            mo4397a(view, -1);
        }

        /* renamed from: a */
        public void mo4397a(View view, int i) {
            m4798a(view, i, true);
        }

        /* renamed from: a */
        public void mo4398a(View view, int i, int i2) {
            C0942j jVar = (C0942j) view.getLayoutParams();
            Rect i3 = this.f3083q.mo4228i(view);
            int i4 = i2 + i3.top + i3.bottom;
            int a = m4793a(mo4468z(), mo4466x(), mo4377B() + mo4379D() + jVar.leftMargin + jVar.rightMargin + i + i3.left + i3.right, jVar.width, mo4096e());
            int a2 = m4793a(mo4376A(), mo4467y(), mo4378C() + mo4380E() + jVar.topMargin + jVar.bottomMargin + i4, jVar.height, mo4099f());
            if (mo4423b(view, a, a2, jVar)) {
                view.measure(a, a2);
            }
        }

        /* renamed from: a */
        public void mo4399a(View view, int i, int i2, int i3, int i4) {
            C0942j jVar = (C0942j) view.getLayoutParams();
            Rect rect = jVar.f3099d;
            view.layout(i + rect.left + jVar.leftMargin, i2 + rect.top + jVar.topMargin, (i3 - rect.right) - jVar.rightMargin, (i4 - rect.bottom) - jVar.bottomMargin);
        }

        /* renamed from: a */
        public void mo4400a(View view, int i, C0942j jVar) {
            C0958w e = RecyclerView.m4616e(view);
            if (e.mo4597q()) {
                this.f3083q.f3035g.mo5406e(e);
            } else {
                this.f3083q.f3035g.mo5407f(e);
            }
            this.f3082p.mo4948a(view, i, jVar, e.mo4597q());
        }

        /* renamed from: a */
        public void mo4401a(View view, Rect rect) {
            RecyclerView.m4606a(view, rect);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4402a(View view, C0583b bVar) {
            C0958w e = RecyclerView.m4616e(view);
            if (e != null && !e.mo4597q() && !this.f3082p.mo4956c(e.f3157a)) {
                mo4052a(this.f3083q.f3032d, this.f3083q.f2984C, view, bVar);
            }
        }

        /* renamed from: a */
        public void mo4403a(View view, C0949p pVar) {
            mo4427c(view);
            pVar.mo4509a(view);
        }

        /* renamed from: a */
        public void mo4404a(View view, boolean z, Rect rect) {
            if (z) {
                Rect rect2 = ((C0942j) view.getLayoutParams()).f3099d;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f3083q != null) {
                Matrix matrix = view.getMatrix();
                if (matrix != null && !matrix.isIdentity()) {
                    RectF rectF = this.f3083q.f3039k;
                    rectF.set(rect);
                    matrix.mapRect(rectF);
                    rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
                }
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: a */
        public void mo4080a(AccessibilityEvent accessibilityEvent) {
            mo4394a(this.f3083q.f3032d, this.f3083q.f2984C, accessibilityEvent);
        }

        /* renamed from: a */
        public void mo4081a(String str) {
            if (this.f3083q != null) {
                this.f3083q.mo4148a(str);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4405a(int i, Bundle bundle) {
            return mo4406a(this.f3083q.f3032d, this.f3083q.f2984C, i, bundle);
        }

        /* renamed from: a */
        public boolean mo4060a(C0942j jVar) {
            return jVar != null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0074 A[ADDED_TO_REGION] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo4406a(android.support.p023v7.widget.RecyclerView.C0949p r2, android.support.p023v7.widget.RecyclerView.C0955t r3, int r4, android.os.Bundle r5) {
            /*
                r1 = this;
                android.support.v7.widget.RecyclerView r2 = r1.f3083q
                r3 = 0
                if (r2 != 0) goto L_0x0006
                return r3
            L_0x0006:
                r2 = 4096(0x1000, float:5.74E-42)
                r5 = 1
                if (r4 == r2) goto L_0x0044
                r2 = 8192(0x2000, float:1.14794E-41)
                if (r4 == r2) goto L_0x0012
                r2 = 0
            L_0x0010:
                r4 = 0
                goto L_0x0072
            L_0x0012:
                android.support.v7.widget.RecyclerView r2 = r1.f3083q
                r4 = -1
                boolean r2 = r2.canScrollVertically(r4)
                if (r2 == 0) goto L_0x002b
                int r2 = r1.mo4376A()
                int r0 = r1.mo4378C()
                int r2 = r2 - r0
                int r0 = r1.mo4380E()
                int r2 = r2 - r0
                int r2 = -r2
                goto L_0x002c
            L_0x002b:
                r2 = 0
            L_0x002c:
                android.support.v7.widget.RecyclerView r0 = r1.f3083q
                boolean r4 = r0.canScrollHorizontally(r4)
                if (r4 == 0) goto L_0x0010
                int r4 = r1.mo4468z()
                int r0 = r1.mo4377B()
                int r4 = r4 - r0
                int r0 = r1.mo4379D()
                int r4 = r4 - r0
                int r4 = -r4
                goto L_0x0072
            L_0x0044:
                android.support.v7.widget.RecyclerView r2 = r1.f3083q
                boolean r2 = r2.canScrollVertically(r5)
                if (r2 == 0) goto L_0x005b
                int r2 = r1.mo4376A()
                int r4 = r1.mo4378C()
                int r2 = r2 - r4
                int r4 = r1.mo4380E()
                int r2 = r2 - r4
                goto L_0x005c
            L_0x005b:
                r2 = 0
            L_0x005c:
                android.support.v7.widget.RecyclerView r4 = r1.f3083q
                boolean r4 = r4.canScrollHorizontally(r5)
                if (r4 == 0) goto L_0x0010
                int r4 = r1.mo4468z()
                int r0 = r1.mo4377B()
                int r4 = r4 - r0
                int r0 = r1.mo4379D()
                int r4 = r4 - r0
            L_0x0072:
                if (r2 != 0) goto L_0x0077
                if (r4 != 0) goto L_0x0077
                return r3
            L_0x0077:
                android.support.v7.widget.RecyclerView r3 = r1.f3083q
                r3.scrollBy(r4, r2)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.RecyclerView.C0937i.mo4406a(android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$t, int, android.os.Bundle):boolean");
        }

        /* renamed from: a */
        public boolean mo4407a(C0949p pVar, C0955t tVar, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: a */
        public boolean mo4408a(RecyclerView recyclerView, C0955t tVar, View view, View view2) {
            return mo4411a(recyclerView, view, view2);
        }

        /* renamed from: a */
        public boolean mo4409a(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return mo4410a(recyclerView, view, rect, z, false);
        }

        /* renamed from: a */
        public boolean mo4410a(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] b = m4801b(recyclerView, view, rect, z);
            int i = b[0];
            int i2 = b[1];
            if ((z2 && !m4802d(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.mo4136a(i, i2);
            }
            return true;
        }

        @Deprecated
        /* renamed from: a */
        public boolean mo4411a(RecyclerView recyclerView, View view, View view2) {
            return mo4462t() || recyclerView.mo4240o();
        }

        /* renamed from: a */
        public boolean mo4412a(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4413a(View view, int i, int i2, C0942j jVar) {
            return !this.f3076c || !m4800b(view.getMeasuredWidth(), i, jVar.width) || !m4800b(view.getMeasuredHeight(), i2, jVar.height);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4414a(View view, int i, Bundle bundle) {
            return mo4407a(this.f3083q.f3032d, this.f3083q.f2984C, view, i, bundle);
        }

        /* renamed from: a */
        public boolean mo4415a(View view, boolean z, boolean z2) {
            boolean z3 = this.f3084r.mo5388a(view, 24579) && this.f3085s.mo5388a(view, 24579);
            return z ? z3 : !z3;
        }

        /* renamed from: a */
        public boolean mo4416a(Runnable runnable) {
            if (this.f3083q != null) {
                return this.f3083q.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: b */
        public int mo4061b(int i, C0949p pVar, C0955t tVar) {
            return 0;
        }

        /* renamed from: b */
        public int mo4062b(C0949p pVar, C0955t tVar) {
            if (this.f3083q == null || this.f3083q.f3040l == null || !mo4096e()) {
                return 1;
            }
            return this.f3083q.f3040l.mo342a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4417b(C0949p pVar) {
            int e = pVar.mo4525e();
            for (int i = e - 1; i >= 0; i--) {
                View e2 = pVar.mo4526e(i);
                C0958w e3 = RecyclerView.m4616e(e2);
                if (!e3.mo4583c()) {
                    e3.mo4579a(false);
                    if (e3.mo4598r()) {
                        this.f3083q.removeDetachedView(e2, false);
                    }
                    if (this.f3083q.f3053y != null) {
                        this.f3083q.f3053y.mo4356d(e3);
                    }
                    e3.mo4579a(true);
                    pVar.mo4516b(e2);
                }
            }
            pVar.mo4528f();
            if (e > 0) {
                this.f3083q.invalidate();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4418b(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.f3083q = null;
                this.f3082p = null;
                height = 0;
                this.f3080g = 0;
            } else {
                this.f3083q = recyclerView;
                this.f3082p = recyclerView.f3034f;
                this.f3080g = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.f3081h = height;
            this.f3078e = 1073741824;
            this.f3079f = 1073741824;
        }

        /* renamed from: b */
        public void mo4063b(RecyclerView recyclerView, int i, int i2) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4419b(RecyclerView recyclerView, C0949p pVar) {
            this.f3088v = false;
            mo4079a(recyclerView, pVar);
        }

        /* renamed from: b */
        public void mo4420b(View view) {
            mo4421b(view, -1);
        }

        /* renamed from: b */
        public void mo4421b(View view, int i) {
            m4798a(view, i, false);
        }

        /* renamed from: b */
        public void mo4422b(View view, Rect rect) {
            if (this.f3083q == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(this.f3083q.mo4228i(view));
            }
        }

        /* renamed from: b */
        public boolean mo4064b() {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo4423b(View view, int i, int i2, C0942j jVar) {
            return view.isLayoutRequested() || !this.f3076c || !m4800b(view.getWidth(), i, jVar.width) || !m4800b(view.getHeight(), i2, jVar.height);
        }

        /* renamed from: c */
        public int mo4087c(C0955t tVar) {
            return 0;
        }

        /* renamed from: c */
        public View mo4088c(int i) {
            int w = mo4465w();
            for (int i2 = 0; i2 < w; i2++) {
                View i3 = mo4448i(i2);
                C0958w e = RecyclerView.m4616e(i3);
                if (e != null && e.mo4584d() == i && !e.mo4583c() && (this.f3083q.f2984C.mo4557a() || !e.mo4597q())) {
                    return i3;
                }
            }
            return null;
        }

        /* renamed from: c */
        public void mo4424c(C0949p pVar) {
            for (int w = mo4465w() - 1; w >= 0; w--) {
                if (!RecyclerView.m4616e(mo4448i(w)).mo4583c()) {
                    mo4388a(w, pVar);
                }
            }
        }

        /* renamed from: c */
        public void mo4065c(C0949p pVar, C0955t tVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo4425c(RecyclerView recyclerView) {
            this.f3088v = true;
            mo4434d(recyclerView);
        }

        /* renamed from: c */
        public void mo4426c(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: c */
        public void mo4427c(View view) {
            this.f3082p.mo4947a(view);
        }

        /* renamed from: c */
        public void mo4428c(View view, int i) {
            mo4400a(view, i, (C0942j) view.getLayoutParams());
        }

        @Deprecated
        /* renamed from: c */
        public void mo4429c(boolean z) {
            this.f3089w = z;
        }

        /* renamed from: c */
        public boolean mo4090c() {
            return this.f3089w;
        }

        /* renamed from: d */
        public int mo4430d(C0949p pVar, C0955t tVar) {
            return 0;
        }

        /* renamed from: d */
        public int mo4091d(C0955t tVar) {
            return 0;
        }

        /* renamed from: d */
        public int mo4431d(View view) {
            return ((C0942j) view.getLayoutParams()).mo4478f();
        }

        /* renamed from: d */
        public Parcelable mo4093d() {
            return null;
        }

        /* renamed from: d */
        public View mo4432d(View view, int i) {
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo4433d(int i, int i2) {
            this.f3080g = MeasureSpec.getSize(i);
            this.f3078e = MeasureSpec.getMode(i);
            if (this.f3078e == 0 && !RecyclerView.f2980b) {
                this.f3080g = 0;
            }
            this.f3081h = MeasureSpec.getSize(i2);
            this.f3079f = MeasureSpec.getMode(i2);
            if (this.f3079f == 0 && !RecyclerView.f2980b) {
                this.f3081h = 0;
            }
        }

        /* renamed from: d */
        public void mo4434d(RecyclerView recyclerView) {
        }

        /* renamed from: e */
        public int mo4094e(C0955t tVar) {
            return 0;
        }

        /* renamed from: e */
        public View mo4435e(View view) {
            if (this.f3083q == null) {
                return null;
            }
            View c = this.f3083q.mo4167c(view);
            if (c != null && !this.f3082p.mo4956c(c)) {
                return c;
            }
            return null;
        }

        /* renamed from: e */
        public void mo4095e(int i) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo4436e(int i, int i2) {
            int w = mo4465w();
            if (w == 0) {
                this.f3083q.mo4194e(i, i2);
                return;
            }
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < w; i7++) {
                View i8 = mo4448i(i7);
                Rect rect = this.f3083q.f3038j;
                mo4401a(i8, rect);
                if (rect.left < i3) {
                    i3 = rect.left;
                }
                if (rect.right > i5) {
                    i5 = rect.right;
                }
                if (rect.top < i4) {
                    i4 = rect.top;
                }
                if (rect.bottom > i6) {
                    i6 = rect.bottom;
                }
            }
            this.f3083q.f3038j.set(i3, i4, i5, i6);
            mo4049a(this.f3083q.f3038j, i, i2);
        }

        @Deprecated
        /* renamed from: e */
        public void mo4437e(RecyclerView recyclerView) {
        }

        /* renamed from: e */
        public boolean mo4096e() {
            return false;
        }

        /* renamed from: e */
        public boolean mo4438e(C0949p pVar, C0955t tVar) {
            return false;
        }

        /* renamed from: f */
        public int mo4098f(C0955t tVar) {
            return 0;
        }

        /* renamed from: f */
        public int mo4439f(View view) {
            Rect rect = ((C0942j) view.getLayoutParams()).f3099d;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: f */
        public void mo4440f(int i, int i2) {
            View i3 = mo4448i(i);
            if (i3 != null) {
                mo4446h(i);
                mo4428c(i3, i2);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot move a child from non-existing index:");
            sb.append(i);
            sb.append(this.f3083q.toString());
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo4441f(RecyclerView recyclerView) {
            mo4433d(MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: f */
        public boolean mo4099f() {
            return false;
        }

        /* renamed from: g */
        public int mo4101g(C0955t tVar) {
            return 0;
        }

        /* renamed from: g */
        public int mo4442g(View view) {
            Rect rect = ((C0942j) view.getLayoutParams()).f3099d;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: g */
        public void mo4443g(int i) {
            if (mo4448i(i) != null) {
                this.f3082p.mo4946a(i);
            }
        }

        /* renamed from: g */
        public void mo4444g(int i, int i2) {
            this.f3083q.setMeasuredDimension(i, i2);
        }

        /* renamed from: h */
        public int mo4102h(C0955t tVar) {
            return 0;
        }

        /* renamed from: h */
        public int mo4445h(View view) {
            return view.getLeft() - mo4456n(view);
        }

        /* renamed from: h */
        public void mo4446h(int i) {
            m4795a(i, mo4448i(i));
        }

        /* renamed from: i */
        public int mo4447i(View view) {
            return view.getTop() - mo4453l(view);
        }

        /* renamed from: i */
        public View mo4448i(int i) {
            if (this.f3082p != null) {
                return this.f3082p.mo4953b(i);
            }
            return null;
        }

        /* renamed from: j */
        public int mo4449j(View view) {
            return view.getRight() + mo4457o(view);
        }

        /* renamed from: j */
        public void mo4450j(int i) {
            if (this.f3083q != null) {
                this.f3083q.mo4182d(i);
            }
        }

        /* renamed from: k */
        public int mo4451k(View view) {
            return view.getBottom() + mo4455m(view);
        }

        /* renamed from: k */
        public void mo4452k(int i) {
            if (this.f3083q != null) {
                this.f3083q.mo4169c(i);
            }
        }

        /* renamed from: l */
        public int mo4453l(View view) {
            return ((C0942j) view.getLayoutParams()).f3099d.top;
        }

        /* renamed from: l */
        public void mo4454l(int i) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public boolean mo4107l() {
            return false;
        }

        /* renamed from: m */
        public int mo4455m(View view) {
            return ((C0942j) view.getLayoutParams()).f3099d.bottom;
        }

        /* renamed from: n */
        public int mo4456n(View view) {
            return ((C0942j) view.getLayoutParams()).f3099d.left;
        }

        /* renamed from: o */
        public int mo4457o(View view) {
            return ((C0942j) view.getLayoutParams()).f3099d.right;
        }

        /* renamed from: p */
        public void mo4458p() {
            if (this.f3083q != null) {
                this.f3083q.requestLayout();
            }
        }

        /* renamed from: q */
        public final boolean mo4459q() {
            return this.f3077d;
        }

        /* renamed from: r */
        public boolean mo4460r() {
            return this.f3088v;
        }

        /* renamed from: s */
        public boolean mo4461s() {
            return this.f3083q != null && this.f3083q.f3036h;
        }

        /* renamed from: t */
        public boolean mo4462t() {
            return this.f3086t != null && this.f3086t.mo4548h();
        }

        /* renamed from: u */
        public int mo4463u() {
            return C0626s.m2861e(this.f3083q);
        }

        /* renamed from: v */
        public int mo4464v() {
            return -1;
        }

        /* renamed from: w */
        public int mo4465w() {
            if (this.f3082p != null) {
                return this.f3082p.mo4951b();
            }
            return 0;
        }

        /* renamed from: x */
        public int mo4466x() {
            return this.f3078e;
        }

        /* renamed from: y */
        public int mo4467y() {
            return this.f3079f;
        }

        /* renamed from: z */
        public int mo4468z() {
            return this.f3080g;
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$j */
    public static class C0942j extends MarginLayoutParams {

        /* renamed from: c */
        C0958w f3098c;

        /* renamed from: d */
        final Rect f3099d = new Rect();

        /* renamed from: e */
        boolean f3100e = true;

        /* renamed from: f */
        boolean f3101f = false;

        public C0942j(int i, int i2) {
            super(i, i2);
        }

        public C0942j(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0942j(C0942j jVar) {
            super(jVar);
        }

        public C0942j(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0942j(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: c */
        public boolean mo4475c() {
            return this.f3098c.mo4594n();
        }

        /* renamed from: d */
        public boolean mo4476d() {
            return this.f3098c.mo4597q();
        }

        /* renamed from: e */
        public boolean mo4477e() {
            return this.f3098c.mo4605x();
        }

        /* renamed from: f */
        public int mo4478f() {
            return this.f3098c.mo4584d();
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$k */
    public interface C0943k {
        /* renamed from: a */
        void mo4479a(View view);

        /* renamed from: b */
        void mo4480b(View view);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$l */
    public static abstract class C0944l {
        /* renamed from: a */
        public abstract boolean mo4481a(int i, int i2);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$m */
    public interface C0945m {
        /* renamed from: a */
        void mo4482a(boolean z);

        /* renamed from: a */
        boolean mo4483a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: b */
        void mo4484b(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$n */
    public static abstract class C0946n {
        /* renamed from: a */
        public void mo4485a(RecyclerView recyclerView, int i) {
        }

        /* renamed from: a */
        public void mo4486a(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$o */
    public static class C0947o {

        /* renamed from: a */
        SparseArray<C0948a> f3102a = new SparseArray<>();

        /* renamed from: b */
        private int f3103b = 0;

        /* renamed from: android.support.v7.widget.RecyclerView$o$a */
        static class C0948a {

            /* renamed from: a */
            final ArrayList<C0958w> f3104a = new ArrayList<>();

            /* renamed from: b */
            int f3105b = 5;

            /* renamed from: c */
            long f3106c = 0;

            /* renamed from: d */
            long f3107d = 0;

            C0948a() {
            }
        }

        /* renamed from: b */
        private C0948a m4957b(int i) {
            C0948a aVar = (C0948a) this.f3102a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C0948a aVar2 = new C0948a();
            this.f3102a.put(i, aVar2);
            return aVar2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public long mo4487a(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* renamed from: a */
        public C0958w mo4488a(int i) {
            C0948a aVar = (C0948a) this.f3102a.get(i);
            if (aVar == null || aVar.f3104a.isEmpty()) {
                return null;
            }
            ArrayList<C0958w> arrayList = aVar.f3104a;
            return (C0958w) arrayList.remove(arrayList.size() - 1);
        }

        /* renamed from: a */
        public void mo4489a() {
            for (int i = 0; i < this.f3102a.size(); i++) {
                ((C0948a) this.f3102a.valueAt(i)).f3104a.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4490a(int i, long j) {
            C0948a b = m4957b(i);
            b.f3106c = mo4487a(b.f3106c, j);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4491a(C0926a aVar) {
            this.f3103b++;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4492a(C0926a aVar, C0926a aVar2, boolean z) {
            if (aVar != null) {
                mo4495b();
            }
            if (!z && this.f3103b == 0) {
                mo4489a();
            }
            if (aVar2 != null) {
                mo4491a(aVar2);
            }
        }

        /* renamed from: a */
        public void mo4493a(C0958w wVar) {
            int h = wVar.mo4588h();
            ArrayList<C0958w> arrayList = m4957b(h).f3104a;
            if (((C0948a) this.f3102a.get(h)).f3105b > arrayList.size()) {
                wVar.mo4603v();
                arrayList.add(wVar);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4494a(int i, long j, long j2) {
            long j3 = m4957b(i).f3106c;
            return j3 == 0 || j + j3 < j2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4495b() {
            this.f3103b--;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4496b(int i, long j) {
            C0948a b = m4957b(i);
            b.f3107d = mo4487a(b.f3107d, j);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo4497b(int i, long j, long j2) {
            long j3 = m4957b(i).f3107d;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$p */
    public final class C0949p {

        /* renamed from: a */
        final ArrayList<C0958w> f3108a = new ArrayList<>();

        /* renamed from: b */
        ArrayList<C0958w> f3109b = null;

        /* renamed from: c */
        final ArrayList<C0958w> f3110c = new ArrayList<>();

        /* renamed from: d */
        int f3111d = 2;

        /* renamed from: e */
        C0947o f3112e;

        /* renamed from: g */
        private final List<C0958w> f3114g = Collections.unmodifiableList(this.f3108a);

        /* renamed from: h */
        private int f3115h = 2;

        /* renamed from: i */
        private C0956u f3116i;

        public C0949p() {
        }

        /* renamed from: a */
        private void m4969a(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m4969a((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        /* renamed from: a */
        private boolean m4970a(C0958w wVar, int i, int i2, long j) {
            wVar.f3169m = RecyclerView.this;
            int h = wVar.mo4588h();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.f3112e.mo4497b(h, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.f3040l.mo4328b(wVar, i);
            this.f3112e.mo4496b(wVar.mo4588h(), RecyclerView.this.getNanoTime() - nanoTime);
            m4971e(wVar);
            if (RecyclerView.this.f2984C.mo4557a()) {
                wVar.f3163g = i2;
            }
            return true;
        }

        /* renamed from: e */
        private void m4971e(C0958w wVar) {
            if (RecyclerView.this.mo4239n()) {
                View view = wVar.f3157a;
                if (C0626s.m2859d(view) == 0) {
                    C0626s.m2854b(view, 1);
                }
                if (!C0626s.m2851a(view)) {
                    wVar.mo4582b(16384);
                    C0626s.m2844a(view, RecyclerView.this.f2988G.mo5200c());
                }
            }
        }

        /* renamed from: f */
        private void m4972f(C0958w wVar) {
            if (wVar.f3157a instanceof ViewGroup) {
                m4969a((ViewGroup) wVar.f3157a, false);
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x01ac  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x01d1  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x020a  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x0218  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.support.p023v7.widget.RecyclerView.C0958w mo4498a(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x0234
                android.support.v7.widget.RecyclerView r1 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$t r1 = r1.f2984C
                int r1 = r1.mo4561e()
                if (r3 >= r1) goto L_0x0234
                android.support.v7.widget.RecyclerView r1 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$t r1 = r1.f2984C
                boolean r1 = r1.mo4557a()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                android.support.v7.widget.RecyclerView$w r1 = r16.mo4527f(r17)
                if (r1 == 0) goto L_0x0028
                r4 = 1
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                android.support.v7.widget.RecyclerView$w r1 = r16.mo4512b(r17, r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.mo4510a(r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.mo4582b(r5)
                boolean r5 = r1.mo4589i()
                if (r5 == 0) goto L_0x004e
                android.support.v7.widget.RecyclerView r5 = android.support.p023v7.widget.RecyclerView.this
                android.view.View r9 = r1.f3157a
                r5.removeDetachedView(r9, r8)
                r1.mo4590j()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.mo4591k()
                if (r5 == 0) goto L_0x0057
                r1.mo4592l()
            L_0x0057:
                r6.mo4515b(r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = 1
            L_0x005d:
                if (r1 != 0) goto L_0x018b
                android.support.v7.widget.RecyclerView r5 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.e r5 = r5.f3033e
                int r5 = r5.mo5435b(r3)
                if (r5 < 0) goto L_0x014e
                android.support.v7.widget.RecyclerView r9 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r9 = r9.f3040l
                int r9 = r9.mo342a()
                if (r5 >= r9) goto L_0x014e
                android.support.v7.widget.RecyclerView r9 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r9 = r9.f3040l
                int r9 = r9.mo352b(r5)
                android.support.v7.widget.RecyclerView r10 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r10 = r10.f3040l
                boolean r10 = r10.mo4335d()
                if (r10 == 0) goto L_0x0096
                android.support.v7.widget.RecyclerView r1 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r1 = r1.f3040l
                long r10 = r1.mo343a(r5)
                android.support.v7.widget.RecyclerView$w r1 = r6.mo4499a(r10, r9, r0)
                if (r1 == 0) goto L_0x0096
                r1.f3159c = r5
                r4 = 1
            L_0x0096:
                if (r1 != 0) goto L_0x00ed
                android.support.v7.widget.RecyclerView$u r0 = r6.f3116i
                if (r0 == 0) goto L_0x00ed
                android.support.v7.widget.RecyclerView$u r0 = r6.f3116i
                android.view.View r0 = r0.mo4563a(r6, r3, r9)
                if (r0 == 0) goto L_0x00ed
                android.support.v7.widget.RecyclerView r1 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$w r1 = r1.mo4158b(r0)
                if (r1 == 0) goto L_0x00d0
                boolean r0 = r1.mo4583c()
                if (r0 != 0) goto L_0x00b3
                goto L_0x00ed
            L_0x00b3:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."
                r1.append(r2)
                android.support.v7.widget.RecyclerView r2 = android.support.p023v7.widget.RecyclerView.this
                java.lang.String r2 = r2.mo4134a()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00d0:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view which does not have a ViewHolder"
                r1.append(r2)
                android.support.v7.widget.RecyclerView r2 = android.support.p023v7.widget.RecyclerView.this
                java.lang.String r2 = r2.mo4134a()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00ed:
                if (r1 != 0) goto L_0x0103
                android.support.v7.widget.RecyclerView$o r0 = r16.mo4529g()
                android.support.v7.widget.RecyclerView$w r1 = r0.mo4488a(r9)
                if (r1 == 0) goto L_0x0103
                r1.mo4603v()
                boolean r0 = android.support.p023v7.widget.RecyclerView.f2979a
                if (r0 == 0) goto L_0x0103
                r6.m4972f(r1)
            L_0x0103:
                if (r1 != 0) goto L_0x018b
                android.support.v7.widget.RecyclerView r0 = android.support.p023v7.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x0121
                android.support.v7.widget.RecyclerView$o r10 = r6.f3112e
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.mo4494a(r11, r12, r14)
                if (r5 != 0) goto L_0x0121
                return r2
            L_0x0121:
                android.support.v7.widget.RecyclerView r2 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r2 = r2.f3040l
                android.support.v7.widget.RecyclerView r5 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$w r2 = r2.mo4331c(r5, r9)
                boolean r5 = android.support.p023v7.widget.RecyclerView.f2975L
                if (r5 == 0) goto L_0x0140
                android.view.View r5 = r2.f3157a
                android.support.v7.widget.RecyclerView r5 = android.support.p023v7.widget.RecyclerView.m4618j(r5)
                if (r5 == 0) goto L_0x0140
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.f3158b = r10
            L_0x0140:
                android.support.v7.widget.RecyclerView r5 = android.support.p023v7.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                android.support.v7.widget.RecyclerView$o r5 = r6.f3112e
                long r10 = r10 - r0
                r5.mo4490a(r9, r10)
                r10 = r2
                goto L_0x018c
            L_0x014e:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ")."
                r1.append(r2)
                java.lang.String r2 = "state:"
                r1.append(r2)
                android.support.v7.widget.RecyclerView r2 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$t r2 = r2.f2984C
                int r2 = r2.mo4561e()
                r1.append(r2)
                android.support.v7.widget.RecyclerView r2 = android.support.p023v7.widget.RecyclerView.this
                java.lang.String r2 = r2.mo4134a()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x018b:
                r10 = r1
            L_0x018c:
                r9 = r4
                if (r9 == 0) goto L_0x01c7
                android.support.v7.widget.RecyclerView r0 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$t r0 = r0.f2984C
                boolean r0 = r0.mo4557a()
                if (r0 != 0) goto L_0x01c7
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r10.mo4580a(r0)
                if (r1 == 0) goto L_0x01c7
                r10.mo4574a(r8, r0)
                android.support.v7.widget.RecyclerView r0 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$t r0 = r0.f2984C
                boolean r0 = r0.f3140i
                if (r0 == 0) goto L_0x01c7
                int r0 = android.support.p023v7.widget.RecyclerView.C0931f.m4759e(r10)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                android.support.v7.widget.RecyclerView r1 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$f r1 = r1.f3053y
                android.support.v7.widget.RecyclerView r2 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$t r2 = r2.f2984C
                java.util.List r4 = r10.mo4602u()
                android.support.v7.widget.RecyclerView$f$c r0 = r1.mo4346a(r2, r10, r0, r4)
                android.support.v7.widget.RecyclerView r1 = android.support.p023v7.widget.RecyclerView.this
                r1.mo4146a(r10, r0)
            L_0x01c7:
                android.support.v7.widget.RecyclerView r0 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$t r0 = r0.f2984C
                boolean r0 = r0.mo4557a()
                if (r0 == 0) goto L_0x01da
                boolean r0 = r10.mo4596p()
                if (r0 == 0) goto L_0x01da
                r10.f3163g = r3
                goto L_0x01ed
            L_0x01da:
                boolean r0 = r10.mo4596p()
                if (r0 == 0) goto L_0x01ef
                boolean r0 = r10.mo4595o()
                if (r0 != 0) goto L_0x01ef
                boolean r0 = r10.mo4594n()
                if (r0 == 0) goto L_0x01ed
                goto L_0x01ef
            L_0x01ed:
                r0 = 0
                goto L_0x0202
            L_0x01ef:
                android.support.v7.widget.RecyclerView r0 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.e r0 = r0.f3033e
                int r2 = r0.mo5435b(r3)
                r0 = r16
                r1 = r10
                r3 = r17
                r4 = r19
                boolean r0 = r0.m4970a(r1, r2, r3, r4)
            L_0x0202:
                android.view.View r1 = r10.f3157a
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x0218
                android.support.v7.widget.RecyclerView r1 = android.support.p023v7.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
            L_0x0210:
                android.support.v7.widget.RecyclerView$j r1 = (android.support.p023v7.widget.RecyclerView.C0942j) r1
                android.view.View r2 = r10.f3157a
                r2.setLayoutParams(r1)
                goto L_0x0229
            L_0x0218:
                android.support.v7.widget.RecyclerView r2 = android.support.p023v7.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x0227
                android.support.v7.widget.RecyclerView r2 = android.support.p023v7.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams(r1)
                goto L_0x0210
            L_0x0227:
                android.support.v7.widget.RecyclerView$j r1 = (android.support.p023v7.widget.RecyclerView.C0942j) r1
            L_0x0229:
                r1.f3098c = r10
                if (r9 == 0) goto L_0x0230
                if (r0 == 0) goto L_0x0230
                goto L_0x0231
            L_0x0230:
                r7 = 0
            L_0x0231:
                r1.f3101f = r7
                return r10
            L_0x0234:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                android.support.v7.widget.RecyclerView r2 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$t r2 = r2.f2984C
                int r2 = r2.mo4561e()
                r1.append(r2)
                android.support.v7.widget.RecyclerView r2 = android.support.p023v7.widget.RecyclerView.this
                java.lang.String r2 = r2.mo4134a()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.RecyclerView.C0949p.mo4498a(int, boolean, long):android.support.v7.widget.RecyclerView$w");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C0958w mo4499a(long j, int i, boolean z) {
            for (int size = this.f3108a.size() - 1; size >= 0; size--) {
                C0958w wVar = (C0958w) this.f3108a.get(size);
                if (wVar.mo4587g() == j && !wVar.mo4591k()) {
                    if (i == wVar.mo4588h()) {
                        wVar.mo4582b(32);
                        if (wVar.mo4597q() && !RecyclerView.this.f2984C.mo4557a()) {
                            wVar.mo4574a(2, 14);
                        }
                        return wVar;
                    } else if (!z) {
                        this.f3108a.remove(size);
                        RecyclerView.this.removeDetachedView(wVar.f3157a, false);
                        mo4516b(wVar.f3157a);
                    }
                }
            }
            int size2 = this.f3110c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                C0958w wVar2 = (C0958w) this.f3110c.get(size2);
                if (wVar2.mo4587g() == j) {
                    if (i == wVar2.mo4588h()) {
                        if (!z) {
                            this.f3110c.remove(size2);
                        }
                        return wVar2;
                    } else if (!z) {
                        mo4523d(size2);
                        return null;
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public View mo4500a(int i, boolean z) {
            return mo4498a(i, z, Long.MAX_VALUE).f3157a;
        }

        /* renamed from: a */
        public void mo4501a() {
            this.f3108a.clear();
            mo4522d();
        }

        /* renamed from: a */
        public void mo4502a(int i) {
            this.f3115h = i;
            mo4513b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4503a(int i, int i2) {
            int i3;
            int i4;
            int i5;
            if (i < i2) {
                i5 = i;
                i4 = i2;
                i3 = -1;
            } else {
                i4 = i;
                i5 = i2;
                i3 = 1;
            }
            int size = this.f3110c.size();
            for (int i6 = 0; i6 < size; i6++) {
                C0958w wVar = (C0958w) this.f3110c.get(i6);
                if (wVar != null && wVar.f3159c >= i5 && wVar.f3159c <= i4) {
                    if (wVar.f3159c == i) {
                        wVar.mo4576a(i2 - i, false);
                    } else {
                        wVar.mo4576a(i3, false);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4504a(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f3110c.size() - 1; size >= 0; size--) {
                C0958w wVar = (C0958w) this.f3110c.get(size);
                if (wVar != null) {
                    if (wVar.f3159c >= i3) {
                        wVar.mo4576a(-i2, z);
                    } else if (wVar.f3159c >= i) {
                        wVar.mo4582b(8);
                        mo4523d(size);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4505a(C0926a aVar, C0926a aVar2, boolean z) {
            mo4501a();
            mo4529g().mo4492a(aVar, aVar2, z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4506a(C0947o oVar) {
            if (this.f3112e != null) {
                this.f3112e.mo4495b();
            }
            this.f3112e = oVar;
            if (oVar != null) {
                this.f3112e.mo4491a(RecyclerView.this.getAdapter());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4507a(C0956u uVar) {
            this.f3116i = uVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4508a(C0958w wVar, boolean z) {
            RecyclerView.m4614c(wVar);
            if (wVar.mo4580a(16384)) {
                wVar.mo4574a(0, 16384);
                C0626s.m2844a(wVar.f3157a, (C0577a) null);
            }
            if (z) {
                mo4524d(wVar);
            }
            wVar.f3169m = null;
            mo4529g().mo4493a(wVar);
        }

        /* renamed from: a */
        public void mo4509a(View view) {
            C0958w e = RecyclerView.m4616e(view);
            if (e.mo4598r()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (e.mo4589i()) {
                e.mo4590j();
            } else if (e.mo4591k()) {
                e.mo4592l();
            }
            mo4515b(e);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4510a(C0958w wVar) {
            if (wVar.mo4597q()) {
                return RecyclerView.this.f2984C.mo4557a();
            }
            if (wVar.f3159c < 0 || wVar.f3159c >= RecyclerView.this.f3040l.mo342a()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Inconsistency detected. Invalid view holder adapter position");
                sb.append(wVar);
                sb.append(RecyclerView.this.mo4134a());
                throw new IndexOutOfBoundsException(sb.toString());
            }
            boolean z = false;
            if (!RecyclerView.this.f2984C.mo4557a() && RecyclerView.this.f3040l.mo352b(wVar.f3159c) != wVar.mo4588h()) {
                return false;
            }
            if (!RecyclerView.this.f3040l.mo4335d()) {
                return true;
            }
            if (wVar.mo4587g() == RecyclerView.this.f3040l.mo343a(wVar.f3159c)) {
                z = true;
            }
            return z;
        }

        /* renamed from: b */
        public int mo4511b(int i) {
            if (i >= 0 && i < RecyclerView.this.f2984C.mo4561e()) {
                return !RecyclerView.this.f2984C.mo4557a() ? i : RecyclerView.this.f3033e.mo5435b(i);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("invalid position ");
            sb.append(i);
            sb.append(". State ");
            sb.append("item count is ");
            sb.append(RecyclerView.this.f2984C.mo4561e());
            sb.append(RecyclerView.this.mo4134a());
            throw new IndexOutOfBoundsException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C0958w mo4512b(int i, boolean z) {
            int size = this.f3108a.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                C0958w wVar = (C0958w) this.f3108a.get(i3);
                if (wVar.mo4591k() || wVar.mo4584d() != i || wVar.mo4594n() || (!RecyclerView.this.f2984C.f3137f && wVar.mo4597q())) {
                    i3++;
                } else {
                    wVar.mo4582b(32);
                    return wVar;
                }
            }
            if (!z) {
                View c = RecyclerView.this.f3034f.mo4955c(i);
                if (c != null) {
                    C0958w e = RecyclerView.m4616e(c);
                    RecyclerView.this.f3034f.mo4960e(c);
                    int b = RecyclerView.this.f3034f.mo4952b(c);
                    if (b != -1) {
                        RecyclerView.this.f3034f.mo4959e(b);
                        mo4521c(c);
                        e.mo4582b(8224);
                        return e;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("layout index should not be -1 after unhiding a view:");
                    sb.append(e);
                    sb.append(RecyclerView.this.mo4134a());
                    throw new IllegalStateException(sb.toString());
                }
            }
            int size2 = this.f3110c.size();
            while (i2 < size2) {
                C0958w wVar2 = (C0958w) this.f3110c.get(i2);
                if (wVar2.mo4594n() || wVar2.mo4584d() != i) {
                    i2++;
                } else {
                    if (!z) {
                        this.f3110c.remove(i2);
                    }
                    return wVar2;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4513b() {
            this.f3111d = this.f3115h + (RecyclerView.this.f3041m != null ? RecyclerView.this.f3041m.f3090x : 0);
            for (int size = this.f3110c.size() - 1; size >= 0 && this.f3110c.size() > this.f3111d; size--) {
                mo4523d(size);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4514b(int i, int i2) {
            int size = this.f3110c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0958w wVar = (C0958w) this.f3110c.get(i3);
                if (wVar != null && wVar.f3159c >= i) {
                    wVar.mo4576a(i2, true);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4515b(C0958w wVar) {
            boolean z;
            boolean z2 = false;
            if (wVar.mo4589i() || wVar.f3157a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(wVar.mo4589i());
                sb.append(" isAttached:");
                if (wVar.f3157a.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.mo4134a());
                throw new IllegalArgumentException(sb.toString());
            } else if (wVar.mo4598r()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(wVar);
                sb2.append(RecyclerView.this.mo4134a());
                throw new IllegalArgumentException(sb2.toString());
            } else if (!wVar.mo4583c()) {
                boolean a = wVar.m5058A();
                if ((RecyclerView.this.f3040l != null && a && RecyclerView.this.f3040l.mo4330b(wVar)) || wVar.mo4604w()) {
                    if (this.f3111d <= 0 || wVar.mo4580a(526)) {
                        z = false;
                    } else {
                        int size = this.f3110c.size();
                        if (size >= this.f3111d && size > 0) {
                            mo4523d(0);
                            size--;
                        }
                        if (RecyclerView.f2975L && size > 0 && !RecyclerView.this.f2983B.mo5078a(wVar.f3159c)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.f2983B.mo5078a(((C0958w) this.f3110c.get(i)).f3159c)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f3110c.add(size, wVar);
                        z = true;
                    }
                    if (!z) {
                        mo4508a(wVar, true);
                        z2 = true;
                    }
                } else {
                    z = false;
                }
                RecyclerView.this.f3035g.mo5408g(wVar);
                if (!z && !z2 && a) {
                    wVar.f3169m = null;
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
                sb3.append(RecyclerView.this.mo4134a());
                throw new IllegalArgumentException(sb3.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4516b(View view) {
            C0958w e = RecyclerView.m4616e(view);
            e.f3172q = null;
            e.f3173r = false;
            e.mo4592l();
            mo4515b(e);
        }

        /* renamed from: c */
        public View mo4517c(int i) {
            return mo4500a(i, false);
        }

        /* renamed from: c */
        public List<C0958w> mo4518c() {
            return this.f3114g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo4519c(int i, int i2) {
            int i3 = i2 + i;
            for (int size = this.f3110c.size() - 1; size >= 0; size--) {
                C0958w wVar = (C0958w) this.f3110c.get(size);
                if (wVar != null) {
                    int i4 = wVar.f3159c;
                    if (i4 >= i && i4 < i3) {
                        wVar.mo4582b(2);
                        mo4523d(size);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo4520c(C0958w wVar) {
            (wVar.f3173r ? this.f3109b : this.f3108a).remove(wVar);
            wVar.f3172q = null;
            wVar.f3173r = false;
            wVar.mo4592l();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo4521c(View view) {
            ArrayList<C0958w> arrayList;
            C0958w e = RecyclerView.m4616e(view);
            if (!e.mo4580a(12) && e.mo4605x() && !RecyclerView.this.mo4166b(e)) {
                if (this.f3109b == null) {
                    this.f3109b = new ArrayList<>();
                }
                e.mo4577a(this, true);
                arrayList = this.f3109b;
            } else if (!e.mo4594n() || e.mo4597q() || RecyclerView.this.f3040l.mo4335d()) {
                e.mo4577a(this, false);
                arrayList = this.f3108a;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                sb.append(RecyclerView.this.mo4134a());
                throw new IllegalArgumentException(sb.toString());
            }
            arrayList.add(e);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo4522d() {
            for (int size = this.f3110c.size() - 1; size >= 0; size--) {
                mo4523d(size);
            }
            this.f3110c.clear();
            if (RecyclerView.f2975L) {
                RecyclerView.this.f2983B.mo5075a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo4523d(int i) {
            mo4508a((C0958w) this.f3110c.get(i), true);
            this.f3110c.remove(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo4524d(C0958w wVar) {
            if (RecyclerView.this.f3042n != null) {
                RecyclerView.this.f3042n.mo4533a(wVar);
            }
            if (RecyclerView.this.f3040l != null) {
                RecyclerView.this.f3040l.mo349a(wVar);
            }
            if (RecyclerView.this.f2984C != null) {
                RecyclerView.this.f3035g.mo5408g(wVar);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public int mo4525e() {
            return this.f3108a.size();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public View mo4526e(int i) {
            return ((C0958w) this.f3108a.get(i)).f3157a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public C0958w mo4527f(int i) {
            if (this.f3109b != null) {
                int size = this.f3109b.size();
                if (size != 0) {
                    int i2 = 0;
                    int i3 = 0;
                    while (i3 < size) {
                        C0958w wVar = (C0958w) this.f3109b.get(i3);
                        if (wVar.mo4591k() || wVar.mo4584d() != i) {
                            i3++;
                        } else {
                            wVar.mo4582b(32);
                            return wVar;
                        }
                    }
                    if (RecyclerView.this.f3040l.mo4335d()) {
                        int b = RecyclerView.this.f3033e.mo5435b(i);
                        if (b > 0 && b < RecyclerView.this.f3040l.mo342a()) {
                            long a = RecyclerView.this.f3040l.mo343a(b);
                            while (i2 < size) {
                                C0958w wVar2 = (C0958w) this.f3109b.get(i2);
                                if (wVar2.mo4591k() || wVar2.mo4587g() != a) {
                                    i2++;
                                } else {
                                    wVar2.mo4582b(32);
                                    return wVar2;
                                }
                            }
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo4528f() {
            this.f3108a.clear();
            if (this.f3109b != null) {
                this.f3109b.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public C0947o mo4529g() {
            if (this.f3112e == null) {
                this.f3112e = new C0947o();
            }
            return this.f3112e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo4530h() {
            int size = this.f3110c.size();
            for (int i = 0; i < size; i++) {
                C0958w wVar = (C0958w) this.f3110c.get(i);
                if (wVar != null) {
                    wVar.mo4582b(6);
                    wVar.mo4578a((Object) null);
                }
            }
            if (RecyclerView.this.f3040l == null || !RecyclerView.this.f3040l.mo4335d()) {
                mo4522d();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public void mo4531i() {
            int size = this.f3110c.size();
            for (int i = 0; i < size; i++) {
                ((C0958w) this.f3110c.get(i)).mo4573a();
            }
            int size2 = this.f3108a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((C0958w) this.f3108a.get(i2)).mo4573a();
            }
            if (this.f3109b != null) {
                int size3 = this.f3109b.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((C0958w) this.f3109b.get(i3)).mo4573a();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo4532j() {
            int size = this.f3110c.size();
            for (int i = 0; i < size; i++) {
                C0942j jVar = (C0942j) ((C0958w) this.f3110c.get(i)).f3157a.getLayoutParams();
                if (jVar != null) {
                    jVar.f3100e = true;
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$q */
    public interface C0950q {
        /* renamed from: a */
        void mo4533a(C0958w wVar);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$r */
    private class C0951r extends C0928c {
        C0951r() {
        }

        /* renamed from: a */
        public void mo4340a() {
            RecyclerView.this.mo4148a((String) null);
            RecyclerView.this.f2984C.f3136e = true;
            RecyclerView.this.mo4171c(true);
            if (!RecyclerView.this.f3033e.mo5439d()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* renamed from: a */
        public void mo4342a(int i, int i2, Object obj) {
            RecyclerView.this.mo4148a((String) null);
            if (RecyclerView.this.f3033e.mo5434a(i, i2, obj)) {
                mo4534b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4534b() {
            if (!RecyclerView.f2981c || !RecyclerView.this.f3045q || !RecyclerView.this.f3044p) {
                RecyclerView.this.f3050v = true;
                RecyclerView.this.requestLayout();
                return;
            }
            C0626s.m2847a((View) RecyclerView.this, RecyclerView.this.f3037i);
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$s */
    public static abstract class C0952s {

        /* renamed from: a */
        private int f3118a = -1;

        /* renamed from: b */
        private RecyclerView f3119b;

        /* renamed from: c */
        private C0937i f3120c;

        /* renamed from: d */
        private boolean f3121d;

        /* renamed from: e */
        private boolean f3122e;

        /* renamed from: f */
        private View f3123f;

        /* renamed from: g */
        private final C0953a f3124g = new C0953a(0, 0);

        /* renamed from: android.support.v7.widget.RecyclerView$s$a */
        public static class C0953a {

            /* renamed from: a */
            private int f3125a;

            /* renamed from: b */
            private int f3126b;

            /* renamed from: c */
            private int f3127c;

            /* renamed from: d */
            private int f3128d;

            /* renamed from: e */
            private Interpolator f3129e;

            /* renamed from: f */
            private boolean f3130f;

            /* renamed from: g */
            private int f3131g;

            public C0953a(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            public C0953a(int i, int i2, int i3, Interpolator interpolator) {
                this.f3128d = -1;
                this.f3130f = false;
                this.f3131g = 0;
                this.f3125a = i;
                this.f3126b = i2;
                this.f3127c = i3;
                this.f3129e = interpolator;
            }

            /* renamed from: b */
            private void m5030b() {
                if (this.f3129e != null && this.f3127c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f3127c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* renamed from: a */
            public void mo4551a(int i) {
                this.f3128d = i;
            }

            /* renamed from: a */
            public void mo4552a(int i, int i2, int i3, Interpolator interpolator) {
                this.f3125a = i;
                this.f3126b = i2;
                this.f3127c = i3;
                this.f3129e = interpolator;
                this.f3130f = true;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo4553a(RecyclerView recyclerView) {
                if (this.f3128d >= 0) {
                    int i = this.f3128d;
                    this.f3128d = -1;
                    recyclerView.mo4135a(i);
                    this.f3130f = false;
                    return;
                }
                if (this.f3130f) {
                    m5030b();
                    if (this.f3129e != null) {
                        recyclerView.f3054z.mo4568a(this.f3125a, this.f3126b, this.f3127c, this.f3129e);
                    } else if (this.f3127c == Integer.MIN_VALUE) {
                        recyclerView.f3054z.mo4571b(this.f3125a, this.f3126b);
                    } else {
                        recyclerView.f3054z.mo4566a(this.f3125a, this.f3126b, this.f3127c);
                    }
                    this.f3131g++;
                    if (this.f3131g > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f3130f = false;
                } else {
                    this.f3131g = 0;
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public boolean mo4554a() {
                return this.f3128d >= 0;
            }
        }

        /* renamed from: android.support.v7.widget.RecyclerView$s$b */
        public interface C0954b {
            /* renamed from: d */
            PointF mo4092d(int i);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m5012a(int i, int i2) {
            RecyclerView recyclerView = this.f3119b;
            if (!this.f3122e || this.f3118a == -1 || recyclerView == null) {
                mo4546f();
            }
            this.f3121d = false;
            if (this.f3123f != null) {
                if (mo4535a(this.f3123f) == this.f3118a) {
                    mo4540a(this.f3123f, recyclerView.f2984C, this.f3124g);
                    this.f3124g.mo4553a(recyclerView);
                    mo4546f();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f3123f = null;
                }
            }
            if (this.f3122e) {
                mo4537a(i, i2, recyclerView.f2984C, this.f3124g);
                boolean a = this.f3124g.mo4554a();
                this.f3124g.mo4553a(recyclerView);
                if (!a) {
                    return;
                }
                if (this.f3122e) {
                    this.f3121d = true;
                    recyclerView.f3054z.mo4564a();
                    return;
                }
                mo4546f();
            }
        }

        /* renamed from: a */
        public int mo4535a(View view) {
            return this.f3119b.mo4195f(view);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo4536a();

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo4537a(int i, int i2, C0955t tVar, C0953a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4538a(PointF pointF) {
            float sqrt = (float) Math.sqrt((double) ((pointF.x * pointF.x) + (pointF.y * pointF.y)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4539a(RecyclerView recyclerView, C0937i iVar) {
            this.f3119b = recyclerView;
            this.f3120c = iVar;
            if (this.f3118a != -1) {
                this.f3119b.f2984C.f3147p = this.f3118a;
                this.f3122e = true;
                this.f3121d = true;
                this.f3123f = mo4545e(mo4549i());
                mo4536a();
                this.f3119b.f3054z.mo4564a();
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo4540a(View view, C0955t tVar, C0953a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo4541b();

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo4542b(View view) {
            if (mo4535a(view) == mo4549i()) {
                this.f3123f = view;
            }
        }

        /* renamed from: d */
        public void mo4543d(int i) {
            this.f3118a = i;
        }

        /* renamed from: e */
        public C0937i mo4544e() {
            return this.f3120c;
        }

        /* renamed from: e */
        public View mo4545e(int i) {
            return this.f3119b.f3041m.mo4088c(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public final void mo4546f() {
            if (this.f3122e) {
                this.f3122e = false;
                mo4541b();
                this.f3119b.f2984C.f3147p = -1;
                this.f3123f = null;
                this.f3118a = -1;
                this.f3121d = false;
                this.f3120c.m4799b(this);
                this.f3120c = null;
                this.f3119b = null;
            }
        }

        /* renamed from: g */
        public boolean mo4547g() {
            return this.f3121d;
        }

        /* renamed from: h */
        public boolean mo4548h() {
            return this.f3122e;
        }

        /* renamed from: i */
        public int mo4549i() {
            return this.f3118a;
        }

        /* renamed from: j */
        public int mo4550j() {
            return this.f3119b.f3041m.mo4465w();
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$t */
    public static class C0955t {

        /* renamed from: a */
        int f3132a = 0;

        /* renamed from: b */
        int f3133b = 0;

        /* renamed from: c */
        int f3134c = 1;

        /* renamed from: d */
        int f3135d = 0;

        /* renamed from: e */
        boolean f3136e = false;

        /* renamed from: f */
        boolean f3137f = false;

        /* renamed from: g */
        boolean f3138g = false;

        /* renamed from: h */
        boolean f3139h = false;

        /* renamed from: i */
        boolean f3140i = false;

        /* renamed from: j */
        boolean f3141j = false;

        /* renamed from: k */
        int f3142k;

        /* renamed from: l */
        long f3143l;

        /* renamed from: m */
        int f3144m;

        /* renamed from: n */
        int f3145n;

        /* renamed from: o */
        int f3146o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public int f3147p = -1;

        /* renamed from: q */
        private SparseArray<Object> f3148q;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4555a(int i) {
            if ((this.f3134c & i) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Layout state should be one of ");
                sb.append(Integer.toBinaryString(i));
                sb.append(" but it is ");
                sb.append(Integer.toBinaryString(this.f3134c));
                throw new IllegalStateException(sb.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4556a(C0926a aVar) {
            this.f3134c = 1;
            this.f3135d = aVar.mo342a();
            this.f3137f = false;
            this.f3138g = false;
            this.f3139h = false;
        }

        /* renamed from: a */
        public boolean mo4557a() {
            return this.f3137f;
        }

        /* renamed from: b */
        public boolean mo4558b() {
            return this.f3141j;
        }

        /* renamed from: c */
        public int mo4559c() {
            return this.f3147p;
        }

        /* renamed from: d */
        public boolean mo4560d() {
            return this.f3147p != -1;
        }

        /* renamed from: e */
        public int mo4561e() {
            return this.f3137f ? this.f3132a - this.f3133b : this.f3135d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State{mTargetPosition=");
            sb.append(this.f3147p);
            sb.append(", mData=");
            sb.append(this.f3148q);
            sb.append(", mItemCount=");
            sb.append(this.f3135d);
            sb.append(", mIsMeasuring=");
            sb.append(this.f3139h);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.f3132a);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.f3133b);
            sb.append(", mStructureChanged=");
            sb.append(this.f3136e);
            sb.append(", mInPreLayout=");
            sb.append(this.f3137f);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.f3140i);
            sb.append(", mRunPredictiveAnimations=");
            sb.append(this.f3141j);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$u */
    public static abstract class C0956u {
        /* renamed from: a */
        public abstract View mo4563a(C0949p pVar, int i, int i2);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$v */
    class C0957v implements Runnable {

        /* renamed from: a */
        Interpolator f3149a = RecyclerView.f2972I;

        /* renamed from: c */
        private int f3151c;

        /* renamed from: d */
        private int f3152d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public OverScroller f3153e;

        /* renamed from: f */
        private boolean f3154f = false;

        /* renamed from: g */
        private boolean f3155g = false;

        C0957v() {
            this.f3153e = new OverScroller(RecyclerView.this.getContext(), RecyclerView.f2972I);
        }

        /* renamed from: a */
        private float m5045a(float f) {
            return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
        }

        /* renamed from: b */
        private int m5047b(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            int width = z ? RecyclerView.this.getWidth() : RecyclerView.this.getHeight();
            int i6 = width / 2;
            float f = (float) width;
            float f2 = (float) i6;
            float a = f2 + (m5045a(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f)) * f2);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(a / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }

        /* renamed from: c */
        private void m5048c() {
            this.f3155g = false;
            this.f3154f = true;
        }

        /* renamed from: d */
        private void m5049d() {
            this.f3154f = false;
            if (this.f3155g) {
                mo4564a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4564a() {
            if (this.f3154f) {
                this.f3155g = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            C0626s.m2847a((View) RecyclerView.this, (Runnable) this);
        }

        /* renamed from: a */
        public void mo4565a(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f3152d = 0;
            this.f3151c = 0;
            this.f3153e.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            mo4564a();
        }

        /* renamed from: a */
        public void mo4566a(int i, int i2, int i3) {
            mo4568a(i, i2, i3, RecyclerView.f2972I);
        }

        /* renamed from: a */
        public void mo4567a(int i, int i2, int i3, int i4) {
            mo4566a(i, i2, m5047b(i, i2, i3, i4));
        }

        /* renamed from: a */
        public void mo4568a(int i, int i2, int i3, Interpolator interpolator) {
            if (this.f3149a != interpolator) {
                this.f3149a = interpolator;
                this.f3153e = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            RecyclerView.this.setScrollState(2);
            this.f3152d = 0;
            this.f3151c = 0;
            this.f3153e.startScroll(0, 0, i, i2, i3);
            if (VERSION.SDK_INT < 23) {
                this.f3153e.computeScrollOffset();
            }
            mo4564a();
        }

        /* renamed from: a */
        public void mo4569a(int i, int i2, Interpolator interpolator) {
            int b = m5047b(i, i2, 0, 0);
            if (interpolator == null) {
                interpolator = RecyclerView.f2972I;
            }
            mo4568a(i, i2, b, interpolator);
        }

        /* renamed from: b */
        public void mo4570b() {
            RecyclerView.this.removeCallbacks(this);
            this.f3153e.abortAnimation();
        }

        /* renamed from: b */
        public void mo4571b(int i, int i2) {
            mo4567a(i, i2, 0, 0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:52:0x012c, code lost:
            if (r8 > 0) goto L_0x0130;
         */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0128  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x0138  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r22 = this;
                r0 = r22
                android.support.v7.widget.RecyclerView r1 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$i r1 = r1.f3041m
                if (r1 != 0) goto L_0x000c
                r22.mo4570b()
                return
            L_0x000c:
                r22.m5048c()
                android.support.v7.widget.RecyclerView r1 = android.support.p023v7.widget.RecyclerView.this
                r1.mo4181d()
                android.widget.OverScroller r1 = r0.f3153e
                android.support.v7.widget.RecyclerView r2 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$i r2 = r2.f3041m
                android.support.v7.widget.RecyclerView$s r2 = r2.f3086t
                boolean r3 = r1.computeScrollOffset()
                r4 = 0
                if (r3 == 0) goto L_0x01d4
                android.support.v7.widget.RecyclerView r3 = android.support.p023v7.widget.RecyclerView.this
                int[] r3 = r3.f3002aE
                int r11 = r1.getCurrX()
                int r12 = r1.getCurrY()
                int r5 = r0.f3151c
                int r13 = r11 - r5
                int r5 = r0.f3152d
                int r14 = r12 - r5
                r0.f3151c = r11
                r0.f3152d = r12
                android.support.v7.widget.RecyclerView r5 = android.support.p023v7.widget.RecyclerView.this
                r9 = 0
                r10 = 1
                r6 = r13
                r7 = r14
                r8 = r3
                boolean r5 = r5.mo4152a(r6, r7, r8, r9, r10)
                r6 = 1
                if (r5 == 0) goto L_0x0051
                r5 = r3[r4]
                int r13 = r13 - r5
                r3 = r3[r6]
                int r14 = r14 - r3
            L_0x0051:
                android.support.v7.widget.RecyclerView r3 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r3 = r3.f3040l
                if (r3 == 0) goto L_0x00dd
                android.support.v7.widget.RecyclerView r3 = android.support.p023v7.widget.RecyclerView.this
                r3.mo4192e()
                android.support.v7.widget.RecyclerView r3 = android.support.p023v7.widget.RecyclerView.this
                r3.mo4236l()
                java.lang.String r3 = "RV Scroll"
                android.support.p009v4.p020os.C0560c.m2558a(r3)
                android.support.v7.widget.RecyclerView r3 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView r5 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$t r5 = r5.f2984C
                r3.mo4145a(r5)
                if (r13 == 0) goto L_0x0084
                android.support.v7.widget.RecyclerView r3 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$i r3 = r3.f3041m
                android.support.v7.widget.RecyclerView r5 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$p r5 = r5.f3032d
                android.support.v7.widget.RecyclerView r7 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$t r7 = r7.f2984C
                int r3 = r3.mo4041a(r13, r5, r7)
                int r5 = r13 - r3
                goto L_0x0086
            L_0x0084:
                r3 = 0
                r5 = 0
            L_0x0086:
                if (r14 == 0) goto L_0x009b
                android.support.v7.widget.RecyclerView r7 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$i r7 = r7.f3041m
                android.support.v7.widget.RecyclerView r8 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$p r8 = r8.f3032d
                android.support.v7.widget.RecyclerView r9 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$t r9 = r9.f2984C
                int r7 = r7.mo4061b(r14, r8, r9)
                int r8 = r14 - r7
                goto L_0x009d
            L_0x009b:
                r7 = 0
                r8 = 0
            L_0x009d:
                android.support.p009v4.p020os.C0560c.m2557a()
                android.support.v7.widget.RecyclerView r9 = android.support.p023v7.widget.RecyclerView.this
                r9.mo4288w()
                android.support.v7.widget.RecyclerView r9 = android.support.p023v7.widget.RecyclerView.this
                r9.mo4238m()
                android.support.v7.widget.RecyclerView r9 = android.support.p023v7.widget.RecyclerView.this
                r9.mo4149a(r4)
                if (r2 == 0) goto L_0x00e1
                boolean r9 = r2.mo4547g()
                if (r9 != 0) goto L_0x00e1
                boolean r9 = r2.mo4548h()
                if (r9 == 0) goto L_0x00e1
                android.support.v7.widget.RecyclerView r9 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$t r9 = r9.f2984C
                int r9 = r9.mo4561e()
                if (r9 != 0) goto L_0x00cb
                r2.mo4546f()
                goto L_0x00e1
            L_0x00cb:
                int r10 = r2.mo4549i()
                if (r10 < r9) goto L_0x00d5
                int r9 = r9 - r6
                r2.mo4543d(r9)
            L_0x00d5:
                int r9 = r13 - r5
                int r10 = r14 - r8
                r2.m5012a(r9, r10)
                goto L_0x00e1
            L_0x00dd:
                r3 = 0
                r5 = 0
                r7 = 0
                r8 = 0
            L_0x00e1:
                android.support.v7.widget.RecyclerView r9 = android.support.p023v7.widget.RecyclerView.this
                java.util.ArrayList<android.support.v7.widget.RecyclerView$h> r9 = r9.f3043o
                boolean r9 = r9.isEmpty()
                if (r9 != 0) goto L_0x00f0
                android.support.v7.widget.RecyclerView r9 = android.support.p023v7.widget.RecyclerView.this
                r9.invalidate()
            L_0x00f0:
                android.support.v7.widget.RecyclerView r9 = android.support.p023v7.widget.RecyclerView.this
                int r9 = r9.getOverScrollMode()
                r10 = 2
                if (r9 == r10) goto L_0x00fe
                android.support.v7.widget.RecyclerView r9 = android.support.p023v7.widget.RecyclerView.this
                r9.mo4170c(r13, r14)
            L_0x00fe:
                android.support.v7.widget.RecyclerView r15 = android.support.p023v7.widget.RecyclerView.this
                r20 = 0
                r21 = 1
                r16 = r3
                r17 = r7
                r18 = r5
                r19 = r8
                boolean r9 = r15.mo4150a(r16, r17, r18, r19, r20, r21)
                if (r9 != 0) goto L_0x0154
                if (r5 != 0) goto L_0x0116
                if (r8 == 0) goto L_0x0154
            L_0x0116:
                float r9 = r1.getCurrVelocity()
                int r9 = (int) r9
                if (r5 == r11) goto L_0x0125
                if (r5 >= 0) goto L_0x0121
                int r15 = -r9
                goto L_0x0126
            L_0x0121:
                if (r5 <= 0) goto L_0x0125
                r15 = r9
                goto L_0x0126
            L_0x0125:
                r15 = 0
            L_0x0126:
                if (r8 == r12) goto L_0x012f
                if (r8 >= 0) goto L_0x012c
                int r9 = -r9
                goto L_0x0130
            L_0x012c:
                if (r8 <= 0) goto L_0x012f
                goto L_0x0130
            L_0x012f:
                r9 = 0
            L_0x0130:
                android.support.v7.widget.RecyclerView r4 = android.support.p023v7.widget.RecyclerView.this
                int r4 = r4.getOverScrollMode()
                if (r4 == r10) goto L_0x013d
                android.support.v7.widget.RecyclerView r4 = android.support.p023v7.widget.RecyclerView.this
                r4.mo4183d(r15, r9)
            L_0x013d:
                if (r15 != 0) goto L_0x0147
                if (r5 == r11) goto L_0x0147
                int r4 = r1.getFinalX()
                if (r4 != 0) goto L_0x0154
            L_0x0147:
                if (r9 != 0) goto L_0x0151
                if (r8 == r12) goto L_0x0151
                int r4 = r1.getFinalY()
                if (r4 != 0) goto L_0x0154
            L_0x0151:
                r1.abortAnimation()
            L_0x0154:
                if (r3 != 0) goto L_0x0158
                if (r7 == 0) goto L_0x015d
            L_0x0158:
                android.support.v7.widget.RecyclerView r4 = android.support.p023v7.widget.RecyclerView.this
                r4.mo4230i(r3, r7)
            L_0x015d:
                android.support.v7.widget.RecyclerView r4 = android.support.p023v7.widget.RecyclerView.this
                boolean r4 = r4.awakenScrollBars()
                if (r4 != 0) goto L_0x016a
                android.support.v7.widget.RecyclerView r4 = android.support.p023v7.widget.RecyclerView.this
                r4.invalidate()
            L_0x016a:
                if (r14 == 0) goto L_0x017a
                android.support.v7.widget.RecyclerView r4 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$i r4 = r4.f3041m
                boolean r4 = r4.mo4099f()
                if (r4 == 0) goto L_0x017a
                if (r7 != r14) goto L_0x017a
                r4 = 1
                goto L_0x017b
            L_0x017a:
                r4 = 0
            L_0x017b:
                if (r13 == 0) goto L_0x018b
                android.support.v7.widget.RecyclerView r5 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$i r5 = r5.f3041m
                boolean r5 = r5.mo4096e()
                if (r5 == 0) goto L_0x018b
                if (r3 != r13) goto L_0x018b
                r3 = 1
                goto L_0x018c
            L_0x018b:
                r3 = 0
            L_0x018c:
                if (r13 != 0) goto L_0x0190
                if (r14 == 0) goto L_0x0197
            L_0x0190:
                if (r3 != 0) goto L_0x0197
                if (r4 == 0) goto L_0x0195
                goto L_0x0197
            L_0x0195:
                r3 = 0
                goto L_0x0198
            L_0x0197:
                r3 = 1
            L_0x0198:
                boolean r1 = r1.isFinished()
                if (r1 != 0) goto L_0x01bc
                if (r3 != 0) goto L_0x01a9
                android.support.v7.widget.RecyclerView r1 = android.support.p023v7.widget.RecyclerView.this
                boolean r1 = r1.mo4226h(r6)
                if (r1 != 0) goto L_0x01a9
                goto L_0x01bc
            L_0x01a9:
                r22.mo4564a()
                android.support.v7.widget.RecyclerView r1 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.al r1 = r1.f2982A
                if (r1 == 0) goto L_0x01d4
                android.support.v7.widget.RecyclerView r1 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.al r1 = r1.f2982A
                android.support.v7.widget.RecyclerView r3 = android.support.p023v7.widget.RecyclerView.this
                r1.mo5070a(r3, r13, r14)
                goto L_0x01d4
            L_0x01bc:
                android.support.v7.widget.RecyclerView r1 = android.support.p023v7.widget.RecyclerView.this
                r3 = 0
                r1.setScrollState(r3)
                boolean r1 = android.support.p023v7.widget.RecyclerView.f2975L
                if (r1 == 0) goto L_0x01cf
                android.support.v7.widget.RecyclerView r1 = android.support.p023v7.widget.RecyclerView.this
                android.support.v7.widget.al$a r1 = r1.f2983B
                r1.mo5075a()
            L_0x01cf:
                android.support.v7.widget.RecyclerView r1 = android.support.p023v7.widget.RecyclerView.this
                r1.mo4201g(r6)
            L_0x01d4:
                if (r2 == 0) goto L_0x01e7
                boolean r1 = r2.mo4547g()
                if (r1 == 0) goto L_0x01e0
                r1 = 0
                r2.m5012a(r1, r1)
            L_0x01e0:
                boolean r1 = r0.f3155g
                if (r1 != 0) goto L_0x01e7
                r2.mo4546f()
            L_0x01e7:
                r22.m5049d()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.RecyclerView.C0957v.run():void");
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$w */
    public static abstract class C0958w {

        /* renamed from: o */
        private static final List<Object> f3156o = Collections.EMPTY_LIST;

        /* renamed from: a */
        public final View f3157a;

        /* renamed from: b */
        WeakReference<RecyclerView> f3158b;

        /* renamed from: c */
        int f3159c = -1;

        /* renamed from: d */
        int f3160d = -1;

        /* renamed from: e */
        long f3161e = -1;

        /* renamed from: f */
        int f3162f = -1;

        /* renamed from: g */
        int f3163g = -1;

        /* renamed from: h */
        C0958w f3164h = null;

        /* renamed from: i */
        C0958w f3165i = null;

        /* renamed from: j */
        List<Object> f3166j = null;

        /* renamed from: k */
        List<Object> f3167k = null;

        /* renamed from: l */
        int f3168l = -1;

        /* renamed from: m */
        RecyclerView f3169m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public int f3170n;

        /* renamed from: p */
        private int f3171p = 0;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public C0949p f3172q = null;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public boolean f3173r = false;

        /* renamed from: s */
        private int f3174s = 0;

        public C0958w(View view) {
            if (view != null) {
                this.f3157a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* access modifiers changed from: private */
        /* renamed from: A */
        public boolean m5058A() {
            return (this.f3170n & 16) == 0 && C0626s.m2856b(this.f3157a);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m5061a(RecyclerView recyclerView) {
            this.f3174s = this.f3168l != -1 ? this.f3168l : C0626s.m2859d(this.f3157a);
            recyclerView.mo4153a(this, 4);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m5065b(RecyclerView recyclerView) {
            recyclerView.mo4153a(this, this.f3174s);
            this.f3174s = 0;
        }

        /* renamed from: y */
        private void mo7412y() {
            if (this.f3166j == null) {
                this.f3166j = new ArrayList();
                this.f3167k = Collections.unmodifiableList(this.f3166j);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: z */
        public boolean m5070z() {
            return (this.f3170n & 16) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4573a() {
            this.f3160d = -1;
            this.f3163g = -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4574a(int i, int i2) {
            this.f3170n = (i & i2) | (this.f3170n & (i2 ^ -1));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4575a(int i, int i2, boolean z) {
            mo4582b(8);
            mo4576a(i2, z);
            this.f3159c = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4576a(int i, boolean z) {
            if (this.f3160d == -1) {
                this.f3160d = this.f3159c;
            }
            if (this.f3163g == -1) {
                this.f3163g = this.f3159c;
            }
            if (z) {
                this.f3163g += i;
            }
            this.f3159c += i;
            if (this.f3157a.getLayoutParams() != null) {
                ((C0942j) this.f3157a.getLayoutParams()).f3100e = true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4577a(C0949p pVar, boolean z) {
            this.f3172q = pVar;
            this.f3173r = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4578a(Object obj) {
            if (obj == null) {
                mo4582b(1024);
            } else if ((1024 & this.f3170n) == 0) {
                mo7412y();
                this.f3166j.add(obj);
            }
        }

        /* renamed from: a */
        public final void mo4579a(boolean z) {
            int i;
            this.f3171p = z ? this.f3171p - 1 : this.f3171p + 1;
            if (this.f3171p < 0) {
                this.f3171p = 0;
                StringBuilder sb = new StringBuilder();
                sb.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                sb.append(this);
                Log.e("View", sb.toString());
                return;
            }
            if (!z && this.f3171p == 1) {
                i = this.f3170n | 16;
            } else if (z && this.f3171p == 0) {
                i = this.f3170n & -17;
            } else {
                return;
            }
            this.f3170n = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4580a(int i) {
            return (i & this.f3170n) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4581b() {
            if (this.f3160d == -1) {
                this.f3160d = this.f3159c;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4582b(int i) {
            this.f3170n = i | this.f3170n;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo4583c() {
            return (this.f3170n & 128) != 0;
        }

        /* renamed from: d */
        public final int mo4584d() {
            return this.f3163g == -1 ? this.f3159c : this.f3163g;
        }

        /* renamed from: e */
        public final int mo4585e() {
            if (this.f3169m == null) {
                return -1;
            }
            return this.f3169m.mo4179d(this);
        }

        /* renamed from: f */
        public final int mo4586f() {
            return this.f3160d;
        }

        /* renamed from: g */
        public final long mo4587g() {
            return this.f3161e;
        }

        /* renamed from: h */
        public final int mo4588h() {
            return this.f3162f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public boolean mo4589i() {
            return this.f3172q != null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo4590j() {
            this.f3172q.mo4520c(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public boolean mo4591k() {
            return (this.f3170n & 32) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public void mo4592l() {
            this.f3170n &= -33;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public void mo4593m() {
            this.f3170n &= -257;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public boolean mo4594n() {
            return (this.f3170n & 4) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: o */
        public boolean mo4595o() {
            return (this.f3170n & 2) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: p */
        public boolean mo4596p() {
            return (this.f3170n & 1) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: q */
        public boolean mo4597q() {
            return (this.f3170n & 8) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: r */
        public boolean mo4598r() {
            return (this.f3170n & 256) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: s */
        public boolean mo4599s() {
            return (this.f3170n & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 || mo4594n();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: t */
        public void mo4600t() {
            if (this.f3166j != null) {
                this.f3166j.clear();
            }
            this.f3170n &= -1025;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewHolder{");
            sb.append(Integer.toHexString(hashCode()));
            sb.append(" position=");
            sb.append(this.f3159c);
            sb.append(" id=");
            sb.append(this.f3161e);
            sb.append(", oldPos=");
            sb.append(this.f3160d);
            sb.append(", pLpos:");
            sb.append(this.f3163g);
            StringBuilder sb2 = new StringBuilder(sb.toString());
            if (mo4589i()) {
                sb2.append(" scrap ");
                sb2.append(this.f3173r ? "[changeScrap]" : "[attachedScrap]");
            }
            if (mo4594n()) {
                sb2.append(" invalid");
            }
            if (!mo4596p()) {
                sb2.append(" unbound");
            }
            if (mo4595o()) {
                sb2.append(" update");
            }
            if (mo4597q()) {
                sb2.append(" removed");
            }
            if (mo4583c()) {
                sb2.append(" ignored");
            }
            if (mo4598r()) {
                sb2.append(" tmpDetached");
            }
            if (!mo4604w()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(" not recyclable(");
                sb3.append(this.f3171p);
                sb3.append(")");
                sb2.append(sb3.toString());
            }
            if (mo4599s()) {
                sb2.append(" undefined adapter position");
            }
            if (this.f3157a.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: u */
        public List<Object> mo4602u() {
            return (this.f3170n & 1024) == 0 ? (this.f3166j == null || this.f3166j.size() == 0) ? f3156o : this.f3167k : f3156o;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: v */
        public void mo4603v() {
            this.f3170n = 0;
            this.f3159c = -1;
            this.f3160d = -1;
            this.f3161e = -1;
            this.f3163g = -1;
            this.f3171p = 0;
            this.f3164h = null;
            this.f3165i = null;
            mo4600t();
            this.f3174s = 0;
            this.f3168l = -1;
            RecyclerView.m4614c(this);
        }

        /* renamed from: w */
        public final boolean mo4604w() {
            return (this.f3170n & 16) == 0 && !C0626s.m2856b(this.f3157a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: x */
        public boolean mo4605x() {
            return (this.f3170n & 2) != 0;
        }
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2990P = new C0951r();
        this.f3032d = new C0949p();
        this.f3035g = new C1091br();
        this.f3037i = new Runnable() {
            public void run() {
                if (RecyclerView.this.f3047s && !RecyclerView.this.isLayoutRequested()) {
                    if (!RecyclerView.this.f3044p) {
                        RecyclerView.this.requestLayout();
                    } else if (RecyclerView.this.f3049u) {
                        RecyclerView.this.f3048t = true;
                    } else {
                        RecyclerView.this.mo4181d();
                    }
                }
            }
        };
        this.f3038j = new Rect();
        this.f2992R = new Rect();
        this.f3039k = new RectF();
        this.f3043o = new ArrayList<>();
        this.f2993S = new ArrayList<>();
        this.f2995U = 0;
        this.f3051w = false;
        this.f3052x = false;
        this.f3008ac = 0;
        this.f3009ad = 0;
        this.f3010ae = new C0930e();
        this.f3053y = new C1000af();
        this.f3015aj = 0;
        this.f3016ak = -1;
        this.f3026au = Float.MIN_VALUE;
        this.f3027av = Float.MIN_VALUE;
        boolean z = true;
        this.f3028aw = true;
        this.f3054z = new C0957v();
        this.f2983B = f2975L ? new C1028a() : null;
        this.f2984C = new C0955t();
        this.f2985D = false;
        this.f2986E = false;
        this.f3031az = new C0935g();
        this.f2987F = false;
        this.f2999aB = new int[2];
        this.f3001aD = new int[2];
        this.f3002aE = new int[2];
        this.f3003aF = new int[2];
        this.f2989H = new ArrayList();
        this.f3004aG = new Runnable() {
            public void run() {
                if (RecyclerView.this.f3053y != null) {
                    RecyclerView.this.f3053y.mo4347a();
                }
                RecyclerView.this.f2987F = false;
            }
        };
        this.f3005aH = new C1093b() {
            /* renamed from: a */
            public void mo4293a(C0958w wVar) {
                RecyclerView.this.f3041m.mo4403a(wVar.f3157a, RecyclerView.this.f3032d);
            }

            /* renamed from: a */
            public void mo4294a(C0958w wVar, C0934c cVar, C0934c cVar2) {
                RecyclerView.this.f3032d.mo4520c(wVar);
                RecyclerView.this.mo4163b(wVar, cVar, cVar2);
            }

            /* renamed from: b */
            public void mo4295b(C0958w wVar, C0934c cVar, C0934c cVar2) {
                RecyclerView.this.mo4147a(wVar, cVar, cVar2);
            }

            /* renamed from: c */
            public void mo4296c(C0958w wVar, C0934c cVar, C0934c cVar2) {
                wVar.mo4579a(false);
                if (RecyclerView.this.f3051w) {
                    if (!RecyclerView.this.f3053y.mo4350a(wVar, wVar, cVar, cVar2)) {
                        return;
                    }
                } else if (!RecyclerView.this.f3053y.mo4354c(wVar, cVar, cVar2)) {
                    return;
                }
                RecyclerView.this.mo4253p();
            }
        };
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2974K, i, 0);
            this.f3036h = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f3036h = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3022aq = viewConfiguration.getScaledTouchSlop();
        this.f3026au = C0638t.m2986a(viewConfiguration, context);
        this.f3027av = C0638t.m2988b(viewConfiguration, context);
        this.f3024as = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3025at = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f3053y.mo4348a(this.f3031az);
        mo4159b();
        m4622z();
        if (C0626s.m2859d(this) == 0) {
            C0626s.m2854b((View) this, 1);
        }
        this.f3006aa = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1052av(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0824b.RecyclerView, i, 0);
            String string = obtainStyledAttributes2.getString(C0824b.RecyclerView_layoutManager);
            if (obtainStyledAttributes2.getInt(C0824b.RecyclerView_android_descendantFocusability, -1) == -1) {
                setDescendantFocusability(262144);
            }
            this.f3046r = obtainStyledAttributes2.getBoolean(C0824b.RecyclerView_fastScrollEnabled, false);
            if (this.f3046r) {
                mo4140a((StateListDrawable) obtainStyledAttributes2.getDrawable(C0824b.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes2.getDrawable(C0824b.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes2.getDrawable(C0824b.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes2.getDrawable(C0824b.RecyclerView_fastScrollHorizontalTrackDrawable));
            }
            obtainStyledAttributes2.recycle();
            m4600a(context, string, attributeSet, i, 0);
            if (VERSION.SDK_INT >= 21) {
                TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f2973J, i, 0);
                boolean z2 = obtainStyledAttributes3.getBoolean(0, true);
                obtainStyledAttributes3.recycle();
                z = z2;
            }
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z);
    }

    /* renamed from: A */
    private boolean m4582A() {
        int b = this.f3034f.mo4951b();
        for (int i = 0; i < b; i++) {
            C0958w e = m4616e(this.f3034f.mo4953b(i));
            if (e != null && !e.mo4583c() && e.mo4605x()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    private void m4583B() {
        this.f3054z.mo4570b();
        if (this.f3041m != null) {
            this.f3041m.mo4385J();
        }
    }

    /* renamed from: C */
    private void m4584C() {
        boolean z;
        if (this.f3011af != null) {
            this.f3011af.onRelease();
            z = this.f3011af.isFinished();
        } else {
            z = false;
        }
        if (this.f3012ag != null) {
            this.f3012ag.onRelease();
            z |= this.f3012ag.isFinished();
        }
        if (this.f3013ah != null) {
            this.f3013ah.onRelease();
            z |= this.f3013ah.isFinished();
        }
        if (this.f3014ai != null) {
            this.f3014ai.onRelease();
            z |= this.f3014ai.isFinished();
        }
        if (z) {
            C0626s.m2857c(this);
        }
    }

    /* renamed from: D */
    private void m4585D() {
        if (this.f3017al != null) {
            this.f3017al.clear();
        }
        mo4201g(0);
        m4584C();
    }

    /* renamed from: E */
    private void m4586E() {
        m4585D();
        setScrollState(0);
    }

    /* renamed from: F */
    private void m4587F() {
        int i = this.f2997W;
        this.f2997W = 0;
        if (i != 0 && mo4239n()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            C0582a.m2643a(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    /* renamed from: G */
    private boolean m4588G() {
        return this.f3053y != null && this.f3041m.mo4064b();
    }

    /* renamed from: H */
    private void m4589H() {
        if (this.f3051w) {
            this.f3033e.mo5430a();
            if (this.f3052x) {
                this.f3041m.mo4055a(this);
            }
        }
        if (m4588G()) {
            this.f3033e.mo5436b();
        } else {
            this.f3033e.mo5440e();
        }
        boolean z = false;
        boolean z2 = this.f2985D || this.f2986E;
        this.f2984C.f3140i = this.f3047s && this.f3053y != null && (this.f3051w || z2 || this.f3041m.f3087u) && (!this.f3051w || this.f3040l.mo4335d());
        C0955t tVar = this.f2984C;
        if (this.f2984C.f3140i && z2 && !this.f3051w && m4588G()) {
            z = true;
        }
        tVar.f3141j = z;
    }

    /* renamed from: I */
    private void m4590I() {
        C0958w wVar = null;
        View focusedChild = (!this.f3028aw || !hasFocus() || this.f3040l == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            wVar = mo4180d(focusedChild);
        }
        if (wVar == null) {
            m4591J();
            return;
        }
        this.f2984C.f3143l = this.f3040l.mo4335d() ? wVar.mo4587g() : -1;
        C0955t tVar = this.f2984C;
        int i = this.f3051w ? -1 : wVar.mo4597q() ? wVar.f3160d : wVar.mo4585e();
        tVar.f3142k = i;
        this.f2984C.f3144m = m4620m(wVar.f3157a);
    }

    /* renamed from: J */
    private void m4591J() {
        this.f2984C.f3143l = -1;
        this.f2984C.f3142k = -1;
        this.f2984C.f3144m = -1;
    }

    /* renamed from: K */
    private View m4592K() {
        int i = this.f2984C.f3142k != -1 ? this.f2984C.f3142k : 0;
        int e = this.f2984C.mo4561e();
        int i2 = i;
        while (i2 < e) {
            C0958w b = mo4157b(i2);
            if (b == null) {
                break;
            } else if (b.f3157a.hasFocusable()) {
                return b.f3157a;
            } else {
                i2++;
            }
        }
        int min = Math.min(e, i);
        while (true) {
            min--;
            if (min < 0) {
                return null;
            }
            C0958w b2 = mo4157b(min);
            if (b2 == null) {
                return null;
            }
            if (b2.f3157a.hasFocusable()) {
                return b2.f3157a;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00af, code lost:
        if (r0.isFocusable() != false) goto L_0x00b3;
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4593L() {
        /*
            r6 = this;
            boolean r0 = r6.f3028aw
            if (r0 == 0) goto L_0x00b6
            android.support.v7.widget.RecyclerView$a r0 = r6.f3040l
            if (r0 == 0) goto L_0x00b6
            boolean r0 = r6.hasFocus()
            if (r0 == 0) goto L_0x00b6
            int r0 = r6.getDescendantFocusability()
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r1) goto L_0x00b6
            int r0 = r6.getDescendantFocusability()
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r1) goto L_0x0026
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto L_0x0026
            goto L_0x00b6
        L_0x0026:
            boolean r0 = r6.isFocused()
            if (r0 != 0) goto L_0x0055
            android.view.View r0 = r6.getFocusedChild()
            boolean r1 = f2977N
            if (r1 == 0) goto L_0x004c
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L_0x0040
            boolean r1 = r0.hasFocus()
            if (r1 != 0) goto L_0x004c
        L_0x0040:
            android.support.v7.widget.ac r0 = r6.f3034f
            int r0 = r0.mo4951b()
            if (r0 != 0) goto L_0x0055
            r6.requestFocus()
            return
        L_0x004c:
            android.support.v7.widget.ac r1 = r6.f3034f
            boolean r0 = r1.mo4956c(r0)
            if (r0 != 0) goto L_0x0055
            return
        L_0x0055:
            android.support.v7.widget.RecyclerView$t r0 = r6.f2984C
            long r0 = r0.f3143l
            r2 = -1
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0071
            android.support.v7.widget.RecyclerView$a r0 = r6.f3040l
            boolean r0 = r0.mo4335d()
            if (r0 == 0) goto L_0x0071
            android.support.v7.widget.RecyclerView$t r0 = r6.f2984C
            long r0 = r0.f3143l
            android.support.v7.widget.RecyclerView$w r0 = r6.mo4133a(r0)
            goto L_0x0072
        L_0x0071:
            r0 = r4
        L_0x0072:
            if (r0 == 0) goto L_0x008a
            android.support.v7.widget.ac r1 = r6.f3034f
            android.view.View r5 = r0.f3157a
            boolean r1 = r1.mo4956c(r5)
            if (r1 != 0) goto L_0x008a
            android.view.View r1 = r0.f3157a
            boolean r1 = r1.hasFocusable()
            if (r1 != 0) goto L_0x0087
            goto L_0x008a
        L_0x0087:
            android.view.View r4 = r0.f3157a
            goto L_0x0096
        L_0x008a:
            android.support.v7.widget.ac r0 = r6.f3034f
            int r0 = r0.mo4951b()
            if (r0 <= 0) goto L_0x0096
            android.view.View r4 = r6.m4592K()
        L_0x0096:
            if (r4 == 0) goto L_0x00b6
            android.support.v7.widget.RecyclerView$t r0 = r6.f2984C
            int r0 = r0.f3144m
            long r0 = (long) r0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x00b2
            android.support.v7.widget.RecyclerView$t r0 = r6.f2984C
            int r0 = r0.f3144m
            android.view.View r0 = r4.findViewById(r0)
            if (r0 == 0) goto L_0x00b2
            boolean r1 = r0.isFocusable()
            if (r1 == 0) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            r0 = r4
        L_0x00b3:
            r0.requestFocus()
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.RecyclerView.m4593L():void");
    }

    /* renamed from: M */
    private void m4594M() {
        boolean z = true;
        this.f2984C.mo4555a(1);
        mo4145a(this.f2984C);
        this.f2984C.f3139h = false;
        mo4192e();
        this.f3035g.mo5395a();
        mo4236l();
        m4589H();
        m4590I();
        C0955t tVar = this.f2984C;
        if (!this.f2984C.f3140i || !this.f2986E) {
            z = false;
        }
        tVar.f3138g = z;
        this.f2986E = false;
        this.f2985D = false;
        this.f2984C.f3137f = this.f2984C.f3141j;
        this.f2984C.f3135d = this.f3040l.mo342a();
        m4608a(this.f2999aB);
        if (this.f2984C.f3140i) {
            int b = this.f3034f.mo4951b();
            for (int i = 0; i < b; i++) {
                C0958w e = m4616e(this.f3034f.mo4953b(i));
                if (!e.mo4583c() && (!e.mo4594n() || this.f3040l.mo4335d())) {
                    this.f3035g.mo5397a(e, this.f3053y.mo4346a(this.f2984C, e, C0931f.m4759e(e), e.mo4602u()));
                    if (this.f2984C.f3138g && e.mo4605x() && !e.mo4597q() && !e.mo4583c() && !e.mo4594n()) {
                        this.f3035g.mo5396a(mo4131a(e), e);
                    }
                }
            }
        }
        if (this.f2984C.f3141j) {
            mo4261s();
            boolean z2 = this.f2984C.f3136e;
            this.f2984C.f3136e = false;
            this.f3041m.mo4065c(this.f3032d, this.f2984C);
            this.f2984C.f3136e = z2;
            for (int i2 = 0; i2 < this.f3034f.mo4951b(); i2++) {
                C0958w e2 = m4616e(this.f3034f.mo4953b(i2));
                if (!e2.mo4583c() && !this.f3035g.mo5405d(e2)) {
                    int e3 = C0931f.m4759e(e2);
                    boolean a = e2.mo4580a(8192);
                    if (!a) {
                        e3 |= 4096;
                    }
                    C0934c a2 = this.f3053y.mo4346a(this.f2984C, e2, e3, e2.mo4602u());
                    if (a) {
                        mo4146a(e2, a2);
                    } else {
                        this.f3035g.mo5402b(e2, a2);
                    }
                }
            }
        }
        mo4285t();
        mo4238m();
        mo4149a(false);
        this.f2984C.f3134c = 2;
    }

    /* renamed from: N */
    private void m4595N() {
        mo4192e();
        mo4236l();
        this.f2984C.mo4555a(6);
        this.f3033e.mo5440e();
        this.f2984C.f3135d = this.f3040l.mo342a();
        this.f2984C.f3133b = 0;
        this.f2984C.f3137f = false;
        this.f3041m.mo4065c(this.f3032d, this.f2984C);
        this.f2984C.f3136e = false;
        this.f2991Q = null;
        this.f2984C.f3140i = this.f2984C.f3140i && this.f3053y != null;
        this.f2984C.f3134c = 4;
        mo4238m();
        mo4149a(false);
    }

    /* renamed from: O */
    private void m4596O() {
        this.f2984C.mo4555a(4);
        mo4192e();
        mo4236l();
        this.f2984C.f3134c = 1;
        if (this.f2984C.f3140i) {
            for (int b = this.f3034f.mo4951b() - 1; b >= 0; b--) {
                C0958w e = m4616e(this.f3034f.mo4953b(b));
                if (!e.mo4583c()) {
                    long a = mo4131a(e);
                    C0934c a2 = this.f3053y.mo4345a(this.f2984C, e);
                    C0958w a3 = this.f3035g.mo5394a(a);
                    if (a3 != null && !a3.mo4583c()) {
                        boolean a4 = this.f3035g.mo5399a(a3);
                        boolean a5 = this.f3035g.mo5399a(e);
                        if (!a4 || a3 != e) {
                            C0934c b2 = this.f3035g.mo5400b(a3);
                            this.f3035g.mo5404c(e, a2);
                            C0934c c = this.f3035g.mo5403c(e);
                            if (b2 == null) {
                                m4599a(a, e, a3);
                            } else {
                                m4602a(a3, e, b2, c, a4, a5);
                            }
                        }
                    }
                    this.f3035g.mo5404c(e, a2);
                }
            }
            this.f3035g.mo5398a(this.f3005aH);
        }
        this.f3041m.mo4417b(this.f3032d);
        this.f2984C.f3132a = this.f2984C.f3135d;
        this.f3051w = false;
        this.f3052x = false;
        this.f2984C.f3140i = false;
        this.f2984C.f3141j = false;
        this.f3041m.f3087u = false;
        if (this.f3032d.f3109b != null) {
            this.f3032d.f3109b.clear();
        }
        if (this.f3041m.f3091y) {
            this.f3041m.f3090x = 0;
            this.f3041m.f3091y = false;
            this.f3032d.mo4513b();
        }
        this.f3041m.mo4053a(this.f2984C);
        mo4238m();
        mo4149a(false);
        this.f3035g.mo5395a();
        if (m4619k(this.f2999aB[0], this.f2999aB[1])) {
            mo4230i(0, 0);
        }
        m4593L();
        m4591J();
    }

    /* renamed from: a */
    private String m4597a(Context context, String str) {
        if (str.charAt(0) == '.') {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            return sb.toString();
        } else if (str.contains(".")) {
            return str;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(RecyclerView.class.getPackage().getName());
            sb2.append('.');
            sb2.append(str);
            return sb2.toString();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0053  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4598a(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.mo4200g()
            android.widget.EdgeEffect r3 = r6.f3011af
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
        L_0x001c:
            android.support.p009v4.widget.C0695i.m3290a(r3, r4, r9)
            r9 = 1
            goto L_0x0039
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0038
            r6.mo4223h()
            android.widget.EdgeEffect r3 = r6.f3013ah
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L_0x001c
        L_0x0038:
            r9 = 0
        L_0x0039:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0053
            r6.mo4229i()
            android.widget.EdgeEffect r9 = r6.f3012ag
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            android.support.p009v4.widget.C0695i.m3290a(r9, r0, r7)
            goto L_0x006f
        L_0x0053:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x006e
            r6.mo4232j()
            android.widget.EdgeEffect r9 = r6.f3014ai
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            android.support.p009v4.widget.C0695i.m3290a(r9, r3, r0)
            goto L_0x006f
        L_0x006e:
            r1 = r9
        L_0x006f:
            if (r1 != 0) goto L_0x0079
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x0079
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007c
        L_0x0079:
            android.support.p009v4.view.C0626s.m2857c(r6)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.RecyclerView.m4598a(float, float, float, float):void");
    }

    /* renamed from: a */
    private void m4599a(long j, C0958w wVar, C0958w wVar2) {
        int b = this.f3034f.mo4951b();
        int i = 0;
        while (i < b) {
            C0958w e = m4616e(this.f3034f.mo4953b(i));
            if (e == wVar || mo4131a(e) != j) {
                i++;
            } else if (this.f3040l == null || !this.f3040l.mo4335d()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                sb.append(e);
                sb.append(" \n View Holder 2:");
                sb.append(wVar);
                sb.append(mo4134a());
                throw new IllegalStateException(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(e);
                sb2.append(" \n View Holder 2:");
                sb2.append(wVar);
                sb2.append(mo4134a());
                throw new IllegalStateException(sb2.toString());
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
        sb3.append(wVar2);
        sb3.append(" cannot be found but it is necessary for ");
        sb3.append(wVar);
        sb3.append(mo4134a());
        Log.e("RecyclerView", sb3.toString());
    }

    /* renamed from: a */
    private void m4600a(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String a = m4597a(context, trim);
                try {
                    Class asSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(a).asSubclass(C0937i.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(f2978O);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C0937i) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    StringBuilder sb = new StringBuilder();
                    sb.append(attributeSet.getPositionDescription());
                    sb.append(": Error creating LayoutManager ");
                    sb.append(a);
                    throw new IllegalStateException(sb.toString(), e2);
                } catch (ClassNotFoundException e3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(attributeSet.getPositionDescription());
                    sb2.append(": Unable to find LayoutManager ");
                    sb2.append(a);
                    throw new IllegalStateException(sb2.toString(), e3);
                } catch (InvocationTargetException e4) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(attributeSet.getPositionDescription());
                    sb3.append(": Could not instantiate the LayoutManager: ");
                    sb3.append(a);
                    throw new IllegalStateException(sb3.toString(), e4);
                } catch (InstantiationException e5) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(attributeSet.getPositionDescription());
                    sb4.append(": Could not instantiate the LayoutManager: ");
                    sb4.append(a);
                    throw new IllegalStateException(sb4.toString(), e5);
                } catch (IllegalAccessException e6) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(attributeSet.getPositionDescription());
                    sb5.append(": Cannot access non-public constructor ");
                    sb5.append(a);
                    throw new IllegalStateException(sb5.toString(), e6);
                } catch (ClassCastException e7) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(attributeSet.getPositionDescription());
                    sb6.append(": Class is not a LayoutManager ");
                    sb6.append(a);
                    throw new IllegalStateException(sb6.toString(), e7);
                }
            }
        }
    }

    /* renamed from: a */
    private void m4601a(C0926a aVar, boolean z, boolean z2) {
        if (this.f3040l != null) {
            this.f3040l.mo4327b((C0928c) this.f2990P);
            this.f3040l.mo4329b(this);
        }
        if (!z || z2) {
            mo4168c();
        }
        this.f3033e.mo5430a();
        C0926a aVar2 = this.f3040l;
        this.f3040l = aVar;
        if (aVar != null) {
            aVar.mo4324a((C0928c) this.f2990P);
            aVar.mo4326a(this);
        }
        if (this.f3041m != null) {
            this.f3041m.mo4390a(aVar2, this.f3040l);
        }
        this.f3032d.mo4505a(aVar2, this.f3040l, z);
        this.f2984C.f3136e = true;
    }

    /* renamed from: a */
    private void m4602a(C0958w wVar, C0958w wVar2, C0934c cVar, C0934c cVar2, boolean z, boolean z2) {
        wVar.mo4579a(false);
        if (z) {
            m4617e(wVar);
        }
        if (wVar != wVar2) {
            if (z2) {
                m4617e(wVar2);
            }
            wVar.f3164h = wVar2;
            m4617e(wVar);
            this.f3032d.mo4520c(wVar);
            wVar2.mo4579a(false);
            wVar2.f3165i = wVar;
        }
        if (this.f3053y.mo4350a(wVar, wVar2, cVar, cVar2)) {
            mo4253p();
        }
    }

    /* renamed from: a */
    static void m4606a(View view, Rect rect) {
        C0942j jVar = (C0942j) view.getLayoutParams();
        Rect rect2 = jVar.f3099d;
        rect.set((view.getLeft() - rect2.left) - jVar.leftMargin, (view.getTop() - rect2.top) - jVar.topMargin, view.getRight() + rect2.right + jVar.rightMargin, view.getBottom() + rect2.bottom + jVar.bottomMargin);
    }

    /* renamed from: a */
    private void m4607a(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f3038j.set(0, 0, view3.getWidth(), view3.getHeight());
        LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0942j) {
            C0942j jVar = (C0942j) layoutParams;
            if (!jVar.f3100e) {
                Rect rect = jVar.f3099d;
                this.f3038j.left -= rect.left;
                this.f3038j.right += rect.right;
                this.f3038j.top -= rect.top;
                this.f3038j.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f3038j);
            offsetRectIntoDescendantCoords(view, this.f3038j);
        }
        this.f3041m.mo4410a(this, view, this.f3038j, !this.f3047s, view2 == null);
    }

    /* renamed from: a */
    private void m4608a(int[] iArr) {
        int b = this.f3034f.mo4951b();
        if (b == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < b; i3++) {
            C0958w e = m4616e(this.f3034f.mo4953b(i3));
            if (!e.mo4583c()) {
                int d = e.mo4584d();
                if (d < i) {
                    i = d;
                }
                if (d > i2) {
                    i2 = d;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: a */
    private boolean m4609a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f2994T = null;
        }
        int size = this.f2993S.size();
        int i = 0;
        while (i < size) {
            C0945m mVar = (C0945m) this.f2993S.get(i);
            if (!mVar.mo4483a(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.f2994T = mVar;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m4610a(View view, View view2, int i) {
        boolean z = false;
        if (!(view2 == null || view2 == this)) {
            if (mo4167c(view2) == null) {
                return false;
            }
            if (view == null || mo4167c(view) == null) {
                return true;
            }
            this.f3038j.set(0, 0, view.getWidth(), view.getHeight());
            this.f2992R.set(0, 0, view2.getWidth(), view2.getHeight());
            offsetDescendantRectToMyCoords(view, this.f3038j);
            offsetDescendantRectToMyCoords(view2, this.f2992R);
            char c = 65535;
            int i2 = this.f3041m.mo4463u() == 1 ? -1 : 1;
            int i3 = ((this.f3038j.left < this.f2992R.left || this.f3038j.right <= this.f2992R.left) && this.f3038j.right < this.f2992R.right) ? 1 : ((this.f3038j.right > this.f2992R.right || this.f3038j.left >= this.f2992R.right) && this.f3038j.left > this.f2992R.left) ? -1 : 0;
            if ((this.f3038j.top < this.f2992R.top || this.f3038j.bottom <= this.f2992R.top) && this.f3038j.bottom < this.f2992R.bottom) {
                c = 1;
            } else if ((this.f3038j.bottom <= this.f2992R.bottom && this.f3038j.top < this.f2992R.bottom) || this.f3038j.top <= this.f2992R.top) {
                c = 0;
            }
            if (i != 17) {
                if (i == 33) {
                    if (c < 0) {
                        z = true;
                    }
                    return z;
                } else if (i == 66) {
                    if (i3 > 0) {
                        z = true;
                    }
                    return z;
                } else if (i != 130) {
                    switch (i) {
                        case 1:
                            if (c < 0 || (c == 0 && i3 * i2 <= 0)) {
                                z = true;
                            }
                            return z;
                        case 2:
                            if (c > 0 || (c == 0 && i3 * i2 >= 0)) {
                                z = true;
                            }
                            return z;
                        default:
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid direction: ");
                            sb.append(i);
                            sb.append(mo4134a());
                            throw new IllegalArgumentException(sb.toString());
                    }
                } else {
                    if (c > 0) {
                        z = true;
                    }
                    return z;
                }
            } else if (i3 < 0) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    private boolean m4613b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.f2994T != null) {
            if (action == 0) {
                this.f2994T = null;
            } else {
                this.f2994T.mo4484b(this, motionEvent);
                if (action == 3 || action == 1) {
                    this.f2994T = null;
                }
                return true;
            }
        }
        if (action != 0) {
            int size = this.f2993S.size();
            for (int i = 0; i < size; i++) {
                C0945m mVar = (C0945m) this.f2993S.get(i);
                if (mVar.mo4483a(this, motionEvent)) {
                    this.f2994T = mVar;
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    static void m4614c(C0958w wVar) {
        if (wVar.f3158b != null) {
            Object obj = wVar.f3158b.get();
            loop0:
            while (true) {
                View view = (View) obj;
                while (true) {
                    if (view == null) {
                        wVar.f3158b = null;
                        break loop0;
                    } else if (view != wVar.f3157a) {
                        obj = view.getParent();
                        if (!(obj instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private void m4615c(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3016ak) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f3016ak = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f3020ao = x;
            this.f3018am = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f3021ap = y;
            this.f3019an = y;
        }
    }

    /* renamed from: e */
    static C0958w m4616e(View view) {
        if (view == null) {
            return null;
        }
        return ((C0942j) view.getLayoutParams()).f3098c;
    }

    /* renamed from: e */
    private void m4617e(C0958w wVar) {
        View view = wVar.f3157a;
        boolean z = view.getParent() == this;
        this.f3032d.mo4520c(mo4158b(view));
        if (wVar.mo4598r()) {
            this.f3034f.mo4948a(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.f3034f.mo4950a(view, true);
        } else {
            this.f3034f.mo4958d(view);
        }
    }

    private C0618k getScrollingChildHelper() {
        if (this.f3000aC == null) {
            this.f3000aC = new C0618k(this);
        }
        return this.f3000aC;
    }

    /* renamed from: j */
    static RecyclerView m4618j(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView j = m4618j(viewGroup.getChildAt(i));
            if (j != null) {
                return j;
            }
        }
        return null;
    }

    /* renamed from: k */
    private boolean m4619k(int i, int i2) {
        m4608a(this.f2999aB);
        return (this.f2999aB[0] == i && this.f2999aB[1] == i2) ? false : true;
    }

    /* renamed from: m */
    private int m4620m(View view) {
        int id;
        loop0:
        while (true) {
            id = view.getId();
            while (true) {
                if (view.isFocused() || !(view instanceof ViewGroup) || !view.hasFocus()) {
                    return id;
                }
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                }
            }
        }
        return id;
    }

    /* renamed from: z */
    private void m4622z() {
        this.f3034f = new C0995ac(new C0997b() {
            /* renamed from: a */
            public int mo4297a() {
                return RecyclerView.this.getChildCount();
            }

            /* renamed from: a */
            public int mo4298a(View view) {
                return RecyclerView.this.indexOfChild(view);
            }

            /* renamed from: a */
            public void mo4299a(int i) {
                View childAt = RecyclerView.this.getChildAt(i);
                if (childAt != null) {
                    RecyclerView.this.mo4235k(childAt);
                    childAt.clearAnimation();
                }
                RecyclerView.this.removeViewAt(i);
            }

            /* renamed from: a */
            public void mo4300a(View view, int i) {
                RecyclerView.this.addView(view, i);
                RecyclerView.this.mo4237l(view);
            }

            /* renamed from: a */
            public void mo4301a(View view, int i, LayoutParams layoutParams) {
                C0958w e = RecyclerView.m4616e(view);
                if (e != null) {
                    if (e.mo4598r() || e.mo4583c()) {
                        e.mo4593m();
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Called attach on a child which is not detached: ");
                        sb.append(e);
                        sb.append(RecyclerView.this.mo4134a());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                RecyclerView.this.attachViewToParent(view, i, layoutParams);
            }

            /* renamed from: b */
            public C0958w mo4302b(View view) {
                return RecyclerView.m4616e(view);
            }

            /* renamed from: b */
            public View mo4303b(int i) {
                return RecyclerView.this.getChildAt(i);
            }

            /* renamed from: b */
            public void mo4304b() {
                int a = mo4297a();
                for (int i = 0; i < a; i++) {
                    View b = mo4303b(i);
                    RecyclerView.this.mo4235k(b);
                    b.clearAnimation();
                }
                RecyclerView.this.removeAllViews();
            }

            /* renamed from: c */
            public void mo4305c(int i) {
                View b = mo4303b(i);
                if (b != null) {
                    C0958w e = RecyclerView.m4616e(b);
                    if (e != null) {
                        if (!e.mo4598r() || e.mo4583c()) {
                            e.mo4582b(256);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("called detach on an already detached child ");
                            sb.append(e);
                            sb.append(RecyclerView.this.mo4134a());
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                }
                RecyclerView.this.detachViewFromParent(i);
            }

            /* renamed from: c */
            public void mo4306c(View view) {
                C0958w e = RecyclerView.m4616e(view);
                if (e != null) {
                    e.m5061a(RecyclerView.this);
                }
            }

            /* renamed from: d */
            public void mo4307d(View view) {
                C0958w e = RecyclerView.m4616e(view);
                if (e != null) {
                    e.m5065b(RecyclerView.this);
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public long mo4131a(C0958w wVar) {
        return this.f3040l.mo4335d() ? wVar.mo4587g() : (long) wVar.f3159c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0958w mo4132a(int i, boolean z) {
        int c = this.f3034f.mo4954c();
        C0958w wVar = null;
        for (int i2 = 0; i2 < c; i2++) {
            C0958w e = m4616e(this.f3034f.mo4957d(i2));
            if (e != null && !e.mo4597q()) {
                if (z) {
                    if (e.f3159c != i) {
                        continue;
                    }
                } else if (e.mo4584d() != i) {
                    continue;
                }
                if (!this.f3034f.mo4956c(e.f3157a)) {
                    return e;
                }
                wVar = e;
            }
        }
        return wVar;
    }

    /* renamed from: a */
    public C0958w mo4133a(long j) {
        C0958w wVar = null;
        if (this.f3040l != null && this.f3040l.mo4335d()) {
            int c = this.f3034f.mo4954c();
            for (int i = 0; i < c; i++) {
                C0958w e = m4616e(this.f3034f.mo4957d(i));
                if (e != null && !e.mo4597q() && e.mo4587g() == j) {
                    if (!this.f3034f.mo4956c(e.f3157a)) {
                        return e;
                    }
                    wVar = e;
                }
            }
        }
        return wVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo4134a() {
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        sb.append(super.toString());
        sb.append(", adapter:");
        sb.append(this.f3040l);
        sb.append(", layout:");
        sb.append(this.f3041m);
        sb.append(", context:");
        sb.append(getContext());
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4135a(int i) {
        if (this.f3041m != null) {
            this.f3041m.mo4095e(i);
            awakenScrollBars();
        }
    }

    /* renamed from: a */
    public void mo4136a(int i, int i2) {
        mo4137a(i, i2, (Interpolator) null);
    }

    /* renamed from: a */
    public void mo4137a(int i, int i2, Interpolator interpolator) {
        if (this.f3041m == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f3049u) {
            if (!this.f3041m.mo4096e()) {
                i = 0;
            }
            if (!this.f3041m.mo4099f()) {
                i2 = 0;
            }
            if (!(i == 0 && i2 == 0)) {
                this.f3054z.mo4569a(i, i2, interpolator);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4138a(int i, int i2, Object obj) {
        int c = this.f3034f.mo4954c();
        int i3 = i + i2;
        for (int i4 = 0; i4 < c; i4++) {
            View d = this.f3034f.mo4957d(i4);
            C0958w e = m4616e(d);
            if (e != null && !e.mo4583c() && e.f3159c >= i && e.f3159c < i3) {
                e.mo4582b(2);
                e.mo4578a(obj);
                ((C0942j) d.getLayoutParams()).f3100e = true;
            }
        }
        this.f3032d.mo4519c(i, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4139a(int i, int i2, boolean z) {
        int i3 = i + i2;
        int c = this.f3034f.mo4954c();
        for (int i4 = 0; i4 < c; i4++) {
            C0958w e = m4616e(this.f3034f.mo4957d(i4));
            if (e != null && !e.mo4583c()) {
                if (e.f3159c >= i3) {
                    e.mo4576a(-i2, z);
                } else if (e.f3159c >= i) {
                    e.mo4575a(i - 1, -i2, z);
                }
                this.f2984C.f3136e = true;
            }
        }
        this.f3032d.mo4504a(i, i2, z);
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4140a(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Trying to set fast scroller without both required drawables.");
            sb.append(mo4134a());
            throw new IllegalArgumentException(sb.toString());
        }
        Resources resources = getContext().getResources();
        new C1016ai(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C0823a.fastscroll_default_thickness), resources.getDimensionPixelSize(C0823a.fastscroll_minimum_range), resources.getDimensionPixelOffset(C0823a.fastscroll_margin));
    }

    /* renamed from: a */
    public void mo4141a(C0936h hVar) {
        mo4142a(hVar, -1);
    }

    /* renamed from: a */
    public void mo4142a(C0936h hVar, int i) {
        if (this.f3041m != null) {
            this.f3041m.mo4081a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f3043o.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.f3043o.add(hVar);
        } else {
            this.f3043o.add(i, hVar);
        }
        mo4255r();
        requestLayout();
    }

    /* renamed from: a */
    public void mo4143a(C0945m mVar) {
        this.f2993S.add(mVar);
    }

    /* renamed from: a */
    public void mo4144a(C0946n nVar) {
        if (this.f3030ay == null) {
            this.f3030ay = new ArrayList();
        }
        this.f3030ay.add(nVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4145a(C0955t tVar) {
        if (getScrollState() == 2) {
            OverScroller a = this.f3054z.f3153e;
            tVar.f3145n = a.getFinalX() - a.getCurrX();
            tVar.f3146o = a.getFinalY() - a.getCurrY();
            return;
        }
        tVar.f3145n = 0;
        tVar.f3146o = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4146a(C0958w wVar, C0934c cVar) {
        wVar.mo4574a(0, 8192);
        if (this.f2984C.f3138g && wVar.mo4605x() && !wVar.mo4597q() && !wVar.mo4583c()) {
            this.f3035g.mo5396a(mo4131a(wVar), wVar);
        }
        this.f3035g.mo5397a(wVar, cVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4147a(C0958w wVar, C0934c cVar, C0934c cVar2) {
        wVar.mo4579a(false);
        if (this.f3053y.mo4353b(wVar, cVar, cVar2)) {
            mo4253p();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4148a(String str) {
        if (mo4240o()) {
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot call this method while RecyclerView is computing a layout or scrolling");
                sb.append(mo4134a());
                throw new IllegalStateException(sb.toString());
            }
            throw new IllegalStateException(str);
        } else if (this.f3009ad > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(mo4134a());
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(sb2.toString()));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4149a(boolean z) {
        if (this.f2995U < 1) {
            this.f2995U = 1;
        }
        if (!z && !this.f3049u) {
            this.f3048t = false;
        }
        if (this.f2995U == 1) {
            if (z && this.f3048t && !this.f3049u && this.f3041m != null && this.f3040l != null) {
                mo4254q();
            }
            if (!this.f3049u) {
                this.f3048t = false;
            }
        }
        this.f2995U--;
    }

    /* renamed from: a */
    public boolean mo4150a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().mo2463a(i, i2, i3, i4, iArr, i5);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4151a(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        mo4181d();
        if (this.f3040l != null) {
            mo4192e();
            mo4236l();
            C0560c.m2558a("RV Scroll");
            mo4145a(this.f2984C);
            if (i != 0) {
                i6 = this.f3041m.mo4041a(i, this.f3032d, this.f2984C);
                i5 = i - i6;
            } else {
                i6 = 0;
                i5 = 0;
            }
            if (i2 != 0) {
                i4 = this.f3041m.mo4061b(i2, this.f3032d, this.f2984C);
                i3 = i2 - i4;
            } else {
                i4 = 0;
                i3 = 0;
            }
            C0560c.m2557a();
            mo4288w();
            mo4238m();
            mo4149a(false);
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (!this.f3043o.isEmpty()) {
            invalidate();
        }
        if (mo4150a(i6, i4, i5, i3, this.f3001aD, 0)) {
            this.f3020ao -= this.f3001aD[0];
            this.f3021ap -= this.f3001aD[1];
            if (motionEvent != null) {
                motionEvent.offsetLocation((float) this.f3001aD[0], (float) this.f3001aD[1]);
            }
            int[] iArr = this.f3003aF;
            iArr[0] = iArr[0] + this.f3001aD[0];
            int[] iArr2 = this.f3003aF;
            iArr2[1] = iArr2[1] + this.f3001aD[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && !C0615h.m2783d(motionEvent, 8194)) {
                m4598a(motionEvent.getX(), (float) i5, motionEvent.getY(), (float) i3);
            }
            mo4170c(i, i2);
        }
        if (!(i6 == 0 && i4 == 0)) {
            mo4230i(i6, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (i6 == 0 && i4 == 0) ? false : true;
    }

    /* renamed from: a */
    public boolean mo4152a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo2465a(i, i2, iArr, iArr2, i3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4153a(C0958w wVar, int i) {
        if (mo4240o()) {
            wVar.f3168l = i;
            this.f2989H.add(wVar);
            return false;
        }
        C0626s.m2854b(wVar.f3157a, i);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4154a(View view) {
        mo4192e();
        boolean f = this.f3034f.mo4961f(view);
        if (f) {
            C0958w e = m4616e(view);
            this.f3032d.mo4520c(e);
            this.f3032d.mo4515b(e);
        }
        mo4149a(!f);
        return f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4155a(AccessibilityEvent accessibilityEvent) {
        if (!mo4240o()) {
            return false;
        }
        int a = accessibilityEvent != null ? C0582a.m2642a(accessibilityEvent) : 0;
        if (a == 0) {
            a = 0;
        }
        this.f2997W = a | this.f2997W;
        return true;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (this.f3041m == null || !this.f3041m.mo4412a(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* renamed from: b */
    public C0958w mo4157b(int i) {
        C0958w wVar = null;
        if (this.f3051w) {
            return null;
        }
        int c = this.f3034f.mo4954c();
        for (int i2 = 0; i2 < c; i2++) {
            C0958w e = m4616e(this.f3034f.mo4957d(i2));
            if (e != null && !e.mo4597q() && mo4179d(e) == i) {
                if (!this.f3034f.mo4956c(e.f3157a)) {
                    return e;
                }
                wVar = e;
            }
        }
        return wVar;
    }

    /* renamed from: b */
    public C0958w mo4158b(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m4616e(view);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a direct child of ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4159b() {
        this.f3033e = new C1103e(new C1104a() {
            /* renamed from: a */
            public C0958w mo4308a(int i) {
                C0958w a = RecyclerView.this.mo4132a(i, true);
                if (a != null && !RecyclerView.this.f3034f.mo4956c(a.f3157a)) {
                    return a;
                }
                return null;
            }

            /* renamed from: a */
            public void mo4309a(int i, int i2) {
                RecyclerView.this.mo4139a(i, i2, true);
                RecyclerView.this.f2985D = true;
                RecyclerView.this.f2984C.f3133b += i2;
            }

            /* renamed from: a */
            public void mo4310a(int i, int i2, Object obj) {
                RecyclerView.this.mo4138a(i, i2, obj);
                RecyclerView.this.f2986E = true;
            }

            /* renamed from: a */
            public void mo4311a(C1105b bVar) {
                mo4315c(bVar);
            }

            /* renamed from: b */
            public void mo4312b(int i, int i2) {
                RecyclerView.this.mo4139a(i, i2, false);
                RecyclerView.this.f2985D = true;
            }

            /* renamed from: b */
            public void mo4313b(C1105b bVar) {
                mo4315c(bVar);
            }

            /* renamed from: c */
            public void mo4314c(int i, int i2) {
                RecyclerView.this.mo4202g(i, i2);
                RecyclerView.this.f2985D = true;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: c */
            public void mo4315c(C1105b bVar) {
                int i = bVar.f3840a;
                if (i == 4) {
                    RecyclerView.this.f3041m.mo4058a(RecyclerView.this, bVar.f3841b, bVar.f3843d, bVar.f3842c);
                } else if (i != 8) {
                    switch (i) {
                        case 1:
                            RecyclerView.this.f3041m.mo4056a(RecyclerView.this, bVar.f3841b, bVar.f3843d);
                            return;
                        case 2:
                            RecyclerView.this.f3041m.mo4063b(RecyclerView.this, bVar.f3841b, bVar.f3843d);
                            return;
                        default:
                            return;
                    }
                } else {
                    RecyclerView.this.f3041m.mo4057a(RecyclerView.this, bVar.f3841b, bVar.f3843d, 1);
                }
            }

            /* renamed from: d */
            public void mo4316d(int i, int i2) {
                RecyclerView.this.mo4198f(i, i2);
                RecyclerView.this.f2985D = true;
            }
        });
    }

    /* renamed from: b */
    public void mo4160b(C0936h hVar) {
        if (this.f3041m != null) {
            this.f3041m.mo4081a("Cannot remove item decoration during a scroll  or layout");
        }
        this.f3043o.remove(hVar);
        if (this.f3043o.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        mo4255r();
        requestLayout();
    }

    /* renamed from: b */
    public void mo4161b(C0945m mVar) {
        this.f2993S.remove(mVar);
        if (this.f2994T == mVar) {
            this.f2994T = null;
        }
    }

    /* renamed from: b */
    public void mo4162b(C0946n nVar) {
        if (this.f3030ay != null) {
            this.f3030ay.remove(nVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4163b(C0958w wVar, C0934c cVar, C0934c cVar2) {
        m4617e(wVar);
        wVar.mo4579a(false);
        if (this.f3053y.mo4349a(wVar, cVar, cVar2)) {
            mo4253p();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4164b(boolean z) {
        this.f3008ac--;
        if (this.f3008ac < 1) {
            this.f3008ac = 0;
            if (z) {
                m4587F();
                mo4289x();
            }
        }
    }

    /* renamed from: b */
    public boolean mo4165b(int i, int i2) {
        int i3 = 0;
        if (this.f3041m == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.f3049u) {
            return false;
        } else {
            boolean e = this.f3041m.mo4096e();
            boolean f = this.f3041m.mo4099f();
            if (!e || Math.abs(i) < this.f3024as) {
                i = 0;
            }
            if (!f || Math.abs(i2) < this.f3024as) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            float f2 = (float) i;
            float f3 = (float) i2;
            if (!dispatchNestedPreFling(f2, f3)) {
                boolean z = e || f;
                dispatchNestedFling(f2, f3, z);
                if (this.f3023ar != null && this.f3023ar.mo4481a(i, i2)) {
                    return true;
                }
                if (z) {
                    if (e) {
                        i3 = 1;
                    }
                    if (f) {
                        i3 |= 2;
                    }
                    mo4233j(i3, 1);
                    this.f3054z.mo4565a(Math.max(-this.f3025at, Math.min(i, this.f3025at)), Math.max(-this.f3025at, Math.min(i2, this.f3025at)));
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo4166b(C0958w wVar) {
        return this.f3053y == null || this.f3053y.mo4351a(wVar, wVar.mo4602u());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo4167c(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0010
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0010
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.RecyclerView.mo4167c(android.view.View):android.view.View");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo4168c() {
        if (this.f3053y != null) {
            this.f3053y.mo4355d();
        }
        if (this.f3041m != null) {
            this.f3041m.mo4424c(this.f3032d);
            this.f3041m.mo4417b(this.f3032d);
        }
        this.f3032d.mo4501a();
    }

    /* renamed from: c */
    public void mo4169c(int i) {
        int b = this.f3034f.mo4951b();
        for (int i2 = 0; i2 < b; i2++) {
            this.f3034f.mo4953b(i2).offsetTopAndBottom(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo4170c(int i, int i2) {
        boolean z;
        if (this.f3011af == null || this.f3011af.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f3011af.onRelease();
            z = this.f3011af.isFinished();
        }
        if (this.f3013ah != null && !this.f3013ah.isFinished() && i < 0) {
            this.f3013ah.onRelease();
            z |= this.f3013ah.isFinished();
        }
        if (this.f3012ag != null && !this.f3012ag.isFinished() && i2 > 0) {
            this.f3012ag.onRelease();
            z |= this.f3012ag.isFinished();
        }
        if (this.f3014ai != null && !this.f3014ai.isFinished() && i2 < 0) {
            this.f3014ai.onRelease();
            z |= this.f3014ai.isFinished();
        }
        if (z) {
            C0626s.m2857c(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo4171c(boolean z) {
        this.f3052x = z | this.f3052x;
        this.f3051w = true;
        mo4286u();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0942j) && this.f3041m.mo4060a((C0942j) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        int i = 0;
        if (this.f3041m == null) {
            return 0;
        }
        if (this.f3041m.mo4096e()) {
            i = this.f3041m.mo4094e(this.f2984C);
        }
        return i;
    }

    public int computeHorizontalScrollOffset() {
        int i = 0;
        if (this.f3041m == null) {
            return 0;
        }
        if (this.f3041m.mo4096e()) {
            i = this.f3041m.mo4087c(this.f2984C);
        }
        return i;
    }

    public int computeHorizontalScrollRange() {
        int i = 0;
        if (this.f3041m == null) {
            return 0;
        }
        if (this.f3041m.mo4096e()) {
            i = this.f3041m.mo4101g(this.f2984C);
        }
        return i;
    }

    public int computeVerticalScrollExtent() {
        int i = 0;
        if (this.f3041m == null) {
            return 0;
        }
        if (this.f3041m.mo4099f()) {
            i = this.f3041m.mo4098f(this.f2984C);
        }
        return i;
    }

    public int computeVerticalScrollOffset() {
        int i = 0;
        if (this.f3041m == null) {
            return 0;
        }
        if (this.f3041m.mo4099f()) {
            i = this.f3041m.mo4091d(this.f2984C);
        }
        return i;
    }

    public int computeVerticalScrollRange() {
        int i = 0;
        if (this.f3041m == null) {
            return 0;
        }
        if (this.f3041m.mo4099f()) {
            i = this.f3041m.mo4102h(this.f2984C);
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo4179d(C0958w wVar) {
        if (wVar.mo4580a(524) || !wVar.mo4596p()) {
            return -1;
        }
        return this.f3033e.mo5437c(wVar.f3159c);
    }

    /* renamed from: d */
    public C0958w mo4180d(View view) {
        View c = mo4167c(view);
        if (c == null) {
            return null;
        }
        return mo4158b(c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo4181d() {
        if (!this.f3047s || this.f3051w) {
            C0560c.m2558a("RV FullInvalidate");
            mo4254q();
            C0560c.m2557a();
        } else if (this.f3033e.mo5439d()) {
            if (!this.f3033e.mo5433a(4) || this.f3033e.mo5433a(11)) {
                if (this.f3033e.mo5439d()) {
                    C0560c.m2558a("RV FullInvalidate");
                    mo4254q();
                }
            }
            C0560c.m2558a("RV PartialInvalidate");
            mo4192e();
            mo4236l();
            this.f3033e.mo5436b();
            if (!this.f3048t) {
                if (m4582A()) {
                    mo4254q();
                } else {
                    this.f3033e.mo5438c();
                }
            }
            mo4149a(true);
            mo4238m();
            C0560c.m2557a();
        }
    }

    /* renamed from: d */
    public void mo4182d(int i) {
        int b = this.f3034f.mo4951b();
        for (int i2 = 0; i2 < b; i2++) {
            this.f3034f.mo4953b(i2).offsetLeftAndRight(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo4183d(int i, int i2) {
        if (i < 0) {
            mo4200g();
            this.f3011af.onAbsorb(-i);
        } else if (i > 0) {
            mo4223h();
            this.f3013ah.onAbsorb(i);
        }
        if (i2 < 0) {
            mo4229i();
            this.f3012ag.onAbsorb(-i2);
        } else if (i2 > 0) {
            mo4232j();
            this.f3014ai.onAbsorb(i2);
        }
        if (i != 0 || i2 != 0) {
            C0626s.m2857c(this);
        }
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo2459a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo2458a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo2464a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo2462a(i, i2, i3, i4, iArr);
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        float f;
        int i;
        super.draw(canvas);
        int size = this.f3043o.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ((C0936h) this.f3043o.get(i2)).mo4371a(canvas, this, this.f2984C);
        }
        if (this.f3011af == null || this.f3011af.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f3036h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            z = this.f3011af != null && this.f3011af.draw(canvas);
            canvas.restoreToCount(save);
        }
        if (this.f3012ag != null && !this.f3012ag.isFinished()) {
            int save2 = canvas.save();
            if (this.f3036h) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            z |= this.f3012ag != null && this.f3012ag.draw(canvas);
            canvas.restoreToCount(save2);
        }
        if (this.f3013ah != null && !this.f3013ah.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f3036h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            z |= this.f3013ah != null && this.f3013ah.draw(canvas);
            canvas.restoreToCount(save3);
        }
        if (this.f3014ai == null || this.f3014ai.isFinished()) {
            z2 = z;
        } else {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f3036h) {
                f = (float) ((-getWidth()) + getPaddingRight());
                i = (-getHeight()) + getPaddingBottom();
            } else {
                f = (float) (-getWidth());
                i = -getHeight();
            }
            canvas.translate(f, (float) i);
            if (this.f3014ai != null && this.f3014ai.draw(canvas)) {
                z3 = true;
            }
            z2 = z3 | z;
            canvas.restoreToCount(save4);
        }
        if (!z2 && this.f3053y != null && this.f3043o.size() > 0 && this.f3053y.mo4352b()) {
            z2 = true;
        }
        if (z2) {
            C0626s.m2857c(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo4192e() {
        this.f2995U++;
        if (this.f2995U == 1 && !this.f3049u) {
            this.f3048t = false;
        }
    }

    /* renamed from: e */
    public void mo4193e(int i) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo4194e(int i, int i2) {
        setMeasuredDimension(C0937i.m4792a(i, getPaddingLeft() + getPaddingRight(), C0626s.m2866i(this)), C0937i.m4792a(i2, getPaddingTop() + getPaddingBottom(), C0626s.m2867j(this)));
    }

    /* renamed from: f */
    public int mo4195f(View view) {
        C0958w e = m4616e(view);
        if (e != null) {
            return e.mo4584d();
        }
        return -1;
    }

    /* renamed from: f */
    public void mo4196f() {
        setScrollState(0);
        m4583B();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo4197f(int i) {
        if (this.f3041m != null) {
            this.f3041m.mo4454l(i);
        }
        mo4193e(i);
        if (this.f3029ax != null) {
            this.f3029ax.mo4485a(this, i);
        }
        if (this.f3030ay != null) {
            for (int size = this.f3030ay.size() - 1; size >= 0; size--) {
                ((C0946n) this.f3030ay.get(size)).mo4485a(this, i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo4198f(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int c = this.f3034f.mo4954c();
        if (i < i2) {
            i5 = i;
            i4 = i2;
            i3 = -1;
        } else {
            i4 = i;
            i5 = i2;
            i3 = 1;
        }
        for (int i6 = 0; i6 < c; i6++) {
            C0958w e = m4616e(this.f3034f.mo4957d(i6));
            if (e != null && e.f3159c >= i5 && e.f3159c <= i4) {
                if (e.f3159c == i) {
                    e.mo4576a(i2 - i, false);
                } else {
                    e.mo4576a(i3, false);
                }
                this.f2984C.f3136e = true;
            }
        }
        this.f3032d.mo4503a(i, i2);
        requestLayout();
    }

    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View d = this.f3041m.mo4432d(view, i);
        if (d != null) {
            return d;
        }
        boolean z2 = this.f3040l != null && this.f3041m != null && !mo4240o() && !this.f3049u;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z2 || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z2) {
                view2 = findNextFocus;
            } else {
                mo4181d();
                if (mo4167c(view) == null) {
                    return null;
                }
                mo4192e();
                view2 = this.f3041m.mo4047a(view, i, this.f3032d, this.f2984C);
                mo4149a(false);
            }
        } else {
            if (this.f3041m.mo4099f()) {
                int i2 = i == 2 ? 130 : 33;
                z = instance.findNextFocus(this, view, i2) == null;
                if (f2976M) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.f3041m.mo4096e()) {
                int i3 = (this.f3041m.mo4463u() == 1) ^ (i == 2) ? 66 : 17;
                z = instance.findNextFocus(this, view, i3) == null;
                if (f2976M) {
                    i = i3;
                }
            }
            if (z) {
                mo4181d();
                if (mo4167c(view) == null) {
                    return null;
                }
                mo4192e();
                this.f3041m.mo4047a(view, i, this.f3032d, this.f2984C);
                mo4149a(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            if (!m4610a(view, view2, i)) {
                view2 = super.focusSearch(view, i);
            }
            return view2;
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        } else {
            m4607a(view2, (View) null);
            return view;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo4200g() {
        EdgeEffect edgeEffect;
        int measuredHeight;
        int measuredWidth;
        if (this.f3011af == null) {
            this.f3011af = this.f3010ae.mo4344a(this, 0);
            if (this.f3036h) {
                edgeEffect = this.f3011af;
                measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                edgeEffect = this.f3011af;
                measuredHeight = getMeasuredHeight();
                measuredWidth = getMeasuredWidth();
            }
            edgeEffect.setSize(measuredHeight, measuredWidth);
        }
    }

    /* renamed from: g */
    public void mo4201g(int i) {
        getScrollingChildHelper().mo2469c(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo4202g(int i, int i2) {
        int c = this.f3034f.mo4954c();
        for (int i3 = 0; i3 < c; i3++) {
            C0958w e = m4616e(this.f3034f.mo4957d(i3));
            if (e != null && !e.mo4583c() && e.f3159c >= i) {
                e.mo4576a(i2, false);
                this.f2984C.f3136e = true;
            }
        }
        this.f3032d.mo4514b(i, i2);
        requestLayout();
    }

    /* renamed from: g */
    public void mo4203g(View view) {
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        if (this.f3041m != null) {
            return this.f3041m.mo4043a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(mo4134a());
        throw new IllegalStateException(sb.toString());
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (this.f3041m != null) {
            return this.f3041m.mo4044a(getContext(), attributeSet);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(mo4134a());
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        if (this.f3041m != null) {
            return this.f3041m.mo4045a(layoutParams);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(mo4134a());
        throw new IllegalStateException(sb.toString());
    }

    public C0926a getAdapter() {
        return this.f3040l;
    }

    public int getBaseline() {
        return this.f3041m != null ? this.f3041m.mo4464v() : super.getBaseline();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        return this.f2998aA == null ? super.getChildDrawingOrder(i, i2) : this.f2998aA.mo4343a(i, i2);
    }

    public boolean getClipToPadding() {
        return this.f3036h;
    }

    public C1052av getCompatAccessibilityDelegate() {
        return this.f2988G;
    }

    public C0930e getEdgeEffectFactory() {
        return this.f3010ae;
    }

    public C0931f getItemAnimator() {
        return this.f3053y;
    }

    public int getItemDecorationCount() {
        return this.f3043o.size();
    }

    public C0937i getLayoutManager() {
        return this.f3041m;
    }

    public int getMaxFlingVelocity() {
        return this.f3025at;
    }

    public int getMinFlingVelocity() {
        return this.f3024as;
    }

    /* access modifiers changed from: 0000 */
    public long getNanoTime() {
        if (f2975L) {
            return System.nanoTime();
        }
        return 0;
    }

    public C0944l getOnFlingListener() {
        return this.f3023ar;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f3028aw;
    }

    public C0947o getRecycledViewPool() {
        return this.f3032d.mo4529g();
    }

    public int getScrollState() {
        return this.f3015aj;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo4223h() {
        EdgeEffect edgeEffect;
        int measuredHeight;
        int measuredWidth;
        if (this.f3013ah == null) {
            this.f3013ah = this.f3010ae.mo4344a(this, 2);
            if (this.f3036h) {
                edgeEffect = this.f3013ah;
                measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                edgeEffect = this.f3013ah;
                measuredHeight = getMeasuredHeight();
                measuredWidth = getMeasuredWidth();
            }
            edgeEffect.setSize(measuredHeight, measuredWidth);
        }
    }

    /* renamed from: h */
    public void mo4224h(int i, int i2) {
    }

    /* renamed from: h */
    public void mo4225h(View view) {
    }

    /* renamed from: h */
    public boolean mo4226h(int i) {
        return getScrollingChildHelper().mo2460a(i);
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo2466b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public Rect mo4228i(View view) {
        C0942j jVar = (C0942j) view.getLayoutParams();
        if (!jVar.f3100e) {
            return jVar.f3099d;
        }
        if (this.f2984C.mo4557a() && (jVar.mo4477e() || jVar.mo4475c())) {
            return jVar.f3099d;
        }
        Rect rect = jVar.f3099d;
        rect.set(0, 0, 0, 0);
        int size = this.f3043o.size();
        for (int i = 0; i < size; i++) {
            this.f3038j.set(0, 0, 0, 0);
            ((C0936h) this.f3043o.get(i)).mo4373a(this.f3038j, view, this, this.f2984C);
            rect.left += this.f3038j.left;
            rect.top += this.f3038j.top;
            rect.right += this.f3038j.right;
            rect.bottom += this.f3038j.bottom;
        }
        jVar.f3100e = false;
        return rect;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo4229i() {
        EdgeEffect edgeEffect;
        int measuredWidth;
        int measuredHeight;
        if (this.f3012ag == null) {
            this.f3012ag = this.f3010ae.mo4344a(this, 1);
            if (this.f3036h) {
                edgeEffect = this.f3012ag;
                measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                edgeEffect = this.f3012ag;
                measuredWidth = getMeasuredWidth();
                measuredHeight = getMeasuredHeight();
            }
            edgeEffect.setSize(measuredWidth, measuredHeight);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo4230i(int i, int i2) {
        this.f3009ad++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        mo4224h(i, i2);
        if (this.f3029ax != null) {
            this.f3029ax.mo4486a(this, i, i2);
        }
        if (this.f3030ay != null) {
            for (int size = this.f3030ay.size() - 1; size >= 0; size--) {
                ((C0946n) this.f3030ay.get(size)).mo4486a(this, i, i2);
            }
        }
        this.f3009ad--;
    }

    public boolean isAttachedToWindow() {
        return this.f3044p;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().mo2457a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo4232j() {
        EdgeEffect edgeEffect;
        int measuredWidth;
        int measuredHeight;
        if (this.f3014ai == null) {
            this.f3014ai = this.f3010ae.mo4344a(this, 3);
            if (this.f3036h) {
                edgeEffect = this.f3014ai;
                measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                edgeEffect = this.f3014ai;
                measuredWidth = getMeasuredWidth();
                measuredHeight = getMeasuredHeight();
            }
            edgeEffect.setSize(measuredWidth, measuredHeight);
        }
    }

    /* renamed from: j */
    public boolean mo4233j(int i, int i2) {
        return getScrollingChildHelper().mo2461a(i, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo4234k() {
        this.f3014ai = null;
        this.f3012ag = null;
        this.f3013ah = null;
        this.f3011af = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo4235k(View view) {
        C0958w e = m4616e(view);
        mo4225h(view);
        if (!(this.f3040l == null || e == null)) {
            this.f3040l.mo4334d(e);
        }
        if (this.f3007ab != null) {
            for (int size = this.f3007ab.size() - 1; size >= 0; size--) {
                ((C0943k) this.f3007ab.get(size)).mo4480b(view);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo4236l() {
        this.f3008ac++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo4237l(View view) {
        C0958w e = m4616e(view);
        mo4203g(view);
        if (!(this.f3040l == null || e == null)) {
            this.f3040l.mo4333c(e);
        }
        if (this.f3007ab != null) {
            for (int size = this.f3007ab.size() - 1; size >= 0; size--) {
                ((C0943k) this.f3007ab.get(size)).mo4479a(view);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo4238m() {
        mo4164b(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public boolean mo4239n() {
        return this.f3006aa != null && this.f3006aa.isEnabled();
    }

    /* renamed from: o */
    public boolean mo4240o() {
        return this.f3008ac > 0;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        if (r0 >= 30.0f) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            r0 = 0
            r4.f3008ac = r0
            r1 = 1
            r4.f3044p = r1
            boolean r2 = r4.f3047s
            if (r2 == 0) goto L_0x0014
            boolean r2 = r4.isLayoutRequested()
            if (r2 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            r4.f3047s = r1
            android.support.v7.widget.RecyclerView$i r1 = r4.f3041m
            if (r1 == 0) goto L_0x0020
            android.support.v7.widget.RecyclerView$i r1 = r4.f3041m
            r1.mo4425c(r4)
        L_0x0020:
            r4.f2987F = r0
            boolean r0 = f2975L
            if (r0 == 0) goto L_0x006b
            java.lang.ThreadLocal<android.support.v7.widget.al> r0 = android.support.p023v7.widget.C1026al.f3534a
            java.lang.Object r0 = r0.get()
            android.support.v7.widget.al r0 = (android.support.p023v7.widget.C1026al) r0
            r4.f2982A = r0
            android.support.v7.widget.al r0 = r4.f2982A
            if (r0 != 0) goto L_0x0066
            android.support.v7.widget.al r0 = new android.support.v7.widget.al
            r0.<init>()
            r4.f2982A = r0
            android.view.Display r0 = android.support.p009v4.view.C0626s.m2835B(r4)
            r1 = 1114636288(0x42700000, float:60.0)
            boolean r2 = r4.isInEditMode()
            if (r2 != 0) goto L_0x0054
            if (r0 == 0) goto L_0x0054
            float r0 = r0.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r0 = 1114636288(0x42700000, float:60.0)
        L_0x0056:
            android.support.v7.widget.al r1 = r4.f2982A
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r2 = r2 / r0
            long r2 = (long) r2
            r1.f3538d = r2
            java.lang.ThreadLocal<android.support.v7.widget.al> r0 = android.support.p023v7.widget.C1026al.f3534a
            android.support.v7.widget.al r1 = r4.f2982A
            r0.set(r1)
        L_0x0066:
            android.support.v7.widget.al r0 = r4.f2982A
            r0.mo5069a(r4)
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.RecyclerView.onAttachedToWindow():void");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f3053y != null) {
            this.f3053y.mo4355d();
        }
        mo4196f();
        this.f3044p = false;
        if (this.f3041m != null) {
            this.f3041m.mo4419b(this, this.f3032d);
        }
        this.f2989H.clear();
        removeCallbacks(this.f3004aG);
        this.f3035g.mo5401b();
        if (f2975L && this.f2982A != null) {
            this.f2982A.mo5071b(this);
            this.f2982A = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f3043o.size();
        for (int i = 0; i < size; i++) {
            ((C0936h) this.f3043o.get(i)).mo4375b(canvas, this, this.f2984C);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.f3041m != null && !this.f3049u && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f3041m.mo4099f() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f3041m.mo4096e()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        mo4151a((int) (f * this.f3026au), (int) (f2 * this.f3027av), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f3041m.mo4099f()) {
                        f2 = -axisValue;
                    } else if (this.f3041m.mo4096e()) {
                        f = axisValue;
                        f2 = 0.0f;
                        mo4151a((int) (f * this.f3026au), (int) (f2 * this.f3027av), motionEvent);
                    }
                }
                f2 = 0.0f;
            }
            f = 0.0f;
            mo4151a((int) (f * this.f3026au), (int) (f2 * this.f3027av), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2 = false;
        if (this.f3049u) {
            return false;
        }
        if (m4609a(motionEvent)) {
            m4586E();
            return true;
        } else if (this.f3041m == null) {
            return false;
        } else {
            boolean e = this.f3041m.mo4096e();
            boolean f = this.f3041m.mo4099f();
            if (this.f3017al == null) {
                this.f3017al = VelocityTracker.obtain();
            }
            this.f3017al.addMovement(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            switch (actionMasked) {
                case 0:
                    if (this.f2996V) {
                        this.f2996V = false;
                    }
                    this.f3016ak = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.f3020ao = x;
                    this.f3018am = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.f3021ap = y;
                    this.f3019an = y;
                    if (this.f3015aj == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                    }
                    int[] iArr = this.f3003aF;
                    this.f3003aF[1] = 0;
                    iArr[0] = 0;
                    int i = e ? 1 : 0;
                    if (f) {
                        i |= 2;
                    }
                    mo4233j(i, 0);
                    break;
                case 1:
                    this.f3017al.clear();
                    mo4201g(0);
                    break;
                case 2:
                    int findPointerIndex = motionEvent.findPointerIndex(this.f3016ak);
                    if (findPointerIndex >= 0) {
                        int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        if (this.f3015aj != 1) {
                            int i2 = x2 - this.f3018am;
                            int i3 = y2 - this.f3019an;
                            if (!e || Math.abs(i2) <= this.f3022aq) {
                                z = false;
                            } else {
                                this.f3020ao = x2;
                                z = true;
                            }
                            if (f && Math.abs(i3) > this.f3022aq) {
                                this.f3021ap = y2;
                                z = true;
                            }
                            if (z) {
                                setScrollState(1);
                                break;
                            }
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error processing scroll; pointer index for id ");
                        sb.append(this.f3016ak);
                        sb.append(" not found. Did any MotionEvents get skipped?");
                        Log.e("RecyclerView", sb.toString());
                        return false;
                    }
                    break;
                case 3:
                    m4586E();
                    break;
                case 5:
                    this.f3016ak = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f3020ao = x3;
                    this.f3018am = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f3021ap = y3;
                    this.f3019an = y3;
                    break;
                case 6:
                    m4615c(motionEvent);
                    break;
            }
            if (this.f3015aj == 1) {
                z2 = true;
            }
            return z2;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0560c.m2558a("RV OnLayout");
        mo4254q();
        C0560c.m2557a();
        this.f3047s = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f3041m == null) {
            mo4194e(i, i2);
            return;
        }
        boolean z = false;
        if (this.f3041m.mo4090c()) {
            int mode = MeasureSpec.getMode(i);
            int mode2 = MeasureSpec.getMode(i2);
            this.f3041m.mo4392a(this.f3032d, this.f2984C, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z && this.f3040l != null) {
                if (this.f2984C.f3134c == 1) {
                    m4594M();
                }
                this.f3041m.mo4433d(i, i2);
                this.f2984C.f3139h = true;
                m4595N();
                this.f3041m.mo4436e(i, i2);
                if (this.f3041m.mo4107l()) {
                    this.f3041m.mo4433d(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f2984C.f3139h = true;
                    m4595N();
                    this.f3041m.mo4436e(i, i2);
                }
            }
        } else if (this.f3045q) {
            this.f3041m.mo4392a(this.f3032d, this.f2984C, i, i2);
        } else {
            if (this.f3050v) {
                mo4192e();
                mo4236l();
                m4589H();
                mo4238m();
                if (this.f2984C.f3141j) {
                    this.f2984C.f3137f = true;
                } else {
                    this.f3033e.mo5440e();
                    this.f2984C.f3137f = false;
                }
                this.f3050v = false;
                mo4149a(false);
            } else if (this.f2984C.f3141j) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            if (this.f3040l != null) {
                this.f2984C.f3135d = this.f3040l.mo342a();
            } else {
                this.f2984C.f3135d = 0;
            }
            mo4192e();
            this.f3041m.mo4392a(this.f3032d, this.f2984C, i, i2);
            mo4149a(false);
            this.f2984C.f3137f = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (mo4240o()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        this.f2991Q = (SavedState) parcelable;
        super.onRestoreInstanceState(this.f2991Q.mo2234a());
        if (!(this.f3041m == null || this.f2991Q.f3060a == null)) {
            this.f3041m.mo4078a(this.f2991Q.f3060a);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f2991Q != null) {
            savedState.mo4317a(this.f2991Q);
        } else {
            savedState.f3060a = this.f3041m != null ? this.f3041m.mo4093d() : null;
        }
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            mo4234k();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        boolean z;
        boolean z2 = false;
        if (this.f3049u || this.f2996V) {
            return false;
        }
        if (m4613b(motionEvent)) {
            m4586E();
            return true;
        } else if (this.f3041m == null) {
            return false;
        } else {
            boolean e = this.f3041m.mo4096e();
            boolean f = this.f3041m.mo4099f();
            if (this.f3017al == null) {
                this.f3017al = VelocityTracker.obtain();
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if (actionMasked == 0) {
                int[] iArr = this.f3003aF;
                this.f3003aF[1] = 0;
                iArr[0] = 0;
            }
            obtain.offsetLocation((float) this.f3003aF[0], (float) this.f3003aF[1]);
            switch (actionMasked) {
                case 0:
                    this.f3016ak = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.f3020ao = x;
                    this.f3018am = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.f3021ap = y;
                    this.f3019an = y;
                    int i3 = e ? 1 : 0;
                    if (f) {
                        i3 |= 2;
                    }
                    mo4233j(i3, 0);
                    break;
                case 1:
                    this.f3017al.addMovement(obtain);
                    this.f3017al.computeCurrentVelocity(1000, (float) this.f3025at);
                    float f2 = e ? -this.f3017al.getXVelocity(this.f3016ak) : 0.0f;
                    float f3 = f ? -this.f3017al.getYVelocity(this.f3016ak) : 0.0f;
                    if ((f2 == 0.0f && f3 == 0.0f) || !mo4165b((int) f2, (int) f3)) {
                        setScrollState(0);
                    }
                    m4585D();
                    z2 = true;
                    break;
                case 2:
                    int findPointerIndex = motionEvent.findPointerIndex(this.f3016ak);
                    if (findPointerIndex >= 0) {
                        int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i4 = this.f3020ao - x2;
                        int i5 = this.f3021ap - y2;
                        if (mo4152a(i4, i5, this.f3002aE, this.f3001aD, 0)) {
                            i4 -= this.f3002aE[0];
                            i5 -= this.f3002aE[1];
                            obtain.offsetLocation((float) this.f3001aD[0], (float) this.f3001aD[1]);
                            int[] iArr2 = this.f3003aF;
                            iArr2[0] = iArr2[0] + this.f3001aD[0];
                            int[] iArr3 = this.f3003aF;
                            iArr3[1] = iArr3[1] + this.f3001aD[1];
                        }
                        if (this.f3015aj != 1) {
                            if (!e || Math.abs(i2) <= this.f3022aq) {
                                z = false;
                            } else {
                                i2 = i2 > 0 ? i2 - this.f3022aq : i2 + this.f3022aq;
                                z = true;
                            }
                            if (f && Math.abs(i) > this.f3022aq) {
                                i = i > 0 ? i - this.f3022aq : i + this.f3022aq;
                                z = true;
                            }
                            if (z) {
                                setScrollState(1);
                            }
                        }
                        if (this.f3015aj == 1) {
                            this.f3020ao = x2 - this.f3001aD[0];
                            this.f3021ap = y2 - this.f3001aD[1];
                            if (mo4151a(e ? i2 : 0, f ? i : 0, obtain)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            if (!(this.f2982A == null || (i2 == 0 && i == 0))) {
                                this.f2982A.mo5070a(this, i2, i);
                                break;
                            }
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error processing scroll; pointer index for id ");
                        sb.append(this.f3016ak);
                        sb.append(" not found. Did any MotionEvents get skipped?");
                        Log.e("RecyclerView", sb.toString());
                        return false;
                    }
                    break;
                case 3:
                    m4586E();
                    break;
                case 5:
                    this.f3016ak = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f3020ao = x3;
                    this.f3018am = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f3021ap = y3;
                    this.f3019an = y3;
                    break;
                case 6:
                    m4615c(motionEvent);
                    break;
            }
            if (!z2) {
                this.f3017al.addMovement(obtain);
            }
            obtain.recycle();
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public void mo4253p() {
        if (!this.f2987F && this.f3044p) {
            C0626s.m2847a((View) this, this.f3004aG);
            this.f2987F = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public void mo4254q() {
        String str;
        String str2;
        if (this.f3040l == null) {
            str = "RecyclerView";
            str2 = "No adapter attached; skipping layout";
        } else if (this.f3041m == null) {
            str = "RecyclerView";
            str2 = "No layout manager attached; skipping layout";
        } else {
            this.f2984C.f3139h = false;
            if (this.f2984C.f3134c == 1) {
                m4594M();
            } else if (!this.f3033e.mo5441f() && this.f3041m.mo4468z() == getWidth() && this.f3041m.mo4376A() == getHeight()) {
                this.f3041m.mo4441f(this);
                m4596O();
                return;
            }
            this.f3041m.mo4441f(this);
            m4595N();
            m4596O();
            return;
        }
        Log.e(str, str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public void mo4255r() {
        int c = this.f3034f.mo4954c();
        for (int i = 0; i < c; i++) {
            ((C0942j) this.f3034f.mo4957d(i).getLayoutParams()).f3100e = true;
        }
        this.f3032d.mo4532j();
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        C0958w e = m4616e(view);
        if (e != null) {
            if (e.mo4598r()) {
                e.mo4593m();
            } else if (!e.mo4583c()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(e);
                sb.append(mo4134a());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        view.clearAnimation();
        mo4235k(view);
        super.removeDetachedView(view, z);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f3041m.mo4408a(this, this.f2984C, view, view2) && view2 != null) {
            m4607a(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f3041m.mo4409a(this, view, rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f2993S.size();
        for (int i = 0; i < size; i++) {
            ((C0945m) this.f2993S.get(i)).mo4482a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.f2995U != 0 || this.f3049u) {
            this.f3048t = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public void mo4261s() {
        int c = this.f3034f.mo4954c();
        for (int i = 0; i < c; i++) {
            C0958w e = m4616e(this.f3034f.mo4957d(i));
            if (!e.mo4583c()) {
                e.mo4581b();
            }
        }
    }

    public void scrollBy(int i, int i2) {
        if (this.f3041m == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f3049u) {
            boolean e = this.f3041m.mo4096e();
            boolean f = this.f3041m.mo4099f();
            if (e || f) {
                if (!e) {
                    i = 0;
                }
                if (!f) {
                    i2 = 0;
                }
                mo4151a(i, i2, (MotionEvent) null);
            }
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!mo4155a(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(C1052av avVar) {
        this.f2988G = avVar;
        C0626s.m2844a((View) this, (C0577a) this.f2988G);
    }

    public void setAdapter(C0926a aVar) {
        setLayoutFrozen(false);
        m4601a(aVar, false, true);
        mo4171c(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C0929d dVar) {
        if (dVar != this.f2998aA) {
            this.f2998aA = dVar;
            setChildrenDrawingOrderEnabled(this.f2998aA != null);
        }
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f3036h) {
            mo4234k();
        }
        this.f3036h = z;
        super.setClipToPadding(z);
        if (this.f3047s) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0930e eVar) {
        C0509l.m2252a(eVar);
        this.f3010ae = eVar;
        mo4234k();
    }

    public void setHasFixedSize(boolean z) {
        this.f3045q = z;
    }

    public void setItemAnimator(C0931f fVar) {
        if (this.f3053y != null) {
            this.f3053y.mo4355d();
            this.f3053y.mo4348a(null);
        }
        this.f3053y = fVar;
        if (this.f3053y != null) {
            this.f3053y.mo4348a(this.f3031az);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.f3032d.mo4502a(i);
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.f3049u) {
            mo4148a("Do not setLayoutFrozen in layout or scroll");
            if (!z) {
                this.f3049u = false;
                if (!(!this.f3048t || this.f3041m == null || this.f3040l == null)) {
                    requestLayout();
                }
                this.f3048t = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f3049u = true;
            this.f2996V = true;
            mo4196f();
        }
    }

    public void setLayoutManager(C0937i iVar) {
        if (iVar != this.f3041m) {
            mo4196f();
            if (this.f3041m != null) {
                if (this.f3053y != null) {
                    this.f3053y.mo4355d();
                }
                this.f3041m.mo4424c(this.f3032d);
                this.f3041m.mo4417b(this.f3032d);
                this.f3032d.mo4501a();
                if (this.f3044p) {
                    this.f3041m.mo4419b(this, this.f3032d);
                }
                this.f3041m.mo4418b((RecyclerView) null);
                this.f3041m = null;
            } else {
                this.f3032d.mo4501a();
            }
            this.f3034f.mo4945a();
            this.f3041m = iVar;
            if (iVar != null) {
                if (iVar.f3083q == null) {
                    this.f3041m.mo4418b(this);
                    if (this.f3044p) {
                        this.f3041m.mo4425c(this);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("LayoutManager ");
                    sb.append(iVar);
                    sb.append(" is already attached to a RecyclerView:");
                    sb.append(iVar.f3083q.mo4134a());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.f3032d.mo4513b();
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo2456a(z);
    }

    public void setOnFlingListener(C0944l lVar) {
        this.f3023ar = lVar;
    }

    @Deprecated
    public void setOnScrollListener(C0946n nVar) {
        this.f3029ax = nVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f3028aw = z;
    }

    public void setRecycledViewPool(C0947o oVar) {
        this.f3032d.mo4506a(oVar);
    }

    public void setRecyclerListener(C0950q qVar) {
        this.f3042n = qVar;
    }

    /* access modifiers changed from: 0000 */
    public void setScrollState(int i) {
        if (i != this.f3015aj) {
            this.f3015aj = i;
            if (i != 2) {
                m4583B();
            }
            mo4197f(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        int i2;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        switch (i) {
            case 0:
                break;
            case 1:
                i2 = viewConfiguration.getScaledPagingTouchSlop();
                break;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("setScrollingTouchSlop(): bad argument constant ");
                sb.append(i);
                sb.append("; using default value");
                Log.w("RecyclerView", sb.toString());
                break;
        }
        i2 = viewConfiguration.getScaledTouchSlop();
        this.f3022aq = i2;
    }

    public void setViewCacheExtension(C0956u uVar) {
        this.f3032d.mo4507a(uVar);
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo2467b(i);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo2468c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public void mo4285t() {
        int c = this.f3034f.mo4954c();
        for (int i = 0; i < c; i++) {
            C0958w e = m4616e(this.f3034f.mo4957d(i));
            if (!e.mo4583c()) {
                e.mo4573a();
            }
        }
        this.f3032d.mo4531i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public void mo4286u() {
        int c = this.f3034f.mo4954c();
        for (int i = 0; i < c; i++) {
            C0958w e = m4616e(this.f3034f.mo4957d(i));
            if (e != null && !e.mo4583c()) {
                e.mo4582b(6);
            }
        }
        mo4255r();
        this.f3032d.mo4530h();
    }

    /* renamed from: v */
    public boolean mo4287v() {
        return !this.f3047s || this.f3051w || this.f3033e.mo5439d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public void mo4288w() {
        int b = this.f3034f.mo4951b();
        for (int i = 0; i < b; i++) {
            View b2 = this.f3034f.mo4953b(i);
            C0958w b3 = mo4158b(b2);
            if (!(b3 == null || b3.f3165i == null)) {
                View view = b3.f3165i.f3157a;
                int left = b2.getLeft();
                int top = b2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public void mo4289x() {
        for (int size = this.f2989H.size() - 1; size >= 0; size--) {
            C0958w wVar = (C0958w) this.f2989H.get(size);
            if (wVar.f3157a.getParent() == this && !wVar.mo4583c()) {
                int i = wVar.f3168l;
                if (i != -1) {
                    C0626s.m2854b(wVar.f3157a, i);
                    wVar.f3168l = -1;
                }
            }
        }
        this.f2989H.clear();
    }
}
