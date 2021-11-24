package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.internal.auth.C4150j;

/* renamed from: com.google.android.gms.auth.d */
final class C3004d implements C3005e<Void> {

    /* renamed from: a */
    private final /* synthetic */ String f10534a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f10535b;

    C3004d(String str, Bundle bundle) {
        this.f10534a = str;
        this.f10535b = bundle;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10750a(IBinder iBinder) {
        Bundle bundle = (Bundle) C3002b.m13960b(C4150j.m20781a(iBinder).mo13999a(this.f10534a, this.f10535b));
        String string = bundle.getString("Error");
        if (bundle.getBoolean("booleanResult")) {
            return null;
        }
        throw new GoogleAuthException(string);
    }
}
