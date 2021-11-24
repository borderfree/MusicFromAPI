package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.C2179a.C2181b;
import com.facebook.common.C2179a.C2182c;
import com.facebook.login.LoginClient.C2297b;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;

/* renamed from: com.facebook.login.b */
public class C2302b extends Fragment {

    /* renamed from: a */
    private String f7389a;

    /* renamed from: b */
    private LoginClient f7390b;

    /* renamed from: c */
    private Request f7391c;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10669a(Result result) {
        this.f7391c = null;
        int i = result.f7373a == Code.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", result);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        if (mo1326y()) {
            mo1318s().setResult(i, intent);
            mo1318s().finish();
        }
    }

    /* renamed from: b */
    private void m10671b(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            this.f7389a = callingActivity.getPackageName();
        }
    }

    /* renamed from: J */
    public void mo1200J() {
        super.mo1200J();
        if (this.f7389a == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            mo1318s().finish();
            return;
        }
        this.f7390b.mo8002a(this.f7391c);
    }

    /* renamed from: K */
    public void mo1201K() {
        super.mo1201K();
        View findViewById = mo1199I() == null ? null : mo1199I().findViewById(C2181b.com_facebook_login_fragment_progress_bar);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    /* renamed from: L */
    public void mo1202L() {
        this.f7390b.mo8015f();
        super.mo1202L();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C2182c.com_facebook_login_fragment, viewGroup, false);
        final View findViewById = inflate.findViewById(C2181b.com_facebook_login_fragment_progress_bar);
        this.f7390b.mo8004a((C2296a) new C2296a() {
            /* renamed from: a */
            public void mo8050a() {
                findViewById.setVisibility(0);
            }

            /* renamed from: b */
            public void mo8051b() {
                findViewById.setVisibility(8);
            }
        });
        return inflate;
    }

    /* renamed from: a */
    public void mo1222a(int i, int i2, Intent intent) {
        super.mo1222a(i, i2, intent);
        this.f7390b.mo8006a(i, i2, intent);
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        if (bundle != null) {
            this.f7390b = (LoginClient) bundle.getParcelable("loginClient");
            this.f7390b.mo8001a((Fragment) this);
        } else {
            this.f7390b = mo1450b();
        }
        this.f7390b.mo8005a((C2297b) new C2297b() {
            /* renamed from: a */
            public void mo8052a(Result result) {
                C2302b.this.m10669a(result);
            }
        });
        C0367h s = mo1318s();
        if (s != null) {
            m10671b(s);
            Intent intent = s.getIntent();
            if (intent != null) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request");
                if (bundleExtra != null) {
                    this.f7391c = (Request) bundleExtra.getParcelable("request");
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public LoginClient mo1450b() {
        return new LoginClient((Fragment) this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public LoginClient mo1453c() {
        return this.f7390b;
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        super.mo1282e(bundle);
        bundle.putParcelable("loginClient", this.f7390b);
    }
}
