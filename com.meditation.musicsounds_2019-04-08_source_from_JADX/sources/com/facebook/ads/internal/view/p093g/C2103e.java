package com.facebook.ads.internal.view.p093g;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.facebook.ads.internal.view.g.e */
class C2103e extends ContentObserver {

    /* renamed from: a */
    private final C2041c f6889a;

    C2103e(Handler handler, C2041c cVar) {
        super(handler);
        this.f6889a = cVar;
    }

    public boolean deliverSelfNotifications() {
        return false;
    }

    public void onChange(boolean z) {
        this.f6889a.mo7495e();
    }
}
