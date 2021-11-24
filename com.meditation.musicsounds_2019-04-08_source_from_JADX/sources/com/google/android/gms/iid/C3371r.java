package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import com.google.android.gms.internal.p131f.C4181a;
import com.google.android.gms.internal.p131f.C4182b;

/* renamed from: com.google.android.gms.iid.r */
public final class C3371r extends C4181a implements C3370q {
    C3371r(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.iid.IMessengerCompat");
    }

    /* renamed from: a */
    public final void mo11399a(Message message) {
        Parcel a = mo14022a();
        C4182b.m20822a(a, message);
        mo14023a(1, a);
    }
}
