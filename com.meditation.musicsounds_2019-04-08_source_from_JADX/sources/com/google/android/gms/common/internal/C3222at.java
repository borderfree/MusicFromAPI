package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.p123d.C3181c;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.internal.at */
public final class C3222at {

    /* renamed from: a */
    private static Object f11022a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b */
    private static boolean f11023b;

    /* renamed from: c */
    private static String f11024c;

    /* renamed from: d */
    private static int f11025d;

    /* renamed from: a */
    public static String m14746a(Context context) {
        m14748c(context);
        return f11024c;
    }

    /* renamed from: b */
    public static int m14747b(Context context) {
        m14748c(context);
        return f11025d;
    }

    /* renamed from: c */
    private static void m14748c(Context context) {
        synchronized (f11022a) {
            if (!f11023b) {
                f11023b = true;
                try {
                    Bundle bundle = C3181c.m14658a(context).mo11124a(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f11024c = bundle.getString("com.google.app.id");
                        f11025d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
