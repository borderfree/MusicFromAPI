package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.p */
abstract class C3281p extends C3279n {

    /* renamed from: b */
    private static final WeakReference<byte[]> f11142b = new WeakReference<>(null);

    /* renamed from: a */
    private WeakReference<byte[]> f11143a = f11142b;

    C3281p(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final byte[] mo11301c() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f11143a.get();
            if (bArr == null) {
                bArr = mo11304d();
                this.f11143a = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract byte[] mo11304d();
}
