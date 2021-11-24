package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.zzbv;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;

@C3464ci
public final class avo implements apd {
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: a */
    public avj f13186a;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: b */
    public boolean f13187b;

    /* renamed from: c */
    private final Context f13188c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f13189d = new Object();

    public avo(Context context) {
        this.f13188c = context;
    }

    /* renamed from: a */
    private final Future<ParcelFileDescriptor> m17474a(zzsg zzsg) {
        avp avp = new avp(this);
        avq avq = new avq(this, avp, zzsg);
        avt avt = new avt(this, avp);
        synchronized (this.f13189d) {
            this.f13186a = new avj(this.f13188c, zzbv.zzez().mo13214a(), avq, avt);
            this.f13186a.mo11221q();
        }
        return avp;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m17475a() {
        synchronized (this.f13189d) {
            if (this.f13186a != null) {
                this.f13186a.mo11211g();
                this.f13186a = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* renamed from: a */
    public final asc mo12214a(auc<?> auc) {
        asc asc;
        zzsg a = zzsg.m20764a(auc);
        long intValue = (long) ((Integer) ane.m16650f().mo12297a(aqm.f12751cK)).intValue();
        long b = zzbv.zzer().mo11327b();
        try {
            zzsi zzsi = (zzsi) new zzaev((ParcelFileDescriptor) m17474a(a).get(intValue, TimeUnit.MILLISECONDS)).mo13884a(zzsi.CREATOR);
            if (!zzsi.f15523a) {
                if (zzsi.f15527e.length != zzsi.f15528f.length) {
                    asc = null;
                } else {
                    HashMap hashMap = new HashMap();
                    for (int i = 0; i < zzsi.f15527e.length; i++) {
                        hashMap.put(zzsi.f15527e[i], zzsi.f15528f[i]);
                    }
                    asc = new asc(zzsi.f15525c, zzsi.f15526d, (Map<String, String>) hashMap, zzsi.f15529g, zzsi.f15530h);
                }
                return asc;
            }
            throw new zzae(zzsi.f15524b);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return null;
        } finally {
            long j = zzbv.zzer().mo11327b() - b;
            StringBuilder sb = new StringBuilder(52);
            sb.append("Http assets remote cache took ");
            sb.append(j);
            sb.append("ms");
            C3643iy.m18780a(sb.toString());
        }
    }
}
