package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hv */
public class C3613hv implements apd {

    /* renamed from: a */
    private static final boolean f14103a = C3504dv.f13779a;
    @Deprecated

    /* renamed from: b */
    private final C3837qc f14104b;

    /* renamed from: c */
    private final C3587gw f14105c;

    /* renamed from: d */
    private final C3641iw f14106d;

    public C3613hv(C3587gw gwVar) {
        this(gwVar, new C3641iw(4096));
    }

    private C3613hv(C3587gw gwVar, C3641iw iwVar) {
        this.f14105c = gwVar;
        this.f14104b = gwVar;
        this.f14106d = iwVar;
    }

    @Deprecated
    public C3613hv(C3837qc qcVar) {
        this(qcVar, new C3641iw(4096));
    }

    @Deprecated
    private C3613hv(C3837qc qcVar, C3641iw iwVar) {
        this.f14104b = qcVar;
        this.f14105c = new C3560fw(qcVar);
        this.f14106d = iwVar;
    }

    /* renamed from: a */
    private static void m18677a(String str, auc<?> auc, zzae zzae) {
        C3394ab j = auc.mo12508j();
        int i = auc.mo12507i();
        try {
            j.mo11533a(zzae);
            auc.mo12498b(String.format("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(i)}));
        } catch (zzae e) {
            auc.mo12498b(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{str, Integer.valueOf(i)}));
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046 A[SYNTHETIC, Splitter:B:23:0x0046] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final byte[] m18678a(java.io.InputStream r6, int r7) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.ta r0 = new com.google.android.gms.internal.ads.ta
            com.google.android.gms.internal.ads.iw r1 = r5.f14106d
            r0.<init>(r1, r7)
            r7 = 0
            r1 = 0
            if (r6 == 0) goto L_0x003d
            com.google.android.gms.internal.ads.iw r2 = r5.f14106d     // Catch:{ all -> 0x0043 }
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r2 = r2.mo13089a(r3)     // Catch:{ all -> 0x0043 }
        L_0x0013:
            int r1 = r6.read(r2)     // Catch:{ all -> 0x0038 }
            r3 = -1
            if (r1 == r3) goto L_0x001e
            r0.write(r2, r7, r1)     // Catch:{ all -> 0x0038 }
            goto L_0x0013
        L_0x001e:
            byte[] r1 = r0.toByteArray()     // Catch:{ all -> 0x0038 }
            if (r6 == 0) goto L_0x002f
            r6.close()     // Catch:{ IOException -> 0x0028 }
            goto L_0x002f
        L_0x0028:
            java.lang.String r6 = "Error occurred when closing InputStream"
            java.lang.Object[] r7 = new java.lang.Object[r7]
            com.google.android.gms.internal.ads.C3504dv.m18310a(r6, r7)
        L_0x002f:
            com.google.android.gms.internal.ads.iw r6 = r5.f14106d
            r6.mo13088a(r2)
            r0.close()
            return r1
        L_0x0038:
            r1 = move-exception
            r4 = r2
            r2 = r1
            r1 = r4
            goto L_0x0044
        L_0x003d:
            com.google.android.gms.internal.ads.zzac r2 = new com.google.android.gms.internal.ads.zzac     // Catch:{ all -> 0x0043 }
            r2.<init>()     // Catch:{ all -> 0x0043 }
            throw r2     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r2 = move-exception
        L_0x0044:
            if (r6 == 0) goto L_0x0051
            r6.close()     // Catch:{ IOException -> 0x004a }
            goto L_0x0051
        L_0x004a:
            java.lang.Object[] r6 = new java.lang.Object[r7]
            java.lang.String r7 = "Error occurred when closing InputStream"
            com.google.android.gms.internal.ads.C3504dv.m18310a(r7, r6)
        L_0x0051:
            com.google.android.gms.internal.ads.iw r6 = r5.f14106d
            r6.mo13088a(r1)
            r0.close()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3613hv.m18678a(java.io.InputStream, int):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01e1, code lost:
        if (r0 < 400) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01ed, code lost:
        throw new com.google.android.gms.internal.ads.zzg(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01f0, code lost:
        if (r0 < 500) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01fb, code lost:
        throw new com.google.android.gms.internal.ads.zzac(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0201, code lost:
        throw new com.google.android.gms.internal.ads.zzac(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0202, code lost:
        m18677a("auth", r2, new com.google.android.gms.internal.ads.zza(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x020e, code lost:
        r0 = "network";
        r5 = new com.google.android.gms.internal.ads.zzo();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x021b, code lost:
        throw new com.google.android.gms.internal.ads.zzq(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x021c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x021d, code lost:
        r4 = "Bad URL ";
        r2 = java.lang.String.valueOf(r22.mo12503e());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x022d, code lost:
        if (r2.length() != 0) goto L_0x022f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x022f, code lost:
        r2 = r4.concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0234, code lost:
        r2 = new java.lang.String(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x023c, code lost:
        throw new java.lang.RuntimeException(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x023d, code lost:
        r0 = "socket";
        r5 = new com.google.android.gms.internal.ads.zzad();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0244, code lost:
        m18677a(r0, r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0118, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0119, code lost:
        r17 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0154, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0155, code lost:
        r13 = r5;
        r17 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0197, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0199, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x019a, code lost:
        r8 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x019b, code lost:
        r13 = r5;
        r17 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01a5, code lost:
        r17 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01a8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01a9, code lost:
        r17 = r5;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01af, code lost:
        r0 = r10.mo13437a();
        com.google.android.gms.internal.ads.C3504dv.m18313c("Unexpected response code %d for %s", java.lang.Integer.valueOf(r0), r22.mo12503e());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01c6, code lost:
        if (r13 != null) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c8, code lost:
        r11 = new com.google.android.gms.internal.ads.asc(r0, r13, false, android.os.SystemClock.elapsedRealtime() - r3, r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01d8, code lost:
        if (r0 == 401) goto L_0x0202;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x021c A[ExcHandler: MalformedURLException (r0v2 'e' java.net.MalformedURLException A[CUSTOM_DECLARE]), Splitter:B:2:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[ExcHandler: SocketTimeoutException (unused java.net.SocketTimeoutException), SYNTHETIC, Splitter:B:2:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0216 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01af  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.ads.asc mo12214a(com.google.android.gms.internal.ads.auc<?> r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            long r3 = android.os.SystemClock.elapsedRealtime()
        L_0x0008:
            java.util.List r5 = java.util.Collections.emptyList()
            r6 = 1
            r7 = 2
            r9 = 0
            com.google.android.gms.internal.ads.afd r0 = r22.mo12504f()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x01a8 }
            if (r0 != 0) goto L_0x001a
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x01a8 }
            goto L_0x003e
        L_0x001a:
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x01a8 }
            r10.<init>()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x01a8 }
            java.lang.String r11 = r0.f11860b     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x01a8 }
            if (r11 == 0) goto L_0x002a
            java.lang.String r11 = "If-None-Match"
            java.lang.String r12 = r0.f11860b     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x01a8 }
            r10.put(r11, r12)     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x01a8 }
        L_0x002a:
            long r11 = r0.f11862d     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x01a8 }
            r13 = 0
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x003d
            java.lang.String r11 = "If-Modified-Since"
            long r12 = r0.f11862d     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x01a8 }
            java.lang.String r0 = com.google.android.gms.internal.ads.C3781oa.m19264a(r12)     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x01a8 }
            r10.put(r11, r0)     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x01a8 }
        L_0x003d:
            r0 = r10
        L_0x003e:
            com.google.android.gms.internal.ads.gw r10 = r1.f14105c     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x01a8 }
            com.google.android.gms.internal.ads.pb r10 = r10.mo12927a(r2, r0)     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x01a8 }
            int r12 = r10.mo13437a()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x01a4 }
            java.util.List r11 = r10.mo13438b()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x01a4 }
            r0 = 304(0x130, float:4.26E-43)
            if (r12 != r0) goto L_0x011d
            com.google.android.gms.internal.ads.afd r0 = r22.mo12504f()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            if (r0 != 0) goto L_0x006b
            com.google.android.gms.internal.ads.asc r0 = new com.google.android.gms.internal.ads.asc     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            r14 = 304(0x130, float:4.26E-43)
            r15 = 0
            r16 = 1
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            r5 = 0
            long r17 = r12 - r3
            r13 = r0
            r19 = r11
            r13.<init>(r14, r15, r16, r17, r19)     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            return r0
        L_0x006b:
            java.util.TreeSet r5 = new java.util.TreeSet     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            java.util.Comparator r12 = java.lang.String.CASE_INSENSITIVE_ORDER     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            r5.<init>(r12)     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            boolean r12 = r11.isEmpty()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            if (r12 != 0) goto L_0x0090
            java.util.Iterator r12 = r11.iterator()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
        L_0x007c:
            boolean r13 = r12.hasNext()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            if (r13 == 0) goto L_0x0090
            java.lang.Object r13 = r12.next()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            com.google.android.gms.internal.ads.aod r13 = (com.google.android.gms.internal.ads.aod) r13     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            java.lang.String r13 = r13.mo12126a()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            r5.add(r13)     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            goto L_0x007c
        L_0x0090:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            r12.<init>(r11)     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            java.util.List<com.google.android.gms.internal.ads.aod> r13 = r0.f11866h     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            if (r13 == 0) goto L_0x00c1
            java.util.List<com.google.android.gms.internal.ads.aod> r13 = r0.f11866h     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            boolean r13 = r13.isEmpty()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            if (r13 != 0) goto L_0x0100
            java.util.List<com.google.android.gms.internal.ads.aod> r13 = r0.f11866h     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
        L_0x00a7:
            boolean r14 = r13.hasNext()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            if (r14 == 0) goto L_0x0100
            java.lang.Object r14 = r13.next()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            com.google.android.gms.internal.ads.aod r14 = (com.google.android.gms.internal.ads.aod) r14     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            java.lang.String r15 = r14.mo12126a()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            boolean r15 = r5.contains(r15)     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            if (r15 != 0) goto L_0x00a7
            r12.add(r14)     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            goto L_0x00a7
        L_0x00c1:
            java.util.Map<java.lang.String, java.lang.String> r13 = r0.f11865g     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            boolean r13 = r13.isEmpty()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            if (r13 != 0) goto L_0x0100
            java.util.Map<java.lang.String, java.lang.String> r13 = r0.f11865g     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            java.util.Set r13 = r13.entrySet()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
        L_0x00d3:
            boolean r14 = r13.hasNext()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            if (r14 == 0) goto L_0x0100
            java.lang.Object r14 = r13.next()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            java.lang.Object r15 = r14.getKey()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            boolean r15 = r5.contains(r15)     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            if (r15 != 0) goto L_0x00d3
            com.google.android.gms.internal.ads.aod r15 = new com.google.android.gms.internal.ads.aod     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            java.lang.Object r16 = r14.getKey()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            r8 = r16
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            java.lang.Object r14 = r14.getValue()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            r15.<init>(r8, r14)     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            r12.add(r15)     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            goto L_0x00d3
        L_0x0100:
            com.google.android.gms.internal.ads.asc r5 = new com.google.android.gms.internal.ads.asc     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            r15 = 304(0x130, float:4.26E-43)
            byte[] r0 = r0.f11859a     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            r17 = 1
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            r8 = 0
            long r18 = r13 - r3
            r14 = r5
            r16 = r0
            r20 = r12
            r14.<init>(r15, r16, r17, r18, r20)     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            return r5
        L_0x0118:
            r0 = move-exception
            r17 = r11
            goto L_0x01ac
        L_0x011d:
            java.io.InputStream r0 = r10.mo13440d()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x019f }
            if (r0 == 0) goto L_0x012c
            int r5 = r10.mo13439c()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            byte[] r0 = r1.m18678a(r0, r5)     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0118 }
            goto L_0x012e
        L_0x012c:
            byte[] r0 = new byte[r9]     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x019f }
        L_0x012e:
            r5 = r0
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0199 }
            r0 = 0
            long r13 = r13 - r3
            boolean r0 = f14103a     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0199 }
            if (r0 != 0) goto L_0x013f
            r15 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x0176
        L_0x013f:
            java.lang.String r0 = "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]"
            r8 = 5
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0199 }
            r8[r9] = r2     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0199 }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0199 }
            r8[r6] = r13     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0199 }
            if (r5 == 0) goto L_0x0159
            int r13 = r5.length     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0154 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0154 }
            goto L_0x015b
        L_0x0154:
            r0 = move-exception
            r13 = r5
            r17 = r11
            goto L_0x01ad
        L_0x0159:
            java.lang.String r13 = "null"
        L_0x015b:
            r8[r7] = r13     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0199 }
            r13 = 3
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0199 }
            r8[r13] = r14     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0199 }
            r13 = 4
            com.google.android.gms.internal.ads.ab r14 = r22.mo12508j()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0199 }
            int r14 = r14.mo11534b()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0199 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0199 }
            r8[r13] = r14     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0199 }
            com.google.android.gms.internal.ads.C3504dv.m18312b(r0, r8)     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0199 }
        L_0x0176:
            r0 = 200(0xc8, float:2.8E-43)
            if (r12 < r0) goto L_0x0190
            r0 = 299(0x12b, float:4.19E-43)
            if (r12 > r0) goto L_0x0190
            com.google.android.gms.internal.ads.asc r0 = new com.google.android.gms.internal.ads.asc     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0199 }
            r14 = 0
            long r15 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0199 }
            r8 = 0
            long r15 = r15 - r3
            r8 = r11
            r11 = r0
            r13 = r5
            r17 = r8
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0197 }
            return r0
        L_0x0190:
            r8 = r11
            java.io.IOException r0 = new java.io.IOException     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0197 }
            r0.<init>()     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0197 }
            throw r0     // Catch:{ SocketTimeoutException -> 0x023d, MalformedURLException -> 0x021c, IOException -> 0x0197 }
        L_0x0197:
            r0 = move-exception
            goto L_0x019b
        L_0x0199:
            r0 = move-exception
            r8 = r11
        L_0x019b:
            r13 = r5
            r17 = r8
            goto L_0x01ad
        L_0x019f:
            r0 = move-exception
            r8 = r11
            r17 = r8
            goto L_0x01ac
        L_0x01a4:
            r0 = move-exception
            r17 = r5
            goto L_0x01ac
        L_0x01a8:
            r0 = move-exception
            r17 = r5
            r10 = 0
        L_0x01ac:
            r13 = 0
        L_0x01ad:
            if (r10 == 0) goto L_0x0216
            int r0 = r10.mo13437a()
            java.lang.String r5 = "Unexpected response code %d for %s"
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r7[r9] = r8
            java.lang.String r8 = r22.mo12503e()
            r7[r6] = r8
            com.google.android.gms.internal.ads.C3504dv.m18313c(r5, r7)
            if (r13 == 0) goto L_0x020e
            com.google.android.gms.internal.ads.asc r5 = new com.google.android.gms.internal.ads.asc
            r14 = 0
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r15 = r6 - r3
            r11 = r5
            r12 = r0
            r11.<init>(r12, r13, r14, r15, r17)
            r6 = 401(0x191, float:5.62E-43)
            if (r0 == r6) goto L_0x0202
            r6 = 403(0x193, float:5.65E-43)
            if (r0 != r6) goto L_0x01df
            goto L_0x0202
        L_0x01df:
            r2 = 400(0x190, float:5.6E-43)
            if (r0 < r2) goto L_0x01ee
            r2 = 499(0x1f3, float:6.99E-43)
            if (r0 <= r2) goto L_0x01e8
            goto L_0x01ee
        L_0x01e8:
            com.google.android.gms.internal.ads.zzg r0 = new com.google.android.gms.internal.ads.zzg
            r0.<init>(r5)
            throw r0
        L_0x01ee:
            r2 = 500(0x1f4, float:7.0E-43)
            if (r0 < r2) goto L_0x01fc
            r2 = 599(0x257, float:8.4E-43)
            if (r0 > r2) goto L_0x01fc
            com.google.android.gms.internal.ads.zzac r0 = new com.google.android.gms.internal.ads.zzac
            r0.<init>(r5)
            throw r0
        L_0x01fc:
            com.google.android.gms.internal.ads.zzac r0 = new com.google.android.gms.internal.ads.zzac
            r0.<init>(r5)
            throw r0
        L_0x0202:
            java.lang.String r0 = "auth"
            com.google.android.gms.internal.ads.zza r6 = new com.google.android.gms.internal.ads.zza
            r6.<init>(r5)
            m18677a(r0, r2, r6)
            goto L_0x0008
        L_0x020e:
            java.lang.String r0 = "network"
            com.google.android.gms.internal.ads.zzo r5 = new com.google.android.gms.internal.ads.zzo
            r5.<init>()
            goto L_0x0244
        L_0x0216:
            com.google.android.gms.internal.ads.zzq r2 = new com.google.android.gms.internal.ads.zzq
            r2.<init>(r0)
            throw r2
        L_0x021c:
            r0 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "Bad URL "
            java.lang.String r2 = r22.mo12503e()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r5 = r2.length()
            if (r5 == 0) goto L_0x0234
            java.lang.String r2 = r4.concat(r2)
            goto L_0x0239
        L_0x0234:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r4)
        L_0x0239:
            r3.<init>(r2, r0)
            throw r3
        L_0x023d:
            java.lang.String r0 = "socket"
            com.google.android.gms.internal.ads.zzad r5 = new com.google.android.gms.internal.ads.zzad
            r5.<init>()
        L_0x0244:
            m18677a(r0, r2, r5)
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3613hv.mo12214a(com.google.android.gms.internal.ads.auc):com.google.android.gms.internal.ads.asc");
    }
}
