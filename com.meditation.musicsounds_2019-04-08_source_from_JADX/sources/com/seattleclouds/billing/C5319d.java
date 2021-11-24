package com.seattleclouds.billing;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import com.android.vending.billing.util.C1149b;
import com.android.vending.billing.util.C1149b.C1156a;
import com.android.vending.billing.util.C1149b.C1159d;
import com.android.vending.billing.util.C1149b.C1160e;
import com.android.vending.billing.util.C1161c;
import com.android.vending.billing.util.C1162d;
import com.android.vending.billing.util.C1163e;
import com.android.vending.billing.util.C1164f;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.billing.d */
public class C5319d extends C1149b {

    /* renamed from: o */
    private static boolean f19065o = false;

    /* renamed from: p */
    private static Context f19066p = null;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static C5319d f19067q = null;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static boolean f19068r = false;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static int f19069s = -1;

    /* renamed from: t */
    private Set<String> f19070t = new HashSet();

    /* renamed from: u */
    private Map<String, C1163e> f19071u = new HashMap();

    public C5319d(Context context, String str) {
        super(context, str);
    }

    /* renamed from: a */
    public static void m26606a(Context context, String str, boolean z, final C1159d dVar) {
        if (!f19068r) {
            f19066p = context;
            f19065o = z;
            m26625m("Checking public key.");
            try {
                C1164f.m6298a(str);
                m26625m("Creating IAB helper.");
                f19067q = new C5319d(context, str);
                f19067q.mo5611a(z);
                f19067q.m26619i();
                m26625m("Starting setup.");
                f19067q.mo5605a((C1159d) new C1159d() {
                    /* renamed from: a */
                    public void mo5629a(C1161c cVar) {
                        C5319d.m26625m("Setup finished.");
                        if (!cVar.mo5633c()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Problem setting up in-app billing: ");
                            sb.append(cVar);
                            C5319d.m26624l(sb.toString());
                            if (cVar.mo5631a() == 3) {
                                C5319d.f19069s = 2;
                            }
                            if (dVar != null) {
                                dVar.mo5629a(cVar);
                            }
                        } else if (C5319d.f19067q != null) {
                            C5319d.m26625m("Helper initial setup successful. Querying inventory.");
                            C5319d.f19067q.mo5606a((C1160e) new C1160e() {
                                /* renamed from: a */
                                public void mo5630a(C1161c cVar, C1162d dVar) {
                                    C5319d.m26625m("Query inventory finished.");
                                    C5319d.f19068r = true;
                                    if (C5319d.f19067q != null) {
                                        if (cVar.mo5634d()) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("Failed to query inventory: ");
                                            sb.append(cVar);
                                            C5319d.m26624l(sb.toString());
                                            if (dVar != null) {
                                                dVar.mo5629a(cVar);
                                            }
                                            return;
                                        }
                                        C5319d.m26625m("Query inventory was successful.");
                                        C5319d.f19067q.m26607a(dVar);
                                        C5319d.m26625m("Query inventory processing finished.");
                                        if (dVar != null) {
                                            dVar.mo5629a(new C1161c(0, "Instance setup successful."));
                                        }
                                    }
                                }
                            });
                        }
                    }
                });
            } catch (IllegalArgumentException unused) {
                f19069s = 1;
                Log.e("SCIabHelper", "Could not decode public key and initialize IabHelper");
                if (dVar != null) {
                    dVar.mo5629a(new C1161c(-30001, "Error decoding public key and initializing IabHelper"));
                }
            }
        } else {
            throw new IllegalStateException("SCIAB helper instance is already set up.");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m26607a(C1162d dVar) {
        List<String> a = dVar.mo5637a();
        StringBuilder sb = new StringBuilder();
        sb.append("Owned skus count: ");
        sb.append(a.size());
        m26625m(sb.toString());
        this.f19070t.clear();
        this.f19071u.clear();
        for (String str : a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Owned sku: ");
            sb2.append(str);
            m26625m(sb2.toString());
            C1163e b = dVar.mo5640b(str);
            if (mo17458b(b)) {
                this.f19070t.add(str);
                this.f19071u.put(str, b);
            }
        }
        m26620j();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m26611b(String str, C1156a aVar) {
        C1163e eVar = (C1163e) this.f19071u.get(str);
        if (eVar != null) {
            m26625m("Product present in purchase list. Consuming...");
            f19067q.mo5608a(eVar, aVar);
            return;
        }
        aVar.mo5626a(eVar, new C1161c(-30002, "SKU is not present in purchase list (not owned?)"));
    }

    /* renamed from: c */
    public static C5319d m26613c() {
        if (f19068r) {
            return f19067q;
        }
        return null;
    }

    /* renamed from: d */
    public static void m26614d() {
        if (f19067q != null) {
            f19067q.mo5602a();
            f19067q = null;
            f19068r = false;
        }
    }

    /* renamed from: e */
    public static boolean m26615e() {
        return f19068r;
    }

    /* renamed from: f */
    public static int m26616f() {
        return f19069s;
    }

    /* renamed from: f */
    public static boolean m26617f(String str) {
        return "consumable".equals(str) || "nonConsumable".equals(str);
    }

    /* renamed from: i */
    private void m26619i() {
        m26626n(f19066p.getSharedPreferences("com.seattleclouds.billing.SCIabHelper", 0).getString("settings", ""));
    }

    /* renamed from: j */
    private void m26620j() {
        Editor edit = f19066p.getSharedPreferences("com.seattleclouds.billing.SCIabHelper", 0).edit();
        edit.putString("settings", m26622k());
        edit.commit();
    }

    /* renamed from: k */
    private String m26622k() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ownedSkus", new JSONArray(this.f19070t));
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error converting to JSON: ");
            sb.append(e);
            Log.e("SCIabHelper", sb.toString());
        }
        if (f19065o) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("JSON string: ");
            sb2.append(jSONObject.toString());
            Log.d("SCIabHelper", sb2.toString());
        }
        return jSONObject.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static void m26624l(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("SC In-app billing error: ");
        sb.append(str);
        Log.e("SCIabHelper", sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static void m26625m(String str) {
        if (f19065o) {
            Log.d("SCIabHelper", str);
        }
    }

    /* renamed from: n */
    private void m26626n(String str) {
        if (str != null && str.length() != 0) {
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("ownedSkus");
                this.f19070t = new HashSet();
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.f19070t.add(jSONArray.getString(i));
                }
                if (f19065o) {
                    for (String str2 : this.f19070t) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("read persisted owned sku: ");
                        sb.append(str2);
                        Log.d("SCIabHelper", sb.toString());
                    }
                }
            } catch (JSONException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error parsing JSON: ");
                sb2.append(e);
                Log.e("SCIabHelper", sb2.toString());
            }
        }
    }

    /* renamed from: a */
    public void mo17457a(final String str, final C1156a aVar) {
        if (!this.f19071u.isEmpty()) {
            m26611b(str, aVar);
            return;
        }
        m26625m("Purchases list not yet initialized. Querying...");
        f19067q.mo5606a((C1160e) new C1160e() {
            /* renamed from: a */
            public void mo5630a(C1161c cVar, C1162d dVar) {
                C5319d.m26625m("Query inventory finished.");
                if (C5319d.f19067q != null) {
                    if (cVar.mo5634d()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to query inventory: ");
                        sb.append(cVar);
                        C5319d.m26624l(sb.toString());
                        if (aVar != null) {
                            aVar.mo5626a(null, cVar);
                        }
                        return;
                    }
                    C5319d.m26625m("Query inventory was successful.");
                    C5319d.this.m26607a(dVar);
                    C5319d.m26625m("Query inventory processing finished.");
                    C5319d.this.m26611b(str, aVar);
                }
            }
        });
    }

    /* renamed from: b */
    public boolean mo17458b(C1163e eVar) {
        return true;
    }

    /* renamed from: g */
    public Map<String, C1163e> mo17459g() {
        return this.f19071u;
    }

    /* renamed from: g */
    public boolean mo17460g(String str) {
        return this.f19070t.contains(str);
    }

    /* renamed from: h */
    public void mo17461h(String str) {
        if (this.f19070t.add(str)) {
            m26620j();
        }
    }

    /* renamed from: i */
    public void mo17462i(String str) {
        if (this.f19070t.remove(str)) {
            m26620j();
        }
    }
}
