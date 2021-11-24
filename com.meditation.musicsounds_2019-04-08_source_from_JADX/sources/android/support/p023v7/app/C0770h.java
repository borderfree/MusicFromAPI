package android.support.p023v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p023v7.app.C0756b.C0758a;
import android.support.p023v7.p024a.C0726a.C0727a;
import android.support.p023v7.view.C0827b;
import android.support.p023v7.view.C0827b.C0828a;
import android.support.p023v7.view.C0834g;
import android.support.p023v7.view.C0839i;
import android.support.p023v7.view.menu.C0855h;
import android.support.p023v7.widget.C1078bk;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: android.support.v7.app.h */
abstract class C0770h extends C0769g {

    /* renamed from: m */
    private static boolean f2237m = true;

    /* renamed from: n */
    private static final boolean f2238n = (VERSION.SDK_INT < 21);

    /* renamed from: o */
    private static final int[] f2239o = {16842836};

    /* renamed from: a */
    final Context f2240a;

    /* renamed from: b */
    final Window f2241b;

    /* renamed from: c */
    final Callback f2242c = this.f2241b.getCallback();

    /* renamed from: d */
    final Callback f2243d;

    /* renamed from: e */
    final C0768f f2244e;

    /* renamed from: f */
    C0751a f2245f;

    /* renamed from: g */
    MenuInflater f2246g;

    /* renamed from: h */
    boolean f2247h;

    /* renamed from: i */
    boolean f2248i;

    /* renamed from: j */
    boolean f2249j;

    /* renamed from: k */
    boolean f2250k;

    /* renamed from: l */
    boolean f2251l;

    /* renamed from: p */
    private CharSequence f2252p;

    /* renamed from: q */
    private boolean f2253q;

    /* renamed from: r */
    private boolean f2254r;

    /* renamed from: android.support.v7.app.h$a */
    private class C0772a implements C0758a {
        C0772a() {
        }

        /* renamed from: a */
        public Drawable mo3033a() {
            C1078bk a = C1078bk.m5880a(mo3036b(), (AttributeSet) null, new int[]{C0727a.homeAsUpIndicator});
            Drawable a2 = a.mo5357a(0);
            a.mo5358a();
            return a2;
        }

        /* renamed from: a */
        public void mo3034a(int i) {
            C0751a a = C0770h.this.mo3098a();
            if (a != null) {
                a.mo2996b(i);
            }
        }

        /* renamed from: a */
        public void mo3035a(Drawable drawable, int i) {
            C0751a a = C0770h.this.mo3098a();
            if (a != null) {
                a.mo2997b(drawable);
                a.mo2996b(i);
            }
        }

        /* renamed from: b */
        public Context mo3036b() {
            return C0770h.this.mo3129o();
        }

        /* renamed from: c */
        public boolean mo3037c() {
            C0751a a = C0770h.this.mo3098a();
            return (a == null || (a.mo2983a() & 4) == 0) ? false : true;
        }
    }

    /* renamed from: android.support.v7.app.h$b */
    class C0773b extends C0839i {
        C0773b(Callback callback) {
            super(callback);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0770h.this.mo3123a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || C0770h.this.mo3122a(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0855h)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            C0770h.this.mo3126b(i, menu);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            C0770h.this.mo3121a(i, menu);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0855h hVar = menu instanceof C0855h ? (C0855h) menu : null;
            if (i == 0 && hVar == null) {
                return false;
            }
            if (hVar != null) {
                hVar.mo3509c(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (hVar != null) {
                hVar.mo3509c(false);
            }
            return onPreparePanel;
        }
    }

    static {
        if (f2238n && !f2237m) {
            final UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
                /* renamed from: a */
                private boolean m3631a(Throwable th) {
                    if (!(th instanceof NotFoundException)) {
                        return false;
                    }
                    String message = th.getMessage();
                    if (message != null) {
                        return message.contains("drawable") || message.contains("Drawable");
                    }
                    return false;
                }

                public void uncaughtException(Thread thread, Throwable th) {
                    if (m3631a(th)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(th.getMessage());
                        sb.append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                        NotFoundException notFoundException = new NotFoundException(sb.toString());
                        notFoundException.initCause(th.getCause());
                        notFoundException.setStackTrace(th.getStackTrace());
                        defaultUncaughtExceptionHandler.uncaughtException(thread, notFoundException);
                        return;
                    }
                    defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                }
            });
        }
    }

    C0770h(Context context, Window window, C0768f fVar) {
        this.f2240a = context;
        this.f2241b = window;
        this.f2244e = fVar;
        if (!(this.f2242c instanceof C0773b)) {
            this.f2243d = mo3120a(this.f2242c);
            this.f2241b.setCallback(this.f2243d);
            C1078bk a = C1078bk.m5880a(context, (AttributeSet) null, f2239o);
            Drawable b = a.mo5361b(0);
            if (b != null) {
                this.f2241b.setBackgroundDrawable(b);
            }
            a.mo5358a();
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: a */
    public C0751a mo3098a() {
        mo3127m();
        return this.f2245f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Callback mo3120a(Callback callback) {
        return new C0773b(callback);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo3121a(int i, Menu menu);

    /* renamed from: a */
    public final void mo3105a(CharSequence charSequence) {
        this.f2252p = charSequence;
        mo3125b(charSequence);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo3122a(int i, KeyEvent keyEvent);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo3123a(KeyEvent keyEvent);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract C0827b mo3124b(C0828a aVar);

    /* renamed from: b */
    public MenuInflater mo3106b() {
        if (this.f2246g == null) {
            mo3127m();
            this.f2246g = new C0834g(this.f2245f != null ? this.f2245f.mo3005e() : this.f2240a);
        }
        return this.f2246g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo3125b(CharSequence charSequence);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract boolean mo3126b(int i, Menu menu);

    /* renamed from: c */
    public void mo3110c() {
        this.f2253q = true;
    }

    /* renamed from: c */
    public void mo3111c(Bundle bundle) {
    }

    /* renamed from: d */
    public void mo3113d() {
        this.f2253q = false;
    }

    /* renamed from: g */
    public void mo3116g() {
        this.f2254r = true;
    }

    /* renamed from: h */
    public final C0758a mo3117h() {
        return new C0772a();
    }

    /* renamed from: j */
    public boolean mo3119j() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public abstract void mo3127m();

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final C0751a mo3128n() {
        return this.f2245f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final Context mo3129o() {
        C0751a a = mo3098a();
        Context e = a != null ? a.mo3005e() : null;
        return e == null ? this.f2240a : e;
    }

    /* renamed from: p */
    public boolean mo3130p() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public final boolean mo3131q() {
        return this.f2254r;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public final Callback mo3132r() {
        return this.f2241b.getCallback();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final CharSequence mo3133s() {
        return this.f2242c instanceof Activity ? ((Activity) this.f2242c).getTitle() : this.f2252p;
    }
}
