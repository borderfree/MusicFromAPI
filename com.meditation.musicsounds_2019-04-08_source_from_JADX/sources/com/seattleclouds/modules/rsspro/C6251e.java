package com.seattleclouds.modules.rsspro;

import android.util.Log;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.rsspro.e */
public class C6251e {

    /* renamed from: a */
    static C6251e f22165a;

    /* renamed from: b */
    private JSONObject f22166b = new JSONObject();

    private C6251e() {
    }

    /* renamed from: a */
    public static synchronized C6251e m30404a() {
        C6251e eVar;
        synchronized (C6251e.class) {
            if (f22165a == null) {
                f22165a = new C6251e();
            }
            eVar = f22165a;
        }
        return eVar;
    }

    /* renamed from: a */
    public JSONObject mo19574a(String str) {
        this.f22166b = null;
        if (str == null) {
            return this.f22166b;
        }
        try {
            this.f22166b = new C6250d().mo19572a(str.replace("feed://", "http://"));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error loading RSS Feed Stream >> ");
            sb.append(e.getMessage());
            sb.append(" //");
            sb.append(e.toString());
            Log.e("RSS ERROR", sb.toString(), e);
        }
        return this.f22166b;
    }
}
