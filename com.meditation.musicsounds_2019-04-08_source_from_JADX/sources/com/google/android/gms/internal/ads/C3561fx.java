package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.fx */
public abstract class C3561fx extends ahn implements C3559fv {
    public C3561fx() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* renamed from: a */
    public static C3559fv m18472a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        return queryLocalInterface instanceof C3559fv ? (C3559fv) queryLocalInterface : new C3562fy(iBinder);
    }

    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3, types: [com.google.android.gms.internal.ads.gb] */
    /* JADX WARNING: type inference failed for: r4v5, types: [com.google.android.gms.internal.ads.gd] */
    /* JADX WARNING: type inference failed for: r4v7, types: [com.google.android.gms.internal.ads.gb] */
    /* JADX WARNING: type inference failed for: r4v8, types: [com.google.android.gms.internal.ads.ft] */
    /* JADX WARNING: type inference failed for: r4v10, types: [com.google.android.gms.internal.ads.fu] */
    /* JADX WARNING: type inference failed for: r4v12, types: [com.google.android.gms.internal.ads.ft] */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v2
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.google.android.gms.internal.ads.fu, com.google.android.gms.internal.ads.gd, com.google.android.gms.internal.ads.gb, com.google.android.gms.internal.ads.ft]
      uses: [com.google.android.gms.internal.ads.gb, com.google.android.gms.internal.ads.ft]
      mth insns count: 64
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
            r4 = 34
            if (r1 == r4) goto L_0x00c6
            r4 = 0
            switch(r1) {
                case 1: goto L_0x00b7;
                case 2: goto L_0x00b3;
                case 3: goto L_0x0095;
                default: goto L_0x0008;
            }
        L_0x0008:
            switch(r1) {
                case 5: goto L_0x008a;
                case 6: goto L_0x0086;
                case 7: goto L_0x0082;
                case 8: goto L_0x007e;
                case 9: goto L_0x0072;
                case 10: goto L_0x0066;
                case 11: goto L_0x005a;
                case 12: goto L_0x004e;
                case 13: goto L_0x0045;
                case 14: goto L_0x0038;
                case 15: goto L_0x002c;
                case 16: goto L_0x000d;
                default: goto L_0x000b;
            }
        L_0x000b:
            r1 = 0
            return r1
        L_0x000d:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0014
            goto L_0x0027
        L_0x0014:
            java.lang.String r2 = "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C3557ft
            if (r4 == 0) goto L_0x0022
            r4 = r2
            com.google.android.gms.internal.ads.ft r4 = (com.google.android.gms.internal.ads.C3557ft) r4
            goto L_0x0027
        L_0x0022:
            com.google.android.gms.internal.ads.fu r4 = new com.google.android.gms.internal.ads.fu
            r4.<init>(r1)
        L_0x0027:
            r0.mo12258a(r4)
            goto L_0x00c2
        L_0x002c:
            android.os.Bundle r1 = r0.mo12263b()
            r3.writeNoException()
            com.google.android.gms.internal.ads.aho.m16244b(r3, r1)
            goto L_0x00ce
        L_0x0038:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.aoa r1 = com.google.android.gms.internal.ads.aob.m16678a(r1)
            r0.mo12257a(r1)
            goto L_0x00c2
        L_0x0045:
            java.lang.String r1 = r2.readString()
            r0.mo12261a(r1)
            goto L_0x00c2
        L_0x004e:
            java.lang.String r1 = r0.mo12270g()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x00ce
        L_0x005a:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.dynamic.b r1 = com.google.android.gms.dynamic.C3323b.C3324a.m15129a(r1)
            r0.mo12265c(r1)
            goto L_0x00c2
        L_0x0066:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.dynamic.b r1 = com.google.android.gms.dynamic.C3323b.C3324a.m15129a(r1)
            r0.mo12264b(r1)
            goto L_0x00c2
        L_0x0072:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.dynamic.b r1 = com.google.android.gms.dynamic.C3323b.C3324a.m15129a(r1)
            r0.mo12256a(r1)
            goto L_0x00c2
        L_0x007e:
            r0.mo12269f()
            goto L_0x00c2
        L_0x0082:
            r0.mo12268e()
            goto L_0x00c2
        L_0x0086:
            r0.mo12267d()
            goto L_0x00c2
        L_0x008a:
            boolean r1 = r0.mo12266c()
            r3.writeNoException()
            com.google.android.gms.internal.ads.aho.m16241a(r3, r1)
            goto L_0x00ce
        L_0x0095:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x009c
            goto L_0x00af
        L_0x009c:
            java.lang.String r2 = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C3566gb
            if (r4 == 0) goto L_0x00aa
            r4 = r2
            com.google.android.gms.internal.ads.gb r4 = (com.google.android.gms.internal.ads.C3566gb) r4
            goto L_0x00af
        L_0x00aa:
            com.google.android.gms.internal.ads.gd r4 = new com.google.android.gms.internal.ads.gd
            r4.<init>(r1)
        L_0x00af:
            r0.mo12259a(r4)
            goto L_0x00c2
        L_0x00b3:
            r0.mo12255a()
            goto L_0x00c2
        L_0x00b7:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzahk> r1 = com.google.android.gms.internal.ads.zzahk.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.aho.m16238a(r2, r1)
            com.google.android.gms.internal.ads.zzahk r1 = (com.google.android.gms.internal.ads.zzahk) r1
            r0.mo12260a(r1)
        L_0x00c2:
            r3.writeNoException()
            goto L_0x00ce
        L_0x00c6:
            boolean r1 = com.google.android.gms.internal.ads.aho.m16242a(r2)
            r0.mo12262a(r1)
            goto L_0x00c2
        L_0x00ce:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3561fx.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
