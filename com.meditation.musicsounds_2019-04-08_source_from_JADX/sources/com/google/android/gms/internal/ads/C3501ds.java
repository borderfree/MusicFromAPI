package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.ads.ds */
final class C3501ds implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ OutputStream f13777a;

    /* renamed from: b */
    private final /* synthetic */ byte[] f13778b;

    C3501ds(zzaev zzaev, OutputStream outputStream, byte[] bArr) {
        this.f13777a = outputStream;
        this.f13778b = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            r0 = 0
            java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x001e, all -> 0x0019 }
            java.io.OutputStream r2 = r5.f13777a     // Catch:{ IOException -> 0x001e, all -> 0x0019 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x001e, all -> 0x0019 }
            byte[] r0 = r5.f13778b     // Catch:{ IOException -> 0x0017 }
            int r0 = r0.length     // Catch:{ IOException -> 0x0017 }
            r1.writeInt(r0)     // Catch:{ IOException -> 0x0017 }
            byte[] r0 = r5.f13778b     // Catch:{ IOException -> 0x0017 }
            r1.write(r0)     // Catch:{ IOException -> 0x0017 }
            com.google.android.gms.common.util.C3307l.m15066a(r1)
            return
        L_0x0017:
            r0 = move-exception
            goto L_0x0022
        L_0x0019:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x003d
        L_0x001e:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x0022:
            java.lang.String r2 = "Error transporting the ad response"
            com.google.android.gms.internal.ads.C3643iy.m19173b(r2, r0)     // Catch:{ all -> 0x003c }
            com.google.android.gms.internal.ads.ii r2 = com.google.android.gms.ads.internal.zzbv.zzeo()     // Catch:{ all -> 0x003c }
            java.lang.String r3 = "LargeParcelTeleporter.pipeData.1"
            r2.mo13047a(r0, r3)     // Catch:{ all -> 0x003c }
            if (r1 != 0) goto L_0x0038
            java.io.OutputStream r0 = r5.f13777a
            com.google.android.gms.common.util.C3307l.m15066a(r0)
            return
        L_0x0038:
            com.google.android.gms.common.util.C3307l.m15066a(r1)
            return
        L_0x003c:
            r0 = move-exception
        L_0x003d:
            if (r1 != 0) goto L_0x0041
            java.io.OutputStream r1 = r5.f13777a
        L_0x0041:
            com.google.android.gms.common.util.C3307l.m15066a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3501ds.run():void");
    }
}
