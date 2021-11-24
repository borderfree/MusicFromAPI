package android.support.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

final class MultiDexExtractor {

    private static class ExtractedDex extends File {
        public long crc = -1;

        public ExtractedDex(File file, String str) {
            super(file, str);
        }
    }

    /* renamed from: a */
    private static long m844a(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    /* renamed from: a */
    private static SharedPreferences m845a(Context context) {
        return context.getSharedPreferences("multidex.version", VERSION.SDK_INT < 11 ? 0 : 4);
    }

    /* renamed from: a */
    private static List<ExtractedDex> m846a(Context context, File file, File file2, String str) {
        String str2 = str;
        Log.i("MultiDex", "loading existing secondary dex files");
        StringBuilder sb = new StringBuilder();
        sb.append(file.getName());
        sb.append(".classes");
        String sb2 = sb.toString();
        SharedPreferences a = m845a(context);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str2);
        sb3.append("dex.number");
        int i = a.getInt(sb3.toString(), 1);
        ArrayList arrayList = new ArrayList(i - 1);
        int i2 = 2;
        while (i2 <= i) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb2);
            sb4.append(i2);
            sb4.append(".zip");
            ExtractedDex extractedDex = new ExtractedDex(file2, sb4.toString());
            if (extractedDex.isFile()) {
                extractedDex.crc = m854b(extractedDex);
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str2);
                sb5.append("dex.crc.");
                sb5.append(i2);
                long j = a.getLong(sb5.toString(), -1);
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str2);
                sb6.append("dex.time.");
                sb6.append(i2);
                long j2 = a.getLong(sb6.toString(), -1);
                long lastModified = extractedDex.lastModified();
                if (j2 == lastModified) {
                    String str3 = sb2;
                    SharedPreferences sharedPreferences = a;
                    if (j == extractedDex.crc) {
                        arrayList.add(extractedDex);
                        i2++;
                        sb2 = str3;
                        a = sharedPreferences;
                    }
                }
                StringBuilder sb7 = new StringBuilder();
                sb7.append("Invalid extracted dex: ");
                sb7.append(extractedDex);
                sb7.append(" (key \"");
                sb7.append(str2);
                sb7.append("\"), expected modification time: ");
                sb7.append(j2);
                sb7.append(", modification time: ");
                sb7.append(lastModified);
                sb7.append(", expected crc: ");
                sb7.append(j);
                sb7.append(", file crc: ");
                sb7.append(extractedDex.crc);
                throw new IOException(sb7.toString());
            }
            StringBuilder sb8 = new StringBuilder();
            sb8.append("Missing extracted secondary dex file '");
            sb8.append(extractedDex.getPath());
            sb8.append("'");
            throw new IOException(sb8.toString());
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0117 A[SYNTHETIC, Splitter:B:41:0x0117] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0137  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.List<? extends java.io.File> m847a(android.content.Context r14, java.io.File r15, java.io.File r16, java.lang.String r17, boolean r18) {
        /*
            r2 = r17
            r0 = r18
            java.lang.String r1 = "MultiDex"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "MultiDexExtractor.load("
            r3.append(r4)
            java.lang.String r4 = r15.getPath()
            r3.append(r4)
            java.lang.String r4 = ", "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = ", "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.i(r1, r3)
            long r5 = m854b(r15)
            java.io.File r8 = new java.io.File
            java.lang.String r1 = "MultiDex.lock"
            r3 = r16
            r8.<init>(r3, r1)
            java.io.RandomAccessFile r9 = new java.io.RandomAccessFile
            java.lang.String r1 = "rw"
            r9.<init>(r8, r1)
            r10 = 0
            java.nio.channels.FileChannel r11 = r9.getChannel()     // Catch:{ all -> 0x0112 }
            java.lang.String r1 = "MultiDex"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x010f }
            r4.<init>()     // Catch:{ all -> 0x010f }
            java.lang.String r7 = "Blocking on lock "
            r4.append(r7)     // Catch:{ all -> 0x010f }
            java.lang.String r7 = r8.getPath()     // Catch:{ all -> 0x010f }
            r4.append(r7)     // Catch:{ all -> 0x010f }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x010f }
            android.util.Log.i(r1, r4)     // Catch:{ all -> 0x010f }
            java.nio.channels.FileLock r12 = r11.lock()     // Catch:{ all -> 0x010f }
            java.lang.String r1 = "MultiDex"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x010d }
            r4.<init>()     // Catch:{ all -> 0x010d }
            java.lang.String r7 = r8.getPath()     // Catch:{ all -> 0x010d }
            r4.append(r7)     // Catch:{ all -> 0x010d }
            java.lang.String r7 = " locked"
            r4.append(r7)     // Catch:{ all -> 0x010d }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x010d }
            android.util.Log.i(r1, r4)     // Catch:{ all -> 0x010d }
            if (r0 != 0) goto L_0x00ad
            r1 = r14
            r4 = r15
            boolean r0 = m853a(r14, r15, r5, r2)     // Catch:{ all -> 0x010d }
            if (r0 != 0) goto L_0x00af
            java.util.List r0 = m846a(r14, r15, r16, r17)     // Catch:{ IOException -> 0x0094 }
        L_0x0092:
            r1 = r0
            goto L_0x00bf
        L_0x0094:
            r0 = move-exception
            r7 = r0
            java.lang.String r0 = "MultiDex"
            java.lang.String r13 = "Failed to reload existing extracted secondary dex files, falling back to fresh extraction"
            android.util.Log.w(r0, r13, r7)     // Catch:{ all -> 0x010d }
            java.util.List r0 = m848a(r15, r16)     // Catch:{ all -> 0x010d }
            long r3 = m844a(r15)     // Catch:{ all -> 0x010d }
        L_0x00a5:
            r1 = r14
            r2 = r17
            r7 = r0
            m849a(r1, r2, r3, r5, r7)     // Catch:{ all -> 0x010d }
            goto L_0x0092
        L_0x00ad:
            r1 = r14
            r4 = r15
        L_0x00af:
            java.lang.String r0 = "MultiDex"
            java.lang.String r7 = "Detected that extraction must be performed."
            android.util.Log.i(r0, r7)     // Catch:{ all -> 0x010d }
            java.util.List r0 = m848a(r15, r16)     // Catch:{ all -> 0x010d }
            long r3 = m844a(r15)     // Catch:{ all -> 0x010d }
            goto L_0x00a5
        L_0x00bf:
            if (r12 == 0) goto L_0x00e1
            r12.release()     // Catch:{ IOException -> 0x00c5 }
            goto L_0x00e1
        L_0x00c5:
            r0 = move-exception
            java.lang.String r2 = "MultiDex"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to release lock on "
            r3.append(r4)
            java.lang.String r4 = r8.getPath()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r2, r3)
            goto L_0x00e2
        L_0x00e1:
            r0 = r10
        L_0x00e2:
            if (r11 == 0) goto L_0x00e7
            m850a(r11)
        L_0x00e7:
            m850a(r9)
            if (r0 != 0) goto L_0x010c
            java.lang.String r0 = "MultiDex"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "load found "
            r2.append(r3)
            int r3 = r1.size()
            r2.append(r3)
            java.lang.String r3 = " secondary dex files"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.i(r0, r2)
            return r1
        L_0x010c:
            throw r0
        L_0x010d:
            r0 = move-exception
            goto L_0x0115
        L_0x010f:
            r0 = move-exception
            r12 = r10
            goto L_0x0115
        L_0x0112:
            r0 = move-exception
            r11 = r10
            r12 = r11
        L_0x0115:
            if (r12 == 0) goto L_0x0135
            r12.release()     // Catch:{ IOException -> 0x011b }
            goto L_0x0135
        L_0x011b:
            java.lang.String r1 = "MultiDex"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to release lock on "
            r2.append(r3)
            java.lang.String r3 = r8.getPath()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r1, r2)
        L_0x0135:
            if (r11 == 0) goto L_0x013a
            m850a(r11)
        L_0x013a:
            m850a(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.multidex.MultiDexExtractor.m847a(android.content.Context, java.io.File, java.io.File, java.lang.String, boolean):java.util.List");
    }

    /* renamed from: a */
    private static List<ExtractedDex> m848a(File file, File file2) {
        ExtractedDex extractedDex;
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append(file.getName());
        sb.append(".classes");
        String sb2 = sb.toString();
        m851a(file2, sb2);
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        int i = 2;
        try {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("classes");
            sb3.append(2);
            sb3.append(".dex");
            String sb4 = sb3.toString();
            while (true) {
                ZipEntry entry = zipFile.getEntry(sb4);
                if (entry != null) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(sb2);
                    sb5.append(i);
                    sb5.append(".zip");
                    extractedDex = new ExtractedDex(file2, sb5.toString());
                    arrayList.add(extractedDex);
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Extraction is needed for file ");
                    sb6.append(extractedDex);
                    Log.i("MultiDex", sb6.toString());
                    int i2 = 0;
                    z = false;
                    while (i2 < 3 && !z) {
                        i2++;
                        m852a(zipFile, entry, (File) extractedDex, sb2);
                        extractedDex.crc = m854b(extractedDex);
                        z = true;
                        String str = "MultiDex";
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("Extraction ");
                        sb7.append(z ? "succeeded" : "failed");
                        sb7.append(" - length ");
                        sb7.append(extractedDex.getAbsolutePath());
                        sb7.append(": ");
                        sb7.append(extractedDex.length());
                        sb7.append(" - crc: ");
                        sb7.append(extractedDex.crc);
                        Log.i(str, sb7.toString());
                        if (!z) {
                            extractedDex.delete();
                            if (extractedDex.exists()) {
                                StringBuilder sb8 = new StringBuilder();
                                sb8.append("Failed to delete corrupted secondary dex '");
                                sb8.append(extractedDex.getPath());
                                sb8.append("'");
                                Log.w("MultiDex", sb8.toString());
                            }
                        }
                    }
                    if (z) {
                        i++;
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append("classes");
                        sb9.append(i);
                        sb9.append(".dex");
                        sb4 = sb9.toString();
                    } else {
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append("Could not create zip file ");
                        sb10.append(extractedDex.getAbsolutePath());
                        sb10.append(" for secondary dex (");
                        sb10.append(i);
                        sb10.append(")");
                        throw new IOException(sb10.toString());
                    }
                } else {
                    try {
                        zipFile.close();
                    } catch (IOException e) {
                        Log.w("MultiDex", "Failed to close resource", e);
                    }
                    return arrayList;
                }
            }
        } catch (IOException e2) {
            String str2 = "MultiDex";
            StringBuilder sb11 = new StringBuilder();
            sb11.append("Failed to read crc from ");
            sb11.append(extractedDex.getAbsolutePath());
            Log.w(str2, sb11.toString(), e2);
            z = false;
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (IOException e3) {
                Log.w("MultiDex", "Failed to close resource", e3);
            }
            throw th;
        }
    }

    /* renamed from: a */
    private static void m849a(Context context, String str, long j, long j2, List<ExtractedDex> list) {
        Editor edit = m845a(context).edit();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("timestamp");
        edit.putLong(sb.toString(), j);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("crc");
        edit.putLong(sb2.toString(), j2);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("dex.number");
        edit.putInt(sb3.toString(), list.size() + 1);
        int i = 2;
        for (ExtractedDex extractedDex : list) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append("dex.crc.");
            sb4.append(i);
            edit.putLong(sb4.toString(), extractedDex.crc);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append("dex.time.");
            sb5.append(i);
            edit.putLong(sb5.toString(), extractedDex.lastModified());
            i++;
        }
        edit.commit();
    }

    /* renamed from: a */
    private static void m850a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }

    /* renamed from: a */
    private static void m851a(File file, final String str) {
        File[] listFiles = file.listFiles(new FileFilter() {
            public boolean accept(File file) {
                String name = file.getName();
                return !name.startsWith(str) && !name.equals("MultiDex.lock");
            }
        });
        if (listFiles == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to list secondary dex dir content (");
            sb.append(file.getPath());
            sb.append(").");
            Log.w("MultiDex", sb.toString());
            return;
        }
        for (File file2 : listFiles) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Trying to delete old file ");
            sb2.append(file2.getPath());
            sb2.append(" of size ");
            sb2.append(file2.length());
            Log.i("MultiDex", sb2.toString());
            if (!file2.delete()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Failed to delete old file ");
                sb3.append(file2.getPath());
                Log.w("MultiDex", sb3.toString());
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Deleted old file ");
                sb4.append(file2.getPath());
                Log.i("MultiDex", sb4.toString());
            }
        }
    }

    /* renamed from: a */
    private static void m852a(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
        ZipOutputStream zipOutputStream;
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        StringBuilder sb = new StringBuilder();
        sb.append("tmp-");
        sb.append(str);
        File createTempFile = File.createTempFile(sb.toString(), ".zip", file.getParentFile());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Extracting ");
        sb2.append(createTempFile.getPath());
        Log.i("MultiDex", sb2.toString());
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Renaming to ");
                sb3.append(file.getPath());
                Log.i("MultiDex", sb3.toString());
                if (createTempFile.renameTo(file)) {
                    m850a((Closeable) inputStream);
                    createTempFile.delete();
                    return;
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Failed to rename \"");
                sb4.append(createTempFile.getAbsolutePath());
                sb4.append("\" to \"");
                sb4.append(file.getAbsolutePath());
                sb4.append("\"");
                throw new IOException(sb4.toString());
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Failed to mark readonly \"");
            sb5.append(createTempFile.getAbsolutePath());
            sb5.append("\" (tmp of \"");
            sb5.append(file.getAbsolutePath());
            sb5.append("\")");
            throw new IOException(sb5.toString());
        } catch (Throwable th) {
            m850a((Closeable) inputStream);
            createTempFile.delete();
            throw th;
        }
    }

    /* renamed from: a */
    private static boolean m853a(Context context, File file, long j, String str) {
        SharedPreferences a = m845a(context);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("timestamp");
        if (a.getLong(sb.toString(), -1) == m844a(file)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("crc");
            if (a.getLong(sb2.toString(), -1) == j) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static long m854b(File file) {
        long a = C0223c.m877a(file);
        return a == -1 ? a - 1 : a;
    }
}
