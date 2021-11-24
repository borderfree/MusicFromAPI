package com.seattleclouds.previewer.appmart.order.colorpickerpalette;

import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* renamed from: com.seattleclouds.previewer.appmart.order.colorpickerpalette.c */
public class C6447c extends LayerDrawable {

    /* renamed from: a */
    private int f22925a;

    public C6447c(Drawable[] drawableArr, int i) {
        super(drawableArr);
        this.f22925a = i;
    }

    /* renamed from: a */
    private static int m31245a(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * 0.7f;
        return Color.HSVToColor(fArr);
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int i2 = iArr[i];
            if (i2 == 16842919 || i2 == 16842908) {
                z = true;
            } else {
                i++;
            }
        }
        z = true;
        super.setColorFilter(z ? m31245a(this.f22925a) : this.f22925a, Mode.SRC_ATOP);
        return super.onStateChange(iArr);
    }
}
