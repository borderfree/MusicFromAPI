package com.bumptech.glide;

import android.content.Context;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bumptech.glide.load.engine.C1456h;
import com.bumptech.glide.p040g.C1257i;
import com.bumptech.glide.p040g.C1258j;
import com.bumptech.glide.request.C1583b;
import com.bumptech.glide.request.C1589c;
import com.bumptech.glide.request.C1590d;
import com.bumptech.glide.request.C1591e;
import com.bumptech.glide.request.C1593f;
import com.bumptech.glide.request.C1594g;
import com.bumptech.glide.request.C1596i;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.request.p055a.C1579h;
import com.bumptech.glide.request.p055a.C1580i;

/* renamed from: com.bumptech.glide.f */
public class C1226f<TranscodeType> implements Cloneable {

    /* renamed from: a */
    protected static final C1594g f4410a = new C1594g().mo6485b(C1456h.f4829c).mo6476a(Priority.LOW).mo6488b(true);

    /* renamed from: b */
    protected C1594g f4411b;

    /* renamed from: c */
    private final Context f4412c;

    /* renamed from: d */
    private final C1231g f4413d;

    /* renamed from: e */
    private final Class<TranscodeType> f4414e;

    /* renamed from: f */
    private final C1594g f4415f;

    /* renamed from: g */
    private final C1186c f4416g;

    /* renamed from: h */
    private final C1216e f4417h;

    /* renamed from: i */
    private C1260h<?, ? super TranscodeType> f4418i;

    /* renamed from: j */
    private Object f4419j;

    /* renamed from: k */
    private C1593f<TranscodeType> f4420k;

    /* renamed from: l */
    private C1226f<TranscodeType> f4421l;

    /* renamed from: m */
    private C1226f<TranscodeType> f4422m;

    /* renamed from: n */
    private Float f4423n;

    /* renamed from: o */
    private boolean f4424o = true;

    /* renamed from: p */
    private boolean f4425p;

    /* renamed from: q */
    private boolean f4426q;

    /* renamed from: com.bumptech.glide.f$2 */
    static /* synthetic */ class C12282 {

        /* renamed from: a */
        static final /* synthetic */ int[] f4429a = new int[ScaleType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0048 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0052 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0087 */
        static {
            /*
                com.bumptech.glide.Priority[] r0 = com.bumptech.glide.Priority.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4430b = r0
                r0 = 1
                int[] r1 = f4430b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bumptech.glide.Priority r2 = com.bumptech.glide.Priority.LOW     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f4430b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bumptech.glide.Priority r3 = com.bumptech.glide.Priority.NORMAL     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = f4430b     // Catch:{ NoSuchFieldError -> 0x002a }
                com.bumptech.glide.Priority r4 = com.bumptech.glide.Priority.HIGH     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = f4430b     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.bumptech.glide.Priority r5 = com.bumptech.glide.Priority.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f4429a = r4
                int[] r4 = f4429a     // Catch:{ NoSuchFieldError -> 0x0048 }
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0048 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0048 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0048 }
            L_0x0048:
                int[] r0 = f4429a     // Catch:{ NoSuchFieldError -> 0x0052 }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x0052 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0052 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0052 }
            L_0x0052:
                int[] r0 = f4429a     // Catch:{ NoSuchFieldError -> 0x005c }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x005c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005c }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005c }
            L_0x005c:
                int[] r0 = f4429a     // Catch:{ NoSuchFieldError -> 0x0066 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0066 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0066 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0066 }
            L_0x0066:
                int[] r0 = f4429a     // Catch:{ NoSuchFieldError -> 0x0071 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r0 = f4429a     // Catch:{ NoSuchFieldError -> 0x007c }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x007c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007c }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007c }
            L_0x007c:
                int[] r0 = f4429a     // Catch:{ NoSuchFieldError -> 0x0087 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                int[] r0 = f4429a     // Catch:{ NoSuchFieldError -> 0x0093 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x0093 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0093 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0093 }
            L_0x0093:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C1226f.C12282.<clinit>():void");
        }
    }

    protected C1226f(C1186c cVar, C1231g gVar, Class<TranscodeType> cls, Context context) {
        this.f4416g = cVar;
        this.f4413d = gVar;
        this.f4414e = cls;
        this.f4415f = gVar.mo5861h();
        this.f4412c = context;
        this.f4418i = gVar.mo5856b(cls);
        this.f4411b = this.f4415f;
        this.f4417h = cVar.mo5743e();
    }

    /* renamed from: a */
    private Priority m6596a(Priority priority) {
        switch (priority) {
            case LOW:
                return Priority.NORMAL;
            case NORMAL:
                return Priority.HIGH;
            case HIGH:
            case IMMEDIATE:
                return Priority.IMMEDIATE;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("unknown priority: ");
                sb.append(this.f4411b.mo6514x());
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private <Y extends C1579h<TranscodeType>> Y m6597a(Y y, C1593f<TranscodeType> fVar, C1594g gVar) {
        C1258j.m6707a();
        C1257i.m6691a(y);
        if (this.f4425p) {
            C1594g h = gVar.mo6497h();
            C1589c b = m6603b(y, fVar, h);
            C1589c a = y.mo6436a();
            if (!b.mo6418a(a) || m6600a(h, a)) {
                this.f4413d.mo5852a((C1579h<?>) y);
                y.mo6438a(b);
                this.f4413d.mo5853a(y, b);
                return y;
            }
            b.mo6426i();
            if (!((C1589c) C1257i.m6691a(a)).mo6421d()) {
                a.mo6414a();
            }
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* JADX WARNING: type inference failed for: r15v0 */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.bumptech.glide.request.d] */
    /* JADX WARNING: type inference failed for: r13v0, types: [com.bumptech.glide.request.d] */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r15v2 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r0v4, types: [com.bumptech.glide.request.a] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r15v3 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bumptech.glide.request.C1589c m6598a(com.bumptech.glide.request.p055a.C1579h<TranscodeType> r20, com.bumptech.glide.request.C1593f<TranscodeType> r21, com.bumptech.glide.request.C1590d r22, com.bumptech.glide.C1260h<?, ? super TranscodeType> r23, com.bumptech.glide.Priority r24, int r25, int r26, com.bumptech.glide.request.C1594g r27) {
        /*
            r19 = this;
            r9 = r19
            com.bumptech.glide.f<TranscodeType> r0 = r9.f4422m
            if (r0 == 0) goto L_0x0010
            com.bumptech.glide.request.a r0 = new com.bumptech.glide.request.a
            r1 = r22
            r0.<init>(r1)
            r3 = r0
            r15 = r3
            goto L_0x0015
        L_0x0010:
            r1 = r22
            r0 = 0
            r15 = r0
            r3 = r1
        L_0x0015:
            r0 = r19
            r1 = r20
            r2 = r21
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            com.bumptech.glide.request.c r0 = r0.m6602b(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r15 != 0) goto L_0x002c
            return r0
        L_0x002c:
            com.bumptech.glide.f<TranscodeType> r1 = r9.f4422m
            com.bumptech.glide.request.g r1 = r1.f4411b
            int r1 = r1.mo6515y()
            com.bumptech.glide.f<TranscodeType> r2 = r9.f4422m
            com.bumptech.glide.request.g r2 = r2.f4411b
            int r2 = r2.mo6466A()
            boolean r3 = com.bumptech.glide.p040g.C1258j.m6708a(r25, r26)
            if (r3 == 0) goto L_0x0054
            com.bumptech.glide.f<TranscodeType> r3 = r9.f4422m
            com.bumptech.glide.request.g r3 = r3.f4411b
            boolean r3 = r3.mo6516z()
            if (r3 != 0) goto L_0x0054
            int r1 = r27.mo6515y()
            int r2 = r27.mo6466A()
        L_0x0054:
            r16 = r1
            r17 = r2
            com.bumptech.glide.f<TranscodeType> r10 = r9.f4422m
            com.bumptech.glide.f<TranscodeType> r1 = r9.f4422m
            com.bumptech.glide.h<?, ? super TranscodeType> r14 = r1.f4418i
            com.bumptech.glide.f<TranscodeType> r1 = r9.f4422m
            com.bumptech.glide.request.g r1 = r1.f4411b
            com.bumptech.glide.Priority r1 = r1.mo6514x()
            com.bumptech.glide.f<TranscodeType> r2 = r9.f4422m
            com.bumptech.glide.request.g r2 = r2.f4411b
            r11 = r20
            r12 = r21
            r13 = r15
            r3 = r15
            r15 = r1
            r18 = r2
            com.bumptech.glide.request.c r1 = r10.m6598a(r11, r12, r13, r14, r15, r16, r17, r18)
            r3.mo6429a(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C1226f.m6598a(com.bumptech.glide.request.a.h, com.bumptech.glide.request.f, com.bumptech.glide.request.d, com.bumptech.glide.h, com.bumptech.glide.Priority, int, int, com.bumptech.glide.request.g):com.bumptech.glide.request.c");
    }

    /* renamed from: a */
    private C1589c m6599a(C1579h<TranscodeType> hVar, C1593f<TranscodeType> fVar, C1594g gVar, C1590d dVar, C1260h<?, ? super TranscodeType> hVar2, Priority priority, int i, int i2) {
        return SingleRequest.m7753a(this.f4412c, this.f4417h, this.f4419j, this.f4414e, gVar, i, i2, priority, hVar, fVar, this.f4420k, dVar, this.f4417h.mo5809c(), hVar2.mo5915b());
    }

    /* renamed from: a */
    private boolean m6600a(C1594g gVar, C1589c cVar) {
        return !gVar.mo6511u() && cVar.mo6422e();
    }

    /* renamed from: b */
    private C1226f<TranscodeType> m6601b(Object obj) {
        this.f4419j = obj;
        this.f4425p = true;
        return this;
    }

    /* renamed from: b */
    private C1589c m6602b(C1579h<TranscodeType> hVar, C1593f<TranscodeType> fVar, C1590d dVar, C1260h<?, ? super TranscodeType> hVar2, Priority priority, int i, int i2, C1594g gVar) {
        C1590d dVar2 = dVar;
        Priority priority2 = priority;
        if (this.f4421l != null) {
            if (!this.f4426q) {
                C1260h<?, ? super TranscodeType> hVar3 = this.f4421l.f4424o ? hVar2 : this.f4421l.f4418i;
                Priority x = this.f4421l.f4411b.mo6513w() ? this.f4421l.f4411b.mo6514x() : m6596a(priority2);
                int y = this.f4421l.f4411b.mo6515y();
                int A = this.f4421l.f4411b.mo6466A();
                if (C1258j.m6708a(i, i2) && !this.f4421l.f4411b.mo6516z()) {
                    y = gVar.mo6515y();
                    A = gVar.mo6466A();
                }
                int i3 = y;
                int i4 = A;
                C1596i iVar = new C1596i(dVar2);
                C1589c a = m6599a(hVar, fVar, gVar, (C1590d) iVar, hVar2, priority, i, i2);
                this.f4426q = true;
                C1596i iVar2 = iVar;
                C1589c a2 = this.f4421l.m6598a(hVar, fVar, (C1590d) iVar, hVar3, x, i3, i4, this.f4421l.f4411b);
                this.f4426q = false;
                iVar2.mo6517a(a, a2);
                return iVar2;
            }
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        } else if (this.f4423n == null) {
            return m6599a(hVar, fVar, gVar, dVar, hVar2, priority, i, i2);
        } else {
            C1596i iVar3 = new C1596i(dVar2);
            C1593f<TranscodeType> fVar2 = fVar;
            C1596i iVar4 = iVar3;
            C1260h<?, ? super TranscodeType> hVar4 = hVar2;
            int i5 = i;
            int i6 = i2;
            iVar3.mo6517a(m6599a(hVar, fVar2, gVar, (C1590d) iVar4, hVar4, priority, i5, i6), m6599a(hVar, fVar2, gVar.clone().mo6473a(this.f4423n.floatValue()), (C1590d) iVar4, hVar4, m6596a(priority2), i5, i6));
            return iVar3;
        }
    }

    /* renamed from: b */
    private C1589c m6603b(C1579h<TranscodeType> hVar, C1593f<TranscodeType> fVar, C1594g gVar) {
        return m6598a(hVar, fVar, (C1590d) null, this.f4418i, gVar.mo6514x(), gVar.mo6515y(), gVar.mo6466A(), gVar);
    }

    /* renamed from: a */
    public C1226f<TranscodeType> mo5831a(C1593f<TranscodeType> fVar) {
        this.f4420k = fVar;
        return this;
    }

    /* renamed from: a */
    public C1226f<TranscodeType> mo5832a(C1594g gVar) {
        C1257i.m6691a(gVar);
        this.f4411b = mo5839a().mo6481a(gVar);
        return this;
    }

    /* renamed from: a */
    public C1226f<TranscodeType> mo5833a(Object obj) {
        return m6601b(obj);
    }

    /* renamed from: a */
    public C1226f<TranscodeType> mo5834a(String str) {
        return m6601b(str);
    }

    /* renamed from: a */
    public <Y extends C1579h<TranscodeType>> Y mo5835a(Y y) {
        return mo5836a(y, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <Y extends C1579h<TranscodeType>> Y mo5836a(Y y, C1593f<TranscodeType> fVar) {
        return m6597a(y, fVar, mo5839a());
    }

    /* renamed from: a */
    public C1580i<ImageView, TranscodeType> mo5837a(ImageView imageView) {
        C1258j.m6707a();
        C1257i.m6691a(imageView);
        C1594g gVar = this.f4411b;
        if (!gVar.mo6490c() && gVar.mo6489b() && imageView.getScaleType() != null) {
            switch (C12282.f4429a[imageView.getScaleType().ordinal()]) {
                case 1:
                    gVar = gVar.clone().mo6492d();
                    break;
                case 2:
                case 6:
                    gVar = gVar.clone().mo6495f();
                    break;
                case 3:
                case 4:
                case 5:
                    gVar = gVar.clone().mo6493e();
                    break;
            }
        }
        return (C1580i) m6597a(this.f4417h.mo5806a(imageView, this.f4414e), null, gVar);
    }

    /* renamed from: a */
    public C1583b<TranscodeType> mo5838a(int i, int i2) {
        final C1591e eVar = new C1591e(this.f4417h.mo5808b(), i, i2);
        if (C1258j.m6715d()) {
            this.f4417h.mo5808b().post(new Runnable() {
                public void run() {
                    if (!eVar.isCancelled()) {
                        C1226f.this.mo5836a(eVar, (C1593f<TranscodeType>) eVar);
                    }
                }
            });
        } else {
            mo5836a((Y) eVar, (C1593f<TranscodeType>) eVar);
        }
        return eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1594g mo5839a() {
        return this.f4415f == this.f4411b ? this.f4411b.clone() : this.f4411b;
    }

    /* renamed from: b */
    public C1226f<TranscodeType> clone() {
        try {
            C1226f<TranscodeType> fVar = (C1226f) super.clone();
            fVar.f4411b = fVar.f4411b.clone();
            fVar.f4418i = fVar.f4418i.clone();
            return fVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public C1583b<TranscodeType> mo5841c() {
        return mo5838a(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
