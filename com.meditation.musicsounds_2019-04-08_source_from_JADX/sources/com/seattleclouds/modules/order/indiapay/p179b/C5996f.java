package com.seattleclouds.modules.order.indiapay.p179b;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.support.p009v4.app.C0396q;
import android.view.KeyEvent;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.modules.order.indiapay.p178a.C5975b;
import com.seattleclouds.modules.order.indiapay.p178a.C5976c;
import com.seattleclouds.modules.order.indiapay.p180c.C6000c;
import com.seattleclouds.modules.order.indiapay.p180c.C6001d;
import com.seattleclouds.util.C6595ao;
import java.util.ArrayList;

/* renamed from: com.seattleclouds.modules.order.indiapay.b.f */
public class C5996f extends C6557s implements OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private static final String f21248a = "f";

    /* renamed from: b */
    private volatile boolean f21249b;

    /* renamed from: c */
    private C5975b f21250c;

    /* renamed from: d */
    private C5976c f21251d;

    /* renamed from: e */
    private ProgressDialog f21252e;

    /* renamed from: f */
    private String f21253f = "";

    /* renamed from: as */
    private void m29376as() {
        ArrayList b = App.f18489V.mo17518b();
        if (b != null) {
            b.clear();
        }
    }

    /* renamed from: d */
    private void m29377d() {
        this.f21252e = new ProgressDialog(mo1318s());
        this.f21252e.setTitle(mo1219a(C5462k.indiapay_info_message_transaction_processing));
        this.f21252e.setMessage(mo1219a(C5462k.indiapay_info_message_please_wait));
        this.f21252e.setIndeterminate(true);
        this.f21252e.setCancelable(false);
        this.f21252e.setCanceledOnTouchOutside(false);
        this.f21252e.setOnKeyListener(new OnKeyListener() {
            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return i == 4;
            }
        });
        this.f21252e.show();
    }

    /* renamed from: d */
    private void m29378d(String str) {
        try {
            C5978a.m29318a(mo1219a(C5462k.indiapay_error_transaction_failed), str).mo1448a(mo1318s().mo1469g(), "TAG_ALERT_DIALOG");
        } catch (IllegalStateException unused) {
            C6595ao.m31930a((Context) mo1318s(), str, true);
            mo1318s().finish();
        }
    }

    /* renamed from: e */
    private void m29379e() {
        try {
            m29380e("FINISH_TXN");
            C0396q a = mo1318s().mo1469g().mo1536a();
            a.mo1423b(C5458g.indiaPay_container, new C5983d(), "TAG_QR_CODE_FRAGMENT");
            a.mo1428c();
        } catch (IllegalStateException unused) {
            C6595ao.m31930a((Context) mo1318s(), mo1219a(C5462k.indiapay_message_received), true);
            mo1318s().finish();
        }
    }

    /* renamed from: e */
    private void m29380e(String str) {
        Editor edit = mo1316q().getSharedPreferences("OrderInfo", 0).edit();
        edit.putString("STATUS_TXN", str);
        edit.apply();
    }

    /* renamed from: J */
    public void mo1200J() {
        super.mo1200J();
        C6000c b = C6001d.m29442a().mo18963b();
        this.f21249b = true;
        SharedPreferences sharedPreferences = mo1316q().getSharedPreferences("OrderInfo", 0);
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.f21253f = sharedPreferences.getString("STATUS_TXN", "");
        if ("START_TXN".equals(this.f21253f) || "INIT_TXN".equals(this.f21253f) || "SUCCESS_GET_KEY".equals(this.f21253f)) {
            m29377d();
        } else if ("FAILED_TXN".equals(this.f21253f)) {
            if (mo1318s().mo1469g().mo1535a("TAG_ALERT_DIALOG") == null) {
                m29378d(b.mo18961y());
            }
        } else if ("SUCCESS_TXN".equals(this.f21253f) && mo1318s().mo1469g().mo1535a("TAG_QR_CODE_FRAGMENT") == null) {
            m29376as();
            m29379e();
        }
    }

    /* renamed from: K */
    public void mo1201K() {
        super.mo1201K();
        this.f21249b = false;
        if (this.f21252e != null) {
            this.f21252e.dismiss();
            this.f21252e = null;
        }
        mo1316q().getSharedPreferences("OrderInfo", 0).unregisterOnSharedPreferenceChangeListener(this);
    }

    /* renamed from: b */
    public void mo1450b() {
        if (this.f21251d == null) {
            this.f21251d = new C5976c(mo1318s().getApplicationContext());
            this.f21251d.execute(new Void[0]);
        }
    }

    /* renamed from: c */
    public void mo1453c() {
        if (this.f21249b) {
            m29379e();
            if (this.f21252e != null) {
                this.f21252e.dismiss();
            }
        }
    }

    /* renamed from: c */
    public void mo18905c(String str) {
        if (this.f21249b) {
            m29378d(str);
            if (this.f21252e != null) {
                this.f21252e.dismiss();
            }
        }
    }

    /* renamed from: g */
    public void mo1288g() {
        super.mo1288g();
        this.f21253f = mo1316q().getSharedPreferences("OrderInfo", 0).getString("STATUS_TXN", "");
        if ("INIT_TXN".equals(this.f21253f) && this.f21250c == null) {
            m29380e("START_TXN");
            this.f21250c = new C5975b(mo1318s().getApplicationContext());
            this.f21250c.execute(new Void[0]);
        }
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        C6000c b = C6001d.m29442a().mo18963b();
        if ("STATUS_TXN".equals(str)) {
            String string = sharedPreferences.getString("STATUS_TXN", "");
            char c = 65535;
            int hashCode = string.hashCode();
            if (hashCode != -1423394470) {
                if (hashCode != 885954542) {
                    if (hashCode == 1051563848 && string.equals("FAILED_TXN")) {
                        c = 2;
                    }
                } else if (string.equals("SUCCESS_TXN")) {
                    c = 1;
                }
            } else if (string.equals("SUCCESS_GET_KEY")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    mo1450b();
                    return;
                case 1:
                    m29376as();
                    mo1453c();
                    return;
                case 2:
                    mo18905c(b.mo18961y());
                    return;
                default:
                    return;
            }
        }
    }
}
