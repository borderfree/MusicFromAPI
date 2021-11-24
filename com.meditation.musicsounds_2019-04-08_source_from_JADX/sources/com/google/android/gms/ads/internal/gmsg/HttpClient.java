package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import android.support.annotation.Keep;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.C3651jf;
import com.google.android.gms.internal.ads.axh;
import com.google.android.gms.internal.ads.zzang;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
@C3464ci
@KeepName
public class HttpClient implements zzv<axh> {
    private final Context mContext;
    private final zzang zzyf;

    @C3464ci
    /* renamed from: com.google.android.gms.ads.internal.gmsg.HttpClient$a */
    static class C2880a {

        /* renamed from: a */
        private final String f9979a;

        /* renamed from: b */
        private final String f9980b;

        public C2880a(String str, String str2) {
            this.f9979a = str;
            this.f9980b = str2;
        }

        /* renamed from: a */
        public final String mo10023a() {
            return this.f9979a;
        }

        /* renamed from: b */
        public final String mo10024b() {
            return this.f9980b;
        }
    }

    @C3464ci
    /* renamed from: com.google.android.gms.ads.internal.gmsg.HttpClient$b */
    static class C2881b {

        /* renamed from: a */
        private final String f9981a;

        /* renamed from: b */
        private final URL f9982b;

        /* renamed from: c */
        private final ArrayList<C2880a> f9983c;

        /* renamed from: d */
        private final String f9984d;

        C2881b(String str, URL url, ArrayList<C2880a> arrayList, String str2) {
            this.f9981a = str;
            this.f9982b = url;
            this.f9983c = arrayList;
            this.f9984d = str2;
        }

        /* renamed from: a */
        public final String mo10025a() {
            return this.f9981a;
        }

        /* renamed from: b */
        public final URL mo10026b() {
            return this.f9982b;
        }

        /* renamed from: c */
        public final ArrayList<C2880a> mo10027c() {
            return this.f9983c;
        }

        /* renamed from: d */
        public final String mo10028d() {
            return this.f9984d;
        }
    }

    @C3464ci
    /* renamed from: com.google.android.gms.ads.internal.gmsg.HttpClient$c */
    class C2882c {

        /* renamed from: a */
        private final C2883d f9985a;

        /* renamed from: b */
        private final boolean f9986b;

        /* renamed from: c */
        private final String f9987c;

        public C2882c(HttpClient httpClient, boolean z, C2883d dVar, String str) {
            this.f9986b = z;
            this.f9985a = dVar;
            this.f9987c = str;
        }

        /* renamed from: a */
        public final String mo10029a() {
            return this.f9987c;
        }

        /* renamed from: b */
        public final C2883d mo10030b() {
            return this.f9985a;
        }

        /* renamed from: c */
        public final boolean mo10031c() {
            return this.f9986b;
        }
    }

    @C3464ci
    /* renamed from: com.google.android.gms.ads.internal.gmsg.HttpClient$d */
    static class C2883d {

        /* renamed from: a */
        private final String f9988a;

        /* renamed from: b */
        private final int f9989b;

        /* renamed from: c */
        private final List<C2880a> f9990c;

        /* renamed from: d */
        private final String f9991d;

        C2883d(String str, int i, List<C2880a> list, String str2) {
            this.f9988a = str;
            this.f9989b = i;
            this.f9990c = list;
            this.f9991d = str2;
        }

        /* renamed from: a */
        public final String mo10032a() {
            return this.f9988a;
        }

        /* renamed from: b */
        public final int mo10033b() {
            return this.f9989b;
        }

        /* renamed from: c */
        public final Iterable<C2880a> mo10034c() {
            return this.f9990c;
        }

        /* renamed from: d */
        public final String mo10035d() {
            return this.f9991d;
        }
    }

    public HttpClient(Context context, zzang zzang) {
        this.mContext = context;
        this.zzyf = zzang;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.ads.internal.gmsg.HttpClient.C2882c zza(com.google.android.gms.ads.internal.gmsg.HttpClient.C2881b r13) {
        /*
            r12 = this;
            r0 = 0
            r1 = 0
            java.net.URL r2 = r13.mo10026b()     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            com.google.android.gms.internal.ads.jh r3 = com.google.android.gms.ads.internal.zzbv.zzek()     // Catch:{ Exception -> 0x00eb }
            android.content.Context r4 = r12.mContext     // Catch:{ Exception -> 0x00eb }
            com.google.android.gms.internal.ads.zzang r5 = r12.zzyf     // Catch:{ Exception -> 0x00eb }
            java.lang.String r5 = r5.f15360a     // Catch:{ Exception -> 0x00eb }
            r3.mo13127a(r4, r5, r0, r2)     // Catch:{ Exception -> 0x00eb }
            java.util.ArrayList r3 = r13.mo10027c()     // Catch:{ Exception -> 0x00eb }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ Exception -> 0x00eb }
            int r4 = r3.size()     // Catch:{ Exception -> 0x00eb }
            r5 = 0
        L_0x0024:
            if (r5 >= r4) goto L_0x003a
            java.lang.Object r6 = r3.get(r5)     // Catch:{ Exception -> 0x00eb }
            int r5 = r5 + 1
            com.google.android.gms.ads.internal.gmsg.HttpClient$a r6 = (com.google.android.gms.ads.internal.gmsg.HttpClient.C2880a) r6     // Catch:{ Exception -> 0x00eb }
            java.lang.String r7 = r6.mo10023a()     // Catch:{ Exception -> 0x00eb }
            java.lang.String r6 = r6.mo10024b()     // Catch:{ Exception -> 0x00eb }
            r2.addRequestProperty(r7, r6)     // Catch:{ Exception -> 0x00eb }
            goto L_0x0024
        L_0x003a:
            java.lang.String r3 = r13.mo10028d()     // Catch:{ Exception -> 0x00eb }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x00eb }
            r4 = 1
            if (r3 != 0) goto L_0x0064
            r2.setDoOutput(r4)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r3 = r13.mo10028d()     // Catch:{ Exception -> 0x00eb }
            byte[] r3 = r3.getBytes()     // Catch:{ Exception -> 0x00eb }
            int r5 = r3.length     // Catch:{ Exception -> 0x00eb }
            r2.setFixedLengthStreamingMode(r5)     // Catch:{ Exception -> 0x00eb }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00eb }
            java.io.OutputStream r6 = r2.getOutputStream()     // Catch:{ Exception -> 0x00eb }
            r5.<init>(r6)     // Catch:{ Exception -> 0x00eb }
            r5.write(r3)     // Catch:{ Exception -> 0x00eb }
            r5.close()     // Catch:{ Exception -> 0x00eb }
            goto L_0x0065
        L_0x0064:
            r3 = r1
        L_0x0065:
            com.google.android.gms.internal.ads.lx r5 = new com.google.android.gms.internal.ads.lx     // Catch:{ Exception -> 0x00eb }
            r5.<init>()     // Catch:{ Exception -> 0x00eb }
            r5.mo13240a(r2, r3)     // Catch:{ Exception -> 0x00eb }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x00eb }
            r3.<init>()     // Catch:{ Exception -> 0x00eb }
            java.util.Map r6 = r2.getHeaderFields()     // Catch:{ Exception -> 0x00eb }
            if (r6 == 0) goto L_0x00b5
            java.util.Map r6 = r2.getHeaderFields()     // Catch:{ Exception -> 0x00eb }
            java.util.Set r6 = r6.entrySet()     // Catch:{ Exception -> 0x00eb }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x00eb }
        L_0x0084:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x00eb }
            if (r7 == 0) goto L_0x00b5
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x00eb }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ Exception -> 0x00eb }
            java.lang.Object r8 = r7.getValue()     // Catch:{ Exception -> 0x00eb }
            java.util.List r8 = (java.util.List) r8     // Catch:{ Exception -> 0x00eb }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x00eb }
        L_0x009a:
            boolean r9 = r8.hasNext()     // Catch:{ Exception -> 0x00eb }
            if (r9 == 0) goto L_0x0084
            java.lang.Object r9 = r8.next()     // Catch:{ Exception -> 0x00eb }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x00eb }
            com.google.android.gms.ads.internal.gmsg.HttpClient$a r10 = new com.google.android.gms.ads.internal.gmsg.HttpClient$a     // Catch:{ Exception -> 0x00eb }
            java.lang.Object r11 = r7.getKey()     // Catch:{ Exception -> 0x00eb }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x00eb }
            r10.<init>(r11, r9)     // Catch:{ Exception -> 0x00eb }
            r3.add(r10)     // Catch:{ Exception -> 0x00eb }
            goto L_0x009a
        L_0x00b5:
            com.google.android.gms.ads.internal.gmsg.HttpClient$d r6 = new com.google.android.gms.ads.internal.gmsg.HttpClient$d     // Catch:{ Exception -> 0x00eb }
            java.lang.String r13 = r13.mo10025a()     // Catch:{ Exception -> 0x00eb }
            int r7 = r2.getResponseCode()     // Catch:{ Exception -> 0x00eb }
            com.google.android.gms.ads.internal.zzbv.zzek()     // Catch:{ Exception -> 0x00eb }
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00eb }
            java.io.InputStream r9 = r2.getInputStream()     // Catch:{ Exception -> 0x00eb }
            r8.<init>(r9)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r8 = com.google.android.gms.internal.ads.C3653jh.m18868a(r8)     // Catch:{ Exception -> 0x00eb }
            r6.<init>(r13, r7, r3, r8)     // Catch:{ Exception -> 0x00eb }
            int r13 = r6.mo10033b()     // Catch:{ Exception -> 0x00eb }
            r5.mo13239a(r2, r13)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r13 = r6.mo10035d()     // Catch:{ Exception -> 0x00eb }
            r5.mo13237a(r13)     // Catch:{ Exception -> 0x00eb }
            com.google.android.gms.ads.internal.gmsg.HttpClient$c r13 = new com.google.android.gms.ads.internal.gmsg.HttpClient$c     // Catch:{ Exception -> 0x00eb }
            r13.<init>(r12, r4, r6, r1)     // Catch:{ Exception -> 0x00eb }
            if (r2 == 0) goto L_0x00ea
            r2.disconnect()
        L_0x00ea:
            return r13
        L_0x00eb:
            r13 = move-exception
            goto L_0x00f2
        L_0x00ed:
            r13 = move-exception
            r2 = r1
            goto L_0x0102
        L_0x00f0:
            r13 = move-exception
            r2 = r1
        L_0x00f2:
            com.google.android.gms.ads.internal.gmsg.HttpClient$c r3 = new com.google.android.gms.ads.internal.gmsg.HttpClient$c     // Catch:{ all -> 0x0101 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0101 }
            r3.<init>(r12, r0, r1, r13)     // Catch:{ all -> 0x0101 }
            if (r2 == 0) goto L_0x0100
            r2.disconnect()
        L_0x0100:
            return r3
        L_0x0101:
            r13 = move-exception
        L_0x0102:
            if (r2 == 0) goto L_0x0107
            r2.disconnect()
        L_0x0107:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.gmsg.HttpClient.zza(com.google.android.gms.ads.internal.gmsg.HttpClient$b):com.google.android.gms.ads.internal.gmsg.HttpClient$c");
    }

    private static JSONObject zza(C2883d dVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("http_request_id", dVar.mo10032a());
            if (dVar.mo10035d() != null) {
                jSONObject.put("body", dVar.mo10035d());
            }
            JSONArray jSONArray = new JSONArray();
            for (C2880a aVar : dVar.mo10034c()) {
                jSONArray.put(new JSONObject().put("key", aVar.mo10023a()).put("value", aVar.mo10024b()));
            }
            jSONObject.put("headers", jSONArray);
            jSONObject.put("response_code", dVar.mo10033b());
        } catch (JSONException e) {
            C3643iy.m19173b("Error constructing JSON for http response.", e);
        }
        return jSONObject;
    }

    private static C2881b zzc(JSONObject jSONObject) {
        String optString = jSONObject.optString("http_request_id");
        String optString2 = jSONObject.optString("url");
        URL url = null;
        String optString3 = jSONObject.optString("post_body", null);
        try {
            url = new URL(optString2);
        } catch (MalformedURLException e) {
            C3643iy.m19173b("Error constructing http request.", e);
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("headers");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(new C2880a(optJSONObject.optString("key"), optJSONObject.optString("value")));
            }
        }
        return new C2881b(optString, url, arrayList, optString3);
    }

    @Keep
    @KeepName
    public JSONObject send(JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2 = new JSONObject();
        try {
            str = jSONObject.optString("http_request_id");
            try {
                C2882c zza = zza(zzc(jSONObject));
                if (zza.mo10031c()) {
                    jSONObject2.put("response", zza(zza.mo10030b()));
                    jSONObject2.put("success", true);
                } else {
                    jSONObject2.put("response", new JSONObject().put("http_request_id", str));
                    jSONObject2.put("success", false);
                    jSONObject2.put("reason", zza.mo10029a());
                }
            } catch (Exception e) {
                e = e;
                C3643iy.m19173b("Error executing http request.", e);
                try {
                    jSONObject2.put("response", new JSONObject().put("http_request_id", str));
                    jSONObject2.put("success", false);
                    jSONObject2.put("reason", e.toString());
                } catch (JSONException e2) {
                    C3643iy.m19173b("Error executing http request.", e2);
                }
                return jSONObject2;
            }
        } catch (Exception e3) {
            e = e3;
            str = "";
            C3643iy.m19173b("Error executing http request.", e);
            jSONObject2.put("response", new JSONObject().put("http_request_id", str));
            jSONObject2.put("success", false);
            jSONObject2.put("reason", e.toString());
            return jSONObject2;
        }
        return jSONObject2;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C3651jf.m18855a((Runnable) new C2899p(this, map, (axh) obj));
    }
}
