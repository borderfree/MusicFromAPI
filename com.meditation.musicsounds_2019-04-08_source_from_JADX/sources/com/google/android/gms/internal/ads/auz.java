package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.C3327d;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;
import java.util.HashMap;

@C3464ci
public final class auz extends RemoteCreator<atk> {
    public auz() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    /* renamed from: a */
    public final ath mo12520a(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        try {
            IBinder a = ((atk) mo11331a(view.getContext())).mo12484a(C3327d.m15136a(view), C3327d.m15136a(hashMap), C3327d.m15136a(hashMap2));
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return queryLocalInterface instanceof ath ? (ath) queryLocalInterface : new atj(a);
        } catch (RemoteException | RemoteCreatorException e) {
            C3731me.m19175c("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo11332a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof atk ? (atk) queryLocalInterface : new atl(iBinder);
    }
}
