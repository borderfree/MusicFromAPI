package com.seattleclouds.billing;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.p009v4.app.C0374l;
import android.support.p009v4.app.C0396q;
import android.support.p009v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.seattleclouds.App;
import com.seattleclouds.C5391l;
import com.seattleclouds.C5451m.C5452a;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.FragmentInfo;

/* renamed from: com.seattleclouds.billing.c */
public class C5316c extends C5391l implements C5311a {

    /* renamed from: a */
    private String f19047a;

    /* renamed from: ae */
    private TextView f19048ae;

    /* renamed from: af */
    private ProgressBar f19049af;

    /* renamed from: ag */
    private Button f19050ag;

    /* renamed from: ah */
    private View f19051ah;

    /* renamed from: ai */
    private TextView f19052ai;

    /* renamed from: aj */
    private TextView f19053aj;

    /* renamed from: ak */
    private C5312b f19054ak;

    /* renamed from: b */
    private String f19055b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f19056c;

    /* renamed from: d */
    private boolean f19057d = false;

    /* renamed from: e */
    private boolean f19058e;

    /* renamed from: f */
    private boolean f19059f = false;

    /* renamed from: g */
    private PurchaseError f19060g;

    /* renamed from: h */
    private View f19061h;

    /* renamed from: i */
    private View f19062i;

    /* renamed from: a */
    private void m26590a(String str, String str2, boolean z) {
        this.f19060g = new PurchaseError(str, str2, z);
        this.f19059f = true;
        m26592b();
    }

    /* renamed from: b */
    private void m26592b() {
        int i = 0;
        m26596m(false);
        this.f19048ae.setText(this.f19060g.mo17442a());
        Button button = this.f19050ag;
        if (!this.f19060g.mo17443b()) {
            i = 8;
        }
        button.setVisibility(i);
    }

    /* renamed from: c */
    private void m26593c() {
        if (this.f19058e) {
            m26594d();
            this.f19058e = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m26594d() {
        String str;
        String str2;
        if (this.f19047a == null || this.f19047a.length() == 0) {
            str2 = mo1219a(C5462k.purchase_invalid_product_id);
            str = "Invalid product ID";
        } else if (!C5319d.m26617f(this.f19055b)) {
            str2 = mo1219a(C5462k.purchase_invalid_product_type);
            str = "Invalid product type";
        } else if (this.f19056c == null || this.f19056c.length() == 0) {
            str2 = mo1219a(C5462k.purchase_invalid_product_redirect);
            str = "Invalid redirect URL";
        } else if (this.f19057d) {
            this.f19062i.setVisibility(8);
            this.f19051ah.setVisibility(0);
            this.f19052ai.setText(mo1220a(C5462k.purchase_simulation_text, this.f19047a, this.f19055b));
            String str3 = this.f19056c;
            if (this.f19056c.startsWith("file://")) {
                str3 = Uri.parse(this.f19056c).getLastPathSegment();
            }
            TextView textView = this.f19053aj;
            StringBuilder sb = new StringBuilder();
            sb.append("<a href=\"");
            sb.append(this.f19056c);
            sb.append("\">");
            sb.append(str3);
            sb.append("</a> ");
            textView.setText(Html.fromHtml(sb.toString()));
            return;
        } else if (!App.f18482O) {
            str2 = mo1219a(C5462k.purchase_in_app_billing_not_enabled);
            str = "In-app Billing not enabled";
        } else if (this.f19054ak != null) {
            m26596m(true);
            this.f19048ae.setText(C5462k.purchase_processing);
            if (!this.f19054ak.mo17453d()) {
                this.f19054ak.mo1453c();
                return;
            }
            return;
        } else {
            return;
        }
        m26590a(str2, str, false);
    }

    /* renamed from: e */
    private void m26595e() {
        C0374l g = mo1318s().mo1469g();
        Fragment a = g.mo1535a("TAG_IAB_FRAGMENT");
        if (a != null) {
            C0396q a2 = g.mo1536a();
            a2.mo1412a(a);
            a2.mo1428c();
        }
    }

    /* renamed from: m */
    private void m26596m(boolean z) {
        int i = 0;
        this.f19050ag.setVisibility(z ? 8 : 0);
        ProgressBar progressBar = this.f19049af;
        if (!z) {
            i = 8;
        }
        progressBar.setVisibility(i);
    }

    /* renamed from: J */
    public void mo1200J() {
        super.mo1200J();
    }

    /* renamed from: K */
    public void mo1201K() {
        super.mo1201K();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f19061h = layoutInflater.inflate(C5460i.fragment_purchase, viewGroup, false);
        this.f19062i = this.f19061h.findViewById(C5458g.status_container);
        this.f19048ae = (TextView) this.f19061h.findViewById(C5458g.status_text);
        this.f19050ag = (Button) this.f19061h.findViewById(C5458g.retry_button);
        this.f19049af = (ProgressBar) this.f19061h.findViewById(C5458g.progress_indicator);
        this.f19051ah = this.f19061h.findViewById(C5458g.simulation_container);
        this.f19052ai = (TextView) this.f19061h.findViewById(C5458g.simulation_message);
        this.f19053aj = (TextView) this.f19061h.findViewById(C5458g.target_link);
        this.f19050ag.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C5316c.this.m26594d();
            }
        });
        this.f19053aj.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                App.m25620a(App.m25606a(C5316c.this.f19056c, (Context) C5316c.this.mo1318s()), (Fragment) C5316c.this);
            }
        });
        return this.f19061h;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        Bundle m = mo1307m();
        if (m != null) {
            this.f19047a = m.getString("ARG_PRODUCT_ID");
            this.f19055b = m.getString("ARG_PRODUCT_TYPE");
            this.f19056c = m.getString("ARG_REDIRECT_URL");
            if (!(this.f19056c == null || this.f19056c.length() == 0 || this.f19056c.contains("://"))) {
                this.f19056c = App.m25655h(this.f19056c);
            }
            this.f19057d = m.getBoolean("ARG_SIMULATION_MODE", false);
        }
        this.f19058e = true;
        C0374l g = mo1318s().mo1469g();
        if (!this.f19057d) {
            if (bundle == null) {
                this.f19054ak = C5312b.m26570c(mo1307m());
                g.mo1536a().mo1413a((Fragment) this.f19054ak, "TAG_IAB_FRAGMENT").mo1428c();
            } else {
                this.f19054ak = (C5312b) g.mo1535a("TAG_IAB_FRAGMENT");
                this.f19058e = bundle.getBoolean("KEY_INITIALIZATION_NEEDED");
                this.f19059f = bundle.getBoolean("KEY_ERROR");
                this.f19060g = (PurchaseError) bundle.getParcelable("KEY_PURCHASE_ERROR");
            }
            if (this.f19054ak != null) {
                this.f19054ak.mo17452a((C5311a) this);
            }
        }
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        if (mo1323v().mo1535a("TAG_PROVISION_PRODUCT") != null) {
            this.f19062i.setVisibility(8);
            this.f19061h.findViewById(C5458g.page_fragment).setVisibility(0);
        }
        if (this.f19059f) {
            m26592b();
        }
    }

    /* renamed from: a */
    public void mo17450a(PurchaseError purchaseError) {
        this.f19060g = purchaseError;
        this.f19059f = true;
        m26592b();
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (z) {
            m26593c();
        }
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        super.mo1282e(bundle);
        bundle.putBoolean("KEY_INITIALIZATION_NEEDED", this.f19058e);
        bundle.putBoolean("KEY_ERROR", this.f19059f);
        bundle.putParcelable("KEY_PURCHASE_ERROR", this.f19060g);
    }

    /* renamed from: v_ */
    public void mo17451v_() {
        this.f19059f = false;
        m26595e();
        this.f19062i.setVisibility(8);
        FragmentInfo a = App.m25606a(this.f19056c, (Context) mo1318s());
        Fragment a2 = Fragment.m1271a((Context) mo1318s(), a.mo16867a(), a.mo16869b());
        C0396q a3 = mo1323v().mo1536a();
        a3.mo1408a(C5452a.freeze, 0);
        a3.mo1411a(C5458g.page_fragment, a2, "TAG_PROVISION_PRODUCT").mo1428c();
        mo17695c(a2);
        this.f19061h.findViewById(C5458g.page_fragment).setVisibility(0);
    }
}
