package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import sun.misc.Unsafe;

final class abp<T> implements ace<T> {

    /* renamed from: a */
    private static final Unsafe f11396a = adc.m15820c();

    /* renamed from: b */
    private final int[] f11397b;

    /* renamed from: c */
    private final Object[] f11398c;

    /* renamed from: d */
    private final int f11399d;

    /* renamed from: e */
    private final int f11400e;

    /* renamed from: f */
    private final int f11401f;

    /* renamed from: g */
    private final abl f11402g;

    /* renamed from: h */
    private final boolean f11403h;

    /* renamed from: i */
    private final boolean f11404i;

    /* renamed from: j */
    private final boolean f11405j;

    /* renamed from: k */
    private final boolean f11406k;

    /* renamed from: l */
    private final int[] f11407l;

    /* renamed from: m */
    private final int[] f11408m;

    /* renamed from: n */
    private final int[] f11409n;

    /* renamed from: o */
    private final abu f11410o;

    /* renamed from: p */
    private final aaw f11411p;

    /* renamed from: q */
    private final acw<?, ?> f11412q;

    /* renamed from: r */
    private final C4137zz<?> f11413r;

    /* renamed from: s */
    private final abg f11414s;

    private abp(int[] iArr, Object[] objArr, int i, int i2, int i3, abl abl, boolean z, boolean z2, int[] iArr2, int[] iArr3, int[] iArr4, abu abu, aaw aaw, acw<?, ?> acw, C4137zz<?> zzVar, abg abg) {
        abl abl2 = abl;
        C4137zz<?> zzVar2 = zzVar;
        this.f11397b = iArr;
        this.f11398c = objArr;
        this.f11399d = i;
        this.f11400e = i2;
        this.f11401f = i3;
        this.f11404i = abl2 instanceof aai;
        this.f11405j = z;
        this.f11403h = zzVar2 != null && zzVar2.mo11438a(abl);
        this.f11406k = false;
        this.f11407l = iArr2;
        this.f11408m = iArr3;
        this.f11409n = iArr4;
        this.f11410o = abu;
        this.f11411p = aaw;
        this.f11412q = acw;
        this.f11413r = zzVar2;
        this.f11402g = abl2;
        this.f11414s = abg;
    }

    /* renamed from: a */
    private static int m15483a(int i, byte[] bArr, int i2, int i3, Object obj, C4116ze zeVar) {
        return C4115zd.m20407a(i, bArr, i2, i3, m15520e(obj), zeVar);
    }

    /* renamed from: a */
    private static int m15484a(ace<?> ace, int i, byte[] bArr, int i2, int i3, aan<?> aan, C4116ze zeVar) {
        int a = m15486a((ace) ace, bArr, i2, i3, zeVar);
        while (true) {
            aan.add(zeVar.f15167c);
            if (a >= i3) {
                break;
            }
            int a2 = C4115zd.m20412a(bArr, a, zeVar);
            if (i != zeVar.f15165a) {
                break;
            }
            a = m15486a((ace) ace, bArr, a2, i3, zeVar);
        }
        return a;
    }

    /* renamed from: a */
    private static int m15485a(ace ace, byte[] bArr, int i, int i2, int i3, C4116ze zeVar) {
        abp abp = (abp) ace;
        Object a = abp.mo11556a();
        int a2 = abp.m15491a((T) a, bArr, i, i2, i3, zeVar);
        abp.mo11563c((T) a);
        zeVar.f15167c = a;
        return a2;
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [int] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m15486a(com.google.android.gms.internal.ads.ace r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.ads.C4116ze r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = com.google.android.gms.internal.ads.C4115zd.m20409a(r8, r7, r0, r10)
            int r8 = r10.f15165a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo11556a()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo11559a(r1, r2, r3, r4, r5)
            r6.mo11563c(r9)
            r10.f15167c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.ads.zzbbu r6 = com.google.android.gms.internal.ads.zzbbu.zzadl()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.abp.m15486a(com.google.android.gms.internal.ads.ace, byte[], int, int, com.google.android.gms.internal.ads.ze):int");
    }

    /* renamed from: a */
    private static <UT, UB> int m15487a(acw<UT, UB> acw, T t) {
        return acw.mo11698f(acw.mo11690b(t));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b9, code lost:
        r2 = r2 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0143, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0150, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0154, code lost:
        r12.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0162, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0173, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0178, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m15488a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.ads.C4116ze r29) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = f11396a
            int[] r7 = r0.f11397b
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x0168;
                case 52: goto L_0x0158;
                case 53: goto L_0x0148;
                case 54: goto L_0x0148;
                case 55: goto L_0x013b;
                case 56: goto L_0x012f;
                case 57: goto L_0x0124;
                case 58: goto L_0x010e;
                case 59: goto L_0x00e2;
                case 60: goto L_0x00bc;
                case 61: goto L_0x00a4;
                case 62: goto L_0x013b;
                case 63: goto L_0x0076;
                case 64: goto L_0x0124;
                case 65: goto L_0x012f;
                case 66: goto L_0x0068;
                case 67: goto L_0x005a;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x017c
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x017c
            r2 = r2 & -8
            r7 = r2 | 4
            com.google.android.gms.internal.ads.ace r2 = r0.m15494a(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = m15485a(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            if (r15 != 0) goto L_0x0052
            java.lang.Object r3 = r11.f15167c
            goto L_0x0154
        L_0x0052:
            java.lang.Object r3 = r11.f15167c
            java.lang.Object r3 = com.google.android.gms.internal.ads.aak.m15382a(r15, r3)
            goto L_0x0154
        L_0x005a:
            if (r5 != 0) goto L_0x017c
            int r2 = com.google.android.gms.internal.ads.C4115zd.m20413b(r3, r4, r11)
            long r3 = r11.f15166b
            long r3 = com.google.android.gms.internal.ads.C4124zm.m20432a(r3)
            goto L_0x0150
        L_0x0068:
            if (r5 != 0) goto L_0x017c
            int r2 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r4, r11)
            int r3 = r11.f15165a
            int r3 = com.google.android.gms.internal.ads.C4124zm.m20434f(r3)
            goto L_0x0143
        L_0x0076:
            if (r5 != 0) goto L_0x017c
            int r3 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r4, r11)
            int r4 = r11.f15165a
            com.google.android.gms.internal.ads.aam r5 = r0.m15514c(r6)
            if (r5 == 0) goto L_0x009a
            com.google.android.gms.internal.ads.aal r5 = r5.mo11500a(r4)
            if (r5 == 0) goto L_0x008b
            goto L_0x009a
        L_0x008b:
            com.google.android.gms.internal.ads.acx r1 = m15520e(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.mo11699a(r2, r4)
            r2 = r3
            goto L_0x017d
        L_0x009a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x0178
        L_0x00a4:
            if (r5 != r15) goto L_0x017c
            int r2 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r4, r11)
            int r4 = r11.f15165a
            if (r4 != 0) goto L_0x00b2
            com.google.android.gms.internal.ads.zzbah r3 = com.google.android.gms.internal.ads.zzbah.zzdpq
            goto L_0x0154
        L_0x00b2:
            com.google.android.gms.internal.ads.zzbah r3 = com.google.android.gms.internal.ads.zzbah.zzc(r3, r2, r4)
            r12.putObject(r1, r9, r3)
        L_0x00b9:
            int r2 = r2 + r4
            goto L_0x0178
        L_0x00bc:
            if (r5 != r15) goto L_0x017c
            com.google.android.gms.internal.ads.ace r2 = r0.m15494a(r6)
            r5 = r20
            int r2 = m15486a(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00d3
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00d4
        L_0x00d3:
            r15 = 0
        L_0x00d4:
            if (r15 != 0) goto L_0x00da
            java.lang.Object r3 = r11.f15167c
            goto L_0x0154
        L_0x00da:
            java.lang.Object r3 = r11.f15167c
            java.lang.Object r3 = com.google.android.gms.internal.ads.aak.m15382a(r15, r3)
            goto L_0x0154
        L_0x00e2:
            if (r5 != r15) goto L_0x017c
            int r2 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r4, r11)
            int r4 = r11.f15165a
            if (r4 != 0) goto L_0x00ef
            java.lang.String r3 = ""
            goto L_0x0154
        L_0x00ef:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x0103
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.ads.ade.m15886a(r3, r2, r5)
            if (r5 == 0) goto L_0x00fe
            goto L_0x0103
        L_0x00fe:
            com.google.android.gms.internal.ads.zzbbu r1 = com.google.android.gms.internal.ads.zzbbu.zzads()
            throw r1
        L_0x0103:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.ads.aak.f11362a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            goto L_0x00b9
        L_0x010e:
            if (r5 != 0) goto L_0x017c
            int r2 = com.google.android.gms.internal.ads.C4115zd.m20413b(r3, r4, r11)
            long r3 = r11.f15166b
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x011e
            r15 = 1
            goto L_0x011f
        L_0x011e:
            r15 = 0
        L_0x011f:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            goto L_0x0154
        L_0x0124:
            if (r5 != r7) goto L_0x017c
            int r2 = com.google.android.gms.internal.ads.C4115zd.m20410a(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0162
        L_0x012f:
            r2 = 1
            if (r5 != r2) goto L_0x017c
            long r2 = com.google.android.gms.internal.ads.C4115zd.m20414b(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x0173
        L_0x013b:
            if (r5 != 0) goto L_0x017c
            int r2 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r4, r11)
            int r3 = r11.f15165a
        L_0x0143:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0154
        L_0x0148:
            if (r5 != 0) goto L_0x017c
            int r2 = com.google.android.gms.internal.ads.C4115zd.m20413b(r3, r4, r11)
            long r3 = r11.f15166b
        L_0x0150:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x0154:
            r12.putObject(r1, r9, r3)
            goto L_0x0178
        L_0x0158:
            if (r5 != r7) goto L_0x017c
            float r2 = com.google.android.gms.internal.ads.C4115zd.m20417d(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
        L_0x0162:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 4
            goto L_0x0178
        L_0x0168:
            r2 = 1
            if (r5 != r2) goto L_0x017c
            double r2 = com.google.android.gms.internal.ads.C4115zd.m20415c(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
        L_0x0173:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 8
        L_0x0178:
            r12.putInt(r1, r13, r8)
            goto L_0x017d
        L_0x017c:
            r2 = r4
        L_0x017d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.abp.m15488a(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.ads.ze):int");
    }

    /* JADX INFO: used method not loaded: com.google.android.gms.internal.ads.zf.a(boolean):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x022e, code lost:
        if (r7.f15166b != 0) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0230, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0232, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0233, code lost:
        r11.mo13834a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0236, code lost:
        if (r4 >= r5) goto L_0x0397;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0238, code lost:
        r6 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x023e, code lost:
        if (r2 != r7.f15165a) goto L_0x0397;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0240, code lost:
        r4 = com.google.android.gms.internal.ads.C4115zd.m20413b(r3, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0248, code lost:
        if (r7.f15166b == 0) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0130, code lost:
        if (r4 == 0) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        r11.add(com.google.android.gms.internal.ads.zzbah.zzdpq);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0138, code lost:
        r11.add(com.google.android.gms.internal.ads.zzbah.zzc(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0140, code lost:
        if (r1 >= r5) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0142, code lost:
        r4 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0148, code lost:
        if (r2 != r7.f15165a) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014a, code lost:
        r1 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r4, r7);
        r4 = r7.f15165a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0150, code lost:
        if (r4 != 0) goto L_0x0138;
     */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01cf  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m15489a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.ads.C4116ze r30) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r23
            r8 = r24
            r9 = r28
            r7 = r30
            sun.misc.Unsafe r11 = f11396a
            java.lang.Object r11 = r11.getObject(r1, r9)
            com.google.android.gms.internal.ads.aan r11 = (com.google.android.gms.internal.ads.aan) r11
            boolean r12 = r11.mo11501a()
            r13 = 1
            if (r12 != 0) goto L_0x0036
            int r12 = r11.size()
            if (r12 != 0) goto L_0x002c
            r12 = 10
            goto L_0x002d
        L_0x002c:
            int r12 = r12 << r13
        L_0x002d:
            com.google.android.gms.internal.ads.aan r11 = r11.mo11460a(r12)
            sun.misc.Unsafe r12 = f11396a
            r12.putObject(r1, r9, r11)
        L_0x0036:
            r9 = 5
            r14 = 0
            r10 = 2
            switch(r27) {
                case 18: goto L_0x0359;
                case 19: goto L_0x031b;
                case 20: goto L_0x02e3;
                case 21: goto L_0x02e3;
                case 22: goto L_0x02c9;
                case 23: goto L_0x028a;
                case 24: goto L_0x024b;
                case 25: goto L_0x01fa;
                case 26: goto L_0x016d;
                case 27: goto L_0x0153;
                case 28: goto L_0x0128;
                case 29: goto L_0x02c9;
                case 30: goto L_0x00f0;
                case 31: goto L_0x024b;
                case 32: goto L_0x028a;
                case 33: goto L_0x00b0;
                case 34: goto L_0x0070;
                case 35: goto L_0x0359;
                case 36: goto L_0x031b;
                case 37: goto L_0x02e3;
                case 38: goto L_0x02e3;
                case 39: goto L_0x02c9;
                case 40: goto L_0x028a;
                case 41: goto L_0x024b;
                case 42: goto L_0x01fa;
                case 43: goto L_0x02c9;
                case 44: goto L_0x00f0;
                case 45: goto L_0x024b;
                case 46: goto L_0x028a;
                case 47: goto L_0x00b0;
                case 48: goto L_0x0070;
                case 49: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0397
        L_0x003f:
            r1 = 3
            if (r6 != r1) goto L_0x0397
            com.google.android.gms.internal.ads.ace r1 = r0.m15494a(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
        L_0x0050:
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = m15485a(r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r7.f15167c
            r11.add(r8)
            if (r4 >= r5) goto L_0x0397
            int r8 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r4, r7)
            int r9 = r7.f15165a
            if (r2 != r9) goto L_0x0397
            r22 = r1
            r23 = r18
            r24 = r8
            goto L_0x0050
        L_0x0070:
            if (r6 != r10) goto L_0x0094
            com.google.android.gms.internal.ads.aba r11 = (com.google.android.gms.internal.ads.aba) r11
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r4, r7)
            int r2 = r7.f15165a
            int r2 = r2 + r1
        L_0x007b:
            if (r1 >= r2) goto L_0x008b
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20413b(r3, r1, r7)
            long r4 = r7.f15166b
            long r4 = com.google.android.gms.internal.ads.C4124zm.m20432a(r4)
            r11.mo11535a(r4)
            goto L_0x007b
        L_0x008b:
            if (r1 != r2) goto L_0x008f
            goto L_0x0398
        L_0x008f:
            com.google.android.gms.internal.ads.zzbbu r1 = com.google.android.gms.internal.ads.zzbbu.zzadl()
            throw r1
        L_0x0094:
            if (r6 != 0) goto L_0x0397
            com.google.android.gms.internal.ads.aba r11 = (com.google.android.gms.internal.ads.aba) r11
        L_0x0098:
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20413b(r3, r4, r7)
            long r8 = r7.f15166b
            long r8 = com.google.android.gms.internal.ads.C4124zm.m20432a(r8)
            r11.mo11535a(r8)
            if (r1 >= r5) goto L_0x0398
            int r4 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r1, r7)
            int r6 = r7.f15165a
            if (r2 != r6) goto L_0x0398
            goto L_0x0098
        L_0x00b0:
            if (r6 != r10) goto L_0x00d4
            com.google.android.gms.internal.ads.aaj r11 = (com.google.android.gms.internal.ads.aaj) r11
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r4, r7)
            int r2 = r7.f15165a
            int r2 = r2 + r1
        L_0x00bb:
            if (r1 >= r2) goto L_0x00cb
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r1, r7)
            int r4 = r7.f15165a
            int r4 = com.google.android.gms.internal.ads.C4124zm.m20434f(r4)
            r11.mo11495c(r4)
            goto L_0x00bb
        L_0x00cb:
            if (r1 != r2) goto L_0x00cf
            goto L_0x0398
        L_0x00cf:
            com.google.android.gms.internal.ads.zzbbu r1 = com.google.android.gms.internal.ads.zzbbu.zzadl()
            throw r1
        L_0x00d4:
            if (r6 != 0) goto L_0x0397
            com.google.android.gms.internal.ads.aaj r11 = (com.google.android.gms.internal.ads.aaj) r11
        L_0x00d8:
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r4, r7)
            int r4 = r7.f15165a
            int r4 = com.google.android.gms.internal.ads.C4124zm.m20434f(r4)
            r11.mo11495c(r4)
            if (r1 >= r5) goto L_0x0398
            int r4 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r1, r7)
            int r6 = r7.f15165a
            if (r2 != r6) goto L_0x0398
            goto L_0x00d8
        L_0x00f0:
            if (r6 != r10) goto L_0x00f7
            int r2 = com.google.android.gms.internal.ads.C4115zd.m20411a(r3, r4, r11, r7)
            goto L_0x0108
        L_0x00f7:
            if (r6 != 0) goto L_0x0397
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r11
            r7 = r30
            int r2 = com.google.android.gms.internal.ads.C4115zd.m20406a(r2, r3, r4, r5, r6, r7)
        L_0x0108:
            com.google.android.gms.internal.ads.aai r1 = (com.google.android.gms.internal.ads.aai) r1
            com.google.android.gms.internal.ads.acx r3 = r1.zzdtt
            com.google.android.gms.internal.ads.acx r4 = com.google.android.gms.internal.ads.acx.m15765a()
            if (r3 != r4) goto L_0x0113
            r3 = 0
        L_0x0113:
            com.google.android.gms.internal.ads.aam r4 = r0.m15514c(r8)
            com.google.android.gms.internal.ads.acw<?, ?> r5 = r0.f11412q
            r6 = r22
            java.lang.Object r3 = com.google.android.gms.internal.ads.acg.m15663a(r6, r11, r4, r3, r5)
            com.google.android.gms.internal.ads.acx r3 = (com.google.android.gms.internal.ads.acx) r3
            if (r3 == 0) goto L_0x0125
            r1.zzdtt = r3
        L_0x0125:
            r1 = r2
            goto L_0x0398
        L_0x0128:
            if (r6 != r10) goto L_0x0397
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r4, r7)
            int r4 = r7.f15165a
            if (r4 != 0) goto L_0x0138
        L_0x0132:
            com.google.android.gms.internal.ads.zzbah r4 = com.google.android.gms.internal.ads.zzbah.zzdpq
            r11.add(r4)
            goto L_0x0140
        L_0x0138:
            com.google.android.gms.internal.ads.zzbah r6 = com.google.android.gms.internal.ads.zzbah.zzc(r3, r1, r4)
            r11.add(r6)
            int r1 = r1 + r4
        L_0x0140:
            if (r1 >= r5) goto L_0x0398
            int r4 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r1, r7)
            int r6 = r7.f15165a
            if (r2 != r6) goto L_0x0398
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r4, r7)
            int r4 = r7.f15165a
            if (r4 != 0) goto L_0x0138
            goto L_0x0132
        L_0x0153:
            if (r6 != r10) goto L_0x0397
            com.google.android.gms.internal.ads.ace r1 = r0.m15494a(r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r11
            r28 = r30
            int r1 = m15484a(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0398
        L_0x016d:
            if (r6 != r10) goto L_0x0397
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            int r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r1 != 0) goto L_0x01ac
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r4, r7)
            int r4 = r7.f15165a
            if (r4 != 0) goto L_0x0186
        L_0x0180:
            java.lang.String r4 = ""
            r11.add(r4)
            goto L_0x0191
        L_0x0186:
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r8 = com.google.android.gms.internal.ads.aak.f11362a
            r6.<init>(r3, r1, r4, r8)
        L_0x018d:
            r11.add(r6)
            int r1 = r1 + r4
        L_0x0191:
            if (r1 >= r5) goto L_0x0398
            int r4 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r1, r7)
            int r6 = r7.f15165a
            if (r2 != r6) goto L_0x0398
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r4, r7)
            int r4 = r7.f15165a
            if (r4 != 0) goto L_0x01a4
            goto L_0x0180
        L_0x01a4:
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r8 = com.google.android.gms.internal.ads.aak.f11362a
            r6.<init>(r3, r1, r4, r8)
            goto L_0x018d
        L_0x01ac:
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r4, r7)
            int r4 = r7.f15165a
            if (r4 != 0) goto L_0x01ba
        L_0x01b4:
            java.lang.String r4 = ""
            r11.add(r4)
            goto L_0x01cd
        L_0x01ba:
            int r6 = r1 + r4
            boolean r8 = com.google.android.gms.internal.ads.ade.m15886a(r3, r1, r6)
            if (r8 == 0) goto L_0x01f5
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.ads.aak.f11362a
            r8.<init>(r3, r1, r4, r9)
        L_0x01c9:
            r11.add(r8)
            r1 = r6
        L_0x01cd:
            if (r1 >= r5) goto L_0x0398
            int r4 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r1, r7)
            int r6 = r7.f15165a
            if (r2 != r6) goto L_0x0398
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r4, r7)
            int r4 = r7.f15165a
            if (r4 != 0) goto L_0x01e0
            goto L_0x01b4
        L_0x01e0:
            int r6 = r1 + r4
            boolean r8 = com.google.android.gms.internal.ads.ade.m15886a(r3, r1, r6)
            if (r8 == 0) goto L_0x01f0
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.ads.aak.f11362a
            r8.<init>(r3, r1, r4, r9)
            goto L_0x01c9
        L_0x01f0:
            com.google.android.gms.internal.ads.zzbbu r1 = com.google.android.gms.internal.ads.zzbbu.zzads()
            throw r1
        L_0x01f5:
            com.google.android.gms.internal.ads.zzbbu r1 = com.google.android.gms.internal.ads.zzbbu.zzads()
            throw r1
        L_0x01fa:
            r1 = 0
            if (r6 != r10) goto L_0x0222
            com.google.android.gms.internal.ads.zf r11 = (com.google.android.gms.internal.ads.C4117zf) r11
            int r2 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r4, r7)
            int r4 = r7.f15165a
            int r4 = r4 + r2
        L_0x0206:
            if (r2 >= r4) goto L_0x0219
            int r2 = com.google.android.gms.internal.ads.C4115zd.m20413b(r3, r2, r7)
            long r5 = r7.f15166b
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x0214
            r5 = 1
            goto L_0x0215
        L_0x0214:
            r5 = 0
        L_0x0215:
            r11.mo13834a(r5)
            goto L_0x0206
        L_0x0219:
            if (r2 != r4) goto L_0x021d
            goto L_0x0125
        L_0x021d:
            com.google.android.gms.internal.ads.zzbbu r1 = com.google.android.gms.internal.ads.zzbbu.zzadl()
            throw r1
        L_0x0222:
            if (r6 != 0) goto L_0x0397
            com.google.android.gms.internal.ads.zf r11 = (com.google.android.gms.internal.ads.C4117zf) r11
            int r4 = com.google.android.gms.internal.ads.C4115zd.m20413b(r3, r4, r7)
            long r8 = r7.f15166b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0232
        L_0x0230:
            r6 = 1
            goto L_0x0233
        L_0x0232:
            r6 = 0
        L_0x0233:
            r11.mo13834a(r6)
            if (r4 >= r5) goto L_0x0397
            int r6 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r4, r7)
            int r8 = r7.f15165a
            if (r2 != r8) goto L_0x0397
            int r4 = com.google.android.gms.internal.ads.C4115zd.m20413b(r3, r6, r7)
            long r8 = r7.f15166b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0232
            goto L_0x0230
        L_0x024b:
            if (r6 != r10) goto L_0x026b
            com.google.android.gms.internal.ads.aaj r11 = (com.google.android.gms.internal.ads.aaj) r11
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r4, r7)
            int r2 = r7.f15165a
            int r2 = r2 + r1
        L_0x0256:
            if (r1 >= r2) goto L_0x0262
            int r4 = com.google.android.gms.internal.ads.C4115zd.m20410a(r3, r1)
            r11.mo11495c(r4)
            int r1 = r1 + 4
            goto L_0x0256
        L_0x0262:
            if (r1 != r2) goto L_0x0266
            goto L_0x0398
        L_0x0266:
            com.google.android.gms.internal.ads.zzbbu r1 = com.google.android.gms.internal.ads.zzbbu.zzadl()
            throw r1
        L_0x026b:
            if (r6 != r9) goto L_0x0397
            com.google.android.gms.internal.ads.aaj r11 = (com.google.android.gms.internal.ads.aaj) r11
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20410a(r18, r19)
            r11.mo11495c(r1)
        L_0x0276:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0398
            int r4 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r1, r7)
            int r6 = r7.f15165a
            if (r2 != r6) goto L_0x0398
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20410a(r3, r4)
            r11.mo11495c(r1)
            goto L_0x0276
        L_0x028a:
            if (r6 != r10) goto L_0x02aa
            com.google.android.gms.internal.ads.aba r11 = (com.google.android.gms.internal.ads.aba) r11
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r4, r7)
            int r2 = r7.f15165a
            int r2 = r2 + r1
        L_0x0295:
            if (r1 >= r2) goto L_0x02a1
            long r4 = com.google.android.gms.internal.ads.C4115zd.m20414b(r3, r1)
            r11.mo11535a(r4)
            int r1 = r1 + 8
            goto L_0x0295
        L_0x02a1:
            if (r1 != r2) goto L_0x02a5
            goto L_0x0398
        L_0x02a5:
            com.google.android.gms.internal.ads.zzbbu r1 = com.google.android.gms.internal.ads.zzbbu.zzadl()
            throw r1
        L_0x02aa:
            if (r6 != r13) goto L_0x0397
            com.google.android.gms.internal.ads.aba r11 = (com.google.android.gms.internal.ads.aba) r11
            long r8 = com.google.android.gms.internal.ads.C4115zd.m20414b(r18, r19)
            r11.mo11535a(r8)
        L_0x02b5:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0398
            int r4 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r1, r7)
            int r6 = r7.f15165a
            if (r2 != r6) goto L_0x0398
            long r8 = com.google.android.gms.internal.ads.C4115zd.m20414b(r3, r4)
            r11.mo11535a(r8)
            goto L_0x02b5
        L_0x02c9:
            if (r6 != r10) goto L_0x02d1
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20411a(r3, r4, r11, r7)
            goto L_0x0398
        L_0x02d1:
            if (r6 != 0) goto L_0x0397
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r11
            r26 = r30
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20406a(r21, r22, r23, r24, r25, r26)
            goto L_0x0398
        L_0x02e3:
            if (r6 != r10) goto L_0x0303
            com.google.android.gms.internal.ads.aba r11 = (com.google.android.gms.internal.ads.aba) r11
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r4, r7)
            int r2 = r7.f15165a
            int r2 = r2 + r1
        L_0x02ee:
            if (r1 >= r2) goto L_0x02fa
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20413b(r3, r1, r7)
            long r4 = r7.f15166b
            r11.mo11535a(r4)
            goto L_0x02ee
        L_0x02fa:
            if (r1 != r2) goto L_0x02fe
            goto L_0x0398
        L_0x02fe:
            com.google.android.gms.internal.ads.zzbbu r1 = com.google.android.gms.internal.ads.zzbbu.zzadl()
            throw r1
        L_0x0303:
            if (r6 != 0) goto L_0x0397
            com.google.android.gms.internal.ads.aba r11 = (com.google.android.gms.internal.ads.aba) r11
        L_0x0307:
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20413b(r3, r4, r7)
            long r8 = r7.f15166b
            r11.mo11535a(r8)
            if (r1 >= r5) goto L_0x0398
            int r4 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r1, r7)
            int r6 = r7.f15165a
            if (r2 != r6) goto L_0x0398
            goto L_0x0307
        L_0x031b:
            if (r6 != r10) goto L_0x033a
            com.google.android.gms.internal.ads.aag r11 = (com.google.android.gms.internal.ads.aag) r11
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r4, r7)
            int r2 = r7.f15165a
            int r2 = r2 + r1
        L_0x0326:
            if (r1 >= r2) goto L_0x0332
            float r4 = com.google.android.gms.internal.ads.C4115zd.m20417d(r3, r1)
            r11.mo11461a(r4)
            int r1 = r1 + 4
            goto L_0x0326
        L_0x0332:
            if (r1 != r2) goto L_0x0335
            goto L_0x0398
        L_0x0335:
            com.google.android.gms.internal.ads.zzbbu r1 = com.google.android.gms.internal.ads.zzbbu.zzadl()
            throw r1
        L_0x033a:
            if (r6 != r9) goto L_0x0397
            com.google.android.gms.internal.ads.aag r11 = (com.google.android.gms.internal.ads.aag) r11
            float r1 = com.google.android.gms.internal.ads.C4115zd.m20417d(r18, r19)
            r11.mo11461a(r1)
        L_0x0345:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0398
            int r4 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r1, r7)
            int r6 = r7.f15165a
            if (r2 != r6) goto L_0x0398
            float r1 = com.google.android.gms.internal.ads.C4115zd.m20417d(r3, r4)
            r11.mo11461a(r1)
            goto L_0x0345
        L_0x0359:
            if (r6 != r10) goto L_0x0378
            com.google.android.gms.internal.ads.zt r11 = (com.google.android.gms.internal.ads.C4131zt) r11
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r4, r7)
            int r2 = r7.f15165a
            int r2 = r2 + r1
        L_0x0364:
            if (r1 >= r2) goto L_0x0370
            double r4 = com.google.android.gms.internal.ads.C4115zd.m20415c(r3, r1)
            r11.mo13871a(r4)
            int r1 = r1 + 8
            goto L_0x0364
        L_0x0370:
            if (r1 != r2) goto L_0x0373
            goto L_0x0398
        L_0x0373:
            com.google.android.gms.internal.ads.zzbbu r1 = com.google.android.gms.internal.ads.zzbbu.zzadl()
            throw r1
        L_0x0378:
            if (r6 != r13) goto L_0x0397
            com.google.android.gms.internal.ads.zt r11 = (com.google.android.gms.internal.ads.C4131zt) r11
            double r8 = com.google.android.gms.internal.ads.C4115zd.m20415c(r18, r19)
            r11.mo13871a(r8)
        L_0x0383:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0398
            int r4 = com.google.android.gms.internal.ads.C4115zd.m20412a(r3, r1, r7)
            int r6 = r7.f15165a
            if (r2 != r6) goto L_0x0398
            double r8 = com.google.android.gms.internal.ads.C4115zd.m20415c(r3, r4)
            r11.mo13871a(r8)
            goto L_0x0383
        L_0x0397:
            r1 = r4
        L_0x0398:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.abp.m15489a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.ze):int");
    }

    /* JADX WARNING: type inference failed for: r9v4, types: [int] */
    /* JADX WARNING: type inference failed for: r9v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <K, V> int m15490a(T r7, byte[] r8, int r9, int r10, int r11, int r12, long r13, com.google.android.gms.internal.ads.C4116ze r15) {
        /*
            r6 = this;
            sun.misc.Unsafe r12 = f11396a
            java.lang.Object r11 = r6.m15508b(r11)
            java.lang.Object r0 = r12.getObject(r7, r13)
            com.google.android.gms.internal.ads.abg r1 = r6.f11414s
            boolean r1 = r1.mo11545c(r0)
            if (r1 == 0) goto L_0x0021
            com.google.android.gms.internal.ads.abg r1 = r6.f11414s
            java.lang.Object r1 = r1.mo11547e(r11)
            com.google.android.gms.internal.ads.abg r2 = r6.f11414s
            r2.mo11542a(r1, r0)
            r12.putObject(r7, r13, r1)
            r0 = r1
        L_0x0021:
            com.google.android.gms.internal.ads.abg r7 = r6.f11414s
            com.google.android.gms.internal.ads.abf r7 = r7.mo11548f(r11)
            com.google.android.gms.internal.ads.abg r11 = r6.f11414s
            java.util.Map r11 = r11.mo11543a(r0)
            int r9 = com.google.android.gms.internal.ads.C4115zd.m20412a(r8, r9, r15)
            int r12 = r15.f15165a
            if (r12 < 0) goto L_0x0094
            int r13 = r10 - r9
            if (r12 > r13) goto L_0x0094
            int r12 = r12 + r9
            K r13 = r7.f11391b
            V r14 = r7.f11393d
        L_0x003e:
            if (r9 >= r12) goto L_0x0089
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x004c
            int r0 = com.google.android.gms.internal.ads.C4115zd.m20409a(r9, r8, r0, r15)
            int r9 = r15.f15165a
        L_0x004c:
            r1 = r0
            int r0 = r9 >>> 3
            r2 = r9 & 7
            switch(r0) {
                case 1: goto L_0x006f;
                case 2: goto L_0x0055;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x0084
        L_0x0055:
            com.google.android.gms.internal.ads.zzbes r0 = r7.f11392c
            int r0 = r0.zzagm()
            if (r2 != r0) goto L_0x0084
            com.google.android.gms.internal.ads.zzbes r3 = r7.f11392c
            V r9 = r7.f11393d
            java.lang.Class r4 = r9.getClass()
            r0 = r8
            r2 = r10
            r5 = r15
            int r9 = m15492a(r0, r1, r2, r3, r4, r5)
            java.lang.Object r14 = r15.f15167c
            goto L_0x003e
        L_0x006f:
            com.google.android.gms.internal.ads.zzbes r0 = r7.f11390a
            int r0 = r0.zzagm()
            if (r2 != r0) goto L_0x0084
            com.google.android.gms.internal.ads.zzbes r3 = r7.f11390a
            r4 = 0
            r0 = r8
            r2 = r10
            r5 = r15
            int r9 = m15492a(r0, r1, r2, r3, r4, r5)
            java.lang.Object r13 = r15.f15167c
            goto L_0x003e
        L_0x0084:
            int r9 = com.google.android.gms.internal.ads.C4115zd.m20408a(r9, r8, r1, r10, r15)
            goto L_0x003e
        L_0x0089:
            if (r9 != r12) goto L_0x008f
            r11.put(r13, r14)
            return r12
        L_0x008f:
            com.google.android.gms.internal.ads.zzbbu r7 = com.google.android.gms.internal.ads.zzbbu.zzadr()
            throw r7
        L_0x0094:
            com.google.android.gms.internal.ads.zzbbu r7 = com.google.android.gms.internal.ads.zzbbu.zzadl()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.abp.m15490a(java.lang.Object, byte[], int, int, int, int, long, com.google.android.gms.internal.ads.ze):int");
    }

    /* JADX WARNING: type inference failed for: r33v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v1, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r0v10, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r5v2, types: [int] */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r0v13, types: [int] */
    /* JADX WARNING: type inference failed for: r1v8, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r30v0 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r30v1 */
    /* JADX WARNING: type inference failed for: r30v2 */
    /* JADX WARNING: type inference failed for: r30v3 */
    /* JADX WARNING: type inference failed for: r19v0 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: type inference failed for: r11v7 */
    /* JADX WARNING: type inference failed for: r30v4 */
    /* JADX WARNING: type inference failed for: r2v6, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v7, types: [int] */
    /* JADX WARNING: type inference failed for: r2v7, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r30v5 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r30v6 */
    /* JADX WARNING: type inference failed for: r2v9, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v9, types: [int] */
    /* JADX WARNING: type inference failed for: r30v7 */
    /* JADX WARNING: type inference failed for: r30v8 */
    /* JADX WARNING: type inference failed for: r1v14, types: [int] */
    /* JADX WARNING: type inference failed for: r2v11, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r11v11 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r25v0 */
    /* JADX WARNING: type inference failed for: r7v19 */
    /* JADX WARNING: type inference failed for: r25v1 */
    /* JADX WARNING: type inference failed for: r12v10 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: type inference failed for: r25v2 */
    /* JADX WARNING: type inference failed for: r12v11 */
    /* JADX WARNING: type inference failed for: r25v3 */
    /* JADX WARNING: type inference failed for: r12v12, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r25v4 */
    /* JADX WARNING: type inference failed for: r12v13, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r25v5 */
    /* JADX WARNING: type inference failed for: r12v14, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r25v6 */
    /* JADX WARNING: type inference failed for: r12v15, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r25v7 */
    /* JADX WARNING: type inference failed for: r25v8 */
    /* JADX WARNING: type inference failed for: r12v16, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r25v9 */
    /* JADX WARNING: type inference failed for: r12v17, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r25v10 */
    /* JADX WARNING: type inference failed for: r12v18, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r25v11 */
    /* JADX WARNING: type inference failed for: r12v19 */
    /* JADX WARNING: type inference failed for: r25v12 */
    /* JADX WARNING: type inference failed for: r12v20, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r25v13 */
    /* JADX WARNING: type inference failed for: r12v21, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v14 */
    /* JADX WARNING: type inference failed for: r25v14 */
    /* JADX WARNING: type inference failed for: r12v22 */
    /* JADX WARNING: type inference failed for: r1v32 */
    /* JADX WARNING: type inference failed for: r12v23 */
    /* JADX WARNING: type inference failed for: r1v33 */
    /* JADX WARNING: type inference failed for: r12v24 */
    /* JADX WARNING: type inference failed for: r8v17 */
    /* JADX WARNING: type inference failed for: r1v34 */
    /* JADX WARNING: type inference failed for: r12v25 */
    /* JADX WARNING: type inference failed for: r8v18 */
    /* JADX WARNING: type inference failed for: r8v19 */
    /* JADX WARNING: type inference failed for: r12v26, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v20, types: [int] */
    /* JADX WARNING: type inference failed for: r12v27, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r1v39 */
    /* JADX WARNING: type inference failed for: r8v22 */
    /* JADX WARNING: type inference failed for: r12v28, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v23 */
    /* JADX WARNING: type inference failed for: r12v29 */
    /* JADX WARNING: type inference failed for: r12v30, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r1v41 */
    /* JADX WARNING: type inference failed for: r1v43, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v24 */
    /* JADX WARNING: type inference failed for: r1v48 */
    /* JADX WARNING: type inference failed for: r12v31 */
    /* JADX WARNING: type inference failed for: r25v15 */
    /* JADX WARNING: type inference failed for: r25v16 */
    /* JADX WARNING: type inference failed for: r12v32 */
    /* JADX WARNING: type inference failed for: r5v26 */
    /* JADX WARNING: type inference failed for: r1v50, types: [int] */
    /* JADX WARNING: type inference failed for: r5v27 */
    /* JADX WARNING: type inference failed for: r12v33 */
    /* JADX WARNING: type inference failed for: r1v51 */
    /* JADX WARNING: type inference failed for: r12v34 */
    /* JADX WARNING: type inference failed for: r1v52 */
    /* JADX WARNING: type inference failed for: r7v33 */
    /* JADX WARNING: type inference failed for: r30v9 */
    /* JADX WARNING: type inference failed for: r30v10 */
    /* JADX WARNING: type inference failed for: r30v11 */
    /* JADX WARNING: type inference failed for: r12v35 */
    /* JADX WARNING: type inference failed for: r1v53 */
    /* JADX WARNING: type inference failed for: r12v36 */
    /* JADX WARNING: type inference failed for: r25v17 */
    /* JADX WARNING: type inference failed for: r12v37 */
    /* JADX WARNING: type inference failed for: r12v38 */
    /* JADX WARNING: type inference failed for: r12v39 */
    /* JADX WARNING: type inference failed for: r12v40 */
    /* JADX WARNING: type inference failed for: r12v41 */
    /* JADX WARNING: type inference failed for: r25v18 */
    /* JADX WARNING: type inference failed for: r12v42 */
    /* JADX WARNING: type inference failed for: r12v43 */
    /* JADX WARNING: type inference failed for: r12v44 */
    /* JADX WARNING: type inference failed for: r25v19 */
    /* JADX WARNING: type inference failed for: r12v45 */
    /* JADX WARNING: type inference failed for: r12v46 */
    /* JADX WARNING: type inference failed for: r25v20 */
    /* JADX WARNING: type inference failed for: r25v21 */
    /* JADX WARNING: type inference failed for: r25v22 */
    /* JADX WARNING: type inference failed for: r12v47 */
    /* JADX WARNING: type inference failed for: r12v48 */
    /* JADX WARNING: type inference failed for: r12v49 */
    /* JADX WARNING: type inference failed for: r1v54 */
    /* JADX WARNING: type inference failed for: r12v50 */
    /* JADX WARNING: type inference failed for: r1v55 */
    /* JADX WARNING: type inference failed for: r12v51 */
    /* JADX WARNING: type inference failed for: r12v52 */
    /* JADX WARNING: type inference failed for: r8v26 */
    /* JADX WARNING: type inference failed for: r12v53 */
    /* JADX WARNING: type inference failed for: r8v27 */
    /* JADX WARNING: type inference failed for: r8v28 */
    /* JADX WARNING: type inference failed for: r12v54 */
    /* JADX WARNING: type inference failed for: r12v55 */
    /* JADX WARNING: type inference failed for: r12v56 */
    /* JADX WARNING: type inference failed for: r8v29 */
    /* JADX WARNING: type inference failed for: r12v57 */
    /* JADX WARNING: type inference failed for: r25v23 */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02ff, code lost:
        if (r0 == r15) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0304, code lost:
        r12 = r33;
        r9 = r37;
        r6 = r17;
        r7 = r24;
        r10 = r29;
        r1 = r30;
        r8 = -1;
        r11 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0346, code lost:
        if (r0 == r15) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0363, code lost:
        if (r0 == r15) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0016, code lost:
        r12 = r12;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0077, code lost:
        r5 = r4;
        r24 = r7;
        r25 = r19;
        r12 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007f, code lost:
        r13 = r35;
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0142, code lost:
        r6 = r6 | r21;
        r0 = r2;
        r12 = r12;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0145, code lost:
        r1 = r8;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0146, code lost:
        r8 = -1;
        r11 = r36;
        r12 = r12;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0149, code lost:
        r13 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014d, code lost:
        r5 = r4;
        r24 = r7;
        r25 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01a1, code lost:
        r10.putObject(r14, r7, r1);
        r25 = r25;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01fc, code lost:
        r5 = r4;
        r25 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0263, code lost:
        r6 = r6 | r21;
        r25 = r25;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0265, code lost:
        r7 = r24;
        r1 = r25;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x026e, code lost:
        r2 = r5;
        r17 = r6;
        r29 = r10;
        r7 = r25;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r0v10, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r33v0, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r12v2
      assigns: []
      uses: []
      mth insns count: 490
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0376 A[ADDED_TO_REGION] */
    /* JADX WARNING: Unknown variable types count: 62 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m15491a(T r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.ads.C4116ze r37) {
        /*
            r31 = this;
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            r11 = r36
            r9 = r37
            sun.misc.Unsafe r10 = f11396a
            r16 = 0
            r8 = -1
            r0 = r34
            r1 = 0
            r6 = 0
            r7 = -1
        L_0x0016:
            if (r0 >= r13) goto L_0x039a
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0027
            int r0 = com.google.android.gms.internal.ads.C4115zd.m20409a(r0, r12, r1, r9)
            int r1 = r9.f15165a
            r4 = r0
            r5 = r1
            goto L_0x0029
        L_0x0027:
            r5 = r0
            r4 = r1
        L_0x0029:
            int r3 = r5 >>> 3
            r2 = r5 & 7
            int r1 = r15.m15523g(r3)
            if (r1 == r8) goto L_0x0366
            int[] r0 = r15.f11397b
            int r17 = r1 + 1
            r0 = r0[r17]
            r17 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r0 & r17
            int r8 = r17 >>> 20
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r5
            r5 = r0 & r17
            long r11 = (long) r5
            r5 = 17
            r20 = r0
            if (r8 > r5) goto L_0x0277
            int[] r5 = r15.f11397b
            int r21 = r1 + 2
            r5 = r5[r21]
            int r21 = r5 >>> 20
            r0 = 1
            int r21 = r0 << r21
            r5 = r5 & r17
            if (r5 == r7) goto L_0x0070
            r13 = -1
            if (r7 == r13) goto L_0x0066
            r22 = r1
            long r0 = (long) r7
            r10.putInt(r14, r0, r6)
            goto L_0x0068
        L_0x0066:
            r22 = r1
        L_0x0068:
            long r0 = (long) r5
            int r0 = r10.getInt(r14, r0)
            r6 = r0
            r7 = r5
            goto L_0x0073
        L_0x0070:
            r22 = r1
            r13 = -1
        L_0x0073:
            r0 = 5
            switch(r8) {
                case 0: goto L_0x024c;
                case 1: goto L_0x0235;
                case 2: goto L_0x0216;
                case 3: goto L_0x0216;
                case 4: goto L_0x01ff;
                case 5: goto L_0x01dd;
                case 6: goto L_0x01c6;
                case 7: goto L_0x01a6;
                case 8: goto L_0x0183;
                case 9: goto L_0x0155;
                case 10: goto L_0x0131;
                case 11: goto L_0x01ff;
                case 12: goto L_0x00f3;
                case 13: goto L_0x01c6;
                case 14: goto L_0x01dd;
                case 15: goto L_0x00de;
                case 16: goto L_0x00bd;
                case 17: goto L_0x0083;
                default: goto L_0x0077;
            }
        L_0x0077:
            r5 = r4
            r24 = r7
            r25 = r19
            r11 = -1
            r12 = r33
        L_0x007f:
            r13 = r35
            goto L_0x026e
        L_0x0083:
            r0 = 3
            if (r2 != r0) goto L_0x0077
            int r0 = r3 << 3
            r5 = r0 | 4
            r1 = r22
            com.google.android.gms.internal.ads.ace r0 = r15.m15494a(r1)
            r1 = r33
            r2 = r4
            r3 = r35
            r4 = r5
            r8 = r19
            r5 = r37
            int r0 = m15485a(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r21
            if (r1 != 0) goto L_0x00a8
            java.lang.Object r1 = r9.f15167c
        L_0x00a4:
            r10.putObject(r14, r11, r1)
            goto L_0x00b3
        L_0x00a8:
            java.lang.Object r1 = r10.getObject(r14, r11)
            java.lang.Object r2 = r9.f15167c
            java.lang.Object r1 = com.google.android.gms.internal.ads.aak.m15382a(r1, r2)
            goto L_0x00a4
        L_0x00b3:
            r6 = r6 | r21
            r1 = r8
            r8 = -1
            r11 = r36
            r12 = r33
            goto L_0x0149
        L_0x00bd:
            r8 = r19
            if (r2 != 0) goto L_0x00da
            r2 = r11
            r12 = r33
            int r11 = com.google.android.gms.internal.ads.C4115zd.m20413b(r12, r4, r9)
            long r0 = r9.f15166b
            long r4 = com.google.android.gms.internal.ads.C4124zm.m20432a(r0)
            r0 = r10
            r1 = r32
            r0.putLong(r1, r2, r4)
            r6 = r6 | r21
            r1 = r8
            r0 = r11
            goto L_0x0146
        L_0x00da:
            r12 = r33
            goto L_0x014d
        L_0x00de:
            r0 = r11
            r8 = r19
            r12 = r33
            if (r2 != 0) goto L_0x014d
            int r2 = com.google.android.gms.internal.ads.C4115zd.m20412a(r12, r4, r9)
            int r3 = r9.f15165a
            int r3 = com.google.android.gms.internal.ads.C4124zm.m20434f(r3)
            r10.putInt(r14, r0, r3)
            goto L_0x0142
        L_0x00f3:
            r13 = r11
            r8 = r19
            r1 = r22
            r12 = r33
            if (r2 != 0) goto L_0x012e
            int r0 = com.google.android.gms.internal.ads.C4115zd.m20412a(r12, r4, r9)
            int r2 = r9.f15165a
            com.google.android.gms.internal.ads.aam r1 = r15.m15514c(r1)
            if (r1 == 0) goto L_0x0125
            com.google.android.gms.internal.ads.aal r1 = r1.mo11500a(r2)
            if (r1 == 0) goto L_0x010f
            goto L_0x0125
        L_0x010f:
            com.google.android.gms.internal.ads.acx r1 = m15520e(r32)
            long r2 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.mo11699a(r8, r2)
            r1 = r8
            r8 = -1
            r11 = r36
            r13 = r35
            r14 = r32
            goto L_0x0016
        L_0x0125:
            r3 = r13
            r14 = r32
            r10.putInt(r14, r3, r2)
            r6 = r6 | r21
            goto L_0x0145
        L_0x012e:
            r14 = r32
            goto L_0x014d
        L_0x0131:
            r0 = r11
            r8 = r19
            r3 = 2
            r12 = r33
            if (r2 != r3) goto L_0x014d
            int r2 = com.google.android.gms.internal.ads.C4115zd.m20419e(r12, r4, r9)
            java.lang.Object r3 = r9.f15167c
            r10.putObject(r14, r0, r3)
        L_0x0142:
            r6 = r6 | r21
            r0 = r2
        L_0x0145:
            r1 = r8
        L_0x0146:
            r8 = -1
            r11 = r36
        L_0x0149:
            r13 = r35
            goto L_0x0016
        L_0x014d:
            r5 = r4
            r24 = r7
            r25 = r8
            r11 = -1
            goto L_0x007f
        L_0x0155:
            r24 = r7
            r7 = r11
            r25 = r19
            r1 = r22
            r3 = 2
            r12 = r33
            if (r2 != r3) goto L_0x017e
            com.google.android.gms.internal.ads.ace r0 = r15.m15494a(r1)
            r11 = -1
            r13 = r35
            int r0 = m15486a(r0, r12, r4, r13, r9)
            r1 = r6 & r21
            if (r1 != 0) goto L_0x0173
            java.lang.Object r1 = r9.f15167c
            goto L_0x01a1
        L_0x0173:
            java.lang.Object r1 = r10.getObject(r14, r7)
            java.lang.Object r2 = r9.f15167c
            java.lang.Object r1 = com.google.android.gms.internal.ads.aak.m15382a(r1, r2)
            goto L_0x01a1
        L_0x017e:
            r11 = -1
            r13 = r35
            goto L_0x01fc
        L_0x0183:
            r24 = r7
            r7 = r11
            r25 = r19
            r0 = 2
            r11 = -1
            r12 = r33
            r13 = r35
            if (r2 != r0) goto L_0x01fc
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r20 & r0
            if (r0 != 0) goto L_0x019b
            int r0 = com.google.android.gms.internal.ads.C4115zd.m20416c(r12, r4, r9)
            goto L_0x019f
        L_0x019b:
            int r0 = com.google.android.gms.internal.ads.C4115zd.m20418d(r12, r4, r9)
        L_0x019f:
            java.lang.Object r1 = r9.f15167c
        L_0x01a1:
            r10.putObject(r14, r7, r1)
            goto L_0x0263
        L_0x01a6:
            r24 = r7
            r7 = r11
            r25 = r19
            r11 = -1
            r12 = r33
            r13 = r35
            if (r2 != 0) goto L_0x01fc
            int r0 = com.google.android.gms.internal.ads.C4115zd.m20413b(r12, r4, r9)
            long r1 = r9.f15166b
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x01c0
            r1 = 1
            goto L_0x01c1
        L_0x01c0:
            r1 = 0
        L_0x01c1:
            com.google.android.gms.internal.ads.adc.m15811a(r14, r7, r1)
            goto L_0x0263
        L_0x01c6:
            r24 = r7
            r7 = r11
            r25 = r19
            r11 = -1
            r12 = r33
            r13 = r35
            if (r2 != r0) goto L_0x01fc
            int r0 = com.google.android.gms.internal.ads.C4115zd.m20410a(r12, r4)
            r10.putInt(r14, r7, r0)
            int r0 = r4 + 4
            goto L_0x0263
        L_0x01dd:
            r24 = r7
            r7 = r11
            r25 = r19
            r0 = 1
            r11 = -1
            r12 = r33
            r13 = r35
            if (r2 != r0) goto L_0x01fc
            long r17 = com.google.android.gms.internal.ads.C4115zd.m20414b(r12, r4)
            r0 = r10
            r1 = r32
            r2 = r7
            r7 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            int r0 = r7 + 8
            goto L_0x0263
        L_0x01fc:
            r5 = r4
            goto L_0x026e
        L_0x01ff:
            r5 = r4
            r24 = r7
            r7 = r11
            r25 = r19
            r11 = -1
            r12 = r33
            r13 = r35
            if (r2 != 0) goto L_0x026e
            int r0 = com.google.android.gms.internal.ads.C4115zd.m20412a(r12, r5, r9)
            int r1 = r9.f15165a
            r10.putInt(r14, r7, r1)
            goto L_0x0263
        L_0x0216:
            r5 = r4
            r24 = r7
            r7 = r11
            r25 = r19
            r11 = -1
            r12 = r33
            r13 = r35
            if (r2 != 0) goto L_0x026e
            int r17 = com.google.android.gms.internal.ads.C4115zd.m20413b(r12, r5, r9)
            long r4 = r9.f15166b
            r0 = r10
            r1 = r32
            r2 = r7
            r0.putLong(r1, r2, r4)
            r6 = r6 | r21
            r0 = r17
            goto L_0x0265
        L_0x0235:
            r5 = r4
            r24 = r7
            r7 = r11
            r25 = r19
            r11 = -1
            r12 = r33
            r13 = r35
            if (r2 != r0) goto L_0x026e
            float r0 = com.google.android.gms.internal.ads.C4115zd.m20417d(r12, r5)
            com.google.android.gms.internal.ads.adc.m15807a(r14, r7, r0)
            int r0 = r5 + 4
            goto L_0x0263
        L_0x024c:
            r5 = r4
            r24 = r7
            r7 = r11
            r25 = r19
            r0 = 1
            r11 = -1
            r12 = r33
            r13 = r35
            if (r2 != r0) goto L_0x026e
            double r0 = com.google.android.gms.internal.ads.C4115zd.m20415c(r12, r5)
            com.google.android.gms.internal.ads.adc.m15806a(r14, r7, r0)
            int r0 = r5 + 8
        L_0x0263:
            r6 = r6 | r21
        L_0x0265:
            r7 = r24
            r1 = r25
        L_0x0269:
            r8 = -1
            r11 = r36
            goto L_0x0016
        L_0x026e:
            r2 = r5
            r17 = r6
            r29 = r10
            r7 = r25
            goto L_0x0372
        L_0x0277:
            r5 = r4
            r24 = r7
            r0 = r8
            r7 = r11
            r4 = r19
            r12 = r33
            r11 = 27
            if (r0 != r11) goto L_0x02c7
            r11 = 2
            if (r2 != r11) goto L_0x02c0
            java.lang.Object r0 = r10.getObject(r14, r7)
            com.google.android.gms.internal.ads.aan r0 = (com.google.android.gms.internal.ads.aan) r0
            boolean r2 = r0.mo11501a()
            if (r2 != 0) goto L_0x02a5
            int r2 = r0.size()
            if (r2 != 0) goto L_0x029c
            r2 = 10
            goto L_0x029e
        L_0x029c:
            int r2 = r2 << 1
        L_0x029e:
            com.google.android.gms.internal.ads.aan r0 = r0.mo11460a(r2)
            r10.putObject(r14, r7, r0)
        L_0x02a5:
            r7 = r0
            com.google.android.gms.internal.ads.ace r0 = r15.m15494a(r1)
            r1 = r4
            r2 = r33
            r3 = r5
            r11 = r4
            r4 = r35
            r5 = r7
            r17 = r6
            r6 = r37
            int r0 = m15484a(r0, r1, r2, r3, r4, r5, r6)
            r1 = r11
            r6 = r17
            r7 = r24
            goto L_0x0269
        L_0x02c0:
            r17 = r6
            r30 = r4
            r15 = r5
            goto L_0x036d
        L_0x02c7:
            r11 = r4
            r17 = r6
            r4 = 49
            if (r0 > r4) goto L_0x0315
            r26 = r10
            r4 = r20
            long r9 = (long) r4
            r18 = r0
            r0 = r31
            r19 = r1
            r1 = r32
            r6 = r2
            r2 = r33
            r20 = r3
            r3 = r5
            r4 = r35
            r15 = r5
            r5 = r11
            r27 = r6
            r6 = r20
            r22 = r7
            r7 = r27
            r28 = r18
            r8 = r19
            r29 = r26
            r30 = r11
            r11 = r28
            r12 = r22
            r14 = r37
            int r0 = r0.m15489a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x0304
        L_0x0301:
            r2 = r0
            goto L_0x0370
        L_0x0304:
            r12 = r33
            r9 = r37
            r6 = r17
            r7 = r24
            r10 = r29
            r1 = r30
            r8 = -1
            r11 = r36
            goto L_0x0392
        L_0x0315:
            r28 = r0
            r19 = r1
            r27 = r2
            r15 = r5
            r22 = r7
            r29 = r10
            r30 = r11
            r4 = r20
            r20 = r3
            r0 = 50
            r9 = r28
            if (r9 != r0) goto L_0x0349
            r7 = r27
            r0 = 2
            if (r7 != r0) goto L_0x036f
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r15
            r4 = r35
            r5 = r19
            r6 = r20
            r7 = r22
            r9 = r37
            int r0 = r0.m15490a(r1, r2, r3, r4, r5, r6, r7, r9)
            if (r0 != r15) goto L_0x0304
            goto L_0x0301
        L_0x0349:
            r8 = r4
            r7 = r27
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r15
            r4 = r35
            r5 = r30
            r6 = r20
            r10 = r22
            r12 = r19
            r13 = r37
            int r0 = r0.m15488a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x0304
            goto L_0x0301
        L_0x0366:
            r15 = r4
            r30 = r5
            r17 = r6
            r24 = r7
        L_0x036d:
            r29 = r10
        L_0x036f:
            r2 = r15
        L_0x0370:
            r7 = r30
        L_0x0372:
            r6 = r36
            if (r7 != r6) goto L_0x0378
            if (r6 != 0) goto L_0x03a3
        L_0x0378:
            r0 = r7
            r1 = r33
            r3 = r35
            r4 = r32
            r5 = r37
            int r0 = m15483a(r0, r1, r2, r3, r4, r5)
            r12 = r33
            r9 = r37
            r11 = r6
            r1 = r7
            r6 = r17
            r7 = r24
            r10 = r29
            r8 = -1
        L_0x0392:
            r13 = r35
            r14 = r32
            r15 = r31
            goto L_0x0016
        L_0x039a:
            r17 = r6
            r24 = r7
            r29 = r10
            r6 = r11
            r2 = r0
            r7 = r1
        L_0x03a3:
            r1 = r17
            r0 = r24
            r3 = -1
            if (r0 == r3) goto L_0x03b3
            long r3 = (long) r0
            r5 = r29
            r0 = r32
            r5.putInt(r0, r3, r1)
            goto L_0x03b5
        L_0x03b3:
            r0 = r32
        L_0x03b5:
            r1 = r31
            int[] r3 = r1.f11408m
            if (r3 == 0) goto L_0x03d7
            r3 = 0
            int[] r4 = r1.f11408m
            int r5 = r4.length
            r8 = r3
            r3 = 0
        L_0x03c1:
            if (r3 >= r5) goto L_0x03d0
            r9 = r4[r3]
            com.google.android.gms.internal.ads.acw<?, ?> r10 = r1.f11412q
            java.lang.Object r8 = r1.m15496a(r0, r9, (UB) r8, r10)
            com.google.android.gms.internal.ads.acx r8 = (com.google.android.gms.internal.ads.acx) r8
            int r3 = r3 + 1
            goto L_0x03c1
        L_0x03d0:
            if (r8 == 0) goto L_0x03d7
            com.google.android.gms.internal.ads.acw<?, ?> r3 = r1.f11412q
            r3.mo11693b(r0, r8)
        L_0x03d7:
            if (r6 != 0) goto L_0x03e3
            r0 = r35
            if (r2 != r0) goto L_0x03de
            goto L_0x03e9
        L_0x03de:
            com.google.android.gms.internal.ads.zzbbu r0 = com.google.android.gms.internal.ads.zzbbu.zzadr()
            throw r0
        L_0x03e3:
            r0 = r35
            if (r2 > r0) goto L_0x03ea
            if (r7 != r6) goto L_0x03ea
        L_0x03e9:
            return r2
        L_0x03ea:
            com.google.android.gms.internal.ads.zzbbu r0 = com.google.android.gms.internal.ads.zzbbu.zzadr()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.abp.m15491a(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.ze):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
        r2 = java.lang.Integer.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        r6.f15167c = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        r6.f15167c = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007b, code lost:
        r6.f15167c = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r2 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        r2 = java.lang.Long.valueOf(r2);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m15492a(byte[] r1, int r2, int r3, com.google.android.gms.internal.ads.zzbes r4, java.lang.Class<?> r5, com.google.android.gms.internal.ads.C4116ze r6) {
        /*
            int[] r0 = com.google.android.gms.internal.ads.abq.f11415a
            int r4 = r4.ordinal()
            r4 = r0[r4]
            switch(r4) {
                case 1: goto L_0x0085;
                case 2: goto L_0x0080;
                case 3: goto L_0x0073;
                case 4: goto L_0x0066;
                case 5: goto L_0x0066;
                case 6: goto L_0x005d;
                case 7: goto L_0x005d;
                case 8: goto L_0x0054;
                case 9: goto L_0x0047;
                case 10: goto L_0x0047;
                case 11: goto L_0x0047;
                case 12: goto L_0x003c;
                case 13: goto L_0x003c;
                case 14: goto L_0x002f;
                case 15: goto L_0x0024;
                case 16: goto L_0x0019;
                case 17: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "unsupported field type."
            r1.<init>(r2)
            throw r1
        L_0x0013:
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20418d(r1, r2, r6)
            goto L_0x0099
        L_0x0019:
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20413b(r1, r2, r6)
            long r2 = r6.f15166b
            long r2 = com.google.android.gms.internal.ads.C4124zm.m20432a(r2)
            goto L_0x0042
        L_0x0024:
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20412a(r1, r2, r6)
            int r2 = r6.f15165a
            int r2 = com.google.android.gms.internal.ads.C4124zm.m20434f(r2)
            goto L_0x004d
        L_0x002f:
            com.google.android.gms.internal.ads.aby r4 = com.google.android.gms.internal.ads.aby.m15554a()
            com.google.android.gms.internal.ads.ace r4 = r4.mo11567a(r5)
            int r1 = m15486a(r4, r1, r2, r3, r6)
            goto L_0x0099
        L_0x003c:
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20413b(r1, r2, r6)
            long r2 = r6.f15166b
        L_0x0042:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x0051
        L_0x0047:
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20412a(r1, r2, r6)
            int r2 = r6.f15165a
        L_0x004d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x0051:
            r6.f15167c = r2
            goto L_0x0099
        L_0x0054:
            float r1 = com.google.android.gms.internal.ads.C4115zd.m20417d(r1, r2)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            goto L_0x006e
        L_0x005d:
            long r3 = com.google.android.gms.internal.ads.C4115zd.m20414b(r1, r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L_0x007b
        L_0x0066:
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20410a(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x006e:
            r6.f15167c = r1
            int r1 = r2 + 4
            goto L_0x0099
        L_0x0073:
            double r3 = com.google.android.gms.internal.ads.C4115zd.m20415c(r1, r2)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
        L_0x007b:
            r6.f15167c = r1
            int r1 = r2 + 8
            goto L_0x0099
        L_0x0080:
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20419e(r1, r2, r6)
            goto L_0x0099
        L_0x0085:
            int r1 = com.google.android.gms.internal.ads.C4115zd.m20413b(r1, r2, r6)
            long r2 = r6.f15166b
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0093
            r2 = 1
            goto L_0x0094
        L_0x0093:
            r2 = 0
        L_0x0094:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L_0x0051
        L_0x0099:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.abp.m15492a(byte[], int, int, com.google.android.gms.internal.ads.zzbes, java.lang.Class, com.google.android.gms.internal.ads.ze):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x016d A[EDGE_INSN: B:75:0x016d->B:71:0x016d ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.ads.abp<T> m15493a(java.lang.Class<T> r22, com.google.android.gms.internal.ads.abj r23, com.google.android.gms.internal.ads.abu r24, com.google.android.gms.internal.ads.aaw r25, com.google.android.gms.internal.ads.acw<?, ?> r26, com.google.android.gms.internal.ads.C4137zz<?> r27, com.google.android.gms.internal.ads.abg r28) {
        /*
            r0 = r23
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.aca
            if (r1 == 0) goto L_0x018b
            com.google.android.gms.internal.ads.aca r0 = (com.google.android.gms.internal.ads.aca) r0
            int r1 = r0.mo11549a()
            int r2 = com.google.android.gms.internal.ads.aai.C3393e.f11353i
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x0014
            r12 = 1
            goto L_0x0015
        L_0x0014:
            r12 = 0
        L_0x0015:
            int r1 = r0.mo11574g()
            if (r1 != 0) goto L_0x001f
            r5 = 0
            r8 = 0
            r9 = 0
            goto L_0x002d
        L_0x001f:
            int r1 = r0.mo11572e()
            int r2 = r0.mo11573f()
            int r5 = r0.mo11578k()
            r8 = r1
            r9 = r2
        L_0x002d:
            int r1 = r5 << 2
            int[] r6 = new int[r1]
            int r1 = r5 << 1
            java.lang.Object[] r7 = new java.lang.Object[r1]
            int r1 = r0.mo11575h()
            r2 = 0
            if (r1 <= 0) goto L_0x0044
            int r1 = r0.mo11575h()
            int[] r1 = new int[r1]
            r15 = r1
            goto L_0x0045
        L_0x0044:
            r15 = r2
        L_0x0045:
            int r1 = r0.mo11576i()
            if (r1 <= 0) goto L_0x0054
            int r1 = r0.mo11576i()
            int[] r1 = new int[r1]
            r16 = r1
            goto L_0x0056
        L_0x0054:
            r16 = r2
        L_0x0056:
            com.google.android.gms.internal.ads.acb r1 = r0.mo11571d()
            boolean r2 = r1.mo11580a()
            if (r2 == 0) goto L_0x016d
            int r2 = r1.mo11581b()
            r5 = 0
            r10 = 0
            r11 = 0
        L_0x0067:
            int r13 = r0.mo11579l()
            if (r2 >= r13) goto L_0x0080
            int r13 = r2 - r8
            int r13 = r13 << 2
            if (r5 >= r13) goto L_0x0080
            r13 = 0
        L_0x0074:
            r14 = 4
            if (r13 >= r14) goto L_0x0169
            int r14 = r5 + r13
            r17 = -1
            r6[r14] = r17
            int r13 = r13 + 1
            goto L_0x0074
        L_0x0080:
            boolean r2 = r1.mo11583d()
            if (r2 == 0) goto L_0x009a
            java.lang.reflect.Field r2 = r1.mo11584e()
            long r13 = com.google.android.gms.internal.ads.adc.m15803a(r2)
            int r2 = (int) r13
            java.lang.reflect.Field r13 = r1.mo11585f()
            long r13 = com.google.android.gms.internal.ads.adc.m15803a(r13)
            int r13 = (int) r13
        L_0x0098:
            r14 = 0
            goto L_0x00b9
        L_0x009a:
            java.lang.reflect.Field r2 = r1.mo11586g()
            long r13 = com.google.android.gms.internal.ads.adc.m15803a(r2)
            int r2 = (int) r13
            boolean r13 = r1.mo11587h()
            if (r13 == 0) goto L_0x00b7
            java.lang.reflect.Field r13 = r1.mo11588i()
            long r13 = com.google.android.gms.internal.ads.adc.m15803a(r13)
            int r13 = (int) r13
            int r14 = r1.mo11589j()
            goto L_0x00b9
        L_0x00b7:
            r13 = 0
            goto L_0x0098
        L_0x00b9:
            int r17 = r1.mo11581b()
            r6[r5] = r17
            int r17 = r5 + 1
            boolean r18 = r1.mo11591l()
            if (r18 == 0) goto L_0x00ca
            r18 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x00cc
        L_0x00ca:
            r18 = 0
        L_0x00cc:
            boolean r19 = r1.mo11590k()
            if (r19 == 0) goto L_0x00d5
            r19 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x00d7
        L_0x00d5:
            r19 = 0
        L_0x00d7:
            r18 = r18 | r19
            int r19 = r1.mo11582c()
            int r19 = r19 << 20
            r18 = r18 | r19
            r2 = r18 | r2
            r6[r17] = r2
            int r2 = r5 + 2
            int r14 = r14 << 20
            r13 = r13 | r14
            r6[r2] = r13
            java.lang.Object r2 = r1.mo11594o()
            if (r2 == 0) goto L_0x0119
            int r2 = r5 / 4
            int r2 = r2 << r4
            java.lang.Object r13 = r1.mo11594o()
            r7[r2] = r13
            java.lang.Object r13 = r1.mo11592m()
            if (r13 == 0) goto L_0x010a
            int r2 = r2 + 1
            java.lang.Object r13 = r1.mo11592m()
            r7[r2] = r13
            goto L_0x013a
        L_0x010a:
            java.lang.Object r13 = r1.mo11593n()
            if (r13 == 0) goto L_0x013a
            int r2 = r2 + 1
            java.lang.Object r13 = r1.mo11593n()
            r7[r2] = r13
            goto L_0x013a
        L_0x0119:
            java.lang.Object r2 = r1.mo11592m()
            if (r2 == 0) goto L_0x012a
            int r2 = r5 / 4
            int r2 = r2 << r4
            int r2 = r2 + r4
            java.lang.Object r13 = r1.mo11592m()
            r7[r2] = r13
            goto L_0x013a
        L_0x012a:
            java.lang.Object r2 = r1.mo11593n()
            if (r2 == 0) goto L_0x013a
            int r2 = r5 / 4
            int r2 = r2 << r4
            int r2 = r2 + r4
            java.lang.Object r13 = r1.mo11593n()
            r7[r2] = r13
        L_0x013a:
            int r2 = r1.mo11582c()
            com.google.android.gms.internal.ads.zzbbj r13 = com.google.android.gms.internal.ads.zzbbj.MAP
            int r13 = r13.ordinal()
            if (r2 != r13) goto L_0x014c
            int r2 = r10 + 1
            r15[r10] = r5
            r10 = r2
            goto L_0x015f
        L_0x014c:
            r13 = 18
            if (r2 < r13) goto L_0x015f
            r13 = 49
            if (r2 > r13) goto L_0x015f
            int r2 = r11 + 1
            r13 = r6[r17]
            r14 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r13 & r14
            r16[r11] = r13
            r11 = r2
        L_0x015f:
            boolean r2 = r1.mo11580a()
            if (r2 == 0) goto L_0x016d
            int r2 = r1.mo11581b()
        L_0x0169:
            int r5 = r5 + 4
            goto L_0x0067
        L_0x016d:
            com.google.android.gms.internal.ads.abp r1 = new com.google.android.gms.internal.ads.abp
            r5 = r1
            int r10 = r0.mo11579l()
            com.google.android.gms.internal.ads.abl r11 = r0.mo11551c()
            r13 = 0
            int[] r14 = r0.mo11577j()
            r17 = r24
            r18 = r25
            r19 = r26
            r20 = r27
            r21 = r28
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r1
        L_0x018b:
            com.google.android.gms.internal.ads.acr r0 = (com.google.android.gms.internal.ads.acr) r0
            r0.mo11549a()
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.abp.m15493a(java.lang.Class, com.google.android.gms.internal.ads.abj, com.google.android.gms.internal.ads.abu, com.google.android.gms.internal.ads.aaw, com.google.android.gms.internal.ads.acw, com.google.android.gms.internal.ads.zz, com.google.android.gms.internal.ads.abg):com.google.android.gms.internal.ads.abp");
    }

    /* renamed from: a */
    private final ace m15494a(int i) {
        int i2 = (i / 4) << 1;
        ace ace = (ace) this.f11398c[i2];
        if (ace != null) {
            return ace;
        }
        ace a = aby.m15554a().mo11567a((Class) this.f11398c[i2 + 1]);
        this.f11398c[i2] = a;
        return a;
    }

    /* renamed from: a */
    private final <K, V, UT, UB> UB m15495a(int i, int i2, Map<K, V> map, aam<?> aam, UB ub, acw<UT, UB> acw) {
        abf f = this.f11414s.mo11548f(m15508b(i));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (aam.mo11500a(((Integer) entry.getValue()).intValue()) == null) {
                if (ub == null) {
                    ub = acw.mo11680a();
                }
                C4122zk zzbo = zzbah.zzbo(abe.m15442a(f, entry.getKey(), entry.getValue()));
                try {
                    abe.m15443a(zzbo.mo13844b(), f, entry.getKey(), entry.getValue());
                    acw.mo11684a(ub, i2, zzbo.mo13843a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* renamed from: a */
    private final <UT, UB> UB m15496a(Object obj, int i, UB ub, acw<UT, UB> acw) {
        int i2 = this.f11397b[i];
        Object f = adc.m15832f(obj, (long) (m15516d(i) & 1048575));
        if (f == null) {
            return ub;
        }
        aam c = m15514c(i);
        if (c == null) {
            return ub;
        }
        return m15495a(i, i2, this.f11414s.mo11543a(f), c, ub, acw);
    }

    /* renamed from: a */
    private static <E> List<E> m15497a(Object obj, long j) {
        return (List) adc.m15832f(obj, j);
    }

    /* renamed from: a */
    private static void m15498a(int i, Object obj, adj adj) {
        if (obj instanceof String) {
            adj.mo11751a(i, (String) obj);
        } else {
            adj.mo11748a(i, (zzbah) obj);
        }
    }

    /* renamed from: a */
    private static <UT, UB> void m15499a(acw<UT, UB> acw, T t, adj adj) {
        acw.mo11686a(acw.mo11690b(t), adj);
    }

    /* renamed from: a */
    private final <K, V> void m15500a(adj adj, int i, Object obj, int i2) {
        if (obj != null) {
            adj.mo11747a(i, this.f11414s.mo11548f(m15508b(i2)), this.f11414s.mo11544b(obj));
        }
    }

    /* renamed from: a */
    private final void m15501a(Object obj, int i, acd acd) {
        long j;
        Object n;
        if (m15521f(i)) {
            j = (long) (i & 1048575);
            n = acd.mo11626m();
        } else if (this.f11404i) {
            j = (long) (i & 1048575);
            n = acd.mo11624l();
        } else {
            j = (long) (i & 1048575);
            n = acd.mo11628n();
        }
        adc.m15810a(obj, j, n);
    }

    /* renamed from: a */
    private final void m15502a(T t, T t2, int i) {
        long d = (long) (m15516d(i) & 1048575);
        if (m15503a(t2, i)) {
            Object f = adc.m15832f(t, d);
            Object f2 = adc.m15832f(t2, d);
            if (f == null || f2 == null) {
                if (f2 != null) {
                    adc.m15810a((Object) t, d, f2);
                    m15509b(t, i);
                }
                return;
            }
            adc.m15810a((Object) t, d, aak.m15382a(f, f2));
            m15509b(t, i);
        }
    }

    /* renamed from: a */
    private final boolean m15503a(T t, int i) {
        if (this.f11405j) {
            int d = m15516d(i);
            long j = (long) (d & 1048575);
            switch ((d & 267386880) >>> 20) {
                case 0:
                    return adc.m15829e(t, j) != 0.0d;
                case 1:
                    return adc.m15825d(t, j) != 0.0f;
                case 2:
                    return adc.m15815b(t, j) != 0;
                case 3:
                    return adc.m15815b(t, j) != 0;
                case 4:
                    return adc.m15802a((Object) t, j) != 0;
                case 5:
                    return adc.m15815b(t, j) != 0;
                case 6:
                    return adc.m15802a((Object) t, j) != 0;
                case 7:
                    return adc.m15824c(t, j);
                case 8:
                    Object f = adc.m15832f(t, j);
                    if (f instanceof String) {
                        return !((String) f).isEmpty();
                    }
                    if (f instanceof zzbah) {
                        return !zzbah.zzdpq.equals(f);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return adc.m15832f(t, j) != null;
                case 10:
                    return !zzbah.zzdpq.equals(adc.m15832f(t, j));
                case 11:
                    return adc.m15802a((Object) t, j) != 0;
                case 12:
                    return adc.m15802a((Object) t, j) != 0;
                case 13:
                    return adc.m15802a((Object) t, j) != 0;
                case 14:
                    return adc.m15815b(t, j) != 0;
                case 15:
                    return adc.m15802a((Object) t, j) != 0;
                case 16:
                    return adc.m15815b(t, j) != 0;
                case 17:
                    return adc.m15832f(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int e = m15518e(i);
            return (adc.m15802a((Object) t, (long) (e & 1048575)) & (1 << (e >>> 20))) != 0;
        }
    }

    /* renamed from: a */
    private final boolean m15504a(T t, int i, int i2) {
        return adc.m15802a((Object) t, (long) (m15518e(i2) & 1048575)) == i;
    }

    /* renamed from: a */
    private final boolean m15505a(T t, int i, int i2, int i3) {
        return this.f11405j ? m15503a(t, i) : (i2 & i3) != 0;
    }

    /* renamed from: a */
    private static boolean m15506a(Object obj, int i, ace ace) {
        return ace.mo11564d(adc.m15832f(obj, (long) (i & 1048575)));
    }

    /* renamed from: b */
    private static <T> double m15507b(T t, long j) {
        return ((Double) adc.m15832f(t, j)).doubleValue();
    }

    /* renamed from: b */
    private final Object m15508b(int i) {
        return this.f11398c[(i / 4) << 1];
    }

    /* renamed from: b */
    private final void m15509b(T t, int i) {
        if (!this.f11405j) {
            int e = m15518e(i);
            long j = (long) (e & 1048575);
            adc.m15808a((Object) t, j, adc.m15802a((Object) t, j) | (1 << (e >>> 20)));
        }
    }

    /* renamed from: b */
    private final void m15510b(T t, int i, int i2) {
        adc.m15808a((Object) t, (long) (m15518e(i2) & 1048575), i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02bc, code lost:
        com.google.android.gms.internal.ads.acg.m15692e(r9, r4, r2, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02c8, code lost:
        com.google.android.gms.internal.ads.acg.m15707j(r9, (java.util.List) r8.getObject(r1, r4), r2, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02da, code lost:
        com.google.android.gms.internal.ads.acg.m15698g(r9, (java.util.List) r8.getObject(r1, r4), r2, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02ec, code lost:
        com.google.android.gms.internal.ads.acg.m15709l(r9, (java.util.List) r8.getObject(r1, r4), r2, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02fe, code lost:
        com.google.android.gms.internal.ads.acg.m15710m(r9, (java.util.List) r8.getObject(r1, r4), r2, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0310, code lost:
        com.google.android.gms.internal.ads.acg.m15704i(r9, (java.util.List) r8.getObject(r1, r4), r2, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x04f1, code lost:
        r5 = r12 + 4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x04f7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m15511b(T r20, com.google.android.gms.internal.ads.adj r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            boolean r3 = r0.f11403h
            if (r3 == 0) goto L_0x0021
            com.google.android.gms.internal.ads.zz<?> r3 = r0.f11413r
            com.google.android.gms.internal.ads.aac r3 = r3.mo11431a(r1)
            boolean r5 = r3.mo11442b()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.mo11446e()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            r6 = -1
            int[] r7 = r0.f11397b
            int r7 = r7.length
            sun.misc.Unsafe r8 = f11396a
            r10 = r5
            r5 = 0
            r11 = 0
        L_0x002c:
            if (r5 >= r7) goto L_0x04f5
            int r12 = r0.m15516d(r5)
            int[] r13 = r0.f11397b
            r13 = r13[r5]
            r14 = 267386880(0xff00000, float:2.3665827E-29)
            r14 = r14 & r12
            int r14 = r14 >>> 20
            boolean r15 = r0.f11405j
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r15 != 0) goto L_0x0061
            r15 = 17
            if (r14 > r15) goto L_0x0061
            int[] r15 = r0.f11397b
            int r17 = r5 + 2
            r15 = r15[r17]
            r9 = r15 & r16
            if (r9 == r6) goto L_0x0059
            r18 = r5
            long r4 = (long) r9
            int r11 = r8.getInt(r1, r4)
            r6 = r9
            goto L_0x005b
        L_0x0059:
            r18 = r5
        L_0x005b:
            int r4 = r15 >>> 20
            r5 = 1
            int r9 = r5 << r4
            goto L_0x0064
        L_0x0061:
            r18 = r5
            r9 = 0
        L_0x0064:
            if (r10 == 0) goto L_0x0083
            com.google.android.gms.internal.ads.zz<?> r4 = r0.f11413r
            int r4 = r4.mo11430a(r10)
            if (r4 > r13) goto L_0x0083
            com.google.android.gms.internal.ads.zz<?> r4 = r0.f11413r
            r4.mo11435a(r2, r10)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r10 = r4
            goto L_0x0064
        L_0x0081:
            r10 = 0
            goto L_0x0064
        L_0x0083:
            r4 = r12 & r16
            long r4 = (long) r4
            switch(r14) {
                case 0: goto L_0x04e4;
                case 1: goto L_0x04d6;
                case 2: goto L_0x04c8;
                case 3: goto L_0x04ba;
                case 4: goto L_0x04ac;
                case 5: goto L_0x049e;
                case 6: goto L_0x0490;
                case 7: goto L_0x0482;
                case 8: goto L_0x0473;
                case 9: goto L_0x0460;
                case 10: goto L_0x044f;
                case 11: goto L_0x0440;
                case 12: goto L_0x0431;
                case 13: goto L_0x0422;
                case 14: goto L_0x0413;
                case 15: goto L_0x0404;
                case 16: goto L_0x03f5;
                case 17: goto L_0x03e2;
                case 18: goto L_0x03d0;
                case 19: goto L_0x03be;
                case 20: goto L_0x03ac;
                case 21: goto L_0x039a;
                case 22: goto L_0x0388;
                case 23: goto L_0x0376;
                case 24: goto L_0x0364;
                case 25: goto L_0x0352;
                case 26: goto L_0x0341;
                case 27: goto L_0x032c;
                case 28: goto L_0x031b;
                case 29: goto L_0x0309;
                case 30: goto L_0x02f7;
                case 31: goto L_0x02e5;
                case 32: goto L_0x02d3;
                case 33: goto L_0x02c1;
                case 34: goto L_0x02af;
                case 35: goto L_0x029d;
                case 36: goto L_0x028b;
                case 37: goto L_0x0279;
                case 38: goto L_0x0267;
                case 39: goto L_0x0255;
                case 40: goto L_0x0243;
                case 41: goto L_0x0231;
                case 42: goto L_0x021f;
                case 43: goto L_0x0216;
                case 44: goto L_0x020d;
                case 45: goto L_0x0204;
                case 46: goto L_0x01fb;
                case 47: goto L_0x01f2;
                case 48: goto L_0x01e3;
                case 49: goto L_0x01ce;
                case 50: goto L_0x01c3;
                case 51: goto L_0x01b2;
                case 52: goto L_0x01a1;
                case 53: goto L_0x0190;
                case 54: goto L_0x017f;
                case 55: goto L_0x016e;
                case 56: goto L_0x015d;
                case 57: goto L_0x014c;
                case 58: goto L_0x013b;
                case 59: goto L_0x012a;
                case 60: goto L_0x0115;
                case 61: goto L_0x0102;
                case 62: goto L_0x00f2;
                case 63: goto L_0x00e2;
                case 64: goto L_0x00d2;
                case 65: goto L_0x00c2;
                case 66: goto L_0x00b2;
                case 67: goto L_0x00a2;
                case 68: goto L_0x008e;
                default: goto L_0x0089;
            }
        L_0x0089:
            r12 = r18
        L_0x008b:
            r14 = 0
            goto L_0x04f1
        L_0x008e:
            r12 = r18
            boolean r9 = r0.m15504a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.ads.ace r5 = r0.m15494a(r12)
            r2.mo11759b(r13, r4, r5)
            goto L_0x008b
        L_0x00a2:
            r12 = r18
            boolean r9 = r0.m15504a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            long r4 = m15519e(r1, r4)
            r2.mo11770e(r13, r4)
            goto L_0x008b
        L_0x00b2:
            r12 = r18
            boolean r9 = r0.m15504a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m15517d(r1, r4)
            r2.mo11772f(r13, r4)
            goto L_0x008b
        L_0x00c2:
            r12 = r18
            boolean r9 = r0.m15504a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            long r4 = m15519e(r1, r4)
            r2.mo11758b(r13, r4)
            goto L_0x008b
        L_0x00d2:
            r12 = r18
            boolean r9 = r0.m15504a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m15517d(r1, r4)
            r2.mo11745a(r13, r4)
            goto L_0x008b
        L_0x00e2:
            r12 = r18
            boolean r9 = r0.m15504a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m15517d(r1, r4)
            r2.mo11757b(r13, r4)
            goto L_0x008b
        L_0x00f2:
            r12 = r18
            boolean r9 = r0.m15504a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m15517d(r1, r4)
            r2.mo11769e(r13, r4)
            goto L_0x008b
        L_0x0102:
            r12 = r18
            boolean r9 = r0.m15504a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.ads.zzbah r4 = (com.google.android.gms.internal.ads.zzbah) r4
            r2.mo11748a(r13, r4)
            goto L_0x008b
        L_0x0115:
            r12 = r18
            boolean r9 = r0.m15504a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.ads.ace r5 = r0.m15494a(r12)
            r2.mo11750a(r13, r4, r5)
            goto L_0x008b
        L_0x012a:
            r12 = r18
            boolean r9 = r0.m15504a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            java.lang.Object r4 = r8.getObject(r1, r4)
            m15498a(r13, r4, r2)
            goto L_0x008b
        L_0x013b:
            r12 = r18
            boolean r9 = r0.m15504a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            boolean r4 = m15522f(r1, r4)
            r2.mo11755a(r13, r4)
            goto L_0x008b
        L_0x014c:
            r12 = r18
            boolean r9 = r0.m15504a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m15517d(r1, r4)
            r2.mo11766d(r13, r4)
            goto L_0x008b
        L_0x015d:
            r12 = r18
            boolean r9 = r0.m15504a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            long r4 = m15519e(r1, r4)
            r2.mo11767d(r13, r4)
            goto L_0x008b
        L_0x016e:
            r12 = r18
            boolean r9 = r0.m15504a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m15517d(r1, r4)
            r2.mo11763c(r13, r4)
            goto L_0x008b
        L_0x017f:
            r12 = r18
            boolean r9 = r0.m15504a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            long r4 = m15519e(r1, r4)
            r2.mo11764c(r13, r4)
            goto L_0x008b
        L_0x0190:
            r12 = r18
            boolean r9 = r0.m15504a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            long r4 = m15519e(r1, r4)
            r2.mo11746a(r13, r4)
            goto L_0x008b
        L_0x01a1:
            r12 = r18
            boolean r9 = r0.m15504a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            float r4 = m15513c(r1, r4)
            r2.mo11744a(r13, r4)
            goto L_0x008b
        L_0x01b2:
            r12 = r18
            boolean r9 = r0.m15504a((T) r1, r13, r12)
            if (r9 == 0) goto L_0x008b
            double r4 = m15507b((T) r1, r4)
            r2.mo11743a(r13, r4)
            goto L_0x008b
        L_0x01c3:
            r12 = r18
            java.lang.Object r4 = r8.getObject(r1, r4)
            r0.m15500a(r2, r13, r4, r12)
            goto L_0x008b
        L_0x01ce:
            r12 = r18
            int[] r9 = r0.f11397b
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.ace r5 = r0.m15494a(r12)
            com.google.android.gms.internal.ads.acg.m15679b(r9, r4, r2, r5)
            goto L_0x008b
        L_0x01e3:
            r12 = r18
            int[] r9 = r0.f11397b
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r13 = 1
            goto L_0x02bc
        L_0x01f2:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f11397b
            r9 = r9[r12]
            goto L_0x02c8
        L_0x01fb:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f11397b
            r9 = r9[r12]
            goto L_0x02da
        L_0x0204:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f11397b
            r9 = r9[r12]
            goto L_0x02ec
        L_0x020d:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f11397b
            r9 = r9[r12]
            goto L_0x02fe
        L_0x0216:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f11397b
            r9 = r9[r12]
            goto L_0x0310
        L_0x021f:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f11397b
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.acg.m15711n(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0231:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f11397b
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.acg.m15708k(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0243:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f11397b
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.acg.m15695f(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0255:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f11397b
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.acg.m15701h(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0267:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f11397b
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.acg.m15688d(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0279:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f11397b
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.acg.m15684c(r9, r4, r2, r13)
            goto L_0x008b
        L_0x028b:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f11397b
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.acg.m15680b(r9, r4, r2, r13)
            goto L_0x008b
        L_0x029d:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f11397b
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.acg.m15666a(r9, r4, r2, r13)
            goto L_0x008b
        L_0x02af:
            r12 = r18
            int[] r9 = r0.f11397b
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r13 = 0
        L_0x02bc:
            com.google.android.gms.internal.ads.acg.m15692e(r9, r4, r2, r13)
            goto L_0x008b
        L_0x02c1:
            r12 = r18
            r13 = 0
            int[] r9 = r0.f11397b
            r9 = r9[r12]
        L_0x02c8:
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.acg.m15707j(r9, r4, r2, r13)
            goto L_0x008b
        L_0x02d3:
            r12 = r18
            r13 = 0
            int[] r9 = r0.f11397b
            r9 = r9[r12]
        L_0x02da:
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.acg.m15698g(r9, r4, r2, r13)
            goto L_0x008b
        L_0x02e5:
            r12 = r18
            r13 = 0
            int[] r9 = r0.f11397b
            r9 = r9[r12]
        L_0x02ec:
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.acg.m15709l(r9, r4, r2, r13)
            goto L_0x008b
        L_0x02f7:
            r12 = r18
            r13 = 0
            int[] r9 = r0.f11397b
            r9 = r9[r12]
        L_0x02fe:
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.acg.m15710m(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0309:
            r12 = r18
            r13 = 0
            int[] r9 = r0.f11397b
            r9 = r9[r12]
        L_0x0310:
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.acg.m15704i(r9, r4, r2, r13)
            goto L_0x008b
        L_0x031b:
            r12 = r18
            int[] r9 = r0.f11397b
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.acg.m15678b(r9, r4, r2)
            goto L_0x008b
        L_0x032c:
            r12 = r18
            int[] r9 = r0.f11397b
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.ace r5 = r0.m15494a(r12)
            com.google.android.gms.internal.ads.acg.m15665a(r9, r4, r2, r5)
            goto L_0x008b
        L_0x0341:
            r12 = r18
            int[] r9 = r0.f11397b
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.acg.m15664a(r9, r4, r2)
            goto L_0x008b
        L_0x0352:
            r12 = r18
            int[] r9 = r0.f11397b
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r14 = 0
            com.google.android.gms.internal.ads.acg.m15711n(r9, r4, r2, r14)
            goto L_0x04f1
        L_0x0364:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f11397b
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.acg.m15708k(r9, r4, r2, r14)
            goto L_0x04f1
        L_0x0376:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f11397b
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.acg.m15695f(r9, r4, r2, r14)
            goto L_0x04f1
        L_0x0388:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f11397b
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.acg.m15701h(r9, r4, r2, r14)
            goto L_0x04f1
        L_0x039a:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f11397b
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.acg.m15688d(r9, r4, r2, r14)
            goto L_0x04f1
        L_0x03ac:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f11397b
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.acg.m15684c(r9, r4, r2, r14)
            goto L_0x04f1
        L_0x03be:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f11397b
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.acg.m15680b(r9, r4, r2, r14)
            goto L_0x04f1
        L_0x03d0:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f11397b
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.acg.m15666a(r9, r4, r2, r14)
            goto L_0x04f1
        L_0x03e2:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x04f1
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.ads.ace r5 = r0.m15494a(r12)
            r2.mo11759b(r13, r4, r5)
            goto L_0x04f1
        L_0x03f5:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x04f1
            long r4 = r8.getLong(r1, r4)
            r2.mo11770e(r13, r4)
            goto L_0x04f1
        L_0x0404:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x04f1
            int r4 = r8.getInt(r1, r4)
            r2.mo11772f(r13, r4)
            goto L_0x04f1
        L_0x0413:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x04f1
            long r4 = r8.getLong(r1, r4)
            r2.mo11758b(r13, r4)
            goto L_0x04f1
        L_0x0422:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x04f1
            int r4 = r8.getInt(r1, r4)
            r2.mo11745a(r13, r4)
            goto L_0x04f1
        L_0x0431:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x04f1
            int r4 = r8.getInt(r1, r4)
            r2.mo11757b(r13, r4)
            goto L_0x04f1
        L_0x0440:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x04f1
            int r4 = r8.getInt(r1, r4)
            r2.mo11769e(r13, r4)
            goto L_0x04f1
        L_0x044f:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x04f1
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.ads.zzbah r4 = (com.google.android.gms.internal.ads.zzbah) r4
            r2.mo11748a(r13, r4)
            goto L_0x04f1
        L_0x0460:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x04f1
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.ads.ace r5 = r0.m15494a(r12)
            r2.mo11750a(r13, r4, r5)
            goto L_0x04f1
        L_0x0473:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x04f1
            java.lang.Object r4 = r8.getObject(r1, r4)
            m15498a(r13, r4, r2)
            goto L_0x04f1
        L_0x0482:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x04f1
            boolean r4 = com.google.android.gms.internal.ads.adc.m15824c(r1, r4)
            r2.mo11755a(r13, r4)
            goto L_0x04f1
        L_0x0490:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x04f1
            int r4 = r8.getInt(r1, r4)
            r2.mo11766d(r13, r4)
            goto L_0x04f1
        L_0x049e:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x04f1
            long r4 = r8.getLong(r1, r4)
            r2.mo11767d(r13, r4)
            goto L_0x04f1
        L_0x04ac:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x04f1
            int r4 = r8.getInt(r1, r4)
            r2.mo11763c(r13, r4)
            goto L_0x04f1
        L_0x04ba:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x04f1
            long r4 = r8.getLong(r1, r4)
            r2.mo11764c(r13, r4)
            goto L_0x04f1
        L_0x04c8:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x04f1
            long r4 = r8.getLong(r1, r4)
            r2.mo11746a(r13, r4)
            goto L_0x04f1
        L_0x04d6:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x04f1
            float r4 = com.google.android.gms.internal.ads.adc.m15825d(r1, r4)
            r2.mo11744a(r13, r4)
            goto L_0x04f1
        L_0x04e4:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x04f1
            double r4 = com.google.android.gms.internal.ads.adc.m15829e(r1, r4)
            r2.mo11743a(r13, r4)
        L_0x04f1:
            int r5 = r12 + 4
            goto L_0x002c
        L_0x04f5:
            if (r10 == 0) goto L_0x050c
            com.google.android.gms.internal.ads.zz<?> r4 = r0.f11413r
            r4.mo11435a(r2, r10)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x050a
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r10 = r4
            goto L_0x04f5
        L_0x050a:
            r10 = 0
            goto L_0x04f5
        L_0x050c:
            com.google.android.gms.internal.ads.acw<?, ?> r3 = r0.f11412q
            m15499a(r3, (T) r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.abp.m15511b(java.lang.Object, com.google.android.gms.internal.ads.adj):void");
    }

    /* renamed from: b */
    private final void m15512b(T t, T t2, int i) {
        int d = m15516d(i);
        int i2 = this.f11397b[i];
        long j = (long) (d & 1048575);
        if (m15504a(t2, i2, i)) {
            Object f = adc.m15832f(t, j);
            Object f2 = adc.m15832f(t2, j);
            if (f == null || f2 == null) {
                if (f2 != null) {
                    adc.m15810a((Object) t, j, f2);
                    m15510b(t, i2, i);
                }
                return;
            }
            adc.m15810a((Object) t, j, aak.m15382a(f, f2));
            m15510b(t, i2, i);
        }
    }

    /* renamed from: c */
    private static <T> float m15513c(T t, long j) {
        return ((Float) adc.m15832f(t, j)).floatValue();
    }

    /* renamed from: c */
    private final aam<?> m15514c(int i) {
        return (aam) this.f11398c[((i / 4) << 1) + 1];
    }

    /* renamed from: c */
    private final boolean m15515c(T t, T t2, int i) {
        return m15503a(t, i) == m15503a(t2, i);
    }

    /* renamed from: d */
    private final int m15516d(int i) {
        return this.f11397b[i + 1];
    }

    /* renamed from: d */
    private static <T> int m15517d(T t, long j) {
        return ((Integer) adc.m15832f(t, j)).intValue();
    }

    /* renamed from: e */
    private final int m15518e(int i) {
        return this.f11397b[i + 2];
    }

    /* renamed from: e */
    private static <T> long m15519e(T t, long j) {
        return ((Long) adc.m15832f(t, j)).longValue();
    }

    /* renamed from: e */
    private static acx m15520e(Object obj) {
        aai aai = (aai) obj;
        acx acx = aai.zzdtt;
        if (acx != acx.m15765a()) {
            return acx;
        }
        acx b = acx.m15768b();
        aai.zzdtt = b;
        return b;
    }

    /* renamed from: f */
    private static boolean m15521f(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: f */
    private static <T> boolean m15522f(T t, long j) {
        return ((Boolean) adc.m15832f(t, j)).booleanValue();
    }

    /* renamed from: g */
    private final int m15523g(int i) {
        if (i >= this.f11399d) {
            if (i < this.f11401f) {
                int i2 = (i - this.f11399d) << 2;
                if (this.f11397b[i2] == i) {
                    return i2;
                }
                return -1;
            } else if (i <= this.f11400e) {
                int i3 = this.f11401f - this.f11399d;
                int length = (this.f11397b.length / 4) - 1;
                while (i3 <= length) {
                    int i4 = (length + i3) >>> 1;
                    int i5 = i4 << 2;
                    int i6 = this.f11397b[i5];
                    if (i == i6) {
                        return i5;
                    }
                    if (i < i6) {
                        length = i4 - 1;
                    } else {
                        i3 = i4 + 1;
                    }
                }
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        r3 = com.google.android.gms.internal.ads.adc.m15832f(r9, r5);
        r2 = r2 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        r2 = r2 * 53;
        r3 = m15517d(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a8, code lost:
        r2 = r2 * 53;
        r3 = m15519e(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ce, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.ads.adc.m15832f(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d7, code lost:
        r3 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e2, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e6, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ea, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) com.google.android.gms.internal.ads.adc.m15832f(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fd, code lost:
        r3 = com.google.android.gms.internal.ads.aak.m15380a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0116, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0121, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0125, code lost:
        r3 = com.google.android.gms.internal.ads.aak.m15379a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0129, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012a, code lost:
        r1 = r1 + 4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo11555a(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f11397b
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x012e
            int r3 = r8.m15516d(r1)
            int[] r4 = r8.f11397b
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x011b;
                case 1: goto L_0x0110;
                case 2: goto L_0x0109;
                case 3: goto L_0x0109;
                case 4: goto L_0x0102;
                case 5: goto L_0x0109;
                case 6: goto L_0x0102;
                case 7: goto L_0x00f7;
                case 8: goto L_0x00ea;
                case 9: goto L_0x00dc;
                case 10: goto L_0x00d1;
                case 11: goto L_0x0102;
                case 12: goto L_0x0102;
                case 13: goto L_0x0102;
                case 14: goto L_0x0109;
                case 15: goto L_0x0102;
                case 16: goto L_0x0109;
                case 17: goto L_0x00ca;
                case 18: goto L_0x00d1;
                case 19: goto L_0x00d1;
                case 20: goto L_0x00d1;
                case 21: goto L_0x00d1;
                case 22: goto L_0x00d1;
                case 23: goto L_0x00d1;
                case 24: goto L_0x00d1;
                case 25: goto L_0x00d1;
                case 26: goto L_0x00d1;
                case 27: goto L_0x00d1;
                case 28: goto L_0x00d1;
                case 29: goto L_0x00d1;
                case 30: goto L_0x00d1;
                case 31: goto L_0x00d1;
                case 32: goto L_0x00d1;
                case 33: goto L_0x00d1;
                case 34: goto L_0x00d1;
                case 35: goto L_0x00d1;
                case 36: goto L_0x00d1;
                case 37: goto L_0x00d1;
                case 38: goto L_0x00d1;
                case 39: goto L_0x00d1;
                case 40: goto L_0x00d1;
                case 41: goto L_0x00d1;
                case 42: goto L_0x00d1;
                case 43: goto L_0x00d1;
                case 44: goto L_0x00d1;
                case 45: goto L_0x00d1;
                case 46: goto L_0x00d1;
                case 47: goto L_0x00d1;
                case 48: goto L_0x00d1;
                case 49: goto L_0x00d1;
                case 50: goto L_0x00d1;
                case 51: goto L_0x00bd;
                case 52: goto L_0x00b0;
                case 53: goto L_0x00a2;
                case 54: goto L_0x009b;
                case 55: goto L_0x008d;
                case 56: goto L_0x0086;
                case 57: goto L_0x007f;
                case 58: goto L_0x0071;
                case 59: goto L_0x0069;
                case 60: goto L_0x005b;
                case 61: goto L_0x0053;
                case 62: goto L_0x004c;
                case 63: goto L_0x0045;
                case 64: goto L_0x003e;
                case 65: goto L_0x0036;
                case 66: goto L_0x002f;
                case 67: goto L_0x0027;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x012a
        L_0x0020:
            boolean r3 = r8.m15504a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0061
        L_0x0027:
            boolean r3 = r8.m15504a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x002f:
            boolean r3 = r8.m15504a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x004b
        L_0x0036:
            boolean r3 = r8.m15504a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x003e:
            boolean r3 = r8.m15504a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x004b
        L_0x0045:
            boolean r3 = r8.m15504a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x004b:
            goto L_0x0093
        L_0x004c:
            boolean r3 = r8.m15504a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0093
        L_0x0053:
            boolean r3 = r8.m15504a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00d1
        L_0x005b:
            boolean r3 = r8.m15504a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x0061:
            java.lang.Object r3 = com.google.android.gms.internal.ads.adc.m15832f(r9, r5)
            int r2 = r2 * 53
            goto L_0x00d7
        L_0x0069:
            boolean r3 = r8.m15504a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00ea
        L_0x0071:
            boolean r3 = r8.m15504a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            boolean r3 = m15522f(r9, r5)
            goto L_0x00fd
        L_0x007f:
            boolean r3 = r8.m15504a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0093
        L_0x0086:
            boolean r3 = r8.m15504a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x008d:
            boolean r3 = r8.m15504a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x0093:
            int r2 = r2 * 53
            int r3 = m15517d(r9, r5)
            goto L_0x0129
        L_0x009b:
            boolean r3 = r8.m15504a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x00a2:
            boolean r3 = r8.m15504a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x00a8:
            int r2 = r2 * 53
            long r3 = m15519e(r9, r5)
            goto L_0x0125
        L_0x00b0:
            boolean r3 = r8.m15504a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            float r3 = m15513c(r9, r5)
            goto L_0x0116
        L_0x00bd:
            boolean r3 = r8.m15504a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            double r3 = m15507b((T) r9, r5)
            goto L_0x0121
        L_0x00ca:
            java.lang.Object r3 = com.google.android.gms.internal.ads.adc.m15832f(r9, r5)
            if (r3 == 0) goto L_0x00e6
            goto L_0x00e2
        L_0x00d1:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.adc.m15832f(r9, r5)
        L_0x00d7:
            int r3 = r3.hashCode()
            goto L_0x0129
        L_0x00dc:
            java.lang.Object r3 = com.google.android.gms.internal.ads.adc.m15832f(r9, r5)
            if (r3 == 0) goto L_0x00e6
        L_0x00e2:
            int r7 = r3.hashCode()
        L_0x00e6:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x012a
        L_0x00ea:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.adc.m15832f(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0129
        L_0x00f7:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.ads.adc.m15824c(r9, r5)
        L_0x00fd:
            int r3 = com.google.android.gms.internal.ads.aak.m15380a(r3)
            goto L_0x0129
        L_0x0102:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.adc.m15802a(r9, r5)
            goto L_0x0129
        L_0x0109:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.adc.m15815b(r9, r5)
            goto L_0x0125
        L_0x0110:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.ads.adc.m15825d(r9, r5)
        L_0x0116:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0129
        L_0x011b:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.ads.adc.m15829e(r9, r5)
        L_0x0121:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x0125:
            int r3 = com.google.android.gms.internal.ads.aak.m15379a(r3)
        L_0x0129:
            int r2 = r2 + r3
        L_0x012a:
            int r1 = r1 + 4
            goto L_0x0005
        L_0x012e:
            int r2 = r2 * 53
            com.google.android.gms.internal.ads.acw<?, ?> r0 = r8.f11412q
            java.lang.Object r0 = r0.mo11690b(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f11403h
            if (r0 == 0) goto L_0x014c
            int r2 = r2 * 53
            com.google.android.gms.internal.ads.zz<?> r0 = r8.f11413r
            com.google.android.gms.internal.ads.aac r9 = r0.mo11431a(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x014c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.abp.mo11555a(java.lang.Object):int");
    }

    /* renamed from: a */
    public final T mo11556a() {
        return this.f11410o.mo11566a(this.f11402g);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:172|173|(1:175)|176|(5:198|178|(3:180|(1:182)|232)|(1:184)|185)(1:228)) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02ad, code lost:
        r0.mo11611e(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02bb, code lost:
        r0.mo11606c(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02c9, code lost:
        r0.mo11609d(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02d7, code lost:
        r0.mo11604b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02e5, code lost:
        r0.mo11599a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0325, code lost:
        r4 = com.google.android.gms.internal.ads.acg.m15663a(r4, r6, r5, r14, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0329, code lost:
        r14 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03ea, code lost:
        com.google.android.gms.internal.ads.adc.m15810a((java.lang.Object) r2, r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03fd, code lost:
        m15509b(r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:?, code lost:
        r11.mo11688a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x050d, code lost:
        if (r14 == null) goto L_0x050f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x050f, code lost:
        r14 = r11.mo11694c(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0518, code lost:
        if (r11.mo11689a(r14, r0) == false) goto L_0x051a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x051c, code lost:
        if (r1.f11408m != null) goto L_0x051e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x051e, code lost:
        r0 = r1.f11408m;
        r3 = r0.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0521, code lost:
        if (r15 < r3) goto L_0x0523;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0523, code lost:
        r14 = m15496a((java.lang.Object) r2, r0[r15], (UB) r14, r11);
        r15 = r15 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x052c, code lost:
        if (r14 != null) goto L_0x052e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x052e, code lost:
        r11.mo11693b((java.lang.Object) r2, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0531, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ad, code lost:
        m15510b(r2, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fb, code lost:
        r4 = com.google.android.gms.internal.ads.acg.m15662a(r4, r7, r14, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x022c, code lost:
        r0.mo11635q(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x023a, code lost:
        r0.mo11633p(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0248, code lost:
        r0.mo11631o(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0256, code lost:
        r0.mo11629n(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0275, code lost:
        r0.mo11625l(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0283, code lost:
        r0.mo11617h(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0291, code lost:
        r0.mo11615g(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x029f, code lost:
        r0.mo11613f(r4);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:172:0x050a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11557a(T r18, com.google.android.gms.internal.ads.acd r19, com.google.android.gms.internal.ads.C4135zx r20) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r0 = r19
            r10 = r20
            if (r10 == 0) goto L_0x054b
            com.google.android.gms.internal.ads.acw<?, ?> r11 = r1.f11412q
            com.google.android.gms.internal.ads.zz<?> r12 = r1.f11413r
            r13 = 0
            r3 = r13
            r14 = r3
        L_0x0011:
            r15 = 0
            int r4 = r19.mo11597a()     // Catch:{ all -> 0x0532 }
            int r5 = r1.m15523g(r4)     // Catch:{ all -> 0x0532 }
            if (r5 >= 0) goto L_0x0089
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r5) goto L_0x0039
            int[] r0 = r1.f11408m
            if (r0 == 0) goto L_0x0033
            int[] r0 = r1.f11408m
            int r3 = r0.length
        L_0x0028:
            if (r15 >= r3) goto L_0x0033
            r4 = r0[r15]
            java.lang.Object r14 = r1.m15496a(r2, r4, (UB) r14, r11)
            int r15 = r15 + 1
            goto L_0x0028
        L_0x0033:
            if (r14 == 0) goto L_0x0038
            r11.mo11693b(r2, r14)
        L_0x0038:
            return
        L_0x0039:
            boolean r5 = r1.f11403h     // Catch:{ all -> 0x0532 }
            if (r5 != 0) goto L_0x003f
            r5 = r13
            goto L_0x0046
        L_0x003f:
            com.google.android.gms.internal.ads.abl r5 = r1.f11402g     // Catch:{ all -> 0x0532 }
            java.lang.Object r4 = r12.mo11433a(r10, r5, r4)     // Catch:{ all -> 0x0532 }
            r5 = r4
        L_0x0046:
            if (r5 == 0) goto L_0x0061
            if (r3 != 0) goto L_0x004e
            com.google.android.gms.internal.ads.aac r3 = r12.mo11439b(r2)     // Catch:{ all -> 0x0532 }
        L_0x004e:
            r16 = r3
            r3 = r12
            r4 = r19
            r6 = r20
            r7 = r16
            r8 = r14
            r9 = r11
            java.lang.Object r3 = r3.mo11432a(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0532 }
            r14 = r3
            r3 = r16
            goto L_0x0011
        L_0x0061:
            r11.mo11688a(r0)     // Catch:{ all -> 0x0532 }
            if (r14 != 0) goto L_0x006b
            java.lang.Object r4 = r11.mo11694c(r2)     // Catch:{ all -> 0x0532 }
            r14 = r4
        L_0x006b:
            boolean r4 = r11.mo11689a(r14, r0)     // Catch:{ all -> 0x0532 }
            if (r4 != 0) goto L_0x0011
            int[] r0 = r1.f11408m
            if (r0 == 0) goto L_0x0083
            int[] r0 = r1.f11408m
            int r3 = r0.length
        L_0x0078:
            if (r15 >= r3) goto L_0x0083
            r4 = r0[r15]
            java.lang.Object r14 = r1.m15496a(r2, r4, (UB) r14, r11)
            int r15 = r15 + 1
            goto L_0x0078
        L_0x0083:
            if (r14 == 0) goto L_0x0088
            r11.mo11693b(r2, r14)
        L_0x0088:
            return
        L_0x0089:
            int r6 = r1.m15516d(r5)     // Catch:{ all -> 0x0532 }
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r7 = r7 & r6
            int r7 = r7 >>> 20
            r8 = 1048575(0xfffff, float:1.469367E-39)
            switch(r7) {
                case 0: goto L_0x04df;
                case 1: goto L_0x04d3;
                case 2: goto L_0x04c7;
                case 3: goto L_0x04bb;
                case 4: goto L_0x04af;
                case 5: goto L_0x04a3;
                case 6: goto L_0x0497;
                case 7: goto L_0x048b;
                case 8: goto L_0x0486;
                case 9: goto L_0x045b;
                case 10: goto L_0x0450;
                case 11: goto L_0x0445;
                case 12: goto L_0x042e;
                case 13: goto L_0x0423;
                case 14: goto L_0x0418;
                case 15: goto L_0x040d;
                case 16: goto L_0x0402;
                case 17: goto L_0x03d1;
                case 18: goto L_0x03c6;
                case 19: goto L_0x03bb;
                case 20: goto L_0x03b0;
                case 21: goto L_0x03a5;
                case 22: goto L_0x039a;
                case 23: goto L_0x038f;
                case 24: goto L_0x0384;
                case 25: goto L_0x0379;
                case 26: goto L_0x0357;
                case 27: goto L_0x0345;
                case 28: goto L_0x0337;
                case 29: goto L_0x032c;
                case 30: goto L_0x0316;
                case 31: goto L_0x030b;
                case 32: goto L_0x0300;
                case 33: goto L_0x02f5;
                case 34: goto L_0x02ea;
                case 35: goto L_0x02dc;
                case 36: goto L_0x02ce;
                case 37: goto L_0x02c0;
                case 38: goto L_0x02b2;
                case 39: goto L_0x02a4;
                case 40: goto L_0x0296;
                case 41: goto L_0x0288;
                case 42: goto L_0x027a;
                case 43: goto L_0x026c;
                case 44: goto L_0x025b;
                case 45: goto L_0x024d;
                case 46: goto L_0x023f;
                case 47: goto L_0x0231;
                case 48: goto L_0x0223;
                case 49: goto L_0x0211;
                case 50: goto L_0x01cf;
                case 51: goto L_0x01c0;
                case 52: goto L_0x01b1;
                case 53: goto L_0x01a2;
                case 54: goto L_0x0193;
                case 55: goto L_0x0184;
                case 56: goto L_0x0175;
                case 57: goto L_0x0166;
                case 58: goto L_0x0157;
                case 59: goto L_0x0152;
                case 60: goto L_0x0123;
                case 61: goto L_0x0119;
                case 62: goto L_0x010b;
                case 63: goto L_0x00ea;
                case 64: goto L_0x00dc;
                case 65: goto L_0x00ce;
                case 66: goto L_0x00c0;
                case 67: goto L_0x00b2;
                case 68: goto L_0x00a0;
                default: goto L_0x0098;
            }
        L_0x0098:
            if (r14 != 0) goto L_0x04ec
            java.lang.Object r4 = r11.mo11680a()     // Catch:{ zzbbv -> 0x050a }
            goto L_0x04eb
        L_0x00a0:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.ace r8 = r1.m15494a(r5)     // Catch:{ zzbbv -> 0x050a }
            java.lang.Object r8 = r0.mo11603b(r8, r10)     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15810a(r2, r6, r8)     // Catch:{ zzbbv -> 0x050a }
        L_0x00ad:
            r1.m15510b((T) r2, r4, r5)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x0011
        L_0x00b2:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ zzbbv -> 0x050a }
            long r8 = r19.mo11638t()     // Catch:{ zzbbv -> 0x050a }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15810a(r2, r6, r8)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x00ad
        L_0x00c0:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ zzbbv -> 0x050a }
            int r8 = r19.mo11637s()     // Catch:{ zzbbv -> 0x050a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15810a(r2, r6, r8)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x00ad
        L_0x00ce:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ zzbbv -> 0x050a }
            long r8 = r19.mo11636r()     // Catch:{ zzbbv -> 0x050a }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15810a(r2, r6, r8)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x00ad
        L_0x00dc:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ zzbbv -> 0x050a }
            int r8 = r19.mo11634q()     // Catch:{ zzbbv -> 0x050a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15810a(r2, r6, r8)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x00ad
        L_0x00ea:
            int r7 = r19.mo11632p()     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.aam r9 = r1.m15514c(r5)     // Catch:{ zzbbv -> 0x050a }
            if (r9 == 0) goto L_0x0101
            com.google.android.gms.internal.ads.aal r9 = r9.mo11500a(r7)     // Catch:{ zzbbv -> 0x050a }
            if (r9 == 0) goto L_0x00fb
            goto L_0x0101
        L_0x00fb:
            java.lang.Object r4 = com.google.android.gms.internal.ads.acg.m15662a(r4, r7, r14, r11)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x0329
        L_0x0101:
            r6 = r6 & r8
            long r8 = (long) r6     // Catch:{ zzbbv -> 0x050a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15810a(r2, r8, r6)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x00ad
        L_0x010b:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ zzbbv -> 0x050a }
            int r8 = r19.mo11630o()     // Catch:{ zzbbv -> 0x050a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15810a(r2, r6, r8)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x00ad
        L_0x0119:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.zzbah r8 = r19.mo11628n()     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15810a(r2, r6, r8)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x00ad
        L_0x0123:
            boolean r7 = r1.m15504a((T) r2, r4, r5)     // Catch:{ zzbbv -> 0x050a }
            if (r7 == 0) goto L_0x0140
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ zzbbv -> 0x050a }
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r2, r6)     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.ace r9 = r1.m15494a(r5)     // Catch:{ zzbbv -> 0x050a }
            java.lang.Object r9 = r0.mo11598a(r9, r10)     // Catch:{ zzbbv -> 0x050a }
            java.lang.Object r8 = com.google.android.gms.internal.ads.aak.m15382a(r8, r9)     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15810a(r2, r6, r8)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x00ad
        L_0x0140:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.ace r8 = r1.m15494a(r5)     // Catch:{ zzbbv -> 0x050a }
            java.lang.Object r8 = r0.mo11598a(r8, r10)     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15810a(r2, r6, r8)     // Catch:{ zzbbv -> 0x050a }
            r1.m15509b((T) r2, r5)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x00ad
        L_0x0152:
            r1.m15501a(r2, r6, r0)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x00ad
        L_0x0157:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ zzbbv -> 0x050a }
            boolean r8 = r19.mo11623k()     // Catch:{ zzbbv -> 0x050a }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15810a(r2, r6, r8)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x00ad
        L_0x0166:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ zzbbv -> 0x050a }
            int r8 = r19.mo11620j()     // Catch:{ zzbbv -> 0x050a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15810a(r2, r6, r8)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x00ad
        L_0x0175:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ zzbbv -> 0x050a }
            long r8 = r19.mo11618i()     // Catch:{ zzbbv -> 0x050a }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15810a(r2, r6, r8)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x00ad
        L_0x0184:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ zzbbv -> 0x050a }
            int r8 = r19.mo11616h()     // Catch:{ zzbbv -> 0x050a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15810a(r2, r6, r8)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x00ad
        L_0x0193:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ zzbbv -> 0x050a }
            long r8 = r19.mo11612f()     // Catch:{ zzbbv -> 0x050a }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15810a(r2, r6, r8)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x00ad
        L_0x01a2:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ zzbbv -> 0x050a }
            long r8 = r19.mo11614g()     // Catch:{ zzbbv -> 0x050a }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15810a(r2, r6, r8)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x00ad
        L_0x01b1:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ zzbbv -> 0x050a }
            float r8 = r19.mo11610e()     // Catch:{ zzbbv -> 0x050a }
            java.lang.Float r8 = java.lang.Float.valueOf(r8)     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15810a(r2, r6, r8)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x00ad
        L_0x01c0:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ zzbbv -> 0x050a }
            double r8 = r19.mo11608d()     // Catch:{ zzbbv -> 0x050a }
            java.lang.Double r8 = java.lang.Double.valueOf(r8)     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15810a(r2, r6, r8)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x00ad
        L_0x01cf:
            java.lang.Object r4 = r1.m15508b(r5)     // Catch:{ zzbbv -> 0x050a }
            int r5 = r1.m15516d(r5)     // Catch:{ zzbbv -> 0x050a }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            java.lang.Object r7 = com.google.android.gms.internal.ads.adc.m15832f(r2, r5)     // Catch:{ zzbbv -> 0x050a }
            if (r7 != 0) goto L_0x01e9
            com.google.android.gms.internal.ads.abg r7 = r1.f11414s     // Catch:{ zzbbv -> 0x050a }
            java.lang.Object r7 = r7.mo11547e(r4)     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15810a(r2, r5, r7)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x0200
        L_0x01e9:
            com.google.android.gms.internal.ads.abg r8 = r1.f11414s     // Catch:{ zzbbv -> 0x050a }
            boolean r8 = r8.mo11545c(r7)     // Catch:{ zzbbv -> 0x050a }
            if (r8 == 0) goto L_0x0200
            com.google.android.gms.internal.ads.abg r8 = r1.f11414s     // Catch:{ zzbbv -> 0x050a }
            java.lang.Object r8 = r8.mo11547e(r4)     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.abg r9 = r1.f11414s     // Catch:{ zzbbv -> 0x050a }
            r9.mo11542a(r8, r7)     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15810a(r2, r5, r8)     // Catch:{ zzbbv -> 0x050a }
            r7 = r8
        L_0x0200:
            com.google.android.gms.internal.ads.abg r5 = r1.f11414s     // Catch:{ zzbbv -> 0x050a }
            java.util.Map r5 = r5.mo11543a(r7)     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.abg r6 = r1.f11414s     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.abf r4 = r6.mo11548f(r4)     // Catch:{ zzbbv -> 0x050a }
            r0.mo11601a(r5, r4, r10)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x0011
        L_0x0211:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.ace r4 = r1.m15494a(r5)     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.aaw r5 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            java.util.List r5 = r5.mo11529a(r2, r6)     // Catch:{ zzbbv -> 0x050a }
            r0.mo11605b(r5, r4, r10)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x0011
        L_0x0223:
            com.google.android.gms.internal.ads.aaw r4 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            java.util.List r4 = r4.mo11529a(r2, r5)     // Catch:{ zzbbv -> 0x050a }
        L_0x022c:
            r0.mo11635q(r4)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x0011
        L_0x0231:
            com.google.android.gms.internal.ads.aaw r4 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            java.util.List r4 = r4.mo11529a(r2, r5)     // Catch:{ zzbbv -> 0x050a }
        L_0x023a:
            r0.mo11633p(r4)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x0011
        L_0x023f:
            com.google.android.gms.internal.ads.aaw r4 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            java.util.List r4 = r4.mo11529a(r2, r5)     // Catch:{ zzbbv -> 0x050a }
        L_0x0248:
            r0.mo11631o(r4)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x0011
        L_0x024d:
            com.google.android.gms.internal.ads.aaw r4 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            java.util.List r4 = r4.mo11529a(r2, r5)     // Catch:{ zzbbv -> 0x050a }
        L_0x0256:
            r0.mo11629n(r4)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x0011
        L_0x025b:
            com.google.android.gms.internal.ads.aaw r7 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r6 = r6 & r8
            long r8 = (long) r6     // Catch:{ zzbbv -> 0x050a }
            java.util.List r6 = r7.mo11529a(r2, r8)     // Catch:{ zzbbv -> 0x050a }
            r0.mo11627m(r6)     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.aam r5 = r1.m15514c(r5)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x0325
        L_0x026c:
            com.google.android.gms.internal.ads.aaw r4 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            java.util.List r4 = r4.mo11529a(r2, r5)     // Catch:{ zzbbv -> 0x050a }
        L_0x0275:
            r0.mo11625l(r4)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x0011
        L_0x027a:
            com.google.android.gms.internal.ads.aaw r4 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            java.util.List r4 = r4.mo11529a(r2, r5)     // Catch:{ zzbbv -> 0x050a }
        L_0x0283:
            r0.mo11617h(r4)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x0011
        L_0x0288:
            com.google.android.gms.internal.ads.aaw r4 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            java.util.List r4 = r4.mo11529a(r2, r5)     // Catch:{ zzbbv -> 0x050a }
        L_0x0291:
            r0.mo11615g(r4)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x0011
        L_0x0296:
            com.google.android.gms.internal.ads.aaw r4 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            java.util.List r4 = r4.mo11529a(r2, r5)     // Catch:{ zzbbv -> 0x050a }
        L_0x029f:
            r0.mo11613f(r4)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x0011
        L_0x02a4:
            com.google.android.gms.internal.ads.aaw r4 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            java.util.List r4 = r4.mo11529a(r2, r5)     // Catch:{ zzbbv -> 0x050a }
        L_0x02ad:
            r0.mo11611e(r4)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x0011
        L_0x02b2:
            com.google.android.gms.internal.ads.aaw r4 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            java.util.List r4 = r4.mo11529a(r2, r5)     // Catch:{ zzbbv -> 0x050a }
        L_0x02bb:
            r0.mo11606c(r4)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x0011
        L_0x02c0:
            com.google.android.gms.internal.ads.aaw r4 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            java.util.List r4 = r4.mo11529a(r2, r5)     // Catch:{ zzbbv -> 0x050a }
        L_0x02c9:
            r0.mo11609d(r4)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x0011
        L_0x02ce:
            com.google.android.gms.internal.ads.aaw r4 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            java.util.List r4 = r4.mo11529a(r2, r5)     // Catch:{ zzbbv -> 0x050a }
        L_0x02d7:
            r0.mo11604b(r4)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x0011
        L_0x02dc:
            com.google.android.gms.internal.ads.aaw r4 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            java.util.List r4 = r4.mo11529a(r2, r5)     // Catch:{ zzbbv -> 0x050a }
        L_0x02e5:
            r0.mo11599a(r4)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x0011
        L_0x02ea:
            com.google.android.gms.internal.ads.aaw r4 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            java.util.List r4 = r4.mo11529a(r2, r5)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x022c
        L_0x02f5:
            com.google.android.gms.internal.ads.aaw r4 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            java.util.List r4 = r4.mo11529a(r2, r5)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x023a
        L_0x0300:
            com.google.android.gms.internal.ads.aaw r4 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            java.util.List r4 = r4.mo11529a(r2, r5)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x0248
        L_0x030b:
            com.google.android.gms.internal.ads.aaw r4 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            java.util.List r4 = r4.mo11529a(r2, r5)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x0256
        L_0x0316:
            com.google.android.gms.internal.ads.aaw r7 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r6 = r6 & r8
            long r8 = (long) r6     // Catch:{ zzbbv -> 0x050a }
            java.util.List r6 = r7.mo11529a(r2, r8)     // Catch:{ zzbbv -> 0x050a }
            r0.mo11627m(r6)     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.aam r5 = r1.m15514c(r5)     // Catch:{ zzbbv -> 0x050a }
        L_0x0325:
            java.lang.Object r4 = com.google.android.gms.internal.ads.acg.m15663a(r4, r6, r5, r14, r11)     // Catch:{ zzbbv -> 0x050a }
        L_0x0329:
            r14 = r4
            goto L_0x0011
        L_0x032c:
            com.google.android.gms.internal.ads.aaw r4 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            java.util.List r4 = r4.mo11529a(r2, r5)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x0275
        L_0x0337:
            com.google.android.gms.internal.ads.aaw r4 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            java.util.List r4 = r4.mo11529a(r2, r5)     // Catch:{ zzbbv -> 0x050a }
            r0.mo11622k(r4)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x0011
        L_0x0345:
            com.google.android.gms.internal.ads.ace r4 = r1.m15494a(r5)     // Catch:{ zzbbv -> 0x050a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.aaw r7 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            java.util.List r5 = r7.mo11529a(r2, r5)     // Catch:{ zzbbv -> 0x050a }
            r0.mo11600a(r5, r4, r10)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x0011
        L_0x0357:
            boolean r4 = m15521f(r6)     // Catch:{ zzbbv -> 0x050a }
            if (r4 == 0) goto L_0x036b
            com.google.android.gms.internal.ads.aaw r4 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            java.util.List r4 = r4.mo11529a(r2, r5)     // Catch:{ zzbbv -> 0x050a }
            r0.mo11621j(r4)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x0011
        L_0x036b:
            com.google.android.gms.internal.ads.aaw r4 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            java.util.List r4 = r4.mo11529a(r2, r5)     // Catch:{ zzbbv -> 0x050a }
            r0.mo11619i(r4)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x0011
        L_0x0379:
            com.google.android.gms.internal.ads.aaw r4 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            java.util.List r4 = r4.mo11529a(r2, r5)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x0283
        L_0x0384:
            com.google.android.gms.internal.ads.aaw r4 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            java.util.List r4 = r4.mo11529a(r2, r5)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x0291
        L_0x038f:
            com.google.android.gms.internal.ads.aaw r4 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            java.util.List r4 = r4.mo11529a(r2, r5)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x029f
        L_0x039a:
            com.google.android.gms.internal.ads.aaw r4 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            java.util.List r4 = r4.mo11529a(r2, r5)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x02ad
        L_0x03a5:
            com.google.android.gms.internal.ads.aaw r4 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            java.util.List r4 = r4.mo11529a(r2, r5)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x02bb
        L_0x03b0:
            com.google.android.gms.internal.ads.aaw r4 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            java.util.List r4 = r4.mo11529a(r2, r5)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x02c9
        L_0x03bb:
            com.google.android.gms.internal.ads.aaw r4 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            java.util.List r4 = r4.mo11529a(r2, r5)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x02d7
        L_0x03c6:
            com.google.android.gms.internal.ads.aaw r4 = r1.f11411p     // Catch:{ zzbbv -> 0x050a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ zzbbv -> 0x050a }
            java.util.List r4 = r4.mo11529a(r2, r5)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x02e5
        L_0x03d1:
            boolean r4 = r1.m15503a((T) r2, r5)     // Catch:{ zzbbv -> 0x050a }
            if (r4 == 0) goto L_0x03ef
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ zzbbv -> 0x050a }
            java.lang.Object r4 = com.google.android.gms.internal.ads.adc.m15832f(r2, r6)     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.ace r5 = r1.m15494a(r5)     // Catch:{ zzbbv -> 0x050a }
            java.lang.Object r5 = r0.mo11603b(r5, r10)     // Catch:{ zzbbv -> 0x050a }
            java.lang.Object r4 = com.google.android.gms.internal.ads.aak.m15382a(r4, r5)     // Catch:{ zzbbv -> 0x050a }
        L_0x03ea:
            com.google.android.gms.internal.ads.adc.m15810a(r2, r6, r4)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x0011
        L_0x03ef:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.ace r4 = r1.m15494a(r5)     // Catch:{ zzbbv -> 0x050a }
            java.lang.Object r4 = r0.mo11603b(r4, r10)     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15810a(r2, r6, r4)     // Catch:{ zzbbv -> 0x050a }
        L_0x03fd:
            r1.m15509b((T) r2, r5)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x0011
        L_0x0402:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ zzbbv -> 0x050a }
            long r8 = r19.mo11638t()     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15809a(r2, r6, r8)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x03fd
        L_0x040d:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ zzbbv -> 0x050a }
            int r4 = r19.mo11637s()     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15808a(r2, r6, r4)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x03fd
        L_0x0418:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ zzbbv -> 0x050a }
            long r8 = r19.mo11636r()     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15809a(r2, r6, r8)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x03fd
        L_0x0423:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ zzbbv -> 0x050a }
            int r4 = r19.mo11634q()     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15808a(r2, r6, r4)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x03fd
        L_0x042e:
            int r7 = r19.mo11632p()     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.aam r9 = r1.m15514c(r5)     // Catch:{ zzbbv -> 0x050a }
            if (r9 == 0) goto L_0x043e
            com.google.android.gms.internal.ads.aal r9 = r9.mo11500a(r7)     // Catch:{ zzbbv -> 0x050a }
            if (r9 == 0) goto L_0x00fb
        L_0x043e:
            r4 = r6 & r8
            long r8 = (long) r4     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15808a(r2, r8, r7)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x03fd
        L_0x0445:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ zzbbv -> 0x050a }
            int r4 = r19.mo11630o()     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15808a(r2, r6, r4)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x03fd
        L_0x0450:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.zzbah r4 = r19.mo11628n()     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15810a(r2, r6, r4)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x03fd
        L_0x045b:
            boolean r4 = r1.m15503a((T) r2, r5)     // Catch:{ zzbbv -> 0x050a }
            if (r4 == 0) goto L_0x0476
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ zzbbv -> 0x050a }
            java.lang.Object r4 = com.google.android.gms.internal.ads.adc.m15832f(r2, r6)     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.ace r5 = r1.m15494a(r5)     // Catch:{ zzbbv -> 0x050a }
            java.lang.Object r5 = r0.mo11598a(r5, r10)     // Catch:{ zzbbv -> 0x050a }
            java.lang.Object r4 = com.google.android.gms.internal.ads.aak.m15382a(r4, r5)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x03ea
        L_0x0476:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.ace r4 = r1.m15494a(r5)     // Catch:{ zzbbv -> 0x050a }
            java.lang.Object r4 = r0.mo11598a(r4, r10)     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15810a(r2, r6, r4)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x03fd
        L_0x0486:
            r1.m15501a(r2, r6, r0)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x03fd
        L_0x048b:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ zzbbv -> 0x050a }
            boolean r4 = r19.mo11623k()     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15811a(r2, r6, r4)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x03fd
        L_0x0497:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ zzbbv -> 0x050a }
            int r4 = r19.mo11620j()     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15808a(r2, r6, r4)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x03fd
        L_0x04a3:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ zzbbv -> 0x050a }
            long r8 = r19.mo11618i()     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15809a(r2, r6, r8)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x03fd
        L_0x04af:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ zzbbv -> 0x050a }
            int r4 = r19.mo11616h()     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15808a(r2, r6, r4)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x03fd
        L_0x04bb:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ zzbbv -> 0x050a }
            long r8 = r19.mo11612f()     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15809a(r2, r6, r8)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x03fd
        L_0x04c7:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ zzbbv -> 0x050a }
            long r8 = r19.mo11614g()     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15809a(r2, r6, r8)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x03fd
        L_0x04d3:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ zzbbv -> 0x050a }
            float r4 = r19.mo11610e()     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15807a(r2, r6, r4)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x03fd
        L_0x04df:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ zzbbv -> 0x050a }
            double r8 = r19.mo11608d()     // Catch:{ zzbbv -> 0x050a }
            com.google.android.gms.internal.ads.adc.m15806a(r2, r6, r8)     // Catch:{ zzbbv -> 0x050a }
            goto L_0x03fd
        L_0x04eb:
            r14 = r4
        L_0x04ec:
            boolean r4 = r11.mo11689a(r14, r0)     // Catch:{ zzbbv -> 0x050a }
            if (r4 != 0) goto L_0x0011
            int[] r0 = r1.f11408m
            if (r0 == 0) goto L_0x0504
            int[] r0 = r1.f11408m
            int r3 = r0.length
        L_0x04f9:
            if (r15 >= r3) goto L_0x0504
            r4 = r0[r15]
            java.lang.Object r14 = r1.m15496a(r2, r4, (UB) r14, r11)
            int r15 = r15 + 1
            goto L_0x04f9
        L_0x0504:
            if (r14 == 0) goto L_0x0509
            r11.mo11693b(r2, r14)
        L_0x0509:
            return
        L_0x050a:
            r11.mo11688a(r0)     // Catch:{ all -> 0x0532 }
            if (r14 != 0) goto L_0x0514
            java.lang.Object r4 = r11.mo11694c(r2)     // Catch:{ all -> 0x0532 }
            r14 = r4
        L_0x0514:
            boolean r4 = r11.mo11689a(r14, r0)     // Catch:{ all -> 0x0532 }
            if (r4 != 0) goto L_0x0011
            int[] r0 = r1.f11408m
            if (r0 == 0) goto L_0x052c
            int[] r0 = r1.f11408m
            int r3 = r0.length
        L_0x0521:
            if (r15 >= r3) goto L_0x052c
            r4 = r0[r15]
            java.lang.Object r14 = r1.m15496a(r2, r4, (UB) r14, r11)
            int r15 = r15 + 1
            goto L_0x0521
        L_0x052c:
            if (r14 == 0) goto L_0x0531
            r11.mo11693b(r2, r14)
        L_0x0531:
            return
        L_0x0532:
            r0 = move-exception
            int[] r3 = r1.f11408m
            if (r3 == 0) goto L_0x0545
            int[] r3 = r1.f11408m
            int r4 = r3.length
        L_0x053a:
            if (r15 >= r4) goto L_0x0545
            r5 = r3[r15]
            java.lang.Object r14 = r1.m15496a(r2, r5, (UB) r14, r11)
            int r15 = r15 + 1
            goto L_0x053a
        L_0x0545:
            if (r14 == 0) goto L_0x054a
            r11.mo11693b(r2, r14)
        L_0x054a:
            throw r0
        L_0x054b:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.abp.mo11557a(java.lang.Object, com.google.android.gms.internal.ads.acd, com.google.android.gms.internal.ads.zx):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0385, code lost:
        r15.mo11759b(r9, com.google.android.gms.internal.ads.adc.m15832f(r14, (long) (r8 & 1048575)), m15494a(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x03a0, code lost:
        r15.mo11770e(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03b1, code lost:
        r15.mo11772f(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03c2, code lost:
        r15.mo11758b(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03d3, code lost:
        r15.mo11745a(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03e4, code lost:
        r15.mo11757b(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03f5, code lost:
        r15.mo11769e(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0400, code lost:
        r15.mo11748a(r9, (com.google.android.gms.internal.ads.zzbah) com.google.android.gms.internal.ads.adc.m15832f(r14, (long) (r8 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0413, code lost:
        r15.mo11750a(r9, com.google.android.gms.internal.ads.adc.m15832f(r14, (long) (r8 & 1048575)), m15494a(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0428, code lost:
        m15498a(r9, com.google.android.gms.internal.ads.adc.m15832f(r14, (long) (r8 & 1048575)), r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x043f, code lost:
        r15.mo11755a(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0450, code lost:
        r15.mo11766d(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0460, code lost:
        r15.mo11767d(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0470, code lost:
        r15.mo11763c(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0480, code lost:
        r15.mo11764c(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0490, code lost:
        r15.mo11746a(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04a0, code lost:
        r15.mo11744a(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04b0, code lost:
        r15.mo11743a(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0843, code lost:
        r15.mo11759b(r10, com.google.android.gms.internal.ads.adc.m15832f(r14, (long) (r9 & 1048575)), m15494a(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x085e, code lost:
        r15.mo11770e(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x086f, code lost:
        r15.mo11772f(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0880, code lost:
        r15.mo11758b(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0891, code lost:
        r15.mo11745a(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x08a2, code lost:
        r15.mo11757b(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x08b3, code lost:
        r15.mo11769e(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x08be, code lost:
        r15.mo11748a(r10, (com.google.android.gms.internal.ads.zzbah) com.google.android.gms.internal.ads.adc.m15832f(r14, (long) (r9 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x08d1, code lost:
        r15.mo11750a(r10, com.google.android.gms.internal.ads.adc.m15832f(r14, (long) (r9 & 1048575)), m15494a(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x08e6, code lost:
        m15498a(r10, com.google.android.gms.internal.ads.adc.m15832f(r14, (long) (r9 & 1048575)), r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x08fd, code lost:
        r15.mo11755a(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x090e, code lost:
        r15.mo11766d(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x091e, code lost:
        r15.mo11767d(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x092e, code lost:
        r15.mo11763c(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x093e, code lost:
        r15.mo11764c(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x094e, code lost:
        r15.mo11746a(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x095e, code lost:
        r15.mo11744a(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x096e, code lost:
        r15.mo11743a(r10, r11);
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x04b9  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x04f7  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0977  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11558a(T r14, com.google.android.gms.internal.ads.adj r15) {
        /*
            r13 = this;
            int r0 = r15.mo11741a()
            int r1 = com.google.android.gms.internal.ads.aai.C3393e.f11355k
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x04cf
            com.google.android.gms.internal.ads.acw<?, ?> r0 = r13.f11412q
            m15499a(r0, (T) r14, r15)
            boolean r0 = r13.f11403h
            if (r0 == 0) goto L_0x0030
            com.google.android.gms.internal.ads.zz<?> r0 = r13.f11413r
            com.google.android.gms.internal.ads.aac r0 = r0.mo11431a(r14)
            boolean r1 = r0.mo11442b()
            if (r1 != 0) goto L_0x0030
            java.util.Iterator r0 = r0.mo11448f()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0032
        L_0x0030:
            r0 = r3
            r1 = r0
        L_0x0032:
            int[] r7 = r13.f11397b
            int r7 = r7.length
            int r7 = r7 + -4
        L_0x0037:
            if (r7 < 0) goto L_0x04b7
            int r8 = r13.m15516d(r7)
            int[] r9 = r13.f11397b
            r9 = r9[r7]
        L_0x0041:
            if (r1 == 0) goto L_0x005f
            com.google.android.gms.internal.ads.zz<?> r10 = r13.f11413r
            int r10 = r10.mo11430a(r1)
            if (r10 <= r9) goto L_0x005f
            com.google.android.gms.internal.ads.zz<?> r10 = r13.f11413r
            r10.mo11435a(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0041
        L_0x005d:
            r1 = r3
            goto L_0x0041
        L_0x005f:
            r10 = r8 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x04a4;
                case 1: goto L_0x0494;
                case 2: goto L_0x0484;
                case 3: goto L_0x0474;
                case 4: goto L_0x0464;
                case 5: goto L_0x0454;
                case 6: goto L_0x0444;
                case 7: goto L_0x0433;
                case 8: goto L_0x0422;
                case 9: goto L_0x040d;
                case 10: goto L_0x03fa;
                case 11: goto L_0x03e9;
                case 12: goto L_0x03d8;
                case 13: goto L_0x03c7;
                case 14: goto L_0x03b6;
                case 15: goto L_0x03a5;
                case 16: goto L_0x0394;
                case 17: goto L_0x037f;
                case 18: goto L_0x036e;
                case 19: goto L_0x035d;
                case 20: goto L_0x034c;
                case 21: goto L_0x033b;
                case 22: goto L_0x032a;
                case 23: goto L_0x0319;
                case 24: goto L_0x0308;
                case 25: goto L_0x02f7;
                case 26: goto L_0x02e6;
                case 27: goto L_0x02d1;
                case 28: goto L_0x02c0;
                case 29: goto L_0x02af;
                case 30: goto L_0x029e;
                case 31: goto L_0x028d;
                case 32: goto L_0x027c;
                case 33: goto L_0x026b;
                case 34: goto L_0x025a;
                case 35: goto L_0x0249;
                case 36: goto L_0x0238;
                case 37: goto L_0x0227;
                case 38: goto L_0x0216;
                case 39: goto L_0x0205;
                case 40: goto L_0x01f4;
                case 41: goto L_0x01e3;
                case 42: goto L_0x01d2;
                case 43: goto L_0x01c1;
                case 44: goto L_0x01b0;
                case 45: goto L_0x019f;
                case 46: goto L_0x018e;
                case 47: goto L_0x017d;
                case 48: goto L_0x016c;
                case 49: goto L_0x0157;
                case 50: goto L_0x014c;
                case 51: goto L_0x013e;
                case 52: goto L_0x0130;
                case 53: goto L_0x0122;
                case 54: goto L_0x0114;
                case 55: goto L_0x0106;
                case 56: goto L_0x00f8;
                case 57: goto L_0x00ea;
                case 58: goto L_0x00dc;
                case 59: goto L_0x00d4;
                case 60: goto L_0x00cc;
                case 61: goto L_0x00c4;
                case 62: goto L_0x00b6;
                case 63: goto L_0x00a8;
                case 64: goto L_0x009a;
                case 65: goto L_0x008c;
                case 66: goto L_0x007e;
                case 67: goto L_0x0070;
                case 68: goto L_0x0068;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x04b3
        L_0x0068:
            boolean r10 = r13.m15504a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            goto L_0x0385
        L_0x0070:
            boolean r10 = r13.m15504a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m15519e(r14, r10)
            goto L_0x03a0
        L_0x007e:
            boolean r10 = r13.m15504a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m15517d(r14, r10)
            goto L_0x03b1
        L_0x008c:
            boolean r10 = r13.m15504a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m15519e(r14, r10)
            goto L_0x03c2
        L_0x009a:
            boolean r10 = r13.m15504a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m15517d(r14, r10)
            goto L_0x03d3
        L_0x00a8:
            boolean r10 = r13.m15504a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m15517d(r14, r10)
            goto L_0x03e4
        L_0x00b6:
            boolean r10 = r13.m15504a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m15517d(r14, r10)
            goto L_0x03f5
        L_0x00c4:
            boolean r10 = r13.m15504a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            goto L_0x0400
        L_0x00cc:
            boolean r10 = r13.m15504a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            goto L_0x0413
        L_0x00d4:
            boolean r10 = r13.m15504a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            goto L_0x0428
        L_0x00dc:
            boolean r10 = r13.m15504a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = m15522f(r14, r10)
            goto L_0x043f
        L_0x00ea:
            boolean r10 = r13.m15504a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m15517d(r14, r10)
            goto L_0x0450
        L_0x00f8:
            boolean r10 = r13.m15504a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m15519e(r14, r10)
            goto L_0x0460
        L_0x0106:
            boolean r10 = r13.m15504a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m15517d(r14, r10)
            goto L_0x0470
        L_0x0114:
            boolean r10 = r13.m15504a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m15519e(r14, r10)
            goto L_0x0480
        L_0x0122:
            boolean r10 = r13.m15504a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m15519e(r14, r10)
            goto L_0x0490
        L_0x0130:
            boolean r10 = r13.m15504a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = m15513c(r14, r10)
            goto L_0x04a0
        L_0x013e:
            boolean r10 = r13.m15504a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = m15507b((T) r14, r10)
            goto L_0x04b0
        L_0x014c:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            r13.m15500a(r15, r9, r8, r7)
            goto L_0x04b3
        L_0x0157:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.ace r10 = r13.m15494a(r7)
            com.google.android.gms.internal.ads.acg.m15679b(r9, r8, r15, r10)
            goto L_0x04b3
        L_0x016c:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.acg.m15692e(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x017d:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.acg.m15707j(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x018e:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.acg.m15698g(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x019f:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.acg.m15709l(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x01b0:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.acg.m15710m(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x01c1:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.acg.m15704i(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x01d2:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.acg.m15711n(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x01e3:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.acg.m15708k(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x01f4:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.acg.m15695f(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x0205:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.acg.m15701h(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x0216:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.acg.m15688d(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x0227:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.acg.m15684c(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x0238:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.acg.m15680b(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x0249:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.acg.m15666a(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x025a:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.acg.m15692e(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x026b:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.acg.m15707j(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x027c:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.acg.m15698g(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x028d:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.acg.m15709l(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x029e:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.acg.m15710m(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x02af:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.acg.m15704i(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x02c0:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.acg.m15678b(r9, r8, r15)
            goto L_0x04b3
        L_0x02d1:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.ace r10 = r13.m15494a(r7)
            com.google.android.gms.internal.ads.acg.m15665a(r9, r8, r15, r10)
            goto L_0x04b3
        L_0x02e6:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.acg.m15664a(r9, r8, r15)
            goto L_0x04b3
        L_0x02f7:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.acg.m15711n(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x0308:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.acg.m15708k(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x0319:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.acg.m15695f(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x032a:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.acg.m15701h(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x033b:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.acg.m15688d(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x034c:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.acg.m15684c(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x035d:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.acg.m15680b(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x036e:
            int[] r9 = r13.f11397b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.acg.m15666a(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x037f:
            boolean r10 = r13.m15503a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
        L_0x0385:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            com.google.android.gms.internal.ads.ace r10 = r13.m15494a(r7)
            r15.mo11759b(r9, r8, r10)
            goto L_0x04b3
        L_0x0394:
            boolean r10 = r13.m15503a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.ads.adc.m15815b(r14, r10)
        L_0x03a0:
            r15.mo11770e(r9, r10)
            goto L_0x04b3
        L_0x03a5:
            boolean r10 = r13.m15503a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.ads.adc.m15802a(r14, r10)
        L_0x03b1:
            r15.mo11772f(r9, r8)
            goto L_0x04b3
        L_0x03b6:
            boolean r10 = r13.m15503a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.ads.adc.m15815b(r14, r10)
        L_0x03c2:
            r15.mo11758b(r9, r10)
            goto L_0x04b3
        L_0x03c7:
            boolean r10 = r13.m15503a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.ads.adc.m15802a(r14, r10)
        L_0x03d3:
            r15.mo11745a(r9, r8)
            goto L_0x04b3
        L_0x03d8:
            boolean r10 = r13.m15503a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.ads.adc.m15802a(r14, r10)
        L_0x03e4:
            r15.mo11757b(r9, r8)
            goto L_0x04b3
        L_0x03e9:
            boolean r10 = r13.m15503a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.ads.adc.m15802a(r14, r10)
        L_0x03f5:
            r15.mo11769e(r9, r8)
            goto L_0x04b3
        L_0x03fa:
            boolean r10 = r13.m15503a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
        L_0x0400:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            com.google.android.gms.internal.ads.zzbah r8 = (com.google.android.gms.internal.ads.zzbah) r8
            r15.mo11748a(r9, r8)
            goto L_0x04b3
        L_0x040d:
            boolean r10 = r13.m15503a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
        L_0x0413:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            com.google.android.gms.internal.ads.ace r10 = r13.m15494a(r7)
            r15.mo11750a(r9, r8, r10)
            goto L_0x04b3
        L_0x0422:
            boolean r10 = r13.m15503a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
        L_0x0428:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.adc.m15832f(r14, r10)
            m15498a(r9, r8, r15)
            goto L_0x04b3
        L_0x0433:
            boolean r10 = r13.m15503a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = com.google.android.gms.internal.ads.adc.m15824c(r14, r10)
        L_0x043f:
            r15.mo11755a(r9, r8)
            goto L_0x04b3
        L_0x0444:
            boolean r10 = r13.m15503a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.ads.adc.m15802a(r14, r10)
        L_0x0450:
            r15.mo11766d(r9, r8)
            goto L_0x04b3
        L_0x0454:
            boolean r10 = r13.m15503a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.ads.adc.m15815b(r14, r10)
        L_0x0460:
            r15.mo11767d(r9, r10)
            goto L_0x04b3
        L_0x0464:
            boolean r10 = r13.m15503a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.ads.adc.m15802a(r14, r10)
        L_0x0470:
            r15.mo11763c(r9, r8)
            goto L_0x04b3
        L_0x0474:
            boolean r10 = r13.m15503a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.ads.adc.m15815b(r14, r10)
        L_0x0480:
            r15.mo11764c(r9, r10)
            goto L_0x04b3
        L_0x0484:
            boolean r10 = r13.m15503a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.ads.adc.m15815b(r14, r10)
        L_0x0490:
            r15.mo11746a(r9, r10)
            goto L_0x04b3
        L_0x0494:
            boolean r10 = r13.m15503a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = com.google.android.gms.internal.ads.adc.m15825d(r14, r10)
        L_0x04a0:
            r15.mo11744a(r9, r8)
            goto L_0x04b3
        L_0x04a4:
            boolean r10 = r13.m15503a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = com.google.android.gms.internal.ads.adc.m15829e(r14, r10)
        L_0x04b0:
            r15.mo11743a(r9, r10)
        L_0x04b3:
            int r7 = r7 + -4
            goto L_0x0037
        L_0x04b7:
            if (r1 == 0) goto L_0x04ce
            com.google.android.gms.internal.ads.zz<?> r14 = r13.f11413r
            r14.mo11435a(r15, r1)
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x04cc
            java.lang.Object r14 = r0.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            r1 = r14
            goto L_0x04b7
        L_0x04cc:
            r1 = r3
            goto L_0x04b7
        L_0x04ce:
            return
        L_0x04cf:
            boolean r0 = r13.f11405j
            if (r0 == 0) goto L_0x0992
            boolean r0 = r13.f11403h
            if (r0 == 0) goto L_0x04ee
            com.google.android.gms.internal.ads.zz<?> r0 = r13.f11413r
            com.google.android.gms.internal.ads.aac r0 = r0.mo11431a(r14)
            boolean r1 = r0.mo11442b()
            if (r1 != 0) goto L_0x04ee
            java.util.Iterator r0 = r0.mo11446e()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x04f0
        L_0x04ee:
            r0 = r3
            r1 = r0
        L_0x04f0:
            int[] r7 = r13.f11397b
            int r7 = r7.length
            r8 = r1
            r1 = 0
        L_0x04f5:
            if (r1 >= r7) goto L_0x0975
            int r9 = r13.m15516d(r1)
            int[] r10 = r13.f11397b
            r10 = r10[r1]
        L_0x04ff:
            if (r8 == 0) goto L_0x051d
            com.google.android.gms.internal.ads.zz<?> r11 = r13.f11413r
            int r11 = r11.mo11430a(r8)
            if (r11 > r10) goto L_0x051d
            com.google.android.gms.internal.ads.zz<?> r11 = r13.f11413r
            r11.mo11435a(r15, r8)
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x051b
            java.lang.Object r8 = r0.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            goto L_0x04ff
        L_0x051b:
            r8 = r3
            goto L_0x04ff
        L_0x051d:
            r11 = r9 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0962;
                case 1: goto L_0x0952;
                case 2: goto L_0x0942;
                case 3: goto L_0x0932;
                case 4: goto L_0x0922;
                case 5: goto L_0x0912;
                case 6: goto L_0x0902;
                case 7: goto L_0x08f1;
                case 8: goto L_0x08e0;
                case 9: goto L_0x08cb;
                case 10: goto L_0x08b8;
                case 11: goto L_0x08a7;
                case 12: goto L_0x0896;
                case 13: goto L_0x0885;
                case 14: goto L_0x0874;
                case 15: goto L_0x0863;
                case 16: goto L_0x0852;
                case 17: goto L_0x083d;
                case 18: goto L_0x082c;
                case 19: goto L_0x081b;
                case 20: goto L_0x080a;
                case 21: goto L_0x07f9;
                case 22: goto L_0x07e8;
                case 23: goto L_0x07d7;
                case 24: goto L_0x07c6;
                case 25: goto L_0x07b5;
                case 26: goto L_0x07a4;
                case 27: goto L_0x078f;
                case 28: goto L_0x077e;
                case 29: goto L_0x076d;
                case 30: goto L_0x075c;
                case 31: goto L_0x074b;
                case 32: goto L_0x073a;
                case 33: goto L_0x0729;
                case 34: goto L_0x0718;
                case 35: goto L_0x0707;
                case 36: goto L_0x06f6;
                case 37: goto L_0x06e5;
                case 38: goto L_0x06d4;
                case 39: goto L_0x06c3;
                case 40: goto L_0x06b2;
                case 41: goto L_0x06a1;
                case 42: goto L_0x0690;
                case 43: goto L_0x067f;
                case 44: goto L_0x066e;
                case 45: goto L_0x065d;
                case 46: goto L_0x064c;
                case 47: goto L_0x063b;
                case 48: goto L_0x062a;
                case 49: goto L_0x0615;
                case 50: goto L_0x060a;
                case 51: goto L_0x05fc;
                case 52: goto L_0x05ee;
                case 53: goto L_0x05e0;
                case 54: goto L_0x05d2;
                case 55: goto L_0x05c4;
                case 56: goto L_0x05b6;
                case 57: goto L_0x05a8;
                case 58: goto L_0x059a;
                case 59: goto L_0x0592;
                case 60: goto L_0x058a;
                case 61: goto L_0x0582;
                case 62: goto L_0x0574;
                case 63: goto L_0x0566;
                case 64: goto L_0x0558;
                case 65: goto L_0x054a;
                case 66: goto L_0x053c;
                case 67: goto L_0x052e;
                case 68: goto L_0x0526;
                default: goto L_0x0524;
            }
        L_0x0524:
            goto L_0x0971
        L_0x0526:
            boolean r11 = r13.m15504a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            goto L_0x0843
        L_0x052e:
            boolean r11 = r13.m15504a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m15519e(r14, r11)
            goto L_0x085e
        L_0x053c:
            boolean r11 = r13.m15504a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m15517d(r14, r11)
            goto L_0x086f
        L_0x054a:
            boolean r11 = r13.m15504a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m15519e(r14, r11)
            goto L_0x0880
        L_0x0558:
            boolean r11 = r13.m15504a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m15517d(r14, r11)
            goto L_0x0891
        L_0x0566:
            boolean r11 = r13.m15504a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m15517d(r14, r11)
            goto L_0x08a2
        L_0x0574:
            boolean r11 = r13.m15504a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m15517d(r14, r11)
            goto L_0x08b3
        L_0x0582:
            boolean r11 = r13.m15504a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            goto L_0x08be
        L_0x058a:
            boolean r11 = r13.m15504a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            goto L_0x08d1
        L_0x0592:
            boolean r11 = r13.m15504a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            goto L_0x08e6
        L_0x059a:
            boolean r11 = r13.m15504a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = m15522f(r14, r11)
            goto L_0x08fd
        L_0x05a8:
            boolean r11 = r13.m15504a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m15517d(r14, r11)
            goto L_0x090e
        L_0x05b6:
            boolean r11 = r13.m15504a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m15519e(r14, r11)
            goto L_0x091e
        L_0x05c4:
            boolean r11 = r13.m15504a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m15517d(r14, r11)
            goto L_0x092e
        L_0x05d2:
            boolean r11 = r13.m15504a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m15519e(r14, r11)
            goto L_0x093e
        L_0x05e0:
            boolean r11 = r13.m15504a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m15519e(r14, r11)
            goto L_0x094e
        L_0x05ee:
            boolean r11 = r13.m15504a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = m15513c(r14, r11)
            goto L_0x095e
        L_0x05fc:
            boolean r11 = r13.m15504a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = m15507b((T) r14, r11)
            goto L_0x096e
        L_0x060a:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            r13.m15500a(r15, r10, r9, r1)
            goto L_0x0971
        L_0x0615:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.ace r11 = r13.m15494a(r1)
            com.google.android.gms.internal.ads.acg.m15679b(r10, r9, r15, r11)
            goto L_0x0971
        L_0x062a:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.acg.m15692e(r10, r9, r15, r4)
            goto L_0x0971
        L_0x063b:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.acg.m15707j(r10, r9, r15, r4)
            goto L_0x0971
        L_0x064c:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.acg.m15698g(r10, r9, r15, r4)
            goto L_0x0971
        L_0x065d:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.acg.m15709l(r10, r9, r15, r4)
            goto L_0x0971
        L_0x066e:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.acg.m15710m(r10, r9, r15, r4)
            goto L_0x0971
        L_0x067f:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.acg.m15704i(r10, r9, r15, r4)
            goto L_0x0971
        L_0x0690:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.acg.m15711n(r10, r9, r15, r4)
            goto L_0x0971
        L_0x06a1:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.acg.m15708k(r10, r9, r15, r4)
            goto L_0x0971
        L_0x06b2:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.acg.m15695f(r10, r9, r15, r4)
            goto L_0x0971
        L_0x06c3:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.acg.m15701h(r10, r9, r15, r4)
            goto L_0x0971
        L_0x06d4:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.acg.m15688d(r10, r9, r15, r4)
            goto L_0x0971
        L_0x06e5:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.acg.m15684c(r10, r9, r15, r4)
            goto L_0x0971
        L_0x06f6:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.acg.m15680b(r10, r9, r15, r4)
            goto L_0x0971
        L_0x0707:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.acg.m15666a(r10, r9, r15, r4)
            goto L_0x0971
        L_0x0718:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.acg.m15692e(r10, r9, r15, r5)
            goto L_0x0971
        L_0x0729:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.acg.m15707j(r10, r9, r15, r5)
            goto L_0x0971
        L_0x073a:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.acg.m15698g(r10, r9, r15, r5)
            goto L_0x0971
        L_0x074b:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.acg.m15709l(r10, r9, r15, r5)
            goto L_0x0971
        L_0x075c:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.acg.m15710m(r10, r9, r15, r5)
            goto L_0x0971
        L_0x076d:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.acg.m15704i(r10, r9, r15, r5)
            goto L_0x0971
        L_0x077e:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.acg.m15678b(r10, r9, r15)
            goto L_0x0971
        L_0x078f:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.ace r11 = r13.m15494a(r1)
            com.google.android.gms.internal.ads.acg.m15665a(r10, r9, r15, r11)
            goto L_0x0971
        L_0x07a4:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.acg.m15664a(r10, r9, r15)
            goto L_0x0971
        L_0x07b5:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.acg.m15711n(r10, r9, r15, r5)
            goto L_0x0971
        L_0x07c6:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.acg.m15708k(r10, r9, r15, r5)
            goto L_0x0971
        L_0x07d7:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.acg.m15695f(r10, r9, r15, r5)
            goto L_0x0971
        L_0x07e8:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.acg.m15701h(r10, r9, r15, r5)
            goto L_0x0971
        L_0x07f9:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.acg.m15688d(r10, r9, r15, r5)
            goto L_0x0971
        L_0x080a:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.acg.m15684c(r10, r9, r15, r5)
            goto L_0x0971
        L_0x081b:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.acg.m15680b(r10, r9, r15, r5)
            goto L_0x0971
        L_0x082c:
            int[] r10 = r13.f11397b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.acg.m15666a(r10, r9, r15, r5)
            goto L_0x0971
        L_0x083d:
            boolean r11 = r13.m15503a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
        L_0x0843:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            com.google.android.gms.internal.ads.ace r11 = r13.m15494a(r1)
            r15.mo11759b(r10, r9, r11)
            goto L_0x0971
        L_0x0852:
            boolean r11 = r13.m15503a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.ads.adc.m15815b(r14, r11)
        L_0x085e:
            r15.mo11770e(r10, r11)
            goto L_0x0971
        L_0x0863:
            boolean r11 = r13.m15503a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.ads.adc.m15802a(r14, r11)
        L_0x086f:
            r15.mo11772f(r10, r9)
            goto L_0x0971
        L_0x0874:
            boolean r11 = r13.m15503a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.ads.adc.m15815b(r14, r11)
        L_0x0880:
            r15.mo11758b(r10, r11)
            goto L_0x0971
        L_0x0885:
            boolean r11 = r13.m15503a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.ads.adc.m15802a(r14, r11)
        L_0x0891:
            r15.mo11745a(r10, r9)
            goto L_0x0971
        L_0x0896:
            boolean r11 = r13.m15503a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.ads.adc.m15802a(r14, r11)
        L_0x08a2:
            r15.mo11757b(r10, r9)
            goto L_0x0971
        L_0x08a7:
            boolean r11 = r13.m15503a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.ads.adc.m15802a(r14, r11)
        L_0x08b3:
            r15.mo11769e(r10, r9)
            goto L_0x0971
        L_0x08b8:
            boolean r11 = r13.m15503a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
        L_0x08be:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            com.google.android.gms.internal.ads.zzbah r9 = (com.google.android.gms.internal.ads.zzbah) r9
            r15.mo11748a(r10, r9)
            goto L_0x0971
        L_0x08cb:
            boolean r11 = r13.m15503a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
        L_0x08d1:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            com.google.android.gms.internal.ads.ace r11 = r13.m15494a(r1)
            r15.mo11750a(r10, r9, r11)
            goto L_0x0971
        L_0x08e0:
            boolean r11 = r13.m15503a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
        L_0x08e6:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.adc.m15832f(r14, r11)
            m15498a(r10, r9, r15)
            goto L_0x0971
        L_0x08f1:
            boolean r11 = r13.m15503a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = com.google.android.gms.internal.ads.adc.m15824c(r14, r11)
        L_0x08fd:
            r15.mo11755a(r10, r9)
            goto L_0x0971
        L_0x0902:
            boolean r11 = r13.m15503a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.ads.adc.m15802a(r14, r11)
        L_0x090e:
            r15.mo11766d(r10, r9)
            goto L_0x0971
        L_0x0912:
            boolean r11 = r13.m15503a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.ads.adc.m15815b(r14, r11)
        L_0x091e:
            r15.mo11767d(r10, r11)
            goto L_0x0971
        L_0x0922:
            boolean r11 = r13.m15503a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.ads.adc.m15802a(r14, r11)
        L_0x092e:
            r15.mo11763c(r10, r9)
            goto L_0x0971
        L_0x0932:
            boolean r11 = r13.m15503a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.ads.adc.m15815b(r14, r11)
        L_0x093e:
            r15.mo11764c(r10, r11)
            goto L_0x0971
        L_0x0942:
            boolean r11 = r13.m15503a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.ads.adc.m15815b(r14, r11)
        L_0x094e:
            r15.mo11746a(r10, r11)
            goto L_0x0971
        L_0x0952:
            boolean r11 = r13.m15503a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = com.google.android.gms.internal.ads.adc.m15825d(r14, r11)
        L_0x095e:
            r15.mo11744a(r10, r9)
            goto L_0x0971
        L_0x0962:
            boolean r11 = r13.m15503a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = com.google.android.gms.internal.ads.adc.m15829e(r14, r11)
        L_0x096e:
            r15.mo11743a(r10, r11)
        L_0x0971:
            int r1 = r1 + 4
            goto L_0x04f5
        L_0x0975:
            if (r8 == 0) goto L_0x098c
            com.google.android.gms.internal.ads.zz<?> r1 = r13.f11413r
            r1.mo11435a(r15, r8)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x098a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r8 = r1
            goto L_0x0975
        L_0x098a:
            r8 = r3
            goto L_0x0975
        L_0x098c:
            com.google.android.gms.internal.ads.acw<?, ?> r0 = r13.f11412q
            m15499a(r0, (T) r14, r15)
            return
        L_0x0992:
            r13.m15511b((T) r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.abp.mo11558a(java.lang.Object, com.google.android.gms.internal.ads.adj):void");
    }

    /* JADX WARNING: type inference failed for: r25v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r2v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v1, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r0v5, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r16v0, types: [int] */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r0v8, types: [int] */
    /* JADX WARNING: type inference failed for: r1v2, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r2v4, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v3, types: [int] */
    /* JADX WARNING: type inference failed for: r2v5, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r2v7, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v6, types: [int] */
    /* JADX WARNING: type inference failed for: r1v9, types: [int] */
    /* JADX WARNING: type inference failed for: r2v8, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r16v1 */
    /* JADX WARNING: type inference failed for: r1v25, types: [int] */
    /* JADX WARNING: type inference failed for: r16v2 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: type inference failed for: r12v10 */
    /* JADX WARNING: type inference failed for: r12v11 */
    /* JADX WARNING: type inference failed for: r12v12 */
    /* JADX WARNING: type inference failed for: r12v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        if (r7 == 0) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        r1 = r11.f15167c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        r9.putObject(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ce, code lost:
        if (r7 == 0) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d0, code lost:
        r0 = com.google.android.gms.internal.ads.C4115zd.m20412a(r12, r10, r11);
        r1 = r11.f15165a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d6, code lost:
        r9.putInt(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e3, code lost:
        r9.putLong(r24, r2, r4);
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f5, code lost:
        r0 = r10 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0102, code lost:
        r0 = r10 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0164, code lost:
        if (r0 == r15) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0189, code lost:
        if (r0 == r15) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01a2, code lost:
        if (r0 == r15) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0012, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0012, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0012, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0012, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0012, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r0v5, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r25v0, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r12v2
      assigns: []
      uses: []
      mth insns count: 200
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 16 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11559a(T r24, byte[] r25, int r26, int r27, com.google.android.gms.internal.ads.C4116ze r28) {
        /*
            r23 = this;
            r15 = r23
            r14 = r24
            r12 = r25
            r13 = r27
            r11 = r28
            boolean r0 = r15.f11405j
            if (r0 == 0) goto L_0x01ce
            sun.misc.Unsafe r9 = f11396a
            r0 = r26
        L_0x0012:
            if (r0 >= r13) goto L_0x01c5
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0024
            int r0 = com.google.android.gms.internal.ads.C4115zd.m20409a(r0, r12, r1, r11)
            int r1 = r11.f15165a
            r10 = r0
            r16 = r1
            goto L_0x0027
        L_0x0024:
            r16 = r0
            r10 = r1
        L_0x0027:
            int r6 = r16 >>> 3
            r7 = r16 & 7
            int r8 = r15.m15523g(r6)
            if (r8 < 0) goto L_0x01a5
            int[] r0 = r15.f11397b
            int r1 = r8 + 1
            r5 = r0[r1]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r5
            int r4 = r0 >>> 20
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r2 = (long) r0
            r0 = 17
            r1 = 2
            if (r4 > r0) goto L_0x0106
            r0 = 5
            r6 = 1
            switch(r4) {
                case 0: goto L_0x00f9;
                case 1: goto L_0x00ec;
                case 2: goto L_0x00db;
                case 3: goto L_0x00db;
                case 4: goto L_0x00ce;
                case 5: goto L_0x00c1;
                case 6: goto L_0x00b7;
                case 7: goto L_0x00a2;
                case 8: goto L_0x0091;
                case 9: goto L_0x0079;
                case 10: goto L_0x006d;
                case 11: goto L_0x00ce;
                case 12: goto L_0x0069;
                case 13: goto L_0x00b7;
                case 14: goto L_0x00c1;
                case 15: goto L_0x005b;
                case 16: goto L_0x004d;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x01a5
        L_0x004d:
            if (r7 != 0) goto L_0x01a5
            int r6 = com.google.android.gms.internal.ads.C4115zd.m20413b(r12, r10, r11)
            long r0 = r11.f15166b
            long r4 = com.google.android.gms.internal.ads.C4124zm.m20432a(r0)
            goto L_0x00e3
        L_0x005b:
            if (r7 != 0) goto L_0x01a5
            int r0 = com.google.android.gms.internal.ads.C4115zd.m20412a(r12, r10, r11)
            int r1 = r11.f15165a
            int r1 = com.google.android.gms.internal.ads.C4124zm.m20434f(r1)
            goto L_0x00d6
        L_0x0069:
            if (r7 != 0) goto L_0x01a5
            goto L_0x00d0
        L_0x006d:
            if (r7 != r1) goto L_0x01a5
            int r0 = com.google.android.gms.internal.ads.C4115zd.m20419e(r12, r10, r11)
        L_0x0073:
            java.lang.Object r1 = r11.f15167c
        L_0x0075:
            r9.putObject(r14, r2, r1)
            goto L_0x0012
        L_0x0079:
            if (r7 != r1) goto L_0x01a5
            com.google.android.gms.internal.ads.ace r0 = r15.m15494a(r8)
            int r0 = m15486a(r0, r12, r10, r13, r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x008a
            goto L_0x0073
        L_0x008a:
            java.lang.Object r4 = r11.f15167c
            java.lang.Object r1 = com.google.android.gms.internal.ads.aak.m15382a(r1, r4)
            goto L_0x0075
        L_0x0091:
            if (r7 != r1) goto L_0x01a5
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x009d
            int r0 = com.google.android.gms.internal.ads.C4115zd.m20416c(r12, r10, r11)
            goto L_0x0073
        L_0x009d:
            int r0 = com.google.android.gms.internal.ads.C4115zd.m20418d(r12, r10, r11)
            goto L_0x0073
        L_0x00a2:
            if (r7 != 0) goto L_0x01a5
            int r0 = com.google.android.gms.internal.ads.C4115zd.m20413b(r12, r10, r11)
            long r4 = r11.f15166b
            r7 = 0
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r6 = 0
        L_0x00b2:
            com.google.android.gms.internal.ads.adc.m15811a(r14, r2, r6)
            goto L_0x0012
        L_0x00b7:
            if (r7 != r0) goto L_0x01a5
            int r0 = com.google.android.gms.internal.ads.C4115zd.m20410a(r12, r10)
            r9.putInt(r14, r2, r0)
            goto L_0x00f5
        L_0x00c1:
            if (r7 != r6) goto L_0x01a5
            long r4 = com.google.android.gms.internal.ads.C4115zd.m20414b(r12, r10)
            r0 = r9
            r1 = r24
            r0.putLong(r1, r2, r4)
            goto L_0x0102
        L_0x00ce:
            if (r7 != 0) goto L_0x01a5
        L_0x00d0:
            int r0 = com.google.android.gms.internal.ads.C4115zd.m20412a(r12, r10, r11)
            int r1 = r11.f15165a
        L_0x00d6:
            r9.putInt(r14, r2, r1)
            goto L_0x0012
        L_0x00db:
            if (r7 != 0) goto L_0x01a5
            int r6 = com.google.android.gms.internal.ads.C4115zd.m20413b(r12, r10, r11)
            long r4 = r11.f15166b
        L_0x00e3:
            r0 = r9
            r1 = r24
            r0.putLong(r1, r2, r4)
            r0 = r6
            goto L_0x0012
        L_0x00ec:
            if (r7 != r0) goto L_0x01a5
            float r0 = com.google.android.gms.internal.ads.C4115zd.m20417d(r12, r10)
            com.google.android.gms.internal.ads.adc.m15807a(r14, r2, r0)
        L_0x00f5:
            int r0 = r10 + 4
            goto L_0x0012
        L_0x00f9:
            if (r7 != r6) goto L_0x01a5
            double r0 = com.google.android.gms.internal.ads.C4115zd.m20415c(r12, r10)
            com.google.android.gms.internal.ads.adc.m15806a(r14, r2, r0)
        L_0x0102:
            int r0 = r10 + 8
            goto L_0x0012
        L_0x0106:
            r0 = 27
            if (r4 != r0) goto L_0x013e
            if (r7 != r1) goto L_0x01a5
            java.lang.Object r0 = r9.getObject(r14, r2)
            com.google.android.gms.internal.ads.aan r0 = (com.google.android.gms.internal.ads.aan) r0
            boolean r1 = r0.mo11501a()
            if (r1 != 0) goto L_0x012a
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0121
            r1 = 10
            goto L_0x0123
        L_0x0121:
            int r1 = r1 << 1
        L_0x0123:
            com.google.android.gms.internal.ads.aan r0 = r0.mo11460a(r1)
            r9.putObject(r14, r2, r0)
        L_0x012a:
            r5 = r0
            com.google.android.gms.internal.ads.ace r0 = r15.m15494a(r8)
            r1 = r16
            r2 = r25
            r3 = r10
            r4 = r27
            r6 = r28
            int r0 = m15484a(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0012
        L_0x013e:
            r0 = 49
            if (r4 > r0) goto L_0x0168
            long r0 = (long) r5
            r17 = r0
            r0 = r23
            r1 = r24
            r19 = r2
            r2 = r25
            r3 = r10
            r5 = r4
            r4 = r27
            r21 = r5
            r5 = r16
            r22 = r9
            r15 = r10
            r9 = r17
            r11 = r21
            r12 = r19
            r14 = r28
            int r0 = r0.m15489a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x01b7
        L_0x0166:
            r2 = r0
            goto L_0x01a9
        L_0x0168:
            r19 = r2
            r21 = r4
            r22 = r9
            r15 = r10
            r0 = 50
            r9 = r21
            if (r9 != r0) goto L_0x018c
            if (r7 != r1) goto L_0x01a8
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r15
            r4 = r27
            r5 = r8
            r7 = r19
            r9 = r28
            int r0 = r0.m15490a(r1, r2, r3, r4, r5, r6, r7, r9)
            if (r0 != r15) goto L_0x01b7
            goto L_0x0166
        L_0x018c:
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r15
            r4 = r27
            r10 = r5
            r5 = r16
            r12 = r8
            r8 = r10
            r10 = r19
            r13 = r28
            int r0 = r0.m15488a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x01b7
            goto L_0x0166
        L_0x01a5:
            r22 = r9
            r15 = r10
        L_0x01a8:
            r2 = r15
        L_0x01a9:
            r0 = r16
            r1 = r25
            r3 = r27
            r4 = r24
            r5 = r28
            int r0 = m15483a(r0, r1, r2, r3, r4, r5)
        L_0x01b7:
            r14 = r24
            r12 = r25
            r11 = r28
            r9 = r22
            r13 = r27
            r15 = r23
            goto L_0x0012
        L_0x01c5:
            r4 = r13
            if (r0 != r4) goto L_0x01c9
            return
        L_0x01c9:
            com.google.android.gms.internal.ads.zzbbu r0 = com.google.android.gms.internal.ads.zzbbu.zzadr()
            throw r0
        L_0x01ce:
            r4 = r13
            r5 = 0
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r6 = r28
            r0.m15491a((T) r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.abp.mo11559a(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.ze):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        if (com.google.android.gms.internal.ads.acg.m15672a(com.google.android.gms.internal.ads.adc.m15832f(r10, r6), com.google.android.gms.internal.ads.adc.m15832f(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (com.google.android.gms.internal.ads.adc.m15815b(r10, r6) == com.google.android.gms.internal.ads.adc.m15815b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        if (com.google.android.gms.internal.ads.adc.m15802a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.adc.m15802a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        if (com.google.android.gms.internal.ads.adc.m15815b(r10, r6) == com.google.android.gms.internal.ads.adc.m15815b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
        if (com.google.android.gms.internal.ads.adc.m15802a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.adc.m15802a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        if (com.google.android.gms.internal.ads.adc.m15802a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.adc.m15802a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        if (com.google.android.gms.internal.ads.adc.m15802a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.adc.m15802a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        if (com.google.android.gms.internal.ads.acg.m15672a(com.google.android.gms.internal.ads.adc.m15832f(r10, r6), com.google.android.gms.internal.ads.adc.m15832f(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (com.google.android.gms.internal.ads.acg.m15672a(com.google.android.gms.internal.ads.adc.m15832f(r10, r6), com.google.android.gms.internal.ads.adc.m15832f(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        if (com.google.android.gms.internal.ads.acg.m15672a(com.google.android.gms.internal.ads.adc.m15832f(r10, r6), com.google.android.gms.internal.ads.adc.m15832f(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0120, code lost:
        if (com.google.android.gms.internal.ads.adc.m15824c(r10, r6) == com.google.android.gms.internal.ads.adc.m15824c(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        if (com.google.android.gms.internal.ads.adc.m15802a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.adc.m15802a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0145, code lost:
        if (com.google.android.gms.internal.ads.adc.m15815b(r10, r6) == com.google.android.gms.internal.ads.adc.m15815b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0156, code lost:
        if (com.google.android.gms.internal.ads.adc.m15802a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.adc.m15802a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0169, code lost:
        if (com.google.android.gms.internal.ads.adc.m15815b(r10, r6) == com.google.android.gms.internal.ads.adc.m15815b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017c, code lost:
        if (com.google.android.gms.internal.ads.adc.m15815b(r10, r6) == com.google.android.gms.internal.ads.adc.m15815b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018d, code lost:
        if (com.google.android.gms.internal.ads.adc.m15802a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.adc.m15802a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a0, code lost:
        if (com.google.android.gms.internal.ads.adc.m15815b(r10, r6) == com.google.android.gms.internal.ads.adc.m15815b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a2, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.ads.acg.m15672a(com.google.android.gms.internal.ads.adc.m15832f(r10, r6), com.google.android.gms.internal.ads.adc.m15832f(r11, r6)) != false) goto L_0x01a3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11560a(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f11397b
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01aa
            int r4 = r9.m15516d(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x0190;
                case 1: goto L_0x017f;
                case 2: goto L_0x016c;
                case 3: goto L_0x0159;
                case 4: goto L_0x0148;
                case 5: goto L_0x0135;
                case 6: goto L_0x0124;
                case 7: goto L_0x0112;
                case 8: goto L_0x00fc;
                case 9: goto L_0x00e6;
                case 10: goto L_0x00d0;
                case 11: goto L_0x00be;
                case 12: goto L_0x00ac;
                case 13: goto L_0x009a;
                case 14: goto L_0x0086;
                case 15: goto L_0x0074;
                case 16: goto L_0x0060;
                case 17: goto L_0x004a;
                case 18: goto L_0x003c;
                case 19: goto L_0x003c;
                case 20: goto L_0x003c;
                case 21: goto L_0x003c;
                case 22: goto L_0x003c;
                case 23: goto L_0x003c;
                case 24: goto L_0x003c;
                case 25: goto L_0x003c;
                case 26: goto L_0x003c;
                case 27: goto L_0x003c;
                case 28: goto L_0x003c;
                case 29: goto L_0x003c;
                case 30: goto L_0x003c;
                case 31: goto L_0x003c;
                case 32: goto L_0x003c;
                case 33: goto L_0x003c;
                case 34: goto L_0x003c;
                case 35: goto L_0x003c;
                case 36: goto L_0x003c;
                case 37: goto L_0x003c;
                case 38: goto L_0x003c;
                case 39: goto L_0x003c;
                case 40: goto L_0x003c;
                case 41: goto L_0x003c;
                case 42: goto L_0x003c;
                case 43: goto L_0x003c;
                case 44: goto L_0x003c;
                case 45: goto L_0x003c;
                case 46: goto L_0x003c;
                case 47: goto L_0x003c;
                case 48: goto L_0x003c;
                case 49: goto L_0x003c;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01a3
        L_0x001c:
            int r4 = r9.m15518e(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.ads.adc.m15802a(r10, r4)
            int r4 = com.google.android.gms.internal.ads.adc.m15802a(r11, r4)
            if (r8 != r4) goto L_0x01a2
            java.lang.Object r4 = com.google.android.gms.internal.ads.adc.m15832f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.adc.m15832f(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.acg.m15672a(r4, r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x018f
        L_0x003c:
            java.lang.Object r3 = com.google.android.gms.internal.ads.adc.m15832f(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.ads.adc.m15832f(r11, r6)
            boolean r3 = com.google.android.gms.internal.ads.acg.m15672a(r3, r4)
            goto L_0x01a3
        L_0x004a:
            boolean r4 = r9.m15515c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            java.lang.Object r4 = com.google.android.gms.internal.ads.adc.m15832f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.adc.m15832f(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.acg.m15672a(r4, r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x01a2
        L_0x0060:
            boolean r4 = r9.m15515c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = com.google.android.gms.internal.ads.adc.m15815b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.adc.m15815b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01a3
            goto L_0x018f
        L_0x0074:
            boolean r4 = r9.m15515c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = com.google.android.gms.internal.ads.adc.m15802a(r10, r6)
            int r5 = com.google.android.gms.internal.ads.adc.m15802a(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x01a2
        L_0x0086:
            boolean r4 = r9.m15515c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = com.google.android.gms.internal.ads.adc.m15815b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.adc.m15815b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01a3
            goto L_0x018f
        L_0x009a:
            boolean r4 = r9.m15515c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = com.google.android.gms.internal.ads.adc.m15802a(r10, r6)
            int r5 = com.google.android.gms.internal.ads.adc.m15802a(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x01a2
        L_0x00ac:
            boolean r4 = r9.m15515c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = com.google.android.gms.internal.ads.adc.m15802a(r10, r6)
            int r5 = com.google.android.gms.internal.ads.adc.m15802a(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x018f
        L_0x00be:
            boolean r4 = r9.m15515c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = com.google.android.gms.internal.ads.adc.m15802a(r10, r6)
            int r5 = com.google.android.gms.internal.ads.adc.m15802a(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x01a2
        L_0x00d0:
            boolean r4 = r9.m15515c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            java.lang.Object r4 = com.google.android.gms.internal.ads.adc.m15832f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.adc.m15832f(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.acg.m15672a(r4, r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x018f
        L_0x00e6:
            boolean r4 = r9.m15515c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            java.lang.Object r4 = com.google.android.gms.internal.ads.adc.m15832f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.adc.m15832f(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.acg.m15672a(r4, r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x01a2
        L_0x00fc:
            boolean r4 = r9.m15515c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            java.lang.Object r4 = com.google.android.gms.internal.ads.adc.m15832f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.adc.m15832f(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.acg.m15672a(r4, r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x018f
        L_0x0112:
            boolean r4 = r9.m15515c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            boolean r4 = com.google.android.gms.internal.ads.adc.m15824c(r10, r6)
            boolean r5 = com.google.android.gms.internal.ads.adc.m15824c(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x01a2
        L_0x0124:
            boolean r4 = r9.m15515c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = com.google.android.gms.internal.ads.adc.m15802a(r10, r6)
            int r5 = com.google.android.gms.internal.ads.adc.m15802a(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x018f
        L_0x0135:
            boolean r4 = r9.m15515c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = com.google.android.gms.internal.ads.adc.m15815b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.adc.m15815b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01a3
            goto L_0x01a2
        L_0x0148:
            boolean r4 = r9.m15515c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = com.google.android.gms.internal.ads.adc.m15802a(r10, r6)
            int r5 = com.google.android.gms.internal.ads.adc.m15802a(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x018f
        L_0x0159:
            boolean r4 = r9.m15515c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = com.google.android.gms.internal.ads.adc.m15815b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.adc.m15815b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01a3
            goto L_0x01a2
        L_0x016c:
            boolean r4 = r9.m15515c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = com.google.android.gms.internal.ads.adc.m15815b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.adc.m15815b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01a3
            goto L_0x018f
        L_0x017f:
            boolean r4 = r9.m15515c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = com.google.android.gms.internal.ads.adc.m15802a(r10, r6)
            int r5 = com.google.android.gms.internal.ads.adc.m15802a(r11, r6)
            if (r4 == r5) goto L_0x01a3
        L_0x018f:
            goto L_0x01a2
        L_0x0190:
            boolean r4 = r9.m15515c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = com.google.android.gms.internal.ads.adc.m15815b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.adc.m15815b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01a3
        L_0x01a2:
            r3 = 0
        L_0x01a3:
            if (r3 != 0) goto L_0x01a6
            return r1
        L_0x01a6:
            int r2 = r2 + 4
            goto L_0x0005
        L_0x01aa:
            com.google.android.gms.internal.ads.acw<?, ?> r0 = r9.f11412q
            java.lang.Object r0 = r0.mo11690b(r10)
            com.google.android.gms.internal.ads.acw<?, ?> r2 = r9.f11412q
            java.lang.Object r2 = r2.mo11690b(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01bd
            return r1
        L_0x01bd:
            boolean r0 = r9.f11403h
            if (r0 == 0) goto L_0x01d2
            com.google.android.gms.internal.ads.zz<?> r0 = r9.f11413r
            com.google.android.gms.internal.ads.aac r10 = r0.mo11431a(r10)
            com.google.android.gms.internal.ads.zz<?> r0 = r9.f11413r
            com.google.android.gms.internal.ads.aac r11 = r0.mo11431a(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01d2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.abp.mo11560a(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d8, code lost:
        if (r0.f11406k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01e9, code lost:
        if (r0.f11406k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01fa, code lost:
        if (r0.f11406k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x020b, code lost:
        if (r0.f11406k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x020d, code lost:
        r2.putInt(r1, (long) r14, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0211, code lost:
        r3 = (com.google.android.gms.internal.ads.zzbav.m20663e(r3) + com.google.android.gms.internal.ads.zzbav.m20670g(r5)) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0296, code lost:
        r13 = r13 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x029f, code lost:
        r3 = com.google.android.gms.internal.ads.zzbav.m20656c(r3, (com.google.android.gms.internal.ads.abl) com.google.android.gms.internal.ads.adc.m15832f(r1, r5), m15494a(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02b8, code lost:
        r3 = com.google.android.gms.internal.ads.zzbav.m20668f(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02c7, code lost:
        r3 = com.google.android.gms.internal.ads.zzbav.m20675h(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02d2, code lost:
        r3 = com.google.android.gms.internal.ads.zzbav.m20676h(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02dd, code lost:
        r3 = com.google.android.gms.internal.ads.zzbav.m20682j(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02ec, code lost:
        r3 = com.google.android.gms.internal.ads.zzbav.m20684k(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02fb, code lost:
        r3 = com.google.android.gms.internal.ads.zzbav.m20671g(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0306, code lost:
        r5 = com.google.android.gms.internal.ads.adc.m15832f(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x030a, code lost:
        r3 = com.google.android.gms.internal.ads.zzbav.m20657c(r3, (com.google.android.gms.internal.ads.zzbah) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0317, code lost:
        r3 = com.google.android.gms.internal.ads.acg.m15655a(r3, com.google.android.gms.internal.ads.adc.m15832f(r1, r5), m15494a(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0331, code lost:
        if ((r5 instanceof com.google.android.gms.internal.ads.zzbah) != false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0334, code lost:
        r3 = com.google.android.gms.internal.ads.zzbav.m20649b(r3, (java.lang.String) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0342, code lost:
        r3 = com.google.android.gms.internal.ads.zzbav.m20650b(r3, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x034e, code lost:
        r3 = com.google.android.gms.internal.ads.zzbav.m20679i(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x035a, code lost:
        r3 = com.google.android.gms.internal.ads.zzbav.m20672g(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x036a, code lost:
        r3 = com.google.android.gms.internal.ads.zzbav.m20667f(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x037a, code lost:
        r3 = com.google.android.gms.internal.ads.zzbav.m20664e(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x038a, code lost:
        r3 = com.google.android.gms.internal.ads.zzbav.m20660d(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0396, code lost:
        r3 = com.google.android.gms.internal.ads.zzbav.m20645b(r3, 0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03a2, code lost:
        r3 = com.google.android.gms.internal.ads.zzbav.m20644b(r3, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03aa, code lost:
        r12 = r12 + 4;
        r3 = 267386880;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0418, code lost:
        if (m15504a(r1, r14, r3) != false) goto L_0x06ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0438, code lost:
        if (m15504a(r1, r14, r3) != false) goto L_0x06e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0440, code lost:
        if (m15504a(r1, r14, r3) != false) goto L_0x06f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0460, code lost:
        if (m15504a(r1, r14, r3) != false) goto L_0x0717;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0468, code lost:
        if (m15504a(r1, r14, r3) != false) goto L_0x0726;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0478, code lost:
        if ((r4 instanceof com.google.android.gms.internal.ads.zzbah) != false) goto L_0x071b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0480, code lost:
        if (m15504a(r1, r14, r3) != false) goto L_0x074d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0518, code lost:
        if (r0.f11406k != false) goto L_0x05fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x052a, code lost:
        if (r0.f11406k != false) goto L_0x05fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x053c, code lost:
        if (r0.f11406k != false) goto L_0x05fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x054e, code lost:
        if (r0.f11406k != false) goto L_0x05fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0560, code lost:
        if (r0.f11406k != false) goto L_0x05fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0572, code lost:
        if (r0.f11406k != false) goto L_0x05fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0584, code lost:
        if (r0.f11406k != false) goto L_0x05fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0596, code lost:
        if (r0.f11406k != false) goto L_0x05fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x05a7, code lost:
        if (r0.f11406k != false) goto L_0x05fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x05b8, code lost:
        if (r0.f11406k != false) goto L_0x05fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x05c9, code lost:
        if (r0.f11406k != false) goto L_0x05fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x05da, code lost:
        if (r0.f11406k != false) goto L_0x05fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x05eb, code lost:
        if (r0.f11406k != false) goto L_0x05fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x05fc, code lost:
        if (r0.f11406k != false) goto L_0x05fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x05fe, code lost:
        r2.putInt(r1, (long) r4, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0602, code lost:
        r4 = (com.google.android.gms.internal.ads.zzbav.m20663e(r14) + com.google.android.gms.internal.ads.zzbav.m20670g(r9)) + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x06ad, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x06af, code lost:
        r18 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x06b8, code lost:
        if ((r12 & r16) != 0) goto L_0x06ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x06ba, code lost:
        r4 = com.google.android.gms.internal.ads.zzbav.m20656c(r14, (com.google.android.gms.internal.ads.abl) r2.getObject(r1, r9), m15494a(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x06d1, code lost:
        r4 = com.google.android.gms.internal.ads.zzbav.m20668f(r14, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x06de, code lost:
        r4 = com.google.android.gms.internal.ads.zzbav.m20675h(r14, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x06e5, code lost:
        if ((r12 & r16) != 0) goto L_0x06e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x06e7, code lost:
        r4 = com.google.android.gms.internal.ads.zzbav.m20676h(r14, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x06f0, code lost:
        if ((r12 & r16) != 0) goto L_0x06f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x06f2, code lost:
        r9 = com.google.android.gms.internal.ads.zzbav.m20682j(r14, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x06f7, code lost:
        r5 = r5 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0701, code lost:
        r4 = com.google.android.gms.internal.ads.zzbav.m20684k(r14, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x070e, code lost:
        r4 = com.google.android.gms.internal.ads.zzbav.m20671g(r14, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0715, code lost:
        if ((r12 & r16) != 0) goto L_0x0717;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0717, code lost:
        r4 = r2.getObject(r1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x071b, code lost:
        r4 = com.google.android.gms.internal.ads.zzbav.m20657c(r14, (com.google.android.gms.internal.ads.zzbah) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0724, code lost:
        if ((r12 & r16) != 0) goto L_0x0726;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0726, code lost:
        r4 = com.google.android.gms.internal.ads.acg.m15655a(r14, r2.getObject(r1, r9), m15494a(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x073e, code lost:
        if ((r4 instanceof com.google.android.gms.internal.ads.zzbah) != false) goto L_0x071b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0741, code lost:
        r4 = com.google.android.gms.internal.ads.zzbav.m20649b(r14, (java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ab, code lost:
        if ((r5 instanceof com.google.android.gms.internal.ads.zzbah) != false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x074b, code lost:
        if ((r12 & r16) != 0) goto L_0x074d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x074d, code lost:
        r4 = com.google.android.gms.internal.ads.zzbav.m20650b(r14, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x079d, code lost:
        r5 = r5 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x07bf, code lost:
        r3 = r3 + 4;
        r9 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0127, code lost:
        if (r0.f11406k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0139, code lost:
        if (r0.f11406k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014b, code lost:
        if (r0.f11406k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x015d, code lost:
        if (r0.f11406k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x016f, code lost:
        if (r0.f11406k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0181, code lost:
        if (r0.f11406k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0193, code lost:
        if (r0.f11406k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a5, code lost:
        if (r0.f11406k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b6, code lost:
        if (r0.f11406k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c7, code lost:
        if (r0.f11406k != false) goto L_0x020d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo11561b(T r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            boolean r2 = r0.f11405j
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x03b8
            sun.misc.Unsafe r2 = f11396a
            r12 = 0
            r13 = 0
        L_0x0016:
            int[] r14 = r0.f11397b
            int r14 = r14.length
            if (r12 >= r14) goto L_0x03b0
            int r14 = r0.m15516d(r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.f11397b
            r3 = r3[r12]
            r14 = r14 & r8
            long r5 = (long) r14
            com.google.android.gms.internal.ads.zzbbj r14 = com.google.android.gms.internal.ads.zzbbj.DOUBLE_LIST_PACKED
            int r14 = r14.mo13957id()
            if (r15 < r14) goto L_0x0041
            com.google.android.gms.internal.ads.zzbbj r14 = com.google.android.gms.internal.ads.zzbbj.SINT64_LIST_PACKED
            int r14 = r14.mo13957id()
            if (r15 > r14) goto L_0x0041
            int[] r14 = r0.f11397b
            int r17 = r12 + 2
            r14 = r14[r17]
            r14 = r14 & r8
            goto L_0x0042
        L_0x0041:
            r14 = 0
        L_0x0042:
            switch(r15) {
                case 0: goto L_0x039c;
                case 1: goto L_0x0390;
                case 2: goto L_0x0380;
                case 3: goto L_0x0370;
                case 4: goto L_0x0360;
                case 5: goto L_0x0354;
                case 6: goto L_0x0348;
                case 7: goto L_0x033c;
                case 8: goto L_0x0325;
                case 9: goto L_0x0311;
                case 10: goto L_0x0300;
                case 11: goto L_0x02f1;
                case 12: goto L_0x02e2;
                case 13: goto L_0x02d7;
                case 14: goto L_0x02cc;
                case 15: goto L_0x02bd;
                case 16: goto L_0x02ae;
                case 17: goto L_0x0299;
                case 18: goto L_0x028e;
                case 19: goto L_0x0285;
                case 20: goto L_0x027c;
                case 21: goto L_0x0273;
                case 22: goto L_0x026a;
                case 23: goto L_0x028e;
                case 24: goto L_0x0285;
                case 25: goto L_0x0261;
                case 26: goto L_0x0258;
                case 27: goto L_0x024b;
                case 28: goto L_0x0242;
                case 29: goto L_0x0239;
                case 30: goto L_0x0230;
                case 31: goto L_0x0285;
                case 32: goto L_0x028e;
                case 33: goto L_0x0227;
                case 34: goto L_0x021d;
                case 35: goto L_0x01fd;
                case 36: goto L_0x01ec;
                case 37: goto L_0x01db;
                case 38: goto L_0x01ca;
                case 39: goto L_0x01b9;
                case 40: goto L_0x01a8;
                case 41: goto L_0x0197;
                case 42: goto L_0x0185;
                case 43: goto L_0x0173;
                case 44: goto L_0x0161;
                case 45: goto L_0x014f;
                case 46: goto L_0x013d;
                case 47: goto L_0x012b;
                case 48: goto L_0x0119;
                case 49: goto L_0x010b;
                case 50: goto L_0x00fb;
                case 51: goto L_0x00f3;
                case 52: goto L_0x00eb;
                case 53: goto L_0x00df;
                case 54: goto L_0x00d3;
                case 55: goto L_0x00c7;
                case 56: goto L_0x00bf;
                case 57: goto L_0x00b7;
                case 58: goto L_0x00af;
                case 59: goto L_0x009f;
                case 60: goto L_0x0097;
                case 61: goto L_0x008f;
                case 62: goto L_0x0083;
                case 63: goto L_0x0077;
                case 64: goto L_0x006f;
                case 65: goto L_0x0067;
                case 66: goto L_0x005b;
                case 67: goto L_0x004f;
                case 68: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x03aa
        L_0x0047:
            boolean r14 = r0.m15504a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            goto L_0x029f
        L_0x004f:
            boolean r14 = r0.m15504a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = m15519e(r1, r5)
            goto L_0x02b8
        L_0x005b:
            boolean r14 = r0.m15504a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = m15517d(r1, r5)
            goto L_0x02c7
        L_0x0067:
            boolean r5 = r0.m15504a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x02d2
        L_0x006f:
            boolean r5 = r0.m15504a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x02dd
        L_0x0077:
            boolean r14 = r0.m15504a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = m15517d(r1, r5)
            goto L_0x02ec
        L_0x0083:
            boolean r14 = r0.m15504a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = m15517d(r1, r5)
            goto L_0x02fb
        L_0x008f:
            boolean r14 = r0.m15504a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            goto L_0x0306
        L_0x0097:
            boolean r14 = r0.m15504a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            goto L_0x0317
        L_0x009f:
            boolean r14 = r0.m15504a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            java.lang.Object r5 = com.google.android.gms.internal.ads.adc.m15832f(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.ads.zzbah
            if (r6 == 0) goto L_0x0334
            goto L_0x0333
        L_0x00af:
            boolean r5 = r0.m15504a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x0342
        L_0x00b7:
            boolean r5 = r0.m15504a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x034e
        L_0x00bf:
            boolean r5 = r0.m15504a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x035a
        L_0x00c7:
            boolean r14 = r0.m15504a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = m15517d(r1, r5)
            goto L_0x036a
        L_0x00d3:
            boolean r14 = r0.m15504a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = m15519e(r1, r5)
            goto L_0x037a
        L_0x00df:
            boolean r14 = r0.m15504a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = m15519e(r1, r5)
            goto L_0x038a
        L_0x00eb:
            boolean r5 = r0.m15504a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x0396
        L_0x00f3:
            boolean r5 = r0.m15504a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x03a2
        L_0x00fb:
            com.google.android.gms.internal.ads.abg r14 = r0.f11414s
            java.lang.Object r5 = com.google.android.gms.internal.ads.adc.m15832f(r1, r5)
            java.lang.Object r6 = r0.m15508b(r12)
            int r3 = r14.mo11541a(r3, r5, r6)
            goto L_0x0296
        L_0x010b:
            java.util.List r5 = m15497a(r1, r5)
            com.google.android.gms.internal.ads.ace r6 = r0.m15494a(r12)
            int r3 = com.google.android.gms.internal.ads.acg.m15674b(r3, r5, r6)
            goto L_0x0296
        L_0x0119:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.acg.m15682c(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f11406k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x012b:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.acg.m15697g(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f11406k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x013d:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.acg.m15703i(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f11406k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x014f:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.acg.m15700h(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f11406k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0161:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.acg.m15686d(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f11406k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0173:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.acg.m15694f(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f11406k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0185:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.acg.m15706j(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f11406k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0197:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.acg.m15700h(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f11406k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01a8:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.acg.m15703i(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f11406k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01b9:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.acg.m15690e(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f11406k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01ca:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.acg.m15676b(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f11406k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01db:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.acg.m15659a(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f11406k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01ec:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.acg.m15700h(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f11406k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01fd:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.acg.m15703i(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f11406k
            if (r6 == 0) goto L_0x0211
        L_0x020d:
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0211:
            int r3 = com.google.android.gms.internal.ads.zzbav.m20663e(r3)
            int r6 = com.google.android.gms.internal.ads.zzbav.m20670g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            goto L_0x0296
        L_0x021d:
            java.util.List r5 = m15497a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.acg.m15681c(r3, r5, r11)
            goto L_0x0296
        L_0x0227:
            java.util.List r5 = m15497a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.acg.m15696g(r3, r5, r11)
            goto L_0x0296
        L_0x0230:
            java.util.List r5 = m15497a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.acg.m15685d(r3, r5, r11)
            goto L_0x0296
        L_0x0239:
            java.util.List r5 = m15497a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.acg.m15693f(r3, r5, r11)
            goto L_0x0296
        L_0x0242:
            java.util.List r5 = m15497a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.acg.m15673b(r3, r5)
            goto L_0x0296
        L_0x024b:
            java.util.List r5 = m15497a(r1, r5)
            com.google.android.gms.internal.ads.ace r6 = r0.m15494a(r12)
            int r3 = com.google.android.gms.internal.ads.acg.m15657a(r3, r5, r6)
            goto L_0x0296
        L_0x0258:
            java.util.List r5 = m15497a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.acg.m15656a(r3, r5)
            goto L_0x0296
        L_0x0261:
            java.util.List r5 = m15497a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.acg.m15705j(r3, r5, r11)
            goto L_0x0296
        L_0x026a:
            java.util.List r5 = m15497a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.acg.m15689e(r3, r5, r11)
            goto L_0x0296
        L_0x0273:
            java.util.List r5 = m15497a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.acg.m15675b(r3, r5, r11)
            goto L_0x0296
        L_0x027c:
            java.util.List r5 = m15497a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.acg.m15658a(r3, r5, r11)
            goto L_0x0296
        L_0x0285:
            java.util.List r5 = m15497a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.acg.m15699h(r3, r5, r11)
            goto L_0x0296
        L_0x028e:
            java.util.List r5 = m15497a(r1, r5)
            int r3 = com.google.android.gms.internal.ads.acg.m15702i(r3, r5, r11)
        L_0x0296:
            int r13 = r13 + r3
            goto L_0x03aa
        L_0x0299:
            boolean r14 = r0.m15503a((T) r1, r12)
            if (r14 == 0) goto L_0x03aa
        L_0x029f:
            java.lang.Object r5 = com.google.android.gms.internal.ads.adc.m15832f(r1, r5)
            com.google.android.gms.internal.ads.abl r5 = (com.google.android.gms.internal.ads.abl) r5
            com.google.android.gms.internal.ads.ace r6 = r0.m15494a(r12)
            int r3 = com.google.android.gms.internal.ads.zzbav.m20656c(r3, r5, r6)
            goto L_0x0296
        L_0x02ae:
            boolean r14 = r0.m15503a((T) r1, r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = com.google.android.gms.internal.ads.adc.m15815b(r1, r5)
        L_0x02b8:
            int r3 = com.google.android.gms.internal.ads.zzbav.m20668f(r3, r5)
            goto L_0x0296
        L_0x02bd:
            boolean r14 = r0.m15503a((T) r1, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = com.google.android.gms.internal.ads.adc.m15802a(r1, r5)
        L_0x02c7:
            int r3 = com.google.android.gms.internal.ads.zzbav.m20675h(r3, r5)
            goto L_0x0296
        L_0x02cc:
            boolean r5 = r0.m15503a((T) r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x02d2:
            int r3 = com.google.android.gms.internal.ads.zzbav.m20676h(r3, r9)
            goto L_0x0296
        L_0x02d7:
            boolean r5 = r0.m15503a((T) r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x02dd:
            int r3 = com.google.android.gms.internal.ads.zzbav.m20682j(r3, r11)
            goto L_0x0296
        L_0x02e2:
            boolean r14 = r0.m15503a((T) r1, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = com.google.android.gms.internal.ads.adc.m15802a(r1, r5)
        L_0x02ec:
            int r3 = com.google.android.gms.internal.ads.zzbav.m20684k(r3, r5)
            goto L_0x0296
        L_0x02f1:
            boolean r14 = r0.m15503a((T) r1, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = com.google.android.gms.internal.ads.adc.m15802a(r1, r5)
        L_0x02fb:
            int r3 = com.google.android.gms.internal.ads.zzbav.m20671g(r3, r5)
            goto L_0x0296
        L_0x0300:
            boolean r14 = r0.m15503a((T) r1, r12)
            if (r14 == 0) goto L_0x03aa
        L_0x0306:
            java.lang.Object r5 = com.google.android.gms.internal.ads.adc.m15832f(r1, r5)
        L_0x030a:
            com.google.android.gms.internal.ads.zzbah r5 = (com.google.android.gms.internal.ads.zzbah) r5
            int r3 = com.google.android.gms.internal.ads.zzbav.m20657c(r3, r5)
            goto L_0x0296
        L_0x0311:
            boolean r14 = r0.m15503a((T) r1, r12)
            if (r14 == 0) goto L_0x03aa
        L_0x0317:
            java.lang.Object r5 = com.google.android.gms.internal.ads.adc.m15832f(r1, r5)
            com.google.android.gms.internal.ads.ace r6 = r0.m15494a(r12)
            int r3 = com.google.android.gms.internal.ads.acg.m15655a(r3, r5, r6)
            goto L_0x0296
        L_0x0325:
            boolean r14 = r0.m15503a((T) r1, r12)
            if (r14 == 0) goto L_0x03aa
            java.lang.Object r5 = com.google.android.gms.internal.ads.adc.m15832f(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.ads.zzbah
            if (r6 == 0) goto L_0x0334
        L_0x0333:
            goto L_0x030a
        L_0x0334:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.ads.zzbav.m20649b(r3, r5)
            goto L_0x0296
        L_0x033c:
            boolean r5 = r0.m15503a((T) r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x0342:
            int r3 = com.google.android.gms.internal.ads.zzbav.m20650b(r3, r7)
            goto L_0x0296
        L_0x0348:
            boolean r5 = r0.m15503a((T) r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x034e:
            int r3 = com.google.android.gms.internal.ads.zzbav.m20679i(r3, r11)
            goto L_0x0296
        L_0x0354:
            boolean r5 = r0.m15503a((T) r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x035a:
            int r3 = com.google.android.gms.internal.ads.zzbav.m20672g(r3, r9)
            goto L_0x0296
        L_0x0360:
            boolean r14 = r0.m15503a((T) r1, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = com.google.android.gms.internal.ads.adc.m15802a(r1, r5)
        L_0x036a:
            int r3 = com.google.android.gms.internal.ads.zzbav.m20667f(r3, r5)
            goto L_0x0296
        L_0x0370:
            boolean r14 = r0.m15503a((T) r1, r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = com.google.android.gms.internal.ads.adc.m15815b(r1, r5)
        L_0x037a:
            int r3 = com.google.android.gms.internal.ads.zzbav.m20664e(r3, r5)
            goto L_0x0296
        L_0x0380:
            boolean r14 = r0.m15503a((T) r1, r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = com.google.android.gms.internal.ads.adc.m15815b(r1, r5)
        L_0x038a:
            int r3 = com.google.android.gms.internal.ads.zzbav.m20660d(r3, r5)
            goto L_0x0296
        L_0x0390:
            boolean r5 = r0.m15503a((T) r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x0396:
            int r3 = com.google.android.gms.internal.ads.zzbav.m20645b(r3, r4)
            goto L_0x0296
        L_0x039c:
            boolean r5 = r0.m15503a((T) r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x03a2:
            r5 = 0
            int r3 = com.google.android.gms.internal.ads.zzbav.m20644b(r3, r5)
            goto L_0x0296
        L_0x03aa:
            int r12 = r12 + 4
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x03b0:
            com.google.android.gms.internal.ads.acw<?, ?> r2 = r0.f11412q
            int r1 = m15487a(r2, (T) r1)
            int r13 = r13 + r1
            return r13
        L_0x03b8:
            sun.misc.Unsafe r2 = f11396a
            r3 = -1
            r3 = 0
            r5 = 0
            r6 = -1
            r12 = 0
        L_0x03bf:
            int[] r13 = r0.f11397b
            int r13 = r13.length
            if (r3 >= r13) goto L_0x07c7
            int r13 = r0.m15516d(r3)
            int[] r14 = r0.f11397b
            r14 = r14[r3]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r16 = r13 & r15
            int r15 = r16 >>> 20
            r4 = 17
            if (r15 > r4) goto L_0x03eb
            int[] r4 = r0.f11397b
            int r16 = r3 + 2
            r4 = r4[r16]
            r11 = r4 & r8
            int r16 = r4 >>> 20
            int r16 = r7 << r16
            if (r11 == r6) goto L_0x040c
            long r9 = (long) r11
            int r12 = r2.getInt(r1, r9)
            r6 = r11
            goto L_0x040c
        L_0x03eb:
            boolean r4 = r0.f11406k
            if (r4 == 0) goto L_0x0409
            com.google.android.gms.internal.ads.zzbbj r4 = com.google.android.gms.internal.ads.zzbbj.DOUBLE_LIST_PACKED
            int r4 = r4.mo13957id()
            if (r15 < r4) goto L_0x0409
            com.google.android.gms.internal.ads.zzbbj r4 = com.google.android.gms.internal.ads.zzbbj.SINT64_LIST_PACKED
            int r4 = r4.mo13957id()
            if (r15 > r4) goto L_0x0409
            int[] r4 = r0.f11397b
            int r9 = r3 + 2
            r4 = r4[r9]
            r11 = r4 & r8
            r4 = r11
            goto L_0x040a
        L_0x0409:
            r4 = 0
        L_0x040a:
            r16 = 0
        L_0x040c:
            r9 = r13 & r8
            long r9 = (long) r9
            switch(r15) {
                case 0: goto L_0x07b0;
                case 1: goto L_0x07a0;
                case 2: goto L_0x078e;
                case 3: goto L_0x077e;
                case 4: goto L_0x076e;
                case 5: goto L_0x075f;
                case 6: goto L_0x0753;
                case 7: goto L_0x0749;
                case 8: goto L_0x0734;
                case 9: goto L_0x0722;
                case 10: goto L_0x0713;
                case 11: goto L_0x0706;
                case 12: goto L_0x06f9;
                case 13: goto L_0x06ee;
                case 14: goto L_0x06e3;
                case 15: goto L_0x06d6;
                case 16: goto L_0x06c9;
                case 17: goto L_0x06b6;
                case 18: goto L_0x06a2;
                case 19: goto L_0x0696;
                case 20: goto L_0x068a;
                case 21: goto L_0x067e;
                case 22: goto L_0x0672;
                case 23: goto L_0x06a2;
                case 24: goto L_0x0696;
                case 25: goto L_0x0666;
                case 26: goto L_0x065b;
                case 27: goto L_0x064c;
                case 28: goto L_0x0641;
                case 29: goto L_0x0635;
                case 30: goto L_0x0628;
                case 31: goto L_0x0696;
                case 32: goto L_0x06a2;
                case 33: goto L_0x061b;
                case 34: goto L_0x060e;
                case 35: goto L_0x05ee;
                case 36: goto L_0x05dd;
                case 37: goto L_0x05cc;
                case 38: goto L_0x05bb;
                case 39: goto L_0x05aa;
                case 40: goto L_0x0599;
                case 41: goto L_0x0588;
                case 42: goto L_0x0576;
                case 43: goto L_0x0564;
                case 44: goto L_0x0552;
                case 45: goto L_0x0540;
                case 46: goto L_0x052e;
                case 47: goto L_0x051c;
                case 48: goto L_0x050a;
                case 49: goto L_0x04fa;
                case 50: goto L_0x04ea;
                case 51: goto L_0x04dc;
                case 52: goto L_0x04cf;
                case 53: goto L_0x04bf;
                case 54: goto L_0x04af;
                case 55: goto L_0x049f;
                case 56: goto L_0x0491;
                case 57: goto L_0x0484;
                case 58: goto L_0x047c;
                case 59: goto L_0x046c;
                case 60: goto L_0x0464;
                case 61: goto L_0x045c;
                case 62: goto L_0x0450;
                case 63: goto L_0x0444;
                case 64: goto L_0x043c;
                case 65: goto L_0x0434;
                case 66: goto L_0x0428;
                case 67: goto L_0x041c;
                case 68: goto L_0x0414;
                default: goto L_0x0412;
            }
        L_0x0412:
            goto L_0x06ae
        L_0x0414:
            boolean r4 = r0.m15504a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x06ae
            goto L_0x06ba
        L_0x041c:
            boolean r4 = r0.m15504a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x06ae
            long r9 = m15519e(r1, r9)
            goto L_0x06d1
        L_0x0428:
            boolean r4 = r0.m15504a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x06ae
            int r4 = m15517d(r1, r9)
            goto L_0x06de
        L_0x0434:
            boolean r4 = r0.m15504a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x06ae
            goto L_0x06e7
        L_0x043c:
            boolean r4 = r0.m15504a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x06ae
            goto L_0x06f2
        L_0x0444:
            boolean r4 = r0.m15504a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x06ae
            int r4 = m15517d(r1, r9)
            goto L_0x0701
        L_0x0450:
            boolean r4 = r0.m15504a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x06ae
            int r4 = m15517d(r1, r9)
            goto L_0x070e
        L_0x045c:
            boolean r4 = r0.m15504a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x06ae
            goto L_0x0717
        L_0x0464:
            boolean r4 = r0.m15504a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x06ae
            goto L_0x0726
        L_0x046c:
            boolean r4 = r0.m15504a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x06ae
            java.lang.Object r4 = r2.getObject(r1, r9)
            boolean r9 = r4 instanceof com.google.android.gms.internal.ads.zzbah
            if (r9 == 0) goto L_0x0741
            goto L_0x0740
        L_0x047c:
            boolean r4 = r0.m15504a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x06ae
            goto L_0x074d
        L_0x0484:
            boolean r4 = r0.m15504a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x06ae
            r4 = 0
            int r9 = com.google.android.gms.internal.ads.zzbav.m20679i(r14, r4)
            goto L_0x06f7
        L_0x0491:
            boolean r4 = r0.m15504a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x06ae
            r9 = 0
            int r4 = com.google.android.gms.internal.ads.zzbav.m20672g(r14, r9)
            goto L_0x06ad
        L_0x049f:
            boolean r4 = r0.m15504a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x06ae
            int r4 = m15517d(r1, r9)
            int r4 = com.google.android.gms.internal.ads.zzbav.m20667f(r14, r4)
            goto L_0x06ad
        L_0x04af:
            boolean r4 = r0.m15504a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x06ae
            long r9 = m15519e(r1, r9)
            int r4 = com.google.android.gms.internal.ads.zzbav.m20664e(r14, r9)
            goto L_0x06ad
        L_0x04bf:
            boolean r4 = r0.m15504a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x06ae
            long r9 = m15519e(r1, r9)
            int r4 = com.google.android.gms.internal.ads.zzbav.m20660d(r14, r9)
            goto L_0x06ad
        L_0x04cf:
            boolean r4 = r0.m15504a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x06ae
            r4 = 0
            int r9 = com.google.android.gms.internal.ads.zzbav.m20645b(r14, r4)
            goto L_0x06f7
        L_0x04dc:
            boolean r4 = r0.m15504a((T) r1, r14, r3)
            if (r4 == 0) goto L_0x06ae
            r9 = 0
            int r4 = com.google.android.gms.internal.ads.zzbav.m20644b(r14, r9)
            goto L_0x06ad
        L_0x04ea:
            com.google.android.gms.internal.ads.abg r4 = r0.f11414s
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.lang.Object r10 = r0.m15508b(r3)
            int r4 = r4.mo11541a(r14, r9, r10)
            goto L_0x06ad
        L_0x04fa:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.ace r9 = r0.m15494a(r3)
            int r4 = com.google.android.gms.internal.ads.acg.m15674b(r14, r4, r9)
            goto L_0x06ad
        L_0x050a:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.acg.m15682c(r9)
            if (r9 <= 0) goto L_0x06ae
            boolean r10 = r0.f11406k
            if (r10 == 0) goto L_0x0602
            goto L_0x05fe
        L_0x051c:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.acg.m15697g(r9)
            if (r9 <= 0) goto L_0x06ae
            boolean r10 = r0.f11406k
            if (r10 == 0) goto L_0x0602
            goto L_0x05fe
        L_0x052e:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.acg.m15703i(r9)
            if (r9 <= 0) goto L_0x06ae
            boolean r10 = r0.f11406k
            if (r10 == 0) goto L_0x0602
            goto L_0x05fe
        L_0x0540:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.acg.m15700h(r9)
            if (r9 <= 0) goto L_0x06ae
            boolean r10 = r0.f11406k
            if (r10 == 0) goto L_0x0602
            goto L_0x05fe
        L_0x0552:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.acg.m15686d(r9)
            if (r9 <= 0) goto L_0x06ae
            boolean r10 = r0.f11406k
            if (r10 == 0) goto L_0x0602
            goto L_0x05fe
        L_0x0564:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.acg.m15694f(r9)
            if (r9 <= 0) goto L_0x06ae
            boolean r10 = r0.f11406k
            if (r10 == 0) goto L_0x0602
            goto L_0x05fe
        L_0x0576:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.acg.m15706j(r9)
            if (r9 <= 0) goto L_0x06ae
            boolean r10 = r0.f11406k
            if (r10 == 0) goto L_0x0602
            goto L_0x05fe
        L_0x0588:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.acg.m15700h(r9)
            if (r9 <= 0) goto L_0x06ae
            boolean r10 = r0.f11406k
            if (r10 == 0) goto L_0x0602
            goto L_0x05fe
        L_0x0599:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.acg.m15703i(r9)
            if (r9 <= 0) goto L_0x06ae
            boolean r10 = r0.f11406k
            if (r10 == 0) goto L_0x0602
            goto L_0x05fe
        L_0x05aa:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.acg.m15690e(r9)
            if (r9 <= 0) goto L_0x06ae
            boolean r10 = r0.f11406k
            if (r10 == 0) goto L_0x0602
            goto L_0x05fe
        L_0x05bb:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.acg.m15676b(r9)
            if (r9 <= 0) goto L_0x06ae
            boolean r10 = r0.f11406k
            if (r10 == 0) goto L_0x0602
            goto L_0x05fe
        L_0x05cc:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.acg.m15659a(r9)
            if (r9 <= 0) goto L_0x06ae
            boolean r10 = r0.f11406k
            if (r10 == 0) goto L_0x0602
            goto L_0x05fe
        L_0x05dd:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.acg.m15700h(r9)
            if (r9 <= 0) goto L_0x06ae
            boolean r10 = r0.f11406k
            if (r10 == 0) goto L_0x0602
            goto L_0x05fe
        L_0x05ee:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.acg.m15703i(r9)
            if (r9 <= 0) goto L_0x06ae
            boolean r10 = r0.f11406k
            if (r10 == 0) goto L_0x0602
        L_0x05fe:
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x0602:
            int r4 = com.google.android.gms.internal.ads.zzbav.m20663e(r14)
            int r10 = com.google.android.gms.internal.ads.zzbav.m20670g(r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            goto L_0x06ad
        L_0x060e:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            r11 = 0
            int r4 = com.google.android.gms.internal.ads.acg.m15681c(r14, r4, r11)
            goto L_0x06ad
        L_0x061b:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.acg.m15696g(r14, r4, r11)
            goto L_0x06ad
        L_0x0628:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.acg.m15685d(r14, r4, r11)
            goto L_0x06ad
        L_0x0635:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.acg.m15693f(r14, r4, r11)
            goto L_0x06ad
        L_0x0641:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.acg.m15673b(r14, r4)
            goto L_0x06ad
        L_0x064c:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.ace r9 = r0.m15494a(r3)
            int r4 = com.google.android.gms.internal.ads.acg.m15657a(r14, r4, r9)
            goto L_0x06ad
        L_0x065b:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.acg.m15656a(r14, r4)
            goto L_0x06ad
        L_0x0666:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            r11 = 0
            int r4 = com.google.android.gms.internal.ads.acg.m15705j(r14, r4, r11)
            goto L_0x06ad
        L_0x0672:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.acg.m15689e(r14, r4, r11)
            goto L_0x06ad
        L_0x067e:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.acg.m15675b(r14, r4, r11)
            goto L_0x06ad
        L_0x068a:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.acg.m15658a(r14, r4, r11)
            goto L_0x06ad
        L_0x0696:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.acg.m15699h(r14, r4, r11)
            goto L_0x06ad
        L_0x06a2:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.acg.m15702i(r14, r4, r11)
        L_0x06ad:
            int r5 = r5 + r4
        L_0x06ae:
            r4 = 0
        L_0x06af:
            r9 = 0
            r10 = 0
            r18 = 0
            goto L_0x07bf
        L_0x06b6:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x06ae
        L_0x06ba:
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.ads.abl r4 = (com.google.android.gms.internal.ads.abl) r4
            com.google.android.gms.internal.ads.ace r9 = r0.m15494a(r3)
            int r4 = com.google.android.gms.internal.ads.zzbav.m20656c(r14, r4, r9)
            goto L_0x06ad
        L_0x06c9:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x06ae
            long r9 = r2.getLong(r1, r9)
        L_0x06d1:
            int r4 = com.google.android.gms.internal.ads.zzbav.m20668f(r14, r9)
            goto L_0x06ad
        L_0x06d6:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x06ae
            int r4 = r2.getInt(r1, r9)
        L_0x06de:
            int r4 = com.google.android.gms.internal.ads.zzbav.m20675h(r14, r4)
            goto L_0x06ad
        L_0x06e3:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x06ae
        L_0x06e7:
            r9 = 0
            int r4 = com.google.android.gms.internal.ads.zzbav.m20676h(r14, r9)
            goto L_0x06ad
        L_0x06ee:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x06ae
        L_0x06f2:
            r4 = 0
            int r9 = com.google.android.gms.internal.ads.zzbav.m20682j(r14, r4)
        L_0x06f7:
            int r5 = r5 + r9
            goto L_0x06ae
        L_0x06f9:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x06ae
            int r4 = r2.getInt(r1, r9)
        L_0x0701:
            int r4 = com.google.android.gms.internal.ads.zzbav.m20684k(r14, r4)
            goto L_0x06ad
        L_0x0706:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x06ae
            int r4 = r2.getInt(r1, r9)
        L_0x070e:
            int r4 = com.google.android.gms.internal.ads.zzbav.m20671g(r14, r4)
            goto L_0x06ad
        L_0x0713:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x06ae
        L_0x0717:
            java.lang.Object r4 = r2.getObject(r1, r9)
        L_0x071b:
            com.google.android.gms.internal.ads.zzbah r4 = (com.google.android.gms.internal.ads.zzbah) r4
            int r4 = com.google.android.gms.internal.ads.zzbav.m20657c(r14, r4)
            goto L_0x06ad
        L_0x0722:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x06ae
        L_0x0726:
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.ads.ace r9 = r0.m15494a(r3)
            int r4 = com.google.android.gms.internal.ads.acg.m15655a(r14, r4, r9)
            goto L_0x06ad
        L_0x0734:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x06ae
            java.lang.Object r4 = r2.getObject(r1, r9)
            boolean r9 = r4 instanceof com.google.android.gms.internal.ads.zzbah
            if (r9 == 0) goto L_0x0741
        L_0x0740:
            goto L_0x071b
        L_0x0741:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.ads.zzbav.m20649b(r14, r4)
            goto L_0x06ad
        L_0x0749:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x06ae
        L_0x074d:
            int r4 = com.google.android.gms.internal.ads.zzbav.m20650b(r14, r7)
            goto L_0x06ad
        L_0x0753:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x06ae
            r4 = 0
            int r9 = com.google.android.gms.internal.ads.zzbav.m20679i(r14, r4)
            int r5 = r5 + r9
            goto L_0x06af
        L_0x075f:
            r4 = 0
            r9 = r12 & r16
            if (r9 == 0) goto L_0x06af
            r9 = 0
            int r11 = com.google.android.gms.internal.ads.zzbav.m20672g(r14, r9)
            int r5 = r5 + r11
            r18 = r9
            goto L_0x079e
        L_0x076e:
            r4 = 0
            r18 = 0
            r11 = r12 & r16
            if (r11 == 0) goto L_0x079e
            int r9 = r2.getInt(r1, r9)
            int r9 = com.google.android.gms.internal.ads.zzbav.m20667f(r14, r9)
            goto L_0x079d
        L_0x077e:
            r4 = 0
            r18 = 0
            r11 = r12 & r16
            if (r11 == 0) goto L_0x079e
            long r9 = r2.getLong(r1, r9)
            int r9 = com.google.android.gms.internal.ads.zzbav.m20664e(r14, r9)
            goto L_0x079d
        L_0x078e:
            r4 = 0
            r18 = 0
            r11 = r12 & r16
            if (r11 == 0) goto L_0x079e
            long r9 = r2.getLong(r1, r9)
            int r9 = com.google.android.gms.internal.ads.zzbav.m20660d(r14, r9)
        L_0x079d:
            int r5 = r5 + r9
        L_0x079e:
            r9 = 0
            goto L_0x07ad
        L_0x07a0:
            r4 = 0
            r18 = 0
            r9 = r12 & r16
            if (r9 == 0) goto L_0x079e
            r9 = 0
            int r10 = com.google.android.gms.internal.ads.zzbav.m20645b(r14, r9)
            int r5 = r5 + r10
        L_0x07ad:
            r10 = 0
            goto L_0x07bf
        L_0x07b0:
            r4 = 0
            r9 = 0
            r18 = 0
            r10 = r12 & r16
            if (r10 == 0) goto L_0x07ad
            r10 = 0
            int r13 = com.google.android.gms.internal.ads.zzbav.m20644b(r14, r10)
            int r5 = r5 + r13
        L_0x07bf:
            int r3 = r3 + 4
            r9 = r18
            r4 = 0
            r11 = 0
            goto L_0x03bf
        L_0x07c7:
            com.google.android.gms.internal.ads.acw<?, ?> r2 = r0.f11412q
            int r2 = m15487a(r2, (T) r1)
            int r5 = r5 + r2
            boolean r2 = r0.f11403h
            if (r2 == 0) goto L_0x07dd
            com.google.android.gms.internal.ads.zz<?> r2 = r0.f11413r
            com.google.android.gms.internal.ads.aac r1 = r2.mo11431a(r1)
            int r1 = r1.mo11450h()
            int r5 = r5 + r1
        L_0x07dd:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.abp.mo11561b(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        com.google.android.gms.internal.ads.adc.m15810a((java.lang.Object) r7, r2, com.google.android.gms.internal.ads.adc.m15832f(r8, r2));
        m15510b(r7, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        com.google.android.gms.internal.ads.adc.m15810a((java.lang.Object) r7, r2, com.google.android.gms.internal.ads.adc.m15832f(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b3, code lost:
        com.google.android.gms.internal.ads.adc.m15808a((java.lang.Object) r7, r2, com.google.android.gms.internal.ads.adc.m15802a((java.lang.Object) r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
        com.google.android.gms.internal.ads.adc.m15809a((java.lang.Object) r7, r2, com.google.android.gms.internal.ads.adc.m15815b(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00eb, code lost:
        m15509b(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ee, code lost:
        r0 = r0 + 4;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11562b(T r7, T r8) {
        /*
            r6 = this;
            if (r8 == 0) goto L_0x0105
            r0 = 0
        L_0x0003:
            int[] r1 = r6.f11397b
            int r1 = r1.length
            if (r0 >= r1) goto L_0x00f2
            int r1 = r6.m15516d(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.f11397b
            r4 = r4[r0]
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r1 = r1 & r5
            int r1 = r1 >>> 20
            switch(r1) {
                case 0: goto L_0x00de;
                case 1: goto L_0x00d0;
                case 2: goto L_0x00c2;
                case 3: goto L_0x00bb;
                case 4: goto L_0x00ad;
                case 5: goto L_0x00a6;
                case 6: goto L_0x009f;
                case 7: goto L_0x0091;
                case 8: goto L_0x0083;
                case 9: goto L_0x007e;
                case 10: goto L_0x0077;
                case 11: goto L_0x0070;
                case 12: goto L_0x0069;
                case 13: goto L_0x0062;
                case 14: goto L_0x005a;
                case 15: goto L_0x0053;
                case 16: goto L_0x004b;
                case 17: goto L_0x007e;
                case 18: goto L_0x0044;
                case 19: goto L_0x0044;
                case 20: goto L_0x0044;
                case 21: goto L_0x0044;
                case 22: goto L_0x0044;
                case 23: goto L_0x0044;
                case 24: goto L_0x0044;
                case 25: goto L_0x0044;
                case 26: goto L_0x0044;
                case 27: goto L_0x0044;
                case 28: goto L_0x0044;
                case 29: goto L_0x0044;
                case 30: goto L_0x0044;
                case 31: goto L_0x0044;
                case 32: goto L_0x0044;
                case 33: goto L_0x0044;
                case 34: goto L_0x0044;
                case 35: goto L_0x0044;
                case 36: goto L_0x0044;
                case 37: goto L_0x0044;
                case 38: goto L_0x0044;
                case 39: goto L_0x0044;
                case 40: goto L_0x0044;
                case 41: goto L_0x0044;
                case 42: goto L_0x0044;
                case 43: goto L_0x0044;
                case 44: goto L_0x0044;
                case 45: goto L_0x0044;
                case 46: goto L_0x0044;
                case 47: goto L_0x0044;
                case 48: goto L_0x0044;
                case 49: goto L_0x0044;
                case 50: goto L_0x003d;
                case 51: goto L_0x002b;
                case 52: goto L_0x002b;
                case 53: goto L_0x002b;
                case 54: goto L_0x002b;
                case 55: goto L_0x002b;
                case 56: goto L_0x002b;
                case 57: goto L_0x002b;
                case 58: goto L_0x002b;
                case 59: goto L_0x002b;
                case 60: goto L_0x0026;
                case 61: goto L_0x001f;
                case 62: goto L_0x001f;
                case 63: goto L_0x001f;
                case 64: goto L_0x001f;
                case 65: goto L_0x001f;
                case 66: goto L_0x001f;
                case 67: goto L_0x001f;
                case 68: goto L_0x0026;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x00ee
        L_0x001f:
            boolean r1 = r6.m15504a((T) r8, r4, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x0031
        L_0x0026:
            r6.m15512b((T) r7, (T) r8, r0)
            goto L_0x00ee
        L_0x002b:
            boolean r1 = r6.m15504a((T) r8, r4, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x0031:
            java.lang.Object r1 = com.google.android.gms.internal.ads.adc.m15832f(r8, r2)
            com.google.android.gms.internal.ads.adc.m15810a(r7, r2, r1)
            r6.m15510b((T) r7, r4, r0)
            goto L_0x00ee
        L_0x003d:
            com.google.android.gms.internal.ads.abg r1 = r6.f11414s
            com.google.android.gms.internal.ads.acg.m15667a(r1, r7, r8, r2)
            goto L_0x00ee
        L_0x0044:
            com.google.android.gms.internal.ads.aaw r1 = r6.f11411p
            r1.mo11530a(r7, r8, r2)
            goto L_0x00ee
        L_0x004b:
            boolean r1 = r6.m15503a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x0053:
            boolean r1 = r6.m15503a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x006f
        L_0x005a:
            boolean r1 = r6.m15503a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x0062:
            boolean r1 = r6.m15503a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x006f
        L_0x0069:
            boolean r1 = r6.m15503a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x006f:
            goto L_0x00b3
        L_0x0070:
            boolean r1 = r6.m15503a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x0077:
            boolean r1 = r6.m15503a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x0089
        L_0x007e:
            r6.m15502a((T) r7, (T) r8, r0)
            goto L_0x00ee
        L_0x0083:
            boolean r1 = r6.m15503a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x0089:
            java.lang.Object r1 = com.google.android.gms.internal.ads.adc.m15832f(r8, r2)
            com.google.android.gms.internal.ads.adc.m15810a(r7, r2, r1)
            goto L_0x00eb
        L_0x0091:
            boolean r1 = r6.m15503a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            boolean r1 = com.google.android.gms.internal.ads.adc.m15824c(r8, r2)
            com.google.android.gms.internal.ads.adc.m15811a(r7, r2, r1)
            goto L_0x00eb
        L_0x009f:
            boolean r1 = r6.m15503a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x00a6:
            boolean r1 = r6.m15503a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00ad:
            boolean r1 = r6.m15503a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00b3:
            int r1 = com.google.android.gms.internal.ads.adc.m15802a(r8, r2)
            com.google.android.gms.internal.ads.adc.m15808a(r7, r2, r1)
            goto L_0x00eb
        L_0x00bb:
            boolean r1 = r6.m15503a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00c2:
            boolean r1 = r6.m15503a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00c8:
            long r4 = com.google.android.gms.internal.ads.adc.m15815b(r8, r2)
            com.google.android.gms.internal.ads.adc.m15809a(r7, r2, r4)
            goto L_0x00eb
        L_0x00d0:
            boolean r1 = r6.m15503a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            float r1 = com.google.android.gms.internal.ads.adc.m15825d(r8, r2)
            com.google.android.gms.internal.ads.adc.m15807a(r7, r2, r1)
            goto L_0x00eb
        L_0x00de:
            boolean r1 = r6.m15503a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            double r4 = com.google.android.gms.internal.ads.adc.m15829e(r8, r2)
            com.google.android.gms.internal.ads.adc.m15806a(r7, r2, r4)
        L_0x00eb:
            r6.m15509b((T) r7, r0)
        L_0x00ee:
            int r0 = r0 + 4
            goto L_0x0003
        L_0x00f2:
            boolean r0 = r6.f11405j
            if (r0 != 0) goto L_0x0104
            com.google.android.gms.internal.ads.acw<?, ?> r0 = r6.f11412q
            com.google.android.gms.internal.ads.acg.m15668a(r0, r7, r8)
            boolean r0 = r6.f11403h
            if (r0 == 0) goto L_0x0104
            com.google.android.gms.internal.ads.zz<?> r0 = r6.f11413r
            com.google.android.gms.internal.ads.acg.m15669a(r0, r7, r8)
        L_0x0104:
            return
        L_0x0105:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.abp.mo11562b(java.lang.Object, java.lang.Object):void");
    }

    /* renamed from: c */
    public final void mo11563c(T t) {
        if (this.f11408m != null) {
            for (int d : this.f11408m) {
                long d2 = (long) (m15516d(d) & 1048575);
                Object f = adc.m15832f(t, d2);
                if (f != null) {
                    adc.m15810a((Object) t, d2, this.f11414s.mo11546d(f));
                }
            }
        }
        if (this.f11409n != null) {
            for (int i : this.f11409n) {
                this.f11411p.mo11531b(t, (long) i);
            }
        }
        this.f11412q.mo11696d(t);
        if (this.f11403h) {
            this.f11413r.mo11440c(t);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:92:0x011a, code lost:
        continue;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0108 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x011a A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11564d(T r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int[] r2 = r0.f11407l
            r3 = 1
            if (r2 == 0) goto L_0x0133
            int[] r2 = r0.f11407l
            int r2 = r2.length
            if (r2 != 0) goto L_0x0010
            goto L_0x0133
        L_0x0010:
            r2 = -1
            int[] r4 = r0.f11407l
            int r5 = r4.length
            r6 = 0
            r2 = 0
            r7 = -1
            r8 = 0
        L_0x0018:
            if (r2 >= r5) goto L_0x0120
            r9 = r4[r2]
            int r10 = r0.m15523g(r9)
            int r11 = r0.m15516d(r10)
            boolean r12 = r0.f11405j
            r13 = 1048575(0xfffff, float:1.469367E-39)
            if (r12 != 0) goto L_0x0046
            int[] r12 = r0.f11397b
            int r14 = r10 + 2
            r12 = r12[r14]
            r14 = r12 & r13
            int r12 = r12 >>> 20
            int r12 = r3 << r12
            if (r14 == r7) goto L_0x0044
            sun.misc.Unsafe r7 = f11396a
            r15 = r4
            long r3 = (long) r14
            int r3 = r7.getInt(r1, r3)
            r8 = r3
            r7 = r14
            goto L_0x0048
        L_0x0044:
            r15 = r4
            goto L_0x0048
        L_0x0046:
            r15 = r4
            r12 = 0
        L_0x0048:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r3 & r11
            if (r3 == 0) goto L_0x004f
            r3 = 1
            goto L_0x0050
        L_0x004f:
            r3 = 0
        L_0x0050:
            if (r3 == 0) goto L_0x0059
            boolean r3 = r0.m15505a((T) r1, r10, r8, r12)
            if (r3 != 0) goto L_0x0059
            return r6
        L_0x0059:
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r11
            int r3 = r3 >>> 20
            r4 = 9
            if (r3 == r4) goto L_0x0109
            r4 = 17
            if (r3 == r4) goto L_0x0109
            r4 = 27
            if (r3 == r4) goto L_0x00dc
            r4 = 60
            if (r3 == r4) goto L_0x00cb
            r4 = 68
            if (r3 == r4) goto L_0x00cb
            switch(r3) {
                case 49: goto L_0x00dc;
                case 50: goto L_0x0077;
                default: goto L_0x0075;
            }
        L_0x0075:
            goto L_0x011a
        L_0x0077:
            com.google.android.gms.internal.ads.abg r3 = r0.f11414s
            r4 = r11 & r13
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.ads.adc.m15832f(r1, r11)
            java.util.Map r3 = r3.mo11544b(r4)
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x00c7
            java.lang.Object r4 = r0.m15508b(r10)
            com.google.android.gms.internal.ads.abg r9 = r0.f11414s
            com.google.android.gms.internal.ads.abf r4 = r9.mo11548f(r4)
            com.google.android.gms.internal.ads.zzbes r4 = r4.f11392c
            com.google.android.gms.internal.ads.zzbex r4 = r4.zzagl()
            com.google.android.gms.internal.ads.zzbex r9 = com.google.android.gms.internal.ads.zzbex.MESSAGE
            if (r4 != r9) goto L_0x00c7
            r4 = 0
            java.util.Collection r3 = r3.values()
            java.util.Iterator r3 = r3.iterator()
        L_0x00a7:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x00c7
            java.lang.Object r9 = r3.next()
            if (r4 != 0) goto L_0x00bf
            com.google.android.gms.internal.ads.aby r4 = com.google.android.gms.internal.ads.aby.m15554a()
            java.lang.Class r10 = r9.getClass()
            com.google.android.gms.internal.ads.ace r4 = r4.mo11567a(r10)
        L_0x00bf:
            boolean r9 = r4.mo11564d(r9)
            if (r9 != 0) goto L_0x00a7
            r3 = 0
            goto L_0x00c8
        L_0x00c7:
            r3 = 1
        L_0x00c8:
            if (r3 != 0) goto L_0x011a
            return r6
        L_0x00cb:
            boolean r3 = r0.m15504a((T) r1, r9, r10)
            if (r3 == 0) goto L_0x011a
            com.google.android.gms.internal.ads.ace r3 = r0.m15494a(r10)
            boolean r3 = m15506a(r1, r11, r3)
            if (r3 != 0) goto L_0x011a
            return r6
        L_0x00dc:
            r3 = r11 & r13
            long r3 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.adc.m15832f(r1, r3)
            java.util.List r3 = (java.util.List) r3
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x0105
            com.google.android.gms.internal.ads.ace r4 = r0.m15494a(r10)
            r9 = 0
        L_0x00f0:
            int r10 = r3.size()
            if (r9 >= r10) goto L_0x0105
            java.lang.Object r10 = r3.get(r9)
            boolean r10 = r4.mo11564d(r10)
            if (r10 != 0) goto L_0x0102
            r3 = 0
            goto L_0x0106
        L_0x0102:
            int r9 = r9 + 1
            goto L_0x00f0
        L_0x0105:
            r3 = 1
        L_0x0106:
            if (r3 != 0) goto L_0x011a
            return r6
        L_0x0109:
            boolean r3 = r0.m15505a((T) r1, r10, r8, r12)
            if (r3 == 0) goto L_0x011a
            com.google.android.gms.internal.ads.ace r3 = r0.m15494a(r10)
            boolean r3 = m15506a(r1, r11, r3)
            if (r3 != 0) goto L_0x011a
            return r6
        L_0x011a:
            int r2 = r2 + 1
            r4 = r15
            r3 = 1
            goto L_0x0018
        L_0x0120:
            boolean r2 = r0.f11403h
            if (r2 == 0) goto L_0x0131
            com.google.android.gms.internal.ads.zz<?> r2 = r0.f11413r
            com.google.android.gms.internal.ads.aac r1 = r2.mo11431a(r1)
            boolean r1 = r1.mo11449g()
            if (r1 != 0) goto L_0x0131
            return r6
        L_0x0131:
            r1 = 1
            return r1
        L_0x0133:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.abp.mo11564d(java.lang.Object):boolean");
    }
}
