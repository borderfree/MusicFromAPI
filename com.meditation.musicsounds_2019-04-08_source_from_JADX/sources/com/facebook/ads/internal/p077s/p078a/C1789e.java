package com.facebook.ads.internal.p077s.p078a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import java.io.IOException;
import java.util.concurrent.Executors;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.facebook.ads.internal.s.a.e */
public class C1789e {

    /* renamed from: a */
    public static volatile C1791a f5831a = C1791a.NOT_INITIALIZED;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static int f5832b = -1;

    /* renamed from: com.facebook.ads.internal.s.a.e$a */
    enum C1791a {
        NOT_INITIALIZED,
        INITIALIZING,
        INITIALIZED
    }

    /* renamed from: a */
    public static int m8882a(XmlPullParser xmlPullParser) {
        while (true) {
            if (xmlPullParser.next() == 1) {
                return 0;
            }
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("uses-sdk")) {
                for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                    if (xmlPullParser.getAttributeName(i).equals("minSdkVersion")) {
                        return Integer.parseInt(xmlPullParser.getAttributeValue(i));
                    }
                }
                continue;
            }
        }
    }

    /* renamed from: a */
    public static void m8883a(Context context) {
        if (!m8884a()) {
            m8888e(context);
        }
    }

    /* renamed from: a */
    public static boolean m8884a() {
        return f5831a == C1791a.INITIALIZED;
    }

    /* renamed from: b */
    public static int m8885b(Context context) {
        if (f5831a == C1791a.NOT_INITIALIZED) {
            m8883a(context);
        }
        return f5832b;
    }

    /* renamed from: c */
    public static int m8886c(Context context) {
        try {
            return m8882a((XmlPullParser) context.getAssets().openXmlResourceParser("AndroidManifest.xml"));
        } catch (IOException | XmlPullParserException unused) {
            return 0;
        }
    }

    /* renamed from: e */
    private static void m8888e(final Context context) {
        if (f5831a == C1791a.NOT_INITIALIZED) {
            f5831a = C1791a.INITIALIZING;
            Executors.newSingleThreadExecutor().execute(new Runnable() {
                public void run() {
                    if (C1789e.f5831a != C1791a.INITIALIZED) {
                        SharedPreferences sharedPreferences = context.getSharedPreferences("FBAdPrefs", 0);
                        int i = sharedPreferences.getInt("AppMinSdkVersion", -1);
                        if (i != -1) {
                            C1789e.f5832b = i;
                        } else {
                            int d = VERSION.SDK_INT >= 24 ? C1789e.m8889f(context) : C1789e.m8886c(context);
                            C1789e.f5832b = d;
                            sharedPreferences.edit().putInt("AppMinSdkVersion", d).commit();
                        }
                        C1789e.f5831a = C1791a.INITIALIZED;
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static int m8889f(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).minSdkVersion;
        } catch (NameNotFoundException unused) {
            return 0;
        }
    }
}
