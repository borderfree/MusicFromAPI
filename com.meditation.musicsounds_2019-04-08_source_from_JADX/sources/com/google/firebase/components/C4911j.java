package com.google.firebase.components;

import com.google.android.gms.common.internal.C3266s;
import com.google.firebase.components.C4900a.C49011;
import com.google.firebase.p134a.C4882c;
import com.google.firebase.p134a.C4883d;
import com.google.firebase.p135b.C4896a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.components.j */
public final class C4911j extends C4907f {

    /* renamed from: a */
    private final List<C4900a<?>> f17648a;

    /* renamed from: b */
    private final Map<Class<?>, C4915n<?>> f17649b = new HashMap();

    /* renamed from: c */
    private final C4913l f17650c;

    public C4911j(Executor executor, Iterable<C4905d> iterable, C4900a<?>... aVarArr) {
        this.f17650c = new C4913l(executor);
        ArrayList arrayList = new ArrayList();
        arrayList.add(C4900a.m24439a(this.f17650c, C4913l.class, C4883d.class, C4882c.class));
        for (C4905d components : iterable) {
            arrayList.addAll(components.getComponents());
        }
        Collections.addAll(arrayList, aVarArr);
        this.f17648a = Collections.unmodifiableList(C49011.m24448a((List<C4900a<?>>) arrayList));
        for (C4900a a : this.f17648a) {
            m24472a(a);
        }
        m24471a();
    }

    /* renamed from: a */
    private void m24471a() {
        for (C4900a aVar : this.f17648a) {
            Iterator it = aVar.mo16119b().iterator();
            while (true) {
                if (it.hasNext()) {
                    C4906e eVar = (C4906e) it.next();
                    if (eVar.mo16134b() && !this.f17649b.containsKey(eVar.mo16133a())) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", new Object[]{aVar, eVar.mo16133a()}));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private <T> void m24472a(C4900a<T> aVar) {
        C4915n nVar = new C4915n(aVar.mo16120c(), new C4917p(aVar, this));
        for (Class put : aVar.mo16118a()) {
            this.f17649b.put(put, nVar);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo16131a(Class cls) {
        return super.mo16131a(cls);
    }

    /* renamed from: a */
    public final void mo16140a(boolean z) {
        for (C4900a aVar : this.f17648a) {
            if (aVar.mo16122e() || (aVar.mo16123f() && z)) {
                mo16131a((Class) aVar.mo16118a().iterator().next());
            }
        }
        this.f17650c.mo16148a();
    }

    /* renamed from: b */
    public final <T> C4896a<T> mo16132b(Class<T> cls) {
        C3266s.m14914a(cls, (Object) "Null interface requested.");
        return (C4896a) this.f17649b.get(cls);
    }
}
