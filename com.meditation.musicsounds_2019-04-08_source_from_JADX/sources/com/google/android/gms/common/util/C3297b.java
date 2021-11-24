package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.C3261q;
import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.util.b */
public final class C3297b {
    /* renamed from: a */
    public static <T> boolean m15030a(T[] tArr, T t) {
        int length = tArr != null ? tArr.length : 0;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (C3261q.m14906a(tArr[i], t)) {
                break;
            } else {
                i++;
            }
        }
        return i >= 0;
    }

    /* renamed from: a */
    public static <T> T[] m15031a(T[] tArr, T... tArr2) {
        int i;
        if (tArr == null) {
            return null;
        }
        if (tArr2 == null || tArr2.length == 0) {
            return Arrays.copyOf(tArr, tArr.length);
        }
        T[] tArr3 = (Object[]) Array.newInstance(tArr2.getClass().getComponentType(), tArr.length);
        if (tArr2.length == 1) {
            i = 0;
            for (T t : tArr) {
                if (!C3261q.m14906a(tArr2[0], t)) {
                    int i2 = i + 1;
                    tArr3[i] = t;
                    i = i2;
                }
            }
        } else {
            i = 0;
            for (T t2 : tArr) {
                if (!m15030a(tArr2, t2)) {
                    int i3 = i + 1;
                    tArr3[i] = t2;
                    i = i3;
                }
            }
        }
        if (tArr3 == null) {
            return null;
        }
        if (i != tArr3.length) {
            tArr3 = Arrays.copyOf(tArr3, i);
        }
        return tArr3;
    }

    /* renamed from: a */
    public static <T> T[] m15032a(T[]... tArr) {
        if (tArr.length == 0) {
            return (Object[]) Array.newInstance(tArr.getClass(), 0);
        }
        int i = 0;
        for (T[] length : tArr) {
            i += length.length;
        }
        T[] copyOf = Arrays.copyOf(tArr[0], i);
        int length2 = tArr[0].length;
        for (int i2 = 1; i2 < tArr.length; i2++) {
            T[] tArr2 = tArr[i2];
            System.arraycopy(tArr2, 0, copyOf, length2, tArr2.length);
            length2 += tArr2.length;
        }
        return copyOf;
    }
}
