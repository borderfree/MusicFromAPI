package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3622id;
import com.google.android.gms.internal.ads.C3623ie;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.C3653jh;
import com.google.android.gms.internal.ads.C3731me;
import com.google.android.gms.internal.ads.C3832py;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.arf;
import com.google.android.gms.internal.ads.arq;
import com.google.android.gms.internal.ads.ars;
import com.google.android.gms.internal.ads.arx;
import com.google.android.gms.internal.ads.arz;
import com.google.android.gms.internal.ads.asa;
import com.google.android.gms.internal.ads.asb;
import com.google.android.gms.internal.ads.asd;
import com.google.android.gms.internal.ads.ase;
import com.google.android.gms.internal.ads.asy;
import com.google.android.gms.internal.ads.atu;
import com.google.android.gms.internal.ads.auf;
import com.google.android.gms.internal.ads.bac;
import com.google.android.gms.internal.ads.bas;
import com.google.android.gms.internal.ads.bbe;
import com.google.android.gms.internal.ads.bbi;
import com.google.android.gms.internal.ads.bbl;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class zzq extends zzd implements asd {

    /* renamed from: k */
    private boolean f10286k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C3622id f10287l;

    /* renamed from: m */
    private boolean f10288m = false;

    public zzq(Context context, zzw zzw, zzjn zzjn, String str, bas bas, zzang zzang) {
        super(context, zzjn, str, bas, zzang, zzw);
    }

    /* renamed from: a */
    private static C3622id m13704a(C3623ie ieVar, int i) {
        C3623ie ieVar2 = ieVar;
        C3622id idVar = new C3622id(ieVar2.f14160a.f15259c, null, ieVar2.f14161b.f15309c, i, ieVar2.f14161b.f15311e, ieVar2.f14161b.f15315i, ieVar2.f14161b.f15317k, ieVar2.f14161b.f15316j, ieVar2.f14160a.f15265i, ieVar2.f14161b.f15313g, null, null, null, ieVar2.f14162c, null, ieVar2.f14161b.f15314h, ieVar2.f14163d, ieVar2.f14161b.f15312f, ieVar2.f14165f, ieVar2.f14166g, ieVar2.f14161b.f15320n, ieVar2.f14167h, null, ieVar2.f14161b.f15283A, ieVar2.f14161b.f15284B, ieVar2.f14161b.f15284B, ieVar2.f14161b.f15286D, ieVar2.f14161b.f15287E, null, ieVar2.f14161b.f15290H, ieVar2.f14161b.f15294L, ieVar2.f14168i, ieVar2.f14161b.f15297O, ieVar2.f14169j, ieVar2.f14161b.f15299Q, ieVar2.f14161b.f15300R, ieVar2.f14161b.f15301S, ieVar2.f14161b.f15302T);
        return idVar;
    }

    /* renamed from: a */
    private final void m13705a(arx arx) {
        C3653jh.f14275a.post(new C2869ar(this, arx));
    }

    /* renamed from: a */
    private final boolean m13706a(C3622id idVar, C3622id idVar2) {
        Handler handler;
        Runnable atVar;
        arx arx;
        C3622id idVar3 = idVar2;
        View view = null;
        zzd(null);
        if (!this.f10120e.zzfo()) {
            C3643iy.m19178e("Native ad does not have custom rendering mode.");
        } else {
            try {
                bbl p = idVar3.f14149p != null ? idVar3.f14149p.mo12711p() : null;
                bbe h = idVar3.f14149p != null ? idVar3.f14149p.mo12703h() : null;
                bbi i = idVar3.f14149p != null ? idVar3.f14149p.mo12704i() : null;
                atu n = idVar3.f14149p != null ? idVar3.f14149p.mo12709n() : null;
                String b = m13690b(idVar2);
                if (p != null && this.f10120e.f10264k != null) {
                    String a = p.mo12754a();
                    List b2 = p.mo12757b();
                    String c = p.mo12759c();
                    asy d = p.mo12760d() != null ? p.mo12760d() : null;
                    String e = p.mo12761e();
                    String f = p.mo12762f();
                    double g = p.mo12763g();
                    String h2 = p.mo12764h();
                    String i2 = p.mo12765i();
                    aos j = p.mo12766j();
                    if (p.mo12769m() != null) {
                        view = (View) C3327d.m15137a(p.mo12769m());
                    }
                    arx = new arx(a, b2, c, d, e, f, g, h2, i2, null, j, view, p.mo12770n(), b, p.mo12771o());
                    asa asa = new asa(this.f10120e.zzrt, (asd) this, this.f10120e.f10255b, p, (ase) arx);
                    arx.mo12359a((asb) asa);
                } else if (h == null || this.f10120e.f10264k == null) {
                    if (h != null && this.f10120e.f10262i != null) {
                        String a2 = h.mo12713a();
                        List b3 = h.mo12716b();
                        String c2 = h.mo12718c();
                        asy d2 = h.mo12720d() != null ? h.mo12720d() : null;
                        String e2 = h.mo12721e();
                        double f2 = h.mo12722f();
                        String g2 = h.mo12723g();
                        String h3 = h.mo12724h();
                        Bundle l = h.mo12728l();
                        aos m = h.mo12729m();
                        if (h.mo12732p() != null) {
                            view = (View) C3327d.m15137a(h.mo12732p());
                        }
                        arq arq = new arq(a2, b3, c2, d2, e2, f2, g2, h3, null, l, m, view, h.mo12733q(), b);
                        asa asa2 = new asa(this.f10120e.zzrt, (asd) this, this.f10120e.f10255b, h, (ase) arq);
                        arq.mo12359a((asb) asa2);
                        handler = C3653jh.f14275a;
                        atVar = new C2870as(this, arq);
                    } else if (i != null && this.f10120e.f10264k != null) {
                        String a3 = i.mo12735a();
                        List b4 = i.mo12738b();
                        String c3 = i.mo12740c();
                        asy d3 = i.mo12742d() != null ? i.mo12742d() : null;
                        String e3 = i.mo12743e();
                        String f3 = i.mo12744f();
                        aos l2 = i.mo12750l();
                        if (i.mo12752n() != null) {
                            view = (View) C3327d.m15137a(i.mo12752n());
                        }
                        arx arx2 = new arx(a3, b4, c3, d3, e3, f3, -1.0d, null, null, null, l2, view, i.mo12753o(), b, i.mo12748j());
                        bbi bbi = i;
                        arx = arx2;
                        asa asa3 = new asa(this.f10120e.zzrt, (asd) this, this.f10120e.f10255b, bbi, (ase) arx2);
                        arx.mo12359a((asb) asa3);
                    } else if (i != null && this.f10120e.f10263j != null) {
                        String a4 = i.mo12735a();
                        List b5 = i.mo12738b();
                        String c4 = i.mo12740c();
                        asy d4 = i.mo12742d() != null ? i.mo12742d() : null;
                        String e4 = i.mo12743e();
                        String f4 = i.mo12744f();
                        Bundle j2 = i.mo12748j();
                        aos l3 = i.mo12750l();
                        if (i.mo12752n() != null) {
                            view = (View) C3327d.m15137a(i.mo12752n());
                        }
                        ars ars = new ars(a4, b5, c4, d4, e4, f4, null, j2, l3, view, i.mo12753o(), b);
                        bbi bbi2 = i;
                        ars ars2 = ars;
                        asa asa4 = new asa(this.f10120e.zzrt, (asd) this, this.f10120e.f10255b, bbi2, (ase) ars);
                        ars2.mo12359a((asb) asa4);
                        handler = C3653jh.f14275a;
                        atVar = new C2871at(this, ars2);
                    } else if (n == null || this.f10120e.f10266m == null || this.f10120e.f10266m.get(n.mo12372l()) == null) {
                        C3643iy.m19178e("No matching mapper/listener for retrieved native ad template.");
                        mo10108a(0);
                        return false;
                    } else {
                        C3653jh.f14275a.post(new C2872au(this, n));
                        return super.zza(idVar, idVar2);
                    }
                    handler.post(atVar);
                    return super.zza(idVar, idVar2);
                } else {
                    String a5 = h.mo12713a();
                    List b6 = h.mo12716b();
                    String c5 = h.mo12718c();
                    asy d5 = h.mo12720d() != null ? h.mo12720d() : null;
                    String e5 = h.mo12721e();
                    double f5 = h.mo12722f();
                    String g3 = h.mo12723g();
                    String h4 = h.mo12724h();
                    aos m2 = h.mo12729m();
                    if (h.mo12732p() != null) {
                        view = (View) C3327d.m15137a(h.mo12732p());
                    }
                    arx = new arx(a5, b6, c5, d5, e5, null, f5, g3, h4, null, m2, view, h.mo12733q(), b, h.mo12728l());
                    asa asa5 = new asa(this.f10120e.zzrt, (asd) this, this.f10120e.f10255b, h, (ase) arx);
                    arx.mo12359a((asb) asa5);
                }
                m13705a(arx);
                return super.zza(idVar, idVar2);
            } catch (RemoteException e6) {
                C3643iy.m19177d("#007 Could not call remote method.", e6);
            }
        }
        mo10108a(0);
        return false;
    }

    /* renamed from: b */
    private final boolean m13707b(C3622id idVar, C3622id idVar2) {
        View zze = zzas.zze(idVar2);
        if (zze == null) {
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
                mo10110a(zze);
            } catch (Throwable th) {
                zzbv.zzeo().mo13047a(th, "AdLoaderManager.swapBannerViews");
                C3643iy.m19175c("Could not add mediation view to view hierarchy.", th);
                return false;
            }
        }
        if (this.f10120e.f10256c.getChildCount() > 1) {
            this.f10120e.f10256c.showNext();
        }
        if (idVar != null) {
            View nextView2 = this.f10120e.f10256c.getNextView();
            if (nextView2 != null) {
                this.f10120e.f10256c.removeView(nextView2);
            }
            this.f10120e.zzfn();
        }
        this.f10120e.f10256c.setMinimumWidth(zzbk().f15504f);
        this.f10120e.f10256c.setMinimumHeight(zzbk().f15501c);
        this.f10120e.f10256c.requestLayout();
        this.f10120e.f10256c.setVisibility(0);
        return true;
    }

    /* renamed from: i */
    private final bac m13708i() {
        if (this.f10120e.zzacw == null || !this.f10120e.zzacw.f14147n) {
            return null;
        }
        return this.f10120e.zzacw.f14151r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10290a(C3323b bVar) {
        Object a = bVar != null ? C3327d.m15137a(bVar) : null;
        if (a instanceof asb) {
            ((asb) a).mo12442d();
        }
        super.mo10274b(this.f10120e.zzacw, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo10194a(zzjj zzjj, C3622id idVar, boolean z) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo10116d() {
        super.mo10116d();
        C3622id idVar = this.f10120e.zzacw;
        if (!(idVar == null || idVar.f14148o == null || !idVar.f14148o.mo12656a() || this.f10120e.f10270q == null)) {
            try {
                this.f10120e.f10270q.mo12515a(this, C3327d.m15136a(this.f10120e.zzrt));
                super.mo10274b(this.f10120e.zzacw, false);
            } catch (RemoteException e) {
                C3643iy.m19177d("#007 Could not call remote method.", e);
            }
        }
    }

    public final aos getVideoController() {
        return null;
    }

    public final void pause() {
        if (this.f10288m) {
            super.pause();
            return;
        }
        throw new IllegalStateException("Native Ad does not support pause().");
    }

    public final void resume() {
        if (this.f10288m) {
            super.resume();
            return;
        }
        throw new IllegalStateException("Native Ad does not support resume().");
    }

    public final void setManualImpressionsEnabled(boolean z) {
        C3266s.m14922b("setManualImpressionsEnabled must be called from the main thread.");
        this.f10286k = z;
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is not supported by AdLoaderManager.");
    }

    public final void zza(arf arf) {
        throw new IllegalStateException("CustomRendering is not supported by AdLoaderManager.");
    }

    public final void zza(arz arz) {
        C3731me.m19177d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    public final void zza(asb asb) {
        C3731me.m19177d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.ads.C3623ie r11, com.google.android.gms.internal.ads.aqz r12) {
        /*
            r10 = this;
            r0 = 0
            r10.f10287l = r0
            int r0 = r11.f14164e
            r1 = 0
            r2 = -2
            if (r0 == r2) goto L_0x0012
            int r0 = r11.f14164e
            com.google.android.gms.internal.ads.id r0 = m13704a(r11, r0)
        L_0x000f:
            r10.f10287l = r0
            goto L_0x0022
        L_0x0012:
            com.google.android.gms.internal.ads.zzaej r0 = r11.f14161b
            boolean r0 = r0.f15313g
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "partialAdState is not mediation"
            com.google.android.gms.internal.ads.C3643iy.m19178e(r0)
            com.google.android.gms.internal.ads.id r0 = m13704a(r11, r1)
            goto L_0x000f
        L_0x0022:
            com.google.android.gms.internal.ads.id r0 = r10.f10287l
            if (r0 == 0) goto L_0x0031
            android.os.Handler r11 = com.google.android.gms.internal.ads.C3653jh.f14275a
            com.google.android.gms.ads.internal.aq r12 = new com.google.android.gms.ads.internal.aq
            r12.<init>(r10)
            r11.post(r12)
            return
        L_0x0031:
            com.google.android.gms.internal.ads.zzjn r0 = r11.f14163d
            if (r0 == 0) goto L_0x003b
            com.google.android.gms.ads.internal.zzbw r0 = r10.f10120e
            com.google.android.gms.internal.ads.zzjn r2 = r11.f14163d
            r0.zzacv = r2
        L_0x003b:
            com.google.android.gms.ads.internal.zzbw r0 = r10.f10120e
            r0.zzadv = r1
            com.google.android.gms.ads.internal.zzbw r0 = r10.f10120e
            com.google.android.gms.ads.internal.zzbv.zzej()
            com.google.android.gms.ads.internal.zzbw r1 = r10.f10120e
            android.content.Context r2 = r1.zzrt
            com.google.android.gms.ads.internal.zzbw r1 = r10.f10120e
            com.google.android.gms.internal.ads.afm r5 = r1.f10255b
            r6 = 0
            com.google.android.gms.internal.ads.bas r7 = r10.f10283j
            r3 = r10
            r4 = r11
            r8 = r10
            r9 = r12
            com.google.android.gms.internal.ads.ka r11 = com.google.android.gms.internal.ads.C3411am.m16559a(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.zzacu = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzq.zza(com.google.android.gms.internal.ads.ie, com.google.android.gms.internal.ads.aqz):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(com.google.android.gms.internal.ads.C3622id r5, com.google.android.gms.internal.ads.C3622id r6) {
        /*
            r4 = this;
            com.google.android.gms.ads.internal.zzbw r0 = r4.f10120e
            boolean r0 = r0.zzfo()
            if (r0 == 0) goto L_0x009a
            boolean r0 = r6.f14147n
            r1 = 0
            if (r0 != 0) goto L_0x0016
            r4.mo10108a(r1)
            java.lang.String r5 = "newState is not mediation."
        L_0x0012:
            com.google.android.gms.internal.ads.C3643iy.m19178e(r5)
            return r1
        L_0x0016:
            com.google.android.gms.internal.ads.bab r0 = r6.f14148o
            r2 = 1
            if (r0 == 0) goto L_0x006a
            com.google.android.gms.internal.ads.bab r0 = r6.f14148o
            boolean r0 = r0.mo12656a()
            if (r0 == 0) goto L_0x006a
            com.google.android.gms.ads.internal.zzbw r0 = r4.f10120e
            boolean r0 = r0.zzfo()
            if (r0 == 0) goto L_0x003e
            com.google.android.gms.ads.internal.zzbw r0 = r4.f10120e
            com.google.android.gms.ads.internal.zzbx r0 = r0.f10256c
            if (r0 == 0) goto L_0x003e
            com.google.android.gms.ads.internal.zzbw r0 = r4.f10120e
            com.google.android.gms.ads.internal.zzbx r0 = r0.f10256c
            com.google.android.gms.internal.ads.kb r0 = r0.zzfr()
            java.lang.String r3 = r6.f14115A
            r0.mo13183c(r3)
        L_0x003e:
            boolean r0 = super.zza(r5, r6)
            if (r0 != 0) goto L_0x0046
        L_0x0044:
            r5 = 0
            goto L_0x0064
        L_0x0046:
            com.google.android.gms.ads.internal.zzbw r0 = r4.f10120e
            boolean r0 = r0.zzfo()
            if (r0 == 0) goto L_0x0058
            boolean r5 = r4.m13707b(r5, r6)
            if (r5 != 0) goto L_0x0058
            r4.mo10108a(r1)
            goto L_0x0044
        L_0x0058:
            com.google.android.gms.ads.internal.zzbw r5 = r4.f10120e
            boolean r5 = r5.zzfp()
            if (r5 != 0) goto L_0x0063
            super.mo10273a(r6, r1)
        L_0x0063:
            r5 = 1
        L_0x0064:
            if (r5 != 0) goto L_0x0067
            return r1
        L_0x0067:
            r4.f10288m = r2
            goto L_0x007d
        L_0x006a:
            com.google.android.gms.internal.ads.bab r0 = r6.f14148o
            if (r0 == 0) goto L_0x0093
            com.google.android.gms.internal.ads.bab r0 = r6.f14148o
            boolean r0 = r0.mo12657b()
            if (r0 == 0) goto L_0x0093
            boolean r5 = r4.m13706a(r5, r6)
            if (r5 != 0) goto L_0x007d
            return r1
        L_0x007d:
            java.util.ArrayList r5 = new java.util.ArrayList
            java.lang.Integer[] r6 = new java.lang.Integer[r2]
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r1] = r0
            java.util.List r6 = java.util.Arrays.asList(r6)
            r5.<init>(r6)
            r4.zze(r5)
            return r2
        L_0x0093:
            r4.mo10108a(r1)
            java.lang.String r5 = "Response is neither banner nor native."
            goto L_0x0012
        L_0x009a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "AdLoader API does not support custom rendering."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzq.zza(com.google.android.gms.internal.ads.id, com.google.android.gms.internal.ads.id):boolean");
    }

    public final boolean zzb(zzjj zzjj) {
        zzjj zzjj2 = zzjj;
        if (this.f10120e.f10271r != null && this.f10120e.f10271r.size() == 1 && ((Integer) this.f10120e.f10271r.get(0)).intValue() == 2) {
            C3643iy.m19174c("Requesting only banner Ad from AdLoader or calling loadAd on returned banner is not yet supported");
            mo10108a(0);
            return false;
        } else if (this.f10120e.f10270q == null) {
            return super.zzb(zzjj);
        } else {
            if (zzjj2.f15488h != this.f10286k) {
                zzjj zzjj3 = new zzjj(zzjj2.f15481a, zzjj2.f15482b, zzjj2.f15483c, zzjj2.f15484d, zzjj2.f15485e, zzjj2.f15486f, zzjj2.f15487g, zzjj2.f15488h || this.f10286k, zzjj2.f15489i, zzjj2.f15490j, zzjj2.f15491k, zzjj2.f15492l, zzjj2.f15493m, zzjj2.f15494n, zzjj2.f15495o, zzjj2.f15496p, zzjj2.f15497q, zzjj2.f15498r);
                zzjj2 = zzjj3;
            }
            return super.zzb(zzjj2);
        }
    }

    public final void zzce() {
        if (this.f10120e.zzacw == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.f10120e.zzacw.f14150q) || this.f10120e.zzacw.f14148o == null || !this.f10120e.zzacw.f14148o.mo12657b()) {
            super.zzce();
        } else {
            zzbs();
        }
    }

    public final void zzcj() {
        if (this.f10120e.zzacw == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.f10120e.zzacw.f14150q) || this.f10120e.zzacw.f14148o == null || !this.f10120e.zzacw.f14148o.mo12657b()) {
            super.zzcj();
        } else {
            zzbr();
        }
    }

    public final void zzcr() {
        C3731me.m19177d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    public final void zzcs() {
        C3731me.m19177d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    public final void zzct() {
        C3731me.m19177d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    public final boolean zzcu() {
        if (m13708i() != null) {
            return m13708i().f13438p;
        }
        return false;
    }

    public final boolean zzcv() {
        if (m13708i() != null) {
            return m13708i().f13439q;
        }
        return false;
    }

    public final void zzd(List<String> list) {
        C3266s.m14922b("setNativeTemplates must be called on the main UI thread.");
        this.f10120e.f10275v = list;
    }

    public final void zze(List<Integer> list) {
        C3266s.m14922b("setAllowedAdTypes must be called on the main UI thread.");
        this.f10120e.f10271r = list;
    }

    public final void zzi(View view) {
        C3731me.m19177d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    public final auf zzr(String str) {
        C3266s.m14922b("getOnCustomClickListener must be called on the main UI thread.");
        return (auf) this.f10120e.f10265l.get(str);
    }
}
