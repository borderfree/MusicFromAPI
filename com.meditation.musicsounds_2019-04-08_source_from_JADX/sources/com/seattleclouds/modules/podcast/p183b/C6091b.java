package com.seattleclouds.modules.podcast.p183b;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import java.lang.ref.WeakReference;

/* renamed from: com.seattleclouds.modules.podcast.b.b */
public class C6091b extends AsyncTask<String, Void, Bitmap> {

    /* renamed from: a */
    private Bitmap f21615a;

    /* renamed from: b */
    private WeakReference<C6092a> f21616b;

    /* renamed from: c */
    private int f21617c;

    /* renamed from: com.seattleclouds.modules.podcast.b.b$a */
    public interface C6092a {
        /* renamed from: a */
        void mo19211a(Bitmap bitmap, Bitmap bitmap2);

        /* renamed from: c */
        void mo19212c();
    }

    public C6091b(int i) {
        this.f21617c = i;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.io.BufferedInputStream] */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4, types: [java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r5v5, types: [java.io.BufferedInputStream] */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6, types: [java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r5v10, types: [java.io.BufferedInputStream] */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: type inference failed for: r6v11 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r6v13 */
    /* JADX WARNING: type inference failed for: r6v14 */
    /* JADX WARNING: type inference failed for: r6v15 */
    /* JADX WARNING: type inference failed for: r6v16 */
    /* JADX WARNING: type inference failed for: r6v17 */
    /* JADX WARNING: type inference failed for: r6v18 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: type inference failed for: r5v21 */
    /* JADX WARNING: type inference failed for: r5v22 */
    /* JADX WARNING: type inference failed for: r5v23 */
    /* JADX WARNING: type inference failed for: r5v24 */
    /* JADX WARNING: type inference failed for: r5v25 */
    /* JADX WARNING: type inference failed for: r6v19 */
    /* JADX WARNING: type inference failed for: r5v26 */
    /* JADX WARNING: type inference failed for: r5v27 */
    /* JADX WARNING: type inference failed for: r5v28 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x007c */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v2
      assigns: []
      uses: []
      mth insns count: 144
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
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0100 A[SYNTHETIC, Splitter:B:100:0x0100] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0107 A[SYNTHETIC, Splitter:B:104:0x0107] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0111 A[Catch:{ IOException | OutOfMemoryError -> 0x0138 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0112 A[Catch:{ IOException | OutOfMemoryError -> 0x0138 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0081 A[SYNTHETIC, Splitter:B:31:0x0081] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d8 A[SYNTHETIC, Splitter:B:75:0x00d8] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00dd A[SYNTHETIC, Splitter:B:78:0x00dd] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00e4 A[SYNTHETIC, Splitter:B:82:0x00e4] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00eb A[SYNTHETIC, Splitter:B:86:0x00eb] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x00f4 A[Catch:{ IOException | OutOfMemoryError -> 0x0138 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x00f9 A[SYNTHETIC, Splitter:B:96:0x00f9] */
    /* JADX WARNING: Unknown variable types count: 14 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap doInBackground(java.lang.String... r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r9 = r9[r0]     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
            java.lang.String r2 = com.seattleclouds.modules.podcast.C6139g.m29962c(r9)     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
            java.io.File r3 = new java.io.File     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
            r3.<init>(r2)     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
            boolean r2 = r3.exists()     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
            r4 = -1
            if (r2 == 0) goto L_0x002e
            int r9 = r8.f21617c     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
            if (r9 != r4) goto L_0x0022
            java.lang.String r9 = r3.getAbsolutePath()     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeFile(r9)     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
            goto L_0x010b
        L_0x0022:
            java.lang.String r9 = r3.getAbsolutePath()     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
            int r2 = r8.f21617c     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
            android.graphics.Bitmap r9 = com.seattleclouds.util.C6638s.m32077b(r9, r2)     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
            goto L_0x010b
        L_0x002e:
            r3.createNewFile()     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
            r2.<init>(r9)     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
            java.net.URLConnection r9 = r2.openConnection()     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
            java.net.HttpURLConnection r9 = (java.net.HttpURLConnection) r9     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
            r5 = 10000(0x2710, float:1.4013E-41)
            r9.setConnectTimeout(r5)     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
            r9.setReadTimeout(r5)     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
            r9.connect()     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
            int r5 = r9.getResponseCode()     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 == r6) goto L_0x0050
            return r1
        L_0x0050:
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00ef, all -> 0x00d3 }
            r5.<init>(r3)     // Catch:{ IOException -> 0x00ef, all -> 0x00d3 }
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x00ef, all -> 0x00d3 }
            r6.<init>(r5)     // Catch:{ IOException -> 0x00ef, all -> 0x00d3 }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x00d1, all -> 0x00ce }
            java.io.InputStream r2 = r2.openStream()     // Catch:{ IOException -> 0x00d1, all -> 0x00ce }
            r5.<init>(r2)     // Catch:{ IOException -> 0x00d1, all -> 0x00ce }
            r2 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r2]     // Catch:{ IOException -> 0x00f1, all -> 0x00cc }
        L_0x0067:
            int r7 = r5.read(r2)     // Catch:{ IOException -> 0x00f1, all -> 0x00cc }
            if (r7 <= r4) goto L_0x0085
            r6.write(r2, r0, r7)     // Catch:{ IOException -> 0x00f1, all -> 0x00cc }
            boolean r7 = r8.isCancelled()     // Catch:{ IOException -> 0x00f1, all -> 0x00cc }
            if (r7 == 0) goto L_0x0067
            r3.delete()     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
            r6.close()     // Catch:{ IOException -> 0x007c }
        L_0x007c:
            r5.close()     // Catch:{ IOException -> 0x007f }
        L_0x007f:
            if (r9 == 0) goto L_0x0084
            r9.disconnect()     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
        L_0x0084:
            return r1
        L_0x0085:
            r2 = 1
            r6.close()     // Catch:{ IOException -> 0x00ca, all -> 0x00c6 }
            r5.close()     // Catch:{ IOException -> 0x00c4, all -> 0x00c0 }
            r9.disconnect()     // Catch:{ IOException -> 0x00bd, all -> 0x00b8 }
            boolean r9 = r8.isCancelled()     // Catch:{ IOException -> 0x00b5, all -> 0x00b0 }
            if (r9 == 0) goto L_0x0096
            return r1
        L_0x0096:
            int r9 = r8.f21617c     // Catch:{ IOException -> 0x00b5, all -> 0x00b0 }
            if (r9 != r4) goto L_0x00a4
            java.lang.String r9 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x00b5, all -> 0x00b0 }
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeFile(r9)     // Catch:{ IOException -> 0x00b5, all -> 0x00b0 }
            goto L_0x010b
        L_0x00a4:
            java.lang.String r9 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x00b5, all -> 0x00b0 }
            int r5 = r8.f21617c     // Catch:{ IOException -> 0x00b5, all -> 0x00b0 }
            android.graphics.Bitmap r9 = com.seattleclouds.util.C6638s.m32077b(r9, r5)     // Catch:{ IOException -> 0x00b5, all -> 0x00b0 }
            goto L_0x010b
        L_0x00b0:
            r9 = move-exception
            r2 = r9
            r9 = r1
            r5 = r9
            goto L_0x00bb
        L_0x00b5:
            r9 = r1
            r5 = r9
            goto L_0x00be
        L_0x00b8:
            r0 = move-exception
            r2 = r0
            r5 = r1
        L_0x00bb:
            r6 = r5
            goto L_0x00c8
        L_0x00bd:
            r5 = r1
        L_0x00be:
            r6 = r5
            goto L_0x00f2
        L_0x00c0:
            r0 = move-exception
            r2 = r0
            r6 = r1
            goto L_0x00c8
        L_0x00c4:
            r6 = r1
            goto L_0x00f2
        L_0x00c6:
            r0 = move-exception
            r2 = r0
        L_0x00c8:
            r0 = 1
            goto L_0x00d6
        L_0x00ca:
            goto L_0x00f2
        L_0x00cc:
            r2 = move-exception
            goto L_0x00d6
        L_0x00ce:
            r2 = move-exception
            r5 = r1
            goto L_0x00d6
        L_0x00d1:
            r5 = r1
            goto L_0x00f1
        L_0x00d3:
            r2 = move-exception
            r5 = r1
            r6 = r5
        L_0x00d6:
            if (r0 != 0) goto L_0x00db
            r3.delete()     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
        L_0x00db:
            if (r6 == 0) goto L_0x00e2
            r6.close()     // Catch:{ IOException -> 0x00e1 }
            goto L_0x00e2
        L_0x00e1:
        L_0x00e2:
            if (r5 == 0) goto L_0x00e9
            r5.close()     // Catch:{ IOException -> 0x00e8 }
            goto L_0x00e9
        L_0x00e8:
        L_0x00e9:
            if (r9 == 0) goto L_0x00ee
            r9.disconnect()     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
        L_0x00ee:
            throw r2     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
        L_0x00ef:
            r5 = r1
            r6 = r5
        L_0x00f1:
            r2 = 0
        L_0x00f2:
            if (r2 != 0) goto L_0x00f7
            r3.delete()     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
        L_0x00f7:
            if (r6 == 0) goto L_0x00fe
            r6.close()     // Catch:{ IOException -> 0x00fd }
            goto L_0x00fe
        L_0x00fd:
        L_0x00fe:
            if (r5 == 0) goto L_0x0105
            r5.close()     // Catch:{ IOException -> 0x0104 }
            goto L_0x0105
        L_0x0104:
        L_0x0105:
            if (r9 == 0) goto L_0x010a
            r9.disconnect()     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
        L_0x010a:
            r9 = r1
        L_0x010b:
            boolean r2 = r8.isCancelled()     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
            if (r2 == 0) goto L_0x0112
            return r1
        L_0x0112:
            if (r9 == 0) goto L_0x0137
            int r2 = r8.f21617c     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
            if (r2 != r4) goto L_0x0129
            int r2 = r9.getWidth()     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
            int r2 = r2 / 6
            int r3 = r9.getHeight()     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
        L_0x0122:
            int r3 = r3 / 6
            android.graphics.Bitmap r0 = com.seattleclouds.util.C6638s.m32066a(r9, r2, r3, r0)     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
            goto L_0x0130
        L_0x0129:
            int r2 = r8.f21617c     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
            int r2 = r2 / 6
            int r3 = r8.f21617c     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
            goto L_0x0122
        L_0x0130:
            r2 = 5
            android.graphics.Bitmap r0 = com.seattleclouds.util.C6638s.m32076b(r0, r2)     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
            r8.f21615a = r0     // Catch:{ IOException | OutOfMemoryError -> 0x0138 }
        L_0x0137:
            return r9
        L_0x0138:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.podcast.p183b.C6091b.doInBackground(java.lang.String[]):android.graphics.Bitmap");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Bitmap bitmap) {
        if (this.f21616b != null) {
            C6092a aVar = (C6092a) this.f21616b.get();
            if (aVar != null) {
                aVar.mo19211a(bitmap, this.f21615a);
            }
        }
    }

    /* renamed from: a */
    public void mo19207a(C6092a aVar) {
        this.f21616b = new WeakReference<>(aVar);
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        if (this.f21616b != null) {
            C6092a aVar = (C6092a) this.f21616b.get();
            if (aVar != null) {
                aVar.mo19212c();
            }
        }
    }
}
