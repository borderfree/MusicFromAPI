package com.google.android.exoplayer2.p101b;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.C2672m;
import com.google.android.exoplayer2.C2711n;
import com.google.android.exoplayer2.p101b.C2481f.C2482a;
import com.google.android.exoplayer2.source.C2739h;
import com.google.android.exoplayer2.source.C2740i;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.b.e */
public abstract class C2478e extends C2484h {

    /* renamed from: a */
    private final SparseArray<Map<C2740i, C2480b>> f8026a = new SparseArray<>();

    /* renamed from: b */
    private final SparseBooleanArray f8027b = new SparseBooleanArray();

    /* renamed from: c */
    private int f8028c = 0;

    /* renamed from: d */
    private C2479a f8029d;

    /* renamed from: com.google.android.exoplayer2.b.e$a */
    public static final class C2479a {

        /* renamed from: a */
        public final int f8030a;

        /* renamed from: b */
        private final int[] f8031b;

        /* renamed from: c */
        private final C2740i[] f8032c;

        /* renamed from: d */
        private final int[] f8033d;

        /* renamed from: e */
        private final int[][][] f8034e;

        /* renamed from: f */
        private final C2740i f8035f;

        C2479a(int[] iArr, C2740i[] iVarArr, int[] iArr2, int[][][] iArr3, C2740i iVar) {
            this.f8031b = iArr;
            this.f8032c = iVarArr;
            this.f8034e = iArr3;
            this.f8033d = iArr2;
            this.f8035f = iVar;
            this.f8030a = iVarArr.length;
        }
    }

    /* renamed from: com.google.android.exoplayer2.b.e$b */
    public static final class C2480b {

        /* renamed from: a */
        public final C2482a f8036a;

        /* renamed from: b */
        public final int f8037b;

        /* renamed from: c */
        public final int[] f8038c;

        /* renamed from: a */
        public C2481f mo8783a(C2740i iVar) {
            return this.f8036a.mo8762b(iVar.mo9380a(this.f8037b), this.f8038c);
        }
    }

    /* renamed from: a */
    private static int m11633a(C2672m[] mVarArr, C2739h hVar) {
        int length = mVarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < mVarArr.length) {
            C2672m mVar = mVarArr[i];
            int i3 = length;
            for (int i4 = 0; i4 < hVar.f9381a; i4++) {
                int a = mVar.mo9157a(hVar.mo9376a(i4)) & 3;
                if (a > i2) {
                    if (a == 3) {
                        return i;
                    }
                    i3 = i;
                    i2 = a;
                }
            }
            i++;
            length = i3;
        }
        return length;
    }

    /* renamed from: a */
    private static void m11634a(C2672m[] mVarArr, C2740i[] iVarArr, int[][][] iArr, C2711n[] nVarArr, C2481f[] fVarArr, int i) {
        boolean z;
        if (i != 0) {
            boolean z2 = false;
            int i2 = 0;
            int i3 = -1;
            int i4 = -1;
            while (true) {
                if (i2 >= mVarArr.length) {
                    z = true;
                    break;
                }
                int a = mVarArr[i2].mo8612a();
                C2481f fVar = fVarArr[i2];
                if ((a == 1 || a == 2) && fVar != null && m11635a(iArr[i2], iVarArr[i2], fVar)) {
                    if (a == 1) {
                        if (i3 != -1) {
                            break;
                        }
                        i3 = i2;
                    } else if (i4 != -1) {
                        break;
                    } else {
                        i4 = i2;
                    }
                }
                i2++;
            }
            z = false;
            if (!(i3 == -1 || i4 == -1)) {
                z2 = true;
            }
            if (z && z2) {
                C2711n nVar = new C2711n(i);
                nVarArr[i3] = nVar;
                nVarArr[i4] = nVar;
            }
        }
    }

    /* renamed from: a */
    private static boolean m11635a(int[][] iArr, C2740i iVar, C2481f fVar) {
        if (fVar == null) {
            return false;
        }
        int a = iVar.mo9379a(fVar.mo8764a());
        for (int i = 0; i < fVar.mo8766b(); i++) {
            if ((iArr[a][fVar.mo8767b(i)] & 16) != 16) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static int[] m11636a(C2672m mVar, C2739h hVar) {
        int[] iArr = new int[hVar.f9381a];
        for (int i = 0; i < hVar.f9381a; i++) {
            iArr[i] = mVar.mo9157a(hVar.mo9376a(i));
        }
        return iArr;
    }

    /* renamed from: a */
    private static int[] m11637a(C2672m[] mVarArr) {
        int[] iArr = new int[mVarArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = mVarArr[i].mo8634m();
        }
        return iArr;
    }

    /* renamed from: a */
    public final C2486i mo8781a(C2672m[] mVarArr, C2740i iVar) {
        int[] iArr = new int[(mVarArr.length + 1)];
        C2739h[][] hVarArr = new C2739h[(mVarArr.length + 1)][];
        int[][][] iArr2 = new int[(mVarArr.length + 1)][][];
        for (int i = 0; i < hVarArr.length; i++) {
            hVarArr[i] = new C2739h[iVar.f9385b];
            iArr2[i] = new int[iVar.f9385b][];
        }
        int[] a = m11637a(mVarArr);
        for (int i2 = 0; i2 < iVar.f9385b; i2++) {
            C2739h a2 = iVar.mo9380a(i2);
            int a3 = m11633a(mVarArr, a2);
            int[] a4 = a3 == mVarArr.length ? new int[a2.f9381a] : m11636a(mVarArr[a3], a2);
            int i3 = iArr[a3];
            hVarArr[a3][i3] = a2;
            iArr2[a3][i3] = a4;
            iArr[a3] = iArr[a3] + 1;
        }
        C2740i[] iVarArr = new C2740i[mVarArr.length];
        int[] iArr3 = new int[mVarArr.length];
        for (int i4 = 0; i4 < mVarArr.length; i4++) {
            int i5 = iArr[i4];
            iVarArr[i4] = new C2740i((C2739h[]) Arrays.copyOf(hVarArr[i4], i5));
            iArr2[i4] = (int[][]) Arrays.copyOf(iArr2[i4], i5);
            iArr3[i4] = mVarArr[i4].mo8612a();
        }
        C2740i iVar2 = new C2740i((C2739h[]) Arrays.copyOf(hVarArr[mVarArr.length], iArr[mVarArr.length]));
        C2481f[] a5 = mo8776a(mVarArr, iVarArr, iArr2);
        int i6 = 0;
        while (true) {
            C2480b bVar = null;
            if (i6 >= mVarArr.length) {
                break;
            }
            if (this.f8027b.get(i6)) {
                a5[i6] = null;
            } else {
                C2740i iVar3 = iVarArr[i6];
                Map map = (Map) this.f8026a.get(i6);
                if (map != null) {
                    bVar = (C2480b) map.get(iVar3);
                }
                if (bVar != null) {
                    a5[i6] = bVar.mo8783a(iVar3);
                }
            }
            i6++;
        }
        C2479a aVar = new C2479a(iArr3, iVarArr, a, iArr2, iVar2);
        C2711n[] nVarArr = new C2711n[mVarArr.length];
        for (int i7 = 0; i7 < mVarArr.length; i7++) {
            nVarArr[i7] = a5[i7] != null ? C2711n.f9267a : null;
        }
        m11634a(mVarArr, iVarArr, iArr2, nVarArr, a5, this.f8028c);
        return new C2486i(iVar, new C2483g(a5), aVar, nVarArr);
    }

    /* renamed from: a */
    public final void mo8782a(Object obj) {
        this.f8029d = (C2479a) obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C2481f[] mo8776a(C2672m[] mVarArr, C2740i[] iVarArr, int[][][] iArr);
}
