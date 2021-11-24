package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aai.C3389a;
import com.google.android.gms.internal.ads.aai.C3393e;

/* renamed from: com.google.android.gms.internal.ads.uu */
public final class C3965uu extends aai<C3965uu, C3966a> implements abn {
    private static volatile abx<C3965uu> zzakh;
    /* access modifiers changed from: private */
    public static final C3965uu zzdiq = new C3965uu();
    private int zzdih;
    private C3971uy zzdio;
    private zzbah zzdip = zzbah.zzdpq;

    /* renamed from: com.google.android.gms.internal.ads.uu$a */
    public static final class C3966a extends C3389a<C3965uu, C3966a> implements abn {
        private C3966a() {
            super(C3965uu.zzdiq);
        }

        /* synthetic */ C3966a(C3967uv uvVar) {
            this();
        }

        /* renamed from: a */
        public final C3966a mo13718a(int i) {
            mo11489b();
            ((C3965uu) this.f11341a).m20027b(0);
            return this;
        }

        /* renamed from: a */
        public final C3966a mo13719a(C3971uy uyVar) {
            mo11489b();
            ((C3965uu) this.f11341a).m20026a(uyVar);
            return this;
        }

        /* renamed from: a */
        public final C3966a mo13720a(zzbah zzbah) {
            mo11489b();
            ((C3965uu) this.f11341a).m20028b(zzbah);
            return this;
        }
    }

    static {
        aai.m15348a(C3965uu.class, zzdiq);
    }

    private C3965uu() {
    }

    /* renamed from: a */
    public static C3965uu m20022a(zzbah zzbah) {
        return (C3965uu) aai.m15342a(zzdiq, zzbah);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20026a(C3971uy uyVar) {
        if (uyVar != null) {
            this.zzdio = uyVar;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m20027b(int i) {
        this.zzdih = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m20028b(zzbah zzbah) {
        if (zzbah != null) {
            this.zzdip = zzbah;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: d */
    public static C3966a m20029d() {
        return (C3966a) ((C3389a) zzdiq.mo11474a(C3393e.f11349e, (Object) null, (Object) null));
    }

    /* renamed from: e */
    public static C3965uu m20030e() {
        return zzdiq;
    }

    /* renamed from: a */
    public final int mo13715a() {
        return this.zzdih;
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.uu>] */
    /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.uu>] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.aai$b, com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.uu>] */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
      assigns: []
      uses: []
      mth insns count: 42
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
            int[] r3 = com.google.android.gms.internal.ads.C3967uv.f14982a
            r4 = 1
            int r2 = r2 - r4
            r2 = r3[r2]
            r3 = 0
            switch(r2) {
                case 1: goto L_0x0053;
                case 2: goto L_0x004d;
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
            com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.uu> r2 = zzakh
            if (r2 != 0) goto L_0x002f
            java.lang.Class<com.google.android.gms.internal.ads.uu> r3 = com.google.android.gms.internal.ads.C3965uu.class
            monitor-enter(r3)
            com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.uu> r2 = zzakh     // Catch:{ all -> 0x002c }
            if (r2 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.aai$b r2 = new com.google.android.gms.internal.ads.aai$b     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.ads.uu r4 = zzdiq     // Catch:{ all -> 0x002c }
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
            com.google.android.gms.internal.ads.uu r2 = zzdiq
            return r2
        L_0x0033:
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r0 = "zzdih"
            r2[r3] = r0
            java.lang.String r3 = "zzdio"
            r2[r4] = r3
            r3 = 2
            java.lang.String r4 = "zzdip"
            r2[r3] = r4
            java.lang.String r3 = "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n"
            com.google.android.gms.internal.ads.uu r4 = zzdiq
            java.lang.Object r2 = m15346a(r4, r3, r2)
            return r2
        L_0x004d:
            com.google.android.gms.internal.ads.uu$a r2 = new com.google.android.gms.internal.ads.uu$a
            r2.<init>(r3)
            return r2
        L_0x0053:
            com.google.android.gms.internal.ads.uu r2 = new com.google.android.gms.internal.ads.uu
            r2.<init>()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3965uu.mo11474a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: b */
    public final C3971uy mo13716b() {
        return this.zzdio == null ? C3971uy.m20045b() : this.zzdio;
    }

    /* renamed from: c */
    public final zzbah mo13717c() {
        return this.zzdip;
    }
}
