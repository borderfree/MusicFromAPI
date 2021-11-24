package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import java.util.Map;
import java.util.Map.Entry;

@C3464ci
public final class zzsg extends AbstractSafeParcelable {
    public static final Creator<zzsg> CREATOR = new avk();

    /* renamed from: a */
    private final String f15520a;

    /* renamed from: b */
    private final String[] f15521b;

    /* renamed from: c */
    private final String[] f15522c;

    zzsg(String str, String[] strArr, String[] strArr2) {
        this.f15520a = str;
        this.f15521b = strArr;
        this.f15522c = strArr2;
    }

    /* renamed from: a */
    public static zzsg m20764a(auc auc) {
        Map b = auc.mo12497b();
        int size = b.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Entry entry : b.entrySet()) {
            strArr[i] = (String) entry.getKey();
            strArr2[i] = (String) entry.getValue();
            i++;
        }
        return new zzsg(auc.mo12503e(), strArr, strArr2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14968a(parcel, 1, this.f15520a, false);
        C3267a.m14974a(parcel, 2, this.f15521b, false);
        C3267a.m14974a(parcel, 3, this.f15522c, false);
        C3267a.m14956a(parcel, a);
    }
}
