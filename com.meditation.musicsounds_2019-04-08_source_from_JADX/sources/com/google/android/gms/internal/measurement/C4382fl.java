package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4383fm.C4388e;

/* renamed from: com.google.android.gms.internal.measurement.fl */
final class C4382fl implements C4418gp {

    /* renamed from: a */
    private static final C4382fl f16114a = new C4382fl();

    private C4382fl() {
    }

    /* renamed from: a */
    public static C4382fl m21565a() {
        return f16114a;
    }

    /* renamed from: a */
    public final boolean mo14490a(Class<?> cls) {
        return C4383fm.class.isAssignableFrom(cls);
    }

    /* renamed from: b */
    public final C4417go mo14491b(Class<?> cls) {
        if (!C4383fm.class.isAssignableFrom(cls)) {
            String str = "Unsupported message type: ";
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        try {
            return (C4417go) C4383fm.m21569a(cls.asSubclass(C4383fm.class)).mo14492a(C4388e.f16121c, (Object) null, (Object) null);
        } catch (Exception e) {
            String str2 = "Unable to get message info for ";
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e);
        }
    }
}
