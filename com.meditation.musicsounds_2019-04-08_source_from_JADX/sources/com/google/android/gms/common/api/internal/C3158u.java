package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3020a;

/* renamed from: com.google.android.gms.common.api.internal.u */
public final class C3158u implements C3071ar {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3072as f10914a;

    /* renamed from: b */
    private boolean f10915b = false;

    public C3158u(C3072as asVar) {
        this.f10914a = asVar;
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [com.google.android.gms.common.api.a$h] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <A extends com.google.android.gms.common.api.C3020a.C3022b, T extends com.google.android.gms.common.api.internal.C3108c.C3109a<? extends com.google.android.gms.common.api.C3049h, A>> T mo10897a(T r4) {
        /*
            r3 = this;
            com.google.android.gms.common.api.internal.as r0 = r3.f10914a     // Catch:{ DeadObjectException -> 0x004b }
            com.google.android.gms.common.api.internal.aj r0 = r0.f10692d     // Catch:{ DeadObjectException -> 0x004b }
            com.google.android.gms.common.api.internal.bu r0 = r0.f10656e     // Catch:{ DeadObjectException -> 0x004b }
            r0.mo10974a(r4)     // Catch:{ DeadObjectException -> 0x004b }
            com.google.android.gms.common.api.internal.as r0 = r3.f10914a     // Catch:{ DeadObjectException -> 0x004b }
            com.google.android.gms.common.api.internal.aj r0 = r0.f10692d     // Catch:{ DeadObjectException -> 0x004b }
            com.google.android.gms.common.api.a$c r1 = r4.mo10983d()     // Catch:{ DeadObjectException -> 0x004b }
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.api.a$f> r0 = r0.f10653b     // Catch:{ DeadObjectException -> 0x004b }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ DeadObjectException -> 0x004b }
            com.google.android.gms.common.api.a$f r0 = (com.google.android.gms.common.api.C3020a.C3031f) r0     // Catch:{ DeadObjectException -> 0x004b }
            java.lang.String r1 = "Appropriate Api was not requested."
            com.google.android.gms.common.internal.C3266s.m14914a(r0, r1)     // Catch:{ DeadObjectException -> 0x004b }
            boolean r1 = r0.mo10816h()     // Catch:{ DeadObjectException -> 0x004b }
            if (r1 != 0) goto L_0x003d
            com.google.android.gms.common.api.internal.as r1 = r3.f10914a     // Catch:{ DeadObjectException -> 0x004b }
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.ConnectionResult> r1 = r1.f10690b     // Catch:{ DeadObjectException -> 0x004b }
            com.google.android.gms.common.api.a$c r2 = r4.mo10983d()     // Catch:{ DeadObjectException -> 0x004b }
            boolean r1 = r1.containsKey(r2)     // Catch:{ DeadObjectException -> 0x004b }
            if (r1 == 0) goto L_0x003d
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status     // Catch:{ DeadObjectException -> 0x004b }
            r1 = 17
            r0.<init>(r1)     // Catch:{ DeadObjectException -> 0x004b }
            r4.mo10981b(r0)     // Catch:{ DeadObjectException -> 0x004b }
            goto L_0x0055
        L_0x003d:
            boolean r1 = r0 instanceof com.google.android.gms.common.internal.C3268t     // Catch:{ DeadObjectException -> 0x004b }
            if (r1 == 0) goto L_0x0047
            com.google.android.gms.common.internal.t r0 = (com.google.android.gms.common.internal.C3268t) r0     // Catch:{ DeadObjectException -> 0x004b }
            com.google.android.gms.common.api.a$h r0 = r0.mo10737e()     // Catch:{ DeadObjectException -> 0x004b }
        L_0x0047:
            r4.mo10982b(r0)     // Catch:{ DeadObjectException -> 0x004b }
            goto L_0x0055
        L_0x004b:
            com.google.android.gms.common.api.internal.as r0 = r3.f10914a
            com.google.android.gms.common.api.internal.v r1 = new com.google.android.gms.common.api.internal.v
            r1.<init>(r3, r3)
            r0.mo10922a(r1)
        L_0x0055:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C3158u.mo10897a(com.google.android.gms.common.api.internal.c$a):com.google.android.gms.common.api.internal.c$a");
    }

    /* renamed from: a */
    public final void mo10898a() {
    }

    /* renamed from: a */
    public final void mo10899a(int i) {
        this.f10914a.mo10920a((ConnectionResult) null);
        this.f10914a.f10693e.mo10904a(i, this.f10915b);
    }

    /* renamed from: a */
    public final void mo10900a(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo10901a(ConnectionResult connectionResult, C3020a<?> aVar, boolean z) {
    }

    /* renamed from: b */
    public final boolean mo10902b() {
        if (this.f10915b) {
            return false;
        }
        if (this.f10914a.f10692d.mo10908m()) {
            this.f10915b = true;
            for (C3099br a : this.f10914a.f10692d.f10655d) {
                a.mo10969a();
            }
            return false;
        }
        this.f10914a.mo10920a((ConnectionResult) null);
        return true;
    }

    /* renamed from: c */
    public final void mo10903c() {
        if (this.f10915b) {
            this.f10915b = false;
            this.f10914a.mo10922a((C3073at) new C3160w(this, this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo11082d() {
        if (this.f10915b) {
            this.f10915b = false;
            this.f10914a.f10692d.f10656e.mo10973a();
            mo10902b();
        }
    }
}
