package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zw */
final class C4134zw {

    /* renamed from: a */
    private static final Class<?> f15221a = m20597b();

    /* renamed from: a */
    public static C4135zx m20596a() {
        if (f15221a != null) {
            try {
                return (C4135zx) f15221a.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return C4135zx.f15222a;
    }

    /* renamed from: b */
    private static Class<?> m20597b() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
