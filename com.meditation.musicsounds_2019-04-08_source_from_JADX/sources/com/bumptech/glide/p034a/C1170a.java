package com.bumptech.glide.p034a;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bumptech.glide.a.a */
public final class C1170a implements Closeable {

    /* renamed from: a */
    final ThreadPoolExecutor f4230a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final File f4231b;

    /* renamed from: c */
    private final File f4232c;

    /* renamed from: d */
    private final File f4233d;

    /* renamed from: e */
    private final File f4234e;

    /* renamed from: f */
    private final int f4235f;

    /* renamed from: g */
    private long f4236g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final int f4237h;

    /* renamed from: i */
    private long f4238i = 0;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Writer f4239j;

    /* renamed from: k */
    private final LinkedHashMap<String, C1174c> f4240k = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f4241l;

    /* renamed from: m */
    private long f4242m = 0;

    /* renamed from: n */
    private final Callable<Void> f4243n;

    /* renamed from: com.bumptech.glide.a.a$a */
    private static final class C1172a implements ThreadFactory {
        private C1172a() {
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* renamed from: com.bumptech.glide.a.a$b */
    public final class C1173b {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C1174c f4246b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final boolean[] f4247c;

        /* renamed from: d */
        private boolean f4248d;

        private C1173b(C1174c cVar) {
            this.f4246b = cVar;
            this.f4247c = cVar.f4254f ? null : new boolean[C1170a.this.f4237h];
        }

        /* renamed from: a */
        public File mo5698a(int i) {
            File b;
            synchronized (C1170a.this) {
                if (this.f4246b.f4255g == this) {
                    if (!this.f4246b.f4254f) {
                        this.f4247c[i] = true;
                    }
                    b = this.f4246b.mo5704b(i);
                    if (!C1170a.this.f4231b.exists()) {
                        C1170a.this.f4231b.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return b;
        }

        /* renamed from: a */
        public void mo5699a() {
            C1170a.this.m6344a(this, true);
            this.f4248d = true;
        }

        /* renamed from: b */
        public void mo5700b() {
            C1170a.this.m6344a(this, false);
        }

        /* renamed from: c */
        public void mo5701c() {
            if (!this.f4248d) {
                try {
                    mo5700b();
                } catch (IOException unused) {
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.a.a$c */
    private final class C1174c {

        /* renamed from: a */
        File[] f4249a;

        /* renamed from: b */
        File[] f4250b;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final String f4252d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final long[] f4253e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f4254f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C1173b f4255g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public long f4256h;

        private C1174c(String str) {
            this.f4252d = str;
            this.f4253e = new long[C1170a.this.f4237h];
            this.f4249a = new File[C1170a.this.f4237h];
            this.f4250b = new File[C1170a.this.f4237h];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < C1170a.this.f4237h; i++) {
                sb.append(i);
                this.f4249a[i] = new File(C1170a.this.f4231b, sb.toString());
                sb.append(".tmp");
                this.f4250b[i] = new File(C1170a.this.f4231b, sb.toString());
                sb.setLength(length);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m6375a(String[] strArr) {
            if (strArr.length == C1170a.this.f4237h) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f4253e[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw m6377b(strArr);
                    }
                }
                return;
            }
            throw m6377b(strArr);
        }

        /* renamed from: b */
        private IOException m6377b(String[] strArr) {
            StringBuilder sb = new StringBuilder();
            sb.append("unexpected journal line: ");
            sb.append(Arrays.toString(strArr));
            throw new IOException(sb.toString());
        }

        /* renamed from: a */
        public File mo5702a(int i) {
            return this.f4249a[i];
        }

        /* renamed from: a */
        public String mo5703a() {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.f4253e) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* renamed from: b */
        public File mo5704b(int i) {
            return this.f4250b[i];
        }
    }

    /* renamed from: com.bumptech.glide.a.a$d */
    public final class C1175d {

        /* renamed from: b */
        private final String f4258b;

        /* renamed from: c */
        private final long f4259c;

        /* renamed from: d */
        private final long[] f4260d;

        /* renamed from: e */
        private final File[] f4261e;

        private C1175d(String str, long j, File[] fileArr, long[] jArr) {
            this.f4258b = str;
            this.f4259c = j;
            this.f4261e = fileArr;
            this.f4260d = jArr;
        }

        /* renamed from: a */
        public File mo5705a(int i) {
            return this.f4261e[i];
        }
    }

    private C1170a(File file, int i, int i2, long j) {
        File file2 = file;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C1172a());
        this.f4230a = threadPoolExecutor;
        this.f4243n = new Callable<Void>() {
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
                return null;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Void call() {
                /*
                    r4 = this;
                    com.bumptech.glide.a.a r0 = com.bumptech.glide.p034a.C1170a.this
                    monitor-enter(r0)
                    com.bumptech.glide.a.a r1 = com.bumptech.glide.p034a.C1170a.this     // Catch:{ all -> 0x0028 }
                    java.io.Writer r1 = r1.f4239j     // Catch:{ all -> 0x0028 }
                    r2 = 0
                    if (r1 != 0) goto L_0x000e
                    monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                    return r2
                L_0x000e:
                    com.bumptech.glide.a.a r1 = com.bumptech.glide.p034a.C1170a.this     // Catch:{ all -> 0x0028 }
                    r1.m6359g()     // Catch:{ all -> 0x0028 }
                    com.bumptech.glide.a.a r1 = com.bumptech.glide.p034a.C1170a.this     // Catch:{ all -> 0x0028 }
                    boolean r1 = r1.m6356e()     // Catch:{ all -> 0x0028 }
                    if (r1 == 0) goto L_0x0026
                    com.bumptech.glide.a.a r1 = com.bumptech.glide.p034a.C1170a.this     // Catch:{ all -> 0x0028 }
                    r1.m6352d()     // Catch:{ all -> 0x0028 }
                    com.bumptech.glide.a.a r1 = com.bumptech.glide.p034a.C1170a.this     // Catch:{ all -> 0x0028 }
                    r3 = 0
                    r1.f4241l = r3     // Catch:{ all -> 0x0028 }
                L_0x0026:
                    monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                    return r2
                L_0x0028:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p034a.C1170a.C11711.call():java.lang.Void");
            }
        };
        this.f4231b = file2;
        this.f4235f = i;
        this.f4232c = new File(file2, "journal");
        this.f4233d = new File(file2, "journal.tmp");
        this.f4234e = new File(file2, "journal.bkp");
        this.f4237h = i2;
        this.f4236g = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.bumptech.glide.p034a.C1170a.C1173b m6341a(java.lang.String r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.m6358f()     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.a.a$c> r0 = r5.f4240k     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x005d }
            com.bumptech.glide.a.a$c r0 = (com.bumptech.glide.p034a.C1170a.C1174c) r0     // Catch:{ all -> 0x005d }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
            if (r0 == 0) goto L_0x001d
            long r1 = r0.f4256h     // Catch:{ all -> 0x005d }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
        L_0x001d:
            monitor-exit(r5)
            return r3
        L_0x001f:
            if (r0 != 0) goto L_0x002c
            com.bumptech.glide.a.a$c r0 = new com.bumptech.glide.a.a$c     // Catch:{ all -> 0x005d }
            r0.<init>(r6)     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.a.a$c> r7 = r5.f4240k     // Catch:{ all -> 0x005d }
            r7.put(r6, r0)     // Catch:{ all -> 0x005d }
            goto L_0x0034
        L_0x002c:
            com.bumptech.glide.a.a$b r7 = r0.f4255g     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x0034
            monitor-exit(r5)
            return r3
        L_0x0034:
            com.bumptech.glide.a.a$b r7 = new com.bumptech.glide.a.a$b     // Catch:{ all -> 0x005d }
            r7.<init>(r0)     // Catch:{ all -> 0x005d }
            r0.f4255g = r7     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f4239j     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "DIRTY"
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f4239j     // Catch:{ all -> 0x005d }
            r0 = 32
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f4239j     // Catch:{ all -> 0x005d }
            r8.append(r6)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f4239j     // Catch:{ all -> 0x005d }
            r8 = 10
            r6.append(r8)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f4239j     // Catch:{ all -> 0x005d }
            r6.flush()     // Catch:{ all -> 0x005d }
            monitor-exit(r5)
            return r7
        L_0x005d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p034a.C1170a.m6341a(java.lang.String, long):com.bumptech.glide.a.a$b");
    }

    /* renamed from: a */
    public static C1170a m6342a(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m6347a(file2, file3, false);
                }
            }
            C1170a aVar = new C1170a(file, i, i2, j);
            if (aVar.f4232c.exists()) {
                try {
                    aVar.m6348b();
                    aVar.m6350c();
                    return aVar;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    StringBuilder sb = new StringBuilder();
                    sb.append("DiskLruCache ");
                    sb.append(file);
                    sb.append(" is corrupt: ");
                    sb.append(e.getMessage());
                    sb.append(", removing");
                    printStream.println(sb.toString());
                    aVar.mo5691a();
                }
            }
            file.mkdirs();
            C1170a aVar2 = new C1170a(file, i, i2, j);
            aVar2.m6352d();
            return aVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0108, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m6344a(com.bumptech.glide.p034a.C1170a.C1173b r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.bumptech.glide.a.a$c r0 = r10.f4246b     // Catch:{ all -> 0x010f }
            com.bumptech.glide.a.a$b r1 = r0.f4255g     // Catch:{ all -> 0x010f }
            if (r1 != r10) goto L_0x0109
            r1 = 0
            if (r11 == 0) goto L_0x004d
            boolean r2 = r0.f4254f     // Catch:{ all -> 0x010f }
            if (r2 != 0) goto L_0x004d
            r2 = 0
        L_0x0015:
            int r3 = r9.f4237h     // Catch:{ all -> 0x010f }
            if (r2 >= r3) goto L_0x004d
            boolean[] r3 = r10.f4247c     // Catch:{ all -> 0x010f }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x010f }
            if (r3 == 0) goto L_0x0033
            java.io.File r3 = r0.mo5704b(r2)     // Catch:{ all -> 0x010f }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x010f }
            if (r3 != 0) goto L_0x0030
            r10.mo5700b()     // Catch:{ all -> 0x010f }
            monitor-exit(r9)
            return
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0033:
            r10.mo5700b()     // Catch:{ all -> 0x010f }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010f }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x010f }
            r11.<init>()     // Catch:{ all -> 0x010f }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x010f }
            r11.append(r2)     // Catch:{ all -> 0x010f }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x010f }
            r10.<init>(r11)     // Catch:{ all -> 0x010f }
            throw r10     // Catch:{ all -> 0x010f }
        L_0x004d:
            int r10 = r9.f4237h     // Catch:{ all -> 0x010f }
            if (r1 >= r10) goto L_0x0082
            java.io.File r10 = r0.mo5704b(r1)     // Catch:{ all -> 0x010f }
            if (r11 == 0) goto L_0x007c
            boolean r2 = r10.exists()     // Catch:{ all -> 0x010f }
            if (r2 == 0) goto L_0x007f
            java.io.File r2 = r0.mo5702a(r1)     // Catch:{ all -> 0x010f }
            r10.renameTo(r2)     // Catch:{ all -> 0x010f }
            long[] r10 = r0.f4253e     // Catch:{ all -> 0x010f }
            r3 = r10[r1]     // Catch:{ all -> 0x010f }
            long r5 = r2.length()     // Catch:{ all -> 0x010f }
            long[] r10 = r0.f4253e     // Catch:{ all -> 0x010f }
            r10[r1] = r5     // Catch:{ all -> 0x010f }
            long r7 = r9.f4238i     // Catch:{ all -> 0x010f }
            r10 = 0
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f4238i = r7     // Catch:{ all -> 0x010f }
            goto L_0x007f
        L_0x007c:
            m6346a(r10)     // Catch:{ all -> 0x010f }
        L_0x007f:
            int r1 = r1 + 1
            goto L_0x004d
        L_0x0082:
            int r10 = r9.f4241l     // Catch:{ all -> 0x010f }
            r1 = 1
            int r10 = r10 + r1
            r9.f4241l = r10     // Catch:{ all -> 0x010f }
            r10 = 0
            r0.f4255g = r10     // Catch:{ all -> 0x010f }
            boolean r10 = r0.f4254f     // Catch:{ all -> 0x010f }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00ca
            r0.f4254f = r1     // Catch:{ all -> 0x010f }
            java.io.Writer r10 = r9.f4239j     // Catch:{ all -> 0x010f }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x010f }
            java.io.Writer r10 = r9.f4239j     // Catch:{ all -> 0x010f }
            r10.append(r3)     // Catch:{ all -> 0x010f }
            java.io.Writer r10 = r9.f4239j     // Catch:{ all -> 0x010f }
            java.lang.String r1 = r0.f4252d     // Catch:{ all -> 0x010f }
            r10.append(r1)     // Catch:{ all -> 0x010f }
            java.io.Writer r10 = r9.f4239j     // Catch:{ all -> 0x010f }
            java.lang.String r1 = r0.mo5703a()     // Catch:{ all -> 0x010f }
            r10.append(r1)     // Catch:{ all -> 0x010f }
            java.io.Writer r10 = r9.f4239j     // Catch:{ all -> 0x010f }
            r10.append(r2)     // Catch:{ all -> 0x010f }
            if (r11 == 0) goto L_0x00ed
            long r10 = r9.f4242m     // Catch:{ all -> 0x010f }
            r1 = 1
            long r1 = r1 + r10
            r9.f4242m = r1     // Catch:{ all -> 0x010f }
            r0.f4256h = r10     // Catch:{ all -> 0x010f }
            goto L_0x00ed
        L_0x00ca:
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.a.a$c> r10 = r9.f4240k     // Catch:{ all -> 0x010f }
            java.lang.String r11 = r0.f4252d     // Catch:{ all -> 0x010f }
            r10.remove(r11)     // Catch:{ all -> 0x010f }
            java.io.Writer r10 = r9.f4239j     // Catch:{ all -> 0x010f }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x010f }
            java.io.Writer r10 = r9.f4239j     // Catch:{ all -> 0x010f }
            r10.append(r3)     // Catch:{ all -> 0x010f }
            java.io.Writer r10 = r9.f4239j     // Catch:{ all -> 0x010f }
            java.lang.String r11 = r0.f4252d     // Catch:{ all -> 0x010f }
            r10.append(r11)     // Catch:{ all -> 0x010f }
            java.io.Writer r10 = r9.f4239j     // Catch:{ all -> 0x010f }
            r10.append(r2)     // Catch:{ all -> 0x010f }
        L_0x00ed:
            java.io.Writer r10 = r9.f4239j     // Catch:{ all -> 0x010f }
            r10.flush()     // Catch:{ all -> 0x010f }
            long r10 = r9.f4238i     // Catch:{ all -> 0x010f }
            long r0 = r9.f4236g     // Catch:{ all -> 0x010f }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0100
            boolean r10 = r9.m6356e()     // Catch:{ all -> 0x010f }
            if (r10 == 0) goto L_0x0107
        L_0x0100:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f4230a     // Catch:{ all -> 0x010f }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f4243n     // Catch:{ all -> 0x010f }
            r10.submit(r11)     // Catch:{ all -> 0x010f }
        L_0x0107:
            monitor-exit(r9)
            return
        L_0x0109:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010f }
            r10.<init>()     // Catch:{ all -> 0x010f }
            throw r10     // Catch:{ all -> 0x010f }
        L_0x010f:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p034a.C1170a.m6344a(com.bumptech.glide.a.a$b, boolean):void");
    }

    /* renamed from: a */
    private static void m6346a(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    private static void m6347a(File file, File file2, boolean z) {
        if (z) {
            m6346a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r8.f4241l = r1 - r8.f4240k.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r0.mo5707b() != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        m6352d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r8.f4239j = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r8.f4232c, true), com.bumptech.glide.p034a.C1178c.f4268a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0089, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008a=Splitter:B:23:0x008a, B:16:0x005d=Splitter:B:16:0x005d} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6348b() {
        /*
            r8 = this;
            com.bumptech.glide.a.b r0 = new com.bumptech.glide.a.b
            java.io.FileInputStream r1 = new java.io.FileInputStream
            java.io.File r2 = r8.f4232c
            r1.<init>(r2)
            java.nio.charset.Charset r2 = com.bumptech.glide.p034a.C1178c.f4268a
            r0.<init>(r1, r2)
            java.lang.String r1 = r0.mo5706a()     // Catch:{ all -> 0x00be }
            java.lang.String r2 = r0.mo5706a()     // Catch:{ all -> 0x00be }
            java.lang.String r3 = r0.mo5706a()     // Catch:{ all -> 0x00be }
            java.lang.String r4 = r0.mo5706a()     // Catch:{ all -> 0x00be }
            java.lang.String r5 = r0.mo5706a()     // Catch:{ all -> 0x00be }
            java.lang.String r6 = "libcore.io.DiskLruCache"
            boolean r6 = r6.equals(r1)     // Catch:{ all -> 0x00be }
            if (r6 == 0) goto L_0x008a
            java.lang.String r6 = "1"
            boolean r6 = r6.equals(r2)     // Catch:{ all -> 0x00be }
            if (r6 == 0) goto L_0x008a
            int r6 = r8.f4235f     // Catch:{ all -> 0x00be }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x00be }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x00be }
            if (r3 == 0) goto L_0x008a
            int r3 = r8.f4237h     // Catch:{ all -> 0x00be }
            java.lang.String r3 = java.lang.Integer.toString(r3)     // Catch:{ all -> 0x00be }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x00be }
            if (r3 == 0) goto L_0x008a
            java.lang.String r3 = ""
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x00be }
            if (r3 == 0) goto L_0x008a
            r1 = 0
        L_0x0053:
            java.lang.String r2 = r0.mo5706a()     // Catch:{ EOFException -> 0x005d }
            r8.m6354d(r2)     // Catch:{ EOFException -> 0x005d }
            int r1 = r1 + 1
            goto L_0x0053
        L_0x005d:
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.a.a$c> r2 = r8.f4240k     // Catch:{ all -> 0x00be }
            int r2 = r2.size()     // Catch:{ all -> 0x00be }
            int r1 = r1 - r2
            r8.f4241l = r1     // Catch:{ all -> 0x00be }
            boolean r1 = r0.mo5707b()     // Catch:{ all -> 0x00be }
            if (r1 == 0) goto L_0x0070
            r8.m6352d()     // Catch:{ all -> 0x00be }
            goto L_0x0086
        L_0x0070:
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ all -> 0x00be }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00be }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00be }
            java.io.File r4 = r8.f4232c     // Catch:{ all -> 0x00be }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00be }
            java.nio.charset.Charset r4 = com.bumptech.glide.p034a.C1178c.f4268a     // Catch:{ all -> 0x00be }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00be }
            r1.<init>(r2)     // Catch:{ all -> 0x00be }
            r8.f4239j = r1     // Catch:{ all -> 0x00be }
        L_0x0086:
            com.bumptech.glide.p034a.C1178c.m6390a(r0)
            return
        L_0x008a:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x00be }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00be }
            r6.<init>()     // Catch:{ all -> 0x00be }
            java.lang.String r7 = "unexpected journal header: ["
            r6.append(r7)     // Catch:{ all -> 0x00be }
            r6.append(r1)     // Catch:{ all -> 0x00be }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x00be }
            r6.append(r2)     // Catch:{ all -> 0x00be }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x00be }
            r6.append(r4)     // Catch:{ all -> 0x00be }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x00be }
            r6.append(r5)     // Catch:{ all -> 0x00be }
            java.lang.String r1 = "]"
            r6.append(r1)     // Catch:{ all -> 0x00be }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x00be }
            r3.<init>(r1)     // Catch:{ all -> 0x00be }
            throw r3     // Catch:{ all -> 0x00be }
        L_0x00be:
            r1 = move-exception
            com.bumptech.glide.p034a.C1178c.m6390a(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p034a.C1170a.m6348b():void");
    }

    /* renamed from: c */
    private void m6350c() {
        m6346a(this.f4233d);
        Iterator it = this.f4240k.values().iterator();
        while (it.hasNext()) {
            C1174c cVar = (C1174c) it.next();
            int i = 0;
            if (cVar.f4255g == null) {
                while (i < this.f4237h) {
                    this.f4238i += cVar.f4253e[i];
                    i++;
                }
            } else {
                cVar.f4255g = null;
                while (i < this.f4237h) {
                    m6346a(cVar.mo5702a(i));
                    m6346a(cVar.mo5704b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: d */
    public synchronized void m6352d() {
        String sb;
        if (this.f4239j != null) {
            this.f4239j.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f4233d), C1178c.f4268a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f4235f));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f4237h));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C1174c cVar : this.f4240k.values()) {
                if (cVar.f4255g != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("DIRTY ");
                    sb2.append(cVar.f4252d);
                    sb2.append(10);
                    sb = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("CLEAN ");
                    sb3.append(cVar.f4252d);
                    sb3.append(cVar.mo5703a());
                    sb3.append(10);
                    sb = sb3.toString();
                }
                bufferedWriter.write(sb);
            }
            bufferedWriter.close();
            if (this.f4232c.exists()) {
                m6347a(this.f4232c, this.f4234e, true);
            }
            m6347a(this.f4233d, this.f4232c, false);
            this.f4234e.delete();
            this.f4239j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f4232c, true), C1178c.f4268a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* renamed from: d */
    private void m6354d(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == "REMOVE".length() && str.startsWith("REMOVE")) {
                    this.f4240k.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C1174c cVar = (C1174c) this.f4240k.get(str2);
            if (cVar == null) {
                cVar = new C1174c(str2);
                this.f4240k.put(str2, cVar);
            }
            if (indexOf2 != -1 && indexOf == "CLEAN".length() && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                cVar.f4254f = true;
                cVar.f4255g = null;
                cVar.m6375a(split);
            } else if (indexOf2 == -1 && indexOf == "DIRTY".length() && str.startsWith("DIRTY")) {
                cVar.f4255g = new C1173b(cVar);
            } else if (!(indexOf2 == -1 && indexOf == "READ".length() && str.startsWith("READ"))) {
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected journal line: ");
                sb.append(str);
                throw new IOException(sb.toString());
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("unexpected journal line: ");
        sb2.append(str);
        throw new IOException(sb2.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m6356e() {
        return this.f4241l >= 2000 && this.f4241l >= this.f4240k.size();
    }

    /* renamed from: f */
    private void m6358f() {
        if (this.f4239j == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m6359g() {
        while (this.f4238i > this.f4236g) {
            mo5693c((String) ((Entry) this.f4240k.entrySet().iterator().next()).getKey());
        }
    }

    /* renamed from: a */
    public synchronized C1175d mo5690a(String str) {
        m6358f();
        C1174c cVar = (C1174c) this.f4240k.get(str);
        if (cVar == null) {
            return null;
        }
        if (!cVar.f4254f) {
            return null;
        }
        for (File exists : cVar.f4249a) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.f4241l++;
        this.f4239j.append("READ");
        this.f4239j.append(' ');
        this.f4239j.append(str);
        this.f4239j.append(10);
        if (m6356e()) {
            this.f4230a.submit(this.f4243n);
        }
        C1175d dVar = new C1175d(str, cVar.f4256h, cVar.f4249a, cVar.f4253e);
        return dVar;
    }

    /* renamed from: a */
    public void mo5691a() {
        close();
        C1178c.m6391a(this.f4231b);
    }

    /* renamed from: b */
    public C1173b mo5692b(String str) {
        return m6341a(str, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008f, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo5693c(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.m6358f()     // Catch:{ all -> 0x0090 }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.a.a$c> r0 = r7.f4240k     // Catch:{ all -> 0x0090 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x0090 }
            com.bumptech.glide.a.a$c r0 = (com.bumptech.glide.p034a.C1170a.C1174c) r0     // Catch:{ all -> 0x0090 }
            r1 = 0
            if (r0 == 0) goto L_0x008e
            com.bumptech.glide.a.a$b r2 = r0.f4255g     // Catch:{ all -> 0x0090 }
            if (r2 == 0) goto L_0x0017
            goto L_0x008e
        L_0x0017:
            int r2 = r7.f4237h     // Catch:{ all -> 0x0090 }
            if (r1 >= r2) goto L_0x005a
            java.io.File r2 = r0.mo5702a(r1)     // Catch:{ all -> 0x0090 }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x0090 }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.delete()     // Catch:{ all -> 0x0090 }
            if (r3 == 0) goto L_0x002c
            goto L_0x0043
        L_0x002c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0090 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0090 }
            r0.<init>()     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x0090 }
            r0.append(r2)     // Catch:{ all -> 0x0090 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0090 }
            r8.<init>(r0)     // Catch:{ all -> 0x0090 }
            throw r8     // Catch:{ all -> 0x0090 }
        L_0x0043:
            long r2 = r7.f4238i     // Catch:{ all -> 0x0090 }
            long[] r4 = r0.f4253e     // Catch:{ all -> 0x0090 }
            r5 = r4[r1]     // Catch:{ all -> 0x0090 }
            r4 = 0
            long r2 = r2 - r5
            r7.f4238i = r2     // Catch:{ all -> 0x0090 }
            long[] r2 = r0.f4253e     // Catch:{ all -> 0x0090 }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x0090 }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x005a:
            int r0 = r7.f4241l     // Catch:{ all -> 0x0090 }
            r1 = 1
            int r0 = r0 + r1
            r7.f4241l = r0     // Catch:{ all -> 0x0090 }
            java.io.Writer r0 = r7.f4239j     // Catch:{ all -> 0x0090 }
            java.lang.String r2 = "REMOVE"
            r0.append(r2)     // Catch:{ all -> 0x0090 }
            java.io.Writer r0 = r7.f4239j     // Catch:{ all -> 0x0090 }
            r2 = 32
            r0.append(r2)     // Catch:{ all -> 0x0090 }
            java.io.Writer r0 = r7.f4239j     // Catch:{ all -> 0x0090 }
            r0.append(r8)     // Catch:{ all -> 0x0090 }
            java.io.Writer r0 = r7.f4239j     // Catch:{ all -> 0x0090 }
            r2 = 10
            r0.append(r2)     // Catch:{ all -> 0x0090 }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.a.a$c> r0 = r7.f4240k     // Catch:{ all -> 0x0090 }
            r0.remove(r8)     // Catch:{ all -> 0x0090 }
            boolean r8 = r7.m6356e()     // Catch:{ all -> 0x0090 }
            if (r8 == 0) goto L_0x008c
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f4230a     // Catch:{ all -> 0x0090 }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f4243n     // Catch:{ all -> 0x0090 }
            r8.submit(r0)     // Catch:{ all -> 0x0090 }
        L_0x008c:
            monitor-exit(r7)
            return r1
        L_0x008e:
            monitor-exit(r7)
            return r1
        L_0x0090:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p034a.C1170a.mo5693c(java.lang.String):boolean");
    }

    public synchronized void close() {
        if (this.f4239j != null) {
            Iterator it = new ArrayList(this.f4240k.values()).iterator();
            while (it.hasNext()) {
                C1174c cVar = (C1174c) it.next();
                if (cVar.f4255g != null) {
                    cVar.f4255g.mo5700b();
                }
            }
            m6359g();
            this.f4239j.close();
            this.f4239j = null;
        }
    }
}
