package com.facebook;

import android.content.SharedPreferences;
import com.facebook.internal.C2264y;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.k */
final class C2276k {

    /* renamed from: a */
    private final SharedPreferences f7312a = C2189f.m10092f().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);

    C2276k() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Profile mo7927a() {
        String string = this.f7312a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new Profile(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7928a(Profile profile) {
        C2264y.m10422a((Object) profile, "profile");
        JSONObject e = profile.mo6617e();
        if (e != null) {
            this.f7312a.edit().putString("com.facebook.ProfileManager.CachedProfile", e.toString()).apply();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo7929b() {
        this.f7312a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }
}
