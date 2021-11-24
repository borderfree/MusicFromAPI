package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.jb */
final class C3647jb extends C3649jd {

    /* renamed from: a */
    private final /* synthetic */ Context f14267a;

    /* renamed from: b */
    private final /* synthetic */ C3646ja f14268b;

    C3647jb(C3646ja jaVar, Context context) {
        this.f14268b = jaVar;
        this.f14267a = context;
        super(null);
    }

    /* renamed from: a */
    public final void mo10051a() {
        SharedPreferences sharedPreferences = this.f14267a.getSharedPreferences("admob", 0);
        Editor edit = sharedPreferences.edit();
        synchronized (this.f14268b.f14248b) {
            this.f14268b.f14251e = sharedPreferences;
            this.f14268b.f14247a = edit;
            this.f14268b.f14252f = C3646ja.m18814n();
            this.f14268b.f14253g = this.f14268b.f14251e.getBoolean("use_https", this.f14268b.f14253g);
            this.f14268b.f14265s = this.f14268b.f14251e.getBoolean("content_url_opted_out", this.f14268b.f14265s);
            this.f14268b.f14254h = this.f14268b.f14251e.getString("content_url_hashes", this.f14268b.f14254h);
            this.f14268b.f14256j = this.f14268b.f14251e.getBoolean("auto_collect_location", this.f14268b.f14256j);
            this.f14268b.f14266t = this.f14268b.f14251e.getBoolean("content_vertical_opted_out", this.f14268b.f14266t);
            this.f14268b.f14255i = this.f14268b.f14251e.getString("content_vertical_hashes", this.f14268b.f14255i);
            this.f14268b.f14262p = this.f14268b.f14251e.getInt("version_code", this.f14268b.f14262p);
            this.f14268b.f14257k = this.f14268b.f14251e.getString("app_settings_json", this.f14268b.f14257k);
            this.f14268b.f14258l = this.f14268b.f14251e.getLong("app_settings_last_update_ms", this.f14268b.f14258l);
            this.f14268b.f14259m = this.f14268b.f14251e.getLong("app_last_background_time_ms", this.f14268b.f14259m);
            this.f14268b.f14261o = this.f14268b.f14251e.getInt("request_in_session_count", this.f14268b.f14261o);
            this.f14268b.f14260n = this.f14268b.f14251e.getLong("first_ad_req_time_ms", this.f14268b.f14260n);
            this.f14268b.f14263q = this.f14268b.f14251e.getStringSet("never_pool_slots", this.f14268b.f14263q);
            try {
                this.f14268b.f14264r = new JSONObject(this.f14268b.f14251e.getString("native_advanced_settings", "{}"));
            } catch (JSONException e) {
                C3643iy.m19175c("Could not convert native advanced settings to json object", e);
            }
            this.f14268b.m18789a(this.f14268b.m18817p());
        }
    }
}
