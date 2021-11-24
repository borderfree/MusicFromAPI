package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aai.C3393e;

final class abb implements acf {

    /* renamed from: b */
    private static final abk f11387b = new abc();

    /* renamed from: a */
    private final abk f11388a;

    public abb() {
        this(new abd(aah.m15338a(), m15435a()));
    }

    private abb(abk abk) {
        this.f11388a = (abk) aak.m15383a(abk, "messageInfoFactory");
    }

    /* renamed from: a */
    private static abk m15435a() {
        try {
            return (abk) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f11387b;
        }
    }

    /* renamed from: a */
    private static boolean m15436a(abj abj) {
        return abj.mo11549a() == C3393e.f11352h;
    }

    /* renamed from: a */
    public final <T> ace<T> mo11540a(Class<T> cls) {
        acg.m15670a(cls);
        abj b = this.f11388a.mo11473b(cls);
        if (b.mo11550b()) {
            return aai.class.isAssignableFrom(cls) ? abs.m15537a(acg.m15683c(), aab.m15302a(), b.mo11551c()) : abs.m15537a(acg.m15660a(), aab.m15303b(), b.mo11551c());
        }
        if (aai.class.isAssignableFrom(cls)) {
            if (m15436a(b)) {
                return abp.m15493a(cls, b, abw.m15552b(), aaw.m15413b(), acg.m15683c(), aab.m15302a(), abi.m15461b());
            }
            return abp.m15493a(cls, b, abw.m15552b(), aaw.m15413b(), acg.m15683c(), null, abi.m15461b());
        } else if (m15436a(b)) {
            return abp.m15493a(cls, b, abw.m15551a(), aaw.m15412a(), acg.m15660a(), aab.m15303b(), abi.m15460a());
        } else {
            return abp.m15493a(cls, b, abw.m15551a(), aaw.m15412a(), acg.m15677b(), null, abi.m15460a());
        }
    }
}
