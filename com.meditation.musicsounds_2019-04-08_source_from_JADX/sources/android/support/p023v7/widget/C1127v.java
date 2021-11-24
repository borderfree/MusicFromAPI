package android.support.p023v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p009v4.view.C0625r;
import android.support.p009v4.widget.C0678b;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.v */
public class C1127v extends TextView implements C0625r, C0678b {

    /* renamed from: b */
    private final C1107g f3913b;

    /* renamed from: c */
    private final C1124t f3914c;

    public C1127v(Context context) {
        this(context, null);
    }

    public C1127v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C1127v(Context context, AttributeSet attributeSet, int i) {
        super(C1075bh.m5876a(context), attributeSet, i);
        this.f3913b = new C1107g(this);
        this.f3913b.mo5456a(attributeSet, i);
        this.f3914c = C1124t.m6136a((TextView) this);
        this.f3914c.mo5532a(attributeSet, i);
        this.f3914c.mo5526a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f3913b != null) {
            this.f3913b.mo5459c();
        }
        if (this.f3914c != null) {
            this.f3914c.mo5526a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (f1982a) {
            return super.getAutoSizeMaxTextSize();
        }
        if (this.f3914c != null) {
            return this.f3914c.mo5541g();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (f1982a) {
            return super.getAutoSizeMinTextSize();
        }
        if (this.f3914c != null) {
            return this.f3914c.mo5540f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (f1982a) {
            return super.getAutoSizeStepGranularity();
        }
        if (this.f3914c != null) {
            return this.f3914c.mo5539e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        return f1982a ? super.getAutoSizeTextAvailableSizes() : this.f3914c != null ? this.f3914c.mo5542h() : new int[0];
    }

    public int getAutoSizeTextType() {
        int i = 0;
        if (f1982a) {
            if (super.getAutoSizeTextType() == 1) {
                i = 1;
            }
            return i;
        } else if (this.f3914c != null) {
            return this.f3914c.mo5538d();
        } else {
            return 0;
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f3913b != null) {
            return this.f3913b.mo5451a();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        if (this.f3913b != null) {
            return this.f3913b.mo5457b();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C1117m.m6111a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f3914c != null) {
            this.f3914c.mo5534a(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f3914c != null && !f1982a && this.f3914c.mo5537c()) {
            this.f3914c.mo5536b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (f1982a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        } else if (this.f3914c != null) {
            this.f3914c.mo5529a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (f1982a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        } else if (this.f3914c != null) {
            this.f3914c.mo5535a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (f1982a) {
            super.setAutoSizeTextTypeWithDefaults(i);
        } else if (this.f3914c != null) {
            this.f3914c.mo5527a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f3913b != null) {
            this.f3913b.mo5455a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f3913b != null) {
            this.f3913b.mo5452a(i);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f3913b != null) {
            this.f3913b.mo5453a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f3913b != null) {
            this.f3913b.mo5454a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f3914c != null) {
            this.f3914c.mo5530a(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (f1982a) {
            super.setTextSize(i, f);
        } else if (this.f3914c != null) {
            this.f3914c.mo5528a(i, f);
        }
    }
}
