package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class azr {

    /* renamed from: a */
    private static final C3685km<axx> f13383a = new azs();

    /* renamed from: b */
    private static final C3685km<axx> f13384b = new azt();

    /* renamed from: c */
    private final ayj f13385c;

    public azr(Context context, zzang zzang, String str) {
        ayj ayj = new ayj(context, zzang, str, f13383a, f13384b);
        this.f13385c = ayj;
    }

    /* renamed from: a */
    public final <I, O> azj<I, O> mo12650a(String str, azm<I> azm, azl<O> azl) {
        return new azu(this.f13385c, str, azm, azl);
    }
}
