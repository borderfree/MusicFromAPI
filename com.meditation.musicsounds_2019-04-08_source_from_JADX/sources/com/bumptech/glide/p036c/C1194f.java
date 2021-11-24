package com.bumptech.glide.p036c;

import android.content.Context;
import android.support.p009v4.content.C0452b;
import android.util.Log;
import com.bumptech.glide.p036c.C1189c.C1190a;

/* renamed from: com.bumptech.glide.c.f */
public class C1194f implements C1191d {
    /* renamed from: a */
    public C1189c mo5756a(Context context, C1190a aVar) {
        boolean z = C0452b.m2065b(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z ? new C1192e(context, aVar) : new C1198j();
    }
}
