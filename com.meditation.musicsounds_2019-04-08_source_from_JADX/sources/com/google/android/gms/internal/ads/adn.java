package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.adn;

public abstract class adn<M extends adn<M>> extends C3401ads {

    /* renamed from: Y */
    protected adp f11553Y;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo11510a() {
        if (this.f11553Y == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f11553Y.mo11816a(); i2++) {
            i += this.f11553Y.mo11819b(i2).mo11823a();
        }
        return i;
    }

    /* renamed from: a */
    public void mo11512a(adm adm) {
        if (this.f11553Y != null) {
            for (int i = 0; i < this.f11553Y.mo11816a(); i++) {
                this.f11553Y.mo11819b(i).mo11824a(adm);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo11811a(adk adk, int i) {
        int j = adk.mo11799j();
        if (!adk.mo11788b(i)) {
            return false;
        }
        int i2 = i >>> 3;
        adu adu = new adu(i, adk.mo11785a(j, adk.mo11799j() - j));
        adq adq = null;
        if (this.f11553Y == null) {
            this.f11553Y = new adp();
        } else {
            adq = this.f11553Y.mo11817a(i2);
        }
        if (adq == null) {
            adq = new adq();
            this.f11553Y.mo11818a(i2, adq);
        }
        adq.mo11825a(adu);
        return true;
    }

    /* renamed from: c */
    public final /* synthetic */ C3401ads mo11812c() {
        return (adn) clone();
    }

    public /* synthetic */ Object clone() {
        adn adn = (adn) super.clone();
        adr.m16010a(this, adn);
        return adn;
    }
}
