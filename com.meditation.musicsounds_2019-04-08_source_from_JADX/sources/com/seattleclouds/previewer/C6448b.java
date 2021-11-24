package com.seattleclouds.previewer;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.bitmapfun.C2418b.C2420a;
import com.google.android.bitmapfun.C2422c;
import com.seattleclouds.App;
import com.seattleclouds.C5332e;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.api.C5268b;
import com.seattleclouds.api.C5270d;
import com.seattleclouds.p160e.C5334b;
import com.seattleclouds.util.C6594an;

/* renamed from: com.seattleclouds.previewer.b */
public class C6448b extends C5332e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C6540l f22926a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Button f22927b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public TextView f22928c;

    /* renamed from: d */
    private C2422c f22929d;

    /* renamed from: com.seattleclouds.previewer.b$a */
    private class C6451a extends C5270d<Void, Void, String> {
        public C6451a(Fragment fragment) {
            super(fragment);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo17335a(Void... voidArr) {
            C6448b.this.f22926a.mo20249b(C5268b.m26272a().mo17317d(App.f18523y, C6448b.this.f22926a.mo20246a()).getLong("resourcesSize"));
            return "ok";
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(String str) {
            if (str != null) {
                C6448b.this.f22928c.setText(C6540l.m31608a(C6448b.this.f22926a.mo20260h()));
            } else {
                C6448b.this.f22927b.setEnabled(true);
            }
        }
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        menuInflater.inflate(C5461j.previewer_app_view, menu);
        if (this.f22926a != null) {
            int d = this.f22926a.mo20253d();
            if (d != 1 && d != 2 && d != 3) {
                MenuItem findItem = menu.findItem(C5458g.send_announcements);
                findItem.setVisible(false);
                findItem.setEnabled(false);
            }
        }
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        Bundle m = mo1307m();
        String string = m != null ? m.getString("ARG_APP_ID") : null;
        if (string == null) {
            string = "unknown";
        }
        if (C6452c.f22933a != null && C6452c.f22933a.size() > 0) {
            this.f22926a = (C6540l) C6452c.f22933a.get(string);
        }
        if (this.f22926a == null) {
            mo1318s().finish();
            return;
        }
        mo1318s().setTitle(this.f22926a.mo20247b());
        ImageView imageView = (ImageView) view.findViewById(C5458g.icon);
        TextView textView = (TextView) view.findViewById(C5458g.f19435id);
        TextView textView2 = (TextView) view.findViewById(C5458g.platform);
        TextView textView3 = (TextView) view.findViewById(C5458g.version);
        this.f22928c = (TextView) view.findViewById(C5458g.size);
        TextView textView4 = (TextView) view.findViewById(C5458g.description);
        this.f22927b = (Button) view.findViewById(C5458g.size_button);
        Button button = (Button) view.findViewById(C5458g.preview_button);
        C2420a aVar = new C2420a(mo1318s(), "previewer/appIcons");
        aVar.f7706g = true;
        aVar.f7703d = CompressFormat.PNG;
        aVar.f7705f = false;
        this.f22929d = new C2422c(mo1318s(), C6452c.f22934b, false);
        this.f22929d.mo8576a(mo1318s().mo1469g(), aVar);
        this.f22929d.mo8578a((Object) this.f22926a.mo20251c(), imageView);
        textView.setText(this.f22926a.mo20246a());
        textView2.setText(this.f22926a.mo20255e());
        StringBuilder sb = new StringBuilder();
        sb.append("v");
        sb.append(this.f22926a.mo20257f());
        textView3.setText(sb.toString());
        textView4.setText(this.f22926a.mo20259g());
        ColorStateList valueOf = ColorStateList.valueOf(C6594an.m31917a(mo1318s(), 16842808));
        C5334b.m26761a(valueOf, (ImageView) view.findViewById(C5458g.platform_icon));
        C5334b.m26761a(valueOf, (ImageView) view.findViewById(C5458g.version_icon));
        ImageView imageView2 = (ImageView) view.findViewById(C5458g.size_icon);
        C5334b.m26761a(valueOf, imageView2);
        C5334b.m26754a(Color.parseColor(mo20291ax().mo17534b().equals("Theme.Base") ? "#404040" : "#dbdbdb"), this.f22927b);
        if (VERSION.SDK_INT >= 21) {
            this.f22928c.setElevation(23.0f);
            imageView2.setElevation(23.0f);
        }
        if (this.f22926a.mo20260h() > 0) {
            this.f22928c.setText(C6540l.m31608a(this.f22926a.mo20260h()));
        } else {
            this.f22928c.setText(C5462k.previewer_app_size);
        }
        this.f22927b.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C6448b.this.f22927b.setEnabled(false);
                new C6451a(C6448b.this).execute(new Void[0]);
            }
        });
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C6452c.m31263a((Activity) C6448b.this.mo1318s(), C6448b.this.f22926a.mo20246a());
            }
        });
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        if (menuItem.getItemId() != C5458g.send_announcements) {
            return super.mo1245a(menuItem);
        }
        Intent b = PreviewerOneFragmentActivity.m30890b(mo1318s(), C6504h.class, true);
        b.putExtra("ARG_APP_ID", this.f22926a.mo20246a());
        mo1230a(b);
        return true;
    }

    /* renamed from: b */
    public int mo1450b() {
        return C5460i.fragment_previewer_app_view;
    }
}
