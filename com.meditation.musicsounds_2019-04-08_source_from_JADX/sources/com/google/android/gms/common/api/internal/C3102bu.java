package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3020a.C3023c;
import com.google.android.gms.common.api.C3020a.C3031f;
import com.google.android.gms.common.api.C3049h;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.bu */
public final class C3102bu {

    /* renamed from: a */
    public static final Status f10754a = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: c */
    private static final BasePendingResult<?>[] f10755c = new BasePendingResult[0];

    /* renamed from: b */
    final Set<BasePendingResult<?>> f10756b = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: d */
    private final C3105bx f10757d = new C3103bv(this);

    /* renamed from: e */
    private final Map<C3023c<?>, C3031f> f10758e;

    public C3102bu(Map<C3023c<?>, C3031f> map) {
        this.f10758e = map;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.common.api.n, com.google.android.gms.common.api.internal.bv, com.google.android.gms.common.api.i, com.google.android.gms.common.api.internal.bx] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v0, types: [com.google.android.gms.common.api.n, com.google.android.gms.common.api.internal.bv, com.google.android.gms.common.api.i, com.google.android.gms.common.api.internal.bx]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [com.google.android.gms.common.api.internal.bx, com.google.android.gms.common.api.i, com.google.android.gms.common.api.n, com.google.android.gms.common.api.internal.bv]
      mth insns count: 41
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10973a() {
        /*
            r8 = this;
            java.util.Set<com.google.android.gms.common.api.internal.BasePendingResult<?>> r0 = r8.f10756b
            com.google.android.gms.common.api.internal.BasePendingResult<?>[] r1 = f10755c
            java.lang.Object[] r0 = r0.toArray(r1)
            com.google.android.gms.common.api.internal.BasePendingResult[] r0 = (com.google.android.gms.common.api.internal.BasePendingResult[]) r0
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x000d:
            if (r3 >= r1) goto L_0x0075
            r4 = r0[r3]
            r5 = 0
            r4.mo10875a(r5)
            java.lang.Integer r6 = r4.mo10871c()
            if (r6 != 0) goto L_0x0027
            boolean r5 = r4.mo10879g()
            if (r5 == 0) goto L_0x0072
        L_0x0021:
            java.util.Set<com.google.android.gms.common.api.internal.BasePendingResult<?>> r5 = r8.f10756b
            r5.remove(r4)
            goto L_0x0072
        L_0x0027:
            r4.mo10869a(r5)
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.api.a$f> r6 = r8.f10758e
            r7 = r4
            com.google.android.gms.common.api.internal.c$a r7 = (com.google.android.gms.common.api.internal.C3108c.C3109a) r7
            com.google.android.gms.common.api.a$c r7 = r7.mo10983d()
            java.lang.Object r6 = r6.get(r7)
            com.google.android.gms.common.api.a$f r6 = (com.google.android.gms.common.api.C3020a.C3031f) r6
            android.os.IBinder r6 = r6.mo10820l()
            boolean r7 = r4.mo10878f()
            if (r7 == 0) goto L_0x004c
            com.google.android.gms.common.api.internal.bw r7 = new com.google.android.gms.common.api.internal.bw
            r7.<init>(r4, r5, r6, r5)
            r4.mo10875a(r7)
            goto L_0x0021
        L_0x004c:
            if (r6 == 0) goto L_0x0060
            boolean r7 = r6.isBinderAlive()
            if (r7 == 0) goto L_0x0060
            com.google.android.gms.common.api.internal.bw r7 = new com.google.android.gms.common.api.internal.bw
            r7.<init>(r4, r5, r6, r5)
            r4.mo10875a(r7)
            r6.linkToDeath(r7, r2)     // Catch:{ RemoteException -> 0x0063 }
            goto L_0x0021
        L_0x0060:
            r4.mo10875a(r5)
        L_0x0063:
            r4.mo10867a()
            java.lang.Integer r6 = r4.mo10871c()
            int r6 = r6.intValue()
            r5.mo11088a(r6)
            goto L_0x0021
        L_0x0072:
            int r3 = r3 + 1
            goto L_0x000d
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C3102bu.mo10973a():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo10974a(BasePendingResult<? extends C3049h> basePendingResult) {
        this.f10756b.add(basePendingResult);
        basePendingResult.mo10875a(this.f10757d);
    }

    /* renamed from: b */
    public final void mo10975b() {
        for (BasePendingResult c : (BasePendingResult[]) this.f10756b.toArray(f10755c)) {
            c.mo10877c(f10754a);
        }
    }
}
