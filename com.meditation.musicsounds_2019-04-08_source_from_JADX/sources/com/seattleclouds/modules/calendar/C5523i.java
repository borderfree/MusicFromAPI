package com.seattleclouds.modules.calendar;

import android.os.AsyncTask;
import com.seattleclouds.util.C6608d;
import com.seattleclouds.util.C6614j;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.calendar.i */
public class C5523i extends AsyncTask<String, Void, Void> {

    /* renamed from: a */
    private static final String f19655a = "i";

    /* renamed from: b */
    private C5506c f19656b;

    /* renamed from: c */
    private C6608d f19657c = null;

    /* renamed from: d */
    private String f19658d;

    public C5523i(C5506c cVar, String str) {
        this.f19656b = cVar;
        this.f19658d = str;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x010a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x010b, code lost:
        r3 = f19655a;
        r4 = new java.lang.StringBuilder();
        r4.append("Event parsing error: ");
        r5 = r0.toString();
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x011c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x011d, code lost:
        r3 = f19655a;
        r4 = new java.lang.StringBuilder();
        r4.append("Event parsing error: ");
        r5 = r0.toString();
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x012d, code lost:
        r4.append(r5);
        android.util.Log.w(r3, r4.toString(), r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x011c A[ExcHandler: IOException (r0v2 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:1:0x0008] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Void doInBackground(java.lang.String... r20) {
        /*
            r19 = this;
            r1 = r19
            com.seattleclouds.modules.calendar.c r0 = r1.f19656b
            r0.mo17849a()
            r2 = 0
            java.lang.String r0 = r1.f19658d     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            java.io.InputStream r0 = com.seattleclouds.App.m25649e(r0)     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = f19655a     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            java.lang.String r3 = "Synced events resource not found"
            android.util.Log.v(r0, r3)     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            return r2
        L_0x0018:
            java.lang.String r0 = com.seattleclouds.util.C6613i.m31991b(r0)     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            r3.<init>(r0)     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            java.lang.String r0 = "events"
            org.json.JSONArray r3 = r3.getJSONArray(r0)     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            r0 = 0
            r4 = 0
        L_0x0029:
            int r0 = r3.length()     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            if (r4 >= r0) goto L_0x0137
            org.json.JSONObject r0 = r3.getJSONObject(r4)     // Catch:{ JSONException -> 0x00e5, IndexOutOfBoundsException -> 0x00c4, UnsupportedOperationException -> 0x00a0, IOException -> 0x011c }
            java.lang.String r5 = "recurringEventId"
            java.lang.String r5 = r0.getString(r5)     // Catch:{ JSONException -> 0x00e5, IndexOutOfBoundsException -> 0x00c4, UnsupportedOperationException -> 0x00a0, IOException -> 0x011c }
            if (r5 == 0) goto L_0x0044
            java.lang.String r6 = "null"
            boolean r6 = r5.equals(r6)     // Catch:{ JSONException -> 0x00e5, IndexOutOfBoundsException -> 0x00c4, UnsupportedOperationException -> 0x00a0, IOException -> 0x011c }
            if (r6 == 0) goto L_0x0044
            r5 = r2
        L_0x0044:
            java.lang.String r6 = "isActive"
            boolean r6 = r0.getBoolean(r6)     // Catch:{ JSONException -> 0x00e5, IndexOutOfBoundsException -> 0x00c4, UnsupportedOperationException -> 0x00a0, IOException -> 0x011c }
            if (r6 == 0) goto L_0x0106
            com.seattleclouds.modules.calendar.c r7 = r1.f19656b     // Catch:{ JSONException -> 0x00e5, IndexOutOfBoundsException -> 0x00c4, UnsupportedOperationException -> 0x00a0, IOException -> 0x011c }
            java.lang.String r6 = "title"
            java.lang.String r9 = r0.getString(r6)     // Catch:{ JSONException -> 0x00e5, IndexOutOfBoundsException -> 0x00c4, UnsupportedOperationException -> 0x00a0, IOException -> 0x011c }
            java.lang.String r6 = "category"
            java.lang.String r10 = r0.getString(r6)     // Catch:{ JSONException -> 0x00e5, IndexOutOfBoundsException -> 0x00c4, UnsupportedOperationException -> 0x00a0, IOException -> 0x011c }
            java.lang.String r6 = "location"
            java.lang.String r11 = r0.getString(r6)     // Catch:{ JSONException -> 0x00e5, IndexOutOfBoundsException -> 0x00c4, UnsupportedOperationException -> 0x00a0, IOException -> 0x011c }
            java.util.Date r12 = new java.util.Date     // Catch:{ JSONException -> 0x00e5, IndexOutOfBoundsException -> 0x00c4, UnsupportedOperationException -> 0x00a0, IOException -> 0x011c }
            java.lang.String r6 = "startDate"
            long r13 = r0.getLong(r6)     // Catch:{ JSONException -> 0x00e5, IndexOutOfBoundsException -> 0x00c4, UnsupportedOperationException -> 0x00a0, IOException -> 0x011c }
            r12.<init>(r13)     // Catch:{ JSONException -> 0x00e5, IndexOutOfBoundsException -> 0x00c4, UnsupportedOperationException -> 0x00a0, IOException -> 0x011c }
            java.util.Date r13 = new java.util.Date     // Catch:{ JSONException -> 0x00e5, IndexOutOfBoundsException -> 0x00c4, UnsupportedOperationException -> 0x00a0, IOException -> 0x011c }
            java.lang.String r6 = "endDate"
            long r14 = r0.getLong(r6)     // Catch:{ JSONException -> 0x00e5, IndexOutOfBoundsException -> 0x00c4, UnsupportedOperationException -> 0x00a0, IOException -> 0x011c }
            r13.<init>(r14)     // Catch:{ JSONException -> 0x00e5, IndexOutOfBoundsException -> 0x00c4, UnsupportedOperationException -> 0x00a0, IOException -> 0x011c }
            java.lang.String r6 = "isAllDay"
            boolean r14 = r0.getBoolean(r6)     // Catch:{ JSONException -> 0x00e5, IndexOutOfBoundsException -> 0x00c4, UnsupportedOperationException -> 0x00a0, IOException -> 0x011c }
            java.lang.String r6 = "caseNumber"
            java.lang.String r15 = r0.getString(r6)     // Catch:{ JSONException -> 0x00e5, IndexOutOfBoundsException -> 0x00c4, UnsupportedOperationException -> 0x00a0, IOException -> 0x011c }
            java.lang.String r6 = "reference"
            java.lang.String r16 = r0.getString(r6)     // Catch:{ JSONException -> 0x00e5, IndexOutOfBoundsException -> 0x00c4, UnsupportedOperationException -> 0x00a0, IOException -> 0x011c }
            r17 = 1
            java.lang.String r6 = "description"
            java.lang.String r18 = r0.getString(r6)     // Catch:{ JSONException -> 0x00e5, IndexOutOfBoundsException -> 0x00c4, UnsupportedOperationException -> 0x00a0, IOException -> 0x011c }
            r8 = r5
            r7.mo17844a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ JSONException -> 0x00e5, IndexOutOfBoundsException -> 0x00c4, UnsupportedOperationException -> 0x00a0, IOException -> 0x011c }
            java.lang.String r6 = "isRepeat"
            boolean r6 = r0.getBoolean(r6)     // Catch:{ JSONException -> 0x00e5, IndexOutOfBoundsException -> 0x00c4, UnsupportedOperationException -> 0x00a0, IOException -> 0x011c }
            if (r6 == 0) goto L_0x0106
            r1.mo17906a(r0, r5)     // Catch:{ JSONException -> 0x00e5, IndexOutOfBoundsException -> 0x00c4, UnsupportedOperationException -> 0x00a0, IOException -> 0x011c }
            goto L_0x0106
        L_0x00a0:
            r0 = move-exception
            java.lang.String r5 = f19655a     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            r6.<init>()     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            java.lang.String r7 = "Error parsing event "
            r6.append(r7)     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            r6.append(r4)     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            java.lang.String r7 = ": "
            r6.append(r7)     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            r6.append(r0)     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            java.lang.String r0 = r6.toString()     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
        L_0x00c0:
            android.util.Log.i(r5, r0)     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            goto L_0x0106
        L_0x00c4:
            r0 = move-exception
            java.lang.String r5 = f19655a     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            r6.<init>()     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            java.lang.String r7 = "Error parsing event "
            r6.append(r7)     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            r6.append(r4)     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            java.lang.String r7 = ": "
            r6.append(r7)     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            r6.append(r0)     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            java.lang.String r0 = r6.toString()     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            goto L_0x00c0
        L_0x00e5:
            r0 = move-exception
            java.lang.String r5 = f19655a     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            r6.<init>()     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            java.lang.String r7 = "Error parsing event "
            r6.append(r7)     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            r6.append(r4)     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            java.lang.String r7 = ": "
            r6.append(r7)     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            r6.append(r0)     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            java.lang.String r0 = r6.toString()     // Catch:{ IOException -> 0x011c, JSONException -> 0x010a }
            goto L_0x00c0
        L_0x0106:
            int r4 = r4 + 1
            goto L_0x0029
        L_0x010a:
            r0 = move-exception
            java.lang.String r3 = f19655a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Event parsing error: "
            r4.append(r5)
            java.lang.String r5 = r0.toString()
            goto L_0x012d
        L_0x011c:
            r0 = move-exception
            java.lang.String r3 = f19655a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Event parsing error: "
            r4.append(r5)
            java.lang.String r5 = r0.toString()
        L_0x012d:
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.w(r3, r4, r0)
        L_0x0137:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.calendar.C5523i.doInBackground(java.lang.String[]):java.lang.Void");
    }

    /* renamed from: a */
    public List<Date> mo17903a(Date date, Date date2) {
        ArrayList arrayList = new ArrayList();
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        int i = instance.get(7);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(date2);
        while (!instance.after(instance2)) {
            if (instance.get(7) == i) {
                arrayList.add(instance.getTime());
            }
            instance.add(5, 1);
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo17904a(C6608d dVar) {
        this.f19657c = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Void voidR) {
        super.onPostExecute(voidR);
        if (this.f19657c != null) {
            this.f19657c.mo16855a(null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17906a(JSONObject jSONObject, String str) {
        JSONObject jSONObject2 = jSONObject;
        Date date = new Date(jSONObject2.getLong("startDate"));
        Date date2 = new Date(jSONObject2.getLong("endDate"));
        Date date3 = new Date(jSONObject2.getLong("repeatEndDate"));
        String string = jSONObject2.getString("repeatType");
        String string2 = jSONObject2.getString("title");
        String string3 = jSONObject2.getString("category");
        String string4 = jSONObject2.getString("location");
        boolean z = jSONObject2.getBoolean("isAllDay");
        String string5 = jSONObject2.getString("caseNumber");
        String string6 = jSONObject2.getString("reference");
        String string7 = jSONObject2.getString("description");
        if (string.equalsIgnoreCase("daily")) {
            int a = C6614j.m31993a(date, date3, true);
            for (int i = 1; i <= a; i++) {
                this.f19656b.mo17844a(str, string2, string3, string4, C6614j.m31998a(date, i), C6614j.m31998a(date2, i), z, string5, string6, true, string7);
            }
            return;
        }
        int i2 = 0;
        if (string.equalsIgnoreCase("weekly")) {
            List<Date> a2 = mo17903a(date, date3);
            if (a2.size() > 0) {
                a2.remove(0);
            }
            List a3 = mo17903a(date2, date3);
            if (a3.size() > 0) {
                a3.remove(0);
            }
            for (Date a4 : a2) {
                int i3 = i2 + 1;
                String str2 = str;
                String str3 = string2;
                String str4 = string3;
                String str5 = string4;
                this.f19656b.mo17844a(str2, str3, str4, str5, a4, (Date) a3.get(i2), z, string5, string6, true, string7);
                i2 = i3;
            }
        } else if (string.equalsIgnoreCase("monthly")) {
            List<Date> b = mo17907b(date, date3);
            if (b.size() > 0) {
                b.remove(0);
            }
            List b2 = mo17907b(date2, date3);
            if (b2.size() > 0) {
                b2.remove(0);
            }
            for (Date a5 : b) {
                int i4 = i2 + 1;
                String str6 = str;
                String str7 = string2;
                String str8 = string3;
                String str9 = string4;
                this.f19656b.mo17844a(str6, str7, str8, str9, a5, (Date) b2.get(i2), z, string5, string6, true, string7);
                i2 = i4;
            }
        }
    }

    /* renamed from: b */
    public List<Date> mo17907b(Date date, Date date2) {
        ArrayList arrayList = new ArrayList();
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        int i = instance.get(5);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(date2);
        while (!instance.after(instance2)) {
            if (instance.get(5) == i) {
                arrayList.add(instance.getTime());
            }
            instance.add(5, 1);
        }
        return arrayList;
    }
}
