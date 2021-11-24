package com.bumptech.glide.p037d;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: com.bumptech.glide.d.e */
public final class C1214e {

    /* renamed from: a */
    private final Context f4383a;

    public C1214e(Context context) {
        this.f4383a = context;
    }

    /* renamed from: a */
    private static C1212c m6564a(String str) {
        try {
            Class cls = Class.forName(str);
            C1212c cVar = null;
            try {
                cVar = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                m6565a(cls, e);
            }
            if (cVar instanceof C1212c) {
                return cVar;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expected instanceof GlideModule, but found: ");
            sb.append(cVar);
            throw new RuntimeException(sb.toString());
        } catch (ClassNotFoundException e2) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e2);
        }
    }

    /* renamed from: a */
    private static void m6565a(Class<?> cls, Exception exc) {
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to instantiate GlideModule implementation for ");
        sb.append(cls);
        throw new RuntimeException(sb.toString(), exc);
    }

    /* renamed from: a */
    public List<C1212c> mo5804a() {
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f4383a.getPackageManager().getApplicationInfo(this.f4383a.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Got null app info metadata");
                }
                return arrayList;
            }
            if (Log.isLoggable("ManifestParser", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Got app info metadata: ");
                sb.append(applicationInfo.metaData);
                Log.v("ManifestParser", sb.toString());
            }
            for (String str : applicationInfo.metaData.keySet()) {
                if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                    arrayList.add(m6564a(str));
                    if (Log.isLoggable("ManifestParser", 3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Loaded Glide module: ");
                        sb2.append(str);
                        Log.d("ManifestParser", sb2.toString());
                    }
                }
            }
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Finished loading Glide modules");
            }
            return arrayList;
        } catch (NameNotFoundException e) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
        }
    }
}
