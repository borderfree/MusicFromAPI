package com.facebook.appevents.internal;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.facebook.C2189f;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.C2230m;
import com.facebook.internal.C2232n;
import com.facebook.internal.C2258x;
import com.facebook.internal.C2264y;
import java.math.BigDecimal;
import java.util.Currency;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.appevents.internal.c */
public class C2161c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f7059a = C2161c.class.getCanonicalName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static Object f7060b;

    /* renamed from: a */
    public static void m10020a() {
        Context f = C2189f.m10092f();
        String j = C2189f.m10096j();
        boolean m = C2189f.m10099m();
        C2264y.m10422a((Object) f, "context");
        if (!m) {
            return;
        }
        if (f instanceof Application) {
            AppEventsLogger.m9942a((Application) f, j);
        } else {
            Log.w(f7059a, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
        }
    }

    /* renamed from: a */
    public static void m10021a(String str, long j) {
        Context f = C2189f.m10092f();
        String j2 = C2189f.m10096j();
        C2264y.m10422a((Object) f, "context");
        C2230m a = C2232n.m10237a(j2, false);
        if (a != null && a.mo7850d() && j > 0) {
            AppEventsLogger a2 = AppEventsLogger.m9940a(f);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_aa_time_spent_view_name", str);
            a2.mo7681a("fb_aa_time_spent_on_view", (double) j, bundle);
        }
    }

    /* renamed from: a */
    public static boolean m10022a(final Context context, int i, Intent intent) {
        if (intent == null || !m10023b()) {
            return false;
        }
        final String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
        if (i == -1) {
            C21621 r3 = new ServiceConnection() {
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    C2161c.f7060b = C2164e.m10027a(context, iBinder);
                    try {
                        JSONObject jSONObject = new JSONObject(stringExtra);
                        String string = jSONObject.getString("productId");
                        String a = C2164e.m10028a(context, string, C2161c.f7060b, jSONObject.has("autoRenewing"));
                        if (a.equals("")) {
                            context.unbindService(this);
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject(a);
                        AppEventsLogger a2 = AppEventsLogger.m9940a(context);
                        Bundle bundle = new Bundle(1);
                        bundle.putCharSequence("fb_iap_product_id", string);
                        bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
                        bundle.putCharSequence("fb_iap_purchase_state", jSONObject.getString("purchaseState"));
                        bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
                        bundle.putCharSequence("fb_iap_package_name", jSONObject.getString("packageName"));
                        bundle.putCharSequence("fb_iap_product_type", jSONObject2.getString("type"));
                        bundle.putCharSequence("fb_iap_product_title", jSONObject2.getString("title"));
                        bundle.putCharSequence("fb_iap_product_description", jSONObject2.getString("description"));
                        bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                        bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                        bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                        bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                        bundle.putCharSequence("fb_intro_price_cycles", jSONObject2.optString("introductoryPriceCycles"));
                        double d = (double) jSONObject2.getLong("price_amount_micros");
                        Double.isNaN(d);
                        a2.mo7684a(new BigDecimal(d / 1000000.0d), Currency.getInstance(jSONObject2.getString("price_currency_code")), bundle);
                        context.unbindService(this);
                    } catch (JSONException e) {
                        Log.e(C2161c.f7059a, "Error parsing in-app purchase data.", e);
                    } catch (Throwable th) {
                        context.unbindService(this);
                        throw th;
                    }
                }

                public void onServiceDisconnected(ComponentName componentName) {
                    C2161c.f7060b = null;
                    C2258x.m10384a(C2161c.f7059a, "In-app billing service disconnected");
                }
            };
            Intent intent2 = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent2.setPackage("com.android.vending");
            context.bindService(intent2, r3, 1);
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m10023b() {
        C2230m a = C2232n.m10235a(C2189f.m10096j());
        boolean z = false;
        if (a == null) {
            return false;
        }
        if (C2189f.m10099m() && a.mo7854h()) {
            z = true;
        }
        return z;
    }
}
