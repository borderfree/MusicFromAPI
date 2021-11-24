package com.seattleclouds.p158c;

import android.content.Context;
import android.util.Log;
import android.webkit.WebView;
import com.seattleclouds.C6352p;
import com.seattleclouds.util.C6592al;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.apache.commons.p198io.C6730b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.c.b */
public class C5325b {

    /* renamed from: a */
    private static final String f19085a = "b";

    /* renamed from: b */
    private JSONObject f19086b = new JSONObject();

    /* renamed from: c */
    private C5324a f19087c = new C5324a();

    /* renamed from: d */
    private boolean f19088d = true;

    public C5325b() {
        m26655c();
        m26659f();
    }

    /* renamed from: a */
    public static void m26652a() {
        String b = C6352p.m30857a().mo19793b();
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append("/basicauth/credentials.json");
        C6730b.m32467d(new File(sb.toString()));
    }

    /* renamed from: a */
    private void m26653a(C5324a aVar) {
        String b = C6352p.m30857a().mo19793b();
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append("/basicauth/lastused_credential.json");
        File file = new File(sb.toString());
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        try {
            C6730b.m32465b(file, aVar.mo17471e().toString());
        } catch (IOException e) {
            String str = f19085a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error unable to save ");
            sb2.append(b);
            Log.e(str, sb2.toString(), e);
        } catch (JSONException e2) {
            String str2 = f19085a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Error unable to convert to json");
            sb3.append(aVar);
            Log.e(str2, sb3.toString(), e2);
        }
    }

    /* renamed from: c */
    private String m26654c(String str) {
        return str.indexOf(".") != str.lastIndexOf(".") ? str.substring(str.indexOf(".") + 1) : str;
    }

    /* renamed from: c */
    private void m26655c() {
        String str;
        StringBuilder sb;
        String str2;
        String str3;
        Throwable e;
        Throwable e2;
        String str4 = "";
        try {
            str3 = C6352p.m30857a().mo19793b();
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append("/basicauth/credentials.json");
                File file = new File(sb2.toString());
                if (file.exists()) {
                    String f = C6730b.m32469f(file);
                    if (f.length() != 0) {
                        this.f19086b = new JSONObject(f);
                    }
                }
            } catch (JSONException e3) {
                e2 = e3;
                this.f19086b = new JSONObject();
                str2 = f19085a;
                sb = new StringBuilder();
                str = "Error unable to parse ";
                sb.append(str);
                sb.append(str3);
                Log.e(str2, sb.toString(), e);
            } catch (IOException e4) {
                e = e4;
                str2 = f19085a;
                sb = new StringBuilder();
                str = "Error unable to read ";
                sb.append(str);
                sb.append(str3);
                Log.e(str2, sb.toString(), e);
            }
        } catch (JSONException e5) {
            Throwable th = e5;
            str3 = str4;
            e2 = th;
            this.f19086b = new JSONObject();
            str2 = f19085a;
            sb = new StringBuilder();
            str = "Error unable to parse ";
            sb.append(str);
            sb.append(str3);
            Log.e(str2, sb.toString(), e);
        } catch (IOException e6) {
            Throwable th2 = e6;
            str3 = str4;
            e = th2;
            str2 = f19085a;
            sb = new StringBuilder();
            str = "Error unable to read ";
            sb.append(str);
            sb.append(str3);
            Log.e(str2, sb.toString(), e);
        }
    }

    /* renamed from: d */
    private String m26656d(String str) {
        try {
            return new URL(str).getHost();
        } catch (MalformedURLException e) {
            Log.e(f19085a, "Error unable to get host ", e);
            return "";
        }
    }

    /* renamed from: d */
    private void m26657d() {
        String b = C6352p.m30857a().mo19793b();
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append("/basicauth/credentials.json");
        File file = new File(sb.toString());
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        try {
            C6730b.m32465b(file, this.f19086b.toString());
        } catch (IOException e) {
            String str = f19085a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error unable to save ");
            sb2.append(b);
            Log.e(str, sb2.toString(), e);
        }
    }

    /* renamed from: e */
    private void m26658e() {
        this.f19087c.mo17464a("");
        m26653a(this.f19087c);
    }

    /* renamed from: f */
    private void m26659f() {
        String str;
        StringBuilder sb;
        String str2;
        String str3;
        Throwable e;
        Throwable e2;
        this.f19087c = new C5324a();
        String str4 = "";
        try {
            str3 = C6352p.m30857a().mo19793b();
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append("/basicauth/lastused_credential.json");
                File file = new File(sb2.toString());
                if (file.exists()) {
                    String f = C6730b.m32469f(file);
                    if (f.length() != 0) {
                        this.f19087c = new C5324a(new JSONObject(f));
                    }
                }
            } catch (JSONException e3) {
                e2 = e3;
                this.f19086b = new JSONObject();
                str2 = f19085a;
                sb = new StringBuilder();
                str = "Error unable to parse ";
                sb.append(str);
                sb.append(str3);
                Log.e(str2, sb.toString(), e);
            } catch (IOException e4) {
                e = e4;
                str2 = f19085a;
                sb = new StringBuilder();
                str = "Error unable to read ";
                sb.append(str);
                sb.append(str3);
                Log.e(str2, sb.toString(), e);
            }
        } catch (JSONException e5) {
            Throwable th = e5;
            str3 = str4;
            e2 = th;
            this.f19086b = new JSONObject();
            str2 = f19085a;
            sb = new StringBuilder();
            str = "Error unable to parse ";
            sb.append(str);
            sb.append(str3);
            Log.e(str2, sb.toString(), e);
        } catch (IOException e6) {
            Throwable th2 = e6;
            str3 = str4;
            e = th2;
            str2 = f19085a;
            sb = new StringBuilder();
            str = "Error unable to read ";
            sb.append(str);
            sb.append(str3);
            Log.e(str2, sb.toString(), e);
        }
    }

    /* renamed from: a */
    public C5324a mo17473a(String str) {
        String c = m26654c(m26656d(str));
        if (this.f19086b.has(c)) {
            try {
                return new C5324a(this.f19086b.getJSONObject(c));
            } catch (JSONException e) {
                Log.e(f19085a, "Unable to get credential from storage", e);
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo17474a(String str, Context context) {
        if (context != null) {
            HashMap hashMap = new HashMap();
            WebView webView = new WebView(context);
            mo17480b(str);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(new Random().nextInt());
            hashMap.put("Authorization", sb.toString());
            webView.loadUrl(str, hashMap);
        }
    }

    /* renamed from: a */
    public void mo17475a(String str, String str2, String str3) {
        String c = m26654c(str);
        if (!C6592al.m31909b(str) && !C6592al.m31909b(str2) && !C6592al.m31909b(str3)) {
            C5324a aVar = new C5324a();
            aVar.mo17464a(str3);
            aVar.mo17466b(str2);
            try {
                this.f19086b.put(c, aVar.mo17471e());
            } catch (JSONException e) {
                Log.e(f19085a, "Unable to store a new credential", e);
            }
            if (this.f19088d) {
                m26653a(aVar);
            }
            m26657d();
        }
    }

    /* renamed from: a */
    public void mo17476a(HttpURLConnection httpURLConnection) {
        String c = m26654c(httpURLConnection.getURL().getHost());
        if (this.f19086b.has(c)) {
            try {
                C5324a aVar = new C5324a(this.f19086b.getJSONObject(c));
                if (aVar.mo17470d()) {
                    httpURLConnection.setRequestProperty("Authorization", aVar.mo17467c());
                }
            } catch (JSONException e) {
                Log.e(f19085a, "Unable to get credential from storage", e);
            }
        }
    }

    /* renamed from: a */
    public void mo17477a(HttpURLConnection httpURLConnection, HashMap<String, String> hashMap) {
        String c = m26654c(httpURLConnection.getURL().getHost());
        if (hashMap != null && hashMap.containsKey("Authorization")) {
            Map headerFields = httpURLConnection.getHeaderFields();
            if (headerFields != null) {
                if (headerFields.containsKey("Set-Cookie") || headerFields.containsKey("Persistent-Auth")) {
                    C5324a aVar = new C5324a();
                    aVar.mo17468c((String) hashMap.get("Authorization"));
                    try {
                        this.f19086b.put(c, aVar.mo17471e());
                    } catch (JSONException e) {
                        Log.e(f19085a, "Unable to store a new credential", e);
                    }
                    if (this.f19088d) {
                        m26653a(aVar);
                    }
                    m26657d();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo17478a(boolean z) {
        this.f19088d = z;
    }

    /* renamed from: b */
    public C5324a mo17479b() {
        return this.f19087c;
    }

    /* renamed from: b */
    public boolean mo17480b(String str) {
        JSONObject jSONObject = (JSONObject) this.f19086b.remove(m26654c(m26656d(str)));
        if (jSONObject == null) {
            return false;
        }
        if (new C5324a(jSONObject).equals(this.f19087c)) {
            m26658e();
        }
        m26657d();
        return true;
    }

    public String toString() {
        return this.f19086b.toString();
    }
}
