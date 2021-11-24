package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.ads.ky */
public final class C3697ky implements C4109yy {

    /* renamed from: a */
    private final Map<String, C3725lz> f14361a;

    /* renamed from: b */
    private long f14362b;

    /* renamed from: c */
    private final File f14363c;

    /* renamed from: d */
    private final int f14364d;

    public C3697ky(File file) {
        this(file, 5242880);
    }

    private C3697ky(File file, int i) {
        this.f14361a = new LinkedHashMap(16, 0.75f, true);
        this.f14362b = 0;
        this.f14363c = file;
        this.f14364d = 5242880;
    }

    /* renamed from: a */
    static int m19054a(InputStream inputStream) {
        return (m19065c(inputStream) << 24) | m19065c(inputStream) | 0 | (m19065c(inputStream) << 8) | (m19065c(inputStream) << 16);
    }

    /* renamed from: a */
    private static InputStream m19055a(File file) {
        return new FileInputStream(file);
    }

    /* renamed from: a */
    static String m19056a(C3752mz mzVar) {
        return new String(m19061a(mzVar, m19062b((InputStream) mzVar)), "UTF-8");
    }

    /* renamed from: a */
    static void m19057a(OutputStream outputStream, int i) {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write(i >>> 24);
    }

    /* renamed from: a */
    static void m19058a(OutputStream outputStream, long j) {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    /* renamed from: a */
    static void m19059a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        m19058a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    /* renamed from: a */
    private final void m19060a(String str, C3725lz lzVar) {
        if (!this.f14361a.containsKey(str)) {
            this.f14362b += lzVar.f14434a;
        } else {
            this.f14362b += lzVar.f14434a - ((C3725lz) this.f14361a.get(str)).f14434a;
        }
        this.f14361a.put(str, lzVar);
    }

    /* renamed from: a */
    private static byte[] m19061a(C3752mz mzVar, long j) {
        long a = mzVar.mo13279a();
        if (j >= 0 && j <= a) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(mzVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(a);
        throw new IOException(sb.toString());
    }

    /* renamed from: b */
    static long m19062b(InputStream inputStream) {
        return (((long) m19065c(inputStream)) & 255) | 0 | ((((long) m19065c(inputStream)) & 255) << 8) | ((((long) m19065c(inputStream)) & 255) << 16) | ((((long) m19065c(inputStream)) & 255) << 24) | ((((long) m19065c(inputStream)) & 255) << 32) | ((((long) m19065c(inputStream)) & 255) << 40) | ((((long) m19065c(inputStream)) & 255) << 48) | ((255 & ((long) m19065c(inputStream))) << 56);
    }

    /* renamed from: b */
    static List<aod> m19063b(C3752mz mzVar) {
        int a = m19054a((InputStream) mzVar);
        List<aod> emptyList = a == 0 ? Collections.emptyList() : new ArrayList<>(a);
        for (int i = 0; i < a; i++) {
            emptyList.add(new aod(m19056a(mzVar).intern(), m19056a(mzVar).intern()));
        }
        return emptyList;
    }

    /* renamed from: b */
    private final synchronized void m19064b(String str) {
        boolean delete = m19067d(str).delete();
        m19068e(str);
        if (!delete) {
            C3504dv.m18312b("Could not delete cache entry for key=%s, filename=%s", str, m19066c(str));
        }
    }

    /* renamed from: c */
    private static int m19065c(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* renamed from: c */
    private static String m19066c(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: d */
    private final File m19067d(String str) {
        return new File(this.f14363c, m19066c(str));
    }

    /* renamed from: e */
    private final void m19068e(String str) {
        C3725lz lzVar = (C3725lz) this.f14361a.remove(str);
        if (lzVar != null) {
            this.f14362b -= lzVar.f14434a;
        }
    }

    /* renamed from: a */
    public final synchronized afd mo13210a(String str) {
        C3752mz mzVar;
        C3725lz lzVar = (C3725lz) this.f14361a.get(str);
        if (lzVar == null) {
            return null;
        }
        File d = m19067d(str);
        try {
            mzVar = new C3752mz(new BufferedInputStream(m19055a(d)), d.length());
            C3725lz a = C3725lz.m19157a(mzVar);
            if (!TextUtils.equals(str, a.f14435b)) {
                C3504dv.m18312b("%s: key=%s, found=%s", d.getAbsolutePath(), str, a.f14435b);
                m19068e(str);
                mzVar.close();
                return null;
            }
            byte[] a2 = m19061a(mzVar, mzVar.mo13279a());
            afd afd = new afd();
            afd.f11859a = a2;
            afd.f11860b = lzVar.f14436c;
            afd.f11861c = lzVar.f14437d;
            afd.f11862d = lzVar.f14438e;
            afd.f11863e = lzVar.f14439f;
            afd.f11864f = lzVar.f14440g;
            List<aod> list = lzVar.f14441h;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (aod aod : list) {
                treeMap.put(aod.mo12126a(), aod.mo12127b());
            }
            afd.f11865g = treeMap;
            afd.f11866h = Collections.unmodifiableList(lzVar.f14441h);
            mzVar.close();
            return afd;
        } catch (IOException e) {
            C3504dv.m18312b("%s: %s", d.getAbsolutePath(), e.toString());
            m19064b(str);
            return null;
        } catch (Throwable th) {
            mzVar.close();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0059 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo13211a() {
        /*
            r9 = this;
            monitor-enter(r9)
            java.io.File r0 = r9.f14363c     // Catch:{ all -> 0x0061 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0061 }
            r1 = 0
            if (r0 != 0) goto L_0x0024
            java.io.File r0 = r9.f14363c     // Catch:{ all -> 0x0061 }
            boolean r0 = r0.mkdirs()     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "Unable to create cache dir %s"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0061 }
            java.io.File r3 = r9.f14363c     // Catch:{ all -> 0x0061 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x0061 }
            r2[r1] = r3     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.C3504dv.m18313c(r0, r2)     // Catch:{ all -> 0x0061 }
        L_0x0022:
            monitor-exit(r9)
            return
        L_0x0024:
            java.io.File r0 = r9.f14363c     // Catch:{ all -> 0x0061 }
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x002e
            monitor-exit(r9)
            return
        L_0x002e:
            int r2 = r0.length     // Catch:{ all -> 0x0061 }
        L_0x002f:
            if (r1 >= r2) goto L_0x005f
            r3 = r0[r1]     // Catch:{ all -> 0x0061 }
            long r4 = r3.length()     // Catch:{ IOException -> 0x0059 }
            com.google.android.gms.internal.ads.mz r6 = new com.google.android.gms.internal.ads.mz     // Catch:{ IOException -> 0x0059 }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0059 }
            java.io.InputStream r8 = m19055a(r3)     // Catch:{ IOException -> 0x0059 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0059 }
            r6.<init>(r7, r4)     // Catch:{ IOException -> 0x0059 }
            com.google.android.gms.internal.ads.lz r7 = com.google.android.gms.internal.ads.C3725lz.m19157a(r6)     // Catch:{ all -> 0x0054 }
            r7.f14434a = r4     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = r7.f14435b     // Catch:{ all -> 0x0054 }
            r9.m19060a(r4, r7)     // Catch:{ all -> 0x0054 }
            r6.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x005c
        L_0x0054:
            r4 = move-exception
            r6.close()     // Catch:{ IOException -> 0x0059 }
            throw r4     // Catch:{ IOException -> 0x0059 }
        L_0x0059:
            r3.delete()     // Catch:{ all -> 0x0061 }
        L_0x005c:
            int r1 = r1 + 1
            goto L_0x002f
        L_0x005f:
            monitor-exit(r9)
            return
        L_0x0061:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3697ky.mo13211a():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:33|34|(1:36)|37|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0103, code lost:
        if (r3.delete() == false) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0105, code lost:
        com.google.android.gms.internal.ads.C3504dv.m18312b("Could not clean up file %s", r3.getAbsolutePath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0115, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00ff */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo13212a(java.lang.String r20, com.google.android.gms.internal.ads.afd r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r21
            monitor-enter(r19)
            byte[] r3 = r2.f11859a     // Catch:{ all -> 0x0116 }
            int r3 = r3.length     // Catch:{ all -> 0x0116 }
            long r4 = r1.f14362b     // Catch:{ all -> 0x0116 }
            long r6 = (long) r3     // Catch:{ all -> 0x0116 }
            long r4 = r4 + r6
            int r3 = r1.f14364d     // Catch:{ all -> 0x0116 }
            long r8 = (long) r3     // Catch:{ all -> 0x0116 }
            r10 = 0
            int r11 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r11 < 0) goto L_0x00c1
            boolean r4 = com.google.android.gms.internal.ads.C3504dv.f13779a     // Catch:{ all -> 0x0116 }
            if (r4 == 0) goto L_0x0021
            java.lang.String r4 = "Pruning old cache entries."
            java.lang.Object[] r5 = new java.lang.Object[r10]     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.C3504dv.m18310a(r4, r5)     // Catch:{ all -> 0x0116 }
        L_0x0021:
            long r4 = r1.f14362b     // Catch:{ all -> 0x0116 }
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0116 }
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.lz> r11 = r1.f14361a     // Catch:{ all -> 0x0116 }
            java.util.Set r11 = r11.entrySet()     // Catch:{ all -> 0x0116 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0116 }
            r12 = 0
        L_0x0032:
            boolean r13 = r11.hasNext()     // Catch:{ all -> 0x0116 }
            r14 = 2
            if (r13 == 0) goto L_0x0094
            java.lang.Object r13 = r11.next()     // Catch:{ all -> 0x0116 }
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13     // Catch:{ all -> 0x0116 }
            java.lang.Object r13 = r13.getValue()     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.lz r13 = (com.google.android.gms.internal.ads.C3725lz) r13     // Catch:{ all -> 0x0116 }
            java.lang.String r15 = r13.f14435b     // Catch:{ all -> 0x0116 }
            java.io.File r15 = r1.m19067d(r15)     // Catch:{ all -> 0x0116 }
            boolean r15 = r15.delete()     // Catch:{ all -> 0x0116 }
            if (r15 == 0) goto L_0x005e
            r16 = r4
            long r3 = r1.f14362b     // Catch:{ all -> 0x0116 }
            r18 = r11
            long r10 = r13.f14434a     // Catch:{ all -> 0x0116 }
            r5 = 0
            long r3 = r3 - r10
            r1.f14362b = r3     // Catch:{ all -> 0x0116 }
            goto L_0x0077
        L_0x005e:
            r16 = r4
            r18 = r11
            java.lang.String r3 = "Could not delete cache entry for key=%s, filename=%s"
            java.lang.Object[] r4 = new java.lang.Object[r14]     // Catch:{ all -> 0x0116 }
            java.lang.String r5 = r13.f14435b     // Catch:{ all -> 0x0116 }
            r10 = 0
            r4[r10] = r5     // Catch:{ all -> 0x0116 }
            java.lang.String r5 = r13.f14435b     // Catch:{ all -> 0x0116 }
            java.lang.String r5 = m19066c(r5)     // Catch:{ all -> 0x0116 }
            r10 = 1
            r4[r10] = r5     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.C3504dv.m18312b(r3, r4)     // Catch:{ all -> 0x0116 }
        L_0x0077:
            r18.remove()     // Catch:{ all -> 0x0116 }
            int r12 = r12 + 1
            long r3 = r1.f14362b     // Catch:{ all -> 0x0116 }
            r5 = 0
            long r3 = r3 + r6
            float r3 = (float) r3     // Catch:{ all -> 0x0116 }
            int r4 = r1.f14364d     // Catch:{ all -> 0x0116 }
            float r4 = (float) r4     // Catch:{ all -> 0x0116 }
            r5 = 1063675494(0x3f666666, float:0.9)
            float r4 = r4 * r5
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x008e
            goto L_0x0096
        L_0x008e:
            r4 = r16
            r11 = r18
            r10 = 0
            goto L_0x0032
        L_0x0094:
            r16 = r4
        L_0x0096:
            boolean r3 = com.google.android.gms.internal.ads.C3504dv.f13779a     // Catch:{ all -> 0x0116 }
            if (r3 == 0) goto L_0x00c1
            java.lang.String r3 = "pruned %d files, %d bytes, %d ms"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0116 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0116 }
            r6 = 0
            r4[r6] = r5     // Catch:{ all -> 0x0116 }
            long r5 = r1.f14362b     // Catch:{ all -> 0x0116 }
            r7 = 0
            long r5 = r5 - r16
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0116 }
            r6 = 1
            r4[r6] = r5     // Catch:{ all -> 0x0116 }
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0116 }
            r7 = 0
            long r5 = r5 - r8
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0116 }
            r4[r14] = r5     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.C3504dv.m18310a(r3, r4)     // Catch:{ all -> 0x0116 }
        L_0x00c1:
            java.io.File r3 = r19.m19067d(r20)     // Catch:{ all -> 0x0116 }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x00ff }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00ff }
            r5.<init>(r3)     // Catch:{ IOException -> 0x00ff }
            r4.<init>(r5)     // Catch:{ IOException -> 0x00ff }
            com.google.android.gms.internal.ads.lz r5 = new com.google.android.gms.internal.ads.lz     // Catch:{ IOException -> 0x00ff }
            r5.<init>(r0, r2)     // Catch:{ IOException -> 0x00ff }
            boolean r6 = r5.mo13244a(r4)     // Catch:{ IOException -> 0x00ff }
            if (r6 == 0) goto L_0x00e7
            byte[] r2 = r2.f11859a     // Catch:{ IOException -> 0x00ff }
            r4.write(r2)     // Catch:{ IOException -> 0x00ff }
            r4.close()     // Catch:{ IOException -> 0x00ff }
            r1.m19060a(r0, r5)     // Catch:{ IOException -> 0x00ff }
            monitor-exit(r19)
            return
        L_0x00e7:
            r4.close()     // Catch:{ IOException -> 0x00ff }
            java.lang.String r0 = "Failed to write header for %s"
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x00ff }
            java.lang.String r2 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x00ff }
            r5 = 0
            r4[r5] = r2     // Catch:{ IOException -> 0x00ff }
            com.google.android.gms.internal.ads.C3504dv.m18312b(r0, r4)     // Catch:{ IOException -> 0x00ff }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x00ff }
            r0.<init>()     // Catch:{ IOException -> 0x00ff }
            throw r0     // Catch:{ IOException -> 0x00ff }
        L_0x00ff:
            boolean r0 = r3.delete()     // Catch:{ all -> 0x0116 }
            if (r0 != 0) goto L_0x0114
            java.lang.String r0 = "Could not clean up file %s"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0116 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x0116 }
            r4 = 0
            r2[r4] = r3     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.C3504dv.m18312b(r0, r2)     // Catch:{ all -> 0x0116 }
        L_0x0114:
            monitor-exit(r19)
            return
        L_0x0116:
            r0 = move-exception
            monitor-exit(r19)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3697ky.mo13212a(java.lang.String, com.google.android.gms.internal.ads.afd):void");
    }
}
