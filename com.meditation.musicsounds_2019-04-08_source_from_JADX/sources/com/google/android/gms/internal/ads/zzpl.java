package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

@C3464ci
public final class zzpl extends AbstractSafeParcelable {
    public static final Creator<zzpl> CREATOR = new aso();

    /* renamed from: a */
    public final int f15514a;

    /* renamed from: b */
    public final boolean f15515b;

    /* renamed from: c */
    public final int f15516c;

    /* renamed from: d */
    public final boolean f15517d;

    /* renamed from: e */
    public final int f15518e;

    /* renamed from: f */
    public final zzmu f15519f;

    public zzpl(int i, boolean z, int i2, boolean z2, int i3, zzmu zzmu) {
        this.f15514a = i;
        this.f15515b = z;
        this.f15516c = i2;
        this.f15517d = z2;
        this.f15518e = i3;
        this.f15519f = zzmu;
    }

    public zzpl(NativeAdOptions nativeAdOptions) {
        boolean shouldReturnUrlsForImageAssets = nativeAdOptions.shouldReturnUrlsForImageAssets();
        int imageOrientation = nativeAdOptions.getImageOrientation();
        boolean shouldRequestMultipleImages = nativeAdOptions.shouldRequestMultipleImages();
        int adChoicesPlacement = nativeAdOptions.getAdChoicesPlacement();
        zzmu zzmu = nativeAdOptions.getVideoOptions() != null ? new zzmu(nativeAdOptions.getVideoOptions()) : null;
        this(3, shouldReturnUrlsForImageAssets, imageOrientation, shouldRequestMultipleImages, adChoicesPlacement, zzmu);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14960a(parcel, 1, this.f15514a);
        C3267a.m14971a(parcel, 2, this.f15515b);
        C3267a.m14960a(parcel, 3, this.f15516c);
        C3267a.m14971a(parcel, 4, this.f15517d);
        C3267a.m14960a(parcel, 5, this.f15518e);
        C3267a.m14964a(parcel, 6, (Parcelable) this.f15519f, i, false);
        C3267a.m14956a(parcel, a);
    }
}
