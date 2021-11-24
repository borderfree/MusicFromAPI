package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.pe */
public final class C3812pe implements zzv<C3804ox> {

    /* renamed from: a */
    private boolean f14642a;

    /* renamed from: a */
    private static int m19379a(Context context, Map<String, String> map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                ane.m16645a();
                return C3719lt.m19107a(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(str2).length());
                sb.append("Could not parse ");
                sb.append(str);
                sb.append(" in a video GMSG: ");
                sb.append(str2);
                C3643iy.m19178e(sb.toString());
            }
        }
        return i;
    }

    /* renamed from: a */
    private static void m19380a(C3790oj ojVar, Map<String, String> map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        if (str != null) {
            try {
                Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                C3643iy.m19178e(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", new Object[]{str, str2}));
                return;
            }
        }
        if (str2 != null) {
            Integer.parseInt(str2);
        }
        if (str3 != null) {
            Integer.parseInt(str3);
        }
        if (str4 != null) {
            Integer.parseInt(str4);
        }
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        int i;
        int i2;
        String[] split;
        C3804ox oxVar = (C3804ox) obj;
        String str = (String) map.get("action");
        if (str == null) {
            C3643iy.m19178e("Action missing from video GMSG.");
            return;
        }
        if (C3643iy.m19171a(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(jSONObject2).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(jSONObject2);
            C3643iy.m19172b(sb.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                C3643iy.m19178e("Color parameter missing from color video GMSG.");
                return;
            }
            try {
                oxVar.setBackgroundColor(Color.parseColor(str2));
            } catch (IllegalArgumentException unused) {
                C3643iy.m19178e("Invalid color parameter in video GMSG.");
            }
        } else {
            if ("decoderProps".equals(str)) {
                String str3 = (String) map.get("mimeTypes");
                if (str3 == null) {
                    C3643iy.m19178e("No MIME types specified for decoder properties inspection.");
                    C3790oj.m19286a(oxVar, "missingMimeTypes");
                } else if (VERSION.SDK_INT < 16) {
                    C3643iy.m19178e("Video decoder properties available on API versions >= 16.");
                    C3790oj.m19286a(oxVar, "deficientApiVersion");
                } else {
                    HashMap hashMap = new HashMap();
                    for (String str4 : str3.split(",")) {
                        hashMap.put(str4, C3717lr.m19097a(str4.trim()));
                    }
                    C3790oj.m19287a(oxVar, (Map<String, List<Map<String, Object>>>) hashMap);
                }
            } else {
                C3795oo a = oxVar.mo13406a();
                if (a == null) {
                    C3643iy.m19178e("Could not get underlay container for a video GMSG.");
                    return;
                }
                boolean equals = "new".equals(str);
                boolean equals2 = "position".equals(str);
                if (equals || equals2) {
                    Context context = oxVar.getContext();
                    int a2 = m19379a(context, map, "x", 0);
                    int a3 = m19379a(context, map, "y", 0);
                    int a4 = m19379a(context, map, "w", -1);
                    int a5 = m19379a(context, map, "h", -1);
                    if (((Boolean) ane.m16650f().mo12297a(aqm.f12772cf)).booleanValue()) {
                        a4 = Math.min(a4, oxVar.mo13419k() - a2);
                        i = Math.min(a5, oxVar.mo13418j() - a3);
                    } else {
                        i = a5;
                    }
                    try {
                        i2 = Integer.parseInt((String) map.get("player"));
                    } catch (NumberFormatException unused2) {
                        i2 = 0;
                    }
                    boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
                    if (!equals || a.mo13383a() != null) {
                        a.mo13384a(a2, a3, a4, i);
                        return;
                    }
                    a.mo13385a(a2, a3, a4, i, i2, parseBoolean, new C3803ow((String) map.get("flags")));
                    C3790oj a6 = a.mo13383a();
                    if (a6 != null) {
                        m19380a(a6, map);
                    }
                    return;
                }
                C3790oj a7 = a.mo13383a();
                if (a7 == null) {
                    C3790oj.m19285a(oxVar);
                } else if ("click".equals(str)) {
                    Context context2 = oxVar.getContext();
                    int a8 = m19379a(context2, map, "x", 0);
                    int a9 = m19379a(context2, map, "y", 0);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) a8, (float) a9, 0);
                    a7.mo13367a(obtain);
                    obtain.recycle();
                } else if ("currentTime".equals(str)) {
                    String str5 = (String) map.get("time");
                    if (str5 == null) {
                        C3643iy.m19178e("Time parameter missing from currentTime video GMSG.");
                        return;
                    }
                    try {
                        a7.mo13365a((int) (Float.parseFloat(str5) * 1000.0f));
                    } catch (NumberFormatException unused3) {
                        String str6 = "Could not parse time parameter from currentTime video GMSG: ";
                        String valueOf = String.valueOf(str5);
                        C3643iy.m19178e(valueOf.length() != 0 ? str6.concat(valueOf) : new String(str6));
                    }
                } else if ("hide".equals(str)) {
                    a7.setVisibility(4);
                } else if ("load".equals(str)) {
                    a7.mo13370h();
                } else if ("loadControl".equals(str)) {
                    m19380a(a7, map);
                } else if ("muted".equals(str)) {
                    if (Boolean.parseBoolean((String) map.get("muted"))) {
                        a7.mo13373k();
                    } else {
                        a7.mo13374l();
                    }
                } else if ("pause".equals(str)) {
                    a7.mo13371i();
                } else if ("play".equals(str)) {
                    a7.mo13372j();
                } else if ("show".equals(str)) {
                    a7.setVisibility(0);
                } else if ("src".equals(str)) {
                    a7.mo13368a((String) map.get("src"));
                } else if ("touchMove".equals(str)) {
                    Context context3 = oxVar.getContext();
                    a7.mo13364a((float) m19379a(context3, map, "dx", 0), (float) m19379a(context3, map, "dy", 0));
                    if (!this.f14642a) {
                        oxVar.mo13413f();
                        this.f14642a = true;
                    }
                } else if ("volume".equals(str)) {
                    String str7 = (String) map.get("volume");
                    if (str7 == null) {
                        C3643iy.m19178e("Level parameter missing from volume video GMSG.");
                        return;
                    }
                    try {
                        a7.setVolume(Float.parseFloat(str7));
                    } catch (NumberFormatException unused4) {
                        String str8 = "Could not parse volume parameter from volume video GMSG: ";
                        String valueOf2 = String.valueOf(str7);
                        C3643iy.m19178e(valueOf2.length() != 0 ? str8.concat(valueOf2) : new String(str8));
                    }
                } else if ("watermark".equals(str)) {
                    a7.mo13375m();
                } else {
                    String str9 = "Unknown video action: ";
                    String valueOf3 = String.valueOf(str);
                    C3643iy.m19178e(valueOf3.length() != 0 ? str9.concat(valueOf3) : new String(str9));
                }
            }
        }
    }
}
