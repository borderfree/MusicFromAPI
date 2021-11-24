package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.common.C3183f;
import com.google.android.gms.dynamic.C3327d;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;

@C3464ci
public final class auy extends RemoteCreator<atf> {
    public auy() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    /* renamed from: a */
    public final atc mo12519a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder a = ((atf) mo11331a(context)).mo12483a(C3327d.m15136a(context), C3327d.m15136a(frameLayout), C3327d.m15136a(frameLayout2), C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return queryLocalInterface instanceof atc ? (atc) queryLocalInterface : new ate(a);
        } catch (RemoteException | RemoteCreatorException e) {
            C3731me.m19175c("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo11332a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof atf ? (atf) queryLocalInterface : new atg(iBinder);
    }
}
