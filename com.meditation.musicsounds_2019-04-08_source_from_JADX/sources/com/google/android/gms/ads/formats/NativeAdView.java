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

public class NativeAdView extends FrameLayout {

    /* renamed from: a */
    private final FrameLayout f9897a;

    /* renamed from: b */
    private final atc f9898b = m13513a();

    public NativeAdView(Context context) {
        super(context);
        this.f9897a = m13512a(context);
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9897a = m13512a(context);
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9897a = m13512a(context);
    }

    @TargetApi(21)
    public NativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f9897a = m13512a(context);
    }

    /* renamed from: a */
    private final FrameLayout m13512a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    /* renamed from: a */
    private final atc m13513a() {
        C3266s.m14914a(this.f9897a, (Object) "createDelegate must be called after mOverlayFrame has been created");
        if (isInEditMode()) {
            return null;
        }
        return ane.m16646b().mo12112a(this.f9897a.getContext(), (FrameLayout) this, this.f9897a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo9816a(String str) {
        try {
            C3323b a = this.f9898b.mo12246a(str);
            if (a != null) {
                return (View) C3327d.m15137a(a);
            }
        } catch (RemoteException e) {
            C3731me.m19173b("Unable to call getAssetView on delegate", e);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9817a(String str, View view) {
        try {
            this.f9898b.mo12250a(str, C3327d.m15136a(view));
        } catch (RemoteException e) {
            C3731me.m19173b("Unable to call setAssetView on delegate", e);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f9897a);
    }

    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        if (this.f9897a != view) {
            super.bringChildToFront(this.f9897a);
        }
    }

    public void destroy() {
        try {
            this.f9898b.mo12247a();
        } catch (RemoteException e) {
            C3731me.m19173b("Unable to destroy native ad view", e);
        }
    }

    public AdChoicesView getAdChoicesView() {
        View a = mo9816a(NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW);
        if (a instanceof AdChoicesView) {
            return (AdChoicesView) a;
        }
        return null;
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.f9898b != null) {
            try {
                this.f9898b.mo12249a(C3327d.m15136a(view), i);
            } catch (RemoteException e) {
                C3731me.m19173b("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f9897a);
    }

    public void removeView(View view) {
        if (this.f9897a != view) {
            super.removeView(view);
        }
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        mo9817a(NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, adChoicesView);
    }

    public void setNativeAd(NativeAd nativeAd) {
        try {
            this.f9898b.mo12248a((C3323b) nativeAd.mo9796a());
        } catch (RemoteException e) {
            C3731me.m19173b("Unable to call setNativeAd on delegate", e);
        }
    }
}
