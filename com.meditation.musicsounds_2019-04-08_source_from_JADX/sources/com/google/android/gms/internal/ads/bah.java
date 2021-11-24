package com.google.android.gms.internal.ads;

final class bah implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ baf f13470a;

    /* renamed from: b */
    private final /* synthetic */ bag f13471b;

    bah(bag bag, baf baf) {
        this.f13471b = bag;
        this.f13470a = baf;
    }

    public final void run() {
        synchronized (this.f13471b.f13458i) {
            if (this.f13471b.f13468s == -2) {
                this.f13471b.f13467r = this.f13471b.m17765d();
                if (this.f13471b.f13467r == null) {
                    this.f13471b.mo12674a(4);
                } else if (!this.f13471b.m17767e() || this.f13471b.m17762b(1)) {
                    this.f13470a.mo12662a((bak) this.f13471b);
                    this.f13471b.m17756a(this.f13470a);
                } else {
                    String f = this.f13471b.f13450a;
                    StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 56);
                    sb.append("Ignoring adapter ");
                    sb.append(f);
                    sb.append(" as delayed impression is not supported");
                    C3643iy.m19178e(sb.toString());
                    this.f13471b.mo12674a(2);
                }
            }
        }
    }
}
