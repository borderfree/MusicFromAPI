package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4383fm;
import com.google.android.gms.internal.measurement.C4383fm.C4384a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.measurement.fm */
public abstract class C4383fm<MessageType extends C4383fm<MessageType, BuilderType>, BuilderType extends C4384a<MessageType, BuilderType>> extends C4343ea<MessageType, BuilderType> {
    private static Map<Object, C4383fm<?, ?>> zzbyf = new ConcurrentHashMap();
    protected C4457ia zzbyd = C4457ia.m21959a();
    private int zzbye = -1;

    /* renamed from: com.google.android.gms.internal.measurement.fm$a */
    public static abstract class C4384a<MessageType extends C4383fm<MessageType, BuilderType>, BuilderType extends C4384a<MessageType, BuilderType>> extends C4344eb<MessageType, BuilderType> {

        /* renamed from: a */
        protected MessageType f16115a;

        /* renamed from: b */
        private final MessageType f16116b;

        /* renamed from: c */
        private boolean f16117c = false;

        protected C4384a(MessageType messagetype) {
            this.f16116b = messagetype;
            this.f16115a = (C4383fm) messagetype.mo14492a(C4388e.f16122d, (Object) null, (Object) null);
        }

        /* renamed from: a */
        private static void m21585a(MessageType messagetype, MessageType messagetype2) {
            C4433hd.m21780a().mo14586a(messagetype).mo14576b(messagetype, messagetype2);
        }

        /* renamed from: a */
        public final /* synthetic */ C4344eb mo14303a() {
            return (C4384a) clone();
        }

        /* renamed from: a */
        public final BuilderType mo14304a(MessageType messagetype) {
            mo14504b();
            m21585a(this.f16115a, messagetype);
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo14504b() {
            if (this.f16117c) {
                MessageType messagetype = (C4383fm) this.f16115a.mo14492a(C4388e.f16122d, (Object) null, (Object) null);
                m21585a(messagetype, this.f16115a);
                this.f16115a = messagetype;
                this.f16117c = false;
            }
        }

        /* renamed from: c */
        public MessageType mo14507e() {
            if (this.f16117c) {
                return this.f16115a;
            }
            MessageType messagetype = this.f16115a;
            C4433hd.m21780a().mo14586a(messagetype).mo14577c(messagetype);
            this.f16117c = true;
            return this.f16115a;
        }

        public /* synthetic */ Object clone() {
            C4384a aVar = (C4384a) ((C4383fm) this.f16116b).mo14492a(C4388e.f16123e, (Object) null, (Object) null);
            aVar.mo14304a((MessageType) (C4383fm) mo14507e());
            return aVar;
        }

        /* renamed from: d */
        public final MessageType mo14508g() {
            MessageType messagetype = (C4383fm) mo14507e();
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) messagetype.mo14492a(C4388e.f16119a, (Object) null, (Object) null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = C4433hd.m21780a().mo14586a(messagetype).mo14578d(messagetype);
                    if (booleanValue) {
                        messagetype.mo14492a(C4388e.f16120b, (Object) z ? messagetype : null, (Object) null);
                    }
                }
            }
            if (z) {
                return messagetype;
            }
            throw new zzxc(messagetype);
        }

        /* renamed from: f */
        public final boolean mo14495f() {
            return C4383fm.m21573a(this.f16115a, false);
        }

        /* renamed from: l */
        public final /* synthetic */ C4419gq mo14501l() {
            return this.f16116b;
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.fm$b */
    public static class C4385b<T extends C4383fm<T, ?>> extends C4345ec<T> {

        /* renamed from: a */
        private final T f16118a;

        public C4385b(T t) {
            this.f16118a = t;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo14509a(C4359eq eqVar, C4371fb fbVar) {
            return C4383fm.m21568a(this.f16118a, eqVar, fbVar);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.fm$c */
    public static abstract class C4386c<MessageType extends C4386c<MessageType, BuilderType>, BuilderType> extends C4383fm<MessageType, BuilderType> implements C4421gs {
        protected C4376ff<Object> zzbyj = C4376ff.m21531a();
    }

    /* renamed from: com.google.android.gms.internal.measurement.fm$d */
    public static class C4387d<ContainingType extends C4419gq, Type> extends C4367ey<ContainingType, Type> {
    }

    /* 'enum' access flag removed */
    /* renamed from: com.google.android.gms.internal.measurement.fm$e */
    public static final class C4388e {

        /* renamed from: a */
        public static final int f16119a = 1;

        /* renamed from: b */
        public static final int f16120b = 2;

        /* renamed from: c */
        public static final int f16121c = 3;

        /* renamed from: d */
        public static final int f16122d = 4;

        /* renamed from: e */
        public static final int f16123e = 5;

        /* renamed from: f */
        public static final int f16124f = 6;

        /* renamed from: g */
        public static final int f16125g = 7;

        /* renamed from: h */
        public static final int f16126h = 1;

        /* renamed from: i */
        public static final int f16127i = 2;

        /* renamed from: j */
        public static final int f16128j = 1;

        /* renamed from: k */
        public static final int f16129k = 2;

        /* renamed from: l */
        private static final /* synthetic */ int[] f16130l = {f16119a, f16120b, f16121c, f16122d, f16123e, f16124f, f16125g};

        /* renamed from: m */
        private static final /* synthetic */ int[] f16131m = {f16126h, f16127i};

        /* renamed from: n */
        private static final /* synthetic */ int[] f16132n = {f16128j, f16129k};

        /* renamed from: a */
        public static int[] m21597a() {
            return (int[]) f16130l.clone();
        }
    }

    /* renamed from: a */
    static <T extends C4383fm<T, ?>> T m21568a(T t, C4359eq eqVar, C4371fb fbVar) {
        T t2 = (C4383fm) t.mo14492a(C4388e.f16122d, (Object) null, (Object) null);
        try {
            C4433hd.m21780a().mo14586a(t2).mo14572a(t2, C4362et.m21398a(eqVar), fbVar);
            C4433hd.m21780a().mo14586a(t2).mo14577c(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof zzuv) {
                throw ((zzuv) e.getCause());
            }
            throw new zzuv(e.getMessage()).zzg(t2);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof zzuv) {
                throw ((zzuv) e2.getCause());
            }
            throw e2;
        }
    }

    /* renamed from: a */
    static <T extends C4383fm<?, ?>> T m21569a(Class<T> cls) {
        T t = (C4383fm) zzbyf.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C4383fm) zzbyf.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (C4383fm) ((C4383fm) C4462if.m21997a(cls)).mo14492a(C4388e.f16124f, (Object) null, (Object) null);
            if (t != null) {
                zzbyf.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: a */
    protected static Object m21570a(C4419gq gqVar, String str, Object[] objArr) {
        return new C4435hf(gqVar, str, objArr);
    }

    /* renamed from: a */
    static Object m21571a(Method method, Object obj, Object... objArr) {
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
    protected static <T extends C4383fm<?, ?>> void m21572a(Class<T> cls, T t) {
        zzbyf.put(cls, t);
    }

    /* renamed from: a */
    protected static final <T extends C4383fm<T, ?>> boolean m21573a(T t, boolean z) {
        byte byteValue = ((Byte) t.mo14492a(C4388e.f16119a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        return C4433hd.m21780a().mo14586a(t).mo14578d(t);
    }

    /* renamed from: i */
    protected static <E> C4394fs<E> m21574i() {
        return C4434he.m21783d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo14492a(int i, Object obj, Object obj2);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14300a(int i) {
        this.zzbye = i;
    }

    /* renamed from: a */
    public final void mo14493a(zztv zztv) {
        C4433hd.m21780a().mo14585a(getClass()).mo14573a(this, (C4474in) C4365ew.m21449a(zztv));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final int mo14302e() {
        return this.zzbye;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((C4383fm) mo14492a(C4388e.f16124f, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return C4433hd.m21780a().mo14586a(this).mo14574a(this, (C4383fm) obj);
    }

    /* renamed from: f */
    public final boolean mo14495f() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) mo14492a(C4388e.f16119a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = C4433hd.m21780a().mo14586a(this).mo14578d(this);
        if (booleanValue) {
            mo14492a(C4388e.f16120b, (Object) d ? this : null, (Object) null);
        }
        return d;
    }

    /* renamed from: g */
    public final BuilderType mo14496g() {
        BuilderType buildertype = (C4384a) mo14492a(C4388e.f16123e, (Object) null, (Object) null);
        buildertype.mo14304a(this);
        return buildertype;
    }

    /* renamed from: h */
    public final int mo14497h() {
        if (this.zzbye == -1) {
            this.zzbye = C4433hd.m21780a().mo14586a(this).mo14575b(this);
        }
        return this.zzbye;
    }

    public int hashCode() {
        if (this.zzbti != 0) {
            return this.zzbti;
        }
        this.zzbti = C4433hd.m21780a().mo14586a(this).mo14570a(this);
        return this.zzbti;
    }

    /* renamed from: j */
    public final /* synthetic */ C4420gr mo14499j() {
        C4384a aVar = (C4384a) mo14492a(C4388e.f16123e, (Object) null, (Object) null);
        aVar.mo14304a(this);
        return aVar;
    }

    /* renamed from: k */
    public final /* synthetic */ C4420gr mo14500k() {
        return (C4384a) mo14492a(C4388e.f16123e, (Object) null, (Object) null);
    }

    /* renamed from: l */
    public final /* synthetic */ C4419gq mo14501l() {
        return (C4383fm) mo14492a(C4388e.f16124f, (Object) null, (Object) null);
    }

    public String toString() {
        return C4422gt.m21714a(this, super.toString());
    }
}
