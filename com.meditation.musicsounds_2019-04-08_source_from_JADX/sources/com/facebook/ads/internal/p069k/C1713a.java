package com.facebook.ads.internal.p069k;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.facebook.ads.internal.k.a */
public final class C1713a {

    /* renamed from: a */
    private static C1713a f5641a;

    /* renamed from: b */
    private final SharedPreferences f5642b;

    private C1713a(Context context) {
        this.f5642b = context.getApplicationContext().getSharedPreferences("com.facebook.ads.FEATURE_CONFIG", 0);
    }

    /* renamed from: a */
    private static int m8568a(Context context, String str, int i) {
        int a = m8594y(context).mo6901a(str, i);
        return (a < 0 || a >= 101) ? i : a;
    }

    /* renamed from: a */
    public static boolean m8569a(Context context) {
        return VERSION.SDK_INT >= 14 && m8571b("com.google.android.exoplayer2", "ExoPlayer") && m8594y(context).mo6904a("adnw_enable_exoplayer", false);
    }

    /* renamed from: b */
    public static boolean m8570b(Context context) {
        return VERSION.SDK_INT >= 18 && m8594y(context).mo6904a("adnw_enable_debug_overlay", false);
    }

    /* renamed from: b */
    private static boolean m8571b(String str, String str2) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".");
            sb.append(str2);
            Class.forName(sb.toString());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m8572c(Context context) {
        return m8594y(context).mo6904a("adnw_block_lockscreen", false);
    }

    /* renamed from: d */
    public static boolean m8573d(Context context) {
        return m8594y(context).mo6904a("adnw_block_cta_before_impression", false);
    }

    /* renamed from: e */
    public static boolean m8574e(Context context) {
        return m8594y(context).mo6904a("adnw_android_memory_opt", false);
    }

    /* renamed from: f */
    public static boolean m8575f(Context context) {
        return m8594y(context).mo6904a("adnw_android_disable_blur", false);
    }

    /* renamed from: g */
    public static boolean m8576g(Context context) {
        return m8594y(context).mo6904a("adnw_android_wo_bot_detection_enabled", false);
    }

    /* renamed from: h */
    public static boolean m8577h(Context context) {
        return VERSION.SDK_INT >= 19 && m8594y(context).mo6904a("adnw_enable_iab", false);
    }

    /* renamed from: i */
    public static boolean m8578i(Context context) {
        return m8594y(context).mo6904a("adnw_debug_logging", false);
    }

    /* renamed from: j */
    public static Set<String> m8579j(Context context) {
        String a = m8594y(context).mo6903a("additional_debug_logging_black_list", "");
        HashSet hashSet = new HashSet();
        try {
            JSONArray jSONArray = new JSONArray(a);
            for (int i = 0; i < jSONArray.length(); i++) {
                hashSet.add(jSONArray.getString(i));
            }
        } catch (JSONException unused) {
        }
        return hashSet;
    }

    /* renamed from: k */
    public static int m8580k(Context context) {
        return m8568a(context, "additional_debug_logging_black_list_percentage", 0);
    }

    /* renamed from: l */
    public static int m8581l(Context context) {
        return m8568a(context, "additional_debug_logging_sampling_percentage", 100);
    }

    /* renamed from: m */
    public static long m8582m(Context context) {
        return m8594y(context).mo6902a("unified_logging_immediate_delay_ms", 500);
    }

    /* renamed from: n */
    public static long m8583n(Context context) {
        return ((long) m8594y(context).mo6901a("unified_logging_dispatch_interval_seconds", 300)) * 1000;
    }

    /* renamed from: o */
    public static int m8584o(Context context) {
        return m8594y(context).mo6901a("unified_logging_event_limit", -1);
    }

    /* renamed from: p */
    public static boolean m8585p(Context context) {
        return m8594y(context).mo6904a("adnw_top_activity_viewability", false);
    }

    /* renamed from: q */
    public static boolean m8586q(Context context) {
        return m8594y(context).mo6904a("adnw_enhanced_viewability_area_check", false);
    }

    /* renamed from: r */
    public static boolean m8587r(Context context) {
        return m8594y(context).mo6904a("adnw_purge_on_413_response", false);
    }

    /* renamed from: s */
    public static boolean m8588s(Context context) {
        return m8594y(context).mo6904a("adnw_arrows_instead_of_x_skip_button", false);
    }

    /* renamed from: t */
    public static boolean m8589t(Context context) {
        return m8594y(context).mo6904a("adnw_viewability_check_area_based", false);
    }

    /* renamed from: u */
    public static String m8590u(Context context) {
        return m8594y(context).mo6903a("adnw_logging_endpoint_prefix", "www");
    }

    /* renamed from: v */
    public static boolean m8591v(Context context) {
        return m8594y(context).mo6904a("adnw_mapp_markup_impression_after_image_load", false);
    }

    /* renamed from: w */
    public static boolean m8592w(Context context) {
        return m8594y(context).mo6904a("adnw_enable_inline_x_out_on_sdk", false);
    }

    /* renamed from: x */
    public static boolean m8593x(Context context) {
        return m8594y(context).mo6904a("adnw_unique_db_name_per_process", false);
    }

    /* renamed from: y */
    public static C1713a m8594y(Context context) {
        if (f5641a == null) {
            synchronized (C1713a.class) {
                if (f5641a == null) {
                    f5641a = new C1713a(context);
                }
            }
        }
        return f5641a;
    }

    /* renamed from: a */
    public int mo6901a(String str, int i) {
        String string = this.f5642b.getString(str, String.valueOf(i));
        try {
            return string.equals("null") ? i : Integer.valueOf(string).intValue();
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: a */
    public long mo6902a(String str, long j) {
        String string = this.f5642b.getString(str, String.valueOf(j));
        try {
            return string.equals("null") ? j : Long.valueOf(string).longValue();
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    /* renamed from: a */
    public String mo6903a(String str, String str2) {
        String string = this.f5642b.getString(str, str2);
        return (string == null || string.equals("null")) ? str2 : string;
    }

    /* renamed from: a */
    public boolean mo6904a(String str, boolean z) {
        String string = this.f5642b.getString(str, String.valueOf(z));
        return string.equals("null") ? z : Boolean.valueOf(string).booleanValue();
    }
}
