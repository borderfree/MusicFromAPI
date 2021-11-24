package org.slf4j.helpers;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: org.slf4j.helpers.b */
public final class C6879b {
    /* renamed from: a */
    static final Throwable m32911a(Object[] objArr) {
        if (!(objArr == null || objArr.length == 0)) {
            Throwable th = objArr[objArr.length - 1];
            if (th instanceof Throwable) {
                return th;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final C6878a m32912a(String str, Object obj, Object obj2) {
        return m32913a(str, new Object[]{obj, obj2});
    }

    /* renamed from: a */
    public static final C6878a m32913a(String str, Object[] objArr) {
        int i;
        HashMap hashMap;
        Object obj;
        Throwable a = m32911a(objArr);
        if (str == null) {
            return new C6878a(null, objArr, a);
        }
        if (objArr == null) {
            return new C6878a(str);
        }
        StringBuffer stringBuffer = new StringBuffer(str.length() + 50);
        int i2 = 0;
        int i3 = 0;
        while (i2 < objArr.length) {
            int indexOf = str.indexOf("{}", i3);
            if (indexOf != -1) {
                if (!m32925a(str, indexOf)) {
                    stringBuffer.append(str.substring(i3, indexOf));
                    obj = objArr[i2];
                    hashMap = new HashMap();
                } else if (!m32926b(str, indexOf)) {
                    i2--;
                    stringBuffer.append(str.substring(i3, indexOf - 1));
                    stringBuffer.append('{');
                    i = indexOf + 1;
                    i3 = i;
                    i2++;
                } else {
                    stringBuffer.append(str.substring(i3, indexOf - 1));
                    obj = objArr[i2];
                    hashMap = new HashMap();
                }
                m32915a(stringBuffer, obj, (Map) hashMap);
                i = indexOf + 2;
                i3 = i;
                i2++;
            } else if (i3 == 0) {
                return new C6878a(str, objArr, a);
            } else {
                stringBuffer.append(str.substring(i3, str.length()));
                return new C6878a(stringBuffer.toString(), objArr, a);
            }
        }
        stringBuffer.append(str.substring(i3, str.length()));
        return i2 < objArr.length + -1 ? new C6878a(stringBuffer.toString(), objArr, a) : new C6878a(stringBuffer.toString(), objArr, null);
    }

    /* renamed from: a */
    private static void m32914a(StringBuffer stringBuffer, Object obj) {
        try {
            stringBuffer.append(obj.toString());
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            StringBuilder sb = new StringBuilder();
            sb.append("SLF4J: Failed toString() invocation on an object of type [");
            sb.append(obj.getClass().getName());
            sb.append("]");
            printStream.println(sb.toString());
            th.printStackTrace();
            stringBuffer.append("[FAILED toString()]");
        }
    }

    /* renamed from: a */
    private static void m32915a(StringBuffer stringBuffer, Object obj, Map map) {
        if (obj == null) {
            stringBuffer.append("null");
            return;
        }
        if (!obj.getClass().isArray()) {
            m32914a(stringBuffer, obj);
        } else if (obj instanceof boolean[]) {
            m32924a(stringBuffer, (boolean[]) obj);
        } else if (obj instanceof byte[]) {
            m32916a(stringBuffer, (byte[]) obj);
        } else if (obj instanceof char[]) {
            m32917a(stringBuffer, (char[]) obj);
        } else if (obj instanceof short[]) {
            m32923a(stringBuffer, (short[]) obj);
        } else if (obj instanceof int[]) {
            m32920a(stringBuffer, (int[]) obj);
        } else if (obj instanceof long[]) {
            m32921a(stringBuffer, (long[]) obj);
        } else if (obj instanceof float[]) {
            m32919a(stringBuffer, (float[]) obj);
        } else if (obj instanceof double[]) {
            m32918a(stringBuffer, (double[]) obj);
        } else {
            m32922a(stringBuffer, (Object[]) obj, map);
        }
    }

    /* renamed from: a */
    private static void m32916a(StringBuffer stringBuffer, byte[] bArr) {
        stringBuffer.append('[');
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(bArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m32917a(StringBuffer stringBuffer, char[] cArr) {
        stringBuffer.append('[');
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(cArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m32918a(StringBuffer stringBuffer, double[] dArr) {
        stringBuffer.append('[');
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(dArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m32919a(StringBuffer stringBuffer, float[] fArr) {
        stringBuffer.append('[');
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(fArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m32920a(StringBuffer stringBuffer, int[] iArr) {
        stringBuffer.append('[');
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(iArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m32921a(StringBuffer stringBuffer, long[] jArr) {
        stringBuffer.append('[');
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(jArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m32922a(StringBuffer stringBuffer, Object[] objArr, Map map) {
        stringBuffer.append('[');
        if (!map.containsKey(objArr)) {
            map.put(objArr, null);
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                m32915a(stringBuffer, objArr[i], map);
                if (i != length - 1) {
                    stringBuffer.append(", ");
                }
            }
            map.remove(objArr);
        } else {
            stringBuffer.append("...");
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m32923a(StringBuffer stringBuffer, short[] sArr) {
        stringBuffer.append('[');
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(sArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m32924a(StringBuffer stringBuffer, boolean[] zArr) {
        stringBuffer.append('[');
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(zArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    static final boolean m32925a(String str, int i) {
        return i != 0 && str.charAt(i - 1) == '\\';
    }

    /* renamed from: b */
    static final boolean m32926b(String str, int i) {
        return i >= 2 && str.charAt(i - 2) == '\\';
    }
}
