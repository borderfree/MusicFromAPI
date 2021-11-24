package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd.UnconfirmedClickListener;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import java.util.ArrayList;
import java.util.List;

@C3464ci
public final class aux extends UnifiedNativeAd {

    /* renamed from: a */
    private final auu f13166a;

    /* renamed from: b */
    private final List<Image> f13167b = new ArrayList();

    /* renamed from: c */
    private final atb f13168c;

    /* renamed from: d */
    private final VideoController f13169d = new VideoController();

    /* renamed from: e */
    private final AdChoicesInfo f13170e;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a A[Catch:{ RemoteException -> 0x0055 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a A[Catch:{ RemoteException -> 0x0087 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0020 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public aux(com.google.android.gms.internal.ads.auu r5) {
        /*
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f13167b = r0
            com.google.android.gms.ads.VideoController r0 = new com.google.android.gms.ads.VideoController
            r0.<init>()
            r4.f13169d = r0
            r4.f13166a = r5
            r5 = 0
            com.google.android.gms.internal.ads.auu r0 = r4.f13166a     // Catch:{ RemoteException -> 0x0055 }
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
            java.util.List<com.google.android.gms.ads.formats.NativeAd$Image> r2 = r4.f13167b     // Catch:{ RemoteException -> 0x0055 }
            com.google.android.gms.internal.ads.atb r3 = new com.google.android.gms.internal.ads.atb     // Catch:{ RemoteException -> 0x0055 }
            r3.<init>(r1)     // Catch:{ RemoteException -> 0x0055 }
            r2.add(r3)     // Catch:{ RemoteException -> 0x0055 }
            goto L_0x0020
        L_0x0055:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.C3731me.m19173b(r1, r0)
        L_0x005b:
            com.google.android.gms.internal.ads.auu r0 = r4.f13166a     // Catch:{ RemoteException -> 0x0069 }
            com.google.android.gms.internal.ads.asy r0 = r0.mo12416d()     // Catch:{ RemoteException -> 0x0069 }
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
            r4.f13168c = r1
            com.google.android.gms.internal.ads.auu r0 = r4.f13166a     // Catch:{ RemoteException -> 0x0087 }
            com.google.android.gms.internal.ads.asu r0 = r0.mo12427s()     // Catch:{ RemoteException -> 0x0087 }
            if (r0 == 0) goto L_0x008d
            com.google.android.gms.internal.ads.asx r0 = new com.google.android.gms.internal.ads.asx     // Catch:{ RemoteException -> 0x0087 }
            com.google.android.gms.internal.ads.auu r1 = r4.f13166a     // Catch:{ RemoteException -> 0x0087 }
            com.google.android.gms.internal.ads.asu r1 = r1.mo12427s()     // Catch:{ RemoteException -> 0x0087 }
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x0087 }
            r5 = r0
            goto L_0x008d
        L_0x0087:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.C3731me.m19173b(r1, r0)
        L_0x008d:
            r4.f13170e = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aux.<init>(com.google.android.gms.internal.ads.auu):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C3323b mo9904a() {
        try {
            return this.f13166a.mo12423n();
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
            return null;
        }
    }

    public final void cancelUnconfirmedClick() {
        try {
            this.f13166a.mo12429u();
        } catch (RemoteException e) {
            C3731me.m19173b("Failed to cancelUnconfirmedClick", e);
        }
    }

    public final void destroy() {
        try {
            this.f13166a.mo12428t();
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
        }
    }

    public final AdChoicesInfo getAdChoicesInfo() {
        return this.f13170e;
    }

    public final String getAdvertiser() {
        try {
            return this.f13166a.mo12418f();
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
            return null;
        }
    }

    public final String getBody() {
        try {
            return this.f13166a.mo12414c();
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
            return null;
        }
    }

    public final String getCallToAction() {
        try {
            return this.f13166a.mo12417e();
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
            return null;
        }
    }

    public final Bundle getExtras() {
        try {
            Bundle r = this.f13166a.mo12426r();
            if (r != null) {
                return r;
            }
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
        }
        return new Bundle();
    }

    public final String getHeadline() {
        try {
            return this.f13166a.mo12410a();
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
            return null;
        }
    }

    public final Image getIcon() {
        return this.f13168c;
    }

    public final List<Image> getImages() {
        return this.f13167b;
    }

    public final String getMediationAdapterClassName() {
        try {
            return this.f13166a.mo12425q();
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
            return null;
        }
    }

    public final String getPrice() {
        try {
            return this.f13166a.mo12421i();
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
            return null;
        }
    }

    public final Double getStarRating() {
        try {
            double g = this.f13166a.mo12419g();
            if (g == -1.0d) {
                return null;
            }
            return Double.valueOf(g);
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
            return null;
        }
    }

    public final String getStore() {
        try {
            return this.f13166a.mo12420h();
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            if (this.f13166a.mo12422j() != null) {
                this.f13169d.zza(this.f13166a.mo12422j());
            }
        } catch (RemoteException e) {
            C3731me.m19173b("Exception occurred while getting video controller", e);
        }
        return this.f13169d;
    }

    public final void performClick(Bundle bundle) {
        try {
            this.f13166a.mo12411a(bundle);
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f13166a.mo12413b(bundle);
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f13166a.mo12415c(bundle);
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
        }
    }

    public final void setUnconfirmedClickListener(UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.f13166a.mo12412a((aur) new avi(unconfirmedClickListener));
        } catch (RemoteException e) {
            C3731me.m19173b("Failed to setUnconfirmedClickListener", e);
        }
    }

    public final Object zzbh() {
        try {
            C3323b p = this.f13166a.mo12424p();
            if (p != null) {
                return C3327d.m15137a(p);
            }
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
        }
        return null;
    }
}
