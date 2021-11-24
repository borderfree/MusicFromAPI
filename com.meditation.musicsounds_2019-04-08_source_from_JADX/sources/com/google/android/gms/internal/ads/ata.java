package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3323b.C3324a;

public final class ata extends ahm implements asy {
    ata(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* renamed from: a */
    public final C3323b mo12354a() {
        Parcel a = mo11917a(1, mo11920q_());
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final Uri mo12355b() {
        Parcel a = mo11917a(2, mo11920q_());
        Uri uri = (Uri) aho.m16238a(a, Uri.CREATOR);
        a.recycle();
        return uri;
    }

    /* renamed from: c */
    public final double mo12356c() {
        Parcel a = mo11917a(3, mo11920q_());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }
}
