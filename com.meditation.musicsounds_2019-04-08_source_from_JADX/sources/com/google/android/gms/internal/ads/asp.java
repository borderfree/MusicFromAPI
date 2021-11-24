package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.C3309n;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class asp extends atd implements OnClickListener, OnTouchListener, OnGlobalLayoutListener, OnScrollChangedListener {

    /* renamed from: a */
    private static final String[] f13092a = {NativeAppInstallAd.ASSET_MEDIA_VIDEO, NativeContentAd.ASSET_MEDIA_VIDEO, UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO};

    /* renamed from: b */
    private final Object f13093b = new Object();

    /* renamed from: c */
    private final FrameLayout f13094c;

    /* renamed from: d */
    private FrameLayout f13095d;

    /* renamed from: e */
    private View f13096e;

    /* renamed from: f */
    private final boolean f13097f;

    /* renamed from: g */
    private Map<String, WeakReference<View>> f13098g = Collections.synchronizedMap(new HashMap());

    /* renamed from: h */
    private View f13099h;

    /* renamed from: i */
    private asb f13100i;

    /* renamed from: j */
    private boolean f13101j = false;

    /* renamed from: k */
    private Point f13102k = new Point();

    /* renamed from: l */
    private Point f13103l = new Point();

    /* renamed from: m */
    private WeakReference<ait> f13104m = new WeakReference<>(null);

    @TargetApi(21)
    public asp(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.f13094c = frameLayout;
        this.f13095d = frameLayout2;
        zzbv.zzfg();
        C3771nr.m19228a((View) this.f13094c, (OnGlobalLayoutListener) this);
        zzbv.zzfg();
        C3771nr.m19229a((View) this.f13094c, (OnScrollChangedListener) this);
        this.f13094c.setOnTouchListener(this);
        this.f13094c.setOnClickListener(this);
        if (frameLayout2 != null && C3309n.m15077i()) {
            frameLayout2.setElevation(Float.MAX_VALUE);
        }
        aqm.m16920a(this.f13094c.getContext());
        this.f13097f = ((Boolean) ane.m16650f().mo12297a(aqm.f12775ci)).booleanValue();
    }

    /* renamed from: a */
    private final int m17207a(int i) {
        ane.m16645a();
        return C3719lt.m19117b(this.f13100i.mo12460m(), i);
    }

    /* renamed from: a */
    private final void m17208a(View view) {
        if (this.f13100i != null) {
            asb f = this.f13100i instanceof asa ? ((asa) this.f13100i).mo12444f() : this.f13100i;
            if (f != null) {
                f.mo12457c(view);
            }
        }
    }

    /* renamed from: b */
    private final void m17209b() {
        synchronized (this.f13093b) {
            if (!this.f13097f && this.f13101j) {
                int measuredWidth = this.f13094c.getMeasuredWidth();
                int measuredHeight = this.f13094c.getMeasuredHeight();
                if (!(measuredWidth == 0 || measuredHeight == 0 || this.f13095d == null)) {
                    this.f13095d.setLayoutParams(new LayoutParams(measuredWidth, measuredHeight));
                    this.f13101j = false;
                }
            }
        }
    }

    /* renamed from: a */
    public final C3323b mo12246a(String str) {
        synchronized (this.f13093b) {
            View view = null;
            if (this.f13098g == null) {
                return null;
            }
            WeakReference weakReference = (WeakReference) this.f13098g.get(str);
            if (weakReference != null) {
                view = (View) weakReference.get();
            }
            C3323b a = C3327d.m15136a(view);
            return a;
        }
    }

    /* renamed from: a */
    public final void mo12247a() {
        synchronized (this.f13093b) {
            if (this.f13095d != null) {
                this.f13095d.removeAllViews();
            }
            this.f13095d = null;
            this.f13098g = null;
            this.f13099h = null;
            this.f13100i = null;
            this.f13102k = null;
            this.f13103l = null;
            this.f13104m = null;
            this.f13096e = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0255, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01be A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0213 A[Catch:{ Exception -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x011a A[Catch:{ Exception -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0165 A[Catch:{ Exception -> 0x0196 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12248a(com.google.android.gms.dynamic.C3323b r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f13093b
            monitor-enter(r0)
            r1 = 0
            r11.m17208a(r1)     // Catch:{ all -> 0x0259 }
            java.lang.Object r12 = com.google.android.gms.dynamic.C3327d.m15137a(r12)     // Catch:{ all -> 0x0259 }
            boolean r2 = r12 instanceof com.google.android.gms.internal.ads.asg     // Catch:{ all -> 0x0259 }
            if (r2 != 0) goto L_0x0016
            java.lang.String r12 = "Not an instance of native engine. This is most likely a transient error"
            com.google.android.gms.internal.ads.C3643iy.m19178e(r12)     // Catch:{ all -> 0x0259 }
            monitor-exit(r0)     // Catch:{ all -> 0x0259 }
            return
        L_0x0016:
            boolean r2 = r11.f13097f     // Catch:{ all -> 0x0259 }
            r3 = 0
            if (r2 != 0) goto L_0x002e
            android.widget.FrameLayout r2 = r11.f13095d     // Catch:{ all -> 0x0259 }
            if (r2 == 0) goto L_0x002e
            android.widget.FrameLayout r2 = r11.f13095d     // Catch:{ all -> 0x0259 }
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x0259 }
            r4.<init>(r3, r3)     // Catch:{ all -> 0x0259 }
            r2.setLayoutParams(r4)     // Catch:{ all -> 0x0259 }
            android.widget.FrameLayout r2 = r11.f13094c     // Catch:{ all -> 0x0259 }
            r2.requestLayout()     // Catch:{ all -> 0x0259 }
        L_0x002e:
            r2 = 1
            r11.f13101j = r2     // Catch:{ all -> 0x0259 }
            com.google.android.gms.internal.ads.asg r12 = (com.google.android.gms.internal.ads.asg) r12     // Catch:{ all -> 0x0259 }
            com.google.android.gms.internal.ads.asb r4 = r11.f13100i     // Catch:{ all -> 0x0259 }
            if (r4 == 0) goto L_0x0052
            com.google.android.gms.internal.ads.aqc<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.aqm.f12713bZ     // Catch:{ all -> 0x0259 }
            com.google.android.gms.internal.ads.aqk r5 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ all -> 0x0259 }
            java.lang.Object r4 = r5.mo12297a(r4)     // Catch:{ all -> 0x0259 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0259 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0259 }
            if (r4 == 0) goto L_0x0052
            com.google.android.gms.internal.ads.asb r4 = r11.f13100i     // Catch:{ all -> 0x0259 }
            android.widget.FrameLayout r5 = r11.f13094c     // Catch:{ all -> 0x0259 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r11.f13098g     // Catch:{ all -> 0x0259 }
            r4.mo12439b(r5, r6)     // Catch:{ all -> 0x0259 }
        L_0x0052:
            com.google.android.gms.internal.ads.asb r4 = r11.f13100i     // Catch:{ all -> 0x0259 }
            boolean r4 = r4 instanceof com.google.android.gms.internal.ads.asg     // Catch:{ all -> 0x0259 }
            if (r4 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.asb r4 = r11.f13100i     // Catch:{ all -> 0x0259 }
            com.google.android.gms.internal.ads.asg r4 = (com.google.android.gms.internal.ads.asg) r4     // Catch:{ all -> 0x0259 }
            if (r4 == 0) goto L_0x008c
            android.content.Context r5 = r4.mo12460m()     // Catch:{ all -> 0x0259 }
            if (r5 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.ht r5 = com.google.android.gms.ads.internal.zzbv.zzfh()     // Catch:{ all -> 0x0259 }
            android.widget.FrameLayout r6 = r11.f13094c     // Catch:{ all -> 0x0259 }
            android.content.Context r6 = r6.getContext()     // Catch:{ all -> 0x0259 }
            boolean r5 = r5.mo13003c(r6)     // Catch:{ all -> 0x0259 }
            if (r5 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.hs r4 = r4.mo12469n()     // Catch:{ all -> 0x0259 }
            if (r4 == 0) goto L_0x007d
            r4.mo12995a(r3)     // Catch:{ all -> 0x0259 }
        L_0x007d:
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.ait> r5 = r11.f13104m     // Catch:{ all -> 0x0259 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0259 }
            com.google.android.gms.internal.ads.ait r5 = (com.google.android.gms.internal.ads.ait) r5     // Catch:{ all -> 0x0259 }
            if (r5 == 0) goto L_0x008c
            if (r4 == 0) goto L_0x008c
            r5.mo11980b(r4)     // Catch:{ all -> 0x0259 }
        L_0x008c:
            com.google.android.gms.internal.ads.asb r4 = r11.f13100i     // Catch:{ all -> 0x0259 }
            boolean r4 = r4 instanceof com.google.android.gms.internal.ads.asa     // Catch:{ all -> 0x0259 }
            if (r4 == 0) goto L_0x00a4
            com.google.android.gms.internal.ads.asb r4 = r11.f13100i     // Catch:{ all -> 0x0259 }
            com.google.android.gms.internal.ads.asa r4 = (com.google.android.gms.internal.ads.asa) r4     // Catch:{ all -> 0x0259 }
            boolean r4 = r4.mo12443e()     // Catch:{ all -> 0x0259 }
            if (r4 == 0) goto L_0x00a4
            com.google.android.gms.internal.ads.asb r4 = r11.f13100i     // Catch:{ all -> 0x0259 }
            com.google.android.gms.internal.ads.asa r4 = (com.google.android.gms.internal.ads.asa) r4     // Catch:{ all -> 0x0259 }
            r4.mo12436a(r12)     // Catch:{ all -> 0x0259 }
            goto L_0x00b0
        L_0x00a4:
            r11.f13100i = r12     // Catch:{ all -> 0x0259 }
            boolean r4 = r12 instanceof com.google.android.gms.internal.ads.asa     // Catch:{ all -> 0x0259 }
            if (r4 == 0) goto L_0x00b0
            r4 = r12
            com.google.android.gms.internal.ads.asa r4 = (com.google.android.gms.internal.ads.asa) r4     // Catch:{ all -> 0x0259 }
            r4.mo12436a(r1)     // Catch:{ all -> 0x0259 }
        L_0x00b0:
            android.widget.FrameLayout r4 = r11.f13095d     // Catch:{ all -> 0x0259 }
            if (r4 != 0) goto L_0x00b6
            monitor-exit(r0)     // Catch:{ all -> 0x0259 }
            return
        L_0x00b6:
            com.google.android.gms.internal.ads.aqc<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.aqm.f12713bZ     // Catch:{ all -> 0x0259 }
            com.google.android.gms.internal.ads.aqk r5 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ all -> 0x0259 }
            java.lang.Object r4 = r5.mo12297a(r4)     // Catch:{ all -> 0x0259 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0259 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0259 }
            if (r4 == 0) goto L_0x00cd
            android.widget.FrameLayout r4 = r11.f13095d     // Catch:{ all -> 0x0259 }
            r4.setClickable(r3)     // Catch:{ all -> 0x0259 }
        L_0x00cd:
            android.widget.FrameLayout r4 = r11.f13095d     // Catch:{ all -> 0x0259 }
            r4.removeAllViews()     // Catch:{ all -> 0x0259 }
            boolean r4 = r12.mo12438a()     // Catch:{ all -> 0x0259 }
            if (r4 == 0) goto L_0x0108
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5 = r11.f13098g     // Catch:{ all -> 0x0259 }
            if (r5 == 0) goto L_0x0100
            r5 = 2
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ all -> 0x0259 }
            java.lang.String r7 = "1098"
            r6[r3] = r7     // Catch:{ all -> 0x0259 }
            java.lang.String r7 = "3011"
            r6[r2] = r7     // Catch:{ all -> 0x0259 }
            r7 = 0
        L_0x00e8:
            if (r7 >= r5) goto L_0x0100
            r8 = r6[r7]     // Catch:{ all -> 0x0259 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r9 = r11.f13098g     // Catch:{ all -> 0x0259 }
            java.lang.Object r8 = r9.get(r8)     // Catch:{ all -> 0x0259 }
            java.lang.ref.WeakReference r8 = (java.lang.ref.WeakReference) r8     // Catch:{ all -> 0x0259 }
            if (r8 == 0) goto L_0x00fd
            java.lang.Object r5 = r8.get()     // Catch:{ all -> 0x0259 }
            android.view.View r5 = (android.view.View) r5     // Catch:{ all -> 0x0259 }
            goto L_0x0101
        L_0x00fd:
            int r7 = r7 + 1
            goto L_0x00e8
        L_0x0100:
            r5 = r1
        L_0x0101:
            boolean r6 = r5 instanceof android.view.ViewGroup     // Catch:{ all -> 0x0259 }
            if (r6 == 0) goto L_0x0108
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5     // Catch:{ all -> 0x0259 }
            goto L_0x0109
        L_0x0108:
            r5 = r1
        L_0x0109:
            if (r4 == 0) goto L_0x010e
            if (r5 == 0) goto L_0x010e
            goto L_0x010f
        L_0x010e:
            r2 = 0
        L_0x010f:
            android.view.View r4 = r12.mo12431a(r11, r2)     // Catch:{ all -> 0x0259 }
            r11.f13099h = r4     // Catch:{ all -> 0x0259 }
            android.view.View r4 = r11.f13099h     // Catch:{ all -> 0x0259 }
            r10 = -1
            if (r4 == 0) goto L_0x0156
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r11.f13098g     // Catch:{ all -> 0x0259 }
            if (r4 == 0) goto L_0x012c
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r11.f13098g     // Catch:{ all -> 0x0259 }
            java.lang.String r6 = "1007"
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0259 }
            android.view.View r8 = r11.f13099h     // Catch:{ all -> 0x0259 }
            r7.<init>(r8)     // Catch:{ all -> 0x0259 }
            r4.put(r6, r7)     // Catch:{ all -> 0x0259 }
        L_0x012c:
            if (r2 == 0) goto L_0x0137
            r5.removeAllViews()     // Catch:{ all -> 0x0259 }
            android.view.View r2 = r11.f13099h     // Catch:{ all -> 0x0259 }
            r5.addView(r2)     // Catch:{ all -> 0x0259 }
            goto L_0x0156
        L_0x0137:
            android.content.Context r2 = r12.mo12460m()     // Catch:{ all -> 0x0259 }
            com.google.android.gms.ads.formats.AdChoicesView r4 = new com.google.android.gms.ads.formats.AdChoicesView     // Catch:{ all -> 0x0259 }
            r4.<init>(r2)     // Catch:{ all -> 0x0259 }
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x0259 }
            r2.<init>(r10, r10)     // Catch:{ all -> 0x0259 }
            r4.setLayoutParams(r2)     // Catch:{ all -> 0x0259 }
            android.view.View r2 = r11.f13099h     // Catch:{ all -> 0x0259 }
            r4.addView(r2)     // Catch:{ all -> 0x0259 }
            android.widget.FrameLayout r2 = r11.f13095d     // Catch:{ all -> 0x0259 }
            if (r2 == 0) goto L_0x0156
            android.widget.FrameLayout r2 = r11.f13095d     // Catch:{ all -> 0x0259 }
            r2.addView(r4)     // Catch:{ all -> 0x0259 }
        L_0x0156:
            android.widget.FrameLayout r5 = r11.f13094c     // Catch:{ all -> 0x0259 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r11.f13098g     // Catch:{ all -> 0x0259 }
            r7 = 0
            r4 = r12
            r8 = r11
            r9 = r11
            r4.mo12435a(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0259 }
            boolean r2 = r11.f13097f     // Catch:{ all -> 0x0259 }
            if (r2 == 0) goto L_0x0191
            android.view.View r2 = r11.f13096e     // Catch:{ all -> 0x0259 }
            if (r2 != 0) goto L_0x0180
            android.view.View r2 = new android.view.View     // Catch:{ all -> 0x0259 }
            android.widget.FrameLayout r4 = r11.f13094c     // Catch:{ all -> 0x0259 }
            android.content.Context r4 = r4.getContext()     // Catch:{ all -> 0x0259 }
            r2.<init>(r4)     // Catch:{ all -> 0x0259 }
            r11.f13096e = r2     // Catch:{ all -> 0x0259 }
            android.view.View r2 = r11.f13096e     // Catch:{ all -> 0x0259 }
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x0259 }
            r4.<init>(r10, r3)     // Catch:{ all -> 0x0259 }
            r2.setLayoutParams(r4)     // Catch:{ all -> 0x0259 }
        L_0x0180:
            android.widget.FrameLayout r2 = r11.f13094c     // Catch:{ all -> 0x0259 }
            android.view.View r4 = r11.f13096e     // Catch:{ all -> 0x0259 }
            android.view.ViewParent r4 = r4.getParent()     // Catch:{ all -> 0x0259 }
            if (r2 == r4) goto L_0x0191
            android.widget.FrameLayout r2 = r11.f13094c     // Catch:{ all -> 0x0259 }
            android.view.View r4 = r11.f13096e     // Catch:{ all -> 0x0259 }
            r2.addView(r4)     // Catch:{ all -> 0x0259 }
        L_0x0191:
            com.google.android.gms.internal.ads.py r2 = r12.mo12445g()     // Catch:{ Exception -> 0x0196 }
            goto L_0x01ac
        L_0x0196:
            r2 = move-exception
            com.google.android.gms.ads.internal.zzbv.zzem()     // Catch:{ all -> 0x0259 }
            boolean r4 = com.google.android.gms.internal.ads.C3659jn.m18934e()     // Catch:{ all -> 0x0259 }
            if (r4 == 0) goto L_0x01a6
            java.lang.String r2 = "Privileged processes cannot create HTML overlays."
            com.google.android.gms.internal.ads.C3643iy.m19178e(r2)     // Catch:{ all -> 0x0259 }
            goto L_0x01ab
        L_0x01a6:
            java.lang.String r4 = "Error obtaining overlay."
            com.google.android.gms.internal.ads.C3643iy.m19173b(r4, r2)     // Catch:{ all -> 0x0259 }
        L_0x01ab:
            r2 = r1
        L_0x01ac:
            if (r2 == 0) goto L_0x01bb
            android.widget.FrameLayout r4 = r11.f13095d     // Catch:{ all -> 0x0259 }
            if (r4 == 0) goto L_0x01bb
            android.widget.FrameLayout r4 = r11.f13095d     // Catch:{ all -> 0x0259 }
            android.view.View r2 = r2.getView()     // Catch:{ all -> 0x0259 }
            r4.addView(r2)     // Catch:{ all -> 0x0259 }
        L_0x01bb:
            java.lang.Object r2 = r11.f13093b     // Catch:{ all -> 0x0259 }
            monitor-enter(r2)     // Catch:{ all -> 0x0259 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r11.f13098g     // Catch:{ all -> 0x0256 }
            r12.mo12466a(r4)     // Catch:{ all -> 0x0256 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r11.f13098g     // Catch:{ all -> 0x0256 }
            if (r4 == 0) goto L_0x01e2
            java.lang.String[] r4 = f13092a     // Catch:{ all -> 0x0256 }
            int r5 = r4.length     // Catch:{ all -> 0x0256 }
        L_0x01ca:
            if (r3 >= r5) goto L_0x01e2
            r6 = r4[r3]     // Catch:{ all -> 0x0256 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r7 = r11.f13098g     // Catch:{ all -> 0x0256 }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x0256 }
            java.lang.ref.WeakReference r6 = (java.lang.ref.WeakReference) r6     // Catch:{ all -> 0x0256 }
            if (r6 == 0) goto L_0x01df
            java.lang.Object r1 = r6.get()     // Catch:{ all -> 0x0256 }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x0256 }
            goto L_0x01e2
        L_0x01df:
            int r3 = r3 + 1
            goto L_0x01ca
        L_0x01e2:
            boolean r3 = r1 instanceof android.widget.FrameLayout     // Catch:{ all -> 0x0256 }
            if (r3 != 0) goto L_0x01eb
            r12.mo12447i()     // Catch:{ all -> 0x0256 }
        L_0x01e9:
            monitor-exit(r2)     // Catch:{ all -> 0x0256 }
            goto L_0x01fc
        L_0x01eb:
            com.google.android.gms.internal.ads.asq r3 = new com.google.android.gms.internal.ads.asq     // Catch:{ all -> 0x0256 }
            r3.<init>(r11, r1)     // Catch:{ all -> 0x0256 }
            boolean r4 = r12 instanceof com.google.android.gms.internal.ads.asa     // Catch:{ all -> 0x0256 }
            if (r4 == 0) goto L_0x01f8
            r12.mo12467b(r1, r3)     // Catch:{ all -> 0x0256 }
            goto L_0x01e9
        L_0x01f8:
            r12.mo12451a(r1, r3)     // Catch:{ all -> 0x0256 }
            goto L_0x01e9
        L_0x01fc:
            android.widget.FrameLayout r1 = r11.f13094c     // Catch:{ all -> 0x0259 }
            r12.mo12468d(r1)     // Catch:{ all -> 0x0259 }
            android.widget.FrameLayout r12 = r11.f13094c     // Catch:{ all -> 0x0259 }
            r11.m17208a(r12)     // Catch:{ all -> 0x0259 }
            com.google.android.gms.internal.ads.asb r12 = r11.f13100i     // Catch:{ all -> 0x0259 }
            android.widget.FrameLayout r1 = r11.f13094c     // Catch:{ all -> 0x0259 }
            r12.mo12455b(r1)     // Catch:{ all -> 0x0259 }
            com.google.android.gms.internal.ads.asb r12 = r11.f13100i     // Catch:{ all -> 0x0259 }
            boolean r12 = r12 instanceof com.google.android.gms.internal.ads.asg     // Catch:{ all -> 0x0259 }
            if (r12 == 0) goto L_0x0254
            com.google.android.gms.internal.ads.asb r12 = r11.f13100i     // Catch:{ all -> 0x0259 }
            com.google.android.gms.internal.ads.asg r12 = (com.google.android.gms.internal.ads.asg) r12     // Catch:{ all -> 0x0259 }
            if (r12 == 0) goto L_0x0254
            android.content.Context r1 = r12.mo12460m()     // Catch:{ all -> 0x0259 }
            if (r1 == 0) goto L_0x0254
            com.google.android.gms.internal.ads.ht r1 = com.google.android.gms.ads.internal.zzbv.zzfh()     // Catch:{ all -> 0x0259 }
            android.widget.FrameLayout r2 = r11.f13094c     // Catch:{ all -> 0x0259 }
            android.content.Context r2 = r2.getContext()     // Catch:{ all -> 0x0259 }
            boolean r1 = r1.mo13003c(r2)     // Catch:{ all -> 0x0259 }
            if (r1 == 0) goto L_0x0254
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.ait> r1 = r11.f13104m     // Catch:{ all -> 0x0259 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0259 }
            com.google.android.gms.internal.ads.ait r1 = (com.google.android.gms.internal.ads.ait) r1     // Catch:{ all -> 0x0259 }
            if (r1 != 0) goto L_0x024d
            com.google.android.gms.internal.ads.ait r1 = new com.google.android.gms.internal.ads.ait     // Catch:{ all -> 0x0259 }
            android.widget.FrameLayout r2 = r11.f13094c     // Catch:{ all -> 0x0259 }
            android.content.Context r2 = r2.getContext()     // Catch:{ all -> 0x0259 }
            android.widget.FrameLayout r3 = r11.f13094c     // Catch:{ all -> 0x0259 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0259 }
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0259 }
            r2.<init>(r1)     // Catch:{ all -> 0x0259 }
            r11.f13104m = r2     // Catch:{ all -> 0x0259 }
        L_0x024d:
            com.google.android.gms.internal.ads.hs r12 = r12.mo12469n()     // Catch:{ all -> 0x0259 }
            r1.mo11979a(r12)     // Catch:{ all -> 0x0259 }
        L_0x0254:
            monitor-exit(r0)     // Catch:{ all -> 0x0259 }
            return
        L_0x0256:
            r12 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0256 }
            throw r12     // Catch:{ all -> 0x0259 }
        L_0x0259:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0259 }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.asp.mo12248a(com.google.android.gms.dynamic.b):void");
    }

    /* renamed from: a */
    public final void mo12249a(C3323b bVar, int i) {
        if (zzbv.zzfh().mo13003c(this.f13094c.getContext()) && this.f13104m != null) {
            ait ait = (ait) this.f13104m.get();
            if (ait != null) {
                ait.mo11978a();
            }
        }
        m17209b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12250a(java.lang.String r4, com.google.android.gms.dynamic.C3323b r5) {
        /*
            r3 = this;
            java.lang.Object r5 = com.google.android.gms.dynamic.C3327d.m15137a(r5)
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r0 = r3.f13093b
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r1 = r3.f13098g     // Catch:{ all -> 0x0040 }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x000f:
            if (r5 != 0) goto L_0x0017
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5 = r3.f13098g     // Catch:{ all -> 0x0040 }
            r5.remove(r4)     // Catch:{ all -> 0x0040 }
            goto L_0x003c
        L_0x0017:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r1 = r3.f13098g     // Catch:{ all -> 0x0040 }
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0040 }
            r2.<init>(r5)     // Catch:{ all -> 0x0040 }
            r1.put(r4, r2)     // Catch:{ all -> 0x0040 }
            java.lang.String r1 = "1098"
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0040 }
            if (r1 != 0) goto L_0x003e
            java.lang.String r1 = "3011"
            boolean r4 = r1.equals(r4)     // Catch:{ all -> 0x0040 }
            if (r4 == 0) goto L_0x0032
            goto L_0x003e
        L_0x0032:
            r5.setOnTouchListener(r3)     // Catch:{ all -> 0x0040 }
            r4 = 1
            r5.setClickable(r4)     // Catch:{ all -> 0x0040 }
            r5.setOnClickListener(r3)     // Catch:{ all -> 0x0040 }
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x003e:
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x0040:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.asp.mo12250a(java.lang.String, com.google.android.gms.dynamic.b):void");
    }

    /* renamed from: b */
    public final void mo12251b(C3323b bVar) {
        this.f13100i.mo12432a((View) C3327d.m15137a(bVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f13093b
            monitor-enter(r0)
            com.google.android.gms.internal.ads.asb r1 = r8.f13100i     // Catch:{ all -> 0x008e }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            return
        L_0x0009:
            com.google.android.gms.internal.ads.asb r1 = r8.f13100i     // Catch:{ all -> 0x008e }
            r1.mo12441c()     // Catch:{ all -> 0x008e }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x008e }
            r5.<init>()     // Catch:{ all -> 0x008e }
            java.lang.String r1 = "x"
            android.graphics.Point r2 = r8.f13102k     // Catch:{ all -> 0x008e }
            int r2 = r2.x     // Catch:{ all -> 0x008e }
            int r2 = r8.m17207a(r2)     // Catch:{ all -> 0x008e }
            float r2 = (float) r2     // Catch:{ all -> 0x008e }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x008e }
            java.lang.String r1 = "y"
            android.graphics.Point r2 = r8.f13102k     // Catch:{ all -> 0x008e }
            int r2 = r2.y     // Catch:{ all -> 0x008e }
            int r2 = r8.m17207a(r2)     // Catch:{ all -> 0x008e }
            float r2 = (float) r2     // Catch:{ all -> 0x008e }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x008e }
            java.lang.String r1 = "start_x"
            android.graphics.Point r2 = r8.f13103l     // Catch:{ all -> 0x008e }
            int r2 = r2.x     // Catch:{ all -> 0x008e }
            int r2 = r8.m17207a(r2)     // Catch:{ all -> 0x008e }
            float r2 = (float) r2     // Catch:{ all -> 0x008e }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x008e }
            java.lang.String r1 = "start_y"
            android.graphics.Point r2 = r8.f13103l     // Catch:{ all -> 0x008e }
            int r2 = r2.y     // Catch:{ all -> 0x008e }
            int r2 = r8.m17207a(r2)     // Catch:{ all -> 0x008e }
            float r2 = (float) r2     // Catch:{ all -> 0x008e }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x008e }
            android.view.View r1 = r8.f13099h     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x0083
            android.view.View r1 = r8.f13099h     // Catch:{ all -> 0x008e }
            boolean r1 = r1.equals(r9)     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x0083
            com.google.android.gms.internal.ads.asb r1 = r8.f13100i     // Catch:{ all -> 0x008e }
            boolean r1 = r1 instanceof com.google.android.gms.internal.ads.asa     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x007a
            com.google.android.gms.internal.ads.asb r1 = r8.f13100i     // Catch:{ all -> 0x008e }
            com.google.android.gms.internal.ads.asa r1 = (com.google.android.gms.internal.ads.asa) r1     // Catch:{ all -> 0x008e }
            com.google.android.gms.internal.ads.asb r1 = r1.mo12444f()     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.asb r1 = r8.f13100i     // Catch:{ all -> 0x008e }
            com.google.android.gms.internal.ads.asa r1 = (com.google.android.gms.internal.ads.asa) r1     // Catch:{ all -> 0x008e }
            com.google.android.gms.internal.ads.asb r2 = r1.mo12444f()     // Catch:{ all -> 0x008e }
            java.lang.String r4 = "1007"
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r8.f13098g     // Catch:{ all -> 0x008e }
            android.widget.FrameLayout r7 = r8.f13094c     // Catch:{ all -> 0x008e }
        L_0x0075:
            r3 = r9
            r2.mo12452a(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x008e }
            goto L_0x008c
        L_0x007a:
            com.google.android.gms.internal.ads.asb r2 = r8.f13100i     // Catch:{ all -> 0x008e }
            java.lang.String r4 = "1007"
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r8.f13098g     // Catch:{ all -> 0x008e }
            android.widget.FrameLayout r7 = r8.f13094c     // Catch:{ all -> 0x008e }
            goto L_0x0075
        L_0x0083:
            com.google.android.gms.internal.ads.asb r1 = r8.f13100i     // Catch:{ all -> 0x008e }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r2 = r8.f13098g     // Catch:{ all -> 0x008e }
            android.widget.FrameLayout r3 = r8.f13094c     // Catch:{ all -> 0x008e }
            r1.mo12434a(r9, r2, r5, r3)     // Catch:{ all -> 0x008e }
        L_0x008c:
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            return
        L_0x008e:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.asp.onClick(android.view.View):void");
    }

    public final void onGlobalLayout() {
        synchronized (this.f13093b) {
            m17209b();
            if (this.f13100i != null) {
                this.f13100i.mo12458c(this.f13094c, this.f13098g);
            }
        }
    }

    public final void onScrollChanged() {
        synchronized (this.f13093b) {
            if (this.f13100i != null) {
                this.f13100i.mo12458c(this.f13094c, this.f13098g);
            }
            m17209b();
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.f13093b) {
            if (this.f13100i == null) {
                return false;
            }
            int[] iArr = new int[2];
            this.f13094c.getLocationOnScreen(iArr);
            Point point = new Point((int) (motionEvent.getRawX() - ((float) iArr[0])), (int) (motionEvent.getRawY() - ((float) iArr[1])));
            this.f13102k = point;
            if (motionEvent.getAction() == 0) {
                this.f13103l = point;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation((float) point.x, (float) point.y);
            this.f13100i.mo12450a(obtain);
            obtain.recycle();
            return false;
        }
    }
}
