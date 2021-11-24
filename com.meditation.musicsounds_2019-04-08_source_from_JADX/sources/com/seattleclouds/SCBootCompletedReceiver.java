package com.seattleclouds;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.seattleclouds.location.geofencing.C5437a;
import com.seattleclouds.scm.C6559a;

public class SCBootCompletedReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f18570a = "SCBootCompletedReceiver";

    public void onReceive(Context context, Intent intent) {
        new C5437a(context).mo17743a(false);
        if (C6559a.m31717c(context) && App.f18477J) {
            C6559a.m31715a(context);
        }
    }
}
