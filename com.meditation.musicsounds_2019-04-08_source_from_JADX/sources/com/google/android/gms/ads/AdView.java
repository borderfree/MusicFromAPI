package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.C3266s;

public final class AdView extends C2842a {
    public AdView(Context context) {
        super(context, 0);
        C3266s.m14914a(context, (Object) "Context cannot be null");
    }

    public AdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public AdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }

    public final /* bridge */ /* synthetic */ void destroy() {
        super.destroy();
    }

    public final /* bridge */ /* synthetic */ AdListener getAdListener() {
        return super.getAdListener();
    }

    public final /* bridge */ /* synthetic */ AdSize getAdSize() {
        return super.getAdSize();
    }

    public final /* bridge */ /* synthetic */ String getAdUnitId() {
        return super.getAdUnitId();
    }

    public final /* bridge */ /* synthetic */ String getMediationAdapterClassName() {
        return super.getMediationAdapterClassName();
    }

    public final VideoController getVideoController() {
        if (this.f9882a != null) {
            return this.f9882a.mo12211m();
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean isLoading() {
        return super.isLoading();
    }

    public final /* bridge */ /* synthetic */ void loadAd(AdRequest adRequest) {
        super.loadAd(adRequest);
    }

    public final /* bridge */ /* synthetic */ void pause() {
        super.pause();
    }

    public final /* bridge */ /* synthetic */ void resume() {
        super.resume();
    }

    public final /* bridge */ /* synthetic */ void setAdListener(AdListener adListener) {
        super.setAdListener(adListener);
    }

    public final /* bridge */ /* synthetic */ void setAdSize(AdSize adSize) {
        super.setAdSize(adSize);
    }

    public final /* bridge */ /* synthetic */ void setAdUnitId(String str) {
        super.setAdUnitId(str);
    }
}
