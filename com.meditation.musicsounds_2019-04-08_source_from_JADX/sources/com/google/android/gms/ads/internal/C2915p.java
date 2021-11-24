package com.google.android.gms.ads.internal;

import android.os.Debug;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.ane;
import com.google.android.gms.internal.ads.aqm;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.ads.internal.p */
final class C2915p extends TimerTask {

    /* renamed from: a */
    private final /* synthetic */ CountDownLatch f10087a;

    /* renamed from: b */
    private final /* synthetic */ Timer f10088b;

    /* renamed from: c */
    private final /* synthetic */ zza f10089c;

    C2915p(zza zza, CountDownLatch countDownLatch, Timer timer) {
        this.f10089c = zza;
        this.f10087a = countDownLatch;
        this.f10088b = timer;
    }

    public final void run() {
        if (((long) ((Integer) ane.m16650f().mo12297a(aqm.f12782cp)).intValue()) != this.f10087a.getCount()) {
            C3643iy.m19172b("Stopping method tracing");
            Debug.stopMethodTracing();
            if (this.f10087a.getCount() == 0) {
                this.f10088b.cancel();
                return;
            }
        }
        String concat = String.valueOf(this.f10089c.f10120e.zzrt.getPackageName()).concat("_adsTrace_");
        try {
            C3643iy.m19172b("Starting method tracing");
            this.f10087a.countDown();
            long a = zzbv.zzer().mo11326a();
            StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + 20);
            sb.append(concat);
            sb.append(a);
            Debug.startMethodTracing(sb.toString(), ((Integer) ane.m16650f().mo12297a(aqm.f12783cq)).intValue());
        } catch (Exception e) {
            C3643iy.m19177d("#007 Could not call remote method.", e);
        }
    }
}
