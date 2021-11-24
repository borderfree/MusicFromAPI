package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.support.p009v4.p019g.C0488a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.util.C3300e;
import com.google.android.gms.internal.measurement.C4297ci;
import com.google.android.gms.internal.measurement.C4298cj;
import com.google.android.gms.internal.measurement.C4299ck;
import com.google.android.gms.internal.measurement.C4301cm;
import com.google.android.gms.internal.measurement.C4303co;
import com.google.android.gms.internal.measurement.C4304cp;
import com.google.android.gms.internal.measurement.C4305cq;
import com.google.android.gms.internal.measurement.C4475io;
import com.google.android.gms.internal.measurement.C4477iq;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.aq */
public final class C4633aq extends C4725ea implements C4746eu {

    /* renamed from: b */
    private static int f16700b = 65535;

    /* renamed from: c */
    private static int f16701c = 2;

    /* renamed from: d */
    private final Map<String, Map<String, String>> f16702d = new C0488a();

    /* renamed from: e */
    private final Map<String, Map<String, Boolean>> f16703e = new C0488a();

    /* renamed from: f */
    private final Map<String, Map<String, Boolean>> f16704f = new C0488a();

    /* renamed from: g */
    private final Map<String, C4304cp> f16705g = new C0488a();

    /* renamed from: h */
    private final Map<String, Map<String, Integer>> f16706h = new C0488a();

    /* renamed from: i */
    private final Map<String, String> f16707i = new C0488a();

    C4633aq(C4726eb ebVar) {
        super(ebVar);
    }

    /* renamed from: a */
    private final C4304cp m22969a(String str, byte[] bArr) {
        if (bArr == null) {
            return new C4304cp();
        }
        C4475io a = C4475io.m22170a(bArr, 0, bArr.length);
        C4304cp cpVar = new C4304cp();
        try {
            cpVar.mo14223a(a);
            mo15253r().mo15855x().mo15860a("Parsed config. version, gmp_app_id", cpVar.f15904a, cpVar.f15905b);
            return cpVar;
        } catch (IOException e) {
            mo15253r().mo15849i().mo15860a("Unable to merge remote config. appId", C4767r.m23924a(str), e);
            return new C4304cp();
        }
    }

    /* renamed from: a */
    private static Map<String, String> m22970a(C4304cp cpVar) {
        C4305cq[] cqVarArr;
        C0488a aVar = new C0488a();
        if (!(cpVar == null || cpVar.f15906c == null)) {
            for (C4305cq cqVar : cpVar.f15906c) {
                if (cqVar != null) {
                    aVar.put(cqVar.f15913a, cqVar.f15914b);
                }
            }
        }
        return aVar;
    }

    /* renamed from: a */
    private final void m22971a(String str, C4304cp cpVar) {
        C4303co[] coVarArr;
        C0488a aVar = new C0488a();
        C0488a aVar2 = new C0488a();
        C0488a aVar3 = new C0488a();
        if (!(cpVar == null || cpVar.f15907d == null)) {
            for (C4303co coVar : cpVar.f15907d) {
                if (TextUtils.isEmpty(coVar.f15900a)) {
                    mo15253r().mo15849i().mo15858a("EventConfig contained null event name");
                } else {
                    String a = C4664bu.m23142a(coVar.f15900a);
                    if (!TextUtils.isEmpty(a)) {
                        coVar.f15900a = a;
                    }
                    aVar.put(coVar.f15900a, coVar.f15901b);
                    aVar2.put(coVar.f15900a, coVar.f15902c);
                    if (coVar.f15903d != null) {
                        if (coVar.f15903d.intValue() < f16701c || coVar.f15903d.intValue() > f16700b) {
                            mo15253r().mo15849i().mo15860a("Invalid sampling rate. Event name, sample rate", coVar.f15900a, coVar.f15903d);
                        } else {
                            aVar3.put(coVar.f15900a, coVar.f15903d);
                        }
                    }
                }
            }
        }
        this.f16703e.put(str, aVar);
        this.f16704f.put(str, aVar2);
        this.f16706h.put(str, aVar3);
    }

    /* renamed from: h */
    private final void m22972h(String str) {
        mo15525k();
        mo15239d();
        C3266s.m14915a(str);
        if (this.f16705g.get(str) == null) {
            byte[] d = mo15312i().mo15794d(str);
            if (d == null) {
                this.f16702d.put(str, null);
                this.f16703e.put(str, null);
                this.f16704f.put(str, null);
                this.f16705g.put(str, null);
                this.f16707i.put(str, null);
                this.f16706h.put(str, null);
                return;
            }
            C4304cp a = m22969a(str, d);
            this.f16702d.put(str, m22970a(a));
            m22971a(str, a);
            this.f16705g.put(str, a);
            this.f16707i.put(str, null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C4304cp mo15297a(String str) {
        mo15525k();
        mo15239d();
        C3266s.m14915a(str);
        m22972h(str);
        return (C4304cp) this.f16705g.get(str);
    }

    /* renamed from: a */
    public final String mo15298a(String str, String str2) {
        mo15239d();
        m22972h(str);
        Map map = (Map) this.f16702d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15233a() {
        super.mo15233a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo15299a(String str, byte[] bArr, String str2) {
        byte[] bArr2;
        C4298cj[] cjVarArr;
        C4301cm[] cmVarArr;
        C4299ck[] ckVarArr;
        String str3 = str;
        mo15525k();
        mo15239d();
        C3266s.m14915a(str);
        C4304cp a = m22969a(str, bArr);
        if (a == null) {
            return false;
        }
        m22971a(str3, a);
        this.f16705g.put(str3, a);
        this.f16707i.put(str3, str2);
        this.f16702d.put(str3, m22970a(a));
        C4741ep h = mo15311h();
        C4297ci[] ciVarArr = a.f15908e;
        C3266s.m14913a(ciVarArr);
        for (C4297ci ciVar : ciVarArr) {
            for (C4298cj cjVar : ciVar.f15868c) {
                String a2 = C4664bu.m23142a(cjVar.f15873b);
                if (a2 != null) {
                    cjVar.f15873b = a2;
                }
                for (C4299ck ckVar : cjVar.f15874c) {
                    String a3 = C4665bv.m23143a(ckVar.f15883d);
                    if (a3 != null) {
                        ckVar.f15883d = a3;
                    }
                }
            }
            for (C4301cm cmVar : ciVar.f15867b) {
                String a4 = C4666bw.m23144a(cmVar.f15891b);
                if (a4 != null) {
                    cmVar.f15891b = a4;
                }
            }
        }
        h.mo15312i().mo15781a(str3, ciVarArr);
        try {
            a.f15908e = null;
            bArr2 = new byte[a.mo14784e()];
            a.mo14224a(C4477iq.m22220a(bArr2, 0, bArr2.length));
        } catch (IOException e) {
            mo15253r().mo15849i().mo15860a("Unable to serialize reduced-size config. Storing full config instead. appId", C4767r.m23924a(str), e);
            bArr2 = bArr;
        }
        C4747ev i = mo15312i();
        C3266s.m14915a(str);
        i.mo15239d();
        i.mo15525k();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr2);
        try {
            if (((long) i.mo15804y().update("apps", contentValues, "app_id = ?", new String[]{str3})) == 0) {
                i.mo15253r().mo15852u_().mo15859a("Failed to update remote config (got 0). appId", C4767r.m23924a(str));
            }
        } catch (SQLiteException e2) {
            i.mo15253r().mo15852u_().mo15860a("Error storing remote config. appId", C4767r.m23924a(str), e2);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo15300b(String str) {
        mo15239d();
        return (String) this.f16707i.get(str);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15236b() {
        super.mo15236b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo15301b(String str, String str2) {
        mo15239d();
        m22972h(str);
        if (mo15308f(str) && C4736ek.m23542e(str2)) {
            return true;
        }
        if (mo15310g(str) && C4736ek.m23532a(str2)) {
            return true;
        }
        Map map = (Map) this.f16703e.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo15238c() {
        super.mo15238c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo15302c(String str) {
        mo15239d();
        this.f16707i.put(str, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo15303c(String str, String str2) {
        mo15239d();
        m22972h(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f16704f.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final int mo15304d(String str, String str2) {
        mo15239d();
        m22972h(str);
        Map map = (Map) this.f16706h.get(str);
        if (map == null) {
            return 1;
        }
        Integer num = (Integer) map.get(str2);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo15239d() {
        super.mo15239d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo15305d(String str) {
        mo15239d();
        this.f16705g.remove(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final long mo15306e(String str) {
        String a = mo15298a(str, "measurement.account.time_zone_offset_minutes");
        if (!TextUtils.isEmpty(a)) {
            try {
                return Long.parseLong(a);
            } catch (NumberFormatException e) {
                mo15253r().mo15849i().mo15860a("Unable to parse timezone offset. appId", C4767r.m23924a(str), e);
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo15307e() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final boolean mo15308f(String str) {
        return "1".equals(mo15298a(str, "measurement.upload.blacklist_internal"));
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C4733eh mo15309g() {
        return super.mo15309g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final boolean mo15310g(String str) {
        return "1".equals(mo15298a(str, "measurement.upload.blacklist_public"));
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C4741ep mo15311h() {
        return super.mo15311h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C4747ev mo15312i() {
        return super.mo15312i();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C4643b mo15247l() {
        return super.mo15247l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C3300e mo15248m() {
        return super.mo15248m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo15249n() {
        return super.mo15249n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C4765p mo15250o() {
        return super.mo15250o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C4736ek mo15251p() {
        return super.mo15251p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C4634ar mo15252q() {
        return super.mo15252q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C4767r mo15253r() {
        return super.mo15253r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C4620ad mo15254s() {
        return super.mo15254s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C4744es mo15255t() {
        return super.mo15255t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ C4742eq mo15256u() {
        return super.mo15256u();
    }
}
