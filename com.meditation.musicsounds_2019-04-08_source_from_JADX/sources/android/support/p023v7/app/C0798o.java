package android.support.p023v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.p009v4.view.C0626s;
import android.support.p023v7.app.C0751a.C0752a;
import android.support.p023v7.app.C0751a.C0753b;
import android.support.p023v7.app.C0751a.C0754c;
import android.support.p023v7.view.menu.C0855h;
import android.support.p023v7.view.menu.C0855h.C0856a;
import android.support.p023v7.view.menu.C0871o.C0872a;
import android.support.p023v7.widget.C0999ae;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window.Callback;
import java.util.ArrayList;

/* renamed from: android.support.v7.app.o */
class C0798o extends C0751a {

    /* renamed from: a */
    C0999ae f2339a;

    /* renamed from: b */
    Callback f2340b;

    /* renamed from: c */
    private boolean f2341c;

    /* renamed from: d */
    private boolean f2342d;

    /* renamed from: e */
    private ArrayList<C0753b> f2343e;

    /* renamed from: f */
    private final Runnable f2344f;

    /* renamed from: android.support.v7.app.o$a */
    private final class C0799a implements C0872a {

        /* renamed from: b */
        private boolean f2346b;

        C0799a() {
        }

        /* renamed from: a */
        public void mo3176a(C0855h hVar, boolean z) {
            if (!this.f2346b) {
                this.f2346b = true;
                C0798o.this.f2339a.mo5005n();
                if (C0798o.this.f2340b != null) {
                    C0798o.this.f2340b.onPanelClosed(108, hVar);
                }
                this.f2346b = false;
            }
        }

        /* renamed from: a */
        public boolean mo3177a(C0855h hVar) {
            if (C0798o.this.f2340b == null) {
                return false;
            }
            C0798o.this.f2340b.onMenuOpened(108, hVar);
            return true;
        }
    }

    /* renamed from: android.support.v7.app.o$b */
    private final class C0800b implements C0856a {
        C0800b() {
        }

        /* renamed from: a */
        public void mo639a(C0855h hVar) {
            if (C0798o.this.f2340b == null) {
                return;
            }
            if (C0798o.this.f2339a.mo5000i()) {
                C0798o.this.f2340b.onPanelClosed(108, hVar);
            } else if (C0798o.this.f2340b.onPreparePanel(0, null, hVar)) {
                C0798o.this.f2340b.onMenuOpened(108, hVar);
            }
        }

        /* renamed from: a */
        public boolean mo640a(C0855h hVar, MenuItem menuItem) {
            return false;
        }
    }

    /* renamed from: k */
    private Menu m3749k() {
        if (!this.f2341c) {
            this.f2339a.mo4975a((C0872a) new C0799a(), (C0856a) new C0800b());
            this.f2341c = true;
        }
        return this.f2339a.mo5009r();
    }

    /* renamed from: a */
    public int mo2983a() {
        return this.f2339a.mo5006o();
    }

    /* renamed from: a */
    public void mo2985a(float f) {
        C0626s.m2837a((View) this.f2339a.mo4972a(), f);
    }

    /* renamed from: a */
    public void mo2986a(int i) {
        if (i != 2) {
            this.f2339a.mo4992d(i);
            return;
        }
        throw new IllegalArgumentException("Tabs not supported in this configuration");
    }

    /* renamed from: a */
    public void mo3199a(int i, int i2) {
        this.f2339a.mo4987c((i & i2) | ((i2 ^ -1) & this.f2339a.mo5006o()));
    }

    /* renamed from: a */
    public void mo2987a(Configuration configuration) {
        super.mo2987a(configuration);
    }

    /* renamed from: a */
    public void mo2988a(Drawable drawable) {
        this.f2339a.mo4988c(drawable);
    }

    /* renamed from: a */
    public void mo2989a(C0754c cVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: a */
    public void mo2990a(View view, C0752a aVar) {
        if (view != null) {
            view.setLayoutParams(aVar);
        }
        this.f2339a.mo4978a(view);
    }

    /* renamed from: a */
    public void mo2991a(CharSequence charSequence) {
        this.f2339a.mo4985b(charSequence);
    }

    /* renamed from: a */
    public void mo2992a(boolean z) {
        mo3199a(z ? 4 : 0, 4);
    }

    /* renamed from: a */
    public boolean mo2993a(int i, KeyEvent keyEvent) {
        Menu k = m3749k();
        if (k == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        k.setQwertyMode(z);
        return k.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: a */
    public boolean mo2994a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo3008f();
        }
        return true;
    }

    /* renamed from: b */
    public C0754c mo2995b() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: b */
    public void mo2996b(int i) {
        this.f2339a.mo4996f(i);
    }

    /* renamed from: b */
    public void mo2997b(Drawable drawable) {
        this.f2339a.mo4984b(drawable);
    }

    /* renamed from: b */
    public void mo2998b(CharSequence charSequence) {
        this.f2339a.mo4989c(charSequence);
    }

    /* renamed from: b */
    public void mo2999b(boolean z) {
        mo3199a(z ? 8 : 0, 8);
    }

    /* renamed from: c */
    public void mo3000c() {
        this.f2339a.mo4998g(0);
    }

    /* renamed from: c */
    public void mo3001c(CharSequence charSequence) {
        this.f2339a.mo4980a(charSequence);
    }

    /* renamed from: c */
    public void mo3002c(boolean z) {
        mo3199a(z ? 16 : 0, 16);
    }

    /* renamed from: d */
    public void mo3003d() {
        this.f2339a.mo4998g(8);
    }

    /* renamed from: d */
    public void mo3004d(boolean z) {
    }

    /* renamed from: e */
    public Context mo3005e() {
        return this.f2339a.mo4982b();
    }

    /* renamed from: f */
    public void mo3007f(boolean z) {
    }

    /* renamed from: f */
    public boolean mo3008f() {
        return this.f2339a.mo5002k();
    }

    /* renamed from: g */
    public void mo3009g(boolean z) {
    }

    /* renamed from: g */
    public boolean mo3010g() {
        return this.f2339a.mo5003l();
    }

    /* renamed from: h */
    public void mo3011h(boolean z) {
        if (z != this.f2342d) {
            this.f2342d = z;
            int size = this.f2343e.size();
            for (int i = 0; i < size; i++) {
                ((C0753b) this.f2343e.get(i)).mo3015a(z);
            }
        }
    }

    /* renamed from: h */
    public boolean mo3012h() {
        this.f2339a.mo4972a().removeCallbacks(this.f2344f);
        C0626s.m2847a((View) this.f2339a.mo4972a(), this.f2344f);
        return true;
    }

    /* renamed from: i */
    public boolean mo3013i() {
        if (!this.f2339a.mo4990c()) {
            return false;
        }
        this.f2339a.mo4991d();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo3014j() {
        this.f2339a.mo4972a().removeCallbacks(this.f2344f);
    }
}
