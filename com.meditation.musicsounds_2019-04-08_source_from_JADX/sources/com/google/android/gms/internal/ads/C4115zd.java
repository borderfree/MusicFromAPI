package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zd */
final class C4115zd {
    /* renamed from: a */
    static int m20406a(int i, byte[] bArr, int i2, int i3, aan<?> aan, C4116ze zeVar) {
        aaj aaj = (aaj) aan;
        int a = m20412a(bArr, i2, zeVar);
        while (true) {
            aaj.mo11495c(zeVar.f15165a);
            if (a >= i3) {
                break;
            }
            int a2 = m20412a(bArr, a, zeVar);
            if (i != zeVar.f15165a) {
                break;
            }
            a = m20412a(bArr, a2, zeVar);
        }
        return a;
    }

    /* renamed from: a */
    static int m20407a(int i, byte[] bArr, int i2, int i3, acx acx, C4116ze zeVar) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 5) {
                switch (i4) {
                    case 0:
                        int b = m20413b(bArr, i2, zeVar);
                        acx.mo11699a(i, (Object) Long.valueOf(zeVar.f15166b));
                        return b;
                    case 1:
                        acx.mo11699a(i, (Object) Long.valueOf(m20414b(bArr, i2)));
                        return i2 + 8;
                    case 2:
                        int a = m20412a(bArr, i2, zeVar);
                        int i5 = zeVar.f15165a;
                        acx.mo11699a(i, (Object) i5 == 0 ? zzbah.zzdpq : zzbah.zzc(bArr, a, i5));
                        return a + i5;
                    case 3:
                        acx b2 = acx.m15768b();
                        int i6 = (i & -8) | 4;
                        int i7 = 0;
                        while (true) {
                            if (i2 < i3) {
                                int a2 = m20412a(bArr, i2, zeVar);
                                int i8 = zeVar.f15165a;
                                if (i8 != i6) {
                                    i7 = i8;
                                    i2 = m20407a(i8, bArr, a2, i3, b2, zeVar);
                                } else {
                                    i7 = i8;
                                    i2 = a2;
                                }
                            }
                        }
                        if (i2 > i3 || i7 != i6) {
                            throw zzbbu.zzadr();
                        }
                        acx.mo11699a(i, (Object) b2);
                        return i2;
                    default:
                        throw zzbbu.zzado();
                }
            } else {
                acx.mo11699a(i, (Object) Integer.valueOf(m20410a(bArr, i2)));
                return i2 + 4;
            }
        } else {
            throw zzbbu.zzado();
        }
    }

    /* renamed from: a */
    static int m20408a(int i, byte[] bArr, int i2, int i3, C4116ze zeVar) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 5) {
                return i2 + 4;
            }
            switch (i4) {
                case 0:
                    return m20413b(bArr, i2, zeVar);
                case 1:
                    return i2 + 8;
                case 2:
                    return m20412a(bArr, i2, zeVar) + zeVar.f15165a;
                case 3:
                    int i5 = (i & -8) | 4;
                    int i6 = 0;
                    while (i2 < i3) {
                        i2 = m20412a(bArr, i2, zeVar);
                        i6 = zeVar.f15165a;
                        if (i6 != i5) {
                            i2 = m20408a(i6, bArr, i2, i3, zeVar);
                        } else if (i2 > i3 && i6 == i5) {
                            return i2;
                        } else {
                            throw zzbbu.zzadr();
                        }
                    }
                    if (i2 > i3) {
                    }
                    throw zzbbu.zzadr();
                default:
                    throw zzbbu.zzado();
            }
        } else {
            throw zzbbu.zzado();
        }
    }

    /* renamed from: a */
    static int m20409a(int i, byte[] bArr, int i2, C4116ze zeVar) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            i4 = b << 7;
        } else {
            int i7 = i5 | ((b & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i3 = b2 << 14;
            } else {
                i5 = i7 | ((b2 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i4 = b3 << 21;
                } else {
                    i7 = i5 | ((b3 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 >= 0) {
                        i3 = b4 << 28;
                    } else {
                        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] >= 0) {
                                zeVar.f15165a = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            zeVar.f15165a = i7 | i3;
            return i8;
        }
        zeVar.f15165a = i5 | i4;
        return i6;
    }

    /* renamed from: a */
    static int m20410a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: a */
    static int m20411a(byte[] bArr, int i, aan<?> aan, C4116ze zeVar) {
        aaj aaj = (aaj) aan;
        int a = m20412a(bArr, i, zeVar);
        int i2 = zeVar.f15165a + a;
        while (a < i2) {
            a = m20412a(bArr, a, zeVar);
            aaj.mo11495c(zeVar.f15165a);
        }
        if (a == i2) {
            return a;
        }
        throw zzbbu.zzadl();
    }

    /* renamed from: a */
    static int m20412a(byte[] bArr, int i, C4116ze zeVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m20409a((int) b, bArr, i2, zeVar);
        }
        zeVar.f15165a = b;
        return i2;
    }

    /* renamed from: b */
    static int m20413b(byte[] bArr, int i, C4116ze zeVar) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            zeVar.f15166b = j;
            return i2;
        }
        long j2 = j & 127;
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j3 = j2 | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j3 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        zeVar.f15166b = j3;
        return i3;
    }

    /* renamed from: b */
    static long m20414b(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: c */
    static double m20415c(byte[] bArr, int i) {
        return Double.longBitsToDouble(m20414b(bArr, i));
    }

    /* renamed from: c */
    static int m20416c(byte[] bArr, int i, C4116ze zeVar) {
        int a = m20412a(bArr, i, zeVar);
        int i2 = zeVar.f15165a;
        if (i2 == 0) {
            zeVar.f15167c = "";
            return a;
        }
        zeVar.f15167c = new String(bArr, a, i2, aak.f11362a);
        return a + i2;
    }

    /* renamed from: d */
    static float m20417d(byte[] bArr, int i) {
        return Float.intBitsToFloat(m20410a(bArr, i));
    }

    /* renamed from: d */
    static int m20418d(byte[] bArr, int i, C4116ze zeVar) {
        int a = m20412a(bArr, i, zeVar);
        int i2 = zeVar.f15165a;
        if (i2 == 0) {
            zeVar.f15167c = "";
            return a;
        }
        int i3 = a + i2;
        if (ade.m15886a(bArr, a, i3)) {
            zeVar.f15167c = new String(bArr, a, i2, aak.f11362a);
            return i3;
        }
        throw zzbbu.zzads();
    }

    /* renamed from: e */
    static int m20419e(byte[] bArr, int i, C4116ze zeVar) {
        int a = m20412a(bArr, i, zeVar);
        int i2 = zeVar.f15165a;
        if (i2 == 0) {
            zeVar.f15167c = zzbah.zzdpq;
            return a;
        }
        zeVar.f15167c = zzbah.zzc(bArr, a, i2);
        return a + i2;
    }
}
