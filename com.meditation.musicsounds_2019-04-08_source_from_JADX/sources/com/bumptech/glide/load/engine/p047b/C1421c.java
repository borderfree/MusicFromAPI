package com.bumptech.glide.load.engine.p047b;

import com.bumptech.glide.p040g.C1257i;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bumptech.glide.load.engine.b.c */
final class C1421c {

    /* renamed from: a */
    private final Map<String, C1422a> f4748a = new HashMap();

    /* renamed from: b */
    private final C1423b f4749b = new C1423b();

    /* renamed from: com.bumptech.glide.load.engine.b.c$a */
    private static class C1422a {

        /* renamed from: a */
        final Lock f4750a = new ReentrantLock();

        /* renamed from: b */
        int f4751b;

        C1422a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.b.c$b */
    private static class C1423b {

        /* renamed from: a */
        private final Queue<C1422a> f4752a = new ArrayDeque();

        C1423b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C1422a mo6178a() {
            C1422a aVar;
            synchronized (this.f4752a) {
                aVar = (C1422a) this.f4752a.poll();
            }
            return aVar == null ? new C1422a() : aVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6179a(C1422a aVar) {
            synchronized (this.f4752a) {
                if (this.f4752a.size() < 10) {
                    this.f4752a.offer(aVar);
                }
            }
        }
    }

    C1421c() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6176a(String str) {
        C1422a aVar;
        synchronized (this) {
            aVar = (C1422a) this.f4748a.get(str);
            if (aVar == null) {
                aVar = this.f4749b.mo6178a();
                this.f4748a.put(str, aVar);
            }
            aVar.f4751b++;
        }
        aVar.f4750a.lock();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6177b(String str) {
        C1422a aVar;
        synchronized (this) {
            aVar = (C1422a) C1257i.m6691a(this.f4748a.get(str));
            if (aVar.f4751b >= 1) {
                aVar.f4751b--;
                if (aVar.f4751b == 0) {
                    C1422a aVar2 = (C1422a) this.f4748a.remove(str);
                    if (aVar2.equals(aVar)) {
                        this.f4749b.mo6179a(aVar2);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Removed the wrong lock, expected to remove: ");
                        sb.append(aVar);
                        sb.append(", but actually removed: ");
                        sb.append(aVar2);
                        sb.append(", safeKey: ");
                        sb.append(str);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Cannot release a lock that is not held, safeKey: ");
                sb2.append(str);
                sb2.append(", interestedThreads: ");
                sb2.append(aVar.f4751b);
                throw new IllegalStateException(sb2.toString());
            }
        }
        aVar.f4750a.unlock();
    }
}
