package com.google.firebase.iid;

import android.os.Bundle;

/* renamed from: com.google.firebase.iid.n */
final class C4961n extends C4960m<Bundle> {
    C4961n(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16231a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        mo16234a(bundle2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo16232a() {
        return false;
    }
}
