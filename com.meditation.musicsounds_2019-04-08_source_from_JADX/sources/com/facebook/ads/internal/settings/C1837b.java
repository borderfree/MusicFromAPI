package com.facebook.ads.internal.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;

/* renamed from: com.facebook.ads.internal.settings.b */
public class C1837b {

    /* renamed from: a */
    static volatile boolean f6024a = false;

    /* renamed from: b */
    private static final String f6025b = "b";

    /* renamed from: c */
    private static final Collection<String> f6026c = new HashSet();

    /* renamed from: d */
    private static final Collection<String> f6027d = new HashSet();

    /* renamed from: e */
    private static boolean f6028e;

    /* renamed from: f */
    private static String f6029f;

    /* renamed from: g */
    private static String f6030g;

    /* renamed from: h */
    private static String f6031h;

    /* renamed from: i */
    private static boolean f6032i = false;

    static {
        f6027d.add("sdk");
        f6027d.add("google_sdk");
        f6027d.add("vbox86p");
        f6027d.add("vbox86tp");
    }

    /* renamed from: a */
    private static void m9004a(String str) {
        if (!f6024a) {
            f6024a = true;
            String str2 = f6025b;
            StringBuilder sb = new StringBuilder();
            sb.append("Test mode device hash: ");
            sb.append(str);
            Log.d(str2, sb.toString());
            String str3 = f6025b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("When testing your app with Facebook's ad units you must specify the device hashed ID to ensure the delivery of test ads, add the following code before loading an ad: AdSettings.addTestDevice(\"");
            sb2.append(str);
            sb2.append("\");");
            Log.d(str3, sb2.toString());
        }
    }

    /* renamed from: a */
    public static boolean m9005a() {
        return f6028e;
    }

    /* renamed from: a */
    public static boolean m9006a(Context context) {
        if (f6032i || m9005a() || f6027d.contains(Build.PRODUCT)) {
            return true;
        }
        if (f6031h == null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("FBAdPrefs", 0);
            f6031h = sharedPreferences.getString("deviceIdHash", null);
            if (TextUtils.isEmpty(f6031h)) {
                f6031h = UUID.randomUUID().toString();
                sharedPreferences.edit().putString("deviceIdHash", f6031h).apply();
            }
        }
        if (f6026c.contains(f6031h)) {
            return true;
        }
        m9004a(f6031h);
        return false;
    }

    /* renamed from: b */
    public static String m9007b() {
        return f6029f;
    }

    /* renamed from: c */
    public static String m9008c() {
        return f6030g;
    }

    /* renamed from: d */
    public static boolean m9009d() {
        return f6032i;
    }
}
