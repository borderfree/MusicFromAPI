package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C3327d;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.p */
public final class C3807p extends RemoteCreator<C3915t> {
    public C3807p() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    /* renamed from: a */
    public final C3834q mo13430a(Activity activity) {
        try {
            IBinder a = ((C3915t) mo11331a((Context) activity)).mo13682a(C3327d.m15136a(activity));
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof C3834q ? (C3834q) queryLocalInterface : new C3888s(a);
        } catch (RemoteException | RemoteCreatorException e) {
            C3731me.m19175c("Could not create remote AdOverlay.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo11332a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof C3915t ? (C3915t) queryLocalInterface : new C3942u(iBinder);
    }
}
