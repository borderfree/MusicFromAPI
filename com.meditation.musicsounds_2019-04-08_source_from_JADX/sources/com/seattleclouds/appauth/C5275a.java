package com.seattleclouds.appauth;

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
import com.seattleclouds.api.C5270d;
import com.seattleclouds.api.SCApiException;
import com.seattleclouds.util.C6595ao;
import com.seattleclouds.util.C6620n;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.appauth.a */
public class C5275a extends C6557s {

    /* renamed from: a */
    public static String f18902a = "APP_FORGOT_EMAIL";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public EditText f18903b;

    /* renamed from: c */
    private Button f18904c;

    /* renamed from: com.seattleclouds.appauth.a$a */
    private class C5278a extends C5270d<Void, Void, String> {
        public C5278a(Fragment fragment) {
            super(fragment);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo17335a(Void... voidArr) {
            try {
                JSONObject a = C5268b.m26272a().mo17303a(App.f18522x, App.f18468A, App.f18523y, App.f18524z, C5275a.this.f18903b.getText().toString());
                return (a == null || a.get("message") == null) ? "ok" : (String) a.get("message");
            } catch (SCApiException e) {
                if (e.getErrorCode() != 404 || !e.getErrorReason().equals("userDoesntExist")) {
                    throw e;
                }
                mo17336a(C5462k.app_auth_error_forgot_password_user_not_found);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo17338b(String str) {
            C6620n.m32034a((Context) C5275a.this.mo1318s(), (String) null, str);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(String str) {
            C0367h s = C5275a.this.mo1318s();
            if (s != null && "ok".equals(str)) {
                Toast.makeText(s, C5462k.app_forgot_password_send_toast, 0).show();
                C5275a.this.mo1453c();
                s.finish();
            }
        }
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5460i.fragment_app_auth_forgot, viewGroup, false);
        this.f18903b = (EditText) inflate.findViewById(C5458g.email);
        this.f18903b.setOnEditorActionListener(new OnEditorActionListener() {
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                C5275a.this.mo1450b();
                return true;
            }
        });
        this.f18904c = (Button) inflate.findViewById(C5458g.send);
        this.f18904c.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C5275a.this.mo1450b();
            }
        });
        mo20294d(C5462k.app_auth_error_forgot_password_title);
        Bundle m = mo1307m();
        String string = m != null ? m.getString(f18902a) : null;
        if (Patterns.EMAIL_ADDRESS.matcher(string).matches()) {
            this.f18903b.setText(string);
        }
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1450b() {
        if (!Patterns.EMAIL_ADDRESS.matcher(this.f18903b.getText().toString().trim()).matches()) {
            C6595ao.m31928a((Context) mo1318s(), mo1219a(C5462k.app_auth_error_forgot_password_invalid_email));
        } else {
            new C5278a(this).execute(new Void[0]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo1453c() {
        C0367h s = mo1318s();
        if (s != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) s.getSystemService("input_method");
            View currentFocus = s.getCurrentFocus();
            if (currentFocus != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
            }
        }
    }
}
