package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.d */
public class C2207d {

    /* renamed from: a */
    private static final Map<Class<?>, C2215a> f7167a = new HashMap();

    /* renamed from: com.facebook.internal.d$a */
    public interface C2215a {
        /* renamed from: a */
        void mo7825a(Bundle bundle, String str, Object obj);
    }

    static {
        f7167a.put(Boolean.class, new C2215a() {
            /* renamed from: a */
            public void mo7825a(Bundle bundle, String str, Object obj) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            }
        });
        f7167a.put(Integer.class, new C2215a() {
            /* renamed from: a */
            public void mo7825a(Bundle bundle, String str, Object obj) {
                bundle.putInt(str, ((Integer) obj).intValue());
            }
        });
        f7167a.put(Long.class, new C2215a() {
            /* renamed from: a */
            public void mo7825a(Bundle bundle, String str, Object obj) {
                bundle.putLong(str, ((Long) obj).longValue());
            }
        });
        f7167a.put(Double.class, new C2215a() {
            /* renamed from: a */
            public void mo7825a(Bundle bundle, String str, Object obj) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            }
        });
        f7167a.put(String.class, new C2215a() {
            /* renamed from: a */
            public void mo7825a(Bundle bundle, String str, Object obj) {
                bundle.putString(str, (String) obj);
            }
        });
        f7167a.put(String[].class, new C2215a() {
            /* renamed from: a */
            public void mo7825a(Bundle bundle, String str, Object obj) {
                throw new IllegalArgumentException("Unexpected type from JSON");
            }
        });
        f7167a.put(JSONArray.class, new C2215a() {
            /* renamed from: a */
            public void mo7825a(Bundle bundle, String str, Object obj) {
                JSONArray jSONArray = (JSONArray) obj;
                ArrayList arrayList = new ArrayList();
                if (jSONArray.length() == 0) {
                    bundle.putStringArrayList(str, arrayList);
                    return;
                }
                int i = 0;
                while (i < jSONArray.length()) {
                    Object obj2 = jSONArray.get(i);
                    if (obj2 instanceof String) {
                        arrayList.add((String) obj2);
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unexpected type in an array: ");
                        sb.append(obj2.getClass());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                bundle.putStringArrayList(str, arrayList);
            }
        });
    }

    /* renamed from: a */
    public static Bundle m10166a(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            Object obj = jSONObject.get(str);
            if (!(obj == null || obj == JSONObject.NULL)) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(str, m10166a((JSONObject) obj));
                } else {
                    C2215a aVar = (C2215a) f7167a.get(obj.getClass());
                    if (aVar != null) {
                        aVar.mo7825a(bundle, str, obj);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unsupported type: ");
                        sb.append(obj.getClass());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
        }
        return bundle;
    }
}
