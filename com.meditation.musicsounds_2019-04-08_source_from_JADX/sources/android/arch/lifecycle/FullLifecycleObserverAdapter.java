package android.arch.lifecycle;

import android.arch.lifecycle.Lifecycle.Event;

class FullLifecycleObserverAdapter implements GenericLifecycleObserver {

    /* renamed from: a */
    private final FullLifecycleObserver f23a;

    FullLifecycleObserverAdapter(FullLifecycleObserver fullLifecycleObserver) {
        this.f23a = fullLifecycleObserver;
    }

    /* renamed from: a */
    public void mo34a(C0023d dVar, Event event) {
        switch (event) {
            case ON_CREATE:
                this.f23a.mo35a(dVar);
                return;
            case ON_START:
                this.f23a.mo36b(dVar);
                return;
            case ON_RESUME:
                this.f23a.mo37c(dVar);
                return;
            case ON_PAUSE:
                this.f23a.mo38d(dVar);
                return;
            case ON_STOP:
                this.f23a.mo39e(dVar);
                return;
            case ON_DESTROY:
                this.f23a.mo40f(dVar);
                return;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}
