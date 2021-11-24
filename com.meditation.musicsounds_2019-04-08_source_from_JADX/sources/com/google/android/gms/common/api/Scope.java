package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<Scope> CREATOR = new C3169o();

    /* renamed from: a */
    private final int f10568a;

    /* renamed from: b */
    private final String f10569b;

    Scope(int i, String str) {
        C3266s.m14916a(str, (Object) "scopeUri must not be null or empty");
        this.f10568a = i;
        this.f10569b = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    /* renamed from: a */
    public final String mo10786a() {
        return this.f10569b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f10569b.equals(((Scope) obj).f10569b);
    }

    public final int hashCode() {
        return this.f10569b.hashCode();
    }

    public final String toString() {
        return this.f10569b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14960a(parcel, 1, this.f10568a);
        C3267a.m14968a(parcel, 2, mo10786a(), false);
        C3267a.m14956a(parcel, a);
    }
}
