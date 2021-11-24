package android.support.p023v7.p028d.p029a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.support.p009v4.p010a.p011a.C0311a;

/* renamed from: android.support.v7.d.a.a */
public class C0820a extends Drawable implements Callback {

    /* renamed from: a */
    private Drawable f2418a;

    public C0820a(Drawable drawable) {
        mo3235a(drawable);
    }

    /* renamed from: a */
    public void mo3235a(Drawable drawable) {
        if (this.f2418a != null) {
            this.f2418a.setCallback(null);
        }
        this.f2418a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* renamed from: b */
    public Drawable mo3236b() {
        return this.f2418a;
    }

    public void draw(Canvas canvas) {
        this.f2418a.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f2418a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f2418a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f2418a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f2418a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f2418a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f2418a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f2418a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f2418a.getPadding(rect);
    }

    public int[] getState() {
        return this.f2418a.getState();
    }

    public Region getTransparentRegion() {
        return this.f2418a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C0311a.m1180b(this.f2418a);
    }

    public boolean isStateful() {
        return this.f2418a.isStateful();
    }

    public void jumpToCurrentState() {
        C0311a.m1171a(this.f2418a);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f2418a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f2418a.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f2418a.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0311a.m1179a(this.f2418a, z);
    }

    public void setChangingConfigurations(int i) {
        this.f2418a.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2418a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f2418a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f2418a.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C0311a.m1172a(this.f2418a, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0311a.m1174a(this.f2418a, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f2418a.setState(iArr);
    }

    public void setTint(int i) {
        C0311a.m1173a(this.f2418a, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0311a.m1175a(this.f2418a, colorStateList);
    }

    public void setTintMode(Mode mode) {
        C0311a.m1178a(this.f2418a, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f2418a.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
