package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

final class aqf extends aqc<Long> {
    aqf(int i, String str, Long l) {
        super(i, str, l, null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12285a(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(mo12287a(), ((Long) mo12289b()).longValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12286a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(mo12287a(), ((Long) mo12289b()).longValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo12288a(Editor editor, Object obj) {
        editor.putLong(mo12287a(), ((Long) obj).longValue());
    }
}
