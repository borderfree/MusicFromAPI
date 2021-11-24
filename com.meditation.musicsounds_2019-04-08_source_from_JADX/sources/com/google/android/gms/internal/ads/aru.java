package com.google.android.gms.internal.ads;

import android.support.p009v4.p019g.C0510m;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import java.util.Arrays;
import java.util.List;

@C3464ci
public final class aru extends atv implements ase {

    /* renamed from: a */
    private final arl f13015a;

    /* renamed from: b */
    private final String f13016b;

    /* renamed from: c */
    private final C0510m<String, arp> f13017c;

    /* renamed from: d */
    private final C0510m<String, String> f13018d;

    /* renamed from: e */
    private aos f13019e;

    /* renamed from: f */
    private View f13020f;

    /* renamed from: g */
    private final Object f13021g = new Object();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public asb f13022h;

    public aru(String str, C0510m<String, arp> mVar, C0510m<String, String> mVar2, arl arl, aos aos, View view) {
        this.f13016b = str;
        this.f13017c = mVar;
        this.f13018d = mVar2;
        this.f13015a = arl;
        this.f13019e = aos;
        this.f13020f = view;
    }

    /* renamed from: a */
    public final String mo12397a(String str) {
        return (String) this.f13018d.get(str);
    }

    /* renamed from: a */
    public final List<String> mo12398a() {
        String[] strArr = new String[(this.f13017c.size() + this.f13018d.size())];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f13017c.size()) {
            strArr[i3] = (String) this.f13017c.mo2010b(i2);
            i2++;
            i3++;
        }
        while (i < this.f13018d.size()) {
            strArr[i3] = (String) this.f13018d.mo2010b(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    /* renamed from: a */
    public final void mo12359a(asb asb) {
        synchronized (this.f13021g) {
            this.f13022h = asb;
        }
    }

    /* renamed from: a */
    public final boolean mo12399a(C3323b bVar) {
        if (this.f13022h == null) {
            C3731me.m19174c("Attempt to call renderVideoInMediaView before ad initialized.");
            return false;
        } else if (this.f13020f == null) {
            return false;
        } else {
            FrameLayout frameLayout = (FrameLayout) C3327d.m15137a(bVar);
            this.f13022h.mo12451a((View) frameLayout, (arz) new arv(this));
            return true;
        }
    }

    /* renamed from: b */
    public final C3323b mo12400b() {
        return C3327d.m15136a(this.f13022h);
    }

    /* renamed from: b */
    public final asy mo12401b(String str) {
        return (asy) this.f13017c.get(str);
    }

    /* renamed from: c */
    public final aos mo12402c() {
        return this.f13019e;
    }

    /* renamed from: c */
    public final void mo12403c(String str) {
        synchronized (this.f13021g) {
            if (this.f13022h == null) {
                C3731me.m19174c("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.f13022h.mo12452a(null, str, null, null, null);
            }
        }
    }

    /* renamed from: d */
    public final void mo12404d() {
        synchronized (this.f13021g) {
            if (this.f13022h == null) {
                C3731me.m19174c("#002 Attempt to record impression before native ad initialized.");
            } else {
                this.f13022h.mo12433a((View) null, null);
            }
        }
    }

    /* renamed from: e */
    public final C3323b mo12405e() {
        return C3327d.m15136a(this.f13022h.mo12460m().getApplicationContext());
    }

    /* renamed from: f */
    public final void mo12406f() {
        C3653jh.f14275a.post(new arw(this));
        this.f13019e = null;
        this.f13020f = null;
    }

    /* renamed from: k */
    public final String mo12371k() {
        return "3";
    }

    /* renamed from: l */
    public final String mo12372l() {
        return this.f13016b;
    }

    /* renamed from: m */
    public final arl mo12373m() {
        return this.f13015a;
    }

    /* renamed from: o */
    public final View mo12375o() {
        return this.f13020f;
    }
}
