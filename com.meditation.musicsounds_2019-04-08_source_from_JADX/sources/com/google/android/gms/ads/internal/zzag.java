package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.C3651jf;
import com.google.android.gms.internal.ads.C3719lt;
import com.google.android.gms.internal.ads.afi;
import com.google.android.gms.internal.ads.afl;
import com.google.android.gms.internal.ads.ane;
import com.google.android.gms.internal.ads.aqm;
import com.google.android.gms.internal.ads.zzang;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@C3464ci
public final class zzag implements afi, Runnable {

    /* renamed from: a */
    private final List<Object[]> f10132a;

    /* renamed from: b */
    private final AtomicReference<afi> f10133b;

    /* renamed from: c */
    private Context f10134c;

    /* renamed from: d */
    private zzang f10135d;

    /* renamed from: e */
    private CountDownLatch f10136e;

    private zzag(Context context, zzang zzang) {
        this.f10132a = new Vector();
        this.f10133b = new AtomicReference<>();
        this.f10136e = new CountDownLatch(1);
        this.f10134c = context;
        this.f10135d = zzang;
        ane.m16645a();
        if (C3719lt.m19120b()) {
            C3651jf.m18855a((Runnable) this);
        } else {
            run();
        }
    }

    public zzag(zzbw zzbw) {
        this(zzbw.zzrt, zzbw.zzacr);
    }

    /* renamed from: a */
    private static Context m13615a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* renamed from: a */
    private final boolean m13616a() {
        try {
            this.f10136e.await();
            return true;
        } catch (InterruptedException e) {
            C3643iy.m19175c("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    /* renamed from: b */
    private final void m13617b() {
        if (!this.f10132a.isEmpty()) {
            for (Object[] objArr : this.f10132a) {
                if (objArr.length == 1) {
                    ((afi) this.f10133b.get()).zza((MotionEvent) objArr[0]);
                } else if (objArr.length == 3) {
                    ((afi) this.f10133b.get()).zza(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.f10132a.clear();
        }
    }

    public final void run() {
        boolean z = false;
        try {
            boolean z2 = this.f10135d.f15363d;
            if (!((Boolean) ane.m16650f().mo12297a(aqm.f12646aL)).booleanValue() && z2) {
                z = true;
            }
            this.f10133b.set(afl.m16116a(this.f10135d.f15360a, m13615a(this.f10134c), z));
        } finally {
            this.f10136e.countDown();
            this.f10134c = null;
            this.f10135d = null;
        }
    }

    public final String zza(Context context) {
        if (m13616a()) {
            afi afi = (afi) this.f10133b.get();
            if (afi != null) {
                m13617b();
                return afi.zza(m13615a(context));
            }
        }
        return "";
    }

    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, null);
    }

    public final String zza(Context context, String str, View view, Activity activity) {
        if (m13616a()) {
            afi afi = (afi) this.f10133b.get();
            if (afi != null) {
                m13617b();
                return afi.zza(m13615a(context), str, view, activity);
            }
        }
        return "";
    }

    public final void zza(int i, int i2, int i3) {
        afi afi = (afi) this.f10133b.get();
        if (afi != null) {
            m13617b();
            afi.zza(i, i2, i3);
            return;
        }
        this.f10132a.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public final void zza(MotionEvent motionEvent) {
        afi afi = (afi) this.f10133b.get();
        if (afi != null) {
            m13617b();
            afi.zza(motionEvent);
            return;
        }
        this.f10132a.add(new Object[]{motionEvent});
    }

    public final void zzb(View view) {
        afi afi = (afi) this.f10133b.get();
        if (afi != null) {
            afi.zzb(view);
        }
    }
}
