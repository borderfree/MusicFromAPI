package com.seattleclouds.previewer.appmart;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.p009v4.app.C0374l;
import android.support.p009v4.app.C0394o;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.view.ViewPager;
import android.support.p023v7.app.C0751a;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import com.seattleclouds.App;
import com.seattleclouds.C5232ac;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.api.C5268b;
import com.seattleclouds.p160e.C5334b;
import com.seattleclouds.previewer.C6452c;
import com.seattleclouds.previewer.C6452c.C6463b;
import com.seattleclouds.previewer.C6521k;
import com.seattleclouds.previewer.C6521k.C6530a;
import com.seattleclouds.previewer.PreviewerAboutActivity;
import com.seattleclouds.previewer.PreviewerActivity;
import com.seattleclouds.previewer.appmart.order.C6368a;
import com.seattleclouds.previewer.appmart.order.p190b.C6388a;
import com.seattleclouds.previewer.data.SCTemplateApp;
import com.seattleclouds.util.C6578ag;
import com.seattleclouds.util.C6620n;
import com.seattleclouds.util.C6620n.C6629b;
import java.util.ArrayList;

public class PreviewerAppMartActivity extends C5232ac implements C6463b, C6530a {

    /* renamed from: n */
    private static final String f22580n = "PreviewerAppMartActivity";

    /* renamed from: o */
    private static int f22581o = 101;

    /* renamed from: p */
    private static boolean f22582p = false;

    /* renamed from: q */
    private ViewPager f22583q;

    /* renamed from: r */
    private TabLayout f22584r;

    /* renamed from: s */
    private C6452c f22585s;

    /* renamed from: t */
    private C6521k f22586t;

    /* renamed from: com.seattleclouds.previewer.appmart.PreviewerAppMartActivity$a */
    private class C6363a extends C0394o {

        /* renamed from: b */
        private String[] f22589b;

        /* renamed from: c */
        private ArrayList<Fragment> f22590c;

        private C6363a(C0374l lVar, ArrayList<Fragment> arrayList) {
            super(lVar);
            this.f22589b = new String[]{PreviewerAppMartActivity.this.getResources().getString(C5462k.previewer_appmart_tab_title), PreviewerAppMartActivity.this.getResources().getString(C5462k.previewer_appmart_tab_title_new_apps), PreviewerAppMartActivity.this.getResources().getString(C5462k.previewer_appmart_tab_title_new_order)};
            this.f22590c = arrayList;
        }

        /* renamed from: a */
        public Fragment mo1655a(int i) {
            return (Fragment) this.f22590c.get(i);
        }

        /* renamed from: b */
        public int mo2480b() {
            return this.f22590c.size();
        }

        /* renamed from: c */
        public CharSequence mo2484c(int i) {
            return this.f22589b[i];
        }
    }

    /* renamed from: b */
    private void m30903b(String str) {
        if (f22582p) {
            Log.d(f22580n, str);
        }
    }

    /* renamed from: q */
    private void m30904q() {
        m30903b("refresh");
        m30905s();
        if (!App.f18473F) {
            startActivity(new Intent(this, PreviewerActivity.class));
            finish();
            return;
        }
        this.f22585s = new C6452c();
        this.f22585s.mo1280d(true);
        this.f22586t = new C6521k();
        this.f22586t.mo1280d(true);
    }

    /* renamed from: s */
    private void m30905s() {
        String str;
        C0751a aVar;
        if (!App.f18473F || !App.f18485R) {
            aVar = mo3083i();
            str = null;
        } else {
            aVar = mo3083i();
            str = getString(C5462k.previewer_logged_in_as, new Object[]{App.f18484Q, App.f18523y});
        }
        aVar.mo2998b((CharSequence) str);
    }

    /* renamed from: a */
    public void mo19804a(String str) {
        App.f18523y = str;
        App.f18469B = "";
        C6388a.m31014a().mo19893c();
        C0374l g = mo1469g();
        StringBuilder sb = new StringBuilder();
        sb.append("android:switcher:");
        sb.append(C5458g.view_pager);
        sb.append(":");
        sb.append(2);
        Fragment a = g.mo1535a(sb.toString());
        if (a != null) {
            ((C6368a) a).mo19819m(false);
        }
        ((App) getApplication()).mo16844d();
        m30905s();
    }

    /* renamed from: b */
    public void mo19807b(SCTemplateApp sCTemplateApp) {
        Intent intent = new Intent(this, PreviewerAppMartTemplatesActivity.class);
        intent.putExtra("previewTemplate", sCTemplateApp);
        startActivityForResult(intent, f22581o);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == f22581o && i2 == -1) {
            if (f22582p) {
                Log.d(f22580n, "An app created from template. Refreshing list of apps");
            }
            if (this.f22583q != null) {
                this.f22583q.setCurrentItem(0);
                C0374l g = mo1469g();
                StringBuilder sb = new StringBuilder();
                sb.append("android:switcher:");
                sb.append(C5458g.view_pager);
                sb.append(":");
                sb.append(this.f22583q.getCurrentItem());
                Fragment a = g.mo1535a(sb.toString());
                if (a != null) {
                    ((C6452c) a).mo20093as();
                }
            }
        }
    }

    public void onBackPressed() {
        if (this.f22583q == null || this.f22583q.getCurrentItem() != 2) {
            super.onBackPressed();
            C6388a.m31015b();
            return;
        }
        this.f22583q.setCurrentItem(0);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(C5460i.activity_previewer_appmart);
        C0751a i = mo3083i();
        if (i != null) {
            i.mo2992a(false);
            i.mo2985a(0.0f);
        }
        this.f22583q = (ViewPager) findViewById(C5458g.view_pager);
        this.f22584r = (TabLayout) findViewById(C5458g.tabs);
        C5334b.m26765a(mo19778o(), this.f22584r);
        if (bundle != null) {
            this.f22585s = (C6452c) mo1469g().mo1534a(bundle, "appsFragment");
            this.f22586t = (C6521k) mo1469g().mo1534a(bundle, "templateFragment");
            m30905s();
            str = "savedInstanceState NOT NULL => no need to create fragment";
        } else {
            m30904q();
            str = "Initial onCreate => adding new fragment";
        }
        m30903b(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f22585s);
        arrayList.add(this.f22586t);
        arrayList.add(new C6368a());
        this.f22583q.setAdapter(new C6363a(mo1469g(), arrayList));
        this.f22583q.setOffscreenPageLimit(2);
        this.f22584r.setupWithViewPager(this.f22583q);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C5461j.previewer_appmart_apps, menu);
        menu.findItem(C5458g.log_in_as).setVisible(App.f18485R);
        super.onCreateOptionsMenu(menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == C5458g.about) {
            startActivity(new Intent(this, PreviewerAboutActivity.class));
            return true;
        } else if (menuItem.getItemId() == C5458g.log_out) {
            mo19805r();
            return true;
        } else {
            if (menuItem.getItemId() == C5458g.log_in_as) {
                C6620n.m32043a((Context) this, "Log in as user:", (String) null, true, App.f18523y, "Log in", (C6629b) new C6629b() {
                    /* renamed from: a */
                    public void mo18346a() {
                    }

                    /* renamed from: a */
                    public void mo18347a(String str) {
                        if (!str.equals("")) {
                            PreviewerAppMartActivity.this.mo19804a(str.trim());
                            C0374l g = PreviewerAppMartActivity.this.mo1469g();
                            StringBuilder sb = new StringBuilder();
                            sb.append("android:switcher:");
                            sb.append(C5458g.view_pager);
                            sb.append(":");
                            sb.append(0);
                            Fragment a = g.mo1535a(sb.toString());
                            if (a != null) {
                                ((C6452c) a).mo20097e();
                            }
                        }
                    }
                });
            }
            return super.onOptionsItemSelected(menuItem);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo1469g().mo1538a(bundle, "appsFragment", this.f22585s);
        mo1469g().mo1538a(bundle, "templateFragment", this.f22586t);
    }

    /* renamed from: r */
    public void mo19805r() {
        App.f18473F = false;
        App.f18469B = "";
        App.f18523y = App.f18485R ? App.f18484Q : "";
        ((App) getApplication()).mo16844d();
        C5268b.m26272a().mo17322f();
        C6578ag.m31843c();
        C6388a.m31015b();
        m30904q();
    }
}
