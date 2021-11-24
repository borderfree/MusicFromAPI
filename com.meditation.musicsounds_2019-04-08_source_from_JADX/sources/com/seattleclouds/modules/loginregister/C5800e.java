package com.seattleclouds.modules.loginregister;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Typeface;
import android.hardware.fingerprint.FingerprintManager;
import android.hardware.fingerprint.FingerprintManager.CryptoObject;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p009v4.app.C0367h;
import android.support.p023v7.app.C0765d;
import android.support.p023v7.app.C0765d.C0766a;
import android.support.p023v7.widget.SwitchCompat;
import android.util.Log;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.android.vending.billing.util.C1148a;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.OneFragmentActivity;
import com.seattleclouds.api.C5268b;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6593am;
import com.seattleclouds.util.C6600as;
import com.seattleclouds.util.HTTPUtil;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map.Entry;
import org.apache.commons.p198io.C6732d;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.seattleclouds.modules.loginregister.e */
public class C5800e extends C6557s implements C5797b {

    /* renamed from: a */
    protected static String f20561a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static String f20562c;

    /* renamed from: d */
    private static Bundle f20563d;
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public C5796a f20564ae;

    /* renamed from: b */
    C0765d f20565b;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f20566e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C5807b f20567f;

    /* renamed from: g */
    private SwitchCompat f20568g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f20569h = -1;

    /* renamed from: i */
    private C0766a f20570i;

    /* renamed from: com.seattleclouds.modules.loginregister.e$a */
    private class C5806a extends AsyncTask<String, Void, Integer> {
        private C5806a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer doInBackground(String... strArr) {
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
                sb.append("&email=");
                sb.append(strArr[0]);
                sb.append("&action=forgotpass");
                return new JSONObject(HTTPUtil.m31767b(sb.toString())).getString("status").equalsIgnoreCase("OK") ? Integer.valueOf(0) : Integer.valueOf(4);
            } catch (IOException e) {
                e = e;
                str = "LoginLoginFragment";
                str2 = "Network error : ";
                Log.e(str, str2, e);
                return Integer.valueOf(4);
            } catch (JSONException e2) {
                e = e2;
                str = "LoginLoginFragment";
                str2 = "Internal server error occurred : ";
                Log.e(str, str2, e);
                return Integer.valueOf(4);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Integer num) {
            C5800e eVar;
            int i;
            if (num.intValue() == 0) {
                eVar = C5800e.this;
                i = C5462k.login_register_forgot_pass;
            } else {
                eVar = C5800e.this;
                i = C5462k.login_register_forgot_pass_error;
            }
            Toast.makeText(C5800e.this.mo1318s(), eVar.mo1219a(i), 0).show();
        }
    }

    /* renamed from: com.seattleclouds.modules.loginregister.e$b */
    public interface C5807b {
        /* renamed from: a */
        void mo18508a(HashMap<String, String> hashMap);
    }

    /* renamed from: com.seattleclouds.modules.loginregister.e$c */
    private class C5808c extends AsyncTask<String, Void, Integer> {
        private C5808c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer doInBackground(String... strArr) {
            InputStream e = App.m25649e("login_register.xml");
            try {
                XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                newPullParser.setInput(e, "UTF-8");
                int eventType = newPullParser.getEventType();
                while (eventType != 1) {
                    if (eventType != 2 || !"user".equals(newPullParser.getName()) || !strArr[0].equals(newPullParser.getAttributeValue(null, "email"))) {
                        eventType = newPullParser.next();
                    } else if (newPullParser.getAttributeValue(null, "password").equals(C5814g.m28631a(strArr[1]))) {
                        C5800e.f20561a = newPullParser.getAttributeValue(null, "userid");
                        return Integer.valueOf(0);
                    } else {
                        Integer valueOf = Integer.valueOf(2);
                        C6732d.m32485a(e);
                        return valueOf;
                    }
                }
                C6732d.m32485a(e);
                InputStream e2 = App.m25649e("logindata/pending_login_register.xml");
                try {
                    XmlPullParser newPullParser2 = XmlPullParserFactory.newInstance().newPullParser();
                    newPullParser2.setInput(e2, "UTF-8");
                    int eventType2 = newPullParser2.getEventType();
                    while (eventType2 != 1) {
                        if (eventType2 != 2 || !"user".equals(newPullParser2.getName()) || !strArr[0].equals(newPullParser2.getAttributeValue(null, "email"))) {
                            eventType2 = newPullParser2.next();
                        } else if (newPullParser2.getAttributeValue(null, "password").equals(strArr[1])) {
                            return Integer.valueOf(1);
                        } else {
                            Integer valueOf2 = Integer.valueOf(2);
                            C6732d.m32485a(e2);
                            return valueOf2;
                        }
                    }
                    Integer valueOf3 = Integer.valueOf(3);
                    C6732d.m32485a(e2);
                    return valueOf3;
                } catch (Exception e3) {
                    Log.e("LoginRegisterLogin", "Exception", e3);
                    return Integer.valueOf(4);
                } finally {
                    C6732d.m32485a(e2);
                }
            } catch (IOException e4) {
                Log.e("LoginLoginFragment", "login and register fragment", e4);
                return Integer.valueOf(4);
            } catch (XmlPullParserException e5) {
                Log.e("LoginLoginFragment", "Error parser login and register", e5);
                return Integer.valueOf(4);
            } finally {
                C6732d.m32485a(e);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Integer num) {
            boolean z;
            if (num.intValue() == 0) {
                z = true;
            } else {
                C5800e.this.mo18511a(num);
                z = false;
            }
            if (z) {
                C5800e.this.f20567f.mo18508a(C5800e.this.mo18513e());
            }
        }
    }

    /* renamed from: com.seattleclouds.modules.loginregister.e$d */
    private class C5809d extends AsyncTask<HashMap<String, String>, Void, Integer> {
        private C5809d() {
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
                sb.append("&action=loginuser");
                String sb2 = sb.toString();
                for (Entry entry : hashMapArr[0].entrySet()) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(sb2);
                    sb3.append("&");
                    sb3.append((String) entry.getKey());
                    sb3.append("=");
                    sb3.append(URLEncoder.encode((String) entry.getValue(), "UTF-8"));
                    sb2 = sb3.toString();
                }
                JSONObject jSONObject = new JSONObject(HTTPUtil.m31767b(sb2));
                String string = jSONObject.getString("status");
                if (!string.equalsIgnoreCase("OK")) {
                    return string.equalsIgnoreCase("INVALID_PASSWORD") ? Integer.valueOf(2) : string.equalsIgnoreCase("PENDING_APPROVAL") ? Integer.valueOf(1) : string.equalsIgnoreCase("USER_NOT_FOUND") ? Integer.valueOf(3) : Integer.valueOf(4);
                }
                C5800e.f20561a = jSONObject.getString("userid");
                return Integer.valueOf(0);
            } catch (IOException e) {
                e = e;
                str = "LoginLoginFragment";
                str2 = "Network error : ";
                Log.e(str, str2, e);
                return Integer.valueOf(4);
            } catch (JSONException e2) {
                e = e2;
                str = "LoginLoginFragment";
                str2 = "Internal server error occurred : ";
                Log.e(str, str2, e);
                return Integer.valueOf(4);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Integer num) {
            C5800e eVar;
            int i;
            String str = "";
            boolean z = true;
            if (num.intValue() == 0) {
                str = C5800e.this.mo1219a(C5462k.login_register_login_successfully_logged_in);
            } else {
                if (num.intValue() == 1) {
                    eVar = C5800e.this;
                    i = C5462k.login_register_login_request_pending_approval;
                } else if (num.intValue() == 2) {
                    eVar = C5800e.this;
                    i = C5462k.login_register_login_invalid_email_or_password;
                } else if (num.intValue() == 3) {
                    eVar = C5800e.this;
                    i = C5462k.login_register_login_user_doesnt_exist;
                } else {
                    if (num.intValue() == 4) {
                        eVar = C5800e.this;
                        i = C5462k.login_register_error_try_again;
                    }
                    z = false;
                }
                str = eVar.mo1219a(i);
                z = false;
            }
            Toast.makeText(C5800e.this.mo1318s(), str, 0).show();
            if (z) {
                C5800e.this.f20567f.mo18508a(C5800e.this.mo18513e());
            }
        }
    }

    /* renamed from: a */
    private void m28584a(String str, String str2, String str3, boolean z) {
        this.f20570i = VERSION.SDK_INT >= 21 ? new C0766a(mo1316q(), 16974374) : new C0766a(mo1316q());
        this.f20570i.mo3054a((CharSequence) str).mo3063b((CharSequence) str2).mo3064b((CharSequence) str3, (OnClickListener) new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                C5800e.this.m28586aB();
                C5800e.this.f20564ae = null;
            }
        });
        if (z) {
            this.f20570i.mo3066c(C5457f.ic_fingerprint);
        }
        this.f20565b = this.f20570i.mo3065b();
        m28585aA();
    }

    /* renamed from: aA */
    private void m28585aA() {
        m28601e("showAlert");
        if (this.f20565b != null) {
            this.f20565b.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aB */
    public void m28586aB() {
        m28601e("closeAlert");
        if (this.f20565b != null && this.f20565b.isShowing()) {
            this.f20565b.cancel();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aC */
    public void m28587aC() {
        View currentFocus = mo1318s().getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) mo1318s().getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: at */
    public void m28589at() {
        m28601e("checkFingerPrintWithSensor");
        if (VERSION.SDK_INT >= 23) {
            CryptoObject a = C5814g.m28630a();
            FingerprintManager fingerprintManager = (FingerprintManager) App.m25647e().getSystemService("fingerprint");
            if (a == null || fingerprintManager == null) {
                m28584a(mo1219a(C5462k.login_register_something_went_wrong), "", mo1219a(17039379), false);
                return;
            }
            m28590az();
            this.f20564ae = new C5796a(mo1316q(), this);
            this.f20564ae.mo18489a(fingerprintManager, a);
        }
    }

    /* renamed from: az */
    private void m28590az() {
        m28601e("initAlert");
        m28584a(mo1320t().getString(C5462k.login_register_fingerPrint_alert_title), mo1320t().getString(C5462k.login_register_login_fingerPrint_alert_message), mo1219a(17039369), true);
    }

    /* renamed from: b */
    public static String m28591b() {
        return f20562c;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m28593b(String str, String str2) {
        C0367h s;
        int i;
        if (C6592al.m31910c(str) || C6592al.m31910c(str2)) {
            s = mo1318s();
            i = C5462k.login_register_login_both_fields_required;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
            s = mo1318s();
            i = C5462k.login_register_login_email_address_invalid;
        } else {
            ((InputMethodManager) mo1318s().getSystemService("input_method")).hideSoftInputFromWindow(mo1199I().getWindowToken(), 0);
            if (C5799d.m28561d(str)) {
                mo18512a(str, str2);
            } else {
                new C5808c().execute(new String[]{str, str2});
            }
            return;
        }
        Toast.makeText(s, i, 0).show();
    }

    /* renamed from: c */
    public static String m28594c() {
        return f20561a;
    }

    /* renamed from: d */
    public static Bundle m28597d() {
        return f20563d;
    }

    /* renamed from: d */
    private String m28598d(String str) {
        return str == null ? "" : C1148a.m6246a(str.getBytes());
    }

    /* renamed from: e */
    private static void m28601e(String str) {
        if (C5799d.f20543a) {
            Log.d("LoginLoginFragment", str);
        }
    }

    /* renamed from: A_ */
    public void mo18477A_() {
        m28586aB();
        C5799d dVar = new C5799d();
        String as = C5799d.m28553as();
        String at = dVar.mo18509at();
        f20562c = as;
        this.f20566e = at;
        StringBuilder sb = new StringBuilder();
        sb.append("onAuthenticate=> email:'");
        sb.append(as);
        sb.append("' pass:'");
        sb.append(at);
        sb.append("'");
        m28601e(sb.toString());
        m28593b(as, at);
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo1217a(layoutInflater, viewGroup, bundle);
        if (bundle != null) {
            this.f20569h = bundle.getInt("BACKGROUND_IMG_HEIGHT");
        }
        View inflate = layoutInflater.inflate(C5460i.login_register_login_fragment, viewGroup, false);
        final View findViewById = inflate.findViewById(C5458g.login_register_login_img);
        final View findViewById2 = inflate.findViewById(C5458g.login_register_login_scroll_view);
        final View findViewById3 = inflate.findViewById(C5458g.login_register_login_ll);
        final EditText editText = (EditText) inflate.findViewById(C5458g.login_register_email);
        final EditText editText2 = (EditText) inflate.findViewById(C5458g.login_register_password);
        TextView textView = (TextView) inflate.findViewById(C5458g.lblKeepSigned);
        Button button = (Button) inflate.findViewById(C5458g.login_register_login_button);
        Button button2 = (Button) inflate.findViewById(C5458g.btn_forgot_password);
        if (f20563d != null) {
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                public void onGlobalLayout() {
                    if (VERSION.SDK_INT < 16) {
                        findViewById3.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    } else {
                        findViewById3.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                    C5800e.this.f20569h = C6600as.m31943a(C5800e.this.mo1316q(), findViewById, findViewById2, findViewById3, C5800e.this.f20569h);
                }
            });
            C6593am.m31914a(findViewById, f20563d);
            C6593am.m31915a((TextView) editText, f20563d);
            C6593am.m31915a((TextView) editText2, f20563d);
            C6593am.m31915a(textView, f20563d);
            C6593am.m31915a((TextView) button, f20563d);
            C6593am.m31915a((TextView) button2, f20563d);
        }
        editText2.setTypeface(Typeface.DEFAULT);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C5800e.f20562c = editText.getText().toString();
                C5800e.this.f20566e = editText2.getText().toString();
                C5800e.this.m28593b(C5800e.f20562c, C5800e.this.f20566e);
            }
        });
        button2.setPaintFlags(button2.getPaintFlags() | 8);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C5800e.f20562c = editText.getText().toString();
                if (!Patterns.EMAIL_ADDRESS.matcher(C5800e.f20562c).matches()) {
                    Toast.makeText(C5800e.this.mo1318s(), C5462k.login_register_login_email_address_invalid, 0).show();
                    return;
                }
                ((InputMethodManager) C5800e.this.mo1318s().getSystemService("input_method")).hideSoftInputFromWindow(C5800e.this.mo1199I().getWindowToken(), 0);
                new C5806a().execute(new String[]{C5800e.f20562c});
            }
        });
        ImageView imageView = (ImageView) inflate.findViewById(C5458g.btnFingerPrint);
        if (imageView != null) {
            if (!C5814g.m28635b() || !C5799d.m28549aB()) {
                imageView.setVisibility(8);
            } else {
                imageView.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        C5800e.this.m28587aC();
                        C5800e.this.m28589at();
                    }
                });
            }
        }
        this.f20568g = (SwitchCompat) inflate.findViewById(C5458g.swKeepSigned);
        return inflate;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        Bundle m = mo1307m();
        if (m != null) {
            f20563d = m.getBundle("LOGIN_REGISTER_PAGE_STYLE");
        }
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        menuInflater.inflate(C5461j.login_register_register_menu, menu);
    }

    /* renamed from: a */
    public void mo18510a(C5807b bVar) {
        this.f20567f = bVar;
    }

    /* renamed from: a */
    public void mo18511a(Integer num) {
        if (num.intValue() != 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("email", f20562c);
            hashMap.put("password", C6592al.m31912e(m28598d(this.f20566e)));
            new C5809d().execute(new HashMap[]{hashMap});
        }
    }

    /* renamed from: a */
    public void mo18478a(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("onAuthenticateFailed with message: '");
        sb.append(str);
        sb.append("', error code:");
        sb.append(i);
        m28601e(sb.toString());
        Toast.makeText(mo1316q(), str, 1).show();
        m28586aB();
        this.f20564ae = null;
    }

    /* renamed from: a */
    public void mo18512a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("email", str);
        hashMap.put("password", C6592al.m31912e(m28598d(str2)));
        new C5809d().execute(new HashMap[]{hashMap});
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        if (menuItem.getItemId() != C5458g.login_register_register_action) {
            return super.mo1245a(menuItem);
        }
        Intent a = OneFragmentActivity.m25751a(mo1318s(), C5810f.class);
        if (f20563d != null) {
            a.putExtra("LOGIN_REGISTER_PAGE_STYLE", f20563d);
        }
        mo1230a(a);
        return true;
    }

    /* renamed from: e */
    public HashMap<String, String> mo18513e() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("email", f20562c);
        hashMap.put("password", this.f20566e);
        hashMap.put("keepLogin", String.valueOf(this.f20568g.isChecked()));
        return hashMap;
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        if (this.f20569h != -1) {
            bundle.putInt("BACKGROUND_IMG_HEIGHT", this.f20569h);
        }
        super.mo1282e(bundle);
    }

    /* renamed from: h */
    public void mo1292h() {
        super.mo1292h();
        if (VERSION.SDK_INT >= 23 && this.f20564ae != null) {
            this.f20564ae.mo18488a();
        }
    }

    /* renamed from: i */
    public void mo1296i() {
        super.mo1296i();
        m28601e("onDestroy");
        if (this.f20565b != null && this.f20565b.isShowing()) {
            this.f20565b.cancel();
        }
        this.f20564ae = null;
    }
}
