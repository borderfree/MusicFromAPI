package com.seattleclouds.ads;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.seattleclouds.App;
import com.seattleclouds.C5230aa;
import com.seattleclouds.C5326d;
import com.seattleclouds.SCPageFragmentActivity;
import com.seattleclouds.ads.C5254c.C5259b;
import com.seattleclouds.ads.p155a.C5246b;
import com.seattleclouds.modules.search.SearchActivity;
import com.seattleclouds.util.C6592al;

public class AdManager {
    private static final boolean DEBUG = false;
    private static final String TAG = "AdManager";
    private AdView mAdMobAdViewBottom;
    private AdView mAdMobAdViewTop;
    private View mAirPushBannerBottom;
    private View mAirPushBannerTop;
    /* access modifiers changed from: private */
    public C5254c mBillboardAdViewBottom;
    /* access modifiers changed from: private */
    public C5254c mBillboardAdViewTop;
    /* access modifiers changed from: private */
    public Activity mCurrentActivity;
    /* access modifiers changed from: private */
    public LinearLayout mCurrentLayout;
    private PublisherAdView mDfpAdViewBottom;
    private PublisherAdView mDfpAdViewTop;
    private boolean mIsBillboardBottomPositionAvailable;
    private boolean mIsBillboardTopPositionAvailable;
    /* access modifiers changed from: private */
    public C5230aa mPage;
    private C5261e mSCAdViewBottom;
    private C5261e mSCAdViewTop;

    private static AdView addAdMobAdView(Activity activity, LinearLayout linearLayout, String str, int i) {
        final AdView adView = new AdView(activity);
        adView.setAdUnitId(str);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdListener(new AdListener() {
            public void onAdFailedToLoad(int i) {
                String str = AdManager.TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("Error loading AdMob ad: ");
                sb.append(i);
                Log.w(str, sb.toString());
                adView.setVisibility(8);
            }
        });
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        if (i == 0) {
            linearLayout.addView(adView, 0, layoutParams);
        } else {
            linearLayout.addView(adView, layoutParams);
        }
        adView.loadAd(getAdmobAdRequest());
        return adView;
    }

    private static PublisherAdView addDFPAdView(Activity activity, LinearLayout linearLayout, String str, int i) {
        final PublisherAdView publisherAdView = new PublisherAdView(activity);
        publisherAdView.setAdUnitId(str);
        publisherAdView.setAdSizes(AdSize.BANNER);
        publisherAdView.setAdListener(new AdListener() {
            public void onAdFailedToLoad(int i) {
                String str = AdManager.TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("Error loading DFP ad: ");
                sb.append(i);
                Log.w(str, sb.toString());
                publisherAdView.setVisibility(8);
            }
        });
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        if (i == 0) {
            linearLayout.addView(publisherAdView, 0, layoutParams);
        } else {
            linearLayout.addView(publisherAdView, layoutParams);
        }
        publisherAdView.loadAd(getDFPAdRequest());
        return publisherAdView;
    }

    private C5254c addMPAdView(Activity activity, LinearLayout linearLayout, int i) {
        C5259b r3;
        C5254c cVar = new C5254c(activity, null);
        if (i == 0) {
            linearLayout.addView(cVar, 0);
            setBillboardTopPositionAvailable(DEBUG);
            r3 = new C5259b() {
                /* renamed from: a */
                public void mo17217a() {
                    if (AdManager.this.mBillboardAdViewTop != null) {
                        AdManager.this.mBillboardAdViewTop.setVisibility(0);
                    }
                }

                /* renamed from: b */
                public void mo17218b() {
                    int i;
                    int i2;
                    if (AdManager.this.mBillboardAdViewTop != null) {
                        AdManager.this.mBillboardAdViewTop.setVisibility(8);
                        ((ViewGroup) AdManager.this.mBillboardAdViewTop.getParent()).removeView(AdManager.this.mBillboardAdViewTop);
                        AdManager.this.mBillboardAdViewTop = null;
                        AdManager.this.setBillboardTopPositionAvailable(true);
                    }
                    if (AdManager.this.mPage == null) {
                        i2 = App.f18501c.mo16987v();
                        i = App.f18501c.mo16988w();
                    } else {
                        i2 = AdManager.this.mPage.mo17184s();
                        i = AdManager.this.mPage.mo17187t();
                    }
                    AdManager.this.prepareAdViews(AdManager.this.mCurrentActivity, AdManager.this.mCurrentLayout, i2, i);
                }

                public void onClick() {
                    if (AdManager.this.mBillboardAdViewTop != null) {
                        AdManager.this.mBillboardAdViewTop.setVisibility(8);
                    }
                }
            };
        } else {
            linearLayout.addView(cVar);
            setBillboardBottomPositionAvailable(DEBUG);
            r3 = new C5259b() {
                /* renamed from: a */
                public void mo17217a() {
                    if (AdManager.this.mBillboardAdViewBottom != null) {
                        AdManager.this.mBillboardAdViewBottom.setVisibility(0);
                    }
                }

                /* renamed from: b */
                public void mo17218b() {
                    int i;
                    int i2;
                    if (AdManager.this.mBillboardAdViewBottom != null) {
                        AdManager.this.mBillboardAdViewBottom.setVisibility(8);
                        ((ViewGroup) AdManager.this.mBillboardAdViewBottom.getParent()).removeView(AdManager.this.mBillboardAdViewBottom);
                        AdManager.this.mBillboardAdViewBottom = null;
                        AdManager.this.setBillboardBottomPositionAvailable(true);
                    }
                    if (AdManager.this.mPage == null) {
                        i2 = App.f18501c.mo16987v();
                        i = App.f18501c.mo16988w();
                    } else {
                        i2 = AdManager.this.mPage.mo17184s();
                        i = AdManager.this.mPage.mo17187t();
                    }
                    AdManager.this.prepareAdViews(AdManager.this.mCurrentActivity, AdManager.this.mCurrentLayout, i2, i);
                }

                public void onClick() {
                    if (AdManager.this.mBillboardAdViewBottom != null) {
                        AdManager.this.mBillboardAdViewBottom.setVisibility(8);
                    }
                }
            };
        }
        cVar.setAdListener(r3);
        cVar.mo17262b();
        return cVar;
    }

    private C5261e addSCAdView(Activity activity, LinearLayout linearLayout, int i) {
        C5261e eVar = new C5261e(activity);
        if (i == 0) {
            linearLayout.addView(eVar, 0);
        } else {
            linearLayout.addView(eVar);
        }
        eVar.mo17274a();
        return eVar;
    }

    private static AdRequest getAdmobAdRequest() {
        Builder builder = new Builder();
        builder.addTestDevice("B3EEABB8EE11C2BE770B684D95219ECB");
        return builder.build();
    }

    private static PublisherAdRequest getDFPAdRequest() {
        return new PublisherAdRequest.Builder().addTestDevice("B3EEABB8EE11C2BE770B684D95219ECB").addTestDevice("6537BF07D47E7FC1C8155104E97E41F4").addTestDevice("6F702BBCC2D8E08C390F592EBEB37BB4").addTestDevice("14F9667740114CB8FBB3AA67B621F5CE").addTestDevice("5AB3374822EEDB82F3168C2D15E160B3").build();
    }

    public static AdManager getInstance() {
        return new AdManager();
    }

    /* access modifiers changed from: private */
    public void prepareAdViews(Activity activity, LinearLayout linearLayout, int i, int i2) {
        Activity activity2 = activity;
        LinearLayout linearLayout2 = linearLayout;
        String h = App.f18501c.mo16958h();
        String k = App.f18501c.mo16968k();
        int o = App.f18501c.mo16980o();
        String p = App.f18501c.mo16981p();
        int i3 = i;
        if (i3 == 100) {
            i3 = App.f18501c.mo16987v();
        }
        int i4 = i3;
        int i5 = i2;
        int w = i5 == 100 ? App.f18501c.mo16988w() : i5;
        if (isBillboardTopPositionAvailable()) {
            if (i4 == 1 && h != null && this.mAdMobAdViewTop == null) {
                this.mAdMobAdViewTop = addAdMobAdView(activity2, linearLayout2, h, 0);
            } else if (i4 == 2 && this.mSCAdViewTop == null) {
                this.mSCAdViewTop = addSCAdView(activity2, linearLayout2, 0);
            } else if (i4 == 4 && k != null && this.mDfpAdViewTop == null) {
                this.mDfpAdViewTop = addDFPAdView(activity2, linearLayout2, k, 0);
            } else if (i4 == 5 && o != 0 && p != null && this.mAirPushBannerTop == null) {
                this.mAirPushBannerTop = C5246b.m26186a(activity2, linearLayout2, 0);
            } else if (i4 == 6) {
                prepareSkiAdBanner(activity2, linearLayout2, 0);
            } else if (i4 == 7) {
                prepareFacebookAdBanner(activity2, linearLayout2, 0);
            }
        }
        if (!isBillboardBottomPositionAvailable()) {
            return;
        }
        if (w == 1 && h != null && this.mAdMobAdViewBottom == null) {
            this.mAdMobAdViewBottom = addAdMobAdView(activity2, linearLayout2, h, 1);
        } else if (w == 2 && this.mSCAdViewBottom == null) {
            this.mSCAdViewBottom = addSCAdView(activity2, linearLayout2, 1);
        } else if (w == 4 && k != null && this.mDfpAdViewBottom == null) {
            this.mDfpAdViewBottom = addDFPAdView(activity2, linearLayout2, k, 1);
        } else if (w == 5 && o != 0 && p != null && this.mAirPushBannerBottom == null) {
            this.mAirPushBannerBottom = C5246b.m26186a(activity2, linearLayout2, 1);
        } else if (w == 6) {
            prepareSkiAdBanner(activity2, linearLayout2, 1);
        } else if (w == 7) {
            prepareFacebookAdBanner(activity2, linearLayout2, 1);
        }
    }

    private void prepareFacebookAdBanner(Activity activity, LinearLayout linearLayout, int i) {
        if (!C6592al.m31909b(App.f18501c.mo16985t())) {
            Bundle bundle = new Bundle();
            bundle.putInt("ad_position", i);
            bundle.putString("fb_unit_id", App.f18501c.mo16985t());
            invokeFacebookAdBanner(activity, bundle, linearLayout);
        }
    }

    private void prepareSkiAdBanner(Activity activity, LinearLayout linearLayout, int i) {
        if (!C6592al.m31909b(App.f18501c.mo16983r())) {
            Bundle bundle = new Bundle();
            bundle.putInt("ad_position", i);
            bundle.putString("ski_unit_id", App.f18501c.mo16983r());
            invokeSkiAdBanner(activity, bundle, linearLayout);
        }
    }

    private void showAds(Activity activity, LinearLayout linearLayout, int i, int i2) {
        if (i == 100) {
            i = App.f18501c.mo16987v();
        }
        if (i2 == 100) {
            i2 = App.f18501c.mo16988w();
        }
        if (App.f18501c.mo16911M()) {
            if (i != 0) {
                this.mBillboardAdViewTop = addMPAdView(activity, linearLayout, 0);
            }
            if (i2 != 0) {
                this.mBillboardAdViewBottom = addMPAdView(activity, linearLayout, 1);
                return;
            }
            return;
        }
        setBillboardTopPositionAvailable(true);
        setBillboardBottomPositionAvailable(true);
        prepareAdViews(activity, linearLayout, i, i2);
    }

    public static void showPollfishIfActivitySupports(Activity activity) {
        if ((activity instanceof C5326d) || (activity instanceof SCPageFragmentActivity) || (activity instanceof SearchActivity)) {
            App.m25613a(App.m25615a("com.seattleclouds.ads.pollfish.PollfishManager", "show", (Class<?>[]) new Class[]{Activity.class}), (Object) null, activity);
        }
    }

    public void destroy() {
        if (this.mAdMobAdViewTop != null) {
            this.mAdMobAdViewTop.destroy();
        }
        if (this.mAdMobAdViewBottom != null) {
            this.mAdMobAdViewBottom.destroy();
        }
        if (this.mDfpAdViewTop != null) {
            this.mDfpAdViewTop.destroy();
        }
        if (this.mDfpAdViewBottom != null) {
            this.mDfpAdViewBottom.destroy();
        }
        if (this.mSCAdViewTop != null) {
            this.mSCAdViewTop.mo17275b();
        }
        if (this.mSCAdViewBottom != null) {
            this.mSCAdViewBottom.mo17275b();
        }
        if (this.mBillboardAdViewTop != null) {
            this.mBillboardAdViewTop.mo17261a();
        }
        if (this.mBillboardAdViewBottom != null) {
            this.mBillboardAdViewBottom.mo17261a();
        }
        if (this.mAirPushBannerTop != null) {
            C5246b.m26189a(this.mAirPushBannerTop);
        }
        if (this.mAirPushBannerBottom != null) {
            C5246b.m26189a(this.mAirPushBannerBottom);
        }
    }

    public void invokeFacebookAdBanner(Activity activity, Bundle bundle, LinearLayout linearLayout) {
        App.m25613a(App.m25615a("com.seattleclouds.ads.FBAdUtilBanner", "showFBAdBanner", (Class<?>[]) new Class[]{Activity.class, Bundle.class, LinearLayout.class}), (Object) null, activity, bundle, linearLayout);
    }

    public void invokeSkiAdBanner(Activity activity, Bundle bundle, LinearLayout linearLayout) {
        App.m25613a(App.m25615a("com.seattleclouds.ads.SkiAdUtilBanner", "showSkiAdBanner", (Class<?>[]) new Class[]{Activity.class, Bundle.class, LinearLayout.class}), (Object) null, activity, bundle, linearLayout);
    }

    public boolean isBillboardBottomPositionAvailable() {
        return this.mIsBillboardBottomPositionAvailable;
    }

    public boolean isBillboardTopPositionAvailable() {
        return this.mIsBillboardTopPositionAvailable;
    }

    public void pause() {
        if (this.mAdMobAdViewTop != null) {
            this.mAdMobAdViewTop.pause();
        }
        if (this.mAdMobAdViewBottom != null) {
            this.mAdMobAdViewBottom.pause();
        }
        if (this.mDfpAdViewTop != null) {
            this.mDfpAdViewTop.pause();
        }
        if (this.mDfpAdViewBottom != null) {
            this.mDfpAdViewBottom.pause();
        }
    }

    public void resume() {
        if (this.mAdMobAdViewTop != null) {
            this.mAdMobAdViewTop.resume();
        }
        if (this.mAdMobAdViewBottom != null) {
            this.mAdMobAdViewBottom.resume();
        }
        if (this.mDfpAdViewTop != null) {
            this.mDfpAdViewTop.resume();
        }
        if (this.mDfpAdViewBottom != null) {
            this.mDfpAdViewBottom.resume();
        }
    }

    public void setBillboardBottomPositionAvailable(boolean z) {
        this.mIsBillboardBottomPositionAvailable = z;
    }

    public void setBillboardTopPositionAvailable(boolean z) {
        this.mIsBillboardTopPositionAvailable = z;
    }

    public void showAds(Activity activity, LinearLayout linearLayout, C5230aa aaVar) {
        this.mCurrentActivity = activity;
        this.mCurrentLayout = linearLayout;
        this.mPage = aaVar;
        showAds(activity, linearLayout, aaVar != null ? aaVar.mo17184s() : App.f18501c.mo16987v(), aaVar != null ? aaVar.mo17187t() : App.f18501c.mo16988w());
    }

    public void showAds(Activity activity, LinearLayout linearLayout, String str) {
        if (App.f18501c.mo16937b()) {
            showAds(activity, linearLayout, App.m25675r(str));
        }
    }
}
