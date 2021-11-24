package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C3020a.C3022b;
import com.google.android.gms.common.api.C3020a.C3024d;
import com.google.android.gms.common.api.C3037c;
import com.google.android.gms.common.api.C3049h;
import com.google.android.gms.common.api.internal.C3108c.C3109a;

/* renamed from: com.google.android.gms.common.api.internal.bd */
public final class C3085bd<O extends C3024d> extends C3157t {

    /* renamed from: a */
    private final C3037c<O> f10721a;

    public C3085bd(C3037c<O> cVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f10721a = cVar;
    }

    /* renamed from: a */
    public final <A extends C3022b, T extends C3109a<? extends C3049h, A>> T mo10839a(T t) {
        return this.f10721a.mo10830a(t);
    }

    /* renamed from: a */
    public final void mo10842a(C3099br brVar) {
    }

    /* renamed from: b */
    public final Context mo10845b() {
        return this.f10721a.mo10835f();
    }

    /* renamed from: b */
    public final void mo10847b(C3099br brVar) {
    }

    /* renamed from: c */
    public final Looper mo10848c() {
        return this.f10721a.mo10834e();
    }
}
