package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.bh */
public final class C4269bh extends C4316da implements C4268bg {
    C4269bh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.analytics.internal.IAnalyticsService");
    }

    /* renamed from: a */
    public final void mo14176a(Map map, long j, String str, List<zzbr> list) {
        Parcel a = mo14267a();
        a.writeMap(map);
        a.writeLong(j);
        a.writeString(str);
        a.writeTypedList(list);
        mo14270b(1, a);
    }
}
