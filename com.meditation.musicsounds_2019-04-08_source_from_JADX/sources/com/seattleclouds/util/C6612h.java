package com.seattleclouds.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.seattleclouds.util.h */
public class C6612h {
    /* renamed from: a */
    public static boolean m31984a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    /* renamed from: a */
    public static boolean m31985a(Context context, int i) {
        NetworkInfo networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(i);
        return networkInfo != null && networkInfo.isConnectedOrConnecting();
    }
}
