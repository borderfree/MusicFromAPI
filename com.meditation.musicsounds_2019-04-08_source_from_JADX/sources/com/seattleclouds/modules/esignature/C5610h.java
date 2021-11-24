package com.seattleclouds.modules.esignature;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.seattleclouds.App;
import com.seattleclouds.appauth.C5279b;
import com.seattleclouds.modules.esignature.utility.Transaction;
import com.seattleclouds.p161f.C5346b;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6595ao;
import java.util.ArrayList;

/* renamed from: com.seattleclouds.modules.esignature.h */
public class C5610h extends C5346b implements C5596a {

    /* renamed from: a */
    private Transaction f19932a;

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        Bundle m = mo1307m();
        if (m != null) {
            this.f19932a = (Transaction) m.getParcelable("transaction");
        }
        if (this.f19932a == null) {
            App.m25625a((Fragment) this);
        }
        if (!App.f18480M && mo1318s() != null) {
            mo1318s().setRequestedOrientation(10);
        }
    }

    /* renamed from: a */
    public void mo18095a(String str) {
        if (mo1318s() != null && !mo1318s().isFinishing()) {
            if (str != null) {
                C6595ao.m31930a((Context) mo1318s(), str, true);
            }
            App.m25635b((Fragment) this);
        }
    }

    /* renamed from: a */
    public void mo18096a(ArrayList<Transaction> arrayList) {
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (!z) {
            return;
        }
        if (!C5279b.m26385c()) {
            C5279b.m26374b((Activity) mo1318s());
        } else if (C6592al.m31909b(this.f19932a.mo18126f())) {
            new C5601c(this, this.f19932a, C5279b.m26389e()).mo8524c((Params[]) new String[0]);
            this.f19172e.setVisibility(0);
        }
    }

    /* renamed from: b */
    public void mo18097b(String str) {
        if (str == null) {
            this.f19172e.setVisibility(8);
            App.m25635b((Fragment) this);
        } else if (C6592al.m31909b(str)) {
            this.f19172e.setVisibility(8);
            App.m25635b((Fragment) this);
        } else {
            this.f19171d.setWebViewClient(new WebViewClient() {
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    C5610h.this.f19172e.setVisibility(8);
                }
            });
            this.f19171d.loadUrl(str);
            this.f19932a.mo18127f(str);
        }
    }
}
