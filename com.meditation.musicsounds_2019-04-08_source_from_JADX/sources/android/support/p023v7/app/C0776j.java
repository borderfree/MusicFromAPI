package android.support.p023v7.app;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p023v7.view.C0827b;
import android.support.p023v7.view.C0827b.C0828a;
import android.support.p023v7.view.C0832f.C0833a;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;
import com.google.android.gms.ads.AdRequest;

/* renamed from: android.support.v7.app.j */
class C0776j extends C0782l {

    /* renamed from: t */
    private int f2259t = -100;

    /* renamed from: u */
    private boolean f2260u;

    /* renamed from: v */
    private boolean f2261v = true;

    /* renamed from: w */
    private C0778b f2262w;

    /* renamed from: android.support.v7.app.j$a */
    class C0777a extends C0773b {
        C0777a(Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final ActionMode mo3145a(ActionMode.Callback callback) {
            C0833a aVar = new C0833a(C0776j.this.f2240a, callback);
            C0827b a = C0776j.this.mo3099a((C0828a) aVar);
            if (a != null) {
                return aVar.mo3315b(a);
            }
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return C0776j.this.mo3130p() ? mo3145a(callback) : super.onWindowStartingActionMode(callback);
        }
    }

    /* renamed from: android.support.v7.app.j$b */
    final class C0778b {

        /* renamed from: b */
        private C0802q f2265b;

        /* renamed from: c */
        private boolean f2266c;

        /* renamed from: d */
        private BroadcastReceiver f2267d;

        /* renamed from: e */
        private IntentFilter f2268e;

        C0778b(C0802q qVar) {
            this.f2265b = qVar;
            this.f2266c = qVar.mo3201a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo3147a() {
            this.f2266c = this.f2265b.mo3201a();
            return this.f2266c ? 2 : 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo3148b() {
            boolean a = this.f2265b.mo3201a();
            if (a != this.f2266c) {
                this.f2266c = a;
                C0776j.this.mo3119j();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo3149c() {
            mo3150d();
            if (this.f2267d == null) {
                this.f2267d = new BroadcastReceiver() {
                    public void onReceive(Context context, Intent intent) {
                        C0778b.this.mo3148b();
                    }
                };
            }
            if (this.f2268e == null) {
                this.f2268e = new IntentFilter();
                this.f2268e.addAction("android.intent.action.TIME_SET");
                this.f2268e.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.f2268e.addAction("android.intent.action.TIME_TICK");
            }
            C0776j.this.f2240a.registerReceiver(this.f2267d, this.f2268e);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final void mo3150d() {
            if (this.f2267d != null) {
                C0776j.this.f2240a.unregisterReceiver(this.f2267d);
                this.f2267d = null;
            }
        }
    }

    C0776j(Context context, Window window, C0768f fVar) {
        super(context, window, fVar);
    }

    /* renamed from: h */
    private boolean m3638h(int i) {
        Resources resources = this.f2240a.getResources();
        Configuration configuration = resources.getConfiguration();
        int i2 = configuration.uiMode & 48;
        int i3 = i == 2 ? 32 : 16;
        if (i2 == i3) {
            return false;
        }
        if (m3641z()) {
            ((Activity) this.f2240a).recreate();
        } else {
            Configuration configuration2 = new Configuration(configuration);
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            configuration2.uiMode = i3 | (configuration2.uiMode & -49);
            resources.updateConfiguration(configuration2, displayMetrics);
            if (VERSION.SDK_INT < 26) {
                C0797n.m3744a(resources);
            }
        }
        return true;
    }

    /* renamed from: x */
    private int m3639x() {
        return this.f2259t != -100 ? this.f2259t : m3584k();
    }

    /* renamed from: y */
    private void m3640y() {
        if (this.f2262w == null) {
            this.f2262w = new C0778b(C0802q.m3788a(this.f2240a));
        }
    }

    /* renamed from: z */
    private boolean m3641z() {
        boolean z = false;
        if (!this.f2260u || !(this.f2240a instanceof Activity)) {
            return false;
        }
        try {
            if ((this.f2240a.getPackageManager().getActivityInfo(new ComponentName(this.f2240a, this.f2240a.getClass()), 0).configChanges & AdRequest.MAX_CONTENT_URL_LENGTH) == 0) {
                z = true;
            }
            return z;
        } catch (NameNotFoundException e) {
            Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo3143a(View view, String str, Context context, AttributeSet attributeSet) {
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Callback mo3120a(Callback callback) {
        return new C0777a(callback);
    }

    /* renamed from: a */
    public void mo3102a(Bundle bundle) {
        super.mo3102a(bundle);
        if (bundle != null && this.f2259t == -100) {
            this.f2259t = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    /* renamed from: c */
    public void mo3110c() {
        super.mo3110c();
        mo3119j();
    }

    /* renamed from: c */
    public void mo3111c(Bundle bundle) {
        super.mo3111c(bundle);
        if (this.f2259t != -100) {
            bundle.putInt("appcompat:local_night_mode", this.f2259t);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo3144d(int i) {
        if (i == -100) {
            return -1;
        }
        if (i != 0) {
            return i;
        }
        m3640y();
        return this.f2262w.mo3147a();
    }

    /* renamed from: d */
    public void mo3113d() {
        super.mo3113d();
        if (this.f2262w != null) {
            this.f2262w.mo3150d();
        }
    }

    /* renamed from: g */
    public void mo3116g() {
        super.mo3116g();
        if (this.f2262w != null) {
            this.f2262w.mo3150d();
        }
    }

    /* renamed from: j */
    public boolean mo3119j() {
        int x = m3639x();
        int d = mo3144d(x);
        boolean h = d != -1 ? m3638h(d) : false;
        if (x == 0) {
            m3640y();
            this.f2262w.mo3149c();
        }
        this.f2260u = true;
        return h;
    }

    /* renamed from: p */
    public boolean mo3130p() {
        return this.f2261v;
    }
}
