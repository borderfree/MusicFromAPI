package com.google.android.gms.ads.internal.gmsg;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.facebook.ads.internal.p065g.C1694e;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzx;
import com.google.android.gms.internal.ads.C3455c;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3615hx;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.C3832py;
import com.google.android.gms.internal.ads.C3854qt;
import com.google.android.gms.internal.ads.C3855qu;
import com.google.android.gms.internal.ads.C3859qy;
import com.google.android.gms.internal.ads.C3863rb;
import com.google.android.gms.internal.ads.C3866re;
import com.google.android.gms.internal.ads.afm;
import com.google.android.gms.internal.ads.amh;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzcj;
import com.seattleclouds.modules.nativetetris.C5915i;
import java.net.URISyntaxException;
import java.util.Map;

@C3464ci
public final class zzad<T extends C3854qt & C3855qu & C3859qy & C3863rb & C3866re> implements zzv<T> {

    /* renamed from: a */
    private final Context f10009a;

    /* renamed from: b */
    private final afm f10010b;

    /* renamed from: c */
    private final zzang f10011c;

    /* renamed from: d */
    private final zzt f10012d;

    /* renamed from: e */
    private final amh f10013e;

    /* renamed from: f */
    private final zzn f10014f;

    /* renamed from: g */
    private final zzb f10015g;

    /* renamed from: h */
    private final zzd f10016h;

    /* renamed from: i */
    private final zzx f10017i;

    /* renamed from: j */
    private final C3455c f10018j;

    /* renamed from: k */
    private final C3832py f10019k = null;

    public zzad(Context context, zzang zzang, afm afm, zzt zzt, amh amh, zzb zzb, zzd zzd, zzn zzn, zzx zzx, C3455c cVar) {
        this.f10009a = context;
        this.f10011c = zzang;
        this.f10010b = afm;
        this.f10012d = zzt;
        this.f10013e = amh;
        this.f10015g = zzb;
        this.f10016h = zzd;
        this.f10017i = zzx;
        this.f10018j = cVar;
        this.f10014f = zzn;
    }

    /* renamed from: a */
    static String m13568a(Context context, afm afm, String str, View view, Activity activity) {
        if (afm == null) {
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            if (afm.mo11854b(parse)) {
                parse = afm.mo11850a(parse, context, view, activity);
            }
            return parse.toString();
        } catch (zzcj unused) {
            return str;
        } catch (Exception e) {
            zzbv.zzeo().mo13047a((Throwable) e, "OpenGmsgHandler.maybeAddClickSignalsToUrl");
            return str;
        }
    }

    /* renamed from: a */
    private final void m13569a(boolean z) {
        if (this.f10018j != null) {
            this.f10018j.mo12833a(z);
        }
    }

    /* renamed from: a */
    private static boolean m13570a(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    /* renamed from: b */
    private static int m13571b(Map<String, String> map) {
        String str = (String) map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return zzbv.zzem().mo13156b();
            }
            if ("l".equalsIgnoreCase(str)) {
                return zzbv.zzem().mo13143a();
            }
            if ("c".equalsIgnoreCase(str)) {
                return zzbv.zzem().mo13159c();
            }
        }
        return -1;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C3854qt qtVar = (C3854qt) obj;
        String a = C3615hx.m18682a((String) map.get("u"), qtVar.getContext());
        String str = (String) map.get("a");
        if (str == null) {
            C3643iy.m19178e("Action missing from an open GMSG.");
        } else if (this.f10017i != null && !this.f10017i.zzcy()) {
            this.f10017i.zzs(a);
        } else if ("expand".equalsIgnoreCase(str)) {
            if (((C3855qu) qtVar).mo13531x()) {
                C3643iy.m19178e("Cannot expand WebView that is already expanded.");
                return;
            }
            m13569a(false);
            ((C3859qy) qtVar).mo13579a(m13570a(map), m13571b(map));
        } else if ("webapp".equalsIgnoreCase(str)) {
            m13569a(false);
            if (a != null) {
                ((C3859qy) qtVar).mo13580a(m13570a(map), m13571b(map), a);
            } else {
                ((C3859qy) qtVar).mo13581a(m13570a(map), m13571b(map), (String) map.get("html"), (String) map.get("baseurl"));
            }
        } else if (!"app".equalsIgnoreCase(str) || !"true".equalsIgnoreCase((String) map.get("system_browser"))) {
            m13569a(true);
            String str2 = (String) map.get("intent_url");
            Intent intent = null;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    intent = Intent.parseUri(str2, 0);
                } catch (URISyntaxException e) {
                    String str3 = "Error parsing the url: ";
                    String valueOf = String.valueOf(str2);
                    C3643iy.m19173b(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), e);
                }
            }
            if (!(intent == null || intent.getData() == null)) {
                Uri data = intent.getData();
                String uri = data.toString();
                if (!TextUtils.isEmpty(uri)) {
                    try {
                        uri = m13568a(qtVar.getContext(), ((C3863rb) qtVar).mo13530w(), uri, ((C3866re) qtVar).getView(), qtVar.mo13411d());
                    } catch (Exception e2) {
                        C3643iy.m19173b("Error occurred while adding signals.", e2);
                        zzbv.zzeo().mo13047a((Throwable) e2, "OpenGmsgHandler.onGmsg");
                    }
                    try {
                        data = Uri.parse(uri);
                    } catch (Exception e3) {
                        String str4 = "Error parsing the uri: ";
                        String valueOf2 = String.valueOf(uri);
                        C3643iy.m19173b(valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4), e3);
                        zzbv.zzeo().mo13047a((Throwable) e3, "OpenGmsgHandler.onGmsg");
                    }
                }
                intent.setData(data);
            }
            if (intent != null) {
                ((C3859qy) qtVar).mo13578a(new zzc(intent));
                return;
            }
            if (!TextUtils.isEmpty(a)) {
                a = m13568a(qtVar.getContext(), ((C3863rb) qtVar).mo13530w(), a, ((C3866re) qtVar).getView(), qtVar.mo13411d());
            }
            C3859qy qyVar = (C3859qy) qtVar;
            zzc zzc = new zzc((String) map.get(C5915i.f20903a), a, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get(C1694e.f5581a));
            qyVar.mo13578a(zzc);
        } else {
            m13569a(true);
            qtVar.getContext();
            if (TextUtils.isEmpty(a)) {
                C3643iy.m19178e("Destination url cannot be empty.");
                return;
            }
            try {
                ((C3859qy) qtVar).mo13578a(new zzc(new zzae(qtVar.getContext(), ((C3863rb) qtVar).mo13530w(), ((C3866re) qtVar).getView()).zzi(map)));
            } catch (ActivityNotFoundException e4) {
                C3643iy.m19178e(e4.getMessage());
            }
        }
    }
}
