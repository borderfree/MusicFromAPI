package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.internal.ads.C3731me;
import com.google.android.gms.internal.ads.anv;
import com.google.android.gms.internal.ads.apb;

public final class PublisherAdView extends ViewGroup {

    /* renamed from: a */
    private final apb f9885a;

    public PublisherAdView(Context context) {
        super(context);
        this.f9885a = new apb(this);
    }

    public PublisherAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9885a = new apb(this, attributeSet, true);
        C3266s.m14914a(context, (Object) "Context cannot be null");
    }

    public PublisherAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9885a = new apb(this, attributeSet, true);
    }

    public final void destroy() {
        this.f9885a.mo12187a();
    }

    public final AdListener getAdListener() {
        return this.f9885a.mo12199b();
    }

    public final AdSize getAdSize() {
        return this.f9885a.mo12201c();
    }

    public final AdSize[] getAdSizes() {
        return this.f9885a.mo12202d();
    }

    public final String getAdUnitId() {
        return this.f9885a.mo12203e();
    }

    public final AppEventListener getAppEventListener() {
        return this.f9885a.mo12204f();
    }

    public final String getMediationAdapterClassName() {
        return this.f9885a.mo12209k();
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.f9885a.mo12205g();
    }

    public final VideoController getVideoController() {
        return this.f9885a.mo12211m();
    }

    public final VideoOptions getVideoOptions() {
        return this.f9885a.mo12213o();
    }

    public final boolean isLoading() {
        return this.f9885a.mo12210l();
    }

    public final void loadAd(PublisherAdRequest publisherAdRequest) {
        this.f9885a.mo12194a(publisherAdRequest.zzay());
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            AdSize adSize = null;
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                C3731me.m19173b("Unable to retrieve ad size.", e);
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                i3 = adSize.getHeightInPixels(context);
                i4 = widthInPixels;
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public final void pause() {
        this.f9885a.mo12206h();
    }

    public final void recordManualImpression() {
        this.f9885a.mo12207i();
    }

    public final void resume() {
        this.f9885a.mo12208j();
    }

    public final void setAdListener(AdListener adListener) {
        this.f9885a.mo12188a(adListener);
    }

    public final void setAdSizes(AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f9885a.mo12200b(adSizeArr);
    }

    public final void setAdUnitId(String str) {
        this.f9885a.mo12195a(str);
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        this.f9885a.mo12191a(appEventListener);
    }

    public final void setCorrelator(Correlator correlator) {
        this.f9885a.mo12189a(correlator);
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.f9885a.mo12196a(z);
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.f9885a.mo12192a(onCustomRenderedAdLoadedListener);
    }

    public final void setVideoOptions(VideoOptions videoOptions) {
        this.f9885a.mo12190a(videoOptions);
    }

    public final boolean zza(anv anv) {
        return this.f9885a.mo12198a(anv);
    }
}
