package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

@C3464ci
public final class zzmq extends AbstractSafeParcelable {
    public static final Creator<zzmq> CREATOR = new apu();

    /* renamed from: a */
    public final String f15510a;

    public zzmq(SearchAdRequest searchAdRequest) {
        this.f15510a = searchAdRequest.getQuery();
    }

    zzmq(String str) {
        this.f15510a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14968a(parcel, 15, this.f15510a, false);
        C3267a.m14956a(parcel, a);
    }
}
