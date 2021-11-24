package com.google.android.exoplayer2.p102c;

import java.util.PriorityQueue;

/* renamed from: com.google.android.exoplayer2.c.n */
public final class C2503n {

    /* renamed from: a */
    private final Object f8101a;

    /* renamed from: b */
    private final PriorityQueue<Integer> f8102b;

    /* renamed from: c */
    private int f8103c;

    /* renamed from: a */
    public void mo8863a(int i) {
        synchronized (this.f8101a) {
            this.f8102b.add(Integer.valueOf(i));
            this.f8103c = Math.max(this.f8103c, i);
        }
    }

    /* renamed from: b */
    public void mo8864b(int i) {
        synchronized (this.f8101a) {
            this.f8102b.remove(Integer.valueOf(i));
            this.f8103c = this.f8102b.isEmpty() ? Integer.MIN_VALUE : ((Integer) this.f8102b.peek()).intValue();
            this.f8101a.notifyAll();
        }
    }
}
