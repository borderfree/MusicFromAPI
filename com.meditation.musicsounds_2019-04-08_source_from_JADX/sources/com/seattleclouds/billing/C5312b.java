package com.seattleclouds.billing;

import android.os.Bundle;
import android.support.p009v4.app.C0367h;
import android.util.Log;
import com.android.vending.billing.util.C1149b.C1156a;
import com.android.vending.billing.util.C1149b.C1158c;
import com.android.vending.billing.util.C1149b.C1160e;
import com.android.vending.billing.util.C1161c;
import com.android.vending.billing.util.C1162d;
import com.android.vending.billing.util.C1163e;
import com.android.vending.billing.util.C1165g;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.seattleclouds.billing.b */
public class C5312b extends C6557s {

    /* renamed from: a */
    private boolean f19033a = false;
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public C1156a f19034ae = new C1156a() {
        /* renamed from: a */
        public void mo5626a(C1163e eVar, C1161c cVar) {
            C5312b bVar = C5312b.this;
            StringBuilder sb = new StringBuilder();
            sb.append("Consumption finished. Purchase: ");
            sb.append(eVar);
            sb.append(", result: ");
            sb.append(cVar);
            bVar.m26574d(sb.toString());
            if (C5319d.m26613c() != null) {
                if (cVar.mo5633c()) {
                    C5312b.this.m26574d("Consumable product consumption successful. Provisioning...");
                    C5312b.this.f19038d.mo17462i(C5312b.this.f19039e);
                    C5312b.this.f19038d.mo17459g().remove(eVar);
                    C5312b.this.m26565as();
                } else {
                    C5312b bVar2 = C5312b.this;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error while consuming: ");
                    sb2.append(cVar);
                    bVar2.m26572c(sb2.toString());
                }
                C5312b.this.m26574d("End consumption flow.");
            }
        }
    };

    /* renamed from: af */
    private C1160e f19035af = new C1160e() {
        /* renamed from: a */
        public void mo5630a(C1161c cVar, C1162d dVar) {
            if (C5319d.m26613c() != null) {
                if (cVar.mo5634d()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error querying invetory: ");
                    sb.append(cVar);
                    Log.e("IabFragment", sb.toString());
                    return;
                }
                boolean z = true;
                if (dVar.mo5641c(C5312b.this.f19039e)) {
                    C1165g a = dVar.mo5636a(C5312b.this.f19039e);
                    if ("inapp".equals(a.mo5648b())) {
                        C5312b.this.m26575e();
                    } else if ("subs".equals(a.mo5648b())) {
                        C5312b.this.m26561a(C5462k.purchase_invalid_product, "Invalid product Id", false);
                    }
                    z = false;
                }
                if (z) {
                    C5312b.this.m26572c("Invalid product type: Error querying inventory");
                }
            }
        }
    };

    /* renamed from: b */
    private volatile boolean f19036b = false;

    /* renamed from: c */
    private volatile boolean f19037c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C5319d f19038d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f19039e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f19040f;

    /* renamed from: g */
    private String f19041g;

    /* renamed from: h */
    private C5311a f19042h;

    /* renamed from: i */
    private C1158c f19043i = new C1158c() {
        /* renamed from: a */
        private boolean m26585a(C1161c cVar) {
            return cVar.mo5631a() == 7;
        }

        /* renamed from: a */
        public void mo5628a(C1161c cVar, C1163e eVar) {
            C5312b bVar;
            String str;
            C5312b bVar2 = C5312b.this;
            StringBuilder sb = new StringBuilder();
            sb.append("Purchase finished: ");
            sb.append(cVar);
            sb.append(", purchase: ");
            sb.append(eVar);
            bVar2.m26574d(sb.toString());
            if (C5319d.m26613c() != null) {
                if (cVar.mo5634d() && !m26585a(cVar)) {
                    C5312b bVar3 = C5312b.this;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error purchasing: ");
                    sb2.append(cVar);
                    bVar3.m26572c(sb2.toString());
                } else if (!C5312b.this.f19038d.mo17458b(eVar)) {
                    C5312b.this.m26572c("Error purchasing. Authenticity verification failed");
                } else if (eVar == null || eVar.mo5644b().equals(C5312b.this.f19039e)) {
                    if (m26585a(cVar)) {
                        bVar = C5312b.this;
                        str = "Product already owned";
                    } else {
                        bVar = C5312b.this;
                        str = "Purchase successful";
                    }
                    bVar.m26574d(str);
                    C5312b.this.f19038d.mo17461h(C5312b.this.f19039e);
                    if (eVar != null) {
                        C5312b.this.f19038d.mo17459g().put(C5312b.this.f19039e, eVar);
                    }
                    if (C5312b.this.f19040f.equals("consumable")) {
                        C5312b.this.m26574d("Consumable product purchased. Starting consumption...");
                        if (eVar != null) {
                            C5312b.this.f19038d.mo5608a(eVar, C5312b.this.f19034ae);
                        } else {
                            C5312b.this.f19038d.mo17457a(C5312b.this.f19039e, C5312b.this.f19034ae);
                        }
                    } else {
                        C5312b.this.m26574d("Non-consumable product purchased. Provisioning...");
                        C5312b.this.m26565as();
                    }
                } else {
                    C5312b.this.m26572c("Product id and purchase sku don't match");
                }
            }
        }
    };

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m26561a(int i, String str, boolean z) {
        C0367h s = mo1318s();
        if (s != null) {
            m26564a(s.getString(i), str, z);
        }
    }

    /* renamed from: a */
    private void m26564a(String str, String str2, boolean z) {
        this.f19033a = false;
        PurchaseError purchaseError = new PurchaseError(str, str2, z);
        if (this.f19042h != null) {
            this.f19042h.mo17450a(purchaseError);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: as */
    public void m26565as() {
        boolean z;
        if (this.f19036b) {
            m26566at();
            z = false;
        } else {
            z = true;
        }
        this.f19037c = z;
    }

    /* renamed from: at */
    private void m26566at() {
        if (this.f19042h != null) {
            this.f19042h.mo17451v_();
        }
    }

    /* renamed from: az */
    private void m26567az() {
        int i;
        String str;
        if (C5319d.m26616f() == 1) {
            i = C5462k.purchase_invalid_public_key;
            str = "Invalid public key";
        } else if (C5319d.m26616f() == 2) {
            i = C5462k.purchase_error_billing_unavailable_on_device;
            str = "Billing unavailable on device";
        } else {
            m26572c("Instance not yet setup");
            return;
        }
        m26561a(i, str, false);
    }

    /* renamed from: c */
    public static C5312b m26570c(Bundle bundle) {
        C5312b bVar = new C5312b();
        bVar.mo1289g(bundle);
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m26572c(String str) {
        m26561a(C5462k.purchase_error_generic, str, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m26574d(String str) {
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m26575e() {
        StringBuilder sb = new StringBuilder();
        sb.append("Launching purchase flow for product id: ");
        sb.append(this.f19039e);
        sb.append(", product type: ");
        sb.append(this.f19040f);
        sb.append(", redirect url: ");
        sb.append(this.f19041g);
        m26574d(sb.toString());
        try {
            this.f19038d.mo5603a(mo1318s(), this.f19039e, 10001, this.f19043i, "");
        } catch (IllegalStateException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot start purchase, illegal state: ");
            sb2.append(e);
            m26572c(sb2.toString());
        }
    }

    /* renamed from: J */
    public void mo1200J() {
        super.mo1200J();
        if (this.f19037c) {
            m26566at();
        }
        this.f19036b = true;
    }

    /* renamed from: K */
    public void mo1201K() {
        super.mo1201K();
        this.f19036b = false;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        mo1280d(true);
        super.mo1234a(bundle);
        Bundle m = mo1307m();
        this.f19039e = m.getString("ARG_PRODUCT_ID");
        this.f19040f = m.getString("ARG_PRODUCT_TYPE");
        this.f19041g = m.getString("ARG_REDIRECT_URL");
        this.f19036b = true;
    }

    /* renamed from: a */
    public void mo17452a(C5311a aVar) {
        this.f19042h = aVar;
    }

    /* renamed from: b */
    public void mo1450b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f19039e);
        this.f19038d = C5319d.m26613c();
        if (this.f19038d != null) {
            this.f19038d.mo5612a(true, (List<String>) arrayList, this.f19035af);
        } else {
            m26567az();
        }
    }

    /* renamed from: c */
    public void mo1453c() {
        this.f19033a = true;
        this.f19038d = C5319d.m26613c();
        if (this.f19038d == null) {
            m26567az();
        } else if (this.f19038d.mo17460g(this.f19039e)) {
            if (this.f19040f.equals("consumable")) {
                m26574d("Consumable product already owned, consuming...");
                this.f19038d.mo17457a(this.f19039e, this.f19034ae);
            } else {
                m26574d("Product already owned, provisioning");
                m26565as();
            }
        } else {
            mo1450b();
        }
    }

    /* renamed from: d */
    public boolean mo17453d() {
        return this.f19033a;
    }
}
