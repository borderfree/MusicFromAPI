package android.support.p009v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: android.support.v4.view.f */
public final class C0608f {
    /* renamed from: a */
    public static int m2747a(MarginLayoutParams marginLayoutParams) {
        return VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginStart() : marginLayoutParams.leftMargin;
    }

    /* renamed from: b */
    public static int m2748b(MarginLayoutParams marginLayoutParams) {
        return VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginEnd() : marginLayoutParams.rightMargin;
    }
}
