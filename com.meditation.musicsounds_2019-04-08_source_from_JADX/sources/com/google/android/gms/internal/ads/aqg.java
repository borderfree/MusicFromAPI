package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

final class aqg extends aqc<Float> {
    aqg(int i, String str, Float f) {
        super(i, str, f, null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12285a(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(mo12287a(), ((Float) mo12289b()).floatValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12286a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(mo12287a(), (double) ((Float) mo12289b()).floatValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo12288a(Editor editor, Object obj) {
        editor.putFloat(mo12287a(), ((Float) obj).floatValue());
    }
}
