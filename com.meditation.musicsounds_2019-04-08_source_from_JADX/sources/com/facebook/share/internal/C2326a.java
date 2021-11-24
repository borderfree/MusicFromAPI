package com.facebook.share.internal;

import com.facebook.share.model.CameraEffectArguments;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.a */
public class C2326a {

    /* renamed from: a */
    private static final Map<Class<?>, C2330a> f7458a = new HashMap();

    /* renamed from: com.facebook.share.internal.a$a */
    public interface C2330a {
        /* renamed from: a */
        void mo8131a(JSONObject jSONObject, String str, Object obj);
    }

    static {
        f7458a.put(String.class, new C2330a() {
            /* renamed from: a */
            public void mo8131a(JSONObject jSONObject, String str, Object obj) {
                jSONObject.put(str, obj);
            }
        });
        f7458a.put(String[].class, new C2330a() {
            /* renamed from: a */
            public void mo8131a(JSONObject jSONObject, String str, Object obj) {
                JSONArray jSONArray = new JSONArray();
                for (String put : (String[]) obj) {
                    jSONArray.put(put);
                }
                jSONObject.put(str, jSONArray);
            }
        });
        f7458a.put(JSONArray.class, new C2330a() {
            /* renamed from: a */
            public void mo8131a(JSONObject jSONObject, String str, Object obj) {
                throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
            }
        });
    }

    /* renamed from: a */
    public static JSONObject m10767a(CameraEffectArguments cameraEffectArguments) {
        if (cameraEffectArguments == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : cameraEffectArguments.mo8157a()) {
            Object a = cameraEffectArguments.mo8156a(str);
            if (a != null) {
                C2330a aVar = (C2330a) f7458a.get(a.getClass());
                if (aVar != null) {
                    aVar.mo8131a(jSONObject, str, a);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unsupported type: ");
                    sb.append(a.getClass());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        return jSONObject;
    }
}
