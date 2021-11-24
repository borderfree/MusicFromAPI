package com.facebook.ads.internal.p058a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.p072o.C1728c;
import com.facebook.ads.internal.p077s.p078a.C1785a;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.a.c */
public class C1628c {

    /* renamed from: a */
    private static final String f5296a = "c";

    /* renamed from: a */
    public static C1627b m8174a(Context context, C1728c cVar, String str, Uri uri, Map<String, String> map) {
        return m8175a(context, cVar, str, uri, map, false);
    }

    /* renamed from: a */
    public static C1627b m8175a(Context context, C1728c cVar, String str, Uri uri, Map<String, String> map, boolean z) {
        if (uri == null) {
            return null;
        }
        String authority = uri.getAuthority();
        String queryParameter = uri.getQueryParameter("video_url");
        if (!TextUtils.isEmpty(uri.getQueryParameter("data"))) {
            try {
                JSONObject jSONObject = new JSONObject(uri.getQueryParameter("data"));
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str2 = (String) keys.next();
                    map.put(str2, jSONObject.getString(str2));
                }
            } catch (JSONException e) {
                Log.w(f5296a, "Unable to parse json data in AdActionFactory.", e);
            }
        }
        C1637l a = C1637l.m8203a(cVar, C1785a.m8872a());
        char c = 65535;
        int hashCode = authority.hashCode();
        if (hashCode != -1458789996) {
            if (hashCode != 109770977) {
                if (hashCode == 1546100943 && authority.equals("open_link")) {
                    c = 1;
                }
            } else if (authority.equals("store")) {
                c = 0;
            }
        } else if (authority.equals("passthrough")) {
            c = 2;
        }
        switch (c) {
            case 0:
                if (queryParameter != null) {
                    return null;
                }
                C1631f fVar = new C1631f(context, cVar, str, uri, map, a, z);
                return fVar;
            case 1:
                C1634i iVar = new C1634i(context, cVar, str, uri, map, a);
                return iVar;
            case 2:
                C1635j jVar = new C1635j(context, cVar, str, uri, map);
                return jVar;
            default:
                return new C1636k(context, cVar, str, uri);
        }
    }

    /* renamed from: a */
    public static boolean m8176a(String str) {
        return "store".equalsIgnoreCase(str) || "open_link".equalsIgnoreCase(str);
    }
}
