package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.C3040d.C3042b;
import com.google.android.gms.common.api.C3040d.C3043c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3108c.C3110b;
import com.google.android.gms.common.internal.C3240e;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.zzal;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.location.s */
public final class C4226s extends C4204ad {

    /* renamed from: f */
    private final C4219l f15654f;

    public C4226s(Context context, Looper looper, C3042b bVar, C3043c cVar, String str, @Nullable C3240e eVar) {
        super(context, looper, bVar, cVar, str, eVar);
        this.f15654f = new C4219l(context, this.f15636e);
    }

    /* renamed from: a */
    public final void mo14072a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, C3110b<Status> bVar) {
        mo11226v();
        C3266s.m14914a(geofencingRequest, (Object) "geofencingRequest can't be null.");
        C3266s.m14914a(pendingIntent, (Object) "PendingIntent must be specified.");
        C3266s.m14914a(bVar, (Object) "ResultHolder not provided.");
        ((C4217j) mo11227w()).mo14063a(geofencingRequest, pendingIntent, new C4228u(bVar));
    }

    /* renamed from: a */
    public final void mo14073a(zzal zzal, C3110b<Status> bVar) {
        mo11226v();
        C3266s.m14914a(zzal, (Object) "removeGeofencingRequest can't be null.");
        C3266s.m14914a(bVar, (Object) "ResultHolder not provided.");
        ((C4217j) mo11227w()).mo14064a(zzal, new C4229v(bVar));
    }

    /* renamed from: g */
    public final void mo11211g() {
        synchronized (this.f15654f) {
            if (mo11212h()) {
                try {
                    this.f15654f.mo14066a();
                    this.f15654f.mo14068b();
                } catch (Exception e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.mo11211g();
        }
    }
}
