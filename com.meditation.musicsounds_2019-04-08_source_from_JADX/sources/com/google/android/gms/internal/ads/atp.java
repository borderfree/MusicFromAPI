package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.dynamic.C3323b;
import java.util.ArrayList;
import java.util.List;

@C3464ci
public final class atp extends NativeAppInstallAd {

    /* renamed from: a */
    private final atm f13131a;

    /* renamed from: b */
    private final List<Image> f13132b = new ArrayList();

    /* renamed from: c */
    private final atb f13133c;

    /* renamed from: d */
    private final VideoController f13134d = new VideoController();

    /* renamed from: e */
    private final AdChoicesInfo f13135e;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a A[Catch:{ RemoteException -> 0x0055 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a A[Catch:{ RemoteException -> 0x0087 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0020 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public atp(com.google.android.gms.internal.ads.atm r5) {
        /*
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f13132b = r0
            com.google.android.gms.ads.VideoController r0 = new com.google.android.gms.ads.VideoController
            r0.<init>()
            r4.f13134d = r0
            r4.f13131a = r5
            r5 = 0
            com.google.android.gms.internal.ads.atm r0 = r4.f13131a     // Catch:{ RemoteException -> 0x0055 }
            java.util.List r0 = r0.mo12360b()     // Catch:{ RemoteException -> 0x0055 }
            if (r0 == 0) goto L_0x005b
            java.util.Iterator r0 = r0.iterator()     // Catch:{ RemoteException -> 0x0055 }
        L_0x0020:
            boolean r1 = r0.hasNext()     // Catch:{ RemoteException -> 0x0055 }
            if (r1 == 0) goto L_0x005b
            java.lang.Object r1 = r0.next()     // Catch:{ RemoteException -> 0x0055 }
            boolean r2 = r1 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0055 }
            if (r2 == 0) goto L_0x0047
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch:{ RemoteException -> 0x0055 }
            if (r1 == 0) goto L_0x0047
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch:{ RemoteException -> 0x0055 }
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.asy     // Catch:{ RemoteException -> 0x0055 }
            if (r3 == 0) goto L_0x0040
            r1 = r2
            com.google.android.gms.internal.ads.asy r1 = (com.google.android.gms.internal.ads.asy) r1     // Catch:{ RemoteException -> 0x0055 }
            goto L_0x0048
        L_0x0040:
            com.google.android.gms.internal.ads.ata r2 = new com.google.android.gms.internal.ads.ata     // Catch:{ RemoteException -> 0x0055 }
            r2.<init>(r1)     // Catch:{ RemoteException -> 0x0055 }
            r1 = r2
            goto L_0x0048
        L_0x0047:
            r1 = r5
        L_0x0048:
            if (r1 == 0) goto L_0x0020
            java.util.List<com.google.android.gms.ads.formats.NativeAd$Image> r2 = r4.f13132b     // Catch:{ RemoteException -> 0x0055 }
            com.google.android.gms.internal.ads.atb r3 = new com.google.android.gms.internal.ads.atb     // Catch:{ RemoteException -> 0x0055 }
            r3.<init>(r1)     // Catch:{ RemoteException -> 0x0055 }
            r2.add(r3)     // Catch:{ RemoteException -> 0x0055 }
            goto L_0x0020
        L_0x0055:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.C3731me.m19173b(r1, r0)
        L_0x005b:
            com.google.android.gms.internal.ads.atm r0 = r4.f13131a     // Catch:{ RemoteException -> 0x0069 }
            com.google.android.gms.internal.ads.asy r0 = r0.mo12364d()     // Catch:{ RemoteException -> 0x0069 }
            if (r0 == 0) goto L_0x006f
            com.google.android.gms.internal.ads.atb r1 = new com.google.android.gms.internal.ads.atb     // Catch:{ RemoteException -> 0x0069 }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x0069 }
            goto L_0x0070
        L_0x0069:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.C3731me.m19173b(r1, r0)
        L_0x006f:
            r1 = r5
        L_0x0070:
            r4.f13133c = r1
            com.google.android.gms.internal.ads.atm r0 = r4.f13131a     // Catch:{ RemoteException -> 0x0087 }
            com.google.android.gms.internal.ads.asu r0 = r0.mo12378r()     // Catch:{ RemoteException -> 0x0087 }
            if (r0 == 0) goto L_0x008d
            com.google.android.gms.internal.ads.asx r0 = new com.google.android.gms.internal.ads.asx     // Catch:{ RemoteException -> 0x0087 }
            com.google.android.gms.internal.ads.atm r1 = r4.f13131a     // Catch:{ RemoteException -> 0x0087 }
            com.google.android.gms.internal.ads.asu r1 = r1.mo12378r()     // Catch:{ RemoteException -> 0x0087 }
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x0087 }
            r5 = r0
            goto L_0x008d
        L_0x0087:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.C3731me.m19173b(r1, r0)
        L_0x008d:
            r4.f13135e = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.atp.<init>(com.google.android.gms.internal.ads.atm):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C3323b mo9796a() {
        try {
            return this.f13131a.mo12370j();
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
            return null;
        }
    }

    public final void destroy() {
        try {
            this.f13131a.mo12379s();
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
        }
    }

    public final AdChoicesInfo getAdChoicesInfo() {
        return this.f13135e;
    }

    public final CharSequence getBody() {
        try {
            return this.f13131a.mo12362c();
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
            return null;
        }
    }

    public final CharSequence getCallToAction() {
        try {
            return this.f13131a.mo12365e();
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
            return null;
        }
    }

    public final Bundle getExtras() {
        try {
            return this.f13131a.mo12374n();
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
            return null;
        }
    }

    public final CharSequence getHeadline() {
        try {
            return this.f13131a.mo12357a();
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
            return null;
        }
    }

    public final Image getIcon() {
        return this.f13133c;
    }

    public final List<Image> getImages() {
        return this.f13132b;
    }

    public final CharSequence getMediationAdapterClassName() {
        try {
            return this.f13131a.mo12377q();
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
            return null;
        }
    }

    public final CharSequence getPrice() {
        try {
            return this.f13131a.mo12368h();
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
            return null;
        }
    }

    public final Double getStarRating() {
        try {
            double f = this.f13131a.mo12366f();
            if (f == -1.0d) {
                return null;
            }
            return Double.valueOf(f);
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
            return null;
        }
    }

    public final CharSequence getStore() {
        try {
            return this.f13131a.mo12367g();
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            if (this.f13131a.mo12369i() != null) {
                this.f13134d.zza(this.f13131a.mo12369i());
            }
        } catch (RemoteException e) {
            C3731me.m19173b("Exception occurred while getting video controller", e);
        }
        return this.f13134d;
    }

    public final void performClick(Bundle bundle) {
        try {
            this.f13131a.mo12358a(bundle);
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f13131a.mo12361b(bundle);
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f13131a.mo12363c(bundle);
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
        }
    }
}
