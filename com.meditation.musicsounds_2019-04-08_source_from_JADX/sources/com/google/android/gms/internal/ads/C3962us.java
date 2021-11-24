package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aai.C3389a;

/* renamed from: com.google.android.gms.internal.ads.us */
public final class C3962us extends aai<C3962us, C3963a> implements abn {
    private static volatile abx<C3962us> zzakh;
    /* access modifiers changed from: private */
    public static final C3962us zzdin = new C3962us();
    private C3968uw zzdil;
    private C4020wf zzdim;

    /* renamed from: com.google.android.gms.internal.ads.us$a */
    public static final class C3963a extends C3389a<C3962us, C3963a> implements abn {
        private C3963a() {
            super(C3962us.zzdin);
        }

        /* synthetic */ C3963a(C3964ut utVar) {
            this();
        }
    }

    static {
        aai.m15348a(C3962us.class, zzdin);
    }

    private C3962us() {
    }

    /* renamed from: a */
    public static C3962us m20017a(zzbah zzbah) {
        return (C3962us) aai.m15342a(zzdin, zzbah);
    }

    /* renamed from: a */
    public final C3968uw mo13713a() {
        return this.zzdil == null ? C3968uw.m20040c() : this.zzdil;
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.us>] */
    /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.us>] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.us>, com.google.android.gms.internal.ads.aai$b] */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
      assigns: []
      uses: []
      mth insns count: 40
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
            int[] r3 = com.google.android.gms.internal.ads.C3964ut.f14981a
            r4 = 1
            int r2 = r2 - r4
            r2 = r3[r2]
            r3 = 0
            switch(r2) {
                case 1: goto L_0x004e;
                case 2: goto L_0x0048;
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
            com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.us> r2 = zzakh
            if (r2 != 0) goto L_0x002f
            java.lang.Class<com.google.android.gms.internal.ads.us> r3 = com.google.android.gms.internal.ads.C3962us.class
            monitor-enter(r3)
            com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.us> r2 = zzakh     // Catch:{ all -> 0x002c }
            if (r2 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.aai$b r2 = new com.google.android.gms.internal.ads.aai$b     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.ads.us r4 = zzdin     // Catch:{ all -> 0x002c }
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
            com.google.android.gms.internal.ads.us r2 = zzdin
            return r2
        L_0x0033:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r0 = "zzdil"
            r2[r3] = r0
            java.lang.String r3 = "zzdim"
            r2[r4] = r3
            java.lang.String r3 = "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\t\u0002\t"
            com.google.android.gms.internal.ads.us r4 = zzdin
            java.lang.Object r2 = m15346a(r4, r3, r2)
            return r2
        L_0x0048:
            com.google.android.gms.internal.ads.us$a r2 = new com.google.android.gms.internal.ads.us$a
            r2.<init>(r3)
            return r2
        L_0x004e:
            com.google.android.gms.internal.ads.us r2 = new com.google.android.gms.internal.ads.us
            r2.<init>()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3962us.mo11474a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: b */
    public final C4020wf mo13714b() {
        return this.zzdim == null ? C4020wf.m20188c() : this.zzdim;
    }
}
