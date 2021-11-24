package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.C3183f;
import com.google.android.gms.dynamic.C3327d;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.gf */
public final class C3570gf extends RemoteCreator<C3563fz> {
    public C3570gf() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    /* renamed from: a */
    public final C3559fv mo12930a(Context context, bas bas) {
        try {
            IBinder a = ((C3563fz) mo11331a(context)).mo12928a(C3327d.m15136a(context), bas, C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            return queryLocalInterface instanceof C3559fv ? (C3559fv) queryLocalInterface : new C3562fy(a);
        } catch (RemoteException | RemoteCreatorException e) {
            C3731me.m19175c("Could not get remote RewardedVideoAd.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo11332a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        return queryLocalInterface instanceof C3563fz ? (C3563fz) queryLocalInterface : new C3565ga(iBinder);
    }
}
