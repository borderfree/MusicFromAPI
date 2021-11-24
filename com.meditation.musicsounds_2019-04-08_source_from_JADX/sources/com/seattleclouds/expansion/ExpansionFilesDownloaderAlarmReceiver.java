package com.seattleclouds.expansion;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.vending.expansion.downloader.C4822b;

public class ExpansionFilesDownloaderAlarmReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        try {
            C4822b.m24122a(context, intent, ExpansionFilesDownloaderService.class);
        } catch (NameNotFoundException e) {
            Log.w("ExpansionFilesDownloaderAlarmReceiver", "Error starting dowload service", e);
        }
    }
}
