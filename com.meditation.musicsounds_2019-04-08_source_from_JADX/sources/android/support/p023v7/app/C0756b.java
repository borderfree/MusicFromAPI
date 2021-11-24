package android.support.p023v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p009v4.widget.DrawerLayout;
import android.support.p009v4.widget.DrawerLayout.C0658c;
import android.support.p023v7.p028d.p029a.C0821b;
import android.support.p023v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: android.support.v7.app.b */
public class C0756b implements C0658c {

    /* renamed from: a */
    boolean f2208a;

    /* renamed from: b */
    OnClickListener f2209b;

    /* renamed from: c */
    private final C0758a f2210c;

    /* renamed from: d */
    private final DrawerLayout f2211d;

    /* renamed from: e */
    private C0821b f2212e;

    /* renamed from: f */
    private boolean f2213f;

    /* renamed from: g */
    private Drawable f2214g;

    /* renamed from: h */
    private final int f2215h;

    /* renamed from: i */
    private final int f2216i;

    /* renamed from: j */
    private boolean f2217j;

    /* renamed from: android.support.v7.app.b$a */
    public interface C0758a {
        /* renamed from: a */
        Drawable mo3033a();

        /* renamed from: a */
        void mo3034a(int i);

        /* renamed from: a */
        void mo3035a(Drawable drawable, int i);

        /* renamed from: b */
        Context mo3036b();

        /* renamed from: c */
        boolean mo3037c();
    }

    /* renamed from: android.support.v7.app.b$b */
    public interface C0759b {
        /* renamed from: b */
        C0758a mo3038b();
    }

    /* renamed from: android.support.v7.app.b$c */
    private static class C0760c implements C0758a {

        /* renamed from: a */
        final Activity f2219a;

        /* renamed from: b */
        C0764a f2220b;

        C0760c(Activity activity) {
            this.f2219a = activity;
        }

        /* renamed from: a */
        public Drawable mo3033a() {
            return C0763c.m3532a(this.f2219a);
        }

        /* renamed from: a */
        public void mo3034a(int i) {
            this.f2220b = C0763c.m3533a(this.f2220b, this.f2219a, i);
        }

        /* renamed from: a */
        public void mo3035a(Drawable drawable, int i) {
            ActionBar actionBar = this.f2219a.getActionBar();
            if (actionBar != null) {
                actionBar.setDisplayShowHomeEnabled(true);
                this.f2220b = C0763c.m3534a(this.f2220b, this.f2219a, drawable, i);
                actionBar.setDisplayShowHomeEnabled(false);
            }
        }

        /* renamed from: b */
        public Context mo3036b() {
            ActionBar actionBar = this.f2219a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f2219a;
        }

        /* renamed from: c */
        public boolean mo3037c() {
            ActionBar actionBar = this.f2219a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }
    }

    /* renamed from: android.support.v7.app.b$d */
    private static class C0761d implements C0758a {

        /* renamed from: a */
        final Activity f2221a;

        C0761d(Activity activity) {
            this.f2221a = activity;
        }

        /* renamed from: a */
        public Drawable mo3033a() {
            TypedArray obtainStyledAttributes = mo3036b().obtainStyledAttributes(null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        /* renamed from: a */
        public void mo3034a(int i) {
            ActionBar actionBar = this.f2221a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i);
            }
        }

        /* renamed from: a */
        public void mo3035a(Drawable drawable, int i) {
            ActionBar actionBar = this.f2221a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i);
            }
        }

        /* renamed from: b */
        public Context mo3036b() {
            ActionBar actionBar = this.f2221a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f2221a;
        }

        /* renamed from: c */
        public boolean mo3037c() {
            ActionBar actionBar = this.f2221a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }
    }

    /* renamed from: android.support.v7.app.b$e */
    static class C0762e implements C0758a {

        /* renamed from: a */
        final Toolbar f2222a;

        /* renamed from: b */
        final Drawable f2223b;

        /* renamed from: c */
        final CharSequence f2224c;

        C0762e(Toolbar toolbar) {
            this.f2222a = toolbar;
            this.f2223b = toolbar.getNavigationIcon();
            this.f2224c = toolbar.getNavigationContentDescription();
        }

        /* renamed from: a */
        public Drawable mo3033a() {
            return this.f2223b;
        }

        /* renamed from: a */
        public void mo3034a(int i) {
            if (i == 0) {
                this.f2222a.setNavigationContentDescription(this.f2224c);
            } else {
                this.f2222a.setNavigationContentDescription(i);
            }
        }

        /* renamed from: a */
        public void mo3035a(Drawable drawable, int i) {
            this.f2222a.setNavigationIcon(drawable);
            mo3034a(i);
        }

        /* renamed from: b */
        public Context mo3036b() {
            return this.f2222a.getContext();
        }

        /* renamed from: c */
        public boolean mo3037c() {
            return true;
        }
    }

    public C0756b(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i, int i2) {
        this(activity, toolbar, drawerLayout, null, i, i2);
    }

    C0756b(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, C0821b bVar, int i, int i2) {
        this.f2213f = true;
        this.f2208a = true;
        this.f2217j = false;
        if (toolbar != null) {
            this.f2210c = new C0762e(toolbar);
            toolbar.setNavigationOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    if (C0756b.this.f2208a) {
                        C0756b.this.mo3029b();
                    } else if (C0756b.this.f2209b != null) {
                        C0756b.this.f2209b.onClick(view);
                    }
                }
            });
        } else if (activity instanceof C0759b) {
            this.f2210c = ((C0759b) activity).mo3038b();
        } else {
            this.f2210c = VERSION.SDK_INT >= 18 ? new C0761d(activity) : new C0760c(activity);
        }
        this.f2211d = drawerLayout;
        this.f2215h = i;
        this.f2216i = i2;
        if (bVar == null) {
            this.f2212e = new C0821b(this.f2210c.mo3036b());
        } else {
            this.f2212e = bVar;
        }
        this.f2214g = mo3031c();
    }

    /* renamed from: a */
    private void m3501a(float f) {
        C0821b bVar;
        boolean z;
        if (f == 1.0f) {
            bVar = this.f2212e;
            z = true;
        } else {
            if (f == 0.0f) {
                bVar = this.f2212e;
                z = false;
            }
            this.f2212e.mo3269c(f);
        }
        bVar.mo3268b(z);
        this.f2212e.mo3269c(f);
    }

    /* renamed from: a */
    public void mo3027a() {
        m3501a(this.f2211d.mo2604g(8388611) ? 1.0f : 0.0f);
        if (this.f2208a) {
            mo3028a((Drawable) this.f2212e, this.f2211d.mo2604g(8388611) ? this.f2216i : this.f2215h);
        }
    }

    /* renamed from: a */
    public void mo2644a(int i) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3028a(Drawable drawable, int i) {
        if (!this.f2217j && !this.f2210c.mo3037c()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f2217j = true;
        }
        this.f2210c.mo3035a(drawable, i);
    }

    /* renamed from: a */
    public void mo2645a(View view) {
        m3501a(1.0f);
        if (this.f2208a) {
            mo3030b(this.f2216i);
        }
    }

    /* renamed from: a */
    public void mo2646a(View view, float f) {
        if (this.f2213f) {
            m3501a(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            m3501a(0.0f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3029b() {
        int a = this.f2211d.mo2570a(8388611);
        if (this.f2211d.mo2612h(8388611) && a != 2) {
            this.f2211d.mo2602f(8388611);
        } else if (a != 1) {
            this.f2211d.mo2601e(8388611);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3030b(int i) {
        this.f2210c.mo3034a(i);
    }

    /* renamed from: b */
    public void mo2647b(View view) {
        m3501a(0.0f);
        if (this.f2208a) {
            mo3030b(this.f2215h);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Drawable mo3031c() {
        return this.f2210c.mo3033a();
    }
}
