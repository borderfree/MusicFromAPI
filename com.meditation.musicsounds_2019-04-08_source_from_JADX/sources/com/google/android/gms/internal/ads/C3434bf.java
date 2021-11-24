package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.gmsg.zzf;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.zzbc;
import com.google.android.gms.ads.internal.zzbv;
import java.lang.ref.WeakReference;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.bf */
public final class C3434bf {

    /* renamed from: a */
    private final Object f13598a = new Object();

    /* renamed from: b */
    private final Context f13599b;

    /* renamed from: c */
    private final afm f13600c;

    /* renamed from: d */
    private final C3623ie f13601d;

    /* renamed from: e */
    private final aqz f13602e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final zzbc f13603f;

    /* renamed from: g */
    private OnGlobalLayoutListener f13604g;

    /* renamed from: h */
    private OnScrollChangedListener f13605h;

    /* renamed from: i */
    private final DisplayMetrics f13606i;

    /* renamed from: j */
    private C3708li f13607j;
    @GuardedBy("mLock")

    /* renamed from: k */
    private int f13608k = -1;
    @GuardedBy("mLock")

    /* renamed from: l */
    private int f13609l = -1;

    public C3434bf(Context context, afm afm, C3623ie ieVar, aqz aqz, zzbc zzbc) {
        this.f13599b = context;
        this.f13600c = afm;
        this.f13601d = ieVar;
        this.f13602e = aqz;
        this.f13603f = zzbc;
        this.f13607j = new C3708li(200);
        zzbv.zzek();
        this.f13606i = C3653jh.m18861a((WindowManager) context.getSystemService("window"));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18196a(WeakReference<C3832py> weakReference, boolean z) {
        if (weakReference != null) {
            C3832py pyVar = (C3832py) weakReference.get();
            if (pyVar != null && pyVar.getView() != null) {
                if (!z || this.f13607j.mo13219a()) {
                    int[] iArr = new int[2];
                    pyVar.getView().getLocationOnScreen(iArr);
                    ane.m16645a();
                    int b = C3719lt.m19118b(this.f13606i, iArr[0]);
                    ane.m16645a();
                    int b2 = C3719lt.m19118b(this.f13606i, iArr[1]);
                    synchronized (this.f13598a) {
                        if (!(this.f13608k == b && this.f13609l == b2)) {
                            this.f13608k = b;
                            this.f13609l = b2;
                            pyVar.mo13527t().mo13537a(this.f13608k, this.f13609l, !z);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12810a(C3763nj njVar, C3832py pyVar, boolean z) {
        this.f13603f.zzdw();
        njVar.mo13296b(pyVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12811a(JSONObject jSONObject, C3763nj njVar) {
        try {
            zzbv.zzel();
            C3832py a = C3840qf.m19490a(this.f13599b, C3873rl.m19690a(), "native-video", false, false, this.f13600c, this.f13601d.f14160a.f15267k, this.f13602e, null, this.f13603f.zzbi(), this.f13601d.f14168i);
            a.mo13486a(C3873rl.m19693b());
            this.f13603f.zzf(a);
            WeakReference weakReference = new WeakReference(a);
            C3867rf t = a.mo13527t();
            if (this.f13604g == null) {
                this.f13604g = new C3440bl(this, weakReference);
            }
            OnGlobalLayoutListener onGlobalLayoutListener = this.f13604g;
            if (this.f13605h == null) {
                this.f13605h = new C3441bm(this, weakReference);
            }
            t.mo13538a(onGlobalLayoutListener, this.f13605h);
            a.mo13488a("/video", zzf.zzblz);
            a.mo13488a("/videoMeta", zzf.zzbma);
            a.mo13488a("/precache", (zzv<? super C3832py>) new C3821pn<Object>());
            a.mo13488a("/delayPageLoaded", zzf.zzbmd);
            a.mo13488a("/instrument", zzf.zzbmb);
            a.mo13488a("/log", zzf.zzblu);
            a.mo13488a("/videoClicked", zzf.zzblv);
            a.mo13488a("/trackActiveViewUnit", (zzv<? super C3832py>) new C3438bj<Object>(this));
            a.mo13488a("/untrackActiveViewUnit", (zzv<? super C3832py>) new C3439bk<Object>(this));
            a.mo13527t().mo13542a((C3869rh) new C3436bh(a, jSONObject));
            a.mo13527t().mo13541a((C3868rg) new C3437bi(this, njVar, a));
            a.loadUrl((String) ane.m16650f().mo12297a(aqm.f12712bY));
        } catch (Exception e) {
            C3643iy.m19175c("Exception occurred while getting video view", e);
            njVar.mo13296b(null);
        }
    }
}
