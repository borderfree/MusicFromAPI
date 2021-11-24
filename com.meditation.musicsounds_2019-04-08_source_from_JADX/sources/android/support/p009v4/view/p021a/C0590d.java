package android.support.p009v4.view.p021a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: android.support.v4.view.a.d */
public class C0590d {

    /* renamed from: a */
    private final AccessibilityRecord f1736a;

    /* renamed from: a */
    public static void m2703a(AccessibilityRecord accessibilityRecord, int i) {
        if (VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(i);
        }
    }

    /* renamed from: b */
    public static void m2704b(AccessibilityRecord accessibilityRecord, int i) {
        if (VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0590d dVar = (C0590d) obj;
        if (this.f1736a == null) {
            if (dVar.f1736a != null) {
                return false;
            }
        } else if (!this.f1736a.equals(dVar.f1736a)) {
            return false;
        }
        return true;
    }

    @Deprecated
    public int hashCode() {
        if (this.f1736a == null) {
            return 0;
        }
        return this.f1736a.hashCode();
    }
}
