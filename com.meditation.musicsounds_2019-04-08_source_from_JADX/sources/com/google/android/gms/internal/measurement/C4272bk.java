package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C3266s;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.bk */
public class C4272bk extends C4497s {

    /* renamed from: a */
    private static C4272bk f15809a;

    public C4272bk(C4499u uVar) {
        super(uVar);
    }

    /* renamed from: a */
    private static String m21065a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (!(obj instanceof Long)) {
            return obj instanceof Boolean ? String.valueOf(obj) : obj instanceof Throwable ? obj.getClass().getCanonicalName() : "-";
        }
        Long l = (Long) obj;
        if (Math.abs(l.longValue()) < 100) {
            return String.valueOf(obj);
        }
        String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
        String valueOf = String.valueOf(Math.abs(l.longValue()));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1))));
        sb.append("...");
        sb.append(str);
        sb.append(Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d));
        return sb.toString();
    }

    /* renamed from: b */
    public static C4272bk m21066b() {
        return f15809a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10611a() {
        synchronized (C4272bk.class) {
            f15809a = this;
        }
    }

    /* renamed from: a */
    public final synchronized void mo14178a(int i, String str, Object obj, Object obj2, Object obj3) {
        C3266s.m14913a(str);
        if (i < 0) {
            i = 0;
        }
        if (i >= 9) {
            i = 8;
        }
        char c = mo14828k().mo14149a() ? 'C' : 'c';
        char charAt = "01VDIWEA?".charAt(i);
        String str2 = C4498t.f16366a;
        String c2 = m22308c(str, m21065a(obj), m21065a(obj2), m21065a(obj3));
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(c2).length());
        sb.append("3");
        sb.append(charAt);
        sb.append(c);
        sb.append(str2);
        sb.append(":");
        sb.append(c2);
        String sb2 = sb.toString();
        if (sb2.length() > 1024) {
            sb2 = sb2.substring(0, 1024);
        }
        C4276bo m = mo14824g().mo14854m();
        if (m != null) {
            m.mo14198z().mo14200a(sb2);
        }
    }

    /* renamed from: a */
    public final void mo14179a(C4267bf bfVar, String str) {
        String bfVar2 = bfVar != null ? bfVar.toString() : "no hit data";
        String str2 = "Discarding hit. ";
        String valueOf = String.valueOf(str);
        mo14819d(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), bfVar2);
    }

    /* renamed from: a */
    public final void mo14180a(Map<String, String> map, String str) {
        String str2;
        if (map != null) {
            StringBuilder sb = new StringBuilder();
            for (Entry entry : map.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append((String) entry.getKey());
                sb.append('=');
                sb.append((String) entry.getValue());
            }
            str2 = sb.toString();
        } else {
            str2 = "no hit data";
        }
        String str3 = "Discarding hit. ";
        String valueOf = String.valueOf(str);
        mo14819d(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), str2);
    }
}
