package android.arch.lifecycle;

import android.arch.lifecycle.Lifecycle.Event;

class ReflectiveGenericLifecycleObserver implements GenericLifecycleObserver {

    /* renamed from: a */
    private final Object f43a;

    /* renamed from: b */
    private final C0019a f44b = C0018a.f46a.mo59b(this.f43a.getClass());

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f43a = obj;
    }

    /* renamed from: a */
    public void mo34a(C0023d dVar, Event event) {
        this.f44b.mo60a(dVar, event, this.f43a);
    }
}
