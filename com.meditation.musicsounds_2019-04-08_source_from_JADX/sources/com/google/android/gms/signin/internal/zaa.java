package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.C3049h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

public final class zaa extends AbstractSafeParcelable implements C3049h {
    public static final Creator<zaa> CREATOR = new C4783b();

    /* renamed from: a */
    private final int f17314a;

    /* renamed from: b */
    private int f17315b;

    /* renamed from: c */
    private Intent f17316c;

    public zaa() {
        this(0, null);
    }

    zaa(int i, int i2, Intent intent) {
        this.f17314a = i;
        this.f17315b = i2;
        this.f17316c = intent;
    }

    private zaa(int i, Intent intent) {
        this(2, 0, null);
    }

    /* renamed from: a */
    public final Status mo10791a() {
        return this.f17315b == 0 ? Status.f10570a : Status.f10574e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14960a(parcel, 1, this.f17314a);
        C3267a.m14960a(parcel, 2, this.f17315b);
        C3267a.m14964a(parcel, 3, (Parcelable) this.f17316c, i, false);
        C3267a.m14956a(parcel, a);
    }
}
