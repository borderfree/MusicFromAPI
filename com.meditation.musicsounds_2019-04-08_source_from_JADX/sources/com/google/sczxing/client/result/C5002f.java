package com.google.sczxing.client.result;

import com.google.sczxing.client.p140a.C4988f;

/* renamed from: com.google.sczxing.client.result.f */
public final class C5002f extends C4997a {
    /* renamed from: a */
    public C5017u mo16314b(C4988f fVar) {
        String a = fVar.mo16290a();
        C5017u uVar = null;
        if (!a.startsWith("MEBKM:")) {
            return null;
        }
        String b = m24795b("TITLE:", a, true);
        String[] a2 = m24794a("URL:", a, true);
        if (a2 == null) {
            return null;
        }
        String str = a2[0];
        if (C5018v.m24878a((CharSequence) str)) {
            uVar = new C5017u(str, b);
        }
        return uVar;
    }
}
