package com.facebook.ads.internal.p077s.p082e;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.util.Log;
import com.facebook.ads.internal.p077s.p081d.C1831a;
import com.facebook.ads.internal.p077s.p081d.C1832b;

/* renamed from: com.facebook.ads.internal.s.e.a */
public class C1833a {

    /* renamed from: a */
    private static final String f6013a = "a";

    /* renamed from: a */
    public static boolean m9001a(Context context) {
        if (context == null) {
            Log.v(f6013a, "Invalid context in screen interactive check, assuming interactive.");
            return true;
        }
        try {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            return VERSION.SDK_INT >= 20 ? powerManager.isInteractive() : powerManager.isScreenOn();
        } catch (Exception e) {
            Log.e(f6013a, "Exception in screen interactive check, assuming interactive.", e);
            C1831a.m8998a(context, "risky", C1832b.f6007u, e);
            return true;
        }
    }
}
