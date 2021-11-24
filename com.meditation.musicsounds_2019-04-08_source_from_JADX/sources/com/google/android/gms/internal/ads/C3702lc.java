package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.lc */
public final class C3702lc {

    /* renamed from: a */
    private static final C3704le<Map<String, ?>> f14382a = new C3703ld();

    /* renamed from: a */
    public static List<String> m19077a(JSONArray jSONArray, List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }
}
