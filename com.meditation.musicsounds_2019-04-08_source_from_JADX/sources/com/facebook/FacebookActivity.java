package com.facebook;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.C0374l;
import android.support.p009v4.app.Fragment;
import android.util.Log;
import com.facebook.common.C2179a.C2181b;
import com.facebook.common.C2179a.C2182c;
import com.facebook.internal.C2222i;
import com.facebook.internal.C2244t;
import com.facebook.login.C2302b;
import com.facebook.share.internal.DeviceShareDialogFragment;
import com.facebook.share.model.ShareContent;

public class FacebookActivity extends C0367h {

    /* renamed from: n */
    public static String f5195n = "PassThrough";

    /* renamed from: o */
    private static String f5196o = "SingleFragment";

    /* renamed from: p */
    private static final String f5197p = "com.facebook.FacebookActivity";

    /* renamed from: q */
    private Fragment f5198q;

    /* renamed from: k */
    private void m8008k() {
        setResult(0, C2244t.m10295a(getIntent(), (Bundle) null, C2244t.m10298a(C2244t.m10313d(getIntent()))));
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Fragment mo3083i() {
        Intent intent = getIntent();
        C0374l g = mo1469g();
        Fragment a = g.mo1535a(f5196o);
        if (a != null) {
            return a;
        }
        if ("FacebookDialogFragment".equals(intent.getAction())) {
            C2222i iVar = new C2222i();
            iVar.mo1280d(true);
            iVar.mo1448a(g, f5196o);
            return iVar;
        } else if ("DeviceShareDialogFragment".equals(intent.getAction())) {
            DeviceShareDialogFragment deviceShareDialogFragment = new DeviceShareDialogFragment();
            deviceShareDialogFragment.mo1280d(true);
            deviceShareDialogFragment.mo8105a((ShareContent) intent.getParcelableExtra("content"));
            deviceShareDialogFragment.mo1448a(g, f5196o);
            return deviceShareDialogFragment;
        } else {
            C2302b bVar = new C2302b();
            bVar.mo1280d(true);
            g.mo1536a().mo1411a(C2181b.com_facebook_fragment_container, bVar, f5196o).mo1428c();
            return bVar;
        }
    }

    /* renamed from: j */
    public Fragment mo6548j() {
        return this.f5198q;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f5198q != null) {
            this.f5198q.onConfigurationChanged(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!C2189f.m10083a()) {
            Log.d(f5197p, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            C2189f.m10080a(getApplicationContext());
        }
        setContentView(C2182c.com_facebook_activity_layout);
        if (f5195n.equals(intent.getAction())) {
            m8008k();
        } else {
            this.f5198q = mo3083i();
        }
    }
}
