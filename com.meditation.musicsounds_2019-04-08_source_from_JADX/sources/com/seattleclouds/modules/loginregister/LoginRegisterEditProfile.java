package com.seattleclouds.modules.loginregister;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.fingerprint.FingerprintManager;
import android.hardware.fingerprint.FingerprintManager.CryptoObject;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.p023v7.app.C0765d;
import android.support.p023v7.app.C0765d.C0766a;
import android.support.p023v7.widget.SwitchCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.vending.billing.util.C1148a;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6348n;
import com.seattleclouds.api.C5268b;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6593am;
import com.seattleclouds.util.C6600as;
import com.seattleclouds.util.HTTPUtil;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

public class LoginRegisterEditProfile extends C6348n implements C5797b {
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final Integer f20504p = Integer.valueOf(100);
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final Integer f20505q = Integer.valueOf(101);
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final Integer f20506r = Integer.valueOf(104);

    /* renamed from: A */
    private SharedPreferences f20507A;

    /* renamed from: B */
    private Context f20508B;

    /* renamed from: C */
    private C0766a f20509C;

    /* renamed from: D */
    private SwitchCompat f20510D;

    /* renamed from: E */
    private SwitchCompat f20511E;

    /* renamed from: F */
    private OnCheckedChangeListener f20512F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public int f20513G = -1;

    /* renamed from: n */
    C0765d f20514n;

    /* renamed from: o */
    TextView f20515o;

    /* renamed from: s */
    private TextView f20516s;

    /* renamed from: t */
    private TextView f20517t;

    /* renamed from: u */
    private TextView f20518u;

    /* renamed from: v */
    private TextView f20519v;

    /* renamed from: w */
    private Button f20520w;

    /* renamed from: x */
    private String f20521x;

    /* renamed from: y */
    private Bundle f20522y = null;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public C5796a f20523z;

    /* renamed from: com.seattleclouds.modules.loginregister.LoginRegisterEditProfile$a */
    private class C5795a extends AsyncTask<HashMap<String, String>, Void, Integer> {
        private C5795a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer doInBackground(HashMap<String, String>... hashMapArr) {
            String str;
            String str2;
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(C5268b.m26280b(App.f18516r));
                sb.append("://");
                sb.append(App.f18516r);
                sb.append("/loginregisterpostuserdata.ashx?publisherid=");
                sb.append(App.f18522x);
                sb.append("&username=");
                sb.append(App.f18523y);
                sb.append("&appid=");
                sb.append(App.f18524z);
                sb.append("&action=edituser");
                String sb2 = sb.toString();
                String str3 = "";
                String str4 = "";
                for (Entry entry : hashMapArr[0].entrySet()) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(sb2);
                    sb3.append("&");
                    sb3.append((String) entry.getKey());
                    sb3.append("=");
                    sb3.append(URLEncoder.encode((String) entry.getValue(), "UTF-8"));
                    sb2 = sb3.toString();
                    if (((String) entry.getKey()).equals("passwordnewclean")) {
                        str4 = (String) entry.getValue();
                    } else if (((String) entry.getKey()).equals("email")) {
                        str3 = (String) entry.getValue();
                    }
                }
                if (!new JSONObject(HTTPUtil.m31767b(sb2)).getString("status").equalsIgnoreCase("OK")) {
                    return LoginRegisterEditProfile.f20505q;
                }
                LoginRegisterEditProfile.this.m28506a(str3, str4);
                return LoginRegisterEditProfile.f20504p;
            } catch (IOException e) {
                e = e;
                str = "LoginEditProfile";
                str2 = "Network error : ";
                Log.e(str, str2, e);
                return LoginRegisterEditProfile.f20506r;
            } catch (JSONException e2) {
                e = e2;
                str = "LoginEditProfile";
                str2 = "Internal server error occurred : ";
                Log.e(str, str2, e);
                return LoginRegisterEditProfile.f20506r;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Integer num) {
            LoginRegisterEditProfile loginRegisterEditProfile;
            int i;
            String str = "";
            if (num.intValue() == LoginRegisterEditProfile.f20504p.intValue()) {
                loginRegisterEditProfile = LoginRegisterEditProfile.this;
                i = C5462k.login_register_editprofile_credential;
            } else if (num.intValue() == LoginRegisterEditProfile.f20505q.intValue()) {
                loginRegisterEditProfile = LoginRegisterEditProfile.this;
                i = C5462k.login_register_editprofile_credential_error;
            } else {
                if (num.intValue() == LoginRegisterEditProfile.f20506r.intValue()) {
                    loginRegisterEditProfile = LoginRegisterEditProfile.this;
                    i = C5462k.login_register_error_try_again;
                }
                Toast.makeText(LoginRegisterEditProfile.this.getApplicationContext(), str, 0).show();
            }
            str = loginRegisterEditProfile.getString(i);
            Toast.makeText(LoginRegisterEditProfile.this.getApplicationContext(), str, 0).show();
        }
    }

    /* renamed from: a */
    private String m28504a(String str) {
        return str == null ? "" : C1148a.m6246a(str.getBytes());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m28506a(String str, String str2) {
        C5799d.m28555b(str, str2);
    }

    /* renamed from: a */
    private void m28507a(String str, String str2, String str3, boolean z) {
        this.f20509C = VERSION.SDK_INT >= 21 ? new C0766a(this, 16974374) : new C0766a(this);
        this.f20509C.mo3054a((CharSequence) str).mo3063b((CharSequence) str2).mo3064b((CharSequence) str3, (OnClickListener) new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                LoginRegisterEditProfile.this.m28523w();
                LoginRegisterEditProfile.this.f20523z = null;
            }
        });
        if (z) {
            this.f20509C.mo3066c(C5457f.ic_fingerprint);
        }
        this.f20514n = this.f20509C.mo3065b();
        if (this.f20514n != null) {
            this.f20514n.show();
        }
    }

    /* renamed from: b */
    private static void m28509b(String str) {
        if (C5799d.f20543a) {
            Log.d("LoginEditProfile", str);
        }
    }

    /* renamed from: c */
    private void m28511c(boolean z) {
        SwitchCompat switchCompat;
        OnCheckedChangeListener onCheckedChangeListener;
        StringBuilder sb = new StringBuilder();
        sb.append("setFingerPrintListenerEnabled:'");
        sb.append(z);
        sb.append("'");
        m28509b(sb.toString());
        if (!z) {
            switchCompat = this.f20510D;
            onCheckedChangeListener = null;
        } else {
            switchCompat = this.f20510D;
            onCheckedChangeListener = this.f20512F;
        }
        switchCompat.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    /* renamed from: d */
    private void m28513d(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("setFingerPrintChecked:'");
        sb.append(z);
        sb.append("'");
        m28509b(sb.toString());
        this.f20510D.setChecked(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m28518r() {
        TextView textView;
        int i;
        if (this.f20511E.isChecked()) {
            textView = this.f20515o;
            i = C5462k.txtkeep_you_logged_on;
        } else {
            textView = this.f20515o;
            i = C5462k.txtkeep_you_logged_off;
        }
        textView.setText(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m28519s() {
        m28509b("checkFingerPrintWithSensor");
        if (VERSION.SDK_INT >= 23) {
            CryptoObject a = C5814g.m28630a();
            if (a != null) {
                m28520t();
                FingerprintManager fingerprintManager = (FingerprintManager) getSystemService("fingerprint");
                this.f20523z = new C5796a(this, this);
                this.f20523z.mo18489a(fingerprintManager, a);
                return;
            }
            m28507a(getString(C5462k.login_register_something_went_wrong), "", getString(17039369), false);
        }
    }

    /* renamed from: t */
    private void m28520t() {
        Resources resources;
        int i;
        m28509b("initAlert");
        String string = getResources().getString(C5462k.login_register_fingerPrint_alert_title);
        if (C5799d.m28549aB()) {
            resources = getResources();
            i = C5462k.login_register_fingerPrint_turnOff;
        } else {
            resources = getResources();
            i = C5462k.login_register_fingerPrint_turnOn;
        }
        m28507a(string, resources.getString(i), getString(17039379), true);
    }

    /* renamed from: u */
    private void m28521u() {
        m28509b("closeAlert");
        if (this.f20514n != null && this.f20514n.isShowing()) {
            this.f20514n.cancel();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m28522v() {
        if (getCurrentFocus() != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        }
        this.f20521x = this.f20519v.getText().toString();
        if (!Patterns.EMAIL_ADDRESS.matcher(this.f20521x).matches()) {
            Toast.makeText(this, C5462k.login_register_login_email_address_invalid, 0).show();
        } else if (TextUtils.isEmpty(this.f20517t.getText().toString()) || TextUtils.isEmpty(this.f20518u.getText().toString())) {
            Toast.makeText(this, C5462k.login_register_register_all_fields_required, 0).show();
        } else if (!this.f20517t.getText().toString().equalsIgnoreCase(this.f20518u.getText().toString())) {
            Toast.makeText(this, C5462k.login_register_editprofile_mismatch, 0).show();
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("email", this.f20521x);
            hashMap.put("password", C6592al.m31912e(m28504a(this.f20516s.getText().toString())));
            hashMap.put("passwordnew", C6592al.m31912e(m28504a(this.f20517t.getText().toString())));
            hashMap.put("passwordnewclean", this.f20517t.getText().toString());
            hashMap.put("unumber", C5800e.m28594c());
            new C5795a().execute(new HashMap[]{hashMap});
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m28523w() {
        m28521u();
        m28511c(false);
        m28513d(C5799d.m28549aB());
        m28511c(true);
    }

    /* renamed from: A_ */
    public void mo18477A_() {
        C5799d.m28564f(String.valueOf(this.f20510D.isChecked()));
        Toast.makeText(this, getString(C5462k.login_register_editprofile_saved), 0).show();
        m28521u();
    }

    /* renamed from: a */
    public void mo18478a(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("onAuthenticateFailed with message: '");
        sb.append(str);
        sb.append("', error code:");
        sb.append(i);
        m28509b(sb.toString());
        Toast.makeText(this, str, 1).show();
        m28523w();
        this.f20523z = null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f20513G = bundle.getInt("BACKGROUND_IMG_HEIGHT");
        }
        setContentView(C5460i.activity_login_register_edit_profile);
        this.f20522y = C5800e.m28597d();
        final View findViewById = findViewById(C5458g.login_register_edit_profile_img);
        final View findViewById2 = findViewById(C5458g.login_register_edit_profile_scroll_view);
        final View findViewById3 = findViewById(C5458g.login_register_editprofile_rl);
        TextView textView = (TextView) findViewById(C5458g.login_register_editprofile_tv);
        TextView textView2 = (TextView) findViewById(C5458g.login_register_editprofile_other_settings_tv);
        TextView textView3 = (TextView) findViewById(C5458g.lblEnableFingerprint);
        TextView textView4 = (TextView) findViewById(C5458g.lblKeepSigned);
        this.f20516s = (TextView) findViewById(C5458g.login_register_editprofile_old);
        this.f20517t = (TextView) findViewById(C5458g.login_register_editprofile_new);
        this.f20518u = (TextView) findViewById(C5458g.login_register_editprofile_confirm);
        this.f20519v = (TextView) findViewById(C5458g.login_register_editprofile_email);
        this.f20515o = (TextView) findViewById(C5458g.txtKeepLogin);
        this.f20520w = (Button) findViewById(C5458g.login_register_editprofile_update);
        if (this.f20522y != null) {
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                public void onGlobalLayout() {
                    if (VERSION.SDK_INT < 16) {
                        findViewById3.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    } else {
                        findViewById3.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                    LoginRegisterEditProfile.this.f20513G = C6600as.m31943a(LoginRegisterEditProfile.this, findViewById, findViewById2, findViewById3, LoginRegisterEditProfile.this.f20513G);
                }
            });
            C6593am.m31914a(findViewById, this.f20522y);
            C6593am.m31915a(textView, this.f20522y);
            C6593am.m31915a(textView2, this.f20522y);
            C6593am.m31915a(textView3, this.f20522y);
            C6593am.m31915a(textView4, this.f20522y);
            C6593am.m31915a(this.f20516s, this.f20522y);
            C6593am.m31915a(this.f20517t, this.f20522y);
            C6593am.m31915a(this.f20518u, this.f20522y);
            C6593am.m31915a(this.f20519v, this.f20522y);
            C6593am.m31915a(this.f20515o, this.f20522y);
            C6593am.m31915a((TextView) this.f20520w, this.f20522y);
        }
        this.f20519v.setText(C5800e.m28591b());
        this.f20521x = C5800e.m28591b();
        this.f20520w.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                LoginRegisterEditProfile.this.m28522v();
            }
        });
        this.f20508B = getApplicationContext();
        this.f20507A = PreferenceManager.getDefaultSharedPreferences(this);
        this.f20511E = (SwitchCompat) findViewById(C5458g.swKeepSigned);
        if (this.f20511E != null) {
            this.f20511E.setChecked(C5799d.m28550aC());
            m28518r();
            this.f20511E.setOnCheckedChangeListener(new OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    LoginRegisterEditProfile.this.m28518r();
                    C5799d.m28562e(String.valueOf(z));
                }
            });
        }
        if (!C5814g.m28635b()) {
            LinearLayout linearLayout = (LinearLayout) findViewById(C5458g.enableFingerprintForm);
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        this.f20510D = (SwitchCompat) findViewById(C5458g.swEnableFingerprint);
        if (this.f20510D != null) {
            this.f20510D.setChecked(C5799d.m28549aB());
            this.f20512F = new OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    LoginRegisterEditProfile.this.m28519s();
                }
            };
            m28511c(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        m28509b("onDestroy");
        if (this.f20514n != null && this.f20514n.isShowing()) {
            this.f20514n.cancel();
        }
        this.f20523z = null;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (this.f20513G != -1) {
            bundle.putInt("BACKGROUND_IMG_HEIGHT", this.f20513G);
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        if (VERSION.SDK_INT >= 23 && this.f20523z != null) {
            this.f20523z.mo18488a();
        }
    }
}
