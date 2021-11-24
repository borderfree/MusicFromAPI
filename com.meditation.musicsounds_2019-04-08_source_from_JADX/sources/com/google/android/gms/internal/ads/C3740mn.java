package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.mn */
public final class C3740mn {
    /* renamed from: a */
    public static <T> C3749mw<T> m19190a(Throwable th) {
        return new C3749mw<>(th);
    }

    /* renamed from: a */
    public static <T> C3750mx<T> m19191a(T t) {
        return new C3750mx<>(t);
    }

    /* renamed from: a */
    public static <V> C3751my<V> m19192a(C3751my<V> myVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        C3763nj njVar = new C3763nj();
        m19200a((C3751my<A>) njVar, (Future<B>) myVar);
        ScheduledFuture schedule = scheduledExecutorService.schedule(new C3744mr(njVar), j, timeUnit);
        m19199a(myVar, njVar);
        njVar.mo13268a(new C3745ms(schedule), C3758ne.f14482b);
        return njVar;
    }

    /* renamed from: a */
    public static <A, B> C3751my<B> m19193a(C3751my<A> myVar, C3735mi<? super A, ? extends B> miVar, Executor executor) {
        C3763nj njVar = new C3763nj();
        myVar.mo13268a(new C3743mq(njVar, miVar, myVar), executor);
        m19200a((C3751my<A>) njVar, (Future<B>) myVar);
        return njVar;
    }

    /* renamed from: a */
    public static <A, B> C3751my<B> m19194a(C3751my<A> myVar, C3736mj<A, B> mjVar, Executor executor) {
        C3763nj njVar = new C3763nj();
        myVar.mo13268a(new C3742mp(njVar, mjVar, myVar), executor);
        m19200a((C3751my<A>) njVar, (Future<B>) myVar);
        return njVar;
    }

    /* renamed from: a */
    public static <V, X extends Throwable> C3751my<V> m19195a(C3751my<? extends V> myVar, Class<X> cls, C3735mi<? super X, ? extends V> miVar, Executor executor) {
        C3763nj njVar = new C3763nj();
        m19200a((C3751my<A>) njVar, (Future<B>) myVar);
        C3746mt mtVar = new C3746mt(njVar, myVar, cls, miVar, executor);
        myVar.mo13268a(mtVar, C3758ne.f14482b);
        return njVar;
    }

    /* renamed from: a */
    public static <T> T m19196a(Future<T> future, T t) {
        try {
            return future.get(((Long) ane.m16650f().mo12297a(aqm.f12739bz)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            future.cancel(true);
            C3643iy.m19175c("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            zzbv.zzeo().mo13050b(e, "Futures.resolveFuture");
            return t;
        } catch (Exception e2) {
            e = e2;
            future.cancel(true);
            C3643iy.m19173b("Error waiting for future.", e);
            zzbv.zzeo().mo13050b(e, "Futures.resolveFuture");
            return t;
        }
    }

    /* renamed from: a */
    public static <T> T m19197a(Future<T> future, T t, long j, TimeUnit timeUnit) {
        try {
            return future.get(j, timeUnit);
        } catch (InterruptedException e) {
            e = e;
            future.cancel(true);
            C3643iy.m19175c("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            zzbv.zzeo().mo13047a(e, "Futures.resolveFuture");
            return t;
        } catch (Exception e2) {
            e = e2;
            future.cancel(true);
            C3643iy.m19173b("Error waiting for future.", e);
            zzbv.zzeo().mo13047a(e, "Futures.resolveFuture");
            return t;
        }
    }

    /* renamed from: a */
    public static <V> void m19198a(C3751my<V> myVar, C3737mk<V> mkVar, Executor executor) {
        myVar.mo13268a(new C3741mo(mkVar, myVar), executor);
    }

    /* renamed from: a */
    private static <V> void m19199a(C3751my<? extends V> myVar, C3763nj<V> njVar) {
        m19200a((C3751my<A>) njVar, (Future<B>) myVar);
        myVar.mo13268a(new C3747mu(njVar, myVar), C3758ne.f14482b);
    }

    /* renamed from: a */
    private static <A, B> void m19200a(C3751my<A> myVar, Future<B> future) {
        myVar.mo13268a(new C3748mv(myVar, future), C3758ne.f14482b);
    }

    /* renamed from: a */
    static final /* synthetic */ void m19201a(C3763nj njVar, C3735mi miVar, C3751my myVar) {
        if (!njVar.isCancelled()) {
            try {
                m19199a(miVar.mo10012a(myVar.get()), njVar);
            } catch (CancellationException unused) {
                njVar.cancel(true);
            } catch (ExecutionException e) {
                njVar.mo13295a(e.getCause());
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                njVar.mo13295a(e2);
            } catch (Exception e3) {
                njVar.mo13295a(e3);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ void m19202a(com.google.android.gms.internal.ads.C3763nj r1, com.google.android.gms.internal.ads.C3751my r2, java.lang.Class r3, com.google.android.gms.internal.ads.C3735mi r4, java.util.concurrent.Executor r5) {
        /*
            java.lang.Object r2 = r2.get()     // Catch:{ ExecutionException -> 0x0013, InterruptedException -> 0x000a, Exception -> 0x0008 }
            r1.mo13296b(r2)     // Catch:{ ExecutionException -> 0x0013, InterruptedException -> 0x000a, Exception -> 0x0008 }
            return
        L_0x0008:
            r2 = move-exception
            goto L_0x0018
        L_0x000a:
            r2 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x0018
        L_0x0013:
            r2 = move-exception
            java.lang.Throwable r2 = r2.getCause()
        L_0x0018:
            boolean r3 = r3.isInstance(r2)
            if (r3 == 0) goto L_0x002a
            com.google.android.gms.internal.ads.mx r2 = m19191a((T) r2)
            com.google.android.gms.internal.ads.my r2 = m19193a(r2, r4, r5)
            m19199a(r2, r1)
            return
        L_0x002a:
            r1.mo13295a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3740mn.m19202a(com.google.android.gms.internal.ads.nj, com.google.android.gms.internal.ads.my, java.lang.Class, com.google.android.gms.internal.ads.mi, java.util.concurrent.Executor):void");
    }
}
