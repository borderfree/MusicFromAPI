package com.google.android.exoplayer2.p102c;

/* renamed from: com.google.android.exoplayer2.c.d */
public final class C2491d {

    /* renamed from: a */
    private boolean f8062a;

    /* renamed from: a */
    public synchronized boolean mo8798a() {
        if (this.f8062a) {
            return false;
        }
        this.f8062a = true;
        notifyAll();
        return true;
    }

    /* renamed from: b */
    public synchronized boolean mo8799b() {
        boolean z;
        z = this.f8062a;
        this.f8062a = false;
        return z;
    }

    /* renamed from: c */
    public synchronized void mo8800c() {
        while (!this.f8062a) {
            wait();
        }
    }
}
