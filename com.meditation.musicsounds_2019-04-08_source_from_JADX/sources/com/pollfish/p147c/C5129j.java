package com.pollfish.p147c;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.AsyncTask;
import com.pollfish.interfaces.C5174a.C5176b;
import com.pollfish.main.PollFish;
import com.pollfish.p145a.C5109d;
import com.pollfish.p150f.C5162b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.pollfish.c.j */
public class C5129j extends AsyncTask {

    /* renamed from: a */
    private C5109d f18318a;

    /* renamed from: b */
    private C5176b f18319b;

    /* renamed from: c */
    private Activity f18320c;

    /* renamed from: d */
    private String f18321d;

    /* renamed from: e */
    private String f18322e;

    public C5129j(C5109d dVar, C5176b bVar, Activity activity) {
        this.f18318a = dVar;
        this.f18319b = bVar;
        this.f18320c = activity;
        StringBuilder sb = new StringBuilder();
        sb.append(activity.getApplicationContext().getCacheDir().getAbsolutePath());
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append("pollfish_cache");
        sb.append(dVar.mo16654a());
        this.f18321d = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fileCachePath: ");
        sb2.append(this.f18321d);
        C5162b.m25518a("WriteAssetInInternalCacheTask", sb2.toString());
        try {
            this.f18322e = this.f18321d.substring(this.f18321d.lastIndexOf(TableOfContents.DEFAULT_PATH_SEPARATOR) + 1, this.f18321d.length());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("fileName: ");
            sb3.append(this.f18322e);
            C5162b.m25518a("WriteAssetInInternalCacheTask", sb3.toString());
        } catch (Exception unused) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Error retrieving file parent and name: ");
            sb4.append(this.f18322e);
            C5162b.m25519b("WriteAssetInInternalCacheTask", sb4.toString());
        }
    }

    /* renamed from: a */
    private Bitmap m25398a(Context context, String str, int i, boolean z) {
        URL resource = PollFish.class.getClassLoader().getResource(str);
        Options options = new Options();
        options.inScaled = z;
        if (resource == null) {
            return BitmapFactory.decodeResource(context.getResources(), i, options);
        }
        try {
            return BitmapFactory.decodeStream(resource.openStream(), null, options);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("BITMAP NOT DECODED: getBitmap error: ");
            sb.append(e);
            C5162b.m25519b("WriteAssetInInternalCacheTask", sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    private boolean m25399a(Context context, Bitmap bitmap, String str) {
        if (bitmap != null) {
            try {
                return m25401a(bitmap, str);
            } catch (Exception unused) {
                C5162b.m25519b("WriteAssetInInternalCacheTask", "Bitmap not loaded");
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("bitmap = null for path: ");
            sb.append(str);
            C5162b.m25518a("WriteAssetInInternalCacheTask", sb.toString());
            return false;
        }
    }

    /* renamed from: a */
    private boolean m25400a(Context context, String str, int i, File file) {
        InputStream resourceAsStream = PollFish.class.getClassLoader().getResourceAsStream(str);
        if (resourceAsStream == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("opening resource with name  ");
            sb.append(str);
            sb.append(" returned inputStream == null");
            C5162b.m25518a("WriteAssetInInternalCacheTask", sb.toString());
            return m25402a(context.getResources().openRawResource(i), file);
        }
        String str2 = "WriteAssetInInternalCacheTask";
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("inputStream != null for inputStream with name: ");
            sb2.append(str);
            C5162b.m25518a(str2, sb2.toString());
            return m25402a(resourceAsStream, file);
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("getIfFileExistsInInternalMemoryAndWrite e: ");
            sb3.append(e);
            C5162b.m25519b("WriteAssetInInternalCacheTask", sb3.toString());
            try {
                if (file.exists()) {
                    file.delete();
                }
            } catch (Exception e2) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("getIfFileExistsInInternalMemoryAndWrite delete() e: ");
                sb4.append(e2);
                C5162b.m25519b("WriteAssetInInternalCacheTask", sb4.toString());
            }
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0074 A[Catch:{ Exception -> 0x0078 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m25401a(android.graphics.Bitmap r5, java.lang.String r6) {
        /*
            r4 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r6)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0041, IOException -> 0x0038, Exception -> 0x002f }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0041, IOException -> 0x0038, Exception -> 0x002f }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ FileNotFoundException -> 0x0041, IOException -> 0x0038, Exception -> 0x002f }
            r3 = 100
            r5.compress(r2, r3, r1)     // Catch:{ FileNotFoundException -> 0x0041, IOException -> 0x0038, Exception -> 0x002f }
            r1.flush()     // Catch:{ FileNotFoundException -> 0x0041, IOException -> 0x0038, Exception -> 0x002f }
            r1.close()     // Catch:{ FileNotFoundException -> 0x0041, IOException -> 0x0038, Exception -> 0x002f }
            java.lang.String r5 = "WriteAssetInInternalCacheTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0041, IOException -> 0x0038, Exception -> 0x002f }
            r1.<init>()     // Catch:{ FileNotFoundException -> 0x0041, IOException -> 0x0038, Exception -> 0x002f }
            java.lang.String r2 = "writeToCacheFromBitmap at path: "
            r1.append(r2)     // Catch:{ FileNotFoundException -> 0x0041, IOException -> 0x0038, Exception -> 0x002f }
            r1.append(r6)     // Catch:{ FileNotFoundException -> 0x0041, IOException -> 0x0038, Exception -> 0x002f }
            java.lang.String r1 = r1.toString()     // Catch:{ FileNotFoundException -> 0x0041, IOException -> 0x0038, Exception -> 0x002f }
            com.pollfish.p150f.C5162b.m25518a(r5, r1)     // Catch:{ FileNotFoundException -> 0x0041, IOException -> 0x0038, Exception -> 0x002f }
            r5 = 1
            return r5
        L_0x002f:
            r5 = move-exception
            java.lang.String r1 = "WriteAssetInInternalCacheTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            goto L_0x0049
        L_0x0038:
            r5 = move-exception
            java.lang.String r1 = "WriteAssetInInternalCacheTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            goto L_0x0049
        L_0x0041:
            r5 = move-exception
            java.lang.String r1 = "WriteAssetInInternalCacheTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
        L_0x0049:
            java.lang.String r3 = "writeToCacheFromBitmap error: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            com.pollfish.p150f.C5162b.m25519b(r1, r5)
            java.lang.String r5 = "WriteAssetInInternalCacheTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0078 }
            r1.<init>()     // Catch:{ Exception -> 0x0078 }
            java.lang.String r2 = "writeToCacheFromBitmap delete file : "
            r1.append(r2)     // Catch:{ Exception -> 0x0078 }
            r1.append(r6)     // Catch:{ Exception -> 0x0078 }
            java.lang.String r6 = r1.toString()     // Catch:{ Exception -> 0x0078 }
            com.pollfish.p150f.C5162b.m25519b(r5, r6)     // Catch:{ Exception -> 0x0078 }
            boolean r5 = r0.exists()     // Catch:{ Exception -> 0x0078 }
            if (r5 == 0) goto L_0x008f
            r0.delete()     // Catch:{ Exception -> 0x0078 }
            goto L_0x008f
        L_0x0078:
            r5 = move-exception
            java.lang.String r6 = "WriteAssetInInternalCacheTask"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "writeToCacheFromBitmap f.delete() error: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            com.pollfish.p150f.C5162b.m25519b(r6, r5)
        L_0x008f:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pollfish.p147c.C5129j.m25401a(android.graphics.Bitmap, java.lang.String):boolean");
    }

    /* renamed from: a */
    private boolean m25402a(InputStream inputStream, File file) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[256];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.close();
                    return file.exists();
                }
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("writeToMemoryFromInputStream error: ");
            sb.append(e);
            C5162b.m25519b("WriteAssetInInternalCacheTask", sb.toString());
            try {
                if (file.exists()) {
                    file.delete();
                }
            } catch (Exception e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("writeToMemoryFromInputStream error: ");
                sb2.append(e2);
                C5162b.m25519b("WriteAssetInInternalCacheTask", sb2.toString());
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        r1 = "WriteAssetInInternalCacheTask";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("doInBackground Exception e: ");
        r2.append(r0);
        com.pollfish.p150f.C5162b.m25519b(r1, r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        if (r5.f18318a.mo16658e() == 0) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
        r0 = com.pollfish.C5102a.C5104b.class.getDeclaredField(r5.f18318a.mo16656c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006e, code lost:
        r0 = r0.getInt(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        r0 = com.pollfish.C5102a.C5103a.class.getDeclaredField(r5.f18318a.mo16656c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0080, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0081, code lost:
        r1 = "WriteAssetInInternalCacheTask";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("doInBackground NoSuchFieldException e: ");
        r2.append(r0);
        com.pollfish.p150f.C5162b.m25519b(r1, r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0122, code lost:
        r0 = "WriteAssetInInternalCacheTask";
        r1 = new java.lang.StringBuilder();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x012a, code lost:
        r0 = "WriteAssetInInternalCacheTask";
        r1 = new java.lang.StringBuilder();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003c A[ExcHandler: IllegalAccessException (e java.lang.IllegalAccessException), Splitter:B:3:0x0005] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f A[ExcHandler: IllegalArgumentException (e java.lang.IllegalArgumentException), Splitter:B:3:0x0005] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean doInBackground(java.lang.Void... r6) {
        /*
            r5 = this;
            com.pollfish.a.d r6 = r5.f18318a
            if (r6 == 0) goto L_0x0140
            r6 = -1
            com.pollfish.a.d r0 = r5.f18318a     // Catch:{ Exception -> 0x0042, IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c }
            int r0 = r0.mo16658e()     // Catch:{ Exception -> 0x0042, IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c }
            if (r0 != 0) goto L_0x0027
            android.app.Activity r0 = r5.f18320c     // Catch:{ Exception -> 0x0042, IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ Exception -> 0x0042, IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c }
            com.pollfish.a.d r1 = r5.f18318a     // Catch:{ Exception -> 0x0042, IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c }
            java.lang.String r1 = r1.mo16656c()     // Catch:{ Exception -> 0x0042, IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c }
            java.lang.String r2 = "raw"
            android.app.Activity r3 = r5.f18320c     // Catch:{ Exception -> 0x0042, IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ Exception -> 0x0042, IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c }
        L_0x0021:
            int r0 = r0.getIdentifier(r1, r2, r3)     // Catch:{ Exception -> 0x0042, IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c }
        L_0x0025:
            r6 = r0
            goto L_0x0097
        L_0x0027:
            android.app.Activity r0 = r5.f18320c     // Catch:{ Exception -> 0x0042, IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ Exception -> 0x0042, IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c }
            com.pollfish.a.d r1 = r5.f18318a     // Catch:{ Exception -> 0x0042, IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c }
            java.lang.String r1 = r1.mo16656c()     // Catch:{ Exception -> 0x0042, IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c }
            java.lang.String r2 = "drawable"
            android.app.Activity r3 = r5.f18320c     // Catch:{ Exception -> 0x0042, IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ Exception -> 0x0042, IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c }
            goto L_0x0021
        L_0x003c:
            r6 = move-exception
            goto L_0x0122
        L_0x003f:
            r6 = move-exception
            goto L_0x012a
        L_0x0042:
            r0 = move-exception
            java.lang.String r1 = "WriteAssetInInternalCacheTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            java.lang.String r3 = "doInBackground Exception e: "
            r2.append(r3)     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            r2.append(r0)     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            java.lang.String r0 = r2.toString()     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            com.pollfish.p150f.C5162b.m25519b(r1, r0)     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            com.pollfish.a.d r0 = r5.f18318a     // Catch:{ NoSuchFieldException -> 0x0080 }
            int r0 = r0.mo16658e()     // Catch:{ NoSuchFieldException -> 0x0080 }
            r1 = 0
            if (r0 != 0) goto L_0x0073
            java.lang.Class<com.pollfish.a$b> r0 = com.pollfish.C5102a.C5104b.class
            com.pollfish.a.d r2 = r5.f18318a     // Catch:{ NoSuchFieldException -> 0x0080 }
            java.lang.String r2 = r2.mo16656c()     // Catch:{ NoSuchFieldException -> 0x0080 }
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0080 }
        L_0x006e:
            int r0 = r0.getInt(r1)     // Catch:{ NoSuchFieldException -> 0x0080 }
            goto L_0x0025
        L_0x0073:
            java.lang.Class<com.pollfish.a$a> r0 = com.pollfish.C5102a.C5103a.class
            com.pollfish.a.d r2 = r5.f18318a     // Catch:{ NoSuchFieldException -> 0x0080 }
            java.lang.String r2 = r2.mo16656c()     // Catch:{ NoSuchFieldException -> 0x0080 }
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0080 }
            goto L_0x006e
        L_0x0080:
            r0 = move-exception
            java.lang.String r1 = "WriteAssetInInternalCacheTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            java.lang.String r3 = "doInBackground NoSuchFieldException e: "
            r2.append(r3)     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            r2.append(r0)     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            java.lang.String r0 = r2.toString()     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            com.pollfish.p150f.C5162b.m25519b(r1, r0)     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
        L_0x0097:
            java.io.File r0 = new java.io.File     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            java.lang.String r1 = r5.f18321d     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            boolean r1 = r0.exists()     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            java.lang.String r2 = "WriteAssetInInternalCacheTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            java.lang.String r4 = "file: "
            r3.append(r4)     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            java.lang.String r4 = r5.f18322e     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            r3.append(r4)     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            java.lang.String r4 = " exists in cache: "
            r3.append(r4)     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            r3.append(r1)     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            java.lang.String r3 = r3.toString()     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            com.pollfish.p150f.C5162b.m25518a(r2, r3)     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            r2 = 1
            if (r1 != 0) goto L_0x0114
            java.lang.String r1 = "WriteAssetInInternalCacheTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            java.lang.String r4 = "file: "
            r3.append(r4)     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            java.lang.String r4 = r5.f18322e     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            r3.append(r4)     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            java.lang.String r4 = " try to copy...."
            r3.append(r4)     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            java.lang.String r3 = r3.toString()     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            com.pollfish.p150f.C5162b.m25518a(r1, r3)     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            com.pollfish.a.d r1 = r5.f18318a     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            int r1 = r1.mo16658e()     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            if (r1 != 0) goto L_0x00fb
            android.app.Activity r1 = r5.f18320c     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            com.pollfish.a.d r2 = r5.f18318a     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            java.lang.String r2 = r2.mo16655b()     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            boolean r6 = r5.m25400a(r1, r2, r6, r0)     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            return r6
        L_0x00fb:
            android.app.Activity r0 = r5.f18320c     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            com.pollfish.a.d r1 = r5.f18318a     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            java.lang.String r1 = r1.mo16655b()     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            android.graphics.Bitmap r6 = r5.m25398a(r0, r1, r6, r2)     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            android.app.Activity r0 = r5.f18320c     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            java.lang.String r1 = r5.f18321d     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            boolean r6 = r5.m25399a(r0, r6, r1)     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            return r6
        L_0x0114:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x003f, IllegalAccessException -> 0x003c, Exception -> 0x0119 }
            return r6
        L_0x0119:
            r6 = move-exception
            java.lang.String r0 = "WriteAssetInInternalCacheTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x0131
        L_0x0122:
            java.lang.String r0 = "WriteAssetInInternalCacheTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x0131
        L_0x012a:
            java.lang.String r0 = "WriteAssetInInternalCacheTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L_0x0131:
            java.lang.String r2 = "WriteAssetInInternalCacheTask: e"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.pollfish.p150f.C5162b.m25519b(r0, r6)
        L_0x0140:
            r6 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pollfish.p147c.C5129j.doInBackground(java.lang.Void[]):java.lang.Boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Boolean bool) {
        StringBuilder sb = new StringBuilder();
        sb.append("file: ");
        sb.append(this.f18322e);
        sb.append(" written in cache sucessfully: ");
        sb.append(bool);
        C5162b.m25518a("WriteAssetInInternalCacheTask", sb.toString());
        if (bool.booleanValue()) {
            this.f18319b.mo16780a();
        } else {
            this.f18319b.mo16782a(this.f18318a);
        }
        super.onPostExecute(bool);
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trying to copy file: ");
        sb.append(this.f18322e);
        sb.append(" in internal cache");
        C5162b.m25518a("WriteAssetInInternalCacheTask", sb.toString());
        super.onPreExecute();
    }
}
