package com.google.sczxing.client.result;

import com.google.sczxing.client.p140a.C4988f;

/* renamed from: com.google.sczxing.client.result.w */
public final class C5019w extends C5010n {
    /* renamed from: a */
    public C5017u mo16314b(C4988f fVar) {
        String a = fVar.mo16290a();
        String str = null;
        if (!a.startsWith("urlto:") && !a.startsWith("URLTO:")) {
            return null;
        }
        int indexOf = a.indexOf(58, 6);
        if (indexOf < 0) {
            return null;
        }
        if (indexOf > 6) {
            str = a.substring(6, indexOf);
        }
        return new C5017u(a.substring(indexOf + 1), str);
    }
}
