package com.seattleclouds.util;

import android.os.Handler;

/* renamed from: com.seattleclouds.util.ak */
public class C6590ak {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Runnable f23304a;

    /* renamed from: b */
    private Runnable f23305b;

    /* renamed from: c */
    private Handler f23306c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f23307d;

    public C6590ak(Runnable runnable) {
        this.f23304a = runnable;
    }

    /* renamed from: a */
    public void mo20589a() {
        if (this.f23307d) {
            this.f23307d = false;
            this.f23306c.removeCallbacks(this.f23305b);
        }
    }

    /* renamed from: a */
    public void mo20590a(long j) {
        if (this.f23306c == null) {
            this.f23306c = new Handler();
            this.f23305b = new Runnable() {
                public void run() {
                    C6590ak.this.f23307d = false;
                    if (C6590ak.this.f23304a != null) {
                        C6590ak.this.f23304a.run();
                    }
                }
            };
        } else if (this.f23307d) {
            mo20589a();
        }
        this.f23306c.postDelayed(this.f23305b, j);
        this.f23307d = true;
    }
}
