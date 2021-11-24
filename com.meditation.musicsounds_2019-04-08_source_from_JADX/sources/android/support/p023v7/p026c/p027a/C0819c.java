package android.support.p023v7.p026c.p027a;

import java.lang.reflect.Array;

/* renamed from: android.support.v7.c.a.c */
final class C0819c {

    /* renamed from: a */
    static final /* synthetic */ boolean f2417a = (!C0819c.class.desiredAssertionStatus());

    private C0819c() {
    }

    /* renamed from: a */
    public static int m3888a(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }

    /* renamed from: a */
    public static int[] m3889a(int[] iArr, int i, int i2) {
        if (f2417a || i <= iArr.length) {
            if (i + 1 > iArr.length) {
                int[] iArr2 = new int[m3888a(i)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                iArr = iArr2;
            }
            iArr[i] = i2;
            return iArr;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public static <T> T[] m3890a(T[] tArr, int i, T t) {
        if (f2417a || i <= tArr.length) {
            if (i + 1 > tArr.length) {
                T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), m3888a(i));
                System.arraycopy(tArr, 0, tArr2, 0, i);
                tArr = tArr2;
            }
            tArr[i] = t;
            return tArr;
        }
        throw new AssertionError();
    }
}
