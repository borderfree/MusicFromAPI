package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.Property;

/* renamed from: android.support.transition.h */
class C0280h {

    /* renamed from: a */
    private static final C0283k f788a = (VERSION.SDK_INT >= 21 ? new C0282j() : new C0281i());

    /* renamed from: a */
    static <T> ObjectAnimator m1046a(T t, Property<T, PointF> property, Path path) {
        return f788a.mo1068a(t, property, path);
    }
}
