package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.C3323b.C3324a;

/* renamed from: com.google.android.gms.internal.ads.r */
public abstract class C3861r extends ahn implements C3834q {
    public C3861r() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static C3834q zzu(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return queryLocalInterface instanceof C3834q ? (C3834q) queryLocalInterface : new C3888s(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                onCreate((Bundle) aho.m16238a(parcel, Bundle.CREATOR));
                break;
            case 2:
                onRestart();
                break;
            case 3:
                onStart();
                break;
            case 4:
                onResume();
                break;
            case 5:
                onPause();
                break;
            case 6:
                Bundle bundle = (Bundle) aho.m16238a(parcel, Bundle.CREATOR);
                onSaveInstanceState(bundle);
                parcel2.writeNoException();
                aho.m16244b(parcel2, bundle);
                break;
            case 7:
                onStop();
                break;
            case 8:
                onDestroy();
                break;
            case 9:
                zzax();
                break;
            case 10:
                onBackPressed();
                break;
            case 11:
                boolean zznj = zznj();
                parcel2.writeNoException();
                aho.m16241a(parcel2, zznj);
                break;
            case 12:
                onActivityResult(parcel.readInt(), parcel.readInt(), (Intent) aho.m16238a(parcel, Intent.CREATOR));
                break;
            case 13:
                zzo(C3324a.m15129a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
