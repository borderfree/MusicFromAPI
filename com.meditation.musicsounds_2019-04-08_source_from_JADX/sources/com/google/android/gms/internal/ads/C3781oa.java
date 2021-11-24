package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.google.android.gms.internal.ads.oa */
public final class C3781oa {
    /* renamed from: a */
    private static long m19262a(String str) {
        try {
            return m19265a().parse(str).getTime();
        } catch (ParseException e) {
            C3504dv.m18311a(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    /* renamed from: a */
    public static afd m19263a(asc asc) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        asc asc2 = asc;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = asc2.f13059c;
        String str = (String) map.get("Date");
        long a = str != null ? m19262a(str) : 0;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",");
            j2 = 0;
            int i2 = 0;
            j = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            j2 = 0;
            j = 0;
            z = false;
        }
        String str3 = (String) map.get("Expires");
        long a2 = str3 != null ? m19262a(str3) : 0;
        String str4 = (String) map.get("Last-Modified");
        long a3 = str4 != null ? m19262a(str4) : 0;
        String str5 = (String) map.get("ETag");
        if (z) {
            j4 = currentTimeMillis + (j2 * 1000);
            if (i == 0) {
                j3 = (j * 1000) + j4;
                afd afd = new afd();
                afd.f11859a = asc2.f13058b;
                afd.f11860b = str5;
                afd.f11864f = j4;
                afd.f11863e = j3;
                afd.f11861c = a;
                afd.f11862d = a3;
                afd.f11865g = map;
                afd.f11866h = asc2.f13060d;
                return afd;
            }
        } else if (a <= 0 || a2 < a) {
            j4 = 0;
        } else {
            j3 = (a2 - a) + currentTimeMillis;
            j4 = j3;
            afd afd2 = new afd();
            afd2.f11859a = asc2.f13058b;
            afd2.f11860b = str5;
            afd2.f11864f = j4;
            afd2.f11863e = j3;
            afd2.f11861c = a;
            afd2.f11862d = a3;
            afd2.f11865g = map;
            afd2.f11866h = asc2.f13060d;
            return afd2;
        }
        j3 = j4;
        afd afd22 = new afd();
        afd22.f11859a = asc2.f13058b;
        afd22.f11860b = str5;
        afd22.f11864f = j4;
        afd22.f11863e = j3;
        afd22.f11861c = a;
        afd22.f11862d = a3;
        afd22.f11865g = map;
        afd22.f11866h = asc2.f13060d;
        return afd22;
    }

    /* renamed from: a */
    static String m19264a(long j) {
        return m19265a().format(new Date(j));
    }

    /* renamed from: a */
    private static SimpleDateFormat m19265a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
