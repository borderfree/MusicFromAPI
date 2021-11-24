package com.google.android.gms.maps.p133a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3323b.C3324a;
import com.google.android.gms.internal.p132g.C4190a;
import com.google.android.gms.internal.p132g.C4192c;

/* renamed from: com.google.android.gms.maps.a.ae */
public final class C4550ae extends C4190a implements C4556d {
    C4550ae(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    /* renamed from: a */
    public final void mo15075a() {
        mo14031b(3, mo14032s_());
    }

    /* renamed from: a */
    public final void mo15076a(Bundle bundle) {
        Parcel s_ = mo14032s_();
        C4192c.m20836a(s_, (Parcelable) bundle);
        mo14031b(2, s_);
    }

    /* renamed from: a */
    public final void mo15077a(C4565m mVar) {
        Parcel s_ = mo14032s_();
        C4192c.m20835a(s_, (IInterface) mVar);
        mo14031b(9, s_);
    }

    /* renamed from: b */
    public final void mo15078b() {
        mo14031b(4, mo14032s_());
    }

    /* renamed from: b */
    public final void mo15079b(Bundle bundle) {
        Parcel s_ = mo14032s_();
        C4192c.m20836a(s_, (Parcelable) bundle);
        Parcel a = mo14029a(7, s_);
        if (a.readInt() != 0) {
            bundle.readFromParcel(a);
        }
        a.recycle();
    }

    /* renamed from: c */
    public final void mo15080c() {
        mo14031b(5, mo14032s_());
    }

    /* renamed from: d */
    public final void mo15081d() {
        mo14031b(6, mo14032s_());
    }

    /* renamed from: e */
    public final C3323b mo15082e() {
        Parcel a = mo14029a(8, mo14032s_());
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
