package com.facebook.ads.internal.p073r.p075b;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import java.io.File;

/* renamed from: com.facebook.ads.internal.r.b.o */
final class C1784o {
    /* renamed from: a */
    public static File m8869a(Context context) {
        return new File(m8870a(context, true), "video-cache");
    }

    /* renamed from: a */
    private static File m8870a(Context context, boolean z) {
        String str;
        try {
            str = Environment.getExternalStorageState();
        } catch (NullPointerException unused) {
            str = "";
        }
        File b = (!z || !"mounted".equals(str)) ? null : m8871b(context);
        if (b == null) {
            b = context.getCacheDir();
        }
        if (b != null) {
            return b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("/data/data/");
        sb.append(context.getPackageName());
        sb.append("/cache/");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Can't define system cache directory! '");
        sb3.append(sb2);
        sb3.append("%s' will be used.");
        Log.w("ProxyCache", sb3.toString());
        return new File(sb2);
    }

    /* renamed from: b */
    private static File m8871b(Context context) {
        File file = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android"), "data"), context.getPackageName()), "cache");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        Log.w("ProxyCache", "Unable to create external cache directory");
        return null;
    }
}
