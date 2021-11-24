package android.support.p023v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p009v4.view.C0625r;
import android.support.p023v7.p024a.C0726a.C0727a;
import android.support.p023v7.p026c.p027a.C0817b;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.f */
public class C1106f extends AutoCompleteTextView implements C0625r {

    /* renamed from: a */
    private static final int[] f3844a = {16843126};

    /* renamed from: b */
    private final C1107g f3845b;

    /* renamed from: c */
    private final C1124t f3846c;

    public C1106f(Context context) {
        this(context, null);
    }

    public C1106f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0727a.autoCompleteTextViewStyle);
    }

    public C1106f(Context context, AttributeSet attributeSet, int i) {
        super(C1075bh.m5876a(context), attributeSet, i);
        C1078bk a = C1078bk.m5881a(getContext(), attributeSet, f3844a, i, 0);
        if (a.mo5371g(0)) {
            setDropDownBackgroundDrawable(a.mo5357a(0));
        }
        a.mo5358a();
        this.f3845b = new C1107g(this);
        this.f3845b.mo5456a(attributeSet, i);
        this.f3846c = C1124t.m6136a((TextView) this);
        this.f3846c.mo5532a(attributeSet, i);
        this.f3846c.mo5526a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f3845b != null) {
            this.f3845b.mo5459c();
        }
        if (this.f3846c != null) {
            this.f3846c.mo5526a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f3845b != null) {
            return this.f3845b.mo5451a();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        if (this.f3845b != null) {
            return this.f3845b.mo5457b();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C1117m.m6111a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f3845b != null) {
            this.f3845b.mo5455a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f3845b != null) {
            this.f3845b.mo5452a(i);
        }
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0817b.m3884b(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f3845b != null) {
            this.f3845b.mo5453a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f3845b != null) {
            this.f3845b.mo5454a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f3846c != null) {
            this.f3846c.mo5530a(context, i);
        }
    }
}
