package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import javax.annotation.concurrent.GuardedBy;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.o */
public final class C3780o {

    /* renamed from: a */
    private static final Object f14526a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b */
    private static boolean f14527b = false;
    @GuardedBy("sLock")

    /* renamed from: c */
    private static boolean f14528c = false;

    /* renamed from: d */
    private C3904sp f14529d;

    /* renamed from: c */
    private final void m19255c(Context context) {
        synchronized (f14526a) {
            if (((Boolean) ane.m16650f().mo12297a(aqm.f12826dg)).booleanValue() && !f14528c) {
                try {
                    f14528c = true;
                    this.f14529d = C3905sq.m19849a(DynamiteModule.m15147a(context, DynamiteModule.f11241a, ModuleDescriptor.MODULE_ID).mo11352a("com.google.android.gms.ads.omid.DynamiteOmid"));
                } catch (LoadingException e) {
                    C3731me.m19177d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    /* renamed from: a */
    public final C3323b mo13342a(String str, WebView webView, String str2, String str3, String str4) {
        synchronized (f14526a) {
            if (((Boolean) ane.m16650f().mo12297a(aqm.f12826dg)).booleanValue()) {
                if (f14527b) {
                    try {
                        return this.f14529d.mo13669a(str, C3327d.m15136a(webView), str2, str3, str4);
                    } catch (RemoteException | NullPointerException e) {
                        C3731me.m19177d("#007 Could not call remote method.", e);
                        return null;
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void mo13343a(C3323b bVar) {
        synchronized (f14526a) {
            if (((Boolean) ane.m16650f().mo12297a(aqm.f12826dg)).booleanValue()) {
                if (f14527b) {
                    try {
                        this.f14529d.mo13673b(bVar);
                    } catch (RemoteException | NullPointerException e) {
                        C3731me.m19177d("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo13344a(C3323b bVar, View view) {
        synchronized (f14526a) {
            if (((Boolean) ane.m16650f().mo12297a(aqm.f12826dg)).booleanValue()) {
                if (f14527b) {
                    try {
                        this.f14529d.mo13671a(bVar, C3327d.m15136a(view));
                    } catch (RemoteException | NullPointerException e) {
                        C3731me.m19177d("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo13345a(Context context) {
        synchronized (f14526a) {
            if (!((Boolean) ane.m16650f().mo12297a(aqm.f12826dg)).booleanValue()) {
                return false;
            }
            if (f14527b) {
                return true;
            }
            try {
                m19255c(context);
                boolean a = this.f14529d.mo13672a(C3327d.m15136a(context));
                f14527b = a;
                return a;
            } catch (RemoteException | NullPointerException e) {
                C3731me.m19177d("#007 Could not call remote method.", e);
                return false;
            }
        }
    }

    /* renamed from: b */
    public final String mo13346b(Context context) {
        if (!((Boolean) ane.m16650f().mo12297a(aqm.f12826dg)).booleanValue()) {
            return null;
        }
        try {
            m19255c(context);
            String str = "a.";
            String valueOf = String.valueOf(this.f14529d.mo13670a());
            return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        } catch (RemoteException | NullPointerException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo13347b(C3323b bVar) {
        synchronized (f14526a) {
            if (((Boolean) ane.m16650f().mo12297a(aqm.f12826dg)).booleanValue()) {
                if (f14527b) {
                    try {
                        this.f14529d.mo13674c(bVar);
                    } catch (RemoteException | NullPointerException e) {
                        C3731me.m19177d("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }
}
