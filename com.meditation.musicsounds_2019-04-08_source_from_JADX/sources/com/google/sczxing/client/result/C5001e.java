package com.google.sczxing.client.result;

import com.google.sczxing.client.p140a.C4988f;
import java.util.ArrayList;

/* renamed from: com.google.sczxing.client.result.e */
public final class C5001e extends C4997a {
    /* renamed from: a */
    private static String m24817a(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(' ');
            sb.append(str2);
            str = sb.toString();
        }
        return str;
    }

    /* renamed from: a */
    private static String[] m24818a(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList(3);
        if (str != null) {
            arrayList.add(str);
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        if (str3 != null) {
            arrayList.add(str3);
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[size]);
    }

    /* renamed from: a */
    public C5000d mo16314b(C4988f fVar) {
        String a = fVar.mo16290a();
        if (!a.startsWith("BIZCARD:")) {
            return null;
        }
        String a2 = m24817a(m24795b("N:", a, true), m24795b("X:", a, true));
        String b = m24795b("T:", a, true);
        String b2 = m24795b("C:", a, true);
        String[] a3 = m24794a("A:", a, true);
        String b3 = m24795b("B:", a, true);
        String b4 = m24795b("M:", a, true);
        String b5 = m24795b("F:", a, true);
        String b6 = m24795b("E:", a, true);
        C5000d dVar = new C5000d(m24854b(a2), null, m24818a(b3, b4, b5), null, m24854b(b6), null, null, null, a3, null, b2, null, b, null);
        return dVar;
    }
}
