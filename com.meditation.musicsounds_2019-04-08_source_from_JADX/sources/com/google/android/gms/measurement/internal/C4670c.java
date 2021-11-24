package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3266s;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.c */
public final class C4670c {

    /* renamed from: a */
    final String f16840a;

    /* renamed from: b */
    final String f16841b;

    /* renamed from: c */
    final long f16842c;

    /* renamed from: d */
    final long f16843d;

    /* renamed from: e */
    final zzad f16844e;

    /* renamed from: f */
    private final String f16845f;

    C4670c(C4638av avVar, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzad zzad;
        C3266s.m14915a(str2);
        C3266s.m14915a(str3);
        this.f16840a = str2;
        this.f16841b = str3;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f16845f = str;
        this.f16842c = j;
        this.f16843d = j2;
        if (this.f16843d != 0 && this.f16843d > this.f16842c) {
            avVar.mo15253r().mo15849i().mo15859a("Event created with reverse previous/current timestamps. appId", C4767r.m23924a(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzad = new zzad(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    avVar.mo15253r().mo15852u_().mo15858a("Param name can't be null");
                } else {
                    Object a = avVar.mo15343j().mo15583a(str4, bundle2.get(str4));
                    if (a == null) {
                        avVar.mo15253r().mo15849i().mo15859a("Param value can't be null", avVar.mo15344k().mo15842b(str4));
                    } else {
                        avVar.mo15343j().mo15586a(bundle2, str4, a);
                    }
                }
                it.remove();
            }
            zzad = new zzad(bundle2);
        }
        this.f16844e = zzad;
    }

    private C4670c(C4638av avVar, String str, String str2, String str3, long j, long j2, zzad zzad) {
        C3266s.m14915a(str2);
        C3266s.m14915a(str3);
        C3266s.m14913a(zzad);
        this.f16840a = str2;
        this.f16841b = str3;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f16845f = str;
        this.f16842c = j;
        this.f16843d = j2;
        if (this.f16843d != 0 && this.f16843d > this.f16842c) {
            avVar.mo15253r().mo15849i().mo15860a("Event created with reverse previous/current timestamps. appId, name", C4767r.m23924a(str2), C4767r.m23924a(str3));
        }
        this.f16844e = zzad;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C4670c mo15401a(C4638av avVar, long j) {
        C4670c cVar = new C4670c(avVar, this.f16845f, this.f16840a, this.f16841b, this.f16842c, j, this.f16844e);
        return cVar;
    }

    public final String toString() {
        String str = this.f16840a;
        String str2 = this.f16841b;
        String valueOf = String.valueOf(this.f16844e);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
