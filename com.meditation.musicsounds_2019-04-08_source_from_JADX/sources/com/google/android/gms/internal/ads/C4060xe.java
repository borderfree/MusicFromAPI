package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aai.C3389a;
import com.google.android.gms.internal.ads.aai.C3393e;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.xe */
public final class C4060xe extends aai<C4060xe, C4061a> implements abn {
    private static volatile abx<C4060xe> zzakh;
    /* access modifiers changed from: private */
    public static final C4060xe zzdmt = new C4060xe();
    private int zzdlq;
    private String zzdmr = "";
    private aan<C4032wo> zzdms = m15351m();

    /* renamed from: com.google.android.gms.internal.ads.xe$a */
    public static final class C4061a extends C3389a<C4060xe, C4061a> implements abn {
        private C4061a() {
            super(C4060xe.zzdmt);
        }

        /* synthetic */ C4061a(C4062xf xfVar) {
            this();
        }

        /* renamed from: a */
        public final C4061a mo13813a(C4032wo woVar) {
            mo11489b();
            ((C4060xe) this.f11341a).m20304a(woVar);
            return this;
        }

        /* renamed from: a */
        public final C4061a mo13814a(String str) {
            mo11489b();
            ((C4060xe) this.f11341a).m20307a(str);
            return this;
        }
    }

    static {
        aai.m15348a(C4060xe.class, zzdmt);
    }

    private C4060xe() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20304a(C4032wo woVar) {
        if (woVar != null) {
            if (!this.zzdms.mo11501a()) {
                aan<C4032wo> aan = this.zzdms;
                int size = aan.size();
                this.zzdms = aan.mo11460a(size == 0 ? 10 : size << 1);
            }
            this.zzdms.add(woVar);
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20307a(String str) {
        if (str != null) {
            this.zzdmr = str;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: b */
    public static C4061a m20308b() {
        return (C4061a) ((C3389a) zzdmt.mo11474a(C3393e.f11349e, (Object) null, (Object) null));
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.xe>] */
    /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.xe>] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.xe>, com.google.android.gms.internal.ads.aai$b] */
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
            int[] r3 = com.google.android.gms.internal.ads.C4062xf.f15024a
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
            com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.xe> r2 = zzakh
            if (r2 != 0) goto L_0x002f
            java.lang.Class<com.google.android.gms.internal.ads.xe> r3 = com.google.android.gms.internal.ads.C4060xe.class
            monitor-enter(r3)
            com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.xe> r2 = zzakh     // Catch:{ all -> 0x002c }
            if (r2 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.aai$b r2 = new com.google.android.gms.internal.ads.aai$b     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.ads.xe r4 = zzdmt     // Catch:{ all -> 0x002c }
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
            com.google.android.gms.internal.ads.xe r2 = zzdmt
            return r2
        L_0x0033:
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r0 = "zzdlq"
            r2[r3] = r0
            java.lang.String r3 = "zzdmr"
            r2[r4] = r3
            r3 = 2
            java.lang.String r4 = "zzdms"
            r2[r3] = r4
            r3 = 3
            java.lang.Class<com.google.android.gms.internal.ads.wo> r4 = com.google.android.gms.internal.ads.C4032wo.class
            r2[r3] = r4
            java.lang.String r3 = "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b"
            com.google.android.gms.internal.ads.xe r4 = zzdmt
            java.lang.Object r2 = m15346a(r4, r3, r2)
            return r2
        L_0x0052:
            com.google.android.gms.internal.ads.xe$a r2 = new com.google.android.gms.internal.ads.xe$a
            r2.<init>(r3)
            return r2
        L_0x0058:
            com.google.android.gms.internal.ads.xe r2 = new com.google.android.gms.internal.ads.xe
            r2.<init>()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4060xe.mo11474a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: a */
    public final List<C4032wo> mo13812a() {
        return this.zzdms;
    }
}
