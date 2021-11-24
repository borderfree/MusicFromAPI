package com.seattleclouds.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings.Secure;
import com.seattleclouds.App;
import java.security.SecureRandom;

/* renamed from: com.seattleclouds.util.l */
public class C6618l {

    /* renamed from: a */
    private static String f23337a;

    /* renamed from: a */
    public static String m32012a() {
        return m32013a(App.m25647e());
    }

    /* renamed from: a */
    private static synchronized String m32013a(Context context) {
        String str;
        synchronized (C6618l.class) {
            if (f23337a == null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("PREF_DEVICE_ID", 0);
                f23337a = sharedPreferences.getString("PREF_DEVICE_ID", null);
                if (f23337a == null) {
                    String string = Secure.getString(context.getContentResolver(), "android_id");
                    while (true) {
                        f23337a = string;
                        if (f23337a != null) {
                            if (!f23337a.equals("9774d56d682e549c")) {
                                break;
                            }
                        }
                        string = Long.toHexString(new SecureRandom().nextLong());
                    }
                    sharedPreferences.edit().putString("PREF_DEVICE_ID", f23337a).apply();
                }
            }
            str = f23337a;
        }
        return str;
    }
}
