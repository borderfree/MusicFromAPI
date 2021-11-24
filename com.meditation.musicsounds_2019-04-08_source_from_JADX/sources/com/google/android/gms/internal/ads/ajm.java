package com.google.android.gms.internal.ads;

final class ajm implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ajl f12205a;

    ajm(ajl ajl) {
        this.f12205a = ajl;
    }

    public final void run() {
        synchronized (this.f12205a.f12197c) {
            if (!this.f12205a.f12198d || !this.f12205a.f12199e) {
                C3643iy.m19172b("App is still foreground");
            } else {
                this.f12205a.f12198d = false;
                C3643iy.m19172b("App went background");
                for (ajn a : this.f12205a.f12200f) {
                    try {
                        a.mo12041a(false);
                    } catch (Exception e) {
                        C3731me.m19173b("", e);
                    }
                }
            }
        }
    }
}
