package com.seattleclouds.modules.p169g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebView;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.p161f.C5346b;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6608d;
import com.seattleclouds.util.C6613i;
import com.seattleclouds.util.C6620n;
import com.seattleclouds.util.C6620n.C6628a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.HashMap;
import org.apache.commons.p198io.C6730b;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.g.b */
public class C5678b extends C5346b {

    /* renamed from: a */
    private static final String f20176a = "b";
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f20177f = "";
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f20178g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f20179h;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m28055a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".chartsettings.json");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f20179h);
        sb3.append(str);
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f20179h);
        sb5.append(str);
        sb5.append(".chartdata.json");
        String sb6 = sb5.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(this.f20179h);
        sb7.append(str);
        sb7.append(".chartsettings.json");
        String sb8 = sb7.toString();
        if (!m28063b(str, sb4)) {
            return false;
        }
        return (str2 == null || m28063b(str2, sb6)) && m28063b(sb2, sb8);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m28056a(String str, HashMap<String, String> hashMap) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20179h);
        sb.append(str);
        sb.append(".chartdata.json");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f20179h);
        sb3.append(str);
        sb3.append(".chartsettings.json");
        String sb4 = sb3.toString();
        try {
            JSONObject jSONObject = new JSONObject(C6613i.m31991b(App.m25649e(sb4)));
            String str2 = (String) hashMap.get("Chart");
            if (str2 == null) {
                str2 = jSONObject.getString("type");
            }
            if (str2 == null) {
                str2 = "Column2D";
            }
            String str3 = (String) hashMap.get("DataFormat");
            if (str3 == null) {
                str3 = jSONObject.getString("dataFormat");
                if (str3 == null) {
                    str3 = "JSON";
                }
            }
            jSONObject.put("isDataSourceLocal", true);
            jSONObject.put("type", str2);
            jSONObject.put("dataFormat", str3);
            jSONObject.put("dataSourceURL", sb2);
            FileOutputStream fileOutputStream = new FileOutputStream(new File(new URI(App.m25655h(sb4))));
            fileOutputStream.write(jSONObject.toString().getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException | IllegalArgumentException | JSONException e) {
            Log.e(f20176a, "Error: Parsing the config file failed:", e);
            return false;
        } catch (URISyntaxException e2) {
            Log.e(f20176a, "Error: Parsing the config file failed:", e2);
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: aB */
    public C5681c m28057aB() {
        return new C5681c().mo18277a((C6608d) new C6608d() {
            /* renamed from: a */
            public void mo16855a(Object obj) {
                if (((Integer) obj).intValue() == 0) {
                    C5678b.this.m28058aC();
                    return;
                }
                HashMap a = C5678b.this.m28070f(C5678b.this.f20178g);
                C5678b.this.m28055a(C5678b.this.f20177f, (String) null);
                C5678b.this.m28056a(C5678b.this.f20177f, a);
                WebView e = C5678b.this.f19171d;
                StringBuilder sb = new StringBuilder();
                sb.append(C5678b.this.f20179h);
                sb.append(C5678b.this.f20177f);
                e.loadUrl(App.m25655h(sb.toString()));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: aC */
    public void m28058aC() {
        C6620n.m32041a((Context) mo1318s(), mo1219a(C5462k.fusioncharts_login_title), mo1219a(C5462k.fusioncharts_login_message), false, mo1219a(C5462k.f19438OK), (C6628a) new C6628a() {
            /* renamed from: a */
            public void mo18027a() {
            }

            /* renamed from: a */
            public void mo18028a(String str, String str2) {
                StringBuilder sb = new StringBuilder();
                sb.append(C5678b.this.f20179h);
                sb.append(C5678b.this.f20177f);
                sb.append(".chartdata.json");
                String sb2 = sb.toString();
                C5678b.this.m28057aB().execute(new Object[]{sb2, C5678b.this.f20178g, str, str2});
            }
        });
    }

    @SuppressLint({"NewApi"})
    /* renamed from: aI */
    private void m28059aI() {
        if (VERSION.SDK_INT >= 16) {
            this.f19171d.getSettings().setAllowUniversalAccessFromFileURLs(true);
        }
        this.f19171d.getSettings().setPluginState(PluginState.ON);
        this.f19171d.getSettings().setLoadWithOverviewMode(false);
        this.f19171d.getSettings().setUseWideViewPort(false);
    }

    /* renamed from: aJ */
    private boolean m28060aJ() {
        StringBuilder sb = new StringBuilder();
        sb.append("yhfkdjmeol_fusioncharteditor_");
        sb.append(this.f20177f);
        sb.append(".chartdata.json");
        try {
            return new File(new URI(App.m25655h(sb.toString()))).exists();
        } catch (URISyntaxException unused) {
            return true;
        }
    }

    /* renamed from: aK */
    private HashMap<String, String> m28061aK() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("DataFormat", "JSON");
        hashMap.put("Chart", "MSLine");
        return hashMap;
    }

    /* renamed from: b */
    private boolean m28063b(String str, String str2) {
        try {
            File file = new File(new URI(App.m25655h(str)));
            if (file.exists()) {
                C6730b.m32454a(file, new File(new URI(App.m25655h(str2))));
            }
            return true;
        } catch (IOException | URISyntaxException e) {
            Log.e(f20176a, "Error: Can't copy file:", e);
            return false;
        }
    }

    /* renamed from: c */
    private String m28065c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.hashCode());
        sb.append("");
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r6v3, types: [java.lang.IllegalArgumentException] */
    /* JADX WARNING: type inference failed for: r6v4, types: [java.lang.IllegalArgumentException] */
    /* JADX WARNING: type inference failed for: r6v5, types: [java.io.IOException] */
    /* JADX WARNING: type inference failed for: r6v6, types: [java.io.IOException] */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.IllegalArgumentException] */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r6v15 */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.io.IOException] */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r6v16 */
    /* JADX WARNING: type inference failed for: r0v10, types: [org.json.JSONException] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r6v18 */
    /* JADX WARNING: type inference failed for: r6v19 */
    /* JADX WARNING: type inference failed for: r6v20 */
    /* JADX WARNING: type inference failed for: r6v21 */
    /* JADX WARNING: type inference failed for: r6v22 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 11 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m28068e(java.lang.String r6) {
        /*
            r5 = this;
            java.io.InputStream r6 = com.seattleclouds.App.m25649e(r6)
            r0 = 0
            java.lang.String r6 = com.seattleclouds.util.C6613i.m31991b(r6)     // Catch:{ IllegalArgumentException -> 0x005f, IOException -> 0x004d, JSONException -> 0x003b }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ IllegalArgumentException -> 0x005f, IOException -> 0x004d, JSONException -> 0x003b }
            r1.<init>(r6)     // Catch:{ IllegalArgumentException -> 0x005f, IOException -> 0x004d, JSONException -> 0x003b }
            java.lang.String r6 = "isDataSourceLocal"
            java.lang.String r6 = r1.getString(r6)     // Catch:{ IllegalArgumentException -> 0x005f, IOException -> 0x004d, JSONException -> 0x003b }
            java.lang.String r2 = "true"
            int r6 = r6.compareTo(r2)     // Catch:{ IllegalArgumentException -> 0x005f, IOException -> 0x004d, JSONException -> 0x003b }
            if (r6 != 0) goto L_0x001d
            return r0
        L_0x001d:
            java.lang.String r6 = "dataSourceURL"
            java.lang.String r6 = r1.getString(r6)     // Catch:{ IllegalArgumentException -> 0x005f, IOException -> 0x004d, JSONException -> 0x003b }
            boolean r1 = com.seattleclouds.util.C6592al.m31909b(r6)     // Catch:{ IllegalArgumentException -> 0x0036, IOException -> 0x0031, JSONException -> 0x002c }
            if (r1 == 0) goto L_0x002a
            return r0
        L_0x002a:
            r0 = r6
            goto L_0x007a
        L_0x002c:
            r0 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
            goto L_0x003c
        L_0x0031:
            r0 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
            goto L_0x004e
        L_0x0036:
            r0 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
            goto L_0x0060
        L_0x003b:
            r6 = move-exception
        L_0x003c:
            java.lang.String r1 = f20176a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "ERROR:"
            r2.append(r3)
            java.lang.String r3 = r6.getLocalizedMessage()
            goto L_0x0070
        L_0x004d:
            r6 = move-exception
        L_0x004e:
            java.lang.String r1 = f20176a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "ERROR:"
            r2.append(r3)
            java.lang.String r3 = r6.getLocalizedMessage()
            goto L_0x0070
        L_0x005f:
            r6 = move-exception
        L_0x0060:
            java.lang.String r1 = f20176a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "ERROR:"
            r2.append(r3)
            java.lang.String r3 = r6.getLocalizedMessage()
        L_0x0070:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r1, r2, r6)
        L_0x007a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.p169g.C5678b.m28068e(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public HashMap<String, String> m28070f(String str) {
        try {
            HashMap<String, String> hashMap = new HashMap<>();
            for (NameValuePair nameValuePair : URLEncodedUtils.parse(new URI(URLDecoder.decode(str, "UTF-8")), "UTF-8")) {
                hashMap.put(nameValuePair.getName(), nameValuePair.getValue());
            }
            return hashMap;
        } catch (UnsupportedEncodingException | URISyntaxException e) {
            Log.e(f20176a, "URL parsing error ", e);
            return null;
        }
    }

    /* renamed from: J */
    public void mo1200J() {
        WebView webView;
        String str;
        super.mo1200J();
        m28059aI();
        Bundle m = mo1307m();
        if (m != null) {
            this.f20177f = m.getString("PAGE_ID");
            this.f20178g = m.getString("ACTION_PARAMS");
            this.f20179h = m28065c(this.f20177f);
            if (C6592al.m31909b(this.f20178g)) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f20177f);
                sb.append(".chartsettings.json");
                this.f20178g = m28068e(sb.toString());
            }
            if (!C6592al.m31909b(this.f20178g)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f20179h);
                sb2.append(this.f20177f);
                sb2.append(".chartdata.json");
                String sb3 = sb2.toString();
                m28057aB().execute(new Object[]{sb3, this.f20178g});
                return;
            }
            if (m28060aJ()) {
                HashMap aK = m28061aK();
                String str2 = this.f20177f;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("yhfkdjmeol_fusioncharteditor_");
                sb4.append(this.f20177f);
                sb4.append(".chartdata.json");
                m28055a(str2, sb4.toString());
                m28056a(this.f20177f, aK);
                webView = this.f19171d;
                StringBuilder sb5 = new StringBuilder();
                sb5.append(this.f20179h);
                sb5.append(this.f20177f);
                str = sb5.toString();
            } else {
                webView = this.f19171d;
                str = this.f20177f;
            }
            webView.loadUrl(App.m25655h(str));
        }
    }
}
