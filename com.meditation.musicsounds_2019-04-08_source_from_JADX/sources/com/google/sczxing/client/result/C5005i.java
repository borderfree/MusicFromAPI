package com.google.sczxing.client.result;

import com.google.sczxing.client.p140a.C4988f;
import java.util.Map;

/* renamed from: com.google.sczxing.client.result.i */
public final class C5005i extends C5010n {
    /* renamed from: a */
    public C5004h mo16314b(C4988f fVar) {
        String str;
        String a = fVar.mo16290a();
        String str2 = null;
        if (a.startsWith("mailto:") || a.startsWith("MAILTO:")) {
            String substring = a.substring(7);
            int indexOf = substring.indexOf(63);
            if (indexOf >= 0) {
                substring = substring.substring(0, indexOf);
            }
            Map d = m24857d(a);
            if (d != null) {
                if (substring.length() == 0) {
                    substring = (String) d.get("to");
                }
                str2 = (String) d.get("subject");
                str = (String) d.get("body");
            } else {
                str = null;
            }
            return new C5004h(substring, str2, str, a);
        } else if (!C5006j.m24838a(a)) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("mailto:");
            sb.append(a);
            return new C5004h(a, null, null, sb.toString());
        }
    }
}
