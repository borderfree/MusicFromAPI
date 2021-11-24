package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class zzaey extends AbstractSafeParcelable {
    public static final Creator<zzaey> CREATOR = new C3503du();

    /* renamed from: a */
    private final Bundle f15338a;

    /* renamed from: b */
    private final zzang f15339b;

    /* renamed from: c */
    private final ApplicationInfo f15340c;

    /* renamed from: d */
    private final String f15341d;

    /* renamed from: e */
    private final List<String> f15342e;
    @Nullable

    /* renamed from: f */
    private final PackageInfo f15343f;

    /* renamed from: g */
    private final String f15344g;

    /* renamed from: h */
    private final boolean f15345h;

    /* renamed from: i */
    private final String f15346i;

    public zzaey(Bundle bundle, zzang zzang, ApplicationInfo applicationInfo, String str, List<String> list, @Nullable PackageInfo packageInfo, String str2, boolean z, String str3) {
        this.f15338a = bundle;
        this.f15339b = zzang;
        this.f15341d = str;
        this.f15340c = applicationInfo;
        this.f15342e = list;
        this.f15343f = packageInfo;
        this.f15344g = str2;
        this.f15345h = z;
        this.f15346i = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14962a(parcel, 1, this.f15338a, false);
        C3267a.m14964a(parcel, 2, (Parcelable) this.f15339b, i, false);
        C3267a.m14964a(parcel, 3, (Parcelable) this.f15340c, i, false);
        C3267a.m14968a(parcel, 4, this.f15341d, false);
        C3267a.m14978b(parcel, 5, this.f15342e, false);
        C3267a.m14964a(parcel, 6, (Parcelable) this.f15343f, i, false);
        C3267a.m14968a(parcel, 7, this.f15344g, false);
        C3267a.m14971a(parcel, 8, this.f15345h);
        C3267a.m14968a(parcel, 9, this.f15346i, false);
        C3267a.m14956a(parcel, a);
    }
}
