package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

final class aqe extends aqc<Integer> {
    aqe(int i, String str, Integer num) {
        super(i, str, num, null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12285a(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(mo12287a(), ((Integer) mo12289b()).intValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12286a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(mo12287a(), ((Integer) mo12289b()).intValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo12288a(Editor editor, Object obj) {
        editor.putInt(mo12287a(), ((Integer) obj).intValue());
    }
}
