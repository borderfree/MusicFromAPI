package android.support.p023v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.support.p023v7.p024a.C0726a.C0735i;
import android.view.LayoutInflater;

/* renamed from: android.support.v7.view.d */
public class C0830d extends ContextWrapper {

    /* renamed from: a */
    private int f2436a;

    /* renamed from: b */
    private Theme f2437b;

    /* renamed from: c */
    private LayoutInflater f2438c;

    /* renamed from: d */
    private Configuration f2439d;

    /* renamed from: e */
    private Resources f2440e;

    public C0830d() {
        super(null);
    }

    public C0830d(Context context, int i) {
        super(context);
        this.f2436a = i;
    }

    public C0830d(Context context, Theme theme) {
        super(context);
        this.f2437b = theme;
    }

    /* renamed from: b */
    private Resources m3931b() {
        Resources resources;
        if (this.f2440e == null) {
            if (this.f2439d == null) {
                resources = super.getResources();
            } else if (VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(this.f2439d).getResources();
            }
            this.f2440e = resources;
        }
        return this.f2440e;
    }

    /* renamed from: c */
    private void m3932c() {
        boolean z = this.f2437b == null;
        if (z) {
            this.f2437b = getResources().newTheme();
            Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2437b.setTo(theme);
            }
        }
        mo3291a(this.f2437b, this.f2436a, z);
    }

    /* renamed from: a */
    public int mo3290a() {
        return this.f2436a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3291a(Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return m3931b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2438c == null) {
            this.f2438c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2438c;
    }

    public Theme getTheme() {
        if (this.f2437b != null) {
            return this.f2437b;
        }
        if (this.f2436a == 0) {
            this.f2436a = C0735i.Theme_AppCompat_Light;
        }
        m3932c();
        return this.f2437b;
    }

    public void setTheme(int i) {
        if (this.f2436a != i) {
            this.f2436a = i;
            m3932c();
        }
    }
}
