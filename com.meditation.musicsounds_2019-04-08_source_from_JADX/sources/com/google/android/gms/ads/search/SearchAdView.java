package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3731me;
import com.google.android.gms.internal.ads.apb;

@C3464ci
public final class SearchAdView extends ViewGroup {

    /* renamed from: a */
    private final apb f10355a;

    public SearchAdView(Context context) {
        super(context);
        this.f10355a = new apb(this);
    }

    public SearchAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10355a = new apb(this, attributeSet, false);
    }

    public SearchAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10355a = new apb(this, attributeSet, false);
    }

    public final void destroy() {
        this.f10355a.mo12187a();
    }

    public final AdListener getAdListener() {
        return this.f10355a.mo12199b();
    }

    public final AdSize getAdSize() {
        return this.f10355a.mo12201c();
    }

    public final String getAdUnitId() {
        return this.f10355a.mo12203e();
    }

    public final void loadAd(DynamicHeightSearchAdRequest dynamicHeightSearchAdRequest) {
        if (AdSize.SEARCH.equals(getAdSize())) {
            this.f10355a.mo12194a(dynamicHeightSearchAdRequest.mo10475a());
            return;
        }
        throw new IllegalStateException("You must use AdSize.SEARCH for a DynamicHeightSearchAdRequest");
    }

    public final void loadAd(SearchAdRequest searchAdRequest) {
        this.f10355a.mo12194a(searchAdRequest.mo10525a());
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
        this.f10355a.mo12206h();
    }

    public final void resume() {
        this.f10355a.mo12208j();
    }

    public final void setAdListener(AdListener adListener) {
        this.f10355a.mo12188a(adListener);
    }

    public final void setAdSize(AdSize adSize) {
        this.f10355a.mo12197a(adSize);
    }

    public final void setAdUnitId(String str) {
        this.f10355a.mo12195a(str);
    }
}
