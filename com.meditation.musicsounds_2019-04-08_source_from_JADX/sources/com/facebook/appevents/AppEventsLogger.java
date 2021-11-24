package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C2189f;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.internal.C2154a;
import com.facebook.internal.C2232n;
import com.facebook.internal.C2240r;
import com.facebook.internal.C2258x;
import com.facebook.internal.C2264y;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

public class AppEventsLogger {

    /* renamed from: a */
    private static final String f6996a = AppEventsLogger.class.getCanonicalName();

    /* renamed from: d */
    private static ScheduledThreadPoolExecutor f6997d;

    /* renamed from: e */
    private static FlushBehavior f6998e = FlushBehavior.AUTO;

    /* renamed from: f */
    private static Object f6999f = new Object();

    /* renamed from: g */
    private static String f7000g;

    /* renamed from: h */
    private static boolean f7001h;

    /* renamed from: i */
    private static String f7002i;

    /* renamed from: b */
    private final String f7003b;

    /* renamed from: c */
    private final AccessTokenAppIdPair f7004c;

    public enum FlushBehavior {
        AUTO,
        EXPLICIT_ONLY
    }

    private AppEventsLogger(Context context, String str, AccessToken accessToken) {
        this(C2258x.m10400c(context), str, accessToken);
    }

    protected AppEventsLogger(String str, String str2, AccessToken accessToken) {
        AccessTokenAppIdPair accessTokenAppIdPair;
        C2264y.m10419a();
        this.f7003b = str;
        if (accessToken == null) {
            accessToken = AccessToken.m7985a();
        }
        if (accessToken == null || (str2 != null && !str2.equals(accessToken.mo6526h()))) {
            if (str2 == null) {
                str2 = C2258x.m10363a(C2189f.m10092f());
            }
            accessTokenAppIdPair = new AccessTokenAppIdPair(null, str2);
        } else {
            accessTokenAppIdPair = new AccessTokenAppIdPair(accessToken);
        }
        this.f7004c = accessTokenAppIdPair;
        m9955h();
    }

    /* renamed from: a */
    public static FlushBehavior m9939a() {
        FlushBehavior flushBehavior;
        synchronized (f6999f) {
            flushBehavior = f6998e;
        }
        return flushBehavior;
    }

    /* renamed from: a */
    public static AppEventsLogger m9940a(Context context) {
        return new AppEventsLogger(context, (String) null, (AccessToken) null);
    }

    /* renamed from: a */
    public static void m9941a(Application application) {
        m9942a(application, (String) null);
    }

    /* renamed from: a */
    public static void m9942a(Application application, String str) {
        if (C2189f.m10083a()) {
            C2139a.m9961a();
            if (str == null) {
                str = C2189f.m10096j();
            }
            C2189f.m10082a((Context) application, str);
            C2154a.m10003a(application, str);
            return;
        }
        throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
    }

    /* renamed from: a */
    private static void m9943a(Context context, AppEvent appEvent, AccessTokenAppIdPair accessTokenAppIdPair) {
        C2142c.m9977a(accessTokenAppIdPair, appEvent);
        if (!appEvent.getIsImplicit() && !f7001h) {
            if (appEvent.getName() == "fb_mobile_activate_app") {
                f7001h = true;
            } else {
                C2240r.m10258a(LoggingBehavior.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }
    }

    /* renamed from: a */
    public static void m9944a(Context context, String str) {
        f6997d.execute(new Runnable(new AppEventsLogger(context, str, (AccessToken) null)) {

            /* renamed from: a */
            final /* synthetic */ AppEventsLogger f7005a;

            {
                this.f7005a = r1;
            }

            public void run() {
                Bundle bundle = new Bundle();
                try {
                    Class.forName("com.facebook.core.Core");
                    bundle.putInt("core_lib_included", 1);
                } catch (ClassNotFoundException unused) {
                }
                try {
                    Class.forName("com.facebook.login.Login");
                    bundle.putInt("login_lib_included", 1);
                } catch (ClassNotFoundException unused2) {
                }
                try {
                    Class.forName("com.facebook.share.Share");
                    bundle.putInt("share_lib_included", 1);
                } catch (ClassNotFoundException unused3) {
                }
                try {
                    Class.forName("com.facebook.places.Places");
                    bundle.putInt("places_lib_included", 1);
                } catch (ClassNotFoundException unused4) {
                }
                try {
                    Class.forName("com.facebook.messenger.Messenger");
                    bundle.putInt("messenger_lib_included", 1);
                } catch (ClassNotFoundException unused5) {
                }
                try {
                    Class.forName("com.facebook.applinks.AppLinks");
                    bundle.putInt("applinks_lib_included", 1);
                } catch (ClassNotFoundException unused6) {
                }
                try {
                    Class.forName("com.facebook.all.All");
                    bundle.putInt("all_lib_included", 1);
                } catch (ClassNotFoundException unused7) {
                }
                this.f7005a.mo7683a("fb_sdk_initialize", (Double) null, bundle);
            }
        });
    }

    /* renamed from: a */
    private static void m9945a(String str) {
        C2240r.m10258a(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", str);
    }

    /* renamed from: a */
    private void m9946a(String str, Double d, Bundle bundle, boolean z, UUID uuid) {
        Object[] objArr;
        String str2;
        String str3;
        LoggingBehavior loggingBehavior;
        try {
            AppEvent appEvent = new AppEvent(this.f7003b, str, d, bundle, z, uuid);
            m9943a(C2189f.m10092f(), appEvent, this.f7004c);
            return;
        } catch (JSONException e) {
            loggingBehavior = LoggingBehavior.APP_EVENTS;
            str3 = "AppEvents";
            str2 = "JSON encoding for app event failed: '%s'";
            objArr = new Object[]{e.toString()};
        } catch (FacebookException e2) {
            loggingBehavior = LoggingBehavior.APP_EVENTS;
            str3 = "AppEvents";
            str2 = "Invalid app event: %s";
            objArr = new Object[]{e2.toString()};
        }
        C2240r.m10259a(loggingBehavior, str3, str2, objArr);
    }

    /* renamed from: a */
    private void m9947a(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z) {
        if (bigDecimal == null) {
            m9945a("purchaseAmount cannot be null");
        } else if (currency == null) {
            m9945a("currency cannot be null");
        } else {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            m9946a("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, z, C2154a.m10000a());
            m9953f();
        }
    }

    /* renamed from: b */
    public static AppEventsLogger m9948b(Context context, String str) {
        return new AppEventsLogger(context, str, (AccessToken) null);
    }

    /* renamed from: b */
    public static String m9949b(Context context) {
        if (f7000g == null) {
            synchronized (f6999f) {
                if (f7000g == null) {
                    f7000g = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                    if (f7000g == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("XZ");
                        sb.append(UUID.randomUUID().toString());
                        f7000g = sb.toString();
                        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", f7000g).apply();
                    }
                }
            }
        }
        return f7000g;
    }

    /* renamed from: c */
    public static void m9950c() {
        C2142c.m9975a();
    }

    /* renamed from: d */
    static String m9951d() {
        String str;
        synchronized (f6999f) {
            str = f7002i;
        }
        return str;
    }

    /* renamed from: e */
    public static String m9952e() {
        return C2139a.m9962b();
    }

    /* renamed from: f */
    static void m9953f() {
        if (m9939a() != FlushBehavior.EXPLICIT_ONLY) {
            C2142c.m9978a(FlushReason.EAGER_FLUSHING_EVENT);
        }
    }

    /* renamed from: g */
    static Executor m9954g() {
        if (f6997d == null) {
            m9955h();
        }
        return f6997d;
    }

    /* renamed from: h */
    private static void m9955h() {
        synchronized (f6999f) {
            if (f6997d == null) {
                f6997d = new ScheduledThreadPoolExecutor(1);
                f6997d.scheduleAtFixedRate(new Runnable() {
                    public void run() {
                        HashSet<String> hashSet = new HashSet<>();
                        for (AccessTokenAppIdPair applicationId : C2142c.m9979b()) {
                            hashSet.add(applicationId.getApplicationId());
                        }
                        for (String a : hashSet) {
                            C2232n.m10237a(a, true);
                        }
                    }
                }, 0, 86400, TimeUnit.SECONDS);
            }
        }
    }

    /* renamed from: a */
    public void mo7681a(String str, double d, Bundle bundle) {
        m9946a(str, Double.valueOf(d), bundle, false, C2154a.m10000a());
    }

    /* renamed from: a */
    public void mo7682a(String str, Bundle bundle) {
        m9946a(str, null, bundle, false, C2154a.m10000a());
    }

    /* renamed from: a */
    public void mo7683a(String str, Double d, Bundle bundle) {
        m9946a(str, d, bundle, true, C2154a.m10000a());
    }

    /* renamed from: a */
    public void mo7684a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        m9947a(bigDecimal, currency, bundle, true);
    }

    /* renamed from: b */
    public void mo7685b() {
        C2142c.m9978a(FlushReason.EXPLICIT);
    }
}
