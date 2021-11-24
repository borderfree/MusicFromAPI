package com.facebook.ads.internal.p064f;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.facebook.ads.internal.p069k.C1713a;
import com.facebook.ads.internal.p073r.p074a.C1748l;
import com.facebook.ads.internal.p077s.p079b.C1818c;
import com.facebook.ads.internal.p077s.p080c.C1826d;
import com.facebook.ads.internal.p077s.p081d.C1831a;
import com.facebook.ads.internal.p077s.p081d.C1832b;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.C1734b;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.facebook.ads.internal.f.b */
public class C1685b {

    /* renamed from: a */
    private static final String f5539a = "b";

    /* renamed from: b */
    private static C1685b f5540b;

    /* renamed from: c */
    private final Context f5541c;

    private C1685b(Context context) {
        this.f5541c = context;
    }

    /* renamed from: a */
    private Bitmap m8443a(String str) {
        byte[] d = C1826d.m8971a(this.f5541c).mo6960a(str, (C1748l) null).mo6990d();
        return BitmapFactory.decodeByteArray(d, 0, d.length);
    }

    /* renamed from: a */
    public static C1685b m8444a(Context context) {
        if (f5540b == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (C1685b.class) {
                if (f5540b == null) {
                    f5540b = new C1685b(applicationContext);
                }
            }
        }
        return f5540b;
    }

    /* renamed from: a */
    private static void m8445a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:52:0x00b5=Splitter:B:52:0x00b5, B:39:0x0078=Splitter:B:39:0x0078} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8446a(java.lang.String r6, android.graphics.Bitmap r7) {
        /*
            r5 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0007
            r5.m8447a(r0)
            return
        L_0x0007:
            java.io.File r1 = new java.io.File
            android.content.Context r2 = r5.f5541c
            java.io.File r2 = r2.getCacheDir()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r4 = r6.hashCode()
            r3.append(r4)
            java.lang.String r4 = ".png"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ FileNotFoundException -> 0x00b3, IOException -> 0x0089, OutOfMemoryError -> 0x0076, all -> 0x0073 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x00b3, IOException -> 0x0089, OutOfMemoryError -> 0x0076, all -> 0x0073 }
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ FileNotFoundException -> 0x006f, IOException -> 0x006b, OutOfMemoryError -> 0x0067, all -> 0x0062 }
            r4 = 100
            r7.compress(r3, r4, r2)     // Catch:{ FileNotFoundException -> 0x006f, IOException -> 0x006b, OutOfMemoryError -> 0x0067, all -> 0x0062 }
            int r7 = r2.size()     // Catch:{ FileNotFoundException -> 0x006f, IOException -> 0x006b, OutOfMemoryError -> 0x0067, all -> 0x0062 }
            r3 = 3145728(0x300000, float:4.408104E-39)
            if (r7 < r3) goto L_0x0049
            java.lang.String r7 = f5539a     // Catch:{ FileNotFoundException -> 0x006f, IOException -> 0x006b, OutOfMemoryError -> 0x0067, all -> 0x0062 }
            java.lang.String r3 = "Bitmap size exceeds max size for storage"
            android.util.Log.d(r7, r3)     // Catch:{ FileNotFoundException -> 0x006f, IOException -> 0x006b, OutOfMemoryError -> 0x0067, all -> 0x0062 }
            m8445a(r2)
            m8445a(r0)
            return
        L_0x0049:
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x006f, IOException -> 0x006b, OutOfMemoryError -> 0x0067, all -> 0x0062 }
            r7.<init>(r1)     // Catch:{ FileNotFoundException -> 0x006f, IOException -> 0x006b, OutOfMemoryError -> 0x0067, all -> 0x0062 }
            r2.writeTo(r7)     // Catch:{ FileNotFoundException -> 0x0060, IOException -> 0x005c, OutOfMemoryError -> 0x005a, all -> 0x0058 }
            r7.flush()     // Catch:{ FileNotFoundException -> 0x0060, IOException -> 0x005c, OutOfMemoryError -> 0x005a, all -> 0x0058 }
            m8445a(r2)
            goto L_0x0085
        L_0x0058:
            r6 = move-exception
            goto L_0x0064
        L_0x005a:
            r6 = move-exception
            goto L_0x0069
        L_0x005c:
            r0 = move-exception
            r1 = r7
            r7 = r0
            goto L_0x006d
        L_0x0060:
            r6 = move-exception
            goto L_0x0071
        L_0x0062:
            r6 = move-exception
            r7 = r0
        L_0x0064:
            r0 = r2
            goto L_0x00da
        L_0x0067:
            r6 = move-exception
            r7 = r0
        L_0x0069:
            r0 = r2
            goto L_0x0078
        L_0x006b:
            r7 = move-exception
            r1 = r0
        L_0x006d:
            r0 = r2
            goto L_0x008b
        L_0x006f:
            r6 = move-exception
            r7 = r0
        L_0x0071:
            r0 = r2
            goto L_0x00b5
        L_0x0073:
            r6 = move-exception
            r7 = r0
            goto L_0x00da
        L_0x0076:
            r6 = move-exception
            r7 = r0
        L_0x0078:
            r5.m8447a(r6)     // Catch:{ all -> 0x00d9 }
            java.lang.String r1 = f5539a     // Catch:{ all -> 0x00d9 }
            java.lang.String r2 = "Unable to write bitmap to output stream"
            android.util.Log.e(r1, r2, r6)     // Catch:{ all -> 0x00d9 }
        L_0x0082:
            m8445a(r0)
        L_0x0085:
            m8445a(r7)
            goto L_0x00d8
        L_0x0089:
            r7 = move-exception
            r1 = r0
        L_0x008b:
            r5.m8447a(r7)     // Catch:{ all -> 0x00b0 }
            java.lang.String r2 = f5539a     // Catch:{ all -> 0x00b0 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b0 }
            r3.<init>()     // Catch:{ all -> 0x00b0 }
            java.lang.String r4 = "Unable to write bitmap to file (url="
            r3.append(r4)     // Catch:{ all -> 0x00b0 }
            r3.append(r6)     // Catch:{ all -> 0x00b0 }
            java.lang.String r6 = ")."
            r3.append(r6)     // Catch:{ all -> 0x00b0 }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x00b0 }
            android.util.Log.e(r2, r6, r7)     // Catch:{ all -> 0x00b0 }
            m8445a(r0)
            m8445a(r1)
            goto L_0x00d8
        L_0x00b0:
            r6 = move-exception
            r7 = r1
            goto L_0x00da
        L_0x00b3:
            r6 = move-exception
            r7 = r0
        L_0x00b5:
            java.lang.String r2 = f5539a     // Catch:{ all -> 0x00d9 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d9 }
            r3.<init>()     // Catch:{ all -> 0x00d9 }
            java.lang.String r4 = "Bad output destination (file="
            r3.append(r4)     // Catch:{ all -> 0x00d9 }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ all -> 0x00d9 }
            r3.append(r1)     // Catch:{ all -> 0x00d9 }
            java.lang.String r1 = ")."
            r3.append(r1)     // Catch:{ all -> 0x00d9 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x00d9 }
            android.util.Log.e(r2, r1, r6)     // Catch:{ all -> 0x00d9 }
            r5.m8447a(r6)     // Catch:{ all -> 0x00d9 }
            goto L_0x0082
        L_0x00d8:
            return
        L_0x00d9:
            r6 = move-exception
        L_0x00da:
            m8445a(r0)
            m8445a(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p064f.C1685b.m8446a(java.lang.String, android.graphics.Bitmap):void");
    }

    /* renamed from: a */
    private void m8447a(Throwable th) {
        C1831a.m8998a(this.f5541c, "image", C1832b.f5980G, (Exception) new C1734b(AdErrorType.IMAGE_CACHE_ERROR, AdErrorType.IMAGE_CACHE_ERROR.getDefaultErrorMessage(), th));
    }

    /* renamed from: a */
    private boolean m8448a(int i, int i2) {
        return i > 0 && i2 > 0 && C1713a.m8574e(this.f5541c);
    }

    /* renamed from: b */
    private Bitmap m8449b(String str, int i, int i2) {
        try {
            Bitmap a = m8448a(i, i2) ? C1818c.m8955a(str.substring("file://".length()), i, i2) : BitmapFactory.decodeStream(new FileInputStream(str.substring("file://".length())), null, null);
            m8446a(str, a);
            return a;
        } catch (IOException e) {
            String str2 = f5539a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to copy local image into cache (url=");
            sb.append(str);
            sb.append(").");
            Log.e(str2, sb.toString(), e);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0052  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x0045=Splitter:B:24:0x0045, B:17:0x003a=Splitter:B:17:0x003a} */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap m8450c(java.lang.String r5, int r6, int r7) {
        /*
            r4 = this;
            java.lang.String r0 = "asset:///"
            boolean r0 = r5.startsWith(r0)
            if (r0 == 0) goto L_0x0056
            r0 = 0
            android.content.Context r1 = r4.f5541c     // Catch:{ IOException -> 0x0043, OutOfMemoryError -> 0x0038, all -> 0x0036 }
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch:{ IOException -> 0x0043, OutOfMemoryError -> 0x0038, all -> 0x0036 }
            r2 = 9
            int r3 = r5.length()     // Catch:{ IOException -> 0x0043, OutOfMemoryError -> 0x0038, all -> 0x0036 }
            java.lang.String r2 = r5.substring(r2, r3)     // Catch:{ IOException -> 0x0043, OutOfMemoryError -> 0x0038, all -> 0x0036 }
            java.io.InputStream r1 = r1.open(r2)     // Catch:{ IOException -> 0x0043, OutOfMemoryError -> 0x0038, all -> 0x0036 }
            boolean r2 = r4.m8448a(r6, r7)     // Catch:{ IOException -> 0x0034, OutOfMemoryError -> 0x0032 }
            if (r2 == 0) goto L_0x0028
            android.graphics.Bitmap r6 = com.facebook.ads.internal.p077s.p079b.C1818c.m8954a(r1, r6, r7)     // Catch:{ IOException -> 0x0034, OutOfMemoryError -> 0x0032 }
            goto L_0x002c
        L_0x0028:
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ IOException -> 0x0034, OutOfMemoryError -> 0x0032 }
        L_0x002c:
            if (r1 == 0) goto L_0x0069
            m8445a(r1)
            goto L_0x0069
        L_0x0032:
            r5 = move-exception
            goto L_0x003a
        L_0x0034:
            r5 = move-exception
            goto L_0x0045
        L_0x0036:
            r5 = move-exception
            goto L_0x0050
        L_0x0038:
            r5 = move-exception
            r1 = r0
        L_0x003a:
            r4.m8447a(r5)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0042
            m8445a(r1)
        L_0x0042:
            return r0
        L_0x0043:
            r5 = move-exception
            r1 = r0
        L_0x0045:
            r4.m8447a(r5)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x004d
            m8445a(r1)
        L_0x004d:
            return r0
        L_0x004e:
            r5 = move-exception
            r0 = r1
        L_0x0050:
            if (r0 == 0) goto L_0x0055
            m8445a(r0)
        L_0x0055:
            throw r5
        L_0x0056:
            boolean r0 = r4.m8448a(r6, r7)
            if (r0 == 0) goto L_0x0065
            android.graphics.Bitmap r6 = r4.m8451d(r5, r6, r7)     // Catch:{ IOException -> 0x0061 }
            goto L_0x0069
        L_0x0061:
            r6 = move-exception
            r4.m8447a(r6)
        L_0x0065:
            android.graphics.Bitmap r6 = r4.m8443a(r5)
        L_0x0069:
            r4.m8446a(r5, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p064f.C1685b.m8450c(java.lang.String, int, int):android.graphics.Bitmap");
    }

    /* renamed from: d */
    private Bitmap m8451d(String str, int i, int i2) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setDoInput(true);
        httpURLConnection.connect();
        InputStream inputStream = httpURLConnection.getInputStream();
        Bitmap a = C1818c.m8954a(inputStream, i, i2);
        m8445a((Closeable) inputStream);
        return a;
    }

    /* renamed from: a */
    public Bitmap mo6829a(String str, int i, int i2) {
        File cacheDir = this.f5541c.getCacheDir();
        StringBuilder sb = new StringBuilder();
        sb.append(str.hashCode());
        sb.append(".png");
        File file = new File(cacheDir, sb.toString());
        if (!file.exists()) {
            return str.startsWith("file://") ? m8449b(str, i, i2) : m8450c(str, i, i2);
        }
        return m8448a(i, i2) ? C1818c.m8955a(file.getAbsolutePath(), i, i2) : BitmapFactory.decodeFile(file.getAbsolutePath());
    }
}
