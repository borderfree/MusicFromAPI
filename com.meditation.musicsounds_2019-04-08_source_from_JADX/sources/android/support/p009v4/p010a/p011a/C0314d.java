package android.support.p009v4.p010a.p011a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: android.support.v4.a.a.d */
class C0314d extends Drawable implements Callback, C0312b, C0313c {

    /* renamed from: a */
    static final Mode f862a = Mode.SRC_IN;

    /* renamed from: b */
    C0315a f863b;

    /* renamed from: c */
    Drawable f864c;

    /* renamed from: d */
    private int f865d;

    /* renamed from: e */
    private Mode f866e;

    /* renamed from: f */
    private boolean f867f;

    /* renamed from: g */
    private boolean f868g;

    /* renamed from: android.support.v4.a.a.d$a */
    protected static abstract class C0315a extends ConstantState {

        /* renamed from: a */
        int f869a;

        /* renamed from: b */
        ConstantState f870b;

        /* renamed from: c */
        ColorStateList f871c = null;

        /* renamed from: d */
        Mode f872d = C0314d.f862a;

        C0315a(C0315a aVar, Resources resources) {
            if (aVar != null) {
                this.f869a = aVar.f869a;
                this.f870b = aVar.f870b;
                this.f871c = aVar.f871c;
                this.f872d = aVar.f872d;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo1162a() {
            return this.f870b != null;
        }

        public int getChangingConfigurations() {
            return this.f869a | (this.f870b != null ? this.f870b.getChangingConfigurations() : 0);
        }

        public Drawable newDrawable() {
            return newDrawable(null);
        }

        public abstract Drawable newDrawable(Resources resources);
    }

    /* renamed from: android.support.v4.a.a.d$b */
    private static class C0316b extends C0315a {
        C0316b(C0315a aVar, Resources resources) {
            super(aVar, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0314d(this, resources);
        }
    }

    C0314d(Drawable drawable) {
        this.f863b = mo1133b();
        mo1132a(drawable);
    }

    C0314d(C0315a aVar, Resources resources) {
        this.f863b = aVar;
        m1191a(resources);
    }

    /* renamed from: a */
    private void m1191a(Resources resources) {
        if (this.f863b != null && this.f863b.f870b != null) {
            mo1132a(this.f863b.f870b.newDrawable(resources));
        }
    }

    /* renamed from: a */
    private boolean m1192a(int[] iArr) {
        if (!mo1134c()) {
            return false;
        }
        ColorStateList colorStateList = this.f863b.f871c;
        Mode mode = this.f863b.f872d;
        if (colorStateList == null || mode == null) {
            this.f867f = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f867f && colorForState == this.f865d && mode == this.f866e)) {
                setColorFilter(colorForState, mode);
                this.f865d = colorForState;
                this.f866e = mode;
                this.f867f = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final Drawable mo1131a() {
        return this.f864c;
    }

    /* renamed from: a */
    public final void mo1132a(Drawable drawable) {
        if (this.f864c != null) {
            this.f864c.setCallback(null);
        }
        this.f864c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            if (this.f863b != null) {
                this.f863b.f870b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0315a mo1133b() {
        return new C0316b(this.f863b, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo1134c() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.f864c.draw(canvas);
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | (this.f863b != null ? this.f863b.getChangingConfigurations() : 0) | this.f864c.getChangingConfigurations();
    }

    public ConstantState getConstantState() {
        if (this.f863b == null || !this.f863b.mo1162a()) {
            return null;
        }
        this.f863b.f869a = getChangingConfigurations();
        return this.f863b;
    }

    public Drawable getCurrent() {
        return this.f864c.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f864c.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f864c.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f864c.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f864c.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f864c.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f864c.getPadding(rect);
    }

    public int[] getState() {
        return this.f864c.getState();
    }

    public Region getTransparentRegion() {
        return this.f864c.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isStateful() {
        ColorStateList colorStateList = (!mo1134c() || this.f863b == null) ? null : this.f863b.f871c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f864c.isStateful();
    }

    public void jumpToCurrentState() {
        this.f864c.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f868g && super.mutate() == this) {
            this.f863b = mo1133b();
            if (this.f864c != null) {
                this.f864c.mutate();
            }
            if (this.f863b != null) {
                this.f863b.f870b = this.f864c != null ? this.f864c.getConstantState() : null;
            }
            this.f868g = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f864c != null) {
            this.f864c.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f864c.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f864c.setAlpha(i);
    }

    public void setChangingConfigurations(int i) {
        this.f864c.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f864c.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f864c.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f864c.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return m1192a(iArr) || this.f864c.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f863b.f871c = colorStateList;
        m1192a(getState());
    }

    public void setTintMode(Mode mode) {
        this.f863b.f872d = mode;
        m1192a(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f864c.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
