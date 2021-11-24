package com.facebook.internal;

import android.content.Intent;
import android.util.Log;
import com.facebook.C2177c;
import com.facebook.C2189f;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class CallbackManagerImpl implements C2177c {

    /* renamed from: a */
    private static final String f7145a = "CallbackManagerImpl";

    /* renamed from: b */
    private static Map<Integer, C2200a> f7146b = new HashMap();

    /* renamed from: c */
    private Map<Integer, C2200a> f7147c = new HashMap();

    public enum RequestCodeOffset {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        InAppPurchase(9);
        
        private final int offset;

        private RequestCodeOffset(int i) {
            this.offset = i;
        }

        public int toRequestCode() {
            return C2189f.m10100n() + this.offset;
        }
    }

    /* renamed from: com.facebook.internal.CallbackManagerImpl$a */
    public interface C2200a {
        /* renamed from: a */
        boolean mo7800a(int i, Intent intent);
    }

    /* renamed from: a */
    private static synchronized C2200a m10135a(Integer num) {
        C2200a aVar;
        synchronized (CallbackManagerImpl.class) {
            aVar = (C2200a) f7146b.get(num);
        }
        return aVar;
    }

    /* renamed from: a */
    public static synchronized void m10136a(int i, C2200a aVar) {
        synchronized (CallbackManagerImpl.class) {
            C2264y.m10422a((Object) aVar, "callback");
            if (!f7146b.containsKey(Integer.valueOf(i))) {
                f7146b.put(Integer.valueOf(i), aVar);
            }
        }
    }

    /* renamed from: a */
    private static boolean m10137a(Intent intent) {
        boolean z = false;
        if (intent != null) {
            String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
            if (stringExtra != null) {
                try {
                    JSONObject jSONObject = new JSONObject(stringExtra);
                    if (jSONObject.has("orderId") && jSONObject.has("packageName") && jSONObject.has("productId") && jSONObject.has("purchaseTime") && jSONObject.has("purchaseState") && jSONObject.has("developerPayload") && jSONObject.has("purchaseToken")) {
                        z = true;
                    }
                    return z;
                } catch (JSONException e) {
                    Log.e(f7145a, "Error parsing intent data.", e);
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m10138b(int i, int i2, Intent intent) {
        C2200a a = m10135a(Integer.valueOf(i));
        if (a != null) {
            return a.mo7800a(i2, intent);
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo7741a(int i, int i2, Intent intent) {
        if (m10137a(intent)) {
            i = RequestCodeOffset.InAppPurchase.toRequestCode();
        }
        C2200a aVar = (C2200a) this.f7147c.get(Integer.valueOf(i));
        return aVar != null ? aVar.mo7800a(i2, intent) : m10138b(i, i2, intent);
    }

    /* renamed from: b */
    public void mo7798b(int i, C2200a aVar) {
        C2264y.m10422a((Object) aVar, "callback");
        this.f7147c.put(Integer.valueOf(i), aVar);
    }
}
