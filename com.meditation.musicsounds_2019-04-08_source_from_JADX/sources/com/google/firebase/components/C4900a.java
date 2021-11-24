package com.google.firebase.components;

import com.google.android.gms.common.internal.C3266s;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.a */
public final class C4900a<T> {

    /* renamed from: a */
    private final Set<Class<? super T>> f17632a;

    /* renamed from: b */
    private final Set<C4906e> f17633b;

    /* renamed from: c */
    private final int f17634c;

    /* renamed from: d */
    private final C4904c<T> f17635d;

    /* renamed from: e */
    private final Set<Class<?>> f17636e;

    /* renamed from: com.google.firebase.components.a$a */
    public static class C4902a<T> {

        /* renamed from: a */
        private final Set<Class<? super T>> f17639a;

        /* renamed from: b */
        private final Set<C4906e> f17640b;

        /* renamed from: c */
        private int f17641c;

        /* renamed from: d */
        private C4904c<T> f17642d;

        /* renamed from: e */
        private Set<Class<?>> f17643e;

        private C4902a(Class<T> cls, Class<? super T>... clsArr) {
            this.f17639a = new HashSet();
            this.f17640b = new HashSet();
            this.f17641c = 0;
            this.f17643e = new HashSet();
            C3266s.m14914a(cls, (Object) "Null interface");
            this.f17639a.add(cls);
            for (Class<? super T> a : clsArr) {
                C3266s.m14914a(a, (Object) "Null interface");
            }
            Collections.addAll(this.f17639a, clsArr);
        }

        /* synthetic */ C4902a(Class cls, Class[] clsArr, byte b) {
            this(cls, clsArr);
        }

        /* renamed from: a */
        private C4902a<T> m24452a(int i) {
            C3266s.m14920a(this.f17641c == 0, (Object) "Instantiation type has already been set.");
            this.f17641c = i;
            return this;
        }

        /* renamed from: a */
        public C4902a<T> mo16126a() {
            return m24452a(1);
        }

        /* renamed from: a */
        public C4902a<T> mo16127a(C4904c<T> cVar) {
            this.f17642d = (C4904c) C3266s.m14914a(cVar, (Object) "Null factory");
            return this;
        }

        /* renamed from: a */
        public C4902a<T> mo16128a(C4906e eVar) {
            C3266s.m14914a(eVar, (Object) "Null dependency");
            C3266s.m14924b(!this.f17639a.contains(eVar.mo16133a()), "Components are not allowed to depend on interfaces they themselves provide.");
            this.f17640b.add(eVar);
            return this;
        }

        /* renamed from: b */
        public C4902a<T> mo16129b() {
            return m24452a(2);
        }

        /* renamed from: c */
        public C4900a<T> mo16130c() {
            C3266s.m14920a(this.f17642d != null, (Object) "Missing required property: factory.");
            C4900a aVar = new C4900a(new HashSet(this.f17639a), new HashSet(this.f17640b), this.f17641c, this.f17642d, this.f17643e, 0);
            return aVar;
        }
    }

    private C4900a(Set<Class<? super T>> set, Set<C4906e> set2, int i, C4904c<T> cVar, Set<Class<?>> set3) {
        this.f17632a = Collections.unmodifiableSet(set);
        this.f17633b = Collections.unmodifiableSet(set2);
        this.f17634c = i;
        this.f17635d = cVar;
        this.f17636e = Collections.unmodifiableSet(set3);
    }

    /* synthetic */ C4900a(Set set, Set set2, int i, C4904c cVar, Set set3, byte b) {
        this(set, set2, i, cVar, set3);
    }

    /* renamed from: a */
    public static <T> C4902a<T> m24437a(Class<T> cls) {
        return new C4902a<>(cls, new Class[0], 0);
    }

    /* renamed from: a */
    public static <T> C4902a<T> m24438a(Class<T> cls, Class<? super T>... clsArr) {
        return new C4902a<>(cls, clsArr, 0);
    }

    @SafeVarargs
    /* renamed from: a */
    public static <T> C4900a<T> m24439a(T t, Class<T> cls, Class<? super T>... clsArr) {
        return m24438a(cls, clsArr).mo16127a(C4908g.m24466a((Object) t)).mo16130c();
    }

    /* renamed from: a */
    static /* synthetic */ Object m24440a(Object obj) {
        return obj;
    }

    /* renamed from: a */
    public final Set<Class<? super T>> mo16118a() {
        return this.f17632a;
    }

    /* renamed from: b */
    public final Set<C4906e> mo16119b() {
        return this.f17633b;
    }

    /* renamed from: c */
    public final C4904c<T> mo16120c() {
        return this.f17635d;
    }

    /* renamed from: d */
    public final Set<Class<?>> mo16121d() {
        return this.f17636e;
    }

    /* renamed from: e */
    public final boolean mo16122e() {
        return this.f17634c == 1;
    }

    /* renamed from: f */
    public final boolean mo16123f() {
        return this.f17634c == 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Component<");
        sb.append(Arrays.toString(this.f17632a.toArray()));
        sb.append(">{");
        sb.append(this.f17634c);
        sb.append(", deps=");
        sb.append(Arrays.toString(this.f17633b.toArray()));
        sb.append("}");
        return sb.toString();
    }
}
