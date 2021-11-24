package android.support.p023v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p009v4.p010a.p011a.C0311a;
import android.support.p009v4.view.C0626s;
import android.support.p023v7.p024a.C0726a.C0736j;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: android.support.v7.widget.s */
class C1123s extends C1121q {

    /* renamed from: a */
    private final SeekBar f3894a;

    /* renamed from: b */
    private Drawable f3895b;

    /* renamed from: c */
    private ColorStateList f3896c = null;

    /* renamed from: d */
    private Mode f3897d = null;

    /* renamed from: e */
    private boolean f3898e = false;

    /* renamed from: f */
    private boolean f3899f = false;

    C1123s(SeekBar seekBar) {
        super(seekBar);
        this.f3894a = seekBar;
    }

    /* renamed from: d */
    private void m6129d() {
        if (this.f3895b == null) {
            return;
        }
        if (this.f3898e || this.f3899f) {
            this.f3895b = C0311a.m1186g(this.f3895b.mutate());
            if (this.f3898e) {
                C0311a.m1175a(this.f3895b, this.f3896c);
            }
            if (this.f3899f) {
                C0311a.m1178a(this.f3895b, this.f3897d);
            }
            if (this.f3895b.isStateful()) {
                this.f3895b.setState(this.f3894a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5522a(Canvas canvas) {
        if (this.f3895b != null) {
            int max = this.f3894a.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f3895b.getIntrinsicWidth();
                int intrinsicHeight = this.f3895b.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f3895b.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f3894a.getWidth() - this.f3894a.getPaddingLeft()) - this.f3894a.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f3894a.getPaddingLeft(), (float) (this.f3894a.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f3895b.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5523a(Drawable drawable) {
        if (this.f3895b != null) {
            this.f3895b.setCallback(null);
        }
        this.f3895b = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f3894a);
            C0311a.m1181b(drawable, C0626s.m2861e(this.f3894a));
            if (drawable.isStateful()) {
                drawable.setState(this.f3894a.getDrawableState());
            }
            m6129d();
        }
        this.f3894a.invalidate();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5520a(AttributeSet attributeSet, int i) {
        super.mo5520a(attributeSet, i);
        C1078bk a = C1078bk.m5881a(this.f3894a.getContext(), attributeSet, C0736j.AppCompatSeekBar, i, 0);
        Drawable b = a.mo5361b(C0736j.AppCompatSeekBar_android_thumb);
        if (b != null) {
            this.f3894a.setThumb(b);
        }
        mo5523a(a.mo5357a(C0736j.AppCompatSeekBar_tickMark));
        if (a.mo5371g(C0736j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f3897d = C1011ag.m5518a(a.mo5355a(C0736j.AppCompatSeekBar_tickMarkTintMode, -1), this.f3897d);
            this.f3899f = true;
        }
        if (a.mo5371g(C0736j.AppCompatSeekBar_tickMarkTint)) {
            this.f3896c = a.mo5367e(C0736j.AppCompatSeekBar_tickMarkTint);
            this.f3898e = true;
        }
        a.mo5358a();
        m6129d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5524b() {
        if (this.f3895b != null) {
            this.f3895b.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5525c() {
        Drawable drawable = this.f3895b;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f3894a.getDrawableState())) {
            this.f3894a.invalidateDrawable(drawable);
        }
    }
}
