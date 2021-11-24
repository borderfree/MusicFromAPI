package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C3142h;
import com.google.android.gms.location.C4520f;
import com.google.android.gms.location.C4538w;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* renamed from: com.google.android.gms.internal.location.m */
final class C4220m extends C4538w {

    /* renamed from: a */
    private final C3142h<C4520f> f15649a;

    /* renamed from: a */
    public final void mo14069a(LocationAvailability locationAvailability) {
        this.f15649a.mo11061a(new C4222o(this, locationAvailability));
    }

    /* renamed from: a */
    public final void mo14070a(LocationResult locationResult) {
        this.f15649a.mo11061a(new C4221n(this, locationResult));
    }
}
