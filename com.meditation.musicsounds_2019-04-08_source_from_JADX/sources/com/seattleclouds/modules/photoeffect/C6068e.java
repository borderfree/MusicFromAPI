package com.seattleclouds.modules.photoeffect;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.util.Log;
import com.seattleclouds.App;
import java.io.File;
import java.io.IOException;

/* renamed from: com.seattleclouds.modules.photoeffect.e */
public class C6068e {

    /* renamed from: a */
    private static final String f21533a;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(App.m25661k());
        sb.append("/PhotoEffect/");
        f21533a = sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002a A[SYNTHETIC, Splitter:B:17:0x002a] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0030 A[SYNTHETIC, Splitter:B:22:0x0030] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m29688a(android.graphics.Bitmap r3, java.lang.String r4) {
        /*
            android.graphics.Bitmap r3 = com.seattleclouds.util.C6638s.m32070a(r4, r3)
            r0 = 0
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ FileNotFoundException -> 0x0022 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0022 }
            r2.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0022 }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0022 }
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ FileNotFoundException -> 0x001d, all -> 0x001a }
            r0 = 100
            r3.compress(r4, r0, r1)     // Catch:{ FileNotFoundException -> 0x001d, all -> 0x001a }
            r1.close()     // Catch:{ IOException -> 0x002d }
            goto L_0x002d
        L_0x001a:
            r3 = move-exception
            r0 = r1
            goto L_0x002e
        L_0x001d:
            r4 = move-exception
            r0 = r1
            goto L_0x0023
        L_0x0020:
            r3 = move-exception
            goto L_0x002e
        L_0x0022:
            r4 = move-exception
        L_0x0023:
            java.lang.String r1 = "fixOrientation"
            m29691a(r1, r4)     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x002d
            r0.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            return r3
        L_0x002e:
            if (r0 == 0) goto L_0x0033
            r0.close()     // Catch:{ IOException -> 0x0033 }
        L_0x0033:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.photoeffect.C6068e.m29688a(android.graphics.Bitmap, java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: a */
    public static ColorFilter m29689a() {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.set(new float[]{0.393f, 0.769f, 0.189f, 0.0f, 0.0f, 0.349f, 0.686f, 0.168f, 0.0f, 0.0f, 0.272f, 0.534f, 0.131f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        return new ColorMatrixColorFilter(colorMatrix);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|11|12|36) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:14|15|(2:30|31)|32|33|34) */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x003c A[SYNTHETIC, Splitter:B:30:0x003c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m29690a(java.io.InputStream r3, java.io.File r4) {
        /*
            r0 = 0
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ FileNotFoundException -> 0x0033, IOException -> 0x002c }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0033, IOException -> 0x002c }
            r2.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0033, IOException -> 0x002c }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0033, IOException -> 0x002c }
            r4 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r4]     // Catch:{ FileNotFoundException -> 0x0027, IOException -> 0x0024, all -> 0x0021 }
        L_0x000f:
            int r0 = r3.read(r4)     // Catch:{ FileNotFoundException -> 0x0027, IOException -> 0x0024, all -> 0x0021 }
            if (r0 <= 0) goto L_0x001a
            r2 = 0
            r1.write(r4, r2, r0)     // Catch:{ FileNotFoundException -> 0x0027, IOException -> 0x0024, all -> 0x0021 }
            goto L_0x000f
        L_0x001a:
            r1.close()     // Catch:{ IOException -> 0x001d }
        L_0x001d:
            r3.close()     // Catch:{ IOException -> 0x0020 }
        L_0x0020:
            return
        L_0x0021:
            r4 = move-exception
            r0 = r1
            goto L_0x003a
        L_0x0024:
            r4 = move-exception
            r0 = r1
            goto L_0x002d
        L_0x0027:
            r4 = move-exception
            r0 = r1
            goto L_0x0034
        L_0x002a:
            r4 = move-exception
            goto L_0x003a
        L_0x002c:
            r4 = move-exception
        L_0x002d:
            java.lang.String r1 = "copyStream"
            m29691a(r1, r4)     // Catch:{ all -> 0x002a }
            throw r4     // Catch:{ all -> 0x002a }
        L_0x0033:
            r4 = move-exception
        L_0x0034:
            java.lang.String r1 = "copyStream"
            m29691a(r1, r4)     // Catch:{ all -> 0x002a }
            throw r4     // Catch:{ all -> 0x002a }
        L_0x003a:
            if (r0 == 0) goto L_0x003f
            r0.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            r3.close()     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.photoeffect.C6068e.m29690a(java.io.InputStream, java.io.File):void");
    }

    /* renamed from: a */
    private static void m29691a(String str, IOException iOException) {
        Log.d("PhotoEffect.Util", str, iOException);
    }

    /* renamed from: b */
    public static ColorFilter m29692b() {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        return new ColorMatrixColorFilter(colorMatrix);
    }

    /* renamed from: c */
    public static File m29693c() {
        try {
            File file = new File(f21533a);
            if (file.exists() || file.mkdirs()) {
                return File.createTempFile("image", null, file);
            }
            return null;
        } catch (IOException e) {
            m29691a("createTempFile", e);
            return null;
        }
    }
}
