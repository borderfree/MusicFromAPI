package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class anw extends ahn implements anv {
    public anw() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static anv zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return queryLocalInterface instanceof anv ? (anv) queryLocalInterface : new anx(iBinder);
    }

    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [com.google.android.gms.internal.ads.ank] */
    /* JADX WARNING: type inference failed for: r4v4, types: [com.google.android.gms.internal.ads.anm] */
    /* JADX WARNING: type inference failed for: r4v6, types: [com.google.android.gms.internal.ads.ank] */
    /* JADX WARNING: type inference failed for: r4v7, types: [com.google.android.gms.internal.ads.aoe] */
    /* JADX WARNING: type inference failed for: r4v9, types: [com.google.android.gms.internal.ads.aog] */
    /* JADX WARNING: type inference failed for: r4v11, types: [com.google.android.gms.internal.ads.aoe] */
    /* JADX WARNING: type inference failed for: r4v12, types: [com.google.android.gms.internal.ads.anh] */
    /* JADX WARNING: type inference failed for: r4v14, types: [com.google.android.gms.internal.ads.anj] */
    /* JADX WARNING: type inference failed for: r4v16, types: [com.google.android.gms.internal.ads.anh] */
    /* JADX WARNING: type inference failed for: r4v17, types: [com.google.android.gms.internal.ads.aok] */
    /* JADX WARNING: type inference failed for: r4v19, types: [com.google.android.gms.internal.ads.aom] */
    /* JADX WARNING: type inference failed for: r4v21, types: [com.google.android.gms.internal.ads.aok] */
    /* JADX WARNING: type inference failed for: r4v22, types: [com.google.android.gms.internal.ads.aoa] */
    /* JADX WARNING: type inference failed for: r4v24, types: [com.google.android.gms.internal.ads.aoc] */
    /* JADX WARNING: type inference failed for: r4v26, types: [com.google.android.gms.internal.ads.aoa] */
    /* JADX WARNING: type inference failed for: r4v27 */
    /* JADX WARNING: type inference failed for: r4v28 */
    /* JADX WARNING: type inference failed for: r4v29 */
    /* JADX WARNING: type inference failed for: r4v30 */
    /* JADX WARNING: type inference failed for: r4v31 */
    /* JADX WARNING: type inference failed for: r4v32 */
    /* JADX WARNING: type inference failed for: r4v33 */
    /* JADX WARNING: type inference failed for: r4v34 */
    /* JADX WARNING: type inference failed for: r4v35 */
    /* JADX WARNING: type inference failed for: r4v36 */
    /* JADX INFO: used method not loaded: com.google.android.gms.internal.ads.aho.a(android.os.Parcel, boolean):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.google.android.gms.internal.ads.aho.a(android.os.Parcel, android.os.IInterface):null, types can be incorrect */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e0, code lost:
        r3.writeNoException();
        r3.writeString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0117, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.aho.m16244b(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0182, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.aho.m16241a(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x018c, code lost:
        r3.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0194, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.aho.m16239a(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x019b, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v1
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.google.android.gms.internal.ads.aog, com.google.android.gms.internal.ads.anm, com.google.android.gms.internal.ads.ank, com.google.android.gms.internal.ads.aoe, com.google.android.gms.internal.ads.anj, com.google.android.gms.internal.ads.anh, com.google.android.gms.internal.ads.aom, com.google.android.gms.internal.ads.aok, com.google.android.gms.internal.ads.aoc, com.google.android.gms.internal.ads.aoa]
      uses: [com.google.android.gms.internal.ads.ank, com.google.android.gms.internal.ads.aoe, com.google.android.gms.internal.ads.anh, com.google.android.gms.internal.ads.aok, com.google.android.gms.internal.ads.aoa]
      mth insns count: 125
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
    /* JADX WARNING: Unknown variable types count: 11 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
        /*
            r0 = this;
            r4 = 0
            switch(r1) {
                case 1: goto L_0x0190;
                case 2: goto L_0x0189;
                case 3: goto L_0x017e;
                case 4: goto L_0x0171;
                case 5: goto L_0x016d;
                case 6: goto L_0x0169;
                case 7: goto L_0x014b;
                case 8: goto L_0x012d;
                case 9: goto L_0x0129;
                case 10: goto L_0x0124;
                case 11: goto L_0x011f;
                case 12: goto L_0x0113;
                case 13: goto L_0x0106;
                case 14: goto L_0x00f9;
                case 15: goto L_0x00e8;
                case 16: goto L_0x0004;
                case 17: goto L_0x0004;
                case 18: goto L_0x00dc;
                case 19: goto L_0x00cf;
                case 20: goto L_0x00b0;
                case 21: goto L_0x0091;
                case 22: goto L_0x0088;
                case 23: goto L_0x0082;
                case 24: goto L_0x0075;
                case 25: goto L_0x006c;
                case 26: goto L_0x0066;
                case 27: goto L_0x0004;
                case 28: goto L_0x0004;
                case 29: goto L_0x0059;
                case 30: goto L_0x004c;
                case 31: goto L_0x0046;
                case 32: goto L_0x0040;
                case 33: goto L_0x003a;
                case 34: goto L_0x0031;
                case 35: goto L_0x002b;
                case 36: goto L_0x000c;
                case 37: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r1 = 0
            return r1
        L_0x0006:
            android.os.Bundle r1 = r0.zzba()
            goto L_0x0117
        L_0x000c:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0013
            goto L_0x0026
        L_0x0013:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdMetadataListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.aoa
            if (r4 == 0) goto L_0x0021
            r4 = r2
            com.google.android.gms.internal.ads.aoa r4 = (com.google.android.gms.internal.ads.aoa) r4
            goto L_0x0026
        L_0x0021:
            com.google.android.gms.internal.ads.aoc r4 = new com.google.android.gms.internal.ads.aoc
            r4.<init>(r1)
        L_0x0026:
            r0.zza(r4)
            goto L_0x018c
        L_0x002b:
            java.lang.String r1 = r0.zzck()
            goto L_0x00e0
        L_0x0031:
            boolean r1 = com.google.android.gms.internal.ads.aho.m16242a(r2)
            r0.setImmersiveMode(r1)
            goto L_0x018c
        L_0x003a:
            com.google.android.gms.internal.ads.ank r1 = r0.zzbx()
            goto L_0x0194
        L_0x0040:
            com.google.android.gms.internal.ads.aoe r1 = r0.zzbw()
            goto L_0x0194
        L_0x0046:
            java.lang.String r1 = r0.getAdUnitId()
            goto L_0x00e0
        L_0x004c:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzlu> r1 = com.google.android.gms.internal.ads.zzlu.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.aho.m16238a(r2, r1)
            com.google.android.gms.internal.ads.zzlu r1 = (com.google.android.gms.internal.ads.zzlu) r1
            r0.zza(r1)
            goto L_0x018c
        L_0x0059:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzmu> r1 = com.google.android.gms.internal.ads.zzmu.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.aho.m16238a(r2, r1)
            com.google.android.gms.internal.ads.zzmu r1 = (com.google.android.gms.internal.ads.zzmu) r1
            r0.zza(r1)
            goto L_0x018c
        L_0x0066:
            com.google.android.gms.internal.ads.aos r1 = r0.getVideoController()
            goto L_0x0194
        L_0x006c:
            java.lang.String r1 = r2.readString()
            r0.setUserId(r1)
            goto L_0x018c
        L_0x0075:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.gb r1 = com.google.android.gms.internal.ads.C3567gc.m18499a(r1)
            r0.zza(r1)
            goto L_0x018c
        L_0x0082:
            boolean r1 = r0.isLoading()
            goto L_0x0182
        L_0x0088:
            boolean r1 = com.google.android.gms.internal.ads.aho.m16242a(r2)
            r0.setManualImpressionsEnabled(r1)
            goto L_0x018c
        L_0x0091:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0098
            goto L_0x00ab
        L_0x0098:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.aok
            if (r4 == 0) goto L_0x00a6
            r4 = r2
            com.google.android.gms.internal.ads.aok r4 = (com.google.android.gms.internal.ads.aok) r4
            goto L_0x00ab
        L_0x00a6:
            com.google.android.gms.internal.ads.aom r4 = new com.google.android.gms.internal.ads.aom
            r4.<init>(r1)
        L_0x00ab:
            r0.zza(r4)
            goto L_0x018c
        L_0x00b0:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x00b7
            goto L_0x00ca
        L_0x00b7:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdClickListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.anh
            if (r4 == 0) goto L_0x00c5
            r4 = r2
            com.google.android.gms.internal.ads.anh r4 = (com.google.android.gms.internal.ads.anh) r4
            goto L_0x00ca
        L_0x00c5:
            com.google.android.gms.internal.ads.anj r4 = new com.google.android.gms.internal.ads.anj
            r4.<init>(r1)
        L_0x00ca:
            r0.zza(r4)
            goto L_0x018c
        L_0x00cf:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.arf r1 = com.google.android.gms.internal.ads.arg.m16978a(r1)
            r0.zza(r1)
            goto L_0x018c
        L_0x00dc:
            java.lang.String r1 = r0.getMediationAdapterClassName()
        L_0x00e0:
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x019a
        L_0x00e8:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.ae r1 = com.google.android.gms.internal.ads.C3403af.m16090a(r1)
            java.lang.String r2 = r2.readString()
            r0.zza(r1, r2)
            goto L_0x018c
        L_0x00f9:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.x r1 = com.google.android.gms.internal.ads.C4083y.m20350a(r1)
            r0.zza(r1)
            goto L_0x018c
        L_0x0106:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzjn> r1 = com.google.android.gms.internal.ads.zzjn.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.aho.m16238a(r2, r1)
            com.google.android.gms.internal.ads.zzjn r1 = (com.google.android.gms.internal.ads.zzjn) r1
            r0.zza(r1)
            goto L_0x018c
        L_0x0113:
            com.google.android.gms.internal.ads.zzjn r1 = r0.zzbk()
        L_0x0117:
            r3.writeNoException()
            com.google.android.gms.internal.ads.aho.m16244b(r3, r1)
            goto L_0x019a
        L_0x011f:
            r0.zzbm()
            goto L_0x018c
        L_0x0124:
            r0.stopLoading()
            goto L_0x018c
        L_0x0129:
            r0.showInterstitial()
            goto L_0x018c
        L_0x012d:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0134
            goto L_0x0147
        L_0x0134:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAppEventListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.aoe
            if (r4 == 0) goto L_0x0142
            r4 = r2
            com.google.android.gms.internal.ads.aoe r4 = (com.google.android.gms.internal.ads.aoe) r4
            goto L_0x0147
        L_0x0142:
            com.google.android.gms.internal.ads.aog r4 = new com.google.android.gms.internal.ads.aog
            r4.<init>(r1)
        L_0x0147:
            r0.zza(r4)
            goto L_0x018c
        L_0x014b:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0152
            goto L_0x0165
        L_0x0152:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.ank
            if (r4 == 0) goto L_0x0160
            r4 = r2
            com.google.android.gms.internal.ads.ank r4 = (com.google.android.gms.internal.ads.ank) r4
            goto L_0x0165
        L_0x0160:
            com.google.android.gms.internal.ads.anm r4 = new com.google.android.gms.internal.ads.anm
            r4.<init>(r1)
        L_0x0165:
            r0.zza(r4)
            goto L_0x018c
        L_0x0169:
            r0.resume()
            goto L_0x018c
        L_0x016d:
            r0.pause()
            goto L_0x018c
        L_0x0171:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzjj> r1 = com.google.android.gms.internal.ads.zzjj.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.aho.m16238a(r2, r1)
            com.google.android.gms.internal.ads.zzjj r1 = (com.google.android.gms.internal.ads.zzjj) r1
            boolean r1 = r0.zzb(r1)
            goto L_0x0182
        L_0x017e:
            boolean r1 = r0.isReady()
        L_0x0182:
            r3.writeNoException()
            com.google.android.gms.internal.ads.aho.m16241a(r3, r1)
            goto L_0x019a
        L_0x0189:
            r0.destroy()
        L_0x018c:
            r3.writeNoException()
            goto L_0x019a
        L_0x0190:
            com.google.android.gms.dynamic.b r1 = r0.zzbj()
        L_0x0194:
            r3.writeNoException()
            com.google.android.gms.internal.ads.aho.m16239a(r3, r1)
        L_0x019a:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.anw.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
