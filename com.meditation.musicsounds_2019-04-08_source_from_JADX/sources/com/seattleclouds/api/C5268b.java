package com.seattleclouds.api;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import com.seattleclouds.App;
import com.seattleclouds.modules.nativetetris.C5915i;
import com.seattleclouds.util.C6613i;
import com.seattleclouds.util.C6618l;
import com.seattleclouds.util.HTTPUtil;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.api.b */
public class C5268b {
    @SuppressLint({"SimpleDateFormat"})

    /* renamed from: a */
    private static SimpleDateFormat f18871a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

    /* renamed from: b */
    private static C5268b f18872b;

    /* renamed from: c */
    private boolean f18873c = false;

    /* renamed from: d */
    private Context f18874d = null;

    /* renamed from: e */
    private String f18875e;

    /* renamed from: f */
    private String f18876f;

    /* renamed from: g */
    private String f18877g;

    /* renamed from: h */
    private int f18878h = -1;

    /* renamed from: i */
    private String f18879i;

    /* renamed from: j */
    private String f18880j;

    /* renamed from: k */
    private String f18881k;

    /* renamed from: l */
    private C5267a f18882l;

    static {
        f18871a.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    private C5268b() {
    }

    /* renamed from: a */
    private int m26271a(JSONObject jSONObject, String str, int i) {
        return jSONObject.has(str) ? jSONObject.getInt(str) : i;
    }

    /* renamed from: a */
    public static C5268b m26272a() {
        if (f18872b == null) {
            f18872b = new C5268b();
        } else if (!f18872b.f18873c) {
            throw new IllegalStateException("You must call SCApi.init(Context) exactly after first SCApi.getInstance() call: SCApi.getInstance().init(Context)");
        }
        return f18872b;
    }

    /* renamed from: a */
    public static String m26273a(Context context, String str, List<String> list) {
        HashMap hashMap = new HashMap();
        hashMap.put("publisherId", App.f18522x);
        hashMap.put("username", App.f18523y);
        hashMap.put("appId", App.f18524z);
        hashMap.put("deviceId", C6618l.m32012a());
        hashMap.put("type", str);
        StringBuilder sb = new StringBuilder();
        sb.append("http://");
        sb.append(App.f18518t);
        sb.append("/gcm_set_topic_subscriptions.ashx?");
        sb.append(HTTPUtil.m31766a((Map<String, String>) hashMap));
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        for (String append : list) {
            sb3.append(append);
            sb3.append(',');
        }
        if (sb3.length() > 0) {
            sb3.deleteCharAt(sb3.length() - 1);
        }
        return HTTPUtil.m31761a(sb2, sb3.toString());
    }

    /* renamed from: a */
    private String m26274a(String str, Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18875e);
        sb.append(str);
        String sb2 = sb.toString();
        String a = HTTPUtil.m31766a(map);
        if (a.length() <= 0) {
            return sb2;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append("?");
        sb3.append(a);
        return sb3.toString();
    }

    /* renamed from: a */
    private String m26275a(JSONObject jSONObject, String str, String str2) {
        return jSONObject.has(str) ? jSONObject.getString(str) : str2;
    }

    /* renamed from: a */
    public static Date m26276a(String str) {
        return f18871a.parse(str);
    }

    /* renamed from: a */
    private void m26277a(HttpURLConnection httpURLConnection) {
        StringBuilder sb = new StringBuilder();
        sb.append("SCAuth authToken=");
        sb.append(this.f18877g);
        httpURLConnection.setRequestProperty("Authorization", sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m26278a(java.net.HttpURLConnection r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 0
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x001c }
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x001c }
            java.io.OutputStream r4 = r4.getOutputStream()     // Catch:{ all -> 0x001c }
            r2.<init>(r4)     // Catch:{ all -> 0x001c }
            r1.<init>(r2)     // Catch:{ all -> 0x001c }
            r1.write(r5)     // Catch:{ all -> 0x0019 }
            r1.flush()     // Catch:{ all -> 0x0019 }
            r1.close()
            return
        L_0x0019:
            r4 = move-exception
            r0 = r1
            goto L_0x001d
        L_0x001c:
            r4 = move-exception
        L_0x001d:
            if (r0 == 0) goto L_0x0022
            r0.close()
        L_0x0022:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.api.C5268b.m26278a(java.net.HttpURLConnection, java.lang.String):void");
    }

    /* renamed from: a */
    private boolean m26279a(int i) {
        return i < 200 || i >= 400;
    }

    /* renamed from: b */
    public static String m26280b(String str) {
        return (str.equals("seattleclouds.com") || str.equals("dev.seattleclouds.com")) ? "https" : "http";
    }

    /* renamed from: b */
    private JSONObject m26281b(C5269c cVar) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(m26274a(cVar.mo17333d(), cVar.mo17328a())).openConnection();
        try {
            httpURLConnection.setReadTimeout(cVar.mo17334e());
            httpURLConnection.setConnectTimeout(cVar.mo17334e());
            m26277a(httpURLConnection);
            if (cVar.mo17332c().equals("POST")) {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setDoOutput(true);
            }
            httpURLConnection.setDoInput(true);
            httpURLConnection.setRequestMethod(cVar.mo17332c());
            httpURLConnection.connect();
            if (cVar.mo17332c().equals("POST")) {
                m26278a(httpURLConnection, HTTPUtil.m31766a(cVar.mo17331b()));
            }
            InputStream errorStream = m26279a(httpURLConnection.getResponseCode()) ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
            if (errorStream != null) {
                String b = C6613i.m31991b(errorStream);
                if (b == null || b.length() == 0) {
                    throw new HttpResponseException(httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage());
                }
                JSONObject jSONObject = new JSONObject(b);
                if (!m26279a(httpURLConnection.getResponseCode())) {
                    return jSONObject;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("error");
                StringBuilder sb = new StringBuilder();
                sb.append(jSONObject2.getInt("code"));
                sb.append(" - ");
                sb.append(jSONObject2.getString("message"));
                throw new SCApiException(sb.toString(), jSONObject2);
            }
            throw new HttpResponseException(httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage());
        } finally {
            httpURLConnection.disconnect();
        }
    }

    /* renamed from: i */
    private void m26282i(String str) {
        if (str != null && str.length() != 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f18877g = m26275a(jSONObject, "authToken", (String) null);
                this.f18878h = m26271a(jSONObject, "accessLevel", -1);
                this.f18879i = m26275a(jSONObject, "publisherAccountPublisherId", (String) null);
                this.f18880j = m26275a(jSONObject, "authUsername", (String) null);
                this.f18881k = m26275a(jSONObject, "authPassword", (String) null);
                if (jSONObject.has("signedInAppUser")) {
                    this.f18882l = C5267a.m26263a(jSONObject.getJSONObject("signedInAppUser"));
                }
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error parsing JSON: ");
                sb.append(e);
                Log.e("SCApi", sb.toString());
            }
        }
    }

    /* renamed from: j */
    private String m26283j(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    /* renamed from: j */
    private void m26284j() {
        m26282i(this.f18874d.getSharedPreferences("com.seattleclouds.api.state", 0).getString("settings", ""));
    }

    /* renamed from: k */
    private void m26285k() {
        Editor edit = this.f18874d.getSharedPreferences("com.seattleclouds.api.state", 0).edit();
        edit.putString("settings", m26286l());
        edit.commit();
    }

    /* renamed from: l */
    private String m26286l() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("authToken", this.f18877g);
            jSONObject.put("accessLevel", this.f18878h);
            jSONObject.put("publisherAccountPublisherId", this.f18879i);
            jSONObject.put("authUsername", this.f18880j);
            jSONObject.put("authPassword", this.f18881k);
            if (this.f18882l != null) {
                jSONObject.put("signedInAppUser", this.f18882l.mo17293c());
            }
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error converting to JSON: ");
            sb.append(e);
            Log.e("SCApi", sb.toString());
        }
        return jSONObject.toString();
    }

    /* renamed from: m */
    private void m26287m() {
        String str = null;
        String str2 = App.f18510l ? this.f18880j : null;
        if (App.f18510l) {
            str = this.f18881k;
        }
        mo17299a(str2, str);
    }

    /* renamed from: n */
    private void m26288n() {
        if (this.f18877g == null) {
            m26287m();
        }
    }

    /* renamed from: a */
    public JSONObject mo17297a(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("users/");
        sb.append(App.f18523y);
        sb.append("/apps/");
        sb.append(App.f18524z);
        sb.append("/loyalty/deviceId");
        String sb2 = sb.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("publisherId", App.f18522x);
        hashMap.put("pageId", str);
        hashMap.put("deviceId", C6618l.m32012a());
        return mo17298a(new C5269c("POST", sb2, null, hashMap));
    }

    /* renamed from: a */
    public JSONObject mo17298a(C5269c cVar) {
        m26288n();
        try {
            return m26281b(cVar);
        } catch (SCApiException e) {
            JSONObject details = e.getDetails();
            int i = details.getInt("code");
            String string = details.getJSONArray("errors").getJSONObject(0).getString("reason");
            if (i != 401 || (!string.equals("invalidAuthToken") && !string.equals("authTokenExpired"))) {
                throw e;
            }
            m26287m();
            return m26281b(cVar);
        }
    }

    /* renamed from: a */
    public JSONObject mo17299a(String str, String str2) {
        String str3 = "auth/tokens";
        HashMap hashMap = new HashMap();
        hashMap.put("appOwnerPublisherId", App.f18470C);
        hashMap.put("appOwnerUsername", App.f18471D);
        hashMap.put("appId", App.f18472E);
        hashMap.put("apiKey", mo17308b());
        hashMap.put("publisherId", App.f18522x);
        if (!(str == null || str2 == null)) {
            hashMap.put("username", str);
            hashMap.put("password", str2);
        }
        JSONObject b = m26281b(new C5269c("POST", str3, null, hashMap));
        this.f18877g = b.getString("authToken");
        this.f18878h = b.getInt("accessLevel");
        this.f18879i = m26275a(b, "publisherAccountPublisherId", (String) null);
        this.f18880j = m26275a(b, "username", (String) null);
        this.f18881k = str2;
        m26285k();
        return b;
    }

    /* renamed from: a */
    public JSONObject mo17300a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("users/");
        sb.append(App.f18523y);
        sb.append("/apps/");
        sb.append(App.f18524z);
        sb.append("/roleId/");
        sb.append(str);
        String sb2 = sb.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("publisherId", App.f18522x);
        hashMap.put("packageId", str2);
        hashMap.put("email", str3);
        return mo17298a(new C5269c("GET", sb2, hashMap, null));
    }

    /* renamed from: a */
    public JSONObject mo17301a(String str, String str2, String str3, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("users/");
        sb.append(m26283j(str));
        sb.append("/apps");
        String sb2 = sb.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("appId", str2);
        hashMap.put("templateId", str3);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i);
        sb3.append("");
        hashMap.put("platform", sb3.toString());
        HashMap hashMap2 = new HashMap();
        hashMap2.put("publisherId", App.f18522x);
        return mo17298a(new C5269c("POST", sb2, hashMap2, hashMap));
    }

    /* renamed from: a */
    public JSONObject mo17302a(String str, String str2, String str3, String str4) {
        this.f18882l = null;
        HashMap hashMap = new HashMap();
        hashMap.put("publisherId", App.f18522x);
        hashMap.put("appOwnerUsername", App.f18523y);
        hashMap.put("appId", App.f18524z);
        hashMap.put("provider", str);
        hashMap.put("providerAccountId", str2);
        hashMap.put("providerUserAuthToken", str3);
        hashMap.put("displayName", str4);
        JSONObject a = mo17298a(new C5269c("POST", "appUsers/signIn", null, hashMap));
        this.f18882l = new C5267a();
        this.f18882l.mo17290a(a.getString("userId"));
        this.f18882l.mo17292b(str4);
        this.f18882l.mo17294c(str);
        this.f18882l.mo17295d(str2);
        m26285k();
        return a;
    }

    /* renamed from: a */
    public JSONObject mo17303a(String str, String str2, String str3, String str4, String str5) {
        C5269c cVar = new C5269c("POST", "auth/passwordForgotPass", null, null);
        cVar.mo17330a("publisherId", str);
        cVar.mo17330a("appOwner", str3);
        cVar.mo17330a("appId", str4);
        cVar.mo17330a("email", str5);
        cVar.mo17330a("appName", str2);
        JSONObject a = mo17298a(cVar);
        if (a != null) {
            return a;
        }
        throw new JSONException("forgotpass returns null");
    }

    /* renamed from: a */
    public JSONObject mo17304a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        StringBuilder sb = new StringBuilder();
        sb.append("orders/");
        sb.append(str7);
        String sb2 = sb.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("templateId", str);
        hashMap.put("platform", str2);
        hashMap.put("description", str3);
        hashMap.put("abcId", str4);
        hashMap.put("subscriptionId", str5);
        hashMap.put("image", str6);
        return mo17298a(new C5269c("POST", sb2, null, hashMap));
    }

    /* renamed from: a */
    public JSONObject mo17305a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        StringBuilder sb = new StringBuilder();
        sb.append("subscribe/");
        String str16 = str;
        sb.append(str);
        String sb2 = sb.toString();
        HashMap hashMap = new HashMap();
        String str17 = str2;
        hashMap.put("plan_name", str2);
        String str18 = str3;
        hashMap.put("cc_number", str3);
        String str19 = str4;
        hashMap.put("cc_expiration_month", str4);
        String str20 = str5;
        hashMap.put("cc_expiration_year", str5);
        String str21 = str6;
        hashMap.put("cc_code", str6);
        String str22 = str7;
        hashMap.put("cc_email", str7);
        String str23 = str8;
        hashMap.put("cc_first_name", str8);
        String str24 = str9;
        hashMap.put("cc_last_name", str9);
        String str25 = str10;
        hashMap.put("cc_address", str10);
        hashMap.put("cc_city", str11);
        hashMap.put("cc_state", str12);
        hashMap.put("cc_country", str13);
        hashMap.put("cc_zip", str14);
        hashMap.put("cc_phone", str15);
        C5269c cVar = new C5269c("POST", sb2, null, hashMap);
        return mo17298a(cVar);
    }

    /* renamed from: a */
    public JSONObject mo17306a(String str, String str2, String str3, String str4, char[] cArr, String str5, String str6, String str7) {
        C5269c cVar = new C5269c("POST", "appAuth/registerUser", null, null);
        cVar.mo17330a("publisherId", str);
        cVar.mo17330a("appOwner", str2);
        cVar.mo17330a("appId", str3);
        cVar.mo17330a("email", str4);
        cVar.mo17330a("psawsord", String.valueOf(cArr));
        cVar.mo17330a("deviceId", str5);
        cVar.mo17330a("lang", str6);
        cVar.mo17330a("version", str7);
        JSONObject a = mo17298a(cVar);
        if (a != null) {
            return a;
        }
        throw new JSONException("registerAppUser returns null");
    }

    /* renamed from: a */
    public void mo17307a(Context context) {
        this.f18874d = context.getApplicationContext();
        StringBuilder sb = new StringBuilder();
        sb.append(m26280b(App.f18516r));
        sb.append("://");
        sb.append(App.f18516r);
        sb.append("/api/v1/");
        this.f18875e = sb.toString();
        this.f18877g = null;
        this.f18882l = null;
        m26284j();
        this.f18873c = true;
    }

    /* renamed from: b */
    public String mo17308b() {
        return this.f18876f;
    }

    /* renamed from: b */
    public JSONObject mo17309b(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("users/");
        sb.append(App.f18523y);
        sb.append("/apps/");
        sb.append(App.f18524z);
        sb.append("/loyalty/deviceId");
        String sb2 = sb.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("publisherId", App.f18522x);
        hashMap.put("pageId", str);
        hashMap.put("deviceId", C6618l.m32012a());
        return mo17298a(new C5269c("GET", sb2, hashMap, null));
    }

    /* renamed from: b */
    public JSONObject mo17310b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("messenger/conversations/");
        sb.append(str);
        sb.append("/messages");
        String sb2 = sb.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("publisherId", App.f18522x);
        hashMap.put(C5915i.f20903a, str2);
        return mo17298a(new C5269c("GET", sb2, hashMap, null));
    }

    /* renamed from: b */
    public JSONObject mo17311b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("users/");
        sb.append(str);
        sb.append("/apps/");
        sb.append(str2);
        sb.append("/orderIndiaPayKey");
        C5269c cVar = new C5269c("POST", sb.toString(), null, null);
        cVar.mo17330a("pageId", str3);
        cVar.mo17330a("publisherId", App.f18522x);
        JSONObject a = mo17298a(cVar);
        if (a != null) {
            return a;
        }
        throw new JSONException("orderIndiaPayKey returns null");
    }

    /* renamed from: b */
    public JSONObject mo17312b(String str, String str2, String str3, String str4, char[] cArr, String str5, String str6, String str7) {
        C5269c cVar = new C5269c("POST", "appAuth/authenticateUser", null, null);
        cVar.mo17330a("publisherId", str);
        cVar.mo17330a("appOwner", str2);
        cVar.mo17330a("appId", str3);
        cVar.mo17330a("email", str4);
        cVar.mo17330a("psawsord", String.valueOf(cArr));
        cVar.mo17330a("deviceId", str5);
        cVar.mo17330a("lang", str6);
        cVar.mo17330a("version", str7);
        JSONObject a = mo17298a(cVar);
        if (a != null) {
            return a;
        }
        throw new JSONException("authenticateAppUser returns null");
    }

    /* renamed from: c */
    public C5267a mo17313c() {
        return this.f18882l;
    }

    /* renamed from: c */
    public JSONObject mo17314c(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("messenger/conversations/");
        sb.append(str);
        sb.append("/messages");
        String sb2 = sb.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("userId", mo17313c() != null ? mo17313c().mo17289a() : null);
        hashMap.put("text", str2);
        return mo17298a(new C5269c("POST", sb2, null, hashMap));
    }

    /* renamed from: c */
    public void mo17315c(String str) {
        this.f18876f = str;
    }

    /* renamed from: d */
    public JSONObject mo17316d(String str) {
        int i;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("http://");
            sb.append(App.f18516r);
            i = HTTPUtil.m31770c(sb.toString());
        } catch (IOException unused) {
            i = -1;
        }
        String str2 = this.f18878h == 40 ? this.f18881k : "";
        StringBuilder sb2 = new StringBuilder();
        sb2.append("users/");
        sb2.append(m26283j(str));
        sb2.append("/apps");
        String sb3 = sb2.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("publisherId", App.f18522x);
        hashMap.put("accessCode", str2);
        C5269c cVar = new C5269c("GET", sb3, hashMap, null);
        if (i == 200) {
            cVar.mo17329a(180000);
        }
        return mo17298a(cVar);
    }

    /* renamed from: d */
    public JSONObject mo17317d(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("users/");
        sb.append(m26283j(str));
        sb.append("/apps/");
        sb.append(m26283j(str2));
        String sb2 = sb.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("publisherId", App.f18522x);
        hashMap.put("fields", "resourcesSize");
        return mo17298a(new C5269c("GET", sb2, hashMap, null));
    }

    /* renamed from: d */
    public boolean mo17318d() {
        return this.f18878h == 40;
    }

    /* renamed from: e */
    public JSONObject mo17319e(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("publisherId", App.f18522x);
        hashMap.put("username", str);
        return mo17298a(new C5269c("GET", "templates", hashMap, null));
    }

    /* renamed from: e */
    public boolean mo17320e() {
        if (this.f18878h < 0 || this.f18878h > 10) {
            return this.f18878h == 20 && this.f18879i.equals(App.f18522x);
        }
        return true;
    }

    /* renamed from: f */
    public JSONObject mo17321f(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("templates/");
        sb.append(str);
        sb.append("/files");
        String sb2 = sb.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("publisherId", App.f18522x);
        return mo17298a(new C5269c("GET", sb2, hashMap, null));
    }

    /* renamed from: f */
    public void mo17322f() {
        this.f18877g = null;
        this.f18878h = -1;
        this.f18879i = null;
        this.f18880j = null;
        this.f18881k = null;
        this.f18882l = null;
        m26285k();
    }

    /* renamed from: g */
    public JSONObject mo17323g(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("accountinfo/");
        sb.append(str);
        return mo17298a(new C5269c("GET", sb.toString(), null, null));
    }

    /* renamed from: g */
    public void mo17324g() {
        this.f18882l = null;
        m26285k();
    }

    /* renamed from: h */
    public JSONObject mo17325h() {
        StringBuilder sb = new StringBuilder();
        sb.append("users/");
        sb.append(App.f18523y);
        sb.append("/apps/");
        sb.append(App.f18524z);
        sb.append("/messenger/conversations");
        String sb2 = sb.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("publisherId", App.f18522x);
        return mo17298a(new C5269c("GET", sb2, hashMap, null));
    }

    /* renamed from: h */
    public JSONObject mo17326h(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("users/");
        sb.append(App.f18523y);
        sb.append("/apps/");
        sb.append(App.f18524z);
        sb.append("/listTransactions/eSignature");
        String sb2 = sb.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("publisherId", App.f18522x);
        hashMap.put("email", str);
        return mo17298a(new C5269c("GET", sb2, hashMap, null));
    }

    /* renamed from: i */
    public JSONObject mo17327i() {
        HashMap hashMap = new HashMap();
        hashMap.put("publisherId", App.f18522x);
        return mo17298a(new C5269c("GET", "templates/localizations", hashMap, null));
    }
}
