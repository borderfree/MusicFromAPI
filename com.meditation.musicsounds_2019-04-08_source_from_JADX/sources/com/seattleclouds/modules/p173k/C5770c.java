package com.seattleclouds.modules.p173k;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C6557s;
import com.seattleclouds.util.HTTPUtil;
import com.seattleclouds.widget.LoadingView;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.k.c */
public class C5770c extends C6557s {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final String f20439e;

    /* renamed from: a */
    protected TextView f20440a = null;

    /* renamed from: b */
    private View f20441b = null;

    /* renamed from: c */
    private EditText f20442c = null;

    /* renamed from: d */
    private Button f20443d = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f20444f = null;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public LoadingView f20445g;

    /* renamed from: com.seattleclouds.modules.k.c$a */
    private class C5772a extends AsyncTask<String, Void, String> {

        /* renamed from: b */
        private String f20448b;

        private C5772a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            StringBuilder sb;
            try {
                String b = mo18450b(strArr[0]);
                if (b == null) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(b);
                if (jSONObject.getString("resp").equals("success")) {
                    sb = new StringBuilder();
                    sb.append("1_");
                    sb.append(jSONObject.getString("message").toString());
                } else {
                    sb = new StringBuilder();
                    sb.append("0_");
                    sb.append(jSONObject.getString("error").toString());
                }
                return sb.toString();
            } catch (Exception unused) {
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            TextView textView;
            int i;
            super.onPostExecute(str);
            C5770c.this.f20445g.setVisibility(8);
            if (str != null) {
                if (str.startsWith("1_")) {
                    textView = C5770c.this.f20440a;
                    i = -16711936;
                } else {
                    textView = C5770c.this.f20440a;
                    i = -65536;
                }
                textView.setTextColor(i);
                C5770c.this.f20440a.setText(str.substring(2));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo18450b(String str) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("sendtoaddress", str);
                hashMap.put("username", App.f18523y);
                hashMap.put("appid", App.f18524z);
                hashMap.put("publisherid", App.f18522x);
                hashMap.put("pageid", C5770c.this.f20444f);
                return HTTPUtil.m31768b(C5770c.f20439e, hashMap);
            } catch (Exception e) {
                throw e;
            }
        }

        /* renamed from: c */
        public void mo18451c(String str) {
            this.f20448b = str;
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            C5770c.this.f20445g.setVisibility(0);
            C5770c.this.f20445g.setLoadingText(this.f20448b);
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("http://");
        sb.append(App.f18516r);
        sb.append("/sendforgotpassword.ashx");
        f20439e = sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m28408d() {
        this.f20440a.setText("");
        String obj = this.f20442c.getText().toString();
        ((InputMethodManager) mo1318s().getSystemService("input_method")).hideSoftInputFromWindow(mo1318s().getCurrentFocus().getWindowToken(), 2);
        C5772a aVar = new C5772a();
        aVar.mo18451c("Retrieving credentials ...");
        aVar.execute(new String[]{obj});
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f20441b = layoutInflater.inflate(C5460i.login_page_forgot_password, viewGroup, false);
        mo1450b();
        return this.f20441b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1450b() {
        Bundle m = mo1307m();
        if (m != null) {
            this.f20444f = m.getString("pageId");
        }
        this.f20442c = (EditText) this.f20441b.findViewById(C5458g.login_page_restore_email);
        this.f20440a = (TextView) this.f20441b.findViewById(C5458g.login_page_result_label);
        this.f20445g = (LoadingView) this.f20441b.findViewById(C5458g.loginPageForgotPasswLoadingView);
        this.f20443d = (Button) this.f20441b.findViewById(C5458g.login_page_restore_btn);
        this.f20443d.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C5770c.this.m28408d();
            }
        });
    }
}
