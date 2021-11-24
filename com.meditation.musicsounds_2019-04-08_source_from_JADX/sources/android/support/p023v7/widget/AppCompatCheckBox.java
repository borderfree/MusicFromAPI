package android.support.p023v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p009v4.widget.C0719q;
import android.support.p023v7.p024a.C0726a.C0727a;
import android.support.p023v7.p026c.p027a.C0817b;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* renamed from: android.support.v7.widget.AppCompatCheckBox */
public class AppCompatCheckBox extends CheckBox implements C0719q {

    /* renamed from: a */
    private final C1110j f2867a;

    public AppCompatCheckBox(Context context) {
        this(context, null);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0727a.checkboxStyle);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(C1075bh.m5876a(context), attributeSet, i);
        this.f2867a = new C1110j(this);
        this.f2867a.mo5486a(attributeSet, i);
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return this.f2867a != null ? this.f2867a.mo5482a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        if (this.f2867a != null) {
            return this.f2867a.mo5483a();
        }
        return null;
    }

    public Mode getSupportButtonTintMode() {
        if (this.f2867a != null) {
            return this.f2867a.mo5487b();
        }
        return null;
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C0817b.m3884b(getContext(), i));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.f2867a != null) {
            this.f2867a.mo5488c();
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        if (this.f2867a != null) {
            this.f2867a.mo5484a(colorStateList);
        }
    }

    public void setSupportButtonTintMode(Mode mode) {
        if (this.f2867a != null) {
            this.f2867a.mo5485a(mode);
        }
    }
}
