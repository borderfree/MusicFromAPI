package com.google.sczxing.client.result;

import com.google.sczxing.client.p140a.C4988f;

/* renamed from: com.google.sczxing.client.result.q */
public final class C5013q extends C5010n {
    /* renamed from: a */
    public C5012p mo16314b(C4988f fVar) {
        String str;
        String a = fVar.mo16290a();
        if (!a.startsWith("smsto:") && !a.startsWith("SMSTO:") && !a.startsWith("mmsto:") && !a.startsWith("MMSTO:")) {
            return null;
        }
        String substring = a.substring(6);
        int indexOf = substring.indexOf(58);
        if (indexOf >= 0) {
            str = substring.substring(indexOf + 1);
            substring = substring.substring(0, indexOf);
        } else {
            str = null;
        }
        return new C5012p(substring, (String) null, (String) null, str);
    }
}
