package android.support.p023v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p023v7.p024a.C0726a.C0736j;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.u */
class C1126u extends C1124t {

    /* renamed from: b */
    private C1076bi f3911b;

    /* renamed from: c */
    private C1076bi f3912c;

    C1126u(TextView textView) {
        super(textView);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5526a() {
        super.mo5526a();
        if (this.f3911b != null || this.f3912c != null) {
            Drawable[] compoundDrawablesRelative = this.f3900a.getCompoundDrawablesRelative();
            mo5531a(compoundDrawablesRelative[0], this.f3911b);
            mo5531a(compoundDrawablesRelative[2], this.f3912c);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5532a(AttributeSet attributeSet, int i) {
        super.mo5532a(attributeSet, i);
        Context context = this.f3900a.getContext();
        C1111k a = C1111k.m6081a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0736j.AppCompatTextHelper, i, 0);
        if (obtainStyledAttributes.hasValue(C0736j.AppCompatTextHelper_android_drawableStart)) {
            this.f3911b = m6135a(context, a, obtainStyledAttributes.getResourceId(C0736j.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (obtainStyledAttributes.hasValue(C0736j.AppCompatTextHelper_android_drawableEnd)) {
            this.f3912c = m6135a(context, a, obtainStyledAttributes.getResourceId(C0736j.AppCompatTextHelper_android_drawableEnd, 0));
        }
        obtainStyledAttributes.recycle();
    }
}
