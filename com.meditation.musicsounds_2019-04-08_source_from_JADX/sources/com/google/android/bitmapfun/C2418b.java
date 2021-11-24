package com.google.android.bitmapfun;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.support.p009v4.app.C0374l;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.p019g.C0496g;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;

/* renamed from: com.google.android.bitmapfun.b */
public class C2418b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final CompressFormat f7692a = CompressFormat.JPEG;

    /* renamed from: b */
    private C2412a f7693b;

    /* renamed from: c */
    private C0496g<String, BitmapDrawable> f7694c;

    /* renamed from: d */
    private C2420a f7695d;

    /* renamed from: e */
    private final Object f7696e = new Object();

    /* renamed from: f */
    private boolean f7697f = true;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public HashSet<SoftReference<Bitmap>> f7698g;

    /* renamed from: com.google.android.bitmapfun.b$a */
    public static class C2420a {

        /* renamed from: a */
        public int f7700a = 5120;

        /* renamed from: b */
        public int f7701b = 10485760;

        /* renamed from: c */
        public File f7702c;

        /* renamed from: d */
        public CompressFormat f7703d = C2418b.f7692a;

        /* renamed from: e */
        public int f7704e = 70;

        /* renamed from: f */
        public boolean f7705f = true;

        /* renamed from: g */
        public boolean f7706g = true;

        /* renamed from: h */
        public boolean f7707h = false;

        /* renamed from: i */
        public boolean f7708i = false;

        public C2420a(Context context, String str) {
            this.f7702c = C2418b.m11228a(context, str);
        }

        /* renamed from: a */
        public void mo8566a(float f) {
            if (f < 0.05f || f > 0.8f) {
                throw new IllegalArgumentException("setMemCacheSizePercent - percent must be between 0.05 and 0.8 (inclusive)");
            }
            this.f7700a = Math.round((f * ((float) Runtime.getRuntime().maxMemory())) / 1024.0f);
        }
    }

    /* renamed from: com.google.android.bitmapfun.b$b */
    public static class C2421b extends Fragment {

        /* renamed from: a */
        private Object f7709a;

        /* renamed from: a */
        public void mo1234a(Bundle bundle) {
            super.mo1234a(bundle);
            mo1280d(true);
        }

        /* renamed from: a */
        public void mo8567a(Object obj) {
            this.f7709a = obj;
        }

        /* renamed from: b */
        public Object mo1450b() {
            return this.f7709a;
        }
    }

    public C2418b(C2420a aVar) {
        m11231a(aVar);
    }

    @TargetApi(12)
    /* renamed from: a */
    public static int m11223a(BitmapDrawable bitmapDrawable) {
        Bitmap bitmap = bitmapDrawable.getBitmap();
        return C2429g.m11310d() ? bitmap.getByteCount() : bitmap.getRowBytes() * bitmap.getHeight();
    }

    @TargetApi(9)
    /* renamed from: a */
    public static long m11224a(File file) {
        if (C2429g.m11308b()) {
            return file.getUsableSpace();
        }
        StatFs statFs = new StatFs(file.getPath());
        return ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
    }

    /* renamed from: a */
    private static C2421b m11225a(C0374l lVar) {
        C2421b bVar = (C2421b) lVar.mo1535a("ImageCache");
        if (bVar != null) {
            return bVar;
        }
        C2421b bVar2 = new C2421b();
        lVar.mo1536a().mo1413a((Fragment) bVar2, "ImageCache").mo1431d();
        return bVar2;
    }

    /* renamed from: a */
    public static C2418b m11226a(C0374l lVar, C2420a aVar) {
        C2421b a = m11225a(lVar);
        C2418b bVar = (C2418b) a.mo1450b();
        if (bVar != null) {
            return bVar;
        }
        C2418b bVar2 = new C2418b(aVar);
        a.mo8567a((Object) bVar2);
        return bVar2;
    }

    @TargetApi(8)
    /* renamed from: a */
    public static File m11227a(Context context) {
        if (C2429g.m11307a()) {
            return context.getExternalCacheDir();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("/Android/data/");
        sb.append(context.getPackageName());
        sb.append("/cache/");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Environment.getExternalStorageDirectory().getPath());
        sb3.append(sb2);
        return new File(sb3.toString());
    }

    /* renamed from: a */
    public static File m11228a(Context context, String str) {
        String str2;
        if (!m11233f()) {
            File a = m11227a(context);
            if (a != null) {
                str2 = a.getPath();
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(File.separator);
                sb.append(str);
                return new File(sb.toString());
            }
        }
        str2 = context.getCacheDir().getPath();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(File.separator);
        sb2.append(str);
        return new File(sb2.toString());
    }

    /* renamed from: a */
    private static String m11229a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private void m11231a(C2420a aVar) {
        this.f7695d = aVar;
        if (this.f7695d.f7705f) {
            if (C2429g.m11309c()) {
                this.f7698g = new HashSet<>();
            }
            this.f7694c = new C0496g<String, BitmapDrawable>(this.f7695d.f7700a) {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public int mo1933b(String str, BitmapDrawable bitmapDrawable) {
                    int a = C2418b.m11223a(bitmapDrawable) / 1024;
                    if (a == 0) {
                        return 1;
                    }
                    return a;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo1932a(boolean z, String str, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2) {
                    if (C2428f.class.isInstance(bitmapDrawable)) {
                        ((C2428f) bitmapDrawable).mo8592b(false);
                    } else if (C2429g.m11309c()) {
                        C2418b.this.f7698g.add(new SoftReference(bitmapDrawable.getBitmap()));
                    }
                }
            };
        }
        if (aVar.f7707h) {
            mo8557a();
        }
    }

    /* renamed from: c */
    public static String m11232c(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            return m11229a(instance.digest());
        } catch (NoSuchAlgorithmException unused) {
            return String.valueOf(str.hashCode());
        }
    }

    @TargetApi(9)
    /* renamed from: f */
    public static boolean m11233f() {
        if (C2429g.m11308b()) {
            return Environment.isExternalStorageRemovable();
        }
        return true;
    }

    /* renamed from: a */
    public BitmapDrawable mo8556a(String str) {
        if (this.f7694c != null) {
            return (BitmapDrawable) this.f7694c.mo1928a(str);
        }
        return null;
    }

    /* renamed from: a */
    public void mo8557a() {
        synchronized (this.f7696e) {
            if (this.f7693b == null || this.f7693b.mo8536a()) {
                File file = this.f7695d.f7702c;
                if (this.f7695d.f7706g && file != null) {
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    if (m11224a(file) > ((long) this.f7695d.f7701b)) {
                        try {
                            this.f7693b = C2412a.m11174a(file, 1, 1, (long) this.f7695d.f7701b);
                        } catch (IOException e) {
                            this.f7695d.f7702c = null;
                            StringBuilder sb = new StringBuilder();
                            sb.append("initDiskCache - ");
                            sb.append(e);
                            Log.e("ImageCache", sb.toString());
                        }
                    }
                }
            }
            this.f7697f = false;
            this.f7696e.notifyAll();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:24|25|(2:46|47)|48|49) */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0066, code lost:
        if (r1 != null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009f, code lost:
        if (r1 != null) goto L_0x0068;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00a7 */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0087 A[Catch:{ IOException -> 0x0088, Exception -> 0x006e, all -> 0x006c }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a4 A[SYNTHETIC, Splitter:B:46:0x00a4] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8558a(java.lang.String r5, android.graphics.drawable.BitmapDrawable r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x00ad
            if (r6 != 0) goto L_0x0006
            goto L_0x00ad
        L_0x0006:
            android.support.v4.g.g<java.lang.String, android.graphics.drawable.BitmapDrawable> r0 = r4.f7694c
            if (r0 == 0) goto L_0x001e
            java.lang.Class<com.google.android.bitmapfun.f> r0 = com.google.android.bitmapfun.C2428f.class
            boolean r0 = r0.isInstance(r6)
            if (r0 == 0) goto L_0x0019
            r0 = r6
            com.google.android.bitmapfun.f r0 = (com.google.android.bitmapfun.C2428f) r0
            r1 = 1
            r0.mo8592b(r1)
        L_0x0019:
            android.support.v4.g.g<java.lang.String, android.graphics.drawable.BitmapDrawable> r0 = r4.f7694c
            r0.mo1929a(r5, r6)
        L_0x001e:
            java.lang.Object r0 = r4.f7696e
            monitor-enter(r0)
            com.google.android.bitmapfun.a r1 = r4.f7693b     // Catch:{ all -> 0x00aa }
            if (r1 == 0) goto L_0x00a8
            java.lang.String r5 = m11232c(r5)     // Catch:{ all -> 0x00aa }
            r1 = 0
            com.google.android.bitmapfun.a r2 = r4.f7693b     // Catch:{ IOException -> 0x0088, Exception -> 0x006e }
            com.google.android.bitmapfun.a$c r2 = r2.mo8535a(r5)     // Catch:{ IOException -> 0x0088, Exception -> 0x006e }
            r3 = 0
            if (r2 != 0) goto L_0x005f
            com.google.android.bitmapfun.a r2 = r4.f7693b     // Catch:{ IOException -> 0x0088, Exception -> 0x006e }
            com.google.android.bitmapfun.a$a r5 = r2.mo8537b(r5)     // Catch:{ IOException -> 0x0088, Exception -> 0x006e }
            if (r5 == 0) goto L_0x0066
            java.io.OutputStream r2 = r5.mo8544a(r3)     // Catch:{ IOException -> 0x0088, Exception -> 0x006e }
            android.graphics.Bitmap r6 = r6.getBitmap()     // Catch:{ IOException -> 0x005c, Exception -> 0x0059, all -> 0x0056 }
            com.google.android.bitmapfun.b$a r1 = r4.f7695d     // Catch:{ IOException -> 0x005c, Exception -> 0x0059, all -> 0x0056 }
            android.graphics.Bitmap$CompressFormat r1 = r1.f7703d     // Catch:{ IOException -> 0x005c, Exception -> 0x0059, all -> 0x0056 }
            com.google.android.bitmapfun.b$a r3 = r4.f7695d     // Catch:{ IOException -> 0x005c, Exception -> 0x0059, all -> 0x0056 }
            int r3 = r3.f7704e     // Catch:{ IOException -> 0x005c, Exception -> 0x0059, all -> 0x0056 }
            r6.compress(r1, r3, r2)     // Catch:{ IOException -> 0x005c, Exception -> 0x0059, all -> 0x0056 }
            r5.mo8545a()     // Catch:{ IOException -> 0x005c, Exception -> 0x0059, all -> 0x0056 }
            r2.close()     // Catch:{ IOException -> 0x005c, Exception -> 0x0059, all -> 0x0056 }
            r1 = r2
            goto L_0x0066
        L_0x0056:
            r5 = move-exception
            r1 = r2
            goto L_0x00a2
        L_0x0059:
            r5 = move-exception
            r1 = r2
            goto L_0x006f
        L_0x005c:
            r5 = move-exception
            r1 = r2
            goto L_0x0089
        L_0x005f:
            java.io.InputStream r5 = r2.mo8554a(r3)     // Catch:{ IOException -> 0x0088, Exception -> 0x006e }
            r5.close()     // Catch:{ IOException -> 0x0088, Exception -> 0x006e }
        L_0x0066:
            if (r1 == 0) goto L_0x00a8
        L_0x0068:
            r1.close()     // Catch:{ IOException -> 0x00a8 }
            goto L_0x00a8
        L_0x006c:
            r5 = move-exception
            goto L_0x00a2
        L_0x006e:
            r5 = move-exception
        L_0x006f:
            java.lang.String r6 = "ImageCache"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006c }
            r2.<init>()     // Catch:{ all -> 0x006c }
            java.lang.String r3 = "addBitmapToCache - "
            r2.append(r3)     // Catch:{ all -> 0x006c }
            r2.append(r5)     // Catch:{ all -> 0x006c }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x006c }
            android.util.Log.e(r6, r5)     // Catch:{ all -> 0x006c }
            if (r1 == 0) goto L_0x00a8
            goto L_0x0068
        L_0x0088:
            r5 = move-exception
        L_0x0089:
            java.lang.String r6 = "ImageCache"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006c }
            r2.<init>()     // Catch:{ all -> 0x006c }
            java.lang.String r3 = "addBitmapToCache - "
            r2.append(r3)     // Catch:{ all -> 0x006c }
            r2.append(r5)     // Catch:{ all -> 0x006c }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x006c }
            android.util.Log.e(r6, r5)     // Catch:{ all -> 0x006c }
            if (r1 == 0) goto L_0x00a8
            goto L_0x0068
        L_0x00a2:
            if (r1 == 0) goto L_0x00a7
            r1.close()     // Catch:{ IOException -> 0x00a7 }
        L_0x00a7:
            throw r5     // Catch:{ all -> 0x00aa }
        L_0x00a8:
            monitor-exit(r0)     // Catch:{ all -> 0x00aa }
            return
        L_0x00aa:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00aa }
            throw r5
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.bitmapfun.C2418b.mo8558a(java.lang.String, android.graphics.drawable.BitmapDrawable):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r7 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0059, code lost:
        if (r7 != null) goto L_0x003a;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0007 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0062 */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0007 A[LOOP:0: B:2:0x0007->B:45:0x0007, LOOP_START, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005f A[SYNTHETIC, Splitter:B:35:0x005f] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap mo8559b(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r7 = m11232c(r7)
            java.lang.Object r0 = r6.f7696e
            monitor-enter(r0)
        L_0x0007:
            boolean r1 = r6.f7697f     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x0011
            java.lang.Object r1 = r6.f7696e     // Catch:{ InterruptedException -> 0x0007 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0007 }
            goto L_0x0007
        L_0x0011:
            com.google.android.bitmapfun.a r1 = r6.f7693b     // Catch:{ all -> 0x0065 }
            r2 = 0
            if (r1 == 0) goto L_0x0063
            com.google.android.bitmapfun.a r1 = r6.f7693b     // Catch:{ IOException -> 0x0041, all -> 0x003e }
            com.google.android.bitmapfun.a$c r7 = r1.mo8535a(r7)     // Catch:{ IOException -> 0x0041, all -> 0x003e }
            if (r7 == 0) goto L_0x0037
            r1 = 0
            java.io.InputStream r7 = r7.mo8554a(r1)     // Catch:{ IOException -> 0x0041, all -> 0x003e }
            if (r7 == 0) goto L_0x0038
            r1 = r7
            java.io.FileInputStream r1 = (java.io.FileInputStream) r1     // Catch:{ IOException -> 0x0035 }
            java.io.FileDescriptor r1 = r1.getFD()     // Catch:{ IOException -> 0x0035 }
            r3 = 2147483647(0x7fffffff, float:NaN)
            android.graphics.Bitmap r1 = com.google.android.bitmapfun.C2423d.m11265a(r1, r3, r3, r6)     // Catch:{ IOException -> 0x0035 }
            r2 = r1
            goto L_0x0038
        L_0x0035:
            r1 = move-exception
            goto L_0x0043
        L_0x0037:
            r7 = r2
        L_0x0038:
            if (r7 == 0) goto L_0x0063
        L_0x003a:
            r7.close()     // Catch:{ IOException -> 0x0063 }
            goto L_0x0063
        L_0x003e:
            r1 = move-exception
            r7 = r2
            goto L_0x005d
        L_0x0041:
            r1 = move-exception
            r7 = r2
        L_0x0043:
            java.lang.String r3 = "ImageCache"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x005c }
            r4.<init>()     // Catch:{ all -> 0x005c }
            java.lang.String r5 = "getBitmapFromDiskCache - "
            r4.append(r5)     // Catch:{ all -> 0x005c }
            r4.append(r1)     // Catch:{ all -> 0x005c }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x005c }
            android.util.Log.e(r3, r1)     // Catch:{ all -> 0x005c }
            if (r7 == 0) goto L_0x0063
            goto L_0x003a
        L_0x005c:
            r1 = move-exception
        L_0x005d:
            if (r7 == 0) goto L_0x0062
            r7.close()     // Catch:{ IOException -> 0x0062 }
        L_0x0062:
            throw r1     // Catch:{ all -> 0x0065 }
        L_0x0063:
            monitor-exit(r0)     // Catch:{ all -> 0x0065 }
            return r2
        L_0x0065:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0065 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.bitmapfun.C2418b.mo8559b(java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: b */
    public void mo8560b() {
        if (this.f7694c != null) {
            this.f7694c.mo1930a();
            if (this.f7695d.f7708i) {
                mo8561c();
            }
        }
        synchronized (this.f7696e) {
            this.f7697f = true;
            if (this.f7693b != null && !this.f7693b.mo8536a()) {
                try {
                    this.f7693b.mo8539c();
                } catch (IOException e) {
                    String str = "ImageCache";
                    StringBuilder sb = new StringBuilder();
                    sb.append("clearCache - ");
                    sb.append(e);
                    Log.e(str, sb.toString());
                }
                this.f7693b = null;
                mo8557a();
            }
        }
    }

    /* renamed from: c */
    public void mo8561c() {
        if (C2429g.m11309c()) {
            this.f7698g = new HashSet<>();
        }
    }

    /* renamed from: d */
    public void mo8562d() {
        synchronized (this.f7696e) {
            if (this.f7693b != null) {
                try {
                    this.f7693b.mo8538b();
                } catch (IOException e) {
                    String str = "ImageCache";
                    StringBuilder sb = new StringBuilder();
                    sb.append("flush - ");
                    sb.append(e);
                    Log.e(str, sb.toString());
                }
            }
        }
    }

    /* renamed from: e */
    public void mo8563e() {
        synchronized (this.f7696e) {
            if (this.f7693b != null) {
                try {
                    if (!this.f7693b.mo8536a()) {
                        this.f7693b.close();
                        this.f7693b = null;
                    }
                } catch (IOException e) {
                    String str = "ImageCache";
                    StringBuilder sb = new StringBuilder();
                    sb.append("close - ");
                    sb.append(e);
                    Log.e(str, sb.toString());
                }
            }
        }
    }
}
