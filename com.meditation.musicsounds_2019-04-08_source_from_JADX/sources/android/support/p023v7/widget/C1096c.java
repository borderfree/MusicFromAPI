package android.support.p023v7.widget;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.c */
class C1096c extends C1059b {
    public C1096c(ActionBarContainer actionBarContainer) {
        super(actionBarContainer);
    }

    public void getOutline(Outline outline) {
        Drawable drawable;
        if (this.f3678a.f2740d) {
            if (this.f3678a.f2739c != null) {
                drawable = this.f3678a.f2739c;
            } else {
                return;
            }
        } else if (this.f3678a.f2737a != null) {
            drawable = this.f3678a.f2737a;
        } else {
            return;
        }
        drawable.getOutline(outline);
    }
}
