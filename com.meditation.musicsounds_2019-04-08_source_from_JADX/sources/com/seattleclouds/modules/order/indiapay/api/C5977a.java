package com.seattleclouds.modules.order.indiapay.api;

import android.util.Base64;
import com.seattleclouds.api.HttpResponseException;
import com.seattleclouds.modules.order.indiapay.p180c.C5998a;
import com.seattleclouds.modules.order.indiapay.p180c.C5999b;
import com.seattleclouds.modules.order.indiapay.p180c.C6000c;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6613i;
import com.seattleclouds.util.HTTPUtil;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.order.indiapay.api.a */
public class C5977a {

    /* renamed from: a */
    private static final String f21192a = "a";

    /* renamed from: b */
    private static C5977a f21193b;

    /* renamed from: c */
    private HttpURLConnection f21194c;

    /* renamed from: a */
    public static C5977a m29304a() {
        if (f21193b == null) {
            f21193b = new C5977a();
        }
        return f21193b;
    }

    /* renamed from: a */
    private String m29305a(String str, String str2, String str3) {
        return Base64.encodeToString(new C5998a(str3, str2.getBytes()).mo18908a(str.getBytes()), 2);
    }

    /* renamed from: a */
    private String m29306a(String str, Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        sb.append("https://app.indiapay.com/api/v1/");
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
    private String m29307a(HashMap<String, String> hashMap, String str, String str2) {
        String a = m29305a(new JSONObject(hashMap).toString(), str, str2);
        if (a != null) {
            return a;
        }
        throw new JSONException(" encrypted error");
    }

    /* renamed from: a */
    private String m29308a(byte[] bArr, String str, String str2) {
        byte[] b = new C5998a(str2, str.getBytes()).mo18909b(bArr);
        if (b != null) {
            return Base64.encodeToString(b, 0);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x008d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject m29309a(com.seattleclouds.modules.order.indiapay.p180c.C6000c r3, java.lang.String r4) {
        /*
            r2 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "docustomertransaction"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x002f
            java.lang.String r4 = com.seattleclouds.modules.order.indiapay.p180c.C5999b.f21265c
            java.lang.String r1 = r3.mo18911a()
            r0.put(r4, r1)
            java.lang.String r4 = com.seattleclouds.modules.order.indiapay.p180c.C5999b.f21266d
            java.lang.String r1 = r3.mo18914b()
            r0.put(r4, r1)
            boolean r4 = r3.mo18936k()
            if (r4 == 0) goto L_0x0047
            java.lang.String r4 = com.seattleclouds.modules.order.indiapay.p180c.C5999b.f21278p
            java.lang.String r1 = r3.mo18933j()
        L_0x002b:
            r0.put(r4, r1)
            goto L_0x0047
        L_0x002f:
            java.lang.String r1 = "getqrcode"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00ef
            java.lang.String r4 = com.seattleclouds.modules.order.indiapay.p180c.C5999b.f21263a
            java.lang.String r1 = r3.mo18937l()
            r0.put(r4, r1)
            java.lang.String r4 = com.seattleclouds.modules.order.indiapay.p180c.C5999b.f21264b
            java.lang.String r1 = r3.mo18939m()
            goto L_0x002b
        L_0x0047:
            java.lang.String r4 = com.seattleclouds.modules.order.indiapay.p180c.C5999b.f21268f
            java.lang.String r1 = r3.mo18925f()
            r0.put(r4, r1)
            java.lang.String r4 = com.seattleclouds.modules.order.indiapay.p180c.C5999b.f21271i
            java.lang.String r1 = r3.mo18920d()
            r0.put(r4, r1)
            java.lang.String r4 = com.seattleclouds.modules.order.indiapay.p180c.C5999b.f21270h
            java.lang.String r1 = r3.mo18917c()
            r0.put(r4, r1)
            java.lang.String r4 = com.seattleclouds.modules.order.indiapay.p180c.C5999b.f21273k
            java.lang.String r1 = r3.mo18927g()
            r0.put(r4, r1)
            java.lang.String r4 = com.seattleclouds.modules.order.indiapay.p180c.C5999b.f21276n
            java.lang.String r1 = r3.mo18923e()
            r0.put(r4, r1)
            java.lang.String r4 = r3.mo18931i()
            boolean r4 = com.seattleclouds.util.C6592al.m31909b(r4)
            if (r4 != 0) goto L_0x0087
            java.lang.String r4 = com.seattleclouds.modules.order.indiapay.p180c.C5999b.f21277o
            java.lang.String r1 = r3.mo18931i()
            r0.put(r4, r1)
        L_0x0087:
            boolean r4 = r3.mo18946p()
            if (r4 == 0) goto L_0x00b1
            java.lang.String r4 = com.seattleclouds.modules.order.indiapay.p180c.C5999b.f21280r
            java.lang.String r1 = r3.mo18953t()
            r0.put(r4, r1)
            java.lang.String r4 = com.seattleclouds.modules.order.indiapay.p180c.C5999b.f21281s
            java.lang.String r1 = r3.mo18947q()
            r0.put(r4, r1)
            java.lang.String r4 = com.seattleclouds.modules.order.indiapay.p180c.C5999b.f21282t
            java.lang.String r1 = r3.mo18949r()
            r0.put(r4, r1)
            java.lang.String r4 = com.seattleclouds.modules.order.indiapay.p180c.C5999b.f21283u
            java.lang.String r1 = r3.mo18951s()
            r0.put(r4, r1)
        L_0x00b1:
            java.lang.String r4 = r3.mo18943o()
            java.lang.String r3 = r3.mo18941n()
            boolean r1 = com.seattleclouds.util.C6592al.m31909b(r4)
            if (r1 != 0) goto L_0x00e7
            boolean r1 = com.seattleclouds.util.C6592al.m31909b(r3)
            if (r1 != 0) goto L_0x00e7
            java.lang.String r3 = r2.m29307a(r0, r4, r3)
            boolean r4 = com.seattleclouds.util.C6592al.m31909b(r3)
            if (r4 != 0) goto L_0x00df
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r0 = com.seattleclouds.modules.order.indiapay.p180c.C5999b.f21279q
            r4.put(r0, r3)
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>(r4)
            return r3
        L_0x00df:
            com.seattleclouds.modules.order.indiapay.api.IndiaPayApiException r3 = new com.seattleclouds.modules.order.indiapay.api.IndiaPayApiException
            java.lang.String r4 = "Encrypted Data is null or empty"
            r3.<init>(r4)
            throw r3
        L_0x00e7:
            com.seattleclouds.modules.order.indiapay.api.IndiaPayApiException r3 = new com.seattleclouds.modules.order.indiapay.api.IndiaPayApiException
            java.lang.String r4 = "Secret key or Initialization Vector is null or empty"
            r3.<init>(r4)
            throw r3
        L_0x00ef:
            com.seattleclouds.modules.order.indiapay.api.IndiaPayApiException r3 = new com.seattleclouds.modules.order.indiapay.api.IndiaPayApiException
            java.lang.String r4 = "Incorrect url resource "
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.order.indiapay.api.C5977a.m29309a(com.seattleclouds.modules.order.indiapay.c.c, java.lang.String):org.json.JSONObject");
    }

    /* renamed from: a */
    private JSONObject m29310a(String str, String str2, Map<String, String> map, Map<String, String> map2, Object obj, String str3, String str4) {
        this.f21194c = (HttpURLConnection) new URL(m29306a(str2, map)).openConnection();
        try {
            this.f21194c.setReadTimeout(90000);
            this.f21194c.setConnectTimeout(90000);
            if (str.equals("POST")) {
                if (obj != null) {
                    this.f21194c.setRequestProperty("Content-Type", "application/json");
                }
                this.f21194c.setDoOutput(true);
            }
            this.f21194c.setRequestMethod(str);
            this.f21194c.setDoInput(true);
            this.f21194c.connect();
            if (str.equals("POST")) {
                m29312a(this.f21194c, obj != null ? obj.toString() : HTTPUtil.m31766a(map2));
            }
            InputStream errorStream = m29313a(this.f21194c.getResponseCode()) ? this.f21194c.getErrorStream() : this.f21194c.getInputStream();
            if (errorStream != null) {
                String b = C6613i.m31991b(errorStream);
                if (b == null || b.length() == 0) {
                    throw new HttpResponseException(this.f21194c.getResponseCode(), this.f21194c.getResponseMessage());
                }
                JSONObject jSONObject = new JSONObject(b);
                if (!m29313a(this.f21194c.getResponseCode())) {
                    return jSONObject;
                }
                JSONObject a = m29311a(jSONObject, str3, str4);
                String str5 = "Error";
                if (a != null) {
                    str5 = a.getString("Encrypteddata");
                }
                throw new IndiaPayApiException(str5);
            }
            throw new HttpResponseException(this.f21194c.getResponseCode(), this.f21194c.getResponseMessage());
        } finally {
            this.f21194c.disconnect();
        }
    }

    /* renamed from: a */
    private JSONObject m29311a(JSONObject jSONObject, String str, String str2) {
        if (jSONObject != null) {
            String a = m29308a(Base64.decode(jSONObject.getString(C5999b.f21279q), 0), str, str2);
            if (a != null) {
                return new JSONObject(new String(Base64.decode(a, 2)));
            }
            throw new IndiaPayApiException(" DecryptedData return null");
        }
        throw new IndiaPayApiException("json Encrypted return null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m29312a(java.net.HttpURLConnection r4, java.lang.String r5) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.order.indiapay.api.C5977a.m29312a(java.net.HttpURLConnection, java.lang.String):void");
    }

    /* renamed from: a */
    private boolean m29313a(int i) {
        return i < 200 || i >= 400;
    }

    /* renamed from: a */
    public JSONObject mo18883a(C6000c cVar) {
        JSONObject a = m29309a(cVar, "docustomertransaction");
        String o = cVar.mo18943o();
        String n = cVar.mo18941n();
        JSONObject a2 = m29311a(m29310a("POST", "docustomertransaction", null, null, a, o, n), o, n);
        if (a2 != null) {
            return a2;
        }
        throw new JSONException("doCustomerTransaction returns null");
    }

    /* renamed from: b */
    public JSONObject mo18884b(C6000c cVar) {
        JSONObject a = m29309a(cVar, "getqrcode");
        String o = cVar.mo18943o();
        String n = cVar.mo18941n();
        JSONObject a2 = m29311a(m29310a("POST", "getqrcode", null, null, a, o, n), o, n);
        if (a2 != null) {
            return a2;
        }
        throw new JSONException("getQrcode returns null");
    }

    /* renamed from: b */
    public void mo18885b() {
        if (this.f21194c != null) {
            this.f21194c.disconnect();
        }
    }

    /* renamed from: c */
    public JSONObject mo18886c(C6000c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(C5999b.f21263a, cVar.mo18937l());
        hashMap.put(C5999b.f21264b, cVar.mo18939m());
        hashMap.put(C5999b.f21267e, cVar.mo18929h());
        String o = cVar.mo18943o();
        String n = cVar.mo18941n();
        if (C6592al.m31909b(o) || C6592al.m31909b(n)) {
            throw new IndiaPayApiException("Secret key or Initialization Vector is null or empty");
        }
        String a = m29307a(hashMap, o, n);
        if (!C6592al.m31909b(a)) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(C5999b.f21279q, a);
            JSONObject a2 = m29311a(m29310a("POST", "gettxnstatus", null, null, new JSONObject(hashMap2), o, n), o, n);
            if (a2 != null) {
                return a2;
            }
            throw new JSONException("getTxnStatus returns null");
        }
        throw new IndiaPayApiException("Encrypted Data is null or empty");
    }
}
