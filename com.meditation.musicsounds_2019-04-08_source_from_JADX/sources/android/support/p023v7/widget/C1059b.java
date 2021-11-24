package android.support.p023v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.b */
class C1059b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f3678a;

    public C1059b(ActionBarContainer actionBarContainer) {
        this.f3678a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        if (!this.f3678a.f2740d) {
            if (this.f3678a.f2737a != null) {
                this.f3678a.f2737a.draw(canvas);
            }
            if (this.f3678a.f2738b != null && this.f3678a.f2741e) {
                drawable = this.f3678a.f2738b;
            } else {
                return;
            }
        } else if (this.f3678a.f2739c != null) {
            drawable = this.f3678a.f2739c;
        } else {
            return;
        }
        drawable.draw(canvas);
    }

    public int getOpacity() {
        return 0;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
