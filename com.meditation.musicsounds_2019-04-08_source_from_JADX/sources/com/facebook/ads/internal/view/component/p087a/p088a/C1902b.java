package com.facebook.ads.internal.view.component.p087a.p088a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.adapters.p059a.C1647d;
import com.facebook.ads.internal.adapters.p059a.C1648e;
import com.facebook.ads.internal.p070l.C1720f;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.view.C2125k;
import com.facebook.ads.internal.view.component.p087a.C1915b;
import com.facebook.ads.internal.view.component.p087a.C1917d;
import com.facebook.ads.internal.view.p086c.C1896d;
import com.facebook.ads.internal.view.p086c.C1897e;
import com.facebook.ads.internal.view.p089d.p090a.C1931a;
import com.facebook.ads.internal.view.p089d.p090a.C1939e;
import com.facebook.ads.internal.view.p093g.p094a.C2000a;
import com.facebook.ads.internal.view.p093g.p095b.C2017b;
import com.facebook.ads.internal.view.p093g.p095b.C2018c;
import com.facebook.ads.internal.view.p093g.p095b.C2023h;
import com.facebook.ads.internal.view.p093g.p095b.C2024i;
import com.facebook.ads.internal.view.p093g.p095b.C2025j;
import com.facebook.ads.internal.view.p093g.p095b.C2026k;
import com.facebook.ads.internal.view.p093g.p095b.C2027l;
import com.facebook.ads.internal.view.p093g.p095b.C2028m;
import com.facebook.ads.internal.view.p093g.p095b.C2036u;
import com.facebook.ads.internal.view.p093g.p095b.C2037v;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.component.a.a.b */
public abstract class C1902b extends C1915b {

    /* renamed from: c */
    private static final int f6272c = ((int) (C1808r.f5899b * 1.0f));

    /* renamed from: d */
    private static final int f6273d = ((int) (C1808r.f5899b * 4.0f));

    /* renamed from: e */
    private static final int f6274e = ((int) (C1808r.f5899b * 6.0f));

    /* renamed from: f */
    private C2125k f6275f;

    /* renamed from: g */
    private C1939e f6276g;

    /* renamed from: h */
    private RelativeLayout f6277h;

    /* renamed from: i */
    private final String f6278i;

    /* renamed from: j */
    private final Paint f6279j;

    /* renamed from: k */
    private boolean f6280k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C1931a f6281l;

    /* renamed from: m */
    private final Path f6282m = new Path();

    /* renamed from: n */
    private final RectF f6283n = new RectF();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f6284o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f6285p;

    /* renamed from: q */
    private C1908a f6286q;

    /* renamed from: r */
    private final C2036u f6287r = new C2036u() {
        /* renamed from: a */
        public void mo6765a(C2037v vVar) {
            C1902b.this.f6281l.mo7331c().mo7289a(C1902b.this.getVideoView().getVolume());
        }
    };

    /* renamed from: s */
    private final C2018c f6288s = new C2018c() {
        /* renamed from: a */
        public void mo6765a(C2017b bVar) {
            C1902b.this.f6281l.mo7332d().mo7285a(((Integer) C1902b.this.getTag(-1593835536)).intValue());
        }
    };

    /* renamed from: t */
    private final C2026k f6289t = new C2026k() {
        /* renamed from: a */
        public void mo6765a(C2025j jVar) {
            C1902b.this.f6281l.mo7333e().mo7286a(C1902b.this);
        }
    };

    /* renamed from: u */
    private final C2024i f6290u = new C2024i() {
        /* renamed from: a */
        public void mo6765a(C2023h hVar) {
            C1902b.this.f6281l.mo7333e().mo7287b(C1902b.this);
        }
    };

    /* renamed from: v */
    private final C2028m f6291v = new C2028m() {
        /* renamed from: a */
        public void mo6765a(C2027l lVar) {
            C1902b.this.f6285p = true;
            C1902b.this.m9231k();
        }
    };

    /* renamed from: com.facebook.ads.internal.view.component.a.a.b$a */
    public interface C1908a {
        /* renamed from: a */
        void mo7284a();
    }

    /* renamed from: com.facebook.ads.internal.view.component.a.a.b$b */
    private static class C1909b implements C1897e {

        /* renamed from: a */
        final WeakReference<C1902b> f6297a;

        private C1909b(C1902b bVar) {
            this.f6297a = new WeakReference<>(bVar);
        }

        /* renamed from: a */
        public void mo7245a(boolean z) {
            C1902b bVar = (C1902b) this.f6297a.get();
            if (bVar != null) {
                bVar.f6284o = z;
                bVar.m9231k();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.component.a.a.b$c */
    public interface C1910c {
        /* renamed from: a */
        void mo7285a(int i);
    }

    /* renamed from: com.facebook.ads.internal.view.component.a.a.b$d */
    public interface C1911d {
        /* renamed from: a */
        void mo7286a(View view);

        /* renamed from: b */
        void mo7287b(View view);
    }

    /* renamed from: com.facebook.ads.internal.view.component.a.a.b$e */
    public interface C1912e {
        /* renamed from: a */
        float mo7288a();

        /* renamed from: a */
        void mo7289a(float f);
    }

    C1902b(C1917d dVar, C1647d dVar2, boolean z, String str, C1931a aVar) {
        super(dVar, dVar2, z);
        this.f6281l = aVar;
        this.f6278i = str;
        setGravity(17);
        setPadding(f6272c, 0, f6272c, f6272c);
        C1808r.m8932a((View) this, 0);
        setUpView(getContext());
        this.f6279j = new Paint();
        this.f6279j.setColor(-16777216);
        this.f6279j.setStyle(Style.FILL);
        this.f6279j.setAlpha(16);
        this.f6279j.setAntiAlias(true);
        if (VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    /* renamed from: a */
    private void m9227a(View view) {
        view.setLayoutParams(new LayoutParams(-1, -2));
        C1808r.m8931a(view);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m9231k() {
        if (this.f6286q != null) {
            if ((mo7263d() && this.f6285p) || (!mo7263d() && this.f6284o)) {
                this.f6286q.mo7284a();
            }
        }
    }

    private void setUpView(Context context) {
        setUpImageView(context);
        setUpVideoView(context);
        setUpMediaContainer(context);
        this.f6277h.addView(this.f6275f);
        this.f6277h.addView(this.f6276g);
        mo7257a(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7257a(Context context);

    /* renamed from: a */
    public void mo7260a(C1648e eVar, Map<String, String> map) {
        getCtaButton().mo7252a(eVar, this.f6278i, map);
    }

    /* renamed from: a */
    public void mo7261a(String str, String str2) {
        getTitleDescContainer().mo7322a(str, str2, true, false);
    }

    /* renamed from: a */
    public void mo7262a(Map<String, String> map) {
        this.f6276g.mo7345c();
        if (mo7263d()) {
            this.f6276g.mo7342a(getAdEventManager(), this.f6278i, map);
        }
    }

    /* renamed from: a */
    public boolean mo7256a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo7259c() {
        return false;
    }

    /* renamed from: d */
    public boolean mo7263d() {
        return this.f6280k;
    }

    /* renamed from: e */
    public boolean mo7264e() {
        return mo7263d() && this.f6276g.mo7344b();
    }

    /* renamed from: f */
    public void mo7265f() {
        if (mo7263d()) {
            mo7269h();
            this.f6276g.mo7343a(C2000a.AUTO_STARTED);
        }
    }

    /* renamed from: g */
    public void mo7266g() {
        if (mo7263d()) {
            this.f6276g.mo7340a();
        }
    }

    /* access modifiers changed from: protected */
    public final RelativeLayout getMediaContainer() {
        return this.f6277h;
    }

    public final C1939e getVideoView() {
        return this.f6276g;
    }

    /* renamed from: h */
    public void mo7269h() {
        float a = this.f6281l.mo7331c().mo7288a();
        if (mo7263d() && a != this.f6276g.getVolume()) {
            this.f6276g.setVolume(a);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f6282m.reset();
        this.f6283n.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        this.f6282m.addRoundRect(this.f6283n, (float) f6274e, (float) f6274e, Direction.CW);
        canvas.drawPath(this.f6282m, this.f6279j);
        this.f6283n.set((float) f6272c, 0.0f, (float) (getWidth() - f6272c), (float) (getHeight() - f6272c));
        this.f6282m.addRoundRect(this.f6283n, (float) f6273d, (float) f6273d, Direction.CW);
        canvas.clipPath(this.f6282m);
        super.onDraw(canvas);
    }

    public void setImageUrl(String str) {
        this.f6275f.setVisibility(0);
        this.f6276g.setVisibility(8);
        new C1896d(this.f6275f).mo7236a().mo7238a((C1897e) new C1909b()).mo7240a(str);
    }

    public void setIsVideo(boolean z) {
        this.f6280k = z;
    }

    public void setOnAssetsLoadedListener(C1908a aVar) {
        this.f6286q = aVar;
    }

    /* access modifiers changed from: protected */
    public void setUpImageView(Context context) {
        this.f6275f = new C2125k(context);
        m9227a((View) this.f6275f);
    }

    /* access modifiers changed from: protected */
    public void setUpMediaContainer(Context context) {
        this.f6277h = new RelativeLayout(context);
        m9227a((View) this.f6277h);
    }

    /* access modifiers changed from: protected */
    public void setUpVideoView(Context context) {
        this.f6276g = new C1939e(context, getAdEventManager());
        m9227a((View) this.f6276g);
    }

    public void setVideoPlaceholderUrl(String str) {
        this.f6276g.setPlaceholderUrl(str);
    }

    public void setVideoUrl(String str) {
        this.f6275f.setVisibility(8);
        this.f6276g.setVisibility(0);
        this.f6276g.setVideoURI(str);
        this.f6276g.mo7341a((C1720f) this.f6287r);
        this.f6276g.mo7341a((C1720f) this.f6288s);
        this.f6276g.mo7341a((C1720f) this.f6289t);
        this.f6276g.mo7341a((C1720f) this.f6290u);
        this.f6276g.mo7341a((C1720f) this.f6291v);
    }
}
