package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.pf */
public final class C3813pf implements zzv<C3804ox> {
    public final /* synthetic */ void zza(Object obj, Map map) {
        C3804ox oxVar = (C3804ox) obj;
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12734bu)).booleanValue()) {
            C3848qn b = oxVar.mo13409b();
            if (b == null) {
                try {
                    C3848qn qnVar = new C3848qn(oxVar, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                    oxVar.mo13407a(qnVar);
                    b = qnVar;
                } catch (NullPointerException | NumberFormatException e) {
                    C3643iy.m19173b("Unable to parse videoMeta message.", e);
                    zzbv.zzeo().mo13047a(e, "VideoMetaGmsgHandler.onGmsg");
                }
            }
            boolean equals = "1".equals(map.get("muted"));
            float parseFloat = Float.parseFloat((String) map.get("currentTime"));
            int parseInt = Integer.parseInt((String) map.get("playbackState"));
            if (parseInt < 0 || 3 < parseInt) {
                parseInt = 0;
            }
            String str = (String) map.get("aspectRatio");
            float parseFloat2 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
            if (C3643iy.m19171a(3)) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 79);
                sb.append("Video Meta GMSG: isMuted : ");
                sb.append(equals);
                sb.append(" , playbackState : ");
                sb.append(parseInt);
                sb.append(" , aspectRatio : ");
                sb.append(str);
                C3643iy.m19172b(sb.toString());
            }
            b.mo13593a(parseFloat, parseInt, equals, parseFloat2);
        }
    }
}
