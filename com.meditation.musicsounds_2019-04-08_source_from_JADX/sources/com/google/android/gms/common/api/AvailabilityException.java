package com.google.android.gms.common.api;

import android.support.p009v4.p019g.C0488a;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3020a.C3024d;
import com.google.android.gms.common.api.internal.C3112cb;
import com.google.android.gms.common.internal.C3266s;
import java.util.ArrayList;

public class AvailabilityException extends Exception {
    private final C0488a<C3112cb<?>, ConnectionResult> zaay;

    public AvailabilityException(C0488a<C3112cb<?>, ConnectionResult> aVar) {
        this.zaay = aVar;
    }

    public ConnectionResult getConnectionResult(C3037c<? extends C3024d> cVar) {
        C3112cb b = cVar.mo10831b();
        C3266s.m14924b(this.zaay.get(b) != null, "The given API was not part of the availability request.");
        return (ConnectionResult) this.zaay.get(b);
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C3112cb cbVar : this.zaay.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) this.zaay.get(cbVar);
            if (connectionResult.mo10759b()) {
                z = false;
            }
            String a = cbVar.mo10985a();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2 + String.valueOf(valueOf).length());
            sb.append(a);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }

    public final C0488a<C3112cb<?>, ConnectionResult> zaj() {
        return this.zaay;
    }
}
