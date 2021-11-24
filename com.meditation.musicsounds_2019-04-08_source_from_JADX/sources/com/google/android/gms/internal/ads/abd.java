package com.google.android.gms.internal.ads;

final class abd implements abk {

    /* renamed from: a */
    private abk[] f11389a;

    abd(abk... abkArr) {
        this.f11389a = abkArr;
    }

    /* renamed from: a */
    public final boolean mo11472a(Class<?> cls) {
        for (abk a : this.f11389a) {
            if (a.mo11472a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final abj mo11473b(Class<?> cls) {
        abk[] abkArr;
        for (abk abk : this.f11389a) {
            if (abk.mo11472a(cls)) {
                return abk.mo11473b(cls);
            }
        }
        String str = "No factory is available for message type: ";
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
