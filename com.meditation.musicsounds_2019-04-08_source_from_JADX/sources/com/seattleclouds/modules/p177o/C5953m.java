package com.seattleclouds.modules.p177o;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.o.m */
public class C5953m {

    /* renamed from: a */
    private double f21033a = 0.0d;

    /* renamed from: b */
    private double f21034b = 0.0d;

    /* renamed from: c */
    private int f21035c = 0;

    /* renamed from: a */
    public static C5953m m29178a(JSONObject jSONObject) {
        C5953m mVar = new C5953m();
        try {
            mVar.f21033a = jSONObject.getDouble("freeDelivery");
        } catch (JSONException unused) {
        }
        try {
            mVar.f21034b = jSONObject.getDouble("convenienceFee");
        } catch (JSONException unused2) {
        }
        try {
            mVar.f21035c = jSONObject.getInt("leadTime");
        } catch (JSONException unused3) {
        }
        return mVar;
    }
}
