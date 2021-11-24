package com.google.android.gms.analytics;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.analytics.p116a.C2932a;
import com.google.android.gms.analytics.p116a.C2933b;
import com.google.android.gms.analytics.p116a.C2934c;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.internal.measurement.C4234a;
import com.google.android.gms.internal.measurement.C4261b;
import com.google.android.gms.internal.measurement.C4267bf;
import com.google.android.gms.internal.measurement.C4286by;
import com.google.android.gms.internal.measurement.C4288c;
import com.google.android.gms.internal.measurement.C4315d;
import com.google.android.gms.internal.measurement.C4342e;
import com.google.android.gms.internal.measurement.C4369f;
import com.google.android.gms.internal.measurement.C4402g;
import com.google.android.gms.internal.measurement.C4429h;
import com.google.android.gms.internal.measurement.C4452hw;
import com.google.android.gms.internal.measurement.C4456i;
import com.google.android.gms.internal.measurement.C4476ip;
import com.google.android.gms.internal.measurement.C4487j;
import com.google.android.gms.internal.measurement.C4488ja;
import com.google.android.gms.internal.measurement.C4496r;
import com.google.android.gms.internal.measurement.C4498t;
import com.google.android.gms.internal.measurement.C4499u;
import com.google.android.gms.internal.measurement.C4502x;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.analytics.g */
public final class C2943g extends C4496r implements C2959t {

    /* renamed from: a */
    private static DecimalFormat f10383a;

    /* renamed from: b */
    private final C4499u f10384b;

    /* renamed from: c */
    private final String f10385c;

    /* renamed from: d */
    private final Uri f10386d;

    public C2943g(C4499u uVar, String str) {
        this(uVar, str, true, false);
    }

    private C2943g(C4499u uVar, String str, boolean z, boolean z2) {
        super(uVar);
        C3266s.m14915a(str);
        this.f10384b = uVar;
        this.f10385c = str;
        this.f10386d = m13777a(this.f10385c);
    }

    /* renamed from: a */
    static Uri m13777a(String str) {
        C3266s.m14915a(str);
        Builder builder = new Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        return builder.build();
    }

    /* renamed from: a */
    private static String m13778a(double d) {
        if (f10383a == null) {
            f10383a = new DecimalFormat("0.######");
        }
        return f10383a.format(d);
    }

    /* renamed from: a */
    private static void m13779a(Map<String, String> map, String str, double d) {
        if (d != 0.0d) {
            map.put(str, m13778a(d));
        }
    }

    /* renamed from: a */
    private static void m13780a(Map<String, String> map, String str, int i, int i2) {
        if (i > 0 && i2 > 0) {
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            map.put(str, sb.toString());
        }
    }

    /* renamed from: a */
    private static void m13781a(Map<String, String> map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    /* renamed from: a */
    private static void m13782a(Map<String, String> map, String str, boolean z) {
        if (z) {
            map.put(str, "1");
        }
    }

    /* renamed from: b */
    private static Map<String, String> m13783b(C2948l lVar) {
        HashMap hashMap = new HashMap();
        C4261b bVar = (C4261b) lVar.mo10627a(C4261b.class);
        if (bVar != null) {
            for (Entry entry : bVar.mo14163a().entrySet()) {
                Object value = entry.getValue();
                String str = null;
                if (value != null) {
                    if (value instanceof String) {
                        String str2 = (String) value;
                        if (!TextUtils.isEmpty(str2)) {
                            str = str2;
                        }
                    } else if (value instanceof Double) {
                        Double d = (Double) value;
                        if (d.doubleValue() != 0.0d) {
                            str = m13778a(d.doubleValue());
                        }
                    } else if (!(value instanceof Boolean)) {
                        str = String.valueOf(value);
                    } else if (value != Boolean.FALSE) {
                        str = "1";
                    }
                }
                if (str != null) {
                    hashMap.put((String) entry.getKey(), str);
                }
            }
        }
        C4402g gVar = (C4402g) lVar.mo10627a(C4402g.class);
        if (gVar != null) {
            m13781a((Map<String, String>) hashMap, "t", gVar.mo14535a());
            m13781a((Map<String, String>) hashMap, "cid", gVar.mo14538b());
            m13781a((Map<String, String>) hashMap, "uid", gVar.mo14541c());
            m13781a((Map<String, String>) hashMap, "sc", gVar.mo14546f());
            m13779a((Map<String, String>) hashMap, "sf", gVar.mo14548h());
            m13782a((Map<String, String>) hashMap, "ni", gVar.mo14547g());
            m13781a((Map<String, String>) hashMap, "adid", gVar.mo14543d());
            m13782a((Map<String, String>) hashMap, "ate", gVar.mo14545e());
        }
        C4429h hVar = (C4429h) lVar.mo10627a(C4429h.class);
        if (hVar != null) {
            m13781a((Map<String, String>) hashMap, "cd", hVar.mo14581a());
            m13779a((Map<String, String>) hashMap, "a", (double) hVar.mo14582b());
            m13781a((Map<String, String>) hashMap, "dr", hVar.mo14583c());
        }
        C4342e eVar = (C4342e) lVar.mo10627a(C4342e.class);
        if (eVar != null) {
            m13781a((Map<String, String>) hashMap, "ec", eVar.mo14295a());
            m13781a((Map<String, String>) hashMap, "ea", eVar.mo14296b());
            m13781a((Map<String, String>) hashMap, "el", eVar.mo14297c());
            m13779a((Map<String, String>) hashMap, "ev", (double) eVar.mo14298d());
        }
        C4476ip ipVar = (C4476ip) lVar.mo10627a(C4476ip.class);
        if (ipVar != null) {
            m13781a((Map<String, String>) hashMap, "cn", ipVar.mo14726a());
            m13781a((Map<String, String>) hashMap, "cs", ipVar.mo14728b());
            m13781a((Map<String, String>) hashMap, "cm", ipVar.mo14730c());
            m13781a((Map<String, String>) hashMap, "ck", ipVar.mo14732d());
            m13781a((Map<String, String>) hashMap, "cc", ipVar.mo14734e());
            m13781a((Map<String, String>) hashMap, "ci", ipVar.mo14736f());
            m13781a((Map<String, String>) hashMap, "anid", ipVar.mo14738g());
            m13781a((Map<String, String>) hashMap, "gclid", ipVar.mo14740h());
            m13781a((Map<String, String>) hashMap, "dclid", ipVar.mo14742i());
            m13781a((Map<String, String>) hashMap, "aclid", ipVar.mo14744j());
        }
        C4369f fVar = (C4369f) lVar.mo10627a(C4369f.class);
        if (fVar != null) {
            m13781a((Map<String, String>) hashMap, "exd", fVar.f16089a);
            m13782a((Map<String, String>) hashMap, "exf", fVar.f16090b);
        }
        C4456i iVar = (C4456i) lVar.mo10627a(C4456i.class);
        if (iVar != null) {
            m13781a((Map<String, String>) hashMap, "sn", iVar.f16244a);
            m13781a((Map<String, String>) hashMap, "sa", iVar.f16245b);
            m13781a((Map<String, String>) hashMap, "st", iVar.f16246c);
        }
        C4487j jVar = (C4487j) lVar.mo10627a(C4487j.class);
        if (jVar != null) {
            m13781a((Map<String, String>) hashMap, "utv", jVar.f16341a);
            m13779a((Map<String, String>) hashMap, "utt", (double) jVar.f16342b);
            m13781a((Map<String, String>) hashMap, "utc", jVar.f16343c);
            m13781a((Map<String, String>) hashMap, "utl", jVar.f16344d);
        }
        C4488ja jaVar = (C4488ja) lVar.mo10627a(C4488ja.class);
        if (jaVar != null) {
            for (Entry entry2 : jaVar.mo14789a().entrySet()) {
                String a = C2945i.m13786a(((Integer) entry2.getKey()).intValue());
                if (!TextUtils.isEmpty(a)) {
                    hashMap.put(a, (String) entry2.getValue());
                }
            }
        }
        C4234a aVar = (C4234a) lVar.mo10627a(C4234a.class);
        if (aVar != null) {
            for (Entry entry3 : aVar.mo14096a().entrySet()) {
                String b = C2945i.m13788b(((Integer) entry3.getKey()).intValue());
                if (!TextUtils.isEmpty(b)) {
                    hashMap.put(b, m13778a(((Double) entry3.getValue()).doubleValue()));
                }
            }
        }
        C4315d dVar = (C4315d) lVar.mo10627a(C4315d.class);
        if (dVar != null) {
            C2933b a2 = dVar.mo14262a();
            if (a2 != null) {
                for (Entry entry4 : a2.mo10595a().entrySet()) {
                    hashMap.put(((String) entry4.getKey()).startsWith("&") ? ((String) entry4.getKey()).substring(1) : (String) entry4.getKey(), (String) entry4.getValue());
                }
            }
            int i = 1;
            for (C2934c a3 : dVar.mo14265d()) {
                hashMap.putAll(a3.mo10597a(C2945i.m13792f(i)));
                i++;
            }
            int i2 = 1;
            for (C2932a a4 : dVar.mo14263b()) {
                hashMap.putAll(a4.mo10593a(C2945i.m13790d(i2)));
                i2++;
            }
            int i3 = 1;
            for (Entry entry5 : dVar.mo14264c().entrySet()) {
                List<C2932a> list = (List) entry5.getValue();
                String i4 = C2945i.m13795i(i3);
                int i5 = 1;
                for (C2932a aVar2 : list) {
                    String valueOf = String.valueOf(i4);
                    String valueOf2 = String.valueOf(C2945i.m13793g(i5));
                    hashMap.putAll(aVar2.mo10593a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)));
                    i5++;
                }
                if (!TextUtils.isEmpty((CharSequence) entry5.getKey())) {
                    String valueOf3 = String.valueOf(i4);
                    String valueOf4 = String.valueOf("nm");
                    hashMap.put(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), (String) entry5.getKey());
                }
                i3++;
            }
        }
        C4288c cVar = (C4288c) lVar.mo10627a(C4288c.class);
        if (cVar != null) {
            m13781a((Map<String, String>) hashMap, "ul", cVar.mo14217a());
            m13779a((Map<String, String>) hashMap, "sd", (double) cVar.f15851a);
            m13780a(hashMap, "sr", cVar.f15852b, cVar.f15853c);
            m13780a(hashMap, "vp", cVar.f15854d, cVar.f15855e);
        }
        C4452hw hwVar = (C4452hw) lVar.mo10627a(C4452hw.class);
        if (hwVar != null) {
            m13781a((Map<String, String>) hashMap, "an", hwVar.mo14630a());
            m13781a((Map<String, String>) hashMap, "aid", hwVar.mo14635c());
            m13781a((Map<String, String>) hashMap, "aiid", hwVar.mo14637d());
            m13781a((Map<String, String>) hashMap, "av", hwVar.mo14633b());
        }
        return hashMap;
    }

    /* renamed from: a */
    public final Uri mo10622a() {
        return this.f10386d;
    }

    /* renamed from: a */
    public final void mo10623a(C2948l lVar) {
        C3266s.m14913a(lVar);
        C3266s.m14924b(lVar.mo10635f(), "Can't deliver not submitted measurement");
        C3266s.m14926c("deliver should be called on worker thread");
        C2948l a = lVar.mo10626a();
        C4402g gVar = (C4402g) a.mo10630b(C4402g.class);
        if (TextUtils.isEmpty(gVar.mo14535a())) {
            mo14827j().mo14180a(m13783b(a), "Ignoring measurement without type");
        } else if (TextUtils.isEmpty(gVar.mo14538b())) {
            mo14827j().mo14180a(m13783b(a), "Ignoring measurement without client id");
        } else if (!this.f10384b.mo14851j().mo10605e()) {
            double h = gVar.mo14548h();
            if (C4286by.m21134a(h, gVar.mo14538b())) {
                mo14812b("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(h));
                return;
            }
            Map b = m13783b(a);
            b.put("v", "1");
            b.put("_v", C4498t.f16367b);
            b.put("tid", this.f10385c);
            if (this.f10384b.mo14851j().mo10604d()) {
                StringBuilder sb = new StringBuilder();
                for (Entry entry : b.entrySet()) {
                    if (sb.length() != 0) {
                        sb.append(", ");
                    }
                    sb.append((String) entry.getKey());
                    sb.append("=");
                    sb.append((String) entry.getValue());
                }
                mo14816c("Dry run is enabled. GoogleAnalytics would have sent", sb.toString());
                return;
            }
            HashMap hashMap = new HashMap();
            C4286by.m21131a((Map<String, String>) hashMap, "uid", gVar.mo14541c());
            C4452hw hwVar = (C4452hw) lVar.mo10627a(C4452hw.class);
            if (hwVar != null) {
                C4286by.m21131a((Map<String, String>) hashMap, "an", hwVar.mo14630a());
                C4286by.m21131a((Map<String, String>) hashMap, "aid", hwVar.mo14635c());
                C4286by.m21131a((Map<String, String>) hashMap, "av", hwVar.mo14633b());
                C4286by.m21131a((Map<String, String>) hashMap, "aiid", hwVar.mo14637d());
            }
            C4502x xVar = new C4502x(0, gVar.mo14538b(), this.f10385c, !TextUtils.isEmpty(gVar.mo14543d()), 0, hashMap);
            b.put("_s", String.valueOf(mo14831n().mo14793a(xVar)));
            C4267bf bfVar = new C4267bf(mo14827j(), b, lVar.mo10633d(), true);
            mo14831n().mo14796a(bfVar);
        }
    }
}
