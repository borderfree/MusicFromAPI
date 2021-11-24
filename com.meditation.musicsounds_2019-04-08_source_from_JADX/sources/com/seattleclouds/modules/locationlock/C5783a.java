package com.seattleclouds.modules.locationlock;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.content.C0452b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.location.C5431g;
import com.seattleclouds.location.C5431g.C5433b;
import com.seattleclouds.location.geofencing.C5450c;
import com.seattleclouds.util.C6569aa;
import com.seattleclouds.util.C6569aa.C6570a;
import com.seattleclouds.util.C6593am;
import com.seattleclouds.util.C6620n;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.seattleclouds.modules.locationlock.a */
public class C5783a extends C6557s {

    /* renamed from: a */
    private View f20476a;
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public float f20477ae = 5.0f;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public Map<String, C5450c> f20478af = null;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public int f20479ag = 0;
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public boolean f20480ah = true;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public int f20481ai = 10;
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public String f20482aj = "";

    /* renamed from: ak */
    private String f20483ak;

    /* renamed from: al */
    private Date f20484al;

    /* renamed from: am */
    private boolean f20485am = true;
    /* access modifiers changed from: private */

    /* renamed from: an */
    public boolean f20486an = false;

    /* renamed from: ao */
    private ScheduledThreadPoolExecutor f20487ao = new ScheduledThreadPoolExecutor(1);
    /* access modifiers changed from: private */

    /* renamed from: ap */
    public ScheduledFuture<?> f20488ap = null;
    /* access modifiers changed from: private */

    /* renamed from: aq */
    public boolean f20489aq;

    /* renamed from: b */
    private Button f20490b;

    /* renamed from: c */
    private TextView f20491c;

    /* renamed from: d */
    private ProgressBar f20492d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f20493e = "";

    /* renamed from: f */
    private String f20494f = "com.seattleclouds.modules.locationlock.LocationLockFragment";

    /* renamed from: g */
    private C5431g f20495g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Location f20496h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f20497i = 0;

    /* renamed from: com.seattleclouds.modules.locationlock.a$a */
    private class C5789a extends AsyncTask<Void, Void, String> {
        private C5789a() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x009b, code lost:
            r9 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x009c, code lost:
            r1 = "LocationLockFragment.PrepareDataAsyncTask";
            r2 = new java.lang.StringBuilder();
            r3 = "Error parsing config file: ";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a5, code lost:
            r2.append(r3);
            r2.append(r9);
            android.util.Log.e(r1, r2.toString());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b2, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b3, code lost:
            r9 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b4, code lost:
            r1 = "LocationLockFragment.PrepareDataAsyncTask";
            r2 = new java.lang.StringBuilder();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bb, code lost:
            r3 = "Error loading config file: ";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00be, code lost:
            r9 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bf, code lost:
            r1 = "LocationLockFragment.PrepareDataAsyncTask";
            r2 = new java.lang.StringBuilder();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00b3 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:4:0x000f] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00be A[ExcHandler: IllegalArgumentException (e java.lang.IllegalArgumentException), Splitter:B:4:0x000f] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.Void... r9) {
            /*
                r8 = this;
                com.seattleclouds.modules.locationlock.a r9 = com.seattleclouds.modules.locationlock.C5783a.this
                android.support.v4.app.h r9 = r9.mo1318s()
                r0 = 0
                if (r9 != 0) goto L_0x000a
                return r0
            L_0x000a:
                java.util.HashMap r9 = new java.util.HashMap
                r9.<init>()
                com.seattleclouds.modules.locationlock.a r1 = com.seattleclouds.modules.locationlock.C5783a.this     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                java.lang.String r1 = r1.f20493e     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                java.io.InputStream r1 = com.seattleclouds.App.m25649e(r1)     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                java.lang.String r1 = com.seattleclouds.util.C6613i.m31991b(r1)     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                r2.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                java.lang.String r1 = "items"
                org.json.JSONArray r1 = r2.getJSONArray(r1)     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                r3 = 0
            L_0x0029:
                int r4 = r1.length()     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                if (r3 >= r4) goto L_0x0062
                org.json.JSONObject r4 = r1.getJSONObject(r3)     // Catch:{ JSONException -> 0x0038, IllegalArgumentException -> 0x00be, IOException -> 0x00b3 }
                com.seattleclouds.location.geofencing.c r4 = com.seattleclouds.location.geofencing.C5450c.m27234a(r4)     // Catch:{ JSONException -> 0x0038, IllegalArgumentException -> 0x00be, IOException -> 0x00b3 }
                goto L_0x0050
            L_0x0038:
                r4 = move-exception
                java.lang.String r5 = "LocationLockFragment.PrepareDataAsyncTask"
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                r6.<init>()     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                java.lang.String r7 = "Error parsing geofence: "
                r6.append(r7)     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                r6.append(r3)     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                java.lang.String r6 = r6.toString()     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                android.util.Log.w(r5, r6, r4)     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                r4 = r0
            L_0x0050:
                if (r4 == 0) goto L_0x005f
                boolean r5 = r4.mo17767k()     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                if (r5 == 0) goto L_0x005f
                java.lang.String r5 = r4.mo17755a()     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                r9.put(r5, r4)     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
            L_0x005f:
                int r3 = r3 + 1
                goto L_0x0029
            L_0x0062:
                com.seattleclouds.modules.locationlock.a r1 = com.seattleclouds.modules.locationlock.C5783a.this     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                r1.f20478af = r9     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                com.seattleclouds.modules.locationlock.a r9 = com.seattleclouds.modules.locationlock.C5783a.this     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                java.lang.String r1 = "lockOutsideRegion"
                boolean r1 = r2.getBoolean(r1)     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                r9.f20480ah = r1     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                com.seattleclouds.modules.locationlock.a r9 = com.seattleclouds.modules.locationlock.C5783a.this     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                java.lang.String r1 = "lockDelay"
                int r1 = r2.getInt(r1)     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                r9.f20481ai = r1     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                com.seattleclouds.modules.locationlock.a r9 = com.seattleclouds.modules.locationlock.C5783a.this     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                java.lang.String r1 = "lockPageId"
                java.lang.String r1 = r2.getString(r1)     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                r9.f20482aj = r1     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                com.seattleclouds.modules.locationlock.a r9 = com.seattleclouds.modules.locationlock.C5783a.this     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                java.lang.String r1 = "locatingTimeout"
                int r1 = r2.getInt(r1)     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                r9.f20479ag = r1     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                com.seattleclouds.modules.locationlock.a r9 = com.seattleclouds.modules.locationlock.C5783a.this     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                r9.m28470az()     // Catch:{ IllegalArgumentException -> 0x00be, IOException -> 0x00b3, JSONException -> 0x009b }
                java.lang.String r9 = "ok"
                return r9
            L_0x009b:
                r9 = move-exception
                java.lang.String r1 = "LocationLockFragment.PrepareDataAsyncTask"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Error parsing config file: "
            L_0x00a5:
                r2.append(r3)
                r2.append(r9)
                java.lang.String r9 = r2.toString()
                android.util.Log.e(r1, r9)
                return r0
            L_0x00b3:
                r9 = move-exception
                java.lang.String r1 = "LocationLockFragment.PrepareDataAsyncTask"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
            L_0x00bb:
                java.lang.String r3 = "Error loading config file: "
                goto L_0x00a5
            L_0x00be:
                r9 = move-exception
                java.lang.String r1 = "LocationLockFragment.PrepareDataAsyncTask"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                goto L_0x00bb
            */
            throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.locationlock.C5783a.C5789a.doInBackground(java.lang.Void[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            if (C5783a.this.mo1318s() != null) {
                if (str == null) {
                    C5783a.this.f20480ah = true;
                    C5783a.this.f20481ai = 10;
                    C5783a.this.f20482aj = null;
                    C5783a.this.f20479ag = 0;
                }
                C5783a.this.m28478c();
            }
        }
    }

    /* renamed from: a */
    private double m28452a(Location location, C5450c cVar) {
        Location location2 = new Location("codeGenerated");
        location2.setLatitude(cVar.mo17759c());
        location2.setLongitude(cVar.mo17760d());
        return (double) location.distanceTo(location2);
    }

    /* renamed from: a */
    private int m28454a(Date date) {
        if (date == null) {
            return Integer.MAX_VALUE;
        }
        return (int) ((new Date().getTime() - date.getTime()) / 60000);
    }

    /* renamed from: a */
    private boolean m28460a(C5450c cVar) {
        return cVar.mo17759c() == 0.0d && cVar.mo17760d() == 0.0d && cVar.mo17762f() != null && cVar.mo17763g() != null;
    }

    /* renamed from: aA */
    private void m28462aA() {
        if (mo1318s() != null) {
            Editor edit = mo1318s().getSharedPreferences(this.f20494f, 0).edit();
            edit.putString("unlockedGeofenceId", this.f20483ak);
            edit.putLong("unlockedGeofenceDate", this.f20484al.getTime());
            edit.commit();
        }
    }

    /* renamed from: aB */
    private void m28463aB() {
        if (this.f20482aj == null || this.f20482aj.trim().length() <= 0) {
            m28489m(false);
            C6620n.m32028a((Context) mo1318s(), C5462k.warning, C5462k.location_lock_locked_message);
            return;
        }
        App.m25622a(this.f20482aj, (Fragment) this);
    }

    /* renamed from: aC */
    private void m28464aC() {
        m28465aD();
        this.f20488ap = this.f20487ao.schedule(new Runnable() {
            public void run() {
                if (C5783a.this.mo1318s() != null) {
                    C5783a.this.mo1318s().runOnUiThread(new Runnable() {
                        public void run() {
                            if (C5783a.this.mo1318s() != null) {
                                C5783a.this.m28479c("Timed Out");
                                C5783a.this.f20488ap = null;
                            }
                        }
                    });
                }
            }
        }, this.f20479ag > 0 ? (long) this.f20479ag : 10, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: private */
    /* renamed from: aD */
    public void m28465aD() {
        if (this.f20488ap != null) {
            this.f20488ap.cancel(false);
            this.f20488ap = null;
        }
    }

    /* renamed from: aE */
    private void m28466aE() {
        if (this.f20485am) {
            this.f20485am = false;
            m28473b();
        }
        if (this.f20486an) {
            m28489m(false);
        }
    }

    /* renamed from: aF */
    private boolean m28467aF() {
        if (C0452b.m2065b((Context) mo1318s(), "android.permission.ACCESS_FINE_LOCATION") == 0) {
            return false;
        }
        this.f20489aq = true;
        C6569aa.m31791a((Fragment) this, 102, "android.permission.ACCESS_FINE_LOCATION", new int[]{C5462k.location_lock_permission_rationale, C5462k.location_lock_permission_required_toast});
        return true;
    }

    /* renamed from: as */
    private void m28468as() {
        if (this.f20478af != null && !this.f20486an) {
            this.f20486an = true;
            C5450c at = m28469at();
            if (at != null) {
                this.f20483ak = at.mo17755a();
                this.f20484al = new Date();
                m28462aA();
                m28474b(at);
                return;
            }
            if (this.f20483ak != null && this.f20483ak.trim().length() > 0) {
                C5450c cVar = (C5450c) this.f20478af.get(this.f20483ak);
                if (cVar != null && !m28460a(cVar) && (!this.f20480ah || m28454a(this.f20484al) < this.f20481ai)) {
                    m28474b(cVar);
                    return;
                }
            }
            if (this.f20496h == null) {
                m28489m(false);
                C6620n.m32028a((Context) mo1318s(), C5462k.error, C5462k.location_lock_couldnt_get_location);
                return;
            }
            m28463aB();
        }
    }

    /* renamed from: at */
    private C5450c m28469at() {
        C5450c cVar = null;
        if (!(this.f20478af == null || this.f20496h == null)) {
            double d = -1.0d;
            for (String str : this.f20478af.keySet()) {
                C5450c cVar2 = (C5450c) this.f20478af.get(str);
                double a = m28452a(this.f20496h, cVar2);
                if (!((cVar2.mo17759c() != 0.0d && cVar2.mo17760d() != 0.0d) || cVar2.mo17762f() == null || cVar2.mo17763g() == null) || a <= ((double) cVar2.mo17761e())) {
                    Date date = new Date();
                    if (cVar2.mo17762f() == null || cVar2.mo17763g() == null || (!date.before(cVar2.mo17762f()) && !date.after(cVar2.mo17763g()))) {
                        if (d < 0.0d || a < d) {
                            cVar = cVar2;
                            d = a;
                        }
                    }
                }
            }
        }
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: az */
    public void m28470az() {
        if (mo1318s() != null) {
            SharedPreferences sharedPreferences = mo1318s().getSharedPreferences(this.f20494f, 0);
            this.f20483ak = sharedPreferences.getString("unlockedGeofenceId", "");
            this.f20484al = new Date(sharedPreferences.getLong("unlockedGeofenceDate", 0));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m28473b() {
        m28489m(true);
        this.f20486an = false;
        this.f20497i = 0;
        this.f20496h = null;
        if (this.f20478af != null) {
            m28478c();
        } else {
            new C5789a().execute(new Void[0]);
        }
    }

    /* renamed from: b */
    private void m28474b(C5450c cVar) {
        if (mo1318s() != null) {
            C0367h s = mo1318s();
            if ("page".equals(cVar.mo17764h())) {
                Object obj = cVar.mo17765i().get("pageId");
                if (obj != null && (obj instanceof String)) {
                    String str = (String) obj;
                    if (str.trim().length() > 0) {
                        if (!this.f20480ah) {
                            App.m25622a(str, (Fragment) this);
                            return;
                        }
                        FragmentInfo a = App.m25606a(App.m25655h(str), (Context) s);
                        if (a != null) {
                            long j = ((long) this.f20481ai) * 60;
                            if (m28460a(cVar)) {
                                j = (cVar.mo17763g().getTime() - System.currentTimeMillis()) / 1000;
                            }
                            Intent intent = new Intent(s, AutoFinishPageFragmentActivity.class);
                            intent.putExtra("ARG_PAGE_FRAGMENT_INFO", a);
                            intent.putExtra("PAGE_TRANSITION", a.mo16869b().getString("PAGE_TRANSITION"));
                            intent.putExtra("ARG_FINISH_TIMEOUT", j);
                            s.startActivity(intent);
                            return;
                        }
                    }
                }
            }
            m28489m(false);
            C6620n.m32028a((Context) s, C5462k.error, C5462k.location_lock_no_unlocked_page_configured);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m28478c() {
        if (mo1318s() != null) {
            if (this.f20478af == null || this.f20478af.size() <= 0) {
                m28489m(false);
                C6620n.m32028a((Context) mo1318s(), C5462k.error, C5462k.location_lock_no_locations);
            } else {
                m28481d();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m28479c(String str) {
        m28483e();
        m28468as();
    }

    /* renamed from: d */
    private void m28481d() {
        if (mo1318s() != null) {
            m28464aC();
            this.f20495g = new C5431g(mo1318s(), new C5433b(false) {
                /* renamed from: a */
                public void mo17721a(Location location) {
                    super.mo17721a(location);
                    if (C5783a.this.mo1318s() != null && !C5783a.this.f20486an) {
                        C5783a.this.f20497i = C5783a.this.f20497i + 1;
                        if (System.currentTimeMillis() - location.getTime() <= 5000) {
                            if (C5783a.this.f20496h == null || location.getAccuracy() <= C5783a.this.f20496h.getAccuracy() + 0.5f) {
                                C5783a.this.f20496h = location;
                                if (C5783a.this.f20479ag == 0 || location.getAccuracy() <= C5783a.this.f20477ae + 0.5f) {
                                    C5783a.this.m28465aD();
                                    C5783a.this.m28479c("Acquired Location");
                                }
                            }
                        }
                    }
                }
            });
            this.f20495g.mo17728a(500).mo17729a(false).mo17730a();
        }
    }

    /* renamed from: e */
    private void m28483e() {
        if (this.f20495g != null) {
            this.f20495g.mo17731b();
            this.f20495g = null;
        }
    }

    /* renamed from: m */
    private void m28489m(boolean z) {
        int i = 8;
        this.f20476a.setVisibility(z ? 0 : 8);
        Button button = this.f20490b;
        if (!z) {
            i = 0;
        }
        button.setVisibility(i);
    }

    /* renamed from: J */
    public void mo1200J() {
        super.mo1200J();
    }

    /* renamed from: L */
    public void mo1202L() {
        super.mo1202L();
        this.f20487ao.shutdown();
        m28483e();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5460i.fragment_location_lock, viewGroup, false);
        this.f20490b = (Button) inflate.findViewById(C5458g.unlock_button);
        this.f20490b.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C5783a.this.m28473b();
            }
        });
        this.f20476a = inflate.findViewById(C5458g.locating_container);
        this.f20491c = (TextView) inflate.findViewById(C5458g.locating_label);
        this.f20492d = (ProgressBar) inflate.findViewById(C5458g.progress_bar_location_lock);
        this.f20489aq = false;
        Bundle m = mo1307m();
        if (m != null) {
            String string = m.getString("PAGE_ID");
            if (string != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string.substring(0, string.lastIndexOf(".")));
                sb.append(".json");
                this.f20493e = sb.toString();
            }
            String string2 = m.getString("ARG_STORE_ID");
            if (string2 != null && string2.trim().length() > 0) {
                this.f20494f = string2;
            }
            Bundle bundle2 = m.getBundle("PAGE_STYLE");
            C6593am.m31914a(inflate, bundle2);
            C6593am.m31915a((TextView) inflate.findViewById(C5458g.locating_label), bundle2);
        }
        if (bundle != null) {
            this.f20489aq = bundle.getBoolean("keyRotation");
            if (this.f20489aq || (!this.f20489aq && mo1318s().mo1469g().mo1535a("permissionDialog") != null)) {
                this.f20491c.setText(C5462k.location_lock_permission_rationale_info);
                this.f20492d.setVisibility(8);
            }
        }
        return inflate;
    }

    /* renamed from: a */
    public void mo1224a(int i, String[] strArr, int[] iArr) {
        if (i == 102) {
            if (!C6569aa.m31801a(strArr, iArr, "android.permission.ACCESS_FINE_LOCATION")) {
                new Handler(Looper.myLooper()).postDelayed(new Runnable() {
                    public void run() {
                        C6570a.m31804a(false, C5462k.location_lock_permission_denied).mo1448a(C5783a.this.mo1318s().mo1469g(), "permissionDialog");
                        C5783a.this.f20489aq = false;
                    }
                }, 400);
            } else {
                Toast.makeText(mo1318s(), C5462k.common_permission_granted, 0).show();
                this.f20489aq = false;
                this.f20491c.setText(C5462k.location_lock_locating);
                this.f20492d.setVisibility(0);
                m28466aE();
            }
        }
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        this.f20487ao.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (z) {
            if (C6569aa.m31796a()) {
                if (mo1318s().mo1469g().mo1535a("permissionDialog") == null && !this.f20489aq) {
                    if (m28467aF()) {
                        this.f20491c.setText(C5462k.location_lock_permission_rationale_info);
                        this.f20492d.setVisibility(8);
                        return;
                    }
                } else {
                    return;
                }
            }
            m28466aE();
        }
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        bundle.putBoolean("keyRotation", this.f20489aq);
        super.mo1282e(bundle);
    }

    /* renamed from: h */
    public void mo1292h() {
        super.mo1292h();
        if (this.f20486an) {
            m28489m(false);
        }
    }
}
