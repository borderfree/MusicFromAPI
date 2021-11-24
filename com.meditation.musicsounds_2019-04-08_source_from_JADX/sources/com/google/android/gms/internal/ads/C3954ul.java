package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C3965uu.C3966a;
import com.google.android.gms.internal.ads.C3985vh.C3986a;
import com.google.android.gms.internal.ads.C4017wd.C4018a;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.ul */
final class C3954ul implements C4069xm {

    /* renamed from: a */
    private final String f14972a;

    /* renamed from: b */
    private final int f14973b;

    /* renamed from: c */
    private C3985vh f14974c;

    /* renamed from: d */
    private C3959uq f14975d;

    /* renamed from: e */
    private int f14976e;

    C3954ul(C4029wm wmVar) {
        this.f14972a = wmVar.mo13775a();
        if (this.f14972a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                C3988vj a = C3988vj.m20090a(wmVar.mo13776b());
                this.f14974c = (C3985vh) C3931tp.m19903b(wmVar);
                this.f14973b = a.mo13738a();
            } catch (zzbbu e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (this.f14972a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                C3962us a2 = C3962us.m20017a(wmVar.mo13776b());
                this.f14975d = (C3959uq) C3931tp.m19903b(wmVar);
                this.f14976e = a2.mo13713a().mo13722b();
                this.f14973b = this.f14976e + a2.mo13714b().mo13772b();
            } catch (zzbbu e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e2);
            }
        } else {
            String str = "unsupported AEAD DEM key type: ";
            String valueOf = String.valueOf(this.f14972a);
            throw new GeneralSecurityException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    /* renamed from: a */
    public final int mo13705a() {
        return this.f14973b;
    }

    /* renamed from: a */
    public final C3914sz mo13706a(byte[] bArr) {
        abl abl;
        if (bArr.length == this.f14973b) {
            if (this.f14972a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                abl = (C3985vh) ((C3986a) C3985vh.m20083c().mo11488a(this.f14974c)).mo13737a(zzbah.zzc(bArr, 0, this.f14973b)).mo11490c();
            } else if (this.f14972a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.f14976e);
                C4017wd wdVar = (C4017wd) ((C4018a) C4017wd.m20177d().mo11488a(this.f14975d.mo13709c())).mo13770a(zzbah.zzo(Arrays.copyOfRange(bArr, this.f14976e, this.f14973b))).mo11490c();
                abl = (C3959uq) C3959uq.m20008d().mo13710a(this.f14975d.mo13707a()).mo13711a((C3965uu) ((C3966a) C3965uu.m20029d().mo11488a(this.f14975d.mo13708b())).mo13720a(zzbah.zzo(copyOfRange)).mo11490c()).mo13712a(wdVar).mo11490c();
            } else {
                throw new GeneralSecurityException("unknown DEM key type");
            }
            return (C3914sz) C3931tp.m19905b(this.f14972a, abl);
        }
        throw new GeneralSecurityException("Symmetric key has incorrect length");
    }
}
