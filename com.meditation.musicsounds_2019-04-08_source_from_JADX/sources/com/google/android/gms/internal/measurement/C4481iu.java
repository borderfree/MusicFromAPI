package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.iu */
final class C4481iu implements Cloneable {

    /* renamed from: a */
    private C4479is<?, ?> f16320a;

    /* renamed from: b */
    private Object f16321b;

    /* renamed from: c */
    private List<C4485iy> f16322c = new ArrayList();

    C4481iu() {
    }

    /* renamed from: b */
    private final byte[] m22260b() {
        byte[] bArr = new byte[mo14777a()];
        mo14778a(C4477iq.m22219a(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final C4481iu clone() {
        Object clone;
        C4481iu iuVar = new C4481iu();
        try {
            iuVar.f16320a = this.f16320a;
            if (this.f16322c == null) {
                iuVar.f16322c = null;
            } else {
                iuVar.f16322c.addAll(this.f16322c);
            }
            if (this.f16321b != null) {
                if (this.f16321b instanceof C4483iw) {
                    clone = (C4483iw) ((C4483iw) this.f16321b).clone();
                } else if (this.f16321b instanceof byte[]) {
                    clone = ((byte[]) this.f16321b).clone();
                } else {
                    int i = 0;
                    if (this.f16321b instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.f16321b;
                        byte[][] bArr2 = new byte[bArr.length][];
                        iuVar.f16321b = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.f16321b instanceof boolean[]) {
                        clone = ((boolean[]) this.f16321b).clone();
                    } else if (this.f16321b instanceof int[]) {
                        clone = ((int[]) this.f16321b).clone();
                    } else if (this.f16321b instanceof long[]) {
                        clone = ((long[]) this.f16321b).clone();
                    } else if (this.f16321b instanceof float[]) {
                        clone = ((float[]) this.f16321b).clone();
                    } else if (this.f16321b instanceof double[]) {
                        clone = ((double[]) this.f16321b).clone();
                    } else if (this.f16321b instanceof C4483iw[]) {
                        C4483iw[] iwVarArr = (C4483iw[]) this.f16321b;
                        C4483iw[] iwVarArr2 = new C4483iw[iwVarArr.length];
                        iuVar.f16321b = iwVarArr2;
                        while (i < iwVarArr.length) {
                            iwVarArr2[i] = (C4483iw) iwVarArr[i].clone();
                            i++;
                        }
                    }
                }
                iuVar.f16321b = clone;
            }
            return iuVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo14777a() {
        if (this.f16321b != null) {
            C4479is<?, ?> isVar = this.f16320a;
            Object obj = this.f16321b;
            if (!isVar.f16313c) {
                return isVar.mo14764a(obj);
            }
            int length = Array.getLength(obj);
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                Object obj2 = Array.get(obj, i2);
                if (obj2 != null) {
                    i += isVar.mo14764a(obj2);
                }
            }
            return i;
        }
        int i3 = 0;
        for (C4485iy iyVar : this.f16322c) {
            i3 += C4477iq.m22229d(iyVar.f16327a) + 0 + iyVar.f16328b.length;
        }
        return i3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14778a(C4477iq iqVar) {
        if (this.f16321b != null) {
            C4479is<?, ?> isVar = this.f16320a;
            Object obj = this.f16321b;
            if (isVar.f16313c) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    Object obj2 = Array.get(obj, i);
                    if (obj2 != null) {
                        isVar.mo14766a(obj2, iqVar);
                    }
                }
                return;
            }
            isVar.mo14766a(obj, iqVar);
            return;
        }
        for (C4485iy iyVar : this.f16322c) {
            iqVar.mo14759c(iyVar.f16327a);
            iqVar.mo14758b(iyVar.f16328b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14779a(C4485iy iyVar) {
        Object obj;
        Object[] objArr;
        Object obj2;
        int length;
        int length2;
        if (this.f16322c != null) {
            this.f16322c.add(iyVar);
            return;
        }
        if (this.f16321b instanceof C4483iw) {
            byte[] bArr = iyVar.f16328b;
            C4475io a = C4475io.m22170a(bArr, 0, bArr.length);
            int d = a.mo14718d();
            if (d == bArr.length - C4477iq.m22215a(d)) {
                obj = ((C4483iw) this.f16321b).mo14223a(a);
            } else {
                throw zzyh.zzzd();
            }
        } else {
            if (this.f16321b instanceof C4483iw[]) {
                objArr = (C4483iw[]) this.f16320a.mo14765a(Collections.singletonList(iyVar));
                C4483iw[] iwVarArr = (C4483iw[]) this.f16321b;
                obj2 = (C4483iw[]) Arrays.copyOf(iwVarArr, iwVarArr.length + objArr.length);
                length = iwVarArr.length;
                length2 = objArr.length;
            } else if (this.f16321b instanceof C4419gq) {
                obj = ((C4419gq) this.f16321b).mo14499j().mo14305a((C4419gq) this.f16320a.mo14765a(Collections.singletonList(iyVar))).mo14508g();
            } else if (this.f16321b instanceof C4419gq[]) {
                objArr = (C4419gq[]) this.f16320a.mo14765a(Collections.singletonList(iyVar));
                C4419gq[] gqVarArr = (C4419gq[]) this.f16321b;
                obj2 = (C4419gq[]) Arrays.copyOf(gqVarArr, gqVarArr.length + objArr.length);
                length = gqVarArr.length;
                length2 = objArr.length;
            } else {
                obj = this.f16320a.mo14765a(Collections.singletonList(iyVar));
            }
            System.arraycopy(objArr, 0, obj2, length, length2);
            obj = obj2;
        }
        this.f16320a = this.f16320a;
        this.f16321b = obj;
        this.f16322c = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4481iu)) {
            return false;
        }
        C4481iu iuVar = (C4481iu) obj;
        if (this.f16321b == null || iuVar.f16321b == null) {
            if (this.f16322c != null && iuVar.f16322c != null) {
                return this.f16322c.equals(iuVar.f16322c);
            }
            try {
                return Arrays.equals(m22260b(), iuVar.m22260b());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else if (this.f16320a != iuVar.f16320a) {
            return false;
        } else {
            return !this.f16320a.f16311a.isArray() ? this.f16321b.equals(iuVar.f16321b) : this.f16321b instanceof byte[] ? Arrays.equals((byte[]) this.f16321b, (byte[]) iuVar.f16321b) : this.f16321b instanceof int[] ? Arrays.equals((int[]) this.f16321b, (int[]) iuVar.f16321b) : this.f16321b instanceof long[] ? Arrays.equals((long[]) this.f16321b, (long[]) iuVar.f16321b) : this.f16321b instanceof float[] ? Arrays.equals((float[]) this.f16321b, (float[]) iuVar.f16321b) : this.f16321b instanceof double[] ? Arrays.equals((double[]) this.f16321b, (double[]) iuVar.f16321b) : this.f16321b instanceof boolean[] ? Arrays.equals((boolean[]) this.f16321b, (boolean[]) iuVar.f16321b) : Arrays.deepEquals((Object[]) this.f16321b, (Object[]) iuVar.f16321b);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m22260b()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
