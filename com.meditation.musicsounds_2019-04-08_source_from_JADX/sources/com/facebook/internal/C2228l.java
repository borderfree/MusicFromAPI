package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.l */
public class C2228l extends C2265z {

    /* renamed from: a */
    private static final String f7187a = "com.facebook.internal.l";

    /* renamed from: b */
    private boolean f7188b;

    private C2228l(Context context, String str, String str2) {
        super(context, str);
        mo7892b(str2);
    }

    /* renamed from: a */
    public static C2228l m10217a(Context context, String str, String str2) {
        C2265z.m10439a(context);
        return new C2228l(context, str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bundle mo7844a(String str) {
        Bundle b = C2258x.m10394b(Uri.parse(str).getQuery());
        String string = b.getString("bridge_args");
        b.remove("bridge_args");
        if (!C2258x.m10392a(string)) {
            try {
                b.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", C2207d.m10166a(new JSONObject(string)));
            } catch (JSONException e) {
                C2258x.m10385a(f7187a, "Unable to parse bridge_args JSON", (Throwable) e);
            }
        }
        String string2 = b.getString("method_results");
        b.remove("method_results");
        if (!C2258x.m10392a(string2)) {
            if (C2258x.m10392a(string2)) {
                string2 = "{}";
            }
            try {
                b.putBundle("com.facebook.platform.protocol.RESULT_ARGS", C2207d.m10166a(new JSONObject(string2)));
            } catch (JSONException e2) {
                C2258x.m10385a(f7187a, "Unable to parse bridge_args JSON", (Throwable) e2);
            }
        }
        b.remove("version");
        b.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", C2244t.m10288a());
        return b;
    }

    public void cancel() {
        WebView d = mo7895d();
        if (!mo7894c() || mo7893b() || d == null || !d.isShown()) {
            super.cancel();
        } else if (!this.f7188b) {
            this.f7188b = true;
            StringBuilder sb = new StringBuilder();
            sb.append("javascript:");
            sb.append("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            d.loadUrl(sb.toString());
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                public void run() {
                    C2228l.super.cancel();
                }
            }, 1500);
        }
    }
}
