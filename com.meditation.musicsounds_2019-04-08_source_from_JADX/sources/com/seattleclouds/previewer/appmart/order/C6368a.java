package com.seattleclouds.previewer.appmart.order;

import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask.Status;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.C0374l;
import android.support.p009v4.app.C0394o;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.api.C5268b;
import com.seattleclouds.api.C5270d;
import com.seattleclouds.api.SCApiException;
import com.seattleclouds.previewer.appmart.order.p190b.C6388a;
import com.seattleclouds.previewer.appmart.order.p190b.C6389b;
import com.seattleclouds.previewer.appmart.order.p191c.C6390a;
import com.seattleclouds.previewer.appmart.order.p191c.C6402b;
import com.seattleclouds.previewer.appmart.order.p191c.C6411c;
import com.seattleclouds.previewer.appmart.order.p191c.C6412d;
import com.seattleclouds.previewer.appmart.order.p191c.C6427e;
import com.seattleclouds.previewer.appmart.order.p191c.C6433f;
import com.seattleclouds.previewer.appmart.order.p191c.C6434g;
import com.seattleclouds.util.C6619m;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.previewer.appmart.order.a */
public class C6368a extends C6557s {

    /* renamed from: a */
    public static boolean f22596a;

    /* renamed from: ae */
    private C6372a f22597ae;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public C6412d f22598af;

    /* renamed from: ag */
    private ProgressDialog f22599ag;

    /* renamed from: ah */
    private RadioGroup f22600ah;

    /* renamed from: ai */
    private Toast f22601ai = null;

    /* renamed from: aj */
    private C6375d f22602aj;

    /* renamed from: b */
    private ViewPager f22603b;

    /* renamed from: c */
    private TextView f22604c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public TextView f22605d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public TextView f22606e;

    /* renamed from: f */
    private int f22607f = 0;

    /* renamed from: g */
    private C6373b f22608g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C6388a f22609h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f22610i = false;

    /* renamed from: com.seattleclouds.previewer.appmart.order.a$a */
    private class C6372a extends C5270d<String, Void, String> {

        /* renamed from: b */
        private String f22615b = null;

        public C6372a(Fragment fragment) {
            super(fragment);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo17335a(String... strArr) {
            String str = strArr[0];
            if (strArr.length > 1) {
                this.f22615b = strArr[1];
            }
            String str2 = null;
            try {
                JSONObject g = C5268b.m26272a().mo17323g(str);
                if (g.has("abcId")) {
                    C6368a.this.f22609h.mo19936w(g.getString("abcId"));
                } else if (g.has("subscriptionId")) {
                    C6368a.this.f22609h.mo19938x(g.getString("subscriptionId"));
                } else {
                    if (g.has("plans")) {
                        JSONArray optJSONArray = g.optJSONArray("plans");
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            C6389b bVar = new C6389b();
                            JSONObject jSONObject = optJSONArray.getJSONObject(i);
                            bVar.mo19945a(jSONObject.getString("displayName"));
                            bVar.mo19947b(jSONObject.getString("name"));
                            bVar.mo19944a(jSONObject.getInt("price"));
                            if (bVar.mo19950d() != null) {
                                bVar.mo19949c(bVar.mo19950d().replaceAll(",", " \n - "));
                            }
                            arrayList.add(bVar);
                        }
                        C6368a.this.f22609h.mo19889a(arrayList);
                    }
                    return str2;
                }
                str2 = "ok";
                return str2;
            } catch (SCApiException e) {
                e.printStackTrace();
                if (e.getDetails().has("message")) {
                    str2 = e.getDetails().getString("message");
                }
                return str2;
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0077, code lost:
            if (com.seattleclouds.previewer.appmart.order.C6368a.m30940e(r3.f22614a).mo19852C() != false) goto L_0x00c5;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPostExecute(java.lang.String r4) {
            /*
                r3 = this;
                super.onPostExecute(r4)
                if (r4 == 0) goto L_0x00ea
                java.lang.String r0 = "ok"
                boolean r0 = r4.equals(r0)
                r1 = 0
                if (r0 == 0) goto L_0x00d4
                java.lang.String r4 = r3.f22615b
                r0 = 1
                if (r4 == 0) goto L_0x007a
                java.lang.String r4 = r3.f22615b
                java.lang.String r2 = "device_visible"
                boolean r4 = r4.equals(r2)
                if (r4 == 0) goto L_0x007a
                com.seattleclouds.previewer.appmart.order.a r4 = com.seattleclouds.previewer.appmart.order.C6368a.this
                com.seattleclouds.previewer.appmart.order.b.a r4 = r4.f22609h
                boolean r4 = r4.mo19848A()
                if (r4 == 0) goto L_0x005c
                com.seattleclouds.previewer.appmart.order.a r4 = com.seattleclouds.previewer.appmart.order.C6368a.this
                com.seattleclouds.previewer.appmart.order.a r2 = com.seattleclouds.previewer.appmart.order.C6368a.this
                android.support.v4.app.Fragment r2 = r2.m30939e(r1)
                com.seattleclouds.previewer.appmart.order.c.d r2 = (com.seattleclouds.previewer.appmart.order.p191c.C6412d) r2
                r4.f22598af = r2
                com.seattleclouds.previewer.appmart.order.a r4 = com.seattleclouds.previewer.appmart.order.C6368a.this
                com.seattleclouds.previewer.appmart.order.c.d r4 = r4.f22598af
                if (r4 == 0) goto L_0x0053
                com.seattleclouds.previewer.appmart.order.a r4 = com.seattleclouds.previewer.appmart.order.C6368a.this
                com.seattleclouds.previewer.appmart.order.c.d r4 = r4.f22598af
                boolean r4 = r4.mo1326y()
                if (r4 == 0) goto L_0x0053
                com.seattleclouds.previewer.appmart.order.a r4 = com.seattleclouds.previewer.appmart.order.C6368a.this
                com.seattleclouds.previewer.appmart.order.c.d r4 = r4.f22598af
                r4.mo1450b()
            L_0x0053:
                com.seattleclouds.previewer.appmart.order.a r4 = com.seattleclouds.previewer.appmart.order.C6368a.this
                com.seattleclouds.previewer.appmart.order.b.a r4 = r4.f22609h
                r4.mo19890a(r0)
            L_0x005c:
                com.seattleclouds.previewer.appmart.order.a r4 = com.seattleclouds.previewer.appmart.order.C6368a.this
                com.seattleclouds.previewer.appmart.order.b.a r4 = r4.f22609h
                boolean r4 = r4.mo19850B()
                if (r4 == 0) goto L_0x006d
                com.seattleclouds.previewer.appmart.order.a r4 = com.seattleclouds.previewer.appmart.order.C6368a.this
                r4.m30948n(r1)
            L_0x006d:
                com.seattleclouds.previewer.appmart.order.a r4 = com.seattleclouds.previewer.appmart.order.C6368a.this
                com.seattleclouds.previewer.appmart.order.b.a r4 = r4.f22609h
                boolean r4 = r4.mo19852C()
                if (r4 == 0) goto L_0x00ca
                goto L_0x00c5
            L_0x007a:
                com.seattleclouds.previewer.appmart.order.a r4 = com.seattleclouds.previewer.appmart.order.C6368a.this
                com.seattleclouds.previewer.appmart.order.b.a r4 = r4.f22609h
                boolean r4 = r4.mo19850B()
                if (r4 == 0) goto L_0x00c0
                com.seattleclouds.previewer.appmart.order.a r4 = com.seattleclouds.previewer.appmart.order.C6368a.this
                com.seattleclouds.previewer.appmart.order.b.a r4 = r4.f22609h
                boolean r4 = r4.mo19848A()
                if (r4 == 0) goto L_0x00a6
                com.seattleclouds.previewer.appmart.order.a r4 = com.seattleclouds.previewer.appmart.order.C6368a.this
                com.seattleclouds.previewer.appmart.order.b.a r4 = r4.f22609h
                r4.mo19890a(r0)
                com.seattleclouds.previewer.appmart.order.a r4 = com.seattleclouds.previewer.appmart.order.C6368a.this
                com.seattleclouds.previewer.appmart.order.b.a r4 = r4.f22609h
                java.lang.String r2 = "Android"
                r4.mo19914l(r2)
            L_0x00a6:
                com.seattleclouds.previewer.appmart.order.a r4 = com.seattleclouds.previewer.appmart.order.C6368a.this
                android.widget.TextView r4 = r4.f22605d
                r2 = 8
                r4.setVisibility(r2)
                com.seattleclouds.previewer.appmart.order.a r4 = com.seattleclouds.previewer.appmart.order.C6368a.this
                android.widget.TextView r4 = r4.f22606e
                r4.setVisibility(r1)
                com.seattleclouds.previewer.appmart.order.a r4 = com.seattleclouds.previewer.appmart.order.C6368a.this
                r4.m30948n(r1)
                goto L_0x00ca
            L_0x00c0:
                com.seattleclouds.previewer.appmart.order.a r4 = com.seattleclouds.previewer.appmart.order.C6368a.this
                r4.f22610i = r1
            L_0x00c5:
                com.seattleclouds.previewer.appmart.order.a r4 = com.seattleclouds.previewer.appmart.order.C6368a.this
                r4.m30948n(r0)
            L_0x00ca:
                com.seattleclouds.previewer.appmart.order.a r4 = com.seattleclouds.previewer.appmart.order.C6368a.this
                com.seattleclouds.previewer.appmart.order.b.a r4 = r4.f22609h
                r4.mo19898d(r0)
                goto L_0x00ea
            L_0x00d4:
                com.seattleclouds.previewer.appmart.order.a r0 = com.seattleclouds.previewer.appmart.order.C6368a.this
                android.support.v4.app.h r0 = r0.mo1318s()
                android.widget.Toast r4 = android.widget.Toast.makeText(r0, r4, r1)
                r4.show()
                com.seattleclouds.previewer.appmart.order.a r4 = com.seattleclouds.previewer.appmart.order.C6368a.this
                com.seattleclouds.previewer.appmart.order.b.a r4 = r4.f22609h
                r4.mo19898d(r1)
            L_0x00ea:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.previewer.appmart.order.C6368a.C6372a.onPostExecute(java.lang.String):void");
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* renamed from: com.seattleclouds.previewer.appmart.order.a$b */
    private class C6373b extends C5270d<String, Void, String> {
        public C6373b(Fragment fragment) {
            super(fragment);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo17335a(String... strArr) {
            try {
                C6368a.this.f22609h = C6388a.m31014a();
                C5268b a = C5268b.m26272a();
                String str = App.f18523y;
                String b = C6368a.this.f22609h.mo19857F().mo19946b();
                String H = C6368a.this.f22609h.mo19861H();
                String I = C6368a.this.f22609h.mo19863I();
                String J = C6368a.this.f22609h.mo19865J();
                String K = C6368a.this.f22609h.mo19867K();
                String T = C6368a.this.f22609h.mo19879T();
                String L = C6368a.this.f22609h.mo19869L();
                String M = C6368a.this.f22609h.mo19871M();
                StringBuilder sb = new StringBuilder();
                sb.append(C6368a.this.f22609h.mo19873N());
                sb.append(" ");
                sb.append(C6368a.this.f22609h.mo19874O());
                JSONObject a2 = a.mo17305a(str, b, H, I, J, K, T, L, M, sb.toString(), C6368a.this.f22609h.mo19859G(), C6368a.this.f22609h.mo19878S(), C6368a.this.f22609h.mo19877R(), C6368a.this.f22609h.mo19875P(), C6368a.this.f22609h.mo19876Q());
                if (!a2.has("subscriptionId") || a2.getString("subscriptionId").isEmpty()) {
                    return null;
                }
                C6368a.this.f22609h.mo19938x(a2.getString("subscriptionId"));
                return "ok";
            } catch (SCApiException e) {
                return e.getDetails().getString("message");
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            if (str == null) {
                C6368a.this.m30926aA();
            } else if (str.equals("ok")) {
                C6368a.this.m30930at();
            } else {
                C6368a.this.m30926aA();
                Toast.makeText(C6368a.this.mo1318s(), str, 1).show();
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
            C6368a.this.m30931az();
        }
    }

    /* renamed from: com.seattleclouds.previewer.appmart.order.a$c */
    private class C6374c extends C5270d<String, Void, String> {

        /* renamed from: b */
        private ArrayList<String> f22618b;

        public C6374c(Fragment fragment) {
            super(fragment);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo17335a(String... strArr) {
            try {
                String o = C6368a.this.f22609h.mo19919o();
                if ((C6368a.this.f22609h.mo19848A() && (o != null)) && o.equals("iOS")) {
                    o = "iPhone";
                }
                JSONObject a = C5268b.m26272a().mo17304a(C6368a.this.f22609h.mo19925r(), o, C6368a.this.f22609h.mo19853D(), C6368a.this.f22609h.mo19937x(), C6368a.this.f22609h.mo19939y(), C6368a.this.f22609h.mo19935w(), App.f18523y);
                if (!a.has("apps")) {
                    return null;
                }
                JSONArray optJSONArray = a.optJSONArray("apps");
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.f22618b.add(optJSONArray.getJSONObject(i).getString("appId"));
                }
                return "ok";
            } catch (SCApiException e) {
                e.printStackTrace();
                return e.getMessage();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            C6368a.this.m30926aA();
            if (str != null) {
                if (!str.equals("ok")) {
                    Toast.makeText(C6368a.this.mo1318s(), C6368a.this.mo1219a(C5462k.new_order_problem_occurred), 1).show();
                    C6368a.this.m30929as();
                } else if (this.f22618b != null) {
                    Intent intent = new Intent(C6368a.this.mo1318s(), OrderDetailActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("KEY_APP_ID", this.f22618b);
                    if (C6368a.this.f22609h.mo19939y() != null) {
                        bundle.putString("KEY_SUBSCRIPTION_ID", C6368a.this.f22609h.mo19939y());
                    } else {
                        bundle.putSerializable("KEY_ABC_ID", C6368a.this.f22609h.mo19937x());
                    }
                    intent.putExtras(bundle);
                    C6368a.this.mo1318s().startActivity(intent);
                    C6388a.m31015b();
                    C6368a.this.mo1318s().finish();
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            C6368a.this.m30931az();
            this.f22618b = new ArrayList<>();
            super.onPreExecute();
        }
    }

    /* renamed from: com.seattleclouds.previewer.appmart.order.a$d */
    private class C6375d extends C0394o {

        /* renamed from: b */
        private ArrayList<Fragment> f22620b = new ArrayList<>();

        public C6375d(C0374l lVar) {
            super(lVar);
            this.f22620b.add(new C6412d());
            this.f22620b.add(new C6402b());
            this.f22620b.add(new C6411c());
            this.f22620b.add(new C6434g());
            this.f22620b.add(new C6433f());
            this.f22620b.add(new C6427e());
            this.f22620b.add(new C6390a());
        }

        /* renamed from: a */
        public Fragment mo1655a(int i) {
            return (Fragment) this.f22620b.get(i);
        }

        /* renamed from: b */
        public int mo2480b() {
            return this.f22620b.size();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aA */
    public void m30926aA() {
        if (this.f22599ag != null && this.f22599ag.isShowing()) {
            this.f22599ag.dismiss();
            m30928aC();
        }
    }

    @TargetApi(9)
    /* renamed from: aB */
    private void m30927aB() {
        C0367h s;
        int i;
        if (VERSION.SDK_INT >= 9) {
            s = mo1318s();
            i = 7;
        } else {
            s = mo1318s();
            i = 1;
        }
        s.setRequestedOrientation(i);
    }

    /* renamed from: aC */
    private void m30928aC() {
        mo1318s().setRequestedOrientation(4);
    }

    /* access modifiers changed from: private */
    /* renamed from: as */
    public void m30929as() {
        this.f22609h.mo19893c();
        this.f22603b.setAdapter(new C6375d(mo1323v()));
        this.f22607f = 0;
        this.f22600ah.check(this.f22600ah.getChildAt(this.f22603b.getCurrentItem()).getId());
        this.f22610i = false;
        this.f22605d.setVisibility(0);
        this.f22605d.setText(C5462k.new_order_ms_next);
        this.f22606e.setVisibility(8);
        this.f22604c.setVisibility(8);
        mo19819m(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: at */
    public void m30930at() {
        new C6374c(this).execute(new String[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: az */
    public void m30931az() {
        if (this.f22599ag == null) {
            this.f22599ag = new ProgressDialog(mo1316q());
            this.f22599ag.setTitle(mo1219a(C5462k.new_order_progress_creating));
            this.f22599ag.setMessage(mo1219a(C5462k.new_order_progress_create));
            this.f22599ag.setIndeterminate(false);
            this.f22599ag.setCancelable(false);
        }
        if (f22596a) {
            m30927aB();
            this.f22599ag.show();
        }
    }

    /* renamed from: b */
    private void m30932b() {
        this.f22597ae = new C6372a(this);
        this.f22597ae.execute(new String[]{App.f18523y, "device_visible"});
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m30935c() {
        if (this.f22603b.getCurrentItem() == 0) {
            Fragment e = m30939e(this.f22603b.getCurrentItem());
            if (e == null || ((C6412d) e).mo1453c() || !mo19819m(true) || !this.f22609h.mo19885Z()) {
                return;
            }
        }
        if (this.f22603b.getCurrentItem() == 1) {
            Fragment e2 = m30939e(this.f22603b.getCurrentItem());
            if (e2 == null || ((C6402b) e2).mo1450b()) {
                return;
            }
        }
        if (this.f22603b.getCurrentItem() == 4) {
            Fragment e3 = m30939e(this.f22603b.getCurrentItem());
            if (e3 == null || ((C6433f) e3).mo1450b()) {
                return;
            }
        }
        if (this.f22603b.getCurrentItem() == 5) {
            Fragment e4 = m30939e(this.f22603b.getCurrentItem());
            if (e4 == null || ((C6427e) e4).mo1450b()) {
                return;
            }
        }
        if (this.f22603b.getCurrentItem() == 6) {
            Fragment e5 = m30939e(this.f22603b.getCurrentItem());
            if (e5 != null && !((C6390a) e5).mo1450b() && m30949o(true)) {
                if (this.f22609h.mo19850B()) {
                    m30930at();
                } else if (m30949o(true)) {
                    this.f22608g = new C6373b(this);
                    this.f22608g.execute(new String[0]);
                } else {
                    return;
                }
                return;
            }
            return;
        }
        if (!this.f22610i) {
            this.f22607f++;
            this.f22603b.setCurrentItem(this.f22607f);
            this.f22600ah.check(this.f22600ah.getChildAt(this.f22607f).getId());
        } else if (this.f22597ae != null && this.f22597ae.getStatus() == Status.RUNNING) {
            Toast.makeText(mo1318s(), mo1219a(C5462k.new_order_please_wait), 0).show();
        }
        if (this.f22603b.getCurrentItem() == 1) {
            this.f22604c.setVisibility(0);
        }
        if (this.f22603b.getCurrentItem() == 3) {
            this.f22610i = true;
            if (this.f22609h.mo19850B() || this.f22609h.mo19852C()) {
                if (this.f22609h.mo19850B()) {
                    this.f22605d.setVisibility(8);
                    this.f22606e.setVisibility(0);
                    m30948n(false);
                } else {
                    this.f22610i = false;
                }
            } else if (m30949o(true)) {
                this.f22597ae = new C6372a(this);
                this.f22597ae.execute(new String[]{App.f18523y});
            } else {
                return;
            }
        }
        if (this.f22603b.getCurrentItem() == 6) {
            this.f22605d.setText(C5462k.new_order_place_order);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m30938d() {
        if (this.f22603b.getCurrentItem() <= 0) {
            return false;
        }
        this.f22607f--;
        this.f22603b.setCurrentItem(this.f22607f);
        this.f22600ah.check(this.f22600ah.getChildAt(this.f22607f).getId());
        if (this.f22607f == 0) {
            this.f22604c.setVisibility(8);
        }
        if (this.f22603b.getCurrentItem() == 2) {
            this.f22610i = false;
            if (this.f22609h.mo19850B()) {
                this.f22605d.setVisibility(0);
                this.f22606e.setVisibility(8);
            }
        }
        if (this.f22603b.getCurrentItem() == 5) {
            this.f22605d.setText(C5462k.new_order_ms_next);
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public Fragment m30939e(int i) {
        C0374l v = mo1323v();
        StringBuilder sb = new StringBuilder();
        sb.append("android:switcher:");
        sb.append(C5458g.stepPagerProgress);
        sb.append(":");
        sb.append(i);
        return v.mo1535a(sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m30941e() {
        if (m30949o(true)) {
            m30930at();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m30948n(boolean z) {
        View childAt;
        int i;
        if (z) {
            childAt = this.f22600ah.getChildAt(this.f22600ah.getChildCount() - 1);
            i = 0;
        } else {
            childAt = this.f22600ah.getChildAt(this.f22600ah.getChildCount() - 1);
            i = 8;
        }
        childAt.setVisibility(i);
        this.f22600ah.getChildAt(this.f22600ah.getChildCount() - 2).setVisibility(i);
        this.f22600ah.getChildAt(this.f22600ah.getChildCount() - 3).setVisibility(i);
    }

    /* renamed from: o */
    private boolean m30949o(boolean z) {
        if (C6619m.m32026h(mo1318s())) {
            return true;
        }
        if (z && (this.f22601ai == null || this.f22601ai.getView().getWindowVisibility() != 0)) {
            this.f22601ai = Toast.makeText(mo1318s(), C5462k.new_order_need_internet_connection, 0);
            this.f22601ai.show();
        }
        return false;
    }

    /* renamed from: J */
    public void mo1200J() {
        f22596a = true;
        super.mo1200J();
    }

    /* renamed from: K */
    public void mo1201K() {
        f22596a = false;
        super.mo1201K();
    }

    /* renamed from: L */
    public void mo1202L() {
        m30926aA();
        super.mo1202L();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5460i.new_order_fragment, viewGroup, false);
        this.f22609h = C6388a.m31014a();
        this.f22604c = (TextView) inflate.findViewById(C5458g.stepPrev);
        this.f22605d = (TextView) inflate.findViewById(C5458g.stepNext);
        this.f22606e = (TextView) inflate.findViewById(C5458g.stepEnd);
        this.f22600ah = (RadioGroup) inflate.findViewById(C5458g.radioGroup);
        Drawable a = C6387b.m31011a(mo1318s(), C5457f.ic_arrow_new_order);
        Drawable a2 = C6387b.m31011a(mo1318s(), C5457f.ic_arrow_forward_new_order);
        this.f22604c.setCompoundDrawablesWithIntrinsicBounds(a, null, null, null);
        this.f22605d.setCompoundDrawablesWithIntrinsicBounds(null, null, a2, null);
        this.f22603b = (ViewPager) inflate.findViewById(C5458g.stepPagerProgress);
        this.f22602aj = new C6375d(mo1323v());
        this.f22603b.setAdapter(this.f22602aj);
        this.f22600ah.check(this.f22600ah.getChildAt(this.f22603b.getCurrentItem()).getId());
        this.f22604c.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C6368a.this.m30938d();
            }
        });
        this.f22605d.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C6368a.this.m30935c();
            }
        });
        this.f22606e.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C6368a.this.m30941e();
            }
        });
        mo1318s().getWindow().setSoftInputMode(32);
        if (bundle != null) {
            this.f22607f = bundle.getInt("itemCounter");
            this.f22610i = bundle.getBoolean("statusSubscribe");
            if (this.f22607f > 0) {
                this.f22604c.setVisibility(0);
            }
            if (this.f22607f == 3 && this.f22609h.mo19850B()) {
                this.f22605d.setVisibility(8);
                this.f22606e.setVisibility(0);
            }
            if (this.f22607f == 6) {
                this.f22605d.setText(bundle.getString("endPageTitle"));
            }
            boolean z = true;
            boolean z2 = this.f22607f >= 0;
            if (this.f22607f > 3) {
                z = false;
            }
            if ((z2 && z) && this.f22609h.mo19850B()) {
                m30948n(false);
            }
        }
        mo19819m(false);
        return inflate;
    }

    /* renamed from: a */
    public void mo1222a(int i, int i2, Intent intent) {
        super.mo1222a(i, i2, intent);
        C0374l v = mo1323v();
        if (v != null) {
            List<Fragment> e = v.mo1543e();
            if (e != null && e.size() != 0) {
                for (Fragment fragment : e) {
                    if (fragment != null && !fragment.mo1327z() && !fragment.mo1191A()) {
                        fragment.mo1222a(i, i2, intent);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1239a(Menu menu) {
        super.mo1239a(menu);
        boolean z = false;
        menu.findItem(C5458g.filter).setVisible(false);
        menu.findItem(C5458g.search).setVisible(false);
        menu.findItem(C5458g.refresh).setVisible(this.f22603b.getCurrentItem() == 0);
        MenuItem findItem = menu.findItem(C5458g.log_in_as);
        if (this.f22603b.getCurrentItem() == 0 && App.f18485R) {
            z = true;
        }
        findItem.setVisible(z);
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (z) {
            mo19819m(false);
        }
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        if (menuItem.getItemId() != C5458g.refresh) {
            return super.mo1245a(menuItem);
        }
        this.f22609h.mo19893c();
        mo19819m(false);
        return true;
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        super.mo1282e(bundle);
        bundle.putInt("itemCounter", this.f22607f);
        bundle.putBoolean("statusSubscribe", this.f22610i);
        if (this.f22605d != null) {
            bundle.putString("endPageTitle", this.f22605d.getText().toString());
        }
    }

    /* renamed from: m */
    public boolean mo19819m(boolean z) {
        if (!this.f22609h.mo19850B() && !this.f22609h.mo19852C()) {
            if (!m30949o(z)) {
                return false;
            }
            m30932b();
        }
        return true;
    }
}
