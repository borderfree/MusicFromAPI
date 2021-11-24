package android.support.p009v4.view;

import android.view.MotionEvent;

/* renamed from: android.support.v4.view.h */
public final class C0615h {
    @Deprecated
    /* renamed from: a */
    public static int m2779a(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @Deprecated
    /* renamed from: a */
    public static int m2780a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    @Deprecated
    /* renamed from: b */
    public static int m2781b(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    @Deprecated
    /* renamed from: c */
    public static float m2782c(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    /* renamed from: d */
    public static boolean m2783d(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
