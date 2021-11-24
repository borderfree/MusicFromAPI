package android.arch.lifecycle;

import android.arch.lifecycle.Lifecycle.Event;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: android.arch.lifecycle.a */
class C0018a {

    /* renamed from: a */
    static C0018a f46a = new C0018a();

    /* renamed from: b */
    private final Map<Class, C0019a> f47b = new HashMap();

    /* renamed from: c */
    private final Map<Class, Boolean> f48c = new HashMap();

    /* renamed from: android.arch.lifecycle.a$a */
    static class C0019a {

        /* renamed from: a */
        final Map<Event, List<C0020b>> f49a = new HashMap();

        /* renamed from: b */
        final Map<C0020b, Event> f50b;

        C0019a(Map<C0020b, Event> map) {
            this.f50b = map;
            for (Entry entry : map.entrySet()) {
                Event event = (Event) entry.getValue();
                List list = (List) this.f49a.get(event);
                if (list == null) {
                    list = new ArrayList();
                    this.f49a.put(event, list);
                }
                list.add(entry.getKey());
            }
        }

        /* renamed from: a */
        private static void m83a(List<C0020b> list, C0023d dVar, Event event, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0020b) list.get(size)).mo61a(dVar, event, obj);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo60a(C0023d dVar, Event event, Object obj) {
            m83a((List) this.f49a.get(event), dVar, event, obj);
            m83a((List) this.f49a.get(Event.ON_ANY), dVar, event, obj);
        }
    }

    /* renamed from: android.arch.lifecycle.a$b */
    static class C0020b {

        /* renamed from: a */
        final int f51a;

        /* renamed from: b */
        final Method f52b;

        C0020b(int i, Method method) {
            this.f51a = i;
            this.f52b = method;
            this.f52b.setAccessible(true);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo61a(C0023d dVar, Event event, Object obj) {
            try {
                switch (this.f51a) {
                    case 0:
                        this.f52b.invoke(obj, new Object[0]);
                        return;
                    case 1:
                        this.f52b.invoke(obj, new Object[]{dVar});
                        return;
                    case 2:
                        this.f52b.invoke(obj, new Object[]{dVar, event});
                        return;
                    default:
                        return;
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0020b bVar = (C0020b) obj;
            if (this.f51a != bVar.f51a || !this.f52b.getName().equals(bVar.f52b.getName())) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (this.f51a * 31) + this.f52b.getName().hashCode();
        }
    }

    C0018a() {
    }

    /* renamed from: a */
    private C0019a m78a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            C0019a b = mo59b(superclass);
            if (b != null) {
                hashMap.putAll(b.f50b);
            }
        }
        for (Class b2 : cls.getInterfaces()) {
            for (Entry entry : mo59b(b2).f50b.entrySet()) {
                m79a(hashMap, (C0020b) entry.getKey(), (Event) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m80c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            C0032k kVar = (C0032k) method.getAnnotation(C0032k.class);
            if (kVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C0023d.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                Event a = kVar.mo71a();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(Event.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (a == Event.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m79a(hashMap, new C0020b(i, method), a, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0019a aVar = new C0019a(hashMap);
        this.f47b.put(cls, aVar);
        this.f48c.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: a */
    private void m79a(Map<C0020b, Event> map, C0020b bVar, Event event, Class cls) {
        Event event2 = (Event) map.get(bVar);
        if (event2 != null && event != event2) {
            Method method = bVar.f52b;
            StringBuilder sb = new StringBuilder();
            sb.append("Method ");
            sb.append(method.getName());
            sb.append(" in ");
            sb.append(cls.getName());
            sb.append(" already declared with different @OnLifecycleEvent value: previous");
            sb.append(" value ");
            sb.append(event2);
            sb.append(", new value ");
            sb.append(event);
            throw new IllegalArgumentException(sb.toString());
        } else if (event2 == null) {
            map.put(bVar, event);
        }
    }

    /* renamed from: c */
    private Method[] m80c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo58a(Class cls) {
        if (this.f48c.containsKey(cls)) {
            return ((Boolean) this.f48c.get(cls)).booleanValue();
        }
        Method[] c = m80c(cls);
        for (Method annotation : c) {
            if (((C0032k) annotation.getAnnotation(C0032k.class)) != null) {
                m78a(cls, c);
                return true;
            }
        }
        this.f48c.put(cls, Boolean.valueOf(false));
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0019a mo59b(Class cls) {
        C0019a aVar = (C0019a) this.f47b.get(cls);
        return aVar != null ? aVar : m78a(cls, null);
    }
}
