package com.google.android.gms.internal.ads;

public abstract class anr extends ahn implements anq {
    public anr() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [com.google.android.gms.internal.ads.ank] */
    /* JADX WARNING: type inference failed for: r4v4, types: [com.google.android.gms.internal.ads.anm] */
    /* JADX WARNING: type inference failed for: r4v6, types: [com.google.android.gms.internal.ads.ank] */
    /* JADX WARNING: type inference failed for: r4v9, types: [com.google.android.gms.internal.ads.aok] */
    /* JADX WARNING: type inference failed for: r4v11, types: [com.google.android.gms.internal.ads.aom] */
    /* JADX WARNING: type inference failed for: r4v13, types: [com.google.android.gms.internal.ads.aok] */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v1
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.google.android.gms.internal.ads.aom, com.google.android.gms.internal.ads.anm, com.google.android.gms.internal.ads.ank, com.google.android.gms.internal.ads.aok]
      uses: [com.google.android.gms.internal.ads.ank, com.google.android.gms.internal.ads.aok]
      mth insns count: 61
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
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
        /*
            r0 = this;
            r4 = 0
            switch(r1) {
                case 1: goto L_0x00af;
                case 2: goto L_0x0091;
                case 3: goto L_0x0082;
                case 4: goto L_0x0076;
                case 5: goto L_0x005e;
                case 6: goto L_0x0052;
                case 7: goto L_0x0034;
                case 8: goto L_0x0020;
                case 9: goto L_0x0013;
                case 10: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r1 = 0
            return r1
        L_0x0006:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.auo r1 = com.google.android.gms.internal.ads.aup.m17405a(r1)
            r0.zza(r1)
            goto L_0x008d
        L_0x0013:
            android.os.Parcelable$Creator<com.google.android.gms.ads.formats.PublisherAdViewOptions> r1 = com.google.android.gms.ads.formats.PublisherAdViewOptions.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.aho.m16238a(r2, r1)
            com.google.android.gms.ads.formats.PublisherAdViewOptions r1 = (com.google.android.gms.ads.formats.PublisherAdViewOptions) r1
            r0.zza(r1)
            goto L_0x008d
        L_0x0020:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.aul r1 = com.google.android.gms.internal.ads.aum.m17402a(r1)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzjn> r4 = com.google.android.gms.internal.ads.zzjn.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.aho.m16238a(r2, r4)
            com.google.android.gms.internal.ads.zzjn r2 = (com.google.android.gms.internal.ads.zzjn) r2
            r0.zza(r1, r2)
            goto L_0x008d
        L_0x0034:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x003b
            goto L_0x004e
        L_0x003b:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.aok
            if (r4 == 0) goto L_0x0049
            r4 = r2
            com.google.android.gms.internal.ads.aok r4 = (com.google.android.gms.internal.ads.aok) r4
            goto L_0x004e
        L_0x0049:
            com.google.android.gms.internal.ads.aom r4 = new com.google.android.gms.internal.ads.aom
            r4.<init>(r1)
        L_0x004e:
            r0.zzb(r4)
            goto L_0x008d
        L_0x0052:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzpl> r1 = com.google.android.gms.internal.ads.zzpl.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.aho.m16238a(r2, r1)
            com.google.android.gms.internal.ads.zzpl r1 = (com.google.android.gms.internal.ads.zzpl) r1
            r0.zza(r1)
            goto L_0x008d
        L_0x005e:
            java.lang.String r1 = r2.readString()
            android.os.IBinder r4 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.aui r4 = com.google.android.gms.internal.ads.auj.m17399a(r4)
            android.os.IBinder r2 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.auf r2 = com.google.android.gms.internal.ads.aug.m17396a(r2)
            r0.zza(r1, r4, r2)
            goto L_0x008d
        L_0x0076:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.aub r1 = com.google.android.gms.internal.ads.aud.m17393a(r1)
            r0.zza(r1)
            goto L_0x008d
        L_0x0082:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.aty r1 = com.google.android.gms.internal.ads.atz.m17363a(r1)
            r0.zza(r1)
        L_0x008d:
            r3.writeNoException()
            goto L_0x00b9
        L_0x0091:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0098
            goto L_0x00ab
        L_0x0098:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.ank
            if (r4 == 0) goto L_0x00a6
            r4 = r2
            com.google.android.gms.internal.ads.ank r4 = (com.google.android.gms.internal.ads.ank) r4
            goto L_0x00ab
        L_0x00a6:
            com.google.android.gms.internal.ads.anm r4 = new com.google.android.gms.internal.ads.anm
            r4.<init>(r1)
        L_0x00ab:
            r0.zzb(r4)
            goto L_0x008d
        L_0x00af:
            com.google.android.gms.internal.ads.ann r1 = r0.zzdh()
            r3.writeNoException()
            com.google.android.gms.internal.ads.aho.m16239a(r3, r1)
        L_0x00b9:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.anr.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
