package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aai.C3389a;

/* renamed from: com.google.android.gms.internal.ads.uy */
public final class C3971uy extends aai<C3971uy, C3972a> implements abn {
    private static volatile abx<C3971uy> zzakh;
    /* access modifiers changed from: private */
    public static final C3971uy zzdiu = new C3971uy();
    private int zzdit;

    /* renamed from: com.google.android.gms.internal.ads.uy$a */
    public static final class C3972a extends C3389a<C3971uy, C3972a> implements abn {
        private C3972a() {
            super(C3971uy.zzdiu);
        }

        /* synthetic */ C3972a(C3973uz uzVar) {
            this();
        }
    }

    static {
        aai.m15348a(C3971uy.class, zzdiu);
    }

    private C3971uy() {
    }

    /* renamed from: b */
    public static C3971uy m20045b() {
        return zzdiu;
    }

    /* renamed from: a */
    public final int mo13723a() {
        return this.zzdit;
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.uy>] */
    /* JADX WARNING: type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v11, types: [com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.uy>] */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r1v13, types: [com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.uy>, com.google.android.gms.internal.ads.aai$b] */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v12
      assigns: []
      uses: []
      mth insns count: 38
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
    public final java.lang.Object mo11474a(int r1, java.lang.Object r2, java.lang.Object r3) {
        /*
            r0 = this;
            int[] r2 = com.google.android.gms.internal.ads.C3973uz.f14984a
            r3 = 1
            int r1 = r1 - r3
            r1 = r2[r1]
            r2 = 0
            switch(r1) {
                case 1: goto L_0x0049;
                case 2: goto L_0x0043;
                case 3: goto L_0x0033;
                case 4: goto L_0x0030;
                case 5: goto L_0x0016;
                case 6: goto L_0x0011;
                case 7: goto L_0x0010;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
        L_0x0010:
            return r2
        L_0x0011:
            java.lang.Byte r1 = java.lang.Byte.valueOf(r3)
            return r1
        L_0x0016:
            com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.uy> r1 = zzakh
            if (r1 != 0) goto L_0x002f
            java.lang.Class<com.google.android.gms.internal.ads.uy> r2 = com.google.android.gms.internal.ads.C3971uy.class
            monitor-enter(r2)
            com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.uy> r1 = zzakh     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.aai$b r1 = new com.google.android.gms.internal.ads.aai$b     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.ads.uy r3 = zzdiu     // Catch:{ all -> 0x002c }
            r1.<init>(r3)     // Catch:{ all -> 0x002c }
            zzakh = r1     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            goto L_0x002f
        L_0x002c:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            throw r1
        L_0x002f:
            return r1
        L_0x0030:
            com.google.android.gms.internal.ads.uy r1 = zzdiu
            return r1
        L_0x0033:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r2 = 0
            java.lang.String r3 = "zzdit"
            r1[r2] = r3
            java.lang.String r2 = "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0000\u0000\u0001\u000b"
            com.google.android.gms.internal.ads.uy r3 = zzdiu
            java.lang.Object r1 = m15346a(r3, r2, r1)
            return r1
        L_0x0043:
            com.google.android.gms.internal.ads.uy$a r1 = new com.google.android.gms.internal.ads.uy$a
            r1.<init>(r2)
            return r1
        L_0x0049:
            com.google.android.gms.internal.ads.uy r1 = new com.google.android.gms.internal.ads.uy
            r1.<init>()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3971uy.mo11474a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
