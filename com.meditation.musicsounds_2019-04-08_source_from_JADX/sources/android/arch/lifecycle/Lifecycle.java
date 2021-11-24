package android.arch.lifecycle;

public abstract class Lifecycle {

    public enum Event {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    public enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public boolean isAtLeast(State state) {
            return compareTo(state) >= 0;
        }
    }

    /* renamed from: a */
    public abstract State mo41a();

    /* renamed from: a */
    public abstract void mo42a(C0022c cVar);

    /* renamed from: b */
    public abstract void mo43b(C0022c cVar);
}
