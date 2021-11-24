package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.C2189f;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C1609b;
import com.facebook.appevents.internal.C2161c;
import com.facebook.appevents.internal.C2163d;
import com.facebook.internal.C2230m.C2231a;
import com.facebook.internal.CallbackManagerImpl.C2200a;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.n */
public final class C2232n {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f7207a = C2232n.class.getCanonicalName();

    /* renamed from: b */
    private static final String[] f7208b = {"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "gdpv4_chrome_custom_tabs_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url"};

    /* renamed from: c */
    private static Map<String, C2230m> f7209c = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static AtomicBoolean f7210d = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static boolean f7211e = false;

    /* renamed from: a */
    public static C2230m m10235a(String str) {
        if (str != null) {
            return (C2230m) f7209c.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public static C2230m m10237a(String str, boolean z) {
        if (!z && f7209c.containsKey(str)) {
            return (C2230m) f7209c.get(str);
        }
        JSONObject c = m10247c(str);
        if (c == null) {
            return null;
        }
        return m10242b(str, c);
    }

    /* renamed from: a */
    private static Map<String, Map<String, C2231a>> m10238a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    C2231a a = C2231a.m10230a(optJSONArray.optJSONObject(i));
                    if (a != null) {
                        String a2 = a.mo7856a();
                        Map map = (Map) hashMap.get(a2);
                        if (map == null) {
                            map = new HashMap();
                            hashMap.put(a2, map);
                        }
                        map.put(a.mo7857b(), a);
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m10239a() {
        final Context f = C2189f.m10092f();
        final String j = C2189f.m10096j();
        boolean compareAndSet = f7210d.compareAndSet(false, true);
        if (!C2258x.m10392a(j) && !f7209c.containsKey(j) && compareAndSet) {
            final String format = String.format("com.facebook.internal.APP_SETTINGS.%s", new Object[]{j});
            C2189f.m10090d().execute(new Runnable() {
                public void run() {
                    JSONObject jSONObject;
                    SharedPreferences sharedPreferences = f.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                    C2230m mVar = null;
                    String string = sharedPreferences.getString(format, null);
                    if (!C2258x.m10392a(string)) {
                        try {
                            jSONObject = new JSONObject(string);
                        } catch (JSONException e) {
                            C2258x.m10383a("FacebookSDK", (Exception) e);
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            mVar = C2232n.m10242b(j, jSONObject);
                        }
                    }
                    JSONObject b = C2232n.m10247c(j);
                    if (b != null) {
                        C2232n.m10242b(j, b);
                        sharedPreferences.edit().putString(format, b.toString()).apply();
                    }
                    if (mVar != null) {
                        String i = mVar.mo7855i();
                        if (!C2232n.f7211e && i != null && i.length() > 0) {
                            C2232n.f7211e = true;
                            Log.w(C2232n.f7207a, i);
                        }
                    }
                    C2161c.m10020a();
                    C2232n.m10244b(f);
                    C2232n.f7210d.set(false);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C2230m m10242b(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        JSONArray optJSONArray = jSONObject2.optJSONArray("android_sdk_error_categories");
        C2225j a = optJSONArray == null ? C2225j.m10209a() : C2225j.m10210a(optJSONArray);
        int optInt = jSONObject2.optInt("app_events_feature_bitmask", 0);
        C2230m mVar = new C2230m(jSONObject2.optBoolean("supports_implicit_sdk_logging", false), jSONObject2.optString("gdpv4_nux_content", ""), jSONObject2.optBoolean("gdpv4_nux_enabled", false), jSONObject2.optBoolean("gdpv4_chrome_custom_tabs_enabled", false), jSONObject2.optInt("app_events_session_timeout", C2163d.m10026a()), SmartLoginOption.parseOptions(jSONObject2.optLong("seamless_login")), m10238a(jSONObject2.optJSONObject("android_dialog_configs")), (optInt & 8) != 0, a, jSONObject2.optString("smart_login_bookmark_icon_url"), jSONObject2.optString("smart_login_menu_icon_url"), (optInt & 16) != 0, jSONObject2.optString("sdk_update_message"));
        f7209c.put(str, mVar);
        return mVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m10244b(final Context context) {
        CallbackManagerImpl.m10136a(RequestCodeOffset.InAppPurchase.toRequestCode(), new C2200a() {
            /* renamed from: a */
            public boolean mo7800a(final int i, final Intent intent) {
                C2189f.m10090d().execute(new Runnable() {
                    public void run() {
                        C2161c.m10022a(context, i, intent);
                    }
                });
                return true;
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static JSONObject m10247c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", TextUtils.join(",", new ArrayList(Arrays.asList(f7208b))));
        GraphRequest a = GraphRequest.m8025a((AccessToken) null, str, (C1609b) null);
        a.mo6576a(true);
        a.mo6571a(bundle);
        return a.mo6584i().mo7796b();
    }
}
