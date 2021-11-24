package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: com.google.android.gms.auth.api.signin.b */
final /* synthetic */ class C2974b implements Comparator {

    /* renamed from: a */
    static final Comparator f10494a = new C2974b();

    private C2974b() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((Scope) obj).mo10786a().compareTo(((Scope) obj2).mo10786a());
    }
}
