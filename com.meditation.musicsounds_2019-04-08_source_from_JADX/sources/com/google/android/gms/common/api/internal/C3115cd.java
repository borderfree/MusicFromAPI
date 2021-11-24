package com.google.android.gms.common.api.internal;

import android.support.p009v4.p019g.C0488a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.C3037c;
import com.google.android.gms.tasks.C4796f;
import com.google.android.gms.tasks.C4797g;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.cd */
public final class C3115cd {

    /* renamed from: a */
    private final C0488a<C3112cb<?>, ConnectionResult> f10777a = new C0488a<>();

    /* renamed from: b */
    private final C0488a<C3112cb<?>, String> f10778b = new C0488a<>();

    /* renamed from: c */
    private final C4797g<Map<C3112cb<?>, String>> f10779c = new C4797g<>();

    /* renamed from: d */
    private int f10780d;

    /* renamed from: e */
    private boolean f10781e = false;

    public C3115cd(Iterable<? extends C3037c<?>> iterable) {
        for (C3037c b : iterable) {
            this.f10777a.put(b.mo10831b(), null);
        }
        this.f10780d = this.f10777a.keySet().size();
    }

    /* renamed from: a */
    public final Set<C3112cb<?>> mo10992a() {
        return this.f10777a.keySet();
    }

    /* renamed from: a */
    public final void mo10993a(C3112cb<?> cbVar, ConnectionResult connectionResult, String str) {
        this.f10777a.put(cbVar, connectionResult);
        this.f10778b.put(cbVar, str);
        this.f10780d--;
        if (!connectionResult.mo10759b()) {
            this.f10781e = true;
        }
        if (this.f10780d == 0) {
            if (this.f10781e) {
                this.f10779c.mo15930a((Exception) new AvailabilityException(this.f10777a));
                return;
            }
            this.f10779c.mo15931a(this.f10778b);
        }
    }

    /* renamed from: b */
    public final C4796f<Map<C3112cb<?>, String>> mo10994b() {
        return this.f10779c.mo15929a();
    }
}
