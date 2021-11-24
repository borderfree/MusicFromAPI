package com.seattleclouds.modules.p163b;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.sczxing.client.p140a.C4988f;
import com.google.sczxing.client.p140a.C4989g;
import com.google.sczxing.client.p140a.C4990h;
import com.google.sczxing.client.p140a.C4991i;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.util.C6598aq;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.seattleclouds.modules.b.b */
public class C5472b extends C6557s {

    /* renamed from: b */
    private static final String f19468b = "b";

    /* renamed from: a */
    public C4990h f19469a = null;

    /* renamed from: c */
    private String f19470c = "";

    /* renamed from: d */
    private String f19471d = "";

    /* renamed from: e */
    private String f19472e = "";

    /* renamed from: f */
    private String f19473f = "";

    /* renamed from: g */
    private View f19474g = null;

    /* renamed from: h */
    private ArrayList<Uri> f19475h = new ArrayList<>();

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f19474g = layoutInflater.inflate(C5460i.barcode_description_view, viewGroup, false);
        mo1450b();
        return this.f19474g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1450b() {
        Bundle m = mo1307m();
        if (m != null) {
            this.f19470c = m.getString("RAW_DATA");
            this.f19473f = m.getString("CROP_PATH");
            this.f19471d = m.getString("email_to_send", "");
            this.f19472e = m.getString("description", "");
            if (m.getString("uri") != null) {
                String string = m.getString("uri");
                if (string != null && !string.isEmpty()) {
                    Uri parse = Uri.parse(string);
                    try {
                        if (parse.getPath() != null) {
                            this.f19475h.add(C6598aq.m31937a(new File(parse.getPath())));
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        this.f19469a = C4991i.m24774a(mo1318s(), new C4988f(this.f19470c));
        ((TextView) this.f19474g.findViewById(C5458g.barcode_content_view)).setText(this.f19469a.mo16287b());
        if (this.f19469a != null) {
            int a = this.f19469a.mo16285a();
            ViewGroup viewGroup = (ViewGroup) this.f19474g.findViewById(C5458g.result_button_view);
            viewGroup.requestFocus();
            int i = 0;
            while (i < 4) {
                TextView textView = (TextView) viewGroup.getChildAt(i);
                if (i < a) {
                    textView.setVisibility(0);
                    textView.setText(this.f19469a.mo16286a(i));
                    textView.setOnClickListener(String.valueOf(textView.getText()).equalsIgnoreCase(mo1320t().getString(C5462k.barcode_button_share_by_email)) ? new OnClickListener() {
                        public void onClick(View view) {
                            C5472b.this.mo1453c();
                        }
                    } : new C4989g(this.f19469a, i));
                } else {
                    textView.setVisibility(8);
                }
                i++;
            }
        }
        if (this.f19473f != null) {
            ((ImageView) this.f19474g.findViewById(C5458g.barcode_qrcode_crop)).setImageBitmap(BitmapFactory.decodeFile(this.f19473f));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1453c() {
        String str;
        String str2;
        String string = mo1320t().getString(C5462k.app_name);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/html");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{this.f19471d});
        StringBuilder sb = new StringBuilder();
        sb.append(mo1219a(C5462k.barcode_qrcodes_from));
        sb.append(string);
        intent.putExtra("android.intent.extra.SUBJECT", sb.toString());
        if (!this.f19472e.isEmpty()) {
            str = "android.intent.extra.TEXT";
            str2 = this.f19472e;
        } else {
            str = "android.intent.extra.TEXT";
            str2 = this.f19470c;
        }
        intent.putExtra(str, str2);
        intent.putExtra("android.intent.extra.STREAM", C6598aq.m31937a(new File(this.f19473f)));
        mo1230a(intent);
    }
}
