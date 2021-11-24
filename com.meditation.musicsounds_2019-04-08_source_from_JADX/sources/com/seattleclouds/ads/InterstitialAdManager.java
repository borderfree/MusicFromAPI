package com.seattleclouds.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.InterstitialAd;
import com.seattleclouds.App;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.SCPageFragmentActivity;
import com.seattleclouds.ads.p155a.C5245a;
import com.seattleclouds.ads.p155a.C5246b;
import com.seattleclouds.util.C6592al;

public class InterstitialAdManager {
    private static final String TAG = "InterstitialAdManager";
    /* access modifiers changed from: private */
    public static InterstitialAd interstitialAdMob;
    /* access modifiers changed from: private */
    public static InterstitialAd interstitialDFP;
    private static InterstitialAdManager manager;
    /* access modifiers changed from: private */
    public AdListener adMobListener = new AdListener() {
        public void onAdClosed() {
            InterstitialAdManager.interstitialAdMob = InterstitialAdManager.this.createAndLoadInterstitial(InterstitialAdManager.this.mAppContext, App.f18501c.mo16962i());
            InterstitialAdManager.interstitialAdMob.setAdListener(InterstitialAdManager.this.adMobListener);
            super.onAdClosed();
        }

        public void onAdFailedToLoad(int i) {
            String str = InterstitialAdManager.TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Error loading AdMob Interstitial ad: ");
            sb.append(i);
            Log.w(str, sb.toString());
        }
    };
    /* access modifiers changed from: private */
    public AdListener dfpAdListener = new AdListener() {
        public void onAdClosed() {
            InterstitialAdManager.interstitialDFP = InterstitialAdManager.this.createAndLoadInterstitial(InterstitialAdManager.this.mAppContext, App.f18501c.mo16968k());
            InterstitialAdManager.interstitialDFP.setAdListener(InterstitialAdManager.this.dfpAdListener);
            super.onAdClosed();
        }

        public void onAdFailedToLoad(int i) {
            String str = InterstitialAdManager.TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Error loading DFP Interstitial ad: ");
            sb.append(i);
            Log.w(str, sb.toString());
        }
    };
    /* access modifiers changed from: private */
    public Context mAppContext;

    private InterstitialAdManager(Context context) {
        this.mAppContext = context.getApplicationContext();
    }

    /* access modifiers changed from: private */
    public InterstitialAd createAndLoadInterstitial(Context context, String str) {
        InterstitialAd interstitialAd = new InterstitialAd(context);
        interstitialAd.setAdUnitId(str);
        interstitialAd.loadAd(new Builder().build());
        return interstitialAd;
    }

    public static InterstitialAdManager getInstance(Context context) {
        if (context != null) {
            if (manager == null) {
                manager = new InterstitialAdManager(context);
            } else {
                manager.mAppContext = context.getApplicationContext();
            }
            return manager;
        }
        throw new IllegalArgumentException();
    }

    public void deInitAirPush() {
        C5246b.m26187a();
    }

    public void displayInterstitial(Activity activity) {
        Bundle bundle;
        if (activity != null) {
            if (activity instanceof SCPageFragmentActivity) {
                FragmentInfo fragmentInfo = (FragmentInfo) activity.getIntent().getExtras().getParcelable("ARG_PAGE_FRAGMENT_INFO");
                bundle = fragmentInfo != null ? fragmentInfo.mo16869b() : null;
            } else {
                bundle = activity.getIntent().getExtras();
            }
            displayInterstitial(activity, bundle);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0086, code lost:
        r5.show();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void displayInterstitial(android.app.Activity r5, android.os.Bundle r6) {
        /*
            r4 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            r0 = 0
            java.lang.ClassLoader r1 = r5.getClassLoader()     // Catch:{ BadParcelableException -> 0x0012 }
            r6.setClassLoader(r1)     // Catch:{ BadParcelableException -> 0x0012 }
            java.lang.String r1 = "PAGE_ID"
            java.lang.String r1 = r6.getString(r1)     // Catch:{ BadParcelableException -> 0x0012 }
            goto L_0x001b
        L_0x0012:
            r1 = move-exception
            java.lang.String r2 = "InterstitialAdManager"
            java.lang.String r3 = "getString(SCPage.PAGE_ID)"
            android.util.Log.d(r2, r3, r1)
            r1 = r0
        L_0x001b:
            if (r1 != 0) goto L_0x001e
            return
        L_0x001e:
            com.seattleclouds.a r2 = com.seattleclouds.App.f18501c
            java.util.Map r2 = r2.mo16902D()
            java.lang.Object r1 = r2.get(r1)
            com.seattleclouds.aa r1 = (com.seattleclouds.C5230aa) r1
            if (r1 != 0) goto L_0x002d
            return
        L_0x002d:
            int r1 = r1.mo17191u()
            r2 = 100
            if (r1 != r2) goto L_0x003b
            com.seattleclouds.a r1 = com.seattleclouds.App.f18501c
            int r1 = r1.mo16989x()
        L_0x003b:
            r2 = 0
            switch(r1) {
                case 1: goto L_0x0078;
                case 2: goto L_0x0069;
                case 3: goto L_0x003f;
                case 4: goto L_0x005f;
                case 5: goto L_0x0055;
                case 6: goto L_0x0045;
                case 7: goto L_0x0040;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x0089
        L_0x0040:
            java.lang.String r5 = "com.seattleclouds.ads.FBAdUtilInterstitial"
            java.lang.String r6 = "showAdFacebookInterstitial"
            goto L_0x0049
        L_0x0045:
            java.lang.String r5 = "com.seattleclouds.ads.SkiAdUtilInterstitial"
            java.lang.String r6 = "showAdSkiInterstitial"
        L_0x0049:
            java.lang.Class[] r1 = new java.lang.Class[r2]
            java.lang.reflect.Method r5 = com.seattleclouds.App.m25615a(r5, r6, (java.lang.Class<?>[]) r1)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            com.seattleclouds.App.m25613a(r5, r0, r6)
            goto L_0x0089
        L_0x0055:
            com.seattleclouds.ads.a.a r5 = com.seattleclouds.ads.p155a.C5246b.m26190b()
            if (r5 == 0) goto L_0x0089
            r5.mo17253b()
            goto L_0x0089
        L_0x005f:
            com.seattleclouds.a r0 = com.seattleclouds.App.f18501c
            java.lang.String r0 = r0.mo16982q()
            r4.showRevMob(r5, r6, r0)
            goto L_0x0089
        L_0x0069:
            com.google.android.gms.ads.InterstitialAd r5 = interstitialDFP
            if (r5 == 0) goto L_0x0089
            com.google.android.gms.ads.InterstitialAd r5 = interstitialDFP
            boolean r5 = r5.isLoaded()
            if (r5 == 0) goto L_0x0089
            com.google.android.gms.ads.InterstitialAd r5 = interstitialDFP
            goto L_0x0086
        L_0x0078:
            com.google.android.gms.ads.InterstitialAd r5 = interstitialAdMob
            if (r5 == 0) goto L_0x0089
            com.google.android.gms.ads.InterstitialAd r5 = interstitialAdMob
            boolean r5 = r5.isLoaded()
            if (r5 == 0) goto L_0x0089
            com.google.android.gms.ads.InterstitialAd r5 = interstitialAdMob
        L_0x0086:
            r5.show()
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.ads.InterstitialAdManager.displayInterstitial(android.app.Activity, android.os.Bundle):void");
    }

    public void initAirPush(Activity activity) {
        C5246b.m26188a(activity);
        preloadAirPushInterstitial();
    }

    public void preloadAirPushInterstitial() {
        if (App.f18501c.mo16980o() != 0 && App.f18501c.mo16981p() != null) {
            C5245a b = C5246b.m26190b();
            if (b != null) {
                b.mo17252a();
            }
        }
    }

    public void preloadInterstitial() {
        if (App.f18501c.mo16962i() != null && !App.f18501c.mo16962i().equals("")) {
            interstitialAdMob = createAndLoadInterstitial(this.mAppContext, App.f18501c.mo16962i());
            interstitialAdMob.setAdListener(this.adMobListener);
        }
        if (App.f18501c.mo16968k() != null && !App.f18501c.mo16968k().equals("")) {
            interstitialDFP = createAndLoadInterstitial(this.mAppContext, App.f18501c.mo16968k());
            interstitialDFP.setAdListener(this.dfpAdListener);
        }
        if (!C6592al.m31909b(App.f18501c.mo16984s())) {
            App.m25613a(App.m25615a("com.seattleclouds.ads.SkiAdUtilInterstitial", "createAndLoadSkiInterstitial", (Class<?>[]) new Class[]{Context.class, String.class}), (Object) null, this.mAppContext, App.f18501c.mo16984s());
        }
        if (!C6592al.m31909b(App.f18501c.mo16986u())) {
            App.m25613a(App.m25615a("com.seattleclouds.ads.FBAdUtilInterstitial", "createAndLoadFacebookInterstitial", (Class<?>[]) new Class[]{Context.class, String.class}), (Object) null, this.mAppContext, App.f18501c.mo16986u());
        }
    }

    public void showRevMob(Activity activity, Bundle bundle, String str) {
        App.m25613a(App.m25615a("com.seattleclouds.ads.RevMobUtil", "showRevMob", (Class<?>[]) new Class[]{Activity.class, Bundle.class, String.class}), (Object) null, activity, bundle, str);
    }
}
