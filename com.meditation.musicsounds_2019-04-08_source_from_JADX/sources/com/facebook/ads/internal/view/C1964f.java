package com.facebook.ads.internal.view;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.p009v4.p010a.C0310a;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnDismissListener;
import android.widget.PopupMenu.OnMenuItemClickListener;
import com.facebook.ads.internal.adapters.p059a.C1647d;
import com.facebook.ads.internal.adapters.p059a.C1652i;
import com.facebook.ads.internal.p061c.C1678a;
import com.facebook.ads.internal.p070l.C1720f;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.p077s.p079b.C1817b;
import com.facebook.ads.internal.p077s.p079b.C1818c;
import com.facebook.ads.internal.p077s.p080c.C1830g;
import com.facebook.ads.internal.view.C1844a.C1845a;
import com.facebook.ads.internal.view.component.CircularProgressView;
import com.facebook.ads.internal.view.p089d.C1948c;
import com.facebook.ads.internal.view.p093g.C1994a;
import com.facebook.ads.internal.view.p093g.p094a.C2001b;
import com.facebook.ads.internal.view.p093g.p095b.C2017b;
import com.facebook.ads.internal.view.p093g.p095b.C2018c;
import com.facebook.ads.internal.view.p093g.p095b.C2029n;
import com.facebook.ads.internal.view.p093g.p095b.C2030o;

/* renamed from: com.facebook.ads.internal.view.f */
public class C1964f extends LinearLayout implements C2001b {

    /* renamed from: c */
    private static final float f6508c = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: d */
    private static final int f6509d = ((int) (f6508c * 40.0f));

    /* renamed from: e */
    private static final int f6510e = ((int) (f6508c * 44.0f));

    /* renamed from: f */
    private static final int f6511f = ((int) (f6508c * 10.0f));

    /* renamed from: g */
    private static final int f6512g = ((int) (f6508c * 16.0f));

    /* renamed from: h */
    private static final int f6513h = (f6512g - f6511f);

    /* renamed from: i */
    private static final int f6514i = ((f6512g * 2) - f6511f);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2030o f6515a = new C2030o() {
        /* renamed from: a */
        public void mo6765a(C2029n nVar) {
            if (C1964f.this.f6526s != null && C1964f.this.f6527t != 0 && C1964f.this.f6521n.isShown()) {
                float currentPositionInMillis = ((float) C1964f.this.f6526s.getCurrentPositionInMillis()) / Math.min(((float) C1964f.this.f6527t) * 1000.0f, (float) C1964f.this.f6526s.getDuration());
                C1964f.this.setProgress(100.0f * currentPositionInMillis);
                if (currentPositionInMillis >= 1.0f) {
                    C1964f.this.mo7381a(true);
                    C1964f.this.f6526s.getEventBus().mo6908b((T[]) new C1720f[]{C1964f.this.f6515a, C1964f.this.f6516b});
                }
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2018c f6516b = new C2018c() {
        /* renamed from: a */
        public void mo6765a(C2017b bVar) {
            if (C1964f.this.f6526s != null && C1964f.this.f6527t != 0 && C1964f.this.f6521n.isShown() && !C1964f.this.f6529v) {
                C1964f.this.mo7381a(true);
                C1964f.this.f6526s.getEventBus().mo6908b((T[]) new C1720f[]{C1964f.this.f6515a, C1964f.this.f6516b});
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C1845a f6517j;

    /* renamed from: k */
    private final ImageView f6518k;

    /* renamed from: l */
    private final FrameLayout f6519l;

    /* renamed from: m */
    private final ImageView f6520m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final CircularProgressView f6521n;

    /* renamed from: o */
    private final C1948c f6522o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final PopupMenu f6523p;

    /* renamed from: q */
    private ImageView f6524q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C1974b f6525r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C1994a f6526s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public int f6527t = 0;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f6528u = false;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f6529v = false;

    /* renamed from: w */
    private OnDismissListener f6530w;

    /* renamed from: com.facebook.ads.internal.view.f$a */
    public enum C1973a {
        CROSS,
        ARROWS
    }

    /* renamed from: com.facebook.ads.internal.view.f$b */
    public interface C1974b {
        /* renamed from: a */
        void mo7367a();
    }

    public C1964f(Context context, C1845a aVar, C1973a aVar2) {
        super(context);
        this.f6517j = aVar;
        setGravity(16);
        if (VERSION.SDK_INT >= 14) {
            this.f6530w = new OnDismissListener() {
                public void onDismiss(PopupMenu popupMenu) {
                    C1964f.this.f6528u = false;
                }
            };
        }
        this.f6520m = new ImageView(context);
        this.f6520m.setPadding(f6511f, f6511f, f6511f, f6511f);
        this.f6520m.setScaleType(ScaleType.FIT_CENTER);
        this.f6520m.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (C1964f.this.f6525r != null && C1964f.this.f6529v) {
                    C1964f.this.f6525r.mo7367a();
                }
            }
        });
        setCloseButtonStyle(aVar2);
        this.f6521n = new CircularProgressView(context);
        this.f6521n.setPadding(f6511f, f6511f, f6511f, f6511f);
        this.f6521n.setProgress(0.0f);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.setMargins(f6513h, f6513h, f6514i, f6513h);
        LayoutParams layoutParams2 = new LayoutParams(f6510e, f6510e);
        this.f6519l = new FrameLayout(context);
        this.f6519l.setLayoutTransition(new LayoutTransition());
        this.f6519l.addView(this.f6520m, layoutParams2);
        this.f6519l.addView(this.f6521n, layoutParams2);
        addView(this.f6519l, layoutParams);
        this.f6522o = new C1948c(context);
        LayoutParams layoutParams3 = new LayoutParams(0, -2);
        layoutParams3.gravity = 17;
        layoutParams3.weight = 1.0f;
        addView(this.f6522o, layoutParams3);
        this.f6518k = new ImageView(context);
        this.f6518k.setPadding(f6511f, f6511f, f6511f, f6511f);
        this.f6518k.setScaleType(ScaleType.FIT_CENTER);
        this.f6518k.setImageBitmap(C1818c.m8953a(C1817b.INTERSTITIAL_AD_CHOICES));
        this.f6518k.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C1964f.this.f6523p.show();
                C1964f.this.f6528u = true;
            }
        });
        this.f6523p = new PopupMenu(context, this.f6518k);
        this.f6523p.getMenu().add("Ad Choices");
        LayoutParams layoutParams4 = new LayoutParams(f6509d, f6509d);
        layoutParams4.setMargins(0, f6512g / 2, f6512g / 2, f6512g / 2);
        addView(this.f6518k, layoutParams4);
    }

    /* renamed from: a */
    public void mo7377a(C1647d dVar, boolean z) {
        int a = dVar.mo6706a(z);
        this.f6522o.mo7358a(dVar.mo6712g(z), a);
        this.f6518k.setColorFilter(a);
        if (this.f6524q != null) {
            this.f6524q.setColorFilter(a);
        }
        this.f6520m.setColorFilter(a);
        this.f6521n.mo7246a(C0310a.m1169b(a, 77), a);
        if (z) {
            GradientDrawable gradientDrawable = new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{-1778384896, 0});
            gradientDrawable.setCornerRadius(0.0f);
            C1808r.m8933a((View) this, (Drawable) gradientDrawable);
            return;
        }
        C1808r.m8932a((View) this, 0);
    }

    /* renamed from: a */
    public void mo7378a(final C1652i iVar, final String str) {
        this.f6524q = new ImageView(getContext());
        this.f6524q.setPadding(f6511f, f6511f, f6511f, f6511f);
        this.f6524q.setScaleType(ScaleType.FIT_CENTER);
        this.f6524q.setImageBitmap(C1818c.m8953a(C1817b.INFO_ICON));
        this.f6524q.setColorFilter(-1);
        addView(this.f6524q, getChildCount() - 1, new LayoutParams(f6509d, f6509d));
        this.f6524q.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C1964f.this.f6517j.mo6647b(str);
            }
        });
        this.f6518k.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                String n = !TextUtils.isEmpty(C1678a.m8419n(C1964f.this.getContext())) ? C1678a.m8419n(C1964f.this.getContext()) : iVar.mo6734c();
                if (!TextUtils.isEmpty(n)) {
                    C1830g.m8990a(new C1830g(), C1964f.this.getContext(), Uri.parse(n), str);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo7379a(final C1652i iVar, final String str, int i) {
        this.f6527t = i;
        this.f6522o.setPageDetails(iVar);
        this.f6523p.setOnMenuItemClickListener(new OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem menuItem) {
                C1964f.this.f6528u = false;
                if (!TextUtils.isEmpty(iVar.mo6734c())) {
                    C1830g.m8990a(new C1830g(), C1964f.this.getContext(), Uri.parse(iVar.mo6734c()), str);
                }
                return true;
            }
        });
        if (VERSION.SDK_INT >= 14) {
            this.f6523p.setOnDismissListener(this.f6530w);
        }
        mo7381a(i <= 0);
    }

    /* renamed from: a */
    public void mo7380a(C1994a aVar) {
        this.f6526s = aVar;
        this.f6526s.getEventBus().mo6906a((T[]) new C1720f[]{this.f6515a, this.f6516b});
    }

    /* renamed from: a */
    public void mo7381a(boolean z) {
        this.f6529v = z;
        int i = 0;
        this.f6519l.setVisibility(0);
        this.f6521n.setVisibility(z ? 4 : 0);
        ImageView imageView = this.f6520m;
        if (!z) {
            i = 4;
        }
        imageView.setVisibility(i);
    }

    /* renamed from: a */
    public boolean mo7382a() {
        return this.f6529v;
    }

    /* renamed from: b */
    public void mo7383b() {
        this.f6529v = false;
        this.f6519l.setVisibility(4);
        this.f6521n.setVisibility(4);
        this.f6520m.setVisibility(4);
    }

    /* renamed from: b */
    public void mo7384b(C1994a aVar) {
        if (this.f6526s != null) {
            this.f6526s.getEventBus().mo6908b((T[]) new C1720f[]{this.f6515a, this.f6516b});
            this.f6526s = null;
        }
    }

    /* renamed from: c */
    public void mo7385c() {
        this.f6522o.setVisibility(4);
    }

    /* renamed from: d */
    public void mo7386d() {
        if (VERSION.SDK_INT >= 14) {
            this.f6523p.setOnDismissListener(null);
        }
        this.f6523p.dismiss();
        if (VERSION.SDK_INT >= 14) {
            this.f6523p.setOnDismissListener(this.f6530w);
        }
    }

    /* renamed from: e */
    public void mo7387e() {
        if (this.f6528u && VERSION.SDK_INT >= 14) {
            this.f6523p.show();
        }
    }

    public void setCloseButtonStyle(C1973a aVar) {
        if (this.f6520m != null) {
            this.f6520m.setImageBitmap(C1818c.m8953a(aVar == C1973a.ARROWS ? C1817b.SKIP_ARROW : C1817b.INTERSTITIAL_CLOSE));
        }
    }

    public void setProgress(float f) {
        this.f6521n.setProgressWithAnimation(f);
    }

    public void setShowPageDetails(boolean z) {
        this.f6522o.setVisibility(z ? 0 : 4);
    }

    public void setToolbarListener(C1974b bVar) {
        this.f6525r = bVar;
    }
}
