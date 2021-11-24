package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.C3020a.C3022b;
import com.google.android.gms.common.api.C3020a.C3024d;
import com.google.android.gms.common.api.C3020a.C3031f;
import com.google.android.gms.common.api.internal.C3053a;
import com.google.android.gms.common.api.internal.C3085bd;
import com.google.android.gms.common.api.internal.C3095bn;
import com.google.android.gms.common.api.internal.C3108c.C3109a;
import com.google.android.gms.common.api.internal.C3112cb;
import com.google.android.gms.common.api.internal.C3135d;
import com.google.android.gms.common.api.internal.C3135d.C3136a;
import com.google.android.gms.common.api.internal.C3149l;
import com.google.android.gms.common.internal.C3266s;

/* renamed from: com.google.android.gms.common.api.c */
public class C3037c<O extends C3024d> {

    /* renamed from: a */
    protected final C3135d f10586a;

    /* renamed from: b */
    private final Context f10587b;

    /* renamed from: c */
    private final C3020a<O> f10588c;

    /* renamed from: d */
    private final O f10589d;

    /* renamed from: e */
    private final C3112cb<O> f10590e;

    /* renamed from: f */
    private final Looper f10591f;

    /* renamed from: g */
    private final int f10592g;

    /* renamed from: h */
    private final C3040d f10593h;

    /* renamed from: i */
    private final C3149l f10594i;

    /* renamed from: com.google.android.gms.common.api.c$a */
    public static class C3038a {

        /* renamed from: a */
        public static final C3038a f10595a = new C3039a().mo10838a();

        /* renamed from: b */
        public final C3149l f10596b;

        /* renamed from: c */
        public final Looper f10597c;

        /* renamed from: com.google.android.gms.common.api.c$a$a */
        public static class C3039a {

            /* renamed from: a */
            private C3149l f10598a;

            /* renamed from: b */
            private Looper f10599b;

            /* renamed from: a */
            public C3039a mo10837a(C3149l lVar) {
                C3266s.m14914a(lVar, (Object) "StatusExceptionMapper must not be null.");
                this.f10598a = lVar;
                return this;
            }

            /* renamed from: a */
            public C3038a mo10838a() {
                if (this.f10598a == null) {
                    this.f10598a = new C3053a();
                }
                if (this.f10599b == null) {
                    this.f10599b = Looper.getMainLooper();
                }
                return new C3038a(this.f10598a, this.f10599b);
            }
        }

        private C3038a(C3149l lVar, Account account, Looper looper) {
            this.f10596b = lVar;
            this.f10597c = looper;
        }
    }

    protected C3037c(Context context, C3020a<O> aVar, Looper looper) {
        C3266s.m14914a(context, (Object) "Null context is not permitted.");
        C3266s.m14914a(aVar, (Object) "Api must not be null.");
        C3266s.m14914a(looper, (Object) "Looper must not be null.");
        this.f10587b = context.getApplicationContext();
        this.f10588c = aVar;
        this.f10589d = null;
        this.f10591f = looper;
        this.f10590e = C3112cb.m14301a(aVar);
        this.f10593h = new C3085bd(this);
        this.f10586a = C3135d.m14435a(this.f10587b);
        this.f10592g = this.f10586a.mo11030c();
        this.f10594i = new C3053a();
    }

    public C3037c(Context context, C3020a<O> aVar, O o, C3038a aVar2) {
        C3266s.m14914a(context, (Object) "Null context is not permitted.");
        C3266s.m14914a(aVar, (Object) "Api must not be null.");
        C3266s.m14914a(aVar2, (Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f10587b = context.getApplicationContext();
        this.f10588c = aVar;
        this.f10589d = o;
        this.f10591f = aVar2.f10597c;
        this.f10590e = C3112cb.m14302a(this.f10588c, this.f10589d);
        this.f10593h = new C3085bd(this);
        this.f10586a = C3135d.m14435a(this.f10587b);
        this.f10592g = this.f10586a.mo11030c();
        this.f10594i = aVar2.f10596b;
        this.f10586a.mo11024a(this);
    }

    @Deprecated
    public C3037c(Context context, C3020a<O> aVar, O o, C3149l lVar) {
        this(context, aVar, o, new C3039a().mo10837a(lVar).mo10838a());
    }

    /* renamed from: a */
    private final <A extends C3022b, T extends C3109a<? extends C3049h, A>> T m14028a(int i, T t) {
        t.mo10880h();
        this.f10586a.mo11025a(this, i, t);
        return t;
    }

    /* renamed from: a */
    public C3031f mo10827a(Looper looper, C3136a<O> aVar) {
        return this.f10588c.mo10805b().mo10666a(this.f10587b, looper, mo10836g().mo11257a(), this.f10589d, aVar, aVar);
    }

    /* renamed from: a */
    public final C3020a<O> mo10828a() {
        return this.f10588c;
    }

    /* renamed from: a */
    public C3095bn mo10829a(Context context, Handler handler) {
        return new C3095bn(context, handler, mo10836g().mo11257a());
    }

    /* renamed from: a */
    public <A extends C3022b, T extends C3109a<? extends C3049h, A>> T mo10830a(T t) {
        return m14028a(1, t);
    }

    /* renamed from: b */
    public final C3112cb<O> mo10831b() {
        return this.f10590e;
    }

    /* renamed from: c */
    public final int mo10832c() {
        return this.f10592g;
    }

    /* renamed from: d */
    public C3040d mo10833d() {
        return this.f10593h;
    }

    /* renamed from: e */
    public Looper mo10834e() {
        return this.f10591f;
    }

    /* renamed from: f */
    public Context mo10835f() {
        return this.f10587b;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.common.internal.C3240e.C3241a mo10836g() {
        /*
            r2 = this;
            com.google.android.gms.common.internal.e$a r0 = new com.google.android.gms.common.internal.e$a
            r0.<init>()
            O r1 = r2.f10589d
            boolean r1 = r1 instanceof com.google.android.gms.common.api.C3020a.C3024d.C3026b
            if (r1 == 0) goto L_0x001a
            O r1 = r2.f10589d
            com.google.android.gms.common.api.a$d$b r1 = (com.google.android.gms.common.api.C3020a.C3024d.C3026b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.mo10809a()
            if (r1 == 0) goto L_0x001a
            android.accounts.Account r1 = r1.mo10671d()
            goto L_0x002a
        L_0x001a:
            O r1 = r2.f10589d
            boolean r1 = r1 instanceof com.google.android.gms.common.api.C3020a.C3024d.C3025a
            if (r1 == 0) goto L_0x0029
            O r1 = r2.f10589d
            com.google.android.gms.common.api.a$d$a r1 = (com.google.android.gms.common.api.C3020a.C3024d.C3025a) r1
            android.accounts.Account r1 = r1.mo10808a()
            goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            com.google.android.gms.common.internal.e$a r0 = r0.mo11254a(r1)
            O r1 = r2.f10589d
            boolean r1 = r1 instanceof com.google.android.gms.common.api.C3020a.C3024d.C3026b
            if (r1 == 0) goto L_0x0043
            O r1 = r2.f10589d
            com.google.android.gms.common.api.a$d$b r1 = (com.google.android.gms.common.api.C3020a.C3024d.C3026b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.mo10809a()
            if (r1 == 0) goto L_0x0043
            java.util.Set r1 = r1.mo10680k()
            goto L_0x0047
        L_0x0043:
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x0047:
            com.google.android.gms.common.internal.e$a r0 = r0.mo11256a(r1)
            android.content.Context r1 = r2.f10587b
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            com.google.android.gms.common.internal.e$a r0 = r0.mo11258b(r1)
            android.content.Context r1 = r2.f10587b
            java.lang.String r1 = r1.getPackageName()
            com.google.android.gms.common.internal.e$a r0 = r0.mo11255a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C3037c.mo10836g():com.google.android.gms.common.internal.e$a");
    }
}
