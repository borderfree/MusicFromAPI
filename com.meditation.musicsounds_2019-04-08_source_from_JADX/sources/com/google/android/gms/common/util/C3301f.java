package com.google.android.gms.common.util;

import android.support.p009v4.p019g.C0488a;
import android.support.p009v4.p019g.C0490b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.common.util.f */
public final class C3301f {
    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m15041a() {
        return Collections.emptyList();
    }

    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m15042a(T t) {
        return Collections.singletonList(t);
    }

    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m15043a(T... tArr) {
        switch (tArr.length) {
            case 0:
                return m15041a();
            case 1:
                return m15042a(tArr[0]);
            default:
                return Collections.unmodifiableList(Arrays.asList(tArr));
        }
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m15044a(K k, V v, K k2, V v2, K k3, V v3) {
        Map b = m15048b(3, false);
        b.put(k, v);
        b.put(k2, v2);
        b.put(k3, v3);
        return Collections.unmodifiableMap(b);
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m15045a(K[] kArr, V[] vArr) {
        if (kArr.length == vArr.length) {
            switch (kArr.length) {
                case 0:
                    return Collections.emptyMap();
                case 1:
                    return Collections.singletonMap(kArr[0], vArr[0]);
                default:
                    Map b = m15048b(kArr.length, false);
                    for (int i = 0; i < kArr.length; i++) {
                        b.put(kArr[i], vArr[i]);
                    }
                    return Collections.unmodifiableMap(b);
            }
        } else {
            int length = kArr.length;
            int length2 = vArr.length;
            StringBuilder sb = new StringBuilder(66);
            sb.append("Key and values array lengths not equal: ");
            sb.append(length);
            sb.append(" != ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private static <T> Set<T> m15046a(int i, boolean z) {
        return i <= (z ? 128 : 256) ? new C0490b(i) : new HashSet(i, z ? 0.75f : 1.0f);
    }

    @Deprecated
    /* renamed from: a */
    public static <T> Set<T> m15047a(T t, T t2, T t3) {
        Set a = m15046a(3, false);
        a.add(t);
        a.add(t2);
        a.add(t3);
        return Collections.unmodifiableSet(a);
    }

    /* renamed from: b */
    private static <K, V> Map<K, V> m15048b(int i, boolean z) {
        return i <= 256 ? new C0488a(i) : new HashMap(i, 1.0f);
    }

    @Deprecated
    /* renamed from: b */
    public static <T> Set<T> m15049b(T... tArr) {
        switch (tArr.length) {
            case 0:
                return Collections.emptySet();
            case 1:
                return Collections.singleton(tArr[0]);
            case 2:
                T t = tArr[0];
                T t2 = tArr[1];
                Set a = m15046a(2, false);
                a.add(t);
                a.add(t2);
                return Collections.unmodifiableSet(a);
            case 3:
                return m15047a(tArr[0], tArr[1], tArr[2]);
            case 4:
                T t3 = tArr[0];
                T t4 = tArr[1];
                T t5 = tArr[2];
                T t6 = tArr[3];
                Set a2 = m15046a(4, false);
                a2.add(t3);
                a2.add(t4);
                a2.add(t5);
                a2.add(t6);
                return Collections.unmodifiableSet(a2);
            default:
                Set a3 = m15046a(tArr.length, false);
                Collections.addAll(a3, tArr);
                return Collections.unmodifiableSet(a3);
        }
    }
}
