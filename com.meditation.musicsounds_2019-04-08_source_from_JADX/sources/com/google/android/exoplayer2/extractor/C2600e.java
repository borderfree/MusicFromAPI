package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p102c.C2500k;
import java.io.EOFException;

/* renamed from: com.google.android.exoplayer2.extractor.e */
public final class C2600e implements C2659n {
    /* renamed from: a */
    public int mo8999a(C2650g gVar, int i, boolean z) {
        int a = gVar.mo8963a(i);
        if (a != -1) {
            return a;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: a */
    public void mo9001a(long j, int i, int i2, int i3, byte[] bArr) {
    }

    /* renamed from: a */
    public void mo9002a(Format format) {
    }

    /* renamed from: a */
    public void mo9003a(C2500k kVar, int i) {
        kVar.mo8829d(i);
    }
}
