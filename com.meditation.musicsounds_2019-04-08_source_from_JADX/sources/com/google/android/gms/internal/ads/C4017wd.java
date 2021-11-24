package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aai.C3389a;
import com.google.android.gms.internal.ads.aai.C3393e;

/* renamed from: com.google.android.gms.internal.ads.wd */
public final class C4017wd extends aai<C4017wd, C4018a> implements abn {
    private static volatile abx<C4017wd> zzakh;
    /* access modifiers changed from: private */
    public static final C4017wd zzdkn = new C4017wd();
    private int zzdih;
    private zzbah zzdip = zzbah.zzdpq;
    private C4023wh zzdkm;

    /* renamed from: com.google.android.gms.internal.ads.wd$a */
    public static final class C4018a extends C3389a<C4017wd, C4018a> implements abn {
        private C4018a() {
            super(C4017wd.zzdkn);
        }

        /* synthetic */ C4018a(C4019we weVar) {
            this();
        }

        /* renamed from: a */
        public final C4018a mo13768a(int i) {
            mo11489b();
            ((C4017wd) this.f11341a).m20175b(0);
            return this;
        }

        /* renamed from: a */
        public final C4018a mo13769a(C4023wh whVar) {
            mo11489b();
            ((C4017wd) this.f11341a).m20174a(whVar);
            return this;
        }

        /* renamed from: a */
        public final C4018a mo13770a(zzbah zzbah) {
            mo11489b();
            ((C4017wd) this.f11341a).m20176b(zzbah);
            return this;
        }
    }

    static {
        aai.m15348a(C4017wd.class, zzdkn);
    }

    private C4017wd() {
    }

    /* renamed from: a */
    public static C4017wd m20170a(zzbah zzbah) {
        return (C4017wd) aai.m15342a(zzdkn, zzbah);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20174a(C4023wh whVar) {
        if (whVar != null) {
            this.zzdkm = whVar;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m20175b(int i) {
        this.zzdih = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m20176b(zzbah zzbah) {
        if (zzbah != null) {
            this.zzdip = zzbah;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: d */
    public static C4018a m20177d() {
        return (C4018a) ((C3389a) zzdkn.mo11474a(C3393e.f11349e, (Object) null, (Object) null));
    }

    /* renamed from: e */
    public static C4017wd m20178e() {
        return zzdkn;
    }

    /* renamed from: a */
    public final int mo13765a() {
        return this.zzdih;
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.wd>] */
    /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.wd>] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.wd>, com.google.android.gms.internal.ads.aai$b] */
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
            int[] r3 = com.google.android.gms.internal.ads.C4019we.f15007a
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
            com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.wd> r2 = zzakh
            if (r2 != 0) goto L_0x002f
            java.lang.Class<com.google.android.gms.internal.ads.wd> r3 = com.google.android.gms.internal.ads.C4017wd.class
            monitor-enter(r3)
            com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.wd> r2 = zzakh     // Catch:{ all -> 0x002c }
            if (r2 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.aai$b r2 = new com.google.android.gms.internal.ads.aai$b     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.ads.wd r4 = zzdkn     // Catch:{ all -> 0x002c }
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
            com.google.android.gms.internal.ads.wd r2 = zzdkn
            return r2
        L_0x0033:
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r0 = "zzdih"
            r2[r3] = r0
            java.lang.String r3 = "zzdkm"
            r2[r4] = r3
            r3 = 2
            java.lang.String r4 = "zzdip"
            r2[r3] = r4
            java.lang.String r3 = "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n"
            com.google.android.gms.internal.ads.wd r4 = zzdkn
            java.lang.Object r2 = m15346a(r4, r3, r2)
            return r2
        L_0x004d:
            com.google.android.gms.internal.ads.wd$a r2 = new com.google.android.gms.internal.ads.wd$a
            r2.<init>(r3)
            return r2
        L_0x0053:
            com.google.android.gms.internal.ads.wd r2 = new com.google.android.gms.internal.ads.wd
            r2.<init>()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4017wd.mo11474a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: b */
    public final C4023wh mo13766b() {
        return this.zzdkm == null ? C4023wh.m20193c() : this.zzdkm;
    }

    /* renamed from: c */
    public final zzbah mo13767c() {
        return this.zzdip;
    }
}
