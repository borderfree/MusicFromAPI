package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.du */
public final class C3503du implements Creator<zzaey> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m14933b(parcel);
        Bundle bundle = null;
        zzang zzang = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        List list = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            switch (SafeParcelReader.m14927a(a)) {
                case 1:
                    bundle = SafeParcelReader.m14949o(parcel, a);
                    break;
                case 2:
                    zzang = (zzang) SafeParcelReader.m14930a(parcel, a, zzang.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.m14930a(parcel, a, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = SafeParcelReader.m14947m(parcel, a);
                    break;
                case 5:
                    list = SafeParcelReader.m14953s(parcel, a);
                    break;
                case 6:
                    packageInfo = (PackageInfo) SafeParcelReader.m14930a(parcel, a, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = SafeParcelReader.m14947m(parcel, a);
                    break;
                case 8:
                    z = SafeParcelReader.m14937c(parcel, a);
                    break;
                case 9:
                    str3 = SafeParcelReader.m14947m(parcel, a);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel, b);
        zzaey zzaey = new zzaey(bundle, zzang, applicationInfo, str, list, packageInfo, str2, z, str3);
        return zzaey;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaey[i];
    }
}
