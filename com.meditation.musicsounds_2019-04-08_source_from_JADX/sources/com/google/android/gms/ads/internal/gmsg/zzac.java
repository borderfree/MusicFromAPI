package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.zzx;
import com.google.android.gms.common.util.C3301f;
import com.google.android.gms.internal.ads.C3455c;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3510e;
import com.google.android.gms.internal.ads.C3537f;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.C3753n;
import com.google.android.gms.internal.ads.C3832py;
import com.google.android.gms.internal.ads.ane;
import com.google.android.gms.internal.ads.aqm;
import com.google.android.gms.internal.ads.bdd;
import java.util.Map;

@C3464ci
public final class zzac implements zzv<C3832py> {

    /* renamed from: d */
    private static final Map<String, Integer> f10005d = C3301f.m15045a((K[]) new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, (V[]) new Integer[]{Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7)});

    /* renamed from: a */
    private final zzx f10006a;

    /* renamed from: b */
    private final C3455c f10007b;

    /* renamed from: c */
    private final C3753n f10008c;

    public zzac(zzx zzx, C3455c cVar, C3753n nVar) {
        this.f10006a = zzx;
        this.f10007b = cVar;
        this.f10008c = nVar;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C3832py pyVar = (C3832py) obj;
        int intValue = ((Integer) f10005d.get((String) map.get("a"))).intValue();
        if (intValue != 5 && intValue != 7 && this.f10006a != null && !this.f10006a.zzcy()) {
            this.f10006a.zzs(null);
        } else if (intValue != 1) {
            switch (intValue) {
                case 3:
                    new C3537f(pyVar, map).mo12898a();
                    return;
                case 4:
                    new bdd(pyVar, map).mo12806a();
                    return;
                case 5:
                    new C3510e(pyVar, map).mo12873a();
                    return;
                case 6:
                    this.f10007b.mo12833a(true);
                    return;
                case 7:
                    if (((Boolean) ane.m16650f().mo12297a(aqm.f12620M)).booleanValue()) {
                        this.f10008c.zzcz();
                        break;
                    }
                    break;
                default:
                    C3643iy.m19176d("Unknown MRAID command called.");
                    break;
            }
        } else {
            this.f10007b.mo12832a(map);
        }
    }
}
