package com.seattleclouds.previewer.appmart;

import android.os.Bundle;
import android.support.p009v4.app.C0396q;
import android.view.MenuItem;
import com.seattleclouds.C5232ac;
import com.seattleclouds.previewer.C6469d;
import com.seattleclouds.previewer.C6518j;
import com.seattleclouds.previewer.C6518j.C6520a;
import com.seattleclouds.previewer.data.SCTemplateApp;

public class PreviewerAppMartTemplatesActivity extends C5232ac implements C6520a {

    /* renamed from: n */
    private static String f22591n = "PreviewerAppMartTemplatesActivity";

    /* renamed from: b */
    private void m30914b(SCTemplateApp sCTemplateApp) {
        C6518j a = C6518j.m31526a(sCTemplateApp);
        C0396q a2 = mo1469g().mo1536a();
        a2.mo1407a(4099);
        a2.mo1414a("fragment1");
        a2.mo1423b(16908290, a, "fragment1").mo1428c();
    }

    /* renamed from: a */
    public void mo19806a(SCTemplateApp sCTemplateApp) {
        C6469d c = C6469d.m31328c(sCTemplateApp.mo20134a());
        C0396q a = mo1469g().mo1536a();
        a.mo1407a(4099);
        a.mo1414a("fragment2");
        a.mo1423b(16908290, c, "fragment2").mo1428c();
    }

    public void onBackPressed() {
        if (mo1469g().mo1542d() == 1) {
            setResult(0);
            finish();
            return;
        }
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            SCTemplateApp sCTemplateApp = (SCTemplateApp) getIntent().getParcelableExtra("previewTemplate");
            if (sCTemplateApp != null) {
                m30914b(sCTemplateApp);
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
