package android.support.p009v4.view;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: android.support.v4.view.s */
public class C0626s {

    /* renamed from: a */
    static final C0637j f1788a;

    /* renamed from: android.support.v4.view.s$a */
    static class C0627a extends C0637j {
        C0627a() {
        }

        /* renamed from: a */
        public boolean mo2493a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* renamed from: android.support.v4.view.s$b */
    static class C0628b extends C0627a {
        C0628b() {
        }

        /* renamed from: a */
        public void mo2494a(View view, int i) {
            if (i == 4) {
                i = 2;
            }
            view.setImportantForAccessibility(i);
        }

        /* renamed from: a */
        public void mo2495a(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        /* renamed from: a */
        public void mo2496a(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        /* renamed from: a */
        public void mo2497a(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        /* renamed from: a */
        public void mo2498a(View view, boolean z) {
            view.setHasTransientState(z);
        }

        /* renamed from: b */
        public boolean mo2499b(View view) {
            return view.hasTransientState();
        }

        /* renamed from: c */
        public void mo2500c(View view) {
            view.postInvalidateOnAnimation();
        }

        /* renamed from: d */
        public int mo2501d(View view) {
            return view.getImportantForAccessibility();
        }

        /* renamed from: e */
        public ViewParent mo2502e(View view) {
            return view.getParentForAccessibility();
        }

        /* renamed from: f */
        public int mo2503f(View view) {
            return view.getMinimumWidth();
        }

        /* renamed from: g */
        public int mo2504g(View view) {
            return view.getMinimumHeight();
        }

        /* renamed from: h */
        public void mo2505h(View view) {
            view.requestFitSystemWindows();
        }

        /* renamed from: i */
        public boolean mo2506i(View view) {
            return view.getFitsSystemWindows();
        }

        /* renamed from: j */
        public boolean mo2507j(View view) {
            return view.hasOverlappingRendering();
        }
    }

    /* renamed from: android.support.v4.view.s$c */
    static class C0629c extends C0628b {
        C0629c() {
        }

        /* renamed from: a */
        public void mo2508a(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }

        /* renamed from: k */
        public int mo2509k(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: l */
        public int mo2510l(View view) {
            return view.getPaddingStart();
        }

        /* renamed from: m */
        public int mo2511m(View view) {
            return view.getPaddingEnd();
        }

        /* renamed from: n */
        public int mo2512n(View view) {
            return view.getWindowSystemUiVisibility();
        }

        /* renamed from: o */
        public boolean mo2513o(View view) {
            return view.isPaddingRelative();
        }

        /* renamed from: p */
        public Display mo2514p(View view) {
            return view.getDisplay();
        }
    }

    /* renamed from: android.support.v4.view.s$d */
    static class C0630d extends C0629c {
        C0630d() {
        }

        /* renamed from: a */
        public void mo2515a(View view, Rect rect) {
            view.setClipBounds(rect);
        }

        /* renamed from: q */
        public Rect mo2516q(View view) {
            return view.getClipBounds();
        }
    }

    /* renamed from: android.support.v4.view.s$e */
    static class C0631e extends C0630d {
        C0631e() {
        }

        /* renamed from: a */
        public void mo2494a(View view, int i) {
            view.setImportantForAccessibility(i);
        }

        /* renamed from: b */
        public void mo2517b(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        /* renamed from: r */
        public boolean mo2518r(View view) {
            return view.isLaidOut();
        }

        /* renamed from: s */
        public boolean mo2519s(View view) {
            return view.isAttachedToWindow();
        }
    }

    /* renamed from: android.support.v4.view.s$f */
    static class C0632f extends C0631e {

        /* renamed from: d */
        private static ThreadLocal<Rect> f1789d;

        C0632f() {
        }

        /* renamed from: b */
        private static Rect m2912b() {
            if (f1789d == null) {
                f1789d = new ThreadLocal<>();
            }
            Rect rect = (Rect) f1789d.get();
            if (rect == null) {
                rect = new Rect();
                f1789d.set(rect);
            }
            rect.setEmpty();
            return rect;
        }

        /* renamed from: A */
        public float mo2520A(View view) {
            return view.getZ();
        }

        /* renamed from: a */
        public C0591aa mo2521a(View view, C0591aa aaVar) {
            WindowInsets windowInsets = (WindowInsets) C0591aa.m2706a(aaVar);
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
            if (onApplyWindowInsets != windowInsets) {
                windowInsets = new WindowInsets(onApplyWindowInsets);
            }
            return C0591aa.m2705a((Object) windowInsets);
        }

        /* renamed from: a */
        public void mo2522a(View view, float f) {
            view.setElevation(f);
        }

        /* renamed from: a */
        public void mo2523a(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        }

        /* renamed from: a */
        public void mo2524a(View view, Mode mode) {
            view.setBackgroundTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        }

        /* renamed from: a */
        public void mo2525a(View view, final C0622o oVar) {
            if (oVar == null) {
                view.setOnApplyWindowInsetsListener(null);
            } else {
                view.setOnApplyWindowInsetsListener(new OnApplyWindowInsetsListener() {
                    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        return (WindowInsets) C0591aa.m2706a(oVar.mo364a(view, C0591aa.m2705a((Object) windowInsets)));
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo2526a(View view, String str) {
            view.setTransitionName(str);
        }

        /* renamed from: b */
        public C0591aa mo2527b(View view, C0591aa aaVar) {
            WindowInsets windowInsets = (WindowInsets) C0591aa.m2706a(aaVar);
            WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
            if (dispatchApplyWindowInsets != windowInsets) {
                windowInsets = new WindowInsets(dispatchApplyWindowInsets);
            }
            return C0591aa.m2705a((Object) windowInsets);
        }

        /* renamed from: c */
        public void mo2528c(View view, int i) {
            boolean z;
            Rect b = m2912b();
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            } else {
                z = false;
            }
            super.mo2528c(view, i);
            if (z && b.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(b);
            }
        }

        /* renamed from: d */
        public void mo2529d(View view, int i) {
            boolean z;
            Rect b = m2912b();
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            } else {
                z = false;
            }
            super.mo2529d(view, i);
            if (z && b.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(b);
            }
        }

        /* renamed from: h */
        public void mo2505h(View view) {
            view.requestApplyInsets();
        }

        /* renamed from: t */
        public String mo2530t(View view) {
            return view.getTransitionName();
        }

        /* renamed from: u */
        public float mo2531u(View view) {
            return view.getElevation();
        }

        /* renamed from: v */
        public float mo2532v(View view) {
            return view.getTranslationZ();
        }

        /* renamed from: w */
        public boolean mo2533w(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* renamed from: x */
        public void mo2534x(View view) {
            view.stopNestedScroll();
        }

        /* renamed from: y */
        public ColorStateList mo2535y(View view) {
            return view.getBackgroundTintList();
        }

        /* renamed from: z */
        public Mode mo2536z(View view) {
            return view.getBackgroundTintMode();
        }
    }

    /* renamed from: android.support.v4.view.s$g */
    static class C0634g extends C0632f {
        C0634g() {
        }

        /* renamed from: a */
        public void mo2538a(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }

        /* renamed from: c */
        public void mo2528c(View view, int i) {
            view.offsetLeftAndRight(i);
        }

        /* renamed from: d */
        public void mo2529d(View view, int i) {
            view.offsetTopAndBottom(i);
        }
    }

    /* renamed from: android.support.v4.view.s$h */
    static class C0635h extends C0634g {
        C0635h() {
        }

        /* renamed from: a */
        public void mo2539a(View view, C0624q qVar) {
            view.setPointerIcon((PointerIcon) (qVar != null ? qVar.mo2488a() : null));
        }
    }

    /* renamed from: android.support.v4.view.s$i */
    static class C0636i extends C0635h {
        C0636i() {
        }
    }

    /* renamed from: android.support.v4.view.s$j */
    static class C0637j {

        /* renamed from: b */
        static Field f1792b;

        /* renamed from: c */
        static boolean f1793c = false;

        /* renamed from: d */
        private static Field f1794d;

        /* renamed from: e */
        private static boolean f1795e;

        /* renamed from: f */
        private static Field f1796f;

        /* renamed from: g */
        private static boolean f1797g;

        /* renamed from: h */
        private static WeakHashMap<View, String> f1798h;

        /* renamed from: i */
        private static final AtomicInteger f1799i = new AtomicInteger(1);

        /* renamed from: a */
        WeakHashMap<View, C0647w> f1800a = null;

        C0637j() {
        }

        /* renamed from: D */
        private static void m2935D(View view) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
        }

        /* renamed from: A */
        public float mo2520A(View view) {
            return mo2532v(view) + mo2531u(view);
        }

        /* renamed from: B */
        public boolean mo2540B(View view) {
            boolean z = false;
            if (f1793c) {
                return false;
            }
            if (f1792b == null) {
                try {
                    f1792b = View.class.getDeclaredField("mAccessibilityDelegate");
                    f1792b.setAccessible(true);
                } catch (Throwable unused) {
                    f1793c = true;
                    return false;
                }
            }
            try {
                if (f1792b.get(view) != null) {
                    z = true;
                }
                return z;
            } catch (Throwable unused2) {
                f1793c = true;
                return false;
            }
        }

        /* renamed from: C */
        public C0647w mo2541C(View view) {
            if (this.f1800a == null) {
                this.f1800a = new WeakHashMap<>();
            }
            C0647w wVar = (C0647w) this.f1800a.get(view);
            if (wVar != null) {
                return wVar;
            }
            C0647w wVar2 = new C0647w(view);
            this.f1800a.put(view, wVar2);
            return wVar2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public long mo2542a() {
            return ValueAnimator.getFrameDelay();
        }

        /* renamed from: a */
        public C0591aa mo2521a(View view, C0591aa aaVar) {
            return aaVar;
        }

        /* renamed from: a */
        public void mo2522a(View view, float f) {
        }

        /* renamed from: a */
        public void mo2494a(View view, int i) {
        }

        /* renamed from: a */
        public void mo2538a(View view, int i, int i2) {
        }

        /* renamed from: a */
        public void mo2508a(View view, int i, int i2, int i3, int i4) {
            view.setPadding(i, i2, i3, i4);
        }

        /* renamed from: a */
        public void mo2523a(View view, ColorStateList colorStateList) {
            if (view instanceof C0625r) {
                ((C0625r) view).setSupportBackgroundTintList(colorStateList);
            }
        }

        /* renamed from: a */
        public void mo2524a(View view, Mode mode) {
            if (view instanceof C0625r) {
                ((C0625r) view).setSupportBackgroundTintMode(mode);
            }
        }

        /* renamed from: a */
        public void mo2515a(View view, Rect rect) {
        }

        /* renamed from: a */
        public void mo2495a(View view, Drawable drawable) {
            view.setBackgroundDrawable(drawable);
        }

        /* renamed from: a */
        public void mo2543a(View view, C0577a aVar) {
            view.setAccessibilityDelegate(aVar == null ? null : aVar.mo2326a());
        }

        /* renamed from: a */
        public void mo2525a(View view, C0622o oVar) {
        }

        /* renamed from: a */
        public void mo2539a(View view, C0624q qVar) {
        }

        /* renamed from: a */
        public void mo2496a(View view, Runnable runnable) {
            view.postDelayed(runnable, mo2542a());
        }

        /* renamed from: a */
        public void mo2497a(View view, Runnable runnable, long j) {
            view.postDelayed(runnable, mo2542a() + j);
        }

        /* renamed from: a */
        public void mo2526a(View view, String str) {
            if (f1798h == null) {
                f1798h = new WeakHashMap<>();
            }
            f1798h.put(view, str);
        }

        /* renamed from: a */
        public void mo2498a(View view, boolean z) {
        }

        /* renamed from: a */
        public boolean mo2493a(View view) {
            return false;
        }

        /* renamed from: b */
        public C0591aa mo2527b(View view, C0591aa aaVar) {
            return aaVar;
        }

        /* renamed from: b */
        public void mo2517b(View view, int i) {
        }

        /* renamed from: b */
        public boolean mo2499b(View view) {
            return false;
        }

        /* renamed from: c */
        public void mo2500c(View view) {
            view.postInvalidate();
        }

        /* renamed from: c */
        public void mo2528c(View view, int i) {
            view.offsetLeftAndRight(i);
            if (view.getVisibility() == 0) {
                m2935D(view);
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    m2935D((View) parent);
                }
            }
        }

        /* renamed from: d */
        public int mo2501d(View view) {
            return 0;
        }

        /* renamed from: d */
        public void mo2529d(View view, int i) {
            view.offsetTopAndBottom(i);
            if (view.getVisibility() == 0) {
                m2935D(view);
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    m2935D((View) parent);
                }
            }
        }

        /* renamed from: e */
        public ViewParent mo2502e(View view) {
            return view.getParent();
        }

        /* renamed from: f */
        public int mo2503f(View view) {
            if (!f1795e) {
                try {
                    f1794d = View.class.getDeclaredField("mMinWidth");
                    f1794d.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f1795e = true;
            }
            if (f1794d != null) {
                try {
                    return ((Integer) f1794d.get(view)).intValue();
                } catch (Exception unused2) {
                }
            }
            return 0;
        }

        /* renamed from: g */
        public int mo2504g(View view) {
            if (!f1797g) {
                try {
                    f1796f = View.class.getDeclaredField("mMinHeight");
                    f1796f.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f1797g = true;
            }
            if (f1796f != null) {
                try {
                    return ((Integer) f1796f.get(view)).intValue();
                } catch (Exception unused2) {
                }
            }
            return 0;
        }

        /* renamed from: h */
        public void mo2505h(View view) {
        }

        /* renamed from: i */
        public boolean mo2506i(View view) {
            return false;
        }

        /* renamed from: j */
        public boolean mo2507j(View view) {
            return true;
        }

        /* renamed from: k */
        public int mo2509k(View view) {
            return 0;
        }

        /* renamed from: l */
        public int mo2510l(View view) {
            return view.getPaddingLeft();
        }

        /* renamed from: m */
        public int mo2511m(View view) {
            return view.getPaddingRight();
        }

        /* renamed from: n */
        public int mo2512n(View view) {
            return 0;
        }

        /* renamed from: o */
        public boolean mo2513o(View view) {
            return false;
        }

        /* renamed from: p */
        public Display mo2514p(View view) {
            if (mo2519s(view)) {
                return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
            }
            return null;
        }

        /* renamed from: q */
        public Rect mo2516q(View view) {
            return null;
        }

        /* renamed from: r */
        public boolean mo2518r(View view) {
            return view.getWidth() > 0 && view.getHeight() > 0;
        }

        /* renamed from: s */
        public boolean mo2519s(View view) {
            return view.getWindowToken() != null;
        }

        /* renamed from: t */
        public String mo2530t(View view) {
            if (f1798h == null) {
                return null;
            }
            return (String) f1798h.get(view);
        }

        /* renamed from: u */
        public float mo2531u(View view) {
            return 0.0f;
        }

        /* renamed from: v */
        public float mo2532v(View view) {
            return 0.0f;
        }

        /* renamed from: w */
        public boolean mo2533w(View view) {
            if (view instanceof C0616i) {
                return ((C0616i) view).isNestedScrollingEnabled();
            }
            return false;
        }

        /* renamed from: x */
        public void mo2534x(View view) {
            if (view instanceof C0616i) {
                ((C0616i) view).stopNestedScroll();
            }
        }

        /* renamed from: y */
        public ColorStateList mo2535y(View view) {
            if (view instanceof C0625r) {
                return ((C0625r) view).getSupportBackgroundTintList();
            }
            return null;
        }

        /* renamed from: z */
        public Mode mo2536z(View view) {
            if (view instanceof C0625r) {
                return ((C0625r) view).getSupportBackgroundTintMode();
            }
            return null;
        }
    }

    static {
        C0637j jVar = VERSION.SDK_INT >= 26 ? new C0636i() : VERSION.SDK_INT >= 24 ? new C0635h() : VERSION.SDK_INT >= 23 ? new C0634g() : VERSION.SDK_INT >= 21 ? new C0632f() : VERSION.SDK_INT >= 19 ? new C0631e() : VERSION.SDK_INT >= 18 ? new C0630d() : VERSION.SDK_INT >= 17 ? new C0629c() : VERSION.SDK_INT >= 16 ? new C0628b() : VERSION.SDK_INT >= 15 ? new C0627a() : new C0637j();
        f1788a = jVar;
    }

    /* renamed from: A */
    public static boolean m2834A(View view) {
        return f1788a.mo2493a(view);
    }

    /* renamed from: B */
    public static Display m2835B(View view) {
        return f1788a.mo2514p(view);
    }

    /* renamed from: a */
    public static C0591aa m2836a(View view, C0591aa aaVar) {
        return f1788a.mo2521a(view, aaVar);
    }

    /* renamed from: a */
    public static void m2837a(View view, float f) {
        f1788a.mo2522a(view, f);
    }

    /* renamed from: a */
    public static void m2838a(View view, int i, int i2) {
        f1788a.mo2538a(view, i, i2);
    }

    /* renamed from: a */
    public static void m2839a(View view, int i, int i2, int i3, int i4) {
        f1788a.mo2508a(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m2840a(View view, ColorStateList colorStateList) {
        f1788a.mo2523a(view, colorStateList);
    }

    /* renamed from: a */
    public static void m2841a(View view, Mode mode) {
        f1788a.mo2524a(view, mode);
    }

    /* renamed from: a */
    public static void m2842a(View view, Rect rect) {
        f1788a.mo2515a(view, rect);
    }

    /* renamed from: a */
    public static void m2843a(View view, Drawable drawable) {
        f1788a.mo2495a(view, drawable);
    }

    /* renamed from: a */
    public static void m2844a(View view, C0577a aVar) {
        f1788a.mo2543a(view, aVar);
    }

    /* renamed from: a */
    public static void m2845a(View view, C0622o oVar) {
        f1788a.mo2525a(view, oVar);
    }

    /* renamed from: a */
    public static void m2846a(View view, C0624q qVar) {
        f1788a.mo2539a(view, qVar);
    }

    /* renamed from: a */
    public static void m2847a(View view, Runnable runnable) {
        f1788a.mo2496a(view, runnable);
    }

    /* renamed from: a */
    public static void m2848a(View view, Runnable runnable, long j) {
        f1788a.mo2497a(view, runnable, j);
    }

    /* renamed from: a */
    public static void m2849a(View view, String str) {
        f1788a.mo2526a(view, str);
    }

    /* renamed from: a */
    public static void m2850a(View view, boolean z) {
        f1788a.mo2498a(view, z);
    }

    /* renamed from: a */
    public static boolean m2851a(View view) {
        return f1788a.mo2540B(view);
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m2852a(View view, int i) {
        return view.canScrollVertically(i);
    }

    /* renamed from: b */
    public static C0591aa m2853b(View view, C0591aa aaVar) {
        return f1788a.mo2527b(view, aaVar);
    }

    /* renamed from: b */
    public static void m2854b(View view, int i) {
        f1788a.mo2494a(view, i);
    }

    @Deprecated
    /* renamed from: b */
    public static void m2855b(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: b */
    public static boolean m2856b(View view) {
        return f1788a.mo2499b(view);
    }

    /* renamed from: c */
    public static void m2857c(View view) {
        f1788a.mo2500c(view);
    }

    /* renamed from: c */
    public static void m2858c(View view, int i) {
        f1788a.mo2517b(view, i);
    }

    /* renamed from: d */
    public static int m2859d(View view) {
        return f1788a.mo2501d(view);
    }

    /* renamed from: d */
    public static void m2860d(View view, int i) {
        f1788a.mo2529d(view, i);
    }

    /* renamed from: e */
    public static int m2861e(View view) {
        return f1788a.mo2509k(view);
    }

    /* renamed from: e */
    public static void m2862e(View view, int i) {
        f1788a.mo2528c(view, i);
    }

    /* renamed from: f */
    public static ViewParent m2863f(View view) {
        return f1788a.mo2502e(view);
    }

    /* renamed from: g */
    public static int m2864g(View view) {
        return f1788a.mo2510l(view);
    }

    /* renamed from: h */
    public static int m2865h(View view) {
        return f1788a.mo2511m(view);
    }

    /* renamed from: i */
    public static int m2866i(View view) {
        return f1788a.mo2503f(view);
    }

    /* renamed from: j */
    public static int m2867j(View view) {
        return f1788a.mo2504g(view);
    }

    /* renamed from: k */
    public static C0647w m2868k(View view) {
        return f1788a.mo2541C(view);
    }

    /* renamed from: l */
    public static float m2869l(View view) {
        return f1788a.mo2531u(view);
    }

    /* renamed from: m */
    public static String m2870m(View view) {
        return f1788a.mo2530t(view);
    }

    /* renamed from: n */
    public static int m2871n(View view) {
        return f1788a.mo2512n(view);
    }

    /* renamed from: o */
    public static void m2872o(View view) {
        f1788a.mo2505h(view);
    }

    /* renamed from: p */
    public static boolean m2873p(View view) {
        return f1788a.mo2506i(view);
    }

    /* renamed from: q */
    public static boolean m2874q(View view) {
        return f1788a.mo2507j(view);
    }

    /* renamed from: r */
    public static boolean m2875r(View view) {
        return f1788a.mo2513o(view);
    }

    /* renamed from: s */
    public static ColorStateList m2876s(View view) {
        return f1788a.mo2535y(view);
    }

    /* renamed from: t */
    public static Mode m2877t(View view) {
        return f1788a.mo2536z(view);
    }

    /* renamed from: u */
    public static boolean m2878u(View view) {
        return f1788a.mo2533w(view);
    }

    /* renamed from: v */
    public static void m2879v(View view) {
        f1788a.mo2534x(view);
    }

    /* renamed from: w */
    public static boolean m2880w(View view) {
        return f1788a.mo2518r(view);
    }

    /* renamed from: x */
    public static float m2881x(View view) {
        return f1788a.mo2520A(view);
    }

    /* renamed from: y */
    public static Rect m2882y(View view) {
        return f1788a.mo2516q(view);
    }

    /* renamed from: z */
    public static boolean m2883z(View view) {
        return f1788a.mo2519s(view);
    }
}
