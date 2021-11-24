package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3261q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

public final class VisibleRegion extends AbstractSafeParcelable {
    public static final Creator<VisibleRegion> CREATOR = new C4609h();

    /* renamed from: a */
    public final LatLng f16612a;

    /* renamed from: b */
    public final LatLng f16613b;

    /* renamed from: c */
    public final LatLng f16614c;

    /* renamed from: d */
    public final LatLng f16615d;

    /* renamed from: e */
    public final LatLngBounds f16616e;

    public VisibleRegion(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f16612a = latLng;
        this.f16613b = latLng2;
        this.f16614c = latLng3;
        this.f16615d = latLng4;
        this.f16616e = latLngBounds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        return this.f16612a.equals(visibleRegion.f16612a) && this.f16613b.equals(visibleRegion.f16613b) && this.f16614c.equals(visibleRegion.f16614c) && this.f16615d.equals(visibleRegion.f16615d) && this.f16616e.equals(visibleRegion.f16616e);
    }

    public final int hashCode() {
        return C3261q.m14904a(this.f16612a, this.f16613b, this.f16614c, this.f16615d, this.f16616e);
    }

    public final String toString() {
        return C3261q.m14905a((Object) this).mo11288a("nearLeft", this.f16612a).mo11288a("nearRight", this.f16613b).mo11288a("farLeft", this.f16614c).mo11288a("farRight", this.f16615d).mo11288a("latLngBounds", this.f16616e).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14964a(parcel, 2, (Parcelable) this.f16612a, i, false);
        C3267a.m14964a(parcel, 3, (Parcelable) this.f16613b, i, false);
        C3267a.m14964a(parcel, 4, (Parcelable) this.f16614c, i, false);
        C3267a.m14964a(parcel, 5, (Parcelable) this.f16615d, i, false);
        C3267a.m14964a(parcel, 6, (Parcelable) this.f16616e, i, false);
        C3267a.m14956a(parcel, a);
    }
}
