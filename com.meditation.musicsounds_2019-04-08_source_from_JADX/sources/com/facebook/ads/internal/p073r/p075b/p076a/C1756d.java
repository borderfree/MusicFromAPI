package com.facebook.ads.internal.p073r.p075b.p076a;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.facebook.ads.internal.r.b.a.d */
class C1756d {

    /* renamed from: com.facebook.ads.internal.r.b.a.d$a */
    private static final class C1758a implements Comparator<File> {
        private C1758a() {
        }

        /* renamed from: a */
        private int m8779a(long j, long j2) {
            if (j < j2) {
                return -1;
            }
            return j == j2 ? 0 : 1;
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            return m8779a(file.lastModified(), file2.lastModified());
        }
    }

    /* renamed from: a */
    static void m8774a(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                StringBuilder sb = new StringBuilder();
                sb.append("File ");
                sb.append(file);
                sb.append(" is not directory!");
                throw new IOException(sb.toString());
            }
        } else if (!file.mkdirs()) {
            throw new IOException(String.format(Locale.US, "Directory %s can't be created", new Object[]{file.getAbsolutePath()}));
        }
    }

    /* renamed from: b */
    static List<File> m8775b(File file) {
        LinkedList linkedList = new LinkedList();
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return linkedList;
        }
        List<File> asList = Arrays.asList(listFiles);
        Collections.sort(asList, new C1758a());
        return asList;
    }

    /* renamed from: c */
    static void m8776c(File file) {
        if (file.exists()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!file.setLastModified(currentTimeMillis)) {
                m8777d(file);
                if (file.lastModified() < currentTimeMillis) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error set last modified date to ");
                    sb.append(file);
                    throw new IOException(sb.toString());
                }
            }
        }
    }

    /* renamed from: d */
    static void m8777d(File file) {
        long length = file.length();
        if (length == 0) {
            m8778e(file);
            return;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
        long j = length - 1;
        randomAccessFile.seek(j);
        byte readByte = randomAccessFile.readByte();
        randomAccessFile.seek(j);
        randomAccessFile.write(readByte);
        randomAccessFile.close();
    }

    /* renamed from: e */
    private static void m8778e(File file) {
        if (!file.delete() || !file.createNewFile()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error recreate zero-size file ");
            sb.append(file);
            throw new IOException(sb.toString());
        }
    }
}
