package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.C2659n;
import com.google.android.exoplayer2.p102c.C2500k;

abstract class TagPayloadReader {

    /* renamed from: a */
    protected final C2659n f8981a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str);
        }
    }

    protected TagPayloadReader(C2659n nVar) {
        this.f8981a = nVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo9112a(C2500k kVar, long j);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo9113a(C2500k kVar);

    /* renamed from: b */
    public final void mo9114b(C2500k kVar, long j) {
        if (mo9113a(kVar)) {
            mo9112a(kVar, j);
        }
    }
}
