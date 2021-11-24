package com.google.android.exoplayer2.text.p114f;

import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2511s;
import com.google.android.exoplayer2.text.C2741a;
import com.google.android.exoplayer2.text.C2753b;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.p114f.C2785e.C2787a;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.exoplayer2.text.f.b */
public final class C2782b extends C2753b {

    /* renamed from: a */
    private static final int f9609a = C2511s.m11819e("payl");

    /* renamed from: b */
    private static final int f9610b = C2511s.m11819e("sttg");

    /* renamed from: c */
    private static final int f9611c = C2511s.m11819e("vttc");

    /* renamed from: d */
    private final C2500k f9612d = new C2500k();

    /* renamed from: e */
    private final C2787a f9613e = new C2787a();

    public C2782b() {
        super("Mp4WebvttDecoder");
    }

    /* renamed from: a */
    private static C2741a m13233a(C2500k kVar, C2787a aVar, int i) {
        aVar.mo9503a();
        while (i > 0) {
            if (i >= 8) {
                int n = kVar.mo8841n();
                int n2 = kVar.mo8841n();
                int i2 = i - 8;
                int i3 = n - 8;
                String str = new String(kVar.f8094a, kVar.mo8828d(), i3);
                kVar.mo8829d(i3);
                i = i2 - i3;
                if (n2 == f9610b) {
                    C2788f.m13282a(str, aVar);
                } else if (n2 == f9609a) {
                    C2788f.m13284a((String) null, str.trim(), aVar, Collections.emptyList());
                }
            } else {
                throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
            }
        }
        return aVar.mo9507b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C2783c mo9429a(byte[] bArr, int i, boolean z) {
        this.f9612d.mo8822a(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.f9612d.mo8824b() > 0) {
            if (this.f9612d.mo8824b() >= 8) {
                int n = this.f9612d.mo8841n();
                if (this.f9612d.mo8841n() == f9611c) {
                    arrayList.add(m13233a(this.f9612d, this.f9613e, n - 8));
                } else {
                    this.f9612d.mo8829d(n - 8);
                }
            } else {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new C2783c(arrayList);
    }
}
