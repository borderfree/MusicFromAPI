package com.seattleclouds.util.p192a;

import android.os.Handler;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpUriRequest;

/* renamed from: com.seattleclouds.util.a.c */
public class C6567c {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static String m31785a(HttpEntity httpEntity) {
        if (httpEntity != null) {
            InputStream content = httpEntity.getContent();
            if (content == null) {
                return "";
            }
            if (httpEntity.getContentLength() <= 2147483647L) {
                String b = m31788b(httpEntity);
                if (b == null) {
                    b = "ISO-8859-1";
                }
                InputStreamReader inputStreamReader = new InputStreamReader(content, b);
                StringBuilder sb = new StringBuilder();
                try {
                    char[] cArr = new char[1024];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read != -1) {
                            sb.append(cArr, 0, read);
                        } else {
                            inputStreamReader.close();
                            return sb.toString();
                        }
                    }
                } catch (Throwable th) {
                    inputStreamReader.close();
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
            }
        } else {
            throw new IllegalArgumentException("HTTP entity may not be null");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r2.consumeContent();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0014, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0015, code lost:
        r2.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        r2 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0010 A[SYNTHETIC, Splitter:B:11:0x0010] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0014 A[ExcHandler: ParseException (r2v1 'e' android.net.ParseException A[CUSTOM_DECLARE]), Splitter:B:2:0x0003] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m31786a(org.apache.http.HttpResponse r2) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x0018
            org.apache.http.HttpEntity r2 = r2.getEntity()     // Catch:{ ParseException -> 0x0014, IOException -> 0x000d }
            java.lang.String r1 = m31785a(r2)     // Catch:{ ParseException -> 0x0014, IOException -> 0x000e }
            r0 = r1
            goto L_0x0018
        L_0x000d:
            r2 = r0
        L_0x000e:
            if (r2 == 0) goto L_0x0018
            r2.consumeContent()     // Catch:{ IOException -> 0x0018 }
            goto L_0x0018
        L_0x0014:
            r2 = move-exception
            r2.printStackTrace()
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.util.p192a.C6567c.m31786a(org.apache.http.HttpResponse):java.lang.String");
    }

    /* renamed from: a */
    public static void m31787a(HttpUriRequest httpUriRequest, C6568d dVar) {
        new C6565a(httpUriRequest, new Handler(), new C6566b(dVar)).start();
    }

    /* renamed from: b */
    public static String m31788b(HttpEntity httpEntity) {
        if (httpEntity == null) {
            throw new IllegalArgumentException("HTTP entity may not be null");
        } else if (httpEntity.getContentType() == null) {
            return null;
        } else {
            HeaderElement[] elements = httpEntity.getContentType().getElements();
            if (elements.length <= 0) {
                return null;
            }
            NameValuePair parameterByName = elements[0].getParameterByName("charset");
            if (parameterByName != null) {
                return parameterByName.getValue();
            }
            return null;
        }
    }
}
