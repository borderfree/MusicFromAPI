package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p009v4.app.C0366g;
import android.support.p009v4.app.C0367h;
import com.facebook.C2189f;
import com.facebook.FacebookException;
import com.facebook.internal.C2265z.C2270a;
import com.facebook.internal.C2265z.C2272c;

/* renamed from: com.facebook.internal.i */
public class C2222i extends C0366g {

    /* renamed from: ae */
    private Dialog f7175ae;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10198a(Bundle bundle, FacebookException facebookException) {
        C0367h s = mo1318s();
        s.setResult(facebookException == null ? -1 : 0, C2244t.m10295a(s.getIntent(), bundle, facebookException));
        s.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m10201o(Bundle bundle) {
        C0367h s = mo1318s();
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        s.setResult(-1, intent);
        s.finish();
    }

    /* renamed from: J */
    public void mo1200J() {
        super.mo1200J();
        if (this.f7175ae instanceof C2265z) {
            ((C2265z) this.f7175ae).mo7897e();
        }
    }

    /* renamed from: a */
    public void mo7840a(Dialog dialog) {
        this.f7175ae = dialog;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        C2265z zVar;
        String str;
        String str2;
        super.mo1234a(bundle);
        if (this.f7175ae == null) {
            C0367h s = mo1318s();
            Bundle d = C2244t.m10313d(s.getIntent());
            if (!d.getBoolean("is_fallback", false)) {
                String string = d.getString("action");
                Bundle bundle2 = d.getBundle("params");
                if (C2258x.m10392a(string)) {
                    str = "FacebookDialogFragment";
                    str2 = "Cannot start a WebDialog with an empty/missing 'actionName'";
                } else {
                    zVar = new C2270a(s, string, bundle2).mo7909a(new C2272c() {
                        /* renamed from: a */
                        public void mo7841a(Bundle bundle, FacebookException facebookException) {
                            C2222i.this.m10198a(bundle, facebookException);
                        }
                    }).mo7910a();
                    this.f7175ae = zVar;
                }
            } else {
                String string2 = d.getString("url");
                if (C2258x.m10392a(string2)) {
                    str = "FacebookDialogFragment";
                    str2 = "Cannot start a fallback WebDialog with an empty/missing 'url'";
                } else {
                    zVar = C2228l.m10217a(s, string2, String.format("fb%s://bridge/", new Object[]{C2189f.m10096j()}));
                    zVar.mo7890a((C2272c) new C2272c() {
                        /* renamed from: a */
                        public void mo7841a(Bundle bundle, FacebookException facebookException) {
                            C2222i.this.m10201o(bundle);
                        }
                    });
                    this.f7175ae = zVar;
                }
            }
            C2258x.m10384a(str, str2);
            s.finish();
        }
    }

    /* renamed from: c */
    public Dialog mo1452c(Bundle bundle) {
        if (this.f7175ae == null) {
            m10198a((Bundle) null, (FacebookException) null);
            mo1451b(false);
        }
        return this.f7175ae;
    }

    /* renamed from: i */
    public void mo1296i() {
        if (mo1454d() != null && mo1196F()) {
            mo1454d().setDismissMessage(null);
        }
        super.mo1296i();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((this.f7175ae instanceof C2265z) && mo1192B()) {
            ((C2265z) this.f7175ae).mo7897e();
        }
    }
}
