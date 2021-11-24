package com.google.android.exoplayer2.extractor.p106d;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2511s;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.d.g */
final class C2587g extends C2588h {

    /* renamed from: a */
    private static final int f8660a = C2511s.m11819e("Opus");

    /* renamed from: b */
    private static final byte[] f8661b = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: c */
    private boolean f8662c;

    C2587g() {
    }

    /* renamed from: a */
    private long m12207a(byte[] bArr) {
        byte b;
        byte b2 = bArr[0] & 255;
        switch (b2 & 3) {
            case 0:
                b = 1;
                break;
            case 1:
            case 2:
                b = 2;
                break;
            default:
                b = bArr[1] & 63;
                break;
        }
        int i = b2 >> 3;
        int i2 = i & 3;
        int i3 = i >= 16 ? 2500 << i2 : i >= 12 ? 10000 << (i2 & 1) : i2 == 3 ? 60000 : 10000 << i2;
        return (long) (b * i3);
    }

    /* renamed from: a */
    private void m12208a(List<byte[]> list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i) * 1000000000) / 48000).array());
    }

    /* renamed from: a */
    public static boolean m12209a(C2500k kVar) {
        if (kVar.mo8824b() < f8661b.length) {
            return false;
        }
        byte[] bArr = new byte[f8661b.length];
        kVar.mo8823a(bArr, 0, f8661b.length);
        return Arrays.equals(bArr, f8661b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9037a(boolean z) {
        super.mo9037a(z);
        if (z) {
            this.f8662c = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo9038a(C2500k kVar, long j, C2590a aVar) {
        boolean z = true;
        if (!this.f8662c) {
            byte[] copyOf = Arrays.copyOf(kVar.f8094a, kVar.mo8826c());
            byte b = copyOf[9] & 255;
            byte b2 = ((copyOf[11] & 255) << 8) | (copyOf[10] & 255);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            m12208a(arrayList, b2);
            m12208a(arrayList, 3840);
            aVar.f8676a = Format.m11316a(null, "audio/opus", null, -1, -1, b, 48000, arrayList, null, 0, null);
            this.f8662c = true;
            return true;
        }
        if (kVar.mo8841n() != f8660a) {
            z = false;
        }
        kVar.mo8827c(0);
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo9039b(C2500k kVar) {
        return mo9053b(m12207a(kVar.f8094a));
    }
}
