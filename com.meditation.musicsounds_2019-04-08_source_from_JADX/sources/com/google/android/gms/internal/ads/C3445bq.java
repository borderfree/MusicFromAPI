package com.google.android.gms.internal.ads;

import android.support.p009v4.p019g.C0510m;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.bq */
public final class C3445bq implements C3433be<aru> {

    /* renamed from: a */
    private final boolean f13630a;

    public C3445bq(boolean z) {
        this.f13630a = z;
    }

    /* renamed from: a */
    public final /* synthetic */ ase mo12809a(C3424aw awVar, JSONObject jSONObject) {
        C0510m mVar = new C0510m();
        C0510m mVar2 = new C0510m();
        C3751my a = awVar.mo12538a(jSONObject);
        C3751my a2 = awVar.mo12539a(jSONObject, "video");
        JSONArray jSONArray = jSONObject.getJSONArray("custom_assets");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("type");
            if ("string".equals(string)) {
                mVar2.put(jSONObject2.getString("name"), jSONObject2.getString("string_value"));
            } else if ("image".equals(string)) {
                mVar.put(jSONObject2.getString("name"), awVar.mo12542a(jSONObject2, "image_value", this.f13630a));
            } else {
                String str = "Unknown custom asset type: ";
                String valueOf = String.valueOf(string);
                C3643iy.m19178e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
        C3832py a3 = C3424aw.m17505a(a2);
        String string2 = jSONObject.getString("custom_template_id");
        C0510m mVar3 = new C0510m();
        for (int i2 = 0; i2 < mVar.size(); i2++) {
            mVar3.put(mVar.mo2010b(i2), ((Future) mVar.mo2011c(i2)).get());
        }
        aru aru = new aru(string2, mVar3, mVar2, (arl) a.get(), a3 != null ? a3.mo13409b() : null, a3 != null ? a3.getView() : null);
        return aru;
    }
}
