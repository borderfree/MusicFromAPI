package com.seattleclouds.modules.loginregister;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.hardware.fingerprint.FingerprintManager.AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager.AuthenticationResult;
import android.hardware.fingerprint.FingerprintManager.CryptoObject;
import android.os.CancellationSignal;
import android.widget.Toast;
import com.seattleclouds.C5451m.C5462k;

@TargetApi(23)
/* renamed from: com.seattleclouds.modules.loginregister.a */
class C5796a extends AuthenticationCallback {

    /* renamed from: a */
    private Context f20533a;

    /* renamed from: b */
    private CancellationSignal f20534b = new CancellationSignal();

    /* renamed from: c */
    private C5797b f20535c;

    C5796a(Context context, C5797b bVar) {
        this.f20533a = context;
        this.f20535c = bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo18488a() {
        if (this.f20534b != null) {
            this.f20534b.cancel();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo18489a(FingerprintManager fingerprintManager, CryptoObject cryptoObject) {
        fingerprintManager.authenticate(cryptoObject, this.f20534b, 0, this, null);
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
        if (i == 5) {
            mo18488a();
        } else {
            this.f20535c.mo18478a(charSequence.toString(), i);
        }
    }

    public void onAuthenticationFailed() {
        Toast.makeText(this.f20533a, this.f20533a.getString(C5462k.login_register_fingerPrint_auth_failed), 0).show();
    }

    public void onAuthenticationHelp(int i, CharSequence charSequence) {
        Toast.makeText(this.f20533a, charSequence, 0).show();
    }

    public void onAuthenticationSucceeded(AuthenticationResult authenticationResult) {
        this.f20535c.mo18477A_();
    }
}
