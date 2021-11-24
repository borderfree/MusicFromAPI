package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.C0415v.C0416a;
import android.support.p009v4.content.C0453c;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.C3040d;
import com.google.android.gms.common.api.Status;

@KeepName
public class SignInHubActivity extends C0367h {

    /* renamed from: n */
    private static boolean f10500n = false;

    /* renamed from: o */
    private boolean f10501o = false;

    /* renamed from: p */
    private SignInConfiguration f10502p;

    /* renamed from: q */
    private boolean f10503q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f10504r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public Intent f10505s;

    /* renamed from: com.google.android.gms.auth.api.signin.internal.SignInHubActivity$a */
    private class C2979a implements C0416a<Void> {
        private C2979a() {
        }

        /* renamed from: a */
        public final C0453c<Void> mo1696a(int i, Bundle bundle) {
            return new C2985f(SignInHubActivity.this, C3040d.m14041a());
        }

        /* renamed from: a */
        public final void mo1697a(C0453c<Void> cVar) {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo1698a(C0453c cVar, Object obj) {
            SignInHubActivity.this.setResult(SignInHubActivity.this.f10504r, SignInHubActivity.this.f10505s);
            SignInHubActivity.this.finish();
        }
    }

    /* renamed from: c */
    private final void m13894c(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f10500n = false;
    }

    /* renamed from: i */
    private final void m13895i() {
        mo1470h().mo1353a(0, null, new C2979a());
        f10500n = false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f10501o) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && signInAccount.mo10699a() != null) {
                        GoogleSignInAccount a = signInAccount.mo10699a();
                        C2992m.m13937a(this).mo10743a(this.f10502p.mo10712a(), a);
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", a);
                        this.f10503q = true;
                        this.f10504r = i2;
                        this.f10505s = intent;
                        m13895i();
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = 12501;
                        }
                        m13894c(intExtra);
                        return;
                    }
                }
                m13894c(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            m13894c(12500);
        } else if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            this.f10502p = (SignInConfiguration) intent.getBundleExtra("config").getParcelable("config");
            if (this.f10502p == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            if (!(bundle == null)) {
                this.f10503q = bundle.getBoolean("signingInGoogleApiClients");
                if (this.f10503q) {
                    this.f10504r = bundle.getInt("signInResultCode");
                    this.f10505s = (Intent) bundle.getParcelable("signInResultData");
                    m13895i();
                }
            } else if (f10500n) {
                setResult(0);
                m13894c(12502);
            } else {
                f10500n = true;
                Intent intent2 = new Intent(action);
                intent2.setPackage(action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") ? "com.google.android.gms" : getPackageName());
                intent2.putExtra("config", this.f10502p);
                try {
                    startActivityForResult(intent2, 40962);
                } catch (ActivityNotFoundException unused) {
                    this.f10501o = true;
                    Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                    m13894c(17);
                }
            }
        } else {
            String str = "AuthSignInClient";
            String str2 = "Unknown action: ";
            String valueOf = String.valueOf(intent.getAction());
            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f10503q);
        if (this.f10503q) {
            bundle.putInt("signInResultCode", this.f10504r);
            bundle.putParcelable("signInResultData", this.f10505s);
        }
    }
}
