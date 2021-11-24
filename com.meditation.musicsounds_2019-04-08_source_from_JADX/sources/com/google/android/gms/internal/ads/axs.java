package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class axs {
    /* renamed from: a */
    public static void m17625a(axr axr, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        axr.mo12595b(sb.toString());
    }

    /* renamed from: a */
    public static void m17626a(axr axr, String str, Map map) {
        try {
            axr.mo12589a(str, zzbv.zzek().mo13124a(map));
        } catch (JSONException unused) {
            C3643iy.m19178e("Could not convert parameters to JSON.");
        }
    }

    /* renamed from: a */
    public static void m17627a(axr axr, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        axr.mo12593a(str, jSONObject.toString());
    }

    /* renamed from: b */
    public static void m17628b(axr axr, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String str2 = "Dispatching AFMA event: ";
        String valueOf = String.valueOf(sb.toString());
        C3643iy.m19172b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        axr.mo12595b(sb.toString());
    }
}
