package com.seattleclouds.previewer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.Fragment;
import android.text.Html;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import com.google.android.gms.auth.C2961a;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.C3012a;
import com.google.android.gms.common.C3177d;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6555r;
import com.seattleclouds.api.C5268b;
import com.seattleclouds.api.C5270d;
import com.seattleclouds.api.HttpResponseException;
import com.seattleclouds.api.SCApiException;
import com.seattleclouds.p160e.C5334b;
import com.seattleclouds.util.C6578ag.C6582a;
import com.seattleclouds.util.C6578ag.C6584c;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6594an;
import com.seattleclouds.util.C6613i;
import com.seattleclouds.util.HTTPUtil;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.seattleclouds.previewer.g */
public class C6491g extends C6555r implements C6361a {

    /* renamed from: a */
    private static final String f23032a = App.f18516r;

    /* renamed from: b */
    private static final String f23033b = C5268b.m26280b(f23032a);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final String f23034c;

    /* renamed from: ae */
    private TextView f23035ae;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public ProgressBar f23036af;

    /* renamed from: ag */
    private C6503d f23037ag;

    /* renamed from: d */
    private String f23038d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public View f23039e;

    /* renamed from: f */
    private EditText f23040f;

    /* renamed from: g */
    private EditText f23041g;

    /* renamed from: h */
    private Button f23042h;

    /* renamed from: i */
    private TextView f23043i;

    /* renamed from: com.seattleclouds.previewer.g$a */
    private static class C6500a extends C5270d<String, Void, String> {

        /* renamed from: a */
        private final C6361a f23054a;

        C6500a(Fragment fragment, C6361a aVar) {
            super(fragment);
            this.f23054a = aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo17335a(String... strArr) {
            boolean z = false;
            String str = strArr[0];
            String str2 = strArr[1];
            try {
                App.f18523y = C5268b.m26272a().mo17299a(str, str2).getString("username");
                App.f18469B = str2;
                App.f18473F = true;
                App.f18484Q = "";
                App.f18485R = false;
                if (C5268b.m26272a().mo17320e()) {
                    App.f18484Q = App.f18523y;
                    App.f18485R = true;
                }
                ((App) App.m25647e()).mo16844d();
                return "ok";
            } catch (SCApiException e) {
                try {
                    if (e.getErrorCode() == 403) {
                        z = true;
                    }
                } catch (JSONException e2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("JSON parsing exception: ");
                    sb.append(e2.toString());
                    Log.e("PreviewerLoginFragment", sb.toString());
                }
                if (z) {
                    this.f23054a.mo19813c_(C5462k.previewer_login_auth_error);
                    return null;
                }
                throw e;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            if (str != null) {
                this.f23054a.mo19808a();
            }
            if (!App.f18473F) {
                this.f23054a.mo19812a_(false);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
            this.f23054a.mo19812a_(true);
        }
    }

    /* renamed from: com.seattleclouds.previewer.g$b */
    private static class C6501b extends AsyncTask<C6582a, Void, String> {

        /* renamed from: a */
        private final C6361a f23055a;

        /* renamed from: b */
        private String f23056b;

        /* renamed from: c */
        private String f23057c;

        C6501b(C6361a aVar) {
            this.f23055a = aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(C6582a... aVarArr) {
            StringBuilder sb;
            String str;
            String str2;
            String str3 = null;
            try {
                C6582a aVar = aVarArr[0];
                HashMap hashMap = new HashMap();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unknown.email.");
                sb2.append(aVar.mo20558a());
                sb2.append("@facebook.com");
                String sb3 = sb2.toString();
                if (!C6592al.m31910c(aVar.mo20559b())) {
                    sb3 = aVar.mo20559b();
                }
                hashMap.put("id", aVar.mo20558a());
                hashMap.put("email", sb3);
                hashMap.put("first_name", aVar.mo20562e());
                hashMap.put("last_name", aVar.mo20561d());
                String str4 = "male";
                if (!C6592al.m31910c(aVar.mo20564g())) {
                    str4 = aVar.mo20564g();
                }
                hashMap.put("gender", str4);
                hashMap.put("publisherId", App.f18522x);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(C6491g.f23034c);
                sb4.append("fbmobauth.ashx");
                JSONObject jSONObject = new JSONObject(HTTPUtil.m31768b(sb4.toString(), hashMap));
                if (jSONObject.getString("resp").equals("success")) {
                    str2 = "OK";
                    try {
                        this.f23056b = jSONObject.getString("username");
                        this.f23057c = jSONObject.getString("password");
                    } catch (MalformedURLException e) {
                        str3 = str2;
                        e = e;
                    } catch (IOException e2) {
                        str3 = str2;
                        e = e2;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Error performing auth with Facebook request: ");
                        sb5.append(e);
                        Log.w("PreviewerLoginFragment", sb5.toString(), e);
                        this.f23055a.mo19810a(C6491g.m31431aG());
                        return str3;
                    } catch (JSONException e3) {
                        str3 = str2;
                        e = e3;
                        str = "PreviewerLoginFragment";
                        sb = new StringBuilder();
                        sb.append("Error performing auth with Facebook request: ");
                        sb.append(e);
                        Log.w(str, sb.toString(), e);
                        this.f23055a.mo19813c_(C5462k.common_internal_server_error);
                        return str3;
                    }
                } else {
                    this.f23055a.mo19810a(jSONObject.getString("error"));
                    str2 = null;
                }
                return str2;
            } catch (MalformedURLException e4) {
                e = e4;
                str = "PreviewerLoginFragment";
                sb = new StringBuilder();
                sb.append("Error performing auth with Facebook request: ");
                sb.append(e);
                Log.w(str, sb.toString(), e);
                this.f23055a.mo19813c_(C5462k.common_internal_server_error);
                return str3;
            } catch (IOException e5) {
                e = e5;
                StringBuilder sb52 = new StringBuilder();
                sb52.append("Error performing auth with Facebook request: ");
                sb52.append(e);
                Log.w("PreviewerLoginFragment", sb52.toString(), e);
                this.f23055a.mo19810a(C6491g.m31431aG());
                return str3;
            } catch (JSONException e6) {
                e = e6;
                str = "PreviewerLoginFragment";
                sb = new StringBuilder();
                sb.append("Error performing auth with Facebook request: ");
                sb.append(e);
                Log.w(str, sb.toString(), e);
                this.f23055a.mo19813c_(C5462k.common_internal_server_error);
                return str3;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            if ("OK".equals(str)) {
                this.f23055a.mo19811a(this.f23056b, this.f23057c);
            } else {
                this.f23055a.mo19812a_(false);
            }
        }
    }

    /* renamed from: com.seattleclouds.previewer.g$c */
    private static class C6502c extends AsyncTask<Void, Void, String> {

        /* renamed from: a */
        private final String f23058a;

        /* renamed from: b */
        private String f23059b;

        /* renamed from: c */
        private String f23060c;

        /* renamed from: d */
        private JSONObject f23061d = null;

        /* renamed from: e */
        private final C6361a f23062e;

        C6502c(String str, C6361a aVar) {
            this.f23058a = str;
            this.f23062e = aVar;
        }

        /* renamed from: b */
        private JSONObject m31455b(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("https://www.googleapis.com/oauth2/v1/userinfo?access_token=");
            sb.append(str);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb.toString()).openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                return new JSONObject(C6613i.m31991b(httpURLConnection.getInputStream()));
            }
            if (responseCode == 401) {
                try {
                    C2961a.m13841a(App.m25647e(), str);
                } catch (GoogleAuthException e) {
                    Log.e("PreviewerLoginFragment", e.getMessage());
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Server returned error: ");
            sb2.append(responseCode);
            throw new HttpResponseException(responseCode, sb2.toString());
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0123  */
        /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.Void... r6) {
            /*
                r5 = this;
                r6 = 0
                android.content.Context r0 = com.seattleclouds.App.m25647e()     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                android.accounts.Account r1 = new android.accounts.Account     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                java.lang.String r2 = r5.f23058a     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                java.lang.String r3 = "com.google"
                r1.<init>(r2, r3)     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                java.lang.String r2 = "oauth2:https://www.googleapis.com/auth/userinfo.profile"
                java.lang.String r0 = com.google.android.gms.auth.C2961a.m13840a(r0, r1, r2)     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                org.json.JSONObject r0 = r5.m31455b(r0)     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                r5.f23061d = r0     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                java.util.HashMap r0 = new java.util.HashMap     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                r0.<init>()     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                java.lang.String r1 = "id"
                org.json.JSONObject r2 = r5.f23061d     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                java.lang.String r3 = "id"
                java.lang.String r2 = r2.getString(r3)     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                r0.put(r1, r2)     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                java.lang.String r1 = "email"
                java.lang.String r2 = r5.f23058a     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                r0.put(r1, r2)     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                java.lang.String r1 = "publisherId"
                java.lang.String r2 = com.seattleclouds.App.f18522x     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                r0.put(r1, r2)     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                org.json.JSONObject r1 = r5.f23061d     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                java.lang.String r2 = "given_name"
                boolean r1 = r1.has(r2)     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                if (r1 == 0) goto L_0x0051
                java.lang.String r1 = "given_name"
                org.json.JSONObject r2 = r5.f23061d     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                java.lang.String r3 = "given_name"
                java.lang.String r2 = r2.getString(r3)     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                r0.put(r1, r2)     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
            L_0x0051:
                org.json.JSONObject r1 = r5.f23061d     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                java.lang.String r2 = "family_name"
                boolean r1 = r1.has(r2)     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                if (r1 == 0) goto L_0x0068
                java.lang.String r1 = "family_name"
                org.json.JSONObject r2 = r5.f23061d     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                java.lang.String r3 = "family_name"
                java.lang.String r2 = r2.getString(r3)     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                r0.put(r1, r2)     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
            L_0x0068:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                r1.<init>()     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                java.lang.String r2 = com.seattleclouds.previewer.C6491g.f23034c     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                r1.append(r2)     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                java.lang.String r2 = "googlemobauth.ashx"
                r1.append(r2)     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                java.lang.String r1 = r1.toString()     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                java.lang.String r0 = com.seattleclouds.util.HTTPUtil.m31768b(r1, r0)     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                r1.<init>(r0)     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                java.lang.String r0 = "resp"
                java.lang.String r0 = r1.getString(r0)     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                java.lang.String r2 = "success"
                boolean r0 = r0.equals(r2)     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                if (r0 == 0) goto L_0x00c3
                java.lang.String r0 = "OK"
                java.lang.String r6 = "username"
                java.lang.String r6 = r1.getString(r6)     // Catch:{ GooglePlayServicesAvailabilityException -> 0x00bd, UserRecoverableAuthException -> 0x00b7, GoogleAuthException -> 0x00b2, IOException -> 0x00b0, JSONException -> 0x00ab, HttpResponseException -> 0x00a9 }
                r5.f23059b = r6     // Catch:{ GooglePlayServicesAvailabilityException -> 0x00bd, UserRecoverableAuthException -> 0x00b7, GoogleAuthException -> 0x00b2, IOException -> 0x00b0, JSONException -> 0x00ab, HttpResponseException -> 0x00a9 }
                java.lang.String r6 = "password"
                java.lang.String r6 = r1.getString(r6)     // Catch:{ GooglePlayServicesAvailabilityException -> 0x00bd, UserRecoverableAuthException -> 0x00b7, GoogleAuthException -> 0x00b2, IOException -> 0x00b0, JSONException -> 0x00ab, HttpResponseException -> 0x00a9 }
                r5.f23060c = r6     // Catch:{ GooglePlayServicesAvailabilityException -> 0x00bd, UserRecoverableAuthException -> 0x00b7, GoogleAuthException -> 0x00b2, IOException -> 0x00b0, JSONException -> 0x00ab, HttpResponseException -> 0x00a9 }
                r6 = r0
                goto L_0x0155
            L_0x00a9:
                r6 = r0
                goto L_0x00d4
            L_0x00ab:
                r6 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x00da
            L_0x00b0:
                r6 = r0
                goto L_0x00fa
            L_0x00b2:
                r6 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x0105
            L_0x00b7:
                r6 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x013f
            L_0x00bd:
                r6 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x014c
            L_0x00c3:
                com.seattleclouds.previewer.a r0 = r5.f23062e     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                if (r0 == 0) goto L_0x0155
                com.seattleclouds.previewer.a r0 = r5.f23062e     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                java.lang.String r2 = "error"
                java.lang.String r1 = r1.getString(r2)     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                r0.mo19810a(r1)     // Catch:{ GooglePlayServicesAvailabilityException -> 0x014b, UserRecoverableAuthException -> 0x013e, GoogleAuthException -> 0x0104, IOException -> 0x00fa, JSONException -> 0x00d9, HttpResponseException -> 0x00d4 }
                goto L_0x0155
            L_0x00d4:
                com.seattleclouds.previewer.a r0 = r5.f23062e
                int r1 = com.seattleclouds.C5451m.C5462k.previewer_login_google_auth_error
                goto L_0x00f6
            L_0x00d9:
                r0 = move-exception
            L_0x00da:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Bad response: "
                r1.append(r2)
                java.lang.String r2 = r0.getMessage()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.util.Log.w(r1, r0)
                com.seattleclouds.previewer.a r0 = r5.f23062e
                int r1 = com.seattleclouds.C5451m.C5462k.common_internal_server_error
            L_0x00f6:
                r0.mo19813c_(r1)
                goto L_0x0155
            L_0x00fa:
                com.seattleclouds.previewer.a r0 = r5.f23062e
                java.lang.String r1 = com.seattleclouds.previewer.C6491g.m31431aG()
                r0.mo19810a(r1)
                goto L_0x0155
            L_0x0104:
                r0 = move-exception
            L_0x0105:
                java.lang.String r1 = "PreviewerLoginFragment"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Google Auth unrecoverable error: "
                r2.append(r3)
                java.lang.String r3 = r0.getMessage()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                android.util.Log.w(r1, r2, r0)
                com.seattleclouds.previewer.a r1 = r5.f23062e
                if (r1 == 0) goto L_0x0155
                com.seattleclouds.previewer.a r1 = r5.f23062e
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Unrecoverable error: "
                r2.append(r3)
                java.lang.String r0 = r0.getMessage()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.mo19810a(r0)
                goto L_0x0155
            L_0x013e:
                r0 = move-exception
            L_0x013f:
                com.seattleclouds.previewer.a r1 = r5.f23062e
                android.content.Intent r0 = r0.getIntent()
                r2 = 1001(0x3e9, float:1.403E-42)
                r1.mo19809a(r0, r2)
                goto L_0x0155
            L_0x014b:
                r0 = move-exception
            L_0x014c:
                com.seattleclouds.previewer.a r1 = r5.f23062e
                int r0 = r0.getConnectionStatusCode()
                r1.mo19814d_(r0)
            L_0x0155:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.previewer.C6491g.C6502c.doInBackground(java.lang.Void[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            if ("OK".equals(str)) {
                this.f23062e.mo19811a(this.f23059b, this.f23060c);
            } else {
                this.f23062e.mo19812a_(false);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
            if (this.f23062e != null) {
                this.f23062e.mo19812a_(true);
            }
        }
    }

    /* renamed from: com.seattleclouds.previewer.g$d */
    interface C6503d {
        /* renamed from: q */
        void mo16887q();
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(f23033b);
        sb.append("://");
        sb.append(f23032a);
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        f23034c = sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: aB */
    public void m31426aB() {
        C0367h s;
        int i;
        String trim = this.f23040f.getText().toString().trim();
        String trim2 = this.f23041g.getText().toString().trim();
        if (C6592al.m31910c(trim)) {
            s = mo1318s();
            i = C5462k.previewer_login_invalid_username;
        } else if (C6592al.m31910c(trim2)) {
            s = mo1318s();
            i = C5462k.previewer_login_invalid_password;
        } else {
            new C6500a(this, this).execute(new String[]{trim, trim2});
            return;
        }
        Toast.makeText(s, i, 0).show();
    }

    /* renamed from: aC */
    private void m31427aC() {
        C0367h s = mo1318s();
        if (s != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) s.getSystemService("input_method");
            View currentFocus = s.getCurrentFocus();
            if (currentFocus != null && inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aD */
    public void m31428aD() {
        if (this.f23038d == null) {
            m31429aE();
        } else {
            m31430aF();
        }
    }

    /* renamed from: aE */
    private void m31429aE() {
        startActivityForResult(C3012a.m13982a(null, null, new String[]{"com.google"}, true, null, null, null, null), 1002);
    }

    /* renamed from: aF */
    private void m31430aF() {
        new C6502c(this.f23038d, this).execute(new Void[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: aG */
    public static String m31431aG() {
        Context e;
        int i;
        ConnectivityManager connectivityManager = (ConnectivityManager) App.m25647e().getSystemService("connectivity");
        if (connectivityManager == null || connectivityManager.getActiveNetworkInfo() == null || !connectivityManager.getActiveNetworkInfo().isConnected()) {
            e = App.m25647e();
            i = C5462k.common_no_network;
        } else {
            e = App.m25647e();
            i = C5462k.common_network_error;
        }
        return e.getString(i);
    }

    /* renamed from: m */
    private void m31436m(boolean z) {
        this.f23042h.setEnabled(z);
        this.f23043i.setClickable(z);
        this.f23035ae.setClickable(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public boolean m31437n(boolean z) {
        if (mo1318s() == null) {
            return false;
        }
        C3177d a = C3177d.m14629a();
        int a2 = a.mo11106a((Context) mo1318s());
        if (!a.mo11114a(a2)) {
            return true;
        }
        if (z) {
            a.mo11107a((Activity) mo1318s(), a2, 1001).show();
        }
        return false;
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5460i.fragment_previewer_login, viewGroup, false);
        this.f23039e = inflate.findViewById(C5458g.form_container);
        this.f23040f = (EditText) inflate.findViewById(C5458g.username);
        this.f23041g = (EditText) inflate.findViewById(C5458g.password);
        this.f23042h = (Button) inflate.findViewById(C5458g.login_button);
        this.f23036af = (ProgressBar) inflate.findViewById(C5458g.progress_bar);
        this.f23043i = (TextView) inflate.findViewById(C5458g.facebook_login_button);
        this.f23035ae = (TextView) inflate.findViewById(C5458g.google_login_button);
        this.f23040f.setText(App.f18523y);
        this.f23041g.setText(App.f18469B);
        this.f23041g.setTypeface(Typeface.DEFAULT);
        this.f23041g.setTransformationMethod(new PasswordTransformationMethod());
        this.f23041g.setOnEditorActionListener(new OnEditorActionListener() {
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                C6491g.this.m31426aB();
                return true;
            }
        });
        int a = mo1318s() != null ? C6594an.m31917a(mo1318s(), 16842808) : 0;
        C5334b.m26764a((TextView) this.f23040f, a);
        C5334b.m26764a((TextView) this.f23041g, a);
        this.f23042h.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C6491g.this.m31426aB();
            }
        });
        if ((App.f18513o || App.f18514p) && !App.m25641c((Context) mo1318s())) {
            if (App.f18514p) {
                this.f23043i.setOnClickListener(new OnClickListener() {
                    public void onClick(View view) {
                        C6491g.this.mo1450b();
                    }
                });
            } else {
                this.f23043i.setVisibility(8);
            }
            if (!m31437n(false) || !App.f18513o) {
                this.f23035ae.setVisibility(8);
            } else {
                this.f23035ae.setOnClickListener(new OnClickListener() {
                    public void onClick(View view) {
                        if (C6491g.this.m31437n(true)) {
                            C6491g.this.m31428aD();
                        }
                    }
                });
            }
            int a2 = C6594an.m31917a(mo1318s(), 16842808);
            C5334b.m26764a(this.f23035ae, a2);
            C5334b.m26764a(this.f23043i, a2);
        } else {
            inflate.findViewById(C5458g.social_login_container).setVisibility(4);
        }
        Button button = (Button) inflate.findViewById(C5458g.forgot_password);
        button.setText(Html.fromHtml(mo1320t().getString(C5462k.previewer_forgot_password_button)));
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C6491g.this.mo1230a(PreviewerOneFragmentActivity.m30890b(C6491g.this.mo1318s(), C6479e.class, true));
            }
        });
        return inflate;
    }

    /* renamed from: a */
    public void mo19808a() {
        if (this.f23037ag != null) {
            this.f23037ag.mo16887q();
        }
    }

    /* renamed from: a */
    public void mo1222a(int i, int i2, Intent intent) {
        super.mo1222a(i, i2, intent);
        switch (i) {
            case 1001:
                if (i2 == -1) {
                    m31428aD();
                    return;
                } else {
                    m31437n(true);
                    return;
                }
            case 1002:
                if (i2 == -1 && intent != null && intent.getExtras() != null) {
                    String stringExtra = intent.getStringExtra("authAccount");
                    if (stringExtra != null) {
                        this.f23038d = stringExtra;
                        break;
                    }
                } else {
                    return;
                }
                break;
            case 1003:
                if (i2 != -1) {
                    m31429aE();
                    return;
                }
                break;
            default:
                return;
        }
        m31430aF();
    }

    /* renamed from: a */
    public void mo1228a(Context context) {
        super.mo1228a(context);
        try {
            this.f23037ag = (C6503d) context;
            if (context instanceof Activity) {
                ((Activity) context).getWindow().setSoftInputMode(32);
            }
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.toString());
            sb.append(" must implement OnLoginListener");
            throw new ClassCastException(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo19809a(Intent intent, int i) {
        if (mo1318s() != null) {
            mo1318s().startActivityForResult(intent, i);
        }
    }

    /* renamed from: a */
    public void mo17562a(C6582a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("onSuccess: ");
        sb.append(aVar.toString());
        Log.d("PreviewerLoginFragment", sb.toString());
        mo19812a_(true);
        new C6501b(this).execute(new C6582a[]{aVar});
    }

    /* renamed from: a */
    public void mo17563a(C6584c cVar) {
        mo19812a_(false);
        super.mo17563a(cVar);
    }

    /* renamed from: a */
    public void mo19810a(final String str) {
        if (mo1318s() != null) {
            mo1318s().runOnUiThread(new Runnable() {
                public void run() {
                    if (C6491g.this.mo1318s() != null) {
                        Toast.makeText(C6491g.this.mo1318s(), str, 1).show();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo19811a(String str, String str2) {
        new C6500a(this, this).execute(new String[]{str, str2});
    }

    /* renamed from: a_ */
    public void mo19812a_(boolean z) {
        m31436m(!z);
        if (z) {
            m31427aC();
            this.f23036af.setVisibility(0);
            this.f23039e.setVisibility(8);
            return;
        }
        new Handler().postDelayed(new Runnable() {
            public void run() {
                if (C6491g.this.f23036af != null && C6491g.this.f23036af.getVisibility() == 0) {
                    C6491g.this.f23036af.setVisibility(8);
                    C6491g.this.f23039e.setVisibility(0);
                }
            }
        }, 700);
    }

    /* renamed from: c_ */
    public void mo19813c_(int i) {
        C0367h s = mo1318s();
        if (s != null) {
            mo19810a(s.getString(i));
        }
    }

    /* renamed from: d_ */
    public void mo19814d_(final int i) {
        if (mo1318s() != null) {
            mo1318s().runOnUiThread(new Runnable() {
                public void run() {
                    if (C6491g.this.mo1318s() != null) {
                        C3177d.m14629a().mo11107a((Activity) C6491g.this.mo1318s(), i, 1001).show();
                    }
                }
            });
        }
    }
}
