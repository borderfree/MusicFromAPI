package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.security.NetworkSecurityPolicy;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.C3309n;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.ja */
public final class C3646ja {
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: a */
    Editor f14247a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f14248b = new Object();

    /* renamed from: c */
    private C3751my<?> f14249c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public CopyOnWriteArraySet<C3650je> f14250d = new CopyOnWriteArraySet<>();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: e */
    public SharedPreferences f14251e;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: f */
    public boolean f14252f = false;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: g */
    public boolean f14253g = true;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: h */
    public String f14254h;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: i */
    public String f14255i;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: j */
    public boolean f14256j = false;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: k */
    public String f14257k = "";
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: l */
    public long f14258l = 0;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: m */
    public long f14259m = 0;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: n */
    public long f14260n = 0;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: o */
    public int f14261o = -1;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: p */
    public int f14262p = 0;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: q */
    public Set<String> f14263q = Collections.emptySet();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: r */
    public JSONObject f14264r = new JSONObject();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: s */
    public boolean f14265s = true;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: t */
    public boolean f14266t = true;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18789a(Bundle bundle) {
        new C3648jc(this, bundle).mo11913c();
    }

    /* access modifiers changed from: private */
    @TargetApi(23)
    /* renamed from: n */
    public static boolean m18814n() {
        return C3309n.m15078j() && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    /* renamed from: o */
    private final void m18816o() {
        if (this.f14249c != null && !this.f14249c.isDone()) {
            try {
                this.f14249c.get(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                C3643iy.m19175c("Interrupted while waiting for preferences loaded.", e);
            } catch (CancellationException | ExecutionException | TimeoutException e2) {
                C3643iy.m19173b("Fail to initialize AdSharedPreferenceManager.", e2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final Bundle m18817p() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("listener_registration_bundle", true);
        synchronized (this.f14248b) {
            bundle.putBoolean("use_https", this.f14253g);
            bundle.putBoolean("content_url_opted_out", this.f14265s);
            bundle.putBoolean("content_vertical_opted_out", this.f14266t);
            bundle.putBoolean("auto_collect_location", this.f14256j);
            bundle.putInt("version_code", this.f14262p);
            bundle.putStringArray("never_pool_slots", (String[]) this.f14263q.toArray(new String[this.f14263q.size()]));
            bundle.putString("app_settings_json", this.f14257k);
            bundle.putLong("app_settings_last_update_ms", this.f14258l);
            bundle.putLong("app_last_background_time_ms", this.f14259m);
            bundle.putInt("request_in_session_count", this.f14261o);
            bundle.putLong("first_ad_req_time_ms", this.f14260n);
            bundle.putString("native_advanced_settings", this.f14264r.toString());
            if (this.f14254h != null) {
                bundle.putString("content_url_hashes", this.f14254h);
            }
            if (this.f14255i != null) {
                bundle.putString("content_vertical_hashes", this.f14255i);
            }
        }
        return bundle;
    }

    /* renamed from: a */
    public final void mo13092a(int i) {
        m18816o();
        synchronized (this.f14248b) {
            if (this.f14262p != i) {
                this.f14262p = i;
                if (this.f14247a != null) {
                    this.f14247a.putInt("version_code", i);
                    this.f14247a.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putInt("version_code", i);
                m18789a(bundle);
            }
        }
    }

    /* renamed from: a */
    public final void mo13093a(long j) {
        m18816o();
        synchronized (this.f14248b) {
            if (this.f14259m != j) {
                this.f14259m = j;
                if (this.f14247a != null) {
                    this.f14247a.putLong("app_last_background_time_ms", j);
                    this.f14247a.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("app_last_background_time_ms", j);
                m18789a(bundle);
            }
        }
    }

    /* renamed from: a */
    public final void mo13094a(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f14249c = (C3751my) new C3647jb(this, context).mo11913c();
    }

    /* renamed from: a */
    public final void mo13095a(C3650je jeVar) {
        synchronized (this.f14248b) {
            if (this.f14249c != null && this.f14249c.isDone()) {
                jeVar.mo13045a(m18817p());
            }
            this.f14250d.add(jeVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13096a(@javax.annotation.Nullable java.lang.String r4) {
        /*
            r3 = this;
            r3.m18816o()
            java.lang.Object r0 = r3.f14248b
            monitor-enter(r0)
            if (r4 == 0) goto L_0x0034
            java.lang.String r1 = r3.f14254h     // Catch:{ all -> 0x0032 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0011
            goto L_0x0034
        L_0x0011:
            r3.f14254h = r4     // Catch:{ all -> 0x0032 }
            android.content.SharedPreferences$Editor r1 = r3.f14247a     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0023
            android.content.SharedPreferences$Editor r1 = r3.f14247a     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = "content_url_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0032 }
            android.content.SharedPreferences$Editor r1 = r3.f14247a     // Catch:{ all -> 0x0032 }
            r1.apply()     // Catch:{ all -> 0x0032 }
        L_0x0023:
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x0032 }
            r1.<init>()     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = "content_url_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0032 }
            r3.m18789a(r1)     // Catch:{ all -> 0x0032 }
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r4 = move-exception
            goto L_0x0036
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3646ja.mo13096a(java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo13097a(String str, String str2, boolean z) {
        m18816o();
        synchronized (this.f14248b) {
            JSONArray optJSONArray = this.f14264r.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            int i = 0;
            while (true) {
                if (i < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        if (!str2.equals(optJSONObject.optString("template_id"))) {
                            i++;
                        } else if (!z || optJSONObject.optBoolean("uses_media_view", false) != z) {
                            length = i;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", zzbv.zzer().mo11326a());
                optJSONArray.put(length, jSONObject);
                this.f14264r.put(str, optJSONArray);
            } catch (JSONException e) {
                C3643iy.m19175c("Could not update native advanced settings", e);
            }
            if (this.f14247a != null) {
                this.f14247a.putString("native_advanced_settings", this.f14264r.toString());
                this.f14247a.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", this.f14264r.toString());
            m18789a(bundle);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13098a(boolean r4) {
        /*
            r3 = this;
            r3.m18816o()
            java.lang.Object r0 = r3.f14248b
            monitor-enter(r0)
            boolean r1 = r3.f14253g     // Catch:{ all -> 0x0031 }
            if (r1 != r4) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return
        L_0x000c:
            r3.f14253g = r4     // Catch:{ all -> 0x0031 }
            android.content.SharedPreferences$Editor r1 = r3.f14247a     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x001e
            android.content.SharedPreferences$Editor r1 = r3.f14247a     // Catch:{ all -> 0x0031 }
            java.lang.String r2 = "use_https"
            r1.putBoolean(r2, r4)     // Catch:{ all -> 0x0031 }
            android.content.SharedPreferences$Editor r1 = r3.f14247a     // Catch:{ all -> 0x0031 }
            r1.apply()     // Catch:{ all -> 0x0031 }
        L_0x001e:
            boolean r1 = r3.f14252f     // Catch:{ all -> 0x0031 }
            if (r1 != 0) goto L_0x002f
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x0031 }
            r1.<init>()     // Catch:{ all -> 0x0031 }
            java.lang.String r2 = "use_https"
            r1.putBoolean(r2, r4)     // Catch:{ all -> 0x0031 }
            r3.m18789a(r1)     // Catch:{ all -> 0x0031 }
        L_0x002f:
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return
        L_0x0031:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3646ja.mo13098a(boolean):void");
    }

    /* renamed from: a */
    public final boolean mo13099a() {
        boolean z;
        m18816o();
        synchronized (this.f14248b) {
            if (!this.f14253g) {
                if (!this.f14252f) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public final void mo13100b(int i) {
        m18816o();
        synchronized (this.f14248b) {
            if (this.f14261o != i) {
                this.f14261o = i;
                if (this.f14247a != null) {
                    this.f14247a.putInt("request_in_session_count", i);
                    this.f14247a.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putInt("request_in_session_count", i);
                m18789a(bundle);
            }
        }
    }

    /* renamed from: b */
    public final void mo13101b(long j) {
        m18816o();
        synchronized (this.f14248b) {
            if (this.f14260n != j) {
                this.f14260n = j;
                if (this.f14247a != null) {
                    this.f14247a.putLong("first_ad_req_time_ms", j);
                    this.f14247a.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("first_ad_req_time_ms", j);
                m18789a(bundle);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13102b(@javax.annotation.Nullable java.lang.String r4) {
        /*
            r3 = this;
            r3.m18816o()
            java.lang.Object r0 = r3.f14248b
            monitor-enter(r0)
            if (r4 == 0) goto L_0x0034
            java.lang.String r1 = r3.f14255i     // Catch:{ all -> 0x0032 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0011
            goto L_0x0034
        L_0x0011:
            r3.f14255i = r4     // Catch:{ all -> 0x0032 }
            android.content.SharedPreferences$Editor r1 = r3.f14247a     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0023
            android.content.SharedPreferences$Editor r1 = r3.f14247a     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = "content_vertical_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0032 }
            android.content.SharedPreferences$Editor r1 = r3.f14247a     // Catch:{ all -> 0x0032 }
            r1.apply()     // Catch:{ all -> 0x0032 }
        L_0x0023:
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x0032 }
            r1.<init>()     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = "content_vertical_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0032 }
            r3.m18789a(r1)     // Catch:{ all -> 0x0032 }
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r4 = move-exception
            goto L_0x0036
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3646ja.mo13102b(java.lang.String):void");
    }

    /* renamed from: b */
    public final void mo13103b(boolean z) {
        m18816o();
        synchronized (this.f14248b) {
            if (this.f14265s != z) {
                this.f14265s = z;
                if (this.f14247a != null) {
                    this.f14247a.putBoolean("content_url_opted_out", z);
                    this.f14247a.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("content_url_opted_out", this.f14265s);
                bundle.putBoolean("content_vertical_opted_out", this.f14266t);
                m18789a(bundle);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo13104b() {
        boolean z;
        m18816o();
        synchronized (this.f14248b) {
            z = this.f14265s;
        }
        return z;
    }

    @Nullable
    /* renamed from: c */
    public final String mo13105c() {
        String str;
        m18816o();
        synchronized (this.f14248b) {
            str = this.f14254h;
        }
        return str;
    }

    /* renamed from: c */
    public final void mo13106c(String str) {
        m18816o();
        synchronized (this.f14248b) {
            if (!this.f14263q.contains(str)) {
                this.f14263q.add(str);
                if (this.f14247a != null) {
                    this.f14247a.putStringSet("never_pool_slots", this.f14263q);
                    this.f14247a.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putStringArray("never_pool_slots", (String[]) this.f14263q.toArray(new String[this.f14263q.size()]));
                m18789a(bundle);
            }
        }
    }

    /* renamed from: c */
    public final void mo13107c(boolean z) {
        m18816o();
        synchronized (this.f14248b) {
            if (this.f14266t != z) {
                this.f14266t = z;
                if (this.f14247a != null) {
                    this.f14247a.putBoolean("content_vertical_opted_out", z);
                    this.f14247a.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("content_url_opted_out", this.f14265s);
                bundle.putBoolean("content_vertical_opted_out", this.f14266t);
                m18789a(bundle);
            }
        }
    }

    /* renamed from: d */
    public final void mo13108d(String str) {
        m18816o();
        synchronized (this.f14248b) {
            if (this.f14263q.contains(str)) {
                this.f14263q.remove(str);
                if (this.f14247a != null) {
                    this.f14247a.putStringSet("never_pool_slots", this.f14263q);
                    this.f14247a.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putStringArray("never_pool_slots", (String[]) this.f14263q.toArray(new String[this.f14263q.size()]));
                m18789a(bundle);
            }
        }
    }

    /* renamed from: d */
    public final void mo13109d(boolean z) {
        m18816o();
        synchronized (this.f14248b) {
            if (this.f14256j != z) {
                this.f14256j = z;
                if (this.f14247a != null) {
                    this.f14247a.putBoolean("auto_collect_location", z);
                    this.f14247a.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("auto_collect_location", z);
                m18789a(bundle);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo13110d() {
        boolean z;
        m18816o();
        synchronized (this.f14248b) {
            z = this.f14266t;
        }
        return z;
    }

    @Nullable
    /* renamed from: e */
    public final String mo13111e() {
        String str;
        m18816o();
        synchronized (this.f14248b) {
            str = this.f14255i;
        }
        return str;
    }

    /* renamed from: e */
    public final boolean mo13112e(String str) {
        boolean contains;
        m18816o();
        synchronized (this.f14248b) {
            contains = this.f14263q.contains(str);
        }
        return contains;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13113f(java.lang.String r6) {
        /*
            r5 = this;
            r5.m18816o()
            java.lang.Object r0 = r5.f14248b
            monitor-enter(r0)
            com.google.android.gms.common.util.e r1 = com.google.android.gms.ads.internal.zzbv.zzer()     // Catch:{ all -> 0x004a }
            long r1 = r1.mo11326a()     // Catch:{ all -> 0x004a }
            r5.f14258l = r1     // Catch:{ all -> 0x004a }
            if (r6 == 0) goto L_0x0048
            java.lang.String r3 = r5.f14257k     // Catch:{ all -> 0x004a }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x001b
            goto L_0x0048
        L_0x001b:
            r5.f14257k = r6     // Catch:{ all -> 0x004a }
            android.content.SharedPreferences$Editor r3 = r5.f14247a     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x0034
            android.content.SharedPreferences$Editor r3 = r5.f14247a     // Catch:{ all -> 0x004a }
            java.lang.String r4 = "app_settings_json"
            r3.putString(r4, r6)     // Catch:{ all -> 0x004a }
            android.content.SharedPreferences$Editor r3 = r5.f14247a     // Catch:{ all -> 0x004a }
            java.lang.String r4 = "app_settings_last_update_ms"
            r3.putLong(r4, r1)     // Catch:{ all -> 0x004a }
            android.content.SharedPreferences$Editor r3 = r5.f14247a     // Catch:{ all -> 0x004a }
            r3.apply()     // Catch:{ all -> 0x004a }
        L_0x0034:
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x004a }
            r3.<init>()     // Catch:{ all -> 0x004a }
            java.lang.String r4 = "app_settings_json"
            r3.putString(r4, r6)     // Catch:{ all -> 0x004a }
            java.lang.String r6 = "app_settings_last_update_ms"
            r3.putLong(r6, r1)     // Catch:{ all -> 0x004a }
            r5.m18789a(r3)     // Catch:{ all -> 0x004a }
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x004a:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3646ja.mo13113f(java.lang.String):void");
    }

    /* renamed from: f */
    public final boolean mo13114f() {
        boolean z;
        m18816o();
        synchronized (this.f14248b) {
            z = this.f14256j;
        }
        return z;
    }

    /* renamed from: g */
    public final int mo13115g() {
        int i;
        m18816o();
        synchronized (this.f14248b) {
            i = this.f14262p;
        }
        return i;
    }

    /* renamed from: h */
    public final C3626ih mo13116h() {
        C3626ih ihVar;
        m18816o();
        synchronized (this.f14248b) {
            ihVar = new C3626ih(this.f14257k, this.f14258l);
        }
        return ihVar;
    }

    /* renamed from: i */
    public final long mo13117i() {
        long j;
        m18816o();
        synchronized (this.f14248b) {
            j = this.f14259m;
        }
        return j;
    }

    /* renamed from: j */
    public final int mo13118j() {
        int i;
        m18816o();
        synchronized (this.f14248b) {
            i = this.f14261o;
        }
        return i;
    }

    /* renamed from: k */
    public final long mo13119k() {
        long j;
        m18816o();
        synchronized (this.f14248b) {
            j = this.f14260n;
        }
        return j;
    }

    /* renamed from: l */
    public final JSONObject mo13120l() {
        JSONObject jSONObject;
        m18816o();
        synchronized (this.f14248b) {
            jSONObject = this.f14264r;
        }
        return jSONObject;
    }

    /* renamed from: m */
    public final void mo13121m() {
        m18816o();
        synchronized (this.f14248b) {
            this.f14264r = new JSONObject();
            if (this.f14247a != null) {
                this.f14247a.remove("native_advanced_settings");
                this.f14247a.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", "{}");
            m18789a(bundle);
        }
    }
}
