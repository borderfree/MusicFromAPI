package com.seattleclouds.modules.p181p;

import android.os.AsyncTask;
import com.seattleclouds.util.C6608d;
import java.util.ArrayList;

/* renamed from: com.seattleclouds.modules.p.f */
public class C6012f extends AsyncTask<String, Void, Void> {

    /* renamed from: a */
    private static final String f21371a = "f";

    /* renamed from: b */
    private String f21372b;

    /* renamed from: c */
    private C6608d f21373c = null;

    /* renamed from: d */
    private ArrayList<C6003b> f21374d = new ArrayList<>();

    public C6012f(String str) {
        this.f21372b = str;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00b4, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4 = f21371a;
        r5 = new java.lang.StringBuilder();
        r5.append("Error parsing quiz ");
        r5.append(r2);
        r5.append(": ");
        r5.append(r3.toString());
        android.util.Log.i(r4, r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ed, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ee, code lost:
        r1 = f21371a;
        r2 = new java.lang.StringBuilder();
        r2.append("Quiz parsing error: ");
        r3 = r0.toString();
        r0 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ed A[ExcHandler: IOException (r0v1 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:1:0x0001] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Void doInBackground(java.lang.String... r11) {
        /*
            r10 = this;
            r11 = 0
            java.lang.String r0 = r10.f21372b     // Catch:{ IOException -> 0x00ed, JSONException -> 0x00db }
            java.io.InputStream r0 = com.seattleclouds.App.m25649e(r0)     // Catch:{ IOException -> 0x00ed, JSONException -> 0x00db }
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = f21371a     // Catch:{ IOException -> 0x00ed, JSONException -> 0x00db }
            java.lang.String r1 = "Quiz config resource not found"
            android.util.Log.v(r0, r1)     // Catch:{ IOException -> 0x00ed, JSONException -> 0x00db }
            return r11
        L_0x0011:
            java.lang.String r0 = com.seattleclouds.util.C6613i.m31991b(r0)     // Catch:{ IOException -> 0x00ed, JSONException -> 0x00db }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ IOException -> 0x00ed, JSONException -> 0x00db }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00ed, JSONException -> 0x00db }
            java.lang.String r0 = "questions"
            org.json.JSONArray r0 = r1.getJSONArray(r0)     // Catch:{ IOException -> 0x00ed, JSONException -> 0x00db }
            r1 = 0
            r2 = 0
        L_0x0022:
            int r3 = r0.length()     // Catch:{ IOException -> 0x00ed, JSONException -> 0x00db }
            if (r2 >= r3) goto L_0x0108
            org.json.JSONObject r3 = r0.getJSONObject(r2)     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            com.seattleclouds.modules.p.b r4 = new com.seattleclouds.modules.p.b     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            r4.<init>()     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            java.lang.String r5 = "uuid"
            java.lang.String r5 = r3.getString(r5)     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            r4.mo18970a(r5)     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            java.lang.String r5 = "questiontext"
            java.lang.String r5 = r3.getString(r5)     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            r4.mo18973b(r5)     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            java.lang.String r5 = "questionimage"
            java.lang.String r5 = r3.getString(r5)     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            r4.mo18975c(r5)     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            java.lang.String r5 = "questionpoints"
            int r5 = r3.getInt(r5)     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            r4.mo18969a(r5)     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            java.lang.String r5 = "answertext"
            java.lang.String r5 = r3.getString(r5)     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            r4.mo18977d(r5)     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            java.lang.String r5 = "answerbgimage"
            java.lang.String r5 = r3.getString(r5)     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            r4.mo18979e(r5)     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            java.lang.String r5 = "choicebtnbgimage"
            java.lang.String r5 = r3.getString(r5)     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            r4.mo18981f(r5)     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            r5.<init>()     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            java.lang.String r6 = "choices"
            org.json.JSONArray r3 = r3.getJSONArray(r6)     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            r6 = 0
        L_0x0080:
            int r7 = r3.length()     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            if (r6 >= r7) goto L_0x00ab
            org.json.JSONObject r7 = r3.getJSONObject(r6)     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            com.seattleclouds.modules.p.a r8 = new com.seattleclouds.modules.p.a     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            r8.<init>()     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            java.lang.String r9 = "text"
            java.lang.String r9 = r7.getString(r9)     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            r8.mo18966a(r9)     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            java.lang.String r9 = "status"
            boolean r7 = r7.getBoolean(r9)     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            r8.mo18965a(r7)     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            r5.add(r8)     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            int r6 = r6 + 1
            goto L_0x0080
        L_0x00ab:
            r4.mo18971a(r5)     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            java.util.ArrayList<com.seattleclouds.modules.p.b> r3 = r10.f21374d     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            r3.add(r4)     // Catch:{ JSONException -> 0x00b4, IOException -> 0x00ed }
            goto L_0x00d7
        L_0x00b4:
            r3 = move-exception
            java.lang.String r4 = f21371a     // Catch:{ IOException -> 0x00ed, JSONException -> 0x00db }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00ed, JSONException -> 0x00db }
            r5.<init>()     // Catch:{ IOException -> 0x00ed, JSONException -> 0x00db }
            java.lang.String r6 = "Error parsing quiz "
            r5.append(r6)     // Catch:{ IOException -> 0x00ed, JSONException -> 0x00db }
            r5.append(r2)     // Catch:{ IOException -> 0x00ed, JSONException -> 0x00db }
            java.lang.String r6 = ": "
            r5.append(r6)     // Catch:{ IOException -> 0x00ed, JSONException -> 0x00db }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x00ed, JSONException -> 0x00db }
            r5.append(r3)     // Catch:{ IOException -> 0x00ed, JSONException -> 0x00db }
            java.lang.String r3 = r5.toString()     // Catch:{ IOException -> 0x00ed, JSONException -> 0x00db }
            android.util.Log.i(r4, r3)     // Catch:{ IOException -> 0x00ed, JSONException -> 0x00db }
        L_0x00d7:
            int r2 = r2 + 1
            goto L_0x0022
        L_0x00db:
            r0 = move-exception
            java.lang.String r1 = f21371a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Quiz parsing error: "
            r2.append(r3)
            java.lang.String r3 = r0.toString()
            goto L_0x00fe
        L_0x00ed:
            r0 = move-exception
            java.lang.String r1 = f21371a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Quiz parsing error: "
            r2.append(r3)
            java.lang.String r3 = r0.toString()
        L_0x00fe:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r1, r2, r0)
        L_0x0108:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.p181p.C6012f.doInBackground(java.lang.String[]):java.lang.Void");
    }

    /* renamed from: a */
    public void mo19014a(C6608d dVar) {
        this.f21373c = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Void voidR) {
        super.onPostExecute(voidR);
        if (this.f21373c != null) {
            this.f21373c.mo16855a(this.f21374d);
        }
    }
}
