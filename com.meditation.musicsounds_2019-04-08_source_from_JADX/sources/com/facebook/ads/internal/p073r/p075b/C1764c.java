package com.facebook.ads.internal.p073r.p075b;

import com.facebook.ads.internal.p073r.p075b.p076a.C1753a;
import com.facebook.ads.internal.p073r.p075b.p076a.C1755c;
import java.io.File;

/* renamed from: com.facebook.ads.internal.r.b.c */
class C1764c {

    /* renamed from: a */
    public final File f5763a;

    /* renamed from: b */
    public final C1755c f5764b;

    /* renamed from: c */
    public final C1753a f5765c;

    C1764c(File file, C1755c cVar, C1753a aVar) {
        this.f5763a = file;
        this.f5764b = cVar;
        this.f5765c = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public File mo7028a(String str) {
        return new File(this.f5763a, this.f5764b.mo7021a(str));
    }
}
