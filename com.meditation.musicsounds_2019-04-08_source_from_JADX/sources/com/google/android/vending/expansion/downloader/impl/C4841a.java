package com.google.android.vending.expansion.downloader.impl;

import android.os.Looper;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpContext;

/* renamed from: com.google.android.vending.expansion.downloader.impl.a */
public final class C4841a implements HttpClient {

    /* renamed from: a */
    static Class<?> f17443a;

    /* renamed from: b */
    public static long f17444b = 256;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final HttpRequestInterceptor f17445c = new HttpRequestInterceptor() {
        public void process(HttpRequest httpRequest, HttpContext httpContext) {
            if (Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper()) {
                throw new RuntimeException("This thread forbids HTTP requests");
            }
        }
    };

    /* renamed from: d */
    private final HttpClient f17446d;

    /* renamed from: e */
    private RuntimeException f17447e = new IllegalStateException("AndroidHttpClient created and never closed");
    /* access modifiers changed from: private */

    /* renamed from: f */
    public volatile C4845b f17448f;

    /* renamed from: com.google.android.vending.expansion.downloader.impl.a$a */
    private class C4844a implements HttpRequestInterceptor {
        private C4844a() {
        }

        public void process(HttpRequest httpRequest, HttpContext httpContext) {
            C4845b a = C4841a.this.f17448f;
            if (a != null && a.m24254a() && (httpRequest instanceof HttpUriRequest)) {
                a.m24253a(C4841a.m24249b((HttpUriRequest) httpRequest, false));
            }
        }
    }

    /* renamed from: com.google.android.vending.expansion.downloader.impl.a$b */
    private static class C4845b {

        /* renamed from: a */
        private final String f17451a;

        /* renamed from: b */
        private final int f17452b;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m24253a(String str) {
            Log.println(this.f17452b, this.f17451a, str);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean m24254a() {
            return Log.isLoggable(this.f17451a, this.f17452b);
        }
    }

    static {
        try {
            f17443a = Class.forName("android.net.SSLSessionCache");
        } catch (Exception unused) {
        }
    }

    private C4841a(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.f17446d = new DefaultHttpClient(clientConnectionManager, httpParams) {
            /* access modifiers changed from: protected */
            public HttpContext createHttpContext() {
                BasicHttpContext basicHttpContext = new BasicHttpContext();
                basicHttpContext.setAttribute("http.authscheme-registry", getAuthSchemes());
                basicHttpContext.setAttribute("http.cookiespec-registry", getCookieSpecs());
                basicHttpContext.setAttribute("http.auth.credentials-provider", getCredentialsProvider());
                return basicHttpContext;
            }

            /* access modifiers changed from: protected */
            public BasicHttpProcessor createHttpProcessor() {
                BasicHttpProcessor createHttpProcessor = C4841a.super.createHttpProcessor();
                createHttpProcessor.addRequestInterceptor(C4841a.f17445c);
                createHttpProcessor.addRequestInterceptor(new C4844a());
                return createHttpProcessor;
            }
        };
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ae  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.vending.expansion.downloader.impl.C4841a m24247a(java.lang.String r10, android.content.Context r11) {
        /*
            org.apache.http.params.BasicHttpParams r0 = new org.apache.http.params.BasicHttpParams
            r0.<init>()
            r1 = 0
            org.apache.http.params.HttpConnectionParams.setStaleCheckingEnabled(r0, r1)
            r2 = 60000(0xea60, float:8.4078E-41)
            org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r0, r2)
            org.apache.http.params.HttpConnectionParams.setSoTimeout(r0, r2)
            r3 = 8192(0x2000, float:1.14794E-41)
            org.apache.http.params.HttpConnectionParams.setSocketBufferSize(r0, r3)
            org.apache.http.client.params.HttpClientParams.setRedirecting(r0, r1)
            r3 = 0
            r4 = 1
            if (r11 == 0) goto L_0x0054
            java.lang.Class<?> r5 = f17443a
            if (r5 == 0) goto L_0x0054
            java.lang.Class<?> r5 = f17443a     // Catch:{ SecurityException -> 0x0050, NoSuchMethodException -> 0x004b, IllegalArgumentException -> 0x0046, InstantiationException -> 0x0041, IllegalAccessException -> 0x003c, InvocationTargetException -> 0x0037 }
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ SecurityException -> 0x0050, NoSuchMethodException -> 0x004b, IllegalArgumentException -> 0x0046, InstantiationException -> 0x0041, IllegalAccessException -> 0x003c, InvocationTargetException -> 0x0037 }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r1] = r7     // Catch:{ SecurityException -> 0x0050, NoSuchMethodException -> 0x004b, IllegalArgumentException -> 0x0046, InstantiationException -> 0x0041, IllegalAccessException -> 0x003c, InvocationTargetException -> 0x0037 }
            java.lang.reflect.Constructor r5 = r5.getConstructor(r6)     // Catch:{ SecurityException -> 0x0050, NoSuchMethodException -> 0x004b, IllegalArgumentException -> 0x0046, InstantiationException -> 0x0041, IllegalAccessException -> 0x003c, InvocationTargetException -> 0x0037 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ SecurityException -> 0x0050, NoSuchMethodException -> 0x004b, IllegalArgumentException -> 0x0046, InstantiationException -> 0x0041, IllegalAccessException -> 0x003c, InvocationTargetException -> 0x0037 }
            r6[r1] = r11     // Catch:{ SecurityException -> 0x0050, NoSuchMethodException -> 0x004b, IllegalArgumentException -> 0x0046, InstantiationException -> 0x0041, IllegalAccessException -> 0x003c, InvocationTargetException -> 0x0037 }
            java.lang.Object r11 = r5.newInstance(r6)     // Catch:{ SecurityException -> 0x0050, NoSuchMethodException -> 0x004b, IllegalArgumentException -> 0x0046, InstantiationException -> 0x0041, IllegalAccessException -> 0x003c, InvocationTargetException -> 0x0037 }
            goto L_0x0055
        L_0x0037:
            r11 = move-exception
            r11.printStackTrace()
            goto L_0x0054
        L_0x003c:
            r11 = move-exception
            r11.printStackTrace()
            goto L_0x0054
        L_0x0041:
            r11 = move-exception
            r11.printStackTrace()
            goto L_0x0054
        L_0x0046:
            r11 = move-exception
            r11.printStackTrace()
            goto L_0x0054
        L_0x004b:
            r11 = move-exception
            r11.printStackTrace()
            goto L_0x0054
        L_0x0050:
            r11 = move-exception
            r11.printStackTrace()
        L_0x0054:
            r11 = r3
        L_0x0055:
            org.apache.http.params.HttpProtocolParams.setUserAgent(r0, r10)
            org.apache.http.conn.scheme.SchemeRegistry r10 = new org.apache.http.conn.scheme.SchemeRegistry
            r10.<init>()
            org.apache.http.conn.scheme.Scheme r5 = new org.apache.http.conn.scheme.Scheme
            java.lang.String r6 = "http"
            org.apache.http.conn.scheme.PlainSocketFactory r7 = org.apache.http.conn.scheme.PlainSocketFactory.getSocketFactory()
            r8 = 80
            r5.<init>(r6, r7, r8)
            r10.register(r5)
            if (r11 == 0) goto L_0x00ab
            java.lang.Class<android.net.SSLCertificateSocketFactory> r5 = android.net.SSLCertificateSocketFactory.class
            java.lang.String r6 = "getHttpSocketFactory"
            r7 = 2
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch:{ SecurityException -> 0x00a7, NoSuchMethodException -> 0x00a2, IllegalArgumentException -> 0x009d, IllegalAccessException -> 0x0098, InvocationTargetException -> 0x0093 }
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ SecurityException -> 0x00a7, NoSuchMethodException -> 0x00a2, IllegalArgumentException -> 0x009d, IllegalAccessException -> 0x0098, InvocationTargetException -> 0x0093 }
            r8[r1] = r9     // Catch:{ SecurityException -> 0x00a7, NoSuchMethodException -> 0x00a2, IllegalArgumentException -> 0x009d, IllegalAccessException -> 0x0098, InvocationTargetException -> 0x0093 }
            java.lang.Class<?> r9 = f17443a     // Catch:{ SecurityException -> 0x00a7, NoSuchMethodException -> 0x00a2, IllegalArgumentException -> 0x009d, IllegalAccessException -> 0x0098, InvocationTargetException -> 0x0093 }
            r8[r4] = r9     // Catch:{ SecurityException -> 0x00a7, NoSuchMethodException -> 0x00a2, IllegalArgumentException -> 0x009d, IllegalAccessException -> 0x0098, InvocationTargetException -> 0x0093 }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r8)     // Catch:{ SecurityException -> 0x00a7, NoSuchMethodException -> 0x00a2, IllegalArgumentException -> 0x009d, IllegalAccessException -> 0x0098, InvocationTargetException -> 0x0093 }
            java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch:{ SecurityException -> 0x00a7, NoSuchMethodException -> 0x00a2, IllegalArgumentException -> 0x009d, IllegalAccessException -> 0x0098, InvocationTargetException -> 0x0093 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SecurityException -> 0x00a7, NoSuchMethodException -> 0x00a2, IllegalArgumentException -> 0x009d, IllegalAccessException -> 0x0098, InvocationTargetException -> 0x0093 }
            r6[r1] = r2     // Catch:{ SecurityException -> 0x00a7, NoSuchMethodException -> 0x00a2, IllegalArgumentException -> 0x009d, IllegalAccessException -> 0x0098, InvocationTargetException -> 0x0093 }
            r6[r4] = r11     // Catch:{ SecurityException -> 0x00a7, NoSuchMethodException -> 0x00a2, IllegalArgumentException -> 0x009d, IllegalAccessException -> 0x0098, InvocationTargetException -> 0x0093 }
            java.lang.Object r11 = r5.invoke(r3, r6)     // Catch:{ SecurityException -> 0x00a7, NoSuchMethodException -> 0x00a2, IllegalArgumentException -> 0x009d, IllegalAccessException -> 0x0098, InvocationTargetException -> 0x0093 }
            org.apache.http.conn.scheme.SocketFactory r11 = (org.apache.http.conn.scheme.SocketFactory) r11     // Catch:{ SecurityException -> 0x00a7, NoSuchMethodException -> 0x00a2, IllegalArgumentException -> 0x009d, IllegalAccessException -> 0x0098, InvocationTargetException -> 0x0093 }
            goto L_0x00ac
        L_0x0093:
            r11 = move-exception
            r11.printStackTrace()
            goto L_0x00ab
        L_0x0098:
            r11 = move-exception
            r11.printStackTrace()
            goto L_0x00ab
        L_0x009d:
            r11 = move-exception
            r11.printStackTrace()
            goto L_0x00ab
        L_0x00a2:
            r11 = move-exception
            r11.printStackTrace()
            goto L_0x00ab
        L_0x00a7:
            r11 = move-exception
            r11.printStackTrace()
        L_0x00ab:
            r11 = r3
        L_0x00ac:
            if (r11 != 0) goto L_0x00b2
            org.apache.http.conn.ssl.SSLSocketFactory r11 = org.apache.http.conn.ssl.SSLSocketFactory.getSocketFactory()
        L_0x00b2:
            org.apache.http.conn.scheme.Scheme r1 = new org.apache.http.conn.scheme.Scheme
            java.lang.String r2 = "https"
            r3 = 443(0x1bb, float:6.21E-43)
            r1.<init>(r2, r11, r3)
            r10.register(r1)
            org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager r11 = new org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager
            r11.<init>(r0, r10)
            com.google.android.vending.expansion.downloader.impl.a r10 = new com.google.android.vending.expansion.downloader.impl.a
            r10.<init>(r11, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.vending.expansion.downloader.impl.C4841a.m24247a(java.lang.String, android.content.Context):com.google.android.vending.expansion.downloader.impl.a");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m24249b(HttpUriRequest httpUriRequest, boolean z) {
        Header[] allHeaders;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("curl ");
        for (Header header : httpUriRequest.getAllHeaders()) {
            if (z || (!header.getName().equals("Authorization") && !header.getName().equals("Cookie"))) {
                sb.append("--header \"");
                sb.append(header.toString().trim());
                sb.append("\" ");
            }
        }
        URI uri = httpUriRequest.getURI();
        if (httpUriRequest instanceof RequestWrapper) {
            HttpUriRequest original = ((RequestWrapper) httpUriRequest).getOriginal();
            if (original instanceof HttpUriRequest) {
                uri = original.getURI();
            }
        }
        sb.append("\"");
        sb.append(uri);
        sb.append("\"");
        if (httpUriRequest instanceof HttpEntityEnclosingRequest) {
            HttpEntity entity = ((HttpEntityEnclosingRequest) httpUriRequest).getEntity();
            if (entity != null && entity.isRepeatable()) {
                if (entity.getContentLength() < 1024) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    entity.writeTo(byteArrayOutputStream);
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                    sb.append(" --data-ascii \"");
                    sb.append(byteArrayOutputStream2);
                    str = "\"";
                } else {
                    str = " [TOO MUCH DATA TO INCLUDE]";
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo16000a() {
        if (this.f17447e != null) {
            getConnectionManager().shutdown();
            this.f17447e = null;
        }
    }

    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        return this.f17446d.execute(httpHost, httpRequest, responseHandler);
    }

    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return this.f17446d.execute(httpHost, httpRequest, responseHandler, httpContext);
    }

    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) {
        return this.f17446d.execute(httpUriRequest, responseHandler);
    }

    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return this.f17446d.execute(httpUriRequest, responseHandler, httpContext);
    }

    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        return this.f17446d.execute(httpHost, httpRequest);
    }

    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return this.f17446d.execute(httpHost, httpRequest, httpContext);
    }

    public HttpResponse execute(HttpUriRequest httpUriRequest) {
        return this.f17446d.execute(httpUriRequest);
    }

    public HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return this.f17446d.execute(httpUriRequest, httpContext);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        super.finalize();
        if (this.f17447e != null) {
            Log.e("AndroidHttpClient", "Leak found", this.f17447e);
            this.f17447e = null;
        }
    }

    public ClientConnectionManager getConnectionManager() {
        return this.f17446d.getConnectionManager();
    }

    public HttpParams getParams() {
        return this.f17446d.getParams();
    }
}
