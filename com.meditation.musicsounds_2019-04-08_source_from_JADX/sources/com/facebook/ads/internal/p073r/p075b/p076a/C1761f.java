package com.facebook.ads.internal.p073r.p075b.p076a;

import android.text.TextUtils;
import com.facebook.ads.internal.p073r.p075b.C1782m;

/* renamed from: com.facebook.ads.internal.r.b.a.f */
public class C1761f implements C1755c {
    /* renamed from: b */
    private String m8788b(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return (lastIndexOf == -1 || lastIndexOf <= str.lastIndexOf(47) || (lastIndexOf + 2) + 4 <= str.length()) ? "" : str.substring(lastIndexOf + 1, str.length());
    }

    /* renamed from: a */
    public String mo7021a(String str) {
        String b = m8788b(str);
        String d = C1782m.m8864d(str);
        if (TextUtils.isEmpty(b)) {
            return d;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(d);
        sb.append(".");
        sb.append(b);
        return sb.toString();
    }
}
