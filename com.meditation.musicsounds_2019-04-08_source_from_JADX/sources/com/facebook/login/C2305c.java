package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginClient.Request;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.login.c */
class C2305c {

    /* renamed from: a */
    private final AppEventsLogger f7395a;

    /* renamed from: b */
    private String f7396b;

    /* renamed from: c */
    private String f7397c;

    C2305c(Context context, String str) {
        this.f7396b = str;
        this.f7395a = AppEventsLogger.m9948b(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0);
                if (packageInfo != null) {
                    this.f7397c = packageInfo.versionName;
                }
            }
        } catch (NameNotFoundException unused) {
        }
    }

    /* renamed from: a */
    static Bundle m10684a(String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_auth_logger_id", str);
        bundle.putString("3_method", "");
        bundle.putString("2_result", "");
        bundle.putString("5_error_message", "");
        bundle.putString("4_error_code", "");
        bundle.putString("6_extras", "");
        return bundle;
    }

    /* renamed from: a */
    public String mo8070a() {
        return this.f7396b;
    }

    /* renamed from: a */
    public void mo8071a(Request request) {
        Bundle a = m10684a(request.mo8034e());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("login_behavior", request.mo8030b().toString());
            jSONObject.put("request_code", LoginClient.m10578d());
            jSONObject.put("permissions", TextUtils.join(",", request.mo8027a()));
            jSONObject.put("default_audience", request.mo8031c().toString());
            jSONObject.put("isReauthorize", request.mo8035f());
            if (this.f7397c != null) {
                jSONObject.put("facebookVersion", this.f7397c);
            }
            a.putString("6_extras", jSONObject.toString());
        } catch (JSONException unused) {
        }
        this.f7395a.mo7683a("fb_mobile_login_start", (Double) null, a);
    }

    /* renamed from: a */
    public void mo8072a(String str, String str2) {
        Bundle a = m10684a(str);
        a.putString("3_method", str2);
        this.f7395a.mo7683a("fb_mobile_login_method_start", (Double) null, a);
    }

    /* renamed from: a */
    public void mo8073a(String str, String str2, String str3) {
        Bundle a = m10684a("");
        a.putString("2_result", Code.ERROR.getLoggingValue());
        a.putString("5_error_message", str2);
        a.putString("3_method", str3);
        this.f7395a.mo7683a(str, (Double) null, a);
    }

    /* renamed from: a */
    public void mo8074a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        Bundle a = m10684a(str);
        if (str3 != null) {
            a.putString("2_result", str3);
        }
        if (str4 != null) {
            a.putString("5_error_message", str4);
        }
        if (str5 != null) {
            a.putString("4_error_code", str5);
        }
        if (map != null && !map.isEmpty()) {
            a.putString("6_extras", new JSONObject(map).toString());
        }
        a.putString("3_method", str2);
        this.f7395a.mo7683a("fb_mobile_login_method_complete", (Double) null, a);
    }

    /* renamed from: a */
    public void mo8075a(String str, Map<String, String> map, Code code, Map<String, String> map2, Exception exc) {
        Bundle a = m10684a(str);
        if (code != null) {
            a.putString("2_result", code.getLoggingValue());
        }
        if (!(exc == null || exc.getMessage() == null)) {
            a.putString("5_error_message", exc.getMessage());
        }
        JSONObject jSONObject = !map.isEmpty() ? new JSONObject(map) : null;
        if (map2 != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                for (Entry entry : map2.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            } catch (JSONException unused) {
            }
        }
        if (jSONObject != null) {
            a.putString("6_extras", jSONObject.toString());
        }
        this.f7395a.mo7683a("fb_mobile_login_complete", (Double) null, a);
    }

    /* renamed from: b */
    public void mo8076b(String str, String str2) {
        Bundle a = m10684a(str);
        a.putString("3_method", str2);
        this.f7395a.mo7683a("fb_mobile_login_method_not_tried", (Double) null, a);
    }

    /* renamed from: c */
    public void mo8077c(String str, String str2) {
        mo8073a(str, str2, "");
    }
}
