package android.support.p007d.p008a;

import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.p009v4.p010a.p011a.C0311a;
import android.support.p009v4.p010a.p011a.C0312b;

/* renamed from: android.support.d.a.h */
abstract class C0078h extends Drawable implements C0312b {

    /* renamed from: b */
    Drawable f135b;

    C0078h() {
    }

    public void applyTheme(Theme theme) {
        if (this.f135b != null) {
            C0311a.m1176a(this.f135b, theme);
        }
    }

    public void clearColorFilter() {
        if (this.f135b != null) {
            this.f135b.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public ColorFilter getColorFilter() {
        if (this.f135b != null) {
            return C0311a.m1184e(this.f135b);
        }
        return null;
    }

    public Drawable getCurrent() {
        return this.f135b != null ? this.f135b.getCurrent() : super.getCurrent();
    }

    public int getMinimumHeight() {
        return this.f135b != null ? this.f135b.getMinimumHeight() : super.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f135b != null ? this.f135b.getMinimumWidth() : super.getMinimumWidth();
    }

    public boolean getPadding(Rect rect) {
        return this.f135b != null ? this.f135b.getPadding(rect) : super.getPadding(rect);
    }

    public int[] getState() {
        return this.f135b != null ? this.f135b.getState() : super.getState();
    }

    public Region getTransparentRegion() {
        return this.f135b != null ? this.f135b.getTransparentRegion() : super.getTransparentRegion();
    }

    public void jumpToCurrentState() {
        if (this.f135b != null) {
            C0311a.m1171a(this.f135b);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f135b != null) {
            this.f135b.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f135b != null ? this.f135b.setLevel(i) : super.onLevelChange(i);
    }

    public void setChangingConfigurations(int i) {
        if (this.f135b != null) {
            this.f135b.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    public void setColorFilter(int i, Mode mode) {
        if (this.f135b != null) {
            this.f135b.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    public void setFilterBitmap(boolean z) {
        if (this.f135b != null) {
            this.f135b.setFilterBitmap(z);
        }
    }

    public void setHotspot(float f, float f2) {
        if (this.f135b != null) {
            C0311a.m1172a(this.f135b, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f135b != null) {
            C0311a.m1174a(this.f135b, i, i2, i3, i4);
        }
    }

    public boolean setState(int[] iArr) {
        return this.f135b != null ? this.f135b.setState(iArr) : super.setState(iArr);
    }
}
