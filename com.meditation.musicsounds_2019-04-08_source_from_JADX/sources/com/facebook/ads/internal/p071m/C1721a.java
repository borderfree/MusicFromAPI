package com.facebook.ads.internal.p071m;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.internal.p069k.C1713a;
import com.facebook.ads.internal.settings.C1837b;
import java.util.Locale;

/* renamed from: com.facebook.ads.internal.m.a */
public class C1721a {
    /* renamed from: a */
    public static String m8615a(Context context) {
        String b = C1837b.m9007b();
        String format = TextUtils.isEmpty(b) ? "https://www.facebook.com/adnw_logging/" : String.format(Locale.US, "https://www.%s.facebook.com/adnw_logging/", new Object[]{b});
        String u = C1713a.m8590u(context);
        return TextUtils.isEmpty(u) ? format : format.replace("www", u);
    }
}
