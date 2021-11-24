package com.google.android.gms.internal.ads;

final class anc implements Runnable {

    /* renamed from: a */
    private final auc f12487a;

    /* renamed from: b */
    private final bae f12488b;

    /* renamed from: c */
    private final Runnable f12489c;

    public anc(alc alc, auc auc, bae bae, Runnable runnable) {
        this.f12487a = auc;
        this.f12488b = bae;
        this.f12489c = runnable;
    }

    public final void run() {
        this.f12487a.mo12505g();
        if (this.f12488b.f13445c == null) {
            this.f12487a.mo12495a(this.f12488b.f13443a);
        } else {
            this.f12487a.mo12494a(this.f12488b.f13445c);
        }
        if (this.f12488b.f13446d) {
            this.f12487a.mo12498b("intermediate-response");
        } else {
            this.f12487a.mo12500c("done");
        }
        if (this.f12489c != null) {
            this.f12489c.run();
        }
    }
}
