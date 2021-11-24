package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3108c.C3110b;
import com.google.android.gms.location.C4524i;

/* renamed from: com.google.android.gms.internal.location.v */
final class C4229v extends C4216i {

    /* renamed from: a */
    private C3110b<Status> f15657a;

    public C4229v(C3110b<Status> bVar) {
        this.f15657a = bVar;
    }

    /* renamed from: a */
    private final void m20913a(int i) {
        if (this.f15657a == null) {
            Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times");
            return;
        }
        this.f15657a.mo10980a(C4524i.m22615b(C4524i.m22614a(i)));
        this.f15657a = null;
    }

    /* renamed from: a */
    public final void mo14057a(int i, PendingIntent pendingIntent) {
        m20913a(i);
    }

    /* renamed from: a */
    public final void mo14058a(int i, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult");
    }

    /* renamed from: b */
    public final void mo14059b(int i, String[] strArr) {
        m20913a(i);
    }
}
