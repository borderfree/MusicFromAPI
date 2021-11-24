package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class adq implements Cloneable {

    /* renamed from: a */
    private ado<?, ?> f11560a;

    /* renamed from: b */
    private Object f11561b;

    /* renamed from: c */
    private List<adu> f11562c = new ArrayList();

    adq() {
    }

    /* renamed from: b */
    private final byte[] m16005b() {
        byte[] bArr = new byte[mo11823a()];
        mo11824a(adm.m15970a(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final adq clone() {
        Object clone;
        adq adq = new adq();
        try {
            adq.f11560a = this.f11560a;
            if (this.f11562c == null) {
                adq.f11562c = null;
            } else {
                adq.f11562c.addAll(this.f11562c);
            }
            if (this.f11561b != null) {
                if (this.f11561b instanceof C3401ads) {
                    clone = (C3401ads) ((C3401ads) this.f11561b).clone();
                } else if (this.f11561b instanceof byte[]) {
                    clone = ((byte[]) this.f11561b).clone();
                } else {
                    int i = 0;
                    if (this.f11561b instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.f11561b;
                        byte[][] bArr2 = new byte[bArr.length][];
                        adq.f11561b = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.f11561b instanceof boolean[]) {
                        clone = ((boolean[]) this.f11561b).clone();
                    } else if (this.f11561b instanceof int[]) {
                        clone = ((int[]) this.f11561b).clone();
                    } else if (this.f11561b instanceof long[]) {
                        clone = ((long[]) this.f11561b).clone();
                    } else if (this.f11561b instanceof float[]) {
                        clone = ((float[]) this.f11561b).clone();
                    } else if (this.f11561b instanceof double[]) {
                        clone = ((double[]) this.f11561b).clone();
                    } else if (this.f11561b instanceof C3401ads[]) {
                        C3401ads[] adsArr = (C3401ads[]) this.f11561b;
                        C3401ads[] adsArr2 = new C3401ads[adsArr.length];
                        adq.f11561b = adsArr2;
                        while (i < adsArr.length) {
                            adsArr2[i] = (C3401ads) adsArr[i].clone();
                            i++;
                        }
                    }
                }
                adq.f11561b = clone;
            }
            return adq;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo11823a() {
        if (this.f11561b == null) {
            int i = 0;
            for (adu adu : this.f11562c) {
                i += adm.m15981d(adu.f11567a) + 0 + adu.f11568b.length;
            }
            return i;
        }
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo11824a(adm adm) {
        if (this.f11561b == null) {
            for (adu adu : this.f11562c) {
                adm.mo11808c(adu.f11567a);
                adm.mo11810c(adu.f11568b);
            }
            return;
        }
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo11825a(adu adu) {
        if (this.f11562c != null) {
            this.f11562c.add(adu);
        } else if (this.f11561b instanceof C3401ads) {
            byte[] bArr = adu.f11568b;
            adk a = adk.m15941a(bArr, 0, bArr.length);
            int g = a.mo11796g();
            if (g == bArr.length - adm.m15966a(g)) {
                C3401ads a2 = ((C3401ads) this.f11561b).mo11511a(a);
                this.f11560a = this.f11560a;
                this.f11561b = a2;
                this.f11562c = null;
                return;
            }
            throw zzbfh.zzagq();
        } else if (this.f11561b instanceof C3401ads[]) {
            Collections.singletonList(adu);
            throw new NoSuchMethodError();
        } else {
            Collections.singletonList(adu);
            throw new NoSuchMethodError();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof adq)) {
            return false;
        }
        adq adq = (adq) obj;
        if (this.f11561b == null || adq.f11561b == null) {
            if (this.f11562c != null && adq.f11562c != null) {
                return this.f11562c.equals(adq.f11562c);
            }
            try {
                return Arrays.equals(m16005b(), adq.m16005b());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else if (this.f11560a != adq.f11560a) {
            return false;
        } else {
            return !this.f11560a.f11554a.isArray() ? this.f11561b.equals(adq.f11561b) : this.f11561b instanceof byte[] ? Arrays.equals((byte[]) this.f11561b, (byte[]) adq.f11561b) : this.f11561b instanceof int[] ? Arrays.equals((int[]) this.f11561b, (int[]) adq.f11561b) : this.f11561b instanceof long[] ? Arrays.equals((long[]) this.f11561b, (long[]) adq.f11561b) : this.f11561b instanceof float[] ? Arrays.equals((float[]) this.f11561b, (float[]) adq.f11561b) : this.f11561b instanceof double[] ? Arrays.equals((double[]) this.f11561b, (double[]) adq.f11561b) : this.f11561b instanceof boolean[] ? Arrays.equals((boolean[]) this.f11561b, (boolean[]) adq.f11561b) : Arrays.deepEquals((Object[]) this.f11561b, (Object[]) adq.f11561b);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m16005b()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
