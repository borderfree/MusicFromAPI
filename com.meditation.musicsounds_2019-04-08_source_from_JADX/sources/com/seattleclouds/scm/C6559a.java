package com.seattleclouds.scm;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.C3177d;
import com.seattleclouds.util.C6569aa;

/* renamed from: com.seattleclouds.scm.a */
public class C6559a {

    /* renamed from: a */
    private static volatile boolean f23221a = false;

    /* renamed from: a */
    public static void m31715a(Context context) {
        if (C6569aa.m31797a(context, "android.permission.INTERNET") && !f23221a) {
            f23221a = true;
            PushManagerReceiver.m31696a(context.getApplicationContext());
        }
    }

    /* renamed from: b */
    static boolean m31716b(Context context) {
        boolean z = true;
        if (!C6569aa.m31797a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    public static boolean m31717c(Context context) {
        int a = C3177d.m14629a().mo11106a(context);
        return a == 1 || a == 9;
    }
}
