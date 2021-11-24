package android.support.p023v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p009v4.view.C0625r;
import android.support.p023v7.p024a.C0726a.C0727a;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.l */
public class C1116l extends EditText implements C0625r {

    /* renamed from: a */
    private final C1107g f3879a;

    /* renamed from: b */
    private final C1124t f3880b;

    public C1116l(Context context) {
        this(context, null);
    }

    public C1116l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0727a.editTextStyle);
    }

    public C1116l(Context context, AttributeSet attributeSet, int i) {
        super(C1075bh.m5876a(context), attributeSet, i);
        this.f3879a = new C1107g(this);
        this.f3879a.mo5456a(attributeSet, i);
        this.f3880b = C1124t.m6136a((TextView) this);
        this.f3880b.mo5532a(attributeSet, i);
        this.f3880b.mo5526a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f3879a != null) {
            this.f3879a.mo5459c();
        }
        if (this.f3880b != null) {
            this.f3880b.mo5526a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f3879a != null) {
            return this.f3879a.mo5451a();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        if (this.f3879a != null) {
            return this.f3879a.mo5457b();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C1117m.m6111a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f3879a != null) {
            this.f3879a.mo5455a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f3879a != null) {
            this.f3879a.mo5452a(i);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f3879a != null) {
            this.f3879a.mo5453a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f3879a != null) {
            this.f3879a.mo5454a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f3880b != null) {
            this.f3880b.mo5530a(context, i);
        }
    }
}
