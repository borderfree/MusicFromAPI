package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C3182e;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3252m.C3253a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Creator<GetServiceRequest> CREATOR = new C3210ah();

    /* renamed from: a */
    String f10973a;

    /* renamed from: b */
    IBinder f10974b;

    /* renamed from: c */
    Scope[] f10975c;

    /* renamed from: d */
    Bundle f10976d;

    /* renamed from: e */
    Account f10977e;

    /* renamed from: f */
    Feature[] f10978f;

    /* renamed from: g */
    Feature[] f10979g;

    /* renamed from: h */
    private final int f10980h;

    /* renamed from: i */
    private final int f10981i;

    /* renamed from: j */
    private int f10982j;

    /* renamed from: k */
    private boolean f10983k;

    public GetServiceRequest(int i) {
        this.f10980h = 4;
        this.f10982j = C3182e.f10966b;
        this.f10981i = i;
        this.f10983k = true;
    }

    GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z) {
        this.f10980h = i;
        this.f10981i = i2;
        this.f10982j = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f10973a = "com.google.android.gms";
        } else {
            this.f10973a = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                account2 = C3188a.m14691a(C3253a.m14894a(iBinder));
            }
            this.f10977e = account2;
        } else {
            this.f10974b = iBinder;
            this.f10977e = account;
        }
        this.f10975c = scopeArr;
        this.f10976d = bundle;
        this.f10978f = featureArr;
        this.f10979g = featureArr2;
        this.f10983k = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14960a(parcel, 1, this.f10980h);
        C3267a.m14960a(parcel, 2, this.f10981i);
        C3267a.m14960a(parcel, 3, this.f10982j);
        C3267a.m14968a(parcel, 4, this.f10973a, false);
        C3267a.m14963a(parcel, 5, this.f10974b, false);
        C3267a.m14973a(parcel, 6, (T[]) this.f10975c, i, false);
        C3267a.m14962a(parcel, 7, this.f10976d, false);
        C3267a.m14964a(parcel, 8, (Parcelable) this.f10977e, i, false);
        C3267a.m14973a(parcel, 10, (T[]) this.f10978f, i, false);
        C3267a.m14973a(parcel, 11, (T[]) this.f10979g, i, false);
        C3267a.m14971a(parcel, 12, this.f10983k);
        C3267a.m14956a(parcel, a);
    }
}
