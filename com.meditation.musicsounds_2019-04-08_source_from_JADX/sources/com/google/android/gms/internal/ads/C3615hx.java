package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.hx */
public final class C3615hx {
    /* renamed from: a */
    public static Uri m18680a(Uri uri, Context context) {
        if (!zzbv.zzfh().mo13009f(context) || !TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return uri;
        }
        String j = zzbv.zzfh().mo13013j(context);
        Uri a = m18681a(uri.toString(), "fbs_aeid", j);
        zzbv.zzfh().mo13004d(context, j);
        return a;
    }

    /* renamed from: a */
    private static Uri m18681a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        StringBuilder sb = new StringBuilder(str.substring(0, i));
        sb.append(str2);
        sb.append("=");
        sb.append(str3);
        sb.append("&");
        sb.append(str.substring(i));
        return Uri.parse(sb.toString());
    }

    /* renamed from: a */
    public static String m18682a(String str, Context context) {
        if (zzbv.zzfh().mo12999a(context) && !TextUtils.isEmpty(str)) {
            String j = zzbv.zzfh().mo13013j(context);
            if (j == null) {
                return str;
            }
            if (((Boolean) ane.m16650f().mo12297a(aqm.f12680at)).booleanValue()) {
                String str2 = (String) ane.m16650f().mo12297a(aqm.f12681au);
                if (str.contains(str2)) {
                    if (zzbv.zzek().mo13137d(str)) {
                        zzbv.zzfh().mo13004d(context, j);
                        return str.replace(str2, j);
                    } else if (zzbv.zzek().mo13138e(str)) {
                        zzbv.zzfh().mo13006e(context, j);
                        return str.replace(str2, j);
                    }
                }
            } else if (!str.contains("fbs_aeid")) {
                if (zzbv.zzek().mo13137d(str)) {
                    zzbv.zzfh().mo13004d(context, j);
                    return m18681a(str, "fbs_aeid", j).toString();
                } else if (zzbv.zzek().mo13138e(str)) {
                    zzbv.zzfh().mo13006e(context, j);
                    str = m18681a(str, "fbs_aeid", j).toString();
                }
            }
        }
        return str;
    }

    /* renamed from: b */
    public static String m18683b(String str, Context context) {
        if (zzbv.zzfh().mo12999a(context) && !TextUtils.isEmpty(str)) {
            String j = zzbv.zzfh().mo13013j(context);
            if (j == null || !zzbv.zzek().mo13138e(str)) {
                return str;
            }
            if (((Boolean) ane.m16650f().mo12297a(aqm.f12680at)).booleanValue()) {
                String str2 = (String) ane.m16650f().mo12297a(aqm.f12681au);
                if (str.contains(str2)) {
                    return str.replace(str2, j);
                }
            } else if (!str.contains("fbs_aeid")) {
                str = m18681a(str, "fbs_aeid", j).toString();
            }
        }
        return str;
    }
}
