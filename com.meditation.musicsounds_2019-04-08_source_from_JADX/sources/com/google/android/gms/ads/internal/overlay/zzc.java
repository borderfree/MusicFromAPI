package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import com.google.android.gms.internal.ads.C3464ci;

@C3464ci
public final class zzc extends AbstractSafeParcelable {
    public static final Creator<zzc> CREATOR = new zzb();

    /* renamed from: a */
    private final String f10058a;

    /* renamed from: b */
    private final String f10059b;
    public final Intent intent;
    public final String mimeType;
    public final String packageName;
    public final String url;
    public final String zzbxj;
    public final String zzbxk;

    public zzc(Intent intent2) {
        this(null, null, null, null, null, null, null, intent2);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, null);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent2) {
        this.f10058a = str;
        this.url = str2;
        this.mimeType = str3;
        this.packageName = str4;
        this.zzbxj = str5;
        this.zzbxk = str6;
        this.f10059b = str7;
        this.intent = intent2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14968a(parcel, 2, this.f10058a, false);
        C3267a.m14968a(parcel, 3, this.url, false);
        C3267a.m14968a(parcel, 4, this.mimeType, false);
        C3267a.m14968a(parcel, 5, this.packageName, false);
        C3267a.m14968a(parcel, 6, this.zzbxj, false);
        C3267a.m14968a(parcel, 7, this.zzbxk, false);
        C3267a.m14968a(parcel, 8, this.f10059b, false);
        C3267a.m14964a(parcel, 9, (Parcelable) this.intent, i, false);
        C3267a.m14956a(parcel, a);
    }
}
