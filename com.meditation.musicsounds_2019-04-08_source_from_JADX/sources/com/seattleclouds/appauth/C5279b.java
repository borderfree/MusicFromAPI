package com.seattleclouds.appauth;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import com.android.vending.billing.util.Base64DecoderException;
import com.android.vending.billing.util.C1148a;
import com.google.android.bitmapfun.AsyncTask;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.api.C5268b;
import com.seattleclouds.api.HttpResponseException;
import com.seattleclouds.api.SCApiException;
import com.seattleclouds.util.C6577af;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6618l;
import com.seattleclouds.util.C6619m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.appauth.b */
public class C5279b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f18908a = "b";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static C5284d f18909b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static C5287g f18910c;

    /* renamed from: d */
    private static List<C5285e> f18911d;

    /* renamed from: e */
    private static List<C5286f> f18912e;

    /* renamed from: com.seattleclouds.appauth.b$a */
    private static abstract class C5281a extends AsyncTask<Void, Void, C5282b> {

        /* renamed from: d */
        protected String f18913d;

        /* renamed from: e */
        protected String f18914e;

        /* renamed from: f */
        protected String f18915f;

        /* renamed from: g */
        protected String f18916g;

        /* renamed from: h */
        protected char[] f18917h;

        /* renamed from: i */
        protected String f18918i;

        /* renamed from: j */
        protected String f18919j;

        private C5281a(String str, char[] cArr) {
            this.f18913d = App.f18522x;
            this.f18914e = App.f18523y;
            this.f18915f = App.f18524z;
            this.f18916g = str;
            this.f18917h = cArr;
            this.f18918i = C6618l.m32012a();
            this.f18919j = Locale.getDefault().toString();
        }

        /* renamed from: a */
        private C5282b m26399a(Exception exc) {
            if (exc instanceof IOException) {
                if (!C6619m.m32026h(App.m25647e())) {
                    return C5282b.m26417b(C5462k.common_no_network, new Object[0]);
                }
                Log.e(C5279b.f18908a, "Exception while sending request", exc);
                return C5282b.m26417b(C5462k.common_network_error, new Object[0]);
            } else if (exc instanceof JSONException) {
                Log.e(C5279b.f18908a, "Exception while sending request", exc);
                return C5282b.m26417b(C5462k.common_internal_server_error_with_message, exc.getMessage());
            } else if (exc instanceof HttpResponseException) {
                int statusCode = ((HttpResponseException) exc).getStatusCode();
                String i = C5279b.f18908a;
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP exception while sending request, status: ");
                sb.append(statusCode);
                Log.e(i, sb.toString(), exc);
                int i2 = C5462k.common_internal_server_error_with_message;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(statusCode);
                sb2.append(": ");
                sb2.append(exc.getMessage());
                return C5282b.m26417b(i2, sb2.toString());
            } else if (exc instanceof SCApiException) {
                Log.e(C5279b.f18908a, "SCApi error", exc);
                try {
                    JSONObject details = ((SCApiException) exc).getDetails();
                    return mo17352a((SCApiException) exc, details.getInt("code"), details.getString("message"));
                } catch (JSONException e) {
                    Log.e(C5279b.f18908a, "JSON error while parsing SCApi error", e);
                    return C5282b.m26417b(C5462k.common_internal_server_error_with_message, e.getMessage());
                }
            } else {
                Log.e(C5279b.f18908a, "Exception while sending request", exc);
                return C5282b.m26417b(C5462k.common_error_with_message, exc.getMessage());
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C5282b mo17352a(SCApiException sCApiException, int i, String str) {
            Resources f;
            int i2;
            if (i == 400) {
                JSONArray jSONArray = sCApiException.getDetails().getJSONArray("errors");
                if (jSONArray == null) {
                    int i3 = C5462k.common_internal_server_error_with_message;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i);
                    sb.append(": ");
                    sb.append(str);
                    return C5282b.m26417b(i3, sb.toString());
                }
                int length = jSONArray.length();
                List list = null;
                String str2 = null;
                String str3 = null;
                boolean z = false;
                for (int i4 = 0; i4 < length; i4++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i4);
                    String string = jSONObject.getString("reason");
                    String[] split = string.split("\\.");
                    String string2 = jSONObject.getString("message");
                    if (!"invalidEmail".equals(split[0])) {
                        if ("invalidPsawsord".equals(split[0])) {
                            if (split.length >= 3 && "atLeast".equals(split[1])) {
                                string2 = App.m25651f().getString(C5462k.app_auth_error_password_too_short, new Object[]{split[2]});
                            } else if (split.length >= 2 && "empty".equals(split[1])) {
                                string2 = App.m25651f().getString(C5462k.app_auth_error_empty_password);
                            }
                            str3 = string2;
                        } else if ("accountAlreadyExists".equals(string)) {
                            f = App.m25651f();
                            i2 = C5462k.app_auth_error_account_already_exists;
                        } else if ("incorrectCredentials".equals(string)) {
                            str3 = App.m25651f().getString(C5462k.app_auth_error_incorrect_credentials);
                        } else {
                            list = mo17355a(list, string2);
                        }
                        z = true;
                    } else if (split.length >= 2 && "badFormat".equals(split[1])) {
                        f = App.m25651f();
                        i2 = C5462k.app_auth_error_invalid_email;
                    } else if (split.length < 2 || !"empty".equals(split[1])) {
                        str2 = string2;
                    } else {
                        f = App.m25651f();
                        i2 = C5462k.app_auth_error_empty_email;
                    }
                    str2 = f.getString(i2);
                }
                return C5282b.m26421b(mo17354a(list), str2, str3, z);
            } else if (i == 500) {
                return C5282b.m26418b(str);
            } else {
                int i5 = C5462k.common_internal_server_error_with_message;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i);
                sb2.append(": ");
                sb2.append(str);
                return C5282b.m26417b(i5, sb2.toString());
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C5282b mo8517a(Void... voidArr) {
            try {
                return mo17358d();
            } catch (Exception e) {
                return m26399a(e);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo17354a(List<String> list) {
            if (list == null) {
                return null;
            }
            int i = 0;
            if (list.size() == 1) {
                return (String) list.get(0);
            }
            StringBuilder sb = new StringBuilder();
            while (i < list.size()) {
                String str = (String) list.get(i);
                if (i > 0) {
                    sb.append(10);
                }
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(str);
                if (!str.endsWith(".")) {
                    sb.append('.');
                }
            }
            return sb.toString();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public List<String> mo17355a(List<String> list, String str) {
            if (C6592al.m31909b(str)) {
                return list;
            }
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(str);
            return list;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo8519a(C5282b bVar) {
            super.mo8519a(bVar);
            C5279b.m26371a(this.f18917h);
            if (bVar == null) {
                bVar = C5282b.m26416b();
            }
            mo17357b(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo8521b() {
            C5279b.m26371a(this.f18917h);
            mo17357b(C5282b.m26416b());
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo17357b(C5282b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public abstract C5282b mo17358d();
    }

    /* renamed from: com.seattleclouds.appauth.b$b */
    static class C5282b {

        /* renamed from: a */
        public boolean f18920a;

        /* renamed from: b */
        public boolean f18921b;

        /* renamed from: c */
        public String f18922c;

        /* renamed from: d */
        public long f18923d;

        /* renamed from: e */
        public String f18924e;

        /* renamed from: f */
        public boolean f18925f;

        /* renamed from: g */
        public String f18926g;

        /* renamed from: h */
        public String f18927h;

        C5282b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static C5282b m26416b() {
            C5282b bVar = new C5282b();
            bVar.f18920a = true;
            return bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static C5282b m26417b(int i, Object... objArr) {
            return m26418b(App.m25651f().getString(i, objArr));
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static C5282b m26418b(String str) {
            C5282b bVar = new C5282b();
            bVar.f18921b = false;
            bVar.f18924e = str;
            bVar.f18925f = false;
            return bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static C5282b m26419b(String str, long j) {
            C5282b bVar = new C5282b();
            bVar.f18921b = true;
            bVar.f18922c = str;
            bVar.f18923d = j;
            return bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static C5282b m26420b(String str, String str2) {
            C5282b bVar = new C5282b();
            bVar.f18921b = true;
            bVar.f18924e = str;
            bVar.f18922c = str2;
            return bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static C5282b m26421b(String str, String str2, String str3, boolean z) {
            C5282b bVar = new C5282b();
            bVar.f18921b = false;
            bVar.f18924e = str;
            bVar.f18926g = str2;
            bVar.f18927h = str3;
            bVar.f18925f = z;
            return bVar;
        }
    }

    /* renamed from: com.seattleclouds.appauth.b$c */
    private static class C5283c {

        /* renamed from: c */
        private static C5283c f18928c;

        /* renamed from: a */
        public String f18929a;

        /* renamed from: b */
        public boolean f18930b;

        /* renamed from: d */
        private String f18931d;

        /* renamed from: e */
        private String f18932e;

        /* renamed from: f */
        private SharedPreferences f18933f;

        /* renamed from: g */
        private long f18934g;

        private C5283c(String str, String str2) {
            this.f18931d = str;
            this.f18932e = str2;
            this.f18933f = App.m25647e().getSharedPreferences(String.format("%s.%s.%s", new Object[]{str, str2, "appPrefs"}), 0);
            m26425e();
        }

        /* renamed from: a */
        public static C5283c m26422a() {
            if (f18928c == null || !f18928c.mo17361b()) {
                f18928c = new C5283c(C6592al.m31911d(App.f18523y), C6592al.m31911d(App.f18524z));
            }
            return f18928c;
        }

        /* renamed from: a */
        private void m26423a(byte[] bArr, String str) {
            if (!C6592al.m31909b(str)) {
                byte[] bytes = str.getBytes();
                int length = bytes.length;
                int length2 = bArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length2) {
                    if (i2 == length) {
                        i2 = 0;
                    }
                    bArr[i] = (byte) (bArr[i] ^ bytes[i2]);
                    i++;
                    i2++;
                }
            }
        }

        /* renamed from: b */
        private String m26424b(String str) {
            return str == null ? "" : C1148a.m6246a(str.getBytes());
        }

        /* renamed from: e */
        private void m26425e() {
            this.f18929a = this.f18933f.getString("email", null);
            String string = this.f18933f.getString("state", null);
            this.f18930b = false;
            try {
                if (!C6592al.m31909b(string)) {
                    byte[] b = C1148a.m6253b(string.getBytes());
                    m26423a(b, C6618l.m32012a());
                    String[] split = new String(b).split("\\~");
                    if (split.length != 4) {
                        m26427g();
                        return;
                    }
                    String str = new String(C1148a.m6248a(split[0]));
                    long parseLong = Long.parseLong(new String(C1148a.m6248a(split[1])));
                    String str2 = new String(C1148a.m6248a(split[2]));
                    String str3 = new String(C1148a.m6248a(split[3]));
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("~");
                    sb.append(parseLong);
                    sb.append("~");
                    sb.append(str2);
                    sb.append("~");
                    sb.append("2");
                    if (!C6592al.m31912e(sb.toString()).equals(str3)) {
                        m26427g();
                    } else if (!str.equals(this.f18929a)) {
                        m26427g();
                    } else if (parseLong > System.currentTimeMillis() + 31536000000L) {
                        m26427g();
                    } else {
                        this.f18934g = parseLong;
                        this.f18930b = true;
                    }
                }
            } catch (Base64DecoderException | NumberFormatException | PatternSyntaxException unused) {
                m26427g();
            }
        }

        /* renamed from: f */
        private String m26426f() {
            if (!this.f18930b) {
                return "";
            }
            String hexString = Double.toHexString(Math.random());
            StringBuilder sb = new StringBuilder();
            sb.append(this.f18929a);
            sb.append("~");
            sb.append(this.f18934g);
            sb.append("~");
            sb.append(hexString);
            sb.append("~");
            sb.append("2");
            String e = C6592al.m31912e(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m26424b(this.f18929a));
            sb2.append("~");
            sb2.append(m26424b(String.valueOf(this.f18934g)));
            sb2.append("~");
            sb2.append(m26424b(hexString));
            sb2.append("~");
            sb2.append(m26424b(e));
            byte[] bytes = sb2.toString().getBytes();
            m26423a(bytes, C6618l.m32012a());
            return C1148a.m6246a(bytes);
        }

        /* renamed from: g */
        private void m26427g() {
            this.f18933f.edit().putString("email", this.f18929a).putString("state", m26426f()).apply();
        }

        /* renamed from: a */
        public void mo17359a(C5282b bVar) {
            if (bVar.f18921b && !C6592al.m31909b(bVar.f18922c) && System.currentTimeMillis() < bVar.f18923d) {
                this.f18929a = bVar.f18922c;
                this.f18934g = bVar.f18923d;
                this.f18930b = true;
                m26427g();
            }
        }

        /* renamed from: a */
        public void mo17360a(String str) {
            this.f18929a = str;
            this.f18930b = false;
            m26427g();
        }

        /* renamed from: b */
        public boolean mo17361b() {
            return this.f18931d.equals(C6592al.m31911d(App.f18523y)) && this.f18932e.equals(C6592al.m31911d(App.f18524z));
        }

        /* renamed from: c */
        public boolean mo17362c() {
            boolean z = false;
            if (!this.f18930b) {
                return false;
            }
            if (System.currentTimeMillis() < this.f18934g) {
                z = true;
            }
            return z;
        }

        /* renamed from: d */
        public void mo17363d() {
            this.f18934g = 0;
            this.f18930b = false;
            m26427g();
        }
    }

    /* renamed from: com.seattleclouds.appauth.b$d */
    private static class C5284d extends C5281a {
        public C5284d(String str, char[] cArr) {
            super(str, cArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo17357b(C5282b bVar) {
            if (bVar.f18921b) {
                C5279b.m26387d(bVar);
            }
            if (C5279b.f18909b == this) {
                C5279b.f18909b = null;
                C5279b.m26391e(bVar);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C5282b mo17358d() {
            JSONObject b = C5268b.m26272a().mo17312b(this.f18913d, this.f18914e, this.f18915f, this.f18916g, this.f18917h, this.f18918i, this.f18919j, "v2.0");
            if (mo8525c()) {
                return null;
            }
            long j = b.getLong("ttl");
            if (j > 0) {
                long j2 = j * 60000;
                long currentTimeMillis = System.currentTimeMillis();
                return C5282b.m26419b(this.f18916g, Math.min(j2 + currentTimeMillis, currentTimeMillis + 31536000000L));
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ttl is ");
            sb.append(j);
            throw new JSONException(sb.toString());
        }
    }

    /* renamed from: com.seattleclouds.appauth.b$e */
    interface C5285e {
        /* renamed from: a */
        void mo17364a(C5282b bVar);
    }

    /* renamed from: com.seattleclouds.appauth.b$f */
    interface C5286f {
        /* renamed from: a */
        void mo17365a(C5282b bVar);
    }

    /* renamed from: com.seattleclouds.appauth.b$g */
    private static class C5287g extends C5281a {
        public C5287g(String str, char[] cArr) {
            super(str, cArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo17357b(C5282b bVar) {
            if (bVar.f18921b && bVar.f18923d != 0) {
                C5279b.m26387d(bVar);
            } else if (bVar.f18921b && !C6592al.m31909b(bVar.f18922c)) {
                C5279b.m26379b(bVar.f18922c);
            }
            if (C5279b.f18910c == this) {
                C5279b.f18910c = null;
                C5279b.m26392f(bVar);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C5282b mo17358d() {
            JSONObject a = C5268b.m26272a().mo17306a(this.f18913d, this.f18914e, this.f18915f, this.f18916g, this.f18917h, this.f18918i, this.f18919j, "v2.0");
            if (mo8525c()) {
                return null;
            }
            long optLong = a.optLong("ttl", 0);
            if (optLong < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("ttl is ");
                sb.append(optLong);
                throw new JSONException(sb.toString());
            } else if (optLong == 0) {
                String optString = a.optString("reason", "");
                String optString2 = a.optString("message", null);
                if (optString.equals("registrationSucceed") || C6592al.m31909b(optString2)) {
                    optString2 = App.m25651f().getString(C5462k.app_auth_msg_register_request_succeed);
                }
                return C5282b.m26420b(optString2, this.f18916g);
            } else {
                long j = optLong * 60000;
                long currentTimeMillis = System.currentTimeMillis();
                return C5282b.m26419b(this.f18916g, Math.min(j + currentTimeMillis, currentTimeMillis + 31536000000L));
            }
        }
    }

    /* renamed from: a */
    public static void m26364a(Activity activity) {
        if (m26372a() && !m26385c()) {
            m26386d(activity);
        }
    }

    /* renamed from: a */
    public static void m26365a(Activity activity, boolean z) {
        if (m26372a() && !m26385c() && !AppAuthRegisterActivity.m26336m()) {
            Intent intent = new Intent(activity, AppAuthRegisterActivity.class);
            Bundle bundle = new Bundle();
            bundle.putBoolean("KeyNotificationMode", z);
            intent.putExtras(bundle);
            activity.startActivity(intent);
        }
    }

    /* renamed from: a */
    static void m26367a(C5285e eVar) {
        if (eVar == null) {
            C6577af.m31831a(new IllegalArgumentException("listener is null"));
            return;
        }
        if (f18911d == null) {
            f18911d = new ArrayList();
        } else if (f18911d.contains(eVar)) {
            return;
        }
        f18911d.add(eVar);
    }

    /* renamed from: a */
    static void m26368a(C5286f fVar) {
        if (f18912e == null) {
            f18912e = new ArrayList();
        } else if (f18912e.contains(fVar)) {
            return;
        }
        f18912e.add(fVar);
    }

    /* renamed from: a */
    static void m26370a(String str, char[] cArr) {
        if (f18909b != null) {
            C6577af.m31831a(new IllegalStateException("Previous request is still running"));
            f18909b.mo8520a(false);
        }
        f18909b = new C5284d(str, cArr);
        f18909b.mo8524c((Params[]) new Void[0]);
    }

    /* renamed from: a */
    public static void m26371a(char[] cArr) {
        if (cArr != null) {
            Arrays.fill(cArr, '*');
        }
    }

    /* renamed from: a */
    public static boolean m26372a() {
        return App.f18501c.mo16923Y();
    }

    /* renamed from: a */
    static boolean m26373a(Intent intent) {
        return m26381b() || m26382b(intent);
    }

    /* renamed from: b */
    public static void m26374b(Activity activity) {
        if (m26381b() && !m26385c()) {
            m26390e(activity);
        }
    }

    /* renamed from: b */
    public static void m26375b(Activity activity, boolean z) {
        C5283c.m26422a().mo17363d();
        if (z) {
            m26386d(activity);
        }
    }

    /* renamed from: b */
    static void m26377b(C5285e eVar) {
        if (f18911d != null) {
            f18911d.remove(eVar);
        }
    }

    /* renamed from: b */
    static void m26378b(C5286f fVar) {
        if (f18912e != null) {
            f18912e.remove(fVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m26379b(String str) {
        C5283c.m26422a().mo17360a(str);
    }

    /* renamed from: b */
    static void m26380b(String str, char[] cArr) {
        if (f18910c != null) {
            C6577af.m31831a(new IllegalStateException("Previous request is still running"));
            f18910c.mo8520a(false);
        }
        f18910c = new C5287g(str, cArr);
        f18910c.mo8524c((Params[]) new Void[0]);
    }

    /* renamed from: b */
    public static boolean m26381b() {
        return !App.f18501c.mo16923Y() && App.f18501c.mo16924Z();
    }

    /* renamed from: b */
    static boolean m26382b(Intent intent) {
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                return extras.getBoolean("KeyNotificationMode", false);
            }
        }
        return false;
    }

    /* renamed from: c */
    public static void m26383c(Activity activity) {
        m26375b(activity, true);
    }

    /* renamed from: c */
    public static boolean m26385c() {
        return C5283c.m26422a().mo17362c();
    }

    /* renamed from: d */
    private static void m26386d(Activity activity) {
        if (m26372a() && !AppAuthRegisterActivity.m26336m()) {
            activity.startActivity(new Intent(activity, AppAuthRegisterActivity.class));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m26387d(C5282b bVar) {
        C5283c.m26422a().mo17359a(bVar);
    }

    /* renamed from: d */
    public static boolean m26388d() {
        return true;
    }

    /* renamed from: e */
    public static String m26389e() {
        return C6592al.m31911d(C5283c.m26422a().f18929a);
    }

    /* renamed from: e */
    private static void m26390e(Activity activity) {
        if (m26381b() && !AppAuthRegisterActivity.m26336m()) {
            activity.startActivity(new Intent(activity, AppAuthRegisterActivity.class));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m26391e(C5282b bVar) {
        if (f18911d != null) {
            for (C5285e a : f18911d) {
                a.mo17364a(bVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static void m26392f(C5282b bVar) {
        if (f18912e != null) {
            for (C5286f a : f18912e) {
                a.mo17365a(bVar);
            }
        }
    }

    /* renamed from: f */
    static boolean m26393f() {
        return f18909b != null;
    }

    /* renamed from: g */
    static boolean m26394g() {
        return f18910c != null;
    }

    /* renamed from: h */
    static void m26395h() {
        if (f18909b != null) {
            C5284d dVar = f18909b;
            f18909b = null;
            dVar.mo8520a(true);
            m26391e(C5282b.m26416b());
        }
        if (f18910c != null) {
            C5287g gVar = f18910c;
            f18910c = null;
            gVar.mo8520a(true);
            m26392f(C5282b.m26416b());
        }
    }
}
