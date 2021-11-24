package com.seattleclouds.previewer;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.bitmapfun.C2418b.C2420a;
import com.google.android.bitmapfun.C2422c;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.previewer.data.SCTemplateApp;

/* renamed from: com.seattleclouds.previewer.j */
public class C6518j extends C6557s {

    /* renamed from: a */
    private static int f23103a = 144;

    /* renamed from: b */
    private C2422c f23104b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public SCTemplateApp f23105c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C6520a f23106d;

    /* renamed from: e */
    private ImageView f23107e;

    /* renamed from: com.seattleclouds.previewer.j$a */
    public interface C6520a {
        /* renamed from: a */
        void mo19806a(SCTemplateApp sCTemplateApp);
    }

    /* renamed from: a */
    public static C6518j m31526a(SCTemplateApp sCTemplateApp) {
        C6518j jVar = new C6518j();
        Bundle bundle = new Bundle();
        bundle.putParcelable("template", sCTemplateApp);
        jVar.mo1289g(bundle);
        return jVar;
    }

    /* renamed from: K */
    public void mo1201K() {
        super.mo1201K();
    }

    /* renamed from: L */
    public void mo1202L() {
        super.mo1202L();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5460i.fragment_previewer_template_details, viewGroup, false);
        Button button = (Button) inflate.findViewById(C5458g.create_app_button);
        if (PreviewerTemplatesActivity.f22578n) {
            button.setText(C5462k.previewer_templates_select);
        }
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (PreviewerTemplatesActivity.f22578n) {
                    C6518j.this.mo1318s().setResult(-1, new Intent().putExtra("result", C6518j.this.f23105c));
                    C6518j.this.mo1318s().finish();
                } else if (C6518j.this.f23106d != null) {
                    C6518j.this.f23106d.mo19806a(C6518j.this.f23105c);
                }
            }
        });
        this.f23107e = (ImageView) inflate.findViewById(C5458g.template_icon);
        this.f23104b.mo8578a((Object) this.f23105c.mo20137b(), this.f23107e);
        ((TextView) inflate.findViewById(C5458g.template_id)).setText(this.f23105c.mo20144e());
        ((TextView) inflate.findViewById(C5458g.template_description)).setText(this.f23105c.mo20139c());
        mo20287a((CharSequence) this.f23105c.mo20144e());
        return inflate;
    }

    /* renamed from: a */
    public void mo1226a(Activity activity) {
        super.mo1226a(activity);
        if (activity instanceof C6520a) {
            this.f23106d = (C6520a) activity;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(activity.toString());
        sb.append(" must implement Listener");
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        if (mo1307m() != null) {
            this.f23105c = (SCTemplateApp) mo1307m().getParcelable("template");
        }
        C2420a aVar = new C2420a(mo1318s(), "previewer/templateIcons");
        aVar.f7706g = false;
        aVar.f7703d = CompressFormat.PNG;
        aVar.mo8566a(0.05f);
        this.f23104b = new C2422c(mo1318s(), f23103a, false);
        this.f23104b.mo8576a(mo1318s().mo1469g(), aVar);
        mo1283e(true);
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        menuInflater.inflate(C5461j.previewer_templates_details, menu);
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        if (menuItem.getItemId() != C5458g.templates_preview) {
            return super.mo1245a(menuItem);
        }
        C6452c.m31269b((Activity) mo1318s(), this.f23105c.mo20134a());
        return true;
    }

    /* renamed from: f */
    public void mo1285f() {
        super.mo1285f();
        this.f23106d = null;
    }
}
