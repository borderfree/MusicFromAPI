package com.google.android.exoplayer2.extractor.p105c;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.p102c.C2500k;
import java.util.UUID;

/* renamed from: com.google.android.exoplayer2.extractor.c.h */
public final class C2566h {
    /* renamed from: a */
    public static UUID m12104a(byte[] bArr) {
        Pair b = m12105b(bArr);
        if (b == null) {
            return null;
        }
        return (UUID) b.first;
    }

    /* renamed from: b */
    private static Pair<UUID, byte[]> m12105b(byte[] bArr) {
        C2500k kVar = new C2500k(bArr);
        if (kVar.mo8826c() < 32) {
            return null;
        }
        kVar.mo8827c(0);
        if (kVar.mo8841n() != kVar.mo8824b() + 4 || kVar.mo8841n() != C2544a.f8330U) {
            return null;
        }
        int a = C2544a.m11991a(kVar.mo8841n());
        if (a > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported pssh version: ");
            sb.append(a);
            Log.w("PsshAtomUtil", sb.toString());
            return null;
        }
        UUID uuid = new UUID(kVar.mo8843p(), kVar.mo8843p());
        if (a == 1) {
            kVar.mo8829d(kVar.mo8847t() * 16);
        }
        int t = kVar.mo8847t();
        if (t != kVar.mo8824b()) {
            return null;
        }
        byte[] bArr2 = new byte[t];
        kVar.mo8823a(bArr2, 0, t);
        return Pair.create(uuid, bArr2);
    }
}
