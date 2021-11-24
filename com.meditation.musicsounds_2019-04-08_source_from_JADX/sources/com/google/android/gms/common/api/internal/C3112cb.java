package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3020a;
import com.google.android.gms.common.api.C3020a.C3024d;
import com.google.android.gms.common.internal.C3261q;

/* renamed from: com.google.android.gms.common.api.internal.cb */
public final class C3112cb<O extends C3024d> {

    /* renamed from: a */
    private final boolean f10768a = true;

    /* renamed from: b */
    private final int f10769b;

    /* renamed from: c */
    private final C3020a<O> f10770c;

    /* renamed from: d */
    private final O f10771d;

    private C3112cb(C3020a<O> aVar) {
        this.f10770c = aVar;
        this.f10771d = null;
        this.f10769b = System.identityHashCode(this);
    }

    private C3112cb(C3020a<O> aVar, O o) {
        this.f10770c = aVar;
        this.f10771d = o;
        this.f10769b = C3261q.m14904a(this.f10770c, this.f10771d);
    }

    /* renamed from: a */
    public static <O extends C3024d> C3112cb<O> m14301a(C3020a<O> aVar) {
        return new C3112cb<>(aVar);
    }

    /* renamed from: a */
    public static <O extends C3024d> C3112cb<O> m14302a(C3020a<O> aVar, O o) {
        return new C3112cb<>(aVar, o);
    }

    /* renamed from: a */
    public final String mo10985a() {
        return this.f10770c.mo10807d();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3112cb)) {
            return false;
        }
        C3112cb cbVar = (C3112cb) obj;
        return !this.f10768a && !cbVar.f10768a && C3261q.m14906a(this.f10770c, cbVar.f10770c) && C3261q.m14906a(this.f10771d, cbVar.f10771d);
    }

    public final int hashCode() {
        return this.f10769b;
    }
}
