package com.seattleclouds.startupoptions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.support.p023v7.app.C0751a;
import android.view.View;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6348n;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.p161f.C5346b;
import com.seattleclouds.util.C6592al;
import java.io.File;
import p194nl.siegmann.epublib.domain.TableOfContents;

public class AgreementActivity extends C6348n {
    /* renamed from: a */
    public static void m31718a(Activity activity, int i) {
        activity.startActivityForResult(new Intent(activity, AgreementActivity.class), i);
    }

    /* renamed from: a */
    private static void m31719a(String str, Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(App.m25654h());
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append(str);
        if (new File(sb.toString()).exists()) {
            long j = context.getSharedPreferences("AGREEMENT_PREFS_NAME", 0).getLong("AGREEMENT_LAST_MODIFY_DATE", 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(App.m25654h());
            sb2.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
            sb2.append(str);
            long lastModified = new File(sb2.toString()).lastModified();
            if (j < lastModified) {
                Editor edit = context.getSharedPreferences("AGREEMENT_PREFS_NAME", 0).edit();
                edit.putLong("AGREEMENT_LAST_MODIFY_DATE", lastModified);
                edit.putBoolean("AGREMENT_ACCEPTED_STATUS_KEY", false);
                edit.apply();
            }
        }
    }

    /* renamed from: a */
    public static boolean m31720a(Context context) {
        if (C6592al.m31909b(App.f18501c.mo16916R())) {
            return false;
        }
        m31719a(App.f18501c.mo16916R(), context);
        return !context.getSharedPreferences("AGREEMENT_PREFS_NAME", 0).getBoolean("AGREMENT_ACCEPTED_STATUS_KEY", false) || App.f18510l;
    }

    /* renamed from: m */
    private void m31721m() {
        Editor edit = getSharedPreferences("AGREEMENT_PREFS_NAME", 0).edit();
        edit.putBoolean("AGREMENT_ACCEPTED_STATUS_KEY", true);
        edit.apply();
    }

    public void onAgreeClick(View view) {
        m31721m();
        setResult(-1);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5460i.activity_agreement);
        if (bundle == null) {
            String h = App.m25655h(App.f18501c.mo16916R());
            FragmentInfo a = App.m25608a(h, (Context) this, true);
            if (!a.mo16867a().equals(C5346b.class.getName())) {
                a = App.m25672q(h);
            }
            Fragment a2 = Fragment.m1270a((Context) this, a.mo16867a());
            a2.mo1289g(a.mo16869b());
            mo1469g().mo1536a().mo1410a(C5458g.fragment_container, a2).mo1428c();
        }
        C0751a i = mo3083i();
        if (i != null) {
            i.mo2992a(false);
        }
        setTitle(C5462k.agreement_page_title);
    }

    public void onDeclineClick(View view) {
        String h = App.m25655h(App.f18501c.mo16917S());
        FragmentInfo a = App.m25606a(h, (Context) this);
        if (!a.mo16867a().equals(C5346b.class.getName())) {
            a = App.m25672q(h);
        }
        App.m25619a(a, (Activity) this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        mo1469g().mo1533a(C5458g.fragment_container).mo1283e(false);
    }
}
