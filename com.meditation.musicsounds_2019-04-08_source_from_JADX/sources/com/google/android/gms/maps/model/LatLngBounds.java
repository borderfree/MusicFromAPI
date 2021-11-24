package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3261q;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<LatLngBounds> CREATOR = new C4606e();

    /* renamed from: a */
    public final LatLng f16592a;

    /* renamed from: b */
    public final LatLng f16593b;

    /* renamed from: com.google.android.gms.maps.model.LatLngBounds$a */
    public static final class C4601a {

        /* renamed from: a */
        private double f16594a = Double.POSITIVE_INFINITY;

        /* renamed from: b */
        private double f16595b = Double.NEGATIVE_INFINITY;

        /* renamed from: c */
        private double f16596c = Double.NaN;

        /* renamed from: d */
        private double f16597d = Double.NaN;

        /* renamed from: a */
        public final C4601a mo15153a(LatLng latLng) {
            this.f16594a = Math.min(this.f16594a, latLng.f16590a);
            this.f16595b = Math.max(this.f16595b, latLng.f16590a);
            double d = latLng.f16591b;
            if (Double.isNaN(this.f16596c)) {
                this.f16596c = d;
            } else {
                boolean z = true;
                if (this.f16596c > this.f16597d ? !(this.f16596c <= d || d <= this.f16597d) : !(this.f16596c <= d && d <= this.f16597d)) {
                    z = false;
                }
                if (!z) {
                    if (LatLngBounds.m22842c(this.f16596c, d) < LatLngBounds.m22843d(this.f16597d, d)) {
                        this.f16596c = d;
                    }
                }
                return this;
            }
            this.f16597d = d;
            return this;
        }

        /* renamed from: a */
        public final LatLngBounds mo15154a() {
            C3266s.m14920a(!Double.isNaN(this.f16596c), (Object) "no included points");
            return new LatLngBounds(new LatLng(this.f16594a, this.f16596c), new LatLng(this.f16595b, this.f16597d));
        }
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        C3266s.m14914a(latLng, (Object) "null southwest");
        C3266s.m14914a(latLng2, (Object) "null northeast");
        C3266s.m14925b(latLng2.f16590a >= latLng.f16590a, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(latLng.f16590a), Double.valueOf(latLng2.f16590a));
        this.f16592a = latLng;
        this.f16593b = latLng2;
    }

    /* renamed from: a */
    public static C4601a m22839a() {
        return new C4601a();
    }

    /* renamed from: a */
    private final boolean m22840a(double d) {
        return this.f16592a.f16591b <= this.f16593b.f16591b ? this.f16592a.f16591b <= d && d <= this.f16593b.f16591b : this.f16592a.f16591b <= d || d <= this.f16593b.f16591b;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static double m22842c(double d, double d2) {
        return ((d - d2) + 360.0d) % 360.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static double m22843d(double d, double d2) {
        return ((d2 - d) + 360.0d) % 360.0d;
    }

    /* renamed from: a */
    public final boolean mo15147a(LatLng latLng) {
        double d = latLng.f16590a;
        return ((this.f16592a.f16590a > d ? 1 : (this.f16592a.f16590a == d ? 0 : -1)) <= 0 && (d > this.f16593b.f16590a ? 1 : (d == this.f16593b.f16590a ? 0 : -1)) <= 0) && m22840a(latLng.f16591b);
    }

    /* renamed from: b */
    public final LatLng mo15148b() {
        double d = (this.f16592a.f16590a + this.f16593b.f16590a) / 2.0d;
        double d2 = this.f16593b.f16591b;
        double d3 = this.f16592a.f16591b;
        if (d3 > d2) {
            d2 += 360.0d;
        }
        return new LatLng(d, (d2 + d3) / 2.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f16592a.equals(latLngBounds.f16592a) && this.f16593b.equals(latLngBounds.f16593b);
    }

    public final int hashCode() {
        return C3261q.m14904a(this.f16592a, this.f16593b);
    }

    public final String toString() {
        return C3261q.m14905a((Object) this).mo11288a("southwest", this.f16592a).mo11288a("northeast", this.f16593b).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14964a(parcel, 2, (Parcelable) this.f16592a, i, false);
        C3267a.m14964a(parcel, 3, (Parcelable) this.f16593b, i, false);
        C3267a.m14956a(parcel, a);
    }
}
