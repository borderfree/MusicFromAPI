package com.seattleclouds.modules.p187t;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: com.seattleclouds.modules.t.c */
public class C6290c extends AsyncTask<String, Void, Bitmap> {

    /* renamed from: a */
    private final int f22323a;

    /* renamed from: b */
    private final int f22324b;

    /* renamed from: c */
    private WeakReference<ImageView> f22325c;

    /* renamed from: d */
    private WeakReference<C6291a> f22326d;

    /* renamed from: e */
    private int f22327e = -1;

    /* renamed from: com.seattleclouds.modules.t.c$a */
    public interface C6291a {
        /* renamed from: b */
        void mo1450b();

        /* renamed from: c */
        void mo1453c();

        /* renamed from: d */
        void mo19657d();
    }

    public C6290c(ImageView imageView, int i, int i2, int i3) {
        this.f22323a = i;
        this.f22324b = i2;
        this.f22327e = i3;
        mo19668a(imageView);
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [java.io.BufferedInputStream] */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v5, types: [java.io.BufferedInputStream] */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007c */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0081 A[SYNTHETIC, Splitter:B:33:0x0081] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c3 A[SYNTHETIC, Splitter:B:71:0x00c3] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ca A[SYNTHETIC, Splitter:B:75:0x00ca] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d1 A[SYNTHETIC, Splitter:B:79:0x00d1] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00dc A[SYNTHETIC, Splitter:B:88:0x00dc] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x00e3 A[SYNTHETIC, Splitter:B:92:0x00e3] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x00ea A[SYNTHETIC, Splitter:B:96:0x00ea] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap doInBackground(java.lang.String... r10) {
        /*
            r9 = this;
            r0 = 0
            r10 = r10[r0]
            java.lang.String r1 = "http://"
            boolean r1 = r10.startsWith(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x00ef
            java.lang.String r1 = "ssf"
            java.io.File r1 = java.io.File.createTempFile(r1, r3)     // Catch:{ IOException -> 0x0014 }
            goto L_0x0015
        L_0x0014:
            r1 = r3
        L_0x0015:
            if (r1 != 0) goto L_0x0030
            java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x00f8 }
            r0.<init>(r10)     // Catch:{ Exception -> 0x00f8 }
            java.lang.Object r10 = r0.getContent()     // Catch:{ Exception -> 0x00f8 }
            java.io.InputStream r10 = (java.io.InputStream) r10     // Catch:{ Exception -> 0x00f8 }
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeStream(r10)     // Catch:{ Exception -> 0x00f8 }
            int r0 = r9.f22323a     // Catch:{ Exception -> 0x00f8 }
            int r1 = r9.f22324b     // Catch:{ Exception -> 0x00f8 }
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createScaledBitmap(r10, r0, r1, r2)     // Catch:{ Exception -> 0x00f8 }
            goto L_0x00ee
        L_0x0030:
            java.net.URL r4 = new java.net.URL     // Catch:{ Exception -> 0x00f8 }
            r4.<init>(r10)     // Catch:{ Exception -> 0x00f8 }
            java.net.URLConnection r10 = r4.openConnection()     // Catch:{ Exception -> 0x00f8 }
            java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10     // Catch:{ Exception -> 0x00f8 }
            r5 = 10000(0x2710, float:1.4013E-41)
            r10.setConnectTimeout(r5)     // Catch:{ Exception -> 0x00f8 }
            r10.setReadTimeout(r5)     // Catch:{ Exception -> 0x00f8 }
            r10.connect()     // Catch:{ Exception -> 0x00f8 }
            int r5 = r10.getResponseCode()     // Catch:{ Exception -> 0x00f8 }
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 == r6) goto L_0x004f
            return r3
        L_0x004f:
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00d5, all -> 0x00bb }
            r5.<init>(r1)     // Catch:{ IOException -> 0x00d5, all -> 0x00bb }
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x00d5, all -> 0x00bb }
            r6.<init>(r5)     // Catch:{ IOException -> 0x00d5, all -> 0x00bb }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            java.io.InputStream r4 = r4.openStream()     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r4 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x00d7, all -> 0x00b4 }
        L_0x0066:
            int r7 = r5.read(r4)     // Catch:{ IOException -> 0x00d7, all -> 0x00b4 }
            r8 = -1
            if (r7 <= r8) goto L_0x0085
            r6.write(r4, r0, r7)     // Catch:{ IOException -> 0x00d7, all -> 0x00b4 }
            boolean r7 = r9.isCancelled()     // Catch:{ IOException -> 0x00d7, all -> 0x00b4 }
            if (r7 == 0) goto L_0x0066
            r1.delete()     // Catch:{ Exception -> 0x00f8 }
            r6.close()     // Catch:{ IOException -> 0x007c }
        L_0x007c:
            r5.close()     // Catch:{ IOException -> 0x007f }
        L_0x007f:
            if (r10 == 0) goto L_0x0084
            r10.disconnect()     // Catch:{ Exception -> 0x00f8 }
        L_0x0084:
            return r3
        L_0x0085:
            r6.close()     // Catch:{ IOException -> 0x00d7, all -> 0x00b4 }
            r5.close()     // Catch:{ IOException -> 0x00b2, all -> 0x00af }
            r10.disconnect()     // Catch:{ IOException -> 0x00d5, all -> 0x00bb }
            boolean r10 = r9.isCancelled()     // Catch:{ IOException -> 0x00ac, all -> 0x00a8 }
            if (r10 == 0) goto L_0x0098
            r1.delete()     // Catch:{ Exception -> 0x00f8 }
            return r3
        L_0x0098:
            java.lang.String r10 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x00ac, all -> 0x00a8 }
            int r0 = r9.f22323a     // Catch:{ IOException -> 0x00ac, all -> 0x00a8 }
            int r4 = r9.f22324b     // Catch:{ IOException -> 0x00ac, all -> 0x00a8 }
            android.graphics.Bitmap r10 = com.seattleclouds.util.C6638s.m32078b(r10, r0, r4, r2)     // Catch:{ IOException -> 0x00ac, all -> 0x00a8 }
            r1.delete()     // Catch:{ Exception -> 0x00f8 }
            goto L_0x00ee
        L_0x00a8:
            r0 = move-exception
            r10 = r3
            r5 = r10
            goto L_0x00bd
        L_0x00ac:
            r10 = r3
            r5 = r10
            goto L_0x00d6
        L_0x00af:
            r0 = move-exception
            r6 = r3
            goto L_0x00be
        L_0x00b2:
            r6 = r3
            goto L_0x00d7
        L_0x00b4:
            r0 = move-exception
            goto L_0x00be
        L_0x00b6:
            r0 = move-exception
            r5 = r3
            goto L_0x00be
        L_0x00b9:
            r5 = r3
            goto L_0x00d7
        L_0x00bb:
            r0 = move-exception
            r5 = r3
        L_0x00bd:
            r6 = r5
        L_0x00be:
            r1.delete()     // Catch:{ Exception -> 0x00f8 }
            if (r6 == 0) goto L_0x00c8
            r6.close()     // Catch:{ IOException -> 0x00c7 }
            goto L_0x00c8
        L_0x00c7:
        L_0x00c8:
            if (r5 == 0) goto L_0x00cf
            r5.close()     // Catch:{ IOException -> 0x00ce }
            goto L_0x00cf
        L_0x00ce:
        L_0x00cf:
            if (r10 == 0) goto L_0x00d4
            r10.disconnect()     // Catch:{ Exception -> 0x00f8 }
        L_0x00d4:
            throw r0     // Catch:{ Exception -> 0x00f8 }
        L_0x00d5:
            r5 = r3
        L_0x00d6:
            r6 = r5
        L_0x00d7:
            r1.delete()     // Catch:{ Exception -> 0x00f8 }
            if (r6 == 0) goto L_0x00e1
            r6.close()     // Catch:{ IOException -> 0x00e0 }
            goto L_0x00e1
        L_0x00e0:
        L_0x00e1:
            if (r5 == 0) goto L_0x00e8
            r5.close()     // Catch:{ IOException -> 0x00e7 }
            goto L_0x00e8
        L_0x00e7:
        L_0x00e8:
            if (r10 == 0) goto L_0x00ed
            r10.disconnect()     // Catch:{ Exception -> 0x00f8 }
        L_0x00ed:
            r10 = r3
        L_0x00ee:
            return r10
        L_0x00ef:
            int r0 = r9.f22323a     // Catch:{ Exception -> 0x00f8 }
            int r1 = r9.f22324b     // Catch:{ Exception -> 0x00f8 }
            android.graphics.Bitmap r10 = com.seattleclouds.util.C6638s.m32069a(r10, r0, r1, r2)     // Catch:{ Exception -> 0x00f8 }
            return r10
        L_0x00f8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.p187t.C6290c.doInBackground(java.lang.String[]):android.graphics.Bitmap");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Bitmap bitmap) {
        if (!isCancelled() && this.f22325c != null) {
            ImageView imageView = (ImageView) this.f22325c.get();
            if (!(imageView == null || imageView.getTag() == null || this.f22327e != ((Integer) imageView.getTag()).intValue())) {
                imageView.setImageBitmap(bitmap);
            }
            if (this.f22326d != null) {
                C6291a aVar = (C6291a) this.f22326d.get();
                if (aVar != null) {
                    aVar.mo19657d();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo19668a(ImageView imageView) {
        this.f22325c = new WeakReference<>(imageView);
    }

    /* renamed from: a */
    public void mo19669a(C6291a aVar) {
        this.f22326d = new WeakReference<>(aVar);
    }

    /* access modifiers changed from: protected */
    public void onCancelled() {
        if (this.f22326d != null) {
            C6291a aVar = (C6291a) this.f22326d.get();
            if (aVar != null) {
                aVar.mo1453c();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        if (this.f22326d != null) {
            C6291a aVar = (C6291a) this.f22326d.get();
            if (aVar != null) {
                aVar.mo1450b();
            }
        }
    }
}
