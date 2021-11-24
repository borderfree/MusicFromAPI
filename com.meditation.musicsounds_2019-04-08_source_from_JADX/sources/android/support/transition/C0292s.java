package android.support.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* renamed from: android.support.transition.s */
class C0292s implements TypeEvaluator<Rect> {

    /* renamed from: a */
    private Rect f796a;

    C0292s() {
    }

    /* renamed from: a */
    public Rect evaluate(float f, Rect rect, Rect rect2) {
        int i = rect.left + ((int) (((float) (rect2.left - rect.left)) * f));
        int i2 = rect.top + ((int) (((float) (rect2.top - rect.top)) * f));
        int i3 = rect.right + ((int) (((float) (rect2.right - rect.right)) * f));
        int i4 = rect.bottom + ((int) (((float) (rect2.bottom - rect.bottom)) * f));
        if (this.f796a == null) {
            return new Rect(i, i2, i3, i4);
        }
        this.f796a.set(i, i2, i3, i4);
        return this.f796a;
    }
}
