package com.bumptech.glide.load.engine.p046a;

import android.util.Log;
import com.bumptech.glide.p040g.C1257i;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.bumptech.glide.load.engine.a.j */
public final class C1404j implements C1393b {

    /* renamed from: a */
    private final C1401h<C1405a, Object> f4707a;

    /* renamed from: b */
    private final C1406b f4708b;

    /* renamed from: c */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f4709c;

    /* renamed from: d */
    private final Map<Class<?>, C1392a<?>> f4710d;

    /* renamed from: e */
    private final int f4711e;

    /* renamed from: f */
    private int f4712f;

    /* renamed from: com.bumptech.glide.load.engine.a.j$a */
    private static final class C1405a implements C1411m {

        /* renamed from: a */
        int f4713a;

        /* renamed from: b */
        private final C1406b f4714b;

        /* renamed from: c */
        private Class<?> f4715c;

        C1405a(C1406b bVar) {
            this.f4714b = bVar;
        }

        /* renamed from: a */
        public void mo6128a() {
            this.f4714b.mo6136a(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6154a(int i, Class<?> cls) {
            this.f4713a = i;
            this.f4715c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1405a)) {
                return false;
            }
            C1405a aVar = (C1405a) obj;
            return this.f4713a == aVar.f4713a && this.f4715c == aVar.f4715c;
        }

        public int hashCode() {
            return (this.f4713a * 31) + (this.f4715c != null ? this.f4715c.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Key{size=");
            sb.append(this.f4713a);
            sb.append("array=");
            sb.append(this.f4715c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a.j$b */
    private static final class C1406b extends C1397d<C1405a> {
        C1406b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C1405a mo6135b() {
            return new C1405a(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C1405a mo6159a(int i, Class<?> cls) {
            C1405a aVar = (C1405a) mo6137c();
            aVar.mo6154a(i, cls);
            return aVar;
        }
    }

    public C1404j() {
        this.f4707a = new C1401h<>();
        this.f4708b = new C1406b();
        this.f4709c = new HashMap();
        this.f4710d = new HashMap();
        this.f4711e = 4194304;
    }

    public C1404j(int i) {
        this.f4707a = new C1401h<>();
        this.f4708b = new C1406b();
        this.f4709c = new HashMap();
        this.f4710d = new HashMap();
        this.f4711e = i;
    }

    /* renamed from: a */
    private <T> T m7173a(C1405a aVar) {
        return this.f4707a.mo6146a(aVar);
    }

    /* renamed from: a */
    private <T> T m7174a(C1405a aVar, Class<T> cls) {
        C1392a b = m7177b(cls);
        T a = m7173a(aVar);
        if (a != null) {
            this.f4712f -= b.mo6112a(a) * b.mo6115b();
            m7183c(b.mo6112a(a), cls);
        }
        if (a != null) {
            return a;
        }
        if (Log.isLoggable(b.mo6114a(), 2)) {
            String a2 = b.mo6114a();
            StringBuilder sb = new StringBuilder();
            sb.append("Allocated ");
            sb.append(aVar.f4713a);
            sb.append(" bytes");
            Log.v(a2, sb.toString());
        }
        return b.mo6113a(aVar.f4713a);
    }

    /* renamed from: a */
    private NavigableMap<Integer, Integer> m7175a(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f4709c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f4709c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: a */
    private boolean m7176a(int i, Integer num) {
        return num != null && (m7179b() || num.intValue() <= i * 8);
    }

    /* renamed from: b */
    private <T> C1392a<T> m7177b(Class<T> cls) {
        C1392a<T> aVar = (C1392a) this.f4710d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new C1403i<>();
            } else if (cls.equals(byte[].class)) {
                aVar = new C1400g<>();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("No array pool found for: ");
                sb.append(cls.getSimpleName());
                throw new IllegalArgumentException(sb.toString());
            }
            this.f4710d.put(cls, aVar);
        }
        return aVar;
    }

    /* renamed from: b */
    private <T> C1392a<T> m7178b(T t) {
        return m7177b(t.getClass());
    }

    /* renamed from: b */
    private boolean m7179b() {
        return this.f4712f == 0 || this.f4711e / this.f4712f >= 2;
    }

    /* renamed from: b */
    private boolean m7180b(int i) {
        return i <= this.f4711e / 2;
    }

    /* renamed from: c */
    private void m7181c() {
        m7182c(this.f4711e);
    }

    /* renamed from: c */
    private void m7182c(int i) {
        while (this.f4712f > i) {
            Object a = this.f4707a.mo6145a();
            C1257i.m6691a(a);
            C1392a b = m7178b((T) a);
            this.f4712f -= b.mo6112a(a) * b.mo6115b();
            m7183c(b.mo6112a(a), a.getClass());
            if (Log.isLoggable(b.mo6114a(), 2)) {
                String a2 = b.mo6114a();
                StringBuilder sb = new StringBuilder();
                sb.append("evicted: ");
                sb.append(b.mo6112a(a));
                Log.v(a2, sb.toString());
            }
        }
    }

    /* renamed from: c */
    private void m7183c(int i, Class<?> cls) {
        NavigableMap a = m7175a(cls);
        Integer num = (Integer) a.get(Integer.valueOf(i));
        if (num == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Tried to decrement empty size, size: ");
            sb.append(i);
            sb.append(", this: ");
            sb.append(this);
            throw new NullPointerException(sb.toString());
        } else if (num.intValue() == 1) {
            a.remove(Integer.valueOf(i));
        } else {
            a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    /* renamed from: a */
    public synchronized <T> T mo6116a(int i, Class<T> cls) {
        Integer num;
        num = (Integer) m7175a(cls).ceilingKey(Integer.valueOf(i));
        return m7174a(m7176a(i, num) ? this.f4708b.mo6159a(num.intValue(), cls) : this.f4708b.mo6159a(i, cls), cls);
    }

    /* renamed from: a */
    public synchronized void mo6117a() {
        m7182c(0);
    }

    /* renamed from: a */
    public synchronized void mo6118a(int i) {
        if (i >= 40) {
            try {
                mo6117a();
            } catch (Throwable th) {
                throw th;
            }
        } else if (i >= 20 || i == 15) {
            m7182c(this.f4711e / 2);
        }
    }

    /* renamed from: a */
    public synchronized <T> void mo6119a(T t) {
        Class cls = t.getClass();
        C1392a b = m7177b(cls);
        int a = b.mo6112a(t);
        int b2 = b.mo6115b() * a;
        if (m7180b(b2)) {
            C1405a a2 = this.f4708b.mo6159a(a, cls);
            this.f4707a.mo6147a(a2, t);
            NavigableMap a3 = m7175a(cls);
            Integer num = (Integer) a3.get(Integer.valueOf(a2.f4713a));
            Integer valueOf = Integer.valueOf(a2.f4713a);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            a3.put(valueOf, Integer.valueOf(i));
            this.f4712f += b2;
            m7181c();
        }
    }

    /* renamed from: b */
    public synchronized <T> T mo6120b(int i, Class<T> cls) {
        return m7174a(this.f4708b.mo6159a(i, cls), cls);
    }
}
