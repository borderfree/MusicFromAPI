package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.ane;
import com.google.android.gms.internal.ads.aqm;

/* renamed from: com.google.android.gms.ads.internal.aa */
final class C2852aa extends WebViewClient {

    /* renamed from: a */
    private final /* synthetic */ zzbp f9933a;

    C2852aa(zzbp zzbp) {
        this.f9933a = zzbp;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.f9933a.f10210g != null) {
            try {
                this.f9933a.f10210g.mo12091a(0);
            } catch (RemoteException e) {
                C3643iy.m19177d("#007 Could not call remote method.", e);
            }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f9933a.mo10251b())) {
            return false;
        }
        if (str.startsWith((String) ane.m16650f().mo12297a(aqm.f12787cu))) {
            if (this.f9933a.f10210g != null) {
                try {
                    this.f9933a.f10210g.mo12091a(3);
                } catch (RemoteException e) {
                    C3643iy.m19177d("#007 Could not call remote method.", e);
                }
            }
            this.f9933a.mo10250a(0);
            return true;
        }
        if (str.startsWith((String) ane.m16650f().mo12297a(aqm.f12788cv))) {
            if (this.f9933a.f10210g != null) {
                try {
                    this.f9933a.f10210g.mo12091a(0);
                } catch (RemoteException e2) {
                    C3643iy.m19177d("#007 Could not call remote method.", e2);
                }
            }
            this.f9933a.mo10250a(0);
            return true;
        }
        if (str.startsWith((String) ane.m16650f().mo12297a(aqm.f12789cw))) {
            if (this.f9933a.f10210g != null) {
                try {
                    this.f9933a.f10210g.mo12093c();
                } catch (RemoteException e3) {
                    C3643iy.m19177d("#007 Could not call remote method.", e3);
                }
            }
            this.f9933a.mo10250a(this.f9933a.mo10248a(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            if (this.f9933a.f10210g != null) {
                try {
                    this.f9933a.f10210g.mo12092b();
                } catch (RemoteException e4) {
                    C3643iy.m19177d("#007 Could not call remote method.", e4);
                }
            }
            this.f9933a.m13678c(this.f9933a.m13675b(str));
            return true;
        }
    }
}
