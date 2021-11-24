package com.facebook.appevents.internal;

import android.content.Context;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.C2202b;
import com.facebook.internal.C2240r;
import com.facebook.internal.C2258x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class AppEventsLoggerUtility {

    /* renamed from: a */
    private static final Map<GraphAPIActivityType, String> f7037a = new HashMap<GraphAPIActivityType, String>() {
        {
            put(GraphAPIActivityType.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL");
            put(GraphAPIActivityType.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS");
        }
    };

    public enum GraphAPIActivityType {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    /* renamed from: a */
    public static JSONObject m9998a(GraphAPIActivityType graphAPIActivityType, C2202b bVar, String str, boolean z, Context context) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f7037a.get(graphAPIActivityType));
        String e = AppEventsLogger.m9952e();
        if (e != null) {
            jSONObject.put("app_user_id", e);
        }
        C2258x.m10388a(jSONObject, bVar, str, z);
        try {
            C2258x.m10387a(jSONObject, context);
        } catch (Exception e2) {
            C2240r.m10259a(LoggingBehavior.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e2.toString());
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
