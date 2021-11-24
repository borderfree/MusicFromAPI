package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.C3020a.C3022b;
import com.google.android.gms.common.api.C3040d;
import com.google.android.gms.location.GeofencingRequest;

/* renamed from: com.google.android.gms.internal.location.c */
final class C4210c extends C4212e {

    /* renamed from: b */
    private final /* synthetic */ GeofencingRequest f15639b;

    /* renamed from: c */
    private final /* synthetic */ PendingIntent f15640c;

    C4210c(C4209b bVar, C3040d dVar, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        this.f15639b = geofencingRequest;
        this.f15640c = pendingIntent;
        super(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo10741a(C3022b bVar) {
        ((C4226s) bVar).mo14072a(this.f15639b, this.f15640c, this);
    }
}
