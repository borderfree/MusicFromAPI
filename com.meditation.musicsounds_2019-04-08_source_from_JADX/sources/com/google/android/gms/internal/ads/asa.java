package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class asa extends asg {

    /* renamed from: c */
    private bbe f13050c;

    /* renamed from: d */
    private bbi f13051d;

    /* renamed from: e */
    private bbl f13052e;

    /* renamed from: f */
    private final asd f13053f;

    /* renamed from: g */
    private asb f13054g;

    /* renamed from: h */
    private boolean f13055h;

    /* renamed from: i */
    private Object f13056i;

    private asa(Context context, asd asd, afm afm, ase ase) {
        super(context, asd, null, afm, null, ase, null, null);
        this.f13055h = false;
        this.f13056i = new Object();
        this.f13053f = asd;
    }

    public asa(Context context, asd asd, afm afm, bbe bbe, ase ase) {
        this(context, asd, afm, ase);
        this.f13050c = bbe;
    }

    public asa(Context context, asd asd, afm afm, bbi bbi, ase ase) {
        this(context, asd, afm, ase);
        this.f13051d = bbi;
    }

    public asa(Context context, asd asd, afm afm, bbl bbl, ase ase) {
        this(context, asd, afm, ase);
        this.f13052e = bbl;
    }

    /* renamed from: b */
    private static HashMap<String, View> m17109b(Map<String, WeakReference<View>> map) {
        HashMap<String, View> hashMap = new HashMap<>();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Entry entry : map.entrySet()) {
                View view = (View) ((WeakReference) entry.getValue()).get();
                if (view != null) {
                    hashMap.put((String) entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final View mo12431a(OnClickListener onClickListener, boolean z) {
        C3323b bVar;
        synchronized (this.f13056i) {
            if (this.f13054g != null) {
                View a = this.f13054g.mo12431a(onClickListener, z);
                return a;
            }
            try {
                if (this.f13052e != null) {
                    bVar = this.f13052e.mo12768l();
                } else if (this.f13050c != null) {
                    bVar = this.f13050c.mo12730n();
                } else {
                    if (this.f13051d != null) {
                        bVar = this.f13051d.mo12749k();
                    }
                    bVar = null;
                }
            } catch (RemoteException e) {
                C3643iy.m19175c("Failed to call getAdChoicesContent", e);
            }
            if (bVar == null) {
                return null;
            }
            View view = (View) C3327d.m15137a(bVar);
            return view;
        }
    }

    /* renamed from: a */
    public final void mo12432a(View view) {
        synchronized (this.f13056i) {
            if (this.f13054g != null) {
                this.f13054g.mo12432a(view);
            }
        }
    }

    /* renamed from: a */
    public final void mo12433a(View view, Map<String, WeakReference<View>> map) {
        asd asd;
        C3266s.m14922b("recordImpression must be called on the main UI thread.");
        synchronized (this.f13056i) {
            this.f13063a = true;
            if (this.f13054g != null) {
                this.f13054g.mo12433a(view, map);
                this.f13053f.recordImpression();
            } else {
                try {
                    if (this.f13052e != null && !this.f13052e.mo12772p()) {
                        this.f13052e.mo12774r();
                        asd = this.f13053f;
                    } else if (this.f13050c != null && !this.f13050c.mo12726j()) {
                        this.f13050c.mo12725i();
                        asd = this.f13053f;
                    } else if (this.f13051d != null && !this.f13051d.mo12746h()) {
                        this.f13051d.mo12745g();
                        asd = this.f13053f;
                    }
                    asd.recordImpression();
                } catch (RemoteException e) {
                    C3643iy.m19175c("Failed to call recordImpression", e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo12434a(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) {
        asd asd;
        C3266s.m14922b("performClick must be called on the main UI thread.");
        synchronized (this.f13056i) {
            if (this.f13054g != null) {
                this.f13054g.mo12434a(view, map, bundle, view2);
                this.f13053f.onAdClicked();
            } else {
                try {
                    if (this.f13052e != null && !this.f13052e.mo12773q()) {
                        this.f13052e.mo12755a(C3327d.m15136a(view));
                        asd = this.f13053f;
                    } else if (this.f13050c != null && !this.f13050c.mo12727k()) {
                        this.f13050c.mo12714a(C3327d.m15136a(view));
                        asd = this.f13053f;
                    } else if (this.f13051d != null && !this.f13051d.mo12747i()) {
                        this.f13051d.mo12736a(C3327d.m15136a(view));
                        asd = this.f13053f;
                    }
                    asd.onAdClicked();
                } catch (RemoteException e) {
                    C3643iy.m19175c("Failed to call performClick", e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo12435a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, OnTouchListener onTouchListener, OnClickListener onClickListener) {
        synchronized (this.f13056i) {
            this.f13055h = true;
            HashMap b = m17109b(map);
            HashMap b2 = m17109b(map2);
            try {
                if (this.f13052e != null) {
                    this.f13052e.mo12756a(C3327d.m15136a(view), C3327d.m15136a(b), C3327d.m15136a(b2));
                } else if (this.f13050c != null) {
                    this.f13050c.mo12715a(C3327d.m15136a(view), C3327d.m15136a(b), C3327d.m15136a(b2));
                    this.f13050c.mo12717b(C3327d.m15136a(view));
                } else if (this.f13051d != null) {
                    this.f13051d.mo12737a(C3327d.m15136a(view), C3327d.m15136a(b), C3327d.m15136a(b2));
                    this.f13051d.mo12739b(C3327d.m15136a(view));
                }
            } catch (RemoteException e) {
                C3643iy.m19175c("Failed to call prepareAd", e);
            }
            this.f13055h = false;
        }
    }

    /* renamed from: a */
    public final void mo12436a(asb asb) {
        synchronized (this.f13056i) {
            this.f13054g = asb;
        }
    }

    /* renamed from: a */
    public final void mo12437a(aur aur) {
        synchronized (this.f13056i) {
            if (this.f13054g != null) {
                this.f13054g.mo12437a(aur);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo12438a() {
        synchronized (this.f13056i) {
            if (this.f13054g != null) {
                boolean a = this.f13054g.mo12438a();
                return a;
            }
            boolean zzcu = this.f13053f.zzcu();
            return zzcu;
        }
    }

    /* renamed from: b */
    public final void mo12439b(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.f13056i) {
            try {
                if (this.f13052e != null) {
                    this.f13052e.mo12758b(C3327d.m15136a(view));
                } else if (this.f13050c != null) {
                    this.f13050c.mo12719c(C3327d.m15136a(view));
                } else if (this.f13051d != null) {
                    this.f13051d.mo12741c(C3327d.m15136a(view));
                }
            } catch (RemoteException e) {
                C3643iy.m19175c("Failed to call untrackView", e);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo12440b() {
        synchronized (this.f13056i) {
            if (this.f13054g != null) {
                boolean b = this.f13054g.mo12440b();
                return b;
            }
            boolean zzcv = this.f13053f.zzcv();
            return zzcv;
        }
    }

    /* renamed from: c */
    public final void mo12441c() {
        synchronized (this.f13056i) {
            if (this.f13054g != null) {
                this.f13054g.mo12441c();
            }
        }
    }

    /* renamed from: d */
    public final void mo12442d() {
        C3266s.m14922b("recordDownloadedImpression must be called on main UI thread.");
        synchronized (this.f13056i) {
            this.f13064b = true;
            if (this.f13054g != null) {
                this.f13054g.mo12442d();
            }
        }
    }

    /* renamed from: e */
    public final boolean mo12443e() {
        boolean z;
        synchronized (this.f13056i) {
            z = this.f13055h;
        }
        return z;
    }

    /* renamed from: f */
    public final asb mo12444f() {
        asb asb;
        synchronized (this.f13056i) {
            asb = this.f13054g;
        }
        return asb;
    }

    /* renamed from: g */
    public final C3832py mo12445g() {
        return null;
    }

    /* renamed from: h */
    public final void mo12446h() {
    }

    /* renamed from: i */
    public final void mo12447i() {
    }

    /* renamed from: j */
    public final void mo12448j() {
        if (this.f13054g != null) {
            this.f13054g.mo12448j();
        }
    }

    /* renamed from: k */
    public final void mo12449k() {
        if (this.f13054g != null) {
            this.f13054g.mo12449k();
        }
    }
}
