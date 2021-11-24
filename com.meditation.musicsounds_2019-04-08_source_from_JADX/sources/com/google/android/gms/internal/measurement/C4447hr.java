package com.google.android.gms.internal.measurement;

import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.hr */
final class C4447hr implements Comparable<C4447hr>, Entry<K, V> {

    /* renamed from: a */
    private final K f16231a;

    /* renamed from: b */
    private V f16232b;

    /* renamed from: c */
    private final /* synthetic */ C4440hk f16233c;

    C4447hr(C4440hk hkVar, K k, V v) {
        this.f16233c = hkVar;
        this.f16231a = k;
        this.f16232b = v;
    }

    C4447hr(C4440hk hkVar, Entry<K, V> entry) {
        this(hkVar, (Comparable) entry.getKey(), entry.getValue());
    }

    /* renamed from: a */
    private static boolean m21919a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((C4447hr) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        return m21919a(this.f16231a, entry.getKey()) && m21919a(this.f16232b, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f16231a;
    }

    public final V getValue() {
        return this.f16232b;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = this.f16231a == null ? 0 : this.f16231a.hashCode();
        if (this.f16232b != null) {
            i = this.f16232b.hashCode();
        }
        return hashCode ^ i;
    }

    public final V setValue(V v) {
        this.f16233c.m21906f();
        V v2 = this.f16232b;
        this.f16232b = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f16231a);
        String valueOf2 = String.valueOf(this.f16232b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
