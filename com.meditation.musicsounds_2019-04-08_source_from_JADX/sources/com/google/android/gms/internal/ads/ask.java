package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

final /* synthetic */ class ask implements C3868rg {

    /* renamed from: a */
    private final asj f13083a;

    /* renamed from: b */
    private final Map f13084b;

    /* renamed from: c */
    private final C3442bn f13085c;

    ask(asj asj, Map map, C3442bn bnVar) {
        this.f13083a = asj;
        this.f13084b = map;
        this.f13085c = bnVar;
    }

    /* renamed from: a */
    public final void mo10054a(boolean z) {
        asj asj = this.f13083a;
        Map map = this.f13084b;
        C3442bn bnVar = this.f13085c;
        asj.f13081a.f13080b = (String) map.get("id");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("messageType", "htmlLoaded");
            jSONObject.put("id", asj.f13081a.f13080b);
            bnVar.mo12818a("sendMessageToNativeJs", jSONObject);
        } catch (JSONException e) {
            C3643iy.m19173b("Unable to dispatch sendMessageToNativeJs event", e);
        }
    }
}
