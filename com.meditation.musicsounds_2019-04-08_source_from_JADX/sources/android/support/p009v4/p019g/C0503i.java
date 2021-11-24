package android.support.p009v4.p019g;

import android.os.Build.VERSION;
import java.util.Objects;

/* renamed from: android.support.v4.g.i */
public class C0503i {
    /* renamed from: a */
    public static boolean m2243a(Object obj, Object obj2) {
        if (VERSION.SDK_INT >= 19) {
            return Objects.equals(obj, obj2);
        }
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
