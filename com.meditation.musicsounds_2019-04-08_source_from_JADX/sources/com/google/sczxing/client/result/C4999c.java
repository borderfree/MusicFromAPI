package com.google.sczxing.client.result;

import com.google.sczxing.client.p140a.C4988f;

/* renamed from: com.google.sczxing.client.result.c */
public final class C4999c extends C4997a {
    /* renamed from: a */
    private static String m24799a(String str) {
        int indexOf = str.indexOf(44);
        if (indexOf < 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(indexOf + 1));
        sb.append(' ');
        sb.append(str.substring(0, indexOf));
        return sb.toString();
    }

    /* renamed from: a */
    public C5000d mo16314b(C4988f fVar) {
        String a = fVar.mo16290a();
        if (!a.startsWith("MECARD:")) {
            return null;
        }
        String[] a2 = m24794a("N:", a, true);
        if (a2 == null) {
            return null;
        }
        String a3 = m24799a(a2[0]);
        String b = m24795b("SOUND:", a, true);
        String[] a4 = m24794a("TEL:", a, true);
        String[] a5 = m24794a("EMAIL:", a, true);
        String b2 = m24795b("NOTE:", a, false);
        String[] a6 = m24794a("ADR:", a, true);
        String b3 = m24795b("BDAY:", a, true);
        String str = (b3 == null || C5010n.m24851a((CharSequence) b3, 8)) ? b3 : null;
        C5000d dVar = new C5000d(C5010n.m24854b(a3), b, a4, null, a5, null, null, b2, a6, null, m24795b("ORG:", a, true), str, null, m24795b("URL:", a, true));
        return dVar;
    }
}
