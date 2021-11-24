package com.google.firebase.iid;

import android.util.Base64;
import com.google.android.gms.common.internal.C3261q;
import java.security.KeyPair;

/* renamed from: com.google.firebase.iid.az */
final class C4948az {

    /* renamed from: a */
    private final KeyPair f17747a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f17748b;

    C4948az(KeyPair keyPair, long j) {
        this.f17747a = keyPair;
        this.f17748b = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final String m24602b() {
        return Base64.encodeToString(this.f17747a.getPublic().getEncoded(), 11);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final String m24605c() {
        return Base64.encodeToString(this.f17747a.getPrivate().getEncoded(), 11);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final KeyPair mo16213a() {
        return this.f17747a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4948az)) {
            return false;
        }
        C4948az azVar = (C4948az) obj;
        return this.f17748b == azVar.f17748b && this.f17747a.getPublic().equals(azVar.f17747a.getPublic()) && this.f17747a.getPrivate().equals(azVar.f17747a.getPrivate());
    }

    public final int hashCode() {
        return C3261q.m14904a(this.f17747a.getPublic(), this.f17747a.getPrivate(), Long.valueOf(this.f17748b));
    }
}
