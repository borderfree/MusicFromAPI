package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.android.gms.internal.ads.C3488df;
import com.google.android.gms.internal.ads.C3623ie;
import com.google.android.gms.internal.ads.C3740mn;
import com.google.android.gms.internal.ads.aqz;
import com.google.android.gms.internal.ads.ase;
import com.google.android.gms.internal.ads.zzaef;
import com.google.android.gms.internal.ads.zzjj;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.s */
final class C2918s implements Callable<ase> {

    /* renamed from: a */
    private final /* synthetic */ int f10094a;

    /* renamed from: b */
    private final /* synthetic */ JSONArray f10095b;

    /* renamed from: c */
    private final /* synthetic */ int f10096c;

    /* renamed from: d */
    private final /* synthetic */ C3623ie f10097d;

    /* renamed from: e */
    private final /* synthetic */ zzbc f10098e;

    C2918s(zzbc zzbc, int i, JSONArray jSONArray, int i2, C3623ie ieVar) {
        this.f10098e = zzbc;
        this.f10094a = i;
        this.f10095b = jSONArray;
        this.f10096c = i2;
        this.f10097d = ieVar;
    }

    public final /* synthetic */ Object call() {
        if (this.f10094a >= this.f10095b.length()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.f10095b.get(this.f10094a));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ads", jSONArray);
        zzbc zzbc = new zzbc(this.f10098e.f10120e.zzrt, this.f10098e.f10124i, this.f10098e.f10120e.zzacv, this.f10098e.f10120e.zzacp, this.f10098e.f10283j, this.f10098e.f10120e.zzacr, true);
        zzbc.m13653a(this.f10098e.f10120e, zzbc.f10120e);
        zzbc.mo10213i();
        zzbc.zza(this.f10098e.f10117b);
        aqz aqz = zzbc.f10116a;
        int i = this.f10094a;
        aqz.mo12322a("num_ads_requested", String.valueOf(this.f10096c));
        aqz.mo12322a("ad_index", String.valueOf(i));
        zzaef zzaef = this.f10097d.f14160a;
        String jSONObject2 = jSONObject.toString();
        Bundle bundle = zzaef.f15259c.f15483c != null ? new Bundle(zzaef.f15259c.f15483c) : new Bundle();
        bundle.putString("_ad", jSONObject2);
        zzjj zzjj = r5;
        zzjj zzjj2 = new zzjj(zzaef.f15259c.f15481a, zzaef.f15259c.f15482b, bundle, zzaef.f15259c.f15484d, zzaef.f15259c.f15485e, zzaef.f15259c.f15486f, zzaef.f15259c.f15487g, zzaef.f15259c.f15488h, zzaef.f15259c.f15489i, zzaef.f15259c.f15490j, zzaef.f15259c.f15491k, zzaef.f15259c.f15492l, zzaef.f15259c.f15493m, zzaef.f15259c.f15494n, zzaef.f15259c.f15495o, zzaef.f15259c.f15496p, zzaef.f15259c.f15497q, zzaef.f15259c.f15498r);
        C3488df dfVar = new C3488df(zzaef.f15258b, zzjj, zzaef.f15260d, zzaef.f15261e, zzaef.f15262f, zzaef.f15263g, zzaef.f15265i, zzaef.f15266j, zzaef.f15267k, zzaef.f15268l, zzaef.f15270n, zzaef.f15282z, zzaef.f15271o, zzaef.f15272p, zzaef.f15273q, zzaef.f15274r, zzaef.f15275s, zzaef.f15276t, zzaef.f15277u, zzaef.f15278v, zzaef.f15279w, zzaef.f15280x, zzaef.f15281y, zzaef.f15229B, zzaef.f15230C, zzaef.f15236I, zzaef.f15231D, zzaef.f15232E, zzaef.f15233F, zzaef.f15234G, C3740mn.m19191a(zzaef.f15235H), zzaef.f15237J, zzaef.f15238K, zzaef.f15239L, zzaef.f15240M, zzaef.f15241N, zzaef.f15242O, zzaef.f15243P, zzaef.f15244Q, zzaef.f15248U, C3740mn.m19191a(zzaef.f15264h), zzaef.f15249V, zzaef.f15250W, zzaef.f15251X, 1, zzaef.f15253Z, zzaef.f15255aa, zzaef.f15256ab, zzaef.f15257ac);
        zzbc.zza(dfVar, zzbc.f10116a);
        return (ase) zzbc.mo10214j().get();
    }
}
