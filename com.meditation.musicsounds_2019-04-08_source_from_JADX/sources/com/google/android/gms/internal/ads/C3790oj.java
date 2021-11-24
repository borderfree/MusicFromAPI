package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.C3226c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
/* renamed from: com.google.android.gms.internal.ads.oj */
public final class C3790oj extends FrameLayout implements C3787og {

    /* renamed from: a */
    private final C3804ox f14539a;

    /* renamed from: b */
    private final FrameLayout f14540b;

    /* renamed from: c */
    private final aqz f14541c;

    /* renamed from: d */
    private final C3806oz f14542d;

    /* renamed from: e */
    private final long f14543e;

    /* renamed from: f */
    private C3788oh f14544f;

    /* renamed from: g */
    private boolean f14545g;

    /* renamed from: h */
    private boolean f14546h;

    /* renamed from: i */
    private boolean f14547i;

    /* renamed from: j */
    private boolean f14548j;

    /* renamed from: k */
    private long f14549k;

    /* renamed from: l */
    private long f14550l;

    /* renamed from: m */
    private String f14551m;

    /* renamed from: n */
    private Bitmap f14552n;

    /* renamed from: o */
    private ImageView f14553o;

    /* renamed from: p */
    private boolean f14554p;

    public C3790oj(Context context, C3804ox oxVar, int i, boolean z, aqz aqz, C3803ow owVar) {
        Context context2 = context;
        super(context);
        C3804ox oxVar2 = oxVar;
        this.f14539a = oxVar2;
        aqz aqz2 = aqz;
        this.f14541c = aqz2;
        this.f14540b = new FrameLayout(context);
        addView(this.f14540b, new LayoutParams(-1, -1));
        C3226c.m14750a(oxVar.mo13412e());
        this.f14544f = oxVar.mo13412e().zzwz.mo13363a(context, oxVar2, i, z, aqz2, owVar);
        if (this.f14544f != null) {
            this.f14540b.addView(this.f14544f, new LayoutParams(-1, -1, 17));
            if (((Boolean) ane.m16650f().mo12297a(aqm.f12913w)).booleanValue()) {
                mo13375m();
            }
        }
        this.f14553o = new ImageView(context);
        this.f14543e = ((Long) ane.m16650f().mo12297a(aqm.f12608A)).longValue();
        this.f14548j = ((Boolean) ane.m16650f().mo12297a(aqm.f12915y)).booleanValue();
        if (this.f14541c != null) {
            this.f14541c.mo12322a("spinner_used", this.f14548j ? "1" : "0");
        }
        this.f14542d = new C3806oz(this);
        if (this.f14544f != null) {
            this.f14544f.mo13314a((C3787og) this);
        }
        if (this.f14544f == null) {
            mo13355a("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    /* renamed from: a */
    public static void m19285a(C3804ox oxVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "no_video_view");
        oxVar.mo12588a("onVideoEvent", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public static void m19286a(C3804ox oxVar, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("error", str);
        oxVar.mo12588a("onVideoEvent", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public static void m19287a(C3804ox oxVar, Map<String, List<Map<String, Object>>> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("mimeTypes", map);
        oxVar.mo12588a("onVideoEvent", (Map<String, ?>) hashMap);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m19288a(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.f14539a.mo12588a("onVideoEvent", (Map<String, ?>) hashMap);
    }

    /* renamed from: p */
    private final boolean m19289p() {
        return this.f14553o.getParent() != null;
    }

    /* renamed from: q */
    private final void m19290q() {
        if (this.f14539a.mo13411d() != null && this.f14546h && !this.f14547i) {
            this.f14539a.mo13411d().getWindow().clearFlags(128);
            this.f14546h = false;
        }
    }

    /* renamed from: a */
    public final void mo13353a() {
        this.f14542d.mo13428b();
        C3653jh.f14275a.post(new C3792ol(this));
    }

    /* renamed from: a */
    public final void mo13364a(float f, float f2) {
        if (this.f14544f != null) {
            this.f14544f.mo13312a(f, f2);
        }
    }

    /* renamed from: a */
    public final void mo13365a(int i) {
        if (this.f14544f != null) {
            this.f14544f.mo13313a(i);
        }
    }

    /* renamed from: a */
    public final void mo13354a(int i, int i2) {
        if (this.f14548j) {
            int max = Math.max(i / ((Integer) ane.m16650f().mo12297a(aqm.f12916z)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) ane.m16650f().mo12297a(aqm.f12916z)).intValue(), 1);
            if (this.f14552n == null || this.f14552n.getWidth() != max || this.f14552n.getHeight() != max2) {
                this.f14552n = Bitmap.createBitmap(max, max2, Config.ARGB_8888);
                this.f14554p = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo13366a(int i, int i2, int i3, int i4) {
        if (i3 != 0 && i4 != 0) {
            LayoutParams layoutParams = new LayoutParams(i3, i4);
            layoutParams.setMargins(i, i2, 0, 0);
            this.f14540b.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    @TargetApi(14)
    /* renamed from: a */
    public final void mo13367a(MotionEvent motionEvent) {
        if (this.f14544f != null) {
            this.f14544f.dispatchTouchEvent(motionEvent);
        }
    }

    /* renamed from: a */
    public final void mo13368a(String str) {
        this.f14551m = str;
    }

    /* renamed from: a */
    public final void mo13355a(String str, String str2) {
        m19288a("error", "what", str, "extra", str2);
    }

    /* renamed from: b */
    public final void mo13356b() {
        if (this.f14544f != null && this.f14550l == 0) {
            m19288a("canplaythrough", "duration", String.valueOf(((float) this.f14544f.getDuration()) / 1000.0f), "videoWidth", String.valueOf(this.f14544f.getVideoWidth()), "videoHeight", String.valueOf(this.f14544f.getVideoHeight()));
        }
    }

    /* renamed from: c */
    public final void mo13357c() {
        if (this.f14539a.mo13411d() != null && !this.f14546h) {
            this.f14547i = (this.f14539a.mo13411d().getWindow().getAttributes().flags & 128) != 0;
            if (!this.f14547i) {
                this.f14539a.mo13411d().getWindow().addFlags(128);
                this.f14546h = true;
            }
        }
        this.f14545g = true;
    }

    /* renamed from: d */
    public final void mo13358d() {
        m19288a("pause", new String[0]);
        m19290q();
        this.f14545g = false;
    }

    /* renamed from: e */
    public final void mo13359e() {
        m19288a("ended", new String[0]);
        m19290q();
    }

    /* renamed from: f */
    public final void mo13360f() {
        if (this.f14554p && this.f14552n != null && !m19289p()) {
            this.f14553o.setImageBitmap(this.f14552n);
            this.f14553o.invalidate();
            this.f14540b.addView(this.f14553o, new LayoutParams(-1, -1));
            this.f14540b.bringChildToFront(this.f14553o);
        }
        this.f14542d.mo13427a();
        this.f14550l = this.f14549k;
        C3653jh.f14275a.post(new C3793om(this));
    }

    public final void finalize() {
        try {
            this.f14542d.mo13427a();
            if (this.f14544f != null) {
                C3788oh ohVar = this.f14544f;
                Executor executor = C3758ne.f14481a;
                ohVar.getClass();
                executor.execute(C3791ok.m19313a(ohVar));
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public final void mo13361g() {
        if (this.f14545g && m19289p()) {
            this.f14540b.removeView(this.f14553o);
        }
        if (this.f14552n != null) {
            long b = zzbv.zzer().mo11327b();
            if (this.f14544f.getBitmap(this.f14552n) != null) {
                this.f14554p = true;
            }
            long b2 = zzbv.zzer().mo11327b() - b;
            if (C3643iy.m18781a()) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Spinner frame grab took ");
                sb.append(b2);
                sb.append("ms");
                C3643iy.m18780a(sb.toString());
            }
            if (b2 > this.f14543e) {
                C3643iy.m19178e("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.f14548j = false;
                this.f14552n = null;
                if (this.f14541c != null) {
                    this.f14541c.mo12322a("spinner_jank", Long.toString(b2));
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo13370h() {
        if (this.f14544f != null) {
            if (!TextUtils.isEmpty(this.f14551m)) {
                this.f14544f.setVideoPath(this.f14551m);
            } else {
                m19288a("no_src", new String[0]);
            }
        }
    }

    /* renamed from: i */
    public final void mo13371i() {
        if (this.f14544f != null) {
            this.f14544f.mo13318d();
        }
    }

    /* renamed from: j */
    public final void mo13372j() {
        if (this.f14544f != null) {
            this.f14544f.mo13317c();
        }
    }

    /* renamed from: k */
    public final void mo13373k() {
        if (this.f14544f != null) {
            C3788oh ohVar = this.f14544f;
            ohVar.f14538b.mo13433a(true);
            ohVar.mo13319e();
        }
    }

    /* renamed from: l */
    public final void mo13374l() {
        if (this.f14544f != null) {
            C3788oh ohVar = this.f14544f;
            ohVar.f14538b.mo13433a(false);
            ohVar.mo13319e();
        }
    }

    @TargetApi(14)
    /* renamed from: m */
    public final void mo13375m() {
        if (this.f14544f != null) {
            TextView textView = new TextView(this.f14544f.getContext());
            String str = "AdMob - ";
            String valueOf = String.valueOf(this.f14544f.mo13311a());
            textView.setText(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            textView.setTextColor(-65536);
            textView.setBackgroundColor(-256);
            this.f14540b.addView(textView, new LayoutParams(-2, -2, 17));
            this.f14540b.bringChildToFront(textView);
        }
    }

    /* renamed from: n */
    public final void mo13376n() {
        this.f14542d.mo13427a();
        if (this.f14544f != null) {
            this.f14544f.mo13315b();
        }
        m19290q();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final void mo13377o() {
        if (this.f14544f != null) {
            long currentPosition = (long) this.f14544f.getCurrentPosition();
            if (this.f14549k != currentPosition && currentPosition > 0) {
                m19288a("timeupdate", "time", String.valueOf(((float) currentPosition) / 1000.0f));
                this.f14549k = currentPosition;
            }
        }
    }

    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        if (i == 0) {
            this.f14542d.mo13428b();
            z = true;
        } else {
            this.f14542d.mo13427a();
            this.f14550l = this.f14549k;
            z = false;
        }
        C3653jh.f14275a.post(new C3794on(this, z));
    }

    public final void setVolume(float f) {
        if (this.f14544f != null) {
            C3788oh ohVar = this.f14544f;
            ohVar.f14538b.mo13432a(f);
            ohVar.mo13319e();
        }
    }
}
