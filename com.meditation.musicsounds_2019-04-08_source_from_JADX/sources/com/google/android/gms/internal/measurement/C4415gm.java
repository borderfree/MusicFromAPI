package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.gm */
final class C4415gm implements C4414gl {
    C4415gm() {
    }

    /* renamed from: a */
    public final int mo14559a(int i, Object obj, Object obj2) {
        zzvp zzvp = (zzvp) obj;
        if (zzvp.isEmpty()) {
            return 0;
        }
        Iterator it = zzvp.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Entry entry = (Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public final Object mo14560a(Object obj, Object obj2) {
        zzvp zzvp = (zzvp) obj;
        zzvp zzvp2 = (zzvp) obj2;
        if (!zzvp2.isEmpty()) {
            if (!zzvp.isMutable()) {
                zzvp = zzvp.zzxh();
            }
            zzvp.zza(zzvp2);
        }
        return zzvp;
    }

    /* renamed from: a */
    public final Map<?, ?> mo14561a(Object obj) {
        return (zzvp) obj;
    }

    /* renamed from: b */
    public final Map<?, ?> mo14562b(Object obj) {
        return (zzvp) obj;
    }

    /* renamed from: c */
    public final boolean mo14563c(Object obj) {
        return !((zzvp) obj).isMutable();
    }

    /* renamed from: d */
    public final Object mo14564d(Object obj) {
        ((zzvp) obj).zzsw();
        return obj;
    }

    /* renamed from: e */
    public final Object mo14565e(Object obj) {
        return zzvp.zzxg().zzxh();
    }

    /* renamed from: f */
    public final C4413gk<?, ?> mo14566f(Object obj) {
        throw new NoSuchMethodError();
    }
}
