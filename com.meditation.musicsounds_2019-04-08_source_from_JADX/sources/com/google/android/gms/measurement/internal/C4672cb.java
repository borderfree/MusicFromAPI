package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p009v4.p019g.C0488a;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.C3139e;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.util.C3300e;
import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.cb */
public final class C4672cb extends C4710dm {

    /* renamed from: a */
    protected C4681ck f16848a;

    /* renamed from: b */
    protected boolean f16849b = true;

    /* renamed from: c */
    private C4667bx f16850c;

    /* renamed from: d */
    private final Set<C4668by> f16851d = new CopyOnWriteArraySet();

    /* renamed from: e */
    private boolean f16852e;

    /* renamed from: f */
    private final AtomicReference<String> f16853f = new AtomicReference<>();

    protected C4672cb(C4638av avVar) {
        super(avVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final void m23148C() {
        if (!mo15255t().mo15750j(mo15242g().mo15825x()) || !this.f16825q.mo15325C() || !this.f16849b) {
            mo15253r().mo15854w().mo15858a("Updating Scion state (FE)");
            mo15243h().mo15467y();
            return;
        }
        mo15253r().mo15854w().mo15858a("Recording app launch after enabling measurement for the first time (FE)");
        mo15425y();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m23152a(java.lang.String r29, java.lang.String r30, long r31, android.os.Bundle r33, boolean r34, boolean r35, boolean r36, java.lang.String r37) {
        /*
            r28 = this;
            r1 = r28
            r8 = r29
            r6 = r30
            r5 = r33
            r7 = r37
            com.google.android.gms.common.internal.C3266s.m14915a(r29)
            com.google.android.gms.measurement.internal.es r0 = r28.mo15255t()
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.C4756h.f17159au
            boolean r0 = r0.mo15740d(r7, r4)
            if (r0 != 0) goto L_0x001c
            com.google.android.gms.common.internal.C3266s.m14915a(r30)
        L_0x001c:
            com.google.android.gms.common.internal.C3266s.m14913a(r33)
            r28.mo15239d()
            r28.mo15503E()
            com.google.android.gms.measurement.internal.av r0 = r1.f16825q
            boolean r0 = r0.mo15325C()
            if (r0 != 0) goto L_0x003b
            com.google.android.gms.measurement.internal.r r0 = r28.mo15253r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo15854w()
            java.lang.String r2 = "Event not sent since app measurement is disabled"
            r0.mo15858a(r2)
            return
        L_0x003b:
            boolean r0 = r1.f16852e
            r4 = 0
            r16 = 0
            r15 = 1
            if (r0 != 0) goto L_0x007f
            r1.f16852e = r15
            java.lang.String r0 = "com.google.android.gms.tagmanager.TagManagerService"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0072 }
            java.lang.String r9 = "initialize"
            java.lang.Class[] r10 = new java.lang.Class[r15]     // Catch:{ Exception -> 0x0063 }
            java.lang.Class<android.content.Context> r11 = android.content.Context.class
            r10[r16] = r11     // Catch:{ Exception -> 0x0063 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r9, r10)     // Catch:{ Exception -> 0x0063 }
            java.lang.Object[] r9 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0063 }
            android.content.Context r10 = r28.mo15249n()     // Catch:{ Exception -> 0x0063 }
            r9[r16] = r10     // Catch:{ Exception -> 0x0063 }
            r0.invoke(r4, r9)     // Catch:{ Exception -> 0x0063 }
            goto L_0x007f
        L_0x0063:
            r0 = move-exception
            com.google.android.gms.measurement.internal.r r9 = r28.mo15253r()     // Catch:{ ClassNotFoundException -> 0x0072 }
            com.google.android.gms.measurement.internal.t r9 = r9.mo15849i()     // Catch:{ ClassNotFoundException -> 0x0072 }
            java.lang.String r10 = "Failed to invoke Tag Manager's initialize() method"
            r9.mo15859a(r10, r0)     // Catch:{ ClassNotFoundException -> 0x0072 }
            goto L_0x007f
        L_0x0072:
            com.google.android.gms.measurement.internal.r r0 = r28.mo15253r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo15853v()
            java.lang.String r9 = "Tag Manager is not found and thus will not be used"
            r0.mo15858a(r9)
        L_0x007f:
            r0 = 40
            r9 = 2
            if (r36 == 0) goto L_0x00ec
            r28.mo15256u()
            java.lang.String r10 = "_iap"
            boolean r10 = r10.equals(r6)
            if (r10 != 0) goto L_0x00ec
            com.google.android.gms.measurement.internal.av r10 = r1.f16825q
            com.google.android.gms.measurement.internal.ek r10 = r10.mo15343j()
            java.lang.String r11 = "event"
            boolean r11 = r10.mo15589a(r11, r6)
            if (r11 != 0) goto L_0x009f
        L_0x009d:
            r10 = 2
            goto L_0x00b6
        L_0x009f:
            java.lang.String r11 = "event"
            java.lang.String[] r12 = com.google.android.gms.measurement.internal.C4664bu.f16827a
            boolean r11 = r10.mo15590a(r11, r12, r6)
            if (r11 != 0) goto L_0x00ac
            r10 = 13
            goto L_0x00b6
        L_0x00ac:
            java.lang.String r11 = "event"
            boolean r10 = r10.mo15588a(r11, r0, r6)
            if (r10 != 0) goto L_0x00b5
            goto L_0x009d
        L_0x00b5:
            r10 = 0
        L_0x00b6:
            if (r10 == 0) goto L_0x00ec
            com.google.android.gms.measurement.internal.r r2 = r28.mo15253r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo15848h()
            java.lang.String r3 = "Invalid public event name. Event will not be logged (FE)"
            com.google.android.gms.measurement.internal.p r4 = r28.mo15250o()
            java.lang.String r4 = r4.mo15841a(r6)
            r2.mo15859a(r3, r4)
            com.google.android.gms.measurement.internal.av r2 = r1.f16825q
            r2.mo15343j()
            java.lang.String r0 = com.google.android.gms.measurement.internal.C4736ek.m23527a(r6, r0, r15)
            if (r6 == 0) goto L_0x00df
            int r16 = r30.length()
            r2 = r16
            goto L_0x00e0
        L_0x00df:
            r2 = 0
        L_0x00e0:
            com.google.android.gms.measurement.internal.av r3 = r1.f16825q
            com.google.android.gms.measurement.internal.ek r3 = r3.mo15343j()
            java.lang.String r4 = "_ev"
            r3.mo15584a(r10, r4, r0, r2)
            return
        L_0x00ec:
            r28.mo15256u()
            com.google.android.gms.measurement.internal.co r10 = r28.mo15244i()
            com.google.android.gms.measurement.internal.cn r14 = r10.mo15450x()
            if (r14 == 0) goto L_0x0103
            java.lang.String r10 = "_sc"
            boolean r10 = r5.containsKey(r10)
            if (r10 != 0) goto L_0x0103
            r14.f16891d = r15
        L_0x0103:
            if (r34 == 0) goto L_0x0109
            if (r36 == 0) goto L_0x0109
            r10 = 1
            goto L_0x010a
        L_0x0109:
            r10 = 0
        L_0x010a:
            com.google.android.gms.measurement.internal.C4685co.m23213a(r14, r5, r10)
            java.lang.String r10 = "am"
            boolean r17 = r10.equals(r8)
            boolean r10 = com.google.android.gms.measurement.internal.C4736ek.m23542e(r30)
            if (r34 == 0) goto L_0x014c
            com.google.android.gms.measurement.internal.bx r2 = r1.f16850c
            if (r2 == 0) goto L_0x014c
            if (r10 != 0) goto L_0x014c
            if (r17 != 0) goto L_0x014c
            com.google.android.gms.measurement.internal.r r0 = r28.mo15253r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo15854w()
            java.lang.String r2 = "Passing event to registered event handler (FE)"
            com.google.android.gms.measurement.internal.p r3 = r28.mo15250o()
            java.lang.String r3 = r3.mo15841a(r6)
            com.google.android.gms.measurement.internal.p r4 = r28.mo15250o()
            java.lang.String r4 = r4.mo15838a(r5)
            r0.mo15860a(r2, r3, r4)
            com.google.android.gms.measurement.internal.bx r2 = r1.f16850c
            r3 = r29
            r4 = r30
            r5 = r33
            r6 = r31
            r2.mo15399a(r3, r4, r5, r6)
            return
        L_0x014c:
            com.google.android.gms.measurement.internal.av r2 = r1.f16825q
            boolean r2 = r2.mo15330H()
            if (r2 != 0) goto L_0x0155
            return
        L_0x0155:
            com.google.android.gms.measurement.internal.ek r2 = r28.mo15251p()
            int r2 = r2.mo15591b(r6)
            if (r2 == 0) goto L_0x019b
            com.google.android.gms.measurement.internal.r r3 = r28.mo15253r()
            com.google.android.gms.measurement.internal.t r3 = r3.mo15848h()
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            com.google.android.gms.measurement.internal.p r5 = r28.mo15250o()
            java.lang.String r5 = r5.mo15841a(r6)
            r3.mo15859a(r4, r5)
            r28.mo15251p()
            java.lang.String r0 = com.google.android.gms.measurement.internal.C4736ek.m23527a(r6, r0, r15)
            if (r6 == 0) goto L_0x0183
            int r3 = r30.length()
            r16 = r3
        L_0x0183:
            com.google.android.gms.measurement.internal.av r3 = r1.f16825q
            com.google.android.gms.measurement.internal.ek r3 = r3.mo15343j()
            java.lang.String r4 = "_ev"
            r29 = r3
            r30 = r37
            r31 = r2
            r32 = r4
            r33 = r0
            r34 = r16
            r29.mo15587a(r30, r31, r32, r33, r34)
            return
        L_0x019b:
            r0 = 4
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r2 = "_o"
            r0[r16] = r2
            java.lang.String r2 = "_sn"
            r0[r15] = r2
            java.lang.String r2 = "_sc"
            r0[r9] = r2
            r2 = 3
            java.lang.String r9 = "_si"
            r0[r2] = r9
            java.util.List r0 = com.google.android.gms.common.util.C3301f.m15043a((T[]) r0)
            com.google.android.gms.measurement.internal.ek r9 = r28.mo15251p()
            r2 = 1
            r10 = r37
            r11 = r30
            r12 = r33
            r13 = r0
            r18 = r14
            r14 = r36
            r5 = 1
            r15 = r2
            android.os.Bundle r2 = r9.mo15581a(r10, r11, r12, r13, r14, r15)
            if (r2 == 0) goto L_0x01fd
            java.lang.String r9 = "_sc"
            boolean r9 = r2.containsKey(r9)
            if (r9 == 0) goto L_0x01fd
            java.lang.String r9 = "_si"
            boolean r9 = r2.containsKey(r9)
            if (r9 != 0) goto L_0x01dc
            goto L_0x01fd
        L_0x01dc:
            java.lang.String r4 = "_sn"
            java.lang.String r4 = r2.getString(r4)
            java.lang.String r9 = "_sc"
            java.lang.String r9 = r2.getString(r9)
            java.lang.String r10 = "_si"
            long r10 = r2.getLong(r10)
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            com.google.android.gms.measurement.internal.cn r11 = new com.google.android.gms.measurement.internal.cn
            long r12 = r10.longValue()
            r11.<init>(r4, r9, r12)
            r14 = r11
            goto L_0x01fe
        L_0x01fd:
            r14 = r4
        L_0x01fe:
            if (r14 != 0) goto L_0x0203
            r4 = r18
            goto L_0x0204
        L_0x0203:
            r4 = r14
        L_0x0204:
            com.google.android.gms.measurement.internal.es r9 = r28.mo15255t()
            boolean r9 = r9.mo15760t(r7)
            r10 = 0
            if (r9 == 0) goto L_0x0238
            r28.mo15256u()
            com.google.android.gms.measurement.internal.co r9 = r28.mo15244i()
            com.google.android.gms.measurement.internal.cn r9 = r9.mo15450x()
            if (r9 == 0) goto L_0x0238
            java.lang.String r9 = "_ae"
            boolean r9 = r9.equals(r6)
            if (r9 == 0) goto L_0x0238
            com.google.android.gms.measurement.internal.dq r9 = r28.mo15246k()
            long r12 = r9.mo15513y()
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x0238
            com.google.android.gms.measurement.internal.ek r9 = r28.mo15251p()
            r9.mo15585a(r2, r12)
        L_0x0238:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r15.add(r2)
            com.google.android.gms.measurement.internal.ek r9 = r28.mo15251p()
            java.security.SecureRandom r9 = r9.mo15599h()
            long r13 = r9.nextLong()
            com.google.android.gms.measurement.internal.es r9 = r28.mo15255t()
            com.google.android.gms.measurement.internal.l r12 = r28.mo15242g()
            java.lang.String r12 = r12.mo15825x()
            boolean r9 = r9.mo15759s(r12)
            if (r9 == 0) goto L_0x0283
            java.lang.String r9 = "extend_session"
            long r9 = r2.getLong(r9, r10)
            r11 = 1
            int r18 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r18 != 0) goto L_0x0283
            com.google.android.gms.measurement.internal.r r9 = r28.mo15253r()
            com.google.android.gms.measurement.internal.t r9 = r9.mo15855x()
            java.lang.String r10 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r9.mo15858a(r10)
            com.google.android.gms.measurement.internal.av r9 = r1.f16825q
            com.google.android.gms.measurement.internal.dq r9 = r9.mo15338e()
            r11 = r31
            r9.mo15510a(r11, r5)
            goto L_0x0285
        L_0x0283:
            r11 = r31
        L_0x0285:
            java.util.Set r9 = r2.keySet()
            int r10 = r33.size()
            java.lang.String[] r10 = new java.lang.String[r10]
            java.lang.Object[] r9 = r9.toArray(r10)
            r10 = r9
            java.lang.String[] r10 = (java.lang.String[]) r10
            java.util.Arrays.sort(r10)
            int r9 = r10.length
            r19 = r15
            r15 = 0
            r20 = 0
        L_0x029f:
            if (r15 >= r9) goto L_0x0358
            r5 = r10[r15]
            java.lang.Object r18 = r2.get(r5)
            r28.mo15251p()
            r22 = r15
            android.os.Bundle[] r15 = com.google.android.gms.measurement.internal.C4736ek.m23536a(r18)
            if (r15 == 0) goto L_0x0331
            int r3 = r15.length
            r2.putInt(r5, r3)
            r3 = 0
        L_0x02b7:
            int r7 = r15.length
            if (r3 >= r7) goto L_0x031b
            r7 = r15[r3]
            r23 = r15
            r15 = 1
            com.google.android.gms.measurement.internal.C4685co.m23213a(r4, r7, r15)
            com.google.android.gms.measurement.internal.ek r18 = r28.mo15251p()
            java.lang.String r21 = "_ep"
            r24 = 0
            r25 = r9
            r9 = r18
            r18 = r10
            r10 = r37
            r11 = r21
            r12 = r7
            r7 = r13
            r13 = r0
            r14 = r36
            r26 = r0
            r27 = r4
            r0 = r19
            r19 = r22
            r4 = r23
            r21 = 1
            r15 = r24
            android.os.Bundle r9 = r9.mo15581a(r10, r11, r12, r13, r14, r15)
            java.lang.String r10 = "_en"
            r9.putString(r10, r6)
            java.lang.String r10 = "_eid"
            r9.putLong(r10, r7)
            java.lang.String r10 = "_gn"
            r9.putString(r10, r5)
            java.lang.String r10 = "_ll"
            int r11 = r4.length
            r9.putInt(r10, r11)
            java.lang.String r10 = "_i"
            r9.putInt(r10, r3)
            r0.add(r9)
            int r3 = r3 + 1
            r11 = r31
            r15 = r4
            r13 = r7
            r10 = r18
            r9 = r25
            r4 = r27
            r8 = r29
            r19 = r0
            r0 = r26
            goto L_0x02b7
        L_0x031b:
            r26 = r0
            r27 = r4
            r25 = r9
            r18 = r10
            r7 = r13
            r4 = r15
            r0 = r19
            r19 = r22
            r21 = 1
            int r3 = r4.length
            r4 = r20
            int r20 = r4 + r3
            goto L_0x0342
        L_0x0331:
            r26 = r0
            r27 = r4
            r25 = r9
            r18 = r10
            r7 = r13
            r0 = r19
            r4 = r20
            r19 = r22
            r21 = 1
        L_0x0342:
            int r15 = r19 + 1
            r11 = r31
            r19 = r0
            r13 = r7
            r10 = r18
            r9 = r25
            r0 = r26
            r4 = r27
            r5 = 1
            r7 = r37
            r8 = r29
            goto L_0x029f
        L_0x0358:
            r7 = r13
            r0 = r19
            r4 = r20
            r21 = 1
            if (r4 == 0) goto L_0x036b
            java.lang.String r3 = "_eid"
            r2.putLong(r3, r7)
            java.lang.String r3 = "_epc"
            r2.putInt(r3, r4)
        L_0x036b:
            r8 = 0
        L_0x036c:
            int r2 = r0.size()
            if (r8 >= r2) goto L_0x03f6
            java.lang.Object r2 = r0.get(r8)
            android.os.Bundle r2 = (android.os.Bundle) r2
            if (r8 == 0) goto L_0x037c
            r3 = 1
            goto L_0x037d
        L_0x037c:
            r3 = 0
        L_0x037d:
            if (r3 == 0) goto L_0x0382
            java.lang.String r3 = "_ep"
            goto L_0x0383
        L_0x0382:
            r3 = r6
        L_0x0383:
            java.lang.String r4 = "_o"
            r9 = r29
            r2.putString(r4, r9)
            if (r35 == 0) goto L_0x0394
            com.google.android.gms.measurement.internal.ek r4 = r28.mo15251p()
            android.os.Bundle r2 = r4.mo15580a(r2)
        L_0x0394:
            r11 = r2
            com.google.android.gms.measurement.internal.r r2 = r28.mo15253r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo15854w()
            java.lang.String r4 = "Logging event (FE)"
            com.google.android.gms.measurement.internal.p r5 = r28.mo15250o()
            java.lang.String r5 = r5.mo15841a(r6)
            com.google.android.gms.measurement.internal.p r7 = r28.mo15250o()
            java.lang.String r7 = r7.mo15838a(r11)
            r2.mo15860a(r4, r5, r7)
            com.google.android.gms.measurement.internal.zzag r12 = new com.google.android.gms.measurement.internal.zzag
            com.google.android.gms.measurement.internal.zzad r4 = new com.google.android.gms.measurement.internal.zzad
            r4.<init>(r11)
            r2 = r12
            r13 = 1
            r5 = r29
            r14 = r6
            r15 = r37
            r6 = r31
            r2.<init>(r3, r4, r5, r6)
            com.google.android.gms.measurement.internal.cs r2 = r28.mo15243h()
            r2.mo15460a(r12, r15)
            if (r17 != 0) goto L_0x03ef
            java.util.Set<com.google.android.gms.measurement.internal.by> r2 = r1.f16851d
            java.util.Iterator r12 = r2.iterator()
        L_0x03d4:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x03ef
            java.lang.Object r2 = r12.next()
            com.google.android.gms.measurement.internal.by r2 = (com.google.android.gms.measurement.internal.C4668by) r2
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>(r11)
            r3 = r29
            r4 = r30
            r6 = r31
            r2.mo15400a(r3, r4, r5, r6)
            goto L_0x03d4
        L_0x03ef:
            int r8 = r8 + 1
            r6 = r14
            r21 = 1
            goto L_0x036c
        L_0x03f6:
            r14 = r6
            r13 = 1
            r28.mo15256u()
            com.google.android.gms.measurement.internal.co r0 = r28.mo15244i()
            com.google.android.gms.measurement.internal.cn r0 = r0.mo15450x()
            if (r0 == 0) goto L_0x0414
            java.lang.String r0 = "_ae"
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x0414
            com.google.android.gms.measurement.internal.dq r0 = r28.mo15246k()
            r0.mo15511a(r13, r13)
        L_0x0414:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4672cb.m23152a(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* renamed from: a */
    private final void m23153a(String str, String str2, long j, Object obj) {
        C4634ar q = mo15252q();
        C4675ce ceVar = new C4675ce(this, str, str2, obj, j);
        q.mo15314a((Runnable) ceVar);
    }

    /* renamed from: b */
    private final List<ConditionalUserProperty> m23154b(String str, String str2, String str3) {
        C4769t u_;
        String str4;
        if (mo15252q().mo15317g()) {
            u_ = mo15253r().mo15852u_();
            str4 = "Cannot get conditional user properties from analytics worker thread";
        } else if (C4742eq.m23658a()) {
            u_ = mo15253r().mo15852u_();
            str4 = "Cannot get conditional user properties from main thread";
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                C4634ar q = this.f16825q.mo15252q();
                C4678ch chVar = new C4678ch(this, atomicReference, str, str2, str3);
                q.mo15314a((Runnable) chVar);
                try {
                    atomicReference.wait(5000);
                } catch (InterruptedException e) {
                    mo15253r().mo15849i().mo15860a("Interrupted waiting for get conditional user properties", str, e);
                }
            }
            List<zzo> list = (List) atomicReference.get();
            if (list == null) {
                mo15253r().mo15849i().mo15859a("Timed out waiting for get conditional user properties", str);
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (zzo zzo : list) {
                ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
                conditionalUserProperty.mAppId = zzo.f17282a;
                conditionalUserProperty.mOrigin = zzo.f17283b;
                conditionalUserProperty.mCreationTimestamp = zzo.f17285d;
                conditionalUserProperty.mName = zzo.f17284c.f17256a;
                conditionalUserProperty.mValue = zzo.f17284c.mo15877a();
                conditionalUserProperty.mActive = zzo.f17286e;
                conditionalUserProperty.mTriggerEventName = zzo.f17287f;
                if (zzo.f17288g != null) {
                    conditionalUserProperty.mTimedOutEventName = zzo.f17288g.f17252a;
                    if (zzo.f17288g.f17253b != null) {
                        conditionalUserProperty.mTimedOutEventParams = zzo.f17288g.f17253b.mo15868b();
                    }
                }
                conditionalUserProperty.mTriggerTimeout = zzo.f17289h;
                if (zzo.f17290i != null) {
                    conditionalUserProperty.mTriggeredEventName = zzo.f17290i.f17252a;
                    if (zzo.f17290i.f17253b != null) {
                        conditionalUserProperty.mTriggeredEventParams = zzo.f17290i.f17253b.mo15868b();
                    }
                }
                conditionalUserProperty.mTriggeredTimestamp = zzo.f17284c.f17257b;
                conditionalUserProperty.mTimeToLive = zzo.f17291j;
                if (zzo.f17292k != null) {
                    conditionalUserProperty.mExpiredEventName = zzo.f17292k.f17252a;
                    if (zzo.f17292k.f17253b != null) {
                        conditionalUserProperty.mExpiredEventParams = zzo.f17292k.f17253b.mo15868b();
                    }
                }
                arrayList.add(conditionalUserProperty);
            }
            return arrayList;
        }
        u_.mo15858a(str4);
        return Collections.emptyList();
    }

    /* renamed from: b */
    private final Map<String, Object> m23155b(String str, String str2, String str3, boolean z) {
        C4769t i;
        String str4;
        if (mo15252q().mo15317g()) {
            i = mo15253r().mo15852u_();
            str4 = "Cannot get user properties from analytics worker thread";
        } else if (C4742eq.m23658a()) {
            i = mo15253r().mo15852u_();
            str4 = "Cannot get user properties from main thread";
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                C4634ar q = this.f16825q.mo15252q();
                C4679ci ciVar = new C4679ci(this, atomicReference, str, str2, str3, z);
                q.mo15314a((Runnable) ciVar);
                try {
                    atomicReference.wait(5000);
                } catch (InterruptedException e) {
                    mo15253r().mo15849i().mo15859a("Interrupted waiting for get user properties", e);
                }
            }
            List<zzfv> list = (List) atomicReference.get();
            if (list == null) {
                i = mo15253r().mo15849i();
                str4 = "Timed out waiting for get user properties";
            } else {
                C0488a aVar = new C0488a(list.size());
                for (zzfv zzfv : list) {
                    aVar.put(zzfv.f17256a, zzfv.mo15877a());
                }
                return aVar;
            }
        }
        i.mo15858a(str4);
        return Collections.emptyMap();
    }

    /* renamed from: b */
    private final void m23157b(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle b = C4736ek.m23537b(bundle);
        C4634ar q = mo15252q();
        C4674cd cdVar = new C4674cd(this, str, str2, j, b, z, z2, z3, str3);
        q.mo15314a((Runnable) cdVar);
    }

    /* renamed from: b */
    private final void m23158b(String str, String str2, String str3, Bundle bundle) {
        long a = mo15248m().mo11326a();
        C3266s.m14915a(str2);
        ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
        conditionalUserProperty.mAppId = str;
        conditionalUserProperty.mName = str2;
        conditionalUserProperty.mCreationTimestamp = a;
        if (str3 != null) {
            conditionalUserProperty.mExpiredEventName = str3;
            conditionalUserProperty.mExpiredEventParams = bundle;
        }
        mo15252q().mo15314a((Runnable) new C4677cg(this, conditionalUserProperty));
    }

    /* renamed from: c */
    private final void m23159c(ConditionalUserProperty conditionalUserProperty) {
        long a = mo15248m().mo11326a();
        C3266s.m14913a(conditionalUserProperty);
        C3266s.m14915a(conditionalUserProperty.mName);
        C3266s.m14915a(conditionalUserProperty.mOrigin);
        C3266s.m14913a(conditionalUserProperty.mValue);
        conditionalUserProperty.mCreationTimestamp = a;
        String str = conditionalUserProperty.mName;
        Object obj = conditionalUserProperty.mValue;
        if (mo15251p().mo15594c(str) != 0) {
            mo15253r().mo15852u_().mo15859a("Invalid conditional user property name", mo15250o().mo15843c(str));
        } else if (mo15251p().mo15592b(str, obj) != 0) {
            mo15253r().mo15852u_().mo15860a("Invalid conditional user property value", mo15250o().mo15843c(str), obj);
        } else {
            Object c = mo15251p().mo15595c(str, obj);
            if (c == null) {
                mo15253r().mo15852u_().mo15860a("Unable to normalize conditional user property value", mo15250o().mo15843c(str), obj);
                return;
            }
            conditionalUserProperty.mValue = c;
            long j = conditionalUserProperty.mTriggerTimeout;
            if (TextUtils.isEmpty(conditionalUserProperty.mTriggerEventName) || (j <= 15552000000L && j >= 1)) {
                long j2 = conditionalUserProperty.mTimeToLive;
                if (j2 > 15552000000L || j2 < 1) {
                    mo15253r().mo15852u_().mo15860a("Invalid conditional user property time to live", mo15250o().mo15843c(str), Long.valueOf(j2));
                } else {
                    mo15252q().mo15314a((Runnable) new C4676cf(this, conditionalUserProperty));
                }
            } else {
                mo15253r().mo15852u_().mo15860a("Invalid conditional user property timeout", mo15250o().mo15843c(str), Long.valueOf(j));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m23160d(ConditionalUserProperty conditionalUserProperty) {
        ConditionalUserProperty conditionalUserProperty2 = conditionalUserProperty;
        mo15239d();
        mo15503E();
        C3266s.m14913a(conditionalUserProperty);
        C3266s.m14915a(conditionalUserProperty2.mName);
        C3266s.m14915a(conditionalUserProperty2.mOrigin);
        C3266s.m14913a(conditionalUserProperty2.mValue);
        if (!this.f16825q.mo15325C()) {
            mo15253r().mo15854w().mo15858a("Conditional property not sent since collection is disabled");
            return;
        }
        zzfv zzfv = new zzfv(conditionalUserProperty2.mName, conditionalUserProperty2.mTriggeredTimestamp, conditionalUserProperty2.mValue, conditionalUserProperty2.mOrigin);
        try {
            zzag a = mo15251p().mo15582a(conditionalUserProperty2.mAppId, conditionalUserProperty2.mTriggeredEventName, conditionalUserProperty2.mTriggeredEventParams, conditionalUserProperty2.mOrigin, 0, true, false);
            zzag a2 = mo15251p().mo15582a(conditionalUserProperty2.mAppId, conditionalUserProperty2.mTimedOutEventName, conditionalUserProperty2.mTimedOutEventParams, conditionalUserProperty2.mOrigin, 0, true, false);
            zzag a3 = mo15251p().mo15582a(conditionalUserProperty2.mAppId, conditionalUserProperty2.mExpiredEventName, conditionalUserProperty2.mExpiredEventParams, conditionalUserProperty2.mOrigin, 0, true, false);
            String str = conditionalUserProperty2.mAppId;
            String str2 = conditionalUserProperty2.mOrigin;
            long j = conditionalUserProperty2.mCreationTimestamp;
            String str3 = conditionalUserProperty2.mTriggerEventName;
            long j2 = conditionalUserProperty2.mTriggerTimeout;
            zzo zzo = r3;
            zzo zzo2 = new zzo(str, str2, zzfv, j, false, str3, a2, j2, a, conditionalUserProperty2.mTimeToLive, a3);
            mo15243h().mo15462a(zzo);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m23161e(ConditionalUserProperty conditionalUserProperty) {
        ConditionalUserProperty conditionalUserProperty2 = conditionalUserProperty;
        mo15239d();
        mo15503E();
        C3266s.m14913a(conditionalUserProperty);
        C3266s.m14915a(conditionalUserProperty2.mName);
        if (!this.f16825q.mo15325C()) {
            mo15253r().mo15854w().mo15858a("Conditional property not cleared since collection is disabled");
            return;
        }
        zzfv zzfv = new zzfv(conditionalUserProperty2.mName, 0, null, null);
        try {
            zzag a = mo15251p().mo15582a(conditionalUserProperty2.mAppId, conditionalUserProperty2.mExpiredEventName, conditionalUserProperty2.mExpiredEventParams, conditionalUserProperty2.mOrigin, conditionalUserProperty2.mCreationTimestamp, true, false);
            String str = conditionalUserProperty2.mAppId;
            String str2 = conditionalUserProperty2.mOrigin;
            long j = conditionalUserProperty2.mCreationTimestamp;
            boolean z = conditionalUserProperty2.mActive;
            String str3 = conditionalUserProperty2.mTriggerEventName;
            long j2 = conditionalUserProperty2.mTriggerTimeout;
            zzo zzo = r3;
            zzo zzo2 = new zzo(str, str2, zzfv, j, z, str3, null, j2, null, conditionalUserProperty2.mTimeToLive, a);
            mo15243h().mo15462a(zzo);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: A */
    public final String mo15404A() {
        C4684cn y = this.f16825q.mo15351w().mo15451y();
        if (y != null) {
            return y.f16889b;
        }
        return null;
    }

    /* renamed from: B */
    public final String mo15405B() {
        if (this.f16825q.mo15347p() != null) {
            return this.f16825q.mo15347p();
        }
        try {
            return C3139e.m14512a();
        } catch (IllegalStateException e) {
            this.f16825q.mo15253r().mo15852u_().mo15859a("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    /* renamed from: a */
    public final List<ConditionalUserProperty> mo15406a(String str, String str2) {
        mo15236b();
        return m23154b((String) null, str, str2);
    }

    /* renamed from: a */
    public final List<ConditionalUserProperty> mo15407a(String str, String str2, String str3) {
        C3266s.m14915a(str);
        mo15233a();
        return m23154b(str, str2, str3);
    }

    /* renamed from: a */
    public final Map<String, Object> mo15408a(String str, String str2, String str3, boolean z) {
        C3266s.m14915a(str);
        mo15233a();
        return m23155b(str, str2, str3, z);
    }

    /* renamed from: a */
    public final Map<String, Object> mo15409a(String str, String str2, boolean z) {
        mo15236b();
        return m23155b((String) null, str, str2, z);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15233a() {
        super.mo15233a();
    }

    /* renamed from: a */
    public final void mo15410a(ConditionalUserProperty conditionalUserProperty) {
        C3266s.m14913a(conditionalUserProperty);
        mo15236b();
        ConditionalUserProperty conditionalUserProperty2 = new ConditionalUserProperty(conditionalUserProperty);
        if (!TextUtils.isEmpty(conditionalUserProperty2.mAppId)) {
            mo15253r().mo15849i().mo15858a("Package name should be null when calling setConditionalUserProperty");
        }
        conditionalUserProperty2.mAppId = null;
        m23159c(conditionalUserProperty2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo15411a(String str) {
        this.f16853f.set(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo15412a(String str, String str2, long j, Bundle bundle) {
        mo15236b();
        mo15239d();
        m23152a(str, str2, j, bundle, true, this.f16850c == null || C4736ek.m23542e(str2), false, null);
    }

    /* renamed from: a */
    public final void mo15413a(String str, String str2, Bundle bundle) {
        mo15414a(str, str2, bundle, true, true, mo15248m().mo11326a());
    }

    /* renamed from: a */
    public final void mo15414a(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        boolean z3;
        mo15236b();
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (z2) {
            if (this.f16850c != null && !C4736ek.m23542e(str2)) {
                z3 = false;
                m23157b(str3, str2, j, bundle2, z2, z3, !z, null);
            }
        }
        z3 = true;
        m23157b(str3, str2, j, bundle2, z2, z3, !z, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo15415a(String str, String str2, Object obj, long j) {
        C3266s.m14915a(str);
        C3266s.m14915a(str2);
        mo15239d();
        mo15236b();
        mo15503E();
        if (!this.f16825q.mo15325C()) {
            mo15253r().mo15854w().mo15858a("User property not set since app measurement is disabled");
        } else if (this.f16825q.mo15330H()) {
            mo15253r().mo15854w().mo15860a("Setting user property (FE)", mo15250o().mo15841a(str2), obj);
            zzfv zzfv = new zzfv(str2, j, obj, str);
            mo15243h().mo15461a(zzfv);
        }
    }

    /* renamed from: a */
    public final void mo15416a(String str, String str2, Object obj, boolean z) {
        mo15417a(str, str2, obj, z, mo15248m().mo11326a());
    }

    /* renamed from: a */
    public final void mo15417a(String str, String str2, Object obj, boolean z, long j) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i = 6;
        int i2 = 0;
        if (z) {
            i = mo15251p().mo15594c(str2);
        } else {
            C4736ek p = mo15251p();
            if (p.mo15589a("user property", str2)) {
                if (!p.mo15590a("user property", C4666bw.f16831a, str2)) {
                    i = 15;
                } else if (p.mo15588a("user property", 24, str2)) {
                    i = 0;
                }
            }
        }
        if (i != 0) {
            mo15251p();
            String a = C4736ek.m23527a(str2, 24, true);
            if (str2 != null) {
                i2 = str2.length();
            }
            this.f16825q.mo15343j().mo15584a(i, "_ev", a, i2);
        } else if (obj != null) {
            int b = mo15251p().mo15592b(str2, obj);
            if (b != 0) {
                mo15251p();
                String a2 = C4736ek.m23527a(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i2 = String.valueOf(obj).length();
                }
                this.f16825q.mo15343j().mo15584a(b, "_ev", a2, i2);
                return;
            }
            Object c = mo15251p().mo15595c(str2, obj);
            if (c != null) {
                m23153a(str3, str2, j, c);
            }
        } else {
            m23153a(str3, str2, j, (Object) null);
        }
    }

    /* renamed from: a */
    public final void mo15418a(String str, String str2, String str3, Bundle bundle) {
        C3266s.m14915a(str);
        mo15233a();
        m23158b(str, str2, str3, bundle);
    }

    /* renamed from: a */
    public final void mo15419a(boolean z) {
        mo15503E();
        mo15236b();
        mo15252q().mo15314a((Runnable) new C4680cj(this, z));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15236b() {
        super.mo15236b();
    }

    /* renamed from: b */
    public final void mo15420b(ConditionalUserProperty conditionalUserProperty) {
        C3266s.m14913a(conditionalUserProperty);
        C3266s.m14915a(conditionalUserProperty.mAppId);
        mo15233a();
        m23159c(new ConditionalUserProperty(conditionalUserProperty));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo15421b(String str, String str2, Bundle bundle) {
        mo15236b();
        mo15239d();
        mo15412a(str, str2, mo15248m().mo11326a(), bundle);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo15238c() {
        super.mo15238c();
    }

    /* renamed from: c */
    public final void mo15422c(String str, String str2, Bundle bundle) {
        mo15236b();
        m23158b((String) null, str, str2, bundle);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo15239d() {
        super.mo15239d();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C4616a mo15240e() {
        return super.mo15240e();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C4672cb mo15241f() {
        return super.mo15241f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C4761l mo15242g() {
        return super.mo15242g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C4689cs mo15243h() {
        return super.mo15243h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C4685co mo15244i() {
        return super.mo15244i();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C4763n mo15245j() {
        return super.mo15245j();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C4714dq mo15246k() {
        return super.mo15246k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C4643b mo15247l() {
        return super.mo15247l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C3300e mo15248m() {
        return super.mo15248m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo15249n() {
        return super.mo15249n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C4765p mo15250o() {
        return super.mo15250o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C4736ek mo15251p() {
        return super.mo15251p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C4634ar mo15252q() {
        return super.mo15252q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C4767r mo15253r() {
        return super.mo15253r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C4620ad mo15254s() {
        return super.mo15254s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C4744es mo15255t() {
        return super.mo15255t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ C4742eq mo15256u() {
        return super.mo15256u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final boolean mo15423v() {
        return false;
    }

    /* renamed from: x */
    public final String mo15424x() {
        mo15236b();
        return (String) this.f16853f.get();
    }

    /* renamed from: y */
    public final void mo15425y() {
        mo15239d();
        mo15236b();
        mo15503E();
        if (this.f16825q.mo15330H()) {
            mo15243h().mo15468z();
            this.f16849b = false;
            String v = mo15254s().mo15278v();
            if (!TextUtils.isEmpty(v)) {
                mo15247l().mo15395A();
                if (!v.equals(VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", v);
                    mo15413a("auto", "_ou", bundle);
                }
            }
        }
    }

    /* renamed from: z */
    public final String mo15426z() {
        C4684cn y = this.f16825q.mo15351w().mo15451y();
        if (y != null) {
            return y.f16888a;
        }
        return null;
    }
}
