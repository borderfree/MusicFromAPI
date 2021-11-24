package com.google.android.exoplayer2.upstream;

import android.content.Context;
import com.google.android.exoplayer2.upstream.C2809d.C2810a;

/* renamed from: com.google.android.exoplayer2.upstream.i */
public final class C2816i implements C2810a {

    /* renamed from: a */
    private final Context f9750a;

    /* renamed from: b */
    private final C2819l<? super C2809d> f9751b;

    /* renamed from: c */
    private final C2810a f9752c;

    public C2816i(Context context, C2819l<? super C2809d> lVar, C2810a aVar) {
        this.f9750a = context.getApplicationContext();
        this.f9751b = lVar;
        this.f9752c = aVar;
    }

    public C2816i(Context context, String str, C2819l<? super C2809d> lVar) {
        this(context, lVar, (C2810a) new C2818k(str, lVar));
    }

    /* renamed from: b */
    public C2815h mo9523a() {
        return new C2815h(this.f9750a, this.f9751b, this.f9752c.mo9523a());
    }
}
