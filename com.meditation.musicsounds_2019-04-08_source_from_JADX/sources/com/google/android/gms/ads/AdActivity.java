package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.dynamic.C3327d;
import com.google.android.gms.internal.ads.C3731me;
import com.google.android.gms.internal.ads.C3834q;
import com.google.android.gms.internal.ads.ane;

public class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    public static final String SIMPLE_CLASS_NAME = "AdActivity";

    /* renamed from: a */
    private C3834q f9859a;

    /* renamed from: a */
    private final void m13498a() {
        if (this.f9859a != null) {
            try {
                this.f9859a.zzax();
            } catch (RemoteException e) {
                C3731me.m19177d("#007 Could not call remote method.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        try {
            this.f9859a.onActivityResult(i, i2, intent);
        } catch (Exception e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        boolean z = true;
        try {
            if (this.f9859a != null) {
                z = this.f9859a.zznj();
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
        if (z) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.f9859a.zzo(C3327d.m15136a(configuration));
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9859a = ane.m16646b().mo12114a((Activity) this);
        if (this.f9859a == null) {
            C3731me.m19177d("#007 Could not call remote method.", null);
        } else {
            try {
                this.f9859a.onCreate(bundle);
                return;
            } catch (RemoteException e) {
                C3731me.m19177d("#007 Could not call remote method.", e);
            }
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        try {
            if (this.f9859a != null) {
                this.f9859a.onDestroy();
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        try {
            if (this.f9859a != null) {
                this.f9859a.onPause();
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        try {
            if (this.f9859a != null) {
                this.f9859a.onRestart();
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        try {
            if (this.f9859a != null) {
                this.f9859a.onResume();
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.f9859a != null) {
                this.f9859a.onSaveInstanceState(bundle);
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        try {
            if (this.f9859a != null) {
                this.f9859a.onStart();
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        try {
            if (this.f9859a != null) {
                this.f9859a.onStop();
            }
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    public void setContentView(int i) {
        super.setContentView(i);
        m13498a();
    }

    public void setContentView(View view) {
        super.setContentView(view);
        m13498a();
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        m13498a();
    }
}
