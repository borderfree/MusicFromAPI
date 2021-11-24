package com.google.android.exoplayer2.text.p110b;

import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.text.C2753b;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.b.a */
public final class C2754a extends C2753b {

    /* renamed from: a */
    private final C2755b f9487a;

    public C2754a(List<byte[]> list) {
        super("DvbDecoder");
        C2500k kVar = new C2500k((byte[]) list.get(0));
        this.f9487a = new C2755b(kVar.mo8835h(), kVar.mo8835h());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C2764c mo9429a(byte[] bArr, int i, boolean z) {
        if (z) {
            this.f9487a.mo9435a();
        }
        return new C2764c(this.f9487a.mo9434a(bArr, i));
    }
}
