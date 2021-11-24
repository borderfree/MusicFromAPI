package com.bumptech.glide.load.engine;

import android.support.p009v4.p019g.C0505k.C0506a;
import android.util.Log;
import com.bumptech.glide.C1216e;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C1375c;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.C1490h;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.p047b.C1417a;
import com.bumptech.glide.load.engine.p047b.C1417a.C1418a;
import com.bumptech.glide.load.engine.p047b.C1420b;
import com.bumptech.glide.load.engine.p047b.C1430h;
import com.bumptech.glide.load.engine.p047b.C1430h.C1431a;
import com.bumptech.glide.load.engine.p048c.C1440a;
import com.bumptech.glide.p040g.C1253e;
import com.bumptech.glide.p040g.C1257i;
import com.bumptech.glide.p040g.C1258j;
import com.bumptech.glide.p040g.p041a.C1238a;
import com.bumptech.glide.p040g.p041a.C1238a.C1242a;
import com.bumptech.glide.request.C1595h;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.engine.i */
public class C1462i implements C1431a, C1472k, C1476a {

    /* renamed from: a */
    private static final boolean f4832a = Log.isLoggable("Engine", 2);

    /* renamed from: b */
    private final C1478p f4833b;

    /* renamed from: c */
    private final C1474m f4834c;

    /* renamed from: d */
    private final C1430h f4835d;

    /* renamed from: e */
    private final C1465b f4836e;

    /* renamed from: f */
    private final C1485v f4837f;

    /* renamed from: g */
    private final C1467c f4838g;

    /* renamed from: h */
    private final C1463a f4839h;

    /* renamed from: i */
    private final C1387a f4840i;

    /* renamed from: com.bumptech.glide.load.engine.i$a */
    static class C1463a {

        /* renamed from: a */
        final C1384d f4841a;

        /* renamed from: b */
        final C0506a<DecodeJob<?>> f4842b = C1238a.m6643a(150, (C1242a<T>) new C1242a<DecodeJob<?>>() {
            /* renamed from: a */
            public DecodeJob<?> mo5874b() {
                return new DecodeJob<>(C1463a.this.f4841a, C1463a.this.f4842b);
            }
        });

        /* renamed from: c */
        private int f4843c;

        C1463a(C1384d dVar) {
            this.f4841a = dVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <R> DecodeJob<R> mo6250a(C1216e eVar, Object obj, C1473l lVar, C1375c cVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, C1456h hVar, Map<Class<?>, C1490h<?>> map, boolean z, boolean z2, boolean z3, C1379e eVar2, C1381a<R> aVar) {
            C1216e eVar3 = eVar;
            Object obj2 = obj;
            C1473l lVar2 = lVar;
            C1375c cVar2 = cVar;
            int i3 = i;
            int i4 = i2;
            Class<?> cls3 = cls;
            Class<R> cls4 = cls2;
            Priority priority2 = priority;
            C1456h hVar2 = hVar;
            Map<Class<?>, C1490h<?>> map2 = map;
            boolean z4 = z;
            boolean z5 = z2;
            boolean z6 = z3;
            C1379e eVar4 = eVar2;
            C1381a<R> aVar2 = aVar;
            DecodeJob decodeJob = (DecodeJob) C1257i.m6691a((DecodeJob) this.f4842b.mo2001a());
            int i5 = this.f4843c;
            int i6 = i5;
            this.f4843c = i5 + 1;
            return decodeJob.mo6066a(eVar3, obj2, lVar2, cVar2, i3, i4, cls3, cls4, priority2, hVar2, map2, z4, z5, z6, eVar4, aVar2, i6);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.i$b */
    static class C1465b {

        /* renamed from: a */
        final C1440a f4845a;

        /* renamed from: b */
        final C1440a f4846b;

        /* renamed from: c */
        final C1440a f4847c;

        /* renamed from: d */
        final C1440a f4848d;

        /* renamed from: e */
        final C1472k f4849e;

        /* renamed from: f */
        final C0506a<C1469j<?>> f4850f = C1238a.m6643a(150, (C1242a<T>) new C1242a<C1469j<?>>() {
            /* renamed from: a */
            public C1469j<?> mo5874b() {
                C1469j jVar = new C1469j(C1465b.this.f4845a, C1465b.this.f4846b, C1465b.this.f4847c, C1465b.this.f4848d, C1465b.this.f4849e, C1465b.this.f4850f);
                return jVar;
            }
        });

        C1465b(C1440a aVar, C1440a aVar2, C1440a aVar3, C1440a aVar4, C1472k kVar) {
            this.f4845a = aVar;
            this.f4846b = aVar2;
            this.f4847c = aVar3;
            this.f4848d = aVar4;
            this.f4849e = kVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <R> C1469j<R> mo6252a(C1375c cVar, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((C1469j) C1257i.m6691a((C1469j) this.f4850f.mo2001a())).mo6255a(cVar, z, z2, z3, z4);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.i$c */
    private static class C1467c implements C1384d {

        /* renamed from: a */
        private final C1418a f4852a;

        /* renamed from: b */
        private volatile C1417a f4853b;

        C1467c(C1418a aVar) {
            this.f4852a = aVar;
        }

        /* renamed from: a */
        public C1417a mo6084a() {
            if (this.f4853b == null) {
                synchronized (this) {
                    if (this.f4853b == null) {
                        this.f4853b = this.f4852a.mo6174a();
                    }
                    if (this.f4853b == null) {
                        this.f4853b = new C1420b();
                    }
                }
            }
            return this.f4853b;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.i$d */
    public static class C1468d {

        /* renamed from: a */
        private final C1469j<?> f4854a;

        /* renamed from: b */
        private final C1595h f4855b;

        C1468d(C1595h hVar, C1469j<?> jVar) {
            this.f4855b = hVar;
            this.f4854a = jVar;
        }

        /* renamed from: a */
        public void mo6254a() {
            this.f4854a.mo6260b(this.f4855b);
        }
    }

    C1462i(C1430h hVar, C1418a aVar, C1440a aVar2, C1440a aVar3, C1440a aVar4, C1440a aVar5, C1478p pVar, C1474m mVar, C1387a aVar6, C1465b bVar, C1463a aVar7, C1485v vVar, boolean z) {
        this.f4835d = hVar;
        C1418a aVar8 = aVar;
        this.f4838g = new C1467c(aVar);
        C1387a aVar9 = aVar6 == null ? new C1387a(z) : aVar6;
        this.f4840i = aVar9;
        aVar9.mo6106a((C1476a) this);
        this.f4834c = mVar == null ? new C1474m() : mVar;
        this.f4833b = pVar == null ? new C1478p() : pVar;
        this.f4836e = bVar == null ? new C1465b(aVar2, aVar3, aVar4, aVar5, this) : bVar;
        this.f4839h = aVar7 == null ? new C1463a(this.f4838g) : aVar7;
        this.f4837f = vVar == null ? new C1485v() : vVar;
        hVar.mo6185a((C1431a) this);
    }

    public C1462i(C1430h hVar, C1418a aVar, C1440a aVar2, C1440a aVar3, C1440a aVar4, C1440a aVar5, boolean z) {
        this(hVar, aVar, aVar2, aVar3, aVar4, aVar5, null, null, null, null, null, null, z);
    }

    /* renamed from: a */
    private C1475n<?> m7362a(C1375c cVar) {
        C1482s a = this.f4835d.mo6182a(cVar);
        if (a == null) {
            return null;
        }
        return a instanceof C1475n ? (C1475n) a : new C1475n(a, true, true);
    }

    /* renamed from: a */
    private C1475n<?> m7363a(C1375c cVar, boolean z) {
        if (!z) {
            return null;
        }
        C1475n<?> b = this.f4840i.mo6107b(cVar);
        if (b != null) {
            b.mo6275g();
        }
        return b;
    }

    /* renamed from: a */
    private static void m7364a(String str, long j, C1375c cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C1253e.m6676a(j));
        sb.append("ms, key: ");
        sb.append(cVar);
        Log.v("Engine", sb.toString());
    }

    /* renamed from: b */
    private C1475n<?> m7365b(C1375c cVar, boolean z) {
        if (!z) {
            return null;
        }
        C1475n<?> a = m7362a(cVar);
        if (a != null) {
            a.mo6275g();
            this.f4840i.mo6104a(cVar, a);
        }
        return a;
    }

    /* renamed from: a */
    public <R> C1468d mo6245a(C1216e eVar, Object obj, C1375c cVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, C1456h hVar, Map<Class<?>, C1490h<?>> map, boolean z, boolean z2, C1379e eVar2, boolean z3, boolean z4, boolean z5, boolean z6, C1595h hVar2) {
        boolean z7 = z3;
        C1595h hVar3 = hVar2;
        C1258j.m6707a();
        long a = f4832a ? C1253e.m6677a() : 0;
        C1473l a2 = this.f4834c.mo6267a(obj, cVar, i, i2, map, cls, cls2, eVar2);
        C1475n a3 = m7363a((C1375c) a2, z7);
        if (a3 != null) {
            hVar3.mo6417a(a3, DataSource.MEMORY_CACHE);
            if (f4832a) {
                m7364a("Loaded resource from active resources", a, (C1375c) a2);
            }
            return null;
        }
        C1475n b = m7365b(a2, z7);
        if (b != null) {
            hVar3.mo6417a(b, DataSource.MEMORY_CACHE);
            if (f4832a) {
                m7364a("Loaded resource from cache", a, (C1375c) a2);
            }
            return null;
        }
        C1469j a4 = this.f4833b.mo6279a((C1375c) a2, z6);
        if (a4 != null) {
            a4.mo6256a(hVar3);
            if (f4832a) {
                m7364a("Added to existing load", a, (C1375c) a2);
            }
            return new C1468d(hVar3, a4);
        }
        C1469j a5 = this.f4836e.mo6252a(a2, z3, z4, z5, z6);
        DecodeJob a6 = this.f4839h.mo6250a(eVar, obj, a2, cVar, i, i2, cls, cls2, priority, hVar, map, z, z2, z6, eVar2, a5);
        this.f4833b.mo6280a((C1375c) a2, a5);
        a5.mo6256a(hVar3);
        a5.mo6259b(a6);
        if (f4832a) {
            m7364a("Started new load", a, (C1375c) a2);
        }
        return new C1468d(hVar3, a5);
    }

    /* renamed from: a */
    public void mo6246a(C1375c cVar, C1475n<?> nVar) {
        C1258j.m6707a();
        this.f4840i.mo6103a(cVar);
        if (nVar.mo6270b()) {
            this.f4835d.mo6186b(cVar, nVar);
        } else {
            this.f4837f.mo6287a(nVar);
        }
    }

    /* renamed from: a */
    public void mo6247a(C1469j<?> jVar, C1375c cVar) {
        C1258j.m6707a();
        this.f4833b.mo6281b(cVar, jVar);
    }

    /* renamed from: a */
    public void mo6248a(C1469j<?> jVar, C1375c cVar, C1475n<?> nVar) {
        C1258j.m6707a();
        if (nVar != null) {
            nVar.mo6269a(cVar, this);
            if (nVar.mo6270b()) {
                this.f4840i.mo6104a(cVar, nVar);
            }
        }
        this.f4833b.mo6281b(cVar, jVar);
    }

    /* renamed from: a */
    public void mo6249a(C1482s<?> sVar) {
        C1258j.m6707a();
        if (sVar instanceof C1475n) {
            ((C1475n) sVar).mo6276h();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    /* renamed from: b */
    public void mo6188b(C1482s<?> sVar) {
        C1258j.m6707a();
        this.f4837f.mo6287a(sVar);
    }
}
