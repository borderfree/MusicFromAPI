package com.seattleclouds.util;

import com.seattleclouds.p158c.C5325b;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class HTTPUtil {

    /* renamed from: a */
    private static final String f23232a = "HTTPUtil";

    public static class HttpUnauthorizedException extends IOException {
        private static final long serialVersionUID = 1;

        public HttpUnauthorizedException(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public static InputStream m31756a(String str) {
        return m31757a(str, 30000, null, false);
    }

    /* renamed from: a */
    public static InputStream m31757a(String str, int i, HashMap<String, String> hashMap, boolean z) {
        return m31758a(str, i, hashMap, z, -1);
    }

    /* renamed from: a */
    public static InputStream m31758a(String str, int i, HashMap<String, String> hashMap, boolean z, int i2) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        try {
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setRequestMethod("GET");
            if (hashMap != null) {
                for (String str2 : hashMap.keySet()) {
                    httpURLConnection.setRequestProperty(str2, (String) hashMap.get(str2));
                }
            }
            C5325b bVar = null;
            if (z) {
                bVar = new C5325b();
                bVar.mo17476a(httpURLConnection);
            }
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            if (z) {
                bVar.mo17477a(httpURLConnection, hashMap);
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            if (i2 < 0) {
                return inputStream;
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 302 && i2 < 3) {
                return m31758a(httpURLConnection.getHeaderField("Location"), i, hashMap, z, i2 + 1);
            }
            if (responseCode != 302 || i2 < 3) {
                return inputStream;
            }
            throw new HttpUnauthorizedException("408 - Request Timeout");
        } catch (IOException e) {
            if (httpURLConnection.getResponseCode() == 401) {
                throw new HttpUnauthorizedException("401 - UNAUTHORIZED");
            }
            throw e;
        }
    }

    /* renamed from: a */
    public static InputStream m31759a(String str, boolean z, boolean z2) {
        return m31758a(str, 30000, null, z, z2 ? 0 : -1);
    }

    /* renamed from: a */
    public static String m31760a(String str, int i) {
        return C6613i.m31991b(m31757a(str, i, null, false));
    }

    /* renamed from: a */
    public static String m31761a(String str, String str2) {
        return m31762a(str, str2, 30000);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0049  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m31762a(java.lang.String r2, java.lang.String r3, int r4) {
        /*
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ all -> 0x0046 }
            r1.<init>(r2)     // Catch:{ all -> 0x0046 }
            java.net.URLConnection r2 = r1.openConnection()     // Catch:{ all -> 0x0046 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ all -> 0x0046 }
            r2.setReadTimeout(r4)     // Catch:{ all -> 0x0046 }
            r2.setConnectTimeout(r4)     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = "POST"
            r2.setRequestMethod(r4)     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = "Content-Type"
            java.lang.String r1 = "application/x-www-form-urlencoded"
            r2.setRequestProperty(r4, r1)     // Catch:{ all -> 0x0046 }
            r4 = 1
            r2.setDoInput(r4)     // Catch:{ all -> 0x0046 }
            r2.setDoOutput(r4)     // Catch:{ all -> 0x0046 }
            r2.connect()     // Catch:{ all -> 0x0046 }
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0046 }
            java.io.OutputStream r1 = r2.getOutputStream()     // Catch:{ all -> 0x0046 }
            r4.<init>(r1)     // Catch:{ all -> 0x0046 }
            r4.write(r3)     // Catch:{ all -> 0x0043 }
            r4.flush()     // Catch:{ all -> 0x0043 }
            java.io.InputStream r2 = r2.getInputStream()     // Catch:{ all -> 0x0043 }
            java.lang.String r2 = com.seattleclouds.util.C6613i.m31991b(r2)     // Catch:{ all -> 0x0043 }
            r4.close()
            return r2
        L_0x0043:
            r2 = move-exception
            r0 = r4
            goto L_0x0047
        L_0x0046:
            r2 = move-exception
        L_0x0047:
            if (r0 == 0) goto L_0x004c
            r0.close()
        L_0x004c:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.util.HTTPUtil.m31762a(java.lang.String, java.lang.String, int):java.lang.String");
    }

    /* renamed from: a */
    public static String m31763a(String str, HashMap<String, String> hashMap, boolean z, boolean z2) {
        return C6613i.m31991b(m31758a(str, 30000, hashMap, z, z2 ? 0 : -1));
    }

    /* renamed from: a */
    public static String m31764a(String str, Map<String, String> map) {
        return m31765a(str, map, 30000);
    }

    /* renamed from: a */
    public static String m31765a(String str, Map<String, String> map, int i) {
        String a = m31766a(map);
        if (a.length() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("?");
            sb.append(a);
            str = sb.toString();
        }
        return m31760a(str, i);
    }

    /* renamed from: a */
    public static String m31766a(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(map.size() * 20);
        for (String str : map.keySet()) {
            if (str != null) {
                String str2 = (String) map.get(str);
                if (str2 != null) {
                    try {
                        sb.append(URLEncoder.encode(str, "UTF-8"));
                        sb.append("=");
                        sb.append(URLEncoder.encode(str2, "UTF-8"));
                        sb.append("&");
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
            }
        }
        if (sb.length() > 0) {
            sb.delete(sb.length() - 1, sb.length());
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m31767b(String str) {
        return m31760a(str, 30000);
    }

    /* renamed from: b */
    public static String m31768b(String str, Map<String, String> map) {
        return m31769b(str, map, 30000);
    }

    /* renamed from: b */
    public static String m31769b(String str, Map<String, String> map, int i) {
        return m31762a(str, m31766a(map), i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m31770c(java.lang.String r3) {
        /*
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ all -> 0x002f }
            r1.<init>(r3)     // Catch:{ all -> 0x002f }
            java.net.URLConnection r3 = r1.openConnection()     // Catch:{ all -> 0x002f }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ all -> 0x002f }
            r0 = 10000(0x2710, float:1.4013E-41)
            r3.setReadTimeout(r0)     // Catch:{ all -> 0x002d }
            r3.setConnectTimeout(r0)     // Catch:{ all -> 0x002d }
            java.lang.String r0 = "HEAD"
            r3.setRequestMethod(r0)     // Catch:{ all -> 0x002d }
            java.lang.String r0 = "Accept-Encoding"
            java.lang.String r1 = ""
            r3.setRequestProperty(r0, r1)     // Catch:{ all -> 0x002d }
            r3.connect()     // Catch:{ all -> 0x002d }
            int r0 = r3.getResponseCode()     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x002c
            r3.disconnect()
        L_0x002c:
            return r0
        L_0x002d:
            r0 = move-exception
            goto L_0x0033
        L_0x002f:
            r3 = move-exception
            r2 = r0
            r0 = r3
            r3 = r2
        L_0x0033:
            if (r3 == 0) goto L_0x0038
            r3.disconnect()
        L_0x0038:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.util.HTTPUtil.m31770c(java.lang.String):int");
    }

    /* renamed from: d */
    public static boolean m31771d(String str) {
        try {
            return m31770c(str) == 200;
        } catch (IOException unused) {
            return false;
        }
    }
}
