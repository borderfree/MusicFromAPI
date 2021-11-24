package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3020a;
import com.google.android.gms.common.api.C3020a.C3022b;
import com.google.android.gms.common.api.C3020a.C3031f;
import com.google.android.gms.common.api.C3049h;
import com.google.android.gms.common.api.internal.C3108c.C3109a;
import java.util.Collections;

/* renamed from: com.google.android.gms.common.api.internal.ai */
public final class C3062ai implements C3071ar {

    /* renamed from: a */
    private final C3072as f10651a;

    public C3062ai(C3072as asVar) {
        this.f10651a = asVar;
    }

    /* renamed from: a */
    public final <A extends C3022b, T extends C3109a<? extends C3049h, A>> T mo10897a(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: a */
    public final void mo10898a() {
        for (C3031f g : this.f10651a.f10689a.values()) {
            g.mo10815g();
        }
        this.f10651a.f10692d.f10654c = Collections.emptySet();
    }

    /* renamed from: a */
    public final void mo10899a(int i) {
    }

    /* renamed from: a */
    public final void mo10900a(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo10901a(ConnectionResult connectionResult, C3020a<?> aVar, boolean z) {
    }

    /* renamed from: b */
    public final boolean mo10902b() {
        return true;
    }

    /* renamed from: c */
    public final void mo10903c() {
        this.f10651a.mo10928d();
    }
}
