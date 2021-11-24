package com.google.sczxing.client.result;

import com.google.sczxing.client.p140a.C4988f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.sczxing.client.result.o */
public final class C5011o extends C5010n {
    /* renamed from: a */
    private static void m24859a(Collection<String> collection, Collection<String> collection2, String str) {
        int indexOf = str.indexOf(59);
        String str2 = null;
        if (indexOf < 0) {
            collection.add(str);
        } else {
            collection.add(str.substring(0, indexOf));
            String substring = str.substring(indexOf + 1);
            if (substring.startsWith("via=")) {
                str2 = substring.substring(4);
            }
        }
        collection2.add(str2);
    }

    /* renamed from: a */
    public C5012p mo16314b(C4988f fVar) {
        String str;
        String a = fVar.mo16290a();
        String str2 = null;
        if (!a.startsWith("sms:") && !a.startsWith("SMS:") && !a.startsWith("mms:") && !a.startsWith("MMS:")) {
            return null;
        }
        Map d = m24857d(a);
        boolean z = false;
        if (d == null || d.isEmpty()) {
            str = null;
        } else {
            str2 = (String) d.get("subject");
            str = (String) d.get("body");
            z = true;
        }
        int indexOf = a.indexOf(63, 4);
        String substring = (indexOf < 0 || !z) ? a.substring(4) : a.substring(4, indexOf);
        int i = -1;
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        while (true) {
            int i2 = i + 1;
            int indexOf2 = substring.indexOf(44, i2);
            if (indexOf2 > i) {
                m24859a(arrayList, arrayList2, substring.substring(i2, indexOf2));
                i = indexOf2;
            } else {
                m24859a(arrayList, arrayList2, substring.substring(i2));
                return new C5012p((String[]) arrayList.toArray(new String[arrayList.size()]), (String[]) arrayList2.toArray(new String[arrayList2.size()]), str2, str);
            }
        }
    }
}
