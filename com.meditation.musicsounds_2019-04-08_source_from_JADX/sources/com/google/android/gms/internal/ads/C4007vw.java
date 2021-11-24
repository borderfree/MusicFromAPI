package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aai.C3389a;
import com.google.android.gms.internal.ads.aai.C3393e;

/* renamed from: com.google.android.gms.internal.ads.vw */
public final class C4007vw extends aai<C4007vw, C4008a> implements abn {
    private static volatile abx<C4007vw> zzakh;
    /* access modifiers changed from: private */
    public static final C4007vw zzdjt = new C4007vw();
    private int zzdih;
    private C4001vs zzdjj;
    private zzbah zzdjr = zzbah.zzdpq;
    private zzbah zzdjs = zzbah.zzdpq;

    /* renamed from: com.google.android.gms.internal.ads.vw$a */
    public static final class C4008a extends C3389a<C4007vw, C4008a> implements abn {
        private C4008a() {
            super(C4007vw.zzdjt);
        }

        /* synthetic */ C4008a(C4009vx vxVar) {
            this();
        }

        /* renamed from: a */
        public final C4008a mo13758a(int i) {
            mo11489b();
            ((C4007vw) this.f11341a).m20142b(0);
            return this;
        }

        /* renamed from: a */
        public final C4008a mo13759a(C4001vs vsVar) {
            mo11489b();
            ((C4007vw) this.f11341a).m20138a(vsVar);
            return this;
        }

        /* renamed from: a */
        public final C4008a mo13760a(zzbah zzbah) {
            mo11489b();
            ((C4007vw) this.f11341a).m20144b(zzbah);
            return this;
        }

        /* renamed from: b */
        public final C4008a mo13761b(zzbah zzbah) {
            mo11489b();
            ((C4007vw) this.f11341a).m20145c(zzbah);
            return this;
        }
    }

    static {
        aai.m15348a(C4007vw.class, zzdjt);
    }

    private C4007vw() {
    }

    /* renamed from: a */
    public static C4007vw m20137a(zzbah zzbah) {
        return (C4007vw) aai.m15342a(zzdjt, zzbah);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20138a(C4001vs vsVar) {
        if (vsVar != null) {
            this.zzdjj = vsVar;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m20142b(int i) {
        this.zzdih = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m20144b(zzbah zzbah) {
        if (zzbah != null) {
            this.zzdjr = zzbah;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m20145c(zzbah zzbah) {
        if (zzbah != null) {
            this.zzdjs = zzbah;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: e */
    public static C4008a m20146e() {
        return (C4008a) ((C3389a) zzdjt.mo11474a(C3393e.f11349e, (Object) null, (Object) null));
    }

    /* renamed from: f */
    public static C4007vw m20147f() {
        return zzdjt;
    }

    /* renamed from: a */
    public final int mo13754a() {
        return this.zzdih;
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.vw>] */
    /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.vw>] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.vw>, com.google.android.gms.internal.ads.aai$b] */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
      assigns: []
      uses: []
      mth insns count: 44
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11474a(int r2, java.lang.Object r3, java.lang.Object r4) {
        /*
            r1 = this;
            int[] r3 = com.google.android.gms.internal.ads.C4009vx.f15005a
            r4 = 1
            int r2 = r2 - r4
            r2 = r3[r2]
            r3 = 0
            switch(r2) {
                case 1: goto L_0x0058;
                case 2: goto L_0x0052;
                case 3: goto L_0x0033;
                case 4: goto L_0x0030;
                case 5: goto L_0x0016;
                case 6: goto L_0x0011;
                case 7: goto L_0x0010;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
        L_0x0010:
            return r3
        L_0x0011:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r4)
            return r2
        L_0x0016:
            com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.vw> r2 = zzakh
            if (r2 != 0) goto L_0x002f
            java.lang.Class<com.google.android.gms.internal.ads.vw> r3 = com.google.android.gms.internal.ads.C4007vw.class
            monitor-enter(r3)
            com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.vw> r2 = zzakh     // Catch:{ all -> 0x002c }
            if (r2 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.aai$b r2 = new com.google.android.gms.internal.ads.aai$b     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.ads.vw r4 = zzdjt     // Catch:{ all -> 0x002c }
            r2.<init>(r4)     // Catch:{ all -> 0x002c }
            zzakh = r2     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r3)     // Catch:{ all -> 0x002c }
            goto L_0x002f
        L_0x002c:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002c }
            throw r2
        L_0x002f:
            return r2
        L_0x0030:
            com.google.android.gms.internal.ads.vw r2 = zzdjt
            return r2
        L_0x0033:
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r0 = "zzdih"
            r2[r3] = r0
            java.lang.String r3 = "zzdjj"
            r2[r4] = r3
            r3 = 2
            java.lang.String r4 = "zzdjr"
            r2[r3] = r4
            r3 = 3
            java.lang.String r4 = "zzdjs"
            r2[r3] = r4
            java.lang.String r3 = "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n"
            com.google.android.gms.internal.ads.vw r4 = zzdjt
            java.lang.Object r2 = m15346a(r4, r3, r2)
            return r2
        L_0x0052:
            com.google.android.gms.internal.ads.vw$a r2 = new com.google.android.gms.internal.ads.vw$a
            r2.<init>(r3)
            return r2
        L_0x0058:
            com.google.android.gms.internal.ads.vw r2 = new com.google.android.gms.internal.ads.vw
            r2.<init>()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4007vw.mo11474a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: b */
    public final C4001vs mo13755b() {
        return this.zzdjj == null ? C4001vs.m20115d() : this.zzdjj;
    }

    /* renamed from: c */
    public final zzbah mo13756c() {
        return this.zzdjr;
    }

    /* renamed from: d */
    public final zzbah mo13757d() {
        return this.zzdjs;
    }
}
