package android.support.p023v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p009v4.view.C0625r;
import android.support.p009v4.widget.C0720r;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: android.support.v7.widget.AppCompatImageView */
public class AppCompatImageView extends ImageView implements C0625r, C0720r {

    /* renamed from: a */
    private final C1107g f2870a;

    /* renamed from: b */
    private final C1118n f2871b;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(C1075bh.m5876a(context), attributeSet, i);
        this.f2870a = new C1107g(this);
        this.f2870a.mo5456a(attributeSet, i);
        this.f2871b = new C1118n(this);
        this.f2871b.mo5505a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2870a != null) {
            this.f2870a.mo5459c();
        }
        if (this.f2871b != null) {
            this.f2871b.mo5509d();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f2870a != null) {
            return this.f2870a.mo5451a();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        if (this.f2870a != null) {
            return this.f2870a.mo5457b();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        if (this.f2871b != null) {
            return this.f2871b.mo5507b();
        }
        return null;
    }

    public Mode getSupportImageTintMode() {
        if (this.f2871b != null) {
            return this.f2871b.mo5508c();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f2871b.mo5506a() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f2870a != null) {
            this.f2870a.mo5455a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f2870a != null) {
            this.f2870a.mo5452a(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (this.f2871b != null) {
            this.f2871b.mo5509d();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.f2871b != null) {
            this.f2871b.mo5509d();
        }
    }

    public void setImageResource(int i) {
        if (this.f2871b != null) {
            this.f2871b.mo5502a(i);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        if (this.f2871b != null) {
            this.f2871b.mo5509d();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f2870a != null) {
            this.f2870a.mo5453a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f2870a != null) {
            this.f2870a.mo5454a(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f2871b != null) {
            this.f2871b.mo5503a(colorStateList);
        }
    }

    public void setSupportImageTintMode(Mode mode) {
        if (this.f2871b != null) {
            this.f2871b.mo5504a(mode);
        }
    }
}
