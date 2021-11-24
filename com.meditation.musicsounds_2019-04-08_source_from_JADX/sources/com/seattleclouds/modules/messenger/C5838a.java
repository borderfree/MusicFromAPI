package com.seattleclouds.modules.messenger;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.gms.auth.C2961a;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.GooglePlayServicesAvailabilityException;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.C3012a;
import com.google.android.gms.common.C3177d;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6555r;
import com.seattleclouds.api.C5268b;
import com.seattleclouds.api.C5270d;
import com.seattleclouds.util.C6578ag.C6582a;
import com.seattleclouds.util.C6578ag.C6584c;
import com.seattleclouds.util.C6600as;
import com.seattleclouds.util.C6613i;
import com.seattleclouds.util.C6620n;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.messenger.a */
public class C5838a extends C6555r {

    /* renamed from: a */
    private Button f20683a;

    /* renamed from: b */
    private String f20684b = null;

    /* renamed from: c */
    private Button f20685c;

    /* renamed from: d */
    private View f20686d;

    /* renamed from: e */
    private View f20687e;

    /* renamed from: f */
    private int f20688f;

    /* renamed from: com.seattleclouds.modules.messenger.a$a */
    private class C5843a extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        protected String f20695a;

        /* renamed from: b */
        protected String f20696b;

        /* renamed from: c */
        protected int f20697c;

        /* renamed from: e */
        private String f20699e = null;

        /* renamed from: f */
        private JSONObject f20700f = null;

        public C5843a(String str, String str2, int i) {
            this.f20695a = str2;
            this.f20696b = str;
            this.f20697c = i;
        }

        /* renamed from: a */
        private String m28742a() {
            C0367h s = C5838a.this.mo1318s();
            if (s == null) {
                return null;
            }
            try {
                return C2961a.m13840a(s, new Account(this.f20696b, "com.google"), this.f20695a);
            } catch (GooglePlayServicesAvailabilityException e) {
                C5838a.this.m28736e(e.getConnectionStatusCode());
                return null;
            } catch (UserRecoverableAuthException e2) {
                C5838a.this.startActivityForResult(e2.getIntent(), this.f20697c);
                return null;
            } catch (GoogleAuthException e3) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unrecoverable error ");
                sb.append(e3.getMessage());
                mo18592a(sb.toString(), e3);
                return null;
            }
        }

        /* renamed from: a */
        private JSONObject m28743a(String str) {
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
                    Log.e("AppSignInFragment", e.getMessage());
                }
                mo18592a("Server auth error, please try again.", null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Server auth error: ");
                sb2.append(C6613i.m31991b(httpURLConnection.getErrorStream()));
                Log.i("AppSignInFragment", sb2.toString());
                return null;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Server returned the following error code: ");
            sb3.append(responseCode);
            mo18592a(sb3.toString(), null);
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            String str;
            StringBuilder sb;
            if (C5838a.this.mo1318s() == null) {
                return null;
            }
            try {
                this.f20699e = m28742a();
                if (this.f20699e == null) {
                    return null;
                }
                this.f20700f = m28743a(this.f20699e);
                if (this.f20700f == null) {
                    return null;
                }
                String string = this.f20700f.getString("id");
                String str2 = this.f20696b;
                if (this.f20700f.has("name")) {
                    str2 = this.f20700f.getString("name");
                }
                new C5844b(C5838a.this).execute(new String[]{this.f20699e, "google", string, str2});
                return null;
            } catch (IOException e) {
                sb = new StringBuilder();
                sb.append("Following Error occured, please try again. ");
                str = e.getMessage();
                r7 = e;
                sb.append(str);
                mo18592a(sb.toString(), r7);
                return null;
            } catch (JSONException e2) {
                sb = new StringBuilder();
                sb.append("Bad response: ");
                str = e2.getMessage();
                r7 = e2;
                sb.append(str);
                mo18592a(sb.toString(), r7);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo18592a(String str, Exception exc) {
            if (exc != null) {
                Log.e("AppSignInFragment", "Exception: ", exc);
            }
            C5838a.this.m28735c(str);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            C5838a.this.m28730a(true, false);
            super.onPreExecute();
        }
    }

    /* renamed from: com.seattleclouds.modules.messenger.a$b */
    private class C5844b extends C5270d<String, Void, String> {

        /* renamed from: b */
        private String f20702b;

        /* renamed from: c */
        private boolean f20703c;

        /* renamed from: d */
        private String f20704d;

        public C5844b(Fragment fragment) {
            super(fragment);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo17335a(String... strArr) {
            String str = strArr[0];
            String str2 = strArr[1];
            String str3 = strArr[2];
            this.f20704d = strArr[3];
            JSONObject a = C5268b.m26272a().mo17302a(str2, str3, str, this.f20704d);
            this.f20702b = a.getString("userId");
            this.f20703c = a.getBoolean("isNewAccount");
            return "ok";
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(String str) {
            if (str != null) {
                Intent intent = new Intent();
                intent.putExtra("userId", this.f20702b);
                intent.putExtra("isNewAccount", this.f20703c);
                intent.putExtra("displayName", this.f20704d);
                C5838a.this.mo1318s().setResult(-1, intent);
                C5838a.this.mo1318s().finish();
            }
            C5838a.this.m28730a(false, true);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            C5838a.this.m28730a(true, false);
            super.onPreExecute();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m28730a(boolean z, boolean z2) {
        View view = z ? this.f20687e : this.f20686d;
        View view2 = z ? this.f20686d : this.f20687e;
        if (z2) {
            C6600as.m31947a(view, view2, this.f20688f);
            return;
        }
        view.setVisibility(0);
        view2.setVisibility(8);
    }

    /* renamed from: aA */
    private void m28732aA() {
        startActivityForResult(C3012a.m13982a(null, null, new String[]{"com.google"}, false, null, null, null, null), 1002);
    }

    /* renamed from: aB */
    private void m28733aB() {
        new C5843a(this.f20684b, "oauth2:https://www.googleapis.com/auth/userinfo.profile", 1003).execute(new Void[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: az */
    public void m28734az() {
        if (this.f20684b == null) {
            m28732aA();
        } else {
            m28733aB();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m28735c(final String str) {
        if (mo1318s() != null) {
            mo1318s().runOnUiThread(new Runnable() {
                public void run() {
                    C5838a.this.m28730a(false, true);
                    C6620n.m32031a((Context) C5838a.this.mo1318s(), C5462k.error, str);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m28736e(final int i) {
        if (mo1318s() != null) {
            mo1318s().runOnUiThread(new Runnable() {
                public void run() {
                    C3177d.m14629a().mo11107a((Activity) C5838a.this.mo1318s(), i, 1001).show();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public boolean m28737m(boolean z) {
        if (mo1318s() != null) {
            C3177d a = C3177d.m14629a();
            int a2 = a.mo11106a((Context) mo1318s());
            if (a.mo11114a(a2)) {
                if (z) {
                    a.mo11107a((Activity) mo1318s(), a2, 1001).show();
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5460i.fragment_app_sign_in, viewGroup, false);
        this.f20686d = inflate.findViewById(C5458g.content);
        this.f20687e = inflate.findViewById(C5458g.progress);
        this.f20688f = mo1320t().getInteger(17694720);
        this.f20683a = (Button) inflate.findViewById(C5458g.sign_in_with_google);
        this.f20685c = (Button) inflate.findViewById(C5458g.sign_in_with_facebook);
        this.f20683a.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (C5838a.this.m28737m(true)) {
                    C5838a.this.m28734az();
                }
            }
        });
        this.f20685c.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C5838a.this.mo1450b();
            }
        });
        return inflate;
    }

    /* renamed from: a */
    public void mo1222a(int i, int i2, Intent intent) {
        super.mo1222a(i, i2, intent);
        switch (i) {
            case 1001:
                if (i2 == -1) {
                    m28734az();
                    return;
                } else {
                    m28737m(true);
                    return;
                }
            case 1002:
                if (i2 == -1 && intent != null && intent.getExtras() != null) {
                    String stringExtra = intent.getStringExtra("authAccount");
                    if (stringExtra != null) {
                        this.f20684b = stringExtra;
                        break;
                    }
                } else {
                    return;
                }
                break;
            case 1003:
                if (i2 != -1) {
                    m28730a(false, true);
                    return;
                }
                break;
            default:
                return;
        }
        m28733aB();
    }

    /* renamed from: a */
    public void mo17562a(C6582a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("onSuccess: ");
        sb.append(aVar.toString());
        Log.d("AppSignInFragment", sb.toString());
        String b = aVar.mo20559b();
        String c = aVar.mo20560c();
        String a = aVar.mo20558a();
        String str = "";
        String f = aVar.mo20563f();
        if (f != null && f.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(f);
            str = sb2.toString();
        }
        if (str.length() == 0 && b != null && b.length() > 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(b);
            str = sb3.toString();
        }
        if (str.length() == 0) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(a);
            str = sb4.toString();
        }
        new C5844b(this).execute(new String[]{c, "facebook", a, str});
    }

    /* renamed from: a */
    public void mo17563a(C6584c cVar) {
        super.mo17563a(cVar);
    }
}
