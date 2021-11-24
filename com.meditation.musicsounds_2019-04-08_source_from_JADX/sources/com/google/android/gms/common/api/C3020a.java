package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C3020a.C3024d;
import com.google.android.gms.common.api.C3040d.C3042b;
import com.google.android.gms.common.api.C3040d.C3043c;
import com.google.android.gms.common.internal.C3227d.C3230c;
import com.google.android.gms.common.internal.C3227d.C3232e;
import com.google.android.gms.common.internal.C3240e;
import com.google.android.gms.common.internal.C3252m;
import com.google.android.gms.common.internal.C3266s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.a */
public final class C3020a<O extends C3024d> {

    /* renamed from: a */
    private final C3021a<?, O> f10581a;

    /* renamed from: b */
    private final C3034i<?, O> f10582b = null;

    /* renamed from: c */
    private final C3032g<?> f10583c;

    /* renamed from: d */
    private final C3035j<?> f10584d;

    /* renamed from: e */
    private final String f10585e;

    /* renamed from: com.google.android.gms.common.api.a$a */
    public static abstract class C3021a<T extends C3031f, O> extends C3030e<T, O> {
        /* renamed from: a */
        public abstract T mo10666a(Context context, Looper looper, C3240e eVar, O o, C3042b bVar, C3043c cVar);
    }

    /* renamed from: com.google.android.gms.common.api.a$b */
    public interface C3022b {
    }

    /* renamed from: com.google.android.gms.common.api.a$c */
    public static class C3023c<C extends C3022b> {
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    public interface C3024d {

        /* renamed from: com.google.android.gms.common.api.a$d$a */
        public interface C3025a extends C3027c, C3028d {
            /* renamed from: a */
            Account mo10808a();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$b */
        public interface C3026b extends C3027c {
            /* renamed from: a */
            GoogleSignInAccount mo10809a();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$c */
        public interface C3027c extends C3024d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$d */
        public interface C3028d extends C3024d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$e */
        public interface C3029e extends C3027c, C3028d {
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$e */
    public static abstract class C3030e<T extends C3022b, O> {
        /* renamed from: a */
        public int mo10810a() {
            return Integer.MAX_VALUE;
        }

        /* renamed from: a */
        public List<Scope> mo10667a(O o) {
            return Collections.emptyList();
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$f */
    public interface C3031f extends C3022b {
        /* renamed from: a */
        void mo10811a(C3230c cVar);

        /* renamed from: a */
        void mo10812a(C3232e eVar);

        /* renamed from: a */
        void mo10813a(C3252m mVar, Set<Scope> set);

        /* renamed from: a */
        void mo10814a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        /* renamed from: c */
        boolean mo10735c();

        /* renamed from: d */
        Intent mo10736d();

        /* renamed from: f */
        int mo10738f();

        /* renamed from: g */
        void mo10815g();

        /* renamed from: h */
        boolean mo10816h();

        /* renamed from: i */
        boolean mo10817i();

        /* renamed from: j */
        boolean mo10818j();

        /* renamed from: k */
        boolean mo10819k();

        /* renamed from: l */
        IBinder mo10820l();

        /* renamed from: m */
        String mo10821m();

        /* renamed from: n */
        Feature[] mo10822n();
    }

    /* renamed from: com.google.android.gms.common.api.a$g */
    public static final class C3032g<C extends C3031f> extends C3023c<C> {
    }

    /* renamed from: com.google.android.gms.common.api.a$h */
    public interface C3033h<T extends IInterface> extends C3022b {
        /* renamed from: a */
        T mo10823a(IBinder iBinder);

        /* renamed from: a */
        String mo10824a();

        /* renamed from: a */
        void mo10825a(int i, T t);

        /* renamed from: b */
        String mo10826b();
    }

    /* renamed from: com.google.android.gms.common.api.a$i */
    public static abstract class C3034i<T extends C3033h, O> extends C3030e<T, O> {
    }

    /* renamed from: com.google.android.gms.common.api.a$j */
    public static final class C3035j<C extends C3033h> extends C3023c<C> {
    }

    public <C extends C3031f> C3020a(String str, C3021a<C, O> aVar, C3032g<C> gVar) {
        C3266s.m14914a(aVar, (Object) "Cannot construct an Api with a null ClientBuilder");
        C3266s.m14914a(gVar, (Object) "Cannot construct an Api with a null ClientKey");
        this.f10585e = str;
        this.f10581a = aVar;
        this.f10583c = gVar;
        this.f10584d = null;
    }

    /* renamed from: a */
    public final C3030e<?, O> mo10804a() {
        return this.f10581a;
    }

    /* renamed from: b */
    public final C3021a<?, O> mo10805b() {
        C3266s.m14920a(this.f10581a != null, (Object) "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f10581a;
    }

    /* renamed from: c */
    public final C3023c<?> mo10806c() {
        if (this.f10583c != null) {
            return this.f10583c;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    /* renamed from: d */
    public final String mo10807d() {
        return this.f10585e;
    }
}
