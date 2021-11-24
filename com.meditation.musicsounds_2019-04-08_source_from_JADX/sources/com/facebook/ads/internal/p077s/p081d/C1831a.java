package com.facebook.ads.internal.p077s.p081d;

import android.content.Context;
import com.facebook.ads.internal.p066h.C1703d;
import com.facebook.ads.internal.p068j.C1711c;
import com.facebook.ads.internal.p069k.C1713a;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.internal.s.d.a */
public class C1831a {
    /* renamed from: a */
    public static void m8998a(Context context, String str, int i, Exception exc) {
        if (m8999a(context, str, i, Math.random())) {
            m9000b(context, str, i, exc);
        }
    }

    /* renamed from: a */
    static boolean m8999a(Context context, String str, int i, double d) {
        double l;
        double d2;
        Set j = C1713a.m8579j(context);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(i);
        if (j.contains(sb.toString())) {
            l = (double) (C1713a.m8581l(context) * C1713a.m8580k(context));
            d2 = 10000.0d;
        } else {
            l = (double) C1713a.m8581l(context);
            d2 = 100.0d;
        }
        Double.isNaN(l);
        return d >= 1.0d - (l / d2);
    }

    /* renamed from: b */
    private static void m9000b(Context context, String str, int i, Exception exc) {
        Map a = new C1711c(context, false).mo6898a();
        a.put("subtype", str);
        a.put("subtype_code", String.valueOf(i));
        C1703d.m8517a(exc, context, a);
    }
}
