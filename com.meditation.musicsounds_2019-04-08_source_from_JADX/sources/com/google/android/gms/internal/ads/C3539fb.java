package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.fb */
public final class C3539fb extends C3541fd {

    /* renamed from: a */
    private final Object f13972a = new Object();

    /* renamed from: b */
    private final Context f13973b;

    /* renamed from: c */
    private SharedPreferences f13974c;

    /* renamed from: d */
    private final azj<JSONObject, JSONObject> f13975d;

    public C3539fb(Context context, azj<JSONObject, JSONObject> azj) {
        this.f13973b = context.getApplicationContext();
        this.f13975d = azj;
    }

    /* renamed from: a */
    public final C3751my<Void> mo12899a() {
        synchronized (this.f13972a) {
            if (this.f13974c == null) {
                this.f13974c = this.f13973b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (zzbv.zzer().mo11326a() - this.f13974c.getLong("js_last_update", 0) < ((Long) ane.m16650f().mo12297a(aqm.f12708bU)).longValue()) {
            return C3740mn.m19191a(null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzang.m20619a().f15360a);
            jSONObject.put("mf", ane.m16650f().mo12297a(aqm.f12709bV));
            jSONObject.put("cl", "193400285");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("dynamite_version", ModuleDescriptor.MODULE_VERSION);
            return C3740mn.m19194a(this.f13975d.mo12646b(jSONObject), (C3736mj<A, B>) new C3540fc<A,B>(this), C3758ne.f14482b);
        } catch (JSONException e) {
            C3643iy.m19173b("Unable to populate SDK Core Constants parameters.", e);
            return C3740mn.m19191a(null);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo12900a(JSONObject jSONObject) {
        aqm.m16921a(this.f13973b, 1, jSONObject);
        this.f13974c.edit().putLong("js_last_update", zzbv.zzer().mo11326a()).apply();
        return null;
    }
}
