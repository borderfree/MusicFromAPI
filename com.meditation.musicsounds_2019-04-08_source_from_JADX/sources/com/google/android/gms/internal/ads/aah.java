package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aai.C3393e;

final class aah implements abk {

    /* renamed from: a */
    private static final aah f11340a = new aah();

    private aah() {
    }

    /* renamed from: a */
    public static aah m15338a() {
        return f11340a;
    }

    /* renamed from: a */
    public final boolean mo11472a(Class<?> cls) {
        return aai.class.isAssignableFrom(cls);
    }

    /* renamed from: b */
    public final abj mo11473b(Class<?> cls) {
        if (!aai.class.isAssignableFrom(cls)) {
            String str = "Unsupported message type: ";
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        try {
            return (abj) aai.m15345a(cls.asSubclass(aai.class)).mo11474a(C3393e.f11347c, (Object) null, (Object) null);
        } catch (Exception e) {
            String str2 = "Unable to get message info for ";
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e);
        }
    }
}
