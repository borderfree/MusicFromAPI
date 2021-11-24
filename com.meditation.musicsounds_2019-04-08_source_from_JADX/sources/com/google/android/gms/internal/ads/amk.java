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
public final class amk extends RemoteCreator<ant> {
    public amk() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    /* renamed from: a */
    public final anq mo12098a(Context context, String str, bas bas) {
        try {
            IBinder a = ((ant) mo11331a(context)).mo12123a(C3327d.m15136a(context), str, bas, C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof anq ? (anq) queryLocalInterface : new ans(a);
        } catch (RemoteException | RemoteCreatorException e) {
            C3731me.m19175c("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo11332a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof ant ? (ant) queryLocalInterface : new anu(iBinder);
    }
}
