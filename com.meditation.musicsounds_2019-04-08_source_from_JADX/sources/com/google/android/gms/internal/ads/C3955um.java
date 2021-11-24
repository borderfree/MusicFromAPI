package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaxi.zzb;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.um */
final class C3955um implements C3923th<C3927tl> {
    C3955um() {
    }

    /* renamed from: a */
    private static void m19991a(C4023wh whVar) {
        if (whVar.mo13774b() >= 10) {
            switch (whVar.mo13773a()) {
                case SHA1:
                    if (whVar.mo13774b() > 20) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                case SHA256:
                    if (whVar.mo13774b() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                case SHA512:
                    if (whVar.mo13774b() > 64) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                default:
                    throw new GeneralSecurityException("unknown hash type");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C3927tl mo13691a(zzbah zzbah) {
        C4091yh yhVar;
        try {
            C4017wd a = C4017wd.m20170a(zzbah);
            if (a instanceof C4017wd) {
                C4017wd wdVar = a;
                C4098yo.m20377a(wdVar.mo13765a(), 0);
                if (wdVar.mo13767c().size() >= 16) {
                    m19991a(wdVar.mo13766b());
                    zzaxa a2 = wdVar.mo13766b().mo13773a();
                    SecretKeySpec secretKeySpec = new SecretKeySpec(wdVar.mo13767c().toByteArray(), "HMAC");
                    int b = wdVar.mo13766b().mo13774b();
                    switch (a2) {
                        case SHA1:
                            yhVar = new C4091yh("HMACSHA1", secretKeySpec, b);
                            break;
                        case SHA256:
                            yhVar = new C4091yh("HMACSHA256", secretKeySpec, b);
                            break;
                        case SHA512:
                            yhVar = new C4091yh("HMACSHA512", secretKeySpec, b);
                            break;
                        default:
                            throw new GeneralSecurityException("unknown hash");
                    }
                    return yhVar;
                }
                throw new GeneralSecurityException("key too short");
            }
            throw new GeneralSecurityException("expected HmacKey proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized HmacKey proto", e);
        }
    }

    /* renamed from: a */
    public final int mo13689a() {
        return 0;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo13690a(abl abl) {
        if (abl instanceof C4017wd) {
            C4017wd wdVar = (C4017wd) abl;
            C4098yo.m20377a(wdVar.mo13765a(), 0);
            if (wdVar.mo13767c().size() >= 16) {
                m19991a(wdVar.mo13766b());
                zzaxa a = wdVar.mo13766b().mo13773a();
                SecretKeySpec secretKeySpec = new SecretKeySpec(wdVar.mo13767c().toByteArray(), "HMAC");
                int b = wdVar.mo13766b().mo13774b();
                switch (a) {
                    case SHA1:
                        return new C4091yh("HMACSHA1", secretKeySpec, b);
                    case SHA256:
                        return new C4091yh("HMACSHA256", secretKeySpec, b);
                    case SHA512:
                        return new C4091yh("HMACSHA512", secretKeySpec, b);
                    default:
                        throw new GeneralSecurityException("unknown hash");
                }
            } else {
                throw new GeneralSecurityException("key too short");
            }
        } else {
            throw new GeneralSecurityException("expected HmacKey proto");
        }
    }

    /* renamed from: b */
    public final abl mo13692b(abl abl) {
        if (abl instanceof C4020wf) {
            C4020wf wfVar = (C4020wf) abl;
            if (wfVar.mo13772b() >= 16) {
                m19991a(wfVar.mo13771a());
                return C4017wd.m20177d().mo13768a(0).mo13769a(wfVar.mo13771a()).mo13770a(zzbah.zzo(C4093yj.m20365a(wfVar.mo13772b()))).mo11490c();
            }
            throw new GeneralSecurityException("key too short");
        }
        throw new GeneralSecurityException("expected HmacKeyFormat proto");
    }

    /* renamed from: b */
    public final abl mo13693b(zzbah zzbah) {
        try {
            return mo13692b((abl) C4020wf.m20187a(zzbah));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized HmacKeyFormat proto", e);
        }
    }

    /* renamed from: c */
    public final zzaxi mo13694c(zzbah zzbah) {
        return (zzaxi) zzaxi.m20628d().mo13903a("type.googleapis.com/google.crypto.tink.HmacKey").mo13902a(((C4017wd) mo13693b(zzbah)).mo11552h()).mo13901a(zzb.SYMMETRIC).mo11490c();
    }
}
