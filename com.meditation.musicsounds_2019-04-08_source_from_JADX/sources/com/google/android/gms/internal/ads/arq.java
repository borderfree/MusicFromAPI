package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class arq extends atn implements asf {

    /* renamed from: a */
    private String f12983a;

    /* renamed from: b */
    private List<arp> f12984b;

    /* renamed from: c */
    private String f12985c;

    /* renamed from: d */
    private asy f12986d;

    /* renamed from: e */
    private String f12987e;

    /* renamed from: f */
    private double f12988f;

    /* renamed from: g */
    private String f12989g;

    /* renamed from: h */
    private String f12990h;

    /* renamed from: i */
    private arl f12991i;

    /* renamed from: j */
    private Bundle f12992j;

    /* renamed from: k */
    private aos f12993k;

    /* renamed from: l */
    private View f12994l;

    /* renamed from: m */
    private C3323b f12995m;

    /* renamed from: n */
    private String f12996n;

    /* renamed from: o */
    private Object f12997o = new Object();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public asb f12998p;

    public arq(String str, List<arp> list, String str2, asy asy, String str3, double d, String str4, String str5, arl arl, Bundle bundle, aos aos, View view, C3323b bVar, String str6) {
        this.f12983a = str;
        this.f12984b = list;
        this.f12985c = str2;
        this.f12986d = asy;
        this.f12987e = str3;
        this.f12988f = d;
        this.f12989g = str4;
        this.f12990h = str5;
        this.f12991i = arl;
        this.f12992j = bundle;
        this.f12993k = aos;
        this.f12994l = view;
        this.f12995m = bVar;
        this.f12996n = str6;
    }

    /* renamed from: a */
    public final String mo12357a() {
        return this.f12983a;
    }

    /* renamed from: a */
    public final void mo12358a(Bundle bundle) {
        synchronized (this.f12997o) {
            if (this.f12998p == null) {
                C3643iy.m19174c("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.f12998p.mo12454b(bundle);
            }
        }
    }

    /* renamed from: a */
    public final void mo12359a(asb asb) {
        synchronized (this.f12997o) {
            this.f12998p = asb;
        }
    }

    /* renamed from: b */
    public final List mo12360b() {
        return this.f12984b;
    }

    /* renamed from: b */
    public final boolean mo12361b(Bundle bundle) {
        synchronized (this.f12997o) {
            if (this.f12998p == null) {
                C3643iy.m19174c("#002 Attempt to record impression before native ad initialized.");
                return false;
            }
            boolean a = this.f12998p.mo12453a(bundle);
            return a;
        }
    }

    /* renamed from: c */
    public final String mo12362c() {
        return this.f12985c;
    }

    /* renamed from: c */
    public final void mo12363c(Bundle bundle) {
        synchronized (this.f12997o) {
            if (this.f12998p == null) {
                C3643iy.m19174c("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.f12998p.mo12456c(bundle);
            }
        }
    }

    /* renamed from: d */
    public final asy mo12364d() {
        return this.f12986d;
    }

    /* renamed from: e */
    public final String mo12365e() {
        return this.f12987e;
    }

    /* renamed from: f */
    public final double mo12366f() {
        return this.f12988f;
    }

    /* renamed from: g */
    public final String mo12367g() {
        return this.f12989g;
    }

    /* renamed from: h */
    public final String mo12368h() {
        return this.f12990h;
    }

    /* renamed from: i */
    public final aos mo12369i() {
        return this.f12993k;
    }

    /* renamed from: j */
    public final C3323b mo12370j() {
        return C3327d.m15136a(this.f12998p);
    }

    /* renamed from: k */
    public final String mo12371k() {
        return "2";
    }

    /* renamed from: l */
    public final String mo12372l() {
        return "";
    }

    /* renamed from: m */
    public final arl mo12373m() {
        return this.f12991i;
    }

    /* renamed from: n */
    public final Bundle mo12374n() {
        return this.f12992j;
    }

    /* renamed from: o */
    public final View mo12375o() {
        return this.f12994l;
    }

    /* renamed from: p */
    public final C3323b mo12376p() {
        return this.f12995m;
    }

    /* renamed from: q */
    public final String mo12377q() {
        return this.f12996n;
    }

    /* renamed from: r */
    public final asu mo12378r() {
        return this.f12991i;
    }

    /* renamed from: s */
    public final void mo12379s() {
        C3653jh.f14275a.post(new arr(this));
        this.f12983a = null;
        this.f12984b = null;
        this.f12985c = null;
        this.f12986d = null;
        this.f12987e = null;
        this.f12988f = 0.0d;
        this.f12989g = null;
        this.f12990h = null;
        this.f12991i = null;
        this.f12992j = null;
        this.f12997o = null;
        this.f12993k = null;
        this.f12994l = null;
    }
}
