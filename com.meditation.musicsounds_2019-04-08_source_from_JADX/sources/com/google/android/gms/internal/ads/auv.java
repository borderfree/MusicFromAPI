package com.google.android.gms.internal.ads;

public abstract class auv extends ahn implements auu {
    public auv() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0075, code lost:
        r3.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a6, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.aho.m16239a(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c1, code lost:
        r3.writeNoException();
        r3.writeString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c8, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
        /*
            r0 = this;
            switch(r1) {
                case 2: goto L_0x00bd;
                case 3: goto L_0x00b2;
                case 4: goto L_0x00ad;
                case 5: goto L_0x00a2;
                case 6: goto L_0x009d;
                case 7: goto L_0x0098;
                case 8: goto L_0x008d;
                case 9: goto L_0x0088;
                case 10: goto L_0x0083;
                case 11: goto L_0x007e;
                case 12: goto L_0x0079;
                case 13: goto L_0x0072;
                case 14: goto L_0x006d;
                case 15: goto L_0x0061;
                case 16: goto L_0x004d;
                case 17: goto L_0x0041;
                case 18: goto L_0x003c;
                case 19: goto L_0x0036;
                case 20: goto L_0x002a;
                case 21: goto L_0x000a;
                case 22: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            r0.mo12429u()
            goto L_0x0075
        L_0x000a:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.aur
            if (r4 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.aur r1 = (com.google.android.gms.internal.ads.aur) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.aut r2 = new com.google.android.gms.internal.ads.aut
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.mo12412a(r1)
            goto L_0x0075
        L_0x002a:
            android.os.Bundle r1 = r0.mo12426r()
            r3.writeNoException()
            com.google.android.gms.internal.ads.aho.m16244b(r3, r1)
            goto L_0x00c7
        L_0x0036:
            com.google.android.gms.dynamic.b r1 = r0.mo12424p()
            goto L_0x00a6
        L_0x003c:
            com.google.android.gms.dynamic.b r1 = r0.mo12423n()
            goto L_0x00a6
        L_0x0041:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.aho.m16238a(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.mo12415c(r1)
            goto L_0x0075
        L_0x004d:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.aho.m16238a(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            boolean r1 = r0.mo12413b(r1)
            r3.writeNoException()
            com.google.android.gms.internal.ads.aho.m16241a(r3, r1)
            goto L_0x00c7
        L_0x0061:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.aho.m16238a(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.mo12411a(r1)
            goto L_0x0075
        L_0x006d:
            com.google.android.gms.internal.ads.asu r1 = r0.mo12427s()
            goto L_0x00a6
        L_0x0072:
            r0.mo12428t()
        L_0x0075:
            r3.writeNoException()
            goto L_0x00c7
        L_0x0079:
            java.lang.String r1 = r0.mo12425q()
            goto L_0x00c1
        L_0x007e:
            com.google.android.gms.internal.ads.aos r1 = r0.mo12422j()
            goto L_0x00a6
        L_0x0083:
            java.lang.String r1 = r0.mo12421i()
            goto L_0x00c1
        L_0x0088:
            java.lang.String r1 = r0.mo12420h()
            goto L_0x00c1
        L_0x008d:
            double r1 = r0.mo12419g()
            r3.writeNoException()
            r3.writeDouble(r1)
            goto L_0x00c7
        L_0x0098:
            java.lang.String r1 = r0.mo12418f()
            goto L_0x00c1
        L_0x009d:
            java.lang.String r1 = r0.mo12417e()
            goto L_0x00c1
        L_0x00a2:
            com.google.android.gms.internal.ads.asy r1 = r0.mo12416d()
        L_0x00a6:
            r3.writeNoException()
            com.google.android.gms.internal.ads.aho.m16239a(r3, r1)
            goto L_0x00c7
        L_0x00ad:
            java.lang.String r1 = r0.mo12414c()
            goto L_0x00c1
        L_0x00b2:
            java.util.List r1 = r0.mo12360b()
            r3.writeNoException()
            r3.writeList(r1)
            goto L_0x00c7
        L_0x00bd:
            java.lang.String r1 = r0.mo12410a()
        L_0x00c1:
            r3.writeNoException()
            r3.writeString(r1)
        L_0x00c7:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.auv.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
