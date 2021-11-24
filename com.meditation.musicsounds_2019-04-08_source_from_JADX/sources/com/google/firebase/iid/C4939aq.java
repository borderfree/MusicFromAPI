package com.google.firebase.iid;

import com.google.firebase.p134a.C4880a;
import com.google.firebase.p134a.C4881b;

/* renamed from: com.google.firebase.iid.aq */
final /* synthetic */ class C4939aq implements C4881b {

    /* renamed from: a */
    private final C4919a f17735a;

    C4939aq(C4919a aVar) {
        this.f17735a = aVar;
    }

    /* renamed from: a */
    public final void mo16084a(C4880a aVar) {
        C4919a aVar2 = this.f17735a;
        synchronized (aVar2) {
            if (aVar2.mo16173a()) {
                FirebaseInstanceId.this.m24506o();
            }
        }
    }
}
