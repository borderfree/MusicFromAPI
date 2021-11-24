package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3643iy;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3464ci
public final class zzaf implements zzv<Object> {

    /* renamed from: a */
    private final Object f10023a = new Object();
    @GuardedBy("mLock")

    /* renamed from: b */
    private final Map<String, zzag> f10024b = new HashMap();

    public final void zza(Object obj, Map<String, String> map) {
        String str;
        String str2 = (String) map.get("id");
        String str3 = (String) map.get("fail");
        String str4 = (String) map.get("fail_reason");
        String str5 = (String) map.get("fail_stack");
        String str6 = (String) map.get("result");
        if (TextUtils.isEmpty(str5)) {
            str4 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str5)) {
            str = "";
        } else {
            String str7 = "\n";
            String valueOf = String.valueOf(str5);
            str = valueOf.length() != 0 ? str7.concat(valueOf) : new String(str7);
        }
        synchronized (this.f10023a) {
            zzag zzag = (zzag) this.f10024b.remove(str2);
            if (zzag == null) {
                String str8 = "Received result for unexpected method invocation: ";
                String valueOf2 = String.valueOf(str2);
                C3643iy.m19178e(valueOf2.length() != 0 ? str8.concat(valueOf2) : new String(str8));
            } else if (!TextUtils.isEmpty(str3)) {
                String valueOf3 = String.valueOf(str4);
                String valueOf4 = String.valueOf(str);
                zzag.zzau(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            } else if (str6 == null) {
                zzag.zzd(null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str6);
                    if (C3643iy.m18781a()) {
                        String str9 = "Result GMSG: ";
                        String valueOf5 = String.valueOf(jSONObject.toString(2));
                        C3643iy.m18780a(valueOf5.length() != 0 ? str9.concat(valueOf5) : new String(str9));
                    }
                    zzag.zzd(jSONObject);
                } catch (JSONException e) {
                    zzag.zzau(e.getMessage());
                }
            }
        }
    }

    public final void zza(String str, zzag zzag) {
        synchronized (this.f10023a) {
            this.f10024b.put(str, zzag);
        }
    }
}
