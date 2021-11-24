package com.bumptech.glide.request.p055a;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.request.p056b.C1586b;
import com.bumptech.glide.request.p056b.C1586b.C1587a;

/* renamed from: com.bumptech.glide.request.a.d */
public abstract class C1575d<Z> extends C1580i<ImageView, Z> implements C1587a {

    /* renamed from: b */
    private Animatable f5111b;

    public C1575d(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: b */
    private void m7821b(Z z) {
        mo6442a(z);
        m7822c(z);
    }

    /* renamed from: c */
    private void m7822c(Z z) {
        if (z instanceof Animatable) {
            this.f5111b = (Animatable) z;
            this.f5111b.start();
            return;
        }
        this.f5111b = null;
    }

    /* renamed from: a */
    public void mo6437a(Drawable drawable) {
        super.mo6437a(drawable);
        if (this.f5111b != null) {
            this.f5111b.stop();
        }
        m7821b((Z) null);
        mo6444e(drawable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6442a(Z z);

    /* renamed from: a */
    public void mo6401a(Z z, C1586b<? super Z> bVar) {
        if (bVar == null || !bVar.mo6454a(z, this)) {
            m7821b(z);
        } else {
            m7822c(z);
        }
    }

    /* renamed from: b */
    public void mo6439b(Drawable drawable) {
        super.mo6439b(drawable);
        m7821b((Z) null);
        mo6444e(drawable);
    }

    /* renamed from: c */
    public void mo5758c() {
        if (this.f5111b != null) {
            this.f5111b.start();
        }
    }

    /* renamed from: c */
    public void mo6440c(Drawable drawable) {
        super.mo6440c(drawable);
        m7821b((Z) null);
        mo6444e(drawable);
    }

    /* renamed from: d */
    public void mo5759d() {
        if (this.f5111b != null) {
            this.f5111b.stop();
        }
    }

    /* renamed from: e */
    public void mo6444e(Drawable drawable) {
        ((ImageView) this.f5116a).setImageDrawable(drawable);
    }
}
