package com.google.sczxing.client.result;

import java.util.List;

/* renamed from: com.google.sczxing.client.result.y */
public final class C5021y extends C5010n {
    /* renamed from: a */
    private static String m24895a(CharSequence charSequence, String str, boolean z) {
        List a = C5020x.m24885a(charSequence, str, z);
        if (a == null || a.isEmpty()) {
            return null;
        }
        return (String) a.get(0);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.sczxing.client.result.C5003g mo16314b(com.google.sczxing.client.p140a.C4988f r15) {
        /*
            r14 = this;
            java.lang.String r15 = r15.mo16290a()
            r0 = 0
            if (r15 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.lang.String r1 = "BEGIN:VEVENT"
            int r1 = r15.indexOf(r1)
            if (r1 >= 0) goto L_0x0011
            return r0
        L_0x0011:
            java.lang.String r1 = "SUMMARY"
            r2 = 1
            java.lang.String r4 = m24895a(r1, r15, r2)
            java.lang.String r1 = "DTSTART"
            java.lang.String r5 = m24895a(r1, r15, r2)
            if (r5 != 0) goto L_0x0021
            return r0
        L_0x0021:
            java.lang.String r1 = "DTEND"
            java.lang.String r6 = m24895a(r1, r15, r2)
            java.lang.String r1 = "LOCATION"
            java.lang.String r7 = m24895a(r1, r15, r2)
            java.lang.String r1 = "DESCRIPTION"
            java.lang.String r9 = m24895a(r1, r15, r2)
            java.lang.String r1 = "GEO"
            java.lang.String r15 = m24895a(r1, r15, r2)
            r10 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            if (r15 != 0) goto L_0x003f
            r12 = r10
            goto L_0x0058
        L_0x003f:
            r1 = 59
            int r1 = r15.indexOf(r1)
            r3 = 0
            java.lang.String r3 = r15.substring(r3, r1)     // Catch:{ NumberFormatException -> 0x0060 }
            double r10 = java.lang.Double.parseDouble(r3)     // Catch:{ NumberFormatException -> 0x0060 }
            int r1 = r1 + r2
            java.lang.String r15 = r15.substring(r1)     // Catch:{ NumberFormatException -> 0x0060 }
            double r1 = java.lang.Double.parseDouble(r15)     // Catch:{ NumberFormatException -> 0x0060 }
            r12 = r1
        L_0x0058:
            com.google.sczxing.client.result.g r15 = new com.google.sczxing.client.result.g     // Catch:{  }
            r8 = 0
            r3 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12)     // Catch:{  }
            return r15
        L_0x0060:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.sczxing.client.result.C5021y.mo16314b(com.google.sczxing.client.a.f):com.google.sczxing.client.result.g");
    }
}
