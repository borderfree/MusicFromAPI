package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.C3142h;
import com.google.android.gms.location.C4521g;
import com.google.android.gms.location.C4541z;

/* renamed from: com.google.android.gms.internal.location.q */
final class C4224q extends C4541z {

    /* renamed from: a */
    private final C3142h<C4521g> f15652a;

    /* renamed from: a */
    public final synchronized void mo14071a(Location location) {
        this.f15652a.mo11061a(new C4225r(this, location));
    }
}
