package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import com.google.android.gms.dynamic.C3323b.C3324a;

public final class MarkerOptions extends AbstractSafeParcelable {
    public static final Creator<MarkerOptions> CREATOR = new C4608g();

    /* renamed from: a */
    private LatLng f16598a;

    /* renamed from: b */
    private String f16599b;

    /* renamed from: c */
    private String f16600c;

    /* renamed from: d */
    private C4602a f16601d;

    /* renamed from: e */
    private float f16602e = 0.5f;

    /* renamed from: f */
    private float f16603f = 1.0f;

    /* renamed from: g */
    private boolean f16604g;

    /* renamed from: h */
    private boolean f16605h = true;

    /* renamed from: i */
    private boolean f16606i = false;

    /* renamed from: j */
    private float f16607j = 0.0f;

    /* renamed from: k */
    private float f16608k = 0.5f;

    /* renamed from: l */
    private float f16609l = 0.0f;

    /* renamed from: m */
    private float f16610m = 1.0f;

    /* renamed from: n */
    private float f16611n;

    public MarkerOptions() {
    }

    MarkerOptions(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7) {
        this.f16598a = latLng;
        this.f16599b = str;
        this.f16600c = str2;
        if (iBinder == null) {
            this.f16601d = null;
        } else {
            this.f16601d = new C4602a(C3324a.m15129a(iBinder));
        }
        this.f16602e = f;
        this.f16603f = f2;
        this.f16604g = z;
        this.f16605h = z2;
        this.f16606i = z3;
        this.f16607j = f3;
        this.f16608k = f4;
        this.f16609l = f5;
        this.f16610m = f6;
        this.f16611n = f7;
    }

    /* renamed from: a */
    public final LatLng mo15155a() {
        return this.f16598a;
    }

    /* renamed from: a */
    public final MarkerOptions mo15156a(LatLng latLng) {
        if (latLng != null) {
            this.f16598a = latLng;
            return this;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    /* renamed from: a */
    public final MarkerOptions mo15157a(String str) {
        this.f16599b = str;
        return this;
    }

    /* renamed from: b */
    public final MarkerOptions mo15158b(String str) {
        this.f16600c = str;
        return this;
    }

    /* renamed from: b */
    public final String mo15159b() {
        return this.f16599b;
    }

    /* renamed from: c */
    public final String mo15160c() {
        return this.f16600c;
    }

    /* renamed from: d */
    public final float mo15161d() {
        return this.f16602e;
    }

    /* renamed from: e */
    public final float mo15162e() {
        return this.f16603f;
    }

    /* renamed from: f */
    public final boolean mo15163f() {
        return this.f16604g;
    }

    /* renamed from: g */
    public final boolean mo15164g() {
        return this.f16605h;
    }

    /* renamed from: h */
    public final boolean mo15165h() {
        return this.f16606i;
    }

    /* renamed from: i */
    public final float mo15166i() {
        return this.f16607j;
    }

    /* renamed from: j */
    public final float mo15167j() {
        return this.f16608k;
    }

    /* renamed from: k */
    public final float mo15168k() {
        return this.f16609l;
    }

    /* renamed from: l */
    public final float mo15169l() {
        return this.f16610m;
    }

    /* renamed from: m */
    public final float mo15170m() {
        return this.f16611n;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14964a(parcel, 2, (Parcelable) mo15155a(), i, false);
        C3267a.m14968a(parcel, 3, mo15159b(), false);
        C3267a.m14968a(parcel, 4, mo15160c(), false);
        C3267a.m14963a(parcel, 5, this.f16601d == null ? null : this.f16601d.mo15176a().asBinder(), false);
        C3267a.m14959a(parcel, 6, mo15161d());
        C3267a.m14959a(parcel, 7, mo15162e());
        C3267a.m14971a(parcel, 8, mo15163f());
        C3267a.m14971a(parcel, 9, mo15164g());
        C3267a.m14971a(parcel, 10, mo15165h());
        C3267a.m14959a(parcel, 11, mo15166i());
        C3267a.m14959a(parcel, 12, mo15167j());
        C3267a.m14959a(parcel, 13, mo15168k());
        C3267a.m14959a(parcel, 14, mo15169l());
        C3267a.m14959a(parcel, 15, mo15170m());
        C3267a.m14956a(parcel, a);
    }
}
