package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.p100a.C2440g;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.text.b */
public abstract class C2753b extends C2440g<C2794g, C2795h, SubtitleDecoderException> implements C2776e {

    /* renamed from: a */
    private final String f9486a;

    protected C2753b(String str) {
        super(new C2794g[2], new C2795h[2]);
        this.f9486a = str;
        mo8662a(1024);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final SubtitleDecoderException mo8661a(C2794g gVar, C2795h hVar, boolean z) {
        try {
            ByteBuffer byteBuffer = gVar.f7788b;
            C2795h hVar2 = hVar;
            hVar2.mo9516a(gVar.f7789c, mo9429a(byteBuffer.array(), byteBuffer.limit(), z), gVar.f9665d);
            hVar.mo8644c(Integer.MIN_VALUE);
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C2768d mo9429a(byte[] bArr, int i, boolean z);

    /* renamed from: a */
    public void mo9383a(long j) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8664a(C2795h hVar) {
        super.mo8664a(hVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C2794g mo8667g() {
        return new C2794g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final C2795h mo8668h() {
        return new C2765c(this);
    }
}
