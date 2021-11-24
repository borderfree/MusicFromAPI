package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.C3323b.C3324a;

/* renamed from: com.google.android.gms.internal.ads.ha */
public abstract class C3592ha extends ahn implements C3590gz {
    public C3592ha() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* renamed from: a */
    public static C3590gz m18596a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof C3590gz ? (C3590gz) queryLocalInterface : new C3593hb(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo12952a(C3324a.m15129a(parcel.readStrongBinder()));
                break;
            case 2:
                mo12953a(C3324a.m15129a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                mo12958b(C3324a.m15129a(parcel.readStrongBinder()));
                break;
            case 4:
                mo12960c(C3324a.m15129a(parcel.readStrongBinder()));
                break;
            case 5:
                mo12961d(C3324a.m15129a(parcel.readStrongBinder()));
                break;
            case 6:
                mo12962e(C3324a.m15129a(parcel.readStrongBinder()));
                break;
            case 7:
                mo12954a(C3324a.m15129a(parcel.readStrongBinder()), (zzaig) aho.m16238a(parcel, zzaig.CREATOR));
                break;
            case 8:
                mo12963f(C3324a.m15129a(parcel.readStrongBinder()));
                break;
            case 9:
                mo12959b(C3324a.m15129a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                mo12964g(C3324a.m15129a(parcel.readStrongBinder()));
                break;
            case 11:
                mo12965h(C3324a.m15129a(parcel.readStrongBinder()));
                break;
            case 12:
                mo12951a((Bundle) aho.m16238a(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
