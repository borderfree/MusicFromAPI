package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

public final class aqb extends Thread {

    /* renamed from: a */
    private final BlockingQueue<auc<?>> f12590a;

    /* renamed from: b */
    private final apd f12591b;

    /* renamed from: c */
    private final C4109yy f12592c;

    /* renamed from: d */
    private final C3387a f12593d;

    /* renamed from: e */
    private volatile boolean f12594e = false;

    public aqb(BlockingQueue<auc<?>> blockingQueue, apd apd, C4109yy yyVar, C3387a aVar) {
        this.f12590a = blockingQueue;
        this.f12591b = apd;
        this.f12592c = yyVar;
        this.f12593d = aVar;
    }

    /* renamed from: b */
    private final void m16880b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        auc auc = (auc) this.f12590a.take();
        try {
            auc.mo12498b("network-queue-take");
            auc.mo12505g();
            TrafficStats.setThreadStatsTag(auc.mo12502d());
            asc a = this.f12591b.mo12214a(auc);
            auc.mo12498b("network-http-complete");
            if (!a.f13061e || !auc.mo12510l()) {
                bae a2 = auc.mo12491a(a);
                auc.mo12498b("network-parse-complete");
                if (auc.mo12506h() && a2.f13444b != null) {
                    this.f12592c.mo13212a(auc.mo12503e(), a2.f13444b);
                    auc.mo12498b("network-cache-written");
                }
                auc.mo12509k();
                this.f12593d.mo11427a(auc, a2);
                auc.mo12493a(a2);
                return;
            }
            auc.mo12500c("not-modified");
            auc.mo12511m();
        } catch (zzae e) {
            e.zza(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f12593d.mo11429a(auc, e);
            auc.mo12511m();
        } catch (Exception e2) {
            C3504dv.m18311a(e2, "Unhandled exception %s", e2.toString());
            zzae zzae = new zzae((Throwable) e2);
            zzae.zza(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f12593d.mo11429a(auc, zzae);
            auc.mo12511m();
        }
    }

    /* renamed from: a */
    public final void mo12283a() {
        this.f12594e = true;
        interrupt();
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m16880b();
            } catch (InterruptedException unused) {
                if (this.f12594e) {
                    return;
                }
            }
        }
    }
}
