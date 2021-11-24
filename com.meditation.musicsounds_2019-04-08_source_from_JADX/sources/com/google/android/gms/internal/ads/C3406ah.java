package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.C3266s;
import java.util.concurrent.atomic.AtomicBoolean;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.ah */
public abstract class C3406ah implements C3673ka<Void>, C3868rg {

    /* renamed from: a */
    protected final Context f12014a;

    /* renamed from: b */
    protected final C3832py f12015b;

    /* renamed from: c */
    protected zzaej f12016c;

    /* renamed from: d */
    private final C3413an f12017d;

    /* renamed from: e */
    private final C3623ie f12018e;

    /* renamed from: f */
    private Runnable f12019f;

    /* renamed from: g */
    private final Object f12020g = new Object();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public AtomicBoolean f12021h = new AtomicBoolean(true);

    protected C3406ah(Context context, C3623ie ieVar, C3832py pyVar, C3413an anVar) {
        this.f12014a = context;
        this.f12018e = ieVar;
        this.f12016c = this.f12018e.f14161b;
        this.f12015b = pyVar;
        this.f12017d = anVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11910a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11911a(int i) {
        int i2 = i;
        if (i2 != -2) {
            this.f12016c = new zzaej(i2, this.f12016c.f15316j);
        }
        this.f12015b.mo13513n();
        C3413an anVar = this.f12017d;
        zzaef zzaef = this.f12018e.f14160a;
        C3622id idVar = r1;
        C3413an anVar2 = anVar;
        C3622id idVar2 = new C3622id(zzaef.f15259c, this.f12015b, this.f12016c.f15309c, i, this.f12016c.f15311e, this.f12016c.f15315i, this.f12016c.f15317k, this.f12016c.f15316j, zzaef.f15265i, this.f12016c.f15313g, null, null, null, null, null, this.f12016c.f15314h, this.f12018e.f14163d, this.f12016c.f15312f, this.f12018e.f14165f, this.f12016c.f15319m, this.f12016c.f15320n, this.f12018e.f14167h, null, this.f12016c.f15283A, this.f12016c.f15284B, this.f12016c.f15285C, this.f12016c.f15286D, this.f12016c.f15287E, null, this.f12016c.f15290H, this.f12016c.f15294L, this.f12018e.f14168i, this.f12018e.f14161b.f15297O, this.f12018e.f14169j, this.f12018e.f14161b.f15299Q, this.f12016c.f15300R, this.f12018e.f14161b.f15301S, this.f12018e.f14161b.f15302T);
        anVar2.zzb(idVar);
    }

    /* renamed from: a */
    public final void mo10054a(boolean z) {
        C3643iy.m19172b("WebView finished loading.");
        int i = 0;
        if (this.f12021h.getAndSet(false)) {
            if (z) {
                i = -2;
            }
            mo11911a(i);
            C3653jh.f14275a.removeCallbacks(this.f12019f);
        }
    }

    /* renamed from: b */
    public void mo11912b() {
        if (this.f12021h.getAndSet(false)) {
            this.f12015b.stopLoading();
            zzbv.zzem();
            C3659jn.m18932a(this.f12015b);
            mo11911a(-1);
            C3653jh.f14275a.removeCallbacks(this.f12019f);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo11913c() {
        C3266s.m14922b("Webview render task needs to be called on UI thread.");
        this.f12019f = new C3407ai(this);
        C3653jh.f14275a.postDelayed(this.f12019f, ((Long) ane.m16650f().mo12297a(aqm.f12689bB)).longValue());
        mo11910a();
        return null;
    }
}
