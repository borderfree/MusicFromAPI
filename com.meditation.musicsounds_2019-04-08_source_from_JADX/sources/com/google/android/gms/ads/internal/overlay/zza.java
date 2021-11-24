package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.C3653jh;
import com.google.android.gms.internal.ads.ane;
import com.google.android.gms.internal.ads.aqm;
import p194nl.siegmann.epublib.domain.TableOfContents;

@C3464ci
public final class zza {
    /* renamed from: a */
    private static boolean m13588a(Context context, Intent intent, zzt zzt) {
        String str = "Launching an intent: ";
        try {
            String valueOf = String.valueOf(intent.toURI());
            C3643iy.m18780a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            zzbv.zzek();
            C3653jh.m18873a(context, intent);
            if (zzt != null) {
                zzt.zzbl();
            }
            return true;
        } catch (ActivityNotFoundException e) {
            C3643iy.m19178e(e.getMessage());
            return false;
        }
    }

    public static boolean zza(Context context, zzc zzc, zzt zzt) {
        int i;
        String str;
        if (zzc == null) {
            str = "No intent data for launcher overlay.";
        } else {
            aqm.m16920a(context);
            if (zzc.intent != null) {
                return m13588a(context, zzc.intent, zzt);
            }
            Intent intent = new Intent();
            if (TextUtils.isEmpty(zzc.url)) {
                str = "Open GMSG did not contain a URL.";
            } else {
                if (!TextUtils.isEmpty(zzc.mimeType)) {
                    intent.setDataAndType(Uri.parse(zzc.url), zzc.mimeType);
                } else {
                    intent.setData(Uri.parse(zzc.url));
                }
                intent.setAction("android.intent.action.VIEW");
                if (!TextUtils.isEmpty(zzc.packageName)) {
                    intent.setPackage(zzc.packageName);
                }
                if (!TextUtils.isEmpty(zzc.zzbxj)) {
                    String[] split = zzc.zzbxj.split(TableOfContents.DEFAULT_PATH_SEPARATOR, 2);
                    if (split.length < 2) {
                        String str2 = "Could not parse component name from open GMSG: ";
                        String valueOf = String.valueOf(zzc.zzbxj);
                        C3643iy.m19178e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                        return false;
                    }
                    intent.setClassName(split[0], split[1]);
                }
                String str3 = zzc.zzbxk;
                if (!TextUtils.isEmpty(str3)) {
                    try {
                        i = Integer.parseInt(str3);
                    } catch (NumberFormatException unused) {
                        C3643iy.m19178e("Could not parse intent flags.");
                        i = 0;
                    }
                    intent.addFlags(i);
                }
                if (((Boolean) ane.m16650f().mo12297a(aqm.f12754cN)).booleanValue()) {
                    intent.addFlags(268435456);
                    intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
                } else {
                    if (((Boolean) ane.m16650f().mo12297a(aqm.f12753cM)).booleanValue()) {
                        zzbv.zzek();
                        C3653jh.m18891b(context, intent);
                    }
                }
                return m13588a(context, intent, zzt);
            }
        }
        C3643iy.m19178e(str);
        return false;
    }
}
