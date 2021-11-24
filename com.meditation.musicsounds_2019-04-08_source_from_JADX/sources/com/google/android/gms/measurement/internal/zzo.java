package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

public final class zzo extends AbstractSafeParcelable {
    public static final Creator<zzo> CREATOR = new C4743er();

    /* renamed from: a */
    public String f17282a;

    /* renamed from: b */
    public String f17283b;

    /* renamed from: c */
    public zzfv f17284c;

    /* renamed from: d */
    public long f17285d;

    /* renamed from: e */
    public boolean f17286e;

    /* renamed from: f */
    public String f17287f;

    /* renamed from: g */
    public zzag f17288g;

    /* renamed from: h */
    public long f17289h;

    /* renamed from: i */
    public zzag f17290i;

    /* renamed from: j */
    public long f17291j;

    /* renamed from: k */
    public zzag f17292k;

    zzo(zzo zzo) {
        C3266s.m14913a(zzo);
        this.f17282a = zzo.f17282a;
        this.f17283b = zzo.f17283b;
        this.f17284c = zzo.f17284c;
        this.f17285d = zzo.f17285d;
        this.f17286e = zzo.f17286e;
        this.f17287f = zzo.f17287f;
        this.f17288g = zzo.f17288g;
        this.f17289h = zzo.f17289h;
        this.f17290i = zzo.f17290i;
        this.f17291j = zzo.f17291j;
        this.f17292k = zzo.f17292k;
    }

    zzo(String str, String str2, zzfv zzfv, long j, boolean z, String str3, zzag zzag, long j2, zzag zzag2, long j3, zzag zzag3) {
        this.f17282a = str;
        this.f17283b = str2;
        this.f17284c = zzfv;
        this.f17285d = j;
        this.f17286e = z;
        this.f17287f = str3;
        this.f17288g = zzag;
        this.f17289h = j2;
        this.f17290i = zzag2;
        this.f17291j = j3;
        this.f17292k = zzag3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14968a(parcel, 2, this.f17282a, false);
        C3267a.m14968a(parcel, 3, this.f17283b, false);
        C3267a.m14964a(parcel, 4, (Parcelable) this.f17284c, i, false);
        C3267a.m14961a(parcel, 5, this.f17285d);
        C3267a.m14971a(parcel, 6, this.f17286e);
        C3267a.m14968a(parcel, 7, this.f17287f, false);
        C3267a.m14964a(parcel, 8, (Parcelable) this.f17288g, i, false);
        C3267a.m14961a(parcel, 9, this.f17289h);
        C3267a.m14964a(parcel, 10, (Parcelable) this.f17290i, i, false);
        C3267a.m14961a(parcel, 11, this.f17291j);
        C3267a.m14964a(parcel, 12, (Parcelable) this.f17292k, i, false);
        C3267a.m14956a(parcel, a);
    }
}
