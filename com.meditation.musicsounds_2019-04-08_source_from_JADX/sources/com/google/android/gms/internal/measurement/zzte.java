package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

public abstract class zzte implements Serializable, Iterable<Byte> {

    /* renamed from: a */
    private static final C4355em f16412a = (C4348ef.m21320a() ? new C4358ep(null) : new C4354el(null));

    /* renamed from: b */
    private static final Comparator<zzte> f16413b = new C4352ej();
    public static final zzte zzbtq = new zzto(C4390fo.f16137b);
    private int zzbsi = 0;

    zzte() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static int m22405a(byte b) {
        return b & 255;
    }

    static C4357eo zzao(int i) {
        return new C4357eo(i, null);
    }

    static int zzb(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public static zzte zzb(byte[] bArr, int i, int i2) {
        zzb(i, i + i2, bArr.length);
        return new zzto(f16412a.mo14333a(bArr, i, i2));
    }

    public static zzte zzga(String str) {
        return new zzto(str.getBytes(C4390fo.f16136a));
    }

    static zzte zzi(byte[] bArr) {
        return new zzto(bArr);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzbsi;
        if (i == 0) {
            int size = size();
            i = zza(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.zzbsi = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new C4351ei(this);
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    /* access modifiers changed from: protected */
    public abstract int zza(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract String zza(Charset charset);

    /* access modifiers changed from: 0000 */
    public abstract void zza(C4350eh ehVar);

    public abstract byte zzam(int i);

    /* access modifiers changed from: 0000 */
    public abstract byte zzan(int i);

    public abstract zzte zzb(int i, int i2);

    public final String zzud() {
        return size() == 0 ? "" : zza(C4390fo.f16136a);
    }

    public abstract boolean zzue();

    /* access modifiers changed from: protected */
    public final int zzuf() {
        return this.zzbsi;
    }
}
