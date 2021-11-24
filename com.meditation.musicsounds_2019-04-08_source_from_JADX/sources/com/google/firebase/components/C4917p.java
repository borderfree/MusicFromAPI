package com.google.firebase.components;

import com.google.firebase.p134a.C4882c;
import com.google.firebase.p135b.C4896a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.p */
final class C4917p extends C4907f {

    /* renamed from: a */
    private final Set<Class<?>> f17664a;

    /* renamed from: b */
    private final Set<Class<?>> f17665b;

    /* renamed from: c */
    private final Set<Class<?>> f17666c;

    /* renamed from: d */
    private final C4903b f17667d;

    /* renamed from: com.google.firebase.components.p$a */
    static class C4918a implements C4882c {

        /* renamed from: a */
        private final Set<Class<?>> f17668a;

        /* renamed from: b */
        private final C4882c f17669b;

        public C4918a(Set<Class<?>> set, C4882c cVar) {
            this.f17668a = set;
            this.f17669b = cVar;
        }
    }

    C4917p(C4900a<?> aVar, C4903b bVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C4906e eVar : aVar.mo16119b()) {
            if (eVar.mo16135c()) {
                hashSet.add(eVar.mo16133a());
            } else {
                hashSet2.add(eVar.mo16133a());
            }
        }
        if (!aVar.mo16121d().isEmpty()) {
            hashSet.add(C4882c.class);
        }
        this.f17664a = Collections.unmodifiableSet(hashSet);
        this.f17665b = Collections.unmodifiableSet(hashSet2);
        this.f17666c = aVar.mo16121d();
        this.f17667d = bVar;
    }

    /* renamed from: a */
    public final <T> T mo16131a(Class<T> cls) {
        if (this.f17664a.contains(cls)) {
            T a = this.f17667d.mo16131a(cls);
            return !cls.equals(C4882c.class) ? a : new C4918a(this.f17666c, (C4882c) a);
        }
        throw new IllegalArgumentException(String.format("Requesting %s is not allowed.", new Object[]{cls}));
    }

    /* renamed from: b */
    public final <T> C4896a<T> mo16132b(Class<T> cls) {
        if (this.f17665b.contains(cls)) {
            return this.f17667d.mo16132b(cls);
        }
        throw new IllegalArgumentException(String.format("Requesting Provider<%s> is not allowed.", new Object[]{cls}));
    }
}
