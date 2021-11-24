package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.yt */
final class C4104yt extends C4101yq {

    /* renamed from: a */
    private final C4102yr f15088a = new C4102yr();

    C4104yt() {
    }

    /* renamed from: a */
    public final void mo13827a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> a = this.f15088a.mo13828a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable th2 : a) {
                    printWriter.print("Suppressed: ");
                    th2.printStackTrace(printWriter);
                }
            }
        }
    }
}
