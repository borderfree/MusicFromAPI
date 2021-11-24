package com.seattleclouds.previewer.appmart.order.p191c;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.p023v7.widget.AppCompatSpinner;
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
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.previewer.appmart.order.p190b.C6388a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

/* renamed from: com.seattleclouds.previewer.appmart.order.c.a */
public class C6390a extends C6557s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C6388a f22738a;

    /* renamed from: ae */
    private EditText f22739ae;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public TextInputLayout f22740af;

    /* renamed from: ag */
    private EditText f22741ag;
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public TextInputLayout f22742ah;

    /* renamed from: ai */
    private EditText f22743ai;
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public TextInputLayout f22744aj;

    /* renamed from: ak */
    private EditText f22745ak;
    /* access modifiers changed from: private */

    /* renamed from: al */
    public TextInputLayout f22746al;

    /* renamed from: am */
    private EditText f22747am;
    /* access modifiers changed from: private */

    /* renamed from: an */
    public TextInputLayout f22748an;
    /* access modifiers changed from: private */

    /* renamed from: ao */
    public TextView f22749ao;

    /* renamed from: b */
    private EditText f22750b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public TextInputLayout f22751c;

    /* renamed from: d */
    private EditText f22752d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public TextInputLayout f22753e;

    /* renamed from: f */
    private EditText f22754f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public TextInputLayout f22755g;

    /* renamed from: h */
    private EditText f22756h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public TextInputLayout f22757i;

    /* renamed from: a */
    private void m31121a(EditText editText, TextInputLayout textInputLayout) {
        textInputLayout.setError(mo1320t().getString(C5462k.new_order_error_text_appearance));
        editText.getParent().requestChildFocus(editText, editText);
    }

    /* renamed from: b */
    private boolean m31123b(EditText editText, TextInputLayout textInputLayout) {
        if (editText.getText() != null) {
            String obj = editText.getText().toString();
            if (!obj.isEmpty() && obj.trim().length() > 0) {
                return false;
            }
        }
        m31121a(editText, textInputLayout);
        return true;
    }

    /* renamed from: c */
    private boolean m31125c() {
        if (!this.f22738a.mo19877R().equals(mo1320t().getString(C5462k.new_order_billing_address_select_country))) {
            return false;
        }
        this.f22749ao.setVisibility(0);
        this.f22749ao.getParent().requestChildFocus(this.f22749ao, this.f22749ao);
        return true;
    }

    /* renamed from: c */
    private boolean m31126c(EditText editText, TextInputLayout textInputLayout) {
        if (!m31123b(editText, textInputLayout)) {
            if (editText.getText().toString().matches(Patterns.EMAIL_ADDRESS.pattern())) {
                return true;
            }
            textInputLayout.setError(mo1320t().getString(C5462k.new_order_error_incorrect_email));
            editText.getParent().requestChildFocus(editText, editText);
        }
        return false;
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f22738a = C6388a.m31014a();
        View inflate = layoutInflater.inflate(C5460i.fragment_new_order_billing_address, viewGroup, false);
        Locale[] availableLocales = Locale.getAvailableLocales();
        ArrayList arrayList = new ArrayList();
        for (Locale displayCountry : availableLocales) {
            String displayCountry2 = displayCountry.getDisplayCountry();
            if (displayCountry2.length() > 0 && !arrayList.contains(displayCountry2)) {
                arrayList.add(displayCountry2);
            }
        }
        Collections.sort(arrayList);
        arrayList.add(0, mo1320t().getString(C5462k.new_order_billing_address_select_country));
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) inflate.findViewById(C5458g.billing_address_country_spinner);
        this.f22750b = (EditText) inflate.findViewById(C5458g.billing_address_email);
        this.f22751c = (TextInputLayout) inflate.findViewById(C5458g.billing_email_input_layout);
        this.f22752d = (EditText) inflate.findViewById(C5458g.billing_address_first_name);
        this.f22753e = (TextInputLayout) inflate.findViewById(C5458g.billing_address_first_name_input_layout);
        this.f22754f = (EditText) inflate.findViewById(C5458g.billing_address_last_name);
        this.f22755g = (TextInputLayout) inflate.findViewById(C5458g.billing_address_last_name_input_layout);
        this.f22756h = (EditText) inflate.findViewById(C5458g.billing_address_street);
        this.f22757i = (TextInputLayout) inflate.findViewById(C5458g.billing_address_street_input_layout);
        this.f22739ae = (EditText) inflate.findViewById(C5458g.billing_address_street2);
        this.f22740af = (TextInputLayout) inflate.findViewById(C5458g.billing_address_street2_input_layout);
        this.f22741ag = (EditText) inflate.findViewById(C5458g.billing_address_city);
        this.f22742ah = (TextInputLayout) inflate.findViewById(C5458g.billing_address_city_input_layout);
        this.f22743ai = (EditText) inflate.findViewById(C5458g.billing_address_state);
        this.f22744aj = (TextInputLayout) inflate.findViewById(C5458g.billing_address_state_input_layout);
        this.f22745ak = (EditText) inflate.findViewById(C5458g.billing_address_zip);
        this.f22746al = (TextInputLayout) inflate.findViewById(C5458g.billing_address_zip_input_layout);
        this.f22747am = (EditText) inflate.findViewById(C5458g.billing_address_phone_number);
        this.f22748an = (TextInputLayout) inflate.findViewById(C5458g.billing_address_phone_input_layout);
        this.f22749ao = (TextView) inflate.findViewById(C5458g.billing_address_country_error);
        this.f22750b.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                String trim = editable.toString().trim();
                if (!trim.isEmpty()) {
                    C6390a.this.f22738a.mo19872M(trim);
                    C6390a.this.f22751c.setError(null);
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f22750b.setText(this.f22738a.mo19899e());
        this.f22752d.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                String trim = editable.toString().trim();
                if (!trim.isEmpty()) {
                    C6390a.this.f22738a.mo19856E(trim);
                    C6390a.this.f22753e.setError(null);
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f22754f.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                String trim = editable.toString().trim();
                if (!trim.isEmpty()) {
                    C6390a.this.f22738a.mo19858F(trim);
                    C6390a.this.f22755g.setError(null);
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f22756h.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                String trim = editable.toString().trim();
                if (!trim.isEmpty()) {
                    C6390a.this.f22738a.mo19860G(trim);
                    C6390a.this.f22757i.setError(null);
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f22739ae.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                String trim = editable.toString().trim();
                if (!trim.isEmpty()) {
                    C6390a.this.f22738a.mo19862H(trim);
                    C6390a.this.f22740af.setError(null);
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f22741ag.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                String trim = editable.toString().trim();
                if (!trim.isEmpty()) {
                    C6390a.this.f22738a.mo19940y(trim);
                    C6390a.this.f22742ah.setError(null);
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f22743ai.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                String trim = editable.toString().trim();
                if (!trim.isEmpty()) {
                    C6390a.this.f22738a.mo19870L(trim);
                    C6390a.this.f22744aj.setError(null);
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f22745ak.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                String trim = editable.toString().trim();
                if (!trim.isEmpty()) {
                    C6390a.this.f22738a.mo19864I(trim);
                    C6390a.this.f22746al.setError(null);
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f22747am.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                String trim = editable.toString().trim();
                if (!trim.isEmpty()) {
                    C6390a.this.f22738a.mo19866J(trim);
                    C6390a.this.f22748an.setError(null);
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        C63942 r0 = new ArrayAdapter<String>(mo1318s(), C5460i.new_order_spinner_item, arrayList) {
            public View getDropDownView(int i, View view, ViewGroup viewGroup) {
                View dropDownView = super.getDropDownView(i, view, viewGroup);
                ((TextView) dropDownView).setTextColor(i == 0 ? -7829368 : -16777216);
                return dropDownView;
            }

            public boolean isEnabled(int i) {
                return i != 0;
            }
        };
        r0.setDropDownViewResource(17367049);
        appCompatSpinner.setAdapter((SpinnerAdapter) r0);
        appCompatSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                C6390a.this.f22738a.mo19868K((String) adapterView.getItemAtPosition(i));
                C6390a.this.f22749ao.setVisibility(8);
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        return inflate;
    }

    /* renamed from: b */
    public boolean mo1450b() {
        return (((((((((m31126c(this.f22750b, this.f22751c) ^ true) & m31123b(this.f22752d, this.f22753e)) & m31123b(this.f22754f, this.f22755g)) & m31123b(this.f22756h, this.f22757i)) & m31123b(this.f22741ag, this.f22742ah)) & m31123b(this.f22743ai, this.f22744aj)) & m31123b(this.f22745ak, this.f22746al)) & m31123b(this.f22747am, this.f22748an)) && m31125c()) || !m31126c(this.f22750b, this.f22751c) || m31123b(this.f22752d, this.f22753e) || m31123b(this.f22754f, this.f22755g) || m31123b(this.f22756h, this.f22757i) || m31123b(this.f22741ag, this.f22742ah) || m31123b(this.f22743ai, this.f22744aj) || m31123b(this.f22745ak, this.f22746al) || m31123b(this.f22747am, this.f22748an) || m31125c();
    }
}
