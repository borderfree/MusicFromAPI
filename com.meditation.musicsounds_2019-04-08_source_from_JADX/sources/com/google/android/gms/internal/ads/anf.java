package com.google.android.gms.internal.ads;

import java.util.Random;

@C3464ci
public final class anf extends aol {

    /* renamed from: a */
    private final Random f12500a = new Random();

    /* renamed from: b */
    private long f12501b;

    /* renamed from: c */
    private Object f12502c = new Object();

    public anf() {
        mo12120a();
    }

    /* renamed from: a */
    public final void mo12120a() {
        synchronized (this.f12502c) {
            int i = 3;
            long j = 0;
            while (true) {
                i--;
                if (i <= 0) {
                    break;
                }
                try {
                    j = ((long) this.f12500a.nextInt()) + 2147483648L;
                    if (j == this.f12501b || j == 0) {
                    }
                } finally {
                }
            }
            this.f12501b = j;
        }
    }

    /* renamed from: b */
    public final long mo12121b() {
        return this.f12501b;
    }
}
