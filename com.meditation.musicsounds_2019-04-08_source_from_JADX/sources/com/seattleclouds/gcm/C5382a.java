package com.seattleclouds.gcm;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.iid.C3350a;
import com.google.android.gms.tasks.C4795e;
import com.google.firebase.C4890b;
import com.google.firebase.C4897c.C4898a;
import com.google.firebase.iid.C4921a;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.C4975a;
import com.seattleclouds.App;
import com.seattleclouds.scm.C6559a;
import com.seattleclouds.util.C6618l;
import com.seattleclouds.util.HTTPUtil;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: com.seattleclouds.gcm.a */
public class C5382a {

    /* renamed from: a */
    private static final String f19234a;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("http://");
        sb.append(App.f18518t);
        sb.append("/gcm_register.ashx");
        f19234a = sb.toString();
    }

    /* renamed from: a */
    private static int m26946a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not get package name: ");
            sb.append(e);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: a */
    public static void m26947a() {
        if (m26955d().length() != 0) {
            return;
        }
        if (App.f18476I) {
            m26959g();
        } else {
            m26960h();
        }
    }

    /* renamed from: b */
    public static void m26950b() {
        if (!App.f18478K) {
            return;
        }
        if (!App.f18510l && App.f18476I) {
            return;
        }
        if (C4890b.m24408a(App.m25647e()).size() > 0) {
            m26953c();
            return;
        }
        C4898a aVar = new C4898a();
        aVar.mo16115b("no_app_Id");
        aVar.mo16113a("no_app_key");
        try {
            C4890b.m24406a(App.m25647e(), aVar.mo16114a());
            m26953c();
        } catch (Exception e) {
            Log.e("GCMHelper", "Firebase initializeApp : ", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m26951b(String str) {
        SharedPreferences e = m26957e();
        int a = m26946a(App.m25647e());
        Editor edit = e.edit();
        edit.putString("regId", str);
        edit.putInt("appVersion", a);
        edit.putLong("onServerExpirationTimeMs", System.currentTimeMillis() + 86400000);
        edit.apply();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m26952b(String str, String str2) {
        if (str != null) {
            if ("BLACKLISTED".equals(str)) {
                Log.e("GCMHelper", "Error: Device blacklisted");
                return;
            }
            if (m26954c(str, str2)) {
                m26951b(str);
            }
        }
    }

    /* renamed from: c */
    private static void m26953c() {
        if (C4975a.m24698a().mo16273b()) {
            C4975a.m24698a().mo16272a(false);
            new Thread(new Runnable() {
                public void run() {
                    try {
                        FirebaseInstanceId.m24498a().mo16163e();
                        C5382a.m26951b("");
                    } catch (Exception e) {
                        Log.d("GCMHelper", "Firebase deleteInstanceId: ", e);
                    }
                }
            }).start();
        }
    }

    /* renamed from: c */
    private static boolean m26954c(String str, String str2) {
        try {
            if ("OK".equalsIgnoreCase(m26956d(str, str2))) {
                return true;
            }
        } catch (SecurityException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Registration error ");
            sb.append(e);
            Log.w("GCMHelper", sb.toString());
        } catch (IOException unused) {
        }
        return false;
    }

    /* renamed from: d */
    private static String m26955d() {
        SharedPreferences e = m26957e();
        String string = e.getString("regId", "");
        return string.length() == 0 ? "" : (e.getInt("appVersion", Integer.MIN_VALUE) != m26946a(App.m25647e()) || m26958f()) ? "" : string;
    }

    /* renamed from: d */
    private static String m26956d(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("publisherId", App.f18522x);
        hashMap.put("username", App.f18523y);
        hashMap.put("appId", App.f18524z);
        hashMap.put("registrationId", str);
        hashMap.put("scmVersion", str2);
        hashMap.put("deviceId", C6618l.m32012a());
        return HTTPUtil.m31768b(f19234a, hashMap);
    }

    /* renamed from: e */
    private static SharedPreferences m26957e() {
        return App.m25647e().getSharedPreferences("com.seattleclouds.gcm.prefs", 0);
    }

    /* renamed from: f */
    private static boolean m26958f() {
        return System.currentTimeMillis() > m26957e().getLong("onServerExpirationTimeMs", -1);
    }

    /* renamed from: g */
    private static void m26959g() {
        try {
            C4975a a = C4975a.m24698a();
            if (!a.mo16273b()) {
                a.mo16272a(true);
            }
            FirebaseInstanceId.m24498a().mo16162d().mo15916a((C4795e<? super TResult>) new C4795e<C4921a>() {
                /* renamed from: a */
                public void mo15914a(C4921a aVar) {
                    final String a = aVar.mo16178a();
                    new Thread(new Runnable() {
                        public void run() {
                            C5382a.m26952b(a, "3");
                        }
                    }).start();
                }
            });
        } catch (Exception e) {
            if (("SERVICE_NOT_AVAILABLE".equalsIgnoreCase(e.getMessage()) || "MISSING_INSTANCEID_SERVICE".equalsIgnoreCase(e.getMessage())) && App.f18477J) {
                C6559a.m31715a(App.m25647e());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Error: ");
            sb.append(e.getMessage());
            Log.e("GCMHelper", sb.toString());
        }
    }

    /* renamed from: h */
    private static void m26960h() {
        new Thread(new Runnable() {
            public void run() {
                try {
                    C5382a.m26952b(C3350a.m15194c(App.m25647e()).mo11369a("774548614234", "GCM"), "2");
                } catch (IOException | NullPointerException e) {
                    if (("SERVICE_NOT_AVAILABLE".equalsIgnoreCase(e.getMessage()) || "MISSING_INSTANCEID_SERVICE".equalsIgnoreCase(e.getMessage())) && App.f18477J) {
                        C6559a.m31715a(App.m25647e());
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error: ");
                    sb.append(e.getMessage());
                    Log.e("GCMHelper", sb.toString());
                }
            }
        }).start();
    }
}
