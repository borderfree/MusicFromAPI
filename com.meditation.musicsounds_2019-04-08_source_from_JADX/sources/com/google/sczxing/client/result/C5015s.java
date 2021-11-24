package com.google.sczxing.client.result;

import com.google.sczxing.client.p140a.C4988f;

/* renamed from: com.google.sczxing.client.result.s */
public final class C5015s extends C5010n {
    /* renamed from: a */
    public C5014r mo16314b(C4988f fVar) {
        String str;
        String a = fVar.mo16290a();
        if (!a.startsWith("tel:") && !a.startsWith("TEL:")) {
            return null;
        }
        if (a.startsWith("TEL:")) {
            StringBuilder sb = new StringBuilder();
            sb.append("tel:");
            sb.append(a.substring(4));
            str = sb.toString();
        } else {
            str = a;
        }
        int indexOf = a.indexOf(63, 4);
        return new C5014r(indexOf < 0 ? a.substring(4) : a.substring(4, indexOf), str, null);
    }
}
