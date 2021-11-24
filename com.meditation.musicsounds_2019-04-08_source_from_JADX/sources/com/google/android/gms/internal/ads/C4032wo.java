package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aai.C3389a;
import com.google.android.gms.internal.ads.aai.C3393e;

/* renamed from: com.google.android.gms.internal.ads.wo */
public final class C4032wo extends aai<C4032wo, C4033a> implements abn {
    private static volatile abx<C4032wo> zzakh;
    /* access modifiers changed from: private */
    public static final C4032wo zzdlp = new C4032wo();
    private String zzdks = "";
    private String zzdll = "";
    private int zzdlm;
    private boolean zzdln;
    private String zzdlo = "";

    /* renamed from: com.google.android.gms.internal.ads.wo$a */
    public static final class C4033a extends C3389a<C4032wo, C4033a> implements abn {
        private C4033a() {
            super(C4032wo.zzdlp);
        }

        /* synthetic */ C4033a(C4034wp wpVar) {
            this();
        }

        /* renamed from: a */
        public final C4033a mo13782a(int i) {
            mo11489b();
            ((C4032wo) this.f11341a).m20210b(0);
            return this;
        }

        /* renamed from: a */
        public final C4033a mo13783a(String str) {
            mo11489b();
            ((C4032wo) this.f11341a).m20208a(str);
            return this;
        }

        /* renamed from: a */
        public final C4033a mo13784a(boolean z) {
            mo11489b();
            ((C4032wo) this.f11341a).m20209a(true);
            return this;
        }

        /* renamed from: b */
        public final C4033a mo13785b(String str) {
            mo11489b();
            ((C4032wo) this.f11341a).m20212b(str);
            return this;
        }

        /* renamed from: c */
        public final C4033a mo13786c(String str) {
            mo11489b();
            ((C4032wo) this.f11341a).m20214c(str);
            return this;
        }
    }

    static {
        aai.m15348a(C4032wo.class, zzdlp);
    }

    private C4032wo() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20208a(String str) {
        if (str != null) {
            this.zzdll = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20209a(boolean z) {
        this.zzdln = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m20210b(int i) {
        this.zzdlm = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m20212b(String str) {
        if (str != null) {
            this.zzdks = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m20214c(String str) {
        if (str != null) {
            this.zzdlo = str;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: f */
    public static C4033a m20215f() {
        return (C4033a) ((C3389a) zzdlp.mo11474a(C3393e.f11349e, (Object) null, (Object) null));
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.wo>] */
    /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.wo>] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.wo>, com.google.android.gms.internal.ads.aai$b] */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
      assigns: []
      uses: []
      mth insns count: 46
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
            int[] r3 = com.google.android.gms.internal.ads.C4034wp.f15012a
            r4 = 1
            int r2 = r2 - r4
            r2 = r3[r2]
            r3 = 0
            switch(r2) {
                case 1: goto L_0x005d;
                case 2: goto L_0x0057;
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
            com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.wo> r2 = zzakh
            if (r2 != 0) goto L_0x002f
            java.lang.Class<com.google.android.gms.internal.ads.wo> r3 = com.google.android.gms.internal.ads.C4032wo.class
            monitor-enter(r3)
            com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.wo> r2 = zzakh     // Catch:{ all -> 0x002c }
            if (r2 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.aai$b r2 = new com.google.android.gms.internal.ads.aai$b     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.ads.wo r4 = zzdlp     // Catch:{ all -> 0x002c }
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
            com.google.android.gms.internal.ads.wo r2 = zzdlp
            return r2
        L_0x0033:
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r0 = "zzdll"
            r2[r3] = r0
            java.lang.String r3 = "zzdks"
            r2[r4] = r3
            r3 = 2
            java.lang.String r4 = "zzdlm"
            r2[r3] = r4
            r3 = 3
            java.lang.String r4 = "zzdln"
            r2[r3] = r4
            r3 = 4
            java.lang.String r4 = "zzdlo"
            r2[r3] = r4
            java.lang.String r3 = "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ"
            com.google.android.gms.internal.ads.wo r4 = zzdlp
            java.lang.Object r2 = m15346a(r4, r3, r2)
            return r2
        L_0x0057:
            com.google.android.gms.internal.ads.wo$a r2 = new com.google.android.gms.internal.ads.wo$a
            r2.<init>(r3)
            return r2
        L_0x005d:
            com.google.android.gms.internal.ads.wo r2 = new com.google.android.gms.internal.ads.wo
            r2.<init>()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4032wo.mo11474a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: a */
    public final String mo13777a() {
        return this.zzdll;
    }

    /* renamed from: b */
    public final String mo13778b() {
        return this.zzdks;
    }

    /* renamed from: c */
    public final int mo13779c() {
        return this.zzdlm;
    }

    /* renamed from: d */
    public final boolean mo13780d() {
        return this.zzdln;
    }

    /* renamed from: e */
    public final String mo13781e() {
        return this.zzdlo;
    }
}
