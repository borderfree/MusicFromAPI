package com.facebook;

import android.content.Intent;
import android.support.p009v4.content.C0456d;
import com.facebook.internal.C2258x;
import com.facebook.internal.C2264y;

/* renamed from: com.facebook.l */
public final class C2277l {

    /* renamed from: a */
    private static volatile C2277l f7313a;

    /* renamed from: b */
    private final C0456d f7314b;

    /* renamed from: c */
    private final C2276k f7315c;

    /* renamed from: d */
    private Profile f7316d;

    C2277l(C0456d dVar, C2276k kVar) {
        C2264y.m10422a((Object) dVar, "localBroadcastManager");
        C2264y.m10422a((Object) kVar, "profileCache");
        this.f7314b = dVar;
        this.f7315c = kVar;
    }

    /* renamed from: a */
    static C2277l m10482a() {
        if (f7313a == null) {
            synchronized (C2277l.class) {
                if (f7313a == null) {
                    f7313a = new C2277l(C0456d.m2097a(C2189f.m10092f()), new C2276k());
                }
            }
        }
        return f7313a;
    }

    /* renamed from: a */
    private void m10483a(Profile profile, Profile profile2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile2);
        this.f7314b.mo1845a(intent);
    }

    /* renamed from: a */
    private void m10484a(Profile profile, boolean z) {
        Profile profile2 = this.f7316d;
        this.f7316d = profile;
        if (z) {
            if (profile != null) {
                this.f7315c.mo7928a(profile);
            } else {
                this.f7315c.mo7929b();
            }
        }
        if (!C2258x.m10391a(profile2, profile)) {
            m10483a(profile2, profile);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7930a(Profile profile) {
        m10484a(profile, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Profile mo7931b() {
        return this.f7316d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo7932c() {
        Profile a = this.f7315c.mo7927a();
        if (a == null) {
            return false;
        }
        m10484a(a, false);
        return true;
    }
}
