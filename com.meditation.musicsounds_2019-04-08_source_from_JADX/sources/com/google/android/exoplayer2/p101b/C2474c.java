package com.google.android.exoplayer2.p101b;

import android.graphics.Point;
import android.text.TextUtils;
import com.google.android.exoplayer2.C2672m;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p101b.C2481f.C2482a;
import com.google.android.exoplayer2.p102c.C2511s;
import com.google.android.exoplayer2.source.C2739h;
import com.google.android.exoplayer2.source.C2740i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.exoplayer2.b.c */
public class C2474c extends C2478e {

    /* renamed from: a */
    private static final int[] f8006a = new int[0];

    /* renamed from: b */
    private final C2482a f8007b;

    /* renamed from: c */
    private final AtomicReference<C2476b> f8008c;

    /* renamed from: com.google.android.exoplayer2.b.c$a */
    private static final class C2475a {

        /* renamed from: a */
        public final int f8009a;

        /* renamed from: b */
        public final int f8010b;

        /* renamed from: c */
        public final String f8011c;

        public C2475a(int i, int i2, String str) {
            this.f8009a = i;
            this.f8010b = i2;
            this.f8011c = str;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C2475a aVar = (C2475a) obj;
            if (!(this.f8009a == aVar.f8009a && this.f8010b == aVar.f8010b && TextUtils.equals(this.f8011c, aVar.f8011c))) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (((this.f8009a * 31) + this.f8010b) * 31) + (this.f8011c != null ? this.f8011c.hashCode() : 0);
        }
    }

    /* renamed from: com.google.android.exoplayer2.b.c$b */
    public static final class C2476b {

        /* renamed from: a */
        public final String f8012a;

        /* renamed from: b */
        public final String f8013b;

        /* renamed from: c */
        public final boolean f8014c;

        /* renamed from: d */
        public final boolean f8015d;

        /* renamed from: e */
        public final int f8016e;

        /* renamed from: f */
        public final int f8017f;

        /* renamed from: g */
        public final int f8018g;

        /* renamed from: h */
        public final boolean f8019h;

        /* renamed from: i */
        public final boolean f8020i;

        /* renamed from: j */
        public final int f8021j;

        /* renamed from: k */
        public final int f8022k;

        /* renamed from: l */
        public final boolean f8023l;

        public C2476b() {
            this(null, null, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true);
        }

        public C2476b(String str, String str2, boolean z, boolean z2, int i, int i2, int i3, boolean z3, boolean z4, int i4, int i5, boolean z5) {
            this.f8012a = str;
            this.f8013b = str2;
            this.f8014c = z;
            this.f8015d = z2;
            this.f8016e = i;
            this.f8017f = i2;
            this.f8018g = i3;
            this.f8019h = z3;
            this.f8020i = z4;
            this.f8021j = i4;
            this.f8022k = i5;
            this.f8023l = z5;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C2476b bVar = (C2476b) obj;
            if (!(this.f8014c == bVar.f8014c && this.f8015d == bVar.f8015d && this.f8016e == bVar.f8016e && this.f8017f == bVar.f8017f && this.f8019h == bVar.f8019h && this.f8020i == bVar.f8020i && this.f8023l == bVar.f8023l && this.f8021j == bVar.f8021j && this.f8022k == bVar.f8022k && this.f8018g == bVar.f8018g && TextUtils.equals(this.f8012a, bVar.f8012a) && TextUtils.equals(this.f8013b, bVar.f8013b))) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (((((((((((((((((((((this.f8012a.hashCode() * 31) + this.f8013b.hashCode()) * 31) + (this.f8014c ? 1 : 0)) * 31) + (this.f8015d ? 1 : 0)) * 31) + this.f8016e) * 31) + this.f8017f) * 31) + this.f8018g) * 31) + (this.f8019h ? 1 : 0)) * 31) + (this.f8020i ? 1 : 0)) * 31) + (this.f8023l ? 1 : 0)) * 31) + this.f8021j) * 31) + this.f8022k;
        }
    }

    public C2474c() {
        this(null);
    }

    public C2474c(C2482a aVar) {
        this.f8007b = aVar;
        this.f8008c = new AtomicReference<>(new C2476b());
    }

    /* renamed from: a */
    private static int m11613a(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    /* renamed from: a */
    private static int m11614a(int i, String str, Format format) {
        int i2 = 1;
        boolean z = (format.f7756x & 1) != 0;
        if (m11623a(format, str)) {
            i2 = z ? 4 : 3;
        } else if (z) {
            i2 = 2;
        }
        return m11621a(i, false) ? i2 + 1000 : i2;
    }

    /* renamed from: a */
    private static int m11615a(C2739h hVar, int[] iArr, int i, String str, int i2, int i3, int i4, List<Integer> list) {
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int intValue = ((Integer) list.get(i6)).intValue();
            C2739h hVar2 = hVar;
            if (m11624a(hVar.mo9376a(intValue), str, iArr[intValue], i, i2, i3, i4)) {
                i5++;
            }
        }
        return i5;
    }

    /* renamed from: a */
    private static int m11616a(C2739h hVar, int[] iArr, C2475a aVar) {
        int i = 0;
        for (int i2 = 0; i2 < hVar.f9381a; i2++) {
            if (m11622a(hVar.mo9376a(i2), iArr[i2], aVar)) {
                i++;
            }
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        if (r1 != r3) goto L_0x0012;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Point m11617a(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L_0x000f
            r3 = 0
            r0 = 1
            if (r6 <= r7) goto L_0x0008
            r1 = 1
            goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            if (r4 <= r5) goto L_0x000c
            r3 = 1
        L_0x000c:
            if (r1 == r3) goto L_0x000f
            goto L_0x0012
        L_0x000f:
            r2 = r5
            r5 = r4
            r4 = r2
        L_0x0012:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L_0x0022
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = com.google.android.exoplayer2.p102c.C2511s.m11797a(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L_0x0022:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = com.google.android.exoplayer2.p102c.C2511s.m11797a(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p101b.C2474c.m11617a(boolean, int, int, int, int):android.graphics.Point");
    }

    /* renamed from: a */
    private static C2481f m11618a(C2672m mVar, C2740i iVar, int[][] iArr, int i, int i2, int i3, boolean z, boolean z2, int i4, int i5, boolean z3, C2482a aVar) {
        C2740i iVar2 = iVar;
        int i6 = z ? 12 : 8;
        boolean z4 = z2 && (mVar.mo8634m() & i6) != 0;
        for (int i7 = 0; i7 < iVar2.f9385b; i7++) {
            C2739h a = iVar2.mo9380a(i7);
            int[] a2 = m11626a(a, iArr[i7], z4, i6, i, i2, i3, i4, i5, z3);
            if (a2.length > 0) {
                return aVar.mo8762b(a, a2);
            }
            C2482a aVar2 = aVar;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        if (r3.f7742j <= r24) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (r3.f7743k <= r25) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (r3.f7734b <= r26) goto L_0x0069;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.exoplayer2.p101b.C2481f m11619a(com.google.android.exoplayer2.source.C2740i r22, int[][] r23, int r24, int r25, int r26, int r27, int r28, boolean r29, boolean r30, boolean r31) {
        /*
            r0 = r22
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = -1
            r9 = -1
        L_0x0008:
            int r10 = r0.f9385b
            if (r4 >= r10) goto L_0x00e0
            com.google.android.exoplayer2.source.h r10 = r0.mo9380a(r4)
            r11 = r27
            r12 = r28
            r13 = r29
            java.util.List r14 = m11620a(r10, r11, r12, r13)
            r15 = r23[r4]
            r1 = r9
            r9 = r8
            r8 = r7
            r7 = r5
            r5 = 0
        L_0x0021:
            int r3 = r10.f9381a
            if (r5 >= r3) goto L_0x00d1
            r3 = r15[r5]
            r2 = r31
            boolean r3 = m11621a(r3, r2)
            if (r3 == 0) goto L_0x00c3
            com.google.android.exoplayer2.Format r3 = r10.mo9376a(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            boolean r0 = r14.contains(r0)
            r18 = 1
            if (r0 == 0) goto L_0x006b
            int r0 = r3.f7742j
            r2 = -1
            if (r0 == r2) goto L_0x004b
            int r0 = r3.f7742j
            r2 = r24
            if (r0 > r2) goto L_0x006b
            goto L_0x004d
        L_0x004b:
            r2 = r24
        L_0x004d:
            int r0 = r3.f7743k
            r2 = -1
            if (r0 == r2) goto L_0x0059
            int r0 = r3.f7743k
            r2 = r25
            if (r0 > r2) goto L_0x006b
            goto L_0x005b
        L_0x0059:
            r2 = r25
        L_0x005b:
            int r0 = r3.f7734b
            r2 = -1
            if (r0 == r2) goto L_0x0067
            int r0 = r3.f7734b
            r2 = r26
            if (r0 > r2) goto L_0x006d
            goto L_0x0069
        L_0x0067:
            r2 = r26
        L_0x0069:
            r0 = 1
            goto L_0x006e
        L_0x006b:
            r2 = r26
        L_0x006d:
            r0 = 0
        L_0x006e:
            if (r0 != 0) goto L_0x0073
            if (r30 != 0) goto L_0x0073
            goto L_0x00c3
        L_0x0073:
            if (r0 == 0) goto L_0x007b
            r19 = 2
            r20 = r6
            r2 = 2
            goto L_0x007e
        L_0x007b:
            r20 = r6
            r2 = 1
        L_0x007e:
            r6 = r15[r5]
            r21 = r7
            r7 = 0
            boolean r6 = m11621a(r6, r7)
            if (r6 == 0) goto L_0x008b
            int r2 = r2 + 1000
        L_0x008b:
            if (r2 <= r8) goto L_0x0090
            r17 = 1
            goto L_0x0092
        L_0x0090:
            r17 = 0
        L_0x0092:
            if (r2 != r8) goto L_0x00b7
            int r7 = r3.mo8596a()
            if (r7 == r9) goto L_0x00a3
            int r7 = r3.mo8596a()
            int r7 = m11613a(r7, r9)
            goto L_0x00a9
        L_0x00a3:
            int r7 = r3.f7734b
            int r7 = m11613a(r7, r1)
        L_0x00a9:
            if (r6 == 0) goto L_0x00b0
            if (r0 == 0) goto L_0x00b0
            if (r7 <= 0) goto L_0x00b5
            goto L_0x00b2
        L_0x00b0:
            if (r7 >= 0) goto L_0x00b5
        L_0x00b2:
            r17 = 1
            goto L_0x00b7
        L_0x00b5:
            r17 = 0
        L_0x00b7:
            if (r17 == 0) goto L_0x00c7
            int r1 = r3.f7734b
            int r9 = r3.mo8596a()
            r8 = r2
            r6 = r5
            r7 = r10
            goto L_0x00cb
        L_0x00c3:
            r20 = r6
            r21 = r7
        L_0x00c7:
            r6 = r20
            r7 = r21
        L_0x00cb:
            int r5 = r5 + 1
            r0 = r22
            goto L_0x0021
        L_0x00d1:
            r20 = r6
            r21 = r7
            int r4 = r4 + 1
            r7 = r8
            r8 = r9
            r5 = r21
            r0 = r22
            r9 = r1
            goto L_0x0008
        L_0x00e0:
            if (r5 != 0) goto L_0x00e5
            r16 = 0
            goto L_0x00ec
        L_0x00e5:
            com.google.android.exoplayer2.b.d r1 = new com.google.android.exoplayer2.b.d
            r1.<init>(r5, r6)
            r16 = r1
        L_0x00ec:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p101b.C2474c.m11619a(com.google.android.exoplayer2.source.i, int[][], int, int, int, int, int, boolean, boolean, boolean):com.google.android.exoplayer2.b.f");
    }

    /* renamed from: a */
    private static List<Integer> m11620a(C2739h hVar, int i, int i2, boolean z) {
        ArrayList arrayList = new ArrayList(hVar.f9381a);
        for (int i3 = 0; i3 < hVar.f9381a; i3++) {
            arrayList.add(Integer.valueOf(i3));
        }
        if (!(i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE)) {
            int i4 = Integer.MAX_VALUE;
            for (int i5 = 0; i5 < hVar.f9381a; i5++) {
                Format a = hVar.mo9376a(i5);
                if (a.f7742j > 0 && a.f7743k > 0) {
                    Point a2 = m11617a(z, i, i2, a.f7742j, a.f7743k);
                    int i6 = a.f7742j * a.f7743k;
                    if (a.f7742j >= ((int) (((float) a2.x) * 0.98f)) && a.f7743k >= ((int) (((float) a2.y) * 0.98f)) && i6 < i4) {
                        i4 = i6;
                    }
                }
            }
            if (i4 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int a3 = hVar.mo9376a(((Integer) arrayList.get(size)).intValue()).mo8596a();
                    if (a3 == -1 || a3 > i4) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    protected static boolean m11621a(int i, boolean z) {
        int i2 = i & 3;
        return i2 == 3 || (z && i2 == 2);
    }

    /* renamed from: a */
    private static boolean m11622a(Format format, int i, C2475a aVar) {
        if (m11621a(i, false) && format.f7750r == aVar.f8009a && format.f7751s == aVar.f8010b) {
            return aVar.f8011c == null || TextUtils.equals(aVar.f8011c, format.f7738f);
        }
        return false;
    }

    /* renamed from: a */
    protected static boolean m11623a(Format format, String str) {
        return str != null && TextUtils.equals(str, C2511s.m11815b(format.f7757y));
    }

    /* renamed from: a */
    private static boolean m11624a(Format format, String str, int i, int i2, int i3, int i4, int i5) {
        if (!m11621a(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !C2511s.m11809a((Object) format.f7738f, (Object) str)) {
            return false;
        }
        if (format.f7742j != -1 && format.f7742j > i3) {
            return false;
        }
        if (format.f7743k == -1 || format.f7743k <= i4) {
            return format.f7734b == -1 || format.f7734b <= i5;
        }
        return false;
    }

    /* renamed from: a */
    private static int[] m11625a(C2739h hVar, int[] iArr, boolean z) {
        HashSet hashSet = new HashSet();
        C2475a aVar = null;
        int i = 0;
        for (int i2 = 0; i2 < hVar.f9381a; i2++) {
            Format a = hVar.mo9376a(i2);
            C2475a aVar2 = new C2475a(a.f7750r, a.f7751s, z ? null : a.f7738f);
            if (hashSet.add(aVar2)) {
                int a2 = m11616a(hVar, iArr, aVar2);
                if (a2 > i) {
                    i = a2;
                    aVar = aVar2;
                }
            }
        }
        if (i <= 1) {
            return f8006a;
        }
        int[] iArr2 = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 < hVar.f9381a; i4++) {
            if (m11622a(hVar.mo9376a(i4), iArr[i4], aVar)) {
                int i5 = i3 + 1;
                iArr2[i3] = i4;
                i3 = i5;
            }
        }
        return iArr2;
    }

    /* renamed from: a */
    private static int[] m11626a(C2739h hVar, int[] iArr, boolean z, int i, int i2, int i3, int i4, int i5, int i6, boolean z2) {
        String str;
        C2739h hVar2 = hVar;
        if (hVar2.f9381a < 2) {
            return f8006a;
        }
        List a = m11620a(hVar2, i5, i6, z2);
        if (a.size() < 2) {
            return f8006a;
        }
        if (!z) {
            HashSet hashSet = new HashSet();
            String str2 = null;
            int i7 = 0;
            for (int i8 = 0; i8 < a.size(); i8++) {
                String str3 = hVar2.mo9376a(((Integer) a.get(i8)).intValue()).f7738f;
                if (hashSet.add(str3)) {
                    int a2 = m11615a(hVar, iArr, i, str3, i2, i3, i4, a);
                    if (a2 > i7) {
                        i7 = a2;
                        str2 = str3;
                    }
                }
            }
            str = str2;
        } else {
            str = null;
        }
        m11627b(hVar, iArr, i, str, i2, i3, i4, a);
        return a.size() < 2 ? f8006a : C2511s.m11810a(a);
    }

    /* renamed from: b */
    private static void m11627b(C2739h hVar, int[] iArr, int i, String str, int i2, int i3, int i4, List<Integer> list) {
        List<Integer> list2 = list;
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = ((Integer) list2.get(size)).intValue();
            C2739h hVar2 = hVar;
            if (!m11624a(hVar.mo9376a(intValue), str, iArr[intValue], i, i2, i3, i4)) {
                list2.remove(size);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2481f mo8772a(int i, C2740i iVar, int[][] iArr, boolean z) {
        C2739h hVar = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < iVar.f9385b) {
            C2739h a = iVar.mo9380a(i2);
            int[] iArr2 = iArr[i2];
            int i5 = i4;
            int i6 = i3;
            C2739h hVar2 = hVar;
            for (int i7 = 0; i7 < a.f9381a; i7++) {
                if (m11621a(iArr2[i7], z)) {
                    int i8 = 1;
                    if ((a.mo9376a(i7).f7756x & 1) != 0) {
                        i8 = 2;
                    }
                    if (m11621a(iArr2[i7], false)) {
                        i8 += 1000;
                    }
                    if (i8 > i5) {
                        i6 = i7;
                        hVar2 = a;
                        i5 = i8;
                    }
                }
            }
            i2++;
            hVar = hVar2;
            i3 = i6;
            i4 = i5;
        }
        if (hVar == null) {
            return null;
        }
        return new C2477d(hVar, i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2481f mo8773a(C2672m mVar, C2740i iVar, int[][] iArr, int i, int i2, int i3, boolean z, boolean z2, int i4, int i5, boolean z3, C2482a aVar, boolean z4, boolean z5) {
        C2481f a = aVar != null ? m11618a(mVar, iVar, iArr, i, i2, i3, z, z2, i4, i5, z3, aVar) : null;
        return a == null ? m11619a(iVar, iArr, i, i2, i3, i4, i5, z3, z4, z5) : a;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0075 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.p101b.C2481f mo8774a(com.google.android.exoplayer2.source.C2740i r19, int[][] r20, java.lang.String r21, java.lang.String r22, boolean r23) {
        /*
            r18 = this;
            r0 = r19
            r1 = 0
            r2 = 0
            r4 = r1
            r3 = 0
            r5 = 0
            r6 = 0
        L_0x0008:
            int r7 = r0.f9385b
            if (r3 >= r7) goto L_0x0084
            com.google.android.exoplayer2.source.h r7 = r0.mo9380a(r3)
            r8 = r20[r3]
            r9 = r6
            r6 = r5
            r5 = r4
            r4 = 0
        L_0x0016:
            int r10 = r7.f9381a
            if (r4 >= r10) goto L_0x0078
            r10 = r8[r4]
            r11 = r23
            boolean r10 = m11621a(r10, r11)
            if (r10 == 0) goto L_0x0071
            com.google.android.exoplayer2.Format r10 = r7.mo9376a(r4)
            int r12 = r10.f7756x
            r13 = 1
            r12 = r12 & r13
            if (r12 == 0) goto L_0x0030
            r12 = 1
            goto L_0x0031
        L_0x0030:
            r12 = 0
        L_0x0031:
            int r14 = r10.f7756x
            r15 = 2
            r14 = r14 & r15
            if (r14 == 0) goto L_0x003c
            r14 = r21
            r16 = 1
            goto L_0x0040
        L_0x003c:
            r14 = r21
            r16 = 0
        L_0x0040:
            boolean r17 = m11623a(r10, r14)
            if (r17 == 0) goto L_0x0052
            if (r12 == 0) goto L_0x004c
            r13 = 6
        L_0x0049:
            r12 = r22
            goto L_0x0061
        L_0x004c:
            if (r16 != 0) goto L_0x0050
            r13 = 5
            goto L_0x0049
        L_0x0050:
            r13 = 4
            goto L_0x0049
        L_0x0052:
            if (r12 == 0) goto L_0x0056
            r13 = 3
            goto L_0x0049
        L_0x0056:
            if (r16 == 0) goto L_0x0073
            r12 = r22
            boolean r10 = m11623a(r10, r12)
            if (r10 == 0) goto L_0x0061
            r13 = 2
        L_0x0061:
            r10 = r8[r4]
            boolean r10 = m11621a(r10, r2)
            if (r10 == 0) goto L_0x006b
            int r13 = r13 + 1000
        L_0x006b:
            if (r13 <= r9) goto L_0x0075
            r6 = r4
            r5 = r7
            r9 = r13
            goto L_0x0075
        L_0x0071:
            r14 = r21
        L_0x0073:
            r12 = r22
        L_0x0075:
            int r4 = r4 + 1
            goto L_0x0016
        L_0x0078:
            r14 = r21
            r12 = r22
            r11 = r23
            int r3 = r3 + 1
            r4 = r5
            r5 = r6
            r6 = r9
            goto L_0x0008
        L_0x0084:
            if (r4 != 0) goto L_0x0087
            goto L_0x008c
        L_0x0087:
            com.google.android.exoplayer2.b.d r1 = new com.google.android.exoplayer2.b.d
            r1.<init>(r4, r5)
        L_0x008c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p101b.C2474c.mo8774a(com.google.android.exoplayer2.source.i, int[][], java.lang.String, java.lang.String, boolean):com.google.android.exoplayer2.b.f");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2481f mo8775a(C2740i iVar, int[][] iArr, String str, boolean z, boolean z2, C2482a aVar) {
        C2740i iVar2 = iVar;
        C2482a aVar2 = aVar;
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = 0;
        while (i < iVar2.f9385b) {
            C2739h a = iVar2.mo9380a(i);
            int[] iArr2 = iArr[i];
            int i5 = i4;
            int i6 = i3;
            int i7 = i2;
            for (int i8 = 0; i8 < a.f9381a; i8++) {
                if (m11621a(iArr2[i8], z)) {
                    int a2 = m11614a(iArr2[i8], str, a.mo9376a(i8));
                    if (a2 > i5) {
                        i7 = i;
                        i6 = i8;
                        i5 = a2;
                    }
                } else {
                    String str2 = str;
                }
            }
            String str3 = str;
            boolean z3 = z;
            i++;
            i2 = i7;
            i3 = i6;
            i4 = i5;
        }
        if (i2 == -1) {
            return null;
        }
        C2739h a3 = iVar2.mo9380a(i2);
        if (aVar2 != null) {
            int[] a4 = m11625a(a3, iArr[i2], z2);
            if (a4.length > 0) {
                return aVar2.mo8762b(a3, a4);
            }
        }
        return new C2477d(a3, i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.p101b.C2481f[] mo8776a(com.google.android.exoplayer2.C2672m[] r26, com.google.android.exoplayer2.source.C2740i[] r27, int[][][] r28) {
        /*
            r25 = this;
            r15 = r25
            r14 = r26
            int r13 = r14.length
            com.google.android.exoplayer2.b.f[] r12 = new com.google.android.exoplayer2.p101b.C2481f[r13]
            java.util.concurrent.atomic.AtomicReference<com.google.android.exoplayer2.b.c$b> r0 = r15.f8008c
            java.lang.Object r0 = r0.get()
            r11 = r0
            com.google.android.exoplayer2.b.c$b r11 = (com.google.android.exoplayer2.p101b.C2474c.C2476b) r11
            r16 = 0
            r0 = 0
            r10 = 0
            r17 = 0
        L_0x0016:
            r18 = 1
            if (r10 >= r13) goto L_0x0094
            r1 = 2
            r2 = r14[r10]
            int r2 = r2.mo8612a()
            if (r1 != r2) goto L_0x007d
            if (r0 != 0) goto L_0x0065
            r1 = r14[r10]
            r2 = r27[r10]
            r3 = r28[r10]
            int r4 = r11.f8016e
            int r5 = r11.f8017f
            int r6 = r11.f8018g
            boolean r7 = r11.f8015d
            boolean r8 = r11.f8014c
            int r9 = r11.f8021j
            int r0 = r11.f8022k
            r19 = r12
            boolean r12 = r11.f8023l
            r20 = r13
            com.google.android.exoplayer2.b.f$a r13 = r15.f8007b
            boolean r14 = r11.f8019h
            boolean r15 = r11.f8020i
            r21 = r0
            r0 = r25
            r22 = r10
            r10 = r21
            r23 = r11
            r11 = r12
            r12 = r13
            r24 = r20
            r13 = r14
            r20 = r26
            r14 = r15
            com.google.android.exoplayer2.b.f r0 = r0.mo8773a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r19[r22] = r0
            r0 = r19[r22]
            if (r0 == 0) goto L_0x0063
            r0 = 1
            goto L_0x006f
        L_0x0063:
            r0 = 0
            goto L_0x006f
        L_0x0065:
            r22 = r10
            r23 = r11
            r19 = r12
            r24 = r13
            r20 = r14
        L_0x006f:
            r1 = r27[r22]
            int r1 = r1.f9385b
            if (r1 <= 0) goto L_0x0076
            goto L_0x0078
        L_0x0076:
            r18 = 0
        L_0x0078:
            r1 = r17 | r18
            r17 = r1
            goto L_0x0087
        L_0x007d:
            r22 = r10
            r23 = r11
            r19 = r12
            r24 = r13
            r20 = r14
        L_0x0087:
            int r10 = r22 + 1
            r12 = r19
            r14 = r20
            r11 = r23
            r13 = r24
            r15 = r25
            goto L_0x0016
        L_0x0094:
            r23 = r11
            r19 = r12
            r20 = r14
            r7 = r13
            r6 = 0
            r8 = 0
            r9 = 0
        L_0x009e:
            if (r8 >= r7) goto L_0x0113
            r0 = r20[r8]
            int r0 = r0.mo8612a()
            switch(r0) {
                case 1: goto L_0x00e4;
                case 2: goto L_0x00e1;
                case 3: goto L_0x00c0;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            r10 = r23
            r11 = r25
            r0 = r20[r8]
            int r0 = r0.mo8612a()
            r1 = r27[r8]
            r2 = r28[r8]
            boolean r3 = r10.f8020i
            com.google.android.exoplayer2.b.f r0 = r11.mo8772a(r0, r1, r2, r3)
            r19[r8] = r0
            goto L_0x010e
        L_0x00c0:
            if (r9 != 0) goto L_0x00e1
            r1 = r27[r8]
            r2 = r28[r8]
            r10 = r23
            java.lang.String r3 = r10.f8013b
            java.lang.String r4 = r10.f8012a
            boolean r5 = r10.f8020i
            r0 = r25
            com.google.android.exoplayer2.b.f r0 = r0.mo8774a(r1, r2, r3, r4, r5)
            r19[r8] = r0
            r0 = r19[r8]
            if (r0 == 0) goto L_0x00dc
            r0 = 1
            goto L_0x00dd
        L_0x00dc:
            r0 = 0
        L_0x00dd:
            r9 = r0
        L_0x00de:
            r11 = r25
            goto L_0x010e
        L_0x00e1:
            r10 = r23
            goto L_0x00de
        L_0x00e4:
            r10 = r23
            if (r6 != 0) goto L_0x00de
            r1 = r27[r8]
            r2 = r28[r8]
            java.lang.String r3 = r10.f8012a
            boolean r4 = r10.f8020i
            boolean r5 = r10.f8014c
            if (r17 == 0) goto L_0x00f9
            r0 = 0
            r6 = r0
            r11 = r25
            goto L_0x00fe
        L_0x00f9:
            r11 = r25
            com.google.android.exoplayer2.b.f$a r0 = r11.f8007b
            r6 = r0
        L_0x00fe:
            r0 = r25
            com.google.android.exoplayer2.b.f r0 = r0.mo8775a(r1, r2, r3, r4, r5, r6)
            r19[r8] = r0
            r0 = r19[r8]
            if (r0 == 0) goto L_0x010c
            r0 = 1
            goto L_0x010d
        L_0x010c:
            r0 = 0
        L_0x010d:
            r6 = r0
        L_0x010e:
            int r8 = r8 + 1
            r23 = r10
            goto L_0x009e
        L_0x0113:
            r11 = r25
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p101b.C2474c.mo8776a(com.google.android.exoplayer2.m[], com.google.android.exoplayer2.source.i[], int[][][]):com.google.android.exoplayer2.b.f[]");
    }
}
