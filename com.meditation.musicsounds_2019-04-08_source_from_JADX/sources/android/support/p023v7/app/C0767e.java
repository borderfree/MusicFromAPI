package android.support.p023v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p009v4.app.C0345a;
import android.support.p009v4.app.C0355af;
import android.support.p009v4.app.C0355af.C0356a;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.C0417w;
import android.support.p023v7.app.C0756b.C0758a;
import android.support.p023v7.app.C0756b.C0759b;
import android.support.p023v7.view.C0827b;
import android.support.p023v7.view.C0827b.C0828a;
import android.support.p023v7.widget.C1087bp;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

/* renamed from: android.support.v7.app.e */
public class C0767e extends C0367h implements C0356a, C0759b, C0768f {

    /* renamed from: n */
    private C0769g f2232n;

    /* renamed from: o */
    private int f2233o = 0;

    /* renamed from: p */
    private Resources f2234p;

    /* renamed from: a */
    private boolean m3562a(int i, KeyEvent keyEvent) {
        if (VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode())) {
            Window window = getWindow();
            if (!(window == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public C0827b mo3069a(C0828a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo3070a(C0355af afVar) {
        afVar.mo1396a((Activity) this);
    }

    /* renamed from: a */
    public void mo3071a(C0827b bVar) {
    }

    /* renamed from: a */
    public boolean mo3072a(Intent intent) {
        return C0417w.m1924a((Activity) this, intent);
    }

    /* renamed from: a_ */
    public Intent mo1402a_() {
        return C0417w.m1922a(this);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        mo3087l().mo3109b(view, layoutParams);
    }

    /* renamed from: b */
    public C0758a mo3038b() {
        return mo3087l().mo3117h();
    }

    /* renamed from: b */
    public C0827b mo3074b(C0828a aVar) {
        return mo3087l().mo3099a(aVar);
    }

    /* renamed from: b */
    public void mo3075b(Intent intent) {
        C0417w.m1927b((Activity) this, intent);
    }

    /* renamed from: b */
    public void mo3076b(C0355af afVar) {
    }

    /* renamed from: b */
    public void mo3077b(C0827b bVar) {
    }

    public void closeOptionsMenu() {
        C0751a i = mo3083i();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (i == null || !i.mo3010g()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0751a i = mo3083i();
        if (keyCode != 82 || i == null || !i.mo2994a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* renamed from: e */
    public void mo1467e() {
        mo3087l().mo3115f();
    }

    public <T extends View> T findViewById(int i) {
        return mo3087l().mo3100a(i);
    }

    public MenuInflater getMenuInflater() {
        return mo3087l().mo3106b();
    }

    public Resources getResources() {
        if (this.f2234p == null && C1087bp.m5965a()) {
            this.f2234p = new C1087bp(this, super.getResources());
        }
        return this.f2234p == null ? super.getResources() : this.f2234p;
    }

    /* renamed from: i */
    public C0751a mo3083i() {
        return mo3087l().mo3098a();
    }

    public void invalidateOptionsMenu() {
        mo3087l().mo3115f();
    }

    /* renamed from: j */
    public boolean mo3085j() {
        Intent a_ = mo1402a_();
        if (a_ == null) {
            return false;
        }
        if (mo3072a(a_)) {
            C0355af a = C0355af.m1481a((Context) this);
            mo3070a(a);
            mo3076b(a);
            a.mo1399a();
            try {
                C0345a.m1454a(this);
            } catch (IllegalStateException unused) {
                finish();
            }
        } else {
            mo3075b(a_);
        }
        return true;
    }

    @Deprecated
    /* renamed from: k */
    public void mo3086k() {
    }

    /* renamed from: l */
    public C0769g mo3087l() {
        if (this.f2232n == null) {
            this.f2232n = C0769g.m3581a((Activity) this, (C0768f) this);
        }
        return this.f2232n;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo3087l().mo3101a(configuration);
        if (this.f2234p != null) {
            this.f2234p.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
        mo3086k();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C0769g l = mo3087l();
        l.mo3118i();
        l.mo3102a(bundle);
        if (l.mo3119j() && this.f2233o != 0) {
            if (VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.f2233o, false);
            } else {
                setTheme(this.f2233o);
            }
        }
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo3087l().mo3116g();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m3562a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0751a i2 = mo3083i();
        if (menuItem.getItemId() != 16908332 || i2 == null || (i2.mo2983a() & 4) == 0) {
            return false;
        }
        return mo3085j();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo3087l().mo3108b(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo3087l().mo3114e();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo3087l().mo3111c(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        mo3087l().mo3110c();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo3087l().mo3113d();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo3087l().mo3105a(charSequence);
    }

    public void openOptionsMenu() {
        C0751a i = mo3083i();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (i == null || !i.mo3008f()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        mo3087l().mo3107b(i);
    }

    public void setContentView(View view) {
        mo3087l().mo3103a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        mo3087l().mo3104a(view, layoutParams);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        this.f2233o = i;
    }
}
