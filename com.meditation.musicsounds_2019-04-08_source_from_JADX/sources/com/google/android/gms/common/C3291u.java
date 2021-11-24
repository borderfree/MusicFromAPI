package com.google.android.gms.common;

import android.util.Log;
import com.google.android.gms.common.util.C3292a;
import com.google.android.gms.common.util.C3305j;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

@CheckReturnValue
/* renamed from: com.google.android.gms.common.u */
class C3291u {

    /* renamed from: b */
    private static final C3291u f11179b = new C3291u(true, null, null);

    /* renamed from: a */
    final boolean f11180a;

    /* renamed from: c */
    private final String f11181c;

    /* renamed from: d */
    private final Throwable f11182d;

    C3291u(boolean z, @Nullable String str, @Nullable Throwable th) {
        this.f11180a = z;
        this.f11181c = str;
        this.f11182d = th;
    }

    /* renamed from: a */
    static C3291u m15022a() {
        return f11179b;
    }

    /* renamed from: a */
    static C3291u m15023a(String str) {
        return new C3291u(false, str, null);
    }

    /* renamed from: a */
    static C3291u m15024a(String str, Throwable th) {
        return new C3291u(false, str, th);
    }

    /* renamed from: a */
    static C3291u m15025a(Callable<String> callable) {
        return new C3320w(callable);
    }

    /* renamed from: a */
    static String m15026a(String str, C3279n nVar, boolean z, boolean z2) {
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", new Object[]{z2 ? "debug cert rejected" : "not whitelisted", str, C3305j.m15061a(C3292a.m15029a("SHA-1").digest(nVar.mo11301c())), Boolean.valueOf(z), "12451009.false"});
    }

    /* access modifiers changed from: 0000 */
    @Nullable
    /* renamed from: b */
    public String mo11320b() {
        return this.f11181c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo11321c() {
        if (!this.f11180a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f11182d != null) {
                Log.d("GoogleCertificatesRslt", mo11320b(), this.f11182d);
                return;
            }
            Log.d("GoogleCertificatesRslt", mo11320b());
        }
    }
}
