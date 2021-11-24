package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class arx extends auv implements asf {

    /* renamed from: a */
    private String f13025a;

    /* renamed from: b */
    private List<arp> f13026b;

    /* renamed from: c */
    private String f13027c;

    /* renamed from: d */
    private asy f13028d;

    /* renamed from: e */
    private String f13029e;

    /* renamed from: f */
    private String f13030f;

    /* renamed from: g */
    private double f13031g;

    /* renamed from: h */
    private String f13032h;

    /* renamed from: i */
    private String f13033i;

    /* renamed from: j */
    private arl f13034j;

    /* renamed from: k */
    private aos f13035k;

    /* renamed from: l */
    private View f13036l;

    /* renamed from: m */
    private C3323b f13037m;

    /* renamed from: n */
    private String f13038n;

    /* renamed from: o */
    private Bundle f13039o;

    /* renamed from: p */
    private Object f13040p = new Object();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public asb f13041q;

    public arx(String str, List<arp> list, String str2, asy asy, String str3, String str4, double d, String str5, String str6, arl arl, aos aos, View view, C3323b bVar, String str7, Bundle bundle) {
        this.f13025a = str;
        this.f13026b = list;
        this.f13027c = str2;
        this.f13028d = asy;
        this.f13029e = str3;
        this.f13030f = str4;
        this.f13031g = d;
        this.f13032h = str5;
        this.f13033i = str6;
        this.f13034j = arl;
        this.f13035k = aos;
        this.f13036l = view;
        this.f13037m = bVar;
        this.f13038n = str7;
        this.f13039o = bundle;
    }

    /* renamed from: a */
    public final String mo12410a() {
        return this.f13025a;
    }

    /* renamed from: a */
    public final void mo12411a(Bundle bundle) {
        synchronized (this.f13040p) {
            if (this.f13041q == null) {
                C3643iy.m19174c("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.f13041q.mo12454b(bundle);
            }
        }
    }

    /* renamed from: a */
    public final void mo12359a(asb asb) {
        synchronized (this.f13040p) {
            this.f13041q = asb;
        }
    }

    /* renamed from: a */
    public final void mo12412a(aur aur) {
        this.f13041q.mo12437a(aur);
    }

    /* renamed from: b */
    public final List mo12360b() {
        return this.f13026b;
    }

    /* renamed from: b */
    public final boolean mo12413b(Bundle bundle) {
        synchronized (this.f13040p) {
            if (this.f13041q == null) {
                C3643iy.m19174c("#002 Attempt to record impression before native ad initialized.");
                return false;
            }
            boolean a = this.f13041q.mo12453a(bundle);
            return a;
        }
    }

    /* renamed from: c */
    public final String mo12414c() {
        return this.f13027c;
    }

    /* renamed from: c */
    public final void mo12415c(Bundle bundle) {
        synchronized (this.f13040p) {
            if (this.f13041q == null) {
                C3643iy.m19174c("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.f13041q.mo12456c(bundle);
            }
        }
    }

    /* renamed from: d */
    public final asy mo12416d() {
        return this.f13028d;
    }

    /* renamed from: e */
    public final String mo12417e() {
        return this.f13029e;
    }

    /* renamed from: f */
    public final String mo12418f() {
        return this.f13030f;
    }

    /* renamed from: g */
    public final double mo12419g() {
        return this.f13031g;
    }

    /* renamed from: h */
    public final String mo12420h() {
        return this.f13032h;
    }

    /* renamed from: i */
    public final String mo12421i() {
        return this.f13033i;
    }

    /* renamed from: j */
    public final aos mo12422j() {
        return this.f13035k;
    }

    /* renamed from: k */
    public final String mo12371k() {
        return "6";
    }

    /* renamed from: l */
    public final String mo12372l() {
        return "";
    }

    /* renamed from: m */
    public final arl mo12373m() {
        return this.f13034j;
    }

    /* renamed from: n */
    public final C3323b mo12423n() {
        return C3327d.m15136a(this.f13041q);
    }

    /* renamed from: o */
    public final View mo12375o() {
        return this.f13036l;
    }

    /* renamed from: p */
    public final C3323b mo12424p() {
        return this.f13037m;
    }

    /* renamed from: q */
    public final String mo12425q() {
        return this.f13038n;
    }

    /* renamed from: r */
    public final Bundle mo12426r() {
        return this.f13039o;
    }

    /* renamed from: s */
    public final asu mo12427s() {
        return this.f13034j;
    }

    /* renamed from: t */
    public final void mo12428t() {
        C3653jh.f14275a.post(new ary(this));
    }

    /* renamed from: u */
    public final void mo12429u() {
        this.f13041q.mo12441c();
    }
}
