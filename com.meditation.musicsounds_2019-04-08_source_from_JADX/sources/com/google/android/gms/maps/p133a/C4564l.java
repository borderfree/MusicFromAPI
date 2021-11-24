package com.google.android.gms.maps.p133a;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p132g.C4190a;
import com.google.android.gms.internal.p132g.C4192c;

/* renamed from: com.google.android.gms.maps.a.l */
public final class C4564l extends C4190a implements C4563k {
    C4564l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IOnLocationChangeListener");
    }

    /* renamed from: a */
    public final void mo15090a(Location location) {
        Parcel s_ = mo14032s_();
        C4192c.m20836a(s_, (Parcelable) location);
        mo14031b(2, s_);
    }
}
