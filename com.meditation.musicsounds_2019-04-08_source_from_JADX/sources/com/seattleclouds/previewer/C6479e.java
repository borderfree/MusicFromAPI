package com.seattleclouds.previewer;

import android.content.Context;
import android.os.Bundle;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.Fragment;
import android.util.Patterns;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.api.C5268b;
import com.seattleclouds.api.C5269c;
import com.seattleclouds.api.C5270d;
import com.seattleclouds.api.SCApiException;
import com.seattleclouds.util.C6609e;
import com.seattleclouds.util.C6620n;

/* renamed from: com.seattleclouds.previewer.e */
public class C6479e extends C6557s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Button f23008a;

    /* renamed from: b */
    private EditText f23009b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f23010c = false;

    /* renamed from: com.seattleclouds.previewer.e$a */
    private class C6482a extends C5270d<String, Void, String> {
        public C6482a(Fragment fragment) {
            super(fragment);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo17335a(String... strArr) {
            try {
                C5268b.m26272a().mo17298a(new C5269c("POST", "auth/passwordResetTokens", C6609e.m31966a("publisherId", App.f18522x), C6609e.m31966a("email", strArr[0])));
                return "ok";
            } catch (SCApiException e) {
                if (e.getErrorCode() != 404 || !e.getErrorReason().equals("userDoesntExist")) {
                    throw e;
                }
                mo17336a(C5462k.previewer_forgot_password_user_not_found);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo17338b(String str) {
            C6620n.m32034a((Context) C6479e.this.mo1318s(), (String) null, str);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(String str) {
            C0367h s = C6479e.this.mo1318s();
            if (s != null) {
                C6479e.this.f23008a.setEnabled(true);
                C6479e.this.f23010c = false;
                if ("ok".equals(str)) {
                    Toast.makeText(s, C5462k.previewer_forgot_password_email_sent, 0).show();
                    C6479e.this.m31384c();
                    s.finish();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m31383b() {
        if (mo1318s() != null && !this.f23010c) {
            String trim = this.f23009b.getText().toString().trim();
            if (!Patterns.EMAIL_ADDRESS.matcher(trim).matches()) {
                C6620n.m32034a((Context) mo1318s(), (String) null, mo1219a(C5462k.previewer_forgot_password_invalid_email));
                return;
            }
            this.f23008a.setEnabled(false);
            this.f23010c = true;
            new C6482a(this).execute(new String[]{trim});
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m31384c() {
        C0367h s = mo1318s();
        if (s != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) s.getSystemService("input_method");
            View currentFocus = s.getCurrentFocus();
            if (currentFocus != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
            }
        }
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5460i.fragment_previewer_forgot_password, viewGroup, false);
        this.f23009b = (EditText) inflate.findViewById(C5458g.email);
        this.f23009b.setOnEditorActionListener(new OnEditorActionListener() {
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                C6479e.this.m31383b();
                return true;
            }
        });
        this.f23008a = (Button) inflate.findViewById(C5458g.send);
        this.f23008a.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C6479e.this.m31383b();
            }
        });
        mo20294d(C5462k.previewer_forgot_password_title);
        return inflate;
    }
}
