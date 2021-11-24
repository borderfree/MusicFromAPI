package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class bcr extends ahn implements bcq {
    public bcr() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    /* renamed from: a */
    public static bcq m18169a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof bcq ? (bcq) queryLocalInterface : new bcs(iBinder);
    }

    /* JADX WARNING: type inference failed for: r12v1 */
    /* JADX WARNING: type inference failed for: r12v2, types: [com.google.android.gms.internal.ads.bct] */
    /* JADX WARNING: type inference failed for: r12v5, types: [com.google.android.gms.internal.ads.bcu] */
    /* JADX WARNING: type inference failed for: r12v6, types: [com.google.android.gms.internal.ads.bct] */
    /* JADX WARNING: type inference failed for: r12v9, types: [com.google.android.gms.internal.ads.bcn] */
    /* JADX WARNING: type inference failed for: r12v10, types: [com.google.android.gms.internal.ads.bcm] */
    /* JADX WARNING: type inference failed for: r12v11 */
    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.internal.ads.bcm] */
    /* JADX WARNING: type inference failed for: r12v14, types: [com.google.android.gms.internal.ads.bcp] */
    /* JADX WARNING: type inference failed for: r12v15, types: [com.google.android.gms.internal.ads.bco] */
    /* JADX WARNING: type inference failed for: r12v16 */
    /* JADX WARNING: type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.bco] */
    /* JADX WARNING: type inference failed for: r12v17 */
    /* JADX WARNING: type inference failed for: r12v18 */
    /* JADX WARNING: type inference failed for: r12v19 */
    /* JADX WARNING: type inference failed for: r12v20 */
    /* JADX WARNING: type inference failed for: r12v21 */
    /* JADX WARNING: type inference failed for: r12v22 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00af, code lost:
        r11.writeNoException();
        com.google.android.gms.internal.ads.aho.m16244b(r11, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e9, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        r11.writeNoException();
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r12v1
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.google.android.gms.internal.ads.bcn, com.google.android.gms.internal.ads.bcu, com.google.android.gms.internal.ads.bct, com.google.android.gms.internal.ads.bcm, com.google.android.gms.internal.ads.bcp, com.google.android.gms.internal.ads.bco]
      uses: [com.google.android.gms.internal.ads.bct, ?[OBJECT, ARRAY]]
      mth insns count: 80
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
    /* JADX WARNING: Unknown variable types count: 9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r9, android.os.Parcel r10, android.os.Parcel r11, int r12) {
        /*
            r8 = this;
            r12 = 0
            switch(r9) {
                case 1: goto L_0x00b6;
                case 2: goto L_0x00ab;
                case 3: goto L_0x00a6;
                case 4: goto L_0x005b;
                case 5: goto L_0x004f;
                case 6: goto L_0x000e;
                case 7: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r9 = 0
            return r9
        L_0x0006:
            r8.mo12800d()
        L_0x0009:
            r11.writeNoException()
            goto L_0x00e8
        L_0x000e:
            byte[] r1 = r10.createByteArray()
            java.lang.String r2 = r10.readString()
            android.os.Parcelable$Creator r9 = android.os.Bundle.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.ads.aho.m16238a(r10, r9)
            r3 = r9
            android.os.Bundle r3 = (android.os.Bundle) r3
            android.os.IBinder r9 = r10.readStrongBinder()
            com.google.android.gms.dynamic.b r4 = com.google.android.gms.dynamic.C3323b.C3324a.m15129a(r9)
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 != 0) goto L_0x002f
        L_0x002d:
            r5 = r12
            goto L_0x0042
        L_0x002f:
            java.lang.String r12 = "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback"
            android.os.IInterface r12 = r9.queryLocalInterface(r12)
            boolean r0 = r12 instanceof com.google.android.gms.internal.ads.bco
            if (r0 == 0) goto L_0x003c
            com.google.android.gms.internal.ads.bco r12 = (com.google.android.gms.internal.ads.bco) r12
            goto L_0x002d
        L_0x003c:
            com.google.android.gms.internal.ads.bcp r12 = new com.google.android.gms.internal.ads.bcp
            r12.<init>(r9)
            goto L_0x002d
        L_0x0042:
            android.os.IBinder r9 = r10.readStrongBinder()
            com.google.android.gms.internal.ads.bay r6 = com.google.android.gms.internal.ads.baz.m17877a(r9)
            r0 = r8
            r0.mo12797a(r1, r2, r3, r4, r5, r6)
            goto L_0x0009
        L_0x004f:
            com.google.android.gms.internal.ads.aos r9 = r8.mo12799c()
            r11.writeNoException()
            com.google.android.gms.internal.ads.aho.m16239a(r11, r9)
            goto L_0x00e8
        L_0x005b:
            byte[] r1 = r10.createByteArray()
            java.lang.String r2 = r10.readString()
            android.os.Parcelable$Creator r9 = android.os.Bundle.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.ads.aho.m16238a(r10, r9)
            r3 = r9
            android.os.Bundle r3 = (android.os.Bundle) r3
            android.os.IBinder r9 = r10.readStrongBinder()
            com.google.android.gms.dynamic.b r4 = com.google.android.gms.dynamic.C3323b.C3324a.m15129a(r9)
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 != 0) goto L_0x007c
        L_0x007a:
            r5 = r12
            goto L_0x008f
        L_0x007c:
            java.lang.String r12 = "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback"
            android.os.IInterface r12 = r9.queryLocalInterface(r12)
            boolean r0 = r12 instanceof com.google.android.gms.internal.ads.bcm
            if (r0 == 0) goto L_0x0089
            com.google.android.gms.internal.ads.bcm r12 = (com.google.android.gms.internal.ads.bcm) r12
            goto L_0x007a
        L_0x0089:
            com.google.android.gms.internal.ads.bcn r12 = new com.google.android.gms.internal.ads.bcn
            r12.<init>(r9)
            goto L_0x007a
        L_0x008f:
            android.os.IBinder r9 = r10.readStrongBinder()
            com.google.android.gms.internal.ads.bay r6 = com.google.android.gms.internal.ads.baz.m17877a(r9)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzjn> r9 = com.google.android.gms.internal.ads.zzjn.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.ads.aho.m16238a(r10, r9)
            r7 = r9
            com.google.android.gms.internal.ads.zzjn r7 = (com.google.android.gms.internal.ads.zzjn) r7
            r0 = r8
            r0.mo12796a(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0009
        L_0x00a6:
            com.google.android.gms.internal.ads.zzzt r9 = r8.mo12798b()
            goto L_0x00af
        L_0x00ab:
            com.google.android.gms.internal.ads.zzzt r9 = r8.mo12794a()
        L_0x00af:
            r11.writeNoException()
            com.google.android.gms.internal.ads.aho.m16244b(r11, r9)
            goto L_0x00e8
        L_0x00b6:
            android.os.IBinder r9 = r10.readStrongBinder()
            com.google.android.gms.dynamic.b r9 = com.google.android.gms.dynamic.C3323b.C3324a.m15129a(r9)
            java.lang.String r0 = r10.readString()
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.aho.m16238a(r10, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            android.os.IBinder r10 = r10.readStrongBinder()
            if (r10 != 0) goto L_0x00d1
            goto L_0x00e3
        L_0x00d1:
            java.lang.String r12 = "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback"
            android.os.IInterface r12 = r10.queryLocalInterface(r12)
            boolean r2 = r12 instanceof com.google.android.gms.internal.ads.bct
            if (r2 == 0) goto L_0x00de
            com.google.android.gms.internal.ads.bct r12 = (com.google.android.gms.internal.ads.bct) r12
            goto L_0x00e3
        L_0x00de:
            com.google.android.gms.internal.ads.bcu r12 = new com.google.android.gms.internal.ads.bcu
            r12.<init>(r10)
        L_0x00e3:
            r8.mo12795a(r9, r0, r1, r12)
            goto L_0x0009
        L_0x00e8:
            r9 = 1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bcr.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
