package com.facebook.ads.internal.p073r.p074a;

import android.os.Build.VERSION;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: com.facebook.ads.internal.r.a.a */
public class C1735a {

    /* renamed from: f */
    private static int[] f5726f = new int[20];

    /* renamed from: g */
    private static final String f5727g = C1735a.class.getSimpleName();

    /* renamed from: j */
    private static C1737a f5728j;

    /* renamed from: a */
    protected final C1750n f5729a = new C1740d() {
    };

    /* renamed from: b */
    protected final C1738b f5730b = new C1739c();

    /* renamed from: c */
    protected C1751o f5731c = new C1741e();

    /* renamed from: d */
    protected int f5732d = 2000;

    /* renamed from: e */
    protected int f5733e = 8000;

    /* renamed from: h */
    private int f5734h = 3;

    /* renamed from: i */
    private Map<String, String> f5735i = new TreeMap();

    /* renamed from: k */
    private boolean f5736k;

    /* renamed from: l */
    private Set<String> f5737l;

    /* renamed from: m */
    private Set<String> f5738m;

    /* renamed from: com.facebook.ads.internal.r.a.a$a */
    public interface C1737a {
        /* renamed from: a */
        Map<String, String> mo6971a();
    }

    static {
        m8697b();
        if (VERSION.SDK_INT > 8) {
            m8696a();
        }
    }

    /* renamed from: a */
    public static void m8696a() {
        if (CookieHandler.getDefault() == null) {
            CookieHandler.setDefault(new CookieManager());
        }
    }

    /* renamed from: b */
    private static void m8697b() {
        if (VERSION.SDK_INT < 8) {
            System.setProperty("http.keepAlive", "false");
        }
    }

    /* renamed from: c */
    private void m8698c(HttpURLConnection httpURLConnection) {
        for (String str : this.f5735i.keySet()) {
            httpURLConnection.setRequestProperty(str, (String) this.f5735i.get(str));
        }
        synchronized (C1735a.class) {
            if (f5728j != null) {
                Map a = f5728j.mo6971a();
                for (String str2 : a.keySet()) {
                    httpURLConnection.setRequestProperty(str2, (String) a.get(str2));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x001f A[SYNTHETIC, Splitter:B:17:0x001f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo6956a(java.net.HttpURLConnection r3, byte[] r4) {
        /*
            r2 = this;
            r0 = 0
            com.facebook.ads.internal.r.a.n r1 = r2.f5729a     // Catch:{ all -> 0x001b }
            java.io.OutputStream r1 = r1.mo6972a(r3)     // Catch:{ all -> 0x001b }
            if (r1 == 0) goto L_0x0011
            com.facebook.ads.internal.r.a.n r0 = r2.f5729a     // Catch:{ all -> 0x000f }
            r0.mo6974a(r1, r4)     // Catch:{ all -> 0x000f }
            goto L_0x0011
        L_0x000f:
            r3 = move-exception
            goto L_0x001d
        L_0x0011:
            int r3 = r3.getResponseCode()     // Catch:{ all -> 0x000f }
            if (r1 == 0) goto L_0x001a
            r1.close()     // Catch:{ Exception -> 0x001a }
        L_0x001a:
            return r3
        L_0x001b:
            r3 = move-exception
            r1 = r0
        L_0x001d:
            if (r1 == 0) goto L_0x0022
            r1.close()     // Catch:{ Exception -> 0x0022 }
        L_0x0022:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p073r.p074a.C1735a.mo6956a(java.net.HttpURLConnection, byte[]):int");
    }

    /* renamed from: a */
    public C1735a mo6957a(String str, String str2) {
        this.f5735i.put(str, str2);
        return this;
    }

    /* renamed from: a */
    public C1745i mo6958a(C1744h hVar) {
        try {
            return mo6959a(hVar.mo6983a(), hVar.mo6984b(), hVar.mo6985c(), hVar.mo6986d());
        } catch (C1749m e) {
            this.f5729a.mo6976a(e);
            return null;
        } catch (Exception e2) {
            this.f5729a.mo6976a(new C1749m(e2, null));
            return null;
        }
    }

    /* JADX INFO: used method not loaded: com.facebook.ads.internal.r.a.o.a(com.facebook.ads.internal.r.a.i):null, types can be incorrect */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:66|67|68|69|70) */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0087, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r5.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00c0, code lost:
        throw new com.facebook.ads.internal.p073r.p074a.C1749m(r5, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00c6, code lost:
        throw new com.facebook.ads.internal.p073r.p074a.C1749m(r5, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00cf, code lost:
        r3.f5731c.mo6979a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00d6, code lost:
        r4.disconnect();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x00b8 */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0096 A[SYNTHETIC, Splitter:B:52:0x0096] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.ads.internal.p073r.p074a.C1745i mo6959a(java.lang.String r4, com.facebook.ads.internal.p073r.p074a.C1746j r5, java.lang.String r6, byte[] r7) {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            r3.f5736k = r0     // Catch:{ Exception -> 0x008e, all -> 0x008b }
            java.net.HttpURLConnection r4 = r3.mo6962a(r4)     // Catch:{ Exception -> 0x008e, all -> 0x008b }
            r3.mo6964a(r4, r5, r6)     // Catch:{ Exception -> 0x0089 }
            r3.m8698c(r4)     // Catch:{ Exception -> 0x0089 }
            com.facebook.ads.internal.r.a.o r5 = r3.f5731c     // Catch:{ Exception -> 0x0089 }
            boolean r5 = r5.mo6982a()     // Catch:{ Exception -> 0x0089 }
            if (r5 == 0) goto L_0x001b
            com.facebook.ads.internal.r.a.o r5 = r3.f5731c     // Catch:{ Exception -> 0x0089 }
            r5.mo6981a(r4, r7)     // Catch:{ Exception -> 0x0089 }
        L_0x001b:
            r4.connect()     // Catch:{ Exception -> 0x0089 }
            r5 = 1
            r3.f5736k = r5     // Catch:{ Exception -> 0x0089 }
            java.util.Set<java.lang.String> r6 = r3.f5738m     // Catch:{ Exception -> 0x0089 }
            if (r6 == 0) goto L_0x002f
            java.util.Set<java.lang.String> r6 = r3.f5738m     // Catch:{ Exception -> 0x0089 }
            boolean r6 = r6.isEmpty()     // Catch:{ Exception -> 0x0089 }
            if (r6 != 0) goto L_0x002f
            r6 = 1
            goto L_0x0030
        L_0x002f:
            r6 = 0
        L_0x0030:
            java.util.Set<java.lang.String> r2 = r3.f5737l     // Catch:{ Exception -> 0x0089 }
            if (r2 == 0) goto L_0x003d
            java.util.Set<java.lang.String> r2 = r3.f5737l     // Catch:{ Exception -> 0x0089 }
            boolean r2 = r2.isEmpty()     // Catch:{ Exception -> 0x0089 }
            if (r2 != 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r5 = 0
        L_0x003e:
            boolean r0 = r4 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ Exception -> 0x0089 }
            if (r0 == 0) goto L_0x0059
            if (r6 != 0) goto L_0x0046
            if (r5 == 0) goto L_0x0059
        L_0x0046:
            r5 = r4
            javax.net.ssl.HttpsURLConnection r5 = (javax.net.ssl.HttpsURLConnection) r5     // Catch:{ Exception -> 0x0051 }
            java.util.Set<java.lang.String> r6 = r3.f5738m     // Catch:{ Exception -> 0x0051 }
            java.util.Set<java.lang.String> r0 = r3.f5737l     // Catch:{ Exception -> 0x0051 }
            com.facebook.ads.internal.p073r.p074a.C1747k.m8740a(r5, r6, r0)     // Catch:{ Exception -> 0x0051 }
            goto L_0x0059
        L_0x0051:
            r5 = move-exception
            java.lang.String r6 = f5727g     // Catch:{ Exception -> 0x0089 }
            java.lang.String r0 = "Unable to validate SSL certificates."
            android.util.Log.e(r6, r0, r5)     // Catch:{ Exception -> 0x0089 }
        L_0x0059:
            boolean r5 = r4.getDoOutput()     // Catch:{ Exception -> 0x0089 }
            if (r5 == 0) goto L_0x0064
            if (r7 == 0) goto L_0x0064
            r3.mo6956a(r4, r7)     // Catch:{ Exception -> 0x0089 }
        L_0x0064:
            boolean r5 = r4.getDoInput()     // Catch:{ Exception -> 0x0089 }
            if (r5 == 0) goto L_0x006f
            com.facebook.ads.internal.r.a.i r5 = r3.mo6961a(r4)     // Catch:{ Exception -> 0x0089 }
            goto L_0x0074
        L_0x006f:
            com.facebook.ads.internal.r.a.i r5 = new com.facebook.ads.internal.r.a.i     // Catch:{ Exception -> 0x0089 }
            r5.<init>(r4, r1)     // Catch:{ Exception -> 0x0089 }
        L_0x0074:
            com.facebook.ads.internal.r.a.o r6 = r3.f5731c
            boolean r6 = r6.mo6982a()
            if (r6 == 0) goto L_0x0081
            com.facebook.ads.internal.r.a.o r6 = r3.f5731c
            r6.mo6979a(r5)
        L_0x0081:
            if (r4 == 0) goto L_0x0086
            r4.disconnect()
        L_0x0086:
            return r5
        L_0x0087:
            r5 = move-exception
            goto L_0x00c7
        L_0x0089:
            r5 = move-exception
            goto L_0x0090
        L_0x008b:
            r5 = move-exception
            r4 = r1
            goto L_0x00c7
        L_0x008e:
            r5 = move-exception
            r4 = r1
        L_0x0090:
            com.facebook.ads.internal.r.a.i r6 = r3.mo6967b(r4)     // Catch:{ Exception -> 0x00b8 }
            if (r6 == 0) goto L_0x00b2
            int r7 = r6.mo6987a()     // Catch:{ all -> 0x00af }
            if (r7 <= 0) goto L_0x00b2
            com.facebook.ads.internal.r.a.o r5 = r3.f5731c
            boolean r5 = r5.mo6982a()
            if (r5 == 0) goto L_0x00a9
            com.facebook.ads.internal.r.a.o r5 = r3.f5731c
            r5.mo6979a(r6)
        L_0x00a9:
            if (r4 == 0) goto L_0x00ae
            r4.disconnect()
        L_0x00ae:
            return r6
        L_0x00af:
            r5 = move-exception
            r1 = r6
            goto L_0x00c7
        L_0x00b2:
            com.facebook.ads.internal.r.a.m r7 = new com.facebook.ads.internal.r.a.m     // Catch:{ all -> 0x00af }
            r7.<init>(r5, r6)     // Catch:{ all -> 0x00af }
            throw r7     // Catch:{ all -> 0x00af }
        L_0x00b8:
            r5.printStackTrace()     // Catch:{ all -> 0x00c1 }
            com.facebook.ads.internal.r.a.m r6 = new com.facebook.ads.internal.r.a.m     // Catch:{ all -> 0x0087 }
            r6.<init>(r5, r1)     // Catch:{ all -> 0x0087 }
            throw r6     // Catch:{ all -> 0x0087 }
        L_0x00c1:
            com.facebook.ads.internal.r.a.m r6 = new com.facebook.ads.internal.r.a.m     // Catch:{ all -> 0x0087 }
            r6.<init>(r5, r1)     // Catch:{ all -> 0x0087 }
            throw r6     // Catch:{ all -> 0x0087 }
        L_0x00c7:
            com.facebook.ads.internal.r.a.o r6 = r3.f5731c
            boolean r6 = r6.mo6982a()
            if (r6 == 0) goto L_0x00d4
            com.facebook.ads.internal.r.a.o r6 = r3.f5731c
            r6.mo6979a(r1)
        L_0x00d4:
            if (r4 == 0) goto L_0x00d9
            r4.disconnect()
        L_0x00d9:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p073r.p074a.C1735a.mo6959a(java.lang.String, com.facebook.ads.internal.r.a.j, java.lang.String, byte[]):com.facebook.ads.internal.r.a.i");
    }

    /* renamed from: a */
    public C1745i mo6960a(String str, C1748l lVar) {
        return mo6958a((C1744h) new C1742f(str, lVar));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0021 A[SYNTHETIC, Splitter:B:17:0x0021] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.ads.internal.p073r.p074a.C1745i mo6961a(java.net.HttpURLConnection r4) {
        /*
            r3 = this;
            r0 = 0
            com.facebook.ads.internal.r.a.n r1 = r3.f5729a     // Catch:{ all -> 0x001d }
            java.io.InputStream r1 = r1.mo6978b(r4)     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x0012
            com.facebook.ads.internal.r.a.n r0 = r3.f5729a     // Catch:{ all -> 0x0010 }
            byte[] r0 = r0.mo6977a(r1)     // Catch:{ all -> 0x0010 }
            goto L_0x0012
        L_0x0010:
            r4 = move-exception
            goto L_0x001f
        L_0x0012:
            com.facebook.ads.internal.r.a.i r2 = new com.facebook.ads.internal.r.a.i     // Catch:{ all -> 0x0010 }
            r2.<init>(r4, r0)     // Catch:{ all -> 0x0010 }
            if (r1 == 0) goto L_0x001c
            r1.close()     // Catch:{ Exception -> 0x001c }
        L_0x001c:
            return r2
        L_0x001d:
            r4 = move-exception
            r1 = r0
        L_0x001f:
            if (r1 == 0) goto L_0x0024
            r1.close()     // Catch:{ Exception -> 0x0024 }
        L_0x0024:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p073r.p074a.C1735a.mo6961a(java.net.HttpURLConnection):com.facebook.ads.internal.r.a.i");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public HttpURLConnection mo6962a(String str) {
        try {
            new URL(str);
            return this.f5729a.mo6973a(str);
        } catch (MalformedURLException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" is not a valid URL");
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    /* renamed from: a */
    public void mo6963a(int i) {
        if (i < 1 || i > 18) {
            throw new IllegalArgumentException("Maximum retries must be between 1 and 18");
        }
        this.f5734h = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6964a(HttpURLConnection httpURLConnection, C1746j jVar, String str) {
        httpURLConnection.setConnectTimeout(this.f5732d);
        httpURLConnection.setReadTimeout(this.f5733e);
        this.f5729a.mo6975a(httpURLConnection, jVar, str);
    }

    /* renamed from: a */
    public void mo6965a(Set<String> set) {
        this.f5738m = set;
    }

    /* renamed from: b */
    public C1745i mo6966b(String str, C1748l lVar) {
        return mo6958a((C1744h) new C1743g(str, lVar));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x001f A[SYNTHETIC, Splitter:B:17:0x001f] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.ads.internal.p073r.p074a.C1745i mo6967b(java.net.HttpURLConnection r4) {
        /*
            r3 = this;
            r0 = 0
            java.io.InputStream r1 = r4.getErrorStream()     // Catch:{ all -> 0x001b }
            if (r1 == 0) goto L_0x0010
            com.facebook.ads.internal.r.a.n r0 = r3.f5729a     // Catch:{ all -> 0x000e }
            byte[] r0 = r0.mo6977a(r1)     // Catch:{ all -> 0x000e }
            goto L_0x0010
        L_0x000e:
            r4 = move-exception
            goto L_0x001d
        L_0x0010:
            com.facebook.ads.internal.r.a.i r2 = new com.facebook.ads.internal.r.a.i     // Catch:{ all -> 0x000e }
            r2.<init>(r4, r0)     // Catch:{ all -> 0x000e }
            if (r1 == 0) goto L_0x001a
            r1.close()     // Catch:{ Exception -> 0x001a }
        L_0x001a:
            return r2
        L_0x001b:
            r4 = move-exception
            r1 = r0
        L_0x001d:
            if (r1 == 0) goto L_0x0022
            r1.close()     // Catch:{ Exception -> 0x0022 }
        L_0x0022:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p073r.p074a.C1735a.mo6967b(java.net.HttpURLConnection):com.facebook.ads.internal.r.a.i");
    }

    /* renamed from: b */
    public void mo6968b(int i) {
        this.f5732d = i;
    }

    /* renamed from: b */
    public void mo6969b(Set<String> set) {
        this.f5737l = set;
    }

    /* renamed from: c */
    public void mo6970c(int i) {
        this.f5733e = i;
    }
}
