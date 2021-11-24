package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

@C3464ci
public final class zzmu extends AbstractSafeParcelable {
    public static final Creator<zzmu> CREATOR = new apw();

    /* renamed from: a */
    public final boolean f15511a;

    /* renamed from: b */
    public final boolean f15512b;

    /* renamed from: c */
    public final boolean f15513c;

    public zzmu(VideoOptions videoOptions) {
        this(videoOptions.getStartMuted(), videoOptions.getCustomControlsRequested(), videoOptions.getClickToExpandRequested());
    }

    public zzmu(boolean z, boolean z2, boolean z3) {
        this.f15511a = z;
        this.f15512b = z2;
        this.f15513c = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14971a(parcel, 2, this.f15511a);
        C3267a.m14971a(parcel, 3, this.f15512b);
        C3267a.m14971a(parcel, 4, this.f15513c);
        C3267a.m14956a(parcel, a);
    }
}
