package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.p009v4.content.C0456d;
import com.facebook.internal.C2216e;

public class CustomTabMainActivity extends Activity {

    /* renamed from: a */
    public static final String f5188a;

    /* renamed from: b */
    public static final String f5189b;

    /* renamed from: c */
    public static final String f5190c;

    /* renamed from: d */
    public static final String f5191d;

    /* renamed from: e */
    private boolean f5192e = true;

    /* renamed from: f */
    private BroadcastReceiver f5193f;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(CustomTabMainActivity.class.getSimpleName());
        sb.append(".extra_params");
        f5188a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CustomTabMainActivity.class.getSimpleName());
        sb2.append(".extra_chromePackage");
        f5189b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(CustomTabMainActivity.class.getSimpleName());
        sb3.append(".extra_url");
        f5190c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(CustomTabMainActivity.class.getSimpleName());
        sb4.append(".action_refresh");
        f5191d = sb4.toString();
    }

    /* renamed from: a */
    public static final String m8006a() {
        StringBuilder sb = new StringBuilder();
        sb.append("fb");
        sb.append(C2189f.m10096j());
        sb.append("://authorize");
        return sb.toString();
    }

    /* renamed from: a */
    private void m8007a(int i, Intent intent) {
        C0456d.m2097a((Context) this).mo1843a(this.f5193f);
        if (intent != null) {
            setResult(i, intent);
        } else {
            setResult(i);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (CustomTabActivity.f5184a.equals(getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (bundle == null) {
            Bundle bundleExtra = getIntent().getBundleExtra(f5188a);
            new C2216e("oauth", bundleExtra).mo7826a(this, getIntent().getStringExtra(f5189b));
            this.f5192e = false;
            this.f5193f = new BroadcastReceiver() {
                public void onReceive(Context context, Intent intent) {
                    Intent intent2 = new Intent(CustomTabMainActivity.this, CustomTabMainActivity.class);
                    intent2.setAction(CustomTabMainActivity.f5191d);
                    intent2.putExtra(CustomTabMainActivity.f5190c, intent.getStringExtra(CustomTabMainActivity.f5190c));
                    intent2.addFlags(603979776);
                    CustomTabMainActivity.this.startActivity(intent2);
                }
            };
            C0456d.m2097a((Context) this).mo1844a(this.f5193f, new IntentFilter(CustomTabActivity.f5184a));
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (f5191d.equals(intent.getAction())) {
            C0456d.m2097a((Context) this).mo1845a(new Intent(CustomTabActivity.f5185b));
        } else if (!CustomTabActivity.f5184a.equals(intent.getAction())) {
            return;
        }
        m8007a(-1, intent);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f5192e) {
            m8007a(0, null);
        }
        this.f5192e = true;
    }
}
