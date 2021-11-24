package com.seattleclouds.previewer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p009v4.app.C0396q;
import com.seattleclouds.C5232ac;
import com.seattleclouds.previewer.C6518j.C6520a;
import com.seattleclouds.previewer.C6521k.C6530a;
import com.seattleclouds.previewer.data.SCTemplateApp;

public class PreviewerTemplatesActivity extends C5232ac implements C6520a, C6530a {

    /* renamed from: n */
    public static boolean f22578n = false;

    /* renamed from: o */
    private static String f22579o = "PreviewerTemplatesActivity";

    /* renamed from: a */
    public static Intent m30893a(Context context) {
        return new Intent(context, PreviewerTemplatesActivity.class);
    }

    /* renamed from: a */
    public void mo19806a(SCTemplateApp sCTemplateApp) {
        C6469d c = C6469d.m31328c(sCTemplateApp.mo20134a());
        C0396q a = mo1469g().mo1536a();
        a.mo1407a(4099);
        a.mo1414a("fragment2");
        a.mo1423b(16908290, c, "fragment2").mo1428c();
    }

    /* renamed from: b */
    public void mo19807b(SCTemplateApp sCTemplateApp) {
        C6518j a = C6518j.m31526a(sCTemplateApp);
        C0396q a2 = mo1469g().mo1536a();
        a2.mo1407a(4099);
        a2.mo1414a("fragment1");
        a2.mo1423b(16908290, a, "fragment1").mo1428c();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            Bundle extras = getIntent().getExtras();
            if (extras != null && extras.containsKey("SELECT_TEMPLATE")) {
                f22578n = extras.getBoolean("SELECT_TEMPLATE");
            }
            C6521k kVar = new C6521k();
            kVar.mo1280d(true);
            mo1469g().mo1536a().mo1411a(16908290, kVar, "fragment").mo1428c();
        }
    }
}
