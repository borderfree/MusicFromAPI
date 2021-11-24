package com.facebook.ads.internal.p077s.p078a;

import android.util.Log;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.s.a.b */
public class C1786b {

    /* renamed from: a */
    private static final String f5812a = "b";

    /* renamed from: a */
    public static boolean m8874a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            Log.v(f5812a, "Invalid Window info in window interactive check, assuming is not a Lockscreen.");
            return false;
        }
        String str = (String) map.get("wfdkg");
        String str2 = (String) map.get("wfswl");
        String str3 = (String) map.get("kgr");
        return str != null && str.equals("1") && str2 != null && str2.equals("1") && str3 != null && str3.equals("true");
    }

    /* renamed from: b */
    public static boolean m8875b(Map<String, String> map) {
        boolean z = false;
        if (map == null || map.isEmpty()) {
            Log.v(f5812a, "Invalid Window info in window interactive check, assuming not obstructed by Keyguard.");
            return false;
        }
        String str = (String) map.get("wfdkg");
        String str2 = (String) map.get("wfswl");
        if ((str != null && str.equals("1")) || (str2 != null && str2.equals("1"))) {
            return false;
        }
        String str3 = (String) map.get("kgr");
        if (str3 != null && str3.equals("true")) {
            z = true;
        }
        return z;
    }
}
