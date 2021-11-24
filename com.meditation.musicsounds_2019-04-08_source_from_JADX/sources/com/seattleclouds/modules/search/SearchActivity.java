package com.seattleclouds.modules.search;

import android.content.Intent;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.util.Log;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C6348n;

public class SearchActivity extends C6348n {

    /* renamed from: n */
    private boolean f22270n = false;

    /* renamed from: o */
    private C6277a f22271o;

    /* renamed from: p */
    private boolean f22272p = false;

    /* renamed from: c */
    private void m30506c(Intent intent) {
        if (this.f22270n) {
            Log.v("SearchActivity", "handleIntent");
        }
        if ("android.intent.action.SEARCH".equals(intent.getAction())) {
            this.f22271o.mo19634c(intent.getStringExtra("query"));
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (this.f22270n) {
            Log.v("SearchActivity", "onCreate");
        }
        super.onCreate(bundle);
        setContentView(C5460i.activity_fragment);
        if (bundle == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            extras.putBoolean("ARG_USE_ACTIVITY_SEARCH", true);
            this.f22271o = new C6277a();
            this.f22271o.mo1289g(extras);
            mo1469g().mo1536a().mo1410a(C5458g.fragment, (Fragment) this.f22271o).mo1428c();
            return;
        }
        this.f22271o = (C6277a) mo1469g().mo1533a(C5458g.fragment);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        if (this.f22270n) {
            Log.v("SearchActivity", "onNewIntent");
        }
        setIntent(intent);
        m30506c(intent);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        if (!this.f22272p) {
            this.f22272p = true;
            m30506c(getIntent());
        }
        super.onResume();
    }
}
