package android.support.p023v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.p009v4.widget.C0698j;
import android.support.p023v7.p024a.C0726a.C0736j;
import android.support.p023v7.p026c.p027a.C0817b;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: android.support.v7.widget.n */
public class C1118n {

    /* renamed from: a */
    private final ImageView f3881a;

    /* renamed from: b */
    private C1076bi f3882b;

    /* renamed from: c */
    private C1076bi f3883c;

    /* renamed from: d */
    private C1076bi f3884d;

    public C1118n(ImageView imageView) {
        this.f3881a = imageView;
    }

    /* renamed from: a */
    private boolean m6112a(Drawable drawable) {
        if (this.f3884d == null) {
            this.f3884d = new C1076bi();
        }
        C1076bi biVar = this.f3884d;
        biVar.mo5353a();
        ColorStateList a = C0698j.m3293a(this.f3881a);
        if (a != null) {
            biVar.f3748d = true;
            biVar.f3745a = a;
        }
        Mode b = C0698j.m3296b(this.f3881a);
        if (b != null) {
            biVar.f3747c = true;
            biVar.f3746b = b;
        }
        if (!biVar.f3748d && !biVar.f3747c) {
            return false;
        }
        C1111k.m6084a(drawable, biVar, this.f3881a.getDrawableState());
        return true;
    }

    /* renamed from: e */
    private boolean m6113e() {
        int i = VERSION.SDK_INT;
        boolean z = false;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f3882b != null) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public void mo5502a(int i) {
        if (i != 0) {
            Drawable b = C0817b.m3884b(this.f3881a.getContext(), i);
            if (b != null) {
                C1011ag.m5520b(b);
            }
            this.f3881a.setImageDrawable(b);
        } else {
            this.f3881a.setImageDrawable(null);
        }
        mo5509d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5503a(ColorStateList colorStateList) {
        if (this.f3883c == null) {
            this.f3883c = new C1076bi();
        }
        this.f3883c.f3745a = colorStateList;
        this.f3883c.f3748d = true;
        mo5509d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5504a(Mode mode) {
        if (this.f3883c == null) {
            this.f3883c = new C1076bi();
        }
        this.f3883c.f3746b = mode;
        this.f3883c.f3747c = true;
        mo5509d();
    }

    /* renamed from: a */
    public void mo5505a(AttributeSet attributeSet, int i) {
        C1078bk a = C1078bk.m5881a(this.f3881a.getContext(), attributeSet, C0736j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f3881a.getDrawable();
            if (drawable == null) {
                int g = a.mo5370g(C0736j.AppCompatImageView_srcCompat, -1);
                if (g != -1) {
                    drawable = C0817b.m3884b(this.f3881a.getContext(), g);
                    if (drawable != null) {
                        this.f3881a.setImageDrawable(drawable);
                    }
                }
            }
            if (drawable != null) {
                C1011ag.m5520b(drawable);
            }
            if (a.mo5371g(C0736j.AppCompatImageView_tint)) {
                C0698j.m3294a(this.f3881a, a.mo5367e(C0736j.AppCompatImageView_tint));
            }
            if (a.mo5371g(C0736j.AppCompatImageView_tintMode)) {
                C0698j.m3295a(this.f3881a, C1011ag.m5518a(a.mo5355a(C0736j.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            a.mo5358a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5506a() {
        return VERSION.SDK_INT < 21 || !(this.f3881a.getBackground() instanceof RippleDrawable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ColorStateList mo5507b() {
        if (this.f3883c != null) {
            return this.f3883c.f3745a;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Mode mo5508c() {
        if (this.f3883c != null) {
            return this.f3883c.f3746b;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo5509d() {
        C1076bi biVar;
        Drawable drawable = this.f3881a.getDrawable();
        if (drawable != null) {
            C1011ag.m5520b(drawable);
        }
        if (drawable != null && (!m6113e() || !m6112a(drawable))) {
            if (this.f3883c != null) {
                biVar = this.f3883c;
            } else {
                if (this.f3882b != null) {
                    biVar = this.f3882b;
                }
            }
            C1111k.m6084a(drawable, biVar, this.f3881a.getDrawableState());
        }
    }
}
