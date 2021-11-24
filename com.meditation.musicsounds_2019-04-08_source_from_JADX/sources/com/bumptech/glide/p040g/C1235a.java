package com.bumptech.glide.p040g;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.bumptech.glide.g.a */
public final class C1235a {

    /* renamed from: a */
    private static final AtomicReference<byte[]> f4450a = new AtomicReference<>();

    /* renamed from: com.bumptech.glide.g.a$a */
    private static class C1236a extends InputStream {

        /* renamed from: a */
        private final ByteBuffer f4451a;

        /* renamed from: b */
        private int f4452b = -1;

        C1236a(ByteBuffer byteBuffer) {
            this.f4451a = byteBuffer;
        }

        public int available() {
            return this.f4451a.remaining();
        }

        public synchronized void mark(int i) {
            this.f4452b = this.f4451a.position();
        }

        public boolean markSupported() {
            return true;
        }

        public int read() {
            if (!this.f4451a.hasRemaining()) {
                return -1;
            }
            return this.f4451a.get();
        }

        public int read(byte[] bArr, int i, int i2) {
            if (!this.f4451a.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i2, available());
            this.f4451a.get(bArr, i, min);
            return min;
        }

        public synchronized void reset() {
            if (this.f4452b != -1) {
                this.f4451a.position(this.f4452b);
            } else {
                throw new IOException("Cannot reset to unset mark position");
            }
        }

        public long skip(long j) {
            if (!this.f4451a.hasRemaining()) {
                return -1;
            }
            long min = Math.min(j, (long) available());
            this.f4451a.position((int) (((long) this.f4451a.position()) + min));
            return min;
        }
    }

    /* renamed from: com.bumptech.glide.g.a$b */
    static final class C1237b {

        /* renamed from: a */
        final int f4453a;

        /* renamed from: b */
        final int f4454b;

        /* renamed from: c */
        final byte[] f4455c;

        C1237b(byte[] bArr, int i, int i2) {
            this.f4455c = bArr;
            this.f4453a = i;
            this.f4454b = i2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|(2:12|13)|14|15|16) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002f */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004e A[SYNTHETIC, Splitter:B:29:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0055 A[SYNTHETIC, Splitter:B:33:0x0055] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer m6636a(java.io.File r9) {
        /*
            r0 = 0
            long r5 = r9.length()     // Catch:{ all -> 0x004a }
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x0042
            r1 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x003a
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ all -> 0x004a }
            java.lang.String r1 = "r"
            r7.<init>(r9, r1)     // Catch:{ all -> 0x004a }
            java.nio.channels.FileChannel r9 = r7.getChannel()     // Catch:{ all -> 0x0038 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0033 }
            r3 = 0
            r1 = r9
            java.nio.MappedByteBuffer r0 = r1.map(r2, r3, r5)     // Catch:{ all -> 0x0033 }
            java.nio.MappedByteBuffer r0 = r0.load()     // Catch:{ all -> 0x0033 }
            if (r9 == 0) goto L_0x002f
            r9.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            r7.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            return r0
        L_0x0033:
            r0 = move-exception
            r8 = r0
            r0 = r9
            r9 = r8
            goto L_0x004c
        L_0x0038:
            r9 = move-exception
            goto L_0x004c
        L_0x003a:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x004a }
            java.lang.String r1 = "File unsuitable for memory mapping"
            r9.<init>(r1)     // Catch:{ all -> 0x004a }
            throw r9     // Catch:{ all -> 0x004a }
        L_0x0042:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x004a }
            java.lang.String r1 = "File too large to map into memory"
            r9.<init>(r1)     // Catch:{ all -> 0x004a }
            throw r9     // Catch:{ all -> 0x004a }
        L_0x004a:
            r9 = move-exception
            r7 = r0
        L_0x004c:
            if (r0 == 0) goto L_0x0053
            r0.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0053
        L_0x0052:
        L_0x0053:
            if (r7 == 0) goto L_0x0058
            r7.close()     // Catch:{ IOException -> 0x0058 }
        L_0x0058:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p040g.C1235a.m6636a(java.io.File):java.nio.ByteBuffer");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:5|6|(2:8|9)|10|11|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0021 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002f A[SYNTHETIC, Splitter:B:19:0x002f] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0036 A[SYNTHETIC, Splitter:B:23:0x0036] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m6637a(java.nio.ByteBuffer r4, java.io.File r5) {
        /*
            r0 = 0
            r4.position(r0)
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ all -> 0x002a }
            java.lang.String r3 = "rw"
            r2.<init>(r5, r3)     // Catch:{ all -> 0x002a }
            java.nio.channels.FileChannel r5 = r2.getChannel()     // Catch:{ all -> 0x0027 }
            r5.write(r4)     // Catch:{ all -> 0x0025 }
            r5.force(r0)     // Catch:{ all -> 0x0025 }
            r5.close()     // Catch:{ all -> 0x0025 }
            r2.close()     // Catch:{ all -> 0x0025 }
            if (r5 == 0) goto L_0x0021
            r5.close()     // Catch:{ IOException -> 0x0021 }
        L_0x0021:
            r2.close()     // Catch:{ IOException -> 0x0024 }
        L_0x0024:
            return
        L_0x0025:
            r4 = move-exception
            goto L_0x002d
        L_0x0027:
            r4 = move-exception
            r5 = r1
            goto L_0x002d
        L_0x002a:
            r4 = move-exception
            r5 = r1
            r2 = r5
        L_0x002d:
            if (r5 == 0) goto L_0x0034
            r5.close()     // Catch:{ IOException -> 0x0033 }
            goto L_0x0034
        L_0x0033:
        L_0x0034:
            if (r2 == 0) goto L_0x0039
            r2.close()     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p040g.C1235a.m6637a(java.nio.ByteBuffer, java.io.File):void");
    }

    /* renamed from: a */
    public static byte[] m6638a(ByteBuffer byteBuffer) {
        C1237b c = m6640c(byteBuffer);
        if (c != null && c.f4453a == 0 && c.f4454b == c.f4455c.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        asReadOnlyBuffer.position(0);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }

    /* renamed from: b */
    public static InputStream m6639b(ByteBuffer byteBuffer) {
        return new C1236a(byteBuffer);
    }

    /* renamed from: c */
    private static C1237b m6640c(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new C1237b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }
}
