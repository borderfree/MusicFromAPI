package com.google.android.gms.common.p123d;

import android.content.Context;
import com.google.android.gms.common.util.C3309n;

/* renamed from: com.google.android.gms.common.d.a */
public class C3179a {

    /* renamed from: a */
    private static Context f10960a;

    /* renamed from: b */
    private static Boolean f10961b;

    /* renamed from: a */
    public static synchronized boolean m14648a(Context context) {
        Boolean valueOf;
        synchronized (C3179a.class) {
            Context applicationContext = context.getApplicationContext();
            if (f10960a == null || f10961b == null || f10960a != applicationContext) {
                f10961b = null;
                if (C3309n.m15080l()) {
                    valueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                } else {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        f10961b = Boolean.valueOf(true);
                    } catch (ClassNotFoundException unused) {
                        valueOf = Boolean.valueOf(false);
                    }
                    f10960a = applicationContext;
                    boolean booleanValue = f10961b.booleanValue();
                    return booleanValue;
                }
                f10961b = valueOf;
                f10960a = applicationContext;
                boolean booleanValue2 = f10961b.booleanValue();
                return booleanValue2;
            }
            boolean booleanValue3 = f10961b.booleanValue();
            return booleanValue3;
        }
    }
}
