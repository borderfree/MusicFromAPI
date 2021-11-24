package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class adc {

    /* renamed from: a */
    private static final Logger f11511a = Logger.getLogger(adc.class.getName());

    /* renamed from: b */
    private static final Unsafe f11512b = m15820c();

    /* renamed from: c */
    private static final Class<?> f11513c = C4114zc.m20405b();

    /* renamed from: d */
    private static final boolean f11514d = m15823c(Long.TYPE);

    /* renamed from: e */
    private static final boolean f11515e = m15823c(Integer.TYPE);

    /* renamed from: f */
    private static final C3400d f11516f;

    /* renamed from: g */
    private static final boolean f11517g = m15833f();

    /* renamed from: h */
    private static final boolean f11518h = m15831e();

    /* renamed from: i */
    private static final long f11519i = ((long) m15801a(byte[].class));

    /* renamed from: j */
    private static final long f11520j = ((long) m15801a(boolean[].class));

    /* renamed from: k */
    private static final long f11521k = ((long) m15814b(boolean[].class));

    /* renamed from: l */
    private static final long f11522l = ((long) m15801a(int[].class));

    /* renamed from: m */
    private static final long f11523m = ((long) m15814b(int[].class));

    /* renamed from: n */
    private static final long f11524n = ((long) m15801a(long[].class));

    /* renamed from: o */
    private static final long f11525o = ((long) m15814b(long[].class));

    /* renamed from: p */
    private static final long f11526p = ((long) m15801a(float[].class));

    /* renamed from: q */
    private static final long f11527q = ((long) m15814b(float[].class));

    /* renamed from: r */
    private static final long f11528r = ((long) m15801a(double[].class));

    /* renamed from: s */
    private static final long f11529s = ((long) m15814b(double[].class));

    /* renamed from: t */
    private static final long f11530t = ((long) m15801a(Object[].class));

    /* renamed from: u */
    private static final long f11531u = ((long) m15814b(Object[].class));

    /* renamed from: v */
    private static final long f11532v = m15816b(m15835g());

    /* renamed from: w */
    private static final long f11533w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public static final boolean f11534x = (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN);

    /* renamed from: com.google.android.gms.internal.ads.adc$a */
    static final class C3397a extends C3400d {
        C3397a(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final byte mo11724a(Object obj, long j) {
            return adc.f11534x ? adc.m15839k(obj, j) : adc.m15840l(obj, j);
        }

        /* renamed from: a */
        public final void mo11725a(Object obj, long j, byte b) {
            if (adc.f11534x) {
                adc.m15821c(obj, j, b);
            } else {
                adc.m15826d(obj, j, b);
            }
        }

        /* renamed from: a */
        public final void mo11726a(Object obj, long j, double d) {
            mo11734a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo11727a(Object obj, long j, float f) {
            mo11733a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: a */
        public final void mo11728a(Object obj, long j, boolean z) {
            if (adc.f11534x) {
                adc.m15827d(obj, j, z);
            } else {
                adc.m15830e(obj, j, z);
            }
        }

        /* renamed from: b */
        public final boolean mo11729b(Object obj, long j) {
            return adc.f11534x ? adc.m15841m(obj, j) : adc.m15842n(obj, j);
        }

        /* renamed from: c */
        public final float mo11730c(Object obj, long j) {
            return Float.intBitsToFloat(mo11735e(obj, j));
        }

        /* renamed from: d */
        public final double mo11731d(Object obj, long j) {
            return Double.longBitsToDouble(mo11736f(obj, j));
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.adc$b */
    static final class C3398b extends C3400d {
        C3398b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final byte mo11724a(Object obj, long j) {
            return adc.f11534x ? adc.m15839k(obj, j) : adc.m15840l(obj, j);
        }

        /* renamed from: a */
        public final void mo11725a(Object obj, long j, byte b) {
            if (adc.f11534x) {
                adc.m15821c(obj, j, b);
            } else {
                adc.m15826d(obj, j, b);
            }
        }

        /* renamed from: a */
        public final void mo11726a(Object obj, long j, double d) {
            mo11734a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo11727a(Object obj, long j, float f) {
            mo11733a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: a */
        public final void mo11728a(Object obj, long j, boolean z) {
            if (adc.f11534x) {
                adc.m15827d(obj, j, z);
            } else {
                adc.m15830e(obj, j, z);
            }
        }

        /* renamed from: b */
        public final boolean mo11729b(Object obj, long j) {
            return adc.f11534x ? adc.m15841m(obj, j) : adc.m15842n(obj, j);
        }

        /* renamed from: c */
        public final float mo11730c(Object obj, long j) {
            return Float.intBitsToFloat(mo11735e(obj, j));
        }

        /* renamed from: d */
        public final double mo11731d(Object obj, long j) {
            return Double.longBitsToDouble(mo11736f(obj, j));
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.adc$c */
    static final class C3399c extends C3400d {
        C3399c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final byte mo11724a(Object obj, long j) {
            return this.f11535a.getByte(obj, j);
        }

        /* renamed from: a */
        public final void mo11725a(Object obj, long j, byte b) {
            this.f11535a.putByte(obj, j, b);
        }

        /* renamed from: a */
        public final void mo11726a(Object obj, long j, double d) {
            this.f11535a.putDouble(obj, j, d);
        }

        /* renamed from: a */
        public final void mo11727a(Object obj, long j, float f) {
            this.f11535a.putFloat(obj, j, f);
        }

        /* renamed from: a */
        public final void mo11728a(Object obj, long j, boolean z) {
            this.f11535a.putBoolean(obj, j, z);
        }

        /* renamed from: b */
        public final boolean mo11729b(Object obj, long j) {
            return this.f11535a.getBoolean(obj, j);
        }

        /* renamed from: c */
        public final float mo11730c(Object obj, long j) {
            return this.f11535a.getFloat(obj, j);
        }

        /* renamed from: d */
        public final double mo11731d(Object obj, long j) {
            return this.f11535a.getDouble(obj, j);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.adc$d */
    static abstract class C3400d {

        /* renamed from: a */
        Unsafe f11535a;

        C3400d(Unsafe unsafe) {
            this.f11535a = unsafe;
        }

        /* renamed from: a */
        public abstract byte mo11724a(Object obj, long j);

        /* renamed from: a */
        public final long mo11732a(Field field) {
            return this.f11535a.objectFieldOffset(field);
        }

        /* renamed from: a */
        public abstract void mo11725a(Object obj, long j, byte b);

        /* renamed from: a */
        public abstract void mo11726a(Object obj, long j, double d);

        /* renamed from: a */
        public abstract void mo11727a(Object obj, long j, float f);

        /* renamed from: a */
        public final void mo11733a(Object obj, long j, int i) {
            this.f11535a.putInt(obj, j, i);
        }

        /* renamed from: a */
        public final void mo11734a(Object obj, long j, long j2) {
            this.f11535a.putLong(obj, j, j2);
        }

        /* renamed from: a */
        public abstract void mo11728a(Object obj, long j, boolean z);

        /* renamed from: b */
        public abstract boolean mo11729b(Object obj, long j);

        /* renamed from: c */
        public abstract float mo11730c(Object obj, long j);

        /* renamed from: d */
        public abstract double mo11731d(Object obj, long j);

        /* renamed from: e */
        public final int mo11735e(Object obj, long j) {
            return this.f11535a.getInt(obj, j);
        }

        /* renamed from: f */
        public final long mo11736f(Object obj, long j) {
            return this.f11535a.getLong(obj, j);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0105  */
    static {
        /*
            java.lang.Class<com.google.android.gms.internal.ads.adc> r0 = com.google.android.gms.internal.ads.adc.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f11511a = r0
            sun.misc.Unsafe r0 = m15820c()
            f11512b = r0
            java.lang.Class r0 = com.google.android.gms.internal.ads.C4114zc.m20405b()
            f11513c = r0
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = m15823c(r0)
            f11514d = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = m15823c(r0)
            f11515e = r0
            sun.misc.Unsafe r0 = f11512b
            r1 = 0
            if (r0 != 0) goto L_0x002f
        L_0x002d:
            r0 = r1
            goto L_0x0054
        L_0x002f:
            boolean r0 = com.google.android.gms.internal.ads.C4114zc.m20404a()
            if (r0 == 0) goto L_0x004d
            boolean r0 = f11514d
            if (r0 == 0) goto L_0x0041
            com.google.android.gms.internal.ads.adc$b r0 = new com.google.android.gms.internal.ads.adc$b
            sun.misc.Unsafe r2 = f11512b
            r0.<init>(r2)
            goto L_0x0054
        L_0x0041:
            boolean r0 = f11515e
            if (r0 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.adc$a r0 = new com.google.android.gms.internal.ads.adc$a
            sun.misc.Unsafe r2 = f11512b
            r0.<init>(r2)
            goto L_0x0054
        L_0x004d:
            com.google.android.gms.internal.ads.adc$c r0 = new com.google.android.gms.internal.ads.adc$c
            sun.misc.Unsafe r2 = f11512b
            r0.<init>(r2)
        L_0x0054:
            f11516f = r0
            boolean r0 = m15833f()
            f11517g = r0
            boolean r0 = m15831e()
            f11518h = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = m15801a(r0)
            long r2 = (long) r0
            f11519i = r2
            java.lang.Class<boolean[]> r0 = boolean[].class
            int r0 = m15801a(r0)
            long r2 = (long) r0
            f11520j = r2
            java.lang.Class<boolean[]> r0 = boolean[].class
            int r0 = m15814b(r0)
            long r2 = (long) r0
            f11521k = r2
            java.lang.Class<int[]> r0 = int[].class
            int r0 = m15801a(r0)
            long r2 = (long) r0
            f11522l = r2
            java.lang.Class<int[]> r0 = int[].class
            int r0 = m15814b(r0)
            long r2 = (long) r0
            f11523m = r2
            java.lang.Class<long[]> r0 = long[].class
            int r0 = m15801a(r0)
            long r2 = (long) r0
            f11524n = r2
            java.lang.Class<long[]> r0 = long[].class
            int r0 = m15814b(r0)
            long r2 = (long) r0
            f11525o = r2
            java.lang.Class<float[]> r0 = float[].class
            int r0 = m15801a(r0)
            long r2 = (long) r0
            f11526p = r2
            java.lang.Class<float[]> r0 = float[].class
            int r0 = m15814b(r0)
            long r2 = (long) r0
            f11527q = r2
            java.lang.Class<double[]> r0 = double[].class
            int r0 = m15801a(r0)
            long r2 = (long) r0
            f11528r = r2
            java.lang.Class<double[]> r0 = double[].class
            int r0 = m15814b(r0)
            long r2 = (long) r0
            f11529s = r2
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            int r0 = m15801a(r0)
            long r2 = (long) r0
            f11530t = r2
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            int r0 = m15814b(r0)
            long r2 = (long) r0
            f11531u = r2
            java.lang.reflect.Field r0 = m15835g()
            long r2 = m15816b(r0)
            f11532v = r2
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r2 = "value"
            java.lang.reflect.Field r0 = m15804a(r0, r2)
            if (r0 == 0) goto L_0x00f4
            java.lang.Class r2 = r0.getType()
            java.lang.Class<char[]> r3 = char[].class
            if (r2 != r3) goto L_0x00f4
            goto L_0x00f5
        L_0x00f4:
            r0 = r1
        L_0x00f5:
            long r0 = m15816b(r0)
            f11533w = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0105
            r0 = 1
            goto L_0x0106
        L_0x0105:
            r0 = 0
        L_0x0106:
            f11534x = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.adc.<clinit>():void");
    }

    private adc() {
    }

    /* renamed from: a */
    static byte m15800a(byte[] bArr, long j) {
        return f11516f.mo11724a(bArr, f11519i + j);
    }

    /* renamed from: a */
    private static int m15801a(Class<?> cls) {
        if (f11518h) {
            return f11516f.f11535a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: a */
    static int m15802a(Object obj, long j) {
        return f11516f.mo11735e(obj, j);
    }

    /* renamed from: a */
    static long m15803a(Field field) {
        return f11516f.mo11732a(field);
    }

    /* renamed from: a */
    private static Field m15804a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static void m15806a(Object obj, long j, double d) {
        f11516f.mo11726a(obj, j, d);
    }

    /* renamed from: a */
    static void m15807a(Object obj, long j, float f) {
        f11516f.mo11727a(obj, j, f);
    }

    /* renamed from: a */
    static void m15808a(Object obj, long j, int i) {
        f11516f.mo11733a(obj, j, i);
    }

    /* renamed from: a */
    static void m15809a(Object obj, long j, long j2) {
        f11516f.mo11734a(obj, j, j2);
    }

    /* renamed from: a */
    static void m15810a(Object obj, long j, Object obj2) {
        f11516f.f11535a.putObject(obj, j, obj2);
    }

    /* renamed from: a */
    static void m15811a(Object obj, long j, boolean z) {
        f11516f.mo11728a(obj, j, z);
    }

    /* renamed from: a */
    static void m15812a(byte[] bArr, long j, byte b) {
        f11516f.mo11725a((Object) bArr, f11519i + j, b);
    }

    /* renamed from: a */
    static boolean m15813a() {
        return f11518h;
    }

    /* renamed from: b */
    private static int m15814b(Class<?> cls) {
        if (f11518h) {
            return f11516f.f11535a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: b */
    static long m15815b(Object obj, long j) {
        return f11516f.mo11736f(obj, j);
    }

    /* renamed from: b */
    private static long m15816b(Field field) {
        if (field == null || f11516f == null) {
            return -1;
        }
        return f11516f.mo11732a(field);
    }

    /* renamed from: b */
    static boolean m15819b() {
        return f11517g;
    }

    /* renamed from: c */
    static Unsafe m15820c() {
        try {
            return (Unsafe) AccessController.doPrivileged(new add());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m15821c(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        m15808a(obj, j2, ((255 & b) << i) | (m15802a(obj, j2) & ((255 << i) ^ -1)));
    }

    /* renamed from: c */
    private static boolean m15823c(Class<?> cls) {
        if (!C4114zc.m20404a()) {
            return false;
        }
        try {
            Class<?> cls2 = f11513c;
            cls2.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls2.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls2.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls2.getMethod("peekByte", new Class[]{cls});
            cls2.getMethod("pokeByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            cls2.getMethod("peekByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c */
    static boolean m15824c(Object obj, long j) {
        return f11516f.mo11729b(obj, j);
    }

    /* renamed from: d */
    static float m15825d(Object obj, long j) {
        return f11516f.mo11730c(obj, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m15826d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m15808a(obj, j2, ((255 & b) << i) | (m15802a(obj, j2) & ((255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m15827d(Object obj, long j, boolean z) {
        m15821c(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: e */
    static double m15829e(Object obj, long j) {
        return f11516f.mo11731d(obj, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m15830e(Object obj, long j, boolean z) {
        m15826d(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: e */
    private static boolean m15831e() {
        if (f11512b == null) {
            return false;
        }
        try {
            Class cls = f11512b.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (C4114zc.m20404a()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putByte", new Class[]{Object.class, Long.TYPE, Byte.TYPE});
            cls.getMethod("getBoolean", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE});
            cls.getMethod("getFloat", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putFloat", new Class[]{Object.class, Long.TYPE, Float.TYPE});
            cls.getMethod("getDouble", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putDouble", new Class[]{Object.class, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            f11511a.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: f */
    static Object m15832f(Object obj, long j) {
        return f11516f.f11535a.getObject(obj, j);
    }

    /* renamed from: f */
    private static boolean m15833f() {
        if (f11512b == null) {
            return false;
        }
        try {
            Class cls = f11512b.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (m15835g() == null) {
                return false;
            }
            if (C4114zc.m20404a()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Long.TYPE});
            cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls.getMethod("getInt", new Class[]{Long.TYPE});
            cls.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Long.TYPE});
            cls.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            f11511a.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: g */
    private static Field m15835g() {
        if (C4114zc.m20404a()) {
            Field a = m15804a(Buffer.class, "effectiveDirectAddress");
            if (a != null) {
                return a;
            }
        }
        Field a2 = m15804a(Buffer.class, "address");
        if (a2 == null || a2.getType() != Long.TYPE) {
            return null;
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static byte m15839k(Object obj, long j) {
        return (byte) (m15802a(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static byte m15840l(Object obj, long j) {
        return (byte) (m15802a(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static boolean m15841m(Object obj, long j) {
        return m15839k(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static boolean m15842n(Object obj, long j) {
        return m15840l(obj, j) != 0;
    }
}
