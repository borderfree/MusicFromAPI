package com.google.android.gms.common.api;

import com.google.android.gms.common.api.C3049h;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.api.e */
public abstract class C3044e<R extends C3049h> {

    /* renamed from: com.google.android.gms.common.api.e$a */
    public interface C3045a {
        /* renamed from: a */
        void mo10872a(Status status);
    }

    /* renamed from: a */
    public abstract R mo10866a(long j, TimeUnit timeUnit);

    /* renamed from: a */
    public abstract void mo10867a();

    /* renamed from: a */
    public void mo10868a(C3045a aVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public abstract void mo10869a(C3050i<? super R> iVar);

    /* renamed from: b */
    public abstract boolean mo10870b();

    /* renamed from: c */
    public Integer mo10871c() {
        throw new UnsupportedOperationException();
    }
}
