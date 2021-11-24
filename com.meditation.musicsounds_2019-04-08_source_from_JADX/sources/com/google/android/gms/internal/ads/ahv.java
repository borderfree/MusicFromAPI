package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class ahv implements aie {

    /* renamed from: a */
    private final Object f12058a = new Object();

    /* renamed from: b */
    private final WeakHashMap<C3622id, ahw> f12059b = new WeakHashMap<>();

    /* renamed from: c */
    private final ArrayList<ahw> f12060c = new ArrayList<>();

    /* renamed from: d */
    private final Context f12061d;

    /* renamed from: e */
    private final zzang f12062e;

    /* renamed from: f */
    private final ayj f12063f;

    public ahv(Context context, zzang zzang) {
        this.f12061d = context.getApplicationContext();
        this.f12062e = zzang;
        this.f12063f = new ayj(context.getApplicationContext(), zzang, (String) ane.m16650f().mo12297a(aqm.f12634a));
    }

    /* renamed from: e */
    private final boolean m16267e(C3622id idVar) {
        boolean z;
        synchronized (this.f12058a) {
            ahw ahw = (ahw) this.f12059b.get(idVar);
            z = ahw != null && ahw.mo11957c();
        }
        return z;
    }

    /* renamed from: a */
    public final void mo11938a(ahw ahw) {
        synchronized (this.f12058a) {
            if (!ahw.mo11957c()) {
                this.f12060c.remove(ahw);
                Iterator it = this.f12059b.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Entry) it.next()).getValue() == ahw) {
                        it.remove();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo11939a(C3622id idVar) {
        synchronized (this.f12058a) {
            ahw ahw = (ahw) this.f12059b.get(idVar);
            if (ahw != null) {
                ahw.mo11953b();
            }
        }
    }

    /* renamed from: a */
    public final void mo11940a(zzjn zzjn, C3622id idVar) {
        mo11941a(zzjn, idVar, idVar.f14135b.getView());
    }

    /* renamed from: a */
    public final void mo11941a(zzjn zzjn, C3622id idVar, View view) {
        mo11943a(zzjn, idVar, (ajh) new aic(view, idVar), (C3832py) null);
    }

    /* renamed from: a */
    public final void mo11942a(zzjn zzjn, C3622id idVar, View view, C3832py pyVar) {
        mo11943a(zzjn, idVar, (ajh) new aic(view, idVar), pyVar);
    }

    /* renamed from: a */
    public final void mo11943a(zzjn zzjn, C3622id idVar, ajh ajh, C3832py pyVar) {
        ahw ahw;
        synchronized (this.f12058a) {
            if (m16267e(idVar)) {
                ahw = (ahw) this.f12059b.get(idVar);
            } else {
                ahw ahw2 = new ahw(this.f12061d, zzjn, idVar, this.f12062e, ajh);
                ahw2.mo11949a((aie) this);
                this.f12059b.put(idVar, ahw2);
                this.f12060c.add(ahw2);
                ahw = ahw2;
            }
            ahw.mo11950a(pyVar != null ? new aif(ahw, pyVar) : new aij(ahw, this.f12063f, this.f12061d));
        }
    }

    /* renamed from: b */
    public final void mo11944b(C3622id idVar) {
        synchronized (this.f12058a) {
            ahw ahw = (ahw) this.f12059b.get(idVar);
            if (ahw != null) {
                ahw.mo11958d();
            }
        }
    }

    /* renamed from: c */
    public final void mo11945c(C3622id idVar) {
        synchronized (this.f12058a) {
            ahw ahw = (ahw) this.f12059b.get(idVar);
            if (ahw != null) {
                ahw.mo11959e();
            }
        }
    }

    /* renamed from: d */
    public final void mo11946d(C3622id idVar) {
        synchronized (this.f12058a) {
            ahw ahw = (ahw) this.f12059b.get(idVar);
            if (ahw != null) {
                ahw.mo11960f();
            }
        }
    }
}
