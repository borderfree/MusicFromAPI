package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.dg */
public final class C3489dg implements Creator<zzaef> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m14933b(parcel);
        long j = 0;
        long j2 = 0;
        Bundle bundle = null;
        zzjj zzjj = null;
        zzjn zzjn = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        zzang zzang = null;
        Bundle bundle2 = null;
        List list = null;
        Bundle bundle3 = null;
        String str5 = null;
        String str6 = null;
        List list2 = null;
        String str7 = null;
        zzpl zzpl = null;
        List list3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        zzlu zzlu = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        List list4 = null;
        String str15 = null;
        List list5 = null;
        ArrayList arrayList = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i7 = 0;
        boolean z6 = false;
        boolean z7 = false;
        int i8 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m14928a(parcel);
            switch (SafeParcelReader.m14927a(a)) {
                case 1:
                    i = SafeParcelReader.m14940f(parcel2, a);
                    break;
                case 2:
                    bundle = SafeParcelReader.m14949o(parcel2, a);
                    break;
                case 3:
                    zzjj = (zzjj) SafeParcelReader.m14930a(parcel2, a, zzjj.CREATOR);
                    break;
                case 4:
                    zzjn = (zzjn) SafeParcelReader.m14930a(parcel2, a, zzjn.CREATOR);
                    break;
                case 5:
                    str = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.m14930a(parcel2, a, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) SafeParcelReader.m14930a(parcel2, a, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 9:
                    str3 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 10:
                    str4 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 11:
                    zzang = (zzang) SafeParcelReader.m14930a(parcel2, a, zzang.CREATOR);
                    break;
                case 12:
                    bundle2 = SafeParcelReader.m14949o(parcel2, a);
                    break;
                case 13:
                    i2 = SafeParcelReader.m14940f(parcel2, a);
                    break;
                case 14:
                    list = SafeParcelReader.m14953s(parcel2, a);
                    break;
                case 15:
                    bundle3 = SafeParcelReader.m14949o(parcel2, a);
                    break;
                case 16:
                    z = SafeParcelReader.m14937c(parcel2, a);
                    break;
                case 18:
                    i3 = SafeParcelReader.m14940f(parcel2, a);
                    break;
                case 19:
                    i4 = SafeParcelReader.m14940f(parcel2, a);
                    break;
                case 20:
                    f = SafeParcelReader.m14943i(parcel2, a);
                    break;
                case 21:
                    str5 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 25:
                    j = SafeParcelReader.m14941g(parcel2, a);
                    break;
                case 26:
                    str6 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 27:
                    list2 = SafeParcelReader.m14953s(parcel2, a);
                    break;
                case 28:
                    str7 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 29:
                    zzpl = (zzpl) SafeParcelReader.m14930a(parcel2, a, zzpl.CREATOR);
                    break;
                case 30:
                    list3 = SafeParcelReader.m14953s(parcel2, a);
                    break;
                case 31:
                    j2 = SafeParcelReader.m14941g(parcel2, a);
                    break;
                case 33:
                    str8 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 34:
                    f2 = SafeParcelReader.m14943i(parcel2, a);
                    break;
                case 35:
                    i5 = SafeParcelReader.m14940f(parcel2, a);
                    break;
                case 36:
                    i6 = SafeParcelReader.m14940f(parcel2, a);
                    break;
                case 37:
                    z3 = SafeParcelReader.m14937c(parcel2, a);
                    break;
                case 38:
                    z4 = SafeParcelReader.m14937c(parcel2, a);
                    break;
                case 39:
                    str9 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 40:
                    z2 = SafeParcelReader.m14937c(parcel2, a);
                    break;
                case 41:
                    str10 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 42:
                    z5 = SafeParcelReader.m14937c(parcel2, a);
                    break;
                case 43:
                    i7 = SafeParcelReader.m14940f(parcel2, a);
                    break;
                case 44:
                    bundle4 = SafeParcelReader.m14949o(parcel2, a);
                    break;
                case 45:
                    str11 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 46:
                    zzlu = (zzlu) SafeParcelReader.m14930a(parcel2, a, zzlu.CREATOR);
                    break;
                case 47:
                    z6 = SafeParcelReader.m14937c(parcel2, a);
                    break;
                case 48:
                    bundle5 = SafeParcelReader.m14949o(parcel2, a);
                    break;
                case 49:
                    str12 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 50:
                    str13 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 51:
                    str14 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 52:
                    z7 = SafeParcelReader.m14937c(parcel2, a);
                    break;
                case 53:
                    list4 = SafeParcelReader.m14952r(parcel2, a);
                    break;
                case 54:
                    str15 = SafeParcelReader.m14947m(parcel2, a);
                    break;
                case 55:
                    list5 = SafeParcelReader.m14953s(parcel2, a);
                    break;
                case 56:
                    i8 = SafeParcelReader.m14940f(parcel2, a);
                    break;
                case 57:
                    z8 = SafeParcelReader.m14937c(parcel2, a);
                    break;
                case 58:
                    z9 = SafeParcelReader.m14937c(parcel2, a);
                    break;
                case 59:
                    z10 = SafeParcelReader.m14937c(parcel2, a);
                    break;
                case 60:
                    arrayList = SafeParcelReader.m14953s(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m14934b(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m14954t(parcel2, b);
        zzaef zzaef = new zzaef(i, bundle, zzjj, zzjn, str, applicationInfo, packageInfo, str2, str3, str4, zzang, bundle2, i2, list, bundle3, z, i3, i4, f, str5, j, str6, list2, str7, zzpl, list3, j2, str8, f2, z2, i5, i6, z3, z4, str9, str10, z5, i7, bundle4, str11, zzlu, z6, bundle5, str12, str13, str14, z7, list4, str15, list5, i8, z8, z9, z10, arrayList);
        return zzaef;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaef[i];
    }
}
