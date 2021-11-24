package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.math.BigInteger;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.is */
public final class C3637is {

    /* renamed from: a */
    private static final Object f14235a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b */
    private static String f14236b;

    /* renamed from: a */
    public static String m18766a() {
        String str;
        synchronized (f14235a) {
            str = f14236b;
        }
        return str;
    }

    /* renamed from: a */
    public static String m18767a(Context context, String str, String str2) {
        String str3;
        String str4;
        synchronized (f14235a) {
            if (f14236b == null && !TextUtils.isEmpty(str)) {
                try {
                    ClassLoader classLoader = context.createPackageContext(str2, 3).getClassLoader();
                    Class cls = Class.forName("com.google.ads.mediation.MediationAdapter", false, classLoader);
                    BigInteger bigInteger = new BigInteger(new byte[1]);
                    String[] split = str.split(",");
                    BigInteger bigInteger2 = bigInteger;
                    for (int i = 0; i < split.length; i++) {
                        zzbv.zzek();
                        if (C3653jh.m18886a(classLoader, cls, split[i])) {
                            bigInteger2 = bigInteger2.setBit(i);
                        }
                    }
                    str4 = String.format(Locale.US, "%X", new Object[]{bigInteger2});
                } catch (Throwable unused) {
                    str4 = "err";
                }
                f14236b = str4;
            }
            str3 = f14236b;
        }
        return str3;
    }
}
