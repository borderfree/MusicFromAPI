package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.kl */
public final class C3684kl extends C3613hv {

    /* renamed from: a */
    private final Context f14337a;

    private C3684kl(Context context, C3837qc qcVar) {
        super(qcVar);
        this.f14337a = context;
    }

    /* renamed from: a */
    public static ayd m19028a(Context context) {
        ayd ayd = new ayd(new C3697ky(new File(context.getCacheDir(), "admob_volley")), new C3684kl(context, new C3864rc()));
        ayd.mo12623a();
        return ayd;
    }

    /* renamed from: a */
    public final asc mo12214a(auc<?> auc) {
        if (auc.mo12506h() && auc.mo12499c() == 0) {
            if (Pattern.matches((String) ane.m16650f().mo12297a(aqm.f12750cJ), auc.mo12503e())) {
                ane.m16645a();
                if (C3719lt.m19123c(this.f14337a)) {
                    asc a = new avo(this.f14337a).mo12214a(auc);
                    if (a != null) {
                        String str = "Got gmscore asset response: ";
                        String valueOf = String.valueOf(auc.mo12503e());
                        C3643iy.m18780a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                        return a;
                    }
                    String str2 = "Failed to get gmscore asset response: ";
                    String valueOf2 = String.valueOf(auc.mo12503e());
                    C3643iy.m18780a(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
                }
            }
        }
        return super.mo12214a(auc);
    }
}
