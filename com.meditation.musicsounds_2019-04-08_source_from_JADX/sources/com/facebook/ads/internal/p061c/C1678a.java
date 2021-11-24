package com.facebook.ads.internal.p061c;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.facebook.ads.internal.p069k.C1713a;
import com.facebook.ads.internal.p077s.p081d.C1831a;
import com.facebook.ads.internal.p077s.p081d.C1832b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.c.a */
public class C1678a {

    /* renamed from: a */
    private static final String[] f5508a = {"hide_ad", "hide_ad_description", "hide_ad_follow_up_heading", "hide_ad_options", "report_ad", "report_ad_description", "report_ad_follow_up_heading", "report_ad_options", "manage_ad_preferences", "finished_hide_ad", "finished_report_ad", "finished_description", "why_am_i_seeing_this", "ad_choices_uri", "manage_ad_preferences_uri"};

    /* renamed from: b */
    private static C1678a f5509b;

    /* renamed from: c */
    private final SharedPreferences f5510c;

    private C1678a(Context context) {
        this.f5510c = context.getApplicationContext().getSharedPreferences("com.facebook.ads.AD_REPORTING_CONFIG", 0);
    }

    /* renamed from: a */
    public static long m8402a(Context context) {
        return m8421p(context).m8403a("last_updated_timestamp", 0);
    }

    /* renamed from: a */
    private long m8403a(String str, long j) {
        return this.f5510c.getLong(str, j);
    }

    /* renamed from: a */
    private String m8404a(String str, String str2) {
        String string = this.f5510c.getString(str, str2);
        return (string == null || string.equals("null")) ? str2 : string;
    }

    /* renamed from: a */
    private static List<C1681c> m8405a(String str) {
        if (TextUtils.isEmpty(str) || str.equalsIgnoreCase("null")) {
            return new ArrayList();
        }
        JSONArray jSONArray = new JSONArray(str);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = (JSONObject) jSONArray.get(i);
            C1681c cVar = new C1681c(jSONObject.getInt("option_value"), jSONObject.getString("option_text"), jSONObject.optString("children_heading"));
            for (C1681c a : m8405a(jSONObject.optString("children_options"))) {
                cVar.mo6823a(a);
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m8406a() {
        Editor edit = this.f5510c.edit();
        edit.putLong("last_updated_timestamp", 0);
        edit.apply();
    }

    /* renamed from: b */
    public static boolean m8407b(Context context) {
        return C1713a.m8592w(context) && m8402a(context) > 0;
    }

    /* renamed from: c */
    public static String m8408c(Context context) {
        return m8421p(context).m8404a("hide_ad", "Hide Ad");
    }

    /* renamed from: d */
    public static String m8409d(Context context) {
        return m8421p(context).m8404a("hide_ad_description", "See fewer ads like this");
    }

    /* renamed from: e */
    public static C1681c m8410e(Context context) {
        C1681c cVar = new C1681c(m8422q(context));
        try {
            for (C1681c a : m8405a(m8421p(context).m8404a("hide_ad_options", ""))) {
                cVar.mo6823a(a);
            }
        } catch (JSONException e) {
            m8421p(context).m8406a();
            C1831a.m8998a(context, "reporting", C1832b.f5977D, (Exception) e);
        }
        return cVar;
    }

    /* renamed from: f */
    public static String m8411f(Context context) {
        return m8421p(context).m8404a("report_ad", "Report Ad");
    }

    /* renamed from: g */
    public static String m8412g(Context context) {
        return m8421p(context).m8404a("report_ad_description", " Mark ad as offensive or inappropriate");
    }

    /* renamed from: h */
    public static C1681c m8413h(Context context) {
        C1681c cVar = new C1681c(m8423r(context));
        try {
            for (C1681c a : m8405a(m8421p(context).m8404a("report_ad_options", ""))) {
                cVar.mo6823a(a);
            }
        } catch (JSONException e) {
            m8421p(context).m8406a();
            C1831a.m8998a(context, "reporting", C1832b.f5975B, (Exception) e);
        }
        return cVar;
    }

    /* renamed from: i */
    public static String m8414i(Context context) {
        return m8421p(context).m8404a("manage_ad_preferences", "Manage ad preferences");
    }

    /* renamed from: j */
    public static String m8415j(Context context) {
        return m8421p(context).m8404a("finished_hide_ad", "Ad hidden.");
    }

    /* renamed from: k */
    public static String m8416k(Context context) {
        return m8421p(context).m8404a("finished_report_ad", "Ad reported.");
    }

    /* renamed from: l */
    public static String m8417l(Context context) {
        return m8421p(context).m8404a("finished_description", "Your submission is now being reviewed.");
    }

    /* renamed from: m */
    public static String m8418m(Context context) {
        return m8421p(context).m8404a("why_am_i_seeing_this", "Why am I seeing this?");
    }

    /* renamed from: n */
    public static String m8419n(Context context) {
        return m8421p(context).m8404a("ad_choices_uri", "");
    }

    /* renamed from: o */
    public static String m8420o(Context context) {
        return m8421p(context).m8404a("manage_ad_preferences_uri", "");
    }

    /* renamed from: p */
    private static C1678a m8421p(Context context) {
        if (f5509b == null) {
            synchronized (C1678a.class) {
                if (f5509b == null) {
                    f5509b = new C1678a(context);
                }
            }
        }
        return f5509b;
    }

    /* renamed from: q */
    private static String m8422q(Context context) {
        return m8421p(context).m8404a("hide_ad_follow_up_heading", "Help us understand what is happening. Why don't you want to see this?");
    }

    /* renamed from: r */
    private static String m8423r(Context context) {
        return m8421p(context).m8404a("report_ad_follow_up_heading", "Help us understand what is happening. Why is this inappropriate?");
    }
}
