package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.C3020a;
import com.google.android.gms.common.api.C3020a.C3021a;
import com.google.android.gms.common.api.C3020a.C3024d;
import com.google.android.gms.common.api.C3020a.C3031f;
import com.google.android.gms.common.api.C3037c;
import com.google.android.gms.common.api.internal.C3135d.C3136a;
import com.google.android.gms.common.internal.C3240e;
import com.google.android.gms.signin.C4776a;
import com.google.android.gms.signin.C4781e;

/* renamed from: com.google.android.gms.common.api.internal.cp */
public final class C3127cp<O extends C3024d> extends C3037c<O> {

    /* renamed from: b */
    private final C3031f f10812b;

    /* renamed from: c */
    private final C3121cj f10813c;

    /* renamed from: d */
    private final C3240e f10814d;

    /* renamed from: e */
    private final C3021a<? extends C4781e, C4776a> f10815e;

    public C3127cp(Context context, C3020a<O> aVar, Looper looper, C3031f fVar, C3121cj cjVar, C3240e eVar, C3021a<? extends C4781e, C4776a> aVar2) {
        super(context, aVar, looper);
        this.f10812b = fVar;
        this.f10813c = cjVar;
        this.f10814d = eVar;
        this.f10815e = aVar2;
        this.f10586a.mo11024a((C3037c<?>) this);
    }

    /* renamed from: a */
    public final C3031f mo10827a(Looper looper, C3136a<O> aVar) {
        this.f10813c.mo11002a((C3122ck) aVar);
        return this.f10812b;
    }

    /* renamed from: a */
    public final C3095bn mo10829a(Context context, Handler handler) {
        return new C3095bn(context, handler, this.f10814d, this.f10815e);
    }

    /* renamed from: h */
    public final C3031f mo11005h() {
        return this.f10812b;
    }
}
