package com.google.sczxing.client.result;

import com.google.sczxing.client.p140a.C4988f;
import java.util.regex.Pattern;

/* renamed from: com.google.sczxing.client.result.j */
public final class C5006j extends C4997a {

    /* renamed from: a */
    private static final Pattern f17885a = Pattern.compile("[a-zA-Z0-9@.!#$%&'*+\\-/=?^_`{|}~]+");

    /* renamed from: a */
    static boolean m24838a(String str) {
        return str != null && f17885a.matcher(str).matches() && str.indexOf(64) >= 0;
    }

    /* renamed from: a */
    public C5004h mo16314b(C4988f fVar) {
        String a = fVar.mo16290a();
        if (!a.startsWith("MATMSG:")) {
            return null;
        }
        String[] a2 = m24794a("TO:", a, true);
        if (a2 == null) {
            return null;
        }
        String str = a2[0];
        if (!m24838a(str)) {
            return null;
        }
        String b = m24795b("SUB:", a, false);
        String b2 = m24795b("BODY:", a, false);
        StringBuilder sb = new StringBuilder();
        sb.append("mailto:");
        sb.append(str);
        return new C5004h(str, b, b2, sb.toString());
    }
}
