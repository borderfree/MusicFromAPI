package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.ads.uj */
final class C3952uj {
    /* renamed from: a */
    public static zzayv m19985a(zzawy zzawy) {
        switch (C3953uk.f14970b[zzawy.ordinal()]) {
            case 1:
                return zzayv.NIST_P256;
            case 2:
                return zzayv.NIST_P384;
            case 3:
                return zzayv.NIST_P521;
            default:
                String valueOf = String.valueOf(zzawy);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("unknown curve type: ");
                sb.append(valueOf);
                throw new GeneralSecurityException(sb.toString());
        }
    }

    /* renamed from: a */
    public static zzayw m19986a(zzawk zzawk) {
        switch (C3953uk.f14971c[zzawk.ordinal()]) {
            case 1:
                return zzayw.UNCOMPRESSED;
            case 2:
                return zzayw.COMPRESSED;
            default:
                String valueOf = String.valueOf(zzawk);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("unknown point format: ");
                sb.append(valueOf);
                throw new GeneralSecurityException(sb.toString());
        }
    }

    /* renamed from: a */
    public static String m19987a(zzaxa zzaxa) {
        switch (C3953uk.f14969a[zzaxa.ordinal()]) {
            case 1:
                return "HmacSha1";
            case 2:
                return "HmacSha256";
            case 3:
                return "HmacSha512";
            default:
                String valueOf = String.valueOf(zzaxa);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                sb.append("hash unsupported for HMAC: ");
                sb.append(valueOf);
                throw new NoSuchAlgorithmException(sb.toString());
        }
    }

    /* renamed from: a */
    public static void m19988a(C4001vs vsVar) {
        C4075xs.m20336a(m19985a(vsVar.mo13745a().mo13762a()));
        m19987a(vsVar.mo13745a().mo13763b());
        if (vsVar.mo13747c() != zzawk.UNKNOWN_FORMAT) {
            C3931tp.m19897a(vsVar.mo13746b().mo13743a());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }
}
