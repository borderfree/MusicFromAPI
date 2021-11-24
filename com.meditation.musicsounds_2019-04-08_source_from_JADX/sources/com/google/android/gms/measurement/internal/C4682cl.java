package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.internal.measurement.C4308ct;
import com.google.android.gms.internal.measurement.C4309cu;
import com.google.android.gms.internal.measurement.C4310cv;
import com.google.android.gms.internal.measurement.C4311cw;
import com.google.android.gms.internal.measurement.C4314cz;
import com.google.android.gms.internal.measurement.C4383fm;
import com.google.android.gms.internal.measurement.C4477iq;
import com.google.android.gms.internal.measurement.zzfe.C4505a;
import com.google.android.gms.internal.measurement.zzfe.zzb;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.cl */
final class C4682cl extends C4725ea {
    public C4682cl(C4726eb ebVar) {
        super(ebVar);
    }

    /* renamed from: a */
    private static String m23206a(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    /* renamed from: a */
    public final byte[] mo15442a(zzag zzag, String str) {
        C4738em emVar;
        C4310cv cvVar;
        C4311cw cwVar;
        Bundle bundle;
        C4697d dVar;
        long j;
        C4735ej ejVar;
        zzag zzag2 = zzag;
        String str2 = str;
        mo15239d();
        this.f16825q.mo15328F();
        C3266s.m14913a(zzag);
        C3266s.m14915a(str);
        if (!mo15255t().mo15740d(str2, C4756h.f17158at)) {
            mo15253r().mo15854w().mo15859a("Generating ScionPayload disabled. packageName", str2);
            return new byte[0];
        } else if ("_iap".equals(zzag2.f17252a) || "_iapx".equals(zzag2.f17252a)) {
            C4310cv cvVar2 = new C4310cv();
            mo15312i().mo15799f();
            try {
                C4738em b = mo15312i().mo15788b(str2);
                if (b == null) {
                    mo15253r().mo15854w().mo15859a("Log and bundle not available. package_name", str2);
                    return new byte[0];
                } else if (!b.mo15654o()) {
                    mo15253r().mo15854w().mo15859a("Log and bundle disabled. package_name", str2);
                    byte[] bArr = new byte[0];
                    mo15312i().mo15803x();
                    return bArr;
                } else {
                    C4311cw cwVar2 = new C4311cw();
                    cvVar2.f15935a = new C4311cw[]{cwVar2};
                    cwVar2.f15952a = Integer.valueOf(1);
                    cwVar2.f15960i = "android";
                    cwVar2.f15966o = b.mo15618b();
                    cwVar2.f15965n = b.mo15647l();
                    cwVar2.f15967p = b.mo15643j();
                    long k = b.mo15645k();
                    cwVar2.f15939C = k == -2147483648L ? null : Integer.valueOf((int) k);
                    cwVar2.f15968q = Long.valueOf(b.mo15649m());
                    cwVar2.f15976y = b.mo15626d();
                    if (TextUtils.isEmpty(cwVar2.f15976y)) {
                        cwVar2.f15945I = b.mo15629e();
                    }
                    cwVar2.f15973v = Long.valueOf(b.mo15651n());
                    if (this.f16825q.mo15325C() && C4744es.m23662w() && mo15255t().mo15737c(cwVar2.f15966o)) {
                        cwVar2.f15943G = null;
                    }
                    Pair a = mo15254s().mo15262a(b.mo15618b());
                    if (b.mo15612C() && a != null && !TextUtils.isEmpty((CharSequence) a.first)) {
                        cwVar2.f15970s = m23206a((String) a.first, Long.toString(zzag2.f17255d));
                        cwVar2.f15971t = (Boolean) a.second;
                    }
                    mo15247l().mo15395A();
                    cwVar2.f15962k = Build.MODEL;
                    mo15247l().mo15395A();
                    cwVar2.f15961j = VERSION.RELEASE;
                    cwVar2.f15964m = Integer.valueOf((int) mo15247l().mo15377t_());
                    cwVar2.f15963l = mo15247l().mo15376g();
                    try {
                        cwVar2.f15972u = m23206a(b.mo15622c(), Long.toString(zzag2.f17255d));
                        cwVar2.f15938B = b.mo15635g();
                        String str3 = cwVar2.f15966o;
                        List a2 = mo15312i().mo15775a(str3);
                        if (mo15255t().mo15741e(str2)) {
                            Iterator it = a2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    ejVar = null;
                                    break;
                                }
                                ejVar = (C4735ej) it.next();
                                if ("_lte".equals(ejVar.f17047c)) {
                                    break;
                                }
                            }
                            if (ejVar == null || ejVar.f17049e == null) {
                                C4735ej ejVar2 = new C4735ej(str3, "auto", "_lte", mo15248m().mo11326a(), Long.valueOf(0));
                                a2.add(ejVar2);
                                mo15312i().mo15785a(ejVar2);
                            }
                        }
                        C4314cz[] czVarArr = new C4314cz[a2.size()];
                        for (int i = 0; i < a2.size(); i++) {
                            C4314cz czVar = new C4314cz();
                            czVarArr[i] = czVar;
                            czVar.f15987b = ((C4735ej) a2.get(i)).f17047c;
                            czVar.f15986a = Long.valueOf(((C4735ej) a2.get(i)).f17048d);
                            mo15309g().mo15567a(czVar, ((C4735ej) a2.get(i)).f17049e);
                        }
                        cwVar2.f15954c = czVarArr;
                        Bundle b2 = zzag2.f17253b.mo15868b();
                        b2.putLong("_c", 1);
                        mo15253r().mo15854w().mo15858a("Marking in-app purchase as real-time");
                        b2.putLong("_r", 1);
                        b2.putString("_o", zzag2.f17254c);
                        if (mo15251p().mo15597f(cwVar2.f15966o)) {
                            mo15251p().mo15586a(b2, "_dbg", (Object) Long.valueOf(1));
                            mo15251p().mo15586a(b2, "_r", (Object) Long.valueOf(1));
                        }
                        C4697d a3 = mo15312i().mo15772a(str2, zzag2.f17252a);
                        if (a3 == null) {
                            bundle = b2;
                            cwVar = cwVar2;
                            cvVar = cvVar2;
                            emVar = b;
                            C4697d dVar2 = new C4697d(str, zzag2.f17252a, 0, 0, zzag2.f17255d, 0, null, null, null, null);
                            dVar = dVar2;
                            j = 0;
                        } else {
                            bundle = b2;
                            cwVar = cwVar2;
                            cvVar = cvVar2;
                            emVar = b;
                            j = a3.f16932e;
                            dVar = a3.mo15475a(zzag2.f17255d);
                        }
                        mo15312i().mo15779a(dVar);
                        C4670c cVar = new C4670c(this.f16825q, zzag2.f17254c, str, zzag2.f17252a, zzag2.f17255d, j, bundle);
                        C4308ct ctVar = new C4308ct();
                        C4311cw cwVar3 = cwVar;
                        cwVar3.f15953b = new C4308ct[]{ctVar};
                        ctVar.f15926c = Long.valueOf(cVar.f16842c);
                        ctVar.f15925b = cVar.f16841b;
                        ctVar.f15927d = Long.valueOf(cVar.f16843d);
                        ctVar.f15924a = new C4309cu[cVar.f16844e.mo15866a()];
                        Iterator it2 = cVar.f16844e.iterator();
                        int i2 = 0;
                        while (it2.hasNext()) {
                            String str4 = (String) it2.next();
                            C4309cu cuVar = new C4309cu();
                            int i3 = i2 + 1;
                            ctVar.f15924a[i2] = cuVar;
                            cuVar.f15930a = str4;
                            mo15309g().mo15566a(cuVar, cVar.f16844e.mo15867a(str4));
                            i2 = i3;
                        }
                        cwVar3.f15946J = (zzb) ((C4383fm) zzb.m22398a().mo14879a((C4505a) ((C4383fm) C4505a.m22389a().mo14877a(dVar.f16930c).mo14878a(zzag2.f17252a).mo14508g())).mo14508g());
                        cwVar3.f15937A = mo15311h().mo15728a(emVar.mo15618b(), (C4308ct[]) null, cwVar3.f15954c);
                        cwVar3.f15956e = ctVar.f15926c;
                        cwVar3.f15957f = ctVar.f15926c;
                        long i4 = emVar.mo15641i();
                        cwVar3.f15959h = i4 != 0 ? Long.valueOf(i4) : null;
                        long h = emVar.mo15638h();
                        if (h != 0) {
                            i4 = h;
                        }
                        cwVar3.f15958g = i4 != 0 ? Long.valueOf(i4) : null;
                        emVar.mo15658s();
                        cwVar3.f15974w = Integer.valueOf((int) emVar.mo15655p());
                        cwVar3.f15969r = Long.valueOf(mo15255t().mo15742f());
                        cwVar3.f15955d = Long.valueOf(mo15248m().mo11326a());
                        cwVar3.f15977z = Boolean.TRUE;
                        C4738em emVar2 = emVar;
                        emVar2.mo15615a(cwVar3.f15956e.longValue());
                        emVar2.mo15619b(cwVar3.f15957f.longValue());
                        mo15312i().mo15780a(emVar2);
                        mo15312i().mo15802w();
                        mo15312i().mo15803x();
                        try {
                            byte[] bArr2 = new byte[cvVar.mo14784e()];
                            C4477iq a4 = C4477iq.m22220a(bArr2, 0, bArr2.length);
                            cvVar.mo14224a(a4);
                            a4.mo14747a();
                            return mo15309g().mo15573b(bArr2);
                        } catch (IOException e) {
                            mo15253r().mo15852u_().mo15860a("Data loss. Failed to bundle and serialize. appId", C4767r.m23924a(str), e);
                            return null;
                        }
                    } catch (SecurityException e2) {
                        mo15253r().mo15854w().mo15859a("app instance id encryption failed", e2.getMessage());
                        byte[] bArr3 = new byte[0];
                        mo15312i().mo15803x();
                        return bArr3;
                    }
                }
            } catch (SecurityException e3) {
                mo15253r().mo15854w().mo15859a("Resettable device id encryption failed", e3.getMessage());
                return new byte[0];
            } finally {
                mo15312i().mo15803x();
            }
        } else {
            mo15253r().mo15854w().mo15860a("Generating a payload for this event is not available. package_name, event_name", str2, zzag2.f17252a);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo15307e() {
        return false;
    }
}
