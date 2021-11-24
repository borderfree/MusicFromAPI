package com.bumptech.glide.load.engine;

import android.os.Build.VERSION;
import android.support.p009v4.p019g.C0505k.C0506a;
import android.util.Log;
import com.bumptech.glide.C1216e;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C1375c;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.C1489g;
import com.bumptech.glide.load.C1490h;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C1451e.C1452a;
import com.bumptech.glide.load.engine.p047b.C1417a;
import com.bumptech.glide.load.p042a.C1272d;
import com.bumptech.glide.load.p042a.C1274e;
import com.bumptech.glide.load.resource.bitmap.C1520j;
import com.bumptech.glide.p040g.C1253e;
import com.bumptech.glide.p040g.p041a.C1238a.C1244c;
import com.bumptech.glide.p040g.p041a.C1246b;
import com.bumptech.glide.p040g.p041a.C1247c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class DecodeJob<R> implements C1244c, C1452a, Comparable<DecodeJob<?>>, Runnable {

    /* renamed from: A */
    private DataSource f4634A;

    /* renamed from: B */
    private C1272d<?> f4635B;

    /* renamed from: C */
    private volatile C1451e f4636C;

    /* renamed from: D */
    private volatile boolean f4637D;

    /* renamed from: E */
    private volatile boolean f4638E;

    /* renamed from: a */
    private final C1453f<R> f4639a = new C1453f<>();

    /* renamed from: b */
    private final List<Throwable> f4640b = new ArrayList();

    /* renamed from: c */
    private final C1247c f4641c = C1247c.m6662a();

    /* renamed from: d */
    private final C1384d f4642d;

    /* renamed from: e */
    private final C0506a<DecodeJob<?>> f4643e;

    /* renamed from: f */
    private final C1383c<?> f4644f = new C1383c<>();

    /* renamed from: g */
    private final C1385e f4645g = new C1385e();

    /* renamed from: h */
    private C1216e f4646h;

    /* renamed from: i */
    private C1375c f4647i;

    /* renamed from: j */
    private Priority f4648j;

    /* renamed from: k */
    private C1473l f4649k;

    /* renamed from: l */
    private int f4650l;

    /* renamed from: m */
    private int f4651m;

    /* renamed from: n */
    private C1456h f4652n;

    /* renamed from: o */
    private C1379e f4653o;

    /* renamed from: p */
    private C1381a<R> f4654p;

    /* renamed from: q */
    private int f4655q;

    /* renamed from: r */
    private Stage f4656r;

    /* renamed from: s */
    private RunReason f4657s;

    /* renamed from: t */
    private long f4658t;

    /* renamed from: u */
    private boolean f4659u;

    /* renamed from: v */
    private Object f4660v;

    /* renamed from: w */
    private Thread f4661w;

    /* renamed from: x */
    private C1375c f4662x;

    /* renamed from: y */
    private C1375c f4663y;

    /* renamed from: z */
    private Object f4664z;

    private enum RunReason {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    private enum Stage {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$a */
    interface C1381a<R> {
        /* renamed from: a */
        void mo6076a(DecodeJob<?> decodeJob);

        /* renamed from: a */
        void mo6077a(GlideException glideException);

        /* renamed from: a */
        void mo6078a(C1482s<R> sVar, DataSource dataSource);
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$b */
    private final class C1382b<Z> implements C1455a<Z> {

        /* renamed from: b */
        private final DataSource f4671b;

        C1382b(DataSource dataSource) {
            this.f4671b = dataSource;
        }

        /* renamed from: a */
        public C1482s<Z> mo6079a(C1482s<Z> sVar) {
            return DecodeJob.this.mo6067a(this.f4671b, sVar);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$c */
    private static class C1383c<Z> {

        /* renamed from: a */
        private C1375c f4672a;

        /* renamed from: b */
        private C1489g<Z> f4673b;

        /* renamed from: c */
        private C1480r<Z> f4674c;

        C1383c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <X> void mo6080a(C1375c cVar, C1489g<X> gVar, C1480r<X> rVar) {
            this.f4672a = cVar;
            this.f4673b = gVar;
            this.f4674c = rVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6081a(C1384d dVar, C1379e eVar) {
            C1246b.m6659a("DecodeJob.encode");
            try {
                dVar.mo6084a().mo6173a(this.f4672a, new C1449d(this.f4673b, this.f4674c, eVar));
            } finally {
                this.f4674c.mo6284a();
                C1246b.m6658a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo6082a() {
            return this.f4674c != null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo6083b() {
            this.f4672a = null;
            this.f4673b = null;
            this.f4674c = null;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$d */
    interface C1384d {
        /* renamed from: a */
        C1417a mo6084a();
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$e */
    private static class C1385e {

        /* renamed from: a */
        private boolean f4675a;

        /* renamed from: b */
        private boolean f4676b;

        /* renamed from: c */
        private boolean f4677c;

        C1385e() {
        }

        /* renamed from: b */
        private boolean m7096b(boolean z) {
            return (this.f4677c || z || this.f4676b) && this.f4675a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public synchronized boolean mo6085a() {
            this.f4676b = true;
            return m7096b(false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public synchronized boolean mo6086a(boolean z) {
            this.f4675a = true;
            return m7096b(z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public synchronized boolean mo6087b() {
            this.f4677c = true;
            return m7096b(false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public synchronized void mo6088c() {
            this.f4676b = false;
            this.f4675a = false;
            this.f4677c = false;
        }
    }

    DecodeJob(C1384d dVar, C0506a<DecodeJob<?>> aVar) {
        this.f4642d = dVar;
        this.f4643e = aVar;
    }

    /* renamed from: a */
    private C1379e m7058a(DataSource dataSource) {
        C1379e eVar = this.f4653o;
        if (VERSION.SDK_INT < 26 || eVar.mo6062a(C1520j.f4978d) != null) {
            return eVar;
        }
        if (dataSource == DataSource.RESOURCE_DISK_CACHE || this.f4639a.mo6236l()) {
            eVar = new C1379e();
            eVar.mo6063a(this.f4653o);
            eVar.mo6061a(C1520j.f4978d, Boolean.valueOf(true));
        }
        return eVar;
    }

    /* renamed from: a */
    private Stage m7059a(Stage stage) {
        switch (stage) {
            case RESOURCE_CACHE:
                return this.f4652n.mo6244b() ? Stage.DATA_CACHE : m7059a(Stage.DATA_CACHE);
            case DATA_CACHE:
                return this.f4659u ? Stage.FINISHED : Stage.SOURCE;
            case SOURCE:
            case FINISHED:
                return Stage.FINISHED;
            case INITIALIZE:
                return this.f4652n.mo6241a() ? Stage.RESOURCE_CACHE : m7059a(Stage.RESOURCE_CACHE);
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unrecognized stage: ");
                sb.append(stage);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private <Data> C1482s<R> m7060a(C1272d<?> dVar, Data data, DataSource dataSource) {
        if (data == null) {
            dVar.mo5932b();
            return null;
        }
        try {
            long a = C1253e.m6677a();
            C1482s<R> a2 = m7061a(data, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Decoded result ");
                sb.append(a2);
                m7064a(sb.toString(), a);
            }
            return a2;
        } finally {
            dVar.mo5932b();
        }
    }

    /* renamed from: a */
    private <Data> C1482s<R> m7061a(Data data, DataSource dataSource) {
        return m7062a(data, dataSource, this.f4639a.mo6224b(data.getClass()));
    }

    /* renamed from: a */
    private <Data, ResourceType> C1482s<R> m7062a(Data data, DataSource dataSource, C1479q<Data, ResourceType, R> qVar) {
        C1379e a = m7058a(dataSource);
        C1274e b = this.f4646h.mo5810d().mo5684b(data);
        try {
            return qVar.mo6282a(b, a, this.f4650l, this.f4651m, new C1382b(dataSource));
        } finally {
            b.mo5948b();
        }
    }

    /* renamed from: a */
    private void m7063a(C1482s<R> sVar, DataSource dataSource) {
        m7075m();
        this.f4654p.mo6078a(sVar, dataSource);
    }

    /* renamed from: a */
    private void m7064a(String str, long j) {
        m7065a(str, j, (String) null);
    }

    /* renamed from: a */
    private void m7065a(String str, long j, String str2) {
        String str3;
        String str4 = "DecodeJob";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C1253e.m6676a(j));
        sb.append(", load key: ");
        sb.append(this.f4649k);
        if (str2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(", ");
            sb2.append(str2);
            str3 = sb2.toString();
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v(str4, sb.toString());
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r3v1, types: [com.bumptech.glide.load.engine.s] */
    /* JADX WARNING: type inference failed for: r3v7, types: [com.bumptech.glide.load.engine.r] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7066b(com.bumptech.glide.load.engine.C1482s<R> r3, com.bumptech.glide.load.DataSource r4) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.bumptech.glide.load.engine.C1477o
            if (r0 == 0) goto L_0x000a
            r0 = r3
            com.bumptech.glide.load.engine.o r0 = (com.bumptech.glide.load.engine.C1477o) r0
            r0.mo6278a()
        L_0x000a:
            r0 = 0
            com.bumptech.glide.load.engine.DecodeJob$c<?> r1 = r2.f4644f
            boolean r1 = r1.mo6082a()
            if (r1 == 0) goto L_0x0018
            com.bumptech.glide.load.engine.r r3 = com.bumptech.glide.load.engine.C1480r.m7419a(r3)
            r0 = r3
        L_0x0018:
            r2.m7063a(r3, r4)
            com.bumptech.glide.load.engine.DecodeJob$Stage r3 = com.bumptech.glide.load.engine.DecodeJob.Stage.ENCODE
            r2.f4656r = r3
            com.bumptech.glide.load.engine.DecodeJob$c<?> r3 = r2.f4644f     // Catch:{ all -> 0x0039 }
            boolean r3 = r3.mo6082a()     // Catch:{ all -> 0x0039 }
            if (r3 == 0) goto L_0x0030
            com.bumptech.glide.load.engine.DecodeJob$c<?> r3 = r2.f4644f     // Catch:{ all -> 0x0039 }
            com.bumptech.glide.load.engine.DecodeJob$d r4 = r2.f4642d     // Catch:{ all -> 0x0039 }
            com.bumptech.glide.load.e r1 = r2.f4653o     // Catch:{ all -> 0x0039 }
            r3.mo6081a(r4, r1)     // Catch:{ all -> 0x0039 }
        L_0x0030:
            if (r0 == 0) goto L_0x0035
            r0.mo6284a()
        L_0x0035:
            r2.m7067e()
            return
        L_0x0039:
            r3 = move-exception
            if (r0 == 0) goto L_0x003f
            r0.mo6284a()
        L_0x003f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.DecodeJob.m7066b(com.bumptech.glide.load.engine.s, com.bumptech.glide.load.DataSource):void");
    }

    /* renamed from: e */
    private void m7067e() {
        if (this.f4645g.mo6085a()) {
            m7069g();
        }
    }

    /* renamed from: f */
    private void m7068f() {
        if (this.f4645g.mo6087b()) {
            m7069g();
        }
    }

    /* renamed from: g */
    private void m7069g() {
        this.f4645g.mo6088c();
        this.f4644f.mo6083b();
        this.f4639a.mo6218a();
        this.f4637D = false;
        this.f4646h = null;
        this.f4647i = null;
        this.f4653o = null;
        this.f4648j = null;
        this.f4649k = null;
        this.f4654p = null;
        this.f4656r = null;
        this.f4636C = null;
        this.f4661w = null;
        this.f4662x = null;
        this.f4664z = null;
        this.f4634A = null;
        this.f4635B = null;
        this.f4658t = 0;
        this.f4638E = false;
        this.f4660v = null;
        this.f4640b.clear();
        this.f4643e.mo2002a(this);
    }

    /* renamed from: h */
    private int m7070h() {
        return this.f4648j.ordinal();
    }

    /* renamed from: i */
    private void m7071i() {
        switch (this.f4657s) {
            case INITIALIZE:
                this.f4656r = m7059a(Stage.INITIALIZE);
                this.f4636C = m7072j();
                break;
            case SWITCH_TO_SOURCE_SERVICE:
                break;
            case DECODE_DATA:
                m7076n();
                return;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unrecognized run reason: ");
                sb.append(this.f4657s);
                throw new IllegalStateException(sb.toString());
        }
        m7073k();
    }

    /* renamed from: j */
    private C1451e m7072j() {
        switch (this.f4656r) {
            case RESOURCE_CACHE:
                return new C1483t(this.f4639a, this);
            case DATA_CACHE:
                return new C1416b(this.f4639a, this);
            case SOURCE:
                return new C1487w(this.f4639a, this);
            case FINISHED:
                return null;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unrecognized stage: ");
                sb.append(this.f4656r);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: k */
    private void m7073k() {
        this.f4661w = Thread.currentThread();
        this.f4658t = C1253e.m6677a();
        boolean z = false;
        while (!this.f4638E && this.f4636C != null) {
            z = this.f4636C.mo6170a();
            if (z) {
                break;
            }
            this.f4656r = m7059a(this.f4656r);
            this.f4636C = m7072j();
            if (this.f4656r == Stage.SOURCE) {
                mo6073c();
                return;
            }
        }
        if ((this.f4656r == Stage.FINISHED || this.f4638E) && !z) {
            m7074l();
        }
    }

    /* renamed from: l */
    private void m7074l() {
        m7075m();
        this.f4654p.mo6077a(new GlideException("Failed to load resource", (List<Throwable>) new ArrayList<Throwable>(this.f4640b)));
        m7068f();
    }

    /* renamed from: m */
    private void m7075m() {
        this.f4641c.mo5878b();
        if (!this.f4637D) {
            this.f4637D = true;
            return;
        }
        throw new IllegalStateException("Already notified");
    }

    /* renamed from: n */
    private void m7076n() {
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.f4658t;
            StringBuilder sb = new StringBuilder();
            sb.append("data: ");
            sb.append(this.f4664z);
            sb.append(", cache key: ");
            sb.append(this.f4662x);
            sb.append(", fetcher: ");
            sb.append(this.f4635B);
            m7065a("Retrieved data", j, sb.toString());
        }
        C1482s sVar = null;
        try {
            sVar = m7060a(this.f4635B, (Data) this.f4664z, this.f4634A);
        } catch (GlideException e) {
            e.setLoggingDetails(this.f4663y, this.f4634A);
            this.f4640b.add(e);
        }
        if (sVar != null) {
            m7066b(sVar, this.f4634A);
        } else {
            m7073k();
        }
    }

    /* renamed from: a */
    public int compareTo(DecodeJob<?> decodeJob) {
        int h = m7070h() - decodeJob.m7070h();
        return h == 0 ? this.f4655q - decodeJob.f4655q : h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public DecodeJob<R> mo6066a(C1216e eVar, Object obj, C1473l lVar, C1375c cVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, C1456h hVar, Map<Class<?>, C1490h<?>> map, boolean z, boolean z2, boolean z3, C1379e eVar2, C1381a<R> aVar, int i3) {
        this.f4639a.mo6219a(eVar, obj, cVar, i, i2, hVar, cls, cls2, priority, eVar2, map, z, z2, this.f4642d);
        this.f4646h = eVar;
        this.f4647i = cVar;
        this.f4648j = priority;
        this.f4649k = lVar;
        this.f4650l = i;
        this.f4651m = i2;
        this.f4652n = hVar;
        this.f4659u = z3;
        this.f4653o = eVar2;
        this.f4654p = aVar;
        this.f4655q = i3;
        this.f4657s = RunReason.INITIALIZE;
        this.f4660v = obj;
        return this;
    }

    /* JADX WARNING: type inference failed for: r12v5, types: [com.bumptech.glide.load.c] */
    /* JADX WARNING: type inference failed for: r12v6, types: [com.bumptech.glide.load.engine.c] */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Z> com.bumptech.glide.load.engine.C1482s<Z> mo6067a(com.bumptech.glide.load.DataSource r12, com.bumptech.glide.load.engine.C1482s<Z> r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r13.mo6272d()
            java.lang.Class r8 = r0.getClass()
            com.bumptech.glide.load.DataSource r0 = com.bumptech.glide.load.DataSource.RESOURCE_DISK_CACHE
            r1 = 0
            if (r12 == r0) goto L_0x0020
            com.bumptech.glide.load.engine.f<R> r0 = r11.f4639a
            com.bumptech.glide.load.h r0 = r0.mo6227c(r8)
            com.bumptech.glide.e r2 = r11.f4646h
            int r3 = r11.f4650l
            int r4 = r11.f4651m
            com.bumptech.glide.load.engine.s r2 = r0.mo6292a(r2, r13, r3, r4)
            r7 = r0
            r0 = r2
            goto L_0x0022
        L_0x0020:
            r0 = r13
            r7 = r1
        L_0x0022:
            boolean r2 = r13.equals(r0)
            if (r2 != 0) goto L_0x002b
            r13.mo6274f()
        L_0x002b:
            com.bumptech.glide.load.engine.f<R> r13 = r11.f4639a
            boolean r13 = r13.mo6221a(r0)
            if (r13 == 0) goto L_0x0041
            com.bumptech.glide.load.engine.f<R> r13 = r11.f4639a
            com.bumptech.glide.load.g r1 = r13.mo6225b(r0)
            com.bumptech.glide.load.e r13 = r11.f4653o
            com.bumptech.glide.load.EncodeStrategy r13 = r1.mo6291a(r13)
        L_0x003f:
            r10 = r1
            goto L_0x0044
        L_0x0041:
            com.bumptech.glide.load.EncodeStrategy r13 = com.bumptech.glide.load.EncodeStrategy.NONE
            goto L_0x003f
        L_0x0044:
            com.bumptech.glide.load.engine.f<R> r1 = r11.f4639a
            com.bumptech.glide.load.c r2 = r11.f4662x
            boolean r1 = r1.mo6220a(r2)
            r1 = r1 ^ 1
            com.bumptech.glide.load.engine.h r2 = r11.f4652n
            boolean r12 = r2.mo6243a(r1, r12, r13)
            if (r12 == 0) goto L_0x00b2
            if (r10 == 0) goto L_0x00a4
            int[] r12 = com.bumptech.glide.load.engine.DecodeJob.C13801.f4667c
            int r1 = r13.ordinal()
            r12 = r12[r1]
            switch(r12) {
                case 1: goto L_0x0091;
                case 2: goto L_0x007a;
                default: goto L_0x0063;
            }
        L_0x0063:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown strategy: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x007a:
            com.bumptech.glide.load.engine.u r12 = new com.bumptech.glide.load.engine.u
            com.bumptech.glide.load.engine.f<R> r13 = r11.f4639a
            com.bumptech.glide.load.engine.a.b r2 = r13.mo6233i()
            com.bumptech.glide.load.c r3 = r11.f4662x
            com.bumptech.glide.load.c r4 = r11.f4647i
            int r5 = r11.f4650l
            int r6 = r11.f4651m
            com.bumptech.glide.load.e r9 = r11.f4653o
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x009a
        L_0x0091:
            com.bumptech.glide.load.engine.c r12 = new com.bumptech.glide.load.engine.c
            com.bumptech.glide.load.c r13 = r11.f4662x
            com.bumptech.glide.load.c r1 = r11.f4647i
            r12.<init>(r13, r1)
        L_0x009a:
            com.bumptech.glide.load.engine.r r0 = com.bumptech.glide.load.engine.C1480r.m7419a(r0)
            com.bumptech.glide.load.engine.DecodeJob$c<?> r13 = r11.f4644f
            r13.mo6080a(r12, r10, r0)
            goto L_0x00b2
        L_0x00a4:
            com.bumptech.glide.Registry$NoResultEncoderAvailableException r12 = new com.bumptech.glide.Registry$NoResultEncoderAvailableException
            java.lang.Object r13 = r0.mo6272d()
            java.lang.Class r13 = r13.getClass()
            r12.<init>(r13)
            throw r12
        L_0x00b2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.DecodeJob.mo6067a(com.bumptech.glide.load.DataSource, com.bumptech.glide.load.engine.s):com.bumptech.glide.load.engine.s");
    }

    /* renamed from: a */
    public void mo6068a(C1375c cVar, Exception exc, C1272d<?> dVar, DataSource dataSource) {
        dVar.mo5932b();
        GlideException glideException = new GlideException("Fetching data failed", (Throwable) exc);
        glideException.setLoggingDetails(cVar, dataSource, dVar.mo5924a());
        this.f4640b.add(glideException);
        if (Thread.currentThread() != this.f4661w) {
            this.f4657s = RunReason.SWITCH_TO_SOURCE_SERVICE;
            this.f4654p.mo6076a(this);
            return;
        }
        m7073k();
    }

    /* renamed from: a */
    public void mo6069a(C1375c cVar, Object obj, C1272d<?> dVar, DataSource dataSource, C1375c cVar2) {
        this.f4662x = cVar;
        this.f4664z = obj;
        this.f4635B = dVar;
        this.f4634A = dataSource;
        this.f4663y = cVar2;
        if (Thread.currentThread() != this.f4661w) {
            this.f4657s = RunReason.DECODE_DATA;
            this.f4654p.mo6076a(this);
            return;
        }
        C1246b.m6659a("DecodeJob.decodeFromRetrievedData");
        try {
            m7076n();
        } finally {
            C1246b.m6658a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6070a(boolean z) {
        if (this.f4645g.mo6086a(z)) {
            m7069g();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6071a() {
        Stage a = m7059a(Stage.INITIALIZE);
        return a == Stage.RESOURCE_CACHE || a == Stage.DATA_CACHE;
    }

    /* renamed from: b */
    public void mo6072b() {
        this.f4638E = true;
        C1451e eVar = this.f4636C;
        if (eVar != null) {
            eVar.mo6171b();
        }
    }

    /* renamed from: c */
    public void mo6073c() {
        this.f4657s = RunReason.SWITCH_TO_SOURCE_SERVICE;
        this.f4654p.mo6076a(this);
    }

    /* renamed from: c_ */
    public C1247c mo5876c_() {
        return this.f4641c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0 != null) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
            java.lang.String r0 = "DecodeJob#run(model=%s)"
            java.lang.Object r1 = r5.f4660v
            com.bumptech.glide.p040g.p041a.C1246b.m6660a(r0, r1)
            com.bumptech.glide.load.a.d<?> r0 = r5.f4635B
            boolean r1 = r5.f4638E     // Catch:{ Throwable -> 0x0027 }
            if (r1 == 0) goto L_0x0019
            r5.m7074l()     // Catch:{ Throwable -> 0x0027 }
            if (r0 == 0) goto L_0x0015
            r0.mo5932b()
        L_0x0015:
            com.bumptech.glide.p040g.p041a.C1246b.m6658a()
            return
        L_0x0019:
            r5.m7071i()     // Catch:{ Throwable -> 0x0027 }
            if (r0 == 0) goto L_0x0021
        L_0x001e:
            r0.mo5932b()
        L_0x0021:
            com.bumptech.glide.p040g.p041a.C1246b.m6658a()
            goto L_0x0068
        L_0x0025:
            r1 = move-exception
            goto L_0x006a
        L_0x0027:
            r1 = move-exception
            java.lang.String r2 = "DecodeJob"
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)     // Catch:{ all -> 0x0025 }
            if (r2 == 0) goto L_0x0053
            java.lang.String r2 = "DecodeJob"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0025 }
            r3.<init>()     // Catch:{ all -> 0x0025 }
            java.lang.String r4 = "DecodeJob threw unexpectedly, isCancelled: "
            r3.append(r4)     // Catch:{ all -> 0x0025 }
            boolean r4 = r5.f4638E     // Catch:{ all -> 0x0025 }
            r3.append(r4)     // Catch:{ all -> 0x0025 }
            java.lang.String r4 = ", stage: "
            r3.append(r4)     // Catch:{ all -> 0x0025 }
            com.bumptech.glide.load.engine.DecodeJob$Stage r4 = r5.f4656r     // Catch:{ all -> 0x0025 }
            r3.append(r4)     // Catch:{ all -> 0x0025 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0025 }
            android.util.Log.d(r2, r3, r1)     // Catch:{ all -> 0x0025 }
        L_0x0053:
            com.bumptech.glide.load.engine.DecodeJob$Stage r2 = r5.f4656r     // Catch:{ all -> 0x0025 }
            com.bumptech.glide.load.engine.DecodeJob$Stage r3 = com.bumptech.glide.load.engine.DecodeJob.Stage.ENCODE     // Catch:{ all -> 0x0025 }
            if (r2 == r3) goto L_0x0061
            java.util.List<java.lang.Throwable> r2 = r5.f4640b     // Catch:{ all -> 0x0025 }
            r2.add(r1)     // Catch:{ all -> 0x0025 }
            r5.m7074l()     // Catch:{ all -> 0x0025 }
        L_0x0061:
            boolean r2 = r5.f4638E     // Catch:{ all -> 0x0025 }
            if (r2 == 0) goto L_0x0069
            if (r0 == 0) goto L_0x0021
            goto L_0x001e
        L_0x0068:
            return
        L_0x0069:
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x006a:
            if (r0 == 0) goto L_0x006f
            r0.mo5932b()
        L_0x006f:
            com.bumptech.glide.p040g.p041a.C1246b.m6658a()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.DecodeJob.run():void");
    }
}
