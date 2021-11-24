package com.seattleclouds.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.util.Log;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.seattleclouds.util.ai */
public class C6588ai extends MutableContextWrapper {

    /* renamed from: a */
    private static final String f23302a = "ai";

    /* renamed from: b */
    private List<BroadcastReceiver> f23303b = new LinkedList();

    public C6588ai(Context context) {
        super(context);
    }

    /* renamed from: a */
    private void m31896a(BroadcastReceiver broadcastReceiver) {
        this.f23303b.add(broadcastReceiver);
    }

    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        m31896a(broadcastReceiver);
        return super.registerReceiver(broadcastReceiver, intentFilter);
    }

    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        m31896a(broadcastReceiver);
        return super.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    public void setBaseContext(Context context) {
        for (BroadcastReceiver unregisterReceiver : this.f23303b) {
            unregisterReceiver(unregisterReceiver);
        }
        super.setBaseContext(context);
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        if (this.f23303b.contains(broadcastReceiver)) {
            try {
                super.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e) {
                Log.w(f23302a, "unregisterReceiver exception: ", e);
            }
        }
        this.f23303b.remove(broadcastReceiver);
    }
}
