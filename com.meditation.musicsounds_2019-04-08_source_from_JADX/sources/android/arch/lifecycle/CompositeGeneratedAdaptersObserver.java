package android.arch.lifecycle;

import android.arch.lifecycle.Lifecycle.Event;

public class CompositeGeneratedAdaptersObserver implements GenericLifecycleObserver {

    /* renamed from: a */
    private final C0021b[] f22a;

    CompositeGeneratedAdaptersObserver(C0021b[] bVarArr) {
        this.f22a = bVarArr;
    }

    /* renamed from: a */
    public void mo34a(C0023d dVar, Event event) {
        C0029h hVar = new C0029h();
        for (C0021b a : this.f22a) {
            a.mo64a(dVar, event, false, hVar);
        }
        for (C0021b a2 : this.f22a) {
            a2.mo64a(dVar, event, true, hVar);
        }
    }
}
