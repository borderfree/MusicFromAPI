package com.seattleclouds.ads.p156b;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.keymob.KeyMobManager;
import com.keymob.KeyMobManager.OnKeyMobBannerClickListener;
import com.keymob.KeyMobManager.OnKeyMobBannerLoadedListener;
import com.keymob.KeyMobManager.OnKeyMobInitListener;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5462k;

/* renamed from: com.seattleclouds.ads.b.a */
public class C5248a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f18810a = "a";

    /* renamed from: b */
    private static KeyMobManager f18811b;

    /* renamed from: c */
    private static String f18812c;

    /* renamed from: d */
    private static Boolean f18813d;

    /* renamed from: e */
    private static boolean f18814e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static OnKeyMobInitListener f18815f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static OnKeyMobBannerLoadedListener f18816g;

    /* renamed from: h */
    private static OnKeyMobBannerLoadedListener f18817h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static Handler f18818i;

    /* renamed from: com.seattleclouds.ads.b.a$a */
    private static class C5251a extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        private Activity f18820a;

        /* renamed from: b */
        private boolean f18821b;

        /* renamed from: c */
        private String f18822c = C5248a.m26204d();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public KeyMobManager f18823d = C5248a.m26213m();

        /* renamed from: e */
        private boolean f18824e;

        /* renamed from: f */
        private String f18825f;

        /* renamed from: g */
        private boolean f18826g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public Looper f18827h;

        public C5251a(Activity activity, boolean z) {
            this.f18820a = activity;
            this.f18821b = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                Looper.prepare();
                if (this.f18824e) {
                    this.f18823d.setLogEnabled(this.f18821b);
                    if (this.f18825f == null) {
                        this.f18823d.initFromKeymobService(this.f18820a, this.f18822c, this.f18821b);
                    } else {
                        this.f18823d.initFromAssets(this.f18820a, this.f18825f);
                    }
                } else {
                    this.f18823d.showBanner(this.f18826g, this.f18820a);
                }
                this.f18820a = null;
                this.f18827h = Looper.myLooper();
                final Handler handler = new Handler();
                if (this.f18824e) {
                    handler.post(new Runnable() {
                        public void run() {
                            if (C5251a.this.f18823d.isInited()) {
                                C5251a.this.f18827h.quit();
                            } else {
                                handler.postDelayed(this, 100);
                            }
                        }
                    });
                }
                Looper.loop();
            } catch (Exception e) {
                Log.e(C5248a.f18810a, "Error calling KeyMob routines", e);
            }
            return null;
        }

        /* renamed from: a */
        public void mo17256a() {
            this.f18824e = true;
            this.f18825f = null;
            execute(new Void[0]);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
            if (this.f18824e && C5248a.m26213m().isInited() && C5248a.f18815f != null) {
                C5248a.f18815f.onKeyMobInitSuccess();
            }
        }
    }

    /* renamed from: com.seattleclouds.ads.b.a$b */
    private static class C5253b implements KeyMobManager {
        private C5253b() {
        }

        public OnKeyMobBannerLoadedListener getOnBannerLoadedListener() {
            return null;
        }

        public void initFromAssets(Activity activity, String str) {
        }

        public void initFromKeymobService(Activity activity, String str, boolean z) {
        }

        public boolean isInited() {
            return true;
        }

        public void removeBanner() {
        }

        public void setLogEnabled(boolean z) {
        }

        public void setOnBannerClickListener(OnKeyMobBannerClickListener onKeyMobBannerClickListener) {
        }

        public void setOnBannerLoadedListener(OnKeyMobBannerLoadedListener onKeyMobBannerLoadedListener) {
        }

        public void setOnInitListener(OnKeyMobInitListener onKeyMobInitListener) {
        }

        public void showBanner(boolean z, Activity activity) {
        }

        public void showInterstitial(Activity activity) {
        }
    }

    /* renamed from: a */
    public static void m26197a(Activity activity) {
        new C5251a(activity, App.f18500b).mo17256a();
        f18814e = true;
    }

    /* renamed from: a */
    public static void m26198a(OnKeyMobBannerLoadedListener onKeyMobBannerLoadedListener) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            f18816g = onKeyMobBannerLoadedListener;
            if (f18817h == null) {
                f18817h = new OnKeyMobBannerLoadedListener() {
                    public void onKeyMobBannerLoaded() {
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            C5248a.f18818i.post(new Runnable() {
                                public void run() {
                                    if (C5248a.f18816g != null) {
                                        C5248a.f18816g.onKeyMobBannerLoaded();
                                    }
                                }
                            });
                        } else if (C5248a.f18816g != null) {
                            C5248a.f18816g.onKeyMobBannerLoaded();
                        }
                    }
                };
                f18818i = new Handler();
                m26213m().setOnBannerLoadedListener(f18817h);
                return;
            }
            return;
        }
        throw new IllegalStateException("Can only be called from the main thread");
    }

    /* renamed from: a */
    public static void m26199a(OnKeyMobInitListener onKeyMobInitListener) {
        f18815f = onKeyMobInitListener;
    }

    /* renamed from: a */
    public static void m26200a(boolean z, Activity activity) {
        m26213m().showBanner(z, activity);
    }

    /* renamed from: a */
    public static boolean m26201a() {
        return m26202b() && m26203c();
    }

    /* renamed from: b */
    public static boolean m26202b() {
        if (f18813d == null) {
            m26213m();
        }
        return f18813d.booleanValue();
    }

    /* renamed from: c */
    public static boolean m26203c() {
        return !m26204d().isEmpty();
    }

    /* renamed from: d */
    public static String m26204d() {
        if (f18812c == null) {
            f18812c = App.f18500b ? "10672" : App.m25651f().getString(C5462k.km_app_id).trim();
        }
        return f18812c;
    }

    /* renamed from: e */
    public static boolean m26205e() {
        return f18814e;
    }

    /* renamed from: f */
    public static boolean m26206f() {
        return m26213m().isInited();
    }

    /* renamed from: g */
    public static void m26207g() {
        m26213m().removeBanner();
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static synchronized KeyMobManager m26213m() {
        KeyMobManager keyMobManager;
        synchronized (C5248a.class) {
            if (f18811b == null) {
                boolean z = false;
                f18811b = (KeyMobManager) App.m25613a(App.m25615a("com.keymob.KeyMobManagerImpl", "getInstance", (Class<?>[]) new Class[0]), (Object) null, new Object[0]);
                if (f18811b != null) {
                    z = true;
                }
                f18813d = Boolean.valueOf(z);
                if (f18811b == null) {
                    f18811b = new C5253b();
                }
            }
            keyMobManager = f18811b;
        }
        return keyMobManager;
    }
}
