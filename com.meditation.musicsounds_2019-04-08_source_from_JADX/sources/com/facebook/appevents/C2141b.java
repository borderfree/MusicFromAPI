package com.facebook.appevents;

import android.content.Context;
import com.facebook.C2189f;
import com.facebook.internal.C2202b;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.facebook.appevents.b */
class C2141b {

    /* renamed from: a */
    private final HashMap<AccessTokenAppIdPair, C2152f> f7013a = new HashMap<>();

    /* renamed from: b */
    private synchronized C2152f m9965b(AccessTokenAppIdPair accessTokenAppIdPair) {
        C2152f fVar;
        fVar = (C2152f) this.f7013a.get(accessTokenAppIdPair);
        if (fVar == null) {
            Context f = C2189f.m10092f();
            fVar = new C2152f(C2202b.m10150a(f), AppEventsLogger.m9949b(f));
        }
        this.f7013a.put(accessTokenAppIdPair, fVar);
        return fVar;
    }

    /* renamed from: a */
    public synchronized C2152f mo7693a(AccessTokenAppIdPair accessTokenAppIdPair) {
        return (C2152f) this.f7013a.get(accessTokenAppIdPair);
    }

    /* renamed from: a */
    public synchronized Set<AccessTokenAppIdPair> mo7694a() {
        return this.f7013a.keySet();
    }

    /* renamed from: a */
    public synchronized void mo7695a(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
        m9965b(accessTokenAppIdPair).mo7706a(appEvent);
    }

    /* renamed from: a */
    public synchronized void mo7696a(PersistedEvents persistedEvents) {
        if (persistedEvents != null) {
            for (AccessTokenAppIdPair accessTokenAppIdPair : persistedEvents.keySet()) {
                C2152f b = m9965b(accessTokenAppIdPair);
                for (AppEvent a : persistedEvents.get(accessTokenAppIdPair)) {
                    b.mo7706a(a);
                }
            }
        }
    }

    /* renamed from: b */
    public synchronized int mo7697b() {
        int i;
        i = 0;
        for (C2152f a : this.f7013a.values()) {
            i += a.mo7704a();
        }
        return i;
    }
}
