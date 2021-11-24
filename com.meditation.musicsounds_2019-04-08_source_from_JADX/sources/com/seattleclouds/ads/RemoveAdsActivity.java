package com.seattleclouds.ads;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.p009v4.app.C0366g;
import android.support.p009v4.app.C0374l;
import android.support.p009v4.app.C0396q;
import android.support.p009v4.app.Fragment;
import android.support.p023v7.app.C0765d.C0766a;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.billing.util.C1149b.C1158c;
import com.android.vending.billing.util.C1149b.C1159d;
import com.android.vending.billing.util.C1149b.C1160e;
import com.android.vending.billing.util.C1161c;
import com.android.vending.billing.util.C1163e;
import com.seattleclouds.App;
import com.seattleclouds.AppStarterActivity;
import com.seattleclouds.C5323c;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6348n;
import com.seattleclouds.billing.C5319d;
import com.seattleclouds.util.C6593am;
import java.util.ArrayList;
import java.util.List;

public class RemoveAdsActivity extends C6348n {

    /* renamed from: n */
    private static String f18796n = "RemoveAdsFragment";

    /* renamed from: com.seattleclouds.ads.RemoveAdsActivity$a */
    public static class C5239a extends Fragment {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f18797a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C5319d f18798b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f18799c = false;

        /* renamed from: d */
        private C1160e f18800d = new C1160e() {
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0061, code lost:
                if ("subs".equals(r5.mo5648b()) != false) goto L_0x0063;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo5630a(com.android.vending.billing.util.C1161c r4, com.android.vending.billing.util.C1162d r5) {
                /*
                    r3 = this;
                    com.seattleclouds.billing.d r0 = com.seattleclouds.billing.C5319d.m26613c()
                    if (r0 != 0) goto L_0x0007
                    return
                L_0x0007:
                    boolean r0 = r4.mo5634d()
                    if (r0 == 0) goto L_0x002d
                    java.lang.String r5 = "RemoveAdsFragment"
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "Error querying invetory: "
                    r0.append(r1)
                    r0.append(r4)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.e(r5, r0)
                    com.seattleclouds.ads.RemoveAdsActivity$a r5 = com.seattleclouds.ads.RemoveAdsActivity.C5239a.this
                    int r4 = r4.mo5631a()
                    r5.mo17245d(r4)
                    return
                L_0x002d:
                    r4 = 0
                    com.seattleclouds.ads.RemoveAdsActivity$a r0 = com.seattleclouds.ads.RemoveAdsActivity.C5239a.this
                    java.lang.String r0 = r0.f18797a
                    boolean r0 = r5.mo5641c(r0)
                    r1 = 1
                    if (r0 == 0) goto L_0x0064
                    com.seattleclouds.ads.RemoveAdsActivity$a r0 = com.seattleclouds.ads.RemoveAdsActivity.C5239a.this
                    java.lang.String r0 = r0.f18797a
                    com.android.vending.billing.util.g r5 = r5.mo5636a(r0)
                    java.lang.String r0 = "inapp"
                    java.lang.String r2 = r5.mo5648b()
                    boolean r0 = r0.equals(r2)
                    if (r0 == 0) goto L_0x0057
                    com.seattleclouds.ads.RemoveAdsActivity$a r5 = com.seattleclouds.ads.RemoveAdsActivity.C5239a.this
                    r5.m26158c()
                    goto L_0x0063
                L_0x0057:
                    java.lang.String r0 = "subs"
                    java.lang.String r5 = r5.mo5648b()
                    boolean r5 = r0.equals(r5)
                    if (r5 == 0) goto L_0x0064
                L_0x0063:
                    r1 = 0
                L_0x0064:
                    if (r1 == 0) goto L_0x006d
                    com.seattleclouds.ads.RemoveAdsActivity$a r4 = com.seattleclouds.ads.RemoveAdsActivity.C5239a.this
                    int r5 = com.seattleclouds.C5451m.C5462k.remove_ads_error_empty
                    r4.mo17246e(r5)
                L_0x006d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.ads.RemoveAdsActivity.C5239a.C52412.mo5630a(com.android.vending.billing.util.c, com.android.vending.billing.util.d):void");
            }
        };

        /* renamed from: e */
        private C1158c f18801e = new C1158c() {
            /* renamed from: a */
            private boolean m26170a(C1161c cVar) {
                return cVar.mo5631a() == 7;
            }

            /* renamed from: a */
            public void mo5628a(C1161c cVar, C1163e eVar) {
                StringBuilder sb = new StringBuilder();
                sb.append("Purchase finished:");
                sb.append(C5239a.this.f18797a);
                Log.d("RemoveAdsFragment", sb.toString());
                if (C5319d.m26613c() != null) {
                    if (cVar.mo5634d() && !m26170a(cVar)) {
                        C5239a.this.mo17245d(cVar.mo5631a());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Error purchasing:");
                        sb2.append(cVar);
                        Log.d("RemoveAdsFragment", sb2.toString());
                    } else if (!C5239a.this.f18798b.mo17458b(eVar)) {
                        Log.d("RemoveAdsFragment", "Error purchasing. Authenticity verification failed");
                        C5239a.this.mo17246e(C5462k.remove_ads_error_purchasing);
                    } else if (eVar == null || eVar.mo5644b().equals(C5239a.this.f18797a)) {
                        if (m26170a(cVar)) {
                            Log.d("RemoveAdsFragment", "Product already owned");
                            C5239a.this.mo17246e(C5462k.remove_ads_error_owner);
                        } else {
                            Log.d("RemoveAdsFragment", "Purchase successful");
                        }
                        C5239a.this.f18798b.mo17461h(C5239a.this.f18797a);
                        if (eVar != null) {
                            C5239a.this.f18798b.mo17459g().put(C5239a.this.f18797a, eVar);
                            C5260d.m26241a().mo17272b();
                            AppStarterActivity.m25705c((Activity) C5239a.this.mo1318s());
                        }
                    } else {
                        Log.d("RemoveAdsFragment", "Product id and purchase sku don't match");
                        C5239a.this.mo17246e(C5462k.remove_ads_error_not_match_id);
                    }
                }
            }
        };

        /* renamed from: com.seattleclouds.ads.RemoveAdsActivity$a$a */
        public static class C5243a extends C0366g {

            /* renamed from: ae */
            private String f18805ae = null;

            /* renamed from: af */
            private Context f18806af;

            /* renamed from: b */
            public static void m26172b(C0374l lVar, String str) {
                C5243a aVar = new C5243a();
                aVar.mo17247c(str);
                aVar.mo1448a(lVar, "TAG_MESSAGE_DIALOG");
            }

            /* renamed from: a */
            public void mo1228a(Context context) {
                super.mo1228a(context);
                this.f18806af = context;
            }

            /* renamed from: a */
            public void mo1234a(Bundle bundle) {
                super.mo1234a(bundle);
                if (mo1307m() != null) {
                    this.f18805ae = mo1307m().getString("KEY_MESSAGE_DIALOG", "");
                }
            }

            /* renamed from: a */
            public void mo1448a(C0374l lVar, String str) {
                try {
                    C0396q a = lVar.mo1536a();
                    a.mo1413a((Fragment) this, str);
                    a.mo1431d();
                } catch (IllegalStateException e) {
                    Log.d("RemoveAdsFragment", "Exception", e);
                }
            }

            /* renamed from: c */
            public Dialog mo1452c(Bundle bundle) {
                return new C0766a(this.f18806af).mo3063b((CharSequence) this.f18805ae).mo3065b();
            }

            /* renamed from: c */
            public void mo17247c(String str) {
                Bundle bundle = new Bundle();
                bundle.putString("KEY_MESSAGE_DIALOG", str);
                mo1289g(bundle);
            }

            public void onDismiss(DialogInterface dialogInterface) {
                super.onDismiss(dialogInterface);
                if (mo1318s() != null) {
                    mo1318s().finish();
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m26158c() {
            try {
                this.f18798b.mo5603a(mo1318s(), this.f18797a, 10001, this.f18801e, "");
            } catch (IllegalStateException unused) {
            }
        }

        /* renamed from: L */
        public void mo1202L() {
            super.mo1202L();
            if (C5319d.m26615e()) {
                C5319d.m26614d();
            }
        }

        /* renamed from: a */
        public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            return layoutInflater.inflate(C5460i.fragment_removeads, viewGroup, false);
        }

        /* renamed from: a */
        public void mo1234a(Bundle bundle) {
            super.mo1234a(bundle);
            if (bundle != null) {
                this.f18799c = bundle.getBoolean("KEY_PRODUCT_IS_CALL", false);
            }
            mo1280d(true);
            if (this.f18799c) {
                return;
            }
            if (C5319d.m26613c() != null) {
                mo1450b();
                this.f18799c = true;
            } else if (App.f18482O) {
                C5319d.m26606a(mo1316q(), C5323c.m26640b(), false, new C1159d() {
                    /* renamed from: a */
                    public void mo5629a(C1161c cVar) {
                        if (cVar.mo5633c()) {
                            if (!C5239a.this.f18799c) {
                                C5239a.this.mo1450b();
                                C5239a.this.f18799c = true;
                            }
                        } else if (C5239a.this.mo1318s() != null) {
                            C5239a.this.mo17246e(C5462k.remove_ads_error_authentication);
                        }
                    }
                });
            } else if (mo1318s() != null) {
                mo17246e(C5462k.remove_ads_error_authentication);
            }
        }

        /* renamed from: b */
        public void mo1450b() {
            int i;
            if (!AdsManagerKeys.m26119b().mo17222c()) {
                i = C5462k.remove_ads_error_not_paid;
            } else {
                this.f18797a = AdsManagerKeys.m26119b().mo17236q();
                if (this.f18797a.isEmpty()) {
                    i = C5462k.remove_ads_error_not_found;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f18797a);
                    this.f18798b = C5319d.m26613c();
                    if (this.f18798b != null) {
                        this.f18798b.mo5612a(true, (List<String>) arrayList, this.f18800d);
                    }
                    return;
                }
            }
            mo17246e(i);
        }

        /* renamed from: d */
        public void mo17245d(int i) {
            int i2;
            if (mo1318s() != null) {
                Resources resources = mo1318s().getResources();
                if (i != 3) {
                    switch (i) {
                        case -1010:
                            i2 = C5462k.remove_ads_error_invalid_consumption;
                            break;
                        case -1009:
                            i2 = C5462k.remove_ads_error_subscriptions_not_available;
                            break;
                        case -1008:
                            i2 = C5462k.remove_ads_error_unknown_error;
                            break;
                        case -1007:
                            i2 = C5462k.remove_ads_error_missing_token;
                            break;
                        case -1005:
                            i2 = C5462k.remove_ads_error_user_cancelled;
                            break;
                        case -1004:
                            i2 = C5462k.remove_ads_error_send_intent;
                            break;
                        case -1003:
                            i2 = C5462k.remove_ads_error_purchase_signature;
                            break;
                        case -1002:
                            i2 = C5462k.remove_ads_error_bad_response;
                            break;
                        case -1001:
                            i2 = C5462k.remove_ads_error_remote_exception;
                            break;
                        case -1000:
                            i2 = C5462k.remove_ads_error_unknown_iab;
                            break;
                        default:
                            i2 = C5462k.remove_ads_error_unknown_purchase;
                            break;
                    }
                } else {
                    i2 = C5462k.remove_ads_error_authentication;
                }
                C5243a.m26172b(mo1322u(), resources.getString(i2));
            }
        }

        /* renamed from: e */
        public void mo17246e(int i) {
            if (mo1318s() != null) {
                C5243a.m26172b(mo1322u(), mo1318s().getResources().getString(i));
            }
        }

        /* renamed from: e */
        public void mo1282e(Bundle bundle) {
            bundle.putBoolean("KEY_PRODUCT_IS_CALL", this.f18799c);
        }
    }

    /* renamed from: a */
    public static void m26153a(Activity activity) {
        if (AdsManagerKeys.m26119b().mo17222c() && !AdsManagerKeys.m26119b().mo17236q().isEmpty()) {
            activity.startActivity(new Intent(activity, RemoveAdsActivity.class));
        }
    }

    /* renamed from: m */
    private void m26154m() {
        mo1469g().mo1536a().mo1413a((Fragment) new C5239a(), f18796n).mo1428c();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C6593am.m31916a(this);
        super.onCreate(bundle);
        if (((C5239a) mo1469g().mo1535a(f18796n)) == null) {
            m26154m();
        }
        getWindow().setBackgroundDrawableResource(17170445);
        getWindow().getDecorView().setBackgroundResource(17170445);
    }
}
