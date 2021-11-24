package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

final class aqd extends aqc<Boolean> {
    aqd(int i, String str, Boolean bool) {
        super(i, str, bool, null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12285a(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(mo12287a(), ((Boolean) mo12289b()).booleanValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12286a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(mo12287a(), ((Boolean) mo12289b()).booleanValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo12288a(Editor editor, Object obj) {
        editor.putBoolean(mo12287a(), ((Boolean) obj).booleanValue());
    }
}
