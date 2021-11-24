package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.C2659n;
import com.google.android.exoplayer2.p102c.C2500k;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* renamed from: com.google.android.exoplayer2.extractor.flv.c */
final class C2648c extends TagPayloadReader {

    /* renamed from: b */
    private long f9001b = -9223372036854775807L;

    public C2648c(C2659n nVar) {
        super(nVar);
    }

    /* renamed from: a */
    private static Object m12486a(C2500k kVar, int i) {
        if (i == 8) {
            return m12493h(kVar);
        }
        switch (i) {
            case 0:
                return m12489d(kVar);
            case 1:
                return m12488c(kVar);
            case 2:
                return m12490e(kVar);
            case 3:
                return m12492g(kVar);
            default:
                switch (i) {
                    case 10:
                        return m12491f(kVar);
                    case 11:
                        return m12494i(kVar);
                    default:
                        return null;
                }
        }
    }

    /* renamed from: b */
    private static int m12487b(C2500k kVar) {
        return kVar.mo8834g();
    }

    /* renamed from: c */
    private static Boolean m12488c(C2500k kVar) {
        boolean z = true;
        if (kVar.mo8834g() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: d */
    private static Double m12489d(C2500k kVar) {
        return Double.valueOf(Double.longBitsToDouble(kVar.mo8843p()));
    }

    /* renamed from: e */
    private static String m12490e(C2500k kVar) {
        int h = kVar.mo8835h();
        int d = kVar.mo8828d();
        kVar.mo8829d(h);
        return new String(kVar.f8094a, d, h);
    }

    /* renamed from: f */
    private static ArrayList<Object> m12491f(C2500k kVar) {
        int t = kVar.mo8847t();
        ArrayList<Object> arrayList = new ArrayList<>(t);
        for (int i = 0; i < t; i++) {
            arrayList.add(m12486a(kVar, m12487b(kVar)));
        }
        return arrayList;
    }

    /* renamed from: g */
    private static HashMap<String, Object> m12492g(C2500k kVar) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String e = m12490e(kVar);
            int b = m12487b(kVar);
            if (b == 9) {
                return hashMap;
            }
            hashMap.put(e, m12486a(kVar, b));
        }
    }

    /* renamed from: h */
    private static HashMap<String, Object> m12493h(C2500k kVar) {
        int t = kVar.mo8847t();
        HashMap<String, Object> hashMap = new HashMap<>(t);
        for (int i = 0; i < t; i++) {
            hashMap.put(m12490e(kVar), m12486a(kVar, m12487b(kVar)));
        }
        return hashMap;
    }

    /* renamed from: i */
    private static Date m12494i(C2500k kVar) {
        Date date = new Date((long) m12489d(kVar).doubleValue());
        kVar.mo8829d(2);
        return date;
    }

    /* renamed from: a */
    public long mo9115a() {
        return this.f9001b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9112a(C2500k kVar, long j) {
        if (m12487b(kVar) == 2) {
            if ("onMetaData".equals(m12490e(kVar)) && m12487b(kVar) == 8) {
                HashMap h = m12493h(kVar);
                if (h.containsKey("duration")) {
                    double doubleValue = ((Double) h.get("duration")).doubleValue();
                    if (doubleValue > 0.0d) {
                        this.f9001b = (long) (doubleValue * 1000000.0d);
                    }
                }
                return;
            }
            return;
        }
        throw new ParserException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo9113a(C2500k kVar) {
        return true;
    }
}
