package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.TimeUnit;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.oy */
public final class C3805oy {

    /* renamed from: a */
    private final Context f14613a;

    /* renamed from: b */
    private final String f14614b;

    /* renamed from: c */
    private final zzang f14615c;

    /* renamed from: d */
    private final aqx f14616d;

    /* renamed from: e */
    private final aqz f14617e;

    /* renamed from: f */
    private final C3686kn f14618f = new C3689kq().mo13205a("min_1", Double.MIN_VALUE, 1.0d).mo13205a("1_5", 1.0d, 5.0d).mo13205a("5_10", 5.0d, 10.0d).mo13205a("10_20", 10.0d, 20.0d).mo13205a("20_30", 20.0d, 30.0d).mo13205a("30_max", 30.0d, Double.MAX_VALUE).mo13204a();

    /* renamed from: g */
    private final long[] f14619g;

    /* renamed from: h */
    private final String[] f14620h;

    /* renamed from: i */
    private boolean f14621i = false;

    /* renamed from: j */
    private boolean f14622j = false;

    /* renamed from: k */
    private boolean f14623k = false;

    /* renamed from: l */
    private boolean f14624l = false;

    /* renamed from: m */
    private boolean f14625m;

    /* renamed from: n */
    private C3788oh f14626n;

    /* renamed from: o */
    private boolean f14627o;

    /* renamed from: p */
    private boolean f14628p;

    /* renamed from: q */
    private long f14629q = -1;

    public C3805oy(Context context, zzang zzang, String str, aqz aqz, aqx aqx) {
        this.f14613a = context;
        this.f14615c = zzang;
        this.f14614b = str;
        this.f14617e = aqz;
        this.f14616d = aqx;
        String str2 = (String) ane.m16650f().mo12297a(aqm.f12911u);
        if (str2 == null) {
            this.f14620h = new String[0];
            this.f14619g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        this.f14620h = new String[split.length];
        this.f14619g = new long[split.length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.f14619g[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                C3643iy.m19175c("Unable to parse frame hash target time number.", e);
                this.f14619g[i] = -1;
            }
        }
    }

    /* renamed from: a */
    public final void mo13421a() {
        if (this.f14621i && !this.f14622j) {
            aqs.m16936a(this.f14617e, this.f14616d, "vfr2");
            this.f14622j = true;
        }
    }

    /* renamed from: a */
    public final void mo13422a(C3788oh ohVar) {
        aqs.m16936a(this.f14617e, this.f14616d, "vpc2");
        this.f14621i = true;
        if (this.f14617e != null) {
            this.f14617e.mo12322a("vpn", ohVar.mo13311a());
        }
        this.f14626n = ohVar;
    }

    /* renamed from: b */
    public final void mo13423b() {
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12910t)).booleanValue() && !this.f14627o) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.f14614b);
            bundle.putString("player", this.f14626n.mo13311a());
            for (C3688kp kpVar : this.f14618f.mo13199a()) {
                String valueOf = String.valueOf("fps_c_");
                String valueOf2 = String.valueOf(kpVar.f14343a);
                bundle.putString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), Integer.toString(kpVar.f14345c));
                String valueOf3 = String.valueOf("fps_p_");
                String valueOf4 = String.valueOf(kpVar.f14343a);
                bundle.putString(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), Double.toString(kpVar.f14344b));
            }
            for (int i = 0; i < this.f14619g.length; i++) {
                String str = this.f14620h[i];
                if (str != null) {
                    String valueOf5 = String.valueOf(Long.valueOf(this.f14619g[i]));
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf5).length() + 3);
                    sb.append("fh_");
                    sb.append(valueOf5);
                    bundle.putString(sb.toString(), str);
                }
            }
            zzbv.zzek().mo13126a(this.f14613a, this.f14615c.f15360a, "gmob-apps", bundle, true);
            this.f14627o = true;
        }
    }

    /* renamed from: b */
    public final void mo13424b(C3788oh ohVar) {
        if (this.f14623k && !this.f14624l) {
            if (C3643iy.m18781a() && !this.f14624l) {
                C3643iy.m18780a("VideoMetricsMixin first frame");
            }
            aqs.m16936a(this.f14617e, this.f14616d, "vff2");
            this.f14624l = true;
        }
        long c = zzbv.zzer().mo11328c();
        if (this.f14625m && this.f14628p && this.f14629q != -1) {
            double nanos = (double) TimeUnit.SECONDS.toNanos(1);
            double d = (double) (c - this.f14629q);
            Double.isNaN(nanos);
            Double.isNaN(d);
            this.f14618f.mo13200a(nanos / d);
        }
        this.f14628p = this.f14625m;
        this.f14629q = c;
        long longValue = ((Long) ane.m16650f().mo12297a(aqm.f12912v)).longValue();
        long currentPosition = (long) ohVar.getCurrentPosition();
        int i = 0;
        while (i < this.f14620h.length) {
            if (this.f14620h[i] != null || longValue <= Math.abs(currentPosition - this.f14619g[i])) {
                C3788oh ohVar2 = ohVar;
                i++;
            } else {
                String[] strArr = this.f14620h;
                int i2 = 8;
                Bitmap bitmap = ohVar.getBitmap(8, 8);
                long j = 63;
                int i3 = 0;
                long j2 = 0;
                while (i3 < i2) {
                    long j3 = j;
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j2 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1 : 0) << ((int) j3);
                        i4++;
                        j3--;
                        i2 = 8;
                    }
                    i3++;
                    j = j3;
                    i2 = 8;
                }
                strArr[i] = String.format("%016X", new Object[]{Long.valueOf(j2)});
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo13425c() {
        this.f14625m = true;
        if (this.f14622j && !this.f14623k) {
            aqs.m16936a(this.f14617e, this.f14616d, "vfp2");
            this.f14623k = true;
        }
    }

    /* renamed from: d */
    public final void mo13426d() {
        this.f14625m = false;
    }
}
