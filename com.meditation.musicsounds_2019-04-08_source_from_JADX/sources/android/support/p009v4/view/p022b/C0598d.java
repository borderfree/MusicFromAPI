package android.support.p009v4.view.p022b;

import android.view.animation.Interpolator;

/* renamed from: android.support.v4.view.b.d */
abstract class C0598d implements Interpolator {

    /* renamed from: a */
    private final float[] f1744a;

    /* renamed from: b */
    private final float f1745b = (1.0f / ((float) (this.f1744a.length - 1)));

    protected C0598d(float[] fArr) {
        this.f1744a = fArr;
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int min = Math.min((int) (((float) (this.f1744a.length - 1)) * f), this.f1744a.length - 2);
        return this.f1744a[min] + (((f - (((float) min) * this.f1745b)) / this.f1745b) * (this.f1744a[min + 1] - this.f1744a[min]));
    }
}
