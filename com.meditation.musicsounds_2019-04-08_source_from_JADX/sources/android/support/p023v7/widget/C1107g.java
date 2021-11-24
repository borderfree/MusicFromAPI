package android.support.p023v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p009v4.view.C0626s;
import android.support.p023v7.p024a.C0726a.C0736j;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: android.support.v7.widget.g */
class C1107g {

    /* renamed from: a */
    private final View f3847a;

    /* renamed from: b */
    private final C1111k f3848b;

    /* renamed from: c */
    private int f3849c = -1;

    /* renamed from: d */
    private C1076bi f3850d;

    /* renamed from: e */
    private C1076bi f3851e;

    /* renamed from: f */
    private C1076bi f3852f;

    C1107g(View view) {
        this.f3847a = view;
        this.f3848b = C1111k.m6081a();
    }

    /* renamed from: b */
    private boolean m6056b(Drawable drawable) {
        if (this.f3852f == null) {
            this.f3852f = new C1076bi();
        }
        C1076bi biVar = this.f3852f;
        biVar.mo5353a();
        ColorStateList s = C0626s.m2876s(this.f3847a);
        if (s != null) {
            biVar.f3748d = true;
            biVar.f3745a = s;
        }
        Mode t = C0626s.m2877t(this.f3847a);
        if (t != null) {
            biVar.f3747c = true;
            biVar.f3746b = t;
        }
        if (!biVar.f3748d && !biVar.f3747c) {
            return false;
        }
        C1111k.m6084a(drawable, biVar, this.f3847a.getDrawableState());
        return true;
    }

    /* renamed from: d */
    private boolean m6057d() {
        int i = VERSION.SDK_INT;
        boolean z = false;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f3850d != null) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public ColorStateList mo5451a() {
        if (this.f3851e != null) {
            return this.f3851e.f3745a;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5452a(int i) {
        this.f3849c = i;
        mo5458b(this.f3848b != null ? this.f3848b.mo5494b(this.f3847a.getContext(), i) : null);
        mo5459c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5453a(ColorStateList colorStateList) {
        if (this.f3851e == null) {
            this.f3851e = new C1076bi();
        }
        this.f3851e.f3745a = colorStateList;
        this.f3851e.f3748d = true;
        mo5459c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5454a(Mode mode) {
        if (this.f3851e == null) {
            this.f3851e = new C1076bi();
        }
        this.f3851e.f3746b = mode;
        this.f3851e.f3747c = true;
        mo5459c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5455a(Drawable drawable) {
        this.f3849c = -1;
        mo5458b((ColorStateList) null);
        mo5459c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5456a(AttributeSet attributeSet, int i) {
        C1078bk a = C1078bk.m5881a(this.f3847a.getContext(), attributeSet, C0736j.ViewBackgroundHelper, i, 0);
        try {
            if (a.mo5371g(C0736j.ViewBackgroundHelper_android_background)) {
                this.f3849c = a.mo5370g(C0736j.ViewBackgroundHelper_android_background, -1);
                ColorStateList b = this.f3848b.mo5494b(this.f3847a.getContext(), this.f3849c);
                if (b != null) {
                    mo5458b(b);
                }
            }
            if (a.mo5371g(C0736j.ViewBackgroundHelper_backgroundTint)) {
                C0626s.m2840a(this.f3847a, a.mo5367e(C0736j.ViewBackgroundHelper_backgroundTint));
            }
            if (a.mo5371g(C0736j.ViewBackgroundHelper_backgroundTintMode)) {
                C0626s.m2841a(this.f3847a, C1011ag.m5518a(a.mo5355a(C0736j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            a.mo5358a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Mode mo5457b() {
        if (this.f3851e != null) {
            return this.f3851e.f3746b;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5458b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f3850d == null) {
                this.f3850d = new C1076bi();
            }
            this.f3850d.f3745a = colorStateList;
            this.f3850d.f3748d = true;
        } else {
            this.f3850d = null;
        }
        mo5459c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5459c() {
        C1076bi biVar;
        Drawable background = this.f3847a.getBackground();
        if (background != null && (!m6057d() || !m6056b(background))) {
            if (this.f3851e != null) {
                biVar = this.f3851e;
            } else {
                if (this.f3850d != null) {
                    biVar = this.f3850d;
                }
            }
            C1111k.m6084a(background, biVar, this.f3847a.getDrawableState());
        }
    }
}
