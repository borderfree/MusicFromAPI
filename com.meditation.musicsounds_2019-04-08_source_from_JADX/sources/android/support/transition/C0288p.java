package android.support.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: android.support.transition.p */
class C0288p implements C0289q {
    C0288p() {
    }

    /* renamed from: a */
    public PropertyValuesHolder mo1074a(Property<?, PointF> property, Path path) {
        return PropertyValuesHolder.ofObject(property, null, path);
    }
}
