package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* renamed from: com.google.android.gms.measurement.internal.ad */
final class C4620ad extends C4662bs {

    /* renamed from: a */
    static final Pair<String, Long> f16645a = new Pair<>("", Long.valueOf(0));

    /* renamed from: b */
    public C4624ah f16646b;

    /* renamed from: c */
    public final C4623ag f16647c = new C4623ag(this, "last_upload", 0);

    /* renamed from: d */
    public final C4623ag f16648d = new C4623ag(this, "last_upload_attempt", 0);

    /* renamed from: e */
    public final C4623ag f16649e = new C4623ag(this, "backoff", 0);

    /* renamed from: f */
    public final C4623ag f16650f = new C4623ag(this, "last_delete_stale", 0);

    /* renamed from: g */
    public final C4623ag f16651g = new C4623ag(this, "midnight_offset", 0);

    /* renamed from: h */
    public final C4623ag f16652h = new C4623ag(this, "first_open_time", 0);

    /* renamed from: i */
    public final C4623ag f16653i = new C4623ag(this, "app_install_time", 0);

    /* renamed from: j */
    public final C4625ai f16654j = new C4625ai(this, "app_instance_id", null);

    /* renamed from: k */
    public final C4623ag f16655k = new C4623ag(this, "time_before_start", 10000);

    /* renamed from: l */
    public final C4623ag f16656l = new C4623ag(this, "session_timeout", 1800000);

    /* renamed from: m */
    public final C4622af f16657m = new C4622af(this, "start_new_session", true);

    /* renamed from: n */
    public final C4623ag f16658n = new C4623ag(this, "last_pause_time", 0);

    /* renamed from: o */
    public final C4623ag f16659o = new C4623ag(this, "time_active", 0);

    /* renamed from: p */
    public boolean f16660p;

    /* renamed from: r */
    private SharedPreferences f16661r;

    /* renamed from: s */
    private String f16662s;

    /* renamed from: t */
    private boolean f16663t;

    /* renamed from: u */
    private long f16664u;

    C4620ad(C4638av avVar) {
        super(avVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final SharedPreferences m22931y() {
        mo15239d();
        mo15395A();
        return this.f16661r;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Pair<String, Boolean> mo15262a(String str) {
        mo15239d();
        long b = mo15248m().mo11327b();
        if (this.f16662s != null && b < this.f16664u) {
            return new Pair<>(this.f16662s, Boolean.valueOf(this.f16663t));
        }
        this.f16664u = b + mo15255t().mo15732a(str, C4756h.f17173j);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(mo15249n());
            if (advertisingIdInfo != null) {
                this.f16662s = advertisingIdInfo.getId();
                this.f16663t = advertisingIdInfo.isLimitAdTrackingEnabled();
            }
            if (this.f16662s == null) {
                this.f16662s = "";
            }
        } catch (Exception e) {
            mo15253r().mo15854w().mo15859a("Unable to get advertising id", e);
            this.f16662s = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.f16662s, Boolean.valueOf(this.f16663t));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo15263a(boolean z) {
        mo15239d();
        mo15253r().mo15855x().mo15859a("Setting useService", Boolean.valueOf(z));
        Editor edit = m22931y().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo15264a(long j) {
        return j - this.f16656l.mo15283a() > this.f16658n.mo15283a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final String mo15265b(String str) {
        mo15239d();
        String str2 = (String) mo15262a(str).first;
        MessageDigest i = C4736ek.m23545i();
        if (i == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, i.digest(str2.getBytes()))});
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo15266b(boolean z) {
        mo15239d();
        mo15253r().mo15855x().mo15859a("Setting measurementEnabled", Boolean.valueOf(z));
        Editor edit = m22931y().edit();
        edit.putBoolean("measurement_enabled", z);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo15267c(String str) {
        mo15239d();
        Editor edit = m22931y().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo15268c(boolean z) {
        mo15239d();
        return m22931y().getBoolean("measurement_enabled", z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo15269d(String str) {
        mo15239d();
        Editor edit = m22931y().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo15270d(boolean z) {
        mo15239d();
        mo15253r().mo15855x().mo15859a("Updating deferred analytics collection", Boolean.valueOf(z));
        Editor edit = m22931y().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo15271e() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo15272f() {
        this.f16661r = mo15249n().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f16660p = this.f16661r.getBoolean("has_been_opened", false);
        if (!this.f16660p) {
            Editor edit = this.f16661r.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        C4624ah ahVar = new C4624ah(this, "health_monitor", Math.max(0, ((Long) C4756h.f17174k.mo15821b()).longValue()));
        this.f16646b = ahVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final String mo15273g() {
        mo15239d();
        return m22931y().getString("gmp_app_id", null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final String mo15274h() {
        mo15239d();
        return m22931y().getString("admob_app_id", null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final Boolean mo15275i() {
        mo15239d();
        if (!m22931y().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(m22931y().getBoolean("use_service", false));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final void mo15276j() {
        mo15239d();
        mo15253r().mo15855x().mo15858a("Clearing collection preferences.");
        if (mo15255t().mo15734a(C4756h.f17155aq)) {
            Boolean k = mo15277k();
            Editor edit = m22931y().edit();
            edit.clear();
            edit.apply();
            if (k != null) {
                mo15266b(k.booleanValue());
            }
            return;
        }
        boolean contains = m22931y().contains("measurement_enabled");
        boolean z = true;
        if (contains) {
            z = mo15268c(true);
        }
        Editor edit2 = m22931y().edit();
        edit2.clear();
        edit2.apply();
        if (contains) {
            mo15266b(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final Boolean mo15277k() {
        mo15239d();
        if (m22931y().contains("measurement_enabled")) {
            return Boolean.valueOf(m22931y().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final String mo15278v() {
        mo15239d();
        String string = m22931y().getString("previous_os_version", null);
        mo15247l().mo15395A();
        String str = VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            Editor edit = m22931y().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final boolean mo15279w() {
        mo15239d();
        return m22931y().getBoolean("deferred_analytics_collection", false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public final boolean mo15280x() {
        return this.f16661r.contains("deferred_analytics_collection");
    }
}
