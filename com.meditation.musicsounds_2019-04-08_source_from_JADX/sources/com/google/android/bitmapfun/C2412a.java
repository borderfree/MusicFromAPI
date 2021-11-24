package com.google.android.bitmapfun;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.bitmapfun.a */
public final class C2412a implements Closeable {

    /* renamed from: a */
    private static final Charset f7663a = Charset.forName("UTF-8");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final File f7664b;

    /* renamed from: c */
    private final File f7665c;

    /* renamed from: d */
    private final File f7666d;

    /* renamed from: e */
    private final int f7667e;

    /* renamed from: f */
    private final long f7668f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final int f7669g;

    /* renamed from: h */
    private long f7670h = 0;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Writer f7671i;

    /* renamed from: j */
    private final LinkedHashMap<String, C2416b> f7672j = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f7673k;

    /* renamed from: l */
    private long f7674l = 0;

    /* renamed from: m */
    private final ExecutorService f7675m;

    /* renamed from: n */
    private final Callable<Void> f7676n;

    /* renamed from: com.google.android.bitmapfun.a$a */
    public final class C2414a {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C2416b f7679b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f7680c;

        /* renamed from: com.google.android.bitmapfun.a$a$a */
        private class C2415a extends FilterOutputStream {
            private C2415a(OutputStream outputStream) {
                super(outputStream);
            }

            public void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    C2414a.this.f7680c = true;
                }
            }

            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    C2414a.this.f7680c = true;
                }
            }

            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    C2414a.this.f7680c = true;
                }
            }

            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C2414a.this.f7680c = true;
                }
            }
        }

        private C2414a(C2416b bVar) {
            this.f7679b = bVar;
        }

        /* renamed from: a */
        public OutputStream mo8544a(int i) {
            C2415a aVar;
            synchronized (C2412a.this) {
                if (this.f7679b.f7686e == this) {
                    aVar = new C2415a(new FileOutputStream(this.f7679b.mo8553b(i)));
                } else {
                    throw new IllegalStateException();
                }
            }
            return aVar;
        }

        /* renamed from: a */
        public void mo8545a() {
            if (this.f7680c) {
                C2412a.this.m11177a(this, false);
                C2412a.this.mo8540c(this.f7679b.f7683b);
                return;
            }
            C2412a.this.m11177a(this, true);
        }

        /* renamed from: b */
        public void mo8546b() {
            C2412a.this.m11177a(this, false);
        }
    }

    /* renamed from: com.google.android.bitmapfun.a$b */
    private final class C2416b {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f7683b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final long[] f7684c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f7685d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C2414a f7686e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public long f7687f;

        private C2416b(String str) {
            this.f7683b = str;
            this.f7684c = new long[C2412a.this.f7669g];
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m11212a(String[] strArr) {
            if (strArr.length == C2412a.this.f7669g) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f7684c[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw m11214b(strArr);
                    }
                }
                return;
            }
            throw m11214b(strArr);
        }

        /* renamed from: b */
        private IOException m11214b(String[] strArr) {
            StringBuilder sb = new StringBuilder();
            sb.append("unexpected journal line: ");
            sb.append(Arrays.toString(strArr));
            throw new IOException(sb.toString());
        }

        /* renamed from: a */
        public File mo8551a(int i) {
            File f = C2412a.this.f7664b;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f7683b);
            sb.append(".");
            sb.append(i);
            return new File(f, sb.toString());
        }

        /* renamed from: a */
        public String mo8552a() {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.f7684c) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* renamed from: b */
        public File mo8553b(int i) {
            File f = C2412a.this.f7664b;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f7683b);
            sb.append(".");
            sb.append(i);
            sb.append(".tmp");
            return new File(f, sb.toString());
        }
    }

    /* renamed from: com.google.android.bitmapfun.a$c */
    public final class C2417c implements Closeable {

        /* renamed from: b */
        private final String f7689b;

        /* renamed from: c */
        private final long f7690c;

        /* renamed from: d */
        private final InputStream[] f7691d;

        private C2417c(String str, long j, InputStream[] inputStreamArr) {
            this.f7689b = str;
            this.f7690c = j;
            this.f7691d = inputStreamArr;
        }

        /* renamed from: a */
        public InputStream mo8554a(int i) {
            return this.f7691d[i];
        }

        public void close() {
            for (InputStream a : this.f7691d) {
                C2412a.m11179a((Closeable) a);
            }
        }
    }

    private C2412a(File file, int i, int i2, long j) {
        File file2 = file;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.f7675m = threadPoolExecutor;
        this.f7676n = new Callable<Void>() {
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
                return null;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Void call() {
                /*
                    r4 = this;
                    com.google.android.bitmapfun.a r0 = com.google.android.bitmapfun.C2412a.this
                    monitor-enter(r0)
                    com.google.android.bitmapfun.a r1 = com.google.android.bitmapfun.C2412a.this     // Catch:{ all -> 0x0028 }
                    java.io.Writer r1 = r1.f7671i     // Catch:{ all -> 0x0028 }
                    r2 = 0
                    if (r1 != 0) goto L_0x000e
                    monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                    return r2
                L_0x000e:
                    com.google.android.bitmapfun.a r1 = com.google.android.bitmapfun.C2412a.this     // Catch:{ all -> 0x0028 }
                    r1.m11195i()     // Catch:{ all -> 0x0028 }
                    com.google.android.bitmapfun.a r1 = com.google.android.bitmapfun.C2412a.this     // Catch:{ all -> 0x0028 }
                    boolean r1 = r1.m11193g()     // Catch:{ all -> 0x0028 }
                    if (r1 == 0) goto L_0x0026
                    com.google.android.bitmapfun.a r1 = com.google.android.bitmapfun.C2412a.this     // Catch:{ all -> 0x0028 }
                    r1.m11192f()     // Catch:{ all -> 0x0028 }
                    com.google.android.bitmapfun.a r1 = com.google.android.bitmapfun.C2412a.this     // Catch:{ all -> 0x0028 }
                    r3 = 0
                    r1.f7673k = r3     // Catch:{ all -> 0x0028 }
                L_0x0026:
                    monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                    return r2
                L_0x0028:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.bitmapfun.C2412a.C24131.call():java.lang.Void");
            }
        };
        this.f7664b = file2;
        this.f7667e = i;
        this.f7665c = new File(file2, "journal");
        this.f7666d = new File(file2, "journal.tmp");
        this.f7669g = i2;
        this.f7668f = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.google.android.bitmapfun.C2412a.C2414a m11173a(java.lang.String r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.m11194h()     // Catch:{ all -> 0x0061 }
            r5.m11190e(r6)     // Catch:{ all -> 0x0061 }
            java.util.LinkedHashMap<java.lang.String, com.google.android.bitmapfun.a$b> r0 = r5.f7672j     // Catch:{ all -> 0x0061 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0061 }
            com.google.android.bitmapfun.a$b r0 = (com.google.android.bitmapfun.C2412a.C2416b) r0     // Catch:{ all -> 0x0061 }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0022
            if (r0 == 0) goto L_0x0020
            long r1 = r0.f7687f     // Catch:{ all -> 0x0061 }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0022
        L_0x0020:
            monitor-exit(r5)
            return r3
        L_0x0022:
            if (r0 != 0) goto L_0x002f
            com.google.android.bitmapfun.a$b r0 = new com.google.android.bitmapfun.a$b     // Catch:{ all -> 0x0061 }
            r0.<init>(r6)     // Catch:{ all -> 0x0061 }
            java.util.LinkedHashMap<java.lang.String, com.google.android.bitmapfun.a$b> r7 = r5.f7672j     // Catch:{ all -> 0x0061 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0061 }
            goto L_0x0037
        L_0x002f:
            com.google.android.bitmapfun.a$a r7 = r0.f7686e     // Catch:{ all -> 0x0061 }
            if (r7 == 0) goto L_0x0037
            monitor-exit(r5)
            return r3
        L_0x0037:
            com.google.android.bitmapfun.a$a r7 = new com.google.android.bitmapfun.a$a     // Catch:{ all -> 0x0061 }
            r7.<init>(r0)     // Catch:{ all -> 0x0061 }
            r0.f7686e = r7     // Catch:{ all -> 0x0061 }
            java.io.Writer r8 = r5.f7671i     // Catch:{ all -> 0x0061 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r0.<init>()     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = "DIRTY "
            r0.append(r1)     // Catch:{ all -> 0x0061 }
            r0.append(r6)     // Catch:{ all -> 0x0061 }
            r6 = 10
            r0.append(r6)     // Catch:{ all -> 0x0061 }
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x0061 }
            r8.write(r6)     // Catch:{ all -> 0x0061 }
            java.io.Writer r6 = r5.f7671i     // Catch:{ all -> 0x0061 }
            r6.flush()     // Catch:{ all -> 0x0061 }
            monitor-exit(r5)
            return r7
        L_0x0061:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.bitmapfun.C2412a.m11173a(java.lang.String, long):com.google.android.bitmapfun.a$a");
    }

    /* renamed from: a */
    public static C2412a m11174a(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            C2412a aVar = new C2412a(file, i, i2, j);
            if (aVar.f7665c.exists()) {
                try {
                    aVar.m11185d();
                    aVar.m11189e();
                    aVar.f7671i = new BufferedWriter(new FileWriter(aVar.f7665c, true), 8192);
                    return aVar;
                } catch (IOException unused) {
                    aVar.mo8539c();
                }
            }
            file.mkdirs();
            C2412a aVar2 = new C2412a(file, i, i2, j);
            aVar2.m11192f();
            return aVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: a */
    public static String m11176a(InputStream inputStream) {
        StringBuilder sb = new StringBuilder(80);
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                throw new EOFException();
            } else if (read == 10) {
                int length = sb.length();
                if (length > 0) {
                    int i = length - 1;
                    if (sb.charAt(i) == 13) {
                        sb.setLength(i);
                    }
                }
                return sb.toString();
            } else {
                sb.append((char) read);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m11177a(C2414a aVar, boolean z) {
        C2416b a = aVar.f7679b;
        if (a.f7686e == aVar) {
            if (z && !a.f7685d) {
                int i = 0;
                while (i < this.f7669g) {
                    if (a.mo8553b(i).exists()) {
                        i++;
                    } else {
                        aVar.mo8546b();
                        StringBuilder sb = new StringBuilder();
                        sb.append("edit didn't create file ");
                        sb.append(i);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            for (int i2 = 0; i2 < this.f7669g; i2++) {
                File b = a.mo8553b(i2);
                if (!z) {
                    m11183b(b);
                } else if (b.exists()) {
                    File a2 = a.mo8551a(i2);
                    b.renameTo(a2);
                    long j = a.f7684c[i2];
                    long length = a2.length();
                    a.f7684c[i2] = length;
                    this.f7670h = (this.f7670h - j) + length;
                }
            }
            this.f7673k++;
            a.f7686e = null;
            if (a.f7685d || z) {
                a.f7685d = true;
                Writer writer = this.f7671i;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("CLEAN ");
                sb2.append(a.f7683b);
                sb2.append(a.mo8552a());
                sb2.append(10);
                writer.write(sb2.toString());
                if (z) {
                    long j2 = this.f7674l;
                    this.f7674l = 1 + j2;
                    a.f7687f = j2;
                }
            } else {
                this.f7672j.remove(a.f7683b);
                Writer writer2 = this.f7671i;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("REMOVE ");
                sb3.append(a.f7683b);
                sb3.append(10);
                writer2.write(sb3.toString());
            }
            if (this.f7670h > this.f7668f || m11193g()) {
                this.f7675m.submit(this.f7676n);
            }
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public static void m11179a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m11180a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    m11180a(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("failed to delete file: ");
                    sb.append(file2);
                    throw new IOException(sb.toString());
                }
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("not a directory: ");
        sb2.append(file);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: a */
    private static <T> T[] m11181a(T[] tArr, int i, int i2) {
        int length = tArr.length;
        if (i > i2) {
            throw new IllegalArgumentException();
        } else if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            int i3 = i2 - i;
            int min = Math.min(i3, length - i);
            T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i3);
            System.arraycopy(tArr, i, tArr2, 0, min);
            return tArr2;
        }
    }

    /* renamed from: b */
    private static void m11183b(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: d */
    private void m11185d() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.f7665c), 8192);
        try {
            String a = m11176a((InputStream) bufferedInputStream);
            String a2 = m11176a((InputStream) bufferedInputStream);
            String a3 = m11176a((InputStream) bufferedInputStream);
            String a4 = m11176a((InputStream) bufferedInputStream);
            String a5 = m11176a((InputStream) bufferedInputStream);
            if (!"libcore.io.DiskLruCache".equals(a) || !"1".equals(a2) || !Integer.toString(this.f7667e).equals(a3) || !Integer.toString(this.f7669g).equals(a4) || !"".equals(a5)) {
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected journal header: [");
                sb.append(a);
                sb.append(", ");
                sb.append(a2);
                sb.append(", ");
                sb.append(a4);
                sb.append(", ");
                sb.append(a5);
                sb.append("]");
                throw new IOException(sb.toString());
            }
            while (true) {
                try {
                    m11187d(m11176a((InputStream) bufferedInputStream));
                } catch (EOFException unused) {
                    m11179a((Closeable) bufferedInputStream);
                    return;
                }
            }
        } catch (Throwable th) {
            m11179a((Closeable) bufferedInputStream);
            throw th;
        }
    }

    /* renamed from: d */
    private void m11187d(String str) {
        String[] split = str.split(" ");
        if (split.length >= 2) {
            String str2 = split[1];
            if (!split[0].equals("REMOVE") || split.length != 2) {
                C2416b bVar = (C2416b) this.f7672j.get(str2);
                if (bVar == null) {
                    bVar = new C2416b(str2);
                    this.f7672j.put(str2, bVar);
                }
                if (split[0].equals("CLEAN") && split.length == this.f7669g + 2) {
                    bVar.f7685d = true;
                    bVar.f7686e = null;
                    bVar.m11212a((String[]) m11181a((T[]) split, 2, split.length));
                } else if (split[0].equals("DIRTY") && split.length == 2) {
                    bVar.f7686e = new C2414a(bVar);
                } else if (!split[0].equals("READ") || split.length != 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unexpected journal line: ");
                    sb.append(str);
                    throw new IOException(sb.toString());
                }
                return;
            }
            this.f7672j.remove(str2);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("unexpected journal line: ");
        sb2.append(str);
        throw new IOException(sb2.toString());
    }

    /* renamed from: e */
    private void m11189e() {
        m11183b(this.f7666d);
        Iterator it = this.f7672j.values().iterator();
        while (it.hasNext()) {
            C2416b bVar = (C2416b) it.next();
            int i = 0;
            if (bVar.f7686e == null) {
                while (i < this.f7669g) {
                    this.f7670h += bVar.f7684c[i];
                    i++;
                }
            } else {
                bVar.f7686e = null;
                while (i < this.f7669g) {
                    m11183b(bVar.mo8551a(i));
                    m11183b(bVar.mo8553b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: e */
    private void m11190e(String str) {
        if (str.contains(" ") || str.contains("\n") || str.contains("\r")) {
            StringBuilder sb = new StringBuilder();
            sb.append("keys must not contain spaces or newlines: \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public synchronized void m11192f() {
        String sb;
        if (this.f7671i != null) {
            this.f7671i.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.f7666d), 8192);
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f7667e));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f7669g));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (C2416b bVar : this.f7672j.values()) {
            if (bVar.f7686e != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("DIRTY ");
                sb2.append(bVar.f7683b);
                sb2.append(10);
                sb = sb2.toString();
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("CLEAN ");
                sb3.append(bVar.f7683b);
                sb3.append(bVar.mo8552a());
                sb3.append(10);
                sb = sb3.toString();
            }
            bufferedWriter.write(sb);
        }
        bufferedWriter.close();
        this.f7666d.renameTo(this.f7665c);
        this.f7671i = new BufferedWriter(new FileWriter(this.f7665c, true), 8192);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m11193g() {
        return this.f7673k >= 2000 && this.f7673k >= this.f7672j.size();
    }

    /* renamed from: h */
    private void m11194h() {
        if (this.f7671i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m11195i() {
        while (this.f7670h > this.f7668f) {
            mo8540c((String) ((Entry) this.f7672j.entrySet().iterator().next()).getKey());
        }
    }

    /* renamed from: a */
    public synchronized C2417c mo8535a(String str) {
        m11194h();
        m11190e(str);
        C2416b bVar = (C2416b) this.f7672j.get(str);
        if (bVar == null) {
            return null;
        }
        if (!bVar.f7685d) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.f7669g];
        int i = 0;
        while (i < this.f7669g) {
            try {
                inputStreamArr[i] = new FileInputStream(bVar.mo8551a(i));
                i++;
            } catch (FileNotFoundException unused) {
                return null;
            }
        }
        this.f7673k++;
        Writer writer = this.f7671i;
        StringBuilder sb = new StringBuilder();
        sb.append("READ ");
        sb.append(str);
        sb.append(10);
        writer.append(sb.toString());
        if (m11193g()) {
            this.f7675m.submit(this.f7676n);
        }
        C2417c cVar = new C2417c(str, bVar.f7687f, inputStreamArr);
        return cVar;
    }

    /* renamed from: a */
    public boolean mo8536a() {
        return this.f7671i == null;
    }

    /* renamed from: b */
    public C2414a mo8537b(String str) {
        return m11173a(str, -1);
    }

    /* renamed from: b */
    public synchronized void mo8538b() {
        m11194h();
        m11195i();
        this.f7671i.flush();
    }

    /* renamed from: c */
    public void mo8539c() {
        close();
        m11180a(this.f7664b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0089, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008b, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo8540c(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.m11194h()     // Catch:{ all -> 0x008c }
            r7.m11190e(r8)     // Catch:{ all -> 0x008c }
            java.util.LinkedHashMap<java.lang.String, com.google.android.bitmapfun.a$b> r0 = r7.f7672j     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008c }
            com.google.android.bitmapfun.a$b r0 = (com.google.android.bitmapfun.C2412a.C2416b) r0     // Catch:{ all -> 0x008c }
            r1 = 0
            if (r0 == 0) goto L_0x008a
            com.google.android.bitmapfun.a$a r2 = r0.f7686e     // Catch:{ all -> 0x008c }
            if (r2 == 0) goto L_0x0019
            goto L_0x008a
        L_0x0019:
            int r2 = r7.f7669g     // Catch:{ all -> 0x008c }
            if (r1 >= r2) goto L_0x0055
            java.io.File r2 = r0.mo8551a(r1)     // Catch:{ all -> 0x008c }
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008c }
            if (r3 == 0) goto L_0x003e
            long r2 = r7.f7670h     // Catch:{ all -> 0x008c }
            long[] r4 = r0.f7684c     // Catch:{ all -> 0x008c }
            r5 = r4[r1]     // Catch:{ all -> 0x008c }
            r4 = 0
            long r2 = r2 - r5
            r7.f7670h = r2     // Catch:{ all -> 0x008c }
            long[] r2 = r0.f7684c     // Catch:{ all -> 0x008c }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x008c }
            int r1 = r1 + 1
            goto L_0x0019
        L_0x003e:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008c }
            r0.<init>()     // Catch:{ all -> 0x008c }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x008c }
            r0.append(r2)     // Catch:{ all -> 0x008c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008c }
            r8.<init>(r0)     // Catch:{ all -> 0x008c }
            throw r8     // Catch:{ all -> 0x008c }
        L_0x0055:
            int r0 = r7.f7673k     // Catch:{ all -> 0x008c }
            r1 = 1
            int r0 = r0 + r1
            r7.f7673k = r0     // Catch:{ all -> 0x008c }
            java.io.Writer r0 = r7.f7671i     // Catch:{ all -> 0x008c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008c }
            r2.<init>()     // Catch:{ all -> 0x008c }
            java.lang.String r3 = "REMOVE "
            r2.append(r3)     // Catch:{ all -> 0x008c }
            r2.append(r8)     // Catch:{ all -> 0x008c }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x008c }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x008c }
            r0.append(r2)     // Catch:{ all -> 0x008c }
            java.util.LinkedHashMap<java.lang.String, com.google.android.bitmapfun.a$b> r0 = r7.f7672j     // Catch:{ all -> 0x008c }
            r0.remove(r8)     // Catch:{ all -> 0x008c }
            boolean r8 = r7.m11193g()     // Catch:{ all -> 0x008c }
            if (r8 == 0) goto L_0x0088
            java.util.concurrent.ExecutorService r8 = r7.f7675m     // Catch:{ all -> 0x008c }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f7676n     // Catch:{ all -> 0x008c }
            r8.submit(r0)     // Catch:{ all -> 0x008c }
        L_0x0088:
            monitor-exit(r7)
            return r1
        L_0x008a:
            monitor-exit(r7)
            return r1
        L_0x008c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.bitmapfun.C2412a.mo8540c(java.lang.String):boolean");
    }

    public synchronized void close() {
        if (this.f7671i != null) {
            Iterator it = new ArrayList(this.f7672j.values()).iterator();
            while (it.hasNext()) {
                C2416b bVar = (C2416b) it.next();
                if (bVar.f7686e != null) {
                    bVar.f7686e.mo8546b();
                }
            }
            m11195i();
            this.f7671i.close();
            this.f7671i = null;
        }
    }
}
