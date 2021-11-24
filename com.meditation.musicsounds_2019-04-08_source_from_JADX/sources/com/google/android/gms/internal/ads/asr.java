package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
@C3464ci
public final class asr extends ati implements OnClickListener, OnTouchListener, OnGlobalLayoutListener, OnScrollChangedListener {

    /* renamed from: a */
    static final String[] f13107a = {NativeAppInstallAd.ASSET_MEDIA_VIDEO, NativeContentAd.ASSET_MEDIA_VIDEO, UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO};

    /* renamed from: b */
    private final Object f13108b = new Object();

    /* renamed from: c */
    private final WeakReference<View> f13109c;

    /* renamed from: d */
    private final Map<String, WeakReference<View>> f13110d = new HashMap();

    /* renamed from: e */
    private final Map<String, WeakReference<View>> f13111e = new HashMap();

    /* renamed from: f */
    private final Map<String, WeakReference<View>> f13112f = new HashMap();
    @GuardedBy("mLock")

    /* renamed from: g */
    private asb f13113g;

    /* renamed from: h */
    private View f13114h;

    /* renamed from: i */
    private Point f13115i = new Point();

    /* renamed from: j */
    private Point f13116j = new Point();

    /* renamed from: k */
    private WeakReference<ait> f13117k = new WeakReference<>(null);

    public asr(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        zzbv.zzfg();
        C3771nr.m19228a(view, (OnGlobalLayoutListener) this);
        zzbv.zzfg();
        C3771nr.m19229a(view, (OnScrollChangedListener) this);
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        this.f13109c = new WeakReference<>(view);
        for (Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.f13110d.put(str, new WeakReference(view2));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.f13112f.putAll(this.f13110d);
        for (Entry entry2 : hashMap2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.f13111e.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
            }
        }
        this.f13112f.putAll(this.f13111e);
        aqm.m16920a(view.getContext());
    }

    /* renamed from: a */
    private final int m17218a(int i) {
        int b;
        synchronized (this.f13108b) {
            ane.m16645a();
            b = C3719lt.m19117b(this.f13113g.mo12460m(), i);
        }
        return b;
    }

    /* renamed from: a */
    private final void m17219a(View view) {
        synchronized (this.f13108b) {
            if (this.f13113g != null) {
                asb f = this.f13113g instanceof asa ? ((asa) this.f13113g).mo12444f() : this.f13113g;
                if (f != null) {
                    f.mo12457c(view);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m17220a(com.google.android.gms.internal.ads.asg r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f13108b
            monitor-enter(r0)
            java.lang.String[] r1 = f13107a     // Catch:{ all -> 0x003b }
            int r2 = r1.length     // Catch:{ all -> 0x003b }
            r3 = 0
        L_0x0007:
            if (r3 >= r2) goto L_0x001f
            r4 = r1[r3]     // Catch:{ all -> 0x003b }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5 = r6.f13112f     // Catch:{ all -> 0x003b }
            java.lang.Object r4 = r5.get(r4)     // Catch:{ all -> 0x003b }
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4     // Catch:{ all -> 0x003b }
            if (r4 == 0) goto L_0x001c
            java.lang.Object r1 = r4.get()     // Catch:{ all -> 0x003b }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x003b }
            goto L_0x0020
        L_0x001c:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x001f:
            r1 = 0
        L_0x0020:
            boolean r2 = r1 instanceof android.widget.FrameLayout     // Catch:{ all -> 0x003b }
            if (r2 != 0) goto L_0x0029
            r7.mo12447i()     // Catch:{ all -> 0x003b }
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return
        L_0x0029:
            com.google.android.gms.internal.ads.ast r2 = new com.google.android.gms.internal.ads.ast     // Catch:{ all -> 0x003b }
            r2.<init>(r6, r1)     // Catch:{ all -> 0x003b }
            boolean r3 = r7 instanceof com.google.android.gms.internal.ads.asa     // Catch:{ all -> 0x003b }
            if (r3 == 0) goto L_0x0036
            r7.mo12467b(r1, r2)     // Catch:{ all -> 0x003b }
            goto L_0x0039
        L_0x0036:
            r7.mo12451a(r1, r2)     // Catch:{ all -> 0x003b }
        L_0x0039:
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return
        L_0x003b:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.asr.m17220a(com.google.android.gms.internal.ads.asg):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m17223a(String[] strArr) {
        for (String str : strArr) {
            if (this.f13110d.get(str) != null) {
                return true;
            }
        }
        for (String str2 : strArr) {
            if (this.f13111e.get(str2) != null) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo12252a() {
        synchronized (this.f13108b) {
            this.f13114h = null;
            this.f13113g = null;
            this.f13115i = null;
            this.f13116j = null;
        }
    }

    /* renamed from: a */
    public final void mo12253a(C3323b bVar) {
        int i;
        View view;
        synchronized (this.f13108b) {
            ViewGroup viewGroup = null;
            m17219a((View) null);
            Object a = C3327d.m15137a(bVar);
            if (!(a instanceof asg)) {
                C3643iy.m19178e("Not an instance of native engine. This is most likely a transient error");
                return;
            }
            asg asg = (asg) a;
            if (!asg.mo12440b()) {
                C3643iy.m19174c("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
                return;
            }
            View view2 = (View) this.f13109c.get();
            if (!(this.f13113g == null || view2 == null)) {
                if (((Boolean) ane.m16650f().mo12297a(aqm.f12713bZ)).booleanValue()) {
                    this.f13113g.mo12439b(view2, this.f13112f);
                }
            }
            synchronized (this.f13108b) {
                i = 0;
                if (this.f13113g instanceof asg) {
                    asg asg2 = (asg) this.f13113g;
                    View view3 = (View) this.f13109c.get();
                    if (!(asg2 == null || asg2.mo12460m() == null || view3 == null || !zzbv.zzfh().mo13003c(view3.getContext()))) {
                        C3610hs n = asg2.mo12469n();
                        if (n != null) {
                            n.mo12995a(false);
                        }
                        ait ait = (ait) this.f13117k.get();
                        if (!(ait == null || n == null)) {
                            ait.mo11980b((aix) n);
                        }
                    }
                }
            }
            if (!(this.f13113g instanceof asa) || !((asa) this.f13113g).mo12443e()) {
                this.f13113g = asg;
                if (asg instanceof asa) {
                    ((asa) asg).mo12436a((asb) null);
                }
            } else {
                ((asa) this.f13113g).mo12436a((asb) asg);
            }
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW};
            while (true) {
                if (i >= 2) {
                    view = null;
                    break;
                }
                WeakReference weakReference = (WeakReference) this.f13112f.get(strArr[i]);
                if (weakReference != null) {
                    view = (View) weakReference.get();
                    break;
                }
                i++;
            }
            if (view == null) {
                C3643iy.m19178e("Ad choices asset view is not provided.");
            } else {
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                }
                if (viewGroup != null) {
                    this.f13114h = asg.mo12431a((OnClickListener) this, true);
                    if (this.f13114h != null) {
                        this.f13112f.put(NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE, new WeakReference(this.f13114h));
                        this.f13110d.put(NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE, new WeakReference(this.f13114h));
                        viewGroup.removeAllViews();
                        viewGroup.addView(this.f13114h);
                    }
                }
            }
            asg.mo12435a(view2, this.f13110d, this.f13111e, (OnTouchListener) this, (OnClickListener) this);
            C3653jh.f14275a.post(new ass(this, asg));
            m17219a(view2);
            this.f13113g.mo12455b(view2);
            synchronized (this.f13108b) {
                if (this.f13113g instanceof asg) {
                    asg asg3 = (asg) this.f13113g;
                    View view4 = (View) this.f13109c.get();
                    if (!(asg3 == null || asg3.mo12460m() == null || view4 == null || !zzbv.zzfh().mo13003c(view4.getContext()))) {
                        ait ait2 = (ait) this.f13117k.get();
                        if (ait2 == null) {
                            ait2 = new ait(view4.getContext(), view4);
                            this.f13117k = new WeakReference<>(ait2);
                        }
                        ait2.mo11979a((aix) asg3.mo12469n());
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo12254b(C3323b bVar) {
        synchronized (this.f13108b) {
            this.f13113g.mo12432a((View) C3327d.m15137a(bVar));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f13108b
            monitor-enter(r0)
            com.google.android.gms.internal.ads.asb r1 = r8.f13113g     // Catch:{ all -> 0x0090 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            return
        L_0x0009:
            java.lang.ref.WeakReference<android.view.View> r1 = r8.f13109c     // Catch:{ all -> 0x0090 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0090 }
            r7 = r1
            android.view.View r7 = (android.view.View) r7     // Catch:{ all -> 0x0090 }
            if (r7 != 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            return
        L_0x0016:
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x0090 }
            r5.<init>()     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = "x"
            android.graphics.Point r2 = r8.f13115i     // Catch:{ all -> 0x0090 }
            int r2 = r2.x     // Catch:{ all -> 0x0090 }
            int r2 = r8.m17218a(r2)     // Catch:{ all -> 0x0090 }
            float r2 = (float) r2     // Catch:{ all -> 0x0090 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = "y"
            android.graphics.Point r2 = r8.f13115i     // Catch:{ all -> 0x0090 }
            int r2 = r2.y     // Catch:{ all -> 0x0090 }
            int r2 = r8.m17218a(r2)     // Catch:{ all -> 0x0090 }
            float r2 = (float) r2     // Catch:{ all -> 0x0090 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = "start_x"
            android.graphics.Point r2 = r8.f13116j     // Catch:{ all -> 0x0090 }
            int r2 = r2.x     // Catch:{ all -> 0x0090 }
            int r2 = r8.m17218a(r2)     // Catch:{ all -> 0x0090 }
            float r2 = (float) r2     // Catch:{ all -> 0x0090 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = "start_y"
            android.graphics.Point r2 = r8.f13116j     // Catch:{ all -> 0x0090 }
            int r2 = r2.y     // Catch:{ all -> 0x0090 }
            int r2 = r8.m17218a(r2)     // Catch:{ all -> 0x0090 }
            float r2 = (float) r2     // Catch:{ all -> 0x0090 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0090 }
            android.view.View r1 = r8.f13114h     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x0087
            android.view.View r1 = r8.f13114h     // Catch:{ all -> 0x0090 }
            boolean r1 = r1.equals(r9)     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x0087
            com.google.android.gms.internal.ads.asb r1 = r8.f13113g     // Catch:{ all -> 0x0090 }
            boolean r1 = r1 instanceof com.google.android.gms.internal.ads.asa     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x0080
            com.google.android.gms.internal.ads.asb r1 = r8.f13113g     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads.asa r1 = (com.google.android.gms.internal.ads.asa) r1     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads.asb r1 = r1.mo12444f()     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x008e
            com.google.android.gms.internal.ads.asb r1 = r8.f13113g     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads.asa r1 = (com.google.android.gms.internal.ads.asa) r1     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads.asb r2 = r1.mo12444f()     // Catch:{ all -> 0x0090 }
            java.lang.String r4 = "1007"
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r8.f13112f     // Catch:{ all -> 0x0090 }
        L_0x007b:
            r3 = r9
            r2.mo12452a(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0090 }
            goto L_0x008e
        L_0x0080:
            com.google.android.gms.internal.ads.asb r2 = r8.f13113g     // Catch:{ all -> 0x0090 }
            java.lang.String r4 = "1007"
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r8.f13112f     // Catch:{ all -> 0x0090 }
            goto L_0x007b
        L_0x0087:
            com.google.android.gms.internal.ads.asb r1 = r8.f13113g     // Catch:{ all -> 0x0090 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r2 = r8.f13112f     // Catch:{ all -> 0x0090 }
            r1.mo12434a(r9, r2, r5, r7)     // Catch:{ all -> 0x0090 }
        L_0x008e:
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            return
        L_0x0090:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.asr.onClick(android.view.View):void");
    }

    public final void onGlobalLayout() {
        synchronized (this.f13108b) {
            if (this.f13113g != null) {
                View view = (View) this.f13109c.get();
                if (view != null) {
                    this.f13113g.mo12458c(view, this.f13112f);
                }
            }
        }
    }

    public final void onScrollChanged() {
        synchronized (this.f13108b) {
            if (this.f13113g != null) {
                View view = (View) this.f13109c.get();
                if (view != null) {
                    this.f13113g.mo12458c(view, this.f13112f);
                }
            }
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.f13108b) {
            if (this.f13113g == null) {
                return false;
            }
            View view2 = (View) this.f13109c.get();
            if (view2 == null) {
                return false;
            }
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            Point point = new Point((int) (motionEvent.getRawX() - ((float) iArr[0])), (int) (motionEvent.getRawY() - ((float) iArr[1])));
            this.f13115i = point;
            if (motionEvent.getAction() == 0) {
                this.f13116j = point;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation((float) point.x, (float) point.y);
            this.f13113g.mo12450a(obtain);
            obtain.recycle();
            return false;
        }
    }
}
