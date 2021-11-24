package android.support.p006c;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.support.p009v4.app.C0364f;
import android.support.p009v4.content.C0452b;
import java.util.ArrayList;

/* renamed from: android.support.c.c */
public final class C0054c {

    /* renamed from: a */
    public final Intent f92a;

    /* renamed from: b */
    public final Bundle f93b;

    /* renamed from: android.support.c.c$a */
    public static final class C0056a {

        /* renamed from: a */
        private final Intent f94a;

        /* renamed from: b */
        private ArrayList<Bundle> f95b;

        /* renamed from: c */
        private Bundle f96c;

        /* renamed from: d */
        private ArrayList<Bundle> f97d;

        /* renamed from: e */
        private boolean f98e;

        public C0056a() {
            this(null);
        }

        public C0056a(C0059e eVar) {
            this.f94a = new Intent("android.intent.action.VIEW");
            IBinder iBinder = null;
            this.f95b = null;
            this.f96c = null;
            this.f97d = null;
            this.f98e = true;
            if (eVar != null) {
                this.f94a.setPackage(eVar.mo111b().getPackageName());
            }
            Bundle bundle = new Bundle();
            String str = "android.support.customtabs.extra.SESSION";
            if (eVar != null) {
                iBinder = eVar.mo109a();
            }
            C0364f.m1534a(bundle, str, iBinder);
            this.f94a.putExtras(bundle);
        }

        /* renamed from: a */
        public C0054c mo106a() {
            if (this.f95b != null) {
                this.f94a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", this.f95b);
            }
            if (this.f97d != null) {
                this.f94a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", this.f97d);
            }
            this.f94a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f98e);
            return new C0054c(this.f94a, this.f96c);
        }
    }

    private C0054c(Intent intent, Bundle bundle) {
        this.f92a = intent;
        this.f93b = bundle;
    }

    /* renamed from: a */
    public void mo105a(Context context, Uri uri) {
        this.f92a.setData(uri);
        C0452b.m2061a(context, this.f92a, this.f93b);
    }
}
