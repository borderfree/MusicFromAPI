package com.seattleclouds.util;

/* renamed from: com.seattleclouds.util.av */
public class C6604av {

    /* renamed from: a */
    public static boolean f23321a = false;

    /* renamed from: a */
    public static int m31953a(String str, String str2) {
        return m31954a(str, str2, 2048);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0089 A[SYNTHETIC, Splitter:B:34:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0091 A[Catch:{ Exception -> 0x0094 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m31954a(java.lang.String r8, java.lang.String r9, int r10) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0085 }
            r1.<init>(r8)     // Catch:{ all -> 0x0085 }
            java.util.zip.ZipInputStream r8 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x0085 }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0085 }
            r2.<init>(r1)     // Catch:{ all -> 0x0085 }
            r8.<init>(r2)     // Catch:{ all -> 0x0085 }
            r1 = 0
            r2 = 0
        L_0x0012:
            java.util.zip.ZipEntry r3 = r8.getNextEntry()     // Catch:{ all -> 0x0083 }
            if (r3 == 0) goto L_0x007f
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0083 }
            java.lang.String r5 = r3.getName()     // Catch:{ all -> 0x0083 }
            r4.<init>(r9, r5)     // Catch:{ all -> 0x0083 }
            boolean r3 = r3.isDirectory()     // Catch:{ all -> 0x0083 }
            if (r3 == 0) goto L_0x0031
            boolean r3 = r4.exists()     // Catch:{ all -> 0x0083 }
            if (r3 != 0) goto L_0x005b
            r4.mkdirs()     // Catch:{ all -> 0x0083 }
            goto L_0x005b
        L_0x0031:
            java.io.File r3 = r4.getParentFile()     // Catch:{ all -> 0x0083 }
            boolean r5 = r3.exists()     // Catch:{ all -> 0x0083 }
            if (r5 != 0) goto L_0x003e
            r3.mkdirs()     // Catch:{ all -> 0x0083 }
        L_0x003e:
            byte[] r3 = new byte[r10]     // Catch:{ all -> 0x0083 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ all -> 0x0083 }
            r5.<init>(r4)     // Catch:{ all -> 0x0083 }
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0083 }
            r6.<init>(r5, r10)     // Catch:{ all -> 0x0083 }
        L_0x004a:
            int r5 = r8.read(r3, r1, r10)     // Catch:{ all -> 0x007c }
            r7 = -1
            if (r5 == r7) goto L_0x0055
            r6.write(r3, r1, r5)     // Catch:{ all -> 0x007c }
            goto L_0x004a
        L_0x0055:
            r6.flush()     // Catch:{ all -> 0x007c }
            r6.close()     // Catch:{ all -> 0x007c }
        L_0x005b:
            int r2 = r2 + 1
            boolean r3 = f23321a     // Catch:{ all -> 0x0083 }
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "ZipUtil"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0083 }
            r5.<init>()     // Catch:{ all -> 0x0083 }
            java.lang.String r6 = "Unzipped: "
            r5.append(r6)     // Catch:{ all -> 0x0083 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0083 }
            r5.append(r4)     // Catch:{ all -> 0x0083 }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0083 }
            android.util.Log.i(r3, r4)     // Catch:{ all -> 0x0083 }
            goto L_0x0012
        L_0x007c:
            r9 = move-exception
            r0 = r6
            goto L_0x0087
        L_0x007f:
            r8.close()     // Catch:{ all -> 0x0083 }
            return r2
        L_0x0083:
            r9 = move-exception
            goto L_0x0087
        L_0x0085:
            r9 = move-exception
            r8 = r0
        L_0x0087:
            if (r0 == 0) goto L_0x008f
            r0.flush()     // Catch:{ Exception -> 0x0094 }
            r0.close()     // Catch:{ Exception -> 0x0094 }
        L_0x008f:
            if (r8 == 0) goto L_0x0094
            r8.close()     // Catch:{ Exception -> 0x0094 }
        L_0x0094:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.util.C6604av.m31954a(java.lang.String, java.lang.String, int):int");
    }
}
