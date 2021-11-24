package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.C3044e;
import com.google.android.gms.common.api.C3044e.C3045a;
import com.google.android.gms.common.api.C3049h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C4796f;
import com.google.android.gms.tasks.C4797g;

/* renamed from: com.google.android.gms.common.internal.r */
public class C3263r {

    /* renamed from: a */
    private static final C3265b f11117a = new C3204ab();

    /* renamed from: com.google.android.gms.common.internal.r$a */
    public interface C3264a<R extends C3049h, T> {
        /* renamed from: a */
        T mo11162a(R r);
    }

    /* renamed from: com.google.android.gms.common.internal.r$b */
    public interface C3265b {
        /* renamed from: a */
        ApiException mo11161a(Status status);
    }

    /* renamed from: a */
    public static <R extends C3049h> C4796f<Void> m14908a(C3044e<R> eVar) {
        return m14909a(eVar, new C3206ad());
    }

    /* renamed from: a */
    public static <R extends C3049h, T> C4796f<T> m14909a(C3044e<R> eVar, C3264a<R, T> aVar) {
        C3265b bVar = f11117a;
        C4797g gVar = new C4797g();
        eVar.mo10868a((C3045a) new C3205ac(eVar, gVar, aVar, bVar));
        return gVar.mo15929a();
    }
}
