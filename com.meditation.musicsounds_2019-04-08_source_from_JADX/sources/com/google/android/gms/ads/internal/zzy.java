package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.support.p009v4.p019g.C0488a;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.WebView;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.dynamic.C3327d;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3606ho;
import com.google.android.gms.internal.ads.C3610hs;
import com.google.android.gms.internal.ads.C3622id;
import com.google.android.gms.internal.ads.C3623ie;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.C3653jh;
import com.google.android.gms.internal.ads.C3832py;
import com.google.android.gms.internal.ads.C3871rj;
import com.google.android.gms.internal.ads.C3873rl;
import com.google.android.gms.internal.ads.ait;
import com.google.android.gms.internal.ads.aix;
import com.google.android.gms.internal.ads.ane;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.bas;
import com.google.android.gms.internal.ads.bbe;
import com.google.android.gms.internal.ads.bbi;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class zzy extends zzi implements OnGlobalLayoutListener, OnScrollChangedListener {

    /* renamed from: k */
    private boolean f10293k;

    /* renamed from: l */
    private boolean f10294l;

    /* renamed from: m */
    private WeakReference<Object> f10295m = new WeakReference<>(null);

    public zzy(Context context, zzjn zzjn, String str, bas bas, zzang zzang, zzw zzw) {
        super(context, zzjn, str, bas, zzang, zzw);
    }

    /* renamed from: a */
    private final boolean m13713a(C3622id idVar, C3622id idVar2) {
        if (idVar2.f14147n) {
            View zze = zzas.zze(idVar2);
            if (zze == null) {
                C3643iy.m19178e("Could not get mediation view");
                return false;
            }
            View nextView = this.f10120e.f10256c.getNextView();
            if (nextView != null) {
                if (nextView instanceof C3832py) {
                    ((C3832py) nextView).destroy();
                }
                this.f10120e.f10256c.removeView(nextView);
            }
            if (!zzas.zzf(idVar2)) {
                try {
                    if (zzbv.zzfh().mo13001b(this.f10120e.zzrt)) {
                        new ait(this.f10120e.zzrt, zze).mo11979a((aix) new C3610hs(this.f10120e.zzrt, this.f10120e.zzacp));
                    }
                    if (idVar2.f14154u != null) {
                        this.f10120e.f10256c.setMinimumWidth(idVar2.f14154u.f15504f);
                        this.f10120e.f10256c.setMinimumHeight(idVar2.f14154u.f15501c);
                    }
                    mo10110a(zze);
                } catch (Exception e) {
                    zzbv.zzeo().mo13047a((Throwable) e, "BannerAdManager.swapViews");
                    C3643iy.m19175c("Could not add mediation view to view hierarchy.", e);
                    return false;
                }
            }
        } else if (!(idVar2.f14154u == null || idVar2.f14135b == null)) {
            idVar2.f14135b.mo13486a(C3873rl.m19692a(idVar2.f14154u));
            this.f10120e.f10256c.removeAllViews();
            this.f10120e.f10256c.setMinimumWidth(idVar2.f14154u.f15504f);
            this.f10120e.f10256c.setMinimumHeight(idVar2.f14154u.f15501c);
            mo10110a(idVar2.f14135b.getView());
        }
        if (this.f10120e.f10256c.getChildCount() > 1) {
            this.f10120e.f10256c.showNext();
        }
        if (idVar != null) {
            View nextView2 = this.f10120e.f10256c.getNextView();
            if (nextView2 instanceof C3832py) {
                ((C3832py) nextView2).destroy();
            } else if (nextView2 != null) {
                this.f10120e.f10256c.removeView(nextView2);
            }
            this.f10120e.zzfn();
        }
        this.f10120e.f10256c.setVisibility(0);
        return true;
    }

    /* renamed from: c */
    private final void m13714c(C3832py pyVar) {
        if (mo10287j()) {
            WebView webView = pyVar.getWebView();
            if (webView != null) {
                View view = pyVar.getView();
                if (view != null && zzbv.zzfa().mo13345a(this.f10120e.zzrt)) {
                    int i = this.f10120e.zzacr.f15361b;
                    int i2 = this.f10120e.zzacr.f15362c;
                    StringBuilder sb = new StringBuilder(23);
                    sb.append(i);
                    sb.append(".");
                    sb.append(i2);
                    this.f10123h = zzbv.zzfa().mo13342a(sb.toString(), webView, "", "javascript", mo10121h());
                    if (this.f10123h != null) {
                        zzbv.zzfa().mo13344a(this.f10123h, view);
                        zzbv.zzfa().mo13343a(this.f10123h);
                        this.f10294l = true;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C3832py mo10193a(C3623ie ieVar, zzx zzx, C3606ho hoVar) {
        zzjn zzjn;
        AdSize adSize;
        if (this.f10120e.zzacv.f15505g == null && this.f10120e.zzacv.f15507i) {
            zzbw zzbw = this.f10120e;
            if (ieVar.f14161b.f15331y) {
                zzjn = this.f10120e.zzacv;
            } else {
                String str = ieVar.f14161b.f15318l;
                if (str != null) {
                    String[] split = str.split("[xX]");
                    split[0] = split[0].trim();
                    split[1] = split[1].trim();
                    adSize = new AdSize(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
                } else {
                    adSize = this.f10120e.zzacv.mo13982b();
                }
                zzjn = new zzjn(this.f10120e.zzrt, adSize);
            }
            zzbw.zzacv = zzjn;
        }
        return super.mo10193a(ieVar, zzx, hoVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10273a(C3622id idVar, boolean z) {
        if (mo10287j()) {
            C3832py pyVar = idVar != null ? idVar.f14135b : null;
            if (pyVar != null) {
                if (!this.f10294l) {
                    m13714c(pyVar);
                }
                if (this.f10123h != null) {
                    pyVar.mo12588a("onSdkImpression", (Map<String, ?>) new C0488a<String,Object>());
                }
            }
        }
        super.mo10273a(idVar, z);
        if (zzas.zzf(idVar)) {
            zzac zzac = new zzac(this);
            if (idVar != null && zzas.zzf(idVar)) {
                C3832py pyVar2 = idVar.f14135b;
                Object view = pyVar2 != null ? pyVar2.getView() : null;
                if (view == null) {
                    C3643iy.m19178e("AdWebView is null");
                    return;
                }
                try {
                    List list = idVar.f14148o != null ? idVar.f14148o.f13419r : null;
                    if (list != null) {
                        if (!list.isEmpty()) {
                            bbe h = idVar.f14149p != null ? idVar.f14149p.mo12703h() : null;
                            bbi i = idVar.f14149p != null ? idVar.f14149p.mo12704i() : null;
                            if (list.contains("2") && h != null) {
                                h.mo12717b(C3327d.m15136a(view));
                                if (!h.mo12726j()) {
                                    h.mo12725i();
                                }
                                pyVar2.mo13488a("/nativeExpressViewClicked", zzas.m13640a(h, null, zzac));
                                return;
                            } else if (!list.contains("1") || i == null) {
                                C3643iy.m19178e("No matching template id and mapper");
                                return;
                            } else {
                                i.mo12739b(C3327d.m15136a(view));
                                if (!i.mo12746h()) {
                                    i.mo12745g();
                                }
                                pyVar2.mo13488a("/nativeExpressViewClicked", zzas.m13640a(null, i, zzac));
                                return;
                            }
                        }
                    }
                    C3643iy.m19178e("No template ids present in mediation response");
                } catch (RemoteException e) {
                    C3643iy.m19175c("Error occurred while recording impression and registering for clicks", e);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo10296c(C3622id idVar) {
        if (idVar != null && !idVar.f14146m && this.f10120e.f10256c != null && zzbv.zzek().mo13129a((View) this.f10120e.f10256c, this.f10120e.zzrt) && this.f10120e.f10256c.getGlobalVisibleRect(new Rect(), null)) {
            if (!(idVar == null || idVar.f14135b == null || idVar.f14135b.mo13527t() == null)) {
                idVar.f14135b.mo13527t().mo13544a((C3871rj) null);
            }
            mo10273a(idVar, false);
            idVar.f14146m = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo10116d() {
        C3832py pyVar = this.f10120e.zzacw != null ? this.f10120e.zzacw.f14135b : null;
        if (!this.f10294l && pyVar != null) {
            m13714c(pyVar);
        }
        super.mo10116d();
    }

    public final aos getVideoController() {
        C3266s.m14922b("getVideoController must be called from the main thread.");
        if (this.f10120e.zzacw == null || this.f10120e.zzacw.f14135b == null) {
            return null;
        }
        return this.f10120e.zzacw.f14135b.mo13409b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo10275k() {
        boolean z;
        zzbv.zzek();
        if (!C3653jh.m18884a(this.f10120e.zzrt, "android.permission.INTERNET")) {
            ane.m16645a().mo13235a(this.f10120e.f10256c, this.f10120e.zzacv, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            z = false;
        } else {
            z = true;
        }
        zzbv.zzek();
        if (!C3653jh.m18883a(this.f10120e.zzrt)) {
            ane.m16645a().mo13235a(this.f10120e.f10256c, this.f10120e.zzacv, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            z = false;
        }
        if (!z && this.f10120e.f10256c != null) {
            this.f10120e.f10256c.setVisibility(0);
        }
        return z;
    }

    public final void onGlobalLayout() {
        mo10296c(this.f10120e.zzacw);
    }

    public final void onScrollChanged() {
        mo10296c(this.f10120e.zzacw);
    }

    public final void setManualImpressionsEnabled(boolean z) {
        C3266s.m14922b("setManualImpressionsEnabled must be called from the main thread.");
        this.f10293k = z;
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.ane.m16650f().mo12297a(com.google.android.gms.internal.ads.aqm.f12710bW)).booleanValue() != false) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(com.google.android.gms.internal.ads.C3622id r5, com.google.android.gms.internal.ads.C3622id r6) {
        /*
            r4 = this;
            boolean r0 = super.zza(r5, r6)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            com.google.android.gms.ads.internal.zzbw r0 = r4.f10120e
            boolean r0 = r0.zzfo()
            if (r0 == 0) goto L_0x0025
            boolean r5 = r4.m13713a(r5, r6)
            if (r5 != 0) goto L_0x0025
            com.google.android.gms.internal.ads.akv r5 = r6.f14125K
            if (r5 == 0) goto L_0x0021
            com.google.android.gms.internal.ads.akv r5 = r6.f14125K
            com.google.android.gms.internal.ads.zzhu$zza$zzb r6 = com.google.android.gms.internal.ads.zzhu.zza.zzb.AD_FAILED_TO_LOAD
            r5.mo12082a(r6)
        L_0x0021:
            r4.mo10108a(r1)
            return r1
        L_0x0025:
            r4.mo10274b(r6, r1)
            boolean r5 = r6.f14145l
            r0 = 0
            if (r5 == 0) goto L_0x0064
            r4.mo10296c(r6)
            com.google.android.gms.ads.internal.zzbv.zzfg()
            com.google.android.gms.ads.internal.zzbw r5 = r4.f10120e
            com.google.android.gms.ads.internal.zzbx r5 = r5.f10256c
            com.google.android.gms.internal.ads.C3771nr.m19228a(r5, r4)
            com.google.android.gms.ads.internal.zzbv.zzfg()
            com.google.android.gms.ads.internal.zzbw r5 = r4.f10120e
            com.google.android.gms.ads.internal.zzbx r5 = r5.f10256c
            com.google.android.gms.internal.ads.C3771nr.m19229a(r5, r4)
            boolean r5 = r6.f14146m
            if (r5 != 0) goto L_0x0081
            com.google.android.gms.ads.internal.b r5 = new com.google.android.gms.ads.internal.b
            r5.<init>(r4)
            com.google.android.gms.internal.ads.py r1 = r6.f14135b
            if (r1 == 0) goto L_0x0058
            com.google.android.gms.internal.ads.py r1 = r6.f14135b
            com.google.android.gms.internal.ads.rf r1 = r1.mo13527t()
            goto L_0x0059
        L_0x0058:
            r1 = r0
        L_0x0059:
            if (r1 == 0) goto L_0x0081
            com.google.android.gms.ads.internal.av r2 = new com.google.android.gms.ads.internal.av
            r2.<init>(r6, r5)
            r1.mo13544a(r2)
            goto L_0x0081
        L_0x0064:
            com.google.android.gms.ads.internal.zzbw r5 = r4.f10120e
            boolean r5 = r5.zzfp()
            if (r5 == 0) goto L_0x007e
            com.google.android.gms.internal.ads.aqc<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.aqm.f12710bW
            com.google.android.gms.internal.ads.aqk r2 = com.google.android.gms.internal.ads.ane.m16650f()
            java.lang.Object r5 = r2.mo12297a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0081
        L_0x007e:
            r4.mo10273a(r6, r1)
        L_0x0081:
            com.google.android.gms.internal.ads.py r5 = r6.f14135b
            if (r5 == 0) goto L_0x00a5
            com.google.android.gms.internal.ads.py r5 = r6.f14135b
            com.google.android.gms.internal.ads.qn r5 = r5.mo13409b()
            com.google.android.gms.internal.ads.py r1 = r6.f14135b
            com.google.android.gms.internal.ads.rf r1 = r1.mo13527t()
            if (r1 == 0) goto L_0x0096
            r1.mo13557g()
        L_0x0096:
            com.google.android.gms.ads.internal.zzbw r1 = r4.f10120e
            com.google.android.gms.internal.ads.zzmu r1 = r1.f10268o
            if (r1 == 0) goto L_0x00a5
            if (r5 == 0) goto L_0x00a5
            com.google.android.gms.ads.internal.zzbw r1 = r4.f10120e
            com.google.android.gms.internal.ads.zzmu r1 = r1.f10268o
            r5.mo13595a(r1)
        L_0x00a5:
            boolean r5 = com.google.android.gms.common.util.C3309n.m15070b()
            if (r5 == 0) goto L_0x0142
            com.google.android.gms.ads.internal.zzbw r5 = r4.f10120e
            boolean r5 = r5.zzfo()
            if (r5 == 0) goto L_0x011e
            com.google.android.gms.internal.ads.py r5 = r6.f14135b
            if (r5 == 0) goto L_0x0139
            org.json.JSONObject r5 = r6.f14144k
            if (r5 == 0) goto L_0x00c4
            com.google.android.gms.internal.ads.ahv r5 = r4.f10122g
            com.google.android.gms.ads.internal.zzbw r0 = r4.f10120e
            com.google.android.gms.internal.ads.zzjn r0 = r0.zzacv
            r5.mo11940a(r0, r6)
        L_0x00c4:
            com.google.android.gms.internal.ads.py r5 = r6.f14135b
            android.view.View r0 = r5.getView()
            com.google.android.gms.internal.ads.ait r5 = new com.google.android.gms.internal.ads.ait
            com.google.android.gms.ads.internal.zzbw r1 = r4.f10120e
            android.content.Context r1 = r1.zzrt
            r5.<init>(r1, r0)
            com.google.android.gms.internal.ads.ht r1 = com.google.android.gms.ads.internal.zzbv.zzfh()
            com.google.android.gms.ads.internal.zzbw r2 = r4.f10120e
            android.content.Context r2 = r2.zzrt
            boolean r1 = r1.mo13001b(r2)
            if (r1 == 0) goto L_0x0103
            com.google.android.gms.internal.ads.zzjj r1 = r6.f14134a
            boolean r1 = m13596a(r1)
            if (r1 == 0) goto L_0x0103
            com.google.android.gms.ads.internal.zzbw r1 = r4.f10120e
            java.lang.String r1 = r1.zzacp
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0103
            com.google.android.gms.internal.ads.hs r1 = new com.google.android.gms.internal.ads.hs
            com.google.android.gms.ads.internal.zzbw r2 = r4.f10120e
            android.content.Context r2 = r2.zzrt
            com.google.android.gms.ads.internal.zzbw r3 = r4.f10120e
            java.lang.String r3 = r3.zzacp
            r1.<init>(r2, r3)
            r5.mo11979a(r1)
        L_0x0103:
            boolean r1 = r6.mo13023a()
            if (r1 == 0) goto L_0x010f
            com.google.android.gms.internal.ads.py r1 = r6.f14135b
            r5.mo11979a(r1)
            goto L_0x0139
        L_0x010f:
            com.google.android.gms.internal.ads.py r1 = r6.f14135b
            com.google.android.gms.internal.ads.rf r1 = r1.mo13527t()
            com.google.android.gms.ads.internal.a r2 = new com.google.android.gms.ads.internal.a
            r2.<init>(r5, r6)
            r1.mo13543a(r2)
            goto L_0x0139
        L_0x011e:
            com.google.android.gms.ads.internal.zzbw r5 = r4.f10120e
            android.view.View r5 = r5.f10276w
            if (r5 == 0) goto L_0x0139
            org.json.JSONObject r5 = r6.f14144k
            if (r5 == 0) goto L_0x0139
            com.google.android.gms.internal.ads.ahv r5 = r4.f10122g
            com.google.android.gms.ads.internal.zzbw r0 = r4.f10120e
            com.google.android.gms.internal.ads.zzjn r0 = r0.zzacv
            com.google.android.gms.ads.internal.zzbw r1 = r4.f10120e
            android.view.View r1 = r1.f10276w
            r5.mo11941a(r0, r6, r1)
            com.google.android.gms.ads.internal.zzbw r5 = r4.f10120e
            android.view.View r0 = r5.f10276w
        L_0x0139:
            boolean r5 = r6.f14147n
            if (r5 != 0) goto L_0x0142
            com.google.android.gms.ads.internal.zzbw r5 = r4.f10120e
            r5.mo10254a(r0)
        L_0x0142:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzy.zza(com.google.android.gms.internal.ads.id, com.google.android.gms.internal.ads.id):boolean");
    }

    public final boolean zzb(zzjj zzjj) {
        zzjj zzjj2 = zzjj;
        if (zzjj2.f15488h != this.f10293k) {
            zzjj zzjj3 = new zzjj(zzjj2.f15481a, zzjj2.f15482b, zzjj2.f15483c, zzjj2.f15484d, zzjj2.f15485e, zzjj2.f15486f, zzjj2.f15487g, zzjj2.f15488h || this.f10293k, zzjj2.f15489i, zzjj2.f15490j, zzjj2.f15491k, zzjj2.f15492l, zzjj2.f15493m, zzjj2.f15494n, zzjj2.f15495o, zzjj2.f15496p, zzjj2.f15497q, zzjj2.f15498r);
            zzjj2 = zzjj3;
        }
        return super.zzb(zzjj2);
    }

    public final void zzcz() {
        this.f10119d.zzdy();
    }
}
