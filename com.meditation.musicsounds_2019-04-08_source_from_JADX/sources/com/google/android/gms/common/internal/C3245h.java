package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C3177d;
import com.google.android.gms.common.api.C3020a.C3031f;
import com.google.android.gms.common.api.C3040d.C3042b;
import com.google.android.gms.common.api.C3040d.C3043c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3227d.C3228a;
import com.google.android.gms.common.internal.C3227d.C3229b;
import com.google.android.gms.common.internal.C3246i.C3247a;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.h */
public abstract class C3245h<T extends IInterface> extends C3227d<T> implements C3031f, C3247a {

    /* renamed from: e */
    private final C3240e f11090e;

    /* renamed from: f */
    private final Set<Scope> f11091f;

    /* renamed from: g */
    private final Account f11092g;

    protected C3245h(Context context, Looper looper, int i, C3240e eVar, C3042b bVar, C3043c cVar) {
        this(context, looper, C3248j.m14881a(context), C3177d.m14629a(), i, eVar, (C3042b) C3266s.m14913a(bVar), (C3043c) C3266s.m14913a(cVar));
    }

    protected C3245h(Context context, Looper looper, C3248j jVar, C3177d dVar, int i, C3240e eVar, C3042b bVar, C3043c cVar) {
        super(context, looper, jVar, dVar, i, m14863a(bVar), m14864a(cVar), eVar.mo11251h());
        this.f11090e = eVar;
        this.f11092g = eVar.mo11245b();
        this.f11091f = m14865b(eVar.mo11248e());
    }

    /* renamed from: a */
    private static C3228a m14863a(C3042b bVar) {
        if (bVar == null) {
            return null;
        }
        return new C3274z(bVar);
    }

    /* renamed from: a */
    private static C3229b m14864a(C3043c cVar) {
        if (cVar == null) {
            return null;
        }
        return new C3203aa(cVar);
    }

    /* renamed from: b */
    private final Set<Scope> m14865b(Set<Scope> set) {
        Set<Scope> a = mo11261a(set);
        for (Scope contains : a) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Set<Scope> mo11261a(Set<Scope> set) {
        return set;
    }

    /* renamed from: f */
    public int mo10738f() {
        return super.mo10738f();
    }

    /* renamed from: s */
    public final Account mo11223s() {
        return this.f11092g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Set<Scope> mo11229y() {
        return this.f11091f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final C3240e mo11262z() {
        return this.f11090e;
    }
}
