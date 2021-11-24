package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4378fh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.ff */
final class C4376ff<FieldDescriptorType extends C4378fh<FieldDescriptorType>> {

    /* renamed from: d */
    private static final C4376ff f16101d = new C4376ff(true);

    /* renamed from: a */
    private final C4440hk<FieldDescriptorType, Object> f16102a = C4440hk.m21899a(16);

    /* renamed from: b */
    private boolean f16103b;

    /* renamed from: c */
    private boolean f16104c = false;

    private C4376ff() {
    }

    private C4376ff(boolean z) {
        mo14468c();
    }

    /* renamed from: a */
    static int m21530a(zzxs zzxs, int i, Object obj) {
        int e = zztv.m22433e(i);
        if (zzxs == zzxs.GROUP) {
            C4390fo.m21610a((C4419gq) obj);
            e <<= 1;
        }
        return e + m21539b(zzxs, obj);
    }

    /* renamed from: a */
    public static <T extends C4378fh<T>> C4376ff<T> m21531a() {
        return f16101d;
    }

    /* renamed from: a */
    private final Object m21532a(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f16102a.get(fielddescriptortype);
        return obj instanceof C4395ft ? C4395ft.m21618a() : obj;
    }

    /* renamed from: a */
    private static Object m21533a(Object obj) {
        if (obj instanceof C4426gx) {
            return ((C4426gx) obj).mo14579a();
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
    private final void m21534a(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo14483d()) {
            m21536a(fielddescriptortype.mo14481b(), obj);
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
                m21536a(fielddescriptortype.mo14481b(), obj2);
            }
            r7 = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (r7 instanceof C4395ft) {
            this.f16104c = true;
        }
        this.f16102a.put(fielddescriptortype, r7);
    }

    /* renamed from: a */
    static void m21535a(zztv zztv, zzxs zzxs, int i, Object obj) {
        if (zzxs == zzxs.GROUP) {
            C4419gq gqVar = (C4419gq) obj;
            C4390fo.m21610a(gqVar);
            zztv.mo14903a(i, 3);
            gqVar.mo14493a(zztv);
            zztv.mo14903a(i, 4);
            return;
        }
        zztv.mo14903a(i, zzxs.zzyw());
        switch (C4377fg.f16106b[zzxs.ordinal()]) {
            case 1:
                zztv.mo14898a(((Double) obj).doubleValue());
                break;
            case 2:
                zztv.mo14899a(((Float) obj).floatValue());
                return;
            case 3:
                zztv.mo14910a(((Long) obj).longValue());
                return;
            case 4:
                zztv.mo14910a(((Long) obj).longValue());
                return;
            case 5:
                zztv.mo14900a(((Integer) obj).intValue());
                return;
            case 6:
                zztv.mo14928c(((Long) obj).longValue());
                return;
            case 7:
                zztv.mo14930d(((Integer) obj).intValue());
                return;
            case 8:
                zztv.mo14916a(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((C4419gq) obj).mo14493a(zztv);
                return;
            case 10:
                zztv.mo14911a((C4419gq) obj);
                return;
            case 11:
                if (obj instanceof zzte) {
                    zztv.mo14913a((zzte) obj);
                    return;
                } else {
                    zztv.mo14914a((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzte) {
                    zztv.mo14913a((zzte) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zztv.mo14929c(bArr, 0, bArr.length);
                return;
            case 13:
                zztv.mo14918b(((Integer) obj).intValue());
                return;
            case 14:
                zztv.mo14930d(((Integer) obj).intValue());
                return;
            case 15:
                zztv.mo14928c(((Long) obj).longValue());
                return;
            case 16:
                zztv.mo14925c(((Integer) obj).intValue());
                return;
            case 17:
                zztv.mo14923b(((Long) obj).longValue());
                return;
            case 18:
                if (!(obj instanceof C4391fp)) {
                    zztv.mo14900a(((Integer) obj).intValue());
                    break;
                } else {
                    zztv.mo14900a(((C4391fp) obj).zzc());
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
        if ((r3 instanceof com.google.android.gms.internal.measurement.C4395ft) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.C4391fp) == false) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m21536a(com.google.android.gms.internal.measurement.zzxs r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.measurement.C4390fo.m21607a(r3)
            int[] r0 = com.google.android.gms.internal.measurement.C4377fg.f16105a
            com.google.android.gms.internal.measurement.zzxx r2 = r2.zzyv()
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
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.C4419gq
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.C4395ft
            if (r2 == 0) goto L_0x0043
            goto L_0x0026
        L_0x001e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.C4391fp
            if (r2 == 0) goto L_0x0043
        L_0x0026:
            r1 = 1
            goto L_0x0043
        L_0x0028:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzte
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4376ff.m21536a(com.google.android.gms.internal.measurement.zzxs, java.lang.Object):void");
    }

    /* renamed from: a */
    private static boolean m21537a(Entry<FieldDescriptorType, Object> entry) {
        C4378fh fhVar = (C4378fh) entry.getKey();
        if (fhVar.mo14482c() == zzxx.MESSAGE) {
            if (fhVar.mo14483d()) {
                for (C4419gq f : (List) entry.getValue()) {
                    if (!f.mo14495f()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof C4419gq) {
                    if (!((C4419gq) value).mo14495f()) {
                        return false;
                    }
                } else if (value instanceof C4395ft) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    private static int m21538b(C4378fh<?> fhVar, Object obj) {
        zzxs b = fhVar.mo14481b();
        int a = fhVar.mo14478a();
        if (!fhVar.mo14483d()) {
            return m21530a(b, a, obj);
        }
        int i = 0;
        if (fhVar.mo14484e()) {
            for (Object b2 : (List) obj) {
                i += m21539b(b, b2);
            }
            return zztv.m22433e(a) + i + zztv.m22455l(i);
        }
        for (Object a2 : (List) obj) {
            i += m21530a(b, a, a2);
        }
        return i;
    }

    /* renamed from: b */
    private static int m21539b(zzxs zzxs, Object obj) {
        switch (C4377fg.f16106b[zzxs.ordinal()]) {
            case 1:
                return zztv.m22410b(((Double) obj).doubleValue());
            case 2:
                return zztv.m22411b(((Float) obj).floatValue());
            case 3:
                return zztv.m22432d(((Long) obj).longValue());
            case 4:
                return zztv.m22435e(((Long) obj).longValue());
            case 5:
                return zztv.m22436f(((Integer) obj).intValue());
            case 6:
                return zztv.m22443g(((Long) obj).longValue());
            case 7:
                return zztv.m22448i(((Integer) obj).intValue());
            case 8:
                return zztv.m22422b(((Boolean) obj).booleanValue());
            case 9:
                return zztv.m22427c((C4419gq) obj);
            case 10:
                return obj instanceof C4395ft ? zztv.m22407a((C4400fy) (C4395ft) obj) : zztv.m22418b((C4419gq) obj);
            case 11:
                return obj instanceof zzte ? zztv.m22420b((zzte) obj) : zztv.m22421b((String) obj);
            case 12:
                return obj instanceof zzte ? zztv.m22420b((zzte) obj) : zztv.m22423b((byte[]) obj);
            case 13:
                return zztv.m22440g(((Integer) obj).intValue());
            case 14:
                return zztv.m22451j(((Integer) obj).intValue());
            case 15:
                return zztv.m22447h(((Long) obj).longValue());
            case 16:
                return zztv.m22444h(((Integer) obj).intValue());
            case 17:
                return zztv.m22439f(((Long) obj).longValue());
            case 18:
                return obj instanceof C4391fp ? zztv.m22453k(((C4391fp) obj).zzc()) : zztv.m22453k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: b */
    private final void m21540b(Entry<FieldDescriptorType, Object> entry) {
        C4378fh fhVar = (C4378fh) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C4395ft) {
            value = C4395ft.m21618a();
        }
        if (fhVar.mo14483d()) {
            Object a = m21532a((FieldDescriptorType) fhVar);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) a).add(m21533a(a2));
            }
            this.f16102a.put(fhVar, a);
        } else if (fhVar.mo14482c() == zzxx.MESSAGE) {
            Object a3 = m21532a((FieldDescriptorType) fhVar);
            if (a3 == null) {
                this.f16102a.put(fhVar, m21533a(value));
            } else {
                this.f16102a.put(fhVar, a3 instanceof C4426gx ? fhVar.mo14480a((C4426gx) a3, (C4426gx) value) : fhVar.mo14479a(((C4419gq) a3).mo14499j(), (C4419gq) value).mo14508g());
            }
        } else {
            this.f16102a.put(fhVar, m21533a(value));
        }
    }

    /* renamed from: c */
    private static int m21541c(Entry<FieldDescriptorType, Object> entry) {
        C4378fh fhVar = (C4378fh) entry.getKey();
        Object value = entry.getValue();
        return (fhVar.mo14482c() != zzxx.MESSAGE || fhVar.mo14483d() || fhVar.mo14484e()) ? m21538b(fhVar, value) : value instanceof C4395ft ? zztv.m22414b(((C4378fh) entry.getKey()).mo14478a(), (C4400fy) (C4395ft) value) : zztv.m22430d(((C4378fh) entry.getKey()).mo14478a(), (C4419gq) value);
    }

    /* renamed from: a */
    public final void mo14466a(C4376ff<FieldDescriptorType> ffVar) {
        for (int i = 0; i < ffVar.f16102a.mo14595c(); i++) {
            m21540b(ffVar.f16102a.mo14593b(i));
        }
        for (Entry b : ffVar.f16102a.mo14598d()) {
            m21540b(b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo14467b() {
        return this.f16102a.isEmpty();
    }

    /* renamed from: c */
    public final void mo14468c() {
        if (!this.f16103b) {
            this.f16102a.mo14592a();
            this.f16103b = true;
        }
    }

    public final /* synthetic */ Object clone() {
        C4376ff ffVar = new C4376ff();
        for (int i = 0; i < this.f16102a.mo14595c(); i++) {
            Entry b = this.f16102a.mo14593b(i);
            ffVar.m21534a((FieldDescriptorType) (C4378fh) b.getKey(), b.getValue());
        }
        for (Entry entry : this.f16102a.mo14598d()) {
            ffVar.m21534a((FieldDescriptorType) (C4378fh) entry.getKey(), entry.getValue());
        }
        ffVar.f16104c = this.f16104c;
        return ffVar;
    }

    /* renamed from: d */
    public final boolean mo14470d() {
        return this.f16103b;
    }

    /* renamed from: e */
    public final Iterator<Entry<FieldDescriptorType, Object>> mo14471e() {
        return this.f16104c ? new C4399fx(this.f16102a.entrySet().iterator()) : this.f16102a.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4376ff)) {
            return false;
        }
        return this.f16102a.equals(((C4376ff) obj).f16102a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final Iterator<Entry<FieldDescriptorType, Object>> mo14473f() {
        return this.f16104c ? new C4399fx(this.f16102a.mo14599e().iterator()) : this.f16102a.mo14599e().iterator();
    }

    /* renamed from: g */
    public final boolean mo14474g() {
        for (int i = 0; i < this.f16102a.mo14595c(); i++) {
            if (!m21537a(this.f16102a.mo14593b(i))) {
                return false;
            }
        }
        for (Entry a : this.f16102a.mo14598d()) {
            if (!m21537a(a)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public final int mo14475h() {
        int i = 0;
        for (int i2 = 0; i2 < this.f16102a.mo14595c(); i2++) {
            Entry b = this.f16102a.mo14593b(i2);
            i += m21538b((C4378fh) b.getKey(), b.getValue());
        }
        for (Entry entry : this.f16102a.mo14598d()) {
            i += m21538b((C4378fh) entry.getKey(), entry.getValue());
        }
        return i;
    }

    public final int hashCode() {
        return this.f16102a.hashCode();
    }

    /* renamed from: i */
    public final int mo14477i() {
        int i = 0;
        for (int i2 = 0; i2 < this.f16102a.mo14595c(); i2++) {
            i += m21541c(this.f16102a.mo14593b(i2));
        }
        for (Entry c : this.f16102a.mo14598d()) {
            i += m21541c(c);
        }
        return i;
    }
}
