package com.google.firebase.iid;

import android.support.p009v4.p019g.C0488a;
import android.util.Pair;
import com.google.android.gms.tasks.C4796f;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.iid.r */
final class C4965r {

    /* renamed from: a */
    private final Executor f17778a;
    @GuardedBy("this")

    /* renamed from: b */
    private final Map<Pair<String, String>, C4796f<String>> f17779b = new C0488a();

    C4965r(Executor executor) {
        this.f17778a = executor;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C4796f mo16240a(Pair pair, C4796f fVar) {
        synchronized (this) {
            this.f17779b.remove(pair);
        }
        return fVar;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003e, code lost:
        return r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.tasks.C4796f<java.lang.String> mo16241a(java.lang.String r4, java.lang.String r5, com.google.firebase.iid.C4967t r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x0081 }
            r0.<init>(r4, r5)     // Catch:{ all -> 0x0081 }
            java.util.Map<android.util.Pair<java.lang.String, java.lang.String>, com.google.android.gms.tasks.f<java.lang.String>> r4 = r3.f17779b     // Catch:{ all -> 0x0081 }
            java.lang.Object r4 = r4.get(r0)     // Catch:{ all -> 0x0081 }
            com.google.android.gms.tasks.f r4 = (com.google.android.gms.tasks.C4796f) r4     // Catch:{ all -> 0x0081 }
            r5 = 3
            if (r4 == 0) goto L_0x003f
            java.lang.String r6 = "FirebaseInstanceId"
            boolean r5 = android.util.Log.isLoggable(r6, r5)     // Catch:{ all -> 0x0081 }
            if (r5 == 0) goto L_0x003d
            java.lang.String r5 = "FirebaseInstanceId"
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0081 }
            int r0 = r0.length()     // Catch:{ all -> 0x0081 }
            int r0 = r0 + 29
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            r1.<init>(r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = "Joining ongoing request for: "
            r1.append(r0)     // Catch:{ all -> 0x0081 }
            r1.append(r6)     // Catch:{ all -> 0x0081 }
            java.lang.String r6 = r1.toString()     // Catch:{ all -> 0x0081 }
            android.util.Log.d(r5, r6)     // Catch:{ all -> 0x0081 }
        L_0x003d:
            monitor-exit(r3)
            return r4
        L_0x003f:
            java.lang.String r4 = "FirebaseInstanceId"
            boolean r4 = android.util.Log.isLoggable(r4, r5)     // Catch:{ all -> 0x0081 }
            if (r4 == 0) goto L_0x006b
            java.lang.String r4 = "FirebaseInstanceId"
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0081 }
            int r1 = r1.length()     // Catch:{ all -> 0x0081 }
            int r1 = r1 + 24
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            r2.<init>(r1)     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = "Making new request for: "
            r2.append(r1)     // Catch:{ all -> 0x0081 }
            r2.append(r5)     // Catch:{ all -> 0x0081 }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x0081 }
            android.util.Log.d(r4, r5)     // Catch:{ all -> 0x0081 }
        L_0x006b:
            com.google.android.gms.tasks.f r4 = r6.mo16199a()     // Catch:{ all -> 0x0081 }
            java.util.concurrent.Executor r5 = r3.f17778a     // Catch:{ all -> 0x0081 }
            com.google.firebase.iid.s r6 = new com.google.firebase.iid.s     // Catch:{ all -> 0x0081 }
            r6.<init>(r3, r0)     // Catch:{ all -> 0x0081 }
            com.google.android.gms.tasks.f r4 = r4.mo15924b(r5, r6)     // Catch:{ all -> 0x0081 }
            java.util.Map<android.util.Pair<java.lang.String, java.lang.String>, com.google.android.gms.tasks.f<java.lang.String>> r5 = r3.f17779b     // Catch:{ all -> 0x0081 }
            r5.put(r0, r4)     // Catch:{ all -> 0x0081 }
            monitor-exit(r3)
            return r4
        L_0x0081:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C4965r.mo16241a(java.lang.String, java.lang.String, com.google.firebase.iid.t):com.google.android.gms.tasks.f");
    }
}
