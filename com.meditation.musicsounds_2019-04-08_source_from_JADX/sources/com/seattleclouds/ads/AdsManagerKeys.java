package com.seattleclouds.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.util.Base64;
import android.util.Log;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5454c;
import com.seattleclouds.C5451m.C5459h;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.util.C6592al;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

public class AdsManagerKeys {

    /* renamed from: a */
    private static AdsManagerKeys f18774a;

    /* renamed from: b */
    private boolean f18775b = false;

    /* renamed from: c */
    private String f18776c;

    /* renamed from: d */
    private String f18777d = "";

    /* renamed from: e */
    private String f18778e = "";

    /* renamed from: f */
    private String f18779f = "";

    /* renamed from: g */
    private int f18780g = 30;

    /* renamed from: h */
    private String f18781h;

    /* renamed from: i */
    private int f18782i = 0;

    /* renamed from: j */
    private String f18783j;

    /* renamed from: k */
    private String f18784k = "";

    /* renamed from: l */
    private String f18785l = "";

    /* renamed from: m */
    private String f18786m = "";

    /* renamed from: n */
    private String f18787n = "";

    /* renamed from: o */
    private String f18788o = "";

    /* renamed from: p */
    private String f18789p = "";

    /* renamed from: q */
    private String f18790q = "";

    /* renamed from: r */
    private String f18791r;

    /* renamed from: s */
    private int f18792s = 0;

    enum AdsKeysType {
        UNKNOWN(0),
        ADMOB(2),
        DFP(4),
        POLLFISH(8),
        AIRPUSH(16),
        SKIPPABLES(32),
        REVMOB(64),
        FACEBOOK(128),
        TWITTER(256);
        
        private final int value;

        private AdsKeysType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    private AdsManagerKeys() {
        if (f18774a == null) {
            Resources resources = App.m25647e().getResources();
            SharedPreferences sharedPreferences = App.m25647e().getSharedPreferences("ADS_SINGLETON_PREF", 0);
            m26117a(sharedPreferences.getBoolean("IS_PAYED_SHOW_ADS", resources.getBoolean(C5454c.is_payed_show_ads)));
            m26121b(sharedPreferences.getString("LAST_UPDATE_KEYS", "2018-01-01 00:00:00"));
            m26122c(sharedPreferences.getString("ADMOB_BANNER_ADUNITID", resources.getString(C5462k.admob_banner)));
            m26123d(sharedPreferences.getString("ADMOB_INTERSTITIAL_ADUNITID", resources.getString(C5462k.admob_interstitial)));
            m26124e(sharedPreferences.getString("DFP_ADUNITID", resources.getString(C5462k.dfp_adunitid)));
            m26115a(sharedPreferences.getInt("SCAD_REFRESH_RATE", resources.getInteger(C5459h.scad_refreshrate)));
            m26125f(sharedPreferences.getString("POLLFISH_APIKEY", resources.getString(C5462k.pollfish_apikey)));
            m26120b(sharedPreferences.getInt("AIRPUSH_APPID", resources.getInteger(C5459h.airpush_appid)));
            m26126g(sharedPreferences.getString("AIRPUSH_APIKEY", resources.getString(C5462k.airpush_apikey)));
            m26128i(sharedPreferences.getString("SKIPPABLES_BANNER", resources.getString(C5462k.ski_bannerid)));
            m26129j(sharedPreferences.getString("SKIPPABLES_INTERSTITIAL", resources.getString(C5462k.ski_interstitial)));
            m26130k(sharedPreferences.getString("FACEBOOK_BANNER", resources.getString(C5462k.facebook_banner)));
            m26131l(sharedPreferences.getString("FACEBOOK_INTERSTITIAL", resources.getString(C5462k.facebook_native)));
            m26132m(sharedPreferences.getString("FACEBOOK_NATIVE", resources.getString(C5462k.facebook_native)));
            m26133n(sharedPreferences.getString("FACEBOOK_NATIVE_BANNER", resources.getString(C5462k.facebook_native_banner)));
            m26134o(sharedPreferences.getString("RemoveAdsItemID", resources.getString(C5462k.remove_ads_id)));
            m26127h(sharedPreferences.getString("REVMOB_ID", resources.getString(C5462k.revmob_id)));
            m26116a(resources);
            return;
        }
        throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
    }

    /* renamed from: a */
    private String m26114a(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        return jSONObject.getString(str).trim();
    }

    /* renamed from: a */
    private void m26115a(int i) {
        this.f18780g = i;
    }

    /* renamed from: a */
    private void m26116a(Resources resources) {
        if (!C6592al.m31909b(resources.getString(C5462k.admob_banner)) || !C6592al.m31909b(resources.getString(C5462k.admob_interstitial))) {
            this.f18792s |= AdsKeysType.ADMOB.getValue();
        }
        if (!C6592al.m31909b(resources.getString(C5462k.dfp_adunitid))) {
            this.f18792s |= AdsKeysType.DFP.getValue();
        }
        if (!C6592al.m31909b(resources.getString(C5462k.pollfish_apikey))) {
            this.f18792s |= AdsKeysType.POLLFISH.getValue();
        }
        if (!C6592al.m31909b(resources.getString(C5462k.airpush_apikey))) {
            this.f18792s |= AdsKeysType.AIRPUSH.getValue();
        }
        if (!C6592al.m31909b(resources.getString(C5462k.revmob_id))) {
            this.f18792s |= AdsKeysType.REVMOB.getValue();
        }
        if (!C6592al.m31909b(resources.getString(C5462k.ski_bannerid)) || !C6592al.m31909b(resources.getString(C5462k.ski_interstitial))) {
            this.f18792s |= AdsKeysType.SKIPPABLES.getValue();
        }
        if (!C6592al.m31909b(resources.getString(C5462k.facebook_banner)) || !C6592al.m31909b(resources.getString(C5462k.facebook_interstitial)) || !C6592al.m31909b(resources.getString(C5462k.facebook_native)) || !C6592al.m31909b(resources.getString(C5462k.facebook_native_banner))) {
            this.f18792s |= AdsKeysType.FACEBOOK.getValue();
        }
    }

    /* renamed from: a */
    private void m26117a(boolean z) {
        this.f18775b = z;
    }

    /* renamed from: b */
    private int m26118b(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return 0;
        }
        return jSONObject.getInt(str);
    }

    /* renamed from: b */
    public static AdsManagerKeys m26119b() {
        if (f18774a == null) {
            synchronized (AdsManagerKeys.class) {
                if (f18774a == null) {
                    f18774a = new AdsManagerKeys();
                }
            }
        }
        return f18774a;
    }

    /* renamed from: b */
    private void m26120b(int i) {
        this.f18782i = i;
    }

    /* renamed from: b */
    private void m26121b(String str) {
        this.f18776c = str;
    }

    /* renamed from: c */
    private void m26122c(String str) {
        this.f18777d = str;
    }

    /* renamed from: d */
    private void m26123d(String str) {
        this.f18778e = str;
    }

    /* renamed from: e */
    private void m26124e(String str) {
        this.f18779f = str;
    }

    /* renamed from: f */
    private void m26125f(String str) {
        this.f18781h = str;
    }

    /* renamed from: g */
    private void m26126g(String str) {
        this.f18783j = str;
    }

    /* renamed from: h */
    private void m26127h(String str) {
        this.f18784k = str;
    }

    /* renamed from: i */
    private void m26128i(String str) {
        this.f18785l = str;
    }

    /* renamed from: j */
    private void m26129j(String str) {
        this.f18786m = str;
    }

    /* renamed from: k */
    private void m26130k(String str) {
        this.f18787n = str;
    }

    /* renamed from: l */
    private void m26131l(String str) {
        this.f18788o = str;
    }

    /* renamed from: m */
    private void m26132m(String str) {
        this.f18789p = str;
    }

    /* renamed from: n */
    private void m26133n(String str) {
        this.f18790q = str;
    }

    /* renamed from: o */
    private void m26134o(String str) {
        this.f18791r = str;
    }

    /* renamed from: r */
    private void m26135r() {
        Editor edit = App.m25647e().getSharedPreferences("ADS_SINGLETON_PREF", 0).edit();
        edit.putString("ADMOB_BANNER_ADUNITID", this.f18777d);
        edit.putString("ADMOB_INTERSTITIAL_ADUNITID", this.f18778e);
        edit.putString("DFP_ADUNITID", this.f18779f);
        edit.putInt("SCAD_REFRESH_RATE", this.f18780g);
        edit.putString("POLLFISH_APIKEY", this.f18781h);
        edit.putInt("AIRPUSH_APPID", this.f18782i);
        edit.putString("AIRPUSH_APIKEY", this.f18783j);
        edit.putString("SKIPPABLES_BANNER", this.f18785l);
        edit.putString("SKIPPABLES_INTERSTITIAL", this.f18786m);
        edit.putString("FACEBOOK_BANNER", this.f18787n);
        edit.putString("FACEBOOK_INTERSTITIAL", this.f18788o);
        edit.putString("FACEBOOK_NATIVE", this.f18789p);
        edit.putString("FACEBOOK_NATIVE_BANNER", this.f18790q);
        edit.putString("REVMOB_ID", this.f18784k);
        edit.putString("RemoveAdsItemID", this.f18791r);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        m26121b(simpleDateFormat.format(new Date()));
        edit.putString("LAST_UPDATE_KEYS", mo17223d());
        edit.apply();
    }

    /* renamed from: a */
    public String mo17220a() {
        return Integer.toString(this.f18792s);
    }

    /* renamed from: a */
    public void mo17221a(String str) {
        String str2;
        String str3;
        try {
            String str4 = new String(Base64.decode(str, 2), "UTF-8");
            if (!C6592al.m31909b(str4)) {
                JSONObject jSONObject = new JSONObject(str4);
                if (jSONObject.has("isPayedShowAds")) {
                    m26117a(jSONObject.getBoolean("isPayedShowAds"));
                } else {
                    m26117a(false);
                }
                if (jSONObject.has("keys")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("keys");
                    m26125f(m26114a(jSONObject2, "PollfishID"));
                    m26124e(m26114a(jSONObject2, "DfpID"));
                    m26127h(m26114a(jSONObject2, "RevmobID"));
                    m26115a(m26118b(jSONObject2, "SCAdRefreshRate"));
                    m26120b(m26118b(jSONObject2, "AirpushAppID"));
                    m26126g(m26114a(jSONObject2, "AirpushApiKey"));
                    m26122c(m26114a(jSONObject2, "AdmobBannerID"));
                    m26123d(m26114a(jSONObject2, "AdmobInterstitiaID"));
                    m26128i(m26114a(jSONObject2, "SkippablesBannerID"));
                    m26129j(m26114a(jSONObject2, "SkippablesInterstitiaID"));
                    m26130k(m26114a(jSONObject2, "FacebookBannerID"));
                    m26131l(m26114a(jSONObject2, "FacebookInterstitiaID"));
                    m26132m(m26114a(jSONObject2, "FacebookNativeID"));
                    m26133n(m26114a(jSONObject2, "FacebookNativeBannerID"));
                    m26134o(m26114a(jSONObject2, "RemoveAdsItemID"));
                }
                m26135r();
            }
        } catch (JSONException e) {
            e = e;
            str3 = "AdsManagerKeys";
            str2 = "JSON parser keys ads error :";
            Log.e(str3, str2, e);
        } catch (UnsupportedEncodingException e2) {
            e = e2;
            str3 = "AdsManagerKeys";
            str2 = "Encoding parser keys ads error :";
            Log.e(str3, str2, e);
        }
    }

    /* renamed from: c */
    public boolean mo17222c() {
        return this.f18775b;
    }

    /* renamed from: d */
    public String mo17223d() {
        return this.f18776c;
    }

    /* renamed from: e */
    public String mo17224e() {
        if (C6592al.m31909b(this.f18777d)) {
            return null;
        }
        return this.f18777d.trim();
    }

    /* renamed from: f */
    public String mo17225f() {
        if (C6592al.m31909b(this.f18778e)) {
            return null;
        }
        return this.f18778e.trim();
    }

    /* renamed from: g */
    public String mo17226g() {
        if (C6592al.m31909b(this.f18779f)) {
            return null;
        }
        return this.f18779f.trim();
    }

    /* renamed from: h */
    public int mo17227h() {
        return this.f18780g;
    }

    /* renamed from: i */
    public String mo17228i() {
        if (C6592al.m31909b(this.f18781h)) {
            return null;
        }
        return this.f18781h.trim();
    }

    /* renamed from: j */
    public int mo17229j() {
        return this.f18782i;
    }

    /* renamed from: k */
    public String mo17230k() {
        if (C6592al.m31909b(this.f18783j)) {
            return null;
        }
        return this.f18783j.trim();
    }

    /* renamed from: l */
    public String mo17231l() {
        if (C6592al.m31909b(this.f18784k)) {
            return null;
        }
        return this.f18784k.trim();
    }

    /* renamed from: m */
    public String mo17232m() {
        if (C6592al.m31909b(this.f18785l)) {
            return null;
        }
        return this.f18785l.trim();
    }

    /* renamed from: n */
    public String mo17233n() {
        if (C6592al.m31909b(this.f18786m)) {
            return null;
        }
        return this.f18786m.trim();
    }

    /* renamed from: o */
    public String mo17234o() {
        if (!this.f18775b || C6592al.m31909b(this.f18787n)) {
            return null;
        }
        return this.f18787n.trim();
    }

    /* renamed from: p */
    public String mo17235p() {
        if (!this.f18775b || C6592al.m31909b(this.f18788o)) {
            return null;
        }
        return this.f18788o.trim();
    }

    /* renamed from: q */
    public String mo17236q() {
        return this.f18791r;
    }
}
