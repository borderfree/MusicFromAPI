package com.google.android.gms.auth.api;

import android.os.Bundle;
import com.google.android.gms.auth.api.p117a.C2965a;
import com.google.android.gms.auth.api.p118b.C2967a;
import com.google.android.gms.auth.api.signin.C2973a;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C2986g;
import com.google.android.gms.auth.api.signin.internal.C2987h;
import com.google.android.gms.common.api.C3020a;
import com.google.android.gms.common.api.C3020a.C3021a;
import com.google.android.gms.common.api.C3020a.C3024d.C3029e;
import com.google.android.gms.common.api.C3020a.C3032g;
import com.google.android.gms.internal.p127b.C4156e;
import com.google.android.gms.internal.p127b.C4157f;

/* renamed from: com.google.android.gms.auth.api.a */
public final class C2962a {

    /* renamed from: a */
    public static final C3032g<C4157f> f10433a = new C3032g<>();

    /* renamed from: b */
    public static final C3032g<C2987h> f10434b = new C3032g<>();
    @Deprecated

    /* renamed from: c */
    public static final C3020a<C2968c> f10435c = C2966b.f10447a;

    /* renamed from: d */
    public static final C3020a<C2963a> f10436d = new C3020a<>("Auth.CREDENTIALS_API", f10441i, f10433a);

    /* renamed from: e */
    public static final C3020a<GoogleSignInOptions> f10437e = new C3020a<>("Auth.GOOGLE_SIGN_IN_API", f10442j, f10434b);
    @Deprecated

    /* renamed from: f */
    public static final C2967a f10438f = C2966b.f10448b;

    /* renamed from: g */
    public static final C2965a f10439g = new C4156e();

    /* renamed from: h */
    public static final C2973a f10440h = new C2986g();

    /* renamed from: i */
    private static final C3021a<C4157f, C2963a> f10441i = new C2970e();

    /* renamed from: j */
    private static final C3021a<C2987h, GoogleSignInOptions> f10442j = new C2971f();

    @Deprecated
    /* renamed from: com.google.android.gms.auth.api.a$a */
    public static class C2963a implements C3029e {

        /* renamed from: a */
        private static final C2963a f10443a = new C2964a().mo10665a();

        /* renamed from: b */
        private final String f10444b = null;

        /* renamed from: c */
        private final boolean f10445c;

        @Deprecated
        /* renamed from: com.google.android.gms.auth.api.a$a$a */
        public static class C2964a {

            /* renamed from: a */
            protected Boolean f10446a = Boolean.valueOf(false);

            /* renamed from: a */
            public C2963a mo10665a() {
                return new C2963a(this);
            }
        }

        public C2963a(C2964a aVar) {
            this.f10445c = aVar.f10446a.booleanValue();
        }

        /* renamed from: a */
        public final Bundle mo10664a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", null);
            bundle.putBoolean("force_save_dialog", this.f10445c);
            return bundle;
        }
    }
}
