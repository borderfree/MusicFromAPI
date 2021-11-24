package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.fa */
final class C4370fa {

    /* renamed from: a */
    private static final Class<?> f16091a = m21501c();

    /* renamed from: a */
    public static C4371fb m21498a() {
        if (f16091a != null) {
            try {
                return m21499a("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return C4371fb.f16092a;
    }

    /* renamed from: a */
    private static final C4371fb m21499a(String str) {
        return (C4371fb) f16091a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.internal.measurement.C4371fb m21500b() {
        /*
            java.lang.Class<?> r0 = f16091a
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "loadGeneratedRegistry"
            com.google.android.gms.internal.measurement.fb r0 = m21499a(r0)     // Catch:{ Exception -> 0x000b }
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            if (r0 != 0) goto L_0x0012
            com.google.android.gms.internal.measurement.fb r0 = com.google.android.gms.internal.measurement.C4371fb.m21504c()
        L_0x0012:
            if (r0 != 0) goto L_0x0018
            com.google.android.gms.internal.measurement.fb r0 = m21498a()
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4370fa.m21500b():com.google.android.gms.internal.measurement.fb");
    }

    /* renamed from: c */
    private static Class<?> m21501c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
