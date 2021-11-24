package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3261q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

public class Feature extends AbstractSafeParcelable {
    public static final Creator<Feature> CREATOR = new C3276k();

    /* renamed from: a */
    private final String f10558a;
    @Deprecated

    /* renamed from: b */
    private final int f10559b;

    /* renamed from: c */
    private final long f10560c;

    public Feature(String str, int i, long j) {
        this.f10558a = str;
        this.f10559b = i;
        this.f10560c = j;
    }

    /* renamed from: a */
    public String mo10767a() {
        return this.f10558a;
    }

    /* renamed from: b */
    public long mo10768b() {
        return this.f10560c == -1 ? (long) this.f10559b : this.f10560c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((mo10767a() != null && mo10767a().equals(feature.mo10767a())) || (mo10767a() == null && feature.mo10767a() == null)) && mo10768b() == feature.mo10768b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C3261q.m14904a(mo10767a(), Long.valueOf(mo10768b()));
    }

    public String toString() {
        return C3261q.m14905a((Object) this).mo11288a("name", mo10767a()).mo11288a("version", Long.valueOf(mo10768b())).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14968a(parcel, 1, mo10767a(), false);
        C3267a.m14960a(parcel, 2, this.f10559b);
        C3267a.m14961a(parcel, 3, mo10768b());
        C3267a.m14956a(parcel, a);
    }
}
