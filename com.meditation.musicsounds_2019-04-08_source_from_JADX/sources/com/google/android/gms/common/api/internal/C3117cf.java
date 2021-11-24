package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C3266s;

/* renamed from: com.google.android.gms.common.api.internal.cf */
final class C3117cf {

    /* renamed from: a */
    private final int f10786a;

    /* renamed from: b */
    private final ConnectionResult f10787b;

    C3117cf(ConnectionResult connectionResult, int i) {
        C3266s.m14913a(connectionResult);
        this.f10787b = connectionResult;
        this.f10786a = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo10998a() {
        return this.f10786a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final ConnectionResult mo10999b() {
        return this.f10787b;
    }
}
