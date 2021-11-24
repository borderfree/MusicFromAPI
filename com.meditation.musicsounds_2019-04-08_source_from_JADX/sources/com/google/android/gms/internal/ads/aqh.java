package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

final class aqh extends aqc<String> {
    aqh(int i, String str, String str2) {
        super(i, str, str2, null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12285a(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(mo12287a(), (String) mo12289b());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12286a(JSONObject jSONObject) {
        return jSONObject.optString(mo12287a(), (String) mo12289b());
    }

    /* renamed from: a */
    public final /* synthetic */ void mo12288a(Editor editor, Object obj) {
        editor.putString(mo12287a(), (String) obj);
    }
}
