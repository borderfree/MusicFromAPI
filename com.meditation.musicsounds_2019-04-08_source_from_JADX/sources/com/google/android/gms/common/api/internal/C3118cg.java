package com.google.android.gms.common.api.internal;

import android.content.DialogInterface.OnCancelListener;
import com.google.android.gms.common.C3177d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: com.google.android.gms.common.api.internal.cg */
final class C3118cg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3116ce f10788a;

    /* renamed from: b */
    private final C3117cf f10789b;

    C3118cg(C3116ce ceVar, C3117cf cfVar) {
        this.f10788a = ceVar;
        this.f10789b = cfVar;
    }

    public final void run() {
        if (this.f10788a.f10782b) {
            ConnectionResult b = this.f10789b.mo10999b();
            if (b.mo10758a()) {
                this.f10788a.f10638a.startActivityForResult(GoogleApiActivity.m13989a(this.f10788a.mo10884a(), b.mo10761d(), this.f10789b.mo10998a(), false), 1);
            } else if (this.f10788a.f10784d.mo11114a(b.mo10760c())) {
                this.f10788a.f10784d.mo11115a(this.f10788a.mo10884a(), this.f10788a.f10638a, b.mo10760c(), 2, this.f10788a);
            } else if (b.mo10760c() == 18) {
                this.f10788a.f10784d.mo11112a(this.f10788a.mo10884a().getApplicationContext(), (C3087bf) new C3119ch(this, C3177d.m14627a(this.f10788a.mo10884a(), (OnCancelListener) this.f10788a)));
            } else {
                this.f10788a.mo10990a(b, this.f10789b.mo10998a());
            }
        }
    }
}
