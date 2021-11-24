package com.google.android.gms.ads.internal.gmsg;

import android.os.Bundle;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3643iy;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@C3464ci
public final class zza implements zzv<Object> {

    /* renamed from: a */
    private final zzb f10002a;

    public zza(zzb zzb) {
        this.f10002a = zzb;
    }

    /* renamed from: a */
    private static Bundle m13567a(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            Bundle bundle = new Bundle();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                Object obj = jSONObject.get(str2);
                if (obj != null) {
                    if (obj instanceof Boolean) {
                        bundle.putBoolean(str2, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str2, ((Double) obj).doubleValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str2, ((Integer) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str2, ((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        bundle.putString(str2, (String) obj);
                    } else {
                        String str3 = "Unsupported type for key:";
                        String valueOf = String.valueOf(str2);
                        C3643iy.m19178e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                    }
                }
            }
            return bundle;
        } catch (JSONException e) {
            C3643iy.m19173b("Failed to convert ad metadata to JSON.", e);
            return null;
        }
    }

    public final void zza(Object obj, Map<String, String> map) {
        if (this.f10002a != null) {
            String str = (String) map.get("name");
            if (str == null) {
                C3643iy.m19176d("Ad metadata with no name parameter.");
                str = "";
            }
            Bundle a = m13567a((String) map.get("info"));
            if (a == null) {
                C3643iy.m19174c("Failed to convert ad metadata to Bundle.");
            } else {
                this.f10002a.zza(str, a);
            }
        }
    }
}
