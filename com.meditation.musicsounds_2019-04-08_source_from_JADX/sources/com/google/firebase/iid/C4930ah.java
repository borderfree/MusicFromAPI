package com.google.firebase.iid;

import android.util.Log;

/* renamed from: com.google.firebase.iid.ah */
final class C4930ah implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4927ae f17709a;

    /* renamed from: b */
    private final /* synthetic */ C4929ag f17710b;

    C4930ah(C4929ag agVar, C4927ae aeVar) {
        this.f17710b = agVar;
        this.f17709a = aeVar;
    }

    public final void run() {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "bg processing of the intent starting now");
        }
        this.f17710b.f17708a.mo16177b(this.f17709a.f17702a);
        this.f17709a.mo16187a();
    }
}
