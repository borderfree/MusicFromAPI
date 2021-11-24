package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

@C3464ci
final class avv {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List<awv> f13206a = new ArrayList();

    avv() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo12536a(aww aww) {
        Handler handler = C3653jh.f14275a;
        for (awv awu : this.f13206a) {
            handler.post(new awu(this, awu, aww));
        }
        this.f13206a.clear();
    }
}
