package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aai.C3389a;
import com.google.android.gms.internal.ads.aai.C3393e;

public final class zzaxi extends aai<zzaxi, C4138a> implements abn {
    private static volatile abx<zzaxi> zzakh;
    /* access modifiers changed from: private */
    public static final zzaxi zzdkv = new zzaxi();
    private String zzdks = "";
    private zzbah zzdkt = zzbah.zzdpq;
    private int zzdku;

    /* renamed from: com.google.android.gms.internal.ads.zzaxi$a */
    public static final class C4138a extends C3389a<zzaxi, C4138a> implements abn {
        private C4138a() {
            super(zzaxi.zzdkv);
        }

        /* synthetic */ C4138a(C4026wj wjVar) {
            this();
        }

        /* renamed from: a */
        public final C4138a mo13901a(zzb zzb) {
            mo11489b();
            ((zzaxi) this.f11341a).m20622a(zzb);
            return this;
        }

        /* renamed from: a */
        public final C4138a mo13902a(zzbah zzbah) {
            mo11489b();
            ((zzaxi) this.f11341a).m20626a(zzbah);
            return this;
        }

        /* renamed from: a */
        public final C4138a mo13903a(String str) {
            mo11489b();
            ((zzaxi) this.f11341a).m20627a(str);
            return this;
        }
    }

    public enum zzb implements aal {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        

        /* renamed from: a */
        private static final aam<zzb> f15381a = null;
        private final int value;

        static {
            f15381a = new C4027wk();
        }

        private zzb(int i) {
            this.value = i;
        }

        public static zzb zzaw(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_KEYMATERIAL;
                case 1:
                    return SYMMETRIC;
                case 2:
                    return ASYMMETRIC_PRIVATE;
                case 3:
                    return ASYMMETRIC_PUBLIC;
                case 4:
                    return REMOTE;
                default:
                    return null;
            }
        }

        public final int zzhq() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        aai.m15348a(zzaxi.class, zzdkv);
    }

    private zzaxi() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20622a(zzb zzb2) {
        if (zzb2 != null) {
            this.zzdku = zzb2.zzhq();
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20626a(zzbah zzbah) {
        if (zzbah != null) {
            this.zzdkt = zzbah;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20627a(String str) {
        if (str != null) {
            this.zzdks = str;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: d */
    public static C4138a m20628d() {
        return (C4138a) ((C3389a) zzdkv.mo11474a(C3393e.f11349e, (Object) null, (Object) null));
    }

    /* renamed from: e */
    public static zzaxi m20629e() {
        return zzdkv;
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.zzaxi>] */
    /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.zzaxi>] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.zzaxi>, com.google.android.gms.internal.ads.aai$b] */
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
            int[] r3 = com.google.android.gms.internal.ads.C4026wj.f15010a
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
            com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.zzaxi> r2 = zzakh
            if (r2 != 0) goto L_0x002f
            java.lang.Class<com.google.android.gms.internal.ads.zzaxi> r3 = com.google.android.gms.internal.ads.zzaxi.class
            monitor-enter(r3)
            com.google.android.gms.internal.ads.abx<com.google.android.gms.internal.ads.zzaxi> r2 = zzakh     // Catch:{ all -> 0x002c }
            if (r2 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.aai$b r2 = new com.google.android.gms.internal.ads.aai$b     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.ads.zzaxi r4 = zzdkv     // Catch:{ all -> 0x002c }
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
            com.google.android.gms.internal.ads.zzaxi r2 = zzdkv
            return r2
        L_0x0033:
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r0 = "zzdks"
            r2[r3] = r0
            java.lang.String r3 = "zzdkt"
            r2[r4] = r3
            r3 = 2
            java.lang.String r4 = "zzdku"
            r2[r3] = r4
            java.lang.String r3 = "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f"
            com.google.android.gms.internal.ads.zzaxi r4 = zzdkv
            java.lang.Object r2 = m15346a(r4, r3, r2)
            return r2
        L_0x004d:
            com.google.android.gms.internal.ads.zzaxi$a r2 = new com.google.android.gms.internal.ads.zzaxi$a
            r2.<init>(r3)
            return r2
        L_0x0053:
            com.google.android.gms.internal.ads.zzaxi r2 = new com.google.android.gms.internal.ads.zzaxi
            r2.<init>()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaxi.mo11474a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: a */
    public final String mo13898a() {
        return this.zzdks;
    }

    /* renamed from: b */
    public final zzbah mo13899b() {
        return this.zzdkt;
    }

    /* renamed from: c */
    public final zzb mo13900c() {
        zzb zzaw = zzb.zzaw(this.zzdku);
        return zzaw == null ? zzb.UNRECOGNIZED : zzaw;
    }
}
