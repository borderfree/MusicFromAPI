package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.C2950n;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.analytics.n */
public abstract class C2950n<T extends C2950n> {
    /* renamed from: a */
    public static String m13814a(Object obj) {
        return m13815a(obj, 0);
    }

    /* renamed from: a */
    private static String m13815a(Object obj, int i) {
        if (i > 10) {
            return "ERROR: Recursive toString calls";
        }
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return TextUtils.isEmpty((String) obj) ? "" : obj.toString();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0 ? "" : obj.toString();
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue() == 0 ? "" : obj.toString();
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() == 0.0d ? "" : obj.toString();
        }
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue() ? "" : obj.toString();
        }
        if (obj instanceof List) {
            StringBuilder sb = new StringBuilder();
            if (i > 0) {
                sb.append("[");
            }
            List list = (List) obj;
            int length = sb.length();
            for (Object next : list) {
                if (sb.length() > length) {
                    sb.append(", ");
                }
                sb.append(m13815a(next, i + 1));
            }
            if (i > 0) {
                sb.append("]");
            }
            return sb.toString();
        } else if (!(obj instanceof Map)) {
            return obj.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            boolean z = false;
            int i2 = 0;
            for (Entry entry : new TreeMap((Map) obj).entrySet()) {
                String a = m13815a(entry.getValue(), i + 1);
                if (!TextUtils.isEmpty(a)) {
                    if (i > 0 && !z) {
                        sb2.append("{");
                        i2 = sb2.length();
                        z = true;
                    }
                    if (sb2.length() > i2) {
                        sb2.append(", ");
                    }
                    sb2.append((String) entry.getKey());
                    sb2.append('=');
                    sb2.append(a);
                }
            }
            if (z) {
                sb2.append("}");
            }
            return sb2.toString();
        }
    }

    /* renamed from: a */
    public static String m13816a(Map map) {
        return m13815a(map, 1);
    }

    /* renamed from: a */
    public abstract void mo10641a(T t);
}
