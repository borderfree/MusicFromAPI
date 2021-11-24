package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.l */
public final class C3699l extends C3726m implements zzv<C3832py> {

    /* renamed from: a */
    private final C3832py f14365a;

    /* renamed from: b */
    private final Context f14366b;

    /* renamed from: c */
    private final WindowManager f14367c;

    /* renamed from: d */
    private final apx f14368d;

    /* renamed from: e */
    private DisplayMetrics f14369e;

    /* renamed from: f */
    private float f14370f;

    /* renamed from: g */
    private int f14371g = -1;

    /* renamed from: h */
    private int f14372h = -1;

    /* renamed from: i */
    private int f14373i;

    /* renamed from: j */
    private int f14374j = -1;

    /* renamed from: k */
    private int f14375k = -1;

    /* renamed from: l */
    private int f14376l = -1;

    /* renamed from: m */
    private int f14377m = -1;

    public C3699l(C3832py pyVar, Context context, apx apx) {
        super(pyVar);
        this.f14365a = pyVar;
        this.f14366b = context;
        this.f14368d = apx;
        this.f14367c = (WindowManager) context.getSystemService("window");
    }

    /* renamed from: a */
    public final void mo13213a(int i, int i2) {
        int i3 = 0;
        if (this.f14366b instanceof Activity) {
            i3 = zzbv.zzek().mo13136c((Activity) this.f14366b)[0];
        }
        if (this.f14365a.mo13519r() == null || !this.f14365a.mo13519r().mo13607d()) {
            ane.m16645a();
            this.f14376l = C3719lt.m19117b(this.f14366b, this.f14365a.getWidth());
            ane.m16645a();
            this.f14377m = C3719lt.m19117b(this.f14366b, this.f14365a.getHeight());
        }
        mo13248b(i, i2 - i3, this.f14376l, this.f14377m);
        this.f14365a.mo13527t().mo13536a(i, i2);
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        int i;
        this.f14369e = new DisplayMetrics();
        Display defaultDisplay = this.f14367c.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f14369e);
        this.f14370f = this.f14369e.density;
        this.f14373i = defaultDisplay.getRotation();
        ane.m16645a();
        this.f14371g = C3719lt.m19118b(this.f14369e, this.f14369e.widthPixels);
        ane.m16645a();
        this.f14372h = C3719lt.m19118b(this.f14369e, this.f14369e.heightPixels);
        Activity d = this.f14365a.mo13411d();
        if (d == null || d.getWindow() == null) {
            this.f14374j = this.f14371g;
            i = this.f14372h;
        } else {
            zzbv.zzek();
            int[] a = C3653jh.m18887a(d);
            ane.m16645a();
            this.f14374j = C3719lt.m19118b(this.f14369e, a[0]);
            ane.m16645a();
            i = C3719lt.m19118b(this.f14369e, a[1]);
        }
        this.f14375k = i;
        if (this.f14365a.mo13519r().mo13607d()) {
            this.f14376l = this.f14371g;
            this.f14377m = this.f14372h;
        } else {
            this.f14365a.measure(0, 0);
        }
        mo13246a(this.f14371g, this.f14372h, this.f14374j, this.f14375k, this.f14370f, this.f14373i);
        this.f14365a.mo12589a("onDeviceFeaturesReceived", new C3618i(new C3672k().mo13171b(this.f14368d.mo12276a()).mo13170a(this.f14368d.mo12277b()).mo13172c(this.f14368d.mo12279d()).mo13173d(this.f14368d.mo12278c()).mo13174e(true)).mo13019a());
        int[] iArr = new int[2];
        this.f14365a.getLocationOnScreen(iArr);
        ane.m16645a();
        int b = C3719lt.m19117b(this.f14366b, iArr[0]);
        ane.m16645a();
        mo13213a(b, C3719lt.m19117b(this.f14366b, iArr[1]));
        if (C3643iy.m19171a(2)) {
            C3643iy.m19176d("Dispatching Ready Event.");
        }
        mo13249b(this.f14365a.mo13417i().f15360a);
    }
}
