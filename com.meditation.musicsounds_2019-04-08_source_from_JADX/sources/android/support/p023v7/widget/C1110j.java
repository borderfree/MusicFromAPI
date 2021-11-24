package android.support.p023v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p009v4.p010a.p011a.C0311a;
import android.support.p009v4.widget.C0685e;
import android.support.p023v7.p024a.C0726a.C0736j;
import android.support.p023v7.p026c.p027a.C0817b;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* renamed from: android.support.v7.widget.j */
class C1110j {

    /* renamed from: a */
    private final CompoundButton f3857a;

    /* renamed from: b */
    private ColorStateList f3858b = null;

    /* renamed from: c */
    private Mode f3859c = null;

    /* renamed from: d */
    private boolean f3860d = false;

    /* renamed from: e */
    private boolean f3861e = false;

    /* renamed from: f */
    private boolean f3862f;

    C1110j(CompoundButton compoundButton) {
        this.f3857a = compoundButton;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo5482a(int i) {
        if (VERSION.SDK_INT >= 17) {
            return i;
        }
        Drawable a = C0685e.m3256a(this.f3857a);
        return a != null ? i + a.getIntrinsicWidth() : i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public ColorStateList mo5483a() {
        return this.f3858b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5484a(ColorStateList colorStateList) {
        this.f3858b = colorStateList;
        this.f3860d = true;
        mo5489d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5485a(Mode mode) {
        this.f3859c = mode;
        this.f3861e = true;
        mo5489d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5486a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f3857a.getContext().obtainStyledAttributes(attributeSet, C0736j.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(C0736j.CompoundButton_android_button)) {
                int resourceId = obtainStyledAttributes.getResourceId(C0736j.CompoundButton_android_button, 0);
                if (resourceId != 0) {
                    this.f3857a.setButtonDrawable(C0817b.m3884b(this.f3857a.getContext(), resourceId));
                }
            }
            if (obtainStyledAttributes.hasValue(C0736j.CompoundButton_buttonTint)) {
                C0685e.m3257a(this.f3857a, obtainStyledAttributes.getColorStateList(C0736j.CompoundButton_buttonTint));
            }
            if (obtainStyledAttributes.hasValue(C0736j.CompoundButton_buttonTintMode)) {
                C0685e.m3258a(this.f3857a, C1011ag.m5518a(obtainStyledAttributes.getInt(C0736j.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Mode mo5487b() {
        return this.f3859c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5488c() {
        if (this.f3862f) {
            this.f3862f = false;
            return;
        }
        this.f3862f = true;
        mo5489d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo5489d() {
        Drawable a = C0685e.m3256a(this.f3857a);
        if (a == null) {
            return;
        }
        if (this.f3860d || this.f3861e) {
            Drawable mutate = C0311a.m1186g(a).mutate();
            if (this.f3860d) {
                C0311a.m1175a(mutate, this.f3858b);
            }
            if (this.f3861e) {
                C0311a.m1178a(mutate, this.f3859c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f3857a.getDrawableState());
            }
            this.f3857a.setButtonDrawable(mutate);
        }
    }
}
