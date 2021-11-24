package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.C2185d;
import com.facebook.FacebookException;
import com.facebook.internal.C2201a;

/* renamed from: com.facebook.share.internal.f */
public abstract class C2337f {

    /* renamed from: a */
    private C2185d f7463a;

    public C2337f(C2185d dVar) {
        this.f7463a = dVar;
    }

    /* renamed from: a */
    public void mo8133a(C2201a aVar) {
        if (this.f7463a != null) {
            this.f7463a.mo7742a();
        }
    }

    /* renamed from: a */
    public abstract void mo8134a(C2201a aVar, Bundle bundle);

    /* renamed from: a */
    public void mo8135a(C2201a aVar, FacebookException facebookException) {
        if (this.f7463a != null) {
            this.f7463a.mo7743a(facebookException);
        }
    }
}
