package android.arch.p001a.p003b;

import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: android.arch.a.b.a */
public class C0006a<K, V> extends C0007b<K, V> {

    /* renamed from: a */
    private HashMap<K, C0011c<K, V>> f8a = new HashMap<>();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0011c<K, V> mo6a(K k) {
        return (C0011c) this.f8a.get(k);
    }

    /* renamed from: a */
    public V mo7a(K k, V v) {
        C0011c a = mo6a(k);
        if (a != null) {
            return a.f14b;
        }
        this.f8a.put(k, mo12b(k, v));
        return null;
    }

    /* renamed from: b */
    public V mo8b(K k) {
        V b = super.mo8b(k);
        this.f8a.remove(k);
        return b;
    }

    /* renamed from: c */
    public boolean mo9c(K k) {
        return this.f8a.containsKey(k);
    }

    /* renamed from: d */
    public Entry<K, V> mo10d(K k) {
        if (mo9c(k)) {
            return ((C0011c) this.f8a.get(k)).f16d;
        }
        return null;
    }
}
