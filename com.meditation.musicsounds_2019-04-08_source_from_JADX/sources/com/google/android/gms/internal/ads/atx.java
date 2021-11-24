package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.dynamic.C3327d;
import java.util.List;
import java.util.WeakHashMap;

@C3464ci
public final class atx implements NativeCustomTemplateAd {

    /* renamed from: a */
    private static WeakHashMap<IBinder, atx> f13141a = new WeakHashMap<>();

    /* renamed from: b */
    private final atu f13142b;

    /* renamed from: c */
    private final MediaView f13143c;

    /* renamed from: d */
    private final VideoController f13144d = new VideoController();

    private atx(atu atu) {
        Context context;
        this.f13142b = atu;
        MediaView mediaView = null;
        try {
            context = (Context) C3327d.m15137a(atu.mo12405e());
        } catch (RemoteException | NullPointerException e) {
            C3731me.m19173b("", e);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (this.f13142b.mo12399a(C3327d.m15136a(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e2) {
                C3731me.m19173b("", e2);
            }
        }
        this.f13143c = mediaView;
    }

    /* renamed from: a */
    public static atx m17360a(atu atu) {
        synchronized (f13141a) {
            atx atx = (atx) f13141a.get(atu.asBinder());
            if (atx != null) {
                return atx;
            }
            atx atx2 = new atx(atu);
            f13141a.put(atu.asBinder(), atx2);
            return atx2;
        }
    }

    /* renamed from: a */
    public final atu mo12485a() {
        return this.f13142b;
    }

    public final void destroy() {
        try {
            this.f13142b.mo12406f();
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
        }
    }

    public final List<String> getAvailableAssetNames() {
        try {
            return this.f13142b.mo12398a();
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
            return null;
        }
    }

    public final String getCustomTemplateId() {
        try {
            return this.f13142b.mo12372l();
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
            return null;
        }
    }

    public final Image getImage(String str) {
        try {
            asy b = this.f13142b.mo12401b(str);
            if (b != null) {
                return new atb(b);
            }
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
        }
        return null;
    }

    public final CharSequence getText(String str) {
        try {
            return this.f13142b.mo12397a(str);
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            aos c = this.f13142b.mo12402c();
            if (c != null) {
                this.f13144d.zza(c);
            }
        } catch (RemoteException e) {
            C3731me.m19173b("Exception occurred while getting video controller", e);
        }
        return this.f13144d;
    }

    public final MediaView getVideoMediaView() {
        return this.f13143c;
    }

    public final void performClick(String str) {
        try {
            this.f13142b.mo12403c(str);
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
        }
    }

    public final void recordImpression() {
        try {
            this.f13142b.mo12404d();
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
        }
    }
}
