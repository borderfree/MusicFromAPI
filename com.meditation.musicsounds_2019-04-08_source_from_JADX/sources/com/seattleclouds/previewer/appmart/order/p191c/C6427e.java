package com.seattleclouds.previewer.appmart.order.p191c;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.p023v7.widget.AppCompatSpinner;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
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
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: com.seattleclouds.previewer.appmart.order.c.e */
public class C6427e extends C6557s {

    /* renamed from: a */
    ArrayList<String> f22833a = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public TextView f22834ae;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public C6388a f22835af;

    /* renamed from: b */
    private AppCompatSpinner f22836b;

    /* renamed from: c */
    private AppCompatSpinner f22837c;

    /* renamed from: d */
    private EditText f22838d;

    /* renamed from: e */
    private EditText f22839e;

    /* renamed from: f */
    private EditText f22840f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public TextView f22841g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public TextInputLayout f22842h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public TextInputLayout f22843i;

    /* renamed from: a */
    private boolean m31180a(EditText editText, TextInputLayout textInputLayout) {
        if (editText.getText() != null) {
            String obj = editText.getText().toString();
            if (!obj.isEmpty() && obj.trim().length() > 0) {
                return false;
            }
        }
        m31185c(editText, textInputLayout);
        return true;
    }

    /* renamed from: a */
    private boolean m31181a(EditText editText, TextView textView) {
        if (editText.getText() != null) {
            String obj = editText.getText().toString();
            if (!obj.isEmpty() && obj.trim().length() > 0) {
                return false;
            }
        }
        textView.setVisibility(0);
        editText.getParent().requestChildFocus(editText, editText);
        return true;
    }

    /* renamed from: b */
    private boolean m31183b(EditText editText, TextInputLayout textInputLayout) {
        if (!m31180a(editText, textInputLayout)) {
            String replace = editText.getText().toString().replace(" ", "");
            Iterator it = this.f22833a.iterator();
            while (it.hasNext()) {
                if (replace.matches((String) it.next())) {
                    this.f22835af.mo19942z(replace);
                    this.f22842h.setError(null);
                    return true;
                }
                this.f22842h.setError(mo1320t().getString(C5462k.new_order_credit_card_number_error));
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m31185c(EditText editText, TextInputLayout textInputLayout) {
        textInputLayout.setError(mo1320t().getString(C5462k.new_order_error_text_appearance));
    }

    /* renamed from: c */
    private boolean m31186c() {
        int intValue = Integer.valueOf(this.f22835af.mo19865J().trim()).intValue();
        int intValue2 = Integer.valueOf(this.f22835af.mo19863I().trim()).intValue();
        Calendar instance = Calendar.getInstance();
        if ((intValue != instance.get(1) || intValue2 >= instance.get(2) + 1) && intValue >= instance.get(1)) {
            return false;
        }
        this.f22841g.setVisibility(0);
        return true;
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String num;
        this.f22835af = C6388a.m31014a();
        this.f22833a.add("^4[0-9]{6,}$");
        this.f22833a.add("^5[1-5][0-9]{5,}$");
        this.f22833a.add("^3[47][0-9]{5,}$");
        this.f22833a.add("^3(?:0[0-5]|[68][0-9])[0-9]{4,}$");
        this.f22833a.add("^6(?:011|5[0-9]{2})[0-9]{3,}$");
        this.f22833a.add("^(?:2131|1800|35[0-9]{3})[0-9]{3,}$");
        this.f22833a.add("^(62[0-9]{14,17})$");
        View inflate = layoutInflater.inflate(C5460i.fragment_new_order_payment_credit_card, viewGroup, false);
        this.f22836b = (AppCompatSpinner) inflate.findViewById(C5458g.credit_card_month_spinner);
        this.f22837c = (AppCompatSpinner) inflate.findViewById(C5458g.credit_card_year_spinner);
        this.f22838d = (EditText) inflate.findViewById(C5458g.credit_card_number);
        this.f22843i = (TextInputLayout) inflate.findViewById(C5458g.credit_card_name_input_layout);
        this.f22842h = (TextInputLayout) inflate.findViewById(C5458g.credit_card_number_input_layout);
        this.f22840f = (EditText) inflate.findViewById(C5458g.credit_card_ccv);
        this.f22839e = (EditText) inflate.findViewById(C5458g.credit_card_name);
        this.f22841g = (TextView) inflate.findViewById(C5458g.incorrect_dat_and_year);
        this.f22834ae = (TextView) inflate.findViewById(C5458g.incorrect_cvv);
        this.f22838d.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                if (editable.length() > 0) {
                    C6427e.this.f22842h.setError(null);
                }
                if (editable.length() > 0 && editable.length() % 5 == 0 && ' ' == editable.charAt(editable.length() - 1)) {
                    editable.delete(editable.length() - 1, editable.length());
                }
                if (editable.length() > 0 && editable.length() % 5 == 0 && Character.isDigit(editable.charAt(editable.length() - 1)) && TextUtils.split(editable.toString(), String.valueOf(' ')).length <= 3) {
                    editable.insert(editable.length() - 1, String.valueOf(' '));
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f22839e.setText(this.f22835af.mo19896d());
        this.f22839e.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                String trim = editable.toString().trim();
                if (!trim.isEmpty()) {
                    C6427e.this.f22835af.mo19847A(trim);
                    C6427e.this.f22843i.setError(null);
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f22840f.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                String obj = editable.toString();
                if (!obj.isEmpty()) {
                    C6427e.this.f22835af.mo19854D(obj);
                    C6427e.this.f22834ae.setVisibility(8);
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = Calendar.getInstance().get(1);
        for (int i2 = i; i2 <= i + 16; i2++) {
            String valueOf = String.valueOf(i2);
            if (valueOf.length() > 2) {
                valueOf = valueOf.substring(valueOf.length() - 2);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(valueOf);
            sb.append(" ");
            linkedHashMap.put(sb.toString(), String.valueOf(i2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 1; i3 <= 12; i3++) {
            if (i3 < 10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("0");
                sb2.append(i3);
                sb2.append("  ");
                num = sb2.toString();
            } else {
                num = Integer.toString(i3);
            }
            arrayList.add(num);
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(mo1318s(), C5460i.new_order_spinner_item, new ArrayList(linkedHashMap.keySet()));
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(mo1318s(), C5460i.new_order_spinner_item, arrayList);
        arrayAdapter2.setDropDownViewResource(17367049);
        arrayAdapter.setDropDownViewResource(17367049);
        this.f22836b.setAdapter((SpinnerAdapter) arrayAdapter2);
        this.f22837c.setAdapter((SpinnerAdapter) arrayAdapter);
        this.f22836b.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                C6427e.this.f22835af.mo19849B((String) adapterView.getItemAtPosition(i));
                C6427e.this.f22841g.setVisibility(8);
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f22837c.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                C6427e.this.f22835af.mo19851C((String) linkedHashMap.get(adapterView.getItemAtPosition(i).toString()));
                C6427e.this.f22841g.setVisibility(8);
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        return inflate;
    }

    /* renamed from: b */
    public boolean mo1450b() {
        return m31180a(this.f22839e, this.f22843i) || !m31183b(this.f22838d, this.f22842h) || m31186c() || m31181a(this.f22840f, this.f22834ae);
    }
}
