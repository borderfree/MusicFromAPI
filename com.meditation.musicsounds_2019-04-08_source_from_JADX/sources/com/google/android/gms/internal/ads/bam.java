package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

@C3464ci
public final class bam implements baa {

    /* renamed from: a */
    private final zzaef f13480a;

    /* renamed from: b */
    private final bas f13481b;

    /* renamed from: c */
    private final Context f13482c;

    /* renamed from: d */
    private final bac f13483d;

    /* renamed from: e */
    private final boolean f13484e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final long f13485f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final long f13486g;

    /* renamed from: h */
    private final int f13487h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Object f13488i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f13489j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Map<C3751my<baj>, bag> f13490k = new HashMap();

    /* renamed from: l */
    private final boolean f13491l;

    /* renamed from: m */
    private final String f13492m;

    /* renamed from: n */
    private List<baj> f13493n = new ArrayList();

    /* renamed from: o */
    private final boolean f13494o;

    public bam(Context context, zzaef zzaef, bas bas, bac bac, boolean z, boolean z2, String str, long j, long j2, int i, boolean z3) {
        this.f13482c = context;
        this.f13480a = zzaef;
        this.f13481b = bas;
        this.f13483d = bac;
        this.f13484e = z;
        this.f13491l = z2;
        this.f13492m = str;
        this.f13485f = j;
        this.f13486g = j2;
        this.f13487h = 2;
        this.f13494o = z3;
    }

    /* renamed from: a */
    private final void m17784a(C3751my<baj> myVar) {
        C3653jh.f14275a.post(new bao(this, myVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r4.hasNext() == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        r0 = (com.google.android.gms.internal.ads.C3751my) r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1 = (com.google.android.gms.internal.ads.baj) r0.get();
        r3.f13493n.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r1 == null) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        if (r1.f13473a != 0) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        m17784a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        com.google.android.gms.internal.ads.C3643iy.m19175c("Exception while processing an adapter; continuing with other adapters", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        m17784a(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        return new com.google.android.gms.internal.ads.baj(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r4 = r4.iterator();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.baj m17785b(java.util.List<com.google.android.gms.internal.ads.C3751my<com.google.android.gms.internal.ads.baj>> r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f13488i
            monitor-enter(r0)
            boolean r1 = r3.f13489j     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.baj r4 = new com.google.android.gms.internal.ads.baj     // Catch:{ all -> 0x0047 }
            r1 = -1
            r4.<init>(r1)     // Catch:{ all -> 0x0047 }
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            return r4
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            java.util.Iterator r4 = r4.iterator()
        L_0x0014:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x003c
            java.lang.Object r0 = r4.next()
            com.google.android.gms.internal.ads.my r0 = (com.google.android.gms.internal.ads.C3751my) r0
            java.lang.Object r1 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            com.google.android.gms.internal.ads.baj r1 = (com.google.android.gms.internal.ads.baj) r1     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            java.util.List<com.google.android.gms.internal.ads.baj> r2 = r3.f13493n     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            r2.add(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            if (r1 == 0) goto L_0x0014
            int r2 = r1.f13473a     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            if (r2 != 0) goto L_0x0014
            r3.m17784a(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            return r1
        L_0x0035:
            r0 = move-exception
            java.lang.String r1 = "Exception while processing an adapter; continuing with other adapters"
            com.google.android.gms.internal.ads.C3643iy.m19175c(r1, r0)
            goto L_0x0014
        L_0x003c:
            r4 = 0
            r3.m17784a(r4)
            com.google.android.gms.internal.ads.baj r4 = new com.google.android.gms.internal.ads.baj
            r0 = 1
            r4.<init>(r0)
            return r4
        L_0x0047:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bam.m17785b(java.util.List):com.google.android.gms.internal.ads.baj");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r13.f13483d.f13436n == -1) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        r0 = r13.f13483d.f13436n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r0 = 10000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r14 = r14.iterator();
        r3 = null;
        r1 = r0;
        r0 = null;
        r4 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r14.hasNext() == false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        r5 = (com.google.android.gms.internal.ads.C3751my) r14.next();
        r6 = com.google.android.gms.ads.internal.zzbv.zzer().mo11326a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r1 != 0) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r5.isDone() == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        r10 = r5.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        r10 = (com.google.android.gms.internal.ads.baj) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0054, code lost:
        r10 = r5.get(r1, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        r13.f13493n.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0060, code lost:
        if (r10 == null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        if (r10.f13473a != 0) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0066, code lost:
        r11 = r10.f13478f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0068, code lost:
        if (r11 == null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006e, code lost:
        if (r11.mo12677a() <= r4) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0074, code lost:
        r3 = r5;
        r0 = r10;
        r4 = r11.mo12677a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        com.google.android.gms.internal.ads.C3643iy.m19175c("Exception while processing an adapter; continuing with other adapters", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008c, code lost:
        java.lang.Math.max(r1 - (com.google.android.gms.ads.internal.zzbv.zzer().mo11326a() - r6), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0099, code lost:
        throw r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009a, code lost:
        m17784a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009d, code lost:
        if (r0 != null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a5, code lost:
        return new com.google.android.gms.internal.ads.baj(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a6, code lost:
        return r0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.baj m17788c(java.util.List<com.google.android.gms.internal.ads.C3751my<com.google.android.gms.internal.ads.baj>> r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f13488i
            monitor-enter(r0)
            boolean r1 = r13.f13489j     // Catch:{ all -> 0x00a7 }
            r2 = -1
            if (r1 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.baj r14 = new com.google.android.gms.internal.ads.baj     // Catch:{ all -> 0x00a7 }
            r14.<init>(r2)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a7 }
            return r14
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.internal.ads.bac r0 = r13.f13483d
            long r0 = r0.f13436n
            r3 = -1
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.bac r0 = r13.f13483d
            long r0 = r0.f13436n
            goto L_0x0021
        L_0x001f:
            r0 = 10000(0x2710, double:4.9407E-320)
        L_0x0021:
            java.util.Iterator r14 = r14.iterator()
            r3 = 0
            r1 = r0
            r0 = r3
            r4 = -1
        L_0x0029:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L_0x009a
            java.lang.Object r5 = r14.next()
            com.google.android.gms.internal.ads.my r5 = (com.google.android.gms.internal.ads.C3751my) r5
            com.google.android.gms.common.util.e r6 = com.google.android.gms.ads.internal.zzbv.zzer()
            long r6 = r6.mo11326a()
            r8 = 0
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0054
            boolean r10 = r5.isDone()     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            if (r10 == 0) goto L_0x0054
            java.lang.Object r10 = r5.get()     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
        L_0x004d:
            com.google.android.gms.internal.ads.baj r10 = (com.google.android.gms.internal.ads.baj) r10     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            goto L_0x005b
        L_0x0050:
            r14 = move-exception
            goto L_0x008c
        L_0x0052:
            r5 = move-exception
            goto L_0x0078
        L_0x0054:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            java.lang.Object r10 = r5.get(r1, r10)     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            goto L_0x004d
        L_0x005b:
            java.util.List<com.google.android.gms.internal.ads.baj> r11 = r13.f13493n     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            r11.add(r10)     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            if (r10 == 0) goto L_0x007d
            int r11 = r10.f13473a     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            if (r11 != 0) goto L_0x007d
            com.google.android.gms.internal.ads.bbb r11 = r10.f13478f     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            if (r11 == 0) goto L_0x007d
            int r12 = r11.mo12677a()     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            if (r12 <= r4) goto L_0x007d
            int r11 = r11.mo12677a()     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            r3 = r5
            r0 = r10
            r4 = r11
            goto L_0x007d
        L_0x0078:
            java.lang.String r10 = "Exception while processing an adapter; continuing with other adapters"
            com.google.android.gms.internal.ads.C3643iy.m19175c(r10, r5)     // Catch:{ all -> 0x0050 }
        L_0x007d:
            com.google.android.gms.common.util.e r5 = com.google.android.gms.ads.internal.zzbv.zzer()
            long r10 = r5.mo11326a()
            long r10 = r10 - r6
            long r1 = r1 - r10
            long r1 = java.lang.Math.max(r1, r8)
            goto L_0x0029
        L_0x008c:
            com.google.android.gms.common.util.e r0 = com.google.android.gms.ads.internal.zzbv.zzer()
            long r3 = r0.mo11326a()
            long r3 = r3 - r6
            long r1 = r1 - r3
            java.lang.Math.max(r1, r8)
            throw r14
        L_0x009a:
            r13.m17784a(r3)
            if (r0 != 0) goto L_0x00a6
            com.google.android.gms.internal.ads.baj r14 = new com.google.android.gms.internal.ads.baj
            r0 = 1
            r14.<init>(r0)
            return r14
        L_0x00a6:
            return r0
        L_0x00a7:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a7 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bam.m17788c(java.util.List):com.google.android.gms.internal.ads.baj");
    }

    /* renamed from: a */
    public final baj mo12653a(List<bab> list) {
        C3643iy.m19172b("Starting mediation.");
        ArrayList arrayList = new ArrayList();
        zzjn zzjn = this.f13480a.f15260d;
        int[] iArr = new int[2];
        if (zzjn.f15505g != null) {
            zzbv.zzfd();
            if (bal.m17782a(this.f13492m, iArr)) {
                int i = 0;
                int i2 = iArr[0];
                int i3 = iArr[1];
                zzjn[] zzjnArr = zzjn.f15505g;
                int length = zzjnArr.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    zzjn zzjn2 = zzjnArr[i];
                    if (i2 == zzjn2.f15503e && i3 == zzjn2.f15500b) {
                        zzjn = zzjn2;
                        break;
                    }
                    i++;
                }
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bab bab = (bab) it.next();
            String str = "Trying mediation network: ";
            String valueOf = String.valueOf(bab.f13403b);
            C3643iy.m19176d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            Iterator it2 = bab.f13404c.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                Context context = this.f13482c;
                bas bas = this.f13481b;
                bac bac = this.f13483d;
                zzjj zzjj = this.f13480a.f15259c;
                zzang zzang = this.f13480a.f15267k;
                boolean z = this.f13484e;
                Iterator it3 = it;
                Iterator it4 = it2;
                ArrayList arrayList2 = arrayList;
                boolean z2 = z;
                bab bab2 = bab;
                zzjn zzjn3 = zzjn;
                zzang zzang2 = zzang;
                bag bag = new bag(context, str2, bas, bac, bab2, zzjj, zzjn3, zzang2, z2, this.f13491l, this.f13480a.f15281y, this.f13480a.f15270n, this.f13480a.f15282z, this.f13480a.f15251X, this.f13494o);
                C3751my a = C3651jf.m18856a((Callable<T>) new ban<T>(this, bag));
                this.f13490k.put(a, bag);
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(a);
                arrayList = arrayList3;
                it = it3;
                it2 = it4;
            }
        }
        ArrayList arrayList4 = arrayList;
        return this.f13487h != 2 ? m17785b((List<C3751my<baj>>) arrayList4) : m17788c((List<C3751my<baj>>) arrayList4);
    }

    /* renamed from: a */
    public final void mo12654a() {
        synchronized (this.f13488i) {
            this.f13489j = true;
            for (bag a : this.f13490k.values()) {
                a.mo12673a();
            }
        }
    }

    /* renamed from: b */
    public final List<baj> mo12655b() {
        return this.f13493n;
    }
}
