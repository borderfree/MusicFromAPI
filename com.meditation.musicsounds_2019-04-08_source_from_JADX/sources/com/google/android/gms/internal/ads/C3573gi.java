package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.dynamic.C3327d;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.gi */
public final class C3573gi implements RewardedVideoAd {

    /* renamed from: a */
    private final C3559fv f14009a;

    /* renamed from: b */
    private final Context f14010b;

    /* renamed from: c */
    private final Object f14011c = new Object();

    /* renamed from: d */
    private final C3571gg f14012d = new C3571gg(null);

    /* renamed from: e */
    private String f14013e;

    public C3573gi(Context context, C3559fv fvVar) {
        this.f14009a = fvVar;
        this.f14010b = context;
    }

    /* renamed from: a */
    private final void m18520a(String str, aoz aoz) {
        synchronized (this.f14011c) {
            if (this.f14009a != null) {
                try {
                    this.f14009a.mo12260a(new zzahk(amp.m16600a(this.f14010b, aoz), str));
                } catch (RemoteException e) {
                    C3731me.m19177d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void destroy() {
        destroy(null);
    }

    public final void destroy(Context context) {
        synchronized (this.f14011c) {
            this.f14012d.mo12931a((RewardedVideoAdListener) null);
            if (this.f14009a != null) {
                try {
                    this.f14009a.mo12265c(C3327d.m15136a(context));
                } catch (RemoteException e) {
                    C3731me.m19177d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final String getMediationAdapterClassName() {
        try {
            if (this.f14009a != null) {
                return this.f14009a.mo12270g();
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
        return null;
    }

    public final RewardedVideoAdListener getRewardedVideoAdListener() {
        RewardedVideoAdListener g;
        synchronized (this.f14011c) {
            g = this.f14012d.mo12932g();
        }
        return g;
    }

    public final String getUserId() {
        String str;
        synchronized (this.f14011c) {
            str = this.f14013e;
        }
        return str;
    }

    public final boolean isLoaded() {
        synchronized (this.f14011c) {
            if (this.f14009a == null) {
                return false;
            }
            try {
                boolean c = this.f14009a.mo12266c();
                return c;
            } catch (RemoteException e) {
                C3731me.m19177d("#007 Could not call remote method.", e);
                return false;
            }
        }
    }

    public final void loadAd(String str, AdRequest adRequest) {
        m18520a(str, adRequest.zzay());
    }

    public final void loadAd(String str, PublisherAdRequest publisherAdRequest) {
        m18520a(str, publisherAdRequest.zzay());
    }

    public final void pause() {
        pause(null);
    }

    public final void pause(Context context) {
        synchronized (this.f14011c) {
            if (this.f14009a != null) {
                try {
                    this.f14009a.mo12256a(C3327d.m15136a(context));
                } catch (RemoteException e) {
                    C3731me.m19177d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void resume() {
        resume(null);
    }

    public final void resume(Context context) {
        synchronized (this.f14011c) {
            if (this.f14009a != null) {
                try {
                    this.f14009a.mo12264b(C3327d.m15136a(context));
                } catch (RemoteException e) {
                    C3731me.m19177d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void setImmersiveMode(boolean z) {
        synchronized (this.f14011c) {
            if (this.f14009a != null) {
                try {
                    this.f14009a.mo12262a(z);
                } catch (RemoteException e) {
                    C3731me.m19177d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        synchronized (this.f14011c) {
            this.f14012d.mo12931a(rewardedVideoAdListener);
            if (this.f14009a != null) {
                try {
                    this.f14009a.mo12259a((C3566gb) this.f14012d);
                } catch (RemoteException e) {
                    C3731me.m19177d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void setUserId(String str) {
        synchronized (this.f14011c) {
            this.f14013e = str;
            if (this.f14009a != null) {
                try {
                    this.f14009a.mo12261a(str);
                } catch (RemoteException e) {
                    C3731me.m19177d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void show() {
        synchronized (this.f14011c) {
            if (this.f14009a != null) {
                try {
                    this.f14009a.mo12255a();
                } catch (RemoteException e) {
                    C3731me.m19177d("#007 Could not call remote method.", e);
                }
            }
        }
    }
}
