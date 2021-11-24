package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C4317db;

/* renamed from: com.google.android.gms.measurement.internal.j */
public abstract class C4759j extends C4317db implements C4758i {
    public C4759j() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00dc, code lost:
        r9.writeNoException();
        r9.writeTypedList(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0136, code lost:
        r9.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x013a, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14271a(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) {
        /*
            r6 = this;
            switch(r7) {
                case 1: goto L_0x0123;
                case 2: goto L_0x010f;
                case 3: goto L_0x0003;
                case 4: goto L_0x0103;
                case 5: goto L_0x00ef;
                case 6: goto L_0x00e3;
                case 7: goto L_0x00cc;
                case 8: goto L_0x0003;
                case 9: goto L_0x00b5;
                case 10: goto L_0x009f;
                case 11: goto L_0x008b;
                case 12: goto L_0x0076;
                case 13: goto L_0x0069;
                case 14: goto L_0x0050;
                case 15: goto L_0x003a;
                case 16: goto L_0x0024;
                case 17: goto L_0x0012;
                case 18: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r7 = 0
            return r7
        L_0x0005:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzk> r7 = com.google.android.gms.measurement.internal.zzk.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C4324di.m21253a(r8, r7)
            com.google.android.gms.measurement.internal.zzk r7 = (com.google.android.gms.measurement.internal.zzk) r7
            r6.mo15372d(r7)
            goto L_0x0136
        L_0x0012:
            java.lang.String r7 = r8.readString()
            java.lang.String r10 = r8.readString()
            java.lang.String r8 = r8.readString()
            java.util.List r7 = r6.mo15358a(r7, r10, r8)
            goto L_0x00dc
        L_0x0024:
            java.lang.String r7 = r8.readString()
            java.lang.String r10 = r8.readString()
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzk> r0 = com.google.android.gms.measurement.internal.zzk.CREATOR
            android.os.Parcelable r8 = com.google.android.gms.internal.measurement.C4324di.m21253a(r8, r0)
            com.google.android.gms.measurement.internal.zzk r8 = (com.google.android.gms.measurement.internal.zzk) r8
            java.util.List r7 = r6.mo15357a(r7, r10, r8)
            goto L_0x00dc
        L_0x003a:
            java.lang.String r7 = r8.readString()
            java.lang.String r10 = r8.readString()
            java.lang.String r0 = r8.readString()
            boolean r8 = com.google.android.gms.internal.measurement.C4324di.m21256a(r8)
            java.util.List r7 = r6.mo15359a(r7, r10, r0, r8)
            goto L_0x00dc
        L_0x0050:
            java.lang.String r7 = r8.readString()
            java.lang.String r10 = r8.readString()
            boolean r0 = com.google.android.gms.internal.measurement.C4324di.m21256a(r8)
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzk> r1 = com.google.android.gms.measurement.internal.zzk.CREATOR
            android.os.Parcelable r8 = com.google.android.gms.internal.measurement.C4324di.m21253a(r8, r1)
            com.google.android.gms.measurement.internal.zzk r8 = (com.google.android.gms.measurement.internal.zzk) r8
            java.util.List r7 = r6.mo15360a(r7, r10, r0, r8)
            goto L_0x00dc
        L_0x0069:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzo> r7 = com.google.android.gms.measurement.internal.zzo.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C4324di.m21253a(r8, r7)
            com.google.android.gms.measurement.internal.zzo r7 = (com.google.android.gms.measurement.internal.zzo) r7
            r6.mo15366a(r7)
            goto L_0x0136
        L_0x0076:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzo> r7 = com.google.android.gms.measurement.internal.zzo.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C4324di.m21253a(r8, r7)
            com.google.android.gms.measurement.internal.zzo r7 = (com.google.android.gms.measurement.internal.zzo) r7
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzk> r10 = com.google.android.gms.measurement.internal.zzk.CREATOR
            android.os.Parcelable r8 = com.google.android.gms.internal.measurement.C4324di.m21253a(r8, r10)
            com.google.android.gms.measurement.internal.zzk r8 = (com.google.android.gms.measurement.internal.zzk) r8
            r6.mo15367a(r7, r8)
            goto L_0x0136
        L_0x008b:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzk> r7 = com.google.android.gms.measurement.internal.zzk.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C4324di.m21253a(r8, r7)
            com.google.android.gms.measurement.internal.zzk r7 = (com.google.android.gms.measurement.internal.zzk) r7
            java.lang.String r7 = r6.mo15371c(r7)
            r9.writeNoException()
            r9.writeString(r7)
            goto L_0x0139
        L_0x009f:
            long r1 = r8.readLong()
            java.lang.String r3 = r8.readString()
            java.lang.String r4 = r8.readString()
            java.lang.String r5 = r8.readString()
            r0 = r6
            r0.mo15361a(r1, r3, r4, r5)
            goto L_0x0136
        L_0x00b5:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzag> r7 = com.google.android.gms.measurement.internal.zzag.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C4324di.m21253a(r8, r7)
            com.google.android.gms.measurement.internal.zzag r7 = (com.google.android.gms.measurement.internal.zzag) r7
            java.lang.String r8 = r8.readString()
            byte[] r7 = r6.mo15368a(r7, r8)
            r9.writeNoException()
            r9.writeByteArray(r7)
            goto L_0x0139
        L_0x00cc:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzk> r7 = com.google.android.gms.measurement.internal.zzk.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C4324di.m21253a(r8, r7)
            com.google.android.gms.measurement.internal.zzk r7 = (com.google.android.gms.measurement.internal.zzk) r7
            boolean r8 = com.google.android.gms.internal.measurement.C4324di.m21256a(r8)
            java.util.List r7 = r6.mo15356a(r7, r8)
        L_0x00dc:
            r9.writeNoException()
            r9.writeTypedList(r7)
            goto L_0x0139
        L_0x00e3:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzk> r7 = com.google.android.gms.measurement.internal.zzk.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C4324di.m21253a(r8, r7)
            com.google.android.gms.measurement.internal.zzk r7 = (com.google.android.gms.measurement.internal.zzk) r7
            r6.mo15370b(r7)
            goto L_0x0136
        L_0x00ef:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzag> r7 = com.google.android.gms.measurement.internal.zzag.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C4324di.m21253a(r8, r7)
            com.google.android.gms.measurement.internal.zzag r7 = (com.google.android.gms.measurement.internal.zzag) r7
            java.lang.String r10 = r8.readString()
            java.lang.String r8 = r8.readString()
            r6.mo15363a(r7, r10, r8)
            goto L_0x0136
        L_0x0103:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzk> r7 = com.google.android.gms.measurement.internal.zzk.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C4324di.m21253a(r8, r7)
            com.google.android.gms.measurement.internal.zzk r7 = (com.google.android.gms.measurement.internal.zzk) r7
            r6.mo15365a(r7)
            goto L_0x0136
        L_0x010f:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzfv> r7 = com.google.android.gms.measurement.internal.zzfv.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C4324di.m21253a(r8, r7)
            com.google.android.gms.measurement.internal.zzfv r7 = (com.google.android.gms.measurement.internal.zzfv) r7
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzk> r10 = com.google.android.gms.measurement.internal.zzk.CREATOR
            android.os.Parcelable r8 = com.google.android.gms.internal.measurement.C4324di.m21253a(r8, r10)
            com.google.android.gms.measurement.internal.zzk r8 = (com.google.android.gms.measurement.internal.zzk) r8
            r6.mo15364a(r7, r8)
            goto L_0x0136
        L_0x0123:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzag> r7 = com.google.android.gms.measurement.internal.zzag.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.C4324di.m21253a(r8, r7)
            com.google.android.gms.measurement.internal.zzag r7 = (com.google.android.gms.measurement.internal.zzag) r7
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzk> r10 = com.google.android.gms.measurement.internal.zzk.CREATOR
            android.os.Parcelable r8 = com.google.android.gms.internal.measurement.C4324di.m21253a(r8, r10)
            com.google.android.gms.measurement.internal.zzk r8 = (com.google.android.gms.measurement.internal.zzk) r8
            r6.mo15362a(r7, r8)
        L_0x0136:
            r9.writeNoException()
        L_0x0139:
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4759j.mo14271a(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
