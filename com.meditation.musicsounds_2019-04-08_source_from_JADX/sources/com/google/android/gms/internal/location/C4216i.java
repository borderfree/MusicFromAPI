package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.location.i */
public abstract class C4216i extends C4227t implements C4215h {
    public C4216i() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo14060a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo14058a(parcel.readInt(), parcel.createStringArray());
                break;
            case 2:
                mo14059b(parcel.readInt(), parcel.createStringArray());
                break;
            case 3:
                mo14057a(parcel.readInt(), (PendingIntent) C4202ab.m20862a(parcel, PendingIntent.CREATOR));
                break;
            default:
                return false;
        }
        return true;
    }
}
