package android.support.p009v4.p010a.p011a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.a.a.f */
class C0319f extends C0317e {

    /* renamed from: d */
    private static Method f873d;

    /* renamed from: android.support.v4.a.a.f$a */
    private static class C0320a extends C0315a {
        C0320a(C0315a aVar, Resources resources) {
            super(aVar, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0319f(this, resources);
        }
    }

    C0319f(Drawable drawable) {
        super(drawable);
        m1199d();
    }

    C0319f(C0315a aVar, Resources resources) {
        super(aVar, resources);
        m1199d();
    }

    /* renamed from: d */
    private void m1199d() {
        if (f873d == null) {
            try {
                f873d = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0315a mo1133b() {
        return new C0320a(this.f863b, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo1134c() {
        if (VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f864c;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    public Rect getDirtyBounds() {
        return this.f864c.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.f864c.getOutline(outline);
    }

    public void setHotspot(float f, float f2) {
        this.f864c.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f864c.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i) {
        if (mo1134c()) {
            super.setTint(i);
        } else {
            this.f864c.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (mo1134c()) {
            super.setTintList(colorStateList);
        } else {
            this.f864c.setTintList(colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        if (mo1134c()) {
            super.setTintMode(mode);
        } else {
            this.f864c.setTintMode(mode);
        }
    }
}
