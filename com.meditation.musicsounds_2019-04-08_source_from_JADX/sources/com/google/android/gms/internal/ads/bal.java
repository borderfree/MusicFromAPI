package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@C3464ci
public final class bal {
    /* renamed from: a */
    private static String m17778a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* renamed from: a */
    public static List<String> m17779a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.getString(i));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public static void m17780a(Context context, String str, C3622id idVar, String str2, boolean z, List<String> list) {
        if (list != null && !list.isEmpty()) {
            String str3 = z ? "1" : "0";
            for (String a : list) {
                String a2 = m17778a(m17778a(m17778a(m17778a(m17778a(m17778a(m17778a(a, "@gw_adlocid@", str2), "@gw_adnetrefresh@", str3), "@gw_qdata@", idVar.f14151r.f13431i), "@gw_sdkver@", str), "@gw_sessid@", ane.m16647c()), "@gw_seqnum@", idVar.f14143j), "@gw_adnetstatus@", idVar.f14153t);
                if (idVar.f14148o != null) {
                    a2 = m17778a(m17778a(a2, "@gw_adnetid@", idVar.f14148o.f13403b), "@gw_allocid@", idVar.f14148o.f13405d);
                }
                String a3 = C3615hx.m18682a(a2, context);
                zzbv.zzek();
                C3653jh.m18875a(context, str, a3);
            }
        }
    }

    /* renamed from: a */
    public static void m17781a(Context context, String str, List<String> list, String str2, zzaig zzaig) {
        if (list != null && !list.isEmpty()) {
            if (!TextUtils.isEmpty(str2) && C3723lx.m19149c()) {
                str2 = "fakeUserForAdDebugLog";
            }
            long a = zzbv.zzer().mo11326a();
            for (String a2 : list) {
                String a3 = m17778a(m17778a(a2, "@gw_rwd_userid@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(a));
                if (zzaig != null) {
                    a3 = m17778a(m17778a(a3, "@gw_rwd_itm@", Uri.encode(zzaig.f15350a)), "@gw_rwd_amt@", Integer.toString(zzaig.f15351b));
                }
                zzbv.zzek();
                C3653jh.m18875a(context, str, a3);
            }
        }
    }

    /* renamed from: a */
    public static boolean m17782a(String str, int[] iArr) {
        if (TextUtils.isEmpty(str) || iArr.length != 2) {
            return false;
        }
        String[] split = str.split("x");
        if (split.length != 2) {
            return false;
        }
        try {
            iArr[0] = Integer.parseInt(split[0]);
            iArr[1] = Integer.parseInt(split[1]);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
