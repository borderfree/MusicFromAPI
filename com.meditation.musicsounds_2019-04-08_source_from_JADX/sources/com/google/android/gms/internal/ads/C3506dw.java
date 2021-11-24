package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.internal.gmsg.HttpClient;
import com.google.android.gms.ads.internal.gmsg.zzaa;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.dw */
public final class C3506dw extends C3638it {

    /* renamed from: a */
    private static final long f13784a = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: b */
    private static final Object f13785b = new Object();
    @GuardedBy("sLock")

    /* renamed from: c */
    private static boolean f13786c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static ayj f13787d = null;

    /* renamed from: e */
    private static HttpClient f13788e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static zzaa f13789f = null;

    /* renamed from: g */
    private static zzv<Object> f13790g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C3466ck f13791h;

    /* renamed from: i */
    private final C3488df f13792i;

    /* renamed from: j */
    private final Object f13793j = new Object();

    /* renamed from: k */
    private final Context f13794k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public ayw f13795l;

    /* renamed from: m */
    private akz f13796m;

    public C3506dw(Context context, C3488df dfVar, C3466ck ckVar, akz akz) {
        super(true);
        this.f13791h = ckVar;
        this.f13794k = context;
        this.f13792i = dfVar;
        this.f13796m = akz;
        synchronized (f13785b) {
            if (!f13786c) {
                f13789f = new zzaa();
                f13788e = new HttpClient(context.getApplicationContext(), dfVar.f13759j);
                f13790g = new C3515ee();
                ayj ayj = new ayj(this.f13794k.getApplicationContext(), this.f13792i.f13759j, (String) ane.m16650f().mo12297a(aqm.f12634a), new C3514ed(), new C3513ec());
                f13787d = ayj;
                f13786c = true;
            }
        }
    }

    /* renamed from: a */
    private final zzaej m18319a(zzaef zzaef) {
        zzbv.zzek();
        String a = C3653jh.m18865a();
        JSONObject a2 = m18320a(zzaef, a);
        if (a2 == null) {
            return new zzaej(0);
        }
        long b = zzbv.zzer().mo11327b();
        Future zzas = f13789f.zzas(a);
        C3719lt.f14416a.post(new C3508dy(this, a2, a));
        try {
            JSONObject jSONObject = (JSONObject) zzas.get(f13784a - (zzbv.zzer().mo11327b() - b), TimeUnit.MILLISECONDS);
            if (jSONObject == null) {
                return new zzaej(-1);
            }
            zzaej a3 = C3524en.m18346a(this.f13794k, zzaef, jSONObject.toString());
            if (a3.f15310d != -3 && TextUtils.isEmpty(a3.f15308b)) {
                a3 = new zzaej(3);
            }
            return a3;
        } catch (InterruptedException | CancellationException unused) {
            return new zzaej(-1);
        } catch (TimeoutException unused2) {
            return new zzaej(2);
        } catch (ExecutionException unused3) {
            return new zzaej(0);
        }
    }

    /* renamed from: a */
    private final JSONObject m18320a(zzaef zzaef, String str) {
        C3533ew ewVar;
        Info info;
        Bundle bundle = zzaef.f15259c.f15483c.getBundle("sdk_less_server_data");
        if (bundle == null) {
            return null;
        }
        try {
            ewVar = (C3533ew) zzbv.zzev().mo12896a(this.f13794k).get();
        } catch (Exception e) {
            C3643iy.m19175c("Error grabbing device info: ", e);
            ewVar = null;
        }
        Context context = this.f13794k;
        C3517eg egVar = new C3517eg();
        egVar.f13817j = zzaef;
        egVar.f13818k = ewVar;
        JSONObject a = C3524en.m18350a(context, egVar);
        if (a == null) {
            return null;
        }
        try {
            info = AdvertisingIdClient.getAdvertisingIdInfo(this.f13794k);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e2) {
            C3643iy.m19175c("Cannot get advertising id info", e2);
            info = null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("request_id", str);
        hashMap.put("request_param", a);
        hashMap.put("data", bundle);
        if (info != null) {
            hashMap.put("adid", info.getId());
            hashMap.put("lat", Integer.valueOf(info.isLimitAdTrackingEnabled() ? 1 : 0));
        }
        try {
            return zzbv.zzek().mo13124a((Map<String, ?>) hashMap);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    protected static void m18321a(axx axx) {
        axx.mo12617a("/loadAd", f13789f);
        axx.mo12617a("/fetchHttpRequest", f13788e);
        axx.mo12617a("/invalidRequest", f13790g);
    }

    /* renamed from: b */
    protected static void m18323b(axx axx) {
        axx.mo12618b("/loadAd", f13789f);
        axx.mo12618b("/fetchHttpRequest", f13788e);
        axx.mo12618b("/invalidRequest", f13790g);
    }

    /* renamed from: a */
    public final void mo10051a() {
        C3643iy.m19172b("SdkLessAdLoaderBackgroundTask started.");
        String j = zzbv.zzfh().mo13013j(this.f13794k);
        zzaef zzaef = new zzaef(this.f13792i, -1, zzbv.zzfh().mo13011h(this.f13794k), zzbv.zzfh().mo13012i(this.f13794k), j);
        zzbv.zzfh().mo13008f(this.f13794k, j);
        zzaej a = m18319a(zzaef);
        long b = zzbv.zzer().mo11327b();
        zzaef zzaef2 = zzaef;
        C3623ie ieVar = new C3623ie(zzaef2, a, null, null, a.f15310d, b, a.f15319m, null, this.f13796m);
        C3719lt.f14416a.post(new C3507dx(this, ieVar));
    }

    /* renamed from: h_ */
    public final void mo10052h_() {
        synchronized (this.f13793j) {
            C3719lt.f14416a.post(new C3512eb(this));
        }
    }
}
