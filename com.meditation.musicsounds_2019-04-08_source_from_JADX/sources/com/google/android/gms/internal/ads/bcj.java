package com.google.android.gms.internal.ads;

import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdRequest.Gender;
import com.google.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.HashSet;

@C3464ci
public final class bcj {
    /* renamed from: a */
    public static int m18135a(ErrorCode errorCode) {
        switch (bck.f13573a[errorCode.ordinal()]) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static MediationAdRequest m18136a(zzjj zzjj, boolean z) {
        Gender gender;
        HashSet hashSet = zzjj.f15485e != null ? new HashSet(zzjj.f15485e) : null;
        Date date = new Date(zzjj.f15482b);
        switch (zzjj.f15484d) {
            case 1:
                gender = Gender.MALE;
                break;
            case 2:
                gender = Gender.FEMALE;
                break;
            default:
                gender = Gender.UNKNOWN;
                break;
        }
        MediationAdRequest mediationAdRequest = new MediationAdRequest(date, gender, hashSet, z, zzjj.f15491k);
        return mediationAdRequest;
    }
}
