package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.C3323b;

/* renamed from: com.google.android.gms.internal.ads.s */
public final class C3888s extends ahm implements C3834q {
    C3888s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Parcel q_ = mo11920q_();
        q_.writeInt(i);
        q_.writeInt(i2);
        aho.m16240a(q_, (Parcelable) intent);
        mo11919b(12, q_);
    }

    public final void onBackPressed() {
        mo11919b(10, mo11920q_());
    }

    public final void onCreate(Bundle bundle) {
        Parcel q_ = mo11920q_();
        aho.m16240a(q_, (Parcelable) bundle);
        mo11919b(1, q_);
    }

    public final void onDestroy() {
        mo11919b(8, mo11920q_());
    }

    public final void onPause() {
        mo11919b(5, mo11920q_());
    }

    public final void onRestart() {
        mo11919b(2, mo11920q_());
    }

    public final void onResume() {
        mo11919b(4, mo11920q_());
    }

    public final void onSaveInstanceState(Bundle bundle) {
        Parcel q_ = mo11920q_();
        aho.m16240a(q_, (Parcelable) bundle);
        Parcel a = mo11917a(6, q_);
        if (a.readInt() != 0) {
            bundle.readFromParcel(a);
        }
        a.recycle();
    }

    public final void onStart() {
        mo11919b(3, mo11920q_());
    }

    public final void onStop() {
        mo11919b(7, mo11920q_());
    }

    public final void zzax() {
        mo11919b(9, mo11920q_());
    }

    public final boolean zznj() {
        Parcel a = mo11917a(11, mo11920q_());
        boolean a2 = aho.m16242a(a);
        a.recycle();
        return a2;
    }

    public final void zzo(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        mo11919b(13, q_);
    }
}
