package com.seattleclouds.modules.p176n;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.n.b */
public class C5894b {

    /* renamed from: a */
    public static final String f20856a = "b";

    /* renamed from: a */
    private List<HashMap<String, String>> m28902a(JSONArray jSONArray) {
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            try {
                arrayList.add(m28903b((JSONObject) jSONArray.get(i)));
            } catch (JSONException e) {
                Log.e(f20856a, "JSONException in getPlaces method", e);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private HashMap<String, String> m28903b(JSONObject jSONObject) {
        HashMap<String, String> hashMap = new HashMap<>();
        String str = "-NA-";
        String str2 = "-NA-";
        try {
            if (!jSONObject.isNull("name")) {
                str = jSONObject.getString("name");
            }
            if (!jSONObject.isNull("vicinity")) {
                str2 = jSONObject.getString("vicinity");
            }
            String string = jSONObject.getJSONObject("geometry").getJSONObject("location").getString("lat");
            String string2 = jSONObject.getJSONObject("geometry").getJSONObject("location").getString("lng");
            String string3 = jSONObject.getString("reference");
            hashMap.put("place_name", str);
            hashMap.put("vicinity", str2);
            hashMap.put("lat", string);
            hashMap.put("lng", string2);
            hashMap.put("reference", string3);
        } catch (JSONException e) {
            Log.e(f20856a, "JSONException in getPlace Method", e);
        }
        return hashMap;
    }

    /* renamed from: a */
    public List<HashMap<String, String>> mo18657a(JSONObject jSONObject) {
        JSONArray jSONArray;
        try {
            jSONArray = jSONObject.getJSONArray("results");
        } catch (JSONException e) {
            Log.e(f20856a, "JSONException in a parse method", e);
            jSONArray = null;
        }
        return m28902a(jSONArray);
    }
}
