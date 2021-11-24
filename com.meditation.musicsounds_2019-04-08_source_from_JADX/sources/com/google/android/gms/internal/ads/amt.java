package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;

@C3464ci
public class amt {
    @GuardedBy("mLock")

    /* renamed from: a */
    private aoh f12446a;

    /* renamed from: b */
    private final Object f12447b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final aml f12448c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final amk f12449d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C3416api f12450e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final auy f12451f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C3570gf f12452g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C3807p f12453h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final auz f12454i;

    /* renamed from: com.google.android.gms.internal.ads.amt$a */
    abstract class C3412a<T> {
        C3412a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract T mo12115a();

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract T mo12116a(aoh aoh);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final T mo12117b() {
            aoh a = amt.this.m16612b();
            if (a == null) {
                C3731me.m19178e("ClientApi class cannot be loaded.");
                return null;
            }
            try {
                return mo12116a(a);
            } catch (RemoteException e) {
                C3731me.m19175c("Cannot invoke local loader using ClientApi class", e);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final T mo12118c() {
            try {
                return mo12115a();
            } catch (RemoteException e) {
                C3731me.m19175c("Cannot invoke remote loader", e);
                return null;
            }
        }
    }

    public amt(aml aml, amk amk, C3416api api, auy auy, C3570gf gfVar, C3807p pVar, auz auz) {
        this.f12448c = aml;
        this.f12449d = amk;
        this.f12450e = api;
        this.f12451f = auy;
        this.f12452g = gfVar;
        this.f12453h = pVar;
        this.f12454i = auz;
    }

    /* renamed from: a */
    private static aoh m16606a() {
        try {
            Object newInstance = amt.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
            if (newInstance instanceof IBinder) {
                return aoi.asInterface((IBinder) newInstance);
            }
            C3731me.m19178e("ClientApi class is not an instance of IBinder");
            return null;
        } catch (Exception e) {
            C3731me.m19175c("Failed to instantiate ClientApi class.", e);
            return null;
        }
    }

    /* renamed from: a */
    static <T> T m16608a(Context context, boolean z, C3412a<T> aVar) {
        if (!z) {
            ane.m16645a();
            if (!C3719lt.m19123c(context)) {
                C3731me.m19172b("Google Play Services is not available");
                z = true;
            }
        }
        ane.m16645a();
        int e = C3719lt.m19125e(context);
        ane.m16645a();
        if (e > C3719lt.m19124d(context)) {
            z = true;
        }
        aqm.m16920a(context);
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12824de)).booleanValue()) {
            z = false;
        }
        if (z) {
            T b = aVar.mo12117b();
            return b == null ? aVar.mo12118c() : b;
        }
        T c = aVar.mo12118c();
        return c == null ? aVar.mo12117b() : c;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m16609a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        ane.m16645a().mo13233a(context, (String) null, "gmob-apps", bundle, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final aoh m16612b() {
        aoh aoh;
        synchronized (this.f12447b) {
            if (this.f12446a == null) {
                this.f12446a = m16606a();
            }
            aoh = this.f12446a;
        }
        return aoh;
    }

    /* renamed from: a */
    public final anq mo12111a(Context context, String str, bas bas) {
        return (anq) m16608a(context, false, (C3412a<T>) new amx<T>(this, context, str, bas));
    }

    /* renamed from: a */
    public final atc mo12112a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (atc) m16608a(context, false, (C3412a<T>) new amz<T>(this, frameLayout, frameLayout2, context));
    }

    /* renamed from: a */
    public final ath mo12113a(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        return (ath) m16608a(view.getContext(), false, (C3412a<T>) new ana<T>(this, view, hashMap, hashMap2));
    }

    /* renamed from: a */
    public final C3834q mo12114a(Activity activity) {
        String str = "com.google.android.gms.ads.internal.overlay.useClientJar";
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra(str)) {
            C3731me.m19174c("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra(str, false);
        }
        return (C3834q) m16608a((Context) activity, z, (C3412a<T>) new and<T>(this, activity));
    }
}
