package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* renamed from: com.google.firebase.iid.ag */
public final class C4929ag extends Binder {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4924ab f17708a;

    C4929ag(C4924ab abVar) {
        this.f17708a = abVar;
    }

    /* renamed from: a */
    public final void mo16189a(C4927ae aeVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "service received new intent via bind strategy");
            }
            if (this.f17708a.mo16181c(aeVar.f17702a)) {
                aeVar.mo16187a();
                return;
            }
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "intent being queued for bg execution");
            }
            this.f17708a.f17691a.execute(new C4930ah(this, aeVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
