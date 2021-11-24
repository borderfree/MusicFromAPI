package com.google.android.gms.maps.p133a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C3183f;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.dynamic.C3327d;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: com.google.android.gms.maps.a.w */
public class C4575w {

    /* renamed from: a */
    private static final String f16569a = "w";
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    private static Context f16570b;

    /* renamed from: c */
    private static C4578z f16571c;

    /* renamed from: a */
    public static C4578z m22771a(Context context) {
        C4578z zVar;
        C3266s.m14913a(context);
        if (f16571c != null) {
            return f16571c;
        }
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context, C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        if (isGooglePlayServicesAvailable == 0) {
            Log.i(f16569a, "Making Creator dynamically");
            IBinder iBinder = (IBinder) m22773a(m22774b(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl");
            if (iBinder == null) {
                zVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                zVar = queryLocalInterface instanceof C4578z ? (C4578z) queryLocalInterface : new C4546aa(iBinder);
            }
            f16571c = zVar;
            try {
                f16571c.mo15050a(C3327d.m15136a(m22774b(context).getResources()), GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                return f16571c;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
        }
    }

    /* renamed from: a */
    private static <T> T m22772a(Class<?> cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException unused) {
            String str = "Unable to instantiate the dynamic class ";
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        } catch (IllegalAccessException unused2) {
            String str2 = "Unable to call the default constructor of ";
            String valueOf2 = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
        }
    }

    /* renamed from: a */
    private static <T> T m22773a(ClassLoader classLoader, String str) {
        try {
            return m22772a(((ClassLoader) C3266s.m14913a(classLoader)).loadClass(str));
        } catch (ClassNotFoundException unused) {
            String str2 = "Unable to find dynamic class ";
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    /* renamed from: b */
    private static Context m22774b(Context context) {
        if (f16570b != null) {
            return f16570b;
        }
        Context c = m22775c(context);
        f16570b = c;
        return c;
    }

    /* renamed from: c */
    private static Context m22775c(Context context) {
        try {
            return DynamiteModule.m15147a(context, DynamiteModule.f11241a, "com.google.android.gms.maps_dynamite").mo11351a();
        } catch (Throwable th) {
            Log.e(f16569a, "Failed to load maps module, use legacy", th);
            return GooglePlayServicesUtil.getRemoteContext(context);
        }
    }
}
