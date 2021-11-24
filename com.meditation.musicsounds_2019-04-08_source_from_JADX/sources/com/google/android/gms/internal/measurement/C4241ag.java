package com.google.android.gms.internal.measurement;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.analytics.C2931a;
import com.google.android.gms.analytics.C2942f;
import com.google.android.gms.analytics.C2948l;
import com.google.android.gms.analytics.C2950n;
import com.google.android.gms.analytics.C2952p;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.p123d.C3181c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.ag */
final class C4241ag extends C4497s {

    /* renamed from: a */
    private boolean f15706a;

    /* renamed from: b */
    private final C4238ad f15707b;

    /* renamed from: c */
    private final C4274bm f15708c;

    /* renamed from: d */
    private final C4273bl f15709d;

    /* renamed from: e */
    private final C4503y f15710e;

    /* renamed from: f */
    private long f15711f = Long.MIN_VALUE;

    /* renamed from: g */
    private final C4255au f15712g;

    /* renamed from: h */
    private final C4255au f15713h;

    /* renamed from: i */
    private final C4285bx f15714i;

    /* renamed from: j */
    private long f15715j;

    /* renamed from: k */
    private boolean f15716k;

    protected C4241ag(C4499u uVar, C4501w wVar) {
        super(uVar);
        C3266s.m14913a(wVar);
        this.f15709d = new C4273bl(uVar);
        this.f15707b = new C4238ad(uVar);
        this.f15708c = new C4274bm(uVar);
        this.f15710e = new C4503y(uVar);
        this.f15714i = new C4285bx(mo14825h());
        this.f15712g = new C4242ah(this, uVar);
        this.f15713h = new C4243ai(this, uVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final void m20954A() {
        try {
            this.f15707b.mo14115f();
            mo14132f();
        } catch (SQLiteException e) {
            mo14819d("Failed to delete stale hits", e);
        }
        this.f15713h.mo14151a(86400000);
    }

    /* renamed from: B */
    private final void m20955B() {
        if (!this.f15716k && C4253as.m20997b() && !this.f15710e.mo14870b()) {
            if (this.f15714i.mo14210a(((Long) C4262ba.f15743C.mo14166a()).longValue())) {
                this.f15714i.mo14209a();
                mo14811b("Connecting to service");
                if (this.f15710e.mo14871c()) {
                    mo14811b("Connected to service");
                    this.f15714i.mo14211b();
                    mo14131e();
                }
            }
        }
    }

    /* renamed from: C */
    private final boolean m20956C() {
        C2952p.m13827d();
        mo14840x();
        mo14811b("Dispatching a batch of local hits");
        boolean z = !this.f15708c.mo14188b();
        if (!(!this.f15710e.mo14870b()) || !z) {
            long max = (long) Math.max(C4253as.m21001f(), C4253as.m21002g());
            ArrayList arrayList = new ArrayList();
            long j = 0;
            while (true) {
                try {
                    this.f15707b.mo14108b();
                    arrayList.clear();
                    try {
                        List<C4267bf> a = this.f15707b.mo14105a(max);
                        if (a.isEmpty()) {
                            mo14811b("Store is empty, nothing to dispatch");
                            m20959F();
                            try {
                                this.f15707b.mo14111c();
                                this.f15707b.mo14113d();
                                return false;
                            } catch (SQLiteException e) {
                                mo14822e("Failed to commit local dispatch transaction", e);
                                m20959F();
                                return false;
                            }
                        } else {
                            mo14808a("Hits loaded from store. count", Integer.valueOf(a.size()));
                            for (C4267bf c : a) {
                                if (c.mo14169c() == j) {
                                    mo14820d("Database contains successfully uploaded hit", Long.valueOf(j), Integer.valueOf(a.size()));
                                    m20959F();
                                    try {
                                        return false;
                                    } catch (SQLiteException e2) {
                                        mo14822e("Failed to commit local dispatch transaction", e2);
                                        m20959F();
                                        return false;
                                    }
                                }
                            }
                            if (this.f15710e.mo14870b()) {
                                mo14811b("Service connected, sending hits to the service");
                                while (!a.isEmpty()) {
                                    C4267bf bfVar = (C4267bf) a.get(0);
                                    if (this.f15710e.mo14869a(bfVar)) {
                                        j = Math.max(j, bfVar.mo14169c());
                                        a.remove(bfVar);
                                        mo14812b("Hit sent do device AnalyticsService for delivery", bfVar);
                                        this.f15707b.mo14109b(bfVar.mo14169c());
                                        arrayList.add(Long.valueOf(bfVar.mo14169c()));
                                    }
                                }
                            }
                            if (this.f15708c.mo14188b()) {
                                List<Long> a2 = this.f15708c.mo14187a(a);
                                for (Long longValue : a2) {
                                    j = Math.max(j, longValue.longValue());
                                }
                                try {
                                    this.f15707b.mo14107a(a2);
                                    arrayList.addAll(a2);
                                } catch (SQLiteException e3) {
                                    mo14822e("Failed to remove successfully uploaded hits", e3);
                                    m20959F();
                                    try {
                                        this.f15707b.mo14111c();
                                        this.f15707b.mo14113d();
                                        return false;
                                    } catch (SQLiteException e4) {
                                        mo14822e("Failed to commit local dispatch transaction", e4);
                                        m20959F();
                                        return false;
                                    }
                                }
                            }
                            if (arrayList.isEmpty()) {
                                try {
                                    this.f15707b.mo14111c();
                                    this.f15707b.mo14113d();
                                    return false;
                                } catch (SQLiteException e5) {
                                    mo14822e("Failed to commit local dispatch transaction", e5);
                                    m20959F();
                                    return false;
                                }
                            } else {
                                try {
                                    this.f15707b.mo14111c();
                                    this.f15707b.mo14113d();
                                } catch (SQLiteException e6) {
                                    mo14822e("Failed to commit local dispatch transaction", e6);
                                    m20959F();
                                    return false;
                                }
                            }
                        }
                    } catch (SQLiteException e7) {
                        mo14819d("Failed to read hits from persisted store", e7);
                        m20959F();
                        try {
                            this.f15707b.mo14111c();
                            this.f15707b.mo14113d();
                            return false;
                        } catch (SQLiteException e8) {
                            mo14822e("Failed to commit local dispatch transaction", e8);
                            m20959F();
                            return false;
                        }
                    }
                } catch (SQLiteException e9) {
                    mo14822e("Failed to remove hit that was send for delivery", e9);
                    m20959F();
                    try {
                        return false;
                    } catch (SQLiteException e10) {
                        mo14822e("Failed to commit local dispatch transaction", e10);
                        m20959F();
                        return false;
                    }
                } finally {
                    try {
                        this.f15707b.mo14111c();
                        this.f15707b.mo14113d();
                    } catch (SQLiteException e11) {
                        mo14822e("Failed to commit local dispatch transaction", e11);
                        m20959F();
                        return false;
                    }
                }
            }
        } else {
            mo14811b("No network or service available. Will retry later");
            return false;
        }
    }

    /* renamed from: D */
    private final long m20957D() {
        C2952p.m13827d();
        mo14840x();
        try {
            return this.f15707b.mo14116z();
        } catch (SQLiteException e) {
            mo14822e("Failed to get min/max hit times from local store", e);
            return 0;
        }
    }

    /* renamed from: E */
    private final void m20958E() {
        C4258ax o = mo14832o();
        if (o.mo14159b() && !o.mo14160c()) {
            long D = m20957D();
            if (D != 0 && Math.abs(mo14825h().mo11326a() - D) <= ((Long) C4262ba.f15766h.mo14166a()).longValue()) {
                mo14808a("Dispatch alarm scheduled (ms)", Long.valueOf(C4253as.m21000e()));
                o.mo14161d();
            }
        }
    }

    /* renamed from: F */
    private final void m20959F() {
        if (this.f15712g.mo14154c()) {
            mo14811b("All hits dispatched or no network/service. Going to power save mode");
        }
        this.f15712g.mo14155d();
        C4258ax o = mo14832o();
        if (o.mo14160c()) {
            o.mo14162e();
        }
    }

    /* renamed from: G */
    private final long m20960G() {
        if (this.f15711f != Long.MIN_VALUE) {
            return this.f15711f;
        }
        long longValue = ((Long) C4262ba.f15763e.mo14166a()).longValue();
        C4287bz p = mo14833p();
        p.mo14840x();
        if (p.f15844a) {
            C4287bz p2 = mo14833p();
            p2.mo14840x();
            longValue = ((long) p2.f15845b) * 1000;
        }
        return longValue;
    }

    /* renamed from: H */
    private final void m20961H() {
        mo14840x();
        C2952p.m13827d();
        this.f15716k = true;
        this.f15710e.mo14872d();
        mo14132f();
    }

    /* renamed from: a */
    private final void m20963a(C4502x xVar, C4476ip ipVar) {
        C3266s.m14913a(xVar);
        C3266s.m14913a(ipVar);
        C2942f fVar = new C2942f(mo14824g());
        fVar.mo10618b(xVar.mo14865c());
        fVar.mo10619b(xVar.mo14866d());
        C2948l g = fVar.mo10621g();
        C4402g gVar = (C4402g) g.mo10630b(C4402g.class);
        gVar.mo14536a("data");
        gVar.mo14540b(true);
        g.mo10629a((C2950n) ipVar);
        C4261b bVar = (C4261b) g.mo10630b(C4261b.class);
        C4452hw hwVar = (C4452hw) g.mo10630b(C4452hw.class);
        for (Entry entry : xVar.mo14868f().entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if ("an".equals(str)) {
                hwVar.mo14632a(str2);
            } else if ("av".equals(str)) {
                hwVar.mo14634b(str2);
            } else if ("aid".equals(str)) {
                hwVar.mo14636c(str2);
            } else if ("aiid".equals(str)) {
                hwVar.mo14638d(str2);
            } else if ("uid".equals(str)) {
                gVar.mo14542c(str2);
            } else {
                bVar.mo14164a(str, str2);
            }
        }
        mo14813b("Sending installation campaign to", xVar.mo14865c(), ipVar);
        g.mo10628a(mo14834q().mo14193b());
        g.mo10634e();
    }

    /* renamed from: g */
    private final boolean m20965g(String str) {
        return C3181c.m14658a(mo14826i()).mo11122a(str) == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final void m20966z() {
        mo14124a((C4259ay) new C4245ak(this));
    }

    /* renamed from: a */
    public final long mo14122a(C4502x xVar, boolean z) {
        C3266s.m14913a(xVar);
        mo14840x();
        C2952p.m13827d();
        try {
            this.f15707b.mo14108b();
            C4238ad adVar = this.f15707b;
            long a = xVar.mo14862a();
            String b = xVar.mo14864b();
            C3266s.m14915a(b);
            adVar.mo14840x();
            C2952p.m13827d();
            int delete = adVar.mo14103A().delete("properties", "app_uid=? AND cid<>?", new String[]{String.valueOf(a), b});
            if (delete > 0) {
                adVar.mo14808a("Deleted property records", Integer.valueOf(delete));
            }
            long a2 = this.f15707b.mo14104a(xVar.mo14862a(), xVar.mo14864b(), xVar.mo14865c());
            xVar.mo14863a(1 + a2);
            C4238ad adVar2 = this.f15707b;
            C3266s.m14913a(xVar);
            adVar2.mo14840x();
            C2952p.m13827d();
            SQLiteDatabase A = adVar2.mo14103A();
            Map f = xVar.mo14868f();
            C3266s.m14913a(f);
            Builder builder = new Builder();
            for (Entry entry : f.entrySet()) {
                builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            String encodedQuery = builder.build().getEncodedQuery();
            if (encodedQuery == null) {
                encodedQuery = "";
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_uid", Long.valueOf(xVar.mo14862a()));
            contentValues.put("cid", xVar.mo14864b());
            contentValues.put("tid", xVar.mo14865c());
            contentValues.put("adid", Integer.valueOf(xVar.mo14866d() ? 1 : 0));
            contentValues.put("hits_count", Long.valueOf(xVar.mo14867e()));
            contentValues.put("params", encodedQuery);
            try {
                if (A.insertWithOnConflict("properties", null, contentValues, 5) == -1) {
                    adVar2.mo14823f("Failed to insert/update a property (got -1)");
                }
            } catch (SQLiteException e) {
                adVar2.mo14822e("Error storing a property", e);
            }
            this.f15707b.mo14111c();
            try {
            } catch (SQLiteException e2) {
                mo14822e("Failed to end transaction", e2);
            }
            return a2;
        } catch (SQLiteException e3) {
            mo14822e("Failed to update Analytics property", e3);
            try {
            } catch (SQLiteException e4) {
                mo14822e("Failed to end transaction", e4);
            }
            return -1;
        } finally {
            try {
                this.f15707b.mo14113d();
            } catch (SQLiteException e5) {
                mo14822e("Failed to end transaction", e5);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10611a() {
        this.f15707b.mo14841y();
        this.f15708c.mo14841y();
        this.f15710e.mo14841y();
    }

    /* renamed from: a */
    public final void mo14123a(long j) {
        C2952p.m13827d();
        mo14840x();
        if (j < 0) {
            j = 0;
        }
        this.f15711f = j;
        mo14132f();
    }

    /* renamed from: a */
    public final void mo14124a(C4259ay ayVar) {
        long j = this.f15715j;
        C2952p.m13827d();
        mo14840x();
        long d = mo14834q().mo14195d();
        mo14812b("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(d != 0 ? Math.abs(mo14825h().mo11326a() - d) : -1));
        m20955B();
        try {
            m20956C();
            mo14834q().mo14196e();
            mo14132f();
            if (ayVar != null) {
                ayVar.mo14135a(null);
            }
            if (this.f15715j != j) {
                this.f15709d.mo14183c();
            }
        } catch (Exception e) {
            mo14822e("Local dispatch failed", e);
            mo14834q().mo14196e();
            mo14132f();
            if (ayVar != null) {
                ayVar.mo14135a(e);
            }
        }
    }

    /* renamed from: a */
    public final void mo14125a(C4267bf bfVar) {
        C3266s.m14913a(bfVar);
        C2952p.m13827d();
        mo14840x();
        if (this.f15716k) {
            mo14815c("Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions");
        } else {
            mo14808a("Delivering hit", bfVar);
        }
        if (TextUtils.isEmpty(bfVar.mo14174h())) {
            Pair a = mo14834q().mo14198z().mo14199a();
            if (a != null) {
                Long l = (Long) a.second;
                String str = (String) a.first;
                String valueOf = String.valueOf(l);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
                sb.append(valueOf);
                sb.append(":");
                sb.append(str);
                String sb2 = sb.toString();
                HashMap hashMap = new HashMap(bfVar.mo14168b());
                hashMap.put("_m", sb2);
                C4267bf bfVar2 = new C4267bf(this, hashMap, bfVar.mo14170d(), bfVar.mo14172f(), bfVar.mo14169c(), bfVar.mo14167a(), bfVar.mo14171e());
                bfVar = bfVar2;
            }
        }
        m20955B();
        if (this.f15710e.mo14869a(bfVar)) {
            mo14815c("Hit sent to the device AnalyticsService for delivery");
            return;
        }
        try {
            this.f15707b.mo14106a(bfVar);
            mo14132f();
        } catch (SQLiteException e) {
            mo14822e("Delivery failed to save hit to a database", e);
            mo14827j().mo14179a(bfVar, "deliver: failed to insert hit to database");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14126a(C4502x xVar) {
        C2952p.m13827d();
        mo14812b("Sending first hit to property", xVar.mo14865c());
        if (!mo14834q().mo14194c().mo14210a(C4253as.m21006l())) {
            String f = mo14834q().mo14197f();
            if (!TextUtils.isEmpty(f)) {
                C4476ip a = C4286by.m21129a(mo14827j(), f);
                mo14812b("Found relevant installation campaign", a);
                m20963a(xVar, a);
            }
        }
    }

    /* renamed from: a */
    public final void mo14127a(String str) {
        C3266s.m14915a(str);
        C2952p.m13827d();
        C4476ip a = C4286by.m21129a(mo14827j(), str);
        if (a == null) {
            mo14819d("Parsing failed. Ignoring invalid campaign data", str);
            return;
        }
        String f = mo14834q().mo14197f();
        if (str.equals(f)) {
            mo14821e("Ignoring duplicate install campaign");
        } else if (!TextUtils.isEmpty(f)) {
            mo14820d("Ignoring multiple install campaigns. original, new", f, str);
        } else {
            mo14834q().mo14192a(str);
            if (mo14834q().mo14194c().mo14210a(C4253as.m21006l())) {
                mo14819d("Campaign received too late, ignoring", a);
                return;
            }
            mo14812b("Received installation campaign", a);
            for (C4502x a2 : this.f15707b.mo14110c(0)) {
                m20963a(a2, a);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo14128b() {
        mo14840x();
        C3266s.m14920a(!this.f15706a, (Object) "Analytics backend already started");
        this.f15706a = true;
        mo14829l().mo10647a((Runnable) new C4244aj(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo14129c() {
        mo14840x();
        C2952p.m13827d();
        Context a = mo14824g().mo14842a();
        if (!C4279br.m21111a(a)) {
            mo14821e("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!C4280bs.m21114a(a)) {
            mo14823f("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!C2931a.m13734a(a)) {
            mo14821e("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        mo14834q().mo14193b();
        if (!m20965g("android.permission.ACCESS_NETWORK_STATE")) {
            mo14823f("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            m20961H();
        }
        if (!m20965g("android.permission.INTERNET")) {
            mo14823f("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            m20961H();
        }
        if (C4280bs.m21114a(mo14826i())) {
            mo14811b("AnalyticsService registered in the app manifest and enabled");
        } else {
            mo14821e("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!this.f15716k && !this.f15707b.mo14114e()) {
            m20955B();
        }
        mo14132f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo14130d() {
        C2952p.m13827d();
        this.f15715j = mo14825h().mo11326a();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044 A[LOOP:1: B:15:0x0044->B:23:?, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0040 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14131e() {
        /*
            r5 = this;
            com.google.android.gms.analytics.C2952p.m13827d()
            com.google.android.gms.analytics.C2952p.m13827d()
            r5.mo14840x()
            boolean r0 = com.google.android.gms.internal.measurement.C4253as.m20997b()
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "Service client disabled. Can't dispatch local hits to device AnalyticsService"
            r5.mo14821e(r0)
        L_0x0014:
            com.google.android.gms.internal.measurement.y r0 = r5.f15710e
            boolean r0 = r0.mo14870b()
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "Service not connected"
            r5.mo14811b(r0)
            return
        L_0x0022:
            com.google.android.gms.internal.measurement.ad r0 = r5.f15707b
            boolean r0 = r0.mo14114e()
            if (r0 != 0) goto L_0x007d
            java.lang.String r0 = "Dispatching local hits to device AnalyticsService"
            r5.mo14811b(r0)
        L_0x002f:
            com.google.android.gms.internal.measurement.ad r0 = r5.f15707b     // Catch:{ SQLiteException -> 0x0074 }
            int r1 = com.google.android.gms.internal.measurement.C4253as.m21001f()     // Catch:{ SQLiteException -> 0x0074 }
            long r1 = (long) r1     // Catch:{ SQLiteException -> 0x0074 }
            java.util.List r0 = r0.mo14105a(r1)     // Catch:{ SQLiteException -> 0x0074 }
            boolean r1 = r0.isEmpty()     // Catch:{ SQLiteException -> 0x0074 }
            if (r1 == 0) goto L_0x0044
            r5.mo14132f()     // Catch:{ SQLiteException -> 0x0074 }
            return
        L_0x0044:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x002f
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            com.google.android.gms.internal.measurement.bf r1 = (com.google.android.gms.internal.measurement.C4267bf) r1
            com.google.android.gms.internal.measurement.y r2 = r5.f15710e
            boolean r2 = r2.mo14869a(r1)
            if (r2 != 0) goto L_0x005d
            r5.mo14132f()
            return
        L_0x005d:
            r0.remove(r1)
            com.google.android.gms.internal.measurement.ad r2 = r5.f15707b     // Catch:{ SQLiteException -> 0x006a }
            long r3 = r1.mo14169c()     // Catch:{ SQLiteException -> 0x006a }
            r2.mo14109b(r3)     // Catch:{ SQLiteException -> 0x006a }
            goto L_0x0044
        L_0x006a:
            r0 = move-exception
            java.lang.String r1 = "Failed to remove hit that was send for delivery"
            r5.mo14822e(r1, r0)
            r5.m20959F()
            return
        L_0x0074:
            r0 = move-exception
            java.lang.String r1 = "Failed to read hits from store"
            r5.mo14822e(r1, r0)
            r5.m20959F()
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4241ag.mo14131e():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        if (r4 > 0) goto L_0x007e;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14132f() {
        /*
            r8 = this;
            com.google.android.gms.analytics.C2952p.m13827d()
            r8.mo14840x()
            boolean r0 = r8.f15716k
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0017
            long r4 = r8.m20960G()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0017
            r0 = 1
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 != 0) goto L_0x0023
            com.google.android.gms.internal.measurement.bl r0 = r8.f15709d
            r0.mo14182b()
            r8.m20959F()
            return
        L_0x0023:
            com.google.android.gms.internal.measurement.ad r0 = r8.f15707b
            boolean r0 = r0.mo14114e()
            if (r0 == 0) goto L_0x0034
            com.google.android.gms.internal.measurement.bl r0 = r8.f15709d
            r0.mo14182b()
            r8.m20959F()
            return
        L_0x0034:
            com.google.android.gms.internal.measurement.bb<java.lang.Boolean> r0 = com.google.android.gms.internal.measurement.C4262ba.f15784z
            java.lang.Object r0 = r0.mo14166a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x004d
            com.google.android.gms.internal.measurement.bl r0 = r8.f15709d
            r0.mo14181a()
            com.google.android.gms.internal.measurement.bl r0 = r8.f15709d
            boolean r1 = r0.mo14184d()
        L_0x004d:
            if (r1 == 0) goto L_0x00a8
            r8.m20958E()
            long r0 = r8.m20960G()
            com.google.android.gms.internal.measurement.bo r4 = r8.mo14834q()
            long r4 = r4.mo14195d()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0076
            com.google.android.gms.common.util.e r6 = r8.mo14825h()
            long r6 = r6.mo11326a()
            long r6 = r6 - r4
            long r4 = java.lang.Math.abs(r6)
            long r4 = r0 - r4
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0076
            goto L_0x007e
        L_0x0076:
            long r2 = com.google.android.gms.internal.measurement.C4253as.m20999d()
            long r4 = java.lang.Math.min(r2, r0)
        L_0x007e:
            java.lang.String r0 = "Dispatch scheduled (ms)"
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r8.mo14808a(r0, r1)
            com.google.android.gms.internal.measurement.au r0 = r8.f15712g
            boolean r0 = r0.mo14154c()
            if (r0 == 0) goto L_0x00a2
            r0 = 1
            com.google.android.gms.internal.measurement.au r2 = r8.f15712g
            long r2 = r2.mo14152b()
            long r4 = r4 + r2
            long r0 = java.lang.Math.max(r0, r4)
            com.google.android.gms.internal.measurement.au r2 = r8.f15712g
            r2.mo14153b(r0)
            return
        L_0x00a2:
            com.google.android.gms.internal.measurement.au r0 = r8.f15712g
            r0.mo14151a(r4)
            return
        L_0x00a8:
            r8.m20959F()
            r8.m20958E()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4241ag.mo14132f():void");
    }
}
