package com.seattleclouds.startupoptions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Handler;
import android.support.p009v4.app.Fragment;
import android.support.p023v7.app.C0751a;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C5451m.C5463l;
import com.seattleclouds.C6348n;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.p161f.C5346b;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6619m;

public class WelcomeActivity extends C6348n {

    /* renamed from: n */
    private Runnable f23222n;

    /* renamed from: o */
    private Handler f23223o;

    /* renamed from: a */
    public static void m31722a(Activity activity, int i) {
        activity.startActivityForResult(new Intent(activity, WelcomeActivity.class), i);
    }

    /* renamed from: a */
    public static boolean m31723a(Context context) {
        if (!C6592al.m31909b(App.f18501c.mo16918T())) {
            return !context.getSharedPreferences("WELCOME_PREFS_NAME", 0).getBoolean("WELCOME_PAGE_SHOWN_STATUS_KEY", false) || App.f18510l || App.f18501c.mo16920V();
        }
        return false;
    }

    /* renamed from: m */
    private void m31724m() {
        if (App.f18501c.mo16919U() != 0 && this.f23223o != null) {
            this.f23223o.removeCallbacks(this.f23222n);
        }
    }

    /* renamed from: n */
    private void m31725n() {
        Editor edit = getSharedPreferences("WELCOME_PREFS_NAME", 0).edit();
        edit.putBoolean("WELCOME_PAGE_SHOWN_STATUS_KEY", true);
        edit.apply();
    }

    /* renamed from: q */
    private int m31726q() {
        int a = C6619m.m32014a(this, 600.0f);
        int b = C6619m.m32017b(this);
        if (a <= b) {
            return a;
        }
        double d = (double) b;
        Double.isNaN(d);
        return (int) (d * 0.9d);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int i;
        if (!C6619m.m32025g(this)) {
            i = C5463l.DefaultAppTheme;
        } else {
            mo19777b(true);
            i = C5463l.DefaultAppTheme_Dialog;
        }
        setTheme(i);
        super.onCreate(bundle);
        setContentView(C5460i.activity_welcome);
        if (bundle == null) {
            String h = App.m25655h(App.f18501c.mo16918T());
            FragmentInfo a = App.m25608a(h, (Context) this, true);
            if (a == null || !a.mo16867a().equals(C5346b.class.getName())) {
                a = App.m25672q(h);
            }
            Fragment a2 = Fragment.m1270a((Context) this, a.mo16867a());
            a2.mo1289g(a.mo16869b());
            mo1469g().mo1536a().mo1410a(C5458g.fragment_container, a2).mo1428c();
        }
        if (App.f18501c.mo16919U() != 0) {
            this.f23223o = new Handler();
            this.f23222n = new Runnable() {
                public void run() {
                    WelcomeActivity.this.setResult(-1);
                    WelcomeActivity.this.finish();
                }
            };
            this.f23223o.postDelayed(this.f23222n, (long) (App.f18501c.mo16919U() * 1000));
        }
        setTitle(C5462k.welcome_page_title);
        C0751a i2 = mo3083i();
        if (i2 != null) {
            i2.mo2992a(false);
        }
        if (mo19779p()) {
            View findViewById = findViewById(C5458g.fragment_container);
            if (findViewById != null) {
                LayoutParams layoutParams = (LayoutParams) findViewById.getLayoutParams();
                layoutParams.topMargin = C6619m.m32014a(this, 16.0f);
                findViewById.setLayoutParams(layoutParams);
                getWindow().setLayout(m31726q(), -1);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        m31724m();
        super.onDestroy();
    }

    public void onOkClick(View view) {
        m31724m();
        setResult(-1);
        m31725n();
        finish();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        mo1469g().mo1533a(C5458g.fragment_container).mo1283e(false);
    }
}
