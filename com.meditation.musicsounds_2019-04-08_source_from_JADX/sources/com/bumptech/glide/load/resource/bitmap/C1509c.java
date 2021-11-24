package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.bumptech.glide.load.C1376d;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.C1489g;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.p046a.C1393b;

/* renamed from: com.bumptech.glide.load.resource.bitmap.c */
public class C1509c implements C1489g<Bitmap> {

    /* renamed from: a */
    public static final C1376d<Integer> f4962a = C1376d.m7045a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", Integer.valueOf(90));

    /* renamed from: b */
    public static final C1376d<CompressFormat> f4963b = C1376d.m7044a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* renamed from: c */
    private final C1393b f4964c;

    @Deprecated
    public C1509c() {
        this.f4964c = null;
    }

    public C1509c(C1393b bVar) {
        this.f4964c = bVar;
    }

    /* renamed from: a */
    private CompressFormat m7518a(Bitmap bitmap, C1379e eVar) {
        CompressFormat compressFormat = (CompressFormat) eVar.mo6062a(f4963b);
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? CompressFormat.PNG : CompressFormat.JPEG;
    }

    /* renamed from: a */
    public EncodeStrategy mo6291a(C1379e eVar) {
        return EncodeStrategy.TRANSFORMED;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:21|(2:38|39)|40|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0068, code lost:
        if (r5 == null) goto L_0x006b;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00c5 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061 A[Catch:{ all -> 0x0055 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c2 A[SYNTHETIC, Splitter:B:38:0x00c2] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5922a(com.bumptech.glide.load.engine.C1482s<android.graphics.Bitmap> r8, java.io.File r9, com.bumptech.glide.load.C1379e r10) {
        /*
            r7 = this;
            java.lang.Object r8 = r8.mo6272d()
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            android.graphics.Bitmap$CompressFormat r0 = r7.m7518a(r8, r10)
            java.lang.String r1 = "encode: [%dx%d] %s"
            int r2 = r8.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r8.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.bumptech.glide.p040g.p041a.C1246b.m6661a(r1, r2, r3, r0)
            long r1 = com.bumptech.glide.p040g.C1253e.m6677a()     // Catch:{ all -> 0x00c6 }
            com.bumptech.glide.load.d<java.lang.Integer> r3 = f4962a     // Catch:{ all -> 0x00c6 }
            java.lang.Object r3 = r10.mo6062a(r3)     // Catch:{ all -> 0x00c6 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x00c6 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x00c6 }
            r4 = 0
            r5 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0057 }
            r6.<init>(r9)     // Catch:{ IOException -> 0x0057 }
            com.bumptech.glide.load.engine.a.b r9 = r7.f4964c     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            if (r9 == 0) goto L_0x0043
            com.bumptech.glide.load.a.c r9 = new com.bumptech.glide.load.a.c     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            com.bumptech.glide.load.engine.a.b r5 = r7.f4964c     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            r9.<init>(r6, r5)     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            r5 = r9
            goto L_0x0044
        L_0x0043:
            r5 = r6
        L_0x0044:
            r8.compress(r0, r3, r5)     // Catch:{ IOException -> 0x0057 }
            r5.close()     // Catch:{ IOException -> 0x0057 }
            r4 = 1
        L_0x004b:
            r5.close()     // Catch:{ IOException -> 0x006b }
            goto L_0x006b
        L_0x004f:
            r8 = move-exception
            r5 = r6
            goto L_0x00c0
        L_0x0052:
            r9 = move-exception
            r5 = r6
            goto L_0x0058
        L_0x0055:
            r8 = move-exception
            goto L_0x00c0
        L_0x0057:
            r9 = move-exception
        L_0x0058:
            java.lang.String r3 = "BitmapEncoder"
            r6 = 3
            boolean r3 = android.util.Log.isLoggable(r3, r6)     // Catch:{ all -> 0x0055 }
            if (r3 == 0) goto L_0x0068
            java.lang.String r3 = "BitmapEncoder"
            java.lang.String r6 = "Failed to encode Bitmap"
            android.util.Log.d(r3, r6, r9)     // Catch:{ all -> 0x0055 }
        L_0x0068:
            if (r5 == 0) goto L_0x006b
            goto L_0x004b
        L_0x006b:
            java.lang.String r9 = "BitmapEncoder"
            r3 = 2
            boolean r9 = android.util.Log.isLoggable(r9, r3)     // Catch:{ all -> 0x00c6 }
            if (r9 == 0) goto L_0x00bc
            java.lang.String r9 = "BitmapEncoder"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c6 }
            r3.<init>()     // Catch:{ all -> 0x00c6 }
            java.lang.String r5 = "Compressed with type: "
            r3.append(r5)     // Catch:{ all -> 0x00c6 }
            r3.append(r0)     // Catch:{ all -> 0x00c6 }
            java.lang.String r0 = " of size "
            r3.append(r0)     // Catch:{ all -> 0x00c6 }
            int r0 = com.bumptech.glide.p040g.C1258j.m6700a(r8)     // Catch:{ all -> 0x00c6 }
            r3.append(r0)     // Catch:{ all -> 0x00c6 }
            java.lang.String r0 = " in "
            r3.append(r0)     // Catch:{ all -> 0x00c6 }
            double r0 = com.bumptech.glide.p040g.C1253e.m6676a(r1)     // Catch:{ all -> 0x00c6 }
            r3.append(r0)     // Catch:{ all -> 0x00c6 }
            java.lang.String r0 = ", options format: "
            r3.append(r0)     // Catch:{ all -> 0x00c6 }
            com.bumptech.glide.load.d<android.graphics.Bitmap$CompressFormat> r0 = f4963b     // Catch:{ all -> 0x00c6 }
            java.lang.Object r10 = r10.mo6062a(r0)     // Catch:{ all -> 0x00c6 }
            r3.append(r10)     // Catch:{ all -> 0x00c6 }
            java.lang.String r10 = ", hasAlpha: "
            r3.append(r10)     // Catch:{ all -> 0x00c6 }
            boolean r8 = r8.hasAlpha()     // Catch:{ all -> 0x00c6 }
            r3.append(r8)     // Catch:{ all -> 0x00c6 }
            java.lang.String r8 = r3.toString()     // Catch:{ all -> 0x00c6 }
            android.util.Log.v(r9, r8)     // Catch:{ all -> 0x00c6 }
        L_0x00bc:
            com.bumptech.glide.p040g.p041a.C1246b.m6658a()
            return r4
        L_0x00c0:
            if (r5 == 0) goto L_0x00c5
            r5.close()     // Catch:{ IOException -> 0x00c5 }
        L_0x00c5:
            throw r8     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            r8 = move-exception
            com.bumptech.glide.p040g.p041a.C1246b.m6658a()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C1509c.mo5922a(com.bumptech.glide.load.engine.s, java.io.File, com.bumptech.glide.load.e):boolean");
    }
}
