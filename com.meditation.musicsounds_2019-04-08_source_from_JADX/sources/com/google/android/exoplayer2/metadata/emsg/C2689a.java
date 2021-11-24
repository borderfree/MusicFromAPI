package com.google.android.exoplayer2.metadata.emsg;

import com.google.android.exoplayer2.metadata.C2682a;
import com.google.android.exoplayer2.metadata.C2685c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.p102c.C2500k;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.metadata.emsg.a */
public final class C2689a implements C2682a {
    /* renamed from: a */
    public Metadata mo9191a(C2685c cVar) {
        ByteBuffer byteBuffer = cVar.f7788b;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        C2500k kVar = new C2500k(array, limit);
        String x = kVar.mo8851x();
        String x2 = kVar.mo8851x();
        long l = kVar.mo8839l();
        kVar.mo8829d(4);
        EventMessage eventMessage = new EventMessage(x, x2, (kVar.mo8839l() * 1000) / l, kVar.mo8839l(), Arrays.copyOfRange(array, kVar.mo8828d(), limit));
        return new Metadata(eventMessage);
    }
}
