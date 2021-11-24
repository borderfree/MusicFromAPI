package android.arch.lifecycle;

import android.arch.lifecycle.Lifecycle.Event;

public class SingleGeneratedAdapterObserver implements GenericLifecycleObserver {

    /* renamed from: a */
    private final C0021b f45a;

    SingleGeneratedAdapterObserver(C0021b bVar) {
        this.f45a = bVar;
    }

    /* renamed from: a */
    public void mo34a(C0023d dVar, Event event) {
        this.f45a.mo64a(dVar, event, false, null);
        this.f45a.mo64a(dVar, event, true, null);
    }
}
