package com.google.android.exoplayer2.p100a;

import android.annotation.TargetApi;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCodec.CryptoInfo.Pattern;
import com.google.android.exoplayer2.p102c.C2511s;

/* renamed from: com.google.android.exoplayer2.a.b */
public final class C2433b {

    /* renamed from: a */
    public byte[] f7768a;

    /* renamed from: b */
    public byte[] f7769b;

    /* renamed from: c */
    public int f7770c;

    /* renamed from: d */
    public int[] f7771d;

    /* renamed from: e */
    public int[] f7772e;

    /* renamed from: f */
    public int f7773f;

    /* renamed from: g */
    public int f7774g;

    /* renamed from: h */
    public int f7775h;

    /* renamed from: i */
    private final CryptoInfo f7776i;

    /* renamed from: j */
    private final C2435a f7777j;

    @TargetApi(24)
    /* renamed from: com.google.android.exoplayer2.a.b$a */
    private static final class C2435a {

        /* renamed from: a */
        private final CryptoInfo f7778a;

        /* renamed from: b */
        private final Pattern f7779b;

        private C2435a(CryptoInfo cryptoInfo) {
            this.f7778a = cryptoInfo;
            this.f7779b = new Pattern(0, 0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m11377a(int i, int i2) {
            this.f7779b.set(i, i2);
            this.f7778a.setPattern(this.f7779b);
        }
    }

    public C2433b() {
        this.f7776i = C2511s.f8123a >= 16 ? m11373b() : null;
        this.f7777j = C2511s.f8123a >= 24 ? new C2435a(this.f7776i) : null;
    }

    @TargetApi(16)
    /* renamed from: b */
    private CryptoInfo m11373b() {
        return new CryptoInfo();
    }

    @TargetApi(16)
    /* renamed from: c */
    private void m11374c() {
        this.f7776i.numSubSamples = this.f7773f;
        this.f7776i.numBytesOfClearData = this.f7771d;
        this.f7776i.numBytesOfEncryptedData = this.f7772e;
        this.f7776i.key = this.f7769b;
        this.f7776i.iv = this.f7768a;
        this.f7776i.mode = this.f7770c;
        if (C2511s.f8123a >= 24) {
            this.f7777j.m11377a(this.f7774g, this.f7775h);
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    public CryptoInfo mo8649a() {
        return this.f7776i;
    }

    /* renamed from: a */
    public void mo8650a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2) {
        this.f7773f = i;
        this.f7771d = iArr;
        this.f7772e = iArr2;
        this.f7769b = bArr;
        this.f7768a = bArr2;
        this.f7770c = i2;
        this.f7774g = 0;
        this.f7775h = 0;
        if (C2511s.f8123a >= 16) {
            m11374c();
        }
    }
}
