package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.p009v4.p010a.p011a.C0311a;
import android.view.View;
import java.util.ArrayList;

/* renamed from: android.support.design.widget.h */
class C0195h extends C0186g {

    /* renamed from: p */
    private InsetDrawable f607p;

    /* renamed from: android.support.design.widget.h$a */
    static class C0196a extends GradientDrawable {
        C0196a() {
        }

        public boolean isStateful() {
            return true;
        }
    }

    C0195h(C0216v vVar, C0201l lVar) {
        super(vVar, lVar);
    }

    /* renamed from: a */
    public float mo875a() {
        return this.f586n.getElevation();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo878a(float f, float f2) {
        if (VERSION.SDK_INT == 21) {
            if (this.f586n.isEnabled()) {
                this.f586n.setElevation(f);
                if (this.f586n.isFocused() || this.f586n.isPressed()) {
                    this.f586n.setTranslationZ(f2);
                }
            } else {
                this.f586n.setElevation(0.0f);
            }
            this.f586n.setTranslationZ(0.0f);
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ObjectAnimator.ofFloat(this.f586n, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f586n, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
            animatorSet.setInterpolator(f573a);
            stateListAnimator.addState(f574j, animatorSet);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.play(ObjectAnimator.ofFloat(this.f586n, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f586n, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
            animatorSet2.setInterpolator(f573a);
            stateListAnimator.addState(f575k, animatorSet2);
            AnimatorSet animatorSet3 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f586n, "elevation", new float[]{f}).setDuration(0));
            if (VERSION.SDK_INT >= 22 && VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(this.f586n, View.TRANSLATION_Z, new float[]{this.f586n.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f586n, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet3.playSequentially((Animator[]) arrayList.toArray(new ObjectAnimator[0]));
            animatorSet3.setInterpolator(f573a);
            stateListAnimator.addState(f576l, animatorSet3);
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.play(ObjectAnimator.ofFloat(this.f586n, "elevation", new float[]{0.0f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f586n, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(0));
            animatorSet4.setInterpolator(f573a);
            stateListAnimator.addState(f577m, animatorSet4);
            this.f586n.setStateListAnimator(stateListAnimator);
        }
        if (this.f587o.mo620b()) {
            mo892e();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo879a(int i) {
        if (this.f581e instanceof RippleDrawable) {
            ((RippleDrawable) this.f581e).setColor(ColorStateList.valueOf(i));
        } else {
            super.mo879a(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo881a(ColorStateList colorStateList, Mode mode, int i, int i2) {
        Drawable drawable;
        this.f580d = C0311a.m1186g(mo898k());
        C0311a.m1175a(this.f580d, colorStateList);
        if (mode != null) {
            C0311a.m1178a(this.f580d, mode);
        }
        if (i2 > 0) {
            this.f582f = mo876a(i2, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{this.f582f, this.f580d});
        } else {
            this.f582f = null;
            drawable = this.f580d;
        }
        this.f581e = new RippleDrawable(ColorStateList.valueOf(i), drawable, null);
        this.f583g = this.f581e;
        this.f587o.mo619a(this.f581e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo883a(Rect rect) {
        if (this.f587o.mo620b()) {
            float a = this.f587o.mo617a();
            float a2 = mo875a() + this.f585i;
            int ceil = (int) Math.ceil((double) C0200k.m798b(a2, a, false));
            int ceil2 = (int) Math.ceil((double) C0200k.m795a(a2, a, false));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo885a(int[] iArr) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo886b() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo888b(Rect rect) {
        C0201l lVar;
        Drawable drawable;
        if (this.f587o.mo620b()) {
            InsetDrawable insetDrawable = new InsetDrawable(this.f581e, rect.left, rect.top, rect.right, rect.bottom);
            this.f607p = insetDrawable;
            lVar = this.f587o;
            drawable = this.f607p;
        } else {
            lVar = this.f587o;
            drawable = this.f581e;
        }
        lVar.mo619a(drawable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo891d() {
        mo892e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo895h() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public C0182c mo896i() {
        return new C0183d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public GradientDrawable mo899l() {
        return new C0196a();
    }
}
