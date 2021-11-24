package com.seattleclouds.modules.order.indiapay.p179b;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.p009v4.app.C0374l;
import android.support.p009v4.app.C0396q;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.widget.NestedScrollView;
import android.support.p023v7.widget.AppCompatCheckBox;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.modules.order.indiapay.p180c.C6000c;
import com.seattleclouds.modules.order.indiapay.p180c.C6001d;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6611g;

/* renamed from: com.seattleclouds.modules.order.indiapay.b.e */
public class C5988e extends C6557s {

    /* renamed from: a */
    private static final String f21218a = "e";
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public EditText f21219ae;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public TextInputLayout f21220af;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public EditText f21221ag;
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public TextInputLayout f21222ah;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public EditText f21223ai;
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public TextInputLayout f21224aj;
    /* access modifiers changed from: private */

    /* renamed from: ak */
    public NestedScrollView f21225ak;
    /* access modifiers changed from: private */

    /* renamed from: al */
    public AppCompatCheckBox f21226al;
    /* access modifiers changed from: private */

    /* renamed from: am */
    public AppCompatCheckBox f21227am;
    /* access modifiers changed from: private */

    /* renamed from: an */
    public AppCompatCheckBox f21228an;

    /* renamed from: ao */
    private LinearLayout f21229ao;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f21230b = true;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public TextInputLayout f21231c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public EditText f21232d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C6000c f21233e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public TextInputLayout f21234f;

    /* renamed from: g */
    private EditText f21235g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public EditText f21236h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public TextInputLayout f21237i;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m29342a(TextInputLayout textInputLayout) {
        textInputLayout.setError(mo1219a(C5462k.indiapay_field_required));
        textInputLayout.requestFocus();
    }

    /* renamed from: a */
    private void m29343a(final EditText editText) {
        this.f21225ak.post(new Runnable() {
            public void run() {
                C5988e.this.f21225ak.scrollTo(0, editText.getBottom());
            }
        });
    }

    /* renamed from: a */
    private void m29344a(EditText editText, TextInputLayout textInputLayout) {
        m29345a(editText, textInputLayout, C5462k.indiapay_field_required);
    }

    /* renamed from: a */
    private void m29345a(EditText editText, final TextInputLayout textInputLayout, final int i) {
        editText.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (charSequence.length() < 0) {
                    textInputLayout.setError(C5988e.this.mo1219a(i));
                    textInputLayout.setErrorEnabled(true);
                    return;
                }
                textInputLayout.setError(null);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m29351b() {
        C0396q a = mo1318s().mo1469g().mo1536a();
        Fragment a2 = mo1318s().mo1469g().mo1535a("KEY_DATE_PICKER_DIALOG");
        if (a2 != null) {
            a.mo1412a(a2);
        }
        C5982c cVar = new C5982c();
        cVar.mo1238a((Fragment) this, 1221);
        cVar.mo1446a(a, "KEY_DATE_PICKER_DIALOG");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m29352b(EditText editText, TextInputLayout textInputLayout, int i) {
        textInputLayout.setError(mo1219a(i));
        textInputLayout.requestFocus();
        m29343a(editText);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m29354c() {
        C0374l g = mo1318s().mo1469g();
        C0396q a = g.mo1536a();
        Fragment a2 = g.mo1535a("TAG_INIT_TRANSACTION");
        if (a2 != null) {
            a.mo1412a(a2);
        }
        Editor edit = mo1316q().getSharedPreferences("OrderInfo", 0).edit();
        edit.putString("STATUS_TXN", "INIT_TXN");
        edit.apply();
        C5996f fVar = new C5996f();
        fVar.mo1280d(true);
        a.mo1413a((Fragment) fVar, "TAG_INIT_TRANSACTION");
        a.mo1428c();
    }

    /* renamed from: c */
    private void m29355c(View view) {
        if (this.f21233e == null) {
            mo1318s().finish();
            return;
        }
        this.f21225ak = (NestedScrollView) view.findViewById(C5458g.india_pay_nested_scroll_view);
        this.f21231c = (TextInputLayout) view.findViewById(C5458g.text_input_layout_vpa);
        this.f21232d = (EditText) view.findViewById(C5458g.edit_text_vpa);
        m29345a(this.f21232d, this.f21231c, C5462k.indiapay_error_message);
        this.f21235g = (EditText) view.findViewById(C5458g.india_pay_select_edit_text);
        this.f21234f = (TextInputLayout) view.findViewById(C5458g.india_pay_select_date_input_layout);
        this.f21235g.setCompoundDrawablesWithIntrinsicBounds(null, null, C6611g.m31973a((Context) mo1318s(), C5457f.ic_date_range_new_order), null);
        this.f21235g.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C5988e.this.m29351b();
            }
        });
        this.f21234f.setVisibility(this.f21233e.mo18936k() ? 0 : 8);
        this.f21226al = (AppCompatCheckBox) view.findViewById(C5458g.india_pay_pay_now_checkbox);
        this.f21227am = (AppCompatCheckBox) view.findViewById(C5458g.india_pay_schedule_later_checkbox);
        this.f21228an = (AppCompatCheckBox) view.findViewById(C5458g.india_pay_qr_code_checkbox);
        Button button = (Button) view.findViewById(C5458g.submit_button);
        EditText editText = (EditText) view.findViewById(C5458g.edit_text_unq_cust_id);
        EditText editText2 = (EditText) view.findViewById(C5458g.edit_text_txn_dtl);
        EditText editText3 = (EditText) view.findViewById(C5458g.edit_text_amount);
        if (!(editText == null || editText2 == null || editText3 == null)) {
            editText.setText(this.f21233e.mo18925f());
            editText.setTag(editText.getKeyListener());
            editText.setKeyListener(null);
            editText2.setText(this.f21233e.mo18920d());
            editText2.setTag(editText2.getKeyListener());
            editText2.setKeyListener(null);
            editText3.setText(this.f21233e.mo18917c());
            editText3.setTag(editText3.getKeyListener());
            editText3.setKeyListener(null);
        }
        if (button != null) {
            button.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    String trim = C5988e.this.f21232d.getText().toString().trim();
                    if (trim.isEmpty()) {
                        C5988e.this.m29352b(C5988e.this.f21232d, C5988e.this.f21231c, C5462k.indiapay_error_message);
                    } else if (!trim.matches("^[a-zA-Z0-9.-]+@[a-zA-Z0-9.-]+$")) {
                        C5988e.this.m29352b(C5988e.this.f21232d, C5988e.this.f21231c, C5462k.indiapay_error_message_valid_vpa);
                    } else {
                        C5988e.this.f21233e.mo18926f(trim);
                        if (C5988e.this.f21233e.mo18946p()) {
                            String trim2 = C5988e.this.f21236h.getText().toString().trim();
                            String trim3 = C5988e.this.f21219ae.getText().toString().trim();
                            String trim4 = C5988e.this.f21221ag.getText().toString().trim();
                            String trim5 = C5988e.this.f21223ai.getText().toString().trim();
                            if (C6592al.m31910c(trim2)) {
                                C5988e.this.m29342a(C5988e.this.f21237i);
                                return;
                            } else if (C6592al.m31910c(trim3)) {
                                C5988e.this.m29342a(C5988e.this.f21220af);
                                return;
                            } else if (C6592al.m31910c(trim4)) {
                                C5988e.this.m29342a(C5988e.this.f21222ah);
                                return;
                            } else if (C6592al.m31910c(trim5)) {
                                C5988e.this.m29342a(C5988e.this.f21224aj);
                                return;
                            } else {
                                C5988e.this.f21233e.mo18950r(trim2);
                                C5988e.this.f21233e.mo18944o(trim3);
                                C5988e.this.f21233e.mo18945p(trim4);
                                C5988e.this.f21233e.mo18948q(trim5);
                            }
                        }
                        if (!C5988e.this.f21233e.mo18936k() || !C6592al.m31909b(C5988e.this.f21233e.mo18933j())) {
                            C5988e.this.m29354c();
                        } else {
                            C5988e.this.m29342a(C5988e.this.f21234f);
                        }
                    }
                }
            });
        }
        this.f21226al.setChecked(this.f21230b);
        this.f21226al.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C5988e.this.f21230b = true;
                C5988e.this.f21233e.mo18913a(false);
                C5988e.this.f21233e.mo18922d(false);
                C5988e.this.f21226al.setChecked(true);
                C5988e.this.f21228an.setChecked(false);
                C5988e.this.f21227am.setChecked(false);
                C5988e.this.f21234f.setVisibility(8);
            }
        });
        this.f21228an.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C5988e.this.f21230b = false;
                C5988e.this.f21233e.mo18913a(false);
                C5988e.this.f21233e.mo18922d(true);
                C5988e.this.f21226al.setChecked(false);
                C5988e.this.f21228an.setChecked(true);
                C5988e.this.f21227am.setChecked(false);
                C5988e.this.f21234f.setVisibility(8);
            }
        });
        this.f21227am.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C5988e.this.f21230b = false;
                C5988e.this.f21233e.mo18922d(false);
                C5988e.this.f21233e.mo18913a(true);
                C5988e.this.f21226al.setChecked(false);
                C5988e.this.f21228an.setChecked(false);
                C5988e.this.f21227am.setChecked(true);
                C5988e.this.f21234f.setVisibility(0);
            }
        });
    }

    /* renamed from: d */
    private void m29357d(View view) {
        this.f21229ao = (LinearLayout) view.findViewById(C5458g.delivery_container);
        this.f21236h = (EditText) view.findViewById(C5458g.delivery_address_edit_text);
        this.f21237i = (TextInputLayout) view.findViewById(C5458g.delivery_address_input_layout);
        this.f21219ae = (EditText) view.findViewById(C5458g.delivery_city_edit_text);
        this.f21220af = (TextInputLayout) view.findViewById(C5458g.delivery_city_input_layout);
        this.f21221ag = (EditText) view.findViewById(C5458g.delivery_state_edit_text);
        this.f21222ah = (TextInputLayout) view.findViewById(C5458g.delivery_state_input_layout);
        this.f21223ai = (EditText) view.findViewById(C5458g.delivery_pincode_edit_text);
        this.f21224aj = (TextInputLayout) view.findViewById(C5458g.delivery_pincode_input_layout);
        m29344a(this.f21236h, this.f21237i);
        m29344a(this.f21219ae, this.f21220af);
        m29344a(this.f21221ag, this.f21222ah);
        m29344a(this.f21223ai, this.f21224aj);
        this.f21229ao.setVisibility(this.f21233e.mo18946p() ? 0 : 8);
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5460i.fragment_indiapay_input_form, viewGroup, false);
        m29355c(inflate);
        m29357d(inflate);
        return inflate;
    }

    /* renamed from: a */
    public void mo1222a(int i, int i2, Intent intent) {
        super.mo1222a(i, i2, intent);
        if (i2 == -1 && i == 1221) {
            String stringExtra = intent.getStringExtra("date");
            this.f21233e.mo18938l(stringExtra);
            this.f21235g.setText(stringExtra);
            this.f21234f.setErrorEnabled(false);
        }
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        if (bundle != null) {
            this.f21230b = bundle.getBoolean("KEY_TRANSACTION_STATUS");
        }
        this.f21233e = C6001d.m29442a().mo18963b();
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        super.mo1282e(bundle);
        bundle.putBoolean("KEY_TRANSACTION_STATUS", this.f21230b);
    }
}
