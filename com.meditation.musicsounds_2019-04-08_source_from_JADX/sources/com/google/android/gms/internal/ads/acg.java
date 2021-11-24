package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class acg {

    /* renamed from: a */
    private static final Class<?> f11469a = m15687d();

    /* renamed from: b */
    private static final acw<?, ?> f11470b = m15661a(false);

    /* renamed from: c */
    private static final acw<?, ?> f11471c = m15661a(true);

    /* renamed from: d */
    private static final acw<?, ?> f11472d = new acy();

    /* renamed from: a */
    static int m15655a(int i, Object obj, ace ace) {
        return obj instanceof aat ? zzbav.m20638a(i, (aat) obj) : zzbav.m20648b(i, (abl) obj, ace);
    }

    /* renamed from: a */
    static int m15656a(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int e = zzbav.m20663e(i) * size;
        if (list instanceof aav) {
            aav aav = (aav) list;
            while (i2 < size) {
                Object b = aav.mo11521b(i2);
                e += b instanceof zzbah ? zzbav.m20652b((zzbah) b) : zzbav.m20653b((String) b);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                e += obj instanceof zzbah ? zzbav.m20652b((zzbah) obj) : zzbav.m20653b((String) obj);
                i2++;
            }
        }
        return e;
    }

    /* renamed from: a */
    static int m15657a(int i, List<?> list, ace ace) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = zzbav.m20663e(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            e += obj instanceof aat ? zzbav.m20639a((aat) obj) : zzbav.m20640a((abl) obj, ace);
        }
        return e;
    }

    /* renamed from: a */
    static int m15658a(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m15659a(list) + (list.size() * zzbav.m20663e(i));
    }

    /* renamed from: a */
    static int m15659a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aba) {
            aba aba = (aba) list;
            i = 0;
            while (i2 < size) {
                i += zzbav.m20662d(aba.mo11536b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbav.m20662d(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static acw<?, ?> m15660a() {
        return f11470b;
    }

    /* renamed from: a */
    private static acw<?, ?> m15661a(boolean z) {
        try {
            Class e = m15691e();
            if (e == null) {
                return null;
            }
            return (acw) e.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static <UT, UB> UB m15662a(int i, int i2, UB ub, acw<UT, UB> acw) {
        if (ub == null) {
            ub = acw.mo11680a();
        }
        acw.mo11683a(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: a */
    static <UT, UB> UB m15663a(int i, List<Integer> list, aam<?> aam, UB ub, acw<UT, UB> acw) {
        UB ub2;
        if (aam == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            loop1:
            while (true) {
                ub2 = ub;
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (aam.mo11500a(intValue) == null) {
                        ub = m15662a(i, intValue, ub2, acw);
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
                if (aam.mo11500a(intValue2) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue2));
                    }
                    i2++;
                } else {
                    ub2 = m15662a(i, intValue2, ub2, acw);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        }
        return ub2;
    }

    /* renamed from: a */
    public static void m15664a(int i, List<String> list, adj adj) {
        if (list != null && !list.isEmpty()) {
            adj.mo11752a(i, list);
        }
    }

    /* renamed from: a */
    public static void m15665a(int i, List<?> list, adj adj, ace ace) {
        if (list != null && !list.isEmpty()) {
            adj.mo11753a(i, list, ace);
        }
    }

    /* renamed from: a */
    public static void m15666a(int i, List<Double> list, adj adj, boolean z) {
        if (list != null && !list.isEmpty()) {
            adj.mo11774g(i, list, z);
        }
    }

    /* renamed from: a */
    static <T> void m15667a(abg abg, T t, T t2, long j) {
        adc.m15810a((Object) t, j, abg.mo11542a(adc.m15832f(t, j), adc.m15832f(t2, j)));
    }

    /* renamed from: a */
    static <T, UT, UB> void m15668a(acw<UT, UB> acw, T t, T t2) {
        acw.mo11687a((Object) t, acw.mo11695c(acw.mo11690b(t), acw.mo11690b(t2)));
    }

    /* renamed from: a */
    static <T, FT extends aae<FT>> void m15669a(C4137zz<FT> zzVar, T t, T t2) {
        aac a = zzVar.mo11431a((Object) t2);
        if (!a.mo11442b()) {
            zzVar.mo11439b(t).mo11441a(a);
        }
    }

    /* renamed from: a */
    public static void m15670a(Class<?> cls) {
        if (!aai.class.isAssignableFrom(cls) && f11469a != null && !f11469a.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: a */
    public static boolean m15671a(int i, int i2, int i3) {
        if (i2 < 40) {
            return true;
        }
        long j = (long) i3;
        return ((((long) i2) - ((long) i)) + 1) + 9 <= ((2 * j) + 3) + ((j + 3) * 3);
    }

    /* renamed from: a */
    static boolean m15672a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    static int m15673b(int i, List<zzbah> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = size * zzbav.m20663e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e += zzbav.m20652b((zzbah) list.get(i2));
        }
        return e;
    }

    /* renamed from: b */
    static int m15674b(int i, List<abl> list, ace ace) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzbav.m20656c(i, (abl) list.get(i3), ace);
        }
        return i2;
    }

    /* renamed from: b */
    static int m15675b(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m15676b(list) + (size * zzbav.m20663e(i));
    }

    /* renamed from: b */
    static int m15676b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aba) {
            aba aba = (aba) list;
            i = 0;
            while (i2 < size) {
                i += zzbav.m20665e(aba.mo11536b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbav.m20665e(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static acw<?, ?> m15677b() {
        return f11471c;
    }

    /* renamed from: b */
    public static void m15678b(int i, List<zzbah> list, adj adj) {
        if (list != null && !list.isEmpty()) {
            adj.mo11760b(i, list);
        }
    }

    /* renamed from: b */
    public static void m15679b(int i, List<?> list, adj adj, ace ace) {
        if (list != null && !list.isEmpty()) {
            adj.mo11761b(i, list, ace);
        }
    }

    /* renamed from: b */
    public static void m15680b(int i, List<Float> list, adj adj, boolean z) {
        if (list != null && !list.isEmpty()) {
            adj.mo11773f(i, list, z);
        }
    }

    /* renamed from: c */
    static int m15681c(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m15682c(list) + (size * zzbav.m20663e(i));
    }

    /* renamed from: c */
    static int m15682c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aba) {
            aba aba = (aba) list;
            i = 0;
            while (i2 < size) {
                i += zzbav.m20669f(aba.mo11536b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbav.m20669f(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public static acw<?, ?> m15683c() {
        return f11472d;
    }

    /* renamed from: c */
    public static void m15684c(int i, List<Long> list, adj adj, boolean z) {
        if (list != null && !list.isEmpty()) {
            adj.mo11765c(i, list, z);
        }
    }

    /* renamed from: d */
    static int m15685d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m15686d(list) + (size * zzbav.m20663e(i));
    }

    /* renamed from: d */
    static int m15686d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aaj) {
            aaj aaj = (aaj) list;
            i = 0;
            while (i2 < size) {
                i += zzbav.m20683k(aaj.mo11494b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbav.m20683k(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: d */
    private static Class<?> m15687d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m15688d(int i, List<Long> list, adj adj, boolean z) {
        if (list != null && !list.isEmpty()) {
            adj.mo11768d(i, list, z);
        }
    }

    /* renamed from: e */
    static int m15689e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m15690e(list) + (size * zzbav.m20663e(i));
    }

    /* renamed from: e */
    static int m15690e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aaj) {
            aaj aaj = (aaj) list;
            i = 0;
            while (i2 < size) {
                i += zzbav.m20666f(aaj.mo11494b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbav.m20666f(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e */
    private static Class<?> m15691e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static void m15692e(int i, List<Long> list, adj adj, boolean z) {
        if (list != null && !list.isEmpty()) {
            adj.mo11781n(i, list, z);
        }
    }

    /* renamed from: f */
    static int m15693f(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m15694f(list) + (size * zzbav.m20663e(i));
    }

    /* renamed from: f */
    static int m15694f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aaj) {
            aaj aaj = (aaj) list;
            i = 0;
            while (i2 < size) {
                i += zzbav.m20670g(aaj.mo11494b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbav.m20670g(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    public static void m15695f(int i, List<Long> list, adj adj, boolean z) {
        if (list != null && !list.isEmpty()) {
            adj.mo11771e(i, list, z);
        }
    }

    /* renamed from: g */
    static int m15696g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m15697g(list) + (size * zzbav.m20663e(i));
    }

    /* renamed from: g */
    static int m15697g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aaj) {
            aaj aaj = (aaj) list;
            i = 0;
            while (i2 < size) {
                i += zzbav.m20674h(aaj.mo11494b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbav.m20674h(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: g */
    public static void m15698g(int i, List<Long> list, adj adj, boolean z) {
        if (list != null && !list.isEmpty()) {
            adj.mo11779l(i, list, z);
        }
    }

    /* renamed from: h */
    static int m15699h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbav.m20679i(i, 0);
    }

    /* renamed from: h */
    static int m15700h(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: h */
    public static void m15701h(int i, List<Integer> list, adj adj, boolean z) {
        if (list != null && !list.isEmpty()) {
            adj.mo11754a(i, list, z);
        }
    }

    /* renamed from: i */
    static int m15702i(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbav.m20672g(i, 0);
    }

    /* renamed from: i */
    static int m15703i(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: i */
    public static void m15704i(int i, List<Integer> list, adj adj, boolean z) {
        if (list != null && !list.isEmpty()) {
            adj.mo11777j(i, list, z);
        }
    }

    /* renamed from: j */
    static int m15705j(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbav.m20650b(i, true);
    }

    /* renamed from: j */
    static int m15706j(List<?> list) {
        return list.size();
    }

    /* renamed from: j */
    public static void m15707j(int i, List<Integer> list, adj adj, boolean z) {
        if (list != null && !list.isEmpty()) {
            adj.mo11780m(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m15708k(int i, List<Integer> list, adj adj, boolean z) {
        if (list != null && !list.isEmpty()) {
            adj.mo11762b(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m15709l(int i, List<Integer> list, adj adj, boolean z) {
        if (list != null && !list.isEmpty()) {
            adj.mo11778k(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m15710m(int i, List<Integer> list, adj adj, boolean z) {
        if (list != null && !list.isEmpty()) {
            adj.mo11775h(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m15711n(int i, List<Boolean> list, adj adj, boolean z) {
        if (list != null && !list.isEmpty()) {
            adj.mo11776i(i, list, z);
        }
    }
}
