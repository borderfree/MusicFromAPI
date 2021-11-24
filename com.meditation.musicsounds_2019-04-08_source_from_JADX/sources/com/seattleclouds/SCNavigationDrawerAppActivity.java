package com.seattleclouds;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.design.widget.NavigationView.C0142a;
import android.support.p009v4.app.C0396q;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.widget.DrawerLayout;
import android.support.p009v4.widget.DrawerLayout.C0658c;
import android.support.p023v7.app.C0751a;
import android.support.p023v7.app.C0756b;
import android.support.p023v7.app.C0767e;
import android.support.p023v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.p160e.C5338d;
import com.seattleclouds.util.C6592al;
import java.util.Iterator;

public class SCNavigationDrawerAppActivity extends C5326d implements C0142a {

    /* renamed from: n */
    private static String f18571n = "ITEM_SHOW";

    /* renamed from: o */
    private int f18572o = 1;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public NavigationView f18573p;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public FragmentInfo mo16878a(String str) {
        FragmentInfo a = App.m25606a(App.m25655h(str), (Context) this);
        if (a == null) {
            a = App.m25672q(App.m25655h(str));
        }
        a.mo16870c().putBoolean("ARG_IS_ROOT_FRAGMENT", true);
        return a;
    }

    /* renamed from: a */
    public void mo16879a(int i, int i2) {
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{16842912}, new int[]{16842910}, new int[]{16842908}, new int[]{16842919}}, new int[]{i, i2, i, i});
        ColorStateList colorStateList2 = new ColorStateList(new int[][]{new int[]{16842912}, new int[]{16842910}, new int[]{16842908}, new int[]{16842919}}, new int[]{i, i2, i, i});
        this.f18573p.setItemTextColor(colorStateList);
        this.f18573p.setItemIconTintList(colorStateList2);
    }

    /* renamed from: a */
    public boolean mo647a(MenuItem menuItem) {
        return mo16880a(menuItem, false);
    }

    /* renamed from: a */
    public boolean mo16880a(MenuItem menuItem, boolean z) {
        menuItem.setCheckable(true);
        menuItem.setChecked(true);
        Iterator it = App.f18501c.mo16942d().iterator();
        int i = 1;
        while (it.hasNext() && !((C5389j) it.next()).mo17653a().equalsIgnoreCase(menuItem.getTitle().toString())) {
            i++;
        }
        if (this.f18572o != i || z) {
            this.f18572o = i;
            StringBuilder sb = new StringBuilder();
            sb.append("tab");
            sb.append(String.valueOf(i));
            sb.append(".html");
            mo16881c(sb.toString());
        }
        runOnUiThread(new Runnable() {
            public void run() {
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        ((DrawerLayout) SCNavigationDrawerAppActivity.this.findViewById(C5458g.drawer_layout)).mo2602f(8388611);
                    }
                }, 200);
            }
        });
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo16881c(String str) {
        FragmentInfo a = mo16878a(str);
        C0396q a2 = mo1469g().mo1536a();
        a2.mo1423b(C5458g.rootFragment, Fragment.m1271a((Context) this, a.mo16867a(), a.mo16869b()), "rootFragment");
        a2.mo1428c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo16842m() {
        C0751a i = mo3083i();
        if (i != null) {
            i.mo2992a(true);
        }
        setContentView(C5460i.activity_navigation_drawer);
        Toolbar toolbar = (Toolbar) findViewById(C5458g.action_bar);
        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(C5458g.drawer_layout);
        C0756b bVar = new C0756b(this, drawerLayout, toolbar, C5462k.navigation_drawer_open, C5462k.navigation_drawer_close);
        drawerLayout.mo2576a((C0658c) bVar);
        bVar.mo3027a();
        toolbar.setNavigationOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (drawerLayout.mo2604g(8388611)) {
                    drawerLayout.mo2602f(8388611);
                    return;
                }
                drawerLayout.mo2601e(8388611);
                drawerLayout.bringToFront();
                SCNavigationDrawerAppActivity.this.f18573p.bringToFront();
            }
        });
        mo3083i().mo2992a(true);
        this.f18573p = (NavigationView) findViewById(C5458g.nav_view);
        this.f18573p.setNavigationItemSelectedListener(this);
        View findViewById = this.f18573p.mo623c(0).findViewById(C5458g.parent_header_view);
        if (!App.f18501c.mo16946e().mo17694m()) {
            findViewById.setVisibility(8);
        } else if (!C6592al.m31909b(App.f18501c.mo16946e().mo17676b()) && findViewById != null) {
            ImageView imageView = (ImageView) findViewById.findViewById(C5458g.imageBackgroundHeader);
            if (imageView != null) {
                imageView.setImageDrawable(App.m25658j(App.f18501c.mo16946e().mo17676b()));
            }
        }
        Menu menu = this.f18573p.getMenu();
        int i2 = 0;
        for (C5389j jVar : App.f18501c.mo16942d()) {
            menu.add(0, 0, i2, jVar.mo17653a());
            Drawable j = App.m25658j(jVar.mo17657b());
            if (j != null) {
                menu.getItem(i2).setIcon(j);
            }
            i2++;
        }
        Context context = this.f18573p.getContext();
        if (context instanceof C0767e) {
            C0751a i3 = ((C0767e) context).mo3083i();
            if (i3 != null) {
                context = i3.mo3005e();
            }
        }
        C5338d o = mo19778o();
        mo16879a(o.mo17555l(context), o.mo17554k(context));
        this.f18573p.setBackgroundColor(o.mo17553j(context));
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 1 && i == 1) {
            if (App.f18524z.startsWith("Tx7EcUcOd70UeXxV0b0L_")) {
                AppStarterActivity.m25693a((Activity) this, App.f18524z.substring("Tx7EcUcOd70UeXxV0b0L_".length()));
            } else {
                AppStarterActivity.m25705c((Activity) this);
            }
            finish();
        }
    }

    public void onBackPressed() {
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(C5458g.drawer_layout);
        if (drawerLayout.mo2604g(8388611)) {
            drawerLayout.mo2602f(8388611);
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f18572o = bundle.getInt(f18571n, 1);
        }
        if (this.f18573p != null && this.f18573p.getMenu().size() > this.f18572o) {
            mo16880a(this.f18573p.getMenu().getItem(this.f18572o - 1), true);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(f18571n, this.f18572o);
        super.onSaveInstanceState(bundle);
    }
}
