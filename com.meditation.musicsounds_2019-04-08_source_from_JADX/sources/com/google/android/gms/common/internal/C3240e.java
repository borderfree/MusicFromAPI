package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.support.p009v4.p019g.C0490b;
import android.view.View;
import com.google.android.gms.common.api.C3020a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.C4776a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.common.internal.e */
public final class C3240e {

    /* renamed from: a */
    private final Account f11070a;

    /* renamed from: b */
    private final Set<Scope> f11071b;

    /* renamed from: c */
    private final Set<Scope> f11072c;

    /* renamed from: d */
    private final Map<C3020a<?>, C3242b> f11073d;

    /* renamed from: e */
    private final int f11074e;

    /* renamed from: f */
    private final View f11075f;

    /* renamed from: g */
    private final String f11076g;

    /* renamed from: h */
    private final String f11077h;

    /* renamed from: i */
    private final C4776a f11078i;

    /* renamed from: j */
    private Integer f11079j;

    /* renamed from: com.google.android.gms.common.internal.e$a */
    public static final class C3241a {

        /* renamed from: a */
        private Account f11080a;

        /* renamed from: b */
        private C0490b<Scope> f11081b;

        /* renamed from: c */
        private Map<C3020a<?>, C3242b> f11082c;

        /* renamed from: d */
        private int f11083d = 0;

        /* renamed from: e */
        private View f11084e;

        /* renamed from: f */
        private String f11085f;

        /* renamed from: g */
        private String f11086g;

        /* renamed from: h */
        private C4776a f11087h = C4776a.f17293a;

        /* renamed from: a */
        public final C3241a mo11254a(Account account) {
            this.f11080a = account;
            return this;
        }

        /* renamed from: a */
        public final C3241a mo11255a(String str) {
            this.f11085f = str;
            return this;
        }

        /* renamed from: a */
        public final C3241a mo11256a(Collection<Scope> collection) {
            if (this.f11081b == null) {
                this.f11081b = new C0490b<>();
            }
            this.f11081b.addAll(collection);
            return this;
        }

        /* renamed from: a */
        public final C3240e mo11257a() {
            C3240e eVar = new C3240e(this.f11080a, this.f11081b, this.f11082c, this.f11083d, this.f11084e, this.f11085f, this.f11086g, this.f11087h);
            return eVar;
        }

        /* renamed from: b */
        public final C3241a mo11258b(String str) {
            this.f11086g = str;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.common.internal.e$b */
    public static final class C3242b {

        /* renamed from: a */
        public final Set<Scope> f11088a;
    }

    public C3240e(Account account, Set<Scope> set, Map<C3020a<?>, C3242b> map, int i, View view, String str, String str2, C4776a aVar) {
        this.f11070a = account;
        this.f11071b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        this.f11073d = map;
        this.f11075f = view;
        this.f11074e = i;
        this.f11076g = str;
        this.f11077h = str2;
        this.f11078i = aVar;
        HashSet hashSet = new HashSet(this.f11071b);
        for (C3242b bVar : this.f11073d.values()) {
            hashSet.addAll(bVar.f11088a);
        }
        this.f11072c = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    @Nullable
    /* renamed from: a */
    public final String mo11242a() {
        if (this.f11070a != null) {
            return this.f11070a.name;
        }
        return null;
    }

    /* renamed from: a */
    public final Set<Scope> mo11243a(C3020a<?> aVar) {
        C3242b bVar = (C3242b) this.f11073d.get(aVar);
        if (bVar == null || bVar.f11088a.isEmpty()) {
            return this.f11071b;
        }
        HashSet hashSet = new HashSet(this.f11071b);
        hashSet.addAll(bVar.f11088a);
        return hashSet;
    }

    /* renamed from: a */
    public final void mo11244a(Integer num) {
        this.f11079j = num;
    }

    @Nullable
    /* renamed from: b */
    public final Account mo11245b() {
        return this.f11070a;
    }

    /* renamed from: c */
    public final Account mo11246c() {
        return this.f11070a != null ? this.f11070a : new Account("<<default account>>", "com.google");
    }

    /* renamed from: d */
    public final Set<Scope> mo11247d() {
        return this.f11071b;
    }

    /* renamed from: e */
    public final Set<Scope> mo11248e() {
        return this.f11072c;
    }

    /* renamed from: f */
    public final Map<C3020a<?>, C3242b> mo11249f() {
        return this.f11073d;
    }

    @Nullable
    /* renamed from: g */
    public final String mo11250g() {
        return this.f11076g;
    }

    @Nullable
    /* renamed from: h */
    public final String mo11251h() {
        return this.f11077h;
    }

    @Nullable
    /* renamed from: i */
    public final C4776a mo11252i() {
        return this.f11078i;
    }

    @Nullable
    /* renamed from: j */
    public final Integer mo11253j() {
        return this.f11079j;
    }
}
