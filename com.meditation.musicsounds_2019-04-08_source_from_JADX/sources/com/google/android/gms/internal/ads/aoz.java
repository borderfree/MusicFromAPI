package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@C3464ci
public final class aoz {

    /* renamed from: a */
    private final Date f12507a;

    /* renamed from: b */
    private final String f12508b;

    /* renamed from: c */
    private final int f12509c;

    /* renamed from: d */
    private final Set<String> f12510d;

    /* renamed from: e */
    private final Location f12511e;

    /* renamed from: f */
    private final boolean f12512f;

    /* renamed from: g */
    private final Bundle f12513g;

    /* renamed from: h */
    private final Map<Class<? extends NetworkExtras>, NetworkExtras> f12514h;

    /* renamed from: i */
    private final String f12515i;

    /* renamed from: j */
    private final String f12516j;

    /* renamed from: k */
    private final SearchAdRequest f12517k;

    /* renamed from: l */
    private final int f12518l;

    /* renamed from: m */
    private final Set<String> f12519m;

    /* renamed from: n */
    private final Bundle f12520n;

    /* renamed from: o */
    private final Set<String> f12521o;

    /* renamed from: p */
    private final boolean f12522p;

    public aoz(apa apa) {
        this(apa, null);
    }

    public aoz(apa apa, SearchAdRequest searchAdRequest) {
        this.f12507a = apa.f12532g;
        this.f12508b = apa.f12533h;
        this.f12509c = apa.f12534i;
        this.f12510d = Collections.unmodifiableSet(apa.f12526a);
        this.f12511e = apa.f12535j;
        this.f12512f = apa.f12536k;
        this.f12513g = apa.f12527b;
        this.f12514h = Collections.unmodifiableMap(apa.f12528c);
        this.f12515i = apa.f12537l;
        this.f12516j = apa.f12538m;
        this.f12517k = searchAdRequest;
        this.f12518l = apa.f12539n;
        this.f12519m = Collections.unmodifiableSet(apa.f12529d);
        this.f12520n = apa.f12530e;
        this.f12521o = Collections.unmodifiableSet(apa.f12531f);
        this.f12522p = apa.f12540o;
    }

    @Deprecated
    /* renamed from: a */
    public final <T extends NetworkExtras> T mo12151a(Class<T> cls) {
        return (NetworkExtras) this.f12514h.get(cls);
    }

    /* renamed from: a */
    public final Date mo12152a() {
        return this.f12507a;
    }

    /* renamed from: a */
    public final boolean mo12153a(Context context) {
        Set<String> set = this.f12519m;
        ane.m16645a();
        return set.contains(C3719lt.m19109a(context));
    }

    /* renamed from: b */
    public final Bundle mo12154b(Class<? extends MediationAdapter> cls) {
        return this.f12513g.getBundle(cls.getName());
    }

    /* renamed from: b */
    public final String mo12155b() {
        return this.f12508b;
    }

    /* renamed from: c */
    public final int mo12156c() {
        return this.f12509c;
    }

    /* renamed from: c */
    public final Bundle mo12157c(Class<? extends CustomEvent> cls) {
        Bundle bundle = this.f12513g.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    /* renamed from: d */
    public final Set<String> mo12158d() {
        return this.f12510d;
    }

    /* renamed from: e */
    public final Location mo12159e() {
        return this.f12511e;
    }

    /* renamed from: f */
    public final boolean mo12160f() {
        return this.f12512f;
    }

    /* renamed from: g */
    public final String mo12161g() {
        return this.f12515i;
    }

    /* renamed from: h */
    public final String mo12162h() {
        return this.f12516j;
    }

    /* renamed from: i */
    public final SearchAdRequest mo12163i() {
        return this.f12517k;
    }

    /* renamed from: j */
    public final Map<Class<? extends NetworkExtras>, NetworkExtras> mo12164j() {
        return this.f12514h;
    }

    /* renamed from: k */
    public final Bundle mo12165k() {
        return this.f12513g;
    }

    /* renamed from: l */
    public final int mo12166l() {
        return this.f12518l;
    }

    /* renamed from: m */
    public final Bundle mo12167m() {
        return this.f12520n;
    }

    /* renamed from: n */
    public final Set<String> mo12168n() {
        return this.f12521o;
    }

    /* renamed from: o */
    public final boolean mo12169o() {
        return this.f12522p;
    }
}
