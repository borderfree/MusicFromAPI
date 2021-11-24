package com.seattleclouds.modules.order.indiapay.p179b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.p009v4.app.C0374l;
import android.support.p009v4.app.C0396q;
import android.support.p009v4.app.Fragment;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.modules.order.indiapay.api.C5977a;
import com.seattleclouds.modules.order.indiapay.p178a.C5974a;
import com.seattleclouds.modules.order.indiapay.p180c.C6000c;
import com.seattleclouds.modules.order.indiapay.p180c.C6001d;
import com.seattleclouds.util.C6638s;

/* renamed from: com.seattleclouds.modules.order.indiapay.b.d */
public class C5983d extends C6557s implements C5981b {

    /* renamed from: a */
    private Button f21200a;

    /* renamed from: ae */
    private boolean f21201ae = false;

    /* renamed from: af */
    private ProgressBar f21202af;

    /* renamed from: ag */
    private C5974a f21203ag;

    /* renamed from: ah */
    private Toast f21204ah;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f21205b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C6000c f21206c;

    /* renamed from: d */
    private TextView f21207d;

    /* renamed from: e */
    private TextView f21208e;

    /* renamed from: f */
    private TextView f21209f;

    /* renamed from: g */
    private Button f21210g;

    /* renamed from: h */
    private LinearLayout f21211h;

    /* renamed from: i */
    private LinearLayout f21212i;

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m29328b() {
        if (!this.f21201ae) {
            this.f21201ae = true;
            this.f21210g.setEnabled(false);
            this.f21202af.setVisibility(0);
            this.f21203ag = new C5974a(mo1316q(), this);
            this.f21203ag.execute(new Void[0]);
        }
    }

    /* renamed from: c */
    private void m29330c() {
        if (this.f21203ag != null) {
            this.f21203ag.cancel(true);
            C5977a.m29304a().mo18885b();
            this.f21201ae = false;
            this.f21210g.setEnabled(true);
            m29332m(false);
            this.f21203ag = null;
        }
    }

    /* renamed from: d */
    private void m29331d() {
        C0374l g = mo1318s().mo1469g();
        C0396q a = g.mo1536a();
        Fragment a2 = g.mo1535a("TAG_INIT_TRANSACTION");
        if (a2 != null) {
            a.mo1412a(a2);
            a.mo1431d();
        }
    }

    /* renamed from: m */
    private void m29332m(boolean z) {
        int i = 0;
        this.f21201ae = false;
        this.f21210g.setEnabled(true);
        ProgressBar progressBar = this.f21202af;
        if (!z) {
            i = 4;
        }
        progressBar.setVisibility(i);
    }

    /* renamed from: J */
    public void mo1200J() {
        super.mo1200J();
        m29331d();
    }

    /* renamed from: K */
    public void mo1201K() {
        super.mo1201K();
        m29330c();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5460i.fragment_indiapay_status_txn, viewGroup, false);
        this.f21212i = (LinearLayout) inflate.findViewById(C5458g.india_pay_qr_code_layout);
        this.f21209f = (TextView) inflate.findViewById(C5458g.india_pay_qr_code_message);
        this.f21205b = (ImageView) inflate.findViewById(C5458g.india_pay_qr_code_imageView);
        this.f21211h = (LinearLayout) inflate.findViewById(C5458g.india_pay_pay_now_layout);
        this.f21207d = (TextView) inflate.findViewById(C5458g.india_pay_pay_now_message);
        this.f21208e = (TextView) inflate.findViewById(C5458g.india_pay_pay_now_status);
        this.f21210g = (Button) inflate.findViewById(C5458g.india_pay_pay_now_check_status);
        this.f21202af = (ProgressBar) inflate.findViewById(C5458g.india_pay_pay_now_progressBar);
        this.f21210g.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C5983d.this.m29328b();
            }
        });
        this.f21200a = (Button) inflate.findViewById(C5458g.india_pay_done_button);
        this.f21200a.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C5983d.this.mo1318s().finish();
            }
        });
        if (this.f21206c.mo18936k()) {
            this.f21210g.setVisibility(8);
            this.f21212i.setVisibility(8);
            this.f21207d.setText(String.format(mo1219a(C5462k.indiapay_schenduled), new Object[]{this.f21206c.mo18917c(), this.f21206c.mo18927g(), this.f21206c.mo18933j()}));
            this.f21208e.setVisibility(8);
            this.f21200a.setVisibility(0);
            this.f21202af.setVisibility(8);
        } else if (this.f21206c.mo18958v()) {
            this.f21209f.setText(String.format(mo1219a(C5462k.indiapay_qr_cod_txn_message), new Object[]{this.f21206c.mo18917c(), this.f21206c.mo18927g()}));
            this.f21212i.setVisibility(0);
            this.f21211h.setVisibility(8);
        } else {
            this.f21210g.setEnabled(true);
            this.f21207d.setText(String.format(mo1219a(C5462k.indiapay_message_status), new Object[]{this.f21206c.mo18917c(), this.f21206c.mo18927g()}));
            this.f21208e.setText(String.format(mo1219a(C5462k.indiapay_status), new Object[]{this.f21206c.mo18959w()}));
        }
        return inflate;
    }

    /* renamed from: a */
    public void mo18889a() {
        m29332m(false);
        this.f21208e.setText(String.format(mo1219a(C5462k.indiapay_status), new Object[]{this.f21206c.mo18959w()}));
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        if (bundle != null) {
            this.f21201ae = bundle.getBoolean("is check");
        }
        this.f21206c = C6001d.m29442a().mo18963b();
        if (this.f21206c == null) {
            mo1318s().finish();
        }
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        if (this.f21206c.mo18958v() && this.f21206c.mo18960x() != null) {
            new Thread(new Runnable() {
                public void run() {
                    byte[] decode = Base64.decode(C5983d.this.f21206c.mo18960x(), 0);
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                    if (decodeByteArray != null) {
                        final Bitmap a = C6638s.m32066a(decodeByteArray, 160, 160, false);
                        if (a != null && C5983d.this.mo1318s() != null) {
                            C5983d.this.mo1318s().runOnUiThread(new Runnable() {
                                public void run() {
                                    C5983d.this.f21205b.setImageBitmap(a);
                                }
                            });
                        }
                    }
                }
            }).start();
        }
    }

    /* renamed from: a */
    public void mo18890a(String str) {
        m29332m(false);
        this.f21210g.setEnabled(true);
        if (this.f21204ah == null || this.f21204ah.getView().getWindowVisibility() != 0) {
            this.f21204ah = Toast.makeText(mo1318s(), str, 1);
            this.f21204ah.show();
        }
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.mo1245a(menuItem);
        }
        mo1318s().finish();
        return true;
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        super.mo1282e(bundle);
        bundle.putBoolean("is check", this.f21201ae);
    }
}
