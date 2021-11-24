package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.iid.y */
final class C4972y {

    /* renamed from: b */
    private static final long f17800b = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a */
    final String f17801a;

    /* renamed from: c */
    private final String f17802c;

    /* renamed from: d */
    private final long f17803d;

    private C4972y(String str, String str2, long j) {
        this.f17801a = str;
        this.f17802c = str2;
        this.f17803d = j;
    }

    /* renamed from: a */
    static C4972y m24678a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new C4972y(str, null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C4972y(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to parse token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    static String m24679a(C4972y yVar) {
        if (yVar == null) {
            return null;
        }
        return yVar.f17801a;
    }

    /* renamed from: a */
    static String m24680a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Failed to encode token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo16253b(String str) {
        return System.currentTimeMillis() > this.f17803d + f17800b || !str.equals(this.f17802c);
    }
}
