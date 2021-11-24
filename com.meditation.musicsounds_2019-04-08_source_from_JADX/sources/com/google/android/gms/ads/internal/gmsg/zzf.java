package com.google.android.gms.ads.internal.gmsg;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.internal.p065g.C1694e;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3615hx;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.C3707lh;
import com.google.android.gms.internal.ads.C3804ox;
import com.google.android.gms.internal.ads.C3812pe;
import com.google.android.gms.internal.ads.C3813pf;
import com.google.android.gms.internal.ads.C3832py;
import com.google.android.gms.internal.ads.C3854qt;
import com.google.android.gms.internal.ads.C3863rb;
import com.google.android.gms.internal.ads.C3865rd;
import com.google.android.gms.internal.ads.C3866re;
import com.google.android.gms.internal.ads.afm;
import com.google.android.gms.internal.ads.axh;
import com.google.android.gms.internal.ads.zzcj;
import com.seattleclouds.modules.nativetetris.C5915i;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p194nl.siegmann.epublib.domain.TableOfContents;

@C3464ci
public final class zzf {

    /* renamed from: a */
    private static final zzv<Object> f10027a = new C2889f();
    public static final zzv<C3832py> zzblo = C2884a.f9992a;
    public static final zzv<C3832py> zzblp = C2885b.f9993a;
    public static final zzv<C3832py> zzblq = C2886c.f9994a;
    public static final zzv<C3832py> zzblr = new C2891h();
    public static final zzv<C3832py> zzbls = new C2892i();
    public static final zzv<C3832py> zzblt = C2887d.f9995a;
    public static final zzv<Object> zzblu = new C2893j();
    public static final zzv<C3832py> zzblv = new C2894k();
    public static final zzv<C3832py> zzblw = C2888e.f9996a;
    public static final zzv<C3832py> zzblx = new C2895l();
    public static final zzv<C3832py> zzbly = new C2896m();
    public static final zzv<C3804ox> zzblz = new C3812pe();
    public static final zzv<C3804ox> zzbma = new C3813pf();
    public static final zzv<C3832py> zzbmb = new zze();
    public static final zzaf zzbmc = new zzaf();
    public static final zzv<C3832py> zzbmd = new C2897n();
    public static final zzv<C3832py> zzbme = new C2898o();
    public static final zzv<C3832py> zzbmf = new C2890g();

    /* renamed from: a */
    static final /* synthetic */ void m13576a(axh axh, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            C3643iy.m19178e("URL missing from click GMSG.");
            return;
        }
        Uri parse = Uri.parse(str);
        try {
            afm w = ((C3863rb) axh).mo13530w();
            if (w != null && w.mo11853a(parse)) {
                parse = w.mo11850a(parse, ((C3854qt) axh).getContext(), ((C3866re) axh).getView(), ((C3854qt) axh).mo13411d());
            }
        } catch (zzcj unused) {
            String str2 = "Unable to append parameter to URL: ";
            String valueOf = String.valueOf(str);
            C3643iy.m19178e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        C3854qt qtVar = (C3854qt) axh;
        new C3707lh(qtVar.getContext(), ((C3865rd) axh).mo13417i().f15360a, C3615hx.m18680a(parse, qtVar.getContext()).toString()).mo13086h();
    }

    /* renamed from: a */
    static final /* synthetic */ void m13577a(C3854qt qtVar, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            C3643iy.m19178e("URL missing from httpTrack GMSG.");
        } else {
            new C3707lh(qtVar.getContext(), ((C3865rd) qtVar).mo13417i().f15360a, str).mo13086h();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m13578a(C3863rb rbVar, Map map) {
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            afm w = rbVar.mo13530w();
            if (w != null) {
                w.mo11851a().zza(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            C3643iy.m19178e("Could not parse touch parameters from gmsg.");
        }
    }

    /* renamed from: b */
    static final /* synthetic */ void m13579b(C3854qt qtVar, Map map) {
        Throwable th;
        String str;
        PackageManager packageManager = qtVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("id");
                        String optString2 = jSONObject2.optString("u");
                        String optString3 = jSONObject2.optString(C5915i.f20903a);
                        String optString4 = jSONObject2.optString("m");
                        String optString5 = jSONObject2.optString("p");
                        String optString6 = jSONObject2.optString("c");
                        jSONObject2.optString("f");
                        jSONObject2.optString(C1694e.f5581a);
                        String optString7 = jSONObject2.optString("intent_url");
                        Intent intent = null;
                        if (!TextUtils.isEmpty(optString7)) {
                            try {
                                intent = Intent.parseUri(optString7, 0);
                            } catch (URISyntaxException e) {
                                URISyntaxException uRISyntaxException = e;
                                String str2 = "Error parsing the url: ";
                                String valueOf = String.valueOf(optString7);
                                C3643iy.m19173b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), uRISyntaxException);
                            }
                        }
                        boolean z = true;
                        if (intent == null) {
                            intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split(TableOfContents.DEFAULT_PATH_SEPARATOR, 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        if (packageManager.resolveActivity(intent, 65536) == null) {
                            z = false;
                        }
                        try {
                            jSONObject.put(optString, z);
                        } catch (JSONException e2) {
                            th = e2;
                            str = "Error constructing openable urls response.";
                        }
                    } catch (JSONException e3) {
                        th = e3;
                        str = "Error parsing the intent data.";
                        C3643iy.m19173b(str, th);
                    }
                }
                ((axh) qtVar).mo12589a("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((axh) qtVar).mo12589a("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((axh) qtVar).mo12589a("openableIntents", new JSONObject());
        }
    }

    /* renamed from: c */
    static final /* synthetic */ void m13580c(C3854qt qtVar, Map map) {
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            C3643iy.m19178e("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = qtVar.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            hashMap.put(str2, Boolean.valueOf(z));
        }
        ((axh) qtVar).mo12588a("openableURLs", (Map<String, ?>) hashMap);
    }
}
