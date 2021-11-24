package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.zza;

@C3464ci
public final class ape {

    /* renamed from: a */
    private final bar f12559a;

    /* renamed from: b */
    private final Context f12560b;

    /* renamed from: c */
    private final amp f12561c;

    /* renamed from: d */
    private AdListener f12562d;

    /* renamed from: e */
    private amh f12563e;

    /* renamed from: f */
    private anv f12564f;

    /* renamed from: g */
    private String f12565g;

    /* renamed from: h */
    private zza f12566h;

    /* renamed from: i */
    private AppEventListener f12567i;

    /* renamed from: j */
    private OnCustomRenderedAdLoadedListener f12568j;

    /* renamed from: k */
    private Correlator f12569k;

    /* renamed from: l */
    private RewardedVideoAdListener f12570l;

    /* renamed from: m */
    private boolean f12571m;

    /* renamed from: n */
    private boolean f12572n;

    public ape(Context context) {
        this(context, amp.f12442a, null);
    }

    public ape(Context context, PublisherInterstitialAd publisherInterstitialAd) {
        this(context, amp.f12442a, publisherInterstitialAd);
    }

    private ape(Context context, amp amp, PublisherInterstitialAd publisherInterstitialAd) {
        this.f12559a = new bar();
        this.f12560b = context;
        this.f12561c = amp;
    }

    /* renamed from: b */
    private final void m16809b(String str) {
        if (this.f12564f == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63);
            sb.append("The ad unit ID must be set on InterstitialAd before ");
            sb.append(str);
            sb.append(" is called.");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public final AdListener mo12215a() {
        return this.f12562d;
    }

    /* renamed from: a */
    public final void mo12216a(AdListener adListener) {
        try {
            this.f12562d = adListener;
            if (this.f12564f != null) {
                this.f12564f.zza((ank) adListener != null ? new amj(adListener) : null);
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo12217a(Correlator correlator) {
        this.f12569k = correlator;
        try {
            if (this.f12564f != null) {
                this.f12564f.zza((aok) this.f12569k == null ? null : this.f12569k.zzaz());
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo12218a(AppEventListener appEventListener) {
        try {
            this.f12567i = appEventListener;
            if (this.f12564f != null) {
                this.f12564f.zza((aoe) appEventListener != null ? new amr(appEventListener) : null);
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo12219a(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        try {
            this.f12568j = onCustomRenderedAdLoadedListener;
            if (this.f12564f != null) {
                this.f12564f.zza((arf) onCustomRenderedAdLoadedListener != null ? new ari(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo12220a(RewardedVideoAdListener rewardedVideoAdListener) {
        try {
            this.f12570l = rewardedVideoAdListener;
            if (this.f12564f != null) {
                this.f12564f.zza((C3566gb) rewardedVideoAdListener != null ? new C3571gg(rewardedVideoAdListener) : null);
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo12221a(zza zza) {
        try {
            this.f12566h = zza;
            if (this.f12564f != null) {
                this.f12564f.zza((aoa) zza != null ? new amm(zza) : null);
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo12222a(amh amh) {
        try {
            this.f12563e = amh;
            if (this.f12564f != null) {
                this.f12564f.zza((anh) amh != null ? new ami(amh) : null);
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo12223a(aoz aoz) {
        try {
            if (this.f12564f == null) {
                String str = "loadAd";
                if (this.f12565g == null) {
                    m16809b(str);
                }
                zzjn a = this.f12571m ? zzjn.m20759a() : new zzjn();
                amt b = ane.m16646b();
                Context context = this.f12560b;
                amw amw = new amw(b, context, a, this.f12565g, this.f12559a);
                this.f12564f = (anv) amt.m16608a(context, false, (C3412a<T>) amw);
                if (this.f12562d != null) {
                    this.f12564f.zza((ank) new amj(this.f12562d));
                }
                if (this.f12563e != null) {
                    this.f12564f.zza((anh) new ami(this.f12563e));
                }
                if (this.f12566h != null) {
                    this.f12564f.zza((aoa) new amm(this.f12566h));
                }
                if (this.f12567i != null) {
                    this.f12564f.zza((aoe) new amr(this.f12567i));
                }
                if (this.f12568j != null) {
                    this.f12564f.zza((arf) new ari(this.f12568j));
                }
                if (this.f12569k != null) {
                    this.f12564f.zza((aok) this.f12569k.zzaz());
                }
                if (this.f12570l != null) {
                    this.f12564f.zza((C3566gb) new C3571gg(this.f12570l));
                }
                this.f12564f.setImmersiveMode(this.f12572n);
            }
            if (this.f12564f.zzb(amp.m16600a(this.f12560b, aoz))) {
                this.f12559a.mo12682a(aoz.mo12164j());
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo12224a(String str) {
        if (this.f12565g == null) {
            this.f12565g = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
    }

    /* renamed from: a */
    public final void mo12225a(boolean z) {
        this.f12571m = true;
    }

    /* renamed from: b */
    public final String mo12226b() {
        return this.f12565g;
    }

    /* renamed from: b */
    public final void mo12227b(boolean z) {
        try {
            this.f12572n = z;
            if (this.f12564f != null) {
                this.f12564f.setImmersiveMode(z);
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: c */
    public final AppEventListener mo12228c() {
        return this.f12567i;
    }

    /* renamed from: d */
    public final OnCustomRenderedAdLoadedListener mo12229d() {
        return this.f12568j;
    }

    /* renamed from: e */
    public final boolean mo12230e() {
        try {
            if (this.f12564f == null) {
                return false;
            }
            return this.f12564f.isReady();
        } catch (RemoteException e) {
            C3731me.m19177d("#008 Must be called on the main UI thread.", e);
            return false;
        }
    }

    /* renamed from: f */
    public final boolean mo12231f() {
        try {
            if (this.f12564f == null) {
                return false;
            }
            return this.f12564f.isLoading();
        } catch (RemoteException e) {
            C3731me.m19177d("#008 Must be called on the main UI thread.", e);
            return false;
        }
    }

    /* renamed from: g */
    public final Bundle mo12232g() {
        try {
            if (this.f12564f != null) {
                return this.f12564f.zzba();
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#008 Must be called on the main UI thread.", e);
        }
        return new Bundle();
    }

    /* renamed from: h */
    public final String mo12233h() {
        try {
            if (this.f12564f != null) {
                return this.f12564f.zzck();
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#008 Must be called on the main UI thread.", e);
        }
        return null;
    }

    /* renamed from: i */
    public final void mo12234i() {
        try {
            m16809b("show");
            this.f12564f.showInterstitial();
        } catch (RemoteException e) {
            C3731me.m19177d("#008 Must be called on the main UI thread.", e);
        }
    }
}
