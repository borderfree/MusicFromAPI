package com.google.android.exoplayer2.text.p114f;

import android.text.TextUtils;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.text.C2753b;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.p114f.C2785e.C2787a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.f.g */
public final class C2791g extends C2753b {

    /* renamed from: a */
    private final C2788f f9654a = new C2788f();

    /* renamed from: b */
    private final C2500k f9655b = new C2500k();

    /* renamed from: c */
    private final C2787a f9656c = new C2787a();

    /* renamed from: d */
    private final C2781a f9657d = new C2781a();

    /* renamed from: e */
    private final List<C2784d> f9658e = new ArrayList();

    public C2791g() {
        super("WebvttDecoder");
    }

    /* renamed from: a */
    private static int m13296a(C2500k kVar) {
        int i = -1;
        int i2 = 0;
        while (i == -1) {
            i2 = kVar.mo8828d();
            String y = kVar.mo8852y();
            i = y == null ? 0 : "STYLE".equals(y) ? 2 : "NOTE".startsWith(y) ? 1 : 3;
        }
        kVar.mo8827c(i2);
        return i;
    }

    /* renamed from: b */
    private static void m13297b(C2500k kVar) {
        do {
        } while (!TextUtils.isEmpty(kVar.mo8852y()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C2793i mo9429a(byte[] bArr, int i, boolean z) {
        this.f9655b.mo8822a(bArr, i);
        this.f9656c.mo9503a();
        this.f9658e.clear();
        C2792h.m13301a(this.f9655b);
        do {
        } while (!TextUtils.isEmpty(this.f9655b.mo8852y()));
        ArrayList arrayList = new ArrayList();
        while (true) {
            int a = m13296a(this.f9655b);
            if (a == 0) {
                return new C2793i(arrayList);
            }
            if (a == 1) {
                m13297b(this.f9655b);
            } else if (a == 2) {
                if (arrayList.isEmpty()) {
                    this.f9655b.mo8852y();
                    C2784d a2 = this.f9657d.mo9472a(this.f9655b);
                    if (a2 != null) {
                        this.f9658e.add(a2);
                    }
                } else {
                    throw new SubtitleDecoderException("A style block was found after the first cue.");
                }
            } else if (a == 3 && this.f9654a.mo9510a(this.f9655b, this.f9656c, this.f9658e)) {
                arrayList.add(this.f9656c.mo9507b());
                this.f9656c.mo9503a();
            }
        }
    }
}
