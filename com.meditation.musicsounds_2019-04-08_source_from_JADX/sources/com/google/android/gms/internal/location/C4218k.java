package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.zzal;

/* renamed from: com.google.android.gms.internal.location.k */
public final class C4218k extends C4200a implements C4217j {
    C4218k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    /* renamed from: a */
    public final void mo14061a(zzbf zzbf) {
        Parcel a = mo14045a();
        C4202ab.m20864a(a, (Parcelable) zzbf);
        mo14046a(59, a);
    }

    /* renamed from: a */
    public final void mo14062a(zzo zzo) {
        Parcel a = mo14045a();
        C4202ab.m20864a(a, (Parcelable) zzo);
        mo14046a(75, a);
    }

    /* renamed from: a */
    public final void mo14063a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, C4215h hVar) {
        Parcel a = mo14045a();
        C4202ab.m20864a(a, (Parcelable) geofencingRequest);
        C4202ab.m20864a(a, (Parcelable) pendingIntent);
        C4202ab.m20863a(a, (IInterface) hVar);
        mo14046a(57, a);
    }

    /* renamed from: a */
    public final void mo14064a(zzal zzal, C4215h hVar) {
        Parcel a = mo14045a();
        C4202ab.m20864a(a, (Parcelable) zzal);
        C4202ab.m20863a(a, (IInterface) hVar);
        mo14046a(74, a);
    }

    /* renamed from: a */
    public final void mo14065a(boolean z) {
        Parcel a = mo14045a();
        C4202ab.m20865a(a, z);
        mo14046a(12, a);
    }
}
