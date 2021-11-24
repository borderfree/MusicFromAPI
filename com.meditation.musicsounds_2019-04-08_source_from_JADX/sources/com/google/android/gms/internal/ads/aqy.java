package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class aqy {

    /* renamed from: a */
    private final Map<String, aqx> f12938a = new HashMap();

    /* renamed from: b */
    private final aqz f12939b;

    public aqy(aqz aqz) {
        this.f12939b = aqz;
    }

    /* renamed from: a */
    public final aqz mo12315a() {
        return this.f12939b;
    }

    /* renamed from: a */
    public final void mo12316a(String str, aqx aqx) {
        this.f12938a.put(str, aqx);
    }

    /* renamed from: a */
    public final void mo12317a(String str, String str2, long j) {
        aqz aqz = this.f12939b;
        aqx aqx = (aqx) this.f12938a.get(str2);
        String[] strArr = {str};
        if (!(aqz == null || aqx == null)) {
            aqz.mo12323a(aqx, j, strArr);
        }
        Map<String, aqx> map = this.f12938a;
        aqz aqz2 = this.f12939b;
        map.put(str, aqz2 == null ? null : aqz2.mo12319a(j));
    }
}
