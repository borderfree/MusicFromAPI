package com.seattleclouds;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;

public class PageStarterActivity extends C6348n {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        String string = extras.getString("ARG_PAGE_ID");
        boolean z = extras.getBoolean("ARG_PAGE_ID_LOCAL");
        int i = extras.getInt("ARG_PAGE_NOTIFICATION_ID");
        FragmentInfo a = App.m25606a(App.m25655h(string), (Context) this);
        if (z) {
            App.m25619a(a, (Activity) this);
        } else {
            App.m25637b(string, (Activity) this);
        }
        if (i != 0) {
            ((NotificationManager) getSystemService("notification")).cancel(i);
        }
        finish();
    }
}
