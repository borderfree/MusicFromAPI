package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

final class abh implements abg {
    abh() {
    }

    /* renamed from: a */
    public final int mo11541a(int i, Object obj, Object obj2) {
        zzbco zzbco = (zzbco) obj;
        if (zzbco.isEmpty()) {
            return 0;
        }
        Iterator it = zzbco.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Entry entry = (Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public final Object mo11542a(Object obj, Object obj2) {
        zzbco zzbco = (zzbco) obj;
        zzbco zzbco2 = (zzbco) obj2;
        if (!zzbco2.isEmpty()) {
            if (!zzbco.isMutable()) {
                zzbco = zzbco.zzaec();
            }
            zzbco.zza(zzbco2);
        }
        return zzbco;
    }

    /* renamed from: a */
    public final Map<?, ?> mo11543a(Object obj) {
        return (zzbco) obj;
    }

    /* renamed from: b */
    public final Map<?, ?> mo11544b(Object obj) {
        return (zzbco) obj;
    }

    /* renamed from: c */
    public final boolean mo11545c(Object obj) {
        return !((zzbco) obj).isMutable();
    }

    /* renamed from: d */
    public final Object mo11546d(Object obj) {
        ((zzbco) obj).zzaaz();
        return obj;
    }

    /* renamed from: e */
    public final Object mo11547e(Object obj) {
        return zzbco.zzaeb().zzaec();
    }

    /* renamed from: f */
    public final abf<?, ?> mo11548f(Object obj) {
        throw new NoSuchMethodError();
    }
}
