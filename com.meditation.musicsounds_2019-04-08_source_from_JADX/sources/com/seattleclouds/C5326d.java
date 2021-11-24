package com.seattleclouds;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p009v4.app.C0366g;
import android.support.p009v4.content.C0452b;
import android.support.p023v7.app.C0751a;
import android.support.p023v7.app.C0767e;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.ads.C5247b;
import com.seattleclouds.appauth.C5279b;
import com.seattleclouds.location.geofencing.C5437a;
import com.seattleclouds.modules.p173k.C5763a;
import com.seattleclouds.p158c.C5325b;
import com.seattleclouds.startupoptions.AgreementActivity;
import com.seattleclouds.startupoptions.WelcomeActivity;
import com.seattleclouds.util.C6569aa;
import com.seattleclouds.util.C6569aa.C6570a;
import com.seattleclouds.util.C6585ah.C6587a;
import com.seattleclouds.util.C6620n;

/* renamed from: com.seattleclouds.d */
public abstract class C5326d extends C6348n {

    /* renamed from: o */
    private static String f19089o = "com.seattleclouds.modules.baidumap.GeofenceUtil.BaiduGeofenceManager";

    /* renamed from: n */
    private C5437a f19090n;

    /* renamed from: p */
    private boolean f19091p = false;

    /* renamed from: c */
    public static String m26668c(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("tab");
        sb.append(i + 1);
        sb.append(".html");
        return sb.toString();
    }

    /* renamed from: q */
    private void mo16887q() {
        mo3083i().mo2986a(0);
        setContentView(C5460i.activity_no_resources);
    }

    /* renamed from: r */
    private void mo16888r() {
        if (App.f18501c.mo16908J() || App.f18501c.mo16909K()) {
            if (C6569aa.m31796a()) {
                if (!(C0452b.m2065b((Context) this, "android.permission.ACCESS_FINE_LOCATION") == 0)) {
                    if (!this.f19091p) {
                        this.f19091p = true;
                        C6569aa.m31795a((C0767e) this, 1005, "android.permission.ACCESS_FINE_LOCATION", new int[]{C5462k.geofences_permission_location_rational, C5462k.geofences_permission_location_toast});
                        return;
                    }
                    return;
                }
            }
            if (App.f18501c.mo16908J()) {
                this.f19090n = new C5437a(this);
                this.f19090n.mo17743a(true);
            } else if (App.f18501c.mo16909K()) {
                mo17205n();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public FragmentInfo mo16878a(String str) {
        FragmentInfo a = str.equals(str) ? App.m25606a(App.m25655h(str), (Context) this) : App.m25606a(str, (Context) this);
        if (a == null) {
            a = App.m25672q(App.m25655h(str));
        }
        if (a != null) {
            a.mo16870c().putBoolean("ARG_IS_ROOT_FRAGMENT", true);
        }
        return a;
    }

    /* renamed from: b */
    public void mo17482b(String str) {
        App.m25640c((Context) this, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract void mo16842m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo17205n() {
        String str;
        String sb;
        try {
            Class cls = Class.forName(f19089o);
            if (cls != null) {
                Intent intent = new Intent(getApplicationContext(), cls);
                Bundle bundle = new Bundle();
                bundle.putBoolean("isGeofencingEnabled", App.f18501c.mo16909K());
                intent.putExtras(bundle);
                try {
                    startService(intent);
                    return;
                } catch (SecurityException e) {
                    str = "BaseAppActivity";
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Started BaiduGeofenceManager service catch SecurityException, ");
                    sb2.append(e.getStackTrace());
                    sb = sb2.toString();
                } catch (IllegalStateException e2) {
                    str = "BaseAppActivity";
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Started BaiduGeofenceManager service catch IllegalStateException, ");
                    sb3.append(e2.getStackTrace());
                    sb = sb3.toString();
                }
            } else {
                return;
            }
            Log.e(str, sb);
        } catch (ClassNotFoundException e3) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Failed to load BaiduGeofenceManager: ");
            sb4.append(f19089o);
            Log.e("BaseAppActivity", sb4.toString(), e3);
        }
    }

    /* JADX INFO: used method not loaded: com.seattleclouds.appauth.b.a(android.app.Activity):null, types can be incorrect */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        com.seattleclouds.appauth.C5279b.m26364a((android.app.Activity) r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r2, int r3, android.content.Intent r4) {
        /*
            r1 = this;
            r0 = 3
            switch(r2) {
                case 1: goto L_0x0026;
                case 2: goto L_0x0015;
                case 3: goto L_0x0011;
                default: goto L_0x0004;
            }
        L_0x0004:
            com.seattleclouds.location.geofencing.a r0 = r1.f19090n
            if (r0 == 0) goto L_0x0054
            com.seattleclouds.location.geofencing.a r0 = r1.f19090n
            boolean r0 = r0.mo17744a(r2, r3, r4)
            if (r0 == 0) goto L_0x0054
            goto L_0x0057
        L_0x0011:
            com.seattleclouds.appauth.C5279b.m26364a(r1)
            goto L_0x0057
        L_0x0015:
            r2 = -1
            if (r3 != r2) goto L_0x0022
            boolean r2 = com.seattleclouds.startupoptions.WelcomeActivity.m31723a(r1)
            if (r2 == 0) goto L_0x0011
            com.seattleclouds.startupoptions.WelcomeActivity.m31722a(r1, r0)
            goto L_0x0057
        L_0x0022:
            r1.finish()
            goto L_0x0057
        L_0x0026:
            r2 = 1
            if (r3 != r2) goto L_0x0047
            java.lang.String r2 = com.seattleclouds.App.f18524z
            java.lang.String r3 = "Tx7EcUcOd70UeXxV0b0L_"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L_0x0043
            java.lang.String r2 = com.seattleclouds.App.f18524z
            java.lang.String r3 = "Tx7EcUcOd70UeXxV0b0L_"
            int r3 = r3.length()
            java.lang.String r2 = r2.substring(r3)
            com.seattleclouds.AppStarterActivity.m25693a(r1, r2)
            goto L_0x0022
        L_0x0043:
            com.seattleclouds.AppStarterActivity.m25705c(r1)
            goto L_0x0022
        L_0x0047:
            r2 = 2
            if (r3 != r2) goto L_0x004e
            r1.mo16887q()
            goto L_0x0057
        L_0x004e:
            if (r3 != r0) goto L_0x0057
            com.seattleclouds.appauth.C5279b.m26383c(r1)
            goto L_0x0057
        L_0x0054:
            super.onActivityResult(r2, r3, r4)
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.C5326d.onActivityResult(int, int, android.content.Intent):void");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.getBoolean("restart")) {
                AppStarterActivity.m25705c((Activity) this);
                finish();
                return;
            } else if (extras.getBoolean("finishApp")) {
                finish();
                return;
            }
        }
        C0751a i = mo3083i();
        if (i != null) {
            i.mo2992a(false);
        }
        if (!App.f18501c.mo16937b()) {
            C6620n.m32027a((Context) this, C5462k.error_initializing_app);
            mo16887q();
            return;
        }
        mo16888r();
        if (bundle != null) {
            boolean z = bundle.getBoolean("STATE_RESUME_BG_PLAYER");
            this.f19091p = bundle.getBoolean("STATE_LOCATION_PERMISSION_REQUESTED");
            if (bundle.getBoolean("STATE_CONNECTING_BG_PLAYER")) {
                App.f18487T.mo20573a((C0366g) mo1469g().mo1535a(C6587a.f23301ae));
            }
            if (z) {
                App.f18487T.mo20572a();
            }
            if (this.f19090n != null) {
                this.f19090n.mo17745b(bundle.getBoolean("STATE_ALREADY_SHOWED_PLAY_SRV_MESSAGE"));
            }
            App.m25623a(true);
        } else if (AgreementActivity.m31720a(this)) {
            AgreementActivity.m31718a((Activity) this, 2);
        } else if (WelcomeActivity.m31723a(this)) {
            WelcomeActivity.m31722a(this, 3);
        } else {
            C5279b.m26364a((Activity) this);
        }
        C5247b.m26194b((Activity) this);
        mo16842m();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!(App.f18510l || App.f18501c.mo16957g())) {
            return super.onCreateOptionsMenu(menu);
        }
        getMenuInflater().inflate(C5461j.app_main, menu);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        App.f18486S.mo20578c();
        App.f18487T.mo20576b();
        App.m25623a(false);
        C5763a.f20423a = null;
        C5763a.f20424b = null;
        C5247b.m26196c(this);
        C5325b.m26652a();
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != C5458g.settings) {
            return super.onOptionsItemSelected(menuItem);
        }
        startActivityForResult(new Intent(this, SettingsActivity.class), 1);
        return true;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 1005) {
            if (!C6569aa.m31801a(strArr, iArr, "android.permission.ACCESS_FINE_LOCATION")) {
                new Handler(Looper.myLooper()).postDelayed(new Runnable() {
                    public void run() {
                        C6570a.m31804a(false, C5462k.geofences_permission_location_denied).mo1448a(C5326d.this.mo1469g(), "permissionDialog");
                    }
                }, 400);
            } else {
                Toast.makeText(this, C5462k.common_permission_granted, 0).show();
                if (App.f18501c.mo16908J()) {
                    this.f19090n = new C5437a(this);
                    this.f19090n.mo17743a(true);
                } else if (App.f18501c.mo16909K()) {
                    mo17205n();
                }
            }
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        App.m25616a((Activity) this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("STATE_RESUME_BG_PLAYER", App.f18487T.mo20580e());
        bundle.putBoolean("STATE_CONNECTING_BG_PLAYER", App.f18487T.mo20582g());
        bundle.putBoolean("STATE_LOCATION_PERMISSION_REQUESTED", this.f19091p);
        if (this.f19090n != null) {
            bundle.putBoolean("STATE_ALREADY_SHOWED_PLAY_SRV_MESSAGE", this.f19090n.mo17746b());
        }
        super.onSaveInstanceState(bundle);
    }
}
