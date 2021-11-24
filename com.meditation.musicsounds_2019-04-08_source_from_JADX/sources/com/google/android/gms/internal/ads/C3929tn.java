package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C4035wq.C4037b;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.ads.tn */
public final class C3929tn<P> {

    /* renamed from: a */
    private static final Charset f14945a = Charset.forName("UTF-8");

    /* renamed from: b */
    private ConcurrentMap<String, List<C3930to<P>>> f14946b = new ConcurrentHashMap();

    /* renamed from: c */
    private C3930to<P> f14947c;

    /* renamed from: a */
    public final C3930to<P> mo13700a() {
        return this.f14947c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C3930to<P> mo13701a(P p, C4037b bVar) {
        byte[] bArr;
        byte b;
        ByteBuffer byteBuffer;
        switch (bVar.mo13794e()) {
            case LEGACY:
            case CRUNCHY:
                byteBuffer = ByteBuffer.allocate(5);
                b = 0;
                break;
            case TINK:
                byteBuffer = ByteBuffer.allocate(5);
                b = 1;
                break;
            case RAW:
                bArr = C3919td.f14941a;
                break;
            default:
                throw new GeneralSecurityException("unknown output prefix type");
        }
        bArr = byteBuffer.put(b).putInt(bVar.mo13793d()).array();
        C3930to<P> toVar = new C3930to<>(p, bArr, bVar.mo13792c(), bVar.mo13794e());
        ArrayList arrayList = new ArrayList();
        arrayList.add(toVar);
        String str = new String(toVar.mo13704b(), f14945a);
        List list = (List) this.f14946b.put(str, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(toVar);
            this.f14946b.put(str, Collections.unmodifiableList(arrayList2));
        }
        return toVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13702a(C3930to<P> toVar) {
        this.f14947c = toVar;
    }
}
