package com.google.android.gms.signin;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C3020a.C3021a;
import com.google.android.gms.common.api.C3020a.C3031f;
import com.google.android.gms.common.api.C3040d.C3042b;
import com.google.android.gms.common.api.C3040d.C3043c;
import com.google.android.gms.common.internal.C3240e;
import com.google.android.gms.signin.internal.C4782a;

/* renamed from: com.google.android.gms.signin.c */
final class C4779c extends C3021a<C4782a, C4776a> {
    C4779c() {
    }

    /* renamed from: a */
    public final /* synthetic */ C3031f mo10666a(Context context, Looper looper, C3240e eVar, Object obj, C3042b bVar, C3043c cVar) {
        C4776a aVar = (C4776a) obj;
        if (aVar == null) {
            aVar = C4776a.f17293a;
        }
        C4782a aVar2 = new C4782a(context, looper, true, eVar, aVar, bVar, cVar);
        return aVar2;
    }
}
