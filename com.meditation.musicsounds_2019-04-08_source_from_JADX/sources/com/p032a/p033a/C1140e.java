package com.p032a.p033a;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.a.a.e */
final class C1140e {

    /* renamed from: a */
    WebView f4130a = null;

    /* renamed from: b */
    String f4131b;

    /* renamed from: c */
    CookieManager f4132c = CookieManager.getInstance();

    /* renamed from: d */
    Timer f4133d;

    /* renamed from: e */
    boolean f4134e = false;

    /* renamed from: f */
    boolean f4135f = false;

    /* renamed from: com.a.a.e$a */
    public class C1145a {
        public C1145a() {
        }

        @JavascriptInterface
        public final String getJSONData() {
            StringBuilder sb;
            StringBuilder sb2 = new StringBuilder("---------getJSONData----->");
            sb2.append(C1140e.this.f4131b);
            String sb3 = sb2.toString();
            if (sb3.length() > 3900) {
                StringBuilder sb4 = new StringBuilder("<>");
                sb4.append(sb3);
                sb3 = sb4.toString();
                while (sb3.length() > 3900) {
                    sb3.substring(0, 3900);
                    sb3 = sb3.substring(3900);
                }
                sb = new StringBuilder();
            } else {
                sb = new StringBuilder("<>");
            }
            sb.append(sb3);
            sb.append("</>");
            return C1140e.this.f4131b != null ? C1140e.this.f4131b : "";
        }

        @JavascriptInterface
        public final void make_request(String str, String str2, String str3) {
            C1134a.m6227a(str, str2, str3);
        }

        @JavascriptInterface
        public final String ready(String str) {
            if (!C1140e.this.f4134e) {
                C1140e.this.f4134e = true;
                if (C1140e.this.f4133d != null) {
                    C1140e.this.f4133d.cancel();
                    C1140e.this.f4133d.purge();
                }
                if (str.toLowerCase().contains("beta_kill")) {
                    String string = C1134a.f4098e.getSharedPreferences("WOInspector", 0).getString("wossid", "");
                    C1134a.f4099f = string;
                    if (!string.equals("")) {
                        byte[] decode = Base64.decode(C1134a.f4099f, 0);
                        byte[] bytes = "wossid".getBytes();
                        byte[] bArr = new byte[decode.length];
                        for (int i = 0; i < decode.length; i++) {
                            bArr[i] = (byte) (decode[i] ^ bytes[i % bytes.length]);
                        }
                        C1134a.f4099f = new String(bArr);
                    }
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("TYPE", "KILL");
                        jSONObject2.put("PROXY_ORIGIN", C1134a.f4097d);
                        jSONObject.put("CI", C1134a.f3956a);
                        jSONObject.put("ID", C1134a.f4099f);
                        jSONObject.put("DECISION_EVENT", jSONObject2);
                        jSONObject.put("CT", C1134a.f4009b);
                    } catch (JSONException unused) {
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        Iterator keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String str2 = (String) keys.next();
                            jSONObject3.put(str2, jSONObject.get(str2));
                        }
                        jSONObject3.put("DATA", "");
                        C1134a.f4100g.mo5578a(jSONObject3.toString());
                    } catch (JSONException unused2) {
                    }
                } else {
                    C1134a.m6225a();
                }
            }
            return "B1.0.5.01";
        }

        @JavascriptInterface
        public final void set_conf(String str) {
        }
    }

    @SuppressLint({"NewApi", "SetJavaScriptEnabled"})
    C1140e() {
        this.f4132c.setAcceptCookie(false);
        CookieManager.setAcceptFileSchemeCookies(false);
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            @SuppressLint({"AddJavascriptInterface"})
            public final void run() {
                try {
                    C1140e.this.f4130a = new WebView(C1134a.f4098e);
                    if (C1140e.this.f4130a instanceof WebView) {
                        C1140e.this.f4130a.getSettings().setJavaScriptEnabled(true);
                        C1140e.this.f4130a.setWebViewClient(new C1137c());
                        C1140e.this.f4130a.addJavascriptInterface(new C1145a(), "ozoki_nt");
                        C1140e.this.f4132c.setAcceptThirdPartyCookies(C1140e.this.f4130a, false);
                        return;
                    }
                    C1140e.this.f4135f = true;
                    C1140e.this.f4130a = null;
                } catch (Exception e) {
                    C1140e.this.f4135f = true;
                    C1140e.this.f4130a = null;
                    new StringBuilder("------##--------------->FAIL: webview creation throw exception: ").append(e.getMessage());
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"SimpleDateFormat"})
    /* renamed from: a */
    public final void mo5577a() {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                if (C1140e.this.f4130a != null) {
                    try {
                        String format = new SimpleDateFormat("yyyyMMddHHmm").format(new Date());
                        StringBuilder sb = new StringBuilder();
                        sb.append(C1134a.f4062c);
                        sb.append("?ci=");
                        sb.append(C1134a.f3956a);
                        sb.append("&cb=");
                        sb.append(format);
                        sb.append("&sdk=b");
                        C1140e.this.f4130a.loadUrl(sb.toString());
                    } catch (Exception e) {
                        C1140e.this.f4135f = true;
                        new StringBuilder("--------------------->FAIL initHTML. Throw exception: ").append(e.getMessage());
                    }
                } else {
                    C1140e.this.f4135f = true;
                }
            }
        });
        mo5579b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5578a(String str) {
        this.f4131b = str;
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                if (C1140e.this.f4130a != null) {
                    try {
                        C1140e.this.f4130a.loadUrl("javascript:ozoki_zp.load(ozoki_nt.getJSONData())");
                    } catch (Exception e) {
                        new StringBuilder("------##---------------> WebView sendData Throw Exception: ").append(e.getMessage());
                    }
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo5579b() {
        if (!this.f4135f) {
            this.f4133d = new Timer();
            this.f4133d.schedule(new TimerTask() {
                public final void run() {
                    if (!C1140e.this.f4134e) {
                        String str = "";
                        try {
                            str = InetAddress.getByName(Uri.parse(C1134a.f4062c).getHost()).getHostAddress();
                        } catch (UnknownHostException unused) {
                        }
                        if (!str.equals("")) {
                            C1140e.this.mo5577a();
                        } else {
                            C1140e.this.mo5579b();
                        }
                    }
                }
            }, 60000);
        }
    }
}
