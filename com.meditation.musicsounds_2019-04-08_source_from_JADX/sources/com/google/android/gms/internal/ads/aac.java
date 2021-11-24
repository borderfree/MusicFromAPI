package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aae;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class aac<FieldDescriptorType extends aae<FieldDescriptorType>> {

    /* renamed from: d */
    private static final aac f11329d = new aac(true);

    /* renamed from: a */
    private final ach<FieldDescriptorType, Object> f11330a = ach.m15713a(16);

    /* renamed from: b */
    private boolean f11331b;

    /* renamed from: c */
    private boolean f11332c = false;

    private aac() {
    }

    private aac(boolean z) {
        mo11443c();
    }

    /* renamed from: a */
    static int m15305a(zzbes zzbes, int i, Object obj) {
        int e = zzbav.m20663e(i);
        if (zzbes == zzbes.GROUP) {
            aak.m15384a((abl) obj);
            e <<= 1;
        }
        return e + m15314b(zzbes, obj);
    }

    /* renamed from: a */
    public static <T extends aae<T>> aac<T> m15306a() {
        return f11329d;
    }

    /* renamed from: a */
    private final Object m15307a(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f11330a.get(fielddescriptortype);
        return obj instanceof aao ? aao.m15392a() : obj;
    }

    /* renamed from: a */
    private static Object m15308a(Object obj) {
        if (obj instanceof abt) {
            return ((abt) obj).mo11565a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: a */
    private final void m15309a(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo11458d()) {
            m15311a(fielddescriptortype.mo11456b(), obj);
            r7 = obj;
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                m15311a(fielddescriptortype.mo11456b(), obj2);
            }
            r7 = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (r7 instanceof aao) {
            this.f11332c = true;
        }
        this.f11330a.put(fielddescriptortype, r7);
    }

    /* renamed from: a */
    static void m15310a(zzbav zzbav, zzbes zzbes, int i, Object obj) {
        if (zzbes == zzbes.GROUP) {
            abl abl = (abl) obj;
            aak.m15384a(abl);
            zzbav.mo13929a(i, 3);
            abl.mo11476a(zzbav);
            zzbav.mo13929a(i, 4);
            return;
        }
        zzbav.mo13929a(i, zzbes.zzagm());
        switch (aad.f11334b[zzbes.ordinal()]) {
            case 1:
                zzbav.mo13924a(((Double) obj).doubleValue());
                break;
            case 2:
                zzbav.mo13925a(((Float) obj).floatValue());
                return;
            case 3:
                zzbav.mo13936a(((Long) obj).longValue());
                return;
            case 4:
                zzbav.mo13936a(((Long) obj).longValue());
                return;
            case 5:
                zzbav.mo13926a(((Integer) obj).intValue());
                return;
            case 6:
                zzbav.mo13952c(((Long) obj).longValue());
                return;
            case 7:
                zzbav.mo13954d(((Integer) obj).intValue());
                return;
            case 8:
                zzbav.mo13941a(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((abl) obj).mo11476a(zzbav);
                return;
            case 10:
                zzbav.mo13937a((abl) obj);
                return;
            case 11:
                if (obj instanceof zzbah) {
                    zzbav.mo13938a((zzbah) obj);
                    return;
                } else {
                    zzbav.mo13939a((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzbah) {
                    zzbav.mo13938a((zzbah) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzbav.mo13953c(bArr, 0, bArr.length);
                return;
            case 13:
                zzbav.mo13943b(((Integer) obj).intValue());
                return;
            case 14:
                zzbav.mo13954d(((Integer) obj).intValue());
                return;
            case 15:
                zzbav.mo13952c(((Long) obj).longValue());
                return;
            case 16:
                zzbav.mo13949c(((Integer) obj).intValue());
                return;
            case 17:
                zzbav.mo13947b(((Long) obj).longValue());
                return;
            case 18:
                if (!(obj instanceof aal)) {
                    zzbav.mo13926a(((Integer) obj).intValue());
                    break;
                } else {
                    zzbav.mo13926a(((aal) obj).zzhq());
                    return;
                }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.aao) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.aal) == false) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m15311a(com.google.android.gms.internal.ads.zzbes r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.ads.aak.m15381a(r3)
            int[] r0 = com.google.android.gms.internal.ads.aad.f11333a
            com.google.android.gms.internal.ads.zzbex r2 = r2.zzagl()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0040;
                case 2: goto L_0x003d;
                case 3: goto L_0x003a;
                case 4: goto L_0x0037;
                case 5: goto L_0x0034;
                case 6: goto L_0x0031;
                case 7: goto L_0x0028;
                case 8: goto L_0x001e;
                case 9: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0043
        L_0x0015:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.abl
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.aao
            if (r2 == 0) goto L_0x0043
            goto L_0x0026
        L_0x001e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.aal
            if (r2 == 0) goto L_0x0043
        L_0x0026:
            r1 = 1
            goto L_0x0043
        L_0x0028:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzbah
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0043
            goto L_0x0026
        L_0x0031:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0042
        L_0x0034:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0042
        L_0x0037:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0042
        L_0x003a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0042
        L_0x003d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0042
        L_0x0040:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0042:
            r1 = r0
        L_0x0043:
            if (r1 == 0) goto L_0x0046
            return
        L_0x0046:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aac.m15311a(com.google.android.gms.internal.ads.zzbes, java.lang.Object):void");
    }

    /* renamed from: a */
    private static boolean m15312a(Entry<FieldDescriptorType, Object> entry) {
        aae aae = (aae) entry.getKey();
        if (aae.mo11457c() == zzbex.MESSAGE) {
            if (aae.mo11458d()) {
                for (abl k : (List) entry.getValue()) {
                    if (!k.mo11480k()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof abl) {
                    if (!((abl) value).mo11480k()) {
                        return false;
                    }
                } else if (value instanceof aao) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    private static int m15313b(aae<?> aae, Object obj) {
        zzbes b = aae.mo11456b();
        int a = aae.mo11453a();
        if (!aae.mo11458d()) {
            return m15305a(b, a, obj);
        }
        int i = 0;
        if (aae.mo11459e()) {
            for (Object b2 : (List) obj) {
                i += m15314b(b, b2);
            }
            return zzbav.m20663e(a) + i + zzbav.m20685l(i);
        }
        for (Object a2 : (List) obj) {
            i += m15305a(b, a, a2);
        }
        return i;
    }

    /* renamed from: b */
    private static int m15314b(zzbes zzbes, Object obj) {
        switch (aad.f11334b[zzbes.ordinal()]) {
            case 1:
                return zzbav.m20642b(((Double) obj).doubleValue());
            case 2:
                return zzbav.m20643b(((Float) obj).floatValue());
            case 3:
                return zzbav.m20662d(((Long) obj).longValue());
            case 4:
                return zzbav.m20665e(((Long) obj).longValue());
            case 5:
                return zzbav.m20666f(((Integer) obj).intValue());
            case 6:
                return zzbav.m20673g(((Long) obj).longValue());
            case 7:
                return zzbav.m20678i(((Integer) obj).intValue());
            case 8:
                return zzbav.m20654b(((Boolean) obj).booleanValue());
            case 9:
                return zzbav.m20658c((abl) obj);
            case 10:
                return obj instanceof aao ? zzbav.m20639a((aat) (aao) obj) : zzbav.m20651b((abl) obj);
            case 11:
                return obj instanceof zzbah ? zzbav.m20652b((zzbah) obj) : zzbav.m20653b((String) obj);
            case 12:
                return obj instanceof zzbah ? zzbav.m20652b((zzbah) obj) : zzbav.m20655b((byte[]) obj);
            case 13:
                return zzbav.m20670g(((Integer) obj).intValue());
            case 14:
                return zzbav.m20681j(((Integer) obj).intValue());
            case 15:
                return zzbav.m20677h(((Long) obj).longValue());
            case 16:
                return zzbav.m20674h(((Integer) obj).intValue());
            case 17:
                return zzbav.m20669f(((Long) obj).longValue());
            case 18:
                return obj instanceof aal ? zzbav.m20683k(((aal) obj).zzhq()) : zzbav.m20683k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: b */
    private final void m15315b(Entry<FieldDescriptorType, Object> entry) {
        aae aae = (aae) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof aao) {
            value = aao.m15392a();
        }
        if (aae.mo11458d()) {
            Object a = m15307a((FieldDescriptorType) aae);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) a).add(m15308a(a2));
            }
            this.f11330a.put(aae, a);
        } else if (aae.mo11457c() == zzbex.MESSAGE) {
            Object a3 = m15307a((FieldDescriptorType) aae);
            if (a3 == null) {
                this.f11330a.put(aae, m15308a(value));
            } else {
                this.f11330a.put(aae, a3 instanceof abt ? aae.mo11455a((abt) a3, (abt) value) : aae.mo11454a(((abl) a3).mo11482n(), (abl) value).mo11493e());
            }
        } else {
            this.f11330a.put(aae, m15308a(value));
        }
    }

    /* renamed from: c */
    private static int m15316c(Entry<FieldDescriptorType, Object> entry) {
        aae aae = (aae) entry.getKey();
        Object value = entry.getValue();
        return (aae.mo11457c() != zzbex.MESSAGE || aae.mo11458d() || aae.mo11459e()) ? m15313b(aae, value) : value instanceof aao ? zzbav.m20646b(((aae) entry.getKey()).mo11453a(), (aat) (aao) value) : zzbav.m20647b(((aae) entry.getKey()).mo11453a(), (abl) value);
    }

    /* renamed from: a */
    public final void mo11441a(aac<FieldDescriptorType> aac) {
        for (int i = 0; i < aac.f11330a.mo11643c(); i++) {
            m15315b(aac.f11330a.mo11641b(i));
        }
        for (Entry b : aac.f11330a.mo11646d()) {
            m15315b(b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo11442b() {
        return this.f11330a.isEmpty();
    }

    /* renamed from: c */
    public final void mo11443c() {
        if (!this.f11331b) {
            this.f11330a.mo11640a();
            this.f11331b = true;
        }
    }

    public final /* synthetic */ Object clone() {
        aac aac = new aac();
        for (int i = 0; i < this.f11330a.mo11643c(); i++) {
            Entry b = this.f11330a.mo11641b(i);
            aac.m15309a((FieldDescriptorType) (aae) b.getKey(), b.getValue());
        }
        for (Entry entry : this.f11330a.mo11646d()) {
            aac.m15309a((FieldDescriptorType) (aae) entry.getKey(), entry.getValue());
        }
        aac.f11332c = this.f11332c;
        return aac;
    }

    /* renamed from: d */
    public final boolean mo11445d() {
        return this.f11331b;
    }

    /* renamed from: e */
    public final Iterator<Entry<FieldDescriptorType, Object>> mo11446e() {
        return this.f11332c ? new aas(this.f11330a.entrySet().iterator()) : this.f11330a.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aac)) {
            return false;
        }
        return this.f11330a.equals(((aac) obj).f11330a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final Iterator<Entry<FieldDescriptorType, Object>> mo11448f() {
        return this.f11332c ? new aas(this.f11330a.mo11647e().iterator()) : this.f11330a.mo11647e().iterator();
    }

    /* renamed from: g */
    public final boolean mo11449g() {
        for (int i = 0; i < this.f11330a.mo11643c(); i++) {
            if (!m15312a(this.f11330a.mo11641b(i))) {
                return false;
            }
        }
        for (Entry a : this.f11330a.mo11646d()) {
            if (!m15312a(a)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public final int mo11450h() {
        int i = 0;
        for (int i2 = 0; i2 < this.f11330a.mo11643c(); i2++) {
            Entry b = this.f11330a.mo11641b(i2);
            i += m15313b((aae) b.getKey(), b.getValue());
        }
        for (Entry entry : this.f11330a.mo11646d()) {
            i += m15313b((aae) entry.getKey(), entry.getValue());
        }
        return i;
    }

    public final int hashCode() {
        return this.f11330a.hashCode();
    }

    /* renamed from: i */
    public final int mo11452i() {
        int i = 0;
        for (int i2 = 0; i2 < this.f11330a.mo11643c(); i2++) {
            i += m15316c(this.f11330a.mo11641b(i2));
        }
        for (Entry c : this.f11330a.mo11646d()) {
            i += m15316c(c);
        }
        return i;
    }
}
