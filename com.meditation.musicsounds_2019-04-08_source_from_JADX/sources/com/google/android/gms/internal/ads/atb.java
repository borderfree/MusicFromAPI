package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;

@C3464ci
public final class atb extends Image {

    /* renamed from: a */
    private final asy f13127a;

    /* renamed from: b */
    private final Drawable f13128b;

    /* renamed from: c */
    private final Uri f13129c;

    /* renamed from: d */
    private final double f13130d;

    public atb(asy asy) {
        Drawable drawable;
        this.f13127a = asy;
        Uri uri = null;
        try {
            C3323b a = this.f13127a.mo12354a();
            if (a != null) {
                drawable = (Drawable) C3327d.m15137a(a);
                this.f13128b = drawable;
                uri = this.f13127a.mo12355b();
                this.f13129c = uri;
                double d = 1.0d;
                d = this.f13127a.mo12356c();
                this.f13130d = d;
            }
        } catch (RemoteException e) {
            C3731me.m19173b("", e);
        }
        drawable = null;
        this.f13128b = drawable;
        try {
            uri = this.f13127a.mo12355b();
        } catch (RemoteException e2) {
            C3731me.m19173b("", e2);
        }
        this.f13129c = uri;
        double d2 = 1.0d;
        try {
            d2 = this.f13127a.mo12356c();
        } catch (RemoteException e3) {
            C3731me.m19173b("", e3);
        }
        this.f13130d = d2;
    }

    public final Drawable getDrawable() {
        return this.f13128b;
    }

    public final double getScale() {
        return this.f13130d;
    }

    public final Uri getUri() {
        return this.f13129c;
    }
}
