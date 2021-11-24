package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.util.C3300e;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.p */
public final class C4765p extends C4662bs {

    /* renamed from: a */
    private static final AtomicReference<String[]> f17215a = new AtomicReference<>();

    /* renamed from: b */
    private static final AtomicReference<String[]> f17216b = new AtomicReference<>();

    /* renamed from: c */
    private static final AtomicReference<String[]> f17217c = new AtomicReference<>();

    C4765p(C4638av avVar) {
        super(avVar);
    }

    /* renamed from: a */
    private final String m23892a(zzad zzad) {
        if (zzad == null) {
            return null;
        }
        return !m23894g() ? zzad.toString() : mo15838a(zzad.mo15868b());
    }

    /* renamed from: a */
    private static String m23893a(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        C3266s.m14913a(strArr);
        C3266s.m14913a(strArr2);
        C3266s.m14913a(atomicReference);
        C3266s.m14923b(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (C4736ek.m23540c(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(strArr2[i]);
                        sb.append("(");
                        sb.append(strArr[i]);
                        sb.append(")");
                        strArr3[i] = sb.toString();
                    }
                    str2 = strArr3[i];
                }
                return str2;
            }
        }
        return str;
    }

    /* renamed from: g */
    private final boolean m23894g() {
        mo15256u();
        return this.f16825q.mo15346o() && this.f16825q.mo15253r().mo15846a(3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo15838a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!m23894g()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        for (String str : bundle.keySet()) {
            sb.append(sb.length() != 0 ? ", " : "Bundle[{");
            sb.append(mo15842b(str));
            sb.append("=");
            sb.append(bundle.get(str));
        }
        sb.append("}]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo15839a(C4670c cVar) {
        if (cVar == null) {
            return null;
        }
        if (!m23894g()) {
            return cVar.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Event{appId='");
        sb.append(cVar.f16840a);
        sb.append("', name='");
        sb.append(mo15841a(cVar.f16841b));
        sb.append("', params=");
        sb.append(m23892a(cVar.f16844e));
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo15840a(zzag zzag) {
        if (zzag == null) {
            return null;
        }
        if (!m23894g()) {
            return zzag.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(zzag.f17254c);
        sb.append(",name=");
        sb.append(mo15841a(zzag.f17252a));
        sb.append(",params=");
        sb.append(m23892a(zzag.f17253b));
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo15841a(String str) {
        if (str == null) {
            return null;
        }
        return !m23894g() ? str : m23893a(str, C4664bu.f16828b, C4664bu.f16827a, f17215a);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15233a() {
        super.mo15233a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo15842b(String str) {
        if (str == null) {
            return null;
        }
        return !m23894g() ? str : m23893a(str, C4665bv.f16830b, C4665bv.f16829a, f17216b);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15236b() {
        super.mo15236b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo15843c(String str) {
        if (str == null) {
            return null;
        }
        if (!m23894g()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m23893a(str, C4666bw.f16832b, C4666bw.f16831a, f17217c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("experiment_id");
        sb.append("(");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo15238c() {
        super.mo15238c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo15239d() {
        super.mo15239d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo15271e() {
        return false;
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
