package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.C3044e;
import com.google.android.gms.common.api.C3044e.C3045a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C3263r.C3264a;
import com.google.android.gms.common.internal.C3263r.C3265b;
import com.google.android.gms.tasks.C4797g;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.internal.ac */
final class C3205ac implements C3045a {

    /* renamed from: a */
    private final /* synthetic */ C3044e f10999a;

    /* renamed from: b */
    private final /* synthetic */ C4797g f11000b;

    /* renamed from: c */
    private final /* synthetic */ C3264a f11001c;

    /* renamed from: d */
    private final /* synthetic */ C3265b f11002d;

    C3205ac(C3044e eVar, C4797g gVar, C3264a aVar, C3265b bVar) {
        this.f10999a = eVar;
        this.f11000b = gVar;
        this.f11001c = aVar;
        this.f11002d = bVar;
    }

    /* renamed from: a */
    public final void mo10872a(Status status) {
        if (status.mo10795d()) {
            this.f11000b.mo15931a(this.f11001c.mo11162a(this.f10999a.mo10866a(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f11000b.mo15930a((Exception) this.f11002d.mo11161a(status));
    }
}
