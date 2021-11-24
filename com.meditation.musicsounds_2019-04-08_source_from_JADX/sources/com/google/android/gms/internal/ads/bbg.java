package com.google.android.gms.internal.ads;

public abstract class bbg extends ahn implements bbe {
    public bbg() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005f, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.aho.m16241a(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0081, code lost:
        r3.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a3, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.aho.m16239a(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00be, code lost:
        r3.writeNoException();
        r3.writeString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c5, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
        /*
            r0 = this;
            switch(r1) {
                case 2: goto L_0x00ba;
                case 3: goto L_0x00af;
                case 4: goto L_0x00aa;
                case 5: goto L_0x009f;
                case 6: goto L_0x009a;
                case 7: goto L_0x008f;
                case 8: goto L_0x008a;
                case 9: goto L_0x0085;
                case 10: goto L_0x007e;
                case 11: goto L_0x0072;
                case 12: goto L_0x0066;
                case 13: goto L_0x005b;
                case 14: goto L_0x0056;
                case 15: goto L_0x004a;
                case 16: goto L_0x003e;
                case 17: goto L_0x0039;
                case 18: goto L_0x0033;
                case 19: goto L_0x002d;
                case 20: goto L_0x0027;
                case 21: goto L_0x0021;
                case 22: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.dynamic.b r1 = com.google.android.gms.dynamic.C3323b.C3324a.m15129a(r1)
            android.os.IBinder r4 = r2.readStrongBinder()
            com.google.android.gms.dynamic.b r4 = com.google.android.gms.dynamic.C3323b.C3324a.m15129a(r4)
            android.os.IBinder r2 = r2.readStrongBinder()
            com.google.android.gms.dynamic.b r2 = com.google.android.gms.dynamic.C3323b.C3324a.m15129a(r2)
            r0.mo12715a(r1, r4, r2)
            goto L_0x0081
        L_0x0021:
            com.google.android.gms.dynamic.b r1 = r0.mo12733q()
            goto L_0x00a3
        L_0x0027:
            com.google.android.gms.dynamic.b r1 = r0.mo12732p()
            goto L_0x00a3
        L_0x002d:
            com.google.android.gms.internal.ads.asu r1 = r0.mo12731o()
            goto L_0x00a3
        L_0x0033:
            com.google.android.gms.dynamic.b r1 = r0.mo12730n()
            goto L_0x00a3
        L_0x0039:
            com.google.android.gms.internal.ads.aos r1 = r0.mo12729m()
            goto L_0x00a3
        L_0x003e:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.dynamic.b r1 = com.google.android.gms.dynamic.C3323b.C3324a.m15129a(r1)
            r0.mo12719c(r1)
            goto L_0x0081
        L_0x004a:
            android.os.Bundle r1 = r0.mo12728l()
            r3.writeNoException()
            com.google.android.gms.internal.ads.aho.m16244b(r3, r1)
            goto L_0x00c4
        L_0x0056:
            boolean r1 = r0.mo12727k()
            goto L_0x005f
        L_0x005b:
            boolean r1 = r0.mo12726j()
        L_0x005f:
            r3.writeNoException()
            com.google.android.gms.internal.ads.aho.m16241a(r3, r1)
            goto L_0x00c4
        L_0x0066:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.dynamic.b r1 = com.google.android.gms.dynamic.C3323b.C3324a.m15129a(r1)
            r0.mo12717b(r1)
            goto L_0x0081
        L_0x0072:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.dynamic.b r1 = com.google.android.gms.dynamic.C3323b.C3324a.m15129a(r1)
            r0.mo12714a(r1)
            goto L_0x0081
        L_0x007e:
            r0.mo12725i()
        L_0x0081:
            r3.writeNoException()
            goto L_0x00c4
        L_0x0085:
            java.lang.String r1 = r0.mo12724h()
            goto L_0x00be
        L_0x008a:
            java.lang.String r1 = r0.mo12723g()
            goto L_0x00be
        L_0x008f:
            double r1 = r0.mo12722f()
            r3.writeNoException()
            r3.writeDouble(r1)
            goto L_0x00c4
        L_0x009a:
            java.lang.String r1 = r0.mo12721e()
            goto L_0x00be
        L_0x009f:
            com.google.android.gms.internal.ads.asy r1 = r0.mo12720d()
        L_0x00a3:
            r3.writeNoException()
            com.google.android.gms.internal.ads.aho.m16239a(r3, r1)
            goto L_0x00c4
        L_0x00aa:
            java.lang.String r1 = r0.mo12718c()
            goto L_0x00be
        L_0x00af:
            java.util.List r1 = r0.mo12716b()
            r3.writeNoException()
            r3.writeList(r1)
            goto L_0x00c4
        L_0x00ba:
            java.lang.String r1 = r0.mo12713a()
        L_0x00be:
            r3.writeNoException()
            r3.writeString(r1)
        L_0x00c4:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bbg.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
