package android.arch.lifecycle;

import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.Lifecycle.State;
import android.arch.p001a.p003b.C0006a;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: android.arch.lifecycle.e */
public class C0024e extends Lifecycle {

    /* renamed from: a */
    private C0006a<C0022c, C0026a> f53a = new C0006a<>();

    /* renamed from: b */
    private State f54b;

    /* renamed from: c */
    private final WeakReference<C0023d> f55c;

    /* renamed from: d */
    private int f56d = 0;

    /* renamed from: e */
    private boolean f57e = false;

    /* renamed from: f */
    private boolean f58f = false;

    /* renamed from: g */
    private ArrayList<State> f59g = new ArrayList<>();

    /* renamed from: android.arch.lifecycle.e$a */
    static class C0026a {

        /* renamed from: a */
        State f62a;

        /* renamed from: b */
        GenericLifecycleObserver f63b;

        C0026a(C0022c cVar, State state) {
            this.f63b = C0028g.m107a((Object) cVar);
            this.f62a = state;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo68a(C0023d dVar, Event event) {
            State b = C0024e.m90b(event);
            this.f62a = C0024e.m88a(this.f62a, b);
            this.f63b.mo34a(dVar, event);
            this.f62a = b;
        }
    }

    public C0024e(C0023d dVar) {
        this.f55c = new WeakReference<>(dVar);
        this.f54b = State.INITIALIZED;
    }

    /* renamed from: a */
    static State m88a(State state, State state2) {
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }

    /* renamed from: a */
    private void m89a(C0023d dVar) {
        C0012d c = this.f53a.mo14c();
        while (c.hasNext() && !this.f58f) {
            Entry entry = (Entry) c.next();
            C0026a aVar = (C0026a) entry.getValue();
            while (aVar.f62a.compareTo(this.f54b) < 0 && !this.f58f && this.f53a.mo9c(entry.getKey())) {
                m96c(aVar.f62a);
                aVar.mo68a(dVar, m99e(aVar.f62a));
                m95c();
            }
        }
    }

    /* renamed from: b */
    static State m90b(Event event) {
        switch (event) {
            case ON_CREATE:
            case ON_STOP:
                return State.CREATED;
            case ON_START:
            case ON_PAUSE:
                return State.STARTED;
            case ON_RESUME:
                return State.RESUMED;
            case ON_DESTROY:
                return State.DESTROYED;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected event value ");
                sb.append(event);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    private void m91b(State state) {
        if (this.f54b != state) {
            this.f54b = state;
            if (this.f57e || this.f56d != 0) {
                this.f58f = true;
                return;
            }
            this.f57e = true;
            m98d();
            this.f57e = false;
        }
    }

    /* renamed from: b */
    private void m92b(C0023d dVar) {
        Iterator b = this.f53a.mo13b();
        while (b.hasNext() && !this.f58f) {
            Entry entry = (Entry) b.next();
            C0026a aVar = (C0026a) entry.getValue();
            while (aVar.f62a.compareTo(this.f54b) > 0 && !this.f58f && this.f53a.mo9c(entry.getKey())) {
                Event d = m97d(aVar.f62a);
                m96c(m90b(d));
                aVar.mo68a(dVar, d);
                m95c();
            }
        }
    }

    /* renamed from: b */
    private boolean m93b() {
        boolean z = true;
        if (this.f53a.mo11a() == 0) {
            return true;
        }
        State state = ((C0026a) this.f53a.mo15d().getValue()).f62a;
        State state2 = ((C0026a) this.f53a.mo16e().getValue()).f62a;
        if (!(state == state2 && this.f54b == state2)) {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    private State m94c(C0022c cVar) {
        Entry d = this.f53a.mo10d(cVar);
        State state = null;
        State state2 = d != null ? ((C0026a) d.getValue()).f62a : null;
        if (!this.f59g.isEmpty()) {
            state = (State) this.f59g.get(this.f59g.size() - 1);
        }
        return m88a(m88a(this.f54b, state2), state);
    }

    /* renamed from: c */
    private void m95c() {
        this.f59g.remove(this.f59g.size() - 1);
    }

    /* renamed from: c */
    private void m96c(State state) {
        this.f59g.add(state);
    }

    /* renamed from: d */
    private static Event m97d(State state) {
        switch (state) {
            case INITIALIZED:
                throw new IllegalArgumentException();
            case CREATED:
                return Event.ON_DESTROY;
            case STARTED:
                return Event.ON_STOP;
            case RESUMED:
                return Event.ON_PAUSE;
            case DESTROYED:
                throw new IllegalArgumentException();
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected state value ");
                sb.append(state);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: d */
    private void m98d() {
        C0023d dVar = (C0023d) this.f55c.get();
        if (dVar == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (!m93b()) {
            this.f58f = false;
            if (this.f54b.compareTo(((C0026a) this.f53a.mo15d().getValue()).f62a) < 0) {
                m92b(dVar);
            }
            Entry e = this.f53a.mo16e();
            if (!this.f58f && e != null && this.f54b.compareTo(((C0026a) e.getValue()).f62a) > 0) {
                m89a(dVar);
            }
        }
        this.f58f = false;
    }

    /* renamed from: e */
    private static Event m99e(State state) {
        switch (state) {
            case INITIALIZED:
            case DESTROYED:
                return Event.ON_CREATE;
            case CREATED:
                return Event.ON_START;
            case STARTED:
                return Event.ON_RESUME;
            case RESUMED:
                throw new IllegalArgumentException();
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected state value ");
                sb.append(state);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public State mo41a() {
        return this.f54b;
    }

    /* renamed from: a */
    public void mo66a(Event event) {
        m91b(m90b(event));
    }

    /* renamed from: a */
    public void mo67a(State state) {
        m91b(state);
    }

    /* renamed from: a */
    public void mo42a(C0022c cVar) {
        C0026a aVar = new C0026a(cVar, this.f54b == State.DESTROYED ? State.DESTROYED : State.INITIALIZED);
        if (((C0026a) this.f53a.mo7a(cVar, aVar)) == null) {
            C0023d dVar = (C0023d) this.f55c.get();
            if (dVar != null) {
                boolean z = this.f56d != 0 || this.f57e;
                State c = m94c(cVar);
                this.f56d++;
                while (aVar.f62a.compareTo(c) < 0 && this.f53a.mo9c(cVar)) {
                    m96c(aVar.f62a);
                    aVar.mo68a(dVar, m99e(aVar.f62a));
                    m95c();
                    c = m94c(cVar);
                }
                if (!z) {
                    m98d();
                }
                this.f56d--;
            }
        }
    }

    /* renamed from: b */
    public void mo43b(C0022c cVar) {
        this.f53a.mo8b(cVar);
    }
}
