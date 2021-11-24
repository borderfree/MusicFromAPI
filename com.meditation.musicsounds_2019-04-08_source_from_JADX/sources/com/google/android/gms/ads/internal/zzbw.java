package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.support.p009v4.p019g.C0510m;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3557ft;
import com.google.android.gms.internal.ads.C3566gb;
import com.google.android.gms.internal.ads.C3622id;
import com.google.android.gms.internal.ads.C3623ie;
import com.google.android.gms.internal.ads.C3624if;
import com.google.android.gms.internal.ads.C3635iq;
import com.google.android.gms.internal.ads.C3638it;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.C3673ka;
import com.google.android.gms.internal.ads.C3708li;
import com.google.android.gms.internal.ads.C3719lt;
import com.google.android.gms.internal.ads.afi;
import com.google.android.gms.internal.ads.afm;
import com.google.android.gms.internal.ads.ane;
import com.google.android.gms.internal.ads.anh;
import com.google.android.gms.internal.ads.ank;
import com.google.android.gms.internal.ads.aoa;
import com.google.android.gms.internal.ads.aoe;
import com.google.android.gms.internal.ads.aok;
import com.google.android.gms.internal.ads.aqm;
import com.google.android.gms.internal.ads.arf;
import com.google.android.gms.internal.ads.aty;
import com.google.android.gms.internal.ads.aub;
import com.google.android.gms.internal.ads.auf;
import com.google.android.gms.internal.ads.aui;
import com.google.android.gms.internal.ads.aul;
import com.google.android.gms.internal.ads.auo;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzlu;
import com.google.android.gms.internal.ads.zzmu;
import com.google.android.gms.internal.ads.zzpl;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class zzbw implements OnGlobalLayoutListener, OnScrollChangedListener {

    /* renamed from: A */
    private int f10249A;

    /* renamed from: B */
    private C3708li f10250B;

    /* renamed from: C */
    private boolean f10251C;

    /* renamed from: D */
    private boolean f10252D;

    /* renamed from: E */
    private boolean f10253E;

    /* renamed from: a */
    final String f10254a;

    /* renamed from: b */
    final afm f10255b;

    /* renamed from: c */
    zzbx f10256c;

    /* renamed from: d */
    anh f10257d;

    /* renamed from: e */
    ank f10258e;

    /* renamed from: f */
    aoe f10259f;

    /* renamed from: g */
    aoa f10260g;

    /* renamed from: h */
    aok f10261h;

    /* renamed from: i */
    aty f10262i;

    /* renamed from: j */
    aub f10263j;

    /* renamed from: k */
    auo f10264k;

    /* renamed from: l */
    C0510m<String, auf> f10265l;

    /* renamed from: m */
    C0510m<String, aui> f10266m;

    /* renamed from: n */
    zzpl f10267n;

    /* renamed from: o */
    zzmu f10268o;

    /* renamed from: p */
    zzlu f10269p;

    /* renamed from: q */
    aul f10270q;

    /* renamed from: r */
    List<Integer> f10271r;

    /* renamed from: s */
    arf f10272s;

    /* renamed from: t */
    C3566gb f10273t;

    /* renamed from: u */
    C3557ft f10274u;

    /* renamed from: v */
    List<String> f10275v;

    /* renamed from: w */
    View f10276w;

    /* renamed from: x */
    boolean f10277x;

    /* renamed from: y */
    private HashSet<C3624if> f10278y;

    /* renamed from: z */
    private int f10279z;
    public String zzacp;
    public final zzang zzacr;
    public C3638it zzact;
    public C3673ka zzacu;
    public zzjn zzacv;
    public C3622id zzacw;
    public C3623ie zzacx;
    public C3624if zzacy;
    public String zzadr;
    public C3635iq zzadt;
    public int zzadv;
    public final Context zzrt;

    public zzbw(Context context, zzjn zzjn, String str, zzang zzang) {
        this(context, zzjn, str, zzang, null);
    }

    private zzbw(Context context, zzjn zzjn, String str, zzang zzang, afm afm) {
        this.zzadt = null;
        this.f10276w = null;
        this.zzadv = 0;
        this.f10277x = false;
        this.f10278y = null;
        this.f10279z = -1;
        this.f10249A = -1;
        this.f10251C = true;
        this.f10252D = true;
        this.f10253E = false;
        aqm.m16920a(context);
        if (zzbv.zzeo().mo13049b() != null) {
            List b = aqm.m16922b();
            if (zzang.f15361b != 0) {
                b.add(Integer.toString(zzang.f15361b));
            }
            zzbv.zzeo().mo13049b().mo12308a(b);
        }
        this.f10254a = UUID.randomUUID().toString();
        if (zzjn.f15502d || zzjn.f15506h) {
            this.f10256c = null;
        } else {
            zzbx zzbx = new zzbx(context, str, zzang.f15360a, this, this);
            this.f10256c = zzbx;
            this.f10256c.setMinimumWidth(zzjn.f15504f);
            this.f10256c.setMinimumHeight(zzjn.f15501c);
            this.f10256c.setVisibility(4);
        }
        this.zzacv = zzjn;
        this.zzacp = str;
        this.zzrt = context;
        this.zzacr = zzang;
        this.f10255b = new afm(new zzag(this));
        this.f10250B = new C3708li(200);
        this.f10266m = new C0510m<>();
    }

    /* renamed from: a */
    private final void m13687a(boolean z) {
        if (this.f10256c != null && this.zzacw != null && this.zzacw.f14135b != null && this.zzacw.f14135b.mo13527t() != null && (!z || this.f10250B.mo13219a())) {
            if (this.zzacw.f14135b.mo13527t().mo13552b()) {
                int[] iArr = new int[2];
                this.f10256c.getLocationOnScreen(iArr);
                ane.m16645a();
                int b = C3719lt.m19117b(this.zzrt, iArr[0]);
                ane.m16645a();
                int b2 = C3719lt.m19117b(this.zzrt, iArr[1]);
                if (!(b == this.f10279z && b2 == this.f10249A)) {
                    this.f10279z = b;
                    this.f10249A = b2;
                    this.zzacw.f14135b.mo13527t().mo13537a(this.f10279z, this.f10249A, !z);
                }
            }
            if (this.f10256c != null) {
                View findViewById = this.f10256c.getRootView().findViewById(16908290);
                if (findViewById != null) {
                    Rect rect = new Rect();
                    Rect rect2 = new Rect();
                    this.f10256c.getGlobalVisibleRect(rect);
                    findViewById.getGlobalVisibleRect(rect2);
                    if (rect.top != rect2.top) {
                        this.f10251C = false;
                    }
                    if (rect.bottom != rect2.bottom) {
                        this.f10252D = false;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo10254a(View view) {
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12694bG)).booleanValue()) {
            afi a = this.f10255b.mo11851a();
            if (a != null) {
                a.zzb(view);
            }
        }
    }

    public final void onGlobalLayout() {
        m13687a(false);
    }

    public final void onScrollChanged() {
        m13687a(true);
        this.f10253E = true;
    }

    public final void zza(HashSet<C3624if> hashSet) {
        this.f10278y = hashSet;
    }

    public final HashSet<C3624if> zzfl() {
        return this.f10278y;
    }

    public final void zzfm() {
        if (this.zzacw != null && this.zzacw.f14135b != null) {
            this.zzacw.f14135b.destroy();
        }
    }

    public final void zzfn() {
        if (!(this.zzacw == null || this.zzacw.f14149p == null)) {
            try {
                this.zzacw.f14149p.mo12698c();
            } catch (RemoteException unused) {
                C3643iy.m19178e("Could not destroy mediation adapter.");
            }
        }
    }

    public final boolean zzfo() {
        return this.zzadv == 0;
    }

    public final boolean zzfp() {
        return this.zzadv == 1;
    }

    public final String zzfq() {
        return (!this.f10251C || !this.f10252D) ? this.f10251C ? this.f10253E ? "top-scrollable" : "top-locked" : this.f10252D ? this.f10253E ? "bottom-scrollable" : "bottom-locked" : "" : "";
    }

    public final void zzg(boolean z) {
        if (!(this.zzadv != 0 || this.zzacw == null || this.zzacw.f14135b == null)) {
            this.zzacw.f14135b.stopLoading();
        }
        if (this.zzact != null) {
            this.zzact.mo11912b();
        }
        if (this.zzacu != null) {
            this.zzacu.mo11912b();
        }
        if (z) {
            this.zzacw = null;
        }
    }
}
