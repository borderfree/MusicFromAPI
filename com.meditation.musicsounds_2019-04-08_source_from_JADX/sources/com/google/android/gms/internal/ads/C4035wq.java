package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aai.C3389a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.wq */
public final class C4035wq extends aai<C4035wq, C4036a> implements abn {
    private static volatile abx<C4035wq> zzakh;
    /* access modifiers changed from: private */
    public static final C4035wq zzdlt = new C4035wq();
    private int zzdlq;
    private int zzdlr;
    private aan<C4037b> zzdls = m15351m();

    /* renamed from: com.google.android.gms.internal.ads.wq$a */
    public static final class C4036a extends C3389a<C4035wq, C4036a> implements abn {
        private C4036a() {
            super(C4035wq.zzdlt);
        }

        /* synthetic */ C4036a(C4039wr wrVar) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.wq$b */
    public static final class C4037b extends aai<C4037b, C4038a> implements abn {
        private static volatile abx<C4037b> zzakh;
        /* access modifiers changed from: private */
        public static final C4037b zzdlx = new C4037b();
        private int zzdlj;
        private zzaxi zzdlu;
        private int zzdlv;
        private int zzdlw;

        /* renamed from: com.google.android.gms.internal.ads.wq$b$a */
        public static final class C4038a extends C3389a<C4037b, C4038a> implements abn {
            private C4038a() {
                super(C4037b.zzdlx);
            }

            /* synthetic */ C4038a(C4039wr wrVar) {
                this();
            }
        }

        static {
            aai.m15348a(C4037b.class, zzdlx);
        }

        private C4037b() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.wq$b>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.wq$b>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.wq$b>, com.google.android.gms.internal.ads.aai$b] */
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
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
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
                int[] r3 = com.google.android.gms.internal.ads.C4039wr.f15013a
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
                com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.wq$b> r2 = zzakh
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.gms.internal.ads.wq$b> r3 = com.google.android.gms.internal.ads.C4035wq.C4037b.class
                monitor-enter(r3)
                com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.wq$b> r2 = zzakh     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.gms.internal.ads.aai$b r2 = new com.google.android.gms.internal.ads.aai$b     // Catch:{ all -> 0x002c }
                com.google.android.gms.internal.ads.wq$b r4 = zzdlx     // Catch:{ all -> 0x002c }
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
                com.google.android.gms.internal.ads.wq$b r2 = zzdlx
                return r2
            L_0x0033:
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzdlu"
                r2[r3] = r0
                java.lang.String r3 = "zzdlv"
                r2[r4] = r3
                r3 = 2
                java.lang.String r4 = "zzdlw"
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "zzdlj"
                r2[r3] = r4
                java.lang.String r3 = "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f"
                com.google.android.gms.internal.ads.wq$b r4 = zzdlx
                java.lang.Object r2 = m15346a(r4, r3, r2)
                return r2
            L_0x0052:
                com.google.android.gms.internal.ads.wq$b$a r2 = new com.google.android.gms.internal.ads.wq$b$a
                r2.<init>(r3)
                return r2
            L_0x0058:
                com.google.android.gms.internal.ads.wq$b r2 = new com.google.android.gms.internal.ads.wq$b
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4035wq.C4037b.mo11474a(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }

        /* renamed from: a */
        public final boolean mo13790a() {
            return this.zzdlu != null;
        }

        /* renamed from: b */
        public final zzaxi mo13791b() {
            return this.zzdlu == null ? zzaxi.m20629e() : this.zzdlu;
        }

        /* renamed from: c */
        public final zzaxl mo13792c() {
            zzaxl zzax = zzaxl.zzax(this.zzdlv);
            return zzax == null ? zzaxl.UNRECOGNIZED : zzax;
        }

        /* renamed from: d */
        public final int mo13793d() {
            return this.zzdlw;
        }

        /* renamed from: e */
        public final zzayd mo13794e() {
            zzayd zzbg = zzayd.zzbg(this.zzdlj);
            return zzbg == null ? zzayd.UNRECOGNIZED : zzbg;
        }
    }

    static {
        aai.m15348a(C4035wq.class, zzdlt);
    }

    private C4035wq() {
    }

    /* renamed from: a */
    public static C4035wq m20228a(byte[] bArr) {
        return (C4035wq) aai.m15344a(zzdlt, bArr);
    }

    /* renamed from: a */
    public final int mo13787a() {
        return this.zzdlr;
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.wq>] */
    /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.wq>] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.wq>, com.google.android.gms.internal.ads.aai$b] */
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
            int[] r3 = com.google.android.gms.internal.ads.C4039wr.f15013a
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
            com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.wq> r2 = zzakh
            if (r2 != 0) goto L_0x002f
            java.lang.Class<com.google.android.gms.internal.ads.wq> r3 = com.google.android.gms.internal.ads.C4035wq.class
            monitor-enter(r3)
            com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.wq> r2 = zzakh     // Catch:{ all -> 0x002c }
            if (r2 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.aai$b r2 = new com.google.android.gms.internal.ads.aai$b     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.ads.wq r4 = zzdlt     // Catch:{ all -> 0x002c }
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
            com.google.android.gms.internal.ads.wq r2 = zzdlt
            return r2
        L_0x0033:
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r0 = "zzdlq"
            r2[r3] = r0
            java.lang.String r3 = "zzdlr"
            r2[r4] = r3
            r3 = 2
            java.lang.String r4 = "zzdls"
            r2[r3] = r4
            r3 = 3
            java.lang.Class<com.google.android.gms.internal.ads.wq$b> r4 = com.google.android.gms.internal.ads.C4035wq.C4037b.class
            r2[r3] = r4
            java.lang.String r3 = "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0003\u0000\u0001\u0000\u0001\u000b\u0002\u001b"
            com.google.android.gms.internal.ads.wq r4 = zzdlt
            java.lang.Object r2 = m15346a(r4, r3, r2)
            return r2
        L_0x0052:
            com.google.android.gms.internal.ads.wq$a r2 = new com.google.android.gms.internal.ads.wq$a
            r2.<init>(r3)
            return r2
        L_0x0058:
            com.google.android.gms.internal.ads.wq r2 = new com.google.android.gms.internal.ads.wq
            r2.<init>()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4035wq.mo11474a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: b */
    public final List<C4037b> mo13788b() {
        return this.zzdls;
    }

    /* renamed from: c */
    public final int mo13789c() {
        return this.zzdls.size();
    }
}
