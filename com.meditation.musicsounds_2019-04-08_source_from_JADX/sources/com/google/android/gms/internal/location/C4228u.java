package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3108c.C3110b;
import com.google.android.gms.location.C4524i;

/* renamed from: com.google.android.gms.internal.location.u */
final class C4228u extends C4216i {

    /* renamed from: a */
    private C3110b<Status> f15656a;

    public C4228u(C3110b<Status> bVar) {
        this.f15656a = bVar;
    }

    /* renamed from: a */
    public final void mo14057a(int i, PendingIntent pendingIntent) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByPendingIntentResult");
    }

    /* renamed from: a */
    public final void mo14058a(int i, String[] strArr) {
        if (this.f15656a == null) {
            Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
            return;
        }
        this.f15656a.mo10980a(C4524i.m22615b(C4524i.m22614a(i)));
        this.f15656a = null;
    }

    /* renamed from: b */
    public final void mo14059b(int i, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByRequestIdsResult");
    }
}
