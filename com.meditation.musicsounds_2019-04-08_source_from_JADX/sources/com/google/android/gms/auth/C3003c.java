package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.p121b.C3172a;
import com.google.android.gms.internal.auth.C4150j;
import com.google.android.gms.internal.auth.zzay;
import java.io.IOException;

/* renamed from: com.google.android.gms.auth.c */
final class C3003c implements C3005e<TokenData> {

    /* renamed from: a */
    private final /* synthetic */ Account f10531a;

    /* renamed from: b */
    private final /* synthetic */ String f10532b;

    /* renamed from: c */
    private final /* synthetic */ Bundle f10533c;

    C3003c(Account account, String str, Bundle bundle) {
        this.f10531a = account;
        this.f10532b = str;
        this.f10533c = bundle;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10750a(IBinder iBinder) {
        Bundle bundle = (Bundle) C3002b.m13960b(C4150j.m20781a(iBinder).mo13998a(this.f10531a, this.f10532b, this.f10533c));
        TokenData a = TokenData.m13838a(bundle, "tokenDetails");
        if (a != null) {
            return a;
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        zzay zzc = zzay.zzc(string);
        boolean z = false;
        if (!zzay.zza(zzc)) {
            if (zzay.NETWORK_ERROR.equals(zzc) || zzay.SERVICE_UNAVAILABLE.equals(zzc) || zzay.INTNERNAL_ERROR.equals(zzc)) {
                z = true;
            }
            if (z) {
                throw new IOException(string);
            }
            throw new GoogleAuthException(string);
        }
        C3172a a2 = C3002b.f10530e;
        String valueOf = String.valueOf(zzc);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("isUserRecoverableError status: ");
        sb.append(valueOf);
        a2.mo11100c("GoogleAuthUtil", sb.toString());
        throw new UserRecoverableAuthException(string, intent);
    }
}
