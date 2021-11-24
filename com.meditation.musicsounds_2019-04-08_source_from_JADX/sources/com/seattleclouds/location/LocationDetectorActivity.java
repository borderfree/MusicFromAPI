package com.seattleclouds.location;

import android.content.Intent;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.util.Log;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C6348n;

public class LocationDetectorActivity extends C6348n {

    /* renamed from: n */
    private boolean f19264n = false;

    /* renamed from: o */
    private C5402c f19265o;

    /* renamed from: p */
    private boolean f19266p = false;

    /* renamed from: c */
    private void m27019c(Intent intent) {
        if (this.f19264n) {
            Log.v("LocationDetectorActivity", "handleIntent");
        }
        if ("android.intent.action.SEARCH".equals(intent.getAction())) {
            this.f19265o.mo17713c(intent.getStringExtra("query"));
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (this.f19264n) {
            Log.v("LocationDetectorActivity", "onCreate");
        }
        super.onCreate(bundle);
        setContentView(C5460i.activity_fragment);
        if (mo1469g().mo1533a(C5458g.fragment) == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            extras.putBoolean("ARG_USE_ACTIVITY_SEARCH", true);
            if ("com.seattleclouds.location.ACTION_PICK_LOCATION".equals(getIntent().getAction())) {
                extras.putBoolean("ARG_PICKER_MODE_ENABLED", true);
            }
            this.f19265o = new C5402c();
            this.f19265o.mo1289g(extras);
            mo1469g().mo1536a().mo1410a(C5458g.fragment, (Fragment) this.f19265o).mo1428c();
        } else if (this.f19264n) {
            Log.v("LocationDetectorActivity", "Fragment already added...");
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        if (this.f19264n) {
            Log.v("LocationDetectorActivity", "onNewIntent");
        }
        setIntent(intent);
        m27019c(intent);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        if (this.f19264n) {
            Log.v("LocationDetectorActivity", "onResume");
        }
        if (!this.f19266p) {
            this.f19266p = true;
            m27019c(getIntent());
        }
        super.onResume();
    }
}
