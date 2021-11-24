package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager.BadTokenException;
import com.google.ads.AdRequest;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.List;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.kb */
public final class C3674kb {

    /* renamed from: a */
    private final Context f14300a;

    /* renamed from: b */
    private String f14301b;

    /* renamed from: c */
    private String f14302c;

    /* renamed from: d */
    private String f14303d;

    /* renamed from: e */
    private String f14304e;

    /* renamed from: f */
    private final float f14305f;

    /* renamed from: g */
    private float f14306g;

    /* renamed from: h */
    private float f14307h;

    /* renamed from: i */
    private float f14308i;

    /* renamed from: j */
    private int f14309j;

    /* renamed from: k */
    private int f14310k;

    /* renamed from: l */
    private float f14311l;

    /* renamed from: m */
    private float f14312m;

    /* renamed from: n */
    private float f14313n;

    /* renamed from: o */
    private float f14314o;

    /* renamed from: p */
    private Handler f14315p;

    /* renamed from: q */
    private Runnable f14316q;

    public C3674kb(Context context) {
        this.f14309j = 0;
        this.f14316q = new C3675kc(this);
        this.f14300a = context;
        this.f14305f = context.getResources().getDisplayMetrics().density;
        this.f14310k = ViewConfiguration.get(this.f14300a).getScaledTouchSlop();
        zzbv.zzez().mo13214a();
        this.f14315p = zzbv.zzez().mo13215b();
    }

    public C3674kb(Context context, String str) {
        this(context);
        this.f14301b = str;
    }

    /* renamed from: a */
    private static int m19001a(List<String> list, String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    /* renamed from: a */
    private final void m19002a(int i, float f, float f2) {
        if (i == 0) {
            this.f14309j = 0;
            this.f14306g = f;
            this.f14307h = f2;
            this.f14308i = f2;
        } else if (this.f14309j != -1) {
            if (i == 2) {
                if (f2 > this.f14307h) {
                    this.f14307h = f2;
                } else if (f2 < this.f14308i) {
                    this.f14308i = f2;
                }
                if (this.f14307h - this.f14308i > this.f14305f * 30.0f) {
                    this.f14309j = -1;
                    return;
                }
                if (this.f14309j == 0 || this.f14309j == 2 ? f - this.f14306g >= this.f14305f * 50.0f : !(!(this.f14309j == 1 || this.f14309j == 3) || f - this.f14306g > this.f14305f * -50.0f)) {
                    this.f14306g = f;
                    this.f14309j++;
                }
                if (this.f14309j == 1 || this.f14309j == 3) {
                    if (f > this.f14306g) {
                        this.f14306g = f;
                    }
                } else if (this.f14309j == 2 && f < this.f14306g) {
                    this.f14306g = f;
                }
            } else if (i == 1 && this.f14309j == 4) {
                mo13175a();
            }
        }
    }

    /* renamed from: a */
    private final boolean m19003a(float f, float f2, float f3, float f4) {
        return Math.abs(this.f14311l - f) < ((float) this.f14310k) && Math.abs(this.f14312m - f2) < ((float) this.f14310k) && Math.abs(this.f14313n - f3) < ((float) this.f14310k) && Math.abs(this.f14314o - f4) < ((float) this.f14310k);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006c, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x0071;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m19004e() {
        /*
            r5 = this;
            android.content.Context r0 = r5.f14300a
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 != 0) goto L_0x000c
            java.lang.String r0 = "Can not create dialog without Activity Context"
            com.google.android.gms.internal.ads.C3643iy.m19176d(r0)
            return
        L_0x000c:
            java.lang.String r0 = r5.f14301b
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x006f
            java.lang.String r1 = "\\+"
            java.lang.String r2 = "%20"
            java.lang.String r0 = r0.replaceAll(r1, r2)
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            android.net.Uri$Builder r0 = r1.encodedQuery(r0)
            android.net.Uri r0 = r0.build()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.google.android.gms.ads.internal.zzbv.zzek()
            java.util.Map r0 = com.google.android.gms.internal.ads.C3653jh.m18870a(r0)
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x003d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0060
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r1.append(r3)
            java.lang.String r4 = " = "
            r1.append(r4)
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r1.append(r3)
            java.lang.String r3 = "\n\n"
            r1.append(r3)
            goto L_0x003d
        L_0x0060:
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = r0.trim()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            java.lang.String r0 = "No debug information"
        L_0x0071:
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            android.content.Context r2 = r5.f14300a
            r1.<init>(r2)
            r1.setMessage(r0)
            java.lang.String r2 = "Ad Information"
            r1.setTitle(r2)
            java.lang.String r2 = "Share"
            com.google.android.gms.internal.ads.ke r3 = new com.google.android.gms.internal.ads.ke
            r3.<init>(r5, r0)
            r1.setPositiveButton(r2, r3)
            java.lang.String r0 = "Close"
            android.content.DialogInterface$OnClickListener r2 = com.google.android.gms.internal.ads.C3678kf.f14324a
            r1.setNegativeButton(r0, r2)
            android.app.AlertDialog r0 = r1.create()
            r0.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3674kb.m19004e():void");
    }

    /* renamed from: a */
    public final void mo13175a() {
        try {
            if (!((Boolean) ane.m16650f().mo12297a(aqm.f12756cP)).booleanValue()) {
                if (!((Boolean) ane.m16650f().mo12297a(aqm.f12755cO)).booleanValue()) {
                    m19004e();
                    return;
                }
            }
            if (!(this.f14300a instanceof Activity)) {
                C3643iy.m19176d("Can not create dialog without Activity Context");
                return;
            }
            String str = !TextUtils.isEmpty(zzbv.zzeu().mo13192a()) ? "Creative Preview (Enabled)" : "Creative Preview";
            String str2 = zzbv.zzeu().mo13196b() ? "Troubleshooting (Enabled)" : "Troubleshooting";
            ArrayList arrayList = new ArrayList();
            int a = m19001a((List<String>) arrayList, "Ad Information", true);
            int a2 = m19001a((List<String>) arrayList, str, ((Boolean) ane.m16650f().mo12297a(aqm.f12755cO)).booleanValue());
            int a3 = m19001a((List<String>) arrayList, str2, ((Boolean) ane.m16650f().mo12297a(aqm.f12756cP)).booleanValue());
            Builder builder = new Builder(this.f14300a, zzbv.zzem().mo13163f());
            builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new C3676kd(this, a, a2, a3));
            builder.create().show();
        } catch (BadTokenException e) {
            String str3 = "";
            if (C3643iy.m18781a()) {
                Log.v(AdRequest.LOGTAG, str3, e);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13176a(int i, int i2, int i3, DialogInterface dialogInterface, int i4) {
        if (i4 == i) {
            m19004e();
            return;
        }
        if (i4 == i2) {
            if (((Boolean) ane.m16650f().mo12297a(aqm.f12755cO)).booleanValue()) {
                C3643iy.m19172b("Debug mode [Creative Preview] selected.");
                C3651jf.m18855a((Runnable) new C3679kg(this));
                return;
            }
        }
        if (i4 == i3) {
            if (((Boolean) ane.m16650f().mo12297a(aqm.f12756cP)).booleanValue()) {
                C3643iy.m19172b("Debug mode [Troubleshooting] selected.");
                C3651jf.m18855a((Runnable) new C3680kh(this));
            }
        }
    }

    /* renamed from: a */
    public final void mo13177a(MotionEvent motionEvent) {
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12757cQ)).booleanValue()) {
            int actionMasked = motionEvent.getActionMasked();
            int historySize = motionEvent.getHistorySize();
            int pointerCount = motionEvent.getPointerCount();
            if (actionMasked == 0) {
                this.f14309j = 0;
                this.f14311l = motionEvent.getX();
                this.f14312m = motionEvent.getY();
                return;
            }
            if (this.f14309j != -1) {
                boolean z = true;
                if (this.f14309j == 0 && actionMasked == 5) {
                    this.f14309j = 5;
                    this.f14313n = motionEvent.getX(1);
                    this.f14314o = motionEvent.getY(1);
                    this.f14315p.postDelayed(this.f14316q, ((Long) ane.m16650f().mo12297a(aqm.f12758cR)).longValue());
                    return;
                } else if (this.f14309j == 5) {
                    if (pointerCount == 2) {
                        if (actionMasked == 2) {
                            boolean z2 = false;
                            for (int i = 0; i < historySize; i++) {
                                if (!m19003a(motionEvent.getHistoricalX(0, i), motionEvent.getHistoricalY(0, i), motionEvent.getHistoricalX(1, i), motionEvent.getHistoricalY(1, i))) {
                                    z2 = true;
                                }
                            }
                            if (m19003a(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1))) {
                                z = z2;
                            }
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        this.f14309j = -1;
                        this.f14315p.removeCallbacks(this.f14316q);
                    }
                }
            }
            return;
        }
        int historySize2 = motionEvent.getHistorySize();
        for (int i2 = 0; i2 < historySize2; i2++) {
            m19002a(motionEvent.getActionMasked(), motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2));
        }
        m19002a(motionEvent.getActionMasked(), motionEvent.getX(), motionEvent.getY());
    }

    /* renamed from: a */
    public final void mo13178a(String str) {
        this.f14302c = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13179a(String str, DialogInterface dialogInterface, int i) {
        zzbv.zzek();
        C3653jh.m18873a(this.f14300a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13180b() {
        zzbv.zzeu().mo13194a(this.f14300a, this.f14302c, this.f14303d, this.f14304e);
    }

    /* renamed from: b */
    public final void mo13181b(String str) {
        this.f14303d = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo13182c() {
        zzbv.zzeu().mo13193a(this.f14300a, this.f14302c, this.f14303d);
    }

    /* renamed from: c */
    public final void mo13183c(String str) {
        this.f14301b = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo13184d() {
        this.f14309j = 4;
        mo13175a();
    }

    /* renamed from: d */
    public final void mo13185d(String str) {
        this.f14304e = str;
    }
}
