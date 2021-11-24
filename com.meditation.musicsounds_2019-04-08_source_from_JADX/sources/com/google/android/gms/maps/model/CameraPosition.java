package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3261q;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<CameraPosition> CREATOR = new C4605d();

    /* renamed from: a */
    public final LatLng f16582a;

    /* renamed from: b */
    public final float f16583b;

    /* renamed from: c */
    public final float f16584c;

    /* renamed from: d */
    public final float f16585d;

    /* renamed from: com.google.android.gms.maps.model.CameraPosition$a */
    public static final class C4600a {

        /* renamed from: a */
        private LatLng f16586a;

        /* renamed from: b */
        private float f16587b;

        /* renamed from: c */
        private float f16588c;

        /* renamed from: d */
        private float f16589d;

        /* renamed from: a */
        public final C4600a mo15138a(float f) {
            this.f16587b = f;
            return this;
        }

        /* renamed from: a */
        public final C4600a mo15139a(LatLng latLng) {
            this.f16586a = latLng;
            return this;
        }

        /* renamed from: a */
        public final CameraPosition mo15140a() {
            return new CameraPosition(this.f16586a, this.f16587b, this.f16588c, this.f16589d);
        }

        /* renamed from: b */
        public final C4600a mo15141b(float f) {
            this.f16588c = f;
            return this;
        }

        /* renamed from: c */
        public final C4600a mo15142c(float f) {
            this.f16589d = f;
            return this;
        }
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        C3266s.m14914a(latLng, (Object) "null camera target");
        C3266s.m14925b(0.0f <= f2 && f2 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.f16582a = latLng;
        this.f16583b = f;
        this.f16584c = f2 + 0.0f;
        if (((double) f3) <= 0.0d) {
            f3 = (f3 % 360.0f) + 360.0f;
        }
        this.f16585d = f3 % 360.0f;
    }

    /* renamed from: a */
    public static C4600a m22832a() {
        return new C4600a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f16582a.equals(cameraPosition.f16582a) && Float.floatToIntBits(this.f16583b) == Float.floatToIntBits(cameraPosition.f16583b) && Float.floatToIntBits(this.f16584c) == Float.floatToIntBits(cameraPosition.f16584c) && Float.floatToIntBits(this.f16585d) == Float.floatToIntBits(cameraPosition.f16585d);
    }

    public final int hashCode() {
        return C3261q.m14904a(this.f16582a, Float.valueOf(this.f16583b), Float.valueOf(this.f16584c), Float.valueOf(this.f16585d));
    }

    public final String toString() {
        return C3261q.m14905a((Object) this).mo11288a("target", this.f16582a).mo11288a("zoom", Float.valueOf(this.f16583b)).mo11288a("tilt", Float.valueOf(this.f16584c)).mo11288a("bearing", Float.valueOf(this.f16585d)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14964a(parcel, 2, (Parcelable) this.f16582a, i, false);
        C3267a.m14959a(parcel, 3, this.f16583b);
        C3267a.m14959a(parcel, 4, this.f16584c);
        C3267a.m14959a(parcel, 5, this.f16585d);
        C3267a.m14956a(parcel, a);
    }
}
