package android.support.p009v4.view.p021a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.a.a */
public final class C0582a {
    /* renamed from: a */
    public static int m2642a(AccessibilityEvent accessibilityEvent) {
        if (VERSION.SDK_INT >= 19) {
            return accessibilityEvent.getContentChangeTypes();
        }
        return 0;
    }

    /* renamed from: a */
    public static void m2643a(AccessibilityEvent accessibilityEvent, int i) {
        if (VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }
}
