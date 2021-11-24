package com.seattleclouds.modules.dropbox.medialist;

import android.os.AsyncTask;
import android.util.Log;
import com.seattleclouds.App;
import com.seattleclouds.util.C6608d;
import com.seattleclouds.util.C6613i;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.dropbox.medialist.a */
public class C5535a extends AsyncTask<Object, Void, HashMap<String, Object>> {

    /* renamed from: a */
    static final String f19706a = "a";

    /* renamed from: b */
    C6608d f19707b;

    /* renamed from: c */
    private String f19708c;

    /* renamed from: a */
    private List<MediaFile> m27527a(JSONObject jSONObject, String str) {
        ArrayList arrayList = new ArrayList(0);
        try {
            JSONArray jSONArray = new JSONObject(C6613i.m31991b(new FileInputStream(str))).getJSONArray("videofiles");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                try {
                    jSONObject2.put("imageThmb", jSONObject.getString("imageThmb"));
                } catch (JSONException unused) {
                    jSONObject2.put("imageThmb", "dropbox_media_file.png");
                }
                arrayList.add(new MediaFile(jSONObject2));
            }
        } catch (Exception e) {
            String str2 = f19706a;
            StringBuilder sb = new StringBuilder();
            sb.append("ERROR: ");
            sb.append(e.getLocalizedMessage());
            Log.e(str2, sb.toString(), e);
        }
        return arrayList;
    }

    /* renamed from: a */
    private JSONObject m27528a(String str) {
        if (App.m25667n(str)) {
            try {
                return new JSONObject(C6613i.m31991b(App.m25649e(str)));
            } catch (Exception e) {
                String str2 = f19706a;
                StringBuilder sb = new StringBuilder();
                sb.append("ERROR: ");
                sb.append(e.getLocalizedMessage());
                Log.e(str2, sb.toString(), e);
                return null;
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("JSON config file not found! Path:");
            sb2.append(str);
            throw new FileNotFoundException(sb2.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a2 A[Catch:{ UnsupportedEncodingException -> 0x00c1, IOException -> 0x00a3, JSONException -> 0x0085, all -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c0 A[Catch:{ UnsupportedEncodingException -> 0x00c1, IOException -> 0x00a3, JSONException -> 0x0085, all -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e2 A[SYNTHETIC, Splitter:B:37:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m27529b(org.json.JSONObject r5, java.lang.String r6) {
        /*
            r4 = this;
            r0 = 0
            java.lang.String r1 = "Path"
            java.lang.String r1 = r5.getString(r1)     // Catch:{ UnsupportedEncodingException -> 0x00c1, IOException -> 0x00a3, JSONException -> 0x0085 }
            java.lang.String r2 = "tokenid"
            java.lang.String r5 = r5.getString(r2)     // Catch:{ UnsupportedEncodingException -> 0x00c1, IOException -> 0x00a3, JSONException -> 0x0085 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ UnsupportedEncodingException -> 0x00c1, IOException -> 0x00a3, JSONException -> 0x0085 }
            r2.<init>()     // Catch:{ UnsupportedEncodingException -> 0x00c1, IOException -> 0x00a3, JSONException -> 0x0085 }
            java.lang.String r3 = "tokenid"
            r2.put(r3, r5)     // Catch:{ UnsupportedEncodingException -> 0x00c1, IOException -> 0x00a3, JSONException -> 0x0085 }
            java.lang.String r5 = "action"
            java.lang.String r3 = "search_files"
            r2.put(r5, r3)     // Catch:{ UnsupportedEncodingException -> 0x00c1, IOException -> 0x00a3, JSONException -> 0x0085 }
            java.lang.String r5 = "vApi"
            java.lang.String r3 = "v2"
            r2.put(r5, r3)     // Catch:{ UnsupportedEncodingException -> 0x00c1, IOException -> 0x00a3, JSONException -> 0x0085 }
            java.lang.String r5 = "path"
            r2.put(r5, r1)     // Catch:{ UnsupportedEncodingException -> 0x00c1, IOException -> 0x00a3, JSONException -> 0x0085 }
            java.lang.String r5 = "username"
            java.lang.String r1 = com.seattleclouds.App.f18523y     // Catch:{ UnsupportedEncodingException -> 0x00c1, IOException -> 0x00a3, JSONException -> 0x0085 }
            r2.put(r5, r1)     // Catch:{ UnsupportedEncodingException -> 0x00c1, IOException -> 0x00a3, JSONException -> 0x0085 }
            java.lang.String r5 = "appid"
            java.lang.String r1 = com.seattleclouds.App.f18524z     // Catch:{ UnsupportedEncodingException -> 0x00c1, IOException -> 0x00a3, JSONException -> 0x0085 }
            r2.put(r5, r1)     // Catch:{ UnsupportedEncodingException -> 0x00c1, IOException -> 0x00a3, JSONException -> 0x0085 }
            java.lang.String r5 = "publisherid"
            java.lang.String r1 = com.seattleclouds.App.f18522x     // Catch:{ UnsupportedEncodingException -> 0x00c1, IOException -> 0x00a3, JSONException -> 0x0085 }
            r2.put(r5, r1)     // Catch:{ UnsupportedEncodingException -> 0x00c1, IOException -> 0x00a3, JSONException -> 0x0085 }
            java.lang.String r5 = "pageid"
            java.lang.String r1 = r4.f19708c     // Catch:{ UnsupportedEncodingException -> 0x00c1, IOException -> 0x00a3, JSONException -> 0x0085 }
            r2.put(r5, r1)     // Catch:{ UnsupportedEncodingException -> 0x00c1, IOException -> 0x00a3, JSONException -> 0x0085 }
            java.lang.String r5 = com.seattleclouds.modules.dropbox.medialist.C5536b.f19709a     // Catch:{ UnsupportedEncodingException -> 0x00c1, IOException -> 0x00a3, JSONException -> 0x0085 }
            java.lang.String r5 = com.seattleclouds.util.HTTPUtil.m31768b(r5, r2)     // Catch:{ UnsupportedEncodingException -> 0x00c1, IOException -> 0x00a3, JSONException -> 0x0085 }
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ UnsupportedEncodingException -> 0x00c1, IOException -> 0x00a3, JSONException -> 0x0085 }
            if (r1 != 0) goto L_0x0076
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ UnsupportedEncodingException -> 0x00c1, IOException -> 0x00a3, JSONException -> 0x0085 }
            r1.<init>(r6)     // Catch:{ UnsupportedEncodingException -> 0x00c1, IOException -> 0x00a3, JSONException -> 0x0085 }
            java.lang.String r6 = "UTF-8"
            java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r6)     // Catch:{ UnsupportedEncodingException -> 0x0073, IOException -> 0x0070, JSONException -> 0x006d, all -> 0x0069 }
            byte[] r5 = r5.getBytes(r6)     // Catch:{ UnsupportedEncodingException -> 0x0073, IOException -> 0x0070, JSONException -> 0x006d, all -> 0x0069 }
            r1.write(r5)     // Catch:{ UnsupportedEncodingException -> 0x0073, IOException -> 0x0070, JSONException -> 0x006d, all -> 0x0069 }
            r1.flush()     // Catch:{ UnsupportedEncodingException -> 0x0073, IOException -> 0x0070, JSONException -> 0x006d, all -> 0x0069 }
            r0 = r1
            goto L_0x007d
        L_0x0069:
            r5 = move-exception
            r0 = r1
            goto L_0x00e0
        L_0x006d:
            r5 = move-exception
            r0 = r1
            goto L_0x0086
        L_0x0070:
            r5 = move-exception
            r0 = r1
            goto L_0x00a4
        L_0x0073:
            r5 = move-exception
            r0 = r1
            goto L_0x00c2
        L_0x0076:
            java.lang.String r5 = f19706a     // Catch:{ UnsupportedEncodingException -> 0x00c1, IOException -> 0x00a3, JSONException -> 0x0085 }
            java.lang.String r6 = "Failed to get response"
            android.util.Log.e(r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x00c1, IOException -> 0x00a3, JSONException -> 0x0085 }
        L_0x007d:
            if (r0 == 0) goto L_0x00df
        L_0x007f:
            r0.close()     // Catch:{ Exception -> 0x00df }
            goto L_0x00df
        L_0x0083:
            r5 = move-exception
            goto L_0x00e0
        L_0x0085:
            r5 = move-exception
        L_0x0086:
            java.lang.String r6 = f19706a     // Catch:{ all -> 0x0083 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0083 }
            r1.<init>()     // Catch:{ all -> 0x0083 }
            java.lang.String r2 = "ERROR: "
            r1.append(r2)     // Catch:{ all -> 0x0083 }
            java.lang.String r2 = r5.getLocalizedMessage()     // Catch:{ all -> 0x0083 }
            r1.append(r2)     // Catch:{ all -> 0x0083 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0083 }
            android.util.Log.e(r6, r1, r5)     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x00df
            goto L_0x007f
        L_0x00a3:
            r5 = move-exception
        L_0x00a4:
            java.lang.String r6 = f19706a     // Catch:{ all -> 0x0083 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0083 }
            r1.<init>()     // Catch:{ all -> 0x0083 }
            java.lang.String r2 = "ERROR: "
            r1.append(r2)     // Catch:{ all -> 0x0083 }
            java.lang.String r2 = r5.getLocalizedMessage()     // Catch:{ all -> 0x0083 }
            r1.append(r2)     // Catch:{ all -> 0x0083 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0083 }
            android.util.Log.e(r6, r1, r5)     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x00df
            goto L_0x007f
        L_0x00c1:
            r5 = move-exception
        L_0x00c2:
            java.lang.String r6 = f19706a     // Catch:{ all -> 0x0083 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0083 }
            r1.<init>()     // Catch:{ all -> 0x0083 }
            java.lang.String r2 = "ERROR: "
            r1.append(r2)     // Catch:{ all -> 0x0083 }
            java.lang.String r2 = r5.getLocalizedMessage()     // Catch:{ all -> 0x0083 }
            r1.append(r2)     // Catch:{ all -> 0x0083 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0083 }
            android.util.Log.e(r6, r1, r5)     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x00df
            goto L_0x007f
        L_0x00df:
            return
        L_0x00e0:
            if (r0 == 0) goto L_0x00e5
            r0.close()     // Catch:{ Exception -> 0x00e5 }
        L_0x00e5:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.dropbox.medialist.C5535a.m27529b(org.json.JSONObject, java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006f A[Catch:{ Exception -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007b A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap<java.lang.String, java.lang.Object> doInBackground(java.lang.Object... r7) {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 0
            r0.<init>(r1)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            r2 = 0
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r1 = r7[r1]     // Catch:{ Exception -> 0x007c }
            java.lang.Object r1 = r3.cast(r1)     // Catch:{ Exception -> 0x007c }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x007c }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 1
            r4 = r7[r4]     // Catch:{ Exception -> 0x007c }
            java.lang.Object r3 = r3.cast(r4)     // Catch:{ Exception -> 0x007c }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x007c }
            java.lang.Class<com.seattleclouds.util.d> r4 = com.seattleclouds.util.C6608d.class
            r5 = 3
            r5 = r7[r5]     // Catch:{ Exception -> 0x007c }
            java.lang.Object r4 = r4.cast(r5)     // Catch:{ Exception -> 0x007c }
            com.seattleclouds.util.d r4 = (com.seattleclouds.util.C6608d) r4     // Catch:{ Exception -> 0x007c }
            r6.f19707b = r4     // Catch:{ Exception -> 0x007c }
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 4
            r5 = r7[r5]     // Catch:{ Exception -> 0x007c }
            java.lang.Object r4 = r4.cast(r5)     // Catch:{ Exception -> 0x007c }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x007c }
            r6.f19708c = r4     // Catch:{ Exception -> 0x007c }
            org.json.JSONObject r3 = r6.m27528a(r3)     // Catch:{ Exception -> 0x007c }
            if (r3 == 0) goto L_0x0046
            java.lang.String r4 = "KEY_JSON_CONFIG"
            r0.put(r4, r3)     // Catch:{ Exception -> 0x007c }
        L_0x0046:
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            r5 = 2
            r7 = r7[r5]     // Catch:{ Exception -> 0x007c }
            java.lang.Object r7 = r4.cast(r7)     // Catch:{ Exception -> 0x007c }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ Exception -> 0x007c }
            int r7 = r7.intValue()     // Catch:{ Exception -> 0x007c }
            r4 = 100
            if (r7 != r4) goto L_0x005d
        L_0x0059:
            r6.m27529b(r3, r1)     // Catch:{ Exception -> 0x007c }
            goto L_0x0069
        L_0x005d:
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x007c }
            r7.<init>(r1)     // Catch:{ Exception -> 0x007c }
            boolean r7 = r7.exists()     // Catch:{ Exception -> 0x007c }
            if (r7 != 0) goto L_0x0069
            goto L_0x0059
        L_0x0069:
            java.util.List r7 = r6.m27527a(r3, r1)     // Catch:{ Exception -> 0x007c }
            if (r7 == 0) goto L_0x0074
            java.lang.String r1 = "KEY_FILES"
            r0.put(r1, r7)     // Catch:{ Exception -> 0x007c }
        L_0x0074:
            boolean r7 = r6.isCancelled()     // Catch:{ Exception -> 0x007c }
            if (r7 == 0) goto L_0x007b
            return r2
        L_0x007b:
            return r0
        L_0x007c:
            r7 = move-exception
            java.lang.String r0 = f19706a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "ERROR: "
            r1.append(r3)
            java.lang.String r3 = r7.getLocalizedMessage()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r0, r1, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.dropbox.medialist.C5535a.doInBackground(java.lang.Object[]):java.util.HashMap");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(HashMap<String, Object> hashMap) {
        this.f19707b.mo16855a(hashMap);
        super.onPostExecute(hashMap);
    }
}
