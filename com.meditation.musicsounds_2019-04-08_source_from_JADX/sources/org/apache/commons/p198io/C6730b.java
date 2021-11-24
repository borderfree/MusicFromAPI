package org.apache.commons.p198io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

/* renamed from: org.apache.commons.io.b */
public class C6730b {

    /* renamed from: a */
    public static final BigInteger f23629a = BigInteger.valueOf(1024);

    /* renamed from: b */
    public static final BigInteger f23630b = f23629a.multiply(f23629a);

    /* renamed from: c */
    public static final BigInteger f23631c = f23629a.multiply(f23630b);

    /* renamed from: d */
    public static final BigInteger f23632d = f23629a.multiply(f23631c);

    /* renamed from: e */
    public static final BigInteger f23633e = f23629a.multiply(f23632d);

    /* renamed from: f */
    public static final BigInteger f23634f = f23629a.multiply(f23633e);

    /* renamed from: g */
    public static final BigInteger f23635g = BigInteger.valueOf(1024).multiply(BigInteger.valueOf(1152921504606846976L));

    /* renamed from: h */
    public static final BigInteger f23636h = f23629a.multiply(f23635g);

    /* renamed from: i */
    public static final File[] f23637i = new File[0];

    /* renamed from: j */
    private static final Charset f23638j = Charset.forName("UTF-8");

    /* renamed from: a */
    public static FileInputStream m32450a(File file) {
        if (!file.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append("File '");
            sb.append(file);
            sb.append("' does not exist");
            throw new FileNotFoundException(sb.toString());
        } else if (file.isDirectory()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("File '");
            sb2.append(file);
            sb2.append("' exists but is a directory");
            throw new IOException(sb2.toString());
        } else if (file.canRead()) {
            return new FileInputStream(file);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("File '");
            sb3.append(file);
            sb3.append("' cannot be read");
            throw new IOException(sb3.toString());
        }
    }

    /* renamed from: a */
    public static FileOutputStream m32451a(File file, boolean z) {
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Directory '");
                sb.append(parentFile);
                sb.append("' could not be created");
                throw new IOException(sb.toString());
            }
        } else if (file.isDirectory()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("File '");
            sb2.append(file);
            sb2.append("' exists but is a directory");
            throw new IOException(sb2.toString());
        } else if (!file.canWrite()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("File '");
            sb3.append(file);
            sb3.append("' cannot be written to");
            throw new IOException(sb3.toString());
        }
        return new FileOutputStream(file, z);
    }

    /* renamed from: a */
    public static String m32452a(File file, String str) {
        return m32453a(file, C6729a.m32448a(str));
    }

    /* renamed from: a */
    public static String m32453a(File file, Charset charset) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = m32450a(file);
            try {
                String a = C6732d.m32483a((InputStream) fileInputStream, C6729a.m32449a(charset));
                C6732d.m32485a((InputStream) fileInputStream);
                return a;
            } catch (Throwable th) {
                th = th;
                C6732d.m32485a((InputStream) fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            C6732d.m32485a((InputStream) fileInputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m32454a(File file, File file2) {
        m32455a(file, file2, true);
    }

    /* renamed from: a */
    public static void m32455a(File file, File file2, boolean z) {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        } else if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        } else if (!file.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Source '");
            sb.append(file);
            sb.append("' does not exist");
            throw new FileNotFoundException(sb.toString());
        } else if (file.isDirectory()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Source '");
            sb2.append(file);
            sb2.append("' exists but is a directory");
            throw new IOException(sb2.toString());
        } else if (!file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            File parentFile = file2.getParentFile();
            if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Destination '");
                sb3.append(parentFile);
                sb3.append("' directory cannot be created");
                throw new IOException(sb3.toString());
            } else if (!file2.exists() || file2.canWrite()) {
                m32464b(file, file2, z);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Destination '");
                sb4.append(file2);
                sb4.append("' exists but is read-only");
                throw new IOException(sb4.toString());
            }
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Source '");
            sb5.append(file);
            sb5.append("' and destination '");
            sb5.append(file2);
            sb5.append("' are the same");
            throw new IOException(sb5.toString());
        }
    }

    /* renamed from: a */
    public static void m32456a(File file, CharSequence charSequence) {
        m32457a(file, charSequence, Charset.defaultCharset(), false);
    }

    /* renamed from: a */
    public static void m32457a(File file, CharSequence charSequence, Charset charset, boolean z) {
        m32460a(file, charSequence == null ? null : charSequence.toString(), charset, z);
    }

    /* renamed from: a */
    public static void m32458a(File file, String str, String str2) {
        m32459a(file, str, str2, false);
    }

    /* renamed from: a */
    public static void m32459a(File file, String str, String str2, boolean z) {
        m32460a(file, str, C6729a.m32448a(str2), z);
    }

    /* renamed from: a */
    public static void m32460a(File file, String str, Charset charset, boolean z) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = m32451a(file, z);
            try {
                C6732d.m32488a(str, (OutputStream) fileOutputStream, charset);
                fileOutputStream.close();
                C6732d.m32487a((OutputStream) fileOutputStream);
            } catch (Throwable th) {
                th = th;
                C6732d.m32487a((OutputStream) fileOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
            C6732d.m32487a((OutputStream) fileOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m32461a(InputStream inputStream, File file) {
        FileOutputStream b;
        try {
            b = m32463b(file);
            C6732d.m32479a(inputStream, (OutputStream) b);
            b.close();
            C6732d.m32487a((OutputStream) b);
            C6732d.m32485a(inputStream);
        } catch (Throwable th) {
            C6732d.m32485a(inputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m32462a(URL url, File file, int i, int i2) {
        URLConnection openConnection = url.openConnection();
        openConnection.setConnectTimeout(i);
        openConnection.setReadTimeout(i2);
        m32461a(openConnection.getInputStream(), file);
    }

    /* renamed from: b */
    public static FileOutputStream m32463b(File file) {
        return m32451a(file, false);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r11v1 */
    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m32464b(java.io.File r17, java.io.File r18, boolean r19) {
        /*
            r0 = r17
            r1 = r18
            boolean r2 = r18.exists()
            if (r2 == 0) goto L_0x002d
            boolean r2 = r18.isDirectory()
            if (r2 != 0) goto L_0x0011
            goto L_0x002d
        L_0x0011:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Destination '"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "' exists but is a directory"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x002d:
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x00b2 }
            r3.<init>(r0)     // Catch:{ all -> 0x00b2 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x00af }
            r4.<init>(r1)     // Catch:{ all -> 0x00af }
            java.nio.channels.FileChannel r11 = r3.getChannel()     // Catch:{ all -> 0x00ac }
            java.nio.channels.FileChannel r12 = r4.getChannel()     // Catch:{ all -> 0x00aa }
            long r13 = r11.size()     // Catch:{ all -> 0x00a7 }
            r5 = 0
            r15 = r5
        L_0x0047:
            int r2 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x0061
            long r5 = r13 - r15
            r7 = 31457280(0x1e00000, double:1.55419614E-316)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0056
            r9 = r7
            goto L_0x0057
        L_0x0056:
            r9 = r5
        L_0x0057:
            r5 = r12
            r6 = r11
            r7 = r15
            long r5 = r5.transferFrom(r6, r7, r9)     // Catch:{ all -> 0x00a7 }
            r2 = 0
            long r15 = r15 + r5
            goto L_0x0047
        L_0x0061:
            org.apache.commons.p198io.C6732d.m32484a(r12)
            org.apache.commons.p198io.C6732d.m32487a(r4)
            org.apache.commons.p198io.C6732d.m32484a(r11)
            org.apache.commons.p198io.C6732d.m32485a(r3)
            long r2 = r17.length()
            long r4 = r18.length()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0083
            if (r19 == 0) goto L_0x0082
            long r2 = r17.lastModified()
            r1.setLastModified(r2)
        L_0x0082:
            return
        L_0x0083:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to copy full contents from '"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = "' to '"
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = "'"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x00a7:
            r0 = move-exception
            r2 = r12
            goto L_0x00b6
        L_0x00aa:
            r0 = move-exception
            goto L_0x00b6
        L_0x00ac:
            r0 = move-exception
            r11 = r2
            goto L_0x00b6
        L_0x00af:
            r0 = move-exception
            r4 = r2
            goto L_0x00b5
        L_0x00b2:
            r0 = move-exception
            r3 = r2
            r4 = r3
        L_0x00b5:
            r11 = r4
        L_0x00b6:
            org.apache.commons.p198io.C6732d.m32484a(r2)
            org.apache.commons.p198io.C6732d.m32487a(r4)
            org.apache.commons.p198io.C6732d.m32484a(r11)
            org.apache.commons.p198io.C6732d.m32485a(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p198io.C6730b.m32464b(java.io.File, java.io.File, boolean):void");
    }

    /* renamed from: b */
    public static void m32465b(File file, String str) {
        m32460a(file, str, Charset.defaultCharset(), false);
    }

    /* renamed from: c */
    public static void m32466c(File file) {
        if (file.exists()) {
            if (!m32471h(file)) {
                m32468e(file);
            }
            if (!file.delete()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to delete directory ");
                sb.append(file);
                sb.append(".");
                throw new IOException(sb.toString());
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:3|4|(1:6)|7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000d */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m32467d(java.io.File r2) {
        /*
            r0 = 0
            if (r2 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r2.isDirectory()     // Catch:{ Exception -> 0x000d }
            if (r1 == 0) goto L_0x000d
            m32468e(r2)     // Catch:{ Exception -> 0x000d }
        L_0x000d:
            boolean r2 = r2.delete()     // Catch:{ Exception -> 0x0012 }
            return r2
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p198io.C6730b.m32467d(java.io.File):boolean");
    }

    /* renamed from: e */
    public static void m32468e(File file) {
        if (!file.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append(file);
            sb.append(" does not exist");
            throw new IllegalArgumentException(sb.toString());
        } else if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                IOException e = null;
                for (File g : listFiles) {
                    try {
                        m32470g(g);
                    } catch (IOException e2) {
                        e = e2;
                    }
                }
                if (e != null) {
                    throw e;
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to list contents of ");
            sb2.append(file);
            throw new IOException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(file);
            sb3.append(" is not a directory");
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* renamed from: f */
    public static String m32469f(File file) {
        return m32453a(file, Charset.defaultCharset());
    }

    /* renamed from: g */
    public static void m32470g(File file) {
        if (file.isDirectory()) {
            m32466c(file);
            return;
        }
        boolean exists = file.exists();
        if (file.delete()) {
            return;
        }
        if (!exists) {
            StringBuilder sb = new StringBuilder();
            sb.append("File does not exist: ");
            sb.append(file);
            throw new FileNotFoundException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to delete file: ");
        sb2.append(file);
        throw new IOException(sb2.toString());
    }

    /* renamed from: h */
    public static boolean m32471h(File file) {
        if (file == null) {
            throw new NullPointerException("File must not be null");
        } else if (C6731c.m32473a()) {
            return false;
        } else {
            if (file.getParent() != null) {
                file = new File(file.getParentFile().getCanonicalFile(), file.getName());
            }
            return !file.getCanonicalFile().equals(file.getAbsoluteFile());
        }
    }
}
