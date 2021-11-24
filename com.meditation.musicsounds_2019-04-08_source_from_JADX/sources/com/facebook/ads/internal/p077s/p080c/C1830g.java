package com.facebook.ads.internal.p077s.p080c;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import com.facebook.ads.internal.p069k.C1713a;
import com.facebook.ads.internal.settings.C1835a.C1836a;

/* renamed from: com.facebook.ads.internal.s.c.g */
public class C1830g {
    /* renamed from: a */
    private Intent m8989a(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setComponent(null);
        if (VERSION.SDK_INT >= 15) {
            intent.setSelector(null);
        }
        return intent;
    }

    /* renamed from: a */
    public static void m8990a(C1830g gVar, Context context, Uri uri, String str) {
        boolean z = m8992a(uri.getScheme()) && uri.getHost().equals("play.google.com");
        if (uri.getScheme().equals("market") || z) {
            try {
                gVar.mo7104a(context, uri);
                return;
            } catch (C1825c unused) {
            }
        }
        gVar.mo7105a(context, uri, str);
    }

    /* renamed from: a */
    private boolean m8991a(Context context) {
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/")), 0)) {
            if (resolveInfo.activityInfo.applicationInfo.packageName.equals("com.android.vending")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m8992a(String str) {
        return "http".equalsIgnoreCase(str) || "https".equalsIgnoreCase(str);
    }

    /* renamed from: b */
    private void m8993b(Context context, Uri uri) {
        context.startActivity(m8995c(context, uri));
    }

    /* renamed from: b */
    private void m8994b(Context context, Uri uri, String str) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.facebook.ads.AudienceNetworkActivity");
        intent.addFlags(268435456);
        intent.putExtra("viewType", C1836a.BROWSER);
        intent.putExtra("browserURL", uri.toString());
        intent.putExtra("clientToken", str);
        intent.putExtra("handlerTime", System.currentTimeMillis());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            intent.setClassName(context.getPackageName(), "com.facebook.ads.InterstitialAdActivity");
            try {
                context.startActivity(intent);
            } catch (ActivityNotFoundException unused2) {
                m8993b(context, uri);
            }
        }
    }

    /* renamed from: c */
    private Intent m8995c(Context context, Uri uri) {
        Intent a = m8989a(uri);
        a.addCategory("android.intent.category.BROWSABLE");
        a.addFlags(268435456);
        a.putExtra("com.android.browser.application_id", context.getPackageName());
        a.putExtra("create_new_tab", false);
        return a;
    }

    /* renamed from: a */
    public void mo7104a(Context context, Uri uri) {
        if (m8991a(context)) {
            Intent c = m8995c(context, uri);
            c.setPackage("com.android.vending");
            context.startActivity(c);
            return;
        }
        throw new C1825c();
    }

    /* renamed from: a */
    public void mo7105a(Context context, Uri uri, String str) {
        if (!m8992a(uri.getScheme()) || !C1713a.m8577h(context)) {
            m8993b(context, uri);
        } else {
            m8994b(context, uri, str);
        }
    }
}
