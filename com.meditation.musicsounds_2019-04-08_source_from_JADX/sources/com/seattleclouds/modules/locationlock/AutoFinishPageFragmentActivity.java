package com.seattleclouds.modules.locationlock;

import android.os.Bundle;
import com.seattleclouds.SCPageFragmentActivity;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AutoFinishPageFragmentActivity extends SCPageFragmentActivity {

    /* renamed from: n */
    private long f20469n = -1;

    /* renamed from: o */
    private long f20470o = Long.MAX_VALUE;

    /* renamed from: p */
    private boolean f20471p = true;

    /* renamed from: q */
    private ScheduledThreadPoolExecutor f20472q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public ScheduledFuture<?> f20473r;

    /* renamed from: a */
    private void m28451a(long j) {
        this.f20472q = new ScheduledThreadPoolExecutor(1);
        this.f20472q.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
        this.f20473r = this.f20472q.schedule(new Runnable() {
            public void run() {
                AutoFinishPageFragmentActivity.this.runOnUiThread(new Runnable() {
                    public void run() {
                        if (AutoFinishPageFragmentActivity.this.f20473r != null) {
                            AutoFinishPageFragmentActivity.this.finish();
                            AutoFinishPageFragmentActivity.this.f20473r = null;
                        }
                    }
                });
            }
        }, j, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f20469n = extras.getLong("ARG_FINISH_TIMEOUT", this.f20469n) * 1000;
        }
        if (bundle != null && bundle.containsKey("finishDate")) {
            this.f20469n = bundle.getLong("finishDate") - System.currentTimeMillis();
            if (this.f20469n <= 0) {
                finish();
                return;
            }
        }
        if (bundle != null && bundle.containsKey("firstAppearance")) {
            this.f20471p = bundle.getBoolean("firstAppearance");
        }
        this.f20470o = System.currentTimeMillis() + this.f20469n;
        if (this.f20469n > 0) {
            m28451a(this.f20469n);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f20472q != null) {
            this.f20472q.shutdown();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (!this.f20471p && this.f20470o - System.currentTimeMillis() <= 0) {
            finish();
        }
        this.f20471p = false;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("finishDate", this.f20470o);
        bundle.putBoolean("firstAppearance", this.f20471p);
    }
}
