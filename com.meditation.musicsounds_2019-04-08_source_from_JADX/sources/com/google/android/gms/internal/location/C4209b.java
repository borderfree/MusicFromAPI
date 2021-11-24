package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.C3040d;
import com.google.android.gms.common.api.C3044e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.C4517c;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.zzal;

/* renamed from: com.google.android.gms.internal.location.b */
public final class C4209b implements C4517c {
    /* renamed from: a */
    private final C3044e<Status> m20874a(C3040d dVar, zzal zzal) {
        return dVar.mo10839a(new C4211d(this, dVar, zzal));
    }

    /* renamed from: a */
    public final C3044e<Status> mo14055a(C3040d dVar, PendingIntent pendingIntent) {
        return m20874a(dVar, zzal.m22628a(pendingIntent));
    }

    /* renamed from: a */
    public final C3044e<Status> mo14056a(C3040d dVar, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        return dVar.mo10839a(new C4210c(this, dVar, geofencingRequest, pendingIntent));
    }
}
