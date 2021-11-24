package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class aut extends ahm implements aur {
    aut(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    /* renamed from: a */
    public final void mo12517a() {
        mo11919b(2, mo11920q_());
    }

    /* renamed from: a */
    public final void mo12518a(String str) {
        Parcel q_ = mo11920q_();
        q_.writeString(str);
        mo11919b(1, q_);
    }
}
