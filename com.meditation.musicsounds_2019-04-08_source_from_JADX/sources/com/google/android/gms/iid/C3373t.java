package com.google.android.gms.iid;

import android.util.Base64;
import com.google.android.gms.common.internal.C3261q;
import java.security.KeyPair;

/* renamed from: com.google.android.gms.iid.t */
final class C3373t {

    /* renamed from: a */
    private final KeyPair f11309a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f11310b;

    C3373t(KeyPair keyPair, long j) {
        this.f11309a = keyPair;
        this.f11310b = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final String m15260b() {
        return Base64.encodeToString(this.f11309a.getPublic().getEncoded(), 11);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final String m15263c() {
        return Base64.encodeToString(this.f11309a.getPrivate().getEncoded(), 11);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final KeyPair mo11402a() {
        return this.f11309a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3373t)) {
            return false;
        }
        C3373t tVar = (C3373t) obj;
        return this.f11310b == tVar.f11310b && this.f11309a.getPublic().equals(tVar.f11309a.getPublic()) && this.f11309a.getPrivate().equals(tVar.f11309a.getPrivate());
    }

    public final int hashCode() {
        return C3261q.m14904a(this.f11309a.getPublic(), this.f11309a.getPrivate(), Long.valueOf(this.f11310b));
    }
}
