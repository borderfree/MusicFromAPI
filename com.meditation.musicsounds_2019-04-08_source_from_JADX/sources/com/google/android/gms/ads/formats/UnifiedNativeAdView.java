package com.google.android.gms.ads.formats;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import com.google.android.gms.internal.ads.C3731me;
import com.google.android.gms.internal.ads.ane;
import com.google.android.gms.internal.ads.atc;

public final class UnifiedNativeAdView extends FrameLayout {

    /* renamed from: a */
    private final FrameLayout f9906a;

    /* renamed from: b */
    private final atc f9907b = m13523a();

    public UnifiedNativeAdView(Context context) {
        super(context);
        this.f9906a = m13522a(context);
    }

    public UnifiedNativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9906a = m13522a(context);
    }

    public UnifiedNativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9906a = m13522a(context);
    }

    @TargetApi(21)
    public UnifiedNativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f9906a = m13522a(context);
    }

    /* renamed from: a */
    private final View m13521a(String str) {
        try {
            C3323b a = this.f9907b.mo12246a(str);
            if (a != null) {
                return (View) C3327d.m15137a(a);
            }
        } catch (RemoteException e) {
            C3731me.m19173b("Unable to call getAssetView on delegate", e);
        }
        return null;
    }

    /* renamed from: a */
    private final FrameLayout m13522a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    /* renamed from: a */
    private final atc m13523a() {
        C3266s.m14914a(this.f9906a, (Object) "createDelegate must be called after overlayFrame has been created");
        if (isInEditMode()) {
            return null;
        }
        return ane.m16646b().mo12112a(this.f9906a.getContext(), (FrameLayout) this, this.f9906a);
    }

    /* renamed from: a */
    private final void m13524a(String str, View view) {
        try {
            this.f9907b.mo12250a(str, C3327d.m15136a(view));
        } catch (RemoteException e) {
            C3731me.m19173b("Unable to call setAssetView on delegate", e);
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f9906a);
    }

    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        if (this.f9906a != view) {
            super.bringChildToFront(this.f9906a);
        }
    }

    public final void destroy() {
        try {
            this.f9907b.mo12247a();
        } catch (RemoteException e) {
            C3731me.m19173b("Unable to destroy native ad view", e);
        }
    }

    public final AdChoicesView getAdChoicesView() {
        View a = m13521a(UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW);
        if (a instanceof AdChoicesView) {
            return (AdChoicesView) a;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return m13521a(UnifiedNativeAdAssetNames.ASSET_ADVERTISER);
    }

    public final View getBodyView() {
        return m13521a(UnifiedNativeAdAssetNames.ASSET_BODY);
    }

    public final View getCallToActionView() {
        return m13521a(UnifiedNativeAdAssetNames.ASSET_CALL_TO_ACTION);
    }

    public final View getHeadlineView() {
        return m13521a(UnifiedNativeAdAssetNames.ASSET_HEADLINE);
    }

    public final View getIconView() {
        return m13521a(UnifiedNativeAdAssetNames.ASSET_ICON);
    }

    public final View getImageView() {
        return m13521a(UnifiedNativeAdAssetNames.ASSET_IMAGE);
    }

    public final MediaView getMediaView() {
        View a = m13521a(UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO);
        if (a instanceof MediaView) {
            return (MediaView) a;
        }
        if (a != null) {
            C3731me.m19172b("View is not an instance of MediaView");
        }
        return null;
    }

    public final View getPriceView() {
        return m13521a(UnifiedNativeAdAssetNames.ASSET_PRICE);
    }

    public final View getStarRatingView() {
        return m13521a(UnifiedNativeAdAssetNames.ASSET_STAR_RATING);
    }

    public final View getStoreView() {
        return m13521a(UnifiedNativeAdAssetNames.ASSET_STORE);
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.f9907b != null) {
            try {
                this.f9907b.mo12249a(C3327d.m15136a(view), i);
            } catch (RemoteException e) {
                C3731me.m19173b("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f9906a);
    }

    public final void removeView(View view) {
        if (this.f9906a != view) {
            super.removeView(view);
        }
    }

    public final void setAdChoicesView(AdChoicesView adChoicesView) {
        m13524a(UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW, adChoicesView);
    }

    public final void setAdvertiserView(View view) {
        m13524a(UnifiedNativeAdAssetNames.ASSET_ADVERTISER, view);
    }

    public final void setBodyView(View view) {
        m13524a(UnifiedNativeAdAssetNames.ASSET_BODY, view);
    }

    public final void setCallToActionView(View view) {
        m13524a(UnifiedNativeAdAssetNames.ASSET_CALL_TO_ACTION, view);
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.f9907b.mo12251b(C3327d.m15136a(view));
        } catch (RemoteException e) {
            C3731me.m19173b("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void setHeadlineView(View view) {
        m13524a(UnifiedNativeAdAssetNames.ASSET_HEADLINE, view);
    }

    public final void setIconView(View view) {
        m13524a(UnifiedNativeAdAssetNames.ASSET_ICON, view);
    }

    public final void setImageView(View view) {
        m13524a(UnifiedNativeAdAssetNames.ASSET_IMAGE, view);
    }

    public final void setMediaView(MediaView mediaView) {
        m13524a(UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO, mediaView);
    }

    public final void setNativeAd(UnifiedNativeAd unifiedNativeAd) {
        try {
            this.f9907b.mo12248a((C3323b) unifiedNativeAd.mo9904a());
        } catch (RemoteException e) {
            C3731me.m19173b("Unable to call setNativeAd on delegate", e);
        }
    }

    public final void setPriceView(View view) {
        m13524a(UnifiedNativeAdAssetNames.ASSET_PRICE, view);
    }

    public final void setStarRatingView(View view) {
        m13524a(UnifiedNativeAdAssetNames.ASSET_STAR_RATING, view);
    }

    public final void setStoreView(View view) {
        m13524a(UnifiedNativeAdAssetNames.ASSET_STORE, view);
    }
}
