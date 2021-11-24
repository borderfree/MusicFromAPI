package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3861r;

@C3464ci
public final class zzs extends C3861r {

    /* renamed from: a */
    private AdOverlayInfoParcel f10083a;

    /* renamed from: b */
    private Activity f10084b;

    /* renamed from: c */
    private boolean f10085c = false;

    /* renamed from: d */
    private boolean f10086d = false;

    public zzs(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f10083a = adOverlayInfoParcel;
        this.f10084b = activity;
    }

    /* renamed from: a */
    private final synchronized void m13594a() {
        if (!this.f10086d) {
            if (this.f10083a.zzbyn != null) {
                this.f10083a.zzbyn.zzcb();
            }
            this.f10086d = true;
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onBackPressed() {
    }

    public final void onCreate(Bundle bundle) {
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        if (this.f10083a != null && !z) {
            if (bundle == null) {
                if (this.f10083a.zzbym != null) {
                    this.f10083a.zzbym.onAdClicked();
                }
                if (!(this.f10084b.getIntent() == null || !this.f10084b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) || this.f10083a.zzbyn == null)) {
                    this.f10083a.zzbyn.zzcc();
                }
            }
            zzbv.zzeh();
            if (!zza.zza(this.f10084b, this.f10083a.zzbyl, this.f10083a.zzbyt)) {
                this.f10084b.finish();
            }
            return;
        }
        this.f10084b.finish();
    }

    public final void onDestroy() {
        if (this.f10084b.isFinishing()) {
            m13594a();
        }
    }

    public final void onPause() {
        if (this.f10083a.zzbyn != null) {
            this.f10083a.zzbyn.onPause();
        }
        if (this.f10084b.isFinishing()) {
            m13594a();
        }
    }

    public final void onRestart() {
    }

    public final void onResume() {
        if (this.f10085c) {
            this.f10084b.finish();
            return;
        }
        this.f10085c = true;
        if (this.f10083a.zzbyn != null) {
            this.f10083a.zzbyn.onResume();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f10085c);
    }

    public final void onStart() {
    }

    public final void onStop() {
        if (this.f10084b.isFinishing()) {
            m13594a();
        }
    }

    public final void zzax() {
    }

    public final boolean zznj() {
        return false;
    }

    public final void zzo(C3323b bVar) {
    }
}
