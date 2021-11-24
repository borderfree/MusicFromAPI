package com.facebook.ads.internal.p063e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.internal.p062d.C1682a;
import com.facebook.ads.internal.p077s.p081d.C1831a;
import com.facebook.ads.internal.p077s.p081d.C1832b;
import com.p032a.p033a.C1134a;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.e.a */
public abstract class C1683a {

    /* renamed from: a */
    private static boolean f5527a = false;

    /* renamed from: b */
    private static double f5528b = 1.0d;

    /* renamed from: c */
    private static boolean f5529c = false;

    /* renamed from: d */
    private static final Set<String> f5530d = new HashSet();

    /* renamed from: e */
    private static final Set<String> f5531e = new HashSet();

    @SuppressLint({"CatchGeneralException"})
    /* renamed from: a */
    public static boolean m8441a(Context context, String str, String str2) {
        if (f5527a && Math.random() <= f5528b && f5530d.contains(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (f5531e.contains(str)) {
                    str = "click";
                }
                if (f5529c && !TextUtils.isEmpty(C1682a.f5524b)) {
                    jSONObject.put("ui", C1682a.f5524b);
                }
                jSONObject.put("ti", str2);
                jSONObject.put("bt", "AN_ANDROID");
                jSONObject.put("sn", str);
                C1134a.m6228a(jSONObject);
                return true;
            } catch (Exception e) {
                C1831a.m8998a(context, "bdet", C1832b.f5979F, e);
            }
        }
        return false;
    }
}
