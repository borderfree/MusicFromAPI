package android.support.p006c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.p006c.C0060f.C0061a;
import android.text.TextUtils;

/* renamed from: android.support.c.b */
public class C0047b {

    /* renamed from: a */
    private final C0063g f71a;

    /* renamed from: b */
    private final ComponentName f72b;

    C0047b(C0063g gVar, ComponentName componentName) {
        this.f71a = gVar;
        this.f72b = componentName;
    }

    /* renamed from: a */
    public static boolean m138a(Context context, String str, C0057d dVar) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, dVar, 33);
    }

    /* renamed from: a */
    public C0059e mo93a(final C0046a aVar) {
        C00481 r0 = new C0061a() {

            /* renamed from: c */
            private Handler f75c = new Handler(Looper.getMainLooper());

            /* renamed from: a */
            public void mo95a(int i, Uri uri, boolean z, Bundle bundle) {
                if (aVar != null) {
                    Handler handler = this.f75c;
                    final int i2 = i;
                    final Uri uri2 = uri;
                    final boolean z2 = z;
                    final Bundle bundle2 = bundle;
                    C00535 r1 = new Runnable() {
                        public void run() {
                            aVar.mo88a(i2, uri2, z2, bundle2);
                        }
                    };
                    handler.post(r1);
                }
            }

            /* renamed from: a */
            public void mo96a(final int i, final Bundle bundle) {
                if (aVar != null) {
                    this.f75c.post(new Runnable() {
                        public void run() {
                            aVar.mo89a(i, bundle);
                        }
                    });
                }
            }

            /* renamed from: a */
            public void mo97a(final Bundle bundle) {
                if (aVar != null) {
                    this.f75c.post(new Runnable() {
                        public void run() {
                            aVar.mo90a(bundle);
                        }
                    });
                }
            }

            /* renamed from: a */
            public void mo98a(final String str, final Bundle bundle) {
                if (aVar != null) {
                    this.f75c.post(new Runnable() {
                        public void run() {
                            aVar.mo91a(str, bundle);
                        }
                    });
                }
            }

            /* renamed from: b */
            public void mo99b(final String str, final Bundle bundle) {
                if (aVar != null) {
                    this.f75c.post(new Runnable() {
                        public void run() {
                            aVar.mo92b(str, bundle);
                        }
                    });
                }
            }
        };
        C0059e eVar = null;
        try {
            if (!this.f71a.mo118a((C0060f) r0)) {
                return null;
            }
            eVar = new C0059e(this.f71a, r0, this.f72b);
            return eVar;
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: a */
    public boolean mo94a(long j) {
        try {
            return this.f71a.mo117a(j);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
