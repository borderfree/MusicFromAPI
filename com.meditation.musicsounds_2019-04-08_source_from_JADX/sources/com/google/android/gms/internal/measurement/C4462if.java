package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.if */
final class C4462if {

    /* renamed from: a */
    private static final Logger f16259a = Logger.getLogger(C4462if.class.getName());

    /* renamed from: b */
    private static final Unsafe f16260b = m22016c();

    /* renamed from: c */
    private static final Class<?> f16261c = C4348ef.m21321b();

    /* renamed from: d */
    private static final boolean f16262d = m22024d(Long.TYPE);

    /* renamed from: e */
    private static final boolean f16263e = m22024d(Integer.TYPE);

    /* renamed from: f */
    private static final C4466d f16264f;

    /* renamed from: g */
    private static final boolean f16265g = m22031g();

    /* renamed from: h */
    private static final boolean f16266h = m22029f();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final long f16267i = ((long) m22010b(byte[].class));

    /* renamed from: j */
    private static final long f16268j = ((long) m22010b(boolean[].class));

    /* renamed from: k */
    private static final long f16269k = ((long) m22015c(boolean[].class));

    /* renamed from: l */
    private static final long f16270l = ((long) m22010b(int[].class));

    /* renamed from: m */
    private static final long f16271m = ((long) m22015c(int[].class));

    /* renamed from: n */
    private static final long f16272n = ((long) m22010b(long[].class));

    /* renamed from: o */
    private static final long f16273o = ((long) m22015c(long[].class));

    /* renamed from: p */
    private static final long f16274p = ((long) m22010b(float[].class));

    /* renamed from: q */
    private static final long f16275q = ((long) m22015c(float[].class));

    /* renamed from: r */
    private static final long f16276r = ((long) m22010b(double[].class));

    /* renamed from: s */
    private static final long f16277s = ((long) m22015c(double[].class));

    /* renamed from: t */
    private static final long f16278t = ((long) m22010b(Object[].class));

    /* renamed from: u */
    private static final long f16279u = ((long) m22015c(Object[].class));

    /* renamed from: v */
    private static final long f16280v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static final boolean f16281w = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* renamed from: com.google.android.gms.internal.measurement.if$a */
    static final class C4463a extends C4466d {
        C4463a(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final byte mo14687a(Object obj, long j) {
            return C4462if.f16281w ? C4462if.m22036k(obj, j) : C4462if.m22037l(obj, j);
        }

        /* renamed from: a */
        public final void mo14688a(long j, byte b) {
            Memory.pokeByte((int) (j & -1), b);
        }

        /* renamed from: a */
        public final void mo14689a(Object obj, long j, byte b) {
            if (C4462if.f16281w) {
                C4462if.m22017c(obj, j, b);
            } else {
                C4462if.m22022d(obj, j, b);
            }
        }

        /* renamed from: a */
        public final void mo14690a(Object obj, long j, double d) {
            mo14698a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo14691a(Object obj, long j, float f) {
            mo14697a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: a */
        public final void mo14692a(Object obj, long j, boolean z) {
            if (C4462if.f16281w) {
                C4462if.m22023d(obj, j, z);
            } else {
                C4462if.m22026e(obj, j, z);
            }
        }

        /* renamed from: a */
        public final void mo14693a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) (j2 & -1), bArr, (int) j, (int) j3);
        }

        /* renamed from: b */
        public final boolean mo14694b(Object obj, long j) {
            return C4462if.f16281w ? C4462if.m22038m(obj, j) : C4462if.m22039n(obj, j);
        }

        /* renamed from: c */
        public final float mo14695c(Object obj, long j) {
            return Float.intBitsToFloat(mo14699e(obj, j));
        }

        /* renamed from: d */
        public final double mo14696d(Object obj, long j) {
            return Double.longBitsToDouble(mo14700f(obj, j));
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.if$b */
    static final class C4464b extends C4466d {
        C4464b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final byte mo14687a(Object obj, long j) {
            return C4462if.f16281w ? C4462if.m22036k(obj, j) : C4462if.m22037l(obj, j);
        }

        /* renamed from: a */
        public final void mo14688a(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        /* renamed from: a */
        public final void mo14689a(Object obj, long j, byte b) {
            if (C4462if.f16281w) {
                C4462if.m22017c(obj, j, b);
            } else {
                C4462if.m22022d(obj, j, b);
            }
        }

        /* renamed from: a */
        public final void mo14690a(Object obj, long j, double d) {
            mo14698a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo14691a(Object obj, long j, float f) {
            mo14697a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: a */
        public final void mo14692a(Object obj, long j, boolean z) {
            if (C4462if.f16281w) {
                C4462if.m22023d(obj, j, z);
            } else {
                C4462if.m22026e(obj, j, z);
            }
        }

        /* renamed from: a */
        public final void mo14693a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }

        /* renamed from: b */
        public final boolean mo14694b(Object obj, long j) {
            return C4462if.f16281w ? C4462if.m22038m(obj, j) : C4462if.m22039n(obj, j);
        }

        /* renamed from: c */
        public final float mo14695c(Object obj, long j) {
            return Float.intBitsToFloat(mo14699e(obj, j));
        }

        /* renamed from: d */
        public final double mo14696d(Object obj, long j) {
            return Double.longBitsToDouble(mo14700f(obj, j));
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.if$c */
    static final class C4465c extends C4466d {
        C4465c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final byte mo14687a(Object obj, long j) {
            return this.f16282a.getByte(obj, j);
        }

        /* renamed from: a */
        public final void mo14688a(long j, byte b) {
            this.f16282a.putByte(j, b);
        }

        /* renamed from: a */
        public final void mo14689a(Object obj, long j, byte b) {
            this.f16282a.putByte(obj, j, b);
        }

        /* renamed from: a */
        public final void mo14690a(Object obj, long j, double d) {
            this.f16282a.putDouble(obj, j, d);
        }

        /* renamed from: a */
        public final void mo14691a(Object obj, long j, float f) {
            this.f16282a.putFloat(obj, j, f);
        }

        /* renamed from: a */
        public final void mo14692a(Object obj, long j, boolean z) {
            this.f16282a.putBoolean(obj, j, z);
        }

        /* renamed from: a */
        public final void mo14693a(byte[] bArr, long j, long j2, long j3) {
            this.f16282a.copyMemory(bArr, C4462if.f16267i + j, null, j2, j3);
        }

        /* renamed from: b */
        public final boolean mo14694b(Object obj, long j) {
            return this.f16282a.getBoolean(obj, j);
        }

        /* renamed from: c */
        public final float mo14695c(Object obj, long j) {
            return this.f16282a.getFloat(obj, j);
        }

        /* renamed from: d */
        public final double mo14696d(Object obj, long j) {
            return this.f16282a.getDouble(obj, j);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.if$d */
    static abstract class C4466d {

        /* renamed from: a */
        Unsafe f16282a;

        C4466d(Unsafe unsafe) {
            this.f16282a = unsafe;
        }

        /* renamed from: a */
        public abstract byte mo14687a(Object obj, long j);

        /* renamed from: a */
        public abstract void mo14688a(long j, byte b);

        /* renamed from: a */
        public abstract void mo14689a(Object obj, long j, byte b);

        /* renamed from: a */
        public abstract void mo14690a(Object obj, long j, double d);

        /* renamed from: a */
        public abstract void mo14691a(Object obj, long j, float f);

        /* renamed from: a */
        public final void mo14697a(Object obj, long j, int i) {
            this.f16282a.putInt(obj, j, i);
        }

        /* renamed from: a */
        public final void mo14698a(Object obj, long j, long j2) {
            this.f16282a.putLong(obj, j, j2);
        }

        /* renamed from: a */
        public abstract void mo14692a(Object obj, long j, boolean z);

        /* renamed from: a */
        public abstract void mo14693a(byte[] bArr, long j, long j2, long j3);

        /* renamed from: b */
        public abstract boolean mo14694b(Object obj, long j);

        /* renamed from: c */
        public abstract float mo14695c(Object obj, long j);

        /* renamed from: d */
        public abstract double mo14696d(Object obj, long j);

        /* renamed from: e */
        public final int mo14699e(Object obj, long j) {
            return this.f16282a.getInt(obj, j);
        }

        /* renamed from: f */
        public final long mo14700f(Object obj, long j) {
            return this.f16282a.getLong(obj, j);
        }
    }

    static {
        C4466d dVar = null;
        if (f16260b != null) {
            if (!C4348ef.m21320a()) {
                dVar = new C4465c(f16260b);
            } else if (f16262d) {
                dVar = new C4464b(f16260b);
            } else if (f16263e) {
                dVar = new C4463a(f16260b);
            }
        }
        f16264f = dVar;
        Field h = m22033h();
        f16280v = (h == null || f16264f == null) ? -1 : f16264f.f16282a.objectFieldOffset(h);
    }

    private C4462if() {
    }

    /* renamed from: a */
    static byte m21994a(byte[] bArr, long j) {
        return f16264f.mo14687a((Object) bArr, f16267i + j);
    }

    /* renamed from: a */
    static int m21995a(Object obj, long j) {
        return f16264f.mo14699e(obj, j);
    }

    /* renamed from: a */
    static long m21996a(ByteBuffer byteBuffer) {
        return f16264f.mo14700f(byteBuffer, f16280v);
    }

    /* renamed from: a */
    static <T> T m21997a(Class<T> cls) {
        try {
            return f16260b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    private static Field m21998a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static void m21999a(long j, byte b) {
        f16264f.mo14688a(j, b);
    }

    /* renamed from: a */
    static void m22001a(Object obj, long j, double d) {
        f16264f.mo14690a(obj, j, d);
    }

    /* renamed from: a */
    static void m22002a(Object obj, long j, float f) {
        f16264f.mo14691a(obj, j, f);
    }

    /* renamed from: a */
    static void m22003a(Object obj, long j, int i) {
        f16264f.mo14697a(obj, j, i);
    }

    /* renamed from: a */
    static void m22004a(Object obj, long j, long j2) {
        f16264f.mo14698a(obj, j, j2);
    }

    /* renamed from: a */
    static void m22005a(Object obj, long j, Object obj2) {
        f16264f.f16282a.putObject(obj, j, obj2);
    }

    /* renamed from: a */
    static void m22006a(Object obj, long j, boolean z) {
        f16264f.mo14692a(obj, j, z);
    }

    /* renamed from: a */
    static void m22007a(byte[] bArr, long j, byte b) {
        f16264f.mo14689a((Object) bArr, f16267i + j, b);
    }

    /* renamed from: a */
    static void m22008a(byte[] bArr, long j, long j2, long j3) {
        f16264f.mo14693a(bArr, j, j2, j3);
    }

    /* renamed from: a */
    static boolean m22009a() {
        return f16266h;
    }

    /* renamed from: b */
    private static int m22010b(Class<?> cls) {
        if (f16266h) {
            return f16264f.f16282a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: b */
    static long m22011b(Object obj, long j) {
        return f16264f.mo14700f(obj, j);
    }

    /* renamed from: b */
    static boolean m22014b() {
        return f16265g;
    }

    /* renamed from: c */
    private static int m22015c(Class<?> cls) {
        if (f16266h) {
            return f16264f.f16282a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: c */
    static Unsafe m22016c() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C4467ig());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m22017c(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        m22003a(obj, j2, ((255 & b) << i) | (m21995a(obj, j2) & ((255 << i) ^ -1)));
    }

    /* renamed from: c */
    static boolean m22019c(Object obj, long j) {
        return f16264f.mo14694b(obj, j);
    }

    /* renamed from: d */
    static float m22020d(Object obj, long j) {
        return f16264f.mo14695c(obj, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m22022d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m22003a(obj, j2, ((255 & b) << i) | (m21995a(obj, j2) & ((255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m22023d(Object obj, long j, boolean z) {
        m22017c(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: d */
    private static boolean m22024d(Class<?> cls) {
        if (!C4348ef.m21320a()) {
            return false;
        }
        try {
            Class<?> cls2 = f16261c;
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

    /* renamed from: e */
    static double m22025e(Object obj, long j) {
        return f16264f.mo14696d(obj, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m22026e(Object obj, long j, boolean z) {
        m22022d(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: f */
    static Object m22028f(Object obj, long j) {
        return f16264f.f16282a.getObject(obj, j);
    }

    /* renamed from: f */
    private static boolean m22029f() {
        if (f16260b == null) {
            return false;
        }
        try {
            Class cls = f16260b.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (C4348ef.m21320a()) {
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
            f16259a.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: g */
    private static boolean m22031g() {
        if (f16260b == null) {
            return false;
        }
        try {
            Class cls = f16260b.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (m22033h() == null) {
                return false;
            }
            if (C4348ef.m21320a()) {
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
            f16259a.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: h */
    private static Field m22033h() {
        if (C4348ef.m21320a()) {
            Field a = m21998a(Buffer.class, "effectiveDirectAddress");
            if (a != null) {
                return a;
            }
        }
        Field a2 = m21998a(Buffer.class, "address");
        if (a2 == null || a2.getType() != Long.TYPE) {
            return null;
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static byte m22036k(Object obj, long j) {
        return (byte) (m21995a(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static byte m22037l(Object obj, long j) {
        return (byte) (m21995a(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static boolean m22038m(Object obj, long j) {
        return m22036k(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static boolean m22039n(Object obj, long j) {
        return m22037l(obj, j) != 0;
    }
}
