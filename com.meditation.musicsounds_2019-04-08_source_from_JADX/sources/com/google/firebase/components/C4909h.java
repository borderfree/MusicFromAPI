package com.google.firebase.components;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.firebase.components.h */
final class C4909h implements C4910i<Context> {
    private C4909h() {
    }

    /* synthetic */ C4909h(byte b) {
        this();
    }

    /* renamed from: a */
    private static Bundle m24468a(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
                return null;
            }
            ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, ComponentDiscoveryService.class), 128);
            if (serviceInfo != null) {
                return serviceInfo.metaData;
            }
            Log.w("ComponentDiscovery", "ComponentDiscoveryService has no service info.");
            return null;
        } catch (NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
            return null;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ List mo16139a(Object obj) {
        Bundle a = m24468a((Context) obj);
        if (a == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : a.keySet()) {
            if ("com.google.firebase.components.ComponentRegistrar".equals(a.get(str)) && str.startsWith("com.google.firebase.components:")) {
                arrayList.add(str.substring(31));
            }
        }
        return arrayList;
    }
}
