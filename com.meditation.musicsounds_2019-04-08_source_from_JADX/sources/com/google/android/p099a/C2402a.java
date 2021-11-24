package com.google.android.p099a;

/* renamed from: com.google.android.a.a */
public class C2402a {

    /* renamed from: a */
    private long f7636a;

    /* renamed from: b */
    private long f7637b;

    /* renamed from: c */
    private long f7638c;

    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v0, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r1v1, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r2v1, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r6v1, types: [byte] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long m11147a(byte[] r6, int r7) {
        /*
            r5 = this;
            byte r0 = r6[r7]
            int r1 = r7 + 1
            byte r1 = r6[r1]
            int r2 = r7 + 2
            byte r2 = r6[r2]
            int r7 = r7 + 3
            byte r6 = r6[r7]
            r7 = r0 & 128(0x80, float:1.794E-43)
            r3 = 128(0x80, float:1.794E-43)
            if (r7 != r3) goto L_0x0018
            r7 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r7 + 128
        L_0x0018:
            r7 = r1 & 128(0x80, float:1.794E-43)
            if (r7 != r3) goto L_0x0020
            r7 = r1 & 127(0x7f, float:1.78E-43)
            int r1 = r7 + 128
        L_0x0020:
            r7 = r2 & 128(0x80, float:1.794E-43)
            if (r7 != r3) goto L_0x0028
            r7 = r2 & 127(0x7f, float:1.78E-43)
            int r2 = r7 + 128
        L_0x0028:
            r7 = r6 & 128(0x80, float:1.794E-43)
            if (r7 != r3) goto L_0x002f
            r6 = r6 & 127(0x7f, float:1.78E-43)
            int r6 = r6 + r3
        L_0x002f:
            long r3 = (long) r0
            r7 = 24
            long r3 = r3 << r7
            long r0 = (long) r1
            r7 = 16
            long r0 = r0 << r7
            long r3 = r3 + r0
            long r0 = (long) r2
            r7 = 8
            long r0 = r0 << r7
            long r3 = r3 + r0
            long r6 = (long) r6
            long r3 = r3 + r6
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.p099a.C2402a.m11147a(byte[], int):long");
    }

    /* renamed from: a */
    private void m11148a(byte[] bArr, int i, long j) {
        long j2 = j / 1000;
        long j3 = j - (j2 * 1000);
        long j4 = j2 + 2208988800L;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) (j4 >> 24));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) (j4 >> 16));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) (j4 >> 8));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) (j4 >> 0));
        long j5 = (j3 * 4294967296L) / 1000;
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) (j5 >> 24));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) (j5 >> 16));
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((int) (j5 >> 8));
        bArr[i8] = (byte) ((int) (Math.random() * 255.0d));
    }

    /* renamed from: b */
    private long m11149b(byte[] bArr, int i) {
        return ((m11147a(bArr, i) - 2208988800L) * 1000) + ((m11147a(bArr, i + 4) * 1000) / 4294967296L);
    }

    /* renamed from: a */
    public long mo8513a() {
        return this.f7636a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo8514a(java.lang.String r19, int r20) {
        /*
            r18 = this;
            r1 = r18
            r0 = 0
            r2 = 0
            java.net.DatagramSocket r3 = new java.net.DatagramSocket     // Catch:{ Exception -> 0x0077, all -> 0x006f }
            r3.<init>()     // Catch:{ Exception -> 0x0077, all -> 0x006f }
            r4 = r20
            r3.setSoTimeout(r4)     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            java.net.InetAddress r2 = java.net.InetAddress.getByName(r19)     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            r4 = 48
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            java.net.DatagramPacket r5 = new java.net.DatagramPacket     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            int r6 = r4.length     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            r7 = 123(0x7b, float:1.72E-43)
            r5.<init>(r4, r6, r2, r7)     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            r2 = 27
            r4[r0] = r2     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            r2 = 40
            r1.m11148a(r4, r2, r6)     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            r3.send(r5)     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            java.net.DatagramPacket r5 = new java.net.DatagramPacket     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            int r10 = r4.length     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            r5.<init>(r4, r10)     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            r3.receive(r5)     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            r5 = 0
            long r8 = r10 - r8
            long r6 = r6 + r8
            r5 = 24
            long r12 = r1.m11149b(r4, r5)     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            r5 = 32
            long r14 = r1.m11149b(r4, r5)     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            long r4 = r1.m11149b(r4, r2)     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            r2 = 0
            long r16 = r4 - r14
            long r8 = r8 - r16
            long r14 = r14 - r12
            long r4 = r4 - r6
            long r14 = r14 + r4
            r4 = 2
            long r14 = r14 / r4
            r2 = 0
            long r6 = r6 + r14
            r1.f7636a = r6     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            r1.f7637b = r10     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            r1.f7638c = r8     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            r3.close()
            r0 = 1
            return r0
        L_0x006b:
            r0 = move-exception
            goto L_0x0071
        L_0x006d:
            goto L_0x0078
        L_0x006f:
            r0 = move-exception
            r3 = r2
        L_0x0071:
            if (r3 == 0) goto L_0x0076
            r3.close()
        L_0x0076:
            throw r0
        L_0x0077:
            r3 = r2
        L_0x0078:
            if (r3 == 0) goto L_0x007d
            r3.close()
        L_0x007d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.p099a.C2402a.mo8514a(java.lang.String, int):boolean");
    }

    /* renamed from: b */
    public long mo8515b() {
        return this.f7637b;
    }
}
