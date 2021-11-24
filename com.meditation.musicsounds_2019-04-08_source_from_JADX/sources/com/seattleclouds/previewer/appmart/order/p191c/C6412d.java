package com.seattleclouds.previewer.appmart.order.p191c;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.previewer.appmart.order.p190b.C6388a;

/* renamed from: com.seattleclouds.previewer.appmart.order.c.d */
public class C6412d extends C6557s {

    /* renamed from: a */
    public static final String f22793a = "com.seattleclouds.previewer.appmart.order.c.d";
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public TextInputLayout f22794ae;

    /* renamed from: af */
    private EditText f22795af;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public TextInputLayout f22796ag;

    /* renamed from: ah */
    private EditText f22797ah;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public TextInputLayout f22798ai;

    /* renamed from: aj */
    private EditText f22799aj;
    /* access modifiers changed from: private */

    /* renamed from: ak */
    public TextInputLayout f22800ak;

    /* renamed from: al */
    private EditText f22801al;
    /* access modifiers changed from: private */

    /* renamed from: am */
    public TextInputLayout f22802am;

    /* renamed from: an */
    private EditText f22803an;
    /* access modifiers changed from: private */

    /* renamed from: ao */
    public TextInputLayout f22804ao;
    /* access modifiers changed from: private */

    /* renamed from: ap */
    public C6388a f22805ap;
    /* access modifiers changed from: private */

    /* renamed from: aq */
    public TextInputLayout f22806aq;

    /* renamed from: ar */
    private EditText f22807ar;

    /* renamed from: as */
    private EditText f22808as;

    /* renamed from: at */
    private EditText f22809at;

    /* renamed from: au */
    private EditText f22810au;

    /* renamed from: b */
    private RelativeLayout f22811b;

    /* renamed from: c */
    private EditText f22812c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public TextInputLayout f22813d;

    /* renamed from: e */
    private EditText f22814e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public TextInputLayout f22815f;

    /* renamed from: g */
    private EditText f22816g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public TextInputLayout f22817h;

    /* renamed from: i */
    private EditText f22818i;

    /* renamed from: a */
    private boolean m31160a(EditText editText) {
        if (editText.getText() != null) {
            String obj = editText.getText().toString();
            if (!obj.isEmpty() && obj.trim().length() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private boolean m31161a(EditText editText, TextInputLayout textInputLayout) {
        if (!m31160a(editText)) {
            return false;
        }
        m31165c(editText, textInputLayout);
        return true;
    }

    /* renamed from: b */
    private boolean m31163b(EditText editText, TextInputLayout textInputLayout) {
        if (!m31161a(editText, textInputLayout)) {
            if (editText.getText().toString().matches(Patterns.EMAIL_ADDRESS.pattern())) {
                return true;
            }
            textInputLayout.setError(mo1320t().getString(C5462k.new_order_error_incorrect_email));
            editText.getParent().requestChildFocus(editText, editText);
        }
        return false;
    }

    /* renamed from: c */
    private void m31165c(EditText editText, TextInputLayout textInputLayout) {
        textInputLayout.setError(mo1320t().getString(C5462k.new_order_error_text_appearance));
        editText.getParent().requestChildFocus(editText, editText);
    }

    /* renamed from: d */
    private void m31167d() {
        if (this.f22805ap.mo19881V()) {
            this.f22811b.setVisibility(0);
        }
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f22805ap = C6388a.m31014a();
        View inflate = layoutInflater.inflate(C5460i.fragment_new_order_information, viewGroup, false);
        this.f22813d = (TextInputLayout) inflate.findViewById(C5458g.text_input_layout);
        this.f22794ae = (TextInputLayout) inflate.findViewById(C5458g.text_input_layout_phone_personal);
        this.f22815f = (TextInputLayout) inflate.findViewById(C5458g.text_input_layout_user_email);
        this.f22817h = (TextInputLayout) inflate.findViewById(C5458g.text_input_layout_company_name);
        this.f22798ai = (TextInputLayout) inflate.findViewById(C5458g.text_input_layout_company_email);
        this.f22796ag = (TextInputLayout) inflate.findViewById(C5458g.text_input_layout_phone_company);
        this.f22800ak = (TextInputLayout) inflate.findViewById(C5458g.text_input_layout_company_address);
        this.f22802am = (TextInputLayout) inflate.findViewById(C5458g.text_input_layout_country);
        this.f22804ao = (TextInputLayout) inflate.findViewById(C5458g.text_input_layout_language);
        this.f22806aq = (TextInputLayout) inflate.findViewById(C5458g.text_input_layout_company_web_site);
        Spinner spinner = (Spinner) inflate.findViewById(C5458g.spinner_device_type_order);
        this.f22811b = (RelativeLayout) inflate.findViewById(C5458g.device_type_layout);
        this.f22812c = (EditText) inflate.findViewById(C5458g.edit_text_user_name_order);
        this.f22812c.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                if (!editable.toString().isEmpty()) {
                    C6412d.this.f22813d.setError(null);
                    C6412d.this.f22805ap.mo19888a(editable.toString().trim());
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f22818i = (EditText) inflate.findViewById(C5458g.edit_text_phone_personal_order);
        this.f22818i.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                if (!editable.toString().isEmpty()) {
                    C6412d.this.f22794ae.setError(null);
                    C6412d.this.f22805ap.mo19894c(editable.toString().trim());
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f22814e = (EditText) inflate.findViewById(C5458g.edit_text_user_email_order);
        this.f22814e.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                String trim = editable.toString().trim();
                if (!trim.isEmpty()) {
                    C6412d.this.f22815f.setError(null);
                    C6412d.this.f22805ap.mo19891b(trim);
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f22816g = (EditText) inflate.findViewById(C5458g.edit_text_company_name_order);
        this.f22816g.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                if (!editable.toString().isEmpty()) {
                    C6412d.this.f22817h.setError(null);
                    C6412d.this.f22805ap.mo19897d(editable.toString().trim());
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f22795af = (EditText) inflate.findViewById(C5458g.edit_text_phone_company_order);
        this.f22795af.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                if (!editable.toString().isEmpty()) {
                    C6412d.this.f22796ag.setError(null);
                    C6412d.this.f22805ap.mo19900e(editable.toString().trim());
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f22797ah = (EditText) inflate.findViewById(C5458g.edit_text_company_email_order);
        this.f22797ah.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                String trim = editable.toString().trim();
                if (!trim.isEmpty()) {
                    C6412d.this.f22798ai.setError(null);
                    C6412d.this.f22805ap.mo19902f(trim);
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f22799aj = (EditText) inflate.findViewById(C5458g.edit_text_company_address);
        this.f22799aj.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                String trim = editable.toString().trim();
                if (!trim.isEmpty()) {
                    C6412d.this.f22800ak.setError(null);
                    C6412d.this.f22805ap.mo19904g(trim);
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f22807ar = (EditText) inflate.findViewById(C5458g.edit_text_web_site_order);
        this.f22807ar.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                String trim = editable.toString().trim();
                if (!trim.isEmpty()) {
                    C6412d.this.f22806aq.setError(null);
                    C6412d.this.f22805ap.mo19910j(trim);
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f22801al = (EditText) inflate.findViewById(C5458g.edit_text_country);
        this.f22801al.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                if (!editable.toString().isEmpty()) {
                    C6412d.this.f22802am.setError(null);
                    C6412d.this.f22805ap.mo19906h(editable.toString().trim());
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f22803an = (EditText) inflate.findViewById(C5458g.edit_text_language);
        this.f22803an.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                if (!editable.toString().isEmpty()) {
                    C6412d.this.f22804ao.setError(null);
                    C6412d.this.f22805ap.mo19908i(editable.toString().trim());
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f22808as = (EditText) inflate.findViewById(C5458g.edit_text_we_chat_id_order);
        this.f22808as.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                if (!editable.toString().isEmpty()) {
                    C6412d.this.f22805ap.mo19912k(editable.toString().trim());
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f22809at = (EditText) inflate.findViewById(C5458g.edit_text_requirements_order);
        this.f22809at.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                C6412d.this.f22805ap.mo19916m(editable.toString().trim());
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f22810au = (EditText) inflate.findViewById(C5458g.edit_text_notes_order);
        this.f22810au.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                C6412d.this.f22805ap.mo19918n(editable.toString().trim());
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        ArrayAdapter arrayAdapter = new ArrayAdapter(mo1318s(), C5460i.new_order_spinner_item, new String[]{"Android", "iOS"});
        arrayAdapter.setDropDownViewResource(17367049);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                C6412d.this.f22805ap.mo19914l((String) adapterView.getItemAtPosition(i));
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        return inflate;
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (z) {
            m31167d();
        }
    }

    /* renamed from: b */
    public void mo1450b() {
        this.f22811b.setVisibility(0);
    }

    /* renamed from: c */
    public boolean mo1453c() {
        return m31161a(this.f22812c, this.f22813d) || m31161a(this.f22816g, this.f22817h) || m31161a(this.f22816g, this.f22817h) || m31161a(this.f22818i, this.f22794ae) || m31161a(this.f22795af, this.f22796ag) || !m31163b(this.f22814e, this.f22815f) || !m31163b(this.f22797ah, this.f22798ai) || m31161a(this.f22799aj, this.f22800ak) || m31161a(this.f22801al, this.f22802am) || m31161a(this.f22803an, this.f22804ao);
    }
}
