package com.google.sczxing.client.result;

import com.google.sczxing.client.p140a.C4988f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.sczxing.client.result.b */
public final class C4998b extends C5010n {
    /* renamed from: a */
    private static String[] m24796a(String str, int i, String str2, boolean z) {
        List list = null;
        for (int i2 = 1; i2 <= i; i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(i2);
            sb.append(':');
            String b = m24853b(sb.toString(), str2, 13, z);
            if (b == null) {
                break;
            }
            if (list == null) {
                list = new ArrayList(i);
            }
            list.add(b);
        }
        if (list == null) {
            return null;
        }
        return (String[]) list.toArray(new String[list.size()]);
    }

    /* renamed from: a */
    public C5000d mo16314b(C4988f fVar) {
        String a = fVar.mo16290a();
        String[] strArr = null;
        if (!a.contains("MEMORY") || !a.contains("\r\n")) {
            return null;
        }
        String b = m24853b("NAME1:", a, 13, true);
        String b2 = m24853b("NAME2:", a, 13, true);
        String[] a2 = m24796a("TEL", 3, a, true);
        String[] a3 = m24796a("MAIL", 3, a, true);
        String b3 = m24853b("MEMORY:", a, 13, false);
        String b4 = m24853b("ADD:", a, 13, true);
        if (b4 != null) {
            strArr = new String[]{b4};
        }
        C5000d dVar = new C5000d(m24854b(b), b2, a2, null, a3, null, null, b3, strArr, null, null, null, null, null);
        return dVar;
    }
}
