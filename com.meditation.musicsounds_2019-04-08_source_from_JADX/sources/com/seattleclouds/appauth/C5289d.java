package com.seattleclouds.appauth;

import android.app.Activity;
import android.content.Intent;
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
import com.seattleclouds.previewer.PreviewerOneFragmentActivity;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6595ao;

/* renamed from: com.seattleclouds.appauth.d */
public class C5289d extends C5288c implements C5285e {

    /* renamed from: d */
    private EditText f18940d;

    /* renamed from: e */
    private EditText f18941e;

    /* renamed from: f */
    private Button f18942f;

    /* renamed from: g */
    private Button f18943g;

    /* renamed from: h */
    private Button f18944h;

    /* renamed from: a */
    private Spanned m26461a(String str, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, i));
        sb.append("<a href=\"\">");
        sb.append(str.substring(i, i2));
        sb.append("</a>");
        sb.append(str.substring(i2));
        return Html.fromHtml(sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: aA */
    public void m26463aA() {
        Intent b = PreviewerOneFragmentActivity.m30890b(mo1318s(), C5275a.class, true);
        b.putExtra(C5275a.f18902a, this.f18940d.getText().toString());
        mo1230a(b);
    }

    /* renamed from: aB */
    private void m26464aB() {
        String trim = this.f18940d.getText().toString().trim();
        if (trim.length() != this.f18940d.getText().length()) {
            this.f18940d.setText(trim);
        }
        C5279b.m26370a(trim, C6592al.m31908a((GetChars) this.f18941e.getText()));
        C5279b.m26367a((C5285e) this);
        mo17377m(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: at */
    public void m26465at() {
        if (!C5279b.m26393f() && m26466az()) {
            m26464aB();
        }
    }

    /* renamed from: az */
    private boolean m26466az() {
        EditText editText;
        this.f18940d.setError(null);
        this.f18941e.setError(null);
        if (mo17369a(this.f18940d)) {
            this.f18940d.setError(mo1219a(C5462k.app_auth_error_empty_email));
            this.f18940d.setText("");
        } else if (!mo17373c(this.f18940d.getText().toString())) {
            this.f18940d.setError(mo1219a(C5462k.app_auth_error_invalid_email));
        } else if (!mo17369a(this.f18941e)) {
            return true;
        } else {
            this.f18941e.setError(mo1219a(C5462k.app_auth_error_empty_password));
            editText = this.f18941e;
            editText.requestFocus();
            return false;
        }
        editText = this.f18940d;
        editText.requestFocus();
        return false;
    }

    /* renamed from: L */
    public void mo1202L() {
        C5279b.m26377b((C5285e) this);
        super.mo1202L();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17366a(ViewGroup viewGroup, Bundle bundle) {
        this.f18936b = (ProgressBar) viewGroup.findViewById(C5458g.authenticate_progress);
        this.f18937c = (ViewGroup) viewGroup.findViewById(C5458g.authenticate_form_scroller);
        this.f18940d = (EditText) viewGroup.findViewById(C5458g.email);
        this.f18941e = (EditText) viewGroup.findViewById(C5458g.password);
        this.f18941e.setOnEditorActionListener(new OnEditorActionListener() {
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 2 && (i != 0 || keyEvent == null || keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                C5289d.this.m26465at();
                return true;
            }
        });
        if (bundle == null) {
            String e = C5279b.m26389e();
            this.f18940d.setText(e);
            (e.isEmpty() ? this.f18940d : this.f18941e).requestFocus();
        }
        this.f18942f = (Button) viewGroup.findViewById(C5458g.sign_in_button);
        C5334b.m26754a(mo20291ax().mo17546c(mo1318s()), this.f18942f);
        this.f18942f.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C5289d.this.m26465at();
            }
        });
        this.f18943g = (Button) viewGroup.findViewById(C5458g.forgotPassword);
        this.f18943g.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C5289d.this.m26463aA();
            }
        });
        this.f18944h = (Button) viewGroup.findViewById(C5458g.show_register_button);
        Resources t = mo1320t();
        this.f18944h.setText(m26461a(t.getString(C5462k.app_auth_action_register_a), 0, t.getString(C5462k.app_auth_action_register_a).length()));
        this.f18944h.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C5289d.this.mo17376e();
            }
        });
        mo17368a(this.f18940d, this.f18941e);
        if (C5279b.m26393f()) {
            C5279b.m26367a((C5285e) this);
            mo17377m(true);
        }
    }

    /* renamed from: a */
    public void mo17364a(C5282b bVar) {
        C5279b.m26377b((C5285e) this);
        if (bVar.f18920a) {
            mo17377m(false);
            C6595ao.m31927a(mo1316q(), C5462k.app_auth_msg_sign_in_request_cancelled, true);
        } else if (!C5279b.m26385c()) {
            mo17377m(false);
            if (bVar.f18925f) {
                mo17372b(this.f18941e);
            }
            EditText editText = null;
            if (!C6592al.m31910c(bVar.f18927h)) {
                this.f18941e.setError(bVar.f18927h);
                editText = this.f18941e;
            }
            if (!C6592al.m31910c(bVar.f18926g)) {
                this.f18940d.setError(bVar.f18926g);
                editText = this.f18940d;
            }
            if (!C6592al.m31910c(bVar.f18924e)) {
                mo17375d(bVar.f18924e);
                if (editText == null) {
                    editText = bVar.f18925f ? this.f18941e : this.f18940d;
                }
            }
            if (editText != null) {
                editText.requestFocus();
            }
        } else if (!C5279b.m26388d() || C5279b.m26373a(mo1318s().getIntent())) {
            mo1453c().finish();
        } else {
            AppStarterActivity.m25709d((Activity) mo1318s());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo1450b() {
        return C5460i.fragment_app_authenticate;
    }

    /* renamed from: g */
    public void mo1288g() {
        super.mo1288g();
        C5274b s = mo1453c().mo17343s();
        if (s != null) {
            this.f18940d.setText(s.f18900a);
            mo17367a(this.f18941e, s.f18901b);
            mo1453c().mo17344t();
        }
    }

    /* renamed from: i */
    public void mo1296i() {
        mo17372b(this.f18941e);
        super.mo1296i();
    }
}
