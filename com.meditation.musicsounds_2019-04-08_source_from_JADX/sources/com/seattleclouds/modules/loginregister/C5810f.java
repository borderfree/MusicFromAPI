package com.seattleclouds.modules.loginregister;

import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6593am;
import com.seattleclouds.util.C6600as;
import java.util.HashMap;

/* renamed from: com.seattleclouds.modules.loginregister.f */
public class C5810f extends C6557s {

    /* renamed from: a */
    private Bundle f20585a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f20586b = -1;

    /* renamed from: com.seattleclouds.modules.loginregister.f$a */
    private class C5813a extends AsyncTask<HashMap<String, String>, Void, String> {

        /* renamed from: b */
        private boolean f20602b;

        private C5813a() {
            this.f20602b = false;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x012d  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0147  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x0151  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.util.HashMap<java.lang.String, java.lang.String>... r7) {
            /*
                r6 = this;
                r0 = 0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                r1.<init>()     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                java.lang.String r2 = com.seattleclouds.App.f18516r     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                java.lang.String r2 = com.seattleclouds.api.C5268b.m26280b(r2)     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                r1.append(r2)     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                java.lang.String r2 = "://"
                r1.append(r2)     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                java.lang.String r2 = com.seattleclouds.App.f18516r     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                r1.append(r2)     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                java.lang.String r2 = "/loginregisterpostuserdata.ashx?publisherid="
                r1.append(r2)     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                java.lang.String r2 = com.seattleclouds.App.f18522x     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                r1.append(r2)     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                java.lang.String r2 = "&username="
                r1.append(r2)     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                java.lang.String r2 = com.seattleclouds.App.f18523y     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                r1.append(r2)     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                java.lang.String r2 = "&appid="
                r1.append(r2)     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                java.lang.String r2 = com.seattleclouds.App.f18524z     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                r1.append(r2)     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                java.lang.String r2 = "&nohash=yes"
                r1.append(r2)     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                r2 = 0
                r7 = r7[r2]     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                java.util.Set r7 = r7.entrySet()     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                java.util.Iterator r7 = r7.iterator()     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
            L_0x004b:
                boolean r2 = r7.hasNext()     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                if (r2 == 0) goto L_0x0086
                java.lang.Object r2 = r7.next()     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                r3.<init>()     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                r3.append(r1)     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                java.lang.String r1 = "&"
                r3.append(r1)     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                java.lang.Object r1 = r2.getKey()     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                r3.append(r1)     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                java.lang.String r1 = "="
                r3.append(r1)     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                java.lang.Object r1 = r2.getValue()     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                java.lang.String r2 = "UTF-8"
                java.lang.String r1 = java.net.URLEncoder.encode(r1, r2)     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                r3.append(r1)     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                java.lang.String r1 = r3.toString()     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                goto L_0x004b
            L_0x0086:
                java.net.URL r7 = new java.net.URL     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                r7.<init>(r1)     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                java.net.URLConnection r7 = r7.openConnection()     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ IOException -> 0x0134, JSONException -> 0x011a, all -> 0x0117 }
                int r1 = r7.getResponseCode()     // Catch:{ IOException -> 0x0111, JSONException -> 0x010b, all -> 0x0105 }
                r2 = 201(0xc9, float:2.82E-43)
                if (r1 != r2) goto L_0x00ad
                r1 = 1
                r6.f20602b = r1     // Catch:{ IOException -> 0x0111, JSONException -> 0x010b, all -> 0x0105 }
                com.seattleclouds.modules.loginregister.f r1 = com.seattleclouds.modules.loginregister.C5810f.this     // Catch:{ IOException -> 0x0111, JSONException -> 0x010b, all -> 0x0105 }
                int r2 = com.seattleclouds.C5451m.C5462k.login_register_register_account_created     // Catch:{ IOException -> 0x0111, JSONException -> 0x010b, all -> 0x0105 }
                java.lang.String r1 = r1.mo1219a(r2)     // Catch:{ IOException -> 0x0111, JSONException -> 0x010b, all -> 0x0105 }
                if (r7 == 0) goto L_0x00a9
                r7.disconnect()
            L_0x00a9:
                org.apache.commons.p198io.C6732d.m32485a(r0)
                return r1
            L_0x00ad:
                java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0111, JSONException -> 0x010b, all -> 0x0105 }
                java.io.InputStream r2 = r7.getInputStream()     // Catch:{ IOException -> 0x0111, JSONException -> 0x010b, all -> 0x0105 }
                r1.<init>(r2)     // Catch:{ IOException -> 0x0111, JSONException -> 0x010b, all -> 0x0105 }
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ IOException -> 0x0100, JSONException -> 0x00fb, all -> 0x00f5 }
                java.lang.String r2 = org.apache.commons.p198io.C6732d.m32491b(r1)     // Catch:{ IOException -> 0x0100, JSONException -> 0x00fb, all -> 0x00f5 }
                r0.<init>(r2)     // Catch:{ IOException -> 0x0100, JSONException -> 0x00fb, all -> 0x00f5 }
                java.util.Iterator r2 = r0.keys()     // Catch:{ IOException -> 0x0100, JSONException -> 0x00fb, all -> 0x00f5 }
            L_0x00c3:
                boolean r3 = r2.hasNext()     // Catch:{ IOException -> 0x0100, JSONException -> 0x00fb, all -> 0x00f5 }
                if (r3 == 0) goto L_0x00e4
                java.lang.Object r3 = r2.next()     // Catch:{ IOException -> 0x0100, JSONException -> 0x00fb, all -> 0x00f5 }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x0100, JSONException -> 0x00fb, all -> 0x00f5 }
                java.lang.String r4 = "message"
                boolean r4 = r4.equals(r3)     // Catch:{ IOException -> 0x0100, JSONException -> 0x00fb, all -> 0x00f5 }
                if (r4 == 0) goto L_0x00c3
                java.lang.String r0 = r0.getString(r3)     // Catch:{ IOException -> 0x0100, JSONException -> 0x00fb, all -> 0x00f5 }
                if (r7 == 0) goto L_0x00e0
                r7.disconnect()
            L_0x00e0:
                org.apache.commons.p198io.C6732d.m32485a(r1)
                return r0
            L_0x00e4:
                com.seattleclouds.modules.loginregister.f r0 = com.seattleclouds.modules.loginregister.C5810f.this     // Catch:{ IOException -> 0x0100, JSONException -> 0x00fb, all -> 0x00f5 }
                int r2 = com.seattleclouds.C5451m.C5462k.login_register_error_try_again     // Catch:{ IOException -> 0x0100, JSONException -> 0x00fb, all -> 0x00f5 }
                java.lang.String r0 = r0.mo1219a(r2)     // Catch:{ IOException -> 0x0100, JSONException -> 0x00fb, all -> 0x00f5 }
                if (r7 == 0) goto L_0x00f1
                r7.disconnect()
            L_0x00f1:
                org.apache.commons.p198io.C6732d.m32485a(r1)
                return r0
            L_0x00f5:
                r0 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
                goto L_0x014f
            L_0x00fb:
                r0 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
                goto L_0x011c
            L_0x0100:
                r0 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
                goto L_0x0136
            L_0x0105:
                r1 = move-exception
                r5 = r0
                r0 = r7
                r7 = r1
                r1 = r5
                goto L_0x014f
            L_0x010b:
                r1 = move-exception
                r5 = r0
                r0 = r7
                r7 = r1
                r1 = r5
                goto L_0x011c
            L_0x0111:
                r1 = move-exception
                r5 = r0
                r0 = r7
                r7 = r1
                r1 = r5
                goto L_0x0136
            L_0x0117:
                r7 = move-exception
                r1 = r0
                goto L_0x014f
            L_0x011a:
                r7 = move-exception
                r1 = r0
            L_0x011c:
                java.lang.String r2 = "login_register"
                java.lang.String r3 = "Internal server error occurred : "
                android.util.Log.e(r2, r3, r7)     // Catch:{ all -> 0x014e }
                com.seattleclouds.modules.loginregister.f r7 = com.seattleclouds.modules.loginregister.C5810f.this     // Catch:{ all -> 0x014e }
                int r2 = com.seattleclouds.C5451m.C5462k.common_internal_server_error     // Catch:{ all -> 0x014e }
                java.lang.String r7 = r7.mo1219a(r2)     // Catch:{ all -> 0x014e }
                if (r0 == 0) goto L_0x0130
                r0.disconnect()
            L_0x0130:
                org.apache.commons.p198io.C6732d.m32485a(r1)
                return r7
            L_0x0134:
                r7 = move-exception
                r1 = r0
            L_0x0136:
                java.lang.String r2 = "login_register"
                java.lang.String r3 = "Network error : "
                android.util.Log.e(r2, r3, r7)     // Catch:{ all -> 0x014e }
                com.seattleclouds.modules.loginregister.f r7 = com.seattleclouds.modules.loginregister.C5810f.this     // Catch:{ all -> 0x014e }
                int r2 = com.seattleclouds.C5451m.C5462k.common_network_error     // Catch:{ all -> 0x014e }
                java.lang.String r7 = r7.mo1219a(r2)     // Catch:{ all -> 0x014e }
                if (r0 == 0) goto L_0x014a
                r0.disconnect()
            L_0x014a:
                org.apache.commons.p198io.C6732d.m32485a(r1)
                return r7
            L_0x014e:
                r7 = move-exception
            L_0x014f:
                if (r0 == 0) goto L_0x0154
                r0.disconnect()
            L_0x0154:
                org.apache.commons.p198io.C6732d.m32485a(r1)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.loginregister.C5810f.C5813a.doInBackground(java.util.HashMap[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            Toast.makeText(C5810f.this.mo1318s(), str, 0).show();
            if (this.f20602b) {
                App.m25625a((Fragment) C5810f.this);
            }
        }
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2 = bundle;
        super.mo1217a(layoutInflater, viewGroup, bundle);
        if (bundle2 != null) {
            this.f20586b = bundle2.getInt("BACKGROUND_IMG_HEIGHT");
        }
        View inflate = layoutInflater.inflate(C5460i.login_register_register_fragment, viewGroup, false);
        final View findViewById = inflate.findViewById(C5458g.login_register_register_img);
        final View findViewById2 = inflate.findViewById(C5458g.login_register_register_scroll_view);
        final View findViewById3 = inflate.findViewById(C5458g.login_register_register_linear_layout);
        EditText editText = (EditText) inflate.findViewById(C5458g.login_register_register_first_name);
        EditText editText2 = (EditText) inflate.findViewById(C5458g.login_register_register_last_name);
        EditText editText3 = (EditText) inflate.findViewById(C5458g.login_register_register_email);
        EditText editText4 = (EditText) inflate.findViewById(C5458g.login_register_register_password);
        EditText editText5 = (EditText) inflate.findViewById(C5458g.login_register_register_confirm_password);
        EditText editText6 = (EditText) inflate.findViewById(C5458g.login_register_register_date_of_birth);
        EditText editText7 = (EditText) inflate.findViewById(C5458g.login_register_register_phone_number);
        EditText editText8 = (EditText) inflate.findViewById(C5458g.login_register_register_loyalty_id);
        Button button = (Button) inflate.findViewById(C5458g.login_register_register_button);
        if (this.f20585a != null) {
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                public void onGlobalLayout() {
                    if (VERSION.SDK_INT < 16) {
                        findViewById3.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    } else {
                        findViewById3.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                    C5810f.this.f20586b = C6600as.m31943a(C5810f.this.mo1316q(), findViewById, findViewById2, findViewById3, C5810f.this.f20586b);
                }
            });
            C6593am.m31914a(findViewById, this.f20585a);
            C6593am.m31915a((TextView) editText, this.f20585a);
            C6593am.m31915a((TextView) editText2, this.f20585a);
            C6593am.m31915a((TextView) editText3, this.f20585a);
            C6593am.m31915a((TextView) editText4, this.f20585a);
            C6593am.m31915a((TextView) editText5, this.f20585a);
            C6593am.m31915a((TextView) editText6, this.f20585a);
            C6593am.m31915a((TextView) editText7, this.f20585a);
            C6593am.m31915a((TextView) editText8, this.f20585a);
            C6593am.m31915a((TextView) button, this.f20585a);
        }
        C5798c Q = App.f18501c.mo16915Q();
        if (Q.mo18497b().equals("disabled")) {
            editText.setVisibility(8);
        }
        if (Q.mo18499c().equals("disabled")) {
            editText2.setVisibility(8);
        }
        if (Q.mo18501d().equals("disabled")) {
            editText6.setVisibility(8);
        }
        if (Q.mo18503e().equals("disabled")) {
            editText7.setVisibility(8);
        }
        if (Q.mo18505f().equals("disabled")) {
            editText8.setVisibility(8);
        }
        editText4.setTypeface(Typeface.DEFAULT);
        editText5.setTypeface(Typeface.DEFAULT);
        final EditText editText9 = editText;
        final EditText editText10 = editText2;
        final EditText editText11 = editText3;
        final EditText editText12 = editText4;
        final EditText editText13 = editText5;
        final EditText editText14 = editText6;
        final EditText editText15 = editText7;
        final EditText editText16 = editText8;
        final C5798c cVar = Q;
        C58122 r0 = new OnClickListener() {
            public void onClick(View view) {
                String trim = editText9.getText().toString().trim();
                String trim2 = editText10.getText().toString().trim();
                String trim3 = editText11.getText().toString().trim();
                String trim4 = editText12.getText().toString().trim();
                String trim5 = editText13.getText().toString().trim();
                String trim6 = editText14.getText().toString().trim();
                String trim7 = editText15.getText().toString().trim();
                String trim8 = editText16.getText().toString().trim();
                HashMap hashMap = new HashMap();
                if (!cVar.mo18497b().equals("required") || !C6592al.m31910c(trim)) {
                    if (!C6592al.m31910c(trim)) {
                        hashMap.put("name", trim);
                    }
                    if (!cVar.mo18499c().equals("required") || !C6592al.m31910c(trim2)) {
                        if (!C6592al.m31910c(trim2)) {
                            hashMap.put("surname", trim2);
                        }
                        if (C6592al.m31910c(trim3)) {
                            Toast.makeText(C5810f.this.mo1318s(), C5810f.this.mo1316q().getString(C5462k.login_register_register_email_required), 0).show();
                            return;
                        }
                        if (!C6592al.m31910c(trim3)) {
                            hashMap.put("email", trim3);
                        }
                        if (C6592al.m31910c(trim4)) {
                            Toast.makeText(C5810f.this.mo1318s(), C5810f.this.mo1316q().getString(C5462k.login_register_register_password_required), 0).show();
                            return;
                        }
                        if (!C6592al.m31910c(trim4)) {
                            hashMap.put("passwordnew", C5814g.m28631a(trim4));
                        }
                        if (C6592al.m31910c(trim5)) {
                            Toast.makeText(C5810f.this.mo1318s(), C5810f.this.mo1316q().getString(C5462k.login_register_register_confirm_password_required), 0).show();
                        } else if (!cVar.mo18501d().equals("required") || !C6592al.m31910c(trim6)) {
                            if (!C6592al.m31910c(trim6)) {
                                hashMap.put("dob", trim6);
                            }
                            if (!cVar.mo18503e().equals("required") || !C6592al.m31910c(trim7)) {
                                if (!C6592al.m31910c(trim7)) {
                                    hashMap.put("phone", trim7);
                                }
                                if (!cVar.mo18505f().equals("required") || !C6592al.m31910c(trim8)) {
                                    if (!C6592al.m31910c(trim8)) {
                                        hashMap.put("loyaltyid", trim8);
                                    }
                                    if (!Patterns.EMAIL_ADDRESS.matcher(trim3).matches()) {
                                        Toast.makeText(C5810f.this.mo1318s(), C5462k.login_register_register_email_address_invalid, 0).show();
                                    } else if (!trim4.equals(trim5)) {
                                        Toast.makeText(C5810f.this.mo1318s(), C5462k.login_register_register_passwords_dont_match, 0).show();
                                    } else {
                                        new C5813a().execute(new HashMap[]{hashMap});
                                    }
                                } else {
                                    Toast.makeText(C5810f.this.mo1318s(), C5810f.this.mo1316q().getString(C5462k.login_register_register_loyalty_id_required), 0).show();
                                }
                            } else {
                                Toast.makeText(C5810f.this.mo1318s(), C5810f.this.mo1316q().getString(C5462k.login_register_register_phone_number_required), 0).show();
                            }
                        } else {
                            Toast.makeText(C5810f.this.mo1318s(), C5810f.this.mo1316q().getString(C5462k.login_register_register_date_of_birth_required), 0).show();
                        }
                    } else {
                        Toast.makeText(C5810f.this.mo1318s(), C5810f.this.mo1316q().getString(C5462k.login_register_register_last_name_required), 0).show();
                    }
                } else {
                    Toast.makeText(C5810f.this.mo1318s(), C5810f.this.mo1316q().getString(C5462k.login_register_register_first_name_required), 0).show();
                }
            }
        };
        button.setOnClickListener(r0);
        return inflate;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        mo20294d(C5462k.login_register_register_title);
        Bundle m = mo1307m();
        if (m != null) {
            this.f20585a = m.getBundle("LOGIN_REGISTER_PAGE_STYLE");
        }
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        if (this.f20586b != -1) {
            bundle.putInt("BACKGROUND_IMG_HEIGHT", this.f20586b);
        }
        super.mo1282e(bundle);
    }
}
