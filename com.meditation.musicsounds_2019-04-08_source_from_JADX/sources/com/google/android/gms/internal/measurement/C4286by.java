package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.util.C3306k;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.by */
public final class C4286by {

    /* renamed from: a */
    private static final char[] f15843a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public static double m21127a(String str, double d) {
        if (str == null) {
            return 100.0d;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return 100.0d;
        }
    }

    /* renamed from: a */
    public static long m21128a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static C4476ip m21129a(C4272bk bkVar, String str) {
        C3266s.m14913a(bkVar);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new HashMap();
        try {
            String str2 = "?";
            String valueOf = String.valueOf(str);
            Map a = C3306k.m15063a(new URI(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2)), "UTF-8");
            C4476ip ipVar = new C4476ip();
            ipVar.mo14735e((String) a.get("utm_content"));
            ipVar.mo14731c((String) a.get("utm_medium"));
            ipVar.mo14727a((String) a.get("utm_campaign"));
            ipVar.mo14729b((String) a.get("utm_source"));
            ipVar.mo14733d((String) a.get("utm_term"));
            ipVar.mo14737f((String) a.get("utm_id"));
            ipVar.mo14739g((String) a.get("anid"));
            ipVar.mo14741h((String) a.get("gclid"));
            ipVar.mo14743i((String) a.get("dclid"));
            ipVar.mo14745j((String) a.get("aclid"));
            return ipVar;
        } catch (URISyntaxException e) {
            bkVar.mo14819d("No valid campaign data found", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m21130a(Locale locale) {
        if (locale == null) {
            return null;
        }
        String language = locale.getLanguage();
        if (TextUtils.isEmpty(language)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(language.toLowerCase(locale));
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry().toLowerCase(locale));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m21131a(Map<String, String> map, String str, String str2) {
        if (str2 != null && !map.containsKey(str)) {
            map.put(str, str2);
        }
    }

    /* renamed from: a */
    public static void m21132a(Map<String, String> map, String str, Map<String, String> map2) {
        m21131a(map, str, (String) map2.get(str));
    }

    /* renamed from: a */
    public static void m21133a(Map<String, String> map, String str, boolean z) {
        if (!map.containsKey(str)) {
            map.put(str, z ? "1" : "0");
        }
    }

    /* renamed from: a */
    public static boolean m21134a(double d, String str) {
        int i;
        if (d > 0.0d && d < 100.0d) {
            if (!TextUtils.isEmpty(str)) {
                i = 0;
                for (int length = str.length() - 1; length >= 0; length--) {
                    char charAt = str.charAt(length);
                    i = ((i << 6) & 65535) + charAt + (charAt << 14);
                    int i2 = 266338304 & i;
                    if (i2 != 0) {
                        i ^= i2 >> 21;
                    }
                }
            } else {
                i = 1;
            }
            if (((double) (i % 10000)) >= d * 100.0d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m21135a(Context context, String str) {
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, str), 0);
            if (serviceInfo != null && serviceInfo.enabled) {
                return true;
            }
        } catch (NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m21136a(Context context, String str, boolean z) {
        try {
            ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, str), 0);
            if (receiverInfo != null && receiverInfo.enabled && (!z || receiverInfo.exported)) {
                return true;
            }
        } catch (NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m21137a(String str, boolean z) {
        return str == null || str.equalsIgnoreCase("true") || str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("1") || (!str.equalsIgnoreCase("false") && !str.equalsIgnoreCase("no") && !str.equalsIgnoreCase("0"));
    }

    /* renamed from: b */
    public static MessageDigest m21138b(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m21139b(Map<String, String> map, String str, String str2) {
        if (str2 != null && TextUtils.isEmpty((CharSequence) map.get(str))) {
            map.put(str, str2);
        }
    }

    /* renamed from: c */
    public static boolean m21140c(String str) {
        return TextUtils.isEmpty(str) || !str.startsWith("http:");
    }
}
