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
public final class aml extends RemoteCreator<any> {
    public aml() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    /* renamed from: a */
    public final anv mo12099a(Context context, zzjn zzjn, String str, bas bas, int i) {
        try {
            IBinder a = ((any) mo11331a(context)).mo12124a(C3327d.m15136a(context), zzjn, str, bas, C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE, i);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface instanceof anv ? (anv) queryLocalInterface : new anx(a);
        } catch (RemoteException | RemoteCreatorException e) {
            C3731me.m19170a("Could not create remote AdManager.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo11332a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof any ? (any) queryLocalInterface : new anz(iBinder);
    }
}
