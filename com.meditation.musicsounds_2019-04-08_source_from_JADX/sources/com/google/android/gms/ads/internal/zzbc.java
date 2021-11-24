package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.p009v4.p019g.C0510m;
import android.util.Log;
import android.view.View;
import com.google.ads.AdRequest;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import com.google.android.gms.internal.ads.C3411am;
import com.google.android.gms.internal.ads.C3442bn;
import com.google.android.gms.internal.ads.C3446br;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3622id;
import com.google.android.gms.internal.ads.C3623ie;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.C3651jf;
import com.google.android.gms.internal.ads.C3653jh;
import com.google.android.gms.internal.ads.C3731me;
import com.google.android.gms.internal.ads.C3751my;
import com.google.android.gms.internal.ads.C3763nj;
import com.google.android.gms.internal.ads.C3832py;
import com.google.android.gms.internal.ads.C4054x;
import com.google.android.gms.internal.ads.ahy;
import com.google.android.gms.internal.ads.ajh;
import com.google.android.gms.internal.ads.ane;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.aov;
import com.google.android.gms.internal.ads.aqm;
import com.google.android.gms.internal.ads.aqz;
import com.google.android.gms.internal.ads.arf;
import com.google.android.gms.internal.ads.arq;
import com.google.android.gms.internal.ads.ars;
import com.google.android.gms.internal.ads.aru;
import com.google.android.gms.internal.ads.arx;
import com.google.android.gms.internal.ads.arz;
import com.google.android.gms.internal.ads.asa;
import com.google.android.gms.internal.ads.asb;
import com.google.android.gms.internal.ads.asd;
import com.google.android.gms.internal.ads.ase;
import com.google.android.gms.internal.ads.asy;
import com.google.android.gms.internal.ads.atu;
import com.google.android.gms.internal.ads.auf;
import com.google.android.gms.internal.ads.aui;
import com.google.android.gms.internal.ads.bac;
import com.google.android.gms.internal.ads.bas;
import com.google.android.gms.internal.ads.bav;
import com.google.android.gms.internal.ads.bbe;
import com.google.android.gms.internal.ads.bbi;
import com.google.android.gms.internal.ads.bbl;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3464ci
public final class zzbc extends zzd implements asd {

    /* renamed from: k */
    private final Object f10188k;

    /* renamed from: l */
    private boolean f10189l;

    /* renamed from: m */
    private C3763nj<ase> f10190m;

    /* renamed from: n */
    private C3832py f10191n;

    /* renamed from: o */
    private C3832py f10192o;

    /* renamed from: p */
    private boolean f10193p;

    /* renamed from: q */
    private int f10194q;
    @GuardedBy("mLock")

    /* renamed from: r */
    private C3442bn f10195r;

    /* renamed from: s */
    private final String f10196s;

    public zzbc(Context context, zzw zzw, zzjn zzjn, String str, bas bas, zzang zzang) {
        this(context, zzw, zzjn, str, bas, zzang, false);
    }

    public zzbc(Context context, zzw zzw, zzjn zzjn, String str, bas bas, zzang zzang, boolean z) {
        super(context, zzjn, str, bas, zzang, zzw);
        this.f10188k = new Object();
        this.f10190m = new C3763nj<>();
        this.f10194q = 1;
        this.f10196s = UUID.randomUUID().toString();
        this.f10189l = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m13653a(zzbw zzbw, zzbw zzbw2) {
        if (zzbw2.f10262i == null) {
            zzbw2.f10262i = zzbw.f10262i;
        }
        if (zzbw2.f10263j == null) {
            zzbw2.f10263j = zzbw.f10263j;
        }
        if (zzbw2.f10265l == null) {
            zzbw2.f10265l = zzbw.f10265l;
        }
        if (zzbw2.f10266m == null) {
            zzbw2.f10266m = zzbw.f10266m;
        }
        if (zzbw2.f10268o == null) {
            zzbw2.f10268o = zzbw.f10268o;
        }
        if (zzbw2.f10267n == null) {
            zzbw2.f10267n = zzbw.f10267n;
        }
        if (zzbw2.f10275v == null) {
            zzbw2.f10275v = zzbw.f10275v;
        }
        if (zzbw2.zzacy == null) {
            zzbw2.zzacy = zzbw.zzacy;
        }
        if (zzbw2.zzadt == null) {
            zzbw2.zzadt = zzbw.zzadt;
        }
        if (zzbw2.f10257d == null) {
            zzbw2.f10257d = zzbw.f10257d;
        }
        if (zzbw2.f10258e == null) {
            zzbw2.f10258e = zzbw.f10258e;
        }
        if (zzbw2.zzacv == null) {
            zzbw2.zzacv = zzbw.zzacv;
        }
        if (zzbw2.zzacw == null) {
            zzbw2.zzacw = zzbw.zzacw;
        }
        if (zzbw2.zzacx == null) {
            zzbw2.zzacx = zzbw.zzacx;
        }
    }

    /* renamed from: a */
    private final void m13654a(arq arq) {
        C3653jh.f14275a.post(new C2920u(this, arq));
    }

    /* renamed from: a */
    private final void m13655a(ars ars) {
        C3653jh.f14275a.post(new C2922w(this, ars));
    }

    /* renamed from: a */
    private final void m13656a(arx arx) {
        C3653jh.f14275a.post(new C2921v(this, arx));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a8  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.arx m13657b(com.google.android.gms.internal.ads.ase r20) {
        /*
            r0 = r20
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.ars
            r2 = 0
            if (r1 == 0) goto L_0x0053
            com.google.android.gms.internal.ads.ars r0 = (com.google.android.gms.internal.ads.ars) r0
            com.google.android.gms.internal.ads.arx r1 = new com.google.android.gms.internal.ads.arx
            r3 = r1
            java.lang.String r4 = r0.mo12381a()
            java.util.List r5 = r0.mo12360b()
            java.lang.String r6 = r0.mo12387e()
            com.google.android.gms.internal.ads.asy r7 = r0.mo12388f()
            java.lang.String r8 = r0.mo12389g()
            java.lang.String r9 = r0.mo12390h()
            r10 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r12 = 0
            r13 = 0
            com.google.android.gms.internal.ads.arl r14 = r0.mo12373m()
            com.google.android.gms.internal.ads.aos r15 = r0.mo12391i()
            android.view.View r16 = r0.mo12375o()
            com.google.android.gms.dynamic.b r17 = r0.mo12384c()
            java.lang.String r18 = r0.mo12386d()
            android.os.Bundle r19 = r0.mo12393n()
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19)
            com.google.android.gms.dynamic.b r3 = r0.mo12392j()
            if (r3 == 0) goto L_0x00a4
            com.google.android.gms.dynamic.b r0 = r0.mo12392j()
        L_0x004d:
            java.lang.Object r0 = com.google.android.gms.dynamic.C3327d.m15137a(r0)
            r2 = r0
            goto L_0x00a4
        L_0x0053:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.arq
            if (r1 == 0) goto L_0x00a3
            com.google.android.gms.internal.ads.arq r0 = (com.google.android.gms.internal.ads.arq) r0
            com.google.android.gms.internal.ads.arx r1 = new com.google.android.gms.internal.ads.arx
            r3 = r1
            java.lang.String r4 = r0.mo12357a()
            java.util.List r5 = r0.mo12360b()
            java.lang.String r6 = r0.mo12362c()
            com.google.android.gms.internal.ads.asy r7 = r0.mo12364d()
            java.lang.String r8 = r0.mo12365e()
            r9 = 0
            double r10 = r0.mo12366f()
            java.lang.String r12 = r0.mo12367g()
            java.lang.String r13 = r0.mo12368h()
            com.google.android.gms.internal.ads.arl r14 = r0.mo12373m()
            com.google.android.gms.internal.ads.aos r15 = r0.mo12369i()
            android.view.View r16 = r0.mo12375o()
            com.google.android.gms.dynamic.b r17 = r0.mo12376p()
            java.lang.String r18 = r0.mo12377q()
            android.os.Bundle r19 = r0.mo12374n()
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19)
            com.google.android.gms.dynamic.b r3 = r0.mo12370j()
            if (r3 == 0) goto L_0x00a4
            com.google.android.gms.dynamic.b r0 = r0.mo12370j()
            goto L_0x004d
        L_0x00a3:
            r1 = r2
        L_0x00a4:
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.asg
            if (r0 == 0) goto L_0x00ad
            com.google.android.gms.internal.ads.asg r2 = (com.google.android.gms.internal.ads.asg) r2
            r1.mo12359a(r2)
        L_0x00ad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzbc.m13657b(com.google.android.gms.internal.ads.ase):com.google.android.gms.internal.ads.arx");
    }

    /* renamed from: l */
    private final boolean m13658l() {
        return this.f10120e.zzacw != null && this.f10120e.zzacw.f14128N;
    }

    /* renamed from: m */
    private final bac m13659m() {
        if (this.f10120e.zzacw == null || !this.f10120e.zzacw.f14147n) {
            return null;
        }
        return this.f10120e.zzacw.f14151r;
    }

    /* renamed from: n */
    private final void m13660n() {
        C3442bn zzdr = zzdr();
        if (zzdr != null) {
            zzdr.mo12816a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10108a(int i) {
        mo10109a(i, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10109a(int i, boolean z) {
        m13660n();
        super.mo10109a(i, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10211a(C3323b bVar) {
        Object a = bVar != null ? C3327d.m15137a(bVar) : null;
        if (a instanceof asb) {
            ((asb) a).mo12442d();
        }
        super.mo10274b(this.f10120e.zzacw, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10112a(boolean z) {
        String str;
        super.mo10112a(z);
        if (this.f10193p) {
            if (((Boolean) ane.m16650f().mo12297a(aqm.f12773cg)).booleanValue()) {
                zzdt();
            }
        }
        if (!m13658l()) {
            return;
        }
        if (this.f10192o != null || this.f10191n != null) {
            C3832py pyVar = null;
            if (this.f10192o != null) {
                str = null;
                pyVar = this.f10192o;
            } else if (this.f10191n != null) {
                pyVar = this.f10191n;
                str = "javascript";
            } else {
                str = null;
            }
            if (pyVar.getWebView() != null && zzbv.zzfa().mo13345a(this.f10120e.zzrt)) {
                int i = this.f10120e.zzacr.f15361b;
                int i2 = this.f10120e.zzacr.f15362c;
                StringBuilder sb = new StringBuilder(23);
                sb.append(i);
                sb.append(".");
                sb.append(i2);
                this.f10123h = zzbv.zzfa().mo13342a(sb.toString(), pyVar.getWebView(), "", "javascript", str);
                if (this.f10123h != null) {
                    zzbv.zzfa().mo13343a(this.f10123h);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo10194a(zzjj zzjj, C3622id idVar, boolean z) {
        return this.f10119d.zzdz();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo10116d() {
        mo10112a(false);
    }

    public final String getAdUnitId() {
        return this.f10120e.zzacp;
    }

    public final String getUuid() {
        return this.f10196s;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final void mo10213i() {
        synchronized (this.f10188k) {
            C3643iy.m18780a("Initializing webview native ads utills");
            C3446br brVar = new C3446br(this.f10120e.zzrt, this, this.f10196s, this.f10120e.f10255b, this.f10120e.zzacr);
            this.f10195r = brVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Future<ase> mo10214j() {
        return this.f10190m;
    }

    public final void pause() {
        throw new IllegalStateException("Native Ad DOES NOT support pause().");
    }

    public final void resume() {
        throw new IllegalStateException("Native Ad DOES NOT support resume().");
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }

    public final void zza(arf arf) {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    public final void zza(arz arz) {
        if (this.f10191n != null) {
            this.f10191n.mo13485a(arz);
        }
    }

    public final void zza(asb asb) {
        if (this.f10120e.zzacw.f14144k != null) {
            zzbv.zzeo().mo13055g().mo11943a(this.f10120e.zzacv, this.f10120e.zzacw, (ajh) new ahy(asb), (C3832py) null);
        }
    }

    public final void zza(C3623ie ieVar, aqz aqz) {
        if (ieVar.f14163d != null) {
            this.f10120e.zzacv = ieVar.f14163d;
        }
        if (ieVar.f14164e != -2) {
            C3653jh.f14275a.post(new C2917r(this, ieVar));
            return;
        }
        int i = ieVar.f14160a.f15252Y;
        if (i == 1) {
            this.f10120e.zzadv = 0;
            zzbw zzbw = this.f10120e;
            zzbv.zzej();
            zzbw.zzacu = C3411am.m16559a(this.f10120e.zzrt, this, ieVar, this.f10120e.f10255b, null, this.f10283j, this, aqz);
            String str = "AdRenderer: ";
            String valueOf = String.valueOf(this.f10120e.zzacu.getClass().getName());
            C3643iy.m19172b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArray2 = new JSONObject(ieVar.f14161b.f15308b).getJSONArray("slots");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONArray jSONArray3 = jSONArray2.getJSONObject(i2).getJSONArray("ads");
                for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                    jSONArray.put(jSONArray3.get(i3));
                }
            }
            m13660n();
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < i; i4++) {
                C2918s sVar = new C2918s(this, i4, jSONArray, i, ieVar);
                arrayList.add(C3651jf.m18856a((Callable<T>) sVar));
            }
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                try {
                    C3653jh.f14275a.post(new C2919t(this, (ase) ((C3751my) arrayList.get(i5)).get(((Long) ane.m16650f().mo12297a(aqm.f12689bB)).longValue(), TimeUnit.MILLISECONDS), i5, arrayList));
                } catch (InterruptedException e) {
                    C3731me.m19175c("", e);
                    Thread.currentThread().interrupt();
                } catch (CancellationException | ExecutionException | TimeoutException e2) {
                    C3731me.m19175c("", e2);
                }
            }
        } catch (JSONException e3) {
            C3643iy.m19175c("Malformed native ad response", e3);
            mo10108a(0);
        }
    }

    public final void zza(C4054x xVar) {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(C3622id idVar, C3622id idVar2) {
        arx arx;
        C3622id idVar3 = idVar2;
        View view = null;
        zzd(null);
        if (this.f10120e.zzfo()) {
            if (idVar3.f14147n) {
                m13660n();
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
                    } else if (h != null && this.f10120e.f10264k != null) {
                        String a2 = h.mo12713a();
                        List b3 = h.mo12716b();
                        String c2 = h.mo12718c();
                        asy d2 = h.mo12720d() != null ? h.mo12720d() : null;
                        String e2 = h.mo12721e();
                        double f2 = h.mo12722f();
                        String g2 = h.mo12723g();
                        String h3 = h.mo12724h();
                        aos m = h.mo12729m();
                        if (h.mo12732p() != null) {
                            view = (View) C3327d.m15137a(h.mo12732p());
                        }
                        arx = new arx(a2, b3, c2, d2, e2, null, f2, g2, h3, null, m, view, h.mo12733q(), b, h.mo12728l());
                        asa asa2 = new asa(this.f10120e.zzrt, (asd) this, this.f10120e.f10255b, h, (ase) arx);
                        arx.mo12359a((asb) asa2);
                    } else if (h != null && this.f10120e.f10262i != null) {
                        String a3 = h.mo12713a();
                        List b4 = h.mo12716b();
                        String c3 = h.mo12718c();
                        asy d3 = h.mo12720d() != null ? h.mo12720d() : null;
                        String e3 = h.mo12721e();
                        double f3 = h.mo12722f();
                        String g3 = h.mo12723g();
                        String h4 = h.mo12724h();
                        Bundle l = h.mo12728l();
                        aos m2 = h.mo12729m();
                        if (h.mo12732p() != null) {
                            view = (View) C3327d.m15137a(h.mo12732p());
                        }
                        arq arq = new arq(a3, b4, c3, d3, e3, f3, g3, h4, null, l, m2, view, h.mo12733q(), b);
                        asa asa3 = new asa(this.f10120e.zzrt, (asd) this, this.f10120e.f10255b, h, (ase) arq);
                        arq.mo12359a((asb) asa3);
                        m13654a(arq);
                    } else if (i != null && this.f10120e.f10264k != null) {
                        String a4 = i.mo12735a();
                        List b5 = i.mo12738b();
                        String c4 = i.mo12740c();
                        asy d4 = i.mo12742d() != null ? i.mo12742d() : null;
                        String e4 = i.mo12743e();
                        String f4 = i.mo12744f();
                        aos l2 = i.mo12750l();
                        if (i.mo12752n() != null) {
                            view = (View) C3327d.m15137a(i.mo12752n());
                        }
                        arx arx2 = new arx(a4, b5, c4, d4, e4, f4, -1.0d, null, null, null, l2, view, i.mo12753o(), b, i.mo12748j());
                        bbi bbi = i;
                        arx = arx2;
                        asa asa4 = new asa(this.f10120e.zzrt, (asd) this, this.f10120e.f10255b, bbi, (ase) arx2);
                        arx.mo12359a((asb) asa4);
                    } else if (i != null && this.f10120e.f10263j != null) {
                        String a5 = i.mo12735a();
                        List b6 = i.mo12738b();
                        String c5 = i.mo12740c();
                        asy d5 = i.mo12742d() != null ? i.mo12742d() : null;
                        String e5 = i.mo12743e();
                        String f5 = i.mo12744f();
                        Bundle j2 = i.mo12748j();
                        aos l3 = i.mo12750l();
                        if (i.mo12752n() != null) {
                            view = (View) C3327d.m15137a(i.mo12752n());
                        }
                        ars ars = new ars(a5, b6, c5, d5, e5, f5, null, j2, l3, view, i.mo12753o(), b);
                        bbi bbi2 = i;
                        ars ars2 = ars;
                        asa asa5 = new asa(this.f10120e.zzrt, (asd) this, this.f10120e.f10255b, bbi2, (ase) ars);
                        ars2.mo12359a((asb) asa5);
                        m13655a(ars2);
                    } else if (n == null || this.f10120e.f10266m == null || this.f10120e.f10266m.get(n.mo12372l()) == null) {
                        C3643iy.m19178e("No matching mapper/listener for retrieved native ad template.");
                        mo10108a(0);
                        return false;
                    } else {
                        C3653jh.f14275a.post(new C2924y(this, n));
                    }
                    m13656a(arx);
                } catch (RemoteException e6) {
                    C3643iy.m19177d("#007 Could not call remote method.", e6);
                }
            } else {
                ase ase = idVar3.f14117C;
                if (this.f10189l) {
                    this.f10190m.mo13296b(ase);
                } else {
                    boolean z = ase instanceof ars;
                    if (!z || this.f10120e.f10264k == null) {
                        if (!z || this.f10120e.f10263j == null) {
                            boolean z2 = ase instanceof arq;
                            if (!z2 || this.f10120e.f10264k == null) {
                                if (!z2 || this.f10120e.f10262i == null) {
                                    if ((ase instanceof aru) && this.f10120e.f10266m != null) {
                                        aru aru = (aru) ase;
                                        if (this.f10120e.f10266m.get(aru.mo12372l()) != null) {
                                            C3653jh.f14275a.post(new C2923x(this, aru.mo12372l(), idVar3));
                                        }
                                    }
                                    C3643iy.m19178e("No matching listener for retrieved native ad template.");
                                    mo10108a(0);
                                    return false;
                                }
                                m13654a((arq) idVar3.f14117C);
                            }
                        } else {
                            m13655a((ars) idVar3.f14117C);
                        }
                    }
                    m13656a(m13657b(idVar3.f14117C));
                }
            }
            return super.zza(idVar, idVar2);
        }
        throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
    }

    public final boolean zza(zzjj zzjj, aqz aqz) {
        try {
            mo10213i();
            return super.zza(zzjj, aqz, this.f10194q);
        } catch (Exception e) {
            String str = "Error initializing webview.";
            if (C3731me.m19171a(4)) {
                Log.i(AdRequest.LOGTAG, str, e);
            }
            return false;
        }
    }

    public final void zzcd() {
        C3622id idVar = this.f10120e.zzacw;
        if (idVar.f14149p == null) {
            super.zzcd();
            return;
        }
        try {
            bav bav = idVar.f14149p;
            aos aos = null;
            bbe h = bav.mo12703h();
            if (h != null) {
                aos = h.mo12729m();
            } else {
                bbi i = bav.mo12704i();
                if (i != null) {
                    aos = i.mo12750l();
                } else {
                    atu n = bav.mo12709n();
                    if (n != null) {
                        aos = n.mo12402c();
                    }
                }
            }
            if (aos != null) {
                aov h2 = aos.mo12141h();
                if (h2 != null) {
                    h2.mo12148d();
                }
            }
        } catch (RemoteException e) {
            C3643iy.m19177d("#007 Could not call remote method.", e);
        }
    }

    public final void zzce() {
        if (this.f10120e.zzacw == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.f10120e.zzacw.f14150q)) {
            super.zzce();
        } else {
            zzbs();
        }
    }

    public final void zzcj() {
        if (this.f10120e.zzacw == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.f10120e.zzacw.f14150q)) {
            super.zzcj();
        } else {
            zzbr();
        }
    }

    public final void zzcr() {
        if (m13658l() && this.f10123h != null) {
            C3832py pyVar = null;
            if (this.f10192o != null) {
                pyVar = this.f10192o;
            } else if (this.f10191n != null) {
                pyVar = this.f10191n;
            }
            if (pyVar != null) {
                pyVar.mo12588a("onSdkImpression", (Map<String, ?>) new HashMap<String,Object>());
            }
        }
    }

    public final void zzcs() {
        super.mo10118g();
        if (this.f10192o != null) {
            this.f10192o.destroy();
            this.f10192o = null;
        }
    }

    public final void zzct() {
        if (this.f10191n != null) {
            this.f10191n.destroy();
            this.f10191n = null;
        }
    }

    public final boolean zzcu() {
        if (m13659m() != null) {
            return m13659m().f13438p;
        }
        return false;
    }

    public final boolean zzcv() {
        if (m13659m() != null) {
            return m13659m().f13439q;
        }
        return false;
    }

    public final void zzd(List<String> list) {
        C3266s.m14922b("setNativeTemplates must be called on the main UI thread.");
        this.f10120e.f10275v = list;
    }

    public final C3442bn zzdr() {
        C3442bn bnVar;
        synchronized (this.f10188k) {
            bnVar = this.f10195r;
        }
        return bnVar;
    }

    public final void zzdt() {
        if (this.f10120e.zzacw == null || this.f10191n == null) {
            this.f10193p = true;
            C3643iy.m19178e("Request to enable ActiveView before adState is available.");
            return;
        }
        zzbv.zzeo().mo13055g().mo11942a(this.f10120e.zzacv, this.f10120e.zzacw, this.f10191n.getView(), this.f10191n);
        this.f10193p = false;
    }

    public final void zzdu() {
        this.f10193p = false;
        if (this.f10120e.zzacw == null || this.f10191n == null) {
            C3643iy.m19178e("Request to enable ActiveView before adState is available.");
        } else {
            zzbv.zzeo().mo13055g().mo11939a(this.f10120e.zzacw);
        }
    }

    public final C0510m<String, aui> zzdv() {
        C3266s.m14922b("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return this.f10120e.f10266m;
    }

    public final void zzdw() {
        if (this.f10191n != null && this.f10191n.mo13409b() != null && this.f10120e.f10267n != null && this.f10120e.f10267n.f15519f != null) {
            this.f10191n.mo13409b().mo13595a(this.f10120e.f10267n.f15519f);
        }
    }

    public final void zzf(C3832py pyVar) {
        this.f10191n = pyVar;
    }

    public final void zzg(C3832py pyVar) {
        this.f10192o = pyVar;
    }

    public final void zzi(View view) {
        if (this.f10123h != null) {
            zzbv.zzfa().mo13344a(this.f10123h, view);
        }
    }

    public final void zzj(int i) {
        C3266s.m14922b("setMaxNumberOfAds must be called on the main UI thread.");
        this.f10194q = i;
    }

    public final auf zzr(String str) {
        C3266s.m14922b("getOnCustomClickListener must be called on the main UI thread.");
        if (this.f10120e.f10265l == null) {
            return null;
        }
        return (auf) this.f10120e.f10265l.get(str);
    }
}
