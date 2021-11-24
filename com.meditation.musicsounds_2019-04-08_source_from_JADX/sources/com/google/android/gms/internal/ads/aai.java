package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aai;
import com.google.android.gms.internal.ads.aai.C3389a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class aai<MessageType extends aai<MessageType, BuilderType>, BuilderType extends C3389a<MessageType, BuilderType>> extends C4107yw<MessageType, BuilderType> {
    private static Map<Object, aai<?, ?>> zzdtv = new ConcurrentHashMap();
    protected acx zzdtt = acx.m15765a();
    private int zzdtu = -1;

    /* renamed from: com.google.android.gms.internal.ads.aai$a */
    public static abstract class C3389a<MessageType extends aai<MessageType, BuilderType>, BuilderType extends C3389a<MessageType, BuilderType>> extends C4108yx<MessageType, BuilderType> {

        /* renamed from: a */
        protected MessageType f11341a;

        /* renamed from: b */
        private final MessageType f11342b;

        /* renamed from: c */
        private boolean f11343c = false;

        protected C3389a(MessageType messagetype) {
            this.f11342b = messagetype;
            this.f11341a = (aai) messagetype.mo11474a(C3393e.f11348d, (Object) null, (Object) null);
        }

        /* renamed from: a */
        private static void m15361a(MessageType messagetype, MessageType messagetype2) {
            aby.m15554a().mo11568a(messagetype).mo11562b(messagetype, messagetype2);
        }

        /* renamed from: a */
        public final BuilderType mo11488a(MessageType messagetype) {
            mo11489b();
            m15361a(this.f11341a, messagetype);
            return this;
        }

        /* renamed from: a */
        public final /* synthetic */ C4108yx mo11487a() {
            return (C3389a) clone();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo11489b() {
            if (this.f11343c) {
                MessageType messagetype = (aai) this.f11341a.mo11474a(C3393e.f11348d, (Object) null, (Object) null);
                m15361a(messagetype, this.f11341a);
                this.f11341a = messagetype;
                this.f11343c = false;
            }
        }

        /* renamed from: c */
        public final MessageType mo11490c() {
            boolean z = true;
            if (!this.f11343c) {
                MessageType messagetype = this.f11341a;
                aby.m15554a().mo11568a(messagetype).mo11563c(messagetype);
                this.f11343c = true;
            }
            MessageType messagetype2 = (aai) this.f11341a;
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) messagetype2.mo11474a(C3393e.f11345a, (Object) null, (Object) null)).byteValue();
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = aby.m15554a().mo11568a(messagetype2).mo11564d(messagetype2);
                    if (booleanValue) {
                        messagetype2.mo11474a(C3393e.f11346b, (Object) z ? messagetype2 : null, (Object) null);
                    }
                }
            }
            if (z) {
                return messagetype2;
            }
            throw new zzbed(messagetype2);
        }

        public /* synthetic */ Object clone() {
            C3389a aVar = (C3389a) ((aai) this.f11342b).mo11474a(C3393e.f11349e, (Object) null, (Object) null);
            if (!this.f11343c) {
                MessageType messagetype = this.f11341a;
                aby.m15554a().mo11568a(messagetype).mo11563c(messagetype);
                this.f11343c = true;
            }
            aVar.mo11488a((MessageType) (aai) this.f11341a);
            return aVar;
        }

        /* renamed from: d */
        public final /* synthetic */ abl mo11492d() {
            if (this.f11343c) {
                return this.f11341a;
            }
            MessageType messagetype = this.f11341a;
            aby.m15554a().mo11568a(messagetype).mo11563c(messagetype);
            this.f11343c = true;
            return this.f11341a;
        }

        /* renamed from: e */
        public final /* synthetic */ abl mo11493e() {
            boolean z = true;
            if (!this.f11343c) {
                MessageType messagetype = this.f11341a;
                aby.m15554a().mo11568a(messagetype).mo11563c(messagetype);
                this.f11343c = true;
            }
            aai aai = (aai) this.f11341a;
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) aai.mo11474a(C3393e.f11345a, (Object) null, (Object) null)).byteValue();
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = aby.m15554a().mo11568a(aai).mo11564d(aai);
                    if (booleanValue) {
                        aai.mo11474a(C3393e.f11346b, (Object) z ? aai : null, (Object) null);
                    }
                }
            }
            if (z) {
                return aai;
            }
            throw new zzbed(aai);
        }

        /* renamed from: k */
        public final boolean mo11480k() {
            return aai.m15349a(this.f11341a, false);
        }

        /* renamed from: p */
        public final /* synthetic */ abl mo11484p() {
            return this.f11342b;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.aai$b */
    public static class C3390b<T extends aai<T, ?>> extends C4112za<T> {

        /* renamed from: a */
        private T f11344a;

        public C3390b(T t) {
            this.f11344a = t;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.aai$c */
    public static abstract class C3391c<MessageType extends C3391c<MessageType, BuilderType>, BuilderType> extends aai<MessageType, BuilderType> implements abn {
        protected aac<Object> zzdtz = aac.m15306a();
    }

    /* renamed from: com.google.android.gms.internal.ads.aai$d */
    public static class C3392d<ContainingType extends abl, Type> extends C4132zu<ContainingType, Type> {
    }

    /* 'enum' access flag removed */
    /* renamed from: com.google.android.gms.internal.ads.aai$e */
    public static final class C3393e {

        /* renamed from: a */
        public static final int f11345a = 1;

        /* renamed from: b */
        public static final int f11346b = 2;

        /* renamed from: c */
        public static final int f11347c = 3;

        /* renamed from: d */
        public static final int f11348d = 4;

        /* renamed from: e */
        public static final int f11349e = 5;

        /* renamed from: f */
        public static final int f11350f = 6;

        /* renamed from: g */
        public static final int f11351g = 7;

        /* renamed from: h */
        public static final int f11352h = 1;

        /* renamed from: i */
        public static final int f11353i = 2;

        /* renamed from: j */
        public static final int f11354j = 1;

        /* renamed from: k */
        public static final int f11355k = 2;

        /* renamed from: l */
        private static final /* synthetic */ int[] f11356l = {f11345a, f11346b, f11347c, f11348d, f11349e, f11350f, f11351g};

        /* renamed from: m */
        private static final /* synthetic */ int[] f11357m = {f11352h, f11353i};

        /* renamed from: n */
        private static final /* synthetic */ int[] f11358n = {f11354j, f11355k};

        /* renamed from: a */
        public static int[] m15371a() {
            return (int[]) f11356l.clone();
        }
    }

    /* renamed from: a */
    private static <T extends aai<T, ?>> T m15341a(T t, C4124zm zmVar, C4135zx zxVar) {
        T t2 = (aai) t.mo11474a(C3393e.f11348d, (Object) null, (Object) null);
        try {
            aby.m15554a().mo11568a(t2).mo11557a(t2, C4127zp.m20493a(zmVar), zxVar);
            aby.m15554a().mo11568a(t2).mo11563c(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof zzbbu) {
                throw ((zzbbu) e.getCause());
            }
            throw new zzbbu(e.getMessage()).zzj(t2);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof zzbbu) {
                throw ((zzbbu) e2.getCause());
            }
            throw e2;
        }
    }

    /* renamed from: a */
    protected static <T extends aai<T, ?>> T m15342a(T t, zzbah zzbah) {
        boolean z;
        T a = m15343a(t, zzbah, C4135zx.m20598a());
        boolean z2 = false;
        if (a != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) a.mo11474a(C3393e.f11345a, (Object) null, (Object) null)).byteValue();
            if (byteValue == 1) {
                z = true;
            } else if (byteValue == 0) {
                z = false;
            } else {
                z = aby.m15554a().mo11568a(a).mo11564d(a);
                if (booleanValue) {
                    a.mo11474a(C3393e.f11346b, (Object) z ? a : null, (Object) null);
                }
            }
            if (!z) {
                throw new zzbed(a).zzaga().zzj(a);
            }
        }
        if (a != null) {
            boolean booleanValue2 = Boolean.TRUE.booleanValue();
            byte byteValue2 = ((Byte) a.mo11474a(C3393e.f11345a, (Object) null, (Object) null)).byteValue();
            if (byteValue2 == 1) {
                z2 = true;
            } else if (byteValue2 != 0) {
                z2 = aby.m15554a().mo11568a(a).mo11564d(a);
                if (booleanValue2) {
                    a.mo11474a(C3393e.f11346b, (Object) z2 ? a : null, (Object) null);
                }
            }
            if (!z2) {
                throw new zzbed(a).zzaga().zzj(a);
            }
        }
        return a;
    }

    /* renamed from: a */
    private static <T extends aai<T, ?>> T m15343a(T t, zzbah zzbah, C4135zx zxVar) {
        T a;
        try {
            C4124zm zzabf = zzbah.zzabf();
            a = m15341a(t, zzabf, zxVar);
            zzabf.mo13846a(0);
            return a;
        } catch (zzbbu e) {
            throw e.zzj(a);
        } catch (zzbbu e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    protected static <T extends aai<T, ?>> T m15344a(T t, byte[] bArr) {
        T b = m15350b(t, bArr);
        if (b != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) b.mo11474a(C3393e.f11345a, (Object) null, (Object) null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = aby.m15554a().mo11568a(b).mo11564d(b);
                    if (booleanValue) {
                        b.mo11474a(C3393e.f11346b, (Object) z ? b : null, (Object) null);
                    }
                }
            }
            if (!z) {
                throw new zzbed(b).zzaga().zzj(b);
            }
        }
        return b;
    }

    /* renamed from: a */
    static <T extends aai<?, ?>> T m15345a(Class<T> cls) {
        T t = (aai) zzdtv.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (aai) zzdtv.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t != null) {
            return t;
        }
        String str = "Unable to get default instance for: ";
        String valueOf = String.valueOf(cls.getName());
        throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: a */
    protected static Object m15346a(abl abl, String str, Object[] objArr) {
        return new aca(abl, str, objArr);
    }

    /* renamed from: a */
    static Object m15347a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: a */
    protected static <T extends aai<?, ?>> void m15348a(Class<T> cls, T t) {
        zzdtv.put(cls, t);
    }

    /* renamed from: a */
    protected static final <T extends aai<T, ?>> boolean m15349a(T t, boolean z) {
        byte byteValue = ((Byte) t.mo11474a(C3393e.f11345a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        return aby.m15554a().mo11568a(t).mo11564d(t);
    }

    /* renamed from: b */
    private static <T extends aai<T, ?>> T m15350b(T t, byte[] bArr) {
        T t2 = (aai) t.mo11474a(C3393e.f11348d, (Object) null, (Object) null);
        try {
            aby.m15554a().mo11568a(t2).mo11559a(t2, bArr, 0, bArr.length, new C4116ze());
            aby.m15554a().mo11568a(t2).mo11563c(t2);
            if (t2.zzdpf == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof zzbbu) {
                throw ((zzbbu) e.getCause());
            }
            throw new zzbbu(e.getMessage()).zzj(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzbbu.zzadl().zzj(t2);
        }
    }

    /* renamed from: m */
    protected static <E> aan<E> m15351m() {
        return abz.m15558d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo11474a(int i, Object obj, Object obj2);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo11475a(int i) {
        this.zzdtu = i;
    }

    /* renamed from: a */
    public final void mo11476a(zzbav zzbav) {
        aby.m15554a().mo11567a(getClass()).mo11558a(this, (adj) C4130zs.m20544a(zzbav));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((aai) mo11474a(C3393e.f11350f, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return aby.m15554a().mo11568a(this).mo11560a(this, (aai) obj);
    }

    public int hashCode() {
        if (this.zzdpf != 0) {
            return this.zzdpf;
        }
        this.zzdpf = aby.m15554a().mo11568a(this).mo11555a(this);
        return this.zzdpf;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final int mo11479j() {
        return this.zzdtu;
    }

    /* renamed from: k */
    public final boolean mo11480k() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) mo11474a(C3393e.f11345a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = aby.m15554a().mo11568a(this).mo11564d(this);
        if (booleanValue) {
            mo11474a(C3393e.f11346b, (Object) d ? this : null, (Object) null);
        }
        return d;
    }

    /* renamed from: l */
    public final int mo11481l() {
        if (this.zzdtu == -1) {
            this.zzdtu = aby.m15554a().mo11568a(this).mo11561b(this);
        }
        return this.zzdtu;
    }

    /* renamed from: n */
    public final /* synthetic */ abm mo11482n() {
        C3389a aVar = (C3389a) mo11474a(C3393e.f11349e, (Object) null, (Object) null);
        aVar.mo11488a(this);
        return aVar;
    }

    /* renamed from: o */
    public final /* synthetic */ abm mo11483o() {
        return (C3389a) mo11474a(C3393e.f11349e, (Object) null, (Object) null);
    }

    /* renamed from: p */
    public final /* synthetic */ abl mo11484p() {
        return (aai) mo11474a(C3393e.f11350f, (Object) null, (Object) null);
    }

    public String toString() {
        return abo.m15479a(this, super.toString());
    }
}
