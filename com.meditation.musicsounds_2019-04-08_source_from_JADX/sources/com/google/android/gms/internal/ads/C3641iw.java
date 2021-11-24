package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.iw */
public final class C3641iw {

    /* renamed from: e */
    private static final Comparator<byte[]> f14241e = new C3669jx();

    /* renamed from: a */
    private final List<byte[]> f14242a = new LinkedList();

    /* renamed from: b */
    private final List<byte[]> f14243b = new ArrayList(64);

    /* renamed from: c */
    private int f14244c = 0;

    /* renamed from: d */
    private final int f14245d = 4096;

    public C3641iw(int i) {
    }

    /* renamed from: a */
    private final synchronized void m18775a() {
        while (this.f14244c > this.f14245d) {
            byte[] bArr = (byte[]) this.f14242a.remove(0);
            this.f14243b.remove(bArr);
            this.f14244c -= bArr.length;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo13088a(byte[] r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x002e
            int r0 = r3.length     // Catch:{ all -> 0x002b }
            int r1 = r2.f14245d     // Catch:{ all -> 0x002b }
            if (r0 <= r1) goto L_0x0009
            goto L_0x002e
        L_0x0009:
            java.util.List<byte[]> r0 = r2.f14242a     // Catch:{ all -> 0x002b }
            r0.add(r3)     // Catch:{ all -> 0x002b }
            java.util.List<byte[]> r0 = r2.f14243b     // Catch:{ all -> 0x002b }
            java.util.Comparator<byte[]> r1 = f14241e     // Catch:{ all -> 0x002b }
            int r0 = java.util.Collections.binarySearch(r0, r3, r1)     // Catch:{ all -> 0x002b }
            if (r0 >= 0) goto L_0x001b
            int r0 = -r0
            int r0 = r0 + -1
        L_0x001b:
            java.util.List<byte[]> r1 = r2.f14243b     // Catch:{ all -> 0x002b }
            r1.add(r0, r3)     // Catch:{ all -> 0x002b }
            int r0 = r2.f14244c     // Catch:{ all -> 0x002b }
            int r3 = r3.length     // Catch:{ all -> 0x002b }
            int r0 = r0 + r3
            r2.f14244c = r0     // Catch:{ all -> 0x002b }
            r2.m18775a()     // Catch:{ all -> 0x002b }
            monitor-exit(r2)
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x002e:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3641iw.mo13088a(byte[]):void");
    }

    /* renamed from: a */
    public final synchronized byte[] mo13089a(int i) {
        for (int i2 = 0; i2 < this.f14243b.size(); i2++) {
            byte[] bArr = (byte[]) this.f14243b.get(i2);
            if (bArr.length >= i) {
                this.f14244c -= bArr.length;
                this.f14243b.remove(i2);
                this.f14242a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }
}
