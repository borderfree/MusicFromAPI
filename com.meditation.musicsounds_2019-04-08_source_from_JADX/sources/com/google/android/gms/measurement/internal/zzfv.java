package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

public final class zzfv extends AbstractSafeParcelable {
    public static final Creator<zzfv> CREATOR = new C4734ei();

    /* renamed from: a */
    public final String f17256a;

    /* renamed from: b */
    public final long f17257b;

    /* renamed from: c */
    public final Long f17258c;

    /* renamed from: d */
    public final String f17259d;

    /* renamed from: e */
    public final String f17260e;

    /* renamed from: f */
    public final Double f17261f;

    /* renamed from: g */
    private final int f17262g;

    /* renamed from: h */
    private final Float f17263h;

    zzfv(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f17262g = i;
        this.f17256a = str;
        this.f17257b = j;
        this.f17258c = l;
        Double d2 = null;
        this.f17263h = null;
        if (i == 1) {
            if (f != null) {
                d2 = Double.valueOf(f.doubleValue());
            }
            this.f17261f = d2;
        } else {
            this.f17261f = d;
        }
        this.f17259d = str2;
        this.f17260e = str3;
    }

    zzfv(C4735ej ejVar) {
        this(ejVar.f17047c, ejVar.f17048d, ejVar.f17049e, ejVar.f17046b);
    }

    zzfv(String str, long j, Object obj, String str2) {
        C3266s.m14915a(str);
        this.f17262g = 2;
        this.f17256a = str;
        this.f17257b = j;
        this.f17260e = str2;
        if (obj == null) {
            this.f17258c = null;
            this.f17263h = null;
            this.f17261f = null;
            this.f17259d = null;
        } else if (obj instanceof Long) {
            this.f17258c = (Long) obj;
            this.f17263h = null;
            this.f17261f = null;
            this.f17259d = null;
        } else if (obj instanceof String) {
            this.f17258c = null;
            this.f17263h = null;
            this.f17261f = null;
            this.f17259d = (String) obj;
        } else if (obj instanceof Double) {
            this.f17258c = null;
            this.f17263h = null;
            this.f17261f = (Double) obj;
            this.f17259d = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    /* renamed from: a */
    public final Object mo15877a() {
        if (this.f17258c != null) {
            return this.f17258c;
        }
        if (this.f17261f != null) {
            return this.f17261f;
        }
        if (this.f17259d != null) {
            return this.f17259d;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14960a(parcel, 1, this.f17262g);
        C3267a.m14968a(parcel, 2, this.f17256a, false);
        C3267a.m14961a(parcel, 3, this.f17257b);
        C3267a.m14967a(parcel, 4, this.f17258c, false);
        C3267a.m14966a(parcel, 5, (Float) null, false);
        C3267a.m14968a(parcel, 6, this.f17259d, false);
        C3267a.m14968a(parcel, 7, this.f17260e, false);
        C3267a.m14965a(parcel, 8, this.f17261f, false);
        C3267a.m14956a(parcel, a);
    }
}
