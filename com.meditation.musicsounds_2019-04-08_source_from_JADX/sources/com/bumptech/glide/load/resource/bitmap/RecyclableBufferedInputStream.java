package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.engine.p046a.C1393b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class RecyclableBufferedInputStream extends FilterInputStream {

    /* renamed from: a */
    private volatile byte[] f4952a;

    /* renamed from: b */
    private int f4953b;

    /* renamed from: c */
    private int f4954c;

    /* renamed from: d */
    private int f4955d;

    /* renamed from: e */
    private int f4956e;

    /* renamed from: f */
    private final C1393b f4957f;

    static class InvalidMarkException extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        InvalidMarkException(String str) {
            super(str);
        }
    }

    public RecyclableBufferedInputStream(InputStream inputStream, C1393b bVar) {
        this(inputStream, bVar, 65536);
    }

    RecyclableBufferedInputStream(InputStream inputStream, C1393b bVar, int i) {
        super(inputStream);
        this.f4955d = -1;
        this.f4957f = bVar;
        this.f4952a = (byte[]) bVar.mo6116a(i, byte[].class);
    }

    /* renamed from: a */
    private int m7509a(InputStream inputStream, byte[] bArr) {
        if (this.f4955d == -1 || this.f4956e - this.f4955d >= this.f4954c) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f4955d = -1;
                this.f4956e = 0;
                this.f4953b = read;
            }
            return read;
        }
        if (this.f4955d == 0 && this.f4954c > bArr.length && this.f4953b == bArr.length) {
            int length = bArr.length * 2;
            if (length > this.f4954c) {
                length = this.f4954c;
            }
            byte[] bArr2 = (byte[]) this.f4957f.mo6116a(length, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f4952a = bArr2;
            this.f4957f.mo6119a(bArr);
            bArr = bArr2;
        } else if (this.f4955d > 0) {
            System.arraycopy(bArr, this.f4955d, bArr, 0, bArr.length - this.f4955d);
        }
        this.f4956e -= this.f4955d;
        this.f4955d = 0;
        this.f4953b = 0;
        int read2 = inputStream.read(bArr, this.f4956e, bArr.length - this.f4956e);
        this.f4953b = read2 <= 0 ? this.f4956e : this.f4956e + read2;
        return read2;
    }

    /* renamed from: c */
    private static IOException m7510c() {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: a */
    public synchronized void mo6303a() {
        this.f4954c = this.f4952a.length;
    }

    public synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f4952a == null || inputStream == null) {
            throw m7510c();
        }
        return (this.f4953b - this.f4956e) + inputStream.available();
    }

    /* renamed from: b */
    public synchronized void mo6305b() {
        if (this.f4952a != null) {
            this.f4957f.mo6119a(this.f4952a);
            this.f4952a = null;
        }
    }

    public void close() {
        if (this.f4952a != null) {
            this.f4957f.mo6119a(this.f4952a);
            this.f4952a = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void mark(int i) {
        this.f4954c = Math.max(this.f4954c, i);
        this.f4955d = this.f4956e;
    }

    public boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:11:0x0018=Splitter:B:11:0x0018, B:27:0x003b=Splitter:B:27:0x003b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read() {
        /*
            r5 = this;
            monitor-enter(r5)
            byte[] r0 = r5.f4952a     // Catch:{ all -> 0x0040 }
            java.io.InputStream r1 = r5.in     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x003b
            if (r1 == 0) goto L_0x003b
            int r2 = r5.f4956e     // Catch:{ all -> 0x0040 }
            int r3 = r5.f4953b     // Catch:{ all -> 0x0040 }
            r4 = -1
            if (r2 < r3) goto L_0x0018
            int r1 = r5.m7509a(r1, r0)     // Catch:{ all -> 0x0040 }
            if (r1 != r4) goto L_0x0018
            monitor-exit(r5)
            return r4
        L_0x0018:
            byte[] r1 = r5.f4952a     // Catch:{ all -> 0x0040 }
            if (r0 == r1) goto L_0x0026
            byte[] r0 = r5.f4952a     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0021
            goto L_0x0026
        L_0x0021:
            java.io.IOException r0 = m7510c()     // Catch:{ all -> 0x0040 }
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x0026:
            int r1 = r5.f4953b     // Catch:{ all -> 0x0040 }
            int r2 = r5.f4956e     // Catch:{ all -> 0x0040 }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0039
            int r1 = r5.f4956e     // Catch:{ all -> 0x0040 }
            int r2 = r1 + 1
            r5.f4956e = r2     // Catch:{ all -> 0x0040 }
            byte r0 = r0[r1]     // Catch:{ all -> 0x0040 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r5)
            return r0
        L_0x0039:
            monitor-exit(r5)
            return r4
        L_0x003b:
            java.io.IOException r0 = m7510c()     // Catch:{ all -> 0x0040 }
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream.read():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0050, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x005d, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(byte[] r6, int r7, int r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            byte[] r0 = r5.f4952a     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x0099
            if (r8 != 0) goto L_0x000a
            r6 = 0
            monitor-exit(r5)
            return r6
        L_0x000a:
            java.io.InputStream r1 = r5.in     // Catch:{ all -> 0x009e }
            if (r1 == 0) goto L_0x0094
            int r2 = r5.f4956e     // Catch:{ all -> 0x009e }
            int r3 = r5.f4953b     // Catch:{ all -> 0x009e }
            if (r2 >= r3) goto L_0x003b
            int r2 = r5.f4953b     // Catch:{ all -> 0x009e }
            int r3 = r5.f4956e     // Catch:{ all -> 0x009e }
            int r2 = r2 - r3
            if (r2 < r8) goto L_0x001d
            r2 = r8
            goto L_0x0022
        L_0x001d:
            int r2 = r5.f4953b     // Catch:{ all -> 0x009e }
            int r3 = r5.f4956e     // Catch:{ all -> 0x009e }
            int r2 = r2 - r3
        L_0x0022:
            int r3 = r5.f4956e     // Catch:{ all -> 0x009e }
            java.lang.System.arraycopy(r0, r3, r6, r7, r2)     // Catch:{ all -> 0x009e }
            int r3 = r5.f4956e     // Catch:{ all -> 0x009e }
            int r3 = r3 + r2
            r5.f4956e = r3     // Catch:{ all -> 0x009e }
            if (r2 == r8) goto L_0x0039
            int r3 = r1.available()     // Catch:{ all -> 0x009e }
            if (r3 != 0) goto L_0x0035
            goto L_0x0039
        L_0x0035:
            int r7 = r7 + r2
            int r2 = r8 - r2
            goto L_0x003c
        L_0x0039:
            monitor-exit(r5)
            return r2
        L_0x003b:
            r2 = r8
        L_0x003c:
            int r3 = r5.f4955d     // Catch:{ all -> 0x009e }
            r4 = -1
            if (r3 != r4) goto L_0x0051
            int r3 = r0.length     // Catch:{ all -> 0x009e }
            if (r2 < r3) goto L_0x0051
            int r3 = r1.read(r6, r7, r2)     // Catch:{ all -> 0x009e }
            if (r3 != r4) goto L_0x0084
            if (r2 != r8) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            int r4 = r8 - r2
        L_0x004f:
            monitor-exit(r5)
            return r4
        L_0x0051:
            int r3 = r5.m7509a(r1, r0)     // Catch:{ all -> 0x009e }
            if (r3 != r4) goto L_0x005e
            if (r2 != r8) goto L_0x005a
            goto L_0x005c
        L_0x005a:
            int r4 = r8 - r2
        L_0x005c:
            monitor-exit(r5)
            return r4
        L_0x005e:
            byte[] r3 = r5.f4952a     // Catch:{ all -> 0x009e }
            if (r0 == r3) goto L_0x006c
            byte[] r0 = r5.f4952a     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x0067
            goto L_0x006c
        L_0x0067:
            java.io.IOException r6 = m7510c()     // Catch:{ all -> 0x009e }
            throw r6     // Catch:{ all -> 0x009e }
        L_0x006c:
            int r3 = r5.f4953b     // Catch:{ all -> 0x009e }
            int r4 = r5.f4956e     // Catch:{ all -> 0x009e }
            int r3 = r3 - r4
            if (r3 < r2) goto L_0x0075
            r3 = r2
            goto L_0x007a
        L_0x0075:
            int r3 = r5.f4953b     // Catch:{ all -> 0x009e }
            int r4 = r5.f4956e     // Catch:{ all -> 0x009e }
            int r3 = r3 - r4
        L_0x007a:
            int r4 = r5.f4956e     // Catch:{ all -> 0x009e }
            java.lang.System.arraycopy(r0, r4, r6, r7, r3)     // Catch:{ all -> 0x009e }
            int r4 = r5.f4956e     // Catch:{ all -> 0x009e }
            int r4 = r4 + r3
            r5.f4956e = r4     // Catch:{ all -> 0x009e }
        L_0x0084:
            int r2 = r2 - r3
            if (r2 != 0) goto L_0x0089
            monitor-exit(r5)
            return r8
        L_0x0089:
            int r4 = r1.available()     // Catch:{ all -> 0x009e }
            if (r4 != 0) goto L_0x0092
            int r8 = r8 - r2
            monitor-exit(r5)
            return r8
        L_0x0092:
            int r7 = r7 + r3
            goto L_0x003c
        L_0x0094:
            java.io.IOException r6 = m7510c()     // Catch:{ all -> 0x009e }
            throw r6     // Catch:{ all -> 0x009e }
        L_0x0099:
            java.io.IOException r6 = m7510c()     // Catch:{ all -> 0x009e }
            throw r6     // Catch:{ all -> 0x009e }
        L_0x009e:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream.read(byte[], int, int):int");
    }

    public synchronized void reset() {
        if (this.f4952a == null) {
            throw new IOException("Stream is closed");
        } else if (-1 != this.f4955d) {
            this.f4956e = this.f4955d;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Mark has been invalidated, pos: ");
            sb.append(this.f4956e);
            sb.append(" markLimit: ");
            sb.append(this.f4954c);
            throw new InvalidMarkException(sb.toString());
        }
    }

    public synchronized long skip(long j) {
        if (j < 1) {
            return 0;
        }
        byte[] bArr = this.f4952a;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream == null) {
                throw m7510c();
            } else if (((long) (this.f4953b - this.f4956e)) >= j) {
                this.f4956e = (int) (((long) this.f4956e) + j);
                return j;
            } else {
                long j2 = ((long) this.f4953b) - ((long) this.f4956e);
                this.f4956e = this.f4953b;
                if (this.f4955d == -1 || j > ((long) this.f4954c)) {
                    return j2 + inputStream.skip(j - j2);
                } else if (m7509a(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    if (((long) (this.f4953b - this.f4956e)) >= j - j2) {
                        this.f4956e = (int) ((((long) this.f4956e) + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + ((long) this.f4953b)) - ((long) this.f4956e);
                    this.f4956e = this.f4953b;
                    return j3;
                }
            }
        } else {
            throw m7510c();
        }
    }
}
