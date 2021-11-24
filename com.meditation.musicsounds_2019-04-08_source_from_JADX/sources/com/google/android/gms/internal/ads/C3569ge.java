package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.ge */
public final class C3569ge implements RewardItem {

    /* renamed from: a */
    private final C3554fq f14007a;

    public C3569ge(C3554fq fqVar) {
        this.f14007a = fqVar;
    }

    public final int getAmount() {
        if (this.f14007a == null) {
            return 0;
        }
        try {
            return this.f14007a.mo12917b();
        } catch (RemoteException e) {
            C3731me.m19175c("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }

    public final String getType() {
        if (this.f14007a == null) {
            return null;
        }
        try {
            return this.f14007a.mo12916a();
        } catch (RemoteException e) {
            C3731me.m19175c("Could not forward getType to RewardItem", e);
            return null;
        }
    }
}
