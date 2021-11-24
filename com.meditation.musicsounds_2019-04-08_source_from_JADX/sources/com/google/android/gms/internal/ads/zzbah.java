package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

public abstract class zzbah implements Serializable, Iterable<Byte> {

    /* renamed from: a */
    private static final C4121zj f15391a = (C4114zc.m20404a() ? new C4123zl(null) : new C4120zi(null));
    public static final zzbah zzdpq = new zzbao(aak.f11363b);
    private int zzdpa = 0;

    zzbah() {
    }

    static C4122zk zzbo(int i) {
        return new C4122zk(i, null);
    }

    public static zzbah zzc(byte[] bArr, int i, int i2) {
        return new zzbao(f15391a.mo13842a(bArr, i, i2));
    }

    static int zzd(int i, int i2, int i3) {
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

    public static zzbah zzem(String str) {
        return new zzbao(str.getBytes(aak.f11362a));
    }

    public static zzbah zzo(byte[] bArr) {
        return zzc(bArr, 0, bArr.length);
    }

    static zzbah zzp(byte[] bArr) {
        return new zzbao(bArr);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzdpa;
        if (i == 0) {
            int size = size();
            i = zzc(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.zzdpa = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new C4119zh(this);
    }

    public abstract int size();

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return aak.f11363b;
        }
        byte[] bArr = new byte[size];
        zza(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    /* access modifiers changed from: protected */
    public abstract String zza(Charset charset);

    /* access modifiers changed from: 0000 */
    public abstract void zza(C4118zg zgVar);

    /* access modifiers changed from: protected */
    public abstract void zza(byte[] bArr, int i, int i2, int i3);

    public final String zzabd() {
        return size() == 0 ? "" : zza(aak.f11362a);
    }

    public abstract boolean zzabe();

    public abstract C4124zm zzabf();

    /* access modifiers changed from: protected */
    public final int zzabg() {
        return this.zzdpa;
    }

    public abstract byte zzbn(int i);

    /* access modifiers changed from: protected */
    public abstract int zzc(int i, int i2, int i3);

    public abstract zzbah zzk(int i, int i2);
}