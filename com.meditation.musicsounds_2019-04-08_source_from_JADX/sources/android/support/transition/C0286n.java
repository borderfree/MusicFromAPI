package android.support.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.Property;

/* renamed from: android.support.transition.n */
class C0286n {

    /* renamed from: a */
    private static final C0289q f795a = (VERSION.SDK_INT >= 21 ? new C0288p() : new C0287o());

    /* renamed from: a */
    static PropertyValuesHolder m1053a(Property<?, PointF> property, Path path) {
        return f795a.mo1074a(property, path);
    }
}
