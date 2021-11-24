package com.google.android.gms.ads.formats;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import com.google.android.gms.internal.ads.C3731me;
import com.google.android.gms.internal.ads.ane;
import com.google.android.gms.internal.ads.ath;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class NativeAdViewHolder {
    public static WeakHashMap<View, NativeAdViewHolder> zzvk = new WeakHashMap<>();

    /* renamed from: a */
    private ath f9899a;

    /* renamed from: b */
    private WeakReference<View> f9900b;

    public NativeAdViewHolder(View view, Map<String, View> map, Map<String, View> map2) {
        C3266s.m14914a(view, (Object) "ContainerView must not be null");
        if ((view instanceof NativeAdView) || (view instanceof UnifiedNativeAdView)) {
            C3731me.m19174c("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
        } else if (zzvk.get(view) != null) {
            C3731me.m19174c("The provided containerView is already in use with another NativeAdViewHolder.");
        } else {
            zzvk.put(view, this);
            this.f9900b = new WeakReference<>(view);
            this.f9899a = ane.m16646b().mo12113a(view, m13516a(map), m13516a(map2));
        }
    }

    /* renamed from: a */
    private static HashMap<String, View> m13516a(Map<String, View> map) {
        return map == null ? new HashMap<>() : new HashMap<>(map);
    }

    /* renamed from: a */
    private final void m13517a(C3323b bVar) {
        View view = this.f9900b != null ? (View) this.f9900b.get() : null;
        if (view == null) {
            C3731me.m19178e("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        if (!zzvk.containsKey(view)) {
            zzvk.put(view, this);
        }
        if (this.f9899a != null) {
            try {
                this.f9899a.mo12253a(bVar);
            } catch (RemoteException e) {
                C3731me.m19173b("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.f9899a.mo12254b(C3327d.m15136a(view));
        } catch (RemoteException e) {
            C3731me.m19173b("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void setNativeAd(NativeAd nativeAd) {
        m13517a((C3323b) nativeAd.mo9796a());
    }

    public final void setNativeAd(UnifiedNativeAd unifiedNativeAd) {
        m13517a((C3323b) unifiedNativeAd.mo9904a());
    }

    public final void unregisterNativeAd() {
        if (this.f9899a != null) {
            try {
                this.f9899a.mo12252a();
            } catch (RemoteException e) {
                C3731me.m19173b("Unable to call unregisterNativeAd on delegate", e);
            }
        }
        View view = this.f9900b != null ? (View) this.f9900b.get() : null;
        if (view != null) {
            zzvk.remove(view);
        }
    }
}
