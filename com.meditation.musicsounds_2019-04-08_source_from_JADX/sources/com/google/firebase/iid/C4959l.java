package com.google.firebase.iid;

import android.os.Bundle;

/* renamed from: com.google.firebase.iid.l */
final class C4959l extends C4960m<Void> {
    C4959l(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16231a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            mo16234a(null);
        } else {
            mo16233a(new zzal(4, "Invalid response to one way request"));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo16232a() {
        return true;
    }
}
