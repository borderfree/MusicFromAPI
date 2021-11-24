package android.support.p023v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p009v4.content.p015a.C0447b.C0448a;
import android.support.p009v4.widget.C0678b;
import android.support.p023v7.p024a.C0726a.C0736j;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.t */
class C1124t {

    /* renamed from: a */
    final TextView f3900a;

    /* renamed from: b */
    private C1076bi f3901b;

    /* renamed from: c */
    private C1076bi f3902c;

    /* renamed from: d */
    private C1076bi f3903d;

    /* renamed from: e */
    private C1076bi f3904e;

    /* renamed from: f */
    private final C1128w f3905f;

    /* renamed from: g */
    private int f3906g = 0;

    /* renamed from: h */
    private Typeface f3907h;

    /* renamed from: i */
    private boolean f3908i;

    C1124t(TextView textView) {
        this.f3900a = textView;
        this.f3905f = new C1128w(this.f3900a);
    }

    /* renamed from: a */
    protected static C1076bi m6135a(Context context, C1111k kVar, int i) {
        ColorStateList b = kVar.mo5494b(context, i);
        if (b == null) {
            return null;
        }
        C1076bi biVar = new C1076bi();
        biVar.f3748d = true;
        biVar.f3745a = b;
        return biVar;
    }

    /* renamed from: a */
    static C1124t m6136a(TextView textView) {
        return VERSION.SDK_INT >= 17 ? new C1126u(textView) : new C1124t(textView);
    }

    /* renamed from: a */
    private void m6137a(Context context, C1078bk bkVar) {
        Typeface typeface;
        this.f3906g = bkVar.mo5355a(C0736j.TextAppearance_android_textStyle, this.f3906g);
        boolean z = true;
        if (bkVar.mo5371g(C0736j.TextAppearance_android_fontFamily) || bkVar.mo5371g(C0736j.TextAppearance_fontFamily)) {
            this.f3907h = null;
            int i = bkVar.mo5371g(C0736j.TextAppearance_fontFamily) ? C0736j.TextAppearance_fontFamily : C0736j.TextAppearance_android_fontFamily;
            if (!context.isRestricted()) {
                final WeakReference weakReference = new WeakReference(this.f3900a);
                try {
                    this.f3907h = bkVar.mo5356a(i, this.f3906g, (C0448a) new C0448a() {
                        /* renamed from: a */
                        public void mo1813a(int i) {
                        }

                        /* renamed from: a */
                        public void mo1815a(Typeface typeface) {
                            C1124t.this.m6139a(weakReference, typeface);
                        }
                    });
                    if (this.f3907h != null) {
                        z = false;
                    }
                    this.f3908i = z;
                } catch (NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f3907h == null) {
                String d = bkVar.mo5365d(i);
                if (d != null) {
                    this.f3907h = Typeface.create(d, this.f3906g);
                }
            }
            return;
        }
        if (bkVar.mo5371g(C0736j.TextAppearance_android_typeface)) {
            this.f3908i = false;
            switch (bkVar.mo5355a(C0736j.TextAppearance_android_typeface, 1)) {
                case 1:
                    typeface = Typeface.SANS_SERIF;
                    break;
                case 2:
                    typeface = Typeface.SERIF;
                    break;
                case 3:
                    typeface = Typeface.MONOSPACE;
                    break;
            }
            this.f3907h = typeface;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6139a(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f3908i) {
            this.f3907h = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f3906g);
            }
        }
    }

    /* renamed from: b */
    private void m6140b(int i, float f) {
        this.f3905f.mo5561a(i, f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5526a() {
        if (this.f3901b != null || this.f3902c != null || this.f3903d != null || this.f3904e != null) {
            Drawable[] compoundDrawables = this.f3900a.getCompoundDrawables();
            mo5531a(compoundDrawables[0], this.f3901b);
            mo5531a(compoundDrawables[1], this.f3902c);
            mo5531a(compoundDrawables[2], this.f3903d);
            mo5531a(compoundDrawables[3], this.f3904e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5527a(int i) {
        this.f3905f.mo5560a(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5528a(int i, float f) {
        if (!C0678b.f1982a && !mo5537c()) {
            m6140b(i, f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5529a(int i, int i2, int i3, int i4) {
        this.f3905f.mo5562a(i, i2, i3, i4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5530a(Context context, int i) {
        C1078bk a = C1078bk.m5879a(context, i, C0736j.TextAppearance);
        if (a.mo5371g(C0736j.TextAppearance_textAllCaps)) {
            mo5533a(a.mo5359a(C0736j.TextAppearance_textAllCaps, false));
        }
        if (VERSION.SDK_INT < 23 && a.mo5371g(C0736j.TextAppearance_android_textColor)) {
            ColorStateList e = a.mo5367e(C0736j.TextAppearance_android_textColor);
            if (e != null) {
                this.f3900a.setTextColor(e);
            }
        }
        m6137a(context, a);
        a.mo5358a();
        if (this.f3907h != null) {
            this.f3900a.setTypeface(this.f3907h, this.f3906g);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5531a(Drawable drawable, C1076bi biVar) {
        if (drawable != null && biVar != null) {
            C1111k.m6084a(drawable, biVar, this.f3900a.getDrawableState());
        }
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo5532a(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        boolean z;
        boolean z2;
        Context context = this.f3900a.getContext();
        C1111k a = C1111k.m6081a();
        C1078bk a2 = C1078bk.m5881a(context, attributeSet, C0736j.AppCompatTextHelper, i, 0);
        int g = a2.mo5370g(C0736j.AppCompatTextHelper_android_textAppearance, -1);
        if (a2.mo5371g(C0736j.AppCompatTextHelper_android_drawableLeft)) {
            this.f3901b = m6135a(context, a, a2.mo5370g(C0736j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a2.mo5371g(C0736j.AppCompatTextHelper_android_drawableTop)) {
            this.f3902c = m6135a(context, a, a2.mo5370g(C0736j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a2.mo5371g(C0736j.AppCompatTextHelper_android_drawableRight)) {
            this.f3903d = m6135a(context, a, a2.mo5370g(C0736j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a2.mo5371g(C0736j.AppCompatTextHelper_android_drawableBottom)) {
            this.f3904e = m6135a(context, a, a2.mo5370g(C0736j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        a2.mo5358a();
        boolean z3 = this.f3900a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z4 = true;
        ColorStateList colorStateList3 = null;
        if (g != -1) {
            C1078bk a3 = C1078bk.m5879a(context, g, C0736j.TextAppearance);
            if (z3 || !a3.mo5371g(C0736j.TextAppearance_textAllCaps)) {
                z2 = false;
                z = false;
            } else {
                z = a3.mo5359a(C0736j.TextAppearance_textAllCaps, false);
                z2 = true;
            }
            m6137a(context, a3);
            if (VERSION.SDK_INT < 23) {
                ColorStateList e = a3.mo5371g(C0736j.TextAppearance_android_textColor) ? a3.mo5367e(C0736j.TextAppearance_android_textColor) : null;
                colorStateList = a3.mo5371g(C0736j.TextAppearance_android_textColorHint) ? a3.mo5367e(C0736j.TextAppearance_android_textColorHint) : null;
                if (a3.mo5371g(C0736j.TextAppearance_android_textColorLink)) {
                    colorStateList3 = a3.mo5367e(C0736j.TextAppearance_android_textColorLink);
                }
                ColorStateList colorStateList4 = e;
                colorStateList2 = colorStateList3;
                colorStateList3 = colorStateList4;
            } else {
                colorStateList2 = null;
                colorStateList = null;
            }
            a3.mo5358a();
        } else {
            colorStateList2 = null;
            colorStateList = null;
            z2 = false;
            z = false;
        }
        C1078bk a4 = C1078bk.m5881a(context, attributeSet, C0736j.TextAppearance, i, 0);
        if (z3 || !a4.mo5371g(C0736j.TextAppearance_textAllCaps)) {
            z4 = z2;
        } else {
            z = a4.mo5359a(C0736j.TextAppearance_textAllCaps, false);
        }
        if (VERSION.SDK_INT < 23) {
            if (a4.mo5371g(C0736j.TextAppearance_android_textColor)) {
                colorStateList3 = a4.mo5367e(C0736j.TextAppearance_android_textColor);
            }
            if (a4.mo5371g(C0736j.TextAppearance_android_textColorHint)) {
                colorStateList = a4.mo5367e(C0736j.TextAppearance_android_textColorHint);
            }
            if (a4.mo5371g(C0736j.TextAppearance_android_textColorLink)) {
                colorStateList2 = a4.mo5367e(C0736j.TextAppearance_android_textColorLink);
            }
        }
        m6137a(context, a4);
        a4.mo5358a();
        if (colorStateList3 != null) {
            this.f3900a.setTextColor(colorStateList3);
        }
        if (colorStateList != null) {
            this.f3900a.setHintTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            this.f3900a.setLinkTextColor(colorStateList2);
        }
        if (!z3 && z4) {
            mo5533a(z);
        }
        if (this.f3907h != null) {
            this.f3900a.setTypeface(this.f3907h, this.f3906g);
        }
        this.f3905f.mo5563a(attributeSet, i);
        if (C0678b.f1982a && this.f3905f.mo5559a() != 0) {
            int[] e2 = this.f3905f.mo5568e();
            if (e2.length <= 0) {
                return;
            }
            if (((float) this.f3900a.getAutoSizeStepGranularity()) != -1.0f) {
                this.f3900a.setAutoSizeTextTypeUniformWithConfiguration(this.f3905f.mo5566c(), this.f3905f.mo5567d(), this.f3905f.mo5565b(), 0);
            } else {
                this.f3900a.setAutoSizeTextTypeUniformWithPresetSizes(e2, 0);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5533a(boolean z) {
        this.f3900a.setAllCaps(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5534a(boolean z, int i, int i2, int i3, int i4) {
        if (!C0678b.f1982a) {
            mo5536b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5535a(int[] iArr, int i) {
        this.f3905f.mo5564a(iArr, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5536b() {
        this.f3905f.mo5569f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo5537c() {
        return this.f3905f.mo5570g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo5538d() {
        return this.f3905f.mo5559a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo5539e() {
        return this.f3905f.mo5565b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo5540f() {
        return this.f3905f.mo5566c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo5541g() {
        return this.f3905f.mo5567d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public int[] mo5542h() {
        return this.f3905f.mo5568e();
    }
}
