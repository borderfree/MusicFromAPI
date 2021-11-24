package com.facebook;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p009v4.content.C0456d;
import android.util.Log;
import com.facebook.AccessToken.C1598a;
import com.facebook.C2196h.C2197a;
import com.facebook.GraphRequest.C1609b;
import com.facebook.internal.C2258x;
import com.facebook.internal.C2264y;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.b */
public final class C2171b {

    /* renamed from: a */
    private static volatile C2171b f7076a;

    /* renamed from: b */
    private final C0456d f7077b;

    /* renamed from: c */
    private final C1616a f7078c;

    /* renamed from: d */
    private AccessToken f7079d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public AtomicBoolean f7080e = new AtomicBoolean(false);

    /* renamed from: f */
    private Date f7081f = new Date(0);

    /* renamed from: com.facebook.b$a */
    private static class C2176a {

        /* renamed from: a */
        public String f7097a;

        /* renamed from: b */
        public int f7098b;

        private C2176a() {
        }
    }

    C2171b(C0456d dVar, C1616a aVar) {
        C2264y.m10422a((Object) dVar, "localBroadcastManager");
        C2264y.m10422a((Object) aVar, "accessTokenCache");
        this.f7077b = dVar;
        this.f7078c = aVar;
    }

    /* renamed from: a */
    private static GraphRequest m10049a(AccessToken accessToken, C1609b bVar) {
        AccessToken accessToken2 = accessToken;
        GraphRequest graphRequest = new GraphRequest(accessToken2, "me/permissions", new Bundle(), HttpMethod.GET, bVar);
        return graphRequest;
    }

    /* renamed from: a */
    static C2171b m10050a() {
        if (f7076a == null) {
            synchronized (C2171b.class) {
                if (f7076a == null) {
                    f7076a = new C2171b(C0456d.m2097a(C2189f.m10092f()), new C1616a());
                }
            }
        }
        return f7076a;
    }

    /* renamed from: a */
    private void m10052a(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.f7077b.mo1845a(intent);
    }

    /* renamed from: a */
    private void m10053a(AccessToken accessToken, boolean z) {
        AccessToken accessToken2 = this.f7079d;
        this.f7079d = accessToken;
        this.f7080e.set(false);
        this.f7081f = new Date(0);
        if (z) {
            if (accessToken != null) {
                this.f7078c.mo6628a(accessToken);
            } else {
                this.f7078c.mo6629b();
                C2258x.m10398b(C2189f.m10092f());
            }
        }
        if (!C2258x.m10391a(accessToken2, accessToken)) {
            m10052a(accessToken2, accessToken);
        }
    }

    /* renamed from: b */
    private static GraphRequest m10055b(AccessToken accessToken, C1609b bVar) {
        Bundle bundle = new Bundle();
        bundle.putString("grant_type", "fb_extend_sso_token");
        GraphRequest graphRequest = new GraphRequest(accessToken, "oauth/access_token", bundle, HttpMethod.GET, bVar);
        return graphRequest;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m10056b(C1598a aVar) {
        final AccessToken accessToken = this.f7079d;
        if (accessToken == null) {
            if (aVar != null) {
                aVar.mo6538a(new FacebookException("No current access token to refresh"));
            }
        } else if (!this.f7080e.compareAndSet(false, true)) {
            if (aVar != null) {
                aVar.mo6538a(new FacebookException("Refresh already in progress"));
            }
        } else {
            this.f7081f = new Date();
            final HashSet hashSet = new HashSet();
            final HashSet hashSet2 = new HashSet();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final C2176a aVar2 = new C2176a();
            C2196h hVar = new C2196h(m10049a(accessToken, (C1609b) new C1609b() {
                /* renamed from: a */
                public void mo6589a(C2199i iVar) {
                    Set set;
                    JSONObject b = iVar.mo7796b();
                    if (b != null) {
                        JSONArray optJSONArray = b.optJSONArray("data");
                        if (optJSONArray != null) {
                            atomicBoolean.set(true);
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                                if (optJSONObject != null) {
                                    String optString = optJSONObject.optString("permission");
                                    String optString2 = optJSONObject.optString("status");
                                    if (!C2258x.m10392a(optString) && !C2258x.m10392a(optString2)) {
                                        String lowerCase = optString2.toLowerCase(Locale.US);
                                        if (lowerCase.equals("granted")) {
                                            set = hashSet;
                                        } else if (lowerCase.equals("declined")) {
                                            set = hashSet2;
                                        } else {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("Unexpected status: ");
                                            sb.append(lowerCase);
                                            Log.w("AccessTokenManager", sb.toString());
                                        }
                                        set.add(optString);
                                    }
                                }
                            }
                        }
                    }
                }
            }), m10055b(accessToken, new C1609b() {
                /* renamed from: a */
                public void mo6589a(C2199i iVar) {
                    JSONObject b = iVar.mo7796b();
                    if (b != null) {
                        aVar2.f7097a = b.optString("access_token");
                        aVar2.f7098b = b.optInt("expires_at");
                    }
                }
            }));
            final C1598a aVar3 = aVar;
            C21754 r0 = new C2197a() {
                /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0052=Splitter:B:18:0x0052, B:46:0x00e2=Splitter:B:46:0x00e2} */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void mo7740a(com.facebook.C2196h r15) {
                    /*
                        r14 = this;
                        r15 = 0
                        r0 = 0
                        com.facebook.b r1 = com.facebook.C2171b.m10050a()     // Catch:{ all -> 0x00fe }
                        com.facebook.AccessToken r1 = r1.mo7736b()     // Catch:{ all -> 0x00fe }
                        if (r1 == 0) goto L_0x00e2
                        com.facebook.b r1 = com.facebook.C2171b.m10050a()     // Catch:{ all -> 0x00fe }
                        com.facebook.AccessToken r1 = r1.mo7736b()     // Catch:{ all -> 0x00fe }
                        java.lang.String r1 = r1.mo6528i()     // Catch:{ all -> 0x00fe }
                        com.facebook.AccessToken r2 = r2     // Catch:{ all -> 0x00fe }
                        java.lang.String r2 = r2.mo6528i()     // Catch:{ all -> 0x00fe }
                        if (r1 == r2) goto L_0x0022
                        goto L_0x00e2
                    L_0x0022:
                        java.util.concurrent.atomic.AtomicBoolean r1 = r4     // Catch:{ all -> 0x00fe }
                        boolean r1 = r1.get()     // Catch:{ all -> 0x00fe }
                        if (r1 != 0) goto L_0x0052
                        com.facebook.b$a r1 = r5     // Catch:{ all -> 0x00fe }
                        java.lang.String r1 = r1.f7097a     // Catch:{ all -> 0x00fe }
                        if (r1 != 0) goto L_0x0052
                        com.facebook.b$a r1 = r5     // Catch:{ all -> 0x00fe }
                        int r1 = r1.f7098b     // Catch:{ all -> 0x00fe }
                        if (r1 != 0) goto L_0x0052
                        com.facebook.AccessToken$a r1 = r3     // Catch:{ all -> 0x00fe }
                        if (r1 == 0) goto L_0x0046
                        com.facebook.AccessToken$a r1 = r3     // Catch:{ all -> 0x00fe }
                        com.facebook.FacebookException r2 = new com.facebook.FacebookException     // Catch:{ all -> 0x00fe }
                        java.lang.String r3 = "Failed to refresh access token"
                        r2.<init>(r3)     // Catch:{ all -> 0x00fe }
                        r1.mo6538a(r2)     // Catch:{ all -> 0x00fe }
                    L_0x0046:
                        com.facebook.b r0 = com.facebook.C2171b.this
                        java.util.concurrent.atomic.AtomicBoolean r0 = r0.f7080e
                        r0.set(r15)
                        com.facebook.AccessToken$a r15 = r3
                        return
                    L_0x0052:
                        com.facebook.AccessToken r1 = new com.facebook.AccessToken     // Catch:{ all -> 0x00fe }
                        com.facebook.b$a r2 = r5     // Catch:{ all -> 0x00fe }
                        java.lang.String r2 = r2.f7097a     // Catch:{ all -> 0x00fe }
                        if (r2 == 0) goto L_0x005f
                        com.facebook.b$a r2 = r5     // Catch:{ all -> 0x00fe }
                        java.lang.String r2 = r2.f7097a     // Catch:{ all -> 0x00fe }
                        goto L_0x0065
                    L_0x005f:
                        com.facebook.AccessToken r2 = r2     // Catch:{ all -> 0x00fe }
                        java.lang.String r2 = r2.mo6518b()     // Catch:{ all -> 0x00fe }
                    L_0x0065:
                        r3 = r2
                        com.facebook.AccessToken r2 = r2     // Catch:{ all -> 0x00fe }
                        java.lang.String r4 = r2.mo6526h()     // Catch:{ all -> 0x00fe }
                        com.facebook.AccessToken r2 = r2     // Catch:{ all -> 0x00fe }
                        java.lang.String r5 = r2.mo6528i()     // Catch:{ all -> 0x00fe }
                        java.util.concurrent.atomic.AtomicBoolean r2 = r4     // Catch:{ all -> 0x00fe }
                        boolean r2 = r2.get()     // Catch:{ all -> 0x00fe }
                        if (r2 == 0) goto L_0x007e
                        java.util.Set r2 = r6     // Catch:{ all -> 0x00fe }
                    L_0x007c:
                        r6 = r2
                        goto L_0x0085
                    L_0x007e:
                        com.facebook.AccessToken r2 = r2     // Catch:{ all -> 0x00fe }
                        java.util.Set r2 = r2.mo6520d()     // Catch:{ all -> 0x00fe }
                        goto L_0x007c
                    L_0x0085:
                        java.util.concurrent.atomic.AtomicBoolean r2 = r4     // Catch:{ all -> 0x00fe }
                        boolean r2 = r2.get()     // Catch:{ all -> 0x00fe }
                        if (r2 == 0) goto L_0x0091
                        java.util.Set r2 = r7     // Catch:{ all -> 0x00fe }
                    L_0x008f:
                        r7 = r2
                        goto L_0x0098
                    L_0x0091:
                        com.facebook.AccessToken r2 = r2     // Catch:{ all -> 0x00fe }
                        java.util.Set r2 = r2.mo6522e()     // Catch:{ all -> 0x00fe }
                        goto L_0x008f
                    L_0x0098:
                        com.facebook.AccessToken r2 = r2     // Catch:{ all -> 0x00fe }
                        com.facebook.AccessTokenSource r8 = r2.mo6524f()     // Catch:{ all -> 0x00fe }
                        com.facebook.b$a r2 = r5     // Catch:{ all -> 0x00fe }
                        int r2 = r2.f7098b     // Catch:{ all -> 0x00fe }
                        if (r2 == 0) goto L_0x00b3
                        java.util.Date r2 = new java.util.Date     // Catch:{ all -> 0x00fe }
                        com.facebook.b$a r9 = r5     // Catch:{ all -> 0x00fe }
                        int r9 = r9.f7098b     // Catch:{ all -> 0x00fe }
                        long r9 = (long) r9     // Catch:{ all -> 0x00fe }
                        r11 = 1000(0x3e8, double:4.94E-321)
                        long r9 = r9 * r11
                        r2.<init>(r9)     // Catch:{ all -> 0x00fe }
                        goto L_0x00b9
                    L_0x00b3:
                        com.facebook.AccessToken r2 = r2     // Catch:{ all -> 0x00fe }
                        java.util.Date r2 = r2.mo6519c()     // Catch:{ all -> 0x00fe }
                    L_0x00b9:
                        r9 = r2
                        java.util.Date r10 = new java.util.Date     // Catch:{ all -> 0x00fe }
                        r10.<init>()     // Catch:{ all -> 0x00fe }
                        r2 = r1
                        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00fe }
                        com.facebook.b r0 = com.facebook.C2171b.m10050a()     // Catch:{ all -> 0x00dd }
                        r0.mo7735a(r1)     // Catch:{ all -> 0x00dd }
                        com.facebook.b r0 = com.facebook.C2171b.this
                        java.util.concurrent.atomic.AtomicBoolean r0 = r0.f7080e
                        r0.set(r15)
                        com.facebook.AccessToken$a r15 = r3
                        if (r15 == 0) goto L_0x00dc
                        com.facebook.AccessToken$a r15 = r3
                        r15.mo6537a(r1)
                    L_0x00dc:
                        return
                    L_0x00dd:
                        r0 = move-exception
                        r13 = r1
                        r1 = r0
                        r0 = r13
                        goto L_0x00ff
                    L_0x00e2:
                        com.facebook.AccessToken$a r1 = r3     // Catch:{ all -> 0x00fe }
                        if (r1 == 0) goto L_0x00f2
                        com.facebook.AccessToken$a r1 = r3     // Catch:{ all -> 0x00fe }
                        com.facebook.FacebookException r2 = new com.facebook.FacebookException     // Catch:{ all -> 0x00fe }
                        java.lang.String r3 = "No current access token to refresh"
                        r2.<init>(r3)     // Catch:{ all -> 0x00fe }
                        r1.mo6538a(r2)     // Catch:{ all -> 0x00fe }
                    L_0x00f2:
                        com.facebook.b r0 = com.facebook.C2171b.this
                        java.util.concurrent.atomic.AtomicBoolean r0 = r0.f7080e
                        r0.set(r15)
                        com.facebook.AccessToken$a r15 = r3
                        return
                    L_0x00fe:
                        r1 = move-exception
                    L_0x00ff:
                        com.facebook.b r2 = com.facebook.C2171b.this
                        java.util.concurrent.atomic.AtomicBoolean r2 = r2.f7080e
                        r2.set(r15)
                        com.facebook.AccessToken$a r15 = r3
                        if (r15 == 0) goto L_0x0113
                        if (r0 == 0) goto L_0x0113
                        com.facebook.AccessToken$a r15 = r3
                        r15.mo6537a(r0)
                    L_0x0113:
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.C2171b.C21754.mo7740a(com.facebook.h):void");
                }
            };
            hVar.mo7774a((C2197a) r0);
            hVar.mo7788h();
        }
    }

    /* renamed from: e */
    private boolean m10057e() {
        boolean z = false;
        if (this.f7079d == null) {
            return false;
        }
        Long valueOf = Long.valueOf(new Date().getTime());
        if (this.f7079d.mo6524f().canExtendToken() && valueOf.longValue() - this.f7081f.getTime() > 3600000 && valueOf.longValue() - this.f7079d.mo6525g().getTime() > 86400000) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7734a(final C1598a aVar) {
        if (Looper.getMainLooper().equals(Looper.myLooper())) {
            m10056b(aVar);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    C2171b.this.m10056b(aVar);
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7735a(AccessToken accessToken) {
        m10053a(accessToken, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public AccessToken mo7736b() {
        return this.f7079d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo7737c() {
        AccessToken a = this.f7078c.mo6627a();
        if (a == null) {
            return false;
        }
        m10053a(a, false);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo7738d() {
        if (m10057e()) {
            mo7734a((C1598a) null);
        }
    }
}
