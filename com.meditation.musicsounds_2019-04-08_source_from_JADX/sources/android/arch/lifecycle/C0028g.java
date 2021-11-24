package android.arch.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: android.arch.lifecycle.g */
public class C0028g {

    /* renamed from: a */
    private static Map<Class, Integer> f64a = new HashMap();

    /* renamed from: b */
    private static Map<Class, List<Constructor<? extends C0021b>>> f65b = new HashMap();

    /* renamed from: a */
    static GenericLifecycleObserver m107a(Object obj) {
        if (obj instanceof FullLifecycleObserver) {
            return new FullLifecycleObserverAdapter((FullLifecycleObserver) obj);
        }
        if (obj instanceof GenericLifecycleObserver) {
            return (GenericLifecycleObserver) obj;
        }
        Class cls = obj.getClass();
        if (m111b(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = (List) f65b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m108a((Constructor) list.get(0), obj));
        }
        C0021b[] bVarArr = new C0021b[list.size()];
        for (int i = 0; i < list.size(); i++) {
            bVarArr[i] = m108a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(bVarArr);
    }

    /* renamed from: a */
    private static C0021b m108a(Constructor<? extends C0021b> constructor, Object obj) {
        try {
            return (C0021b) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: a */
    public static String m109a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.replace(".", "_"));
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }

    /* renamed from: a */
    private static Constructor<? extends C0021b> m110a(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String a = m109a(canonicalName);
            if (!name.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append(name);
                sb.append(".");
                sb.append(a);
                a = sb.toString();
            }
            Constructor<? extends C0021b> declaredConstructor = Class.forName(a).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static int m111b(Class<?> cls) {
        if (f64a.containsKey(cls)) {
            return ((Integer) f64a.get(cls)).intValue();
        }
        int c = m112c(cls);
        f64a.put(cls, Integer.valueOf(c));
        return c;
    }

    /* renamed from: c */
    private static int m112c(Class<?> cls) {
        Class[] interfaces;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor a = m110a(cls);
        if (a != null) {
            f65b.put(cls, Collections.singletonList(a));
            return 2;
        } else if (C0018a.f46a.mo58a(cls)) {
            return 1;
        } else {
            Class superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m113d(superclass)) {
                if (m111b(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList((Collection) f65b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (m113d(cls2)) {
                    if (m111b(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll((Collection) f65b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f65b.put(cls, arrayList);
            return 2;
        }
    }

    /* renamed from: d */
    private static boolean m113d(Class<?> cls) {
        return cls != null && C0022c.class.isAssignableFrom(cls);
    }
}
