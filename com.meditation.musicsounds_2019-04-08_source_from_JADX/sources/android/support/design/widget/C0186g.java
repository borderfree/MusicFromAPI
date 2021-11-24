package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.design.C0087a.C0090c;
import android.support.p009v4.content.C0452b;
import android.support.p009v4.p010a.p011a.C0311a;
import android.support.p009v4.view.C0626s;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.Interpolator;

/* renamed from: android.support.design.widget.g */
class C0186g {

    /* renamed from: a */
    static final Interpolator f573a = C0163a.f484c;

    /* renamed from: j */
    static final int[] f574j = {16842919, 16842910};

    /* renamed from: k */
    static final int[] f575k = {16842908, 16842910};

    /* renamed from: l */
    static final int[] f576l = {16842910};

    /* renamed from: m */
    static final int[] f577m = new int[0];

    /* renamed from: b */
    int f578b = 0;

    /* renamed from: c */
    C0200k f579c;

    /* renamed from: d */
    Drawable f580d;

    /* renamed from: e */
    Drawable f581e;

    /* renamed from: f */
    C0182c f582f;

    /* renamed from: g */
    Drawable f583g;

    /* renamed from: h */
    float f584h;

    /* renamed from: i */
    float f585i;

    /* renamed from: n */
    final C0216v f586n;

    /* renamed from: o */
    final C0201l f587o;

    /* renamed from: p */
    private final C0206n f588p;

    /* renamed from: q */
    private float f589q;

    /* renamed from: r */
    private final Rect f590r = new Rect();

    /* renamed from: s */
    private OnPreDrawListener f591s;

    /* renamed from: android.support.design.widget.g$a */
    private class C0190a extends C0194e {
        C0190a() {
            super();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo908a() {
            return 0.0f;
        }
    }

    /* renamed from: android.support.design.widget.g$b */
    private class C0191b extends C0194e {
        C0191b() {
            super();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo908a() {
            return C0186g.this.f584h + C0186g.this.f585i;
        }
    }

    /* renamed from: android.support.design.widget.g$c */
    interface C0192c {
        /* renamed from: a */
        void mo610a();

        /* renamed from: b */
        void mo611b();
    }

    /* renamed from: android.support.design.widget.g$d */
    private class C0193d extends C0194e {
        C0193d() {
            super();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo908a() {
            return C0186g.this.f584h;
        }
    }

    /* renamed from: android.support.design.widget.g$e */
    private abstract class C0194e extends AnimatorListenerAdapter implements AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f603a;

        /* renamed from: c */
        private float f605c;

        /* renamed from: d */
        private float f606d;

        private C0194e() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract float mo908a();

        public void onAnimationEnd(Animator animator) {
            C0186g.this.f579c.mo925b(this.f606d);
            this.f603a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f603a) {
                this.f605c = C0186g.this.f579c.mo921a();
                this.f606d = mo908a();
                this.f603a = true;
            }
            C0186g.this.f579c.mo925b(this.f605c + ((this.f606d - this.f605c) * valueAnimator.getAnimatedFraction()));
        }
    }

    C0186g(C0216v vVar, C0201l lVar) {
        this.f586n = vVar;
        this.f587o = lVar;
        this.f588p = new C0206n();
        this.f588p.mo944a(f574j, m723a((C0194e) new C0191b()));
        this.f588p.mo944a(f575k, m723a((C0194e) new C0191b()));
        this.f588p.mo944a(f576l, m723a((C0194e) new C0193d()));
        this.f588p.mo944a(f577m, m723a((C0194e) new C0190a()));
        this.f589q = this.f586n.getRotation();
    }

    /* renamed from: a */
    private ValueAnimator m723a(C0194e eVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f573a);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(eVar);
        valueAnimator.addUpdateListener(eVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    /* renamed from: b */
    private static ColorStateList m724b(int i) {
        return new ColorStateList(new int[][]{f575k, f574j, new int[0]}, new int[]{i, i, 0});
    }

    /* renamed from: o */
    private void m725o() {
        if (this.f591s == null) {
            this.f591s = new OnPreDrawListener() {
                public boolean onPreDraw() {
                    C0186g.this.mo897j();
                    return true;
                }
            };
        }
    }

    /* renamed from: p */
    private boolean m726p() {
        return C0626s.m2880w(this.f586n) && !this.f586n.isInEditMode();
    }

    /* renamed from: q */
    private void m727q() {
        C0216v vVar;
        int i;
        if (VERSION.SDK_INT == 19) {
            if (this.f589q % 90.0f != 0.0f) {
                i = 1;
                if (this.f586n.getLayerType() != 1) {
                    vVar = this.f586n;
                }
            } else if (this.f586n.getLayerType() != 0) {
                vVar = this.f586n;
                i = 0;
            }
            vVar.setLayerType(i, null);
        }
        if (this.f579c != null) {
            this.f579c.mo922a(-this.f589q);
        }
        if (this.f582f != null) {
            this.f582f.mo842b(-this.f589q);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo875a() {
        return this.f584h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0182c mo876a(int i, ColorStateList colorStateList) {
        Context context = this.f586n.getContext();
        C0182c i2 = mo896i();
        i2.mo840a(C0452b.m2068c(context, C0090c.design_fab_stroke_top_outer_color), C0452b.m2068c(context, C0090c.design_fab_stroke_top_inner_color), C0452b.m2068c(context, C0090c.design_fab_stroke_end_inner_color), C0452b.m2068c(context, C0090c.design_fab_stroke_end_outer_color));
        i2.mo839a((float) i);
        i2.mo841a(colorStateList);
        return i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo877a(float f) {
        if (this.f584h != f) {
            this.f584h = f;
            mo878a(f, this.f585i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo878a(float f, float f2) {
        if (this.f579c != null) {
            this.f579c.mo923a(f, this.f585i + f);
            mo892e();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo879a(int i) {
        if (this.f581e != null) {
            C0311a.m1175a(this.f581e, m724b(i));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo880a(ColorStateList colorStateList) {
        if (this.f580d != null) {
            C0311a.m1175a(this.f580d, colorStateList);
        }
        if (this.f582f != null) {
            this.f582f.mo841a(colorStateList);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo881a(ColorStateList colorStateList, Mode mode, int i, int i2) {
        Drawable[] drawableArr;
        this.f580d = C0311a.m1186g(mo898k());
        C0311a.m1175a(this.f580d, colorStateList);
        if (mode != null) {
            C0311a.m1178a(this.f580d, mode);
        }
        this.f581e = C0311a.m1186g(mo898k());
        C0311a.m1175a(this.f581e, m724b(i));
        if (i2 > 0) {
            this.f582f = mo876a(i2, colorStateList);
            drawableArr = new Drawable[]{this.f582f, this.f580d, this.f581e};
        } else {
            this.f582f = null;
            drawableArr = new Drawable[]{this.f580d, this.f581e};
        }
        this.f583g = new LayerDrawable(drawableArr);
        C0200k kVar = new C0200k(this.f586n.getContext(), this.f583g, this.f587o.mo617a(), this.f584h, this.f584h + this.f585i);
        this.f579c = kVar;
        this.f579c.mo924a(false);
        this.f587o.mo619a(this.f579c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo882a(Mode mode) {
        if (this.f580d != null) {
            C0311a.m1178a(this.f580d, mode);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo883a(Rect rect) {
        this.f579c.getPadding(rect);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo884a(final C0192c cVar, final boolean z) {
        if (!mo901n()) {
            this.f586n.animate().cancel();
            if (m726p()) {
                this.f578b = 1;
                this.f586n.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(200).setInterpolator(C0163a.f484c).setListener(new AnimatorListenerAdapter() {

                    /* renamed from: d */
                    private boolean f595d;

                    public void onAnimationCancel(Animator animator) {
                        this.f595d = true;
                    }

                    public void onAnimationEnd(Animator animator) {
                        C0186g.this.f578b = 0;
                        if (!this.f595d) {
                            C0186g.this.f586n.mo951a(z ? 8 : 4, z);
                            if (cVar != null) {
                                cVar.mo611b();
                            }
                        }
                    }

                    public void onAnimationStart(Animator animator) {
                        C0186g.this.f586n.mo951a(0, z);
                        this.f595d = false;
                    }
                });
            } else {
                this.f586n.mo951a(z ? 8 : 4, z);
                if (cVar != null) {
                    cVar.mo611b();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo885a(int[] iArr) {
        this.f588p.mo943a(iArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo886b() {
        this.f588p.mo942a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo887b(float f) {
        if (this.f585i != f) {
            this.f585i = f;
            mo878a(this.f584h, f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo888b(Rect rect) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo889b(final C0192c cVar, final boolean z) {
        if (!mo900m()) {
            this.f586n.animate().cancel();
            if (m726p()) {
                this.f578b = 2;
                if (this.f586n.getVisibility() != 0) {
                    this.f586n.setAlpha(0.0f);
                    this.f586n.setScaleY(0.0f);
                    this.f586n.setScaleX(0.0f);
                }
                this.f586n.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(200).setInterpolator(C0163a.f485d).setListener(new AnimatorListenerAdapter() {
                    public void onAnimationEnd(Animator animator) {
                        C0186g.this.f578b = 0;
                        if (cVar != null) {
                            cVar.mo610a();
                        }
                    }

                    public void onAnimationStart(Animator animator) {
                        C0186g.this.f586n.mo951a(0, z);
                    }
                });
            } else {
                this.f586n.mo951a(0, z);
                this.f586n.setAlpha(1.0f);
                this.f586n.setScaleY(1.0f);
                this.f586n.setScaleX(1.0f);
                if (cVar != null) {
                    cVar.mo610a();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final Drawable mo890c() {
        return this.f583g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo891d() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo892e() {
        Rect rect = this.f590r;
        mo883a(rect);
        mo888b(rect);
        this.f587o.mo618a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo893f() {
        if (mo895h()) {
            m725o();
            this.f586n.getViewTreeObserver().addOnPreDrawListener(this.f591s);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo894g() {
        if (this.f591s != null) {
            this.f586n.getViewTreeObserver().removeOnPreDrawListener(this.f591s);
            this.f591s = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo895h() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public C0182c mo896i() {
        return new C0182c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo897j() {
        float rotation = this.f586n.getRotation();
        if (this.f589q != rotation) {
            this.f589q = rotation;
            m727q();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public GradientDrawable mo898k() {
        GradientDrawable l = mo899l();
        l.setShape(1);
        l.setColor(-1);
        return l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public GradientDrawable mo899l() {
        return new GradientDrawable();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public boolean mo900m() {
        boolean z = false;
        if (this.f586n.getVisibility() != 0) {
            if (this.f578b == 2) {
                z = true;
            }
            return z;
        }
        if (this.f578b != 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public boolean mo901n() {
        boolean z = false;
        if (this.f586n.getVisibility() == 0) {
            if (this.f578b == 1) {
                z = true;
            }
            return z;
        }
        if (this.f578b != 2) {
            z = true;
        }
        return z;
    }
}
