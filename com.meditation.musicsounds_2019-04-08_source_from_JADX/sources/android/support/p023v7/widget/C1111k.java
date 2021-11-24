package android.support.p023v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.p007d.p008a.C0068c;
import android.support.p007d.p008a.C0079i;
import android.support.p009v4.content.C0452b;
import android.support.p009v4.p010a.C0310a;
import android.support.p009v4.p010a.p011a.C0311a;
import android.support.p009v4.p019g.C0488a;
import android.support.p009v4.p019g.C0495f;
import android.support.p009v4.p019g.C0496g;
import android.support.p009v4.p019g.C0511n;
import android.support.p023v7.p024a.C0726a.C0727a;
import android.support.p023v7.p024a.C0726a.C0731e;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v7.widget.k */
public final class C1111k {

    /* renamed from: a */
    private static final Mode f3863a = Mode.SRC_IN;

    /* renamed from: b */
    private static C1111k f3864b;

    /* renamed from: c */
    private static final C1113b f3865c = new C1113b(6);

    /* renamed from: d */
    private static final int[] f3866d = {C0731e.abc_textfield_search_default_mtrl_alpha, C0731e.abc_textfield_default_mtrl_alpha, C0731e.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: e */
    private static final int[] f3867e = {C0731e.abc_ic_commit_search_api_mtrl_alpha, C0731e.abc_seekbar_tick_mark_material, C0731e.abc_ic_menu_share_mtrl_alpha, C0731e.abc_ic_menu_copy_mtrl_am_alpha, C0731e.abc_ic_menu_cut_mtrl_alpha, C0731e.abc_ic_menu_selectall_mtrl_alpha, C0731e.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: f */
    private static final int[] f3868f = {C0731e.abc_textfield_activated_mtrl_alpha, C0731e.abc_textfield_search_activated_mtrl_alpha, C0731e.abc_cab_background_top_mtrl_alpha, C0731e.abc_text_cursor_material, C0731e.abc_text_select_handle_left_mtrl_dark, C0731e.abc_text_select_handle_middle_mtrl_dark, C0731e.abc_text_select_handle_right_mtrl_dark, C0731e.abc_text_select_handle_left_mtrl_light, C0731e.abc_text_select_handle_middle_mtrl_light, C0731e.abc_text_select_handle_right_mtrl_light};

    /* renamed from: g */
    private static final int[] f3869g = {C0731e.abc_popup_background_mtrl_mult, C0731e.abc_cab_background_internal_bg, C0731e.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: h */
    private static final int[] f3870h = {C0731e.abc_tab_indicator_material, C0731e.abc_textfield_search_material};

    /* renamed from: i */
    private static final int[] f3871i = {C0731e.abc_btn_check_material, C0731e.abc_btn_radio_material};

    /* renamed from: j */
    private WeakHashMap<Context, C0511n<ColorStateList>> f3872j;

    /* renamed from: k */
    private C0488a<String, C1114c> f3873k;

    /* renamed from: l */
    private C0511n<String> f3874l;

    /* renamed from: m */
    private final Object f3875m = new Object();

    /* renamed from: n */
    private final WeakHashMap<Context, C0495f<WeakReference<ConstantState>>> f3876n = new WeakHashMap<>(0);

    /* renamed from: o */
    private TypedValue f3877o;

    /* renamed from: p */
    private boolean f3878p;

    /* renamed from: android.support.v7.widget.k$a */
    private static class C1112a implements C1114c {
        C1112a() {
        }

        /* renamed from: a */
        public Drawable mo5495a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C0068c.m180a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: android.support.v7.widget.k$b */
    private static class C1113b extends C0496g<Integer, PorterDuffColorFilter> {
        public C1113b(int i) {
            super(i);
        }

        /* renamed from: b */
        private static int m6106b(int i, Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public PorterDuffColorFilter mo5496a(int i, Mode mode) {
            return (PorterDuffColorFilter) mo1928a(Integer.valueOf(m6106b(i, mode)));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public PorterDuffColorFilter mo5497a(int i, Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) mo1929a(Integer.valueOf(m6106b(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: android.support.v7.widget.k$c */
    private interface C1114c {
        /* renamed from: a */
        Drawable mo5495a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme);
    }

    /* renamed from: android.support.v7.widget.k$d */
    private static class C1115d implements C1114c {
        C1115d() {
        }

        /* renamed from: a */
        public Drawable mo5495a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C0079i.m216a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private static long m6075a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: a */
    static Mode m6076a(int i) {
        if (i == C0731e.abc_switch_thumb_material) {
            return Mode.MULTIPLY;
        }
        return null;
    }

    /* renamed from: a */
    public static PorterDuffColorFilter m6077a(int i, Mode mode) {
        PorterDuffColorFilter a = f3865c.mo5496a(i, mode);
        if (a != null) {
            return a;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        f3865c.mo5497a(i, mode, porterDuffColorFilter);
        return porterDuffColorFilter;
    }

    /* renamed from: a */
    private static PorterDuffColorFilter m6078a(ColorStateList colorStateList, Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m6077a(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: a */
    private Drawable m6079a(Context context, int i, boolean z, Drawable drawable) {
        LayerDrawable layerDrawable;
        Drawable findDrawableByLayerId;
        int i2;
        ColorStateList b = mo5494b(context, i);
        if (b != null) {
            if (C1011ag.m5521c(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable g = C0311a.m1186g(drawable);
            C0311a.m1175a(g, b);
            Mode a = m6076a(i);
            if (a == null) {
                return g;
            }
            C0311a.m1178a(g, a);
            return g;
        }
        if (i == C0731e.abc_seekbar_track_material) {
            layerDrawable = (LayerDrawable) drawable;
            m6083a(layerDrawable.findDrawableByLayerId(16908288), C1073bf.m5869a(context, C0727a.colorControlNormal), f3863a);
            findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
            i2 = C0727a.colorControlNormal;
        } else if (i == C0731e.abc_ratingbar_material || i == C0731e.abc_ratingbar_indicator_material || i == C0731e.abc_ratingbar_small_material) {
            layerDrawable = (LayerDrawable) drawable;
            m6083a(layerDrawable.findDrawableByLayerId(16908288), C1073bf.m5873c(context, C0727a.colorControlNormal), f3863a);
            findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
            i2 = C0727a.colorControlActivated;
        } else if (m6087a(context, i, drawable) || !z) {
            return drawable;
        } else {
            return null;
        }
        m6083a(findDrawableByLayerId, C1073bf.m5869a(context, i2), f3863a);
        m6083a(layerDrawable.findDrawableByLayerId(16908301), C1073bf.m5869a(context, C0727a.colorControlActivated), f3863a);
        return drawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m6080a(android.content.Context r5, long r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f3875m
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.support.v4.g.f<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r1 = r4.f3876n     // Catch:{ all -> 0x002f }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x002f }
            android.support.v4.g.f r1 = (android.support.p009v4.p019g.C0495f) r1     // Catch:{ all -> 0x002f }
            r2 = 0
            if (r1 != 0) goto L_0x0010
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return r2
        L_0x0010:
            java.lang.Object r3 = r1.mo1916a(r6)     // Catch:{ all -> 0x002f }
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch:{ all -> 0x002f }
            if (r3 == 0) goto L_0x002d
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x002f }
            android.graphics.drawable.Drawable$ConstantState r3 = (android.graphics.drawable.Drawable.ConstantState) r3     // Catch:{ all -> 0x002f }
            if (r3 == 0) goto L_0x002a
            android.content.res.Resources r5 = r5.getResources()     // Catch:{ all -> 0x002f }
            android.graphics.drawable.Drawable r5 = r3.newDrawable(r5)     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return r5
        L_0x002a:
            r1.mo1921b(r6)     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return r2
        L_0x002f:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.C1111k.m6080a(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    public static C1111k m6081a() {
        if (f3864b == null) {
            f3864b = new C1111k();
            m6085a(f3864b);
        }
        return f3864b;
    }

    /* renamed from: a */
    private void m6082a(Context context, int i, ColorStateList colorStateList) {
        if (this.f3872j == null) {
            this.f3872j = new WeakHashMap<>();
        }
        C0511n nVar = (C0511n) this.f3872j.get(context);
        if (nVar == null) {
            nVar = new C0511n();
            this.f3872j.put(context, nVar);
        }
        nVar.mo2032c(i, colorStateList);
    }

    /* renamed from: a */
    private static void m6083a(Drawable drawable, int i, Mode mode) {
        if (C1011ag.m5521c(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f3863a;
        }
        drawable.setColorFilter(m6077a(i, mode));
    }

    /* renamed from: a */
    static void m6084a(Drawable drawable, C1076bi biVar, int[] iArr) {
        if (!C1011ag.m5521c(drawable) || drawable.mutate() == drawable) {
            if (biVar.f3748d || biVar.f3747c) {
                drawable.setColorFilter(m6078a(biVar.f3748d ? biVar.f3745a : null, biVar.f3747c ? biVar.f3746b : f3863a, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
            return;
        }
        Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
    }

    /* renamed from: a */
    private static void m6085a(C1111k kVar) {
        if (VERSION.SDK_INT < 24) {
            kVar.m6086a("vector", (C1114c) new C1115d());
            kVar.m6086a("animated-vector", (C1114c) new C1112a());
        }
    }

    /* renamed from: a */
    private void m6086a(String str, C1114c cVar) {
        if (this.f3873k == null) {
            this.f3873k = new C0488a<>();
        }
        this.f3873k.put(str, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0061 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m6087a(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            android.graphics.PorterDuff$Mode r0 = f3863a
            int[] r1 = f3866d
            boolean r1 = m6090a(r1, r7)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0015
            int r2 = android.support.p023v7.p024a.C0726a.C0727a.colorControlNormal
        L_0x0012:
            r7 = 1
            r1 = -1
            goto L_0x0044
        L_0x0015:
            int[] r1 = f3868f
            boolean r1 = m6090a(r1, r7)
            if (r1 == 0) goto L_0x0020
            int r2 = android.support.p023v7.p024a.C0726a.C0727a.colorControlActivated
            goto L_0x0012
        L_0x0020:
            int[] r1 = f3869g
            boolean r1 = m6090a(r1, r7)
            if (r1 == 0) goto L_0x002b
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0012
        L_0x002b:
            int r1 = android.support.p023v7.p024a.C0726a.C0731e.abc_list_divider_mtrl_alpha
            if (r7 != r1) goto L_0x003c
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r7 = 1109603123(0x42233333, float:40.8)
            int r7 = java.lang.Math.round(r7)
            r1 = r7
            r7 = 1
            goto L_0x0044
        L_0x003c:
            int r1 = android.support.p023v7.p024a.C0726a.C0731e.abc_dialog_material_background
            if (r7 != r1) goto L_0x0041
            goto L_0x0012
        L_0x0041:
            r7 = 0
            r1 = -1
            r2 = 0
        L_0x0044:
            if (r7 == 0) goto L_0x0061
            boolean r7 = android.support.p023v7.widget.C1011ag.m5521c(r8)
            if (r7 == 0) goto L_0x0050
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L_0x0050:
            int r6 = android.support.p023v7.widget.C1073bf.m5869a(r6, r2)
            android.graphics.PorterDuffColorFilter r6 = m6077a(r6, r0)
            r8.setColorFilter(r6)
            if (r1 == r3) goto L_0x0060
            r8.setAlpha(r1)
        L_0x0060:
            return r5
        L_0x0061:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.C1111k.m6087a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    /* renamed from: a */
    private boolean m6088a(Context context, long j, Drawable drawable) {
        ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        synchronized (this.f3875m) {
            C0495f fVar = (C0495f) this.f3876n.get(context);
            if (fVar == null) {
                fVar = new C0495f();
                this.f3876n.put(context, fVar);
            }
            fVar.mo1922b(j, new WeakReference(constantState));
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m6089a(Drawable drawable) {
        return (drawable instanceof C0079i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* renamed from: a */
    private static boolean m6090a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private ColorStateList m6091b(Context context) {
        return m6098f(context, C1073bf.m5869a(context, C0727a.colorButtonNormal));
    }

    /* renamed from: c */
    private ColorStateList m6092c(Context context) {
        return m6098f(context, 0);
    }

    /* renamed from: c */
    private Drawable m6093c(Context context, int i) {
        if (this.f3877o == null) {
            this.f3877o = new TypedValue();
        }
        TypedValue typedValue = this.f3877o;
        context.getResources().getValue(i, typedValue, true);
        long a = m6075a(typedValue);
        Drawable a2 = m6080a(context, a);
        if (a2 != null) {
            return a2;
        }
        if (i == C0731e.abc_cab_background_top_material) {
            a2 = new LayerDrawable(new Drawable[]{mo5490a(context, C0731e.abc_cab_background_internal_bg), mo5490a(context, C0731e.abc_cab_background_top_mtrl_alpha)});
        }
        if (a2 != null) {
            a2.setChangingConfigurations(typedValue.changingConfigurations);
            m6088a(context, a, a2);
        }
        return a2;
    }

    /* renamed from: d */
    private ColorStateList m6094d(Context context) {
        return m6098f(context, C1073bf.m5869a(context, C0727a.colorAccent));
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0079 A[Catch:{ Exception -> 0x00a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a0 A[Catch:{ Exception -> 0x00a8 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m6095d(android.content.Context r10, int r11) {
        /*
            r9 = this;
            android.support.v4.g.a<java.lang.String, android.support.v7.widget.k$c> r0 = r9.f3873k
            r1 = 0
            if (r0 == 0) goto L_0x00ba
            android.support.v4.g.a<java.lang.String, android.support.v7.widget.k$c> r0 = r9.f3873k
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ba
            android.support.v4.g.n<java.lang.String> r0 = r9.f3874l
            if (r0 == 0) goto L_0x002c
            android.support.v4.g.n<java.lang.String> r0 = r9.f3874l
            java.lang.Object r0 = r0.mo2025a(r11)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "appcompat_skip_skip"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x002b
            if (r0 == 0) goto L_0x0033
            android.support.v4.g.a<java.lang.String, android.support.v7.widget.k$c> r2 = r9.f3873k
            java.lang.Object r0 = r2.get(r0)
            if (r0 != 0) goto L_0x0033
        L_0x002b:
            return r1
        L_0x002c:
            android.support.v4.g.n r0 = new android.support.v4.g.n
            r0.<init>()
            r9.f3874l = r0
        L_0x0033:
            android.util.TypedValue r0 = r9.f3877o
            if (r0 != 0) goto L_0x003e
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r9.f3877o = r0
        L_0x003e:
            android.util.TypedValue r0 = r9.f3877o
            android.content.res.Resources r1 = r10.getResources()
            r2 = 1
            r1.getValue(r11, r0, r2)
            long r3 = m6075a(r0)
            android.graphics.drawable.Drawable r5 = r9.m6080a(r10, r3)
            if (r5 == 0) goto L_0x0053
            return r5
        L_0x0053:
            java.lang.CharSequence r6 = r0.string
            if (r6 == 0) goto L_0x00b0
            java.lang.CharSequence r6 = r0.string
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = ".xml"
            boolean r6 = r6.endsWith(r7)
            if (r6 == 0) goto L_0x00b0
            android.content.res.XmlResourceParser r1 = r1.getXml(r11)     // Catch:{ Exception -> 0x00a8 }
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a8 }
        L_0x006d:
            int r7 = r1.next()     // Catch:{ Exception -> 0x00a8 }
            r8 = 2
            if (r7 == r8) goto L_0x0077
            if (r7 == r2) goto L_0x0077
            goto L_0x006d
        L_0x0077:
            if (r7 != r8) goto L_0x00a0
            java.lang.String r2 = r1.getName()     // Catch:{ Exception -> 0x00a8 }
            android.support.v4.g.n<java.lang.String> r7 = r9.f3874l     // Catch:{ Exception -> 0x00a8 }
            r7.mo2032c(r11, r2)     // Catch:{ Exception -> 0x00a8 }
            android.support.v4.g.a<java.lang.String, android.support.v7.widget.k$c> r7 = r9.f3873k     // Catch:{ Exception -> 0x00a8 }
            java.lang.Object r2 = r7.get(r2)     // Catch:{ Exception -> 0x00a8 }
            android.support.v7.widget.k$c r2 = (android.support.p023v7.widget.C1111k.C1114c) r2     // Catch:{ Exception -> 0x00a8 }
            if (r2 == 0) goto L_0x0095
            android.content.res.Resources$Theme r7 = r10.getTheme()     // Catch:{ Exception -> 0x00a8 }
            android.graphics.drawable.Drawable r1 = r2.mo5495a(r10, r1, r6, r7)     // Catch:{ Exception -> 0x00a8 }
            r5 = r1
        L_0x0095:
            if (r5 == 0) goto L_0x00b0
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a8 }
            r5.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a8 }
            r9.m6088a(r10, r3, r5)     // Catch:{ Exception -> 0x00a8 }
            goto L_0x00b0
        L_0x00a0:
            org.xmlpull.v1.XmlPullParserException r10 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r0 = "No start tag found"
            r10.<init>(r0)     // Catch:{ Exception -> 0x00a8 }
            throw r10     // Catch:{ Exception -> 0x00a8 }
        L_0x00a8:
            r10 = move-exception
            java.lang.String r0 = "AppCompatDrawableManag"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r10)
        L_0x00b0:
            if (r5 != 0) goto L_0x00b9
            android.support.v4.g.n<java.lang.String> r10 = r9.f3874l
            java.lang.String r0 = "appcompat_skip_skip"
            r10.mo2032c(r11, r0)
        L_0x00b9:
            return r5
        L_0x00ba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.C1111k.m6095d(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: e */
    private ColorStateList m6096e(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList b = C1073bf.m5872b(context, C0727a.colorSwitchThumbNormal);
        if (b == null || !b.isStateful()) {
            iArr[0] = C1073bf.f3731a;
            iArr2[0] = C1073bf.m5873c(context, C0727a.colorSwitchThumbNormal);
            iArr[1] = C1073bf.f3735e;
            iArr2[1] = C1073bf.m5869a(context, C0727a.colorControlActivated);
            iArr[2] = C1073bf.f3738h;
            iArr2[2] = C1073bf.m5869a(context, C0727a.colorSwitchThumbNormal);
        } else {
            iArr[0] = C1073bf.f3731a;
            iArr2[0] = b.getColorForState(iArr[0], 0);
            iArr[1] = C1073bf.f3735e;
            iArr2[1] = C1073bf.m5869a(context, C0727a.colorControlActivated);
            iArr[2] = C1073bf.f3738h;
            iArr2[2] = b.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* renamed from: e */
    private ColorStateList m6097e(Context context, int i) {
        if (this.f3872j == null) {
            return null;
        }
        C0511n nVar = (C0511n) this.f3872j.get(context);
        if (nVar != null) {
            return (ColorStateList) nVar.mo2025a(i);
        }
        return null;
    }

    /* renamed from: f */
    private ColorStateList m6098f(Context context, int i) {
        int a = C1073bf.m5869a(context, C0727a.colorControlHighlight);
        return new ColorStateList(new int[][]{C1073bf.f3731a, C1073bf.f3734d, C1073bf.f3732b, C1073bf.f3738h}, new int[]{C1073bf.m5873c(context, C0727a.colorButtonNormal), C0310a.m1166a(a, i), C0310a.m1166a(a, i), i});
    }

    /* renamed from: f */
    private void m6099f(Context context) {
        if (!this.f3878p) {
            this.f3878p = true;
            Drawable a = mo5490a(context, C0731e.abc_vector_test);
            if (a == null || !m6089a(a)) {
                this.f3878p = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: a */
    public Drawable mo5490a(Context context, int i) {
        return mo5491a(context, i, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Drawable mo5491a(Context context, int i, boolean z) {
        m6099f(context);
        Drawable d = m6095d(context, i);
        if (d == null) {
            d = m6093c(context, i);
        }
        if (d == null) {
            d = C0452b.m2059a(context, i);
        }
        if (d != null) {
            d = m6079a(context, i, z, d);
        }
        if (d != null) {
            C1011ag.m5520b(d);
        }
        return d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Drawable mo5492a(Context context, C1087bp bpVar, int i) {
        Drawable d = m6095d(context, i);
        if (d == null) {
            d = bpVar.mo5385a(i);
        }
        if (d != null) {
            return m6079a(context, i, false, d);
        }
        return null;
    }

    /* renamed from: a */
    public void mo5493a(Context context) {
        synchronized (this.f3875m) {
            C0495f fVar = (C0495f) this.f3876n.get(context);
            if (fVar != null) {
                fVar.mo1925c();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0077  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList mo5494b(android.content.Context r3, int r4) {
        /*
            r2 = this;
            android.content.res.ColorStateList r0 = r2.m6097e(r3, r4)
            if (r0 != 0) goto L_0x007a
            int r1 = android.support.p023v7.p024a.C0726a.C0731e.abc_edit_text_material
            if (r4 != r1) goto L_0x0012
            int r0 = android.support.p023v7.p024a.C0726a.C0729c.abc_tint_edittext
        L_0x000c:
            android.content.res.ColorStateList r0 = android.support.p023v7.p026c.p027a.C0817b.m3881a(r3, r0)
            goto L_0x0075
        L_0x0012:
            int r1 = android.support.p023v7.p024a.C0726a.C0731e.abc_switch_track_mtrl_alpha
            if (r4 != r1) goto L_0x0019
            int r0 = android.support.p023v7.p024a.C0726a.C0729c.abc_tint_switch_track
            goto L_0x000c
        L_0x0019:
            int r1 = android.support.p023v7.p024a.C0726a.C0731e.abc_switch_thumb_material
            if (r4 != r1) goto L_0x0022
            android.content.res.ColorStateList r0 = r2.m6096e(r3)
            goto L_0x0075
        L_0x0022:
            int r1 = android.support.p023v7.p024a.C0726a.C0731e.abc_btn_default_mtrl_shape
            if (r4 != r1) goto L_0x002b
            android.content.res.ColorStateList r0 = r2.m6091b(r3)
            goto L_0x0075
        L_0x002b:
            int r1 = android.support.p023v7.p024a.C0726a.C0731e.abc_btn_borderless_material
            if (r4 != r1) goto L_0x0034
            android.content.res.ColorStateList r0 = r2.m6092c(r3)
            goto L_0x0075
        L_0x0034:
            int r1 = android.support.p023v7.p024a.C0726a.C0731e.abc_btn_colored_material
            if (r4 != r1) goto L_0x003d
            android.content.res.ColorStateList r0 = r2.m6094d(r3)
            goto L_0x0075
        L_0x003d:
            int r1 = android.support.p023v7.p024a.C0726a.C0731e.abc_spinner_mtrl_am_alpha
            if (r4 == r1) goto L_0x0072
            int r1 = android.support.p023v7.p024a.C0726a.C0731e.abc_spinner_textfield_background_material
            if (r4 != r1) goto L_0x0046
            goto L_0x0072
        L_0x0046:
            int[] r1 = f3867e
            boolean r1 = m6090a(r1, r4)
            if (r1 == 0) goto L_0x0055
            int r0 = android.support.p023v7.p024a.C0726a.C0727a.colorControlNormal
            android.content.res.ColorStateList r0 = android.support.p023v7.widget.C1073bf.m5872b(r3, r0)
            goto L_0x0075
        L_0x0055:
            int[] r1 = f3870h
            boolean r1 = m6090a(r1, r4)
            if (r1 == 0) goto L_0x0060
            int r0 = android.support.p023v7.p024a.C0726a.C0729c.abc_tint_default
            goto L_0x000c
        L_0x0060:
            int[] r1 = f3871i
            boolean r1 = m6090a(r1, r4)
            if (r1 == 0) goto L_0x006b
            int r0 = android.support.p023v7.p024a.C0726a.C0729c.abc_tint_btn_checkable
            goto L_0x000c
        L_0x006b:
            int r1 = android.support.p023v7.p024a.C0726a.C0731e.abc_seekbar_thumb_material
            if (r4 != r1) goto L_0x0075
            int r0 = android.support.p023v7.p024a.C0726a.C0729c.abc_tint_seek_thumb
            goto L_0x000c
        L_0x0072:
            int r0 = android.support.p023v7.p024a.C0726a.C0729c.abc_tint_spinner
            goto L_0x000c
        L_0x0075:
            if (r0 == 0) goto L_0x007a
            r2.m6082a(r3, r4, r0)
        L_0x007a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.C1111k.mo5494b(android.content.Context, int):android.content.res.ColorStateList");
    }
}
