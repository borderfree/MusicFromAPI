package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.hj */
final class C4439hj {

    /* renamed from: a */
    private static final Class<?> f16214a = m21873d();

    /* renamed from: b */
    private static final C4455hz<?, ?> f16215b = m21848a(false);

    /* renamed from: c */
    private static final C4455hz<?, ?> f16216c = m21848a(true);

    /* renamed from: d */
    private static final C4455hz<?, ?> f16217d = new C4458ib();

    /* renamed from: a */
    static int m21842a(int i, Object obj, C4437hh hhVar) {
        return obj instanceof C4400fy ? zztv.m22406a(i, (C4400fy) obj) : zztv.m22415b(i, (C4419gq) obj, hhVar);
    }

    /* renamed from: a */
    static int m21843a(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int e = zztv.m22433e(i) * size;
        if (list instanceof C4403ga) {
            C4403ga gaVar = (C4403ga) list;
            while (i2 < size) {
                Object b = gaVar.mo14530b(i2);
                e += b instanceof zzte ? zztv.m22420b((zzte) b) : zztv.m22421b((String) b);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                e += obj instanceof zzte ? zztv.m22420b((zzte) obj) : zztv.m22421b((String) obj);
                i2++;
            }
        }
        return e;
    }

    /* renamed from: a */
    static int m21844a(int i, List<?> list, C4437hh hhVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = zztv.m22433e(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            e += obj instanceof C4400fy ? zztv.m22407a((C4400fy) obj) : zztv.m22419b((C4419gq) obj, hhVar);
        }
        return e;
    }

    /* renamed from: a */
    static int m21845a(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m21846a(list) + (list.size() * zztv.m22433e(i));
    }

    /* renamed from: a */
    static int m21846a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4408gf) {
            C4408gf gfVar = (C4408gf) list;
            i = 0;
            while (i2 < size) {
                i += zztv.m22432d(gfVar.mo14554b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zztv.m22432d(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static C4455hz<?, ?> m21847a() {
        return f16215b;
    }

    /* renamed from: a */
    private static C4455hz<?, ?> m21848a(boolean z) {
        try {
            Class e = m21877e();
            if (e == null) {
                return null;
            }
            return (C4455hz) e.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static <UT, UB> UB m21849a(int i, int i2, UB ub, C4455hz<UT, UB> hzVar) {
        if (ub == null) {
            ub = hzVar.mo14642a();
        }
        hzVar.mo14645a(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: a */
    static <UT, UB> UB m21850a(int i, List<Integer> list, C4393fr frVar, UB ub, C4455hz<UT, UB> hzVar) {
        UB ub2;
        if (frVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            loop1:
            while (true) {
                ub2 = ub;
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (!frVar.mo14222a(intValue)) {
                        ub = m21849a(i, intValue, ub2, hzVar);
                        it.remove();
                    }
                }
                break loop1;
            }
        } else {
            int size = list.size();
            ub2 = ub;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue2 = ((Integer) list.get(i3)).intValue();
                if (frVar.mo14222a(intValue2)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue2));
                    }
                    i2++;
                } else {
                    ub2 = m21849a(i, intValue2, ub2, hzVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        }
        return ub2;
    }

    /* renamed from: a */
    public static void m21851a(int i, List<String> list, C4474in inVar) {
        if (list != null && !list.isEmpty()) {
            inVar.mo14417a(i, list);
        }
    }

    /* renamed from: a */
    public static void m21852a(int i, List<?> list, C4474in inVar, C4437hh hhVar) {
        if (list != null && !list.isEmpty()) {
            inVar.mo14418a(i, list, hhVar);
        }
    }

    /* renamed from: a */
    public static void m21853a(int i, List<Double> list, C4474in inVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            inVar.mo14439g(i, list, z);
        }
    }

    /* renamed from: a */
    static <T, FT extends C4378fh<FT>> void m21854a(C4373fc<FT> fcVar, T t, T t2) {
        C4376ff a = fcVar.mo14457a((Object) t2);
        if (!a.mo14467b()) {
            fcVar.mo14464b(t).mo14466a(a);
        }
    }

    /* renamed from: a */
    static <T> void m21855a(C4414gl glVar, T t, T t2, long j) {
        C4462if.m22005a((Object) t, j, glVar.mo14560a(C4462if.m22028f(t, j), C4462if.m22028f(t2, j)));
    }

    /* renamed from: a */
    static <T, UT, UB> void m21856a(C4455hz<UT, UB> hzVar, T t, T t2) {
        hzVar.mo14649a((Object) t, hzVar.mo14657c(hzVar.mo14652b(t), hzVar.mo14652b(t2)));
    }

    /* renamed from: a */
    public static void m21857a(Class<?> cls) {
        if (!C4383fm.class.isAssignableFrom(cls) && f16214a != null && !f16214a.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: a */
    static boolean m21858a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    static int m21859b(int i, List<zzte> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = size * zztv.m22433e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e += zztv.m22420b((zzte) list.get(i2));
        }
        return e;
    }

    /* renamed from: b */
    static int m21860b(int i, List<C4419gq> list, C4437hh hhVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zztv.m22425c(i, (C4419gq) list.get(i3), hhVar);
        }
        return i2;
    }

    /* renamed from: b */
    static int m21861b(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m21862b(list) + (size * zztv.m22433e(i));
    }

    /* renamed from: b */
    static int m21862b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4408gf) {
            C4408gf gfVar = (C4408gf) list;
            i = 0;
            while (i2 < size) {
                i += zztv.m22435e(gfVar.mo14554b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zztv.m22435e(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static C4455hz<?, ?> m21863b() {
        return f16216c;
    }

    /* renamed from: b */
    public static void m21864b(int i, List<zzte> list, C4474in inVar) {
        if (list != null && !list.isEmpty()) {
            inVar.mo14425b(i, list);
        }
    }

    /* renamed from: b */
    public static void m21865b(int i, List<?> list, C4474in inVar, C4437hh hhVar) {
        if (list != null && !list.isEmpty()) {
            inVar.mo14426b(i, list, hhVar);
        }
    }

    /* renamed from: b */
    public static void m21866b(int i, List<Float> list, C4474in inVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            inVar.mo14438f(i, list, z);
        }
    }

    /* renamed from: c */
    static int m21867c(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m21868c(list) + (size * zztv.m22433e(i));
    }

    /* renamed from: c */
    static int m21868c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4408gf) {
            C4408gf gfVar = (C4408gf) list;
            i = 0;
            while (i2 < size) {
                i += zztv.m22439f(gfVar.mo14554b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zztv.m22439f(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public static C4455hz<?, ?> m21869c() {
        return f16217d;
    }

    /* renamed from: c */
    public static void m21870c(int i, List<Long> list, C4474in inVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            inVar.mo14430c(i, list, z);
        }
    }

    /* renamed from: d */
    static int m21871d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m21872d(list) + (size * zztv.m22433e(i));
    }

    /* renamed from: d */
    static int m21872d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4389fn) {
            C4389fn fnVar = (C4389fn) list;
            i = 0;
            while (i2 < size) {
                i += zztv.m22453k(fnVar.mo14510b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zztv.m22453k(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: d */
    private static Class<?> m21873d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m21874d(int i, List<Long> list, C4474in inVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            inVar.mo14433d(i, list, z);
        }
    }

    /* renamed from: e */
    static int m21875e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m21876e(list) + (size * zztv.m22433e(i));
    }

    /* renamed from: e */
    static int m21876e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4389fn) {
            C4389fn fnVar = (C4389fn) list;
            i = 0;
            while (i2 < size) {
                i += zztv.m22436f(fnVar.mo14510b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zztv.m22436f(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e */
    private static Class<?> m21877e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static void m21878e(int i, List<Long> list, C4474in inVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            inVar.mo14446n(i, list, z);
        }
    }

    /* renamed from: f */
    static int m21879f(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m21880f(list) + (size * zztv.m22433e(i));
    }

    /* renamed from: f */
    static int m21880f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4389fn) {
            C4389fn fnVar = (C4389fn) list;
            i = 0;
            while (i2 < size) {
                i += zztv.m22440g(fnVar.mo14510b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zztv.m22440g(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    public static void m21881f(int i, List<Long> list, C4474in inVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            inVar.mo14436e(i, list, z);
        }
    }

    /* renamed from: g */
    static int m21882g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m21883g(list) + (size * zztv.m22433e(i));
    }

    /* renamed from: g */
    static int m21883g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4389fn) {
            C4389fn fnVar = (C4389fn) list;
            i = 0;
            while (i2 < size) {
                i += zztv.m22444h(fnVar.mo14510b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zztv.m22444h(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: g */
    public static void m21884g(int i, List<Long> list, C4474in inVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            inVar.mo14444l(i, list, z);
        }
    }

    /* renamed from: h */
    static int m21885h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zztv.m22449i(i, 0);
    }

    /* renamed from: h */
    static int m21886h(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: h */
    public static void m21887h(int i, List<Integer> list, C4474in inVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            inVar.mo14419a(i, list, z);
        }
    }

    /* renamed from: i */
    static int m21888i(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zztv.m22442g(i, 0);
    }

    /* renamed from: i */
    static int m21889i(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: i */
    public static void m21890i(int i, List<Integer> list, C4474in inVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            inVar.mo14442j(i, list, z);
        }
    }

    /* renamed from: j */
    static int m21891j(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zztv.m22417b(i, true);
    }

    /* renamed from: j */
    static int m21892j(List<?> list) {
        return list.size();
    }

    /* renamed from: j */
    public static void m21893j(int i, List<Integer> list, C4474in inVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            inVar.mo14445m(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m21894k(int i, List<Integer> list, C4474in inVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            inVar.mo14427b(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m21895l(int i, List<Integer> list, C4474in inVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            inVar.mo14443k(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m21896m(int i, List<Integer> list, C4474in inVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            inVar.mo14440h(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m21897n(int i, List<Boolean> list, C4474in inVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            inVar.mo14441i(i, list, z);
        }
    }
}
