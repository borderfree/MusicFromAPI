package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.internal.ads.C3731me;
import com.google.android.gms.internal.ads.amh;
import com.google.android.gms.internal.ads.apb;

/* renamed from: com.google.android.gms.ads.a */
class C2842a extends ViewGroup {

    /* renamed from: a */
    protected final apb f9882a;

    public C2842a(Context context, int i) {
        super(context);
        this.f9882a = new apb(this, i);
    }

    public C2842a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f9882a = new apb(this, attributeSet, false, i);
    }

    public C2842a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f9882a = new apb(this, attributeSet, false, i2);
    }

    public void destroy() {
        this.f9882a.mo12187a();
    }

    public AdListener getAdListener() {
        return this.f9882a.mo12199b();
    }

    public AdSize getAdSize() {
        return this.f9882a.mo12201c();
    }

    public String getAdUnitId() {
        return this.f9882a.mo12203e();
    }

    public String getMediationAdapterClassName() {
        return this.f9882a.mo12209k();
    }

    public boolean isLoading() {
        return this.f9882a.mo12210l();
    }

    public void loadAd(AdRequest adRequest) {
        this.f9882a.mo12194a(adRequest.zzay());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
    public void onMeasure(int i, int i2) {
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

    public void pause() {
        this.f9882a.mo12206h();
    }

    public void resume() {
        this.f9882a.mo12208j();
    }

    public void setAdListener(AdListener adListener) {
        this.f9882a.mo12188a(adListener);
        if (adListener == null) {
            this.f9882a.mo12193a((amh) null);
            this.f9882a.mo12191a((AppEventListener) null);
            return;
        }
        if (adListener instanceof amh) {
            this.f9882a.mo12193a((amh) adListener);
        }
        if (adListener instanceof AppEventListener) {
            this.f9882a.mo12191a((AppEventListener) adListener);
        }
    }

    public void setAdSize(AdSize adSize) {
        this.f9882a.mo12197a(adSize);
    }

    public void setAdUnitId(String str) {
        this.f9882a.mo12195a(str);
    }
}
