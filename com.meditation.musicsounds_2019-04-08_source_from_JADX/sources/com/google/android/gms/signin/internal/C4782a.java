package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.C2981b;
import com.google.android.gms.common.C3183f;
import com.google.android.gms.common.api.C3040d.C3042b;
import com.google.android.gms.common.api.C3040d.C3043c;
import com.google.android.gms.common.internal.C3227d.C3230c;
import com.google.android.gms.common.internal.C3240e;
import com.google.android.gms.common.internal.C3245h;
import com.google.android.gms.common.internal.C3252m;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.C4776a;
import com.google.android.gms.signin.C4781e;

/* renamed from: com.google.android.gms.signin.internal.a */
public class C4782a extends C3245h<C4787f> implements C4781e {

    /* renamed from: e */
    private final boolean f17310e;

    /* renamed from: f */
    private final C3240e f17311f;

    /* renamed from: g */
    private final Bundle f17312g;

    /* renamed from: h */
    private Integer f17313h;

    private C4782a(Context context, Looper looper, boolean z, C3240e eVar, Bundle bundle, C3042b bVar, C3043c cVar) {
        super(context, looper, 44, eVar, bVar, cVar);
        this.f17310e = true;
        this.f17311f = eVar;
        this.f17312g = bundle;
        this.f17313h = eVar.mo11253j();
    }

    public C4782a(Context context, Looper looper, boolean z, C3240e eVar, C4776a aVar, C3042b bVar, C3043c cVar) {
        this(context, looper, true, eVar, m24007a(eVar), bVar, cVar);
    }

    /* renamed from: a */
    public static Bundle m24007a(C3240e eVar) {
        C4776a i = eVar.mo11252i();
        Integer j = eVar.mo11253j();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", eVar.mo11245b());
        if (j != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", j.intValue());
        }
        if (i != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", i.mo15881a());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", i.mo15882b());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", i.mo15883c());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", i.mo15884d());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", i.mo15885e());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", i.mo15886f());
            if (i.mo15887g() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", i.mo15887g().longValue());
            }
            if (i.mo15888h() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", i.mo15888h().longValue());
            }
        }
        return bundle;
    }

    /* renamed from: A */
    public final void mo15889A() {
        mo11205a((C3230c) new C3231d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ IInterface mo10733a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C4787f ? (C4787f) queryLocalInterface : new C4788g(iBinder);
    }

    /* renamed from: a */
    public final void mo15890a(C3252m mVar, boolean z) {
        try {
            ((C4787f) mo11227w()).mo15900a(mVar, this.f17313h.intValue(), z);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    /* renamed from: a */
    public final void mo15891a(C4785d dVar) {
        C3266s.m14914a(dVar, (Object) "Expecting a valid ISignInCallbacks");
        try {
            Account c = this.f17311f.mo11246c();
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(c.name)) {
                googleSignInAccount = C2981b.m13903a(mo11222r()).mo10720a();
            }
            ((C4787f) mo11227w()).mo15901a(new zah(new ResolveAccountRequest(c, this.f17313h.intValue(), googleSignInAccount)), dVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                dVar.mo10895a(new zaj(8));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo10734b() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* renamed from: e */
    public final void mo10737e() {
        try {
            ((C4787f) mo11227w()).mo15899a(this.f17313h.intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    /* renamed from: f */
    public int mo10738f() {
        return C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i_ */
    public String mo10739i_() {
        return "com.google.android.gms.signin.service.START";
    }

    /* renamed from: j */
    public boolean mo11214j() {
        return this.f17310e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public Bundle mo11225u() {
        if (!mo11222r().getPackageName().equals(this.f17311f.mo11250g())) {
            this.f17312g.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f17311f.mo11250g());
        }
        return this.f17312g;
    }
}
