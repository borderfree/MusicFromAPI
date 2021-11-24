package com.seattleclouds.p157b;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;
import com.google.android.bitmapfun.C2418b;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.previewer.data.C6477a;
import com.seattleclouds.util.C6608d;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Set;
import org.apache.commons.p198io.C6730b;
import org.json.JSONArray;
import org.json.JSONException;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.seattleclouds.b.e */
public class C5306e extends AsyncTask<String, Integer, String> {

    /* renamed from: a */
    public static String f19012a = null;

    /* renamed from: b */
    private static final String f19013b = "e";
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Activity f19014c;

    /* renamed from: d */
    private ProgressDialog f19015d;

    /* renamed from: e */
    private C6608d f19016e = null;

    /* renamed from: f */
    private Integer f19017f = Integer.valueOf(0);

    /* renamed from: g */
    private Integer f19018g = Integer.valueOf(0);

    /* renamed from: h */
    private int f19019h = 0;

    /* renamed from: i */
    private boolean f19020i = false;

    /* renamed from: j */
    private boolean f19021j = true;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f19022k = false;

    /* renamed from: l */
    private String f19023l;

    public C5306e(Activity activity, String str) {
        this.f19014c = activity;
        this.f19023l = str;
    }

    /* renamed from: a */
    private Uri m26537a(C6477a aVar) {
        Builder appendPath;
        String str;
        String[] split = aVar.mo20152a().split(TableOfContents.DEFAULT_PATH_SEPARATOR);
        if (App.f18522x.equals("")) {
            StringBuilder sb = new StringBuilder();
            sb.append("http://");
            sb.append(App.f18516r);
            appendPath = Uri.parse(sb.toString()).buildUpon();
            str = "application4sale";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("http://");
            sb2.append(App.f18516r);
            appendPath = Uri.parse(sb2.toString()).buildUpon().appendPath("templates");
            str = App.f18522x;
        }
        Builder appendPath2 = appendPath.appendPath(str).appendPath(this.f19023l);
        for (String appendPath3 : split) {
            appendPath2.appendPath(appendPath3);
        }
        return appendPath2.build();
    }

    /* renamed from: a */
    private HashMap<String, C6477a> m26538a(HashMap<String, C6477a> hashMap, HashMap<String, C6477a> hashMap2) {
        if (hashMap.size() == 0) {
            return hashMap2;
        }
        HashMap<String, C6477a> hashMap3 = new HashMap<>();
        for (String str : hashMap2.keySet()) {
            C6477a aVar = (C6477a) hashMap2.get(str);
            C6477a aVar2 = (C6477a) hashMap.get(str);
            if (aVar2 == null || !aVar2.mo20156b().equals(aVar.mo20156b())) {
                hashMap3.put(aVar.mo20152a(), aVar);
            }
        }
        return hashMap3;
    }

    /* renamed from: a */
    private HashMap<String, C6477a> m26539a(JSONArray jSONArray) {
        HashMap<String, C6477a> hashMap = new HashMap<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            C6477a aVar = null;
            try {
                aVar = new C6477a(jSONArray.getJSONObject(i));
            } catch (ParseException e) {
                String str = f19013b;
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to parse time for resource: ");
                sb.append(aVar.toString());
                Log.e(str, sb.toString(), e);
            }
            hashMap.put(aVar.mo20152a(), aVar);
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x008a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Set<java.lang.String> m26540a(java.util.HashMap<java.lang.String, com.seattleclouds.previewer.data.C6477a> r13) {
        /*
            r12 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.lang.String r1 = com.seattleclouds.App.m25654h()
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r12.f19018g = r3
            int r3 = r13.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.f19017f = r3
            java.util.Set r3 = r13.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0022:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00bf
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = r12.f19022k
            r6 = 0
            if (r5 == 0) goto L_0x0034
            return r6
        L_0x0034:
            r5 = 1
            java.lang.Object r7 = r13.get(r4)     // Catch:{ IOException -> 0x0087 }
            com.seattleclouds.previewer.data.a r7 = (com.seattleclouds.previewer.data.C6477a) r7     // Catch:{ IOException -> 0x0087 }
            java.net.URL r8 = new java.net.URL     // Catch:{ IOException -> 0x0087 }
            android.net.Uri r9 = r12.m26537a(r7)     // Catch:{ IOException -> 0x0087 }
            java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x0087 }
            r8.<init>(r9)     // Catch:{ IOException -> 0x0087 }
            java.io.File r9 = new java.io.File     // Catch:{ IOException -> 0x0087 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0087 }
            r10.<init>()     // Catch:{ IOException -> 0x0087 }
            r10.append(r1)     // Catch:{ IOException -> 0x0087 }
            java.lang.String r11 = r7.mo20152a()     // Catch:{ IOException -> 0x0087 }
            r10.append(r11)     // Catch:{ IOException -> 0x0087 }
            java.lang.String r10 = r10.toString()     // Catch:{ IOException -> 0x0087 }
            r9.<init>(r10)     // Catch:{ IOException -> 0x0087 }
            r6 = 30000(0x7530, float:4.2039E-41)
            org.apache.commons.p198io.C6730b.m32462a(r8, r9, r6, r6)     // Catch:{ IOException -> 0x0085 }
            java.lang.String r6 = r7.mo20152a()     // Catch:{ IOException -> 0x0085 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0085 }
            r7.<init>()     // Catch:{ IOException -> 0x0085 }
            java.lang.String r8 = java.io.File.separator     // Catch:{ IOException -> 0x0085 }
            r7.append(r8)     // Catch:{ IOException -> 0x0085 }
            java.lang.String r8 = "app.xml"
            r7.append(r8)     // Catch:{ IOException -> 0x0085 }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x0085 }
            boolean r6 = r6.endsWith(r7)     // Catch:{ IOException -> 0x0085 }
            if (r6 == 0) goto L_0x00a7
            r12.f19020i = r5     // Catch:{ IOException -> 0x0085 }
            goto L_0x00a7
        L_0x0085:
            r6 = r9
            goto L_0x0088
        L_0x0087:
        L_0x0088:
            if (r6 == 0) goto L_0x00a4
            java.lang.String r7 = f19013b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Unable to save file to: "
            r8.append(r9)
            java.lang.String r6 = r6.toString()
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            android.util.Log.v(r7, r6)
        L_0x00a4:
            r0.add(r4)
        L_0x00a7:
            java.lang.Integer[] r4 = new java.lang.Integer[r5]
            java.lang.Integer r6 = r12.f19018g
            java.lang.Integer r7 = r12.f19018g
            int r7 = r7.intValue()
            int r7 = r7 + r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r12.f19018g = r5
            r4[r2] = r6
            r12.publishProgress(r4)
            goto L_0x0022
        L_0x00bf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.p157b.C5306e.m26540a(java.util.HashMap):java.util.Set");
    }

    /* renamed from: a */
    private void m26541a() {
        try {
            if (this.f19015d != null && this.f19015d.isShowing()) {
                this.f19015d.dismiss();
            }
        } catch (IllegalArgumentException e) {
            Log.e(f19013b, "Exception while dismissing mDialog", e);
        }
        if (this.f19016e != null) {
            this.f19016e.mo16855a(null);
        }
    }

    /* renamed from: a */
    private void m26542a(String str, HashMap<String, C6477a> hashMap, Set<String> set, JSONArray jSONArray) {
        if (set != null) {
            if (set.size() == 0) {
                m26543a(jSONArray, str);
                return;
            }
            for (String remove : set) {
                hashMap.remove(remove);
            }
            JSONArray jSONArray2 = new JSONArray();
            for (String str2 : hashMap.keySet()) {
                jSONArray2.put(((C6477a) hashMap.get(str2)).mo20157c());
            }
            m26543a(jSONArray2, str);
        }
    }

    /* renamed from: a */
    private void m26543a(final JSONArray jSONArray, final String str) {
        new Thread(new Runnable() {
            public void run() {
                try {
                    C6730b.m32458a(new File(C5306e.f19012a), jSONArray.toString(), "UTF-8");
                } catch (IOException unused) {
                }
            }
        }).start();
    }

    /* renamed from: b */
    private HashMap<String, C6477a> m26545b() {
        HashMap<String, C6477a> hashMap = new HashMap<>();
        try {
            File file = new File(f19012a);
            return !file.exists() ? hashMap : m26539a(new JSONArray(C6730b.m32452a(file, "UTF-8")));
        } catch (IOException | JSONException unused) {
            return hashMap;
        }
    }

    /* renamed from: c */
    private void m26546c() {
        for (String a : new String[]{"magazineCovers"}) {
            C6730b.m32467d(C2418b.m11228a((Context) this.f19014c, a));
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x017a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String doInBackground(java.lang.String... r10) {
        /*
            r9 = this;
            java.io.File r10 = new java.io.File
            java.lang.String r0 = com.seattleclouds.App.m25656i()
            r10.<init>(r0)
            org.apache.commons.p198io.C6730b.m32467d(r10)
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
            com.seattleclouds.api.b r2 = com.seattleclouds.api.C5268b.m26272a()     // Catch:{ IOException -> 0x0134, JSONException -> 0x0110, HttpResponseException -> 0x00ef, SCApiException -> 0x0081 }
            java.lang.String r3 = r9.f19023l     // Catch:{ IOException -> 0x0134, JSONException -> 0x0110, HttpResponseException -> 0x00ef, SCApiException -> 0x0081 }
            org.json.JSONObject r2 = r2.mo17321f(r3)     // Catch:{ IOException -> 0x0134, JSONException -> 0x0110, HttpResponseException -> 0x00ef, SCApiException -> 0x0081 }
            java.lang.String r3 = "items"
            org.json.JSONArray r3 = r2.getJSONArray(r3)     // Catch:{ IOException -> 0x007a, JSONException -> 0x0073, HttpResponseException -> 0x006c, SCApiException -> 0x0066 }
            java.util.HashMap r4 = r9.m26539a(r3)     // Catch:{ IOException -> 0x005f, JSONException -> 0x0058, HttpResponseException -> 0x0051, SCApiException -> 0x004b }
            java.util.HashMap r10 = r9.m26545b()     // Catch:{ IOException -> 0x0045, JSONException -> 0x003f, HttpResponseException -> 0x0039, SCApiException -> 0x0033 }
            r0 = r10
            r10 = r2
            goto L_0x015c
        L_0x0033:
            r10 = move-exception
            r8 = r2
            r2 = r10
            r10 = r8
            goto L_0x0085
        L_0x0039:
            r10 = move-exception
            r8 = r2
            r2 = r10
            r10 = r8
            goto L_0x00f3
        L_0x003f:
            r10 = move-exception
            r8 = r2
            r2 = r10
            r10 = r8
            goto L_0x0114
        L_0x0045:
            r10 = move-exception
            r8 = r2
            r2 = r10
            r10 = r8
            goto L_0x0138
        L_0x004b:
            r4 = move-exception
            r8 = r4
            r4 = r10
            r10 = r2
            r2 = r8
            goto L_0x0085
        L_0x0051:
            r4 = move-exception
            r8 = r4
            r4 = r10
            r10 = r2
            r2 = r8
            goto L_0x00f3
        L_0x0058:
            r4 = move-exception
            r8 = r4
            r4 = r10
            r10 = r2
            r2 = r8
            goto L_0x0114
        L_0x005f:
            r4 = move-exception
            r8 = r4
            r4 = r10
            r10 = r2
            r2 = r8
            goto L_0x0138
        L_0x0066:
            r3 = move-exception
            r4 = r10
            r10 = r2
            r2 = r3
            r3 = r1
            goto L_0x0085
        L_0x006c:
            r3 = move-exception
            r4 = r10
            r10 = r2
            r2 = r3
            r3 = r1
            goto L_0x00f3
        L_0x0073:
            r3 = move-exception
            r4 = r10
            r10 = r2
            r2 = r3
            r3 = r1
            goto L_0x0114
        L_0x007a:
            r3 = move-exception
            r4 = r10
            r10 = r2
            r2 = r3
            r3 = r1
            goto L_0x0138
        L_0x0081:
            r2 = move-exception
            r4 = r10
            r10 = r1
            r3 = r10
        L_0x0085:
            java.lang.String r5 = f19013b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "SCApi exception: "
            r6.append(r7)
            java.lang.String r7 = r2.toString()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.util.Log.e(r5, r6)
            r2.getMessage()
            org.json.JSONObject r2 = r2.getDetails()     // Catch:{ JSONException -> 0x00c7 }
            java.lang.String r5 = "code"
            int r5 = r2.getInt(r5)     // Catch:{ JSONException -> 0x00c7 }
            java.lang.String r6 = "message"
            java.lang.String r2 = r2.getString(r6)     // Catch:{ JSONException -> 0x00c7 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00c7 }
            r6.<init>()     // Catch:{ JSONException -> 0x00c7 }
            r6.append(r5)     // Catch:{ JSONException -> 0x00c7 }
            java.lang.String r5 = " - "
            r6.append(r5)     // Catch:{ JSONException -> 0x00c7 }
            r6.append(r2)     // Catch:{ JSONException -> 0x00c7 }
            java.lang.String r2 = r6.toString()     // Catch:{ JSONException -> 0x00c7 }
            goto L_0x00ea
        L_0x00c7:
            r2 = move-exception
            java.lang.String r5 = f19013b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "JSON parsing exception: "
            r6.append(r7)
            java.lang.String r2 = r2.toString()
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            android.util.Log.e(r5, r2)
            android.app.Activity r2 = r9.f19014c
            int r5 = com.seattleclouds.C5451m.C5462k.common_internal_server_error
            java.lang.String r2 = r2.getString(r5)
        L_0x00ea:
            r9.mo17432b(r2)
            goto L_0x015c
        L_0x00ef:
            r2 = move-exception
            r4 = r10
            r10 = r1
            r3 = r10
        L_0x00f3:
            java.lang.String r5 = f19013b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "HTTP Response exception: "
            r6.append(r7)
            int r7 = r2.getStatusCode()
            r6.append(r7)
            java.lang.String r7 = " - "
            r6.append(r7)
            java.lang.String r2 = r2.getMessage()
            goto L_0x0124
        L_0x0110:
            r2 = move-exception
            r4 = r10
            r10 = r1
            r3 = r10
        L_0x0114:
            java.lang.String r5 = f19013b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "JSON parsing exception: "
            r6.append(r7)
            java.lang.String r2 = r2.toString()
        L_0x0124:
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            android.util.Log.e(r5, r2)
            int r2 = com.seattleclouds.C5451m.C5462k.common_internal_server_error
        L_0x0130:
            r9.mo17428a(r2)
            goto L_0x015c
        L_0x0134:
            r2 = move-exception
            r4 = r10
            r10 = r1
            r3 = r10
        L_0x0138:
            android.app.Activity r5 = r9.f19014c
            boolean r5 = com.seattleclouds.util.C6619m.m32026h(r5)
            if (r5 != 0) goto L_0x0143
            int r2 = com.seattleclouds.C5451m.C5462k.common_no_network
            goto L_0x0130
        L_0x0143:
            java.lang.String r5 = f19013b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "IOException: "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            android.util.Log.e(r5, r2)
            int r2 = com.seattleclouds.C5451m.C5462k.common_network_error
            goto L_0x0130
        L_0x015c:
            java.util.HashMap r0 = r9.m26538a(r0, r4)
            android.app.ProgressDialog r2 = r9.f19015d
            if (r2 == 0) goto L_0x016d
            android.app.ProgressDialog r2 = r9.f19015d
            int r5 = r0.size()
            r2.setMax(r5)
        L_0x016d:
            java.util.Set r0 = r9.m26540a(r0)
            boolean r2 = r9.f19022k
            if (r2 == 0) goto L_0x017a
            r10 = 1
            r9.cancel(r10)
            return r1
        L_0x017a:
            if (r10 != 0) goto L_0x017d
            return r1
        L_0x017d:
            java.lang.String r10 = r9.f19023l
            r9.m26542a(r10, r4, r0, r3)
            int r10 = r9.f19019h
            if (r10 <= 0) goto L_0x0189
            r9.m26546c()
        L_0x0189:
            boolean r10 = r9.f19021j
            java.lang.String r10 = "ok"
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.p157b.C5306e.doInBackground(java.lang.String[]):java.lang.String");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17428a(int i) {
        if (this.f19014c != null) {
            mo17432b(this.f19014c.getString(i));
        }
    }

    /* renamed from: a */
    public void mo17429a(C6608d dVar) {
        this.f19016e = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        super.onPostExecute(str);
        m26541a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onProgressUpdate(Integer... numArr) {
        super.onProgressUpdate(numArr);
        if (this.f19015d != null) {
            this.f19015d.setProgress(numArr[0].intValue());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17432b(final String str) {
        if (this.f19014c != null) {
            this.f19014c.runOnUiThread(new Runnable() {
                public void run() {
                    if (C5306e.this.f19014c != null) {
                        C5306e.this.mo17433c(str);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo17433c(String str) {
        Toast.makeText(this.f19014c, str, 1).show();
    }

    /* access modifiers changed from: protected */
    public void onCancelled() {
        super.onCancelled();
        m26541a();
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        StringBuilder sb = new StringBuilder();
        sb.append(App.m25665m());
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append("sync");
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append("filelist.obj");
        f19012a = sb.toString();
        if (!this.f19014c.isFinishing() && (App.f18474G || App.f18510l)) {
            this.f19015d = new ProgressDialog(this.f19014c);
            this.f19015d.setProgressStyle(1);
            this.f19015d.setMessage(this.f19014c.getString(C5462k.app_state_syncing));
            this.f19015d.setCancelable(true);
            this.f19015d.getWindow().clearFlags(2);
            this.f19015d.show();
            this.f19015d.setOnCancelListener(new OnCancelListener() {
                public void onCancel(DialogInterface dialogInterface) {
                    C5306e.this.f19022k = true;
                    Toast.makeText(C5306e.this.f19014c, C5462k.common_sync_cancelled, 1).show();
                }
            });
        }
        super.onPreExecute();
    }
}
