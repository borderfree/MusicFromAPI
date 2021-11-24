package com.seattleclouds.modules.p164c;

import android.content.Context;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6593am;
import com.seattleclouds.util.C6620n;

/* renamed from: com.seattleclouds.modules.c.a */
public class C5485a extends C6557s {

    /* renamed from: a */
    private View f19508a;

    /* renamed from: ae */
    private String f19509ae;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public String f19510af;

    /* renamed from: ag */
    private boolean f19511ag = true;

    /* renamed from: ah */
    private boolean f19512ah = true;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public boolean f19513ai = false;

    /* renamed from: aj */
    private LinearLayout f19514aj;

    /* renamed from: ak */
    private LinearLayout f19515ak;

    /* renamed from: al */
    private TextView f19516al;

    /* renamed from: am */
    private TextView f19517am;
    /* access modifiers changed from: private */

    /* renamed from: an */
    public EditText f19518an;
    /* access modifiers changed from: private */

    /* renamed from: ao */
    public EditText f19519ao;
    /* access modifiers changed from: private */

    /* renamed from: ap */
    public EditText f19520ap;
    /* access modifiers changed from: private */

    /* renamed from: aq */
    public EditText f19521aq;
    /* access modifiers changed from: private */

    /* renamed from: ar */
    public EditText f19522ar;
    /* access modifiers changed from: private */

    /* renamed from: as */
    public TextView f19523as;

    /* renamed from: at */
    private TextView f19524at;

    /* renamed from: au */
    private ImageView f19525au;

    /* renamed from: b */
    private String f19526b;

    /* renamed from: c */
    private String f19527c;

    /* renamed from: d */
    private String f19528d;

    /* renamed from: e */
    private String f19529e;

    /* renamed from: f */
    private String f19530f;

    /* renamed from: g */
    private String f19531g;

    /* renamed from: h */
    private String f19532h;

    /* renamed from: i */
    private String f19533i;

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m27319c() {
        String str;
        mo1450b();
        float parseFloat = Float.parseFloat(C6592al.m31909b(this.f19521aq.getText().toString()) ? "0" : this.f19521aq.getText().toString());
        float parseFloat2 = Float.parseFloat(C6592al.m31909b(this.f19522ar.getText().toString()) ? "0" : this.f19522ar.getText().toString());
        float parseFloat3 = Float.parseFloat(C6592al.m31909b(this.f19518an.getText().toString()) ? "0" : this.f19518an.getText().toString());
        float parseFloat4 = Float.parseFloat(C6592al.m31909b(this.f19520ap.getText().toString()) ? "0" : this.f19520ap.getText().toString());
        float parseFloat5 = Float.parseFloat(C6592al.m31909b(this.f19519ao.getText().toString()) ? "0" : this.f19519ao.getText().toString());
        if (this.f19511ag) {
            parseFloat4 = ((parseFloat * 12.0f) + parseFloat2) * 2.54f;
        }
        if (this.f19512ah) {
            parseFloat5 = parseFloat3 * 0.453592f;
        }
        float f = parseFloat5 / (((parseFloat4 / 100.0f) * parseFloat4) / 100.0f);
        this.f19523as.setText(String.format("%.2f", new Object[]{Float.valueOf(f)}));
        this.f19510af = null;
        this.f19513ai = true;
        double d = (double) f;
        if (d < 18.5d) {
            this.f19524at.setText(this.f19526b);
            this.f19525au.setImageDrawable(App.m25658j(this.f19529e));
            str = this.f19532h;
        } else if (d >= 18.5d && f < 25.0f) {
            this.f19524at.setText(this.f19527c);
            this.f19525au.setImageDrawable(App.m25658j(this.f19530f));
            str = this.f19533i;
        } else if (f >= 25.0f) {
            this.f19524at.setText(this.f19528d);
            this.f19525au.setImageDrawable(App.m25658j(this.f19531g));
            str = this.f19509ae;
        } else {
            this.f19513ai = false;
            this.f19523as.setText("0.0");
            C6620n.m32034a((Context) mo1318s(), mo1219a(C5462k.error), mo1219a(C5462k.bmi_calculator_fill_all_fields_message));
            return;
        }
        this.f19510af = str;
    }

    /* renamed from: c */
    private void m27320c(Bundle bundle) {
        Bundle m = mo1307m();
        if (m != null) {
            C6593am.m31914a(this.f19508a, m.getBundle("PAGE_STYLE"));
            this.f19526b = m.getString("message1");
            this.f19527c = m.getString("message2");
            this.f19528d = m.getString("message3");
            this.f19529e = m.getString("imageName1");
            this.f19530f = m.getString("imageName2");
            this.f19531g = m.getString("imageName3");
            this.f19532h = m.getString("pageName1");
            this.f19533i = m.getString("pageName2");
            this.f19509ae = m.getString("pageName3");
        }
        this.f19519ao = (EditText) this.f19508a.findViewById(C5458g.kgEditText);
        this.f19516al = (TextView) this.f19508a.findViewById(C5458g.kgTextView);
        this.f19520ap = (EditText) this.f19508a.findViewById(C5458g.cmEditText);
        this.f19521aq = (EditText) this.f19508a.findViewById(C5458g.ftEditText);
        this.f19522ar = (EditText) this.f19508a.findViewById(C5458g.inEditText);
        this.f19518an = (EditText) this.f19508a.findViewById(C5458g.lbsEditText);
        this.f19517am = (TextView) this.f19508a.findViewById(C5458g.lbsTextView);
        this.f19523as = (TextView) this.f19508a.findViewById(C5458g.resultBMI);
        this.f19524at = (TextView) this.f19508a.findViewById(C5458g.resultTxt);
        this.f19525au = (ImageView) this.f19508a.findViewById(C5458g.resultImg);
        this.f19514aj = (LinearLayout) this.f19508a.findViewById(C5458g.ftinLayout);
        this.f19515ak = (LinearLayout) this.f19508a.findViewById(C5458g.cmLayout);
        C54861 r0 = new OnClickListener() {
            public void onClick(View view) {
                if (!C6592al.m31909b(C5485a.this.f19510af)) {
                    App.m25622a(C5485a.this.f19510af, (Fragment) C5485a.this);
                }
            }
        };
        this.f19523as.setOnClickListener(r0);
        this.f19524at.setOnClickListener(r0);
        this.f19525au.setOnClickListener(r0);
        if (bundle != null) {
            this.f19511ag = bundle.getBoolean("STATE_FT_IN_VISIBLE", this.f19511ag);
            this.f19512ah = bundle.getBoolean("STATE_LBS_VISIBLE", this.f19512ah);
        }
        mo17816m(this.f19511ag);
        mo17817n(this.f19512ah);
        RadioGroup radioGroup = (RadioGroup) this.f19508a.findViewById(C5458g.segmentedController1);
        radioGroup.check(this.f19511ag ? C5458g.option1 : C5458g.option2);
        radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                EditText c;
                if (i == C5458g.option1) {
                    C5485a.this.mo17816m(true);
                    c = C5485a.this.f19521aq;
                } else {
                    C5485a.this.mo17816m(false);
                    c = C5485a.this.f19520ap;
                }
                c.requestFocus();
            }
        });
        RadioGroup radioGroup2 = (RadioGroup) this.f19508a.findViewById(C5458g.segmentedController2);
        radioGroup2.check(this.f19512ah ? C5458g.option21 : C5458g.option22);
        radioGroup2.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                EditText e;
                if (i == C5458g.option21) {
                    C5485a.this.mo17817n(true);
                    e = C5485a.this.f19518an;
                } else {
                    C5485a.this.mo17817n(false);
                    e = C5485a.this.f19519ao;
                }
                e.requestFocus();
            }
        });
        ((Button) this.f19508a.findViewById(C5458g.btnCalculate)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C5485a.this.m27319c();
            }
        });
        ((Button) this.f19508a.findViewById(C5458g.btnClear)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C5485a.this.f19513ai = false;
                C5485a.this.f19521aq.setText("");
                C5485a.this.f19521aq.clearFocus();
                C5485a.this.f19522ar.setText("");
                C5485a.this.f19522ar.clearFocus();
                C5485a.this.f19518an.setText("");
                C5485a.this.f19518an.clearFocus();
                C5485a.this.f19520ap.setText("");
                C5485a.this.f19520ap.clearFocus();
                C5485a.this.f19519ao.setText("");
                C5485a.this.f19519ao.clearFocus();
                C5485a.this.f19523as.setText("0.0");
                C5485a.this.f19510af = null;
            }
        });
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo1217a(layoutInflater, viewGroup, bundle);
        this.f19508a = layoutInflater.inflate(C5460i.bmi_calulator_layout, viewGroup, false);
        m27320c(bundle);
        return this.f19508a;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
    }

    /* renamed from: b */
    public void mo1450b() {
        if (mo1318s().getCurrentFocus() != null) {
            ((InputMethodManager) mo1318s().getSystemService("input_method")).hideSoftInputFromWindow(mo1318s().getCurrentFocus().getWindowToken(), 0);
        }
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        bundle.putBoolean("STATE_FT_IN_VISIBLE", this.f19511ag);
        bundle.putBoolean("STATE_LBS_VISIBLE", this.f19512ah);
        bundle.putBoolean("STATE_HAS_RESULT", this.f19513ai);
        super.mo1282e(bundle);
    }

    /* renamed from: k */
    public void mo1301k(Bundle bundle) {
        super.mo1301k(bundle);
        if (bundle != null) {
            this.f19513ai = bundle.getBoolean("STATE_HAS_RESULT", this.f19513ai);
        }
        if (this.f19513ai) {
            m27319c();
        }
    }

    /* renamed from: m */
    public void mo17816m(boolean z) {
        this.f19511ag = z;
        if (z) {
            this.f19514aj.setVisibility(0);
            this.f19515ak.setVisibility(8);
            return;
        }
        this.f19514aj.setVisibility(8);
        this.f19515ak.setVisibility(0);
    }

    /* renamed from: n */
    public void mo17817n(boolean z) {
        this.f19512ah = z;
        if (z) {
            this.f19518an.setVisibility(0);
            this.f19517am.setVisibility(0);
            this.f19519ao.setVisibility(8);
            this.f19516al.setVisibility(8);
            return;
        }
        this.f19518an.setVisibility(8);
        this.f19517am.setVisibility(8);
        this.f19519ao.setVisibility(0);
        this.f19516al.setVisibility(0);
    }
}
