package com.google.android.gms.internal.location;

import android.content.ContentProviderClient;
import android.content.Context;
import com.google.android.gms.common.api.internal.C3142h.C3143a;
import com.google.android.gms.location.C4520f;
import com.google.android.gms.location.C4521g;
import com.google.android.gms.location.C4537v;
import com.google.android.gms.location.C4540y;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.location.l */
public final class C4219l {

    /* renamed from: a */
    private final C4233z<C4217j> f15642a;

    /* renamed from: b */
    private final Context f15643b;

    /* renamed from: c */
    private ContentProviderClient f15644c = null;

    /* renamed from: d */
    private boolean f15645d = false;

    /* renamed from: e */
    private final Map<C3143a<C4521g>, C4224q> f15646e = new HashMap();

    /* renamed from: f */
    private final Map<C3143a<Object>, C4223p> f15647f = new HashMap();

    /* renamed from: g */
    private final Map<C3143a<C4520f>, C4220m> f15648g = new HashMap();

    public C4219l(Context context, C4233z<C4217j> zVar) {
        this.f15643b = context;
        this.f15642a = zVar;
    }

    /* renamed from: a */
    public final void mo14066a() {
        synchronized (this.f15646e) {
            for (C4224q qVar : this.f15646e.values()) {
                if (qVar != null) {
                    ((C4217j) this.f15642a.mo14049a()).mo14061a(zzbf.m20920a((C4540y) qVar, (C4213f) null));
                }
            }
            this.f15646e.clear();
        }
        synchronized (this.f15648g) {
            for (C4220m mVar : this.f15648g.values()) {
                if (mVar != null) {
                    ((C4217j) this.f15642a.mo14049a()).mo14061a(zzbf.m20919a((C4537v) mVar, (C4213f) null));
                }
            }
            this.f15648g.clear();
        }
        synchronized (this.f15647f) {
            for (C4223p pVar : this.f15647f.values()) {
                if (pVar != null) {
                    ((C4217j) this.f15642a.mo14049a()).mo14062a(new zzo(2, null, pVar.asBinder(), null));
                }
            }
            this.f15647f.clear();
        }
    }

    /* renamed from: a */
    public final void mo14067a(boolean z) {
        this.f15642a.mo14050b();
        ((C4217j) this.f15642a.mo14049a()).mo14065a(z);
        this.f15645d = z;
    }

    /* renamed from: b */
    public final void mo14068b() {
        if (this.f15645d) {
            mo14067a(false);
        }
    }
}
