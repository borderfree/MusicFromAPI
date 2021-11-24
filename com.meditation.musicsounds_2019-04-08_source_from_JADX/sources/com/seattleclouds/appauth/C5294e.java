package com.seattleclouds.appauth;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.GetChars;
import android.text.Html;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.seattleclouds.AppStarterActivity;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.p160e.C5334b;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6595ao;
import java.util.regex.Pattern;

/* renamed from: com.seattleclouds.appauth.e */
public class C5294e extends C5288c implements C5286f {

    /* renamed from: d */
    private EditText f18949d;

    /* renamed from: e */
    private EditText f18950e;

    /* renamed from: f */
    private EditText f18951f;

    /* renamed from: g */
    private Button f18952g;

    /* renamed from: h */
    private Button f18953h;

    /* renamed from: i */
    private Boolean f18954i;

    /* renamed from: a */
    private Spanned m26474a(String str, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, i));
        sb.append("<a href=\"\">");
        sb.append(str.substring(i, i2));
        sb.append("</a>");
        sb.append(str.substring(i2));
        return Html.fromHtml(sb.toString());
    }

    /* renamed from: aA */
    private void m26476aA() {
        String trim = this.f18949d.getText().toString().trim();
        if (trim.length() != this.f18949d.getText().length()) {
            this.f18949d.setText(trim);
        }
        C5279b.m26380b(trim, C6592al.m31908a((GetChars) this.f18950e.getText()));
        C5279b.m26368a((C5286f) this);
        mo17377m(true);
    }

    /* renamed from: aB */
    private void m26477aB() {
        mo1453c().mo17341a((GetChars) this.f18949d.getText(), (GetChars) this.f18950e.getText());
    }

    /* access modifiers changed from: private */
    /* renamed from: at */
    public void m26478at() {
        if (!C5279b.m26394g() && m26479az()) {
            m26476aA();
        }
    }

    /* renamed from: az */
    private boolean m26479az() {
        EditText editText;
        int i;
        EditText editText2;
        this.f18949d.setError(null);
        this.f18950e.setError(null);
        this.f18951f.setError(null);
        if (mo17369a(this.f18949d)) {
            this.f18949d.setError(mo1219a(C5462k.app_auth_error_empty_email));
            this.f18949d.setText("");
        } else if (!mo17373c(this.f18949d.getText().toString())) {
            this.f18949d.setError(mo1219a(C5462k.app_auth_error_invalid_email));
        } else {
            if (mo17369a(this.f18950e)) {
                editText = this.f18950e;
                i = C5462k.app_auth_error_empty_password;
            } else if (mo17369a(this.f18951f)) {
                this.f18951f.setError(mo1219a(C5462k.app_auth_error_empty_password));
                editText2 = this.f18951f;
                editText2.requestFocus();
                return false;
            } else if (!mo17382e(this.f18950e.getText().toString())) {
                mo17372b(this.f18950e);
                mo17372b(this.f18951f);
                editText = this.f18950e;
                i = C5462k.app_auth_error_request_failed_pattern;
            } else if (mo17370a(this.f18950e, this.f18951f)) {
                return true;
            } else {
                mo17372b(this.f18950e);
                mo17372b(this.f18951f);
                editText = this.f18950e;
                i = C5462k.app_auth_error_passwords_dont_match;
            }
            editText.setError(mo1219a(i));
            editText2 = this.f18950e;
            editText2.requestFocus();
            return false;
        }
        editText2 = this.f18949d;
        editText2.requestFocus();
        return false;
    }

    /* renamed from: n */
    private void m26480n(boolean z) {
        if (mo1453c().mo17205n()) {
            this.f18954i = Boolean.valueOf(z);
        } else {
            mo17377m(z);
        }
    }

    /* renamed from: L */
    public void mo1202L() {
        C5279b.m26378b((C5286f) this);
        super.mo1202L();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17366a(ViewGroup viewGroup, Bundle bundle) {
        this.f18936b = (ProgressBar) viewGroup.findViewById(C5458g.register_progress);
        this.f18937c = (ViewGroup) viewGroup.findViewById(C5458g.register_form_scroller);
        this.f18949d = (EditText) viewGroup.findViewById(C5458g.email);
        this.f18950e = (EditText) viewGroup.findViewById(C5458g.password1);
        this.f18951f = (EditText) viewGroup.findViewById(C5458g.password2);
        this.f18951f.setOnEditorActionListener(new OnEditorActionListener() {
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 2 && (i != 0 || keyEvent == null || keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                C5294e.this.m26478at();
                return true;
            }
        });
        this.f18952g = (Button) viewGroup.findViewById(C5458g.register_button);
        C5334b.m26754a(mo20291ax().mo17546c(mo1318s()), this.f18952g);
        this.f18952g.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C5294e.this.m26478at();
            }
        });
        this.f18953h = (Button) viewGroup.findViewById(C5458g.show_sign_in_button);
        Resources t = mo1320t();
        String string = t.getString(C5462k.app_auth_action_show_sign_in);
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(" ");
        sb.append(t.getString(C5462k.app_auth_action_show_sign_in_link));
        String sb2 = sb.toString();
        this.f18953h.setText(m26474a(sb2, string.length() + 1, sb2.length()));
        this.f18953h.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C5294e.this.mo17374d();
            }
        });
        mo17368a(this.f18949d, this.f18950e, this.f18951f);
        if (C5279b.m26394g()) {
            C5279b.m26368a((C5286f) this);
            mo17377m(true);
        }
    }

    /* renamed from: a */
    public void mo17365a(C5282b bVar) {
        C5279b.m26378b((C5286f) this);
        if (bVar.f18920a) {
            mo17377m(false);
            C6595ao.m31927a(mo1316q(), C5462k.app_auth_msg_register_request_cancelled, true);
        } else if (bVar.f18921b) {
            this.f18949d.setText("");
            mo17372b(this.f18950e);
            mo17372b(this.f18951f);
            if (!C5279b.m26385c()) {
                m26477aB();
                mo17374d();
                m26480n(false);
                if (!C6592al.m31910c(bVar.f18924e)) {
                    mo17375d(bVar.f18924e);
                }
            } else if (C5279b.m26373a(mo1318s().getIntent())) {
                mo1453c().finish();
            } else {
                AppStarterActivity.m25709d((Activity) mo1318s());
            }
        } else {
            mo17377m(false);
            if (bVar.f18925f) {
                mo17372b(this.f18950e);
                mo17372b(this.f18951f);
            }
            EditText editText = null;
            if (!C6592al.m31910c(bVar.f18927h)) {
                this.f18950e.setError(bVar.f18927h);
                editText = this.f18950e;
            }
            if (!C6592al.m31910c(bVar.f18926g)) {
                this.f18949d.setError(bVar.f18926g);
                editText = this.f18949d;
            }
            if (!C6592al.m31910c(bVar.f18924e)) {
                mo17375d(bVar.f18924e);
                if (editText == null) {
                    editText = bVar.f18925f ? this.f18950e : this.f18949d;
                }
            }
            if (editText != null) {
                editText.requestFocus();
            }
        }
    }

    /* renamed from: a */
    public void mo17346a(boolean z, boolean z2) {
        super.mo17346a(z, z2);
        if (!z && this.f18954i != null) {
            mo17377m(this.f18954i.booleanValue());
            this.f18954i = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo1450b() {
        return C5460i.fragment_app_register;
    }

    /* renamed from: e */
    public boolean mo17382e(String str) {
        return Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()_+=\\[{\\]};:<>|./?,-]).{8,})").matcher(str).matches();
    }

    /* renamed from: i */
    public void mo1296i() {
        mo17372b(this.f18950e);
        mo17372b(this.f18951f);
        super.mo1296i();
    }
}
