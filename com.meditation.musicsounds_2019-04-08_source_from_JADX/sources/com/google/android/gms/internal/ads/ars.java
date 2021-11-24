package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class ars extends atr implements asf {

    /* renamed from: a */
    private String f13000a;

    /* renamed from: b */
    private List<arp> f13001b;

    /* renamed from: c */
    private String f13002c;

    /* renamed from: d */
    private asy f13003d;

    /* renamed from: e */
    private String f13004e;

    /* renamed from: f */
    private String f13005f;

    /* renamed from: g */
    private arl f13006g;

    /* renamed from: h */
    private Bundle f13007h;

    /* renamed from: i */
    private aos f13008i;

    /* renamed from: j */
    private View f13009j;

    /* renamed from: k */
    private C3323b f13010k;

    /* renamed from: l */
    private String f13011l;

    /* renamed from: m */
    private Object f13012m = new Object();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public asb f13013n;

    public ars(String str, List<arp> list, String str2, asy asy, String str3, String str4, arl arl, Bundle bundle, aos aos, View view, C3323b bVar, String str5) {
        this.f13000a = str;
        this.f13001b = list;
        this.f13002c = str2;
        this.f13003d = asy;
        this.f13004e = str3;
        this.f13005f = str4;
        this.f13006g = arl;
        this.f13007h = bundle;
        this.f13008i = aos;
        this.f13009j = view;
        this.f13010k = bVar;
        this.f13011l = str5;
    }

    /* renamed from: a */
    public final String mo12381a() {
        return this.f13000a;
    }

    /* renamed from: a */
    public final void mo12382a(Bundle bundle) {
        synchronized (this.f13012m) {
            if (this.f13013n == null) {
                C3643iy.m19174c("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.f13013n.mo12454b(bundle);
            }
        }
    }

    /* renamed from: a */
    public final void mo12359a(asb asb) {
        synchronized (this.f13012m) {
            this.f13013n = asb;
        }
    }

    /* renamed from: b */
    public final List mo12360b() {
        return this.f13001b;
    }

    /* renamed from: b */
    public final boolean mo12383b(Bundle bundle) {
        synchronized (this.f13012m) {
            if (this.f13013n == null) {
                C3643iy.m19174c("#002 Attempt to record impression before native ad initialized.");
                return false;
            }
            boolean a = this.f13013n.mo12453a(bundle);
            return a;
        }
    }

    /* renamed from: c */
    public final C3323b mo12384c() {
        return this.f13010k;
    }

    /* renamed from: c */
    public final void mo12385c(Bundle bundle) {
        synchronized (this.f13012m) {
            if (this.f13013n == null) {
                C3643iy.m19174c("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.f13013n.mo12456c(bundle);
            }
        }
    }

    /* renamed from: d */
    public final String mo12386d() {
        return this.f13011l;
    }

    /* renamed from: e */
    public final String mo12387e() {
        return this.f13002c;
    }

    /* renamed from: f */
    public final asy mo12388f() {
        return this.f13003d;
    }

    /* renamed from: g */
    public final String mo12389g() {
        return this.f13004e;
    }

    /* renamed from: h */
    public final String mo12390h() {
        return this.f13005f;
    }

    /* renamed from: i */
    public final aos mo12391i() {
        return this.f13008i;
    }

    /* renamed from: j */
    public final C3323b mo12392j() {
        return C3327d.m15136a(this.f13013n);
    }

    /* renamed from: k */
    public final String mo12371k() {
        return "1";
    }

    /* renamed from: l */
    public final String mo12372l() {
        return "";
    }

    /* renamed from: m */
    public final arl mo12373m() {
        return this.f13006g;
    }

    /* renamed from: n */
    public final Bundle mo12393n() {
        return this.f13007h;
    }

    /* renamed from: o */
    public final View mo12375o() {
        return this.f13009j;
    }

    /* renamed from: p */
    public final asu mo12394p() {
        return this.f13006g;
    }

    /* renamed from: q */
    public final void mo12395q() {
        C3653jh.f14275a.post(new art(this));
        this.f13000a = null;
        this.f13001b = null;
        this.f13002c = null;
        this.f13003d = null;
        this.f13004e = null;
        this.f13005f = null;
        this.f13006g = null;
        this.f13007h = null;
        this.f13012m = null;
        this.f13008i = null;
        this.f13009j = null;
    }
}
