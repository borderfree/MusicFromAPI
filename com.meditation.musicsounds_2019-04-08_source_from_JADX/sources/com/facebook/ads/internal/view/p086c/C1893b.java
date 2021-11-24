package com.facebook.ads.internal.view.p086c;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.ads.internal.p077s.p078a.C1808r;

/* renamed from: com.facebook.ads.internal.view.c.b */
public class C1893b extends FrameLayout {

    /* renamed from: a */
    private final ImageView f6226a;

    /* renamed from: b */
    private int f6227b;

    /* renamed from: c */
    private int f6228c;

    /* renamed from: a */
    public void mo7222a(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap2 != null) {
            C1808r.m8933a((View) this, (Drawable) new BitmapDrawable(getContext().getResources(), bitmap2));
        } else {
            C1808r.m8932a((View) this, 0);
        }
        if (bitmap != null) {
            this.f6227b = bitmap.getWidth();
            this.f6228c = bitmap.getHeight();
            this.f6226a.setImageBitmap(Bitmap.createBitmap(bitmap));
            return;
        }
        this.f6226a.setImageDrawable(null);
    }

    public ImageView getBodyImageView() {
        return this.f6226a;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (this.f6227b <= 0 || this.f6228c <= 0) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        float min = Math.min(((float) i5) / ((float) this.f6227b), ((float) i6) / ((float) this.f6228c));
        int i7 = (int) (((float) this.f6227b) * min);
        int i8 = i + (i5 / 2);
        int i9 = i2 + (i6 / 2);
        int i10 = i7 / 2;
        int i11 = ((int) (min * ((float) this.f6228c))) / 2;
        this.f6226a.layout(i8 - i10, i9 - i11, i8 + i10, i9 + i11);
    }
}
