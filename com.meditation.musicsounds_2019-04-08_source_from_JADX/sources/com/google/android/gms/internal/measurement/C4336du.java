package com.google.android.gms.internal.measurement;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.du */
final class C4336du extends C4333dr<Boolean> {
    C4336du(C4339dx dxVar, String str, Boolean bool) {
        super(dxVar, str, bool, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo14284a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (C4318dc.f16000b.matcher(str).matches()) {
                return Boolean.valueOf(true);
            }
            if (C4318dc.f16001c.matcher(str).matches()) {
                return Boolean.valueOf(false);
            }
        }
        String b = super.mo14285b();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 28 + String.valueOf(valueOf).length());
        sb.append("Invalid boolean value for ");
        sb.append(b);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
