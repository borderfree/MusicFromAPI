package com.seattleclouds.modules.p163b;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.support.p023v7.app.C0765d.C0766a;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.sczxing.client.p140a.C4988f;
import com.google.sczxing.client.p140a.C4990h;
import com.google.sczxing.client.p140a.C4991i;
import com.google.sczxing.p138a.p139a.C4981a;
import com.google.sczxing.p138a.p139a.C4982b;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.util.C6598aq;
import com.seattleclouds.util.C6620n;
import com.seattleclouds.util.C6635q;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.seattleclouds.modules.b.c */
public class C5474c extends C6557s {

    /* renamed from: a */
    private static final String f19477a = "c";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ListView f19478b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C6635q f19479c = new C6635q();

    /* renamed from: d */
    private String f19480d = "";

    /* renamed from: e */
    private String f19481e = "";

    /* renamed from: f */
    private String f19482f = "";

    /* renamed from: g */
    private boolean f19483g = true;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f19484h = false;

    /* renamed from: i */
    private View f19485i = null;

    /* renamed from: com.seattleclouds.modules.b.c$a */
    private class C5481a extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        public int f19493a;

        /* renamed from: c */
        private C5471a f19495c;

        /* renamed from: d */
        private TextView f19496d;

        private C5481a() {
            this.f19493a = -1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            return C5474c.this.m27285d(strArr[0]);
        }

        /* renamed from: a */
        public void mo17795a(TextView textView) {
            this.f19496d = textView;
        }

        /* renamed from: a */
        public void mo17796a(C5471a aVar) {
            this.f19495c = aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            if (this.f19496d != null && this.f19496d.getTag() != null && this.f19493a == ((Integer) this.f19496d.getTag()).intValue()) {
                if (str == null) {
                    this.f19496d.setText(C5462k.barcode_no_description);
                    return;
                }
                this.f19496d.setText(str);
                this.f19495c.f19464c = str;
            }
        }
    }

    /* renamed from: com.seattleclouds.modules.b.c$b */
    public class C5482b extends BaseAdapter {

        /* renamed from: a */
        Context f19497a;

        /* renamed from: b */
        int f19498b;

        /* renamed from: c */
        ArrayList<C5471a> f19499c = new ArrayList<>();

        public C5482b(Context context, int i) {
            this.f19498b = i;
            this.f19497a = context;
        }

        /* renamed from: a */
        public C5471a mo17800a(int i) {
            return (C5471a) this.f19499c.get(i);
        }

        /* renamed from: a */
        public ArrayList<C5471a> mo17801a() {
            return this.f19499c;
        }

        /* renamed from: a */
        public void mo17802a(C5471a aVar) {
            this.f19499c.add(aVar);
            notifyDataSetChanged();
            C5474c.this.mo17787a(this.f19499c);
        }

        /* renamed from: a */
        public void mo17803a(ArrayList<C5471a> arrayList) {
            this.f19499c = arrayList;
            notifyDataSetChanged();
        }

        /* renamed from: b */
        public void mo17804b() {
            this.f19499c.clear();
            notifyDataSetChanged();
            C5474c.this.mo17787a(this.f19499c);
        }

        /* renamed from: b */
        public void mo17805b(int i) {
            this.f19499c.remove(i);
            notifyDataSetChanged();
            C5474c.this.mo17787a(this.f19499c);
        }

        /* renamed from: c */
        public C5471a getItem(int i) {
            return (C5471a) this.f19499c.get(i);
        }

        public int getCount() {
            return this.f19499c.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C5483c cVar;
            if (view == null) {
                view = ((Activity) this.f19497a).getLayoutInflater().inflate(this.f19498b, viewGroup, false);
                cVar = new C5483c();
                cVar.f19501a = (ImageView) view.findViewById(C5458g.image);
                cVar.f19502b = (TextView) view.findViewById(C5458g.title);
                cVar.f19503c = (TextView) view.findViewById(C5458g.description);
                cVar.f19504d = (TextView) view.findViewById(C5458g.label);
                view.setTag(cVar);
            } else {
                cVar = (C5483c) view.getTag();
            }
            C5471a a = mo17800a(i);
            cVar.f19501a.setImageBitmap(null);
            cVar.f19501a.setTag(Integer.valueOf(i));
            cVar.f19503c.setTag(Integer.valueOf(i));
            if (C5474c.this.f19479c.mo20624a(a.f19466e) == null) {
                C5484d dVar = new C5484d();
                dVar.f19505a = i;
                dVar.mo17813a(cVar.f19501a);
                dVar.execute(new String[]{a.f19466e});
            } else {
                cVar.f19501a.setImageBitmap(C5474c.this.f19479c.mo20624a(a.f19466e));
            }
            if (C5474c.this.f19484h && a.f19464c.length() == 0) {
                C5481a aVar = new C5481a();
                aVar.f19493a = i;
                aVar.mo17795a(cVar.f19503c);
                aVar.mo17796a(a);
                aVar.execute(new String[]{a.f19462a});
            }
            cVar.f19502b.setText(a.f19462a);
            cVar.f19503c.setText(a.f19464c);
            cVar.f19504d.setText(a.f19465d);
            return view;
        }
    }

    /* renamed from: com.seattleclouds.modules.b.c$c */
    static class C5483c {

        /* renamed from: a */
        ImageView f19501a;

        /* renamed from: b */
        TextView f19502b;

        /* renamed from: c */
        TextView f19503c;

        /* renamed from: d */
        TextView f19504d;

        C5483c() {
        }
    }

    /* renamed from: com.seattleclouds.modules.b.c$d */
    private class C5484d extends AsyncTask<String, Void, Bitmap> {

        /* renamed from: a */
        public int f19505a;

        /* renamed from: c */
        private ImageView f19507c;

        private C5484d() {
            this.f19505a = -1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Bitmap doInBackground(String... strArr) {
            return C5474c.this.m27283c(strArr[0]);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Bitmap bitmap) {
            if (this.f19507c != null && this.f19507c.getTag() != null && this.f19505a == ((Integer) this.f19507c.getTag()).intValue()) {
                if (bitmap == null) {
                    this.f19507c.setImageResource(C5457f.no_image_available);
                } else {
                    this.f19507c.setImageBitmap(bitmap);
                }
            }
        }

        /* renamed from: a */
        public void mo17813a(ImageView imageView) {
            this.f19507c = imageView;
        }
    }

    /* renamed from: as */
    private void m27280as() {
        if (mo1318s() != null) {
            C0766a aVar = new C0766a(mo1318s());
            aVar.mo3063b((CharSequence) mo1219a(C5462k.barcode_delete_item)).mo3056a(false).mo3048a(C5462k.yes, (OnClickListener) new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    C5482b bVar = (C5482b) C5474c.this.f19478b.getAdapter();
                    int count = bVar.getCount();
                    String k = App.m25661k();
                    StringBuilder sb = new StringBuilder();
                    sb.append(k);
                    sb.append("/QRCodeList");
                    String sb2 = sb.toString();
                    for (int i2 = 0; i2 < count; i2++) {
                        C5471a c = bVar.getItem(i2);
                        if (c.f19466e.length() > 0) {
                            File file = new File(c.f19466e);
                            file.delete();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(sb2);
                            sb3.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
                            sb3.append(file.getName());
                            File file2 = new File(sb3.toString());
                            if (file2.exists()) {
                                file2.delete();
                            }
                        }
                    }
                    bVar.mo17804b();
                }
            }).mo3061b(C5462k.f19440no, (OnClickListener) new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });
            aVar.mo3065b().show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public Bitmap m27283c(String str) {
        Bitmap a = this.f19479c.mo20624a(str);
        if (a == null) {
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(str);
                try {
                    this.f19479c.mo20626a(str, decodeFile);
                    return decodeFile;
                } catch (Exception unused) {
                    a = decodeFile;
                }
            } catch (Exception unused2) {
            }
        }
        return a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043 A[SYNTHETIC, Splitter:B:17:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048 A[SYNTHETIC, Splitter:B:21:0x0048] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String m27285d(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "http://api.upcdatabase.org/xml/27d024549427b7587725ff828963f343/"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x003f }
            r2.<init>(r5)     // Catch:{ Exception -> 0x003f }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x003f }
            java.io.InputStream r2 = r2.openStream()     // Catch:{ Exception -> 0x003f }
            r5.<init>(r2)     // Catch:{ Exception -> 0x003f }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x003d }
            r2.<init>(r5)     // Catch:{ Exception -> 0x003d }
        L_0x002a:
            java.lang.String r3 = r2.readLine()     // Catch:{ Exception -> 0x0041 }
            if (r3 == 0) goto L_0x0034
            r0.append(r3)     // Catch:{ Exception -> 0x0041 }
            goto L_0x002a
        L_0x0034:
            java.lang.String r5 = r0.toString()
            java.lang.String r5 = r4.m27287e(r5)
            return r5
        L_0x003d:
            r2 = r1
            goto L_0x0041
        L_0x003f:
            r5 = r1
            r2 = r5
        L_0x0041:
            if (r2 == 0) goto L_0x0046
            r2.close()     // Catch:{ Exception -> 0x0046 }
        L_0x0046:
            if (r5 == 0) goto L_0x004b
            r5.close()     // Catch:{ Exception -> 0x004b }
        L_0x004b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.p163b.C5474c.m27285d(java.lang.String):java.lang.String");
    }

    /* renamed from: d */
    private void m27286d() {
        boolean z;
        Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
        ArrayList a = ((C5482b) this.f19478b.getAdapter()).mo17801a();
        if (!App.m25663l()) {
            C6620n.m32028a((Context) mo1318s(), C5462k.signature_stamp_info, C5462k.signature_stamp_no_sdcard);
            z = false;
        } else {
            z = true;
        }
        String str = "";
        ArrayList arrayList = new ArrayList();
        Iterator it = a.iterator();
        int i = 1;
        while (it.hasNext()) {
            C5471a aVar = (C5471a) it.next();
            if (z && aVar.f19466e != null) {
                String f = m27290f(aVar.f19466e);
                if (f != null) {
                    arrayList.add(C6598aq.m31937a(new File(f)));
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(i);
            sb.append(". ");
            sb.append(aVar.f19464c);
            sb.append("\n");
            str = sb.toString();
            i++;
        }
        intent.setType("text/html");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{this.f19481e});
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mo1219a(C5462k.barcode_qrcodes_from));
        sb2.append(this.f19482f);
        intent.putExtra("android.intent.extra.SUBJECT", sb2.toString());
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        try {
            mo1230a(intent);
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    private String m27287e(String str) {
        Matcher matcher = Pattern.compile("<description>(.+?)</description>").matcher(str);
        String str2 = null;
        while (matcher.find()) {
            str2 = str.substring(matcher.start(), matcher.end()).replace("<description>", "").replace("</description>", "");
        }
        return str2;
    }

    /* renamed from: e */
    private void m27288e() {
        Intent intent = new Intent("com.google.sczxing.client.android.SCAN");
        intent.putExtra("NEED_BARCODE_CROP", true);
        if (!this.f19483g) {
            intent.putExtra("SCAN_MODE", "PRODUCT_MODE");
        }
        if (!this.f19484h) {
            intent.putExtra("SCAN_MODE", "QR_CODE_MODE");
        }
        startActivityForResult(intent, 49374);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m27289e(final int i) {
        if (mo1318s() != null) {
            C0766a aVar = new C0766a(mo1318s());
            aVar.mo3060b(C5462k.barcode_delete_item).mo3056a(false).mo3048a(C5462k.yes, (OnClickListener) new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    C5482b bVar = (C5482b) C5474c.this.f19478b.getAdapter();
                    File file = new File(bVar.getItem(i).f19466e);
                    if (!file.exists() || file.delete()) {
                        bVar.mo17805b(i);
                    }
                }
            }).mo3061b(C5462k.f19440no, (OnClickListener) new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });
            aVar.mo3065b().show();
        }
    }

    /* renamed from: f */
    private String m27290f(String str) {
        String k = App.m25661k();
        StringBuilder sb = new StringBuilder();
        sb.append(k);
        sb.append("/QRCodeList");
        String sb2 = sb.toString();
        new File(sb2).mkdirs();
        File file = new File(str);
        file.getName();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb3.append(file.getName());
        File file2 = new File(sb3.toString());
        try {
            mo17786a(file, file2);
            return file2.getAbsolutePath();
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f19485i = layoutInflater.inflate(C5460i.barcode_scanner_view, viewGroup, false);
        mo1450b();
        return this.f19485i;
    }

    @SuppressLint({"SimpleDateFormat"})
    /* renamed from: a */
    public void mo1222a(int i, int i2, Intent intent) {
        C5471a aVar;
        if (i == 49374 && i2 == -1 && intent.getExtras() != null) {
            String string = intent.getExtras().getString("BARCODE_CROP");
            if (string == null) {
                string = "";
            }
            String str = string;
            C4982b a = C4981a.m24719a(i, i2, intent);
            if (a != null) {
                a.mo16284a();
            }
            String format = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(new Date());
            if (a != null) {
                if (this.f19484h) {
                    aVar = new C5471a(str, a.mo16284a(), "", format, a.mo16284a());
                } else {
                    C4990h a2 = C4991i.m24774a(mo1318s(), new C4988f(a.mo16284a()));
                    C5471a aVar2 = new C5471a(str, "", a2.mo16287b().toString(), format, a.mo16284a());
                    aVar2.mo17783a(a2);
                    aVar = aVar2;
                }
                ((C5482b) this.f19478b.getAdapter()).mo17802a(aVar);
            }
        }
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(C5461j.barcode_list_menu, menu);
        if (!this.f19483g) {
            menu.removeItem(C5458g.barcode_list_menu_send_all);
        }
        super.mo1240a(menu, menuInflater);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17785a(C5471a aVar) {
        boolean z;
        Bundle bundle = new Bundle();
        bundle.putString("RAW_DATA", aVar.f19463b);
        bundle.putString("CROP_PATH", aVar.f19466e);
        bundle.putString("email_to_send", this.f19481e);
        bundle.putString("description", aVar.f19464c);
        if (!App.m25663l()) {
            C6620n.m32028a((Context) mo1318s(), C5462k.signature_stamp_info, C5462k.signature_stamp_no_sdcard);
            z = false;
        } else {
            z = true;
        }
        if (z && aVar.f19466e != null) {
            String f = m27290f(aVar.f19466e);
            if (f != null) {
                bundle.putString("uri", Uri.fromFile(new File(f)).toString());
            }
        }
        App.m25620a(new FragmentInfo(C5472b.class.getName(), bundle), (Fragment) this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo17786a(File file, File file2) {
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
    public void mo17787a(ArrayList<C5471a> arrayList) {
        String str = "";
        for (int i = 0; i < arrayList.size(); i++) {
            C5471a aVar = (C5471a) arrayList.get(i);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(aVar.f19466e);
            sb.append("|");
            sb.append(aVar.f19462a);
            sb.append("|");
            sb.append(aVar.f19464c.replace("\n", "\\n").replace("\r", "\\r"));
            sb.append("|");
            sb.append(aVar.f19465d);
            sb.append("|");
            sb.append(aVar.f19463b.replace("\n", "\\n").replace("\r", "\\r"));
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append("~");
            str = sb3.toString();
        }
        if (mo1318s() != null) {
            Editor edit = mo1318s().getSharedPreferences(this.f19480d, 0).edit();
            edit.putString("barcodeList", str);
            edit.apply();
        }
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C5458g.barcode_list_menu_scan) {
            m27288e();
            return true;
        } else if (itemId == C5458g.barcode_list_menu_clearlist) {
            m27280as();
            return true;
        } else if (itemId != C5458g.barcode_list_menu_send_all) {
            return super.mo1245a(menuItem);
        } else {
            m27286d();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1450b() {
        Bundle m = mo1307m();
        if (m != null) {
            this.f19480d = m.getString("pageid");
            this.f19483g = m.getBoolean("QRCODE_ENABLED");
            this.f19484h = m.getBoolean("BARCODE_ENABLED");
            this.f19481e = m.getString("EMAIL_TO_SEND");
        }
        this.f19482f = mo1320t().getString(C5462k.app_name);
        this.f19478b = (ListView) this.f19485i.findViewById(C5458g.barcode_scanner_listview);
        C5482b bVar = new C5482b(mo1318s(), C5460i.barcode_scanner_list_cell);
        bVar.mo17803a(mo1453c());
        this.f19478b.setAdapter(bVar);
        this.f19478b.setOnItemLongClickListener(new OnItemLongClickListener() {
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
                C5474c.this.m27289e(i);
                return true;
            }
        });
        if (this.f19483g) {
            this.f19478b.setOnItemClickListener(new OnItemClickListener() {
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    C5474c.this.mo17785a(((C5482b) adapterView.getAdapter()).mo17800a(i));
                }
            });
        }
        mo20292ay();
    }

    /* renamed from: c */
    public ArrayList<C5471a> mo1453c() {
        ArrayList<C5471a> arrayList = new ArrayList<>();
        if (mo1318s() != null) {
            String string = mo1318s().getSharedPreferences(this.f19480d, 0).getString("barcodeList", "");
            if (string.length() > 0) {
                String[] split = string.split("~");
                for (String split2 : split) {
                    String[] split3 = split2.split("\\|");
                    if (split3.length == 5) {
                        C5471a aVar = new C5471a(split3[0], split3[1], split3[2].replace("\\n", "\n").replace("\\r", "\r"), split3[3], split3[4].replace("\\n", "\n").replace("\\r", "\r"));
                        arrayList.add(aVar);
                    }
                }
            }
        }
        return arrayList;
    }
}
