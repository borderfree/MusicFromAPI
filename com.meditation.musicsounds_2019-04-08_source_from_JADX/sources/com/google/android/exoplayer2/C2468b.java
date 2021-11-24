package com.google.android.exoplayer2;

import com.google.android.exoplayer2.p102c.C2511s;
import java.util.UUID;

/* renamed from: com.google.android.exoplayer2.b */
public final class C2468b {

    /* renamed from: a */
    public static final int f7981a = (C2511s.f8123a < 23 ? 1020 : 6396);

    /* renamed from: b */
    public static final UUID f7982b = new UUID(0, 0);

    /* renamed from: c */
    public static final UUID f7983c = new UUID(1186680826959645954L, -5988876978535335093L);

    /* renamed from: d */
    public static final UUID f7984d = new UUID(-1301668207276963122L, -6645017420763422227L);

    /* renamed from: e */
    public static final UUID f7985e = new UUID(-7348484286925749626L, -6083546864340672619L);

    /* renamed from: a */
    public static long m11602a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j / 1000;
    }

    /* renamed from: b */
    public static long m11603b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return 1000 * j;
    }
}
