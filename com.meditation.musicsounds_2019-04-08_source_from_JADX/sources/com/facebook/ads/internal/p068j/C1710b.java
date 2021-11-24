package com.facebook.ads.internal.p068j;

import android.content.Context;
import android.os.Build;
import com.facebook.ads.internal.p066h.C1703d;
import java.io.File;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.j.b */
class C1710b {

    /* renamed from: a */
    private static final String f5631a = "b";

    C1710b() {
    }

    /* renamed from: a */
    static String m8556a(Context context) {
        JSONObject jSONObject = new JSONObject();
        m8557a(jSONObject, "is_emu", String.valueOf(m8558a()));
        m8557a(jSONObject, "apk_size", String.valueOf(m8559b(context)));
        return jSONObject.toString();
    }

    /* renamed from: a */
    private static void m8557a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    private static boolean m8558a() {
        return Build.FINGERPRINT.contains("generic") || Build.FINGERPRINT.startsWith("unknown") || Build.MODEL.contains("google_sdk") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT);
    }

    /* renamed from: b */
    private static long m8559b(Context context) {
        try {
            return new File(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).publicSourceDir).length();
        } catch (Exception e) {
            C1703d.m8517a(e, context, Collections.EMPTY_MAP);
            return -1;
        }
    }
}
