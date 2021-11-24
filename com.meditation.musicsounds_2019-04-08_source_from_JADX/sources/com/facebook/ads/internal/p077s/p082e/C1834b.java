package com.facebook.ads.internal.p077s.p082e;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.util.Log;
import android.view.Window;
import com.facebook.ads.internal.p077s.p081d.C1831a;
import com.facebook.ads.internal.p077s.p081d.C1832b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.s.e.b */
public class C1834b {

    /* renamed from: a */
    private static final String f6014a = "b";

    /* renamed from: a */
    public static Map<String, String> m9002a(Context context) {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        if (context == null) {
            Log.v(f6014a, "Null context in window interactive check.");
            return hashMap;
        }
        try {
            hashMap.put("kgr", String.valueOf(m9003b(context)));
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    int i = window.getAttributes().flags;
                    hashMap.put("wt", Integer.toString(window.getAttributes().type));
                    hashMap.put("wfdkg", (4194304 & i) > 0 ? "1" : "0");
                    hashMap.put("wfswl", (524288 & i) > 0 ? "1" : "0");
                    return hashMap;
                }
                str = f6014a;
                str2 = "Invalid window in window interactive check, assuming interactive.";
            } else {
                str = f6014a;
                str2 = "Invalid Activity context in window interactive check, assuming interactive.";
            }
            Log.v(str, str2);
        } catch (Exception e) {
            Log.e(f6014a, "Exception in window info check", e);
            C1831a.m8998a(context, "risky", C1832b.f6008v, e);
        }
        return hashMap;
    }

    /* renamed from: b */
    public static boolean m9003b(Context context) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        return keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode();
    }
}
