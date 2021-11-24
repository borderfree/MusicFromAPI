package com.google.android.gms.signin;

import com.google.android.gms.common.api.C3020a;
import com.google.android.gms.common.api.C3020a.C3021a;
import com.google.android.gms.common.api.C3020a.C3032g;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.C4782a;

/* renamed from: com.google.android.gms.signin.b */
public final class C4778b {

    /* renamed from: a */
    public static final C3021a<C4782a, C4776a> f17302a = new C4779c();

    /* renamed from: b */
    public static final C3020a<C4776a> f17303b = new C3020a<>("SignIn.API", f17302a, f17304c);

    /* renamed from: c */
    private static final C3032g<C4782a> f17304c = new C3032g<>();

    /* renamed from: d */
    private static final C3032g<C4782a> f17305d = new C3032g<>();

    /* renamed from: e */
    private static final C3021a<C4782a, Object> f17306e = new C4780d();

    /* renamed from: f */
    private static final Scope f17307f = new Scope("profile");

    /* renamed from: g */
    private static final Scope f17308g = new Scope("email");

    /* renamed from: h */
    private static final C3020a<Object> f17309h = new C3020a<>("SignIn.INTERNAL_API", f17306e, f17305d);
}
