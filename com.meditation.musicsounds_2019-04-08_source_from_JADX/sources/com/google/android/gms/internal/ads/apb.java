package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import java.util.concurrent.atomic.AtomicBoolean;

@C3464ci
public final class apb {

    /* renamed from: a */
    private final bar f12541a;

    /* renamed from: b */
    private final amp f12542b;

    /* renamed from: c */
    private final AtomicBoolean f12543c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final VideoController f12544d;

    /* renamed from: e */
    private final ang f12545e;

    /* renamed from: f */
    private amh f12546f;

    /* renamed from: g */
    private AdListener f12547g;

    /* renamed from: h */
    private AdSize[] f12548h;

    /* renamed from: i */
    private AppEventListener f12549i;

    /* renamed from: j */
    private Correlator f12550j;

    /* renamed from: k */
    private anv f12551k;

    /* renamed from: l */
    private OnCustomRenderedAdLoadedListener f12552l;

    /* renamed from: m */
    private VideoOptions f12553m;

    /* renamed from: n */
    private String f12554n;

    /* renamed from: o */
    private ViewGroup f12555o;

    /* renamed from: p */
    private int f12556p;

    /* renamed from: q */
    private boolean f12557q;

    public apb(ViewGroup viewGroup) {
        this(viewGroup, null, false, amp.f12442a, 0);
    }

    public apb(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, amp.f12442a, i);
    }

    public apb(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, amp.f12442a, 0);
    }

    public apb(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, false, amp.f12442a, i);
    }

    private apb(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, amp amp, int i) {
        this(viewGroup, attributeSet, z, amp, null, i);
    }

    private apb(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, amp amp, anv anv, int i) {
        this.f12541a = new bar();
        this.f12544d = new VideoController();
        this.f12545e = new apc(this);
        this.f12555o = viewGroup;
        this.f12542b = amp;
        this.f12551k = null;
        this.f12543c = new AtomicBoolean(false);
        this.f12556p = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                ams ams = new ams(context, attributeSet);
                this.f12548h = ams.mo12110a(z);
                this.f12554n = ams.mo12109a();
                if (viewGroup.isInEditMode()) {
                    C3719lt a = ane.m16645a();
                    AdSize adSize = this.f12548h[0];
                    int i2 = this.f12556p;
                    zzjn zzjn = new zzjn(context, adSize);
                    zzjn.f15508j = m16780a(i2);
                    a.mo13234a(viewGroup, zzjn, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                ane.m16645a().mo13235a(viewGroup, new zzjn(context, AdSize.BANNER), e.getMessage(), e.getMessage());
            }
        }
    }

    /* renamed from: a */
    private static zzjn m16779a(Context context, AdSize[] adSizeArr, int i) {
        zzjn zzjn = new zzjn(context, adSizeArr);
        zzjn.f15508j = m16780a(i);
        return zzjn;
    }

    /* renamed from: a */
    private static boolean m16780a(int i) {
        return i == 1;
    }

    /* renamed from: a */
    public final void mo12187a() {
        try {
            if (this.f12551k != null) {
                this.f12551k.destroy();
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo12188a(AdListener adListener) {
        this.f12547g = adListener;
        this.f12545e.mo12122a(adListener);
    }

    /* renamed from: a */
    public final void mo12189a(Correlator correlator) {
        this.f12550j = correlator;
        try {
            if (this.f12551k != null) {
                this.f12551k.zza((aok) this.f12550j == null ? null : this.f12550j.zzaz());
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo12190a(VideoOptions videoOptions) {
        this.f12553m = videoOptions;
        try {
            if (this.f12551k != null) {
                this.f12551k.zza(videoOptions == null ? null : new zzmu(videoOptions));
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo12191a(AppEventListener appEventListener) {
        try {
            this.f12549i = appEventListener;
            if (this.f12551k != null) {
                this.f12551k.zza((aoe) appEventListener != null ? new amr(appEventListener) : null);
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo12192a(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.f12552l = onCustomRenderedAdLoadedListener;
        try {
            if (this.f12551k != null) {
                this.f12551k.zza((arf) onCustomRenderedAdLoadedListener != null ? new ari(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo12193a(amh amh) {
        try {
            this.f12546f = amh;
            if (this.f12551k != null) {
                this.f12551k.zza((anh) amh != null ? new ami(amh) : null);
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo12194a(aoz aoz) {
        Object a;
        try {
            if (this.f12551k == null) {
                if ((this.f12548h == null || this.f12554n == null) && this.f12551k == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.f12555o.getContext();
                zzjn a2 = m16779a(context, this.f12548h, this.f12556p);
                if ("search_v2".equals(a2.f15499a)) {
                    a = amt.m16608a(context, false, (C3412a<T>) new amv<T>(ane.m16646b(), context, a2, this.f12554n));
                } else {
                    amu amu = new amu(ane.m16646b(), context, a2, this.f12554n, this.f12541a);
                    a = amt.m16608a(context, false, (C3412a<T>) amu);
                }
                this.f12551k = (anv) a;
                this.f12551k.zza((ank) new amj(this.f12545e));
                if (this.f12546f != null) {
                    this.f12551k.zza((anh) new ami(this.f12546f));
                }
                if (this.f12549i != null) {
                    this.f12551k.zza((aoe) new amr(this.f12549i));
                }
                if (this.f12552l != null) {
                    this.f12551k.zza((arf) new ari(this.f12552l));
                }
                if (this.f12550j != null) {
                    this.f12551k.zza((aok) this.f12550j.zzaz());
                }
                if (this.f12553m != null) {
                    this.f12551k.zza(new zzmu(this.f12553m));
                }
                this.f12551k.setManualImpressionsEnabled(this.f12557q);
                try {
                    C3323b zzbj = this.f12551k.zzbj();
                    if (zzbj != null) {
                        this.f12555o.addView((View) C3327d.m15137a(zzbj));
                    }
                } catch (RemoteException e) {
                    C3731me.m19177d("#007 Could not call remote method.", e);
                }
            }
            if (this.f12551k.zzb(amp.m16600a(this.f12555o.getContext(), aoz))) {
                this.f12541a.mo12682a(aoz.mo12164j());
            }
        } catch (RemoteException e2) {
            C3731me.m19177d("#007 Could not call remote method.", e2);
        }
    }

    /* renamed from: a */
    public final void mo12195a(String str) {
        if (this.f12554n == null) {
            this.f12554n = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    /* renamed from: a */
    public final void mo12196a(boolean z) {
        this.f12557q = z;
        try {
            if (this.f12551k != null) {
                this.f12551k.setManualImpressionsEnabled(this.f12557q);
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo12197a(AdSize... adSizeArr) {
        if (this.f12548h == null) {
            mo12200b(adSizeArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    /* renamed from: a */
    public final boolean mo12198a(anv anv) {
        if (anv == null) {
            return false;
        }
        try {
            C3323b zzbj = anv.zzbj();
            if (zzbj == null || ((View) C3327d.m15137a(zzbj)).getParent() != null) {
                return false;
            }
            this.f12555o.addView((View) C3327d.m15137a(zzbj));
            this.f12551k = anv;
            return true;
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
            return false;
        }
    }

    /* renamed from: b */
    public final AdListener mo12199b() {
        return this.f12547g;
    }

    /* renamed from: b */
    public final void mo12200b(AdSize... adSizeArr) {
        this.f12548h = adSizeArr;
        try {
            if (this.f12551k != null) {
                this.f12551k.zza(m16779a(this.f12555o.getContext(), this.f12548h, this.f12556p));
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
        this.f12555o.requestLayout();
    }

    /* renamed from: c */
    public final AdSize mo12201c() {
        try {
            if (this.f12551k != null) {
                zzjn zzbk = this.f12551k.zzbk();
                if (zzbk != null) {
                    return zzbk.mo13982b();
                }
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
        if (this.f12548h != null) {
            return this.f12548h[0];
        }
        return null;
    }

    /* renamed from: d */
    public final AdSize[] mo12202d() {
        return this.f12548h;
    }

    /* renamed from: e */
    public final String mo12203e() {
        if (this.f12554n == null && this.f12551k != null) {
            try {
                this.f12554n = this.f12551k.getAdUnitId();
            } catch (RemoteException e) {
                C3731me.m19177d("#007 Could not call remote method.", e);
            }
        }
        return this.f12554n;
    }

    /* renamed from: f */
    public final AppEventListener mo12204f() {
        return this.f12549i;
    }

    /* renamed from: g */
    public final OnCustomRenderedAdLoadedListener mo12205g() {
        return this.f12552l;
    }

    /* renamed from: h */
    public final void mo12206h() {
        try {
            if (this.f12551k != null) {
                this.f12551k.pause();
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: i */
    public final void mo12207i() {
        if (!this.f12543c.getAndSet(true)) {
            try {
                if (this.f12551k != null) {
                    this.f12551k.zzbm();
                }
            } catch (RemoteException e) {
                C3731me.m19177d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: j */
    public final void mo12208j() {
        try {
            if (this.f12551k != null) {
                this.f12551k.resume();
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: k */
    public final String mo12209k() {
        try {
            if (this.f12551k != null) {
                return this.f12551k.zzck();
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
        return null;
    }

    /* renamed from: l */
    public final boolean mo12210l() {
        try {
            if (this.f12551k != null) {
                return this.f12551k.isLoading();
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
        return false;
    }

    /* renamed from: m */
    public final VideoController mo12211m() {
        return this.f12544d;
    }

    /* renamed from: n */
    public final aos mo12212n() {
        if (this.f12551k == null) {
            return null;
        }
        try {
            return this.f12551k.getVideoController();
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
            return null;
        }
    }

    /* renamed from: o */
    public final VideoOptions mo12213o() {
        return this.f12553m;
    }
}
