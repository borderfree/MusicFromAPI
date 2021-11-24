package com.facebook.appevents;

import android.content.Intent;
import android.os.Bundle;
import android.support.p009v4.content.C0456d;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.C2189f;
import com.facebook.C2199i;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C1609b;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger.FlushBehavior;
import com.facebook.internal.C2230m;
import com.facebook.internal.C2232n;
import com.facebook.internal.C2240r;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.appevents.c */
class C2142c {

    /* renamed from: a */
    private static final String f7014a = "com.facebook.appevents.c";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static volatile C2141b f7015b = new C2141b();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final ScheduledExecutorService f7016c = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static ScheduledFuture f7017d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final Runnable f7018e = new Runnable() {
        public void run() {
            C2142c.f7017d = null;
            if (AppEventsLogger.m9939a() != FlushBehavior.EXPLICIT_ONLY) {
                C2142c.m9981b(FlushReason.TIMER);
            }
        }
    };

    C2142c() {
    }

    /* renamed from: a */
    private static GraphRequest m9971a(final AccessTokenAppIdPair accessTokenAppIdPair, final C2152f fVar, boolean z, final C2151e eVar) {
        String applicationId = accessTokenAppIdPair.getApplicationId();
        boolean z2 = false;
        C2230m a = C2232n.m10237a(applicationId, false);
        final GraphRequest a2 = GraphRequest.m8026a((AccessToken) null, String.format("%s/activities", new Object[]{applicationId}), (JSONObject) null, (C1609b) null);
        Bundle e = a2.mo6580e();
        if (e == null) {
            e = new Bundle();
        }
        e.putString("access_token", accessTokenAppIdPair.getAccessTokenString());
        String d = AppEventsLogger.m9951d();
        if (d != null) {
            e.putString("device_token", d);
        }
        a2.mo6571a(e);
        if (a != null) {
            z2 = a.mo7847a();
        }
        int a3 = fVar.mo7705a(a2, C2189f.m10092f(), z2, z);
        if (a3 == 0) {
            return null;
        }
        eVar.f7029a += a3;
        a2.mo6572a((C1609b) new C1609b() {
            /* renamed from: a */
            public void mo6589a(C2199i iVar) {
                C2142c.m9980b(accessTokenAppIdPair, a2, iVar, fVar, eVar);
            }
        });
        return a2;
    }

    /* renamed from: a */
    private static C2151e m9973a(FlushReason flushReason, C2141b bVar) {
        C2151e eVar = new C2151e();
        boolean b = C2189f.m10087b(C2189f.m10092f());
        ArrayList<GraphRequest> arrayList = new ArrayList<>();
        for (AccessTokenAppIdPair accessTokenAppIdPair : bVar.mo7694a()) {
            GraphRequest a = m9971a(accessTokenAppIdPair, bVar.mo7693a(accessTokenAppIdPair), b, eVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        C2240r.m10259a(LoggingBehavior.APP_EVENTS, f7014a, "Flushing %d events due to %s.", Integer.valueOf(eVar.f7029a), flushReason.toString());
        for (GraphRequest i : arrayList) {
            i.mo6584i();
        }
        return eVar;
    }

    /* renamed from: a */
    public static void m9975a() {
        f7016c.execute(new Runnable() {
            public void run() {
                C2149d.m9990a(C2142c.f7015b);
                C2142c.f7015b = new C2141b();
            }
        });
    }

    /* renamed from: a */
    public static void m9977a(final AccessTokenAppIdPair accessTokenAppIdPair, final AppEvent appEvent) {
        f7016c.execute(new Runnable() {
            public void run() {
                C2142c.f7015b.mo7695a(accessTokenAppIdPair, appEvent);
                if (AppEventsLogger.m9939a() != FlushBehavior.EXPLICIT_ONLY && C2142c.f7015b.mo7697b() > 100) {
                    C2142c.m9981b(FlushReason.EVENT_THRESHOLD);
                } else if (C2142c.f7017d == null) {
                    C2142c.f7017d = C2142c.f7016c.schedule(C2142c.f7018e, 15, TimeUnit.SECONDS);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m9978a(final FlushReason flushReason) {
        f7016c.execute(new Runnable() {
            public void run() {
                C2142c.m9981b(flushReason);
            }
        });
    }

    /* renamed from: b */
    public static Set<AccessTokenAppIdPair> m9979b() {
        return f7015b.mo7694a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m9980b(final AccessTokenAppIdPair accessTokenAppIdPair, GraphRequest graphRequest, C2199i iVar, final C2152f fVar, C2151e eVar) {
        String str;
        FacebookRequestError a = iVar.mo7795a();
        String str2 = "Success";
        FlushResult flushResult = FlushResult.SUCCESS;
        boolean z = true;
        if (a != null) {
            if (a.mo6555c() == -1) {
                str2 = "Failed: No Connectivity";
                flushResult = FlushResult.NO_CONNECTIVITY;
            } else {
                str2 = String.format("Failed:\n  Response: %s\n  Error %s", new Object[]{iVar.toString(), a.toString()});
                flushResult = FlushResult.SERVER_ERROR;
            }
        }
        if (C2189f.m10084a(LoggingBehavior.APP_EVENTS)) {
            try {
                str = new JSONArray((String) graphRequest.mo6583h()).toString(2);
            } catch (JSONException unused) {
                str = "<Can't encode events for debug logging>";
            }
            C2240r.m10259a(LoggingBehavior.APP_EVENTS, f7014a, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", graphRequest.mo6570a().toString(), str2, str);
        }
        if (a == null) {
            z = false;
        }
        fVar.mo7707a(z);
        if (flushResult == FlushResult.NO_CONNECTIVITY) {
            C2189f.m10090d().execute(new Runnable() {
                public void run() {
                    C2149d.m9988a(accessTokenAppIdPair, fVar);
                }
            });
        }
        if (flushResult != FlushResult.SUCCESS && eVar.f7030b != FlushResult.NO_CONNECTIVITY) {
            eVar.f7030b = flushResult;
        }
    }

    /* renamed from: b */
    static void m9981b(FlushReason flushReason) {
        f7015b.mo7696a(C2149d.m9987a());
        try {
            C2151e a = m9973a(flushReason, f7015b);
            if (a != null) {
                Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", a.f7029a);
                intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", a.f7030b);
                C0456d.m2097a(C2189f.m10092f()).mo1845a(intent);
            }
        } catch (Exception e) {
            Log.w(f7014a, "Caught unexpected exception while flushing app events: ", e);
        }
    }
}
