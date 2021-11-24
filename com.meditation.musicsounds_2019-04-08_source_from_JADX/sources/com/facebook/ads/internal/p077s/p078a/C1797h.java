package com.facebook.ads.internal.p077s.p078a;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.Context;
import android.util.Log;

/* renamed from: com.facebook.ads.internal.s.a.h */
public class C1797h {
    /* renamed from: a */
    public static boolean m8907a(Context context) {
        boolean z;
        try {
            if (!((RunningTaskInfo) ((ActivityManager) context.getSystemService("activity")).getRunningTasks(2).get(0)).topActivity.getClassName().equals("com.unity3d.player.UnityPlayerActivity")) {
                if (!m8908a("com.unity3d.player.UnityPlayerActivity")) {
                    z = false;
                    Boolean valueOf = Boolean.valueOf(z);
                    Log.d("IS_UNITY", Boolean.toString(valueOf.booleanValue()));
                    return valueOf.booleanValue();
                }
            }
            z = true;
            Boolean valueOf2 = Boolean.valueOf(z);
            Log.d("IS_UNITY", Boolean.toString(valueOf2.booleanValue()));
            return valueOf2.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m8908a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
