package com.google.android.exoplayer2.extractor.p106d;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.p106d.C2595k.C2597b;
import com.google.android.exoplayer2.extractor.p106d.C2595k.C2598c;
import com.google.android.exoplayer2.extractor.p106d.C2595k.C2599d;
import com.google.android.exoplayer2.p102c.C2500k;
import java.util.ArrayList;

/* renamed from: com.google.android.exoplayer2.extractor.d.j */
final class C2593j extends C2588h {

    /* renamed from: a */
    private C2594a f8682a;

    /* renamed from: b */
    private int f8683b;

    /* renamed from: c */
    private boolean f8684c;

    /* renamed from: d */
    private C2599d f8685d;

    /* renamed from: e */
    private C2597b f8686e;

    /* renamed from: com.google.android.exoplayer2.extractor.d.j$a */
    static final class C2594a {

        /* renamed from: a */
        public final C2599d f8687a;

        /* renamed from: b */
        public final C2597b f8688b;

        /* renamed from: c */
        public final byte[] f8689c;

        /* renamed from: d */
        public final C2598c[] f8690d;

        /* renamed from: e */
        public final int f8691e;

        public C2594a(C2599d dVar, C2597b bVar, byte[] bArr, C2598c[] cVarArr, int i) {
            this.f8687a = dVar;
            this.f8688b = bVar;
            this.f8689c = bArr;
            this.f8690d = cVarArr;
            this.f8691e = i;
        }
    }

    C2593j() {
    }

    /* renamed from: a */
    static int m12231a(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    /* renamed from: a */
    private static int m12232a(byte b, C2594a aVar) {
        return !aVar.f8690d[m12231a(b, aVar.f8691e, 1)].f8700a ? aVar.f8687a.f8710g : aVar.f8687a.f8711h;
    }

    /* renamed from: a */
    static void m12233a(C2500k kVar, long j) {
        kVar.mo8825b(kVar.mo8826c() + 4);
        kVar.f8094a[kVar.mo8826c() - 4] = (byte) ((int) (j & 255));
        kVar.f8094a[kVar.mo8826c() - 3] = (byte) ((int) ((j >>> 8) & 255));
        kVar.f8094a[kVar.mo8826c() - 2] = (byte) ((int) ((j >>> 16) & 255));
        kVar.f8094a[kVar.mo8826c() - 1] = (byte) ((int) ((j >>> 24) & 255));
    }

    /* renamed from: a */
    public static boolean m12234a(C2500k kVar) {
        try {
            return C2595k.m12244a(1, kVar, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9037a(boolean z) {
        super.mo9037a(z);
        if (z) {
            this.f8682a = null;
            this.f8685d = null;
            this.f8686e = null;
        }
        this.f8683b = 0;
        this.f8684c = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo9038a(C2500k kVar, long j, C2590a aVar) {
        if (this.f8682a != null) {
            return false;
        }
        this.f8682a = mo9059c(kVar);
        if (this.f8682a == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f8682a.f8687a.f8713j);
        arrayList.add(this.f8682a.f8689c);
        aVar.f8676a = Format.m11316a(null, "audio/vorbis", null, this.f8682a.f8687a.f8708e, -1, this.f8682a.f8687a.f8705b, (int) this.f8682a.f8687a.f8706c, arrayList, null, 0, null);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo9039b(C2500k kVar) {
        int i = 0;
        if ((kVar.f8094a[0] & 1) == 1) {
            return -1;
        }
        int a = m12232a(kVar.f8094a[0], this.f8682a);
        if (this.f8684c) {
            i = (this.f8683b + a) / 4;
        }
        long j = (long) i;
        m12233a(kVar, j);
        this.f8684c = true;
        this.f8683b = a;
        return j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C2594a mo9059c(C2500k kVar) {
        if (this.f8685d == null) {
            this.f8685d = C2595k.m12242a(kVar);
            return null;
        } else if (this.f8686e == null) {
            this.f8686e = C2595k.m12247b(kVar);
            return null;
        } else {
            byte[] bArr = new byte[kVar.mo8826c()];
            System.arraycopy(kVar.f8094a, 0, bArr, 0, kVar.mo8826c());
            C2598c[] a = C2595k.m12245a(kVar, this.f8685d.f8705b);
            C2594a aVar = new C2594a(this.f8685d, this.f8686e, bArr, a, C2595k.m12240a(a.length - 1));
            return aVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo9054c(long j) {
        super.mo9054c(j);
        int i = 0;
        this.f8684c = j != 0;
        if (this.f8685d != null) {
            i = this.f8685d.f8710g;
        }
        this.f8683b = i;
    }
}
