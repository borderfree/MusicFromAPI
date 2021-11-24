package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.p009v4.content.C0456d;

public class CustomTabActivity extends Activity {

    /* renamed from: a */
    public static final String f5184a;

    /* renamed from: b */
    public static final String f5185b;

    /* renamed from: c */
    private BroadcastReceiver f5186c;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(CustomTabActivity.class.getSimpleName());
        sb.append(".action_customTabRedirect");
        f5184a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CustomTabActivity.class.getSimpleName());
        sb2.append(".action_destroy");
        f5185b = sb2.toString();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            Intent intent2 = new Intent(f5184a);
            intent2.putExtra(CustomTabMainActivity.f5190c, getIntent().getDataString());
            C0456d.m2097a((Context) this).mo1845a(intent2);
            this.f5186c = new BroadcastReceiver() {
                public void onReceive(Context context, Intent intent) {
                    CustomTabActivity.this.finish();
                }
            };
            C0456d.m2097a((Context) this).mo1844a(this.f5186c, new IntentFilter(f5185b));
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, CustomTabMainActivity.class);
        intent.setAction(f5184a);
        intent.putExtra(CustomTabMainActivity.f5190c, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C0456d.m2097a((Context) this).mo1843a(this.f5186c);
        super.onDestroy();
    }
}
