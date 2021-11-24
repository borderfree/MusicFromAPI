package com.seattleclouds.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import com.seattleclouds.App;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.util.ac */
public class C6574ac {

    /* renamed from: a */
    private static C6574ac f23259a;

    /* renamed from: b */
    private SharedPreferences f23260b;

    /* renamed from: c */
    private Editor f23261c;

    /* renamed from: d */
    private Context f23262d;

    private C6574ac(Context context) {
        if (context != null) {
            this.f23262d = context.getApplicationContext();
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(".");
            sb.append(App.f18522x);
            sb.append(".");
            sb.append(App.f18523y);
            sb.append(".");
            sb.append(App.f18524z);
            sb.append(".APP_PREFS");
            this.f23260b = this.f23262d.getSharedPreferences(sb.toString(), 0);
            this.f23261c = this.f23260b.edit();
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static C6574ac m31815a(Context context) {
        if (context != null) {
            if (f23259a == null) {
                f23259a = new C6574ac(context);
            }
            return f23259a;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static JSONObject m31816a(Context context, String str) {
        return m31817a(context, str, "prefs");
    }

    /* renamed from: a */
    public static JSONObject m31817a(Context context, String str, String str2) {
        if (context == null) {
            return null;
        }
        String string = context.getSharedPreferences(str, 0).getString(str2, "");
        if (!(string == null || string.length() == 0)) {
            try {
                return new JSONObject(string);
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error parsing JSON: ");
                sb.append(e);
                Log.e("PreferencesUtil", sb.toString());
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m31818a(Context context, JSONObject jSONObject, String str) {
        m31819a(context, jSONObject, str, "prefs");
    }

    /* renamed from: a */
    public static void m31819a(Context context, JSONObject jSONObject, String str, String str2) {
        if (context != null) {
            Editor edit = context.getSharedPreferences(str, 0).edit();
            edit.putString(str2, jSONObject.toString());
            edit.apply();
        }
    }

    /* renamed from: a */
    public long mo20545a(String str, long j) {
        return this.f23260b.getLong(str, j);
    }

    /* renamed from: a */
    public C6574ac mo20546a() {
        f23259a = new C6574ac(this.f23262d);
        return f23259a;
    }

    /* renamed from: b */
    public C6574ac mo20547b(String str, long j) {
        this.f23261c.putLong(str, j);
        return this;
    }

    /* renamed from: b */
    public void mo20548b() {
        this.f23261c.apply();
    }
}
