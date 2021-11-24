package com.facebook.ads.internal.p072o;

import android.content.Context;
import android.database.Cursor;
import com.facebook.ads.internal.p065g.C1690c;
import com.facebook.ads.internal.p065g.C1691d;
import com.facebook.ads.internal.p066h.C1703d;
import com.facebook.ads.internal.p069k.C1713a;
import com.facebook.ads.internal.p072o.C1724b.C1727a;
import com.facebook.ads.internal.p077s.p078a.C1805o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.o.g */
public class C1733g implements C1727a {

    /* renamed from: a */
    private static final String f5717a = "g";

    /* renamed from: b */
    private Context f5718b;

    /* renamed from: c */
    private C1691d f5719c;

    public C1733g(Context context, C1691d dVar) {
        this.f5718b = context;
        this.f5719c = dVar;
    }

    /* renamed from: a */
    private static JSONArray m8680a(JSONArray jSONArray, JSONArray jSONArray2) {
        int i = 0;
        if (jSONArray != null) {
            i = 0 + jSONArray.length();
        }
        if (jSONArray2 != null) {
            i += jSONArray2.length();
        }
        return m8681a(jSONArray, jSONArray2, i);
    }

    /* renamed from: a */
    private static JSONArray m8681a(JSONArray jSONArray, JSONArray jSONArray2, int i) {
        JSONArray jSONArray3 = jSONArray;
        JSONArray jSONArray4 = jSONArray2;
        if (jSONArray3 == null) {
            return jSONArray4;
        }
        if (jSONArray4 == null) {
            return jSONArray3;
        }
        int length = jSONArray.length();
        int length2 = jSONArray2.length();
        JSONArray jSONArray5 = new JSONArray();
        int i2 = 0;
        int i3 = i;
        double d = Double.MAX_VALUE;
        double d2 = Double.MAX_VALUE;
        JSONObject jSONObject = null;
        JSONObject jSONObject2 = null;
        int i4 = 0;
        while (true) {
            if ((i2 < length || i4 < length2) && i3 > 0) {
                if (i2 < length && jSONObject == null) {
                    try {
                        jSONObject = jSONArray3.getJSONObject(i2);
                        d = jSONObject.getDouble("time");
                    } catch (JSONException unused) {
                        d = Double.MAX_VALUE;
                        jSONObject = null;
                    }
                    i2++;
                }
                if (i4 < length2 && jSONObject2 == null) {
                    try {
                        jSONObject2 = jSONArray4.getJSONObject(i4);
                        d2 = jSONObject2.getDouble("time");
                    } catch (JSONException unused2) {
                        d2 = Double.MAX_VALUE;
                        jSONObject2 = null;
                    }
                    i4++;
                }
                if (jSONObject != null || jSONObject2 != null) {
                    if (jSONObject == null || d2 < d) {
                        jSONArray5.put(jSONObject2);
                        d2 = Double.MAX_VALUE;
                        jSONObject2 = null;
                    } else {
                        jSONArray5.put(jSONObject);
                        d = Double.MAX_VALUE;
                        jSONObject = null;
                    }
                    i3--;
                }
            }
        }
        if (i3 > 0) {
            if (jSONObject != null) {
                jSONArray5.put(jSONObject);
            } else if (jSONObject2 != null) {
                jSONArray5.put(jSONObject2);
            }
        }
        return jSONArray5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0078  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject m8682a(int r8) {
        /*
            r7 = this;
            r0 = 0
            com.facebook.ads.internal.g.d r1 = r7.f5719c     // Catch:{ JSONException -> 0x006f, all -> 0x0061 }
            android.database.Cursor r1 = r1.mo6851d()     // Catch:{ JSONException -> 0x006f, all -> 0x0061 }
            com.facebook.ads.internal.g.d r2 = r7.f5719c     // Catch:{ JSONException -> 0x005f, all -> 0x005c }
            android.database.Cursor r2 = r2.mo6843a(r8)     // Catch:{ JSONException -> 0x005f, all -> 0x005c }
            int r3 = r2.getCount()     // Catch:{ JSONException -> 0x005a, all -> 0x0058 }
            if (r3 <= 0) goto L_0x001c
            org.json.JSONObject r3 = r7.m8683a(r2)     // Catch:{ JSONException -> 0x005a, all -> 0x0058 }
            org.json.JSONArray r4 = r7.m8686c(r2)     // Catch:{ JSONException -> 0x005a, all -> 0x0058 }
            goto L_0x001e
        L_0x001c:
            r3 = r0
            r4 = r3
        L_0x001e:
            android.content.Context r5 = r7.f5718b     // Catch:{ JSONException -> 0x005a, all -> 0x0058 }
            boolean r5 = com.facebook.ads.internal.p069k.C1713a.m8578i(r5)     // Catch:{ JSONException -> 0x005a, all -> 0x0058 }
            if (r5 == 0) goto L_0x0038
            android.content.Context r5 = r7.f5718b     // Catch:{ JSONException -> 0x005a, all -> 0x0058 }
            org.json.JSONArray r5 = com.facebook.ads.internal.p066h.C1703d.m8519a(r5, r8)     // Catch:{ JSONException -> 0x005a, all -> 0x0058 }
            if (r5 == 0) goto L_0x0038
            int r6 = r5.length()     // Catch:{ JSONException -> 0x005a, all -> 0x0058 }
            if (r6 <= 0) goto L_0x0038
            org.json.JSONArray r4 = m8681a(r5, r4, r8)     // Catch:{ JSONException -> 0x005a, all -> 0x0058 }
        L_0x0038:
            if (r4 == 0) goto L_0x004c
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x005a, all -> 0x0058 }
            r8.<init>()     // Catch:{ JSONException -> 0x005a, all -> 0x0058 }
            if (r3 == 0) goto L_0x0046
            java.lang.String r5 = "tokens"
            r8.put(r5, r3)     // Catch:{ JSONException -> 0x005a, all -> 0x0058 }
        L_0x0046:
            java.lang.String r3 = "events"
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x005a, all -> 0x0058 }
            goto L_0x004d
        L_0x004c:
            r8 = r0
        L_0x004d:
            if (r1 == 0) goto L_0x0052
            r1.close()
        L_0x0052:
            if (r2 == 0) goto L_0x0057
            r2.close()
        L_0x0057:
            return r8
        L_0x0058:
            r8 = move-exception
            goto L_0x0064
        L_0x005a:
            goto L_0x0071
        L_0x005c:
            r8 = move-exception
            r2 = r0
            goto L_0x0064
        L_0x005f:
            r2 = r0
            goto L_0x0071
        L_0x0061:
            r8 = move-exception
            r1 = r0
            r2 = r1
        L_0x0064:
            if (r1 == 0) goto L_0x0069
            r1.close()
        L_0x0069:
            if (r2 == 0) goto L_0x006e
            r2.close()
        L_0x006e:
            throw r8
        L_0x006f:
            r1 = r0
            r2 = r1
        L_0x0071:
            if (r1 == 0) goto L_0x0076
            r1.close()
        L_0x0076:
            if (r2 == 0) goto L_0x007b
            r2.close()
        L_0x007b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p072o.C1733g.m8682a(int):org.json.JSONObject");
    }

    /* renamed from: a */
    private JSONObject m8683a(Cursor cursor) {
        JSONObject jSONObject = new JSONObject();
        while (cursor.moveToNext()) {
            jSONObject.put(cursor.getString(0), cursor.getString(1));
        }
        return jSONObject;
    }

    /* renamed from: a */
    private void m8684a(String str) {
        if (C1703d.m8528c(str)) {
            C1703d.m8522a(str);
        } else {
            this.f5719c.mo6847a(str);
        }
    }

    /* renamed from: b */
    private JSONArray m8685b(Cursor cursor) {
        JSONArray jSONArray = new JSONArray();
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", cursor.getString(C1690c.f5550a.f5547a));
            jSONObject.put("token_id", cursor.getString(C1690c.f5551b.f5547a));
            jSONObject.put("type", cursor.getString(C1690c.f5553d.f5547a));
            jSONObject.put("time", C1805o.m8920a(cursor.getDouble(C1690c.f5554e.f5547a)));
            jSONObject.put("session_time", C1805o.m8920a(cursor.getDouble(C1690c.f5555f.f5547a)));
            jSONObject.put("session_id", cursor.getString(C1690c.f5556g.f5547a));
            String string = cursor.getString(C1690c.f5557h.f5547a);
            jSONObject.put("data", string != null ? new JSONObject(string) : new JSONObject());
            jSONObject.put("attempt", cursor.getString(C1690c.f5558i.f5547a));
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    /* renamed from: c */
    private JSONArray m8686c(Cursor cursor) {
        JSONArray jSONArray = new JSONArray();
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", cursor.getString(2));
            jSONObject.put("token_id", cursor.getString(0));
            jSONObject.put("type", cursor.getString(4));
            jSONObject.put("time", C1805o.m8920a(cursor.getDouble(5)));
            jSONObject.put("session_time", C1805o.m8920a(cursor.getDouble(6)));
            jSONObject.put("session_id", cursor.getString(7));
            String string = cursor.getString(8);
            jSONObject.put("data", string != null ? new JSONObject(string) : new JSONObject());
            jSONObject.put("attempt", cursor.getString(9));
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0080  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject m8687e() {
        /*
            r8 = this;
            r0 = 0
            com.facebook.ads.internal.g.d r1 = r8.f5719c     // Catch:{ JSONException -> 0x0077, all -> 0x0068 }
            android.database.Cursor r1 = r1.mo6853f()     // Catch:{ JSONException -> 0x0077, all -> 0x0068 }
            com.facebook.ads.internal.g.d r2 = r8.f5719c     // Catch:{ JSONException -> 0x0066, all -> 0x0061 }
            android.database.Cursor r2 = r2.mo6852e()     // Catch:{ JSONException -> 0x0066, all -> 0x0061 }
            int r3 = r1.getCount()     // Catch:{ JSONException -> 0x005f, all -> 0x005d }
            if (r3 <= 0) goto L_0x0022
            int r3 = r2.getCount()     // Catch:{ JSONException -> 0x005f, all -> 0x005d }
            if (r3 <= 0) goto L_0x0022
            org.json.JSONObject r3 = r8.m8683a(r1)     // Catch:{ JSONException -> 0x005f, all -> 0x005d }
            org.json.JSONArray r4 = r8.m8685b(r2)     // Catch:{ JSONException -> 0x005f, all -> 0x005d }
            goto L_0x0024
        L_0x0022:
            r3 = r0
            r4 = r3
        L_0x0024:
            android.content.Context r5 = r8.f5718b     // Catch:{ JSONException -> 0x005f, all -> 0x005d }
            boolean r5 = com.facebook.ads.internal.p069k.C1713a.m8578i(r5)     // Catch:{ JSONException -> 0x005f, all -> 0x005d }
            if (r5 == 0) goto L_0x003e
            android.content.Context r5 = r8.f5718b     // Catch:{ JSONException -> 0x005f, all -> 0x005d }
            org.json.JSONArray r5 = com.facebook.ads.internal.p066h.C1703d.m8518a(r5)     // Catch:{ JSONException -> 0x005f, all -> 0x005d }
            if (r5 == 0) goto L_0x003e
            int r6 = r5.length()     // Catch:{ JSONException -> 0x005f, all -> 0x005d }
            if (r6 <= 0) goto L_0x003e
            org.json.JSONArray r4 = m8680a(r5, r4)     // Catch:{ JSONException -> 0x005f, all -> 0x005d }
        L_0x003e:
            if (r4 == 0) goto L_0x0052
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x005f, all -> 0x005d }
            r5.<init>()     // Catch:{ JSONException -> 0x005f, all -> 0x005d }
            if (r3 == 0) goto L_0x004c
            java.lang.String r6 = "tokens"
            r5.put(r6, r3)     // Catch:{ JSONException -> 0x005f, all -> 0x005d }
        L_0x004c:
            java.lang.String r3 = "events"
            r5.put(r3, r4)     // Catch:{ JSONException -> 0x005f, all -> 0x005d }
            r0 = r5
        L_0x0052:
            if (r1 == 0) goto L_0x0057
            r1.close()
        L_0x0057:
            if (r2 == 0) goto L_0x005c
            r2.close()
        L_0x005c:
            return r0
        L_0x005d:
            r0 = move-exception
            goto L_0x006c
        L_0x005f:
            goto L_0x0079
        L_0x0061:
            r2 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
            goto L_0x006c
        L_0x0066:
            r2 = r0
            goto L_0x0079
        L_0x0068:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
        L_0x006c:
            if (r1 == 0) goto L_0x0071
            r1.close()
        L_0x0071:
            if (r2 == 0) goto L_0x0076
            r2.close()
        L_0x0076:
            throw r0
        L_0x0077:
            r1 = r0
            r2 = r1
        L_0x0079:
            if (r1 == 0) goto L_0x007e
            r1.close()
        L_0x007e:
            if (r2 == 0) goto L_0x0083
            r2.close()
        L_0x0083:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p072o.C1733g.m8687e():org.json.JSONObject");
    }

    /* renamed from: a */
    public JSONObject mo6933a() {
        int o = C1713a.m8584o(this.f5718b);
        return o > 0 ? m8682a(o) : m8687e();
    }

    /* renamed from: a */
    public boolean mo6934a(JSONArray jSONArray) {
        boolean i = C1713a.m8578i(this.f5718b);
        boolean z = true;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                String string = jSONObject.getString("id");
                int i3 = jSONObject.getInt("code");
                if (i3 == 1) {
                    if (!this.f5719c.mo6849b(string)) {
                        if (!i) {
                        }
                    }
                } else if (i3 < 1000 || i3 >= 2000) {
                    if (i3 >= 2000) {
                        if (i3 < 3000) {
                            if (!this.f5719c.mo6849b(string)) {
                                if (!i) {
                                }
                            }
                        }
                    }
                } else {
                    m8684a(string);
                    z = false;
                }
                C1703d.m8526b(string);
            } catch (JSONException unused) {
            }
        }
        return z;
    }

    /* renamed from: b */
    public void mo6935b() {
        this.f5719c.mo6854g();
        this.f5719c.mo6848b();
        C1703d.m8529d(this.f5718b);
    }

    /* renamed from: b */
    public void mo6936b(JSONArray jSONArray) {
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                m8684a(jSONArray.getJSONObject(i).getString("id"));
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: c */
    public void mo6937c() {
        this.f5719c.mo6855h();
        C1703d.m8524b(this.f5718b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0035  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo6938d() {
        /*
            r6 = this;
            android.content.Context r0 = r6.f5718b
            int r0 = com.facebook.ads.internal.p069k.C1713a.m8584o(r0)
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L_0x000b
            return r2
        L_0x000b:
            r3 = 0
            com.facebook.ads.internal.g.d r4 = r6.f5719c     // Catch:{ all -> 0x0031 }
            android.database.Cursor r4 = r4.mo6851d()     // Catch:{ all -> 0x0031 }
            boolean r3 = r4.moveToFirst()     // Catch:{ all -> 0x002f }
            if (r3 == 0) goto L_0x001d
            int r3 = r4.getInt(r2)     // Catch:{ all -> 0x002f }
            goto L_0x001e
        L_0x001d:
            r3 = 0
        L_0x001e:
            android.content.Context r5 = r6.f5718b     // Catch:{ all -> 0x002f }
            int r5 = com.facebook.ads.internal.p066h.C1703d.m8527c(r5)     // Catch:{ all -> 0x002f }
            int r3 = r3 + r5
            if (r3 <= r0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r1 = 0
        L_0x0029:
            if (r4 == 0) goto L_0x002e
            r4.close()
        L_0x002e:
            return r1
        L_0x002f:
            r0 = move-exception
            goto L_0x0033
        L_0x0031:
            r0 = move-exception
            r4 = r3
        L_0x0033:
            if (r4 == 0) goto L_0x0038
            r4.close()
        L_0x0038:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p072o.C1733g.mo6938d():boolean");
    }
}
