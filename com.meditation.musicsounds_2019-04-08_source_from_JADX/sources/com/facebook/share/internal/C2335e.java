package com.facebook.share.internal;

import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.SharePhoto;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.e */
public final class C2335e {

    /* renamed from: com.facebook.share.internal.e$a */
    public interface C2336a {
        /* renamed from: a */
        JSONObject mo8132a(SharePhoto sharePhoto);
    }

    /* renamed from: a */
    public static Object m10811a(Object obj, C2336a aVar) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long)) {
            return obj;
        }
        if (obj instanceof SharePhoto) {
            if (aVar != null) {
                return aVar.mo8132a((SharePhoto) obj);
            }
            return null;
        } else if (obj instanceof ShareOpenGraphObject) {
            return m10814a((ShareOpenGraphObject) obj, aVar);
        } else {
            if (obj instanceof List) {
                return m10812a((List) obj, aVar);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid object found for JSON serialization: ");
            sb.append(obj.toString());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.Object>, for r2v0, types: [java.util.List, java.util.List<java.lang.Object>] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.json.JSONArray m10812a(java.util.List<java.lang.Object> r2, com.facebook.share.internal.C2335e.C2336a r3) {
        /*
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0009:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x001b
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = m10811a(r1, r3)
            r0.put(r1)
            goto L_0x0009
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.C2335e.m10812a(java.util.List, com.facebook.share.internal.e$a):org.json.JSONArray");
    }

    /* renamed from: a */
    public static JSONObject m10813a(ShareOpenGraphAction shareOpenGraphAction, C2336a aVar) {
        JSONObject jSONObject = new JSONObject();
        for (String str : shareOpenGraphAction.mo8301c()) {
            jSONObject.put(str, m10811a(shareOpenGraphAction.mo8298a(str), aVar));
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m10814a(ShareOpenGraphObject shareOpenGraphObject, C2336a aVar) {
        JSONObject jSONObject = new JSONObject();
        for (String str : shareOpenGraphObject.mo8301c()) {
            jSONObject.put(str, m10811a(shareOpenGraphObject.mo8298a(str), aVar));
        }
        return jSONObject;
    }
}
