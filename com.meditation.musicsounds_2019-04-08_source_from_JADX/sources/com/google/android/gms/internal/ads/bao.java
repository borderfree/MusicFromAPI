package com.google.android.gms.internal.ads;

final class bao implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3751my f13497a;

    /* renamed from: b */
    private final /* synthetic */ bam f13498b;

    bao(bam bam, C3751my myVar) {
        this.f13498b = bam;
        this.f13497a = myVar;
    }

    public final void run() {
        for (C3751my myVar : this.f13498b.f13490k.keySet()) {
            if (myVar != this.f13497a) {
                ((bag) this.f13498b.f13490k.get(myVar)).mo12673a();
            }
        }
    }
}
