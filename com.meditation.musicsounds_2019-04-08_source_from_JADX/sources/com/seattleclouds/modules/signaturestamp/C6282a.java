package com.seattleclouds.modules.signaturestamp;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.Toast;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.util.C6598aq;
import com.seattleclouds.util.C6613i;
import com.seattleclouds.util.C6620n;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.seattleclouds.modules.signaturestamp.a */
public class C6282a extends C6557s {

    /* renamed from: a */
    private View f22302a = null;

    /* renamed from: b */
    private ImageView f22303b;

    /* renamed from: c */
    private String f22304c = "";

    /* renamed from: d */
    private String f22305d = null;

    /* renamed from: c */
    private String m30540c(String str) {
        if (!App.m25663l()) {
            C6620n.m32028a((Context) mo1318s(), C5462k.signature_stamp_info, C5462k.signature_stamp_no_sdcard);
            return null;
        }
        String k = App.m25661k();
        StringBuilder sb = new StringBuilder();
        sb.append(k);
        sb.append("/SignatureStamp");
        String sb2 = sb.toString();
        new File(sb2).mkdirs();
        File file = new File(str);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb3.append(file.getName());
        File file2 = new File(sb3.toString());
        try {
            mo19655a(file, file2);
            return file2.getAbsolutePath();
        } catch (IOException e) {
            Log.d("SignatureStamp", "Exception", e);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m30541d() {
        Intent intent = new Intent(mo1318s(), DrawSurfaceActivity.class);
        intent.putExtra("ARG_SURFACE_WIDTH", this.f22303b.getWidth());
        intent.putExtra("ARG_SURFACE_HEIGHT", this.f22303b.getHeight());
        startActivityForResult(intent, 1);
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f22302a = layoutInflater.inflate(C5460i.signature_stamp_activity, viewGroup, false);
        mo1450b();
        return this.f22302a;
    }

    /* renamed from: a */
    public void mo1222a(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1 && intent != null) {
            this.f22305d = intent.getExtras().getString("ARG_IMAGE_PATH");
            this.f22303b.setImageBitmap(BitmapFactory.decodeFile(this.f22305d));
        }
        super.mo1222a(i, i2, intent);
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        Bundle m = mo1307m();
        if (m != null) {
            this.f22304c = m.getString("pageId");
        }
        if (bundle != null) {
            this.f22305d = bundle.getString("STATE_SIGNATURE_PATH");
        }
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(C5461j.signature_stamp_menu, menu);
        super.mo1240a(menu, menuInflater);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo19655a(File file, File file2) {
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        byte[] bArr = new byte[1024];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read > 0) {
                fileOutputStream.write(bArr, 0, read);
            } else {
                fileInputStream.close();
                fileOutputStream.close();
                return;
            }
        }
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        if (menuItem.getItemId() != C5458g.signature_stamp_menu_send) {
            return super.mo1245a(menuItem);
        }
        mo1453c();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1450b() {
        WebView webView = (WebView) this.f22302a.findViewById(C5458g.signature_stamp_web_view);
        this.f22303b = (ImageView) this.f22302a.findViewById(C5458g.signature_stamp_holder);
        this.f22303b.setImageBitmap(BitmapFactory.decodeFile(this.f22305d));
        webView.loadUrl(App.m25655h(this.f22304c));
        this.f22303b.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C6282a.this.m30541d();
            }
        });
    }

    /* renamed from: c */
    public void mo1453c() {
        Intent intent = new Intent("android.intent.action.SEND");
        if (this.f22305d != null) {
            String c = m30540c(this.f22305d);
            if (c != null) {
                intent.setType("image/png");
                intent.putExtra("android.intent.extra.STREAM", C6598aq.m31937a(new File(c)));
            }
        }
        try {
            intent.setType("text/html");
            intent.putExtra("android.intent.extra.TEXT", Html.fromHtml(C6613i.m31991b(App.m25649e(this.f22304c))));
            try {
                mo1230a(intent);
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(mo1318s(), C5462k.signature_can_not_share, 0).show();
            }
        } catch (Exception unused2) {
        }
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        if (this.f22305d != null) {
            bundle.putString("STATE_SIGNATURE_PATH", this.f22305d);
        }
        super.mo1282e(bundle);
    }
}
