package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import java.util.Collections;
import java.util.List;

public final class zzal extends AbstractSafeParcelable {
    public static final Creator<zzal> CREATOR = new C4531p();

    /* renamed from: a */
    private final List<String> f16535a;

    /* renamed from: b */
    private final PendingIntent f16536b;

    /* renamed from: c */
    private final String f16537c;

    zzal(List<String> list, PendingIntent pendingIntent, String str) {
        this.f16535a = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f16536b = pendingIntent;
        this.f16537c = str;
    }

    /* renamed from: a */
    public static zzal m22628a(PendingIntent pendingIntent) {
        C3266s.m14914a(pendingIntent, (Object) "PendingIntent can not be null.");
        return new zzal(null, pendingIntent, "");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14978b(parcel, 1, this.f16535a, false);
        C3267a.m14964a(parcel, 2, (Parcelable) this.f16536b, i, false);
        C3267a.m14968a(parcel, 3, this.f16537c, false);
        C3267a.m14956a(parcel, a);
    }
}
