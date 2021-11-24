package com.google.android.bitmapfun;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.Toast;
import com.seattleclouds.C5451m.C5462k;
import java.io.File;
import java.io.IOException;

/* renamed from: com.google.android.bitmapfun.c */
public class C2422c extends C2423d {

    /* renamed from: e */
    private C2412a f7710e;

    /* renamed from: f */
    private File f7711f;

    /* renamed from: g */
    private boolean f7712g = true;

    /* renamed from: h */
    private final Object f7713h = new Object();

    public C2422c(Context context, int i) {
        super(context, i);
        m11252a(context);
    }

    public C2422c(Context context, int i, boolean z) {
        super(context, i);
        m11253a(context, z);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r8v2, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r8v14, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r8v15 */
    /* JADX WARNING: type inference failed for: r8v17, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: type inference failed for: r0v20 */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: type inference failed for: r0v23 */
    /* JADX WARNING: type inference failed for: r0v24 */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: type inference failed for: r0v26 */
    /* JADX WARNING: type inference failed for: r8v23 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:25|26|(2:55|56)|57|58) */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009b, code lost:
        if (r0 != 0) goto L_0x009d;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0007 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00a9 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v4
      assigns: []
      uses: []
      mth insns count: 95
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0007 A[LOOP:0: B:2:0x0007->B:73:0x0007, LOOP_START, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0082 A[Catch:{ IOException -> 0x0083, IllegalStateException -> 0x0068, all -> 0x0065, all -> 0x00a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a6 A[SYNTHETIC, Splitter:B:55:0x00a6] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00bd A[SYNTHETIC, Splitter:B:65:0x00bd] */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap m11251a(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = com.google.android.bitmapfun.C2418b.m11232c(r8)
            java.lang.Object r1 = r7.f7713h
            monitor-enter(r1)
        L_0x0007:
            boolean r2 = r7.f7712g     // Catch:{ all -> 0x00c1 }
            if (r2 == 0) goto L_0x0011
            java.lang.Object r2 = r7.f7713h     // Catch:{ InterruptedException -> 0x0007 }
            r2.wait()     // Catch:{ InterruptedException -> 0x0007 }
            goto L_0x0007
        L_0x0011:
            com.google.android.bitmapfun.a r2 = r7.f7710e     // Catch:{ all -> 0x00c1 }
            r3 = 0
            if (r2 == 0) goto L_0x00aa
            com.google.android.bitmapfun.a r2 = r7.f7710e     // Catch:{ IOException -> 0x0083, IllegalStateException -> 0x0068, all -> 0x0065 }
            com.google.android.bitmapfun.a$c r2 = r2.mo8535a(r0)     // Catch:{ IOException -> 0x0083, IllegalStateException -> 0x0068, all -> 0x0065 }
            r4 = 0
            if (r2 != 0) goto L_0x003e
            com.google.android.bitmapfun.a r2 = r7.f7710e     // Catch:{ IOException -> 0x0083, IllegalStateException -> 0x0068, all -> 0x0065 }
            com.google.android.bitmapfun.a$a r2 = r2.mo8537b(r0)     // Catch:{ IOException -> 0x0083, IllegalStateException -> 0x0068, all -> 0x0065 }
            if (r2 == 0) goto L_0x0038
            java.io.OutputStream r5 = r2.mo8544a(r4)     // Catch:{ IOException -> 0x0083, IllegalStateException -> 0x0068, all -> 0x0065 }
            boolean r8 = r7.mo8570a(r8, r5)     // Catch:{ IOException -> 0x0083, IllegalStateException -> 0x0068, all -> 0x0065 }
            if (r8 == 0) goto L_0x0035
            r2.mo8545a()     // Catch:{ IOException -> 0x0083, IllegalStateException -> 0x0068, all -> 0x0065 }
            goto L_0x0038
        L_0x0035:
            r2.mo8546b()     // Catch:{ IOException -> 0x0083, IllegalStateException -> 0x0068, all -> 0x0065 }
        L_0x0038:
            com.google.android.bitmapfun.a r8 = r7.f7710e     // Catch:{ IOException -> 0x0083, IllegalStateException -> 0x0068, all -> 0x0065 }
            com.google.android.bitmapfun.a$c r2 = r8.mo8535a(r0)     // Catch:{ IOException -> 0x0083, IllegalStateException -> 0x0068, all -> 0x0065 }
        L_0x003e:
            if (r2 == 0) goto L_0x005b
            java.io.InputStream r8 = r2.mo8554a(r4)     // Catch:{ IOException -> 0x0083, IllegalStateException -> 0x0068, all -> 0x0065 }
            java.io.FileInputStream r8 = (java.io.FileInputStream) r8     // Catch:{ IOException -> 0x0083, IllegalStateException -> 0x0068, all -> 0x0065 }
            java.io.FileDescriptor r0 = r8.getFD()     // Catch:{ IOException -> 0x0056, IllegalStateException -> 0x0051, all -> 0x004b }
            goto L_0x005d
        L_0x004b:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
            goto L_0x00a4
        L_0x0051:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
            goto L_0x006a
        L_0x0056:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
            goto L_0x0085
        L_0x005b:
            r8 = r3
            r0 = r8
        L_0x005d:
            if (r0 != 0) goto L_0x00ac
            if (r8 == 0) goto L_0x00ac
            r8.close()     // Catch:{ IOException -> 0x00ac }
            goto L_0x00ac
        L_0x0065:
            r8 = move-exception
            r0 = r3
            goto L_0x00a4
        L_0x0068:
            r8 = move-exception
            r0 = r3
        L_0x006a:
            java.lang.String r2 = "ImageFetcher"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a3 }
            r4.<init>()     // Catch:{ all -> 0x00a3 }
            java.lang.String r5 = "processBitmap - "
            r4.append(r5)     // Catch:{ all -> 0x00a3 }
            r4.append(r8)     // Catch:{ all -> 0x00a3 }
            java.lang.String r8 = r4.toString()     // Catch:{ all -> 0x00a3 }
            android.util.Log.e(r2, r8)     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x00a0
            goto L_0x009d
        L_0x0083:
            r8 = move-exception
            r0 = r3
        L_0x0085:
            java.lang.String r2 = "ImageFetcher"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a3 }
            r4.<init>()     // Catch:{ all -> 0x00a3 }
            java.lang.String r5 = "processBitmap - "
            r4.append(r5)     // Catch:{ all -> 0x00a3 }
            r4.append(r8)     // Catch:{ all -> 0x00a3 }
            java.lang.String r8 = r4.toString()     // Catch:{ all -> 0x00a3 }
            android.util.Log.e(r2, r8)     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x00a0
        L_0x009d:
            r0.close()     // Catch:{ IOException -> 0x00a0 }
        L_0x00a0:
            r8 = r0
            r0 = r3
            goto L_0x00ac
        L_0x00a3:
            r8 = move-exception
        L_0x00a4:
            if (r0 == 0) goto L_0x00a9
            r0.close()     // Catch:{ IOException -> 0x00a9 }
        L_0x00a9:
            throw r8     // Catch:{ all -> 0x00c1 }
        L_0x00aa:
            r8 = r3
            r0 = r8
        L_0x00ac:
            monitor-exit(r1)     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x00bb
            int r1 = r7.f7714a
            int r2 = r7.f7715b
            com.google.android.bitmapfun.b r3 = r7.mo8582f()
            android.graphics.Bitmap r3 = m11265a(r0, r1, r2, r3)
        L_0x00bb:
            if (r8 == 0) goto L_0x00c0
            r8.close()     // Catch:{ IOException -> 0x00c0 }
        L_0x00c0:
            return r3
        L_0x00c1:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00c1 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.bitmapfun.C2422c.m11251a(java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: a */
    private void m11252a(Context context) {
        m11254b(context, true);
        this.f7711f = C2418b.m11228a(context, "http");
    }

    /* renamed from: a */
    private void m11253a(Context context, boolean z) {
        m11254b(context, z);
        this.f7711f = C2418b.m11228a(context, "http");
    }

    /* renamed from: b */
    private void m11254b(Context context, boolean z) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
                if (z) {
                    Toast.makeText(context, C5462k.common_no_network, 1).show();
                }
                Log.e("ImageFetcher", "checkConnection - no connection found");
            }
        }
    }

    /* renamed from: e */
    public static void m11255e() {
        if (VERSION.SDK_INT < 8) {
            System.setProperty("http.keepAlive", "false");
        }
    }

    /* renamed from: j */
    private void m11256j() {
        if (!this.f7711f.exists()) {
            this.f7711f.mkdirs();
        }
        synchronized (this.f7713h) {
            if (C2418b.m11224a(this.f7711f) > 10485760) {
                try {
                    this.f7710e = C2412a.m11174a(this.f7711f, 1, 1, 10485760);
                } catch (IOException unused) {
                    this.f7710e = null;
                }
            }
            this.f7712g = false;
            this.f7713h.notifyAll();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo8568a(Object obj) {
        return m11251a(String.valueOf(obj));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8569a() {
        super.mo8569a();
        m11256j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006f A[SYNTHETIC, Splitter:B:40:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0074 A[Catch:{ IOException -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0081 A[SYNTHETIC, Splitter:B:51:0x0081] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0086 A[Catch:{ IOException -> 0x0089 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo8570a(java.lang.String r6, java.io.OutputStream r7) {
        /*
            r5 = this;
            m11255e()
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ IOException -> 0x004f, all -> 0x004b }
            r1.<init>(r6)     // Catch:{ IOException -> 0x004f, all -> 0x004b }
            java.net.URLConnection r6 = r1.openConnection()     // Catch:{ IOException -> 0x004f, all -> 0x004b }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ IOException -> 0x004f, all -> 0x004b }
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0046, all -> 0x0041 }
            java.io.InputStream r2 = r6.getInputStream()     // Catch:{ IOException -> 0x0046, all -> 0x0041 }
            r3 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r2, r3)     // Catch:{ IOException -> 0x0046, all -> 0x0041 }
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            r2.<init>(r7, r3)     // Catch:{ IOException -> 0x003e, all -> 0x003b }
        L_0x001f:
            int r7 = r1.read()     // Catch:{ IOException -> 0x0039, all -> 0x0037 }
            r0 = -1
            if (r7 == r0) goto L_0x002a
            r2.write(r7)     // Catch:{ IOException -> 0x0039, all -> 0x0037 }
            goto L_0x001f
        L_0x002a:
            r7 = 1
            if (r6 == 0) goto L_0x0030
            r6.disconnect()
        L_0x0030:
            r2.close()     // Catch:{ IOException -> 0x0036 }
            r1.close()     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            return r7
        L_0x0037:
            r7 = move-exception
            goto L_0x0044
        L_0x0039:
            r7 = move-exception
            goto L_0x0049
        L_0x003b:
            r7 = move-exception
            r2 = r0
            goto L_0x0044
        L_0x003e:
            r7 = move-exception
            r2 = r0
            goto L_0x0049
        L_0x0041:
            r7 = move-exception
            r1 = r0
            r2 = r1
        L_0x0044:
            r0 = r6
            goto L_0x007a
        L_0x0046:
            r7 = move-exception
            r1 = r0
            r2 = r1
        L_0x0049:
            r0 = r6
            goto L_0x0052
        L_0x004b:
            r7 = move-exception
            r1 = r0
            r2 = r1
            goto L_0x007a
        L_0x004f:
            r7 = move-exception
            r1 = r0
            r2 = r1
        L_0x0052:
            java.lang.String r6 = "ImageFetcher"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0079 }
            r3.<init>()     // Catch:{ all -> 0x0079 }
            java.lang.String r4 = "Error in downloadBitmap - "
            r3.append(r4)     // Catch:{ all -> 0x0079 }
            r3.append(r7)     // Catch:{ all -> 0x0079 }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x0079 }
            android.util.Log.e(r6, r7)     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x006d
            r0.disconnect()
        L_0x006d:
            if (r2 == 0) goto L_0x0072
            r2.close()     // Catch:{ IOException -> 0x0077 }
        L_0x0072:
            if (r1 == 0) goto L_0x0077
            r1.close()     // Catch:{ IOException -> 0x0077 }
        L_0x0077:
            r6 = 0
            return r6
        L_0x0079:
            r7 = move-exception
        L_0x007a:
            if (r0 == 0) goto L_0x007f
            r0.disconnect()
        L_0x007f:
            if (r2 == 0) goto L_0x0084
            r2.close()     // Catch:{ IOException -> 0x0089 }
        L_0x0084:
            if (r1 == 0) goto L_0x0089
            r1.close()     // Catch:{ IOException -> 0x0089 }
        L_0x0089:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.bitmapfun.C2422c.mo8570a(java.lang.String, java.io.OutputStream):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8571b() {
        super.mo8571b();
        synchronized (this.f7713h) {
            if (this.f7710e != null && !this.f7710e.mo8536a()) {
                try {
                    this.f7710e.mo8539c();
                } catch (IOException e) {
                    String str = "ImageFetcher";
                    StringBuilder sb = new StringBuilder();
                    sb.append("clearCacheInternal - ");
                    sb.append(e);
                    Log.e(str, sb.toString());
                }
                this.f7710e = null;
                this.f7712g = true;
                m11256j();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo8572c() {
        super.mo8572c();
        synchronized (this.f7713h) {
            if (this.f7710e != null) {
                try {
                    this.f7710e.mo8538b();
                } catch (IOException e) {
                    String str = "ImageFetcher";
                    StringBuilder sb = new StringBuilder();
                    sb.append("flush - ");
                    sb.append(e);
                    Log.e(str, sb.toString());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo8573d() {
        super.mo8573d();
        synchronized (this.f7713h) {
            if (this.f7710e != null) {
                try {
                    if (!this.f7710e.mo8536a()) {
                        this.f7710e.close();
                        this.f7710e = null;
                    }
                } catch (IOException e) {
                    String str = "ImageFetcher";
                    StringBuilder sb = new StringBuilder();
                    sb.append("closeCacheInternal - ");
                    sb.append(e);
                    Log.e(str, sb.toString());
                }
            }
        }
    }
}
