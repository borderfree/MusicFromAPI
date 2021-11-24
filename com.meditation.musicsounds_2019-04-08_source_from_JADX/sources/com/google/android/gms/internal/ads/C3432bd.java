package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.bd */
final class C3432bd implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicInteger f13583a;

    /* renamed from: b */
    private final /* synthetic */ int f13584b;

    /* renamed from: c */
    private final /* synthetic */ C3763nj f13585c;

    /* renamed from: d */
    private final /* synthetic */ List f13586d;

    C3432bd(AtomicInteger atomicInteger, int i, C3763nj njVar, List list) {
        this.f13583a = atomicInteger;
        this.f13584b = i;
        this.f13585c = njVar;
        this.f13586d = list;
    }

    public final void run() {
        if (this.f13583a.incrementAndGet() >= this.f13584b) {
            try {
                this.f13585c.mo13296b(C3424aw.m17512b(this.f13586d));
            } catch (InterruptedException | ExecutionException e) {
                C3643iy.m19175c("Unable to convert list of futures to a future of list", e);
            }
        }
    }
}
