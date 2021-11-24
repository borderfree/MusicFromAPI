package android.support.p009v4.p018f;

import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: android.support.v4.f.d */
public final class C0487d {

    /* renamed from: a */
    private static final Locale f1453a = new Locale("", "");

    /* renamed from: a */
    public static int m2162a(Locale locale) {
        if (VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale != null && !locale.equals(f1453a)) {
            String a = C0478a.m2149a(locale);
            if (a == null) {
                return m2163b(locale);
            }
            if (a.equalsIgnoreCase("Arab") || a.equalsIgnoreCase("Hebr")) {
                return 1;
            }
        }
        return 0;
    }

    /* renamed from: b */
    private static int m2163b(Locale locale) {
        switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0))) {
            case 1:
            case 2:
                return 1;
            default:
                return 0;
        }
    }
}
