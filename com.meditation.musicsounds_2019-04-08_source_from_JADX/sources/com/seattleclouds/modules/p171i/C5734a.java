package com.seattleclouds.modules.p171i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnShowListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore.Images.Media;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.content.C0452b;
import android.support.p023v7.app.C0765d;
import android.support.p023v7.app.C0765d.C0766a;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.modules.mosaic.C5876c;
import com.seattleclouds.modules.mosaic.ImgMetadata;
import com.seattleclouds.util.C6569aa;
import com.seattleclouds.util.C6569aa.C6570a;
import com.seattleclouds.util.C6598aq;
import com.seattleclouds.util.C6635q;
import com.seattleclouds.util.C6638s;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import org.apache.commons.p198io.C6730b;
import org.apache.commons.p198io.C6731c;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.seattleclouds.modules.i.a */
public class C5734a extends C6557s {

    /* renamed from: a */
    private static final String f20356a = C5734a.class.getCanonicalName();

    /* renamed from: ae */
    private String f20357ae = "";

    /* renamed from: af */
    private View f20358af = null;

    /* renamed from: b */
    private boolean f20359b = false;

    /* renamed from: c */
    private boolean f20360c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f20361d = "";

    /* renamed from: e */
    private String f20362e = "";
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f20363f = false;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C5749e f20364g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C6635q f20365h = new C6635q();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ArrayList<C5748d> f20366i;

    /* renamed from: com.seattleclouds.modules.i.a$a */
    static class C5744a extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a */
        private final InputStream f20381a;

        /* renamed from: b */
        private final File f20382b;

        /* renamed from: c */
        private final C5745a f20383c;

        /* renamed from: com.seattleclouds.modules.i.a$a$a */
        interface C5745a {
            /* renamed from: a */
            void mo18410a(File file, boolean z);
        }

        C5744a(InputStream inputStream, File file, C5745a aVar) {
            this.f20381a = inputStream;
            this.f20382b = file;
            this.f20383c = aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            try {
                C6730b.m32461a(this.f20381a, this.f20382b);
                return Boolean.valueOf(true);
            } catch (IOException unused) {
                return Boolean.valueOf(false);
            } finally {
                try {
                    this.f20381a.close();
                } catch (IOException unused2) {
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Boolean bool) {
            this.f20383c.mo18410a(this.f20382b, bool == null || bool.booleanValue());
        }
    }

    /* renamed from: com.seattleclouds.modules.i.a$b */
    static class C5746b {

        /* renamed from: a */
        ImageView f20384a;

        /* renamed from: b */
        TextView f20385b;

        C5746b() {
        }
    }

    /* renamed from: com.seattleclouds.modules.i.a$c */
    private class C5747c extends AsyncTask<String, Void, Bitmap> {

        /* renamed from: a */
        public int f20386a;

        /* renamed from: c */
        private ImageView f20388c;

        private C5747c() {
            this.f20386a = -1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Bitmap doInBackground(String... strArr) {
            return C5734a.this.m28317e(strArr[0]);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Bitmap bitmap) {
            if (this.f20388c != null && this.f20388c.getTag() != null && this.f20386a == ((Integer) this.f20388c.getTag()).intValue()) {
                this.f20388c.setImageBitmap(bitmap);
            }
        }

        /* renamed from: a */
        public void mo18417a(ImageView imageView) {
            this.f20388c = imageView;
        }
    }

    /* renamed from: com.seattleclouds.modules.i.a$d */
    private class C5748d {

        /* renamed from: a */
        public String f20389a;

        /* renamed from: b */
        public String f20390b;

        /* renamed from: c */
        boolean f20391c;

        C5748d(String str, String str2) {
            this.f20389a = str;
            this.f20390b = str2;
        }

        C5748d(String str, String str2, boolean z) {
            this.f20389a = str;
            this.f20390b = str2;
            this.f20391c = z;
        }
    }

    /* renamed from: com.seattleclouds.modules.i.a$e */
    private class C5749e extends BaseAdapter {
        private C5749e() {
        }

        public int getCount() {
            return C5734a.this.f20366i.size();
        }

        public Object getItem(int i) {
            return C5734a.this.f20366i.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C5746b bVar = new C5746b();
            if (view != null) {
                bVar = (C5746b) view.getTag();
            } else if (C5734a.this.mo1318s() != null) {
                view = C5734a.this.mo1318s().getLayoutInflater().inflate(C5460i.imagelist_row, viewGroup, false);
                bVar.f20384a = (ImageView) view.findViewById(C5458g.image);
                bVar.f20385b = (TextView) view.findViewById(C5458g.title);
                view.setTag(bVar);
            }
            C5748d dVar = (C5748d) C5734a.this.f20366i.get(i);
            String str = dVar.f20390b;
            bVar.f20384a.setImageBitmap(null);
            bVar.f20384a.setTag(Integer.valueOf(i));
            bVar.f20385b.setText(dVar.f20389a);
            if (C5734a.this.f20365h.mo20624a(str) == null) {
                C5747c cVar = new C5747c();
                cVar.f20386a = i;
                cVar.mo18417a(bVar.f20384a);
                cVar.execute(new String[]{str});
            } else {
                bVar.f20384a.setImageBitmap(C5734a.this.f20365h.mo20624a(str));
            }
            return view;
        }
    }

    /* renamed from: a */
    private String m28302a(Uri uri) {
        if (uri == null) {
            return null;
        }
        String[] strArr = {"_data"};
        if (mo1318s() != null) {
            Cursor query = mo1318s().getContentResolver().query(uri, strArr, null, null, null);
            if (query != null) {
                try {
                    int columnIndex = query.getColumnIndex("_data");
                    query.moveToFirst();
                    return query.getString(columnIndex);
                } catch (Exception unused) {
                } finally {
                    query.close();
                }
            }
        }
        return null;
    }

    /* renamed from: aA */
    private String m28305aA() {
        String format = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss", Locale.getDefault()).format(new Date());
        StringBuilder sb = new StringBuilder();
        sb.append(format);
        sb.append(".jpg");
        String sb2 = sb.toString();
        String replace = this.f20362e.replace(".html", "");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(App.m25661k());
        sb3.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb3.append(replace);
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb5.append(sb2);
        this.f20357ae = sb5.toString();
        File file = new File(sb4);
        if (!file.exists()) {
            file.mkdirs();
        }
        return this.f20357ae;
    }

    /* renamed from: as */
    private void m28306as() {
        if (mo1318s() != null) {
            new C0766a(mo1318s()).mo3060b(C5462k.imagelist_confirm_delete_all_dialog).mo3056a(false).mo3048a(17039379, (OnClickListener) new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    for (int size = C5734a.this.f20366i.size() - 1; size >= 0; size--) {
                        C5748d dVar = (C5748d) C5734a.this.f20366i.get(size);
                        File file = new File(dVar.f20390b);
                        if ((file.getAbsolutePath().contains(App.m25661k()) || dVar.f20391c) && !file.delete()) {
                            Toast.makeText(C5734a.this.mo1318s(), C5462k.imagelist_error_deleting_photo, 0).show();
                        } else {
                            C5734a.this.f20366i.remove(size);
                        }
                    }
                    C5734a.this.f20364g.notifyDataSetChanged();
                    C5734a.this.m28308az();
                }
            }).mo3061b(17039369, (OnClickListener) null).mo3068c();
        }
    }

    /* renamed from: at */
    private void m28307at() {
        String[] split;
        this.f20366i = new ArrayList<>();
        if (mo1318s() != null) {
            SharedPreferences sharedPreferences = mo1318s().getSharedPreferences(this.f20362e, 0);
            String string = sharedPreferences.getString("imageListKey", "");
            if (string.length() > 0) {
                for (String str : string.split("\\|")) {
                    File file = new File(str);
                    String string2 = sharedPreferences.getString(str, file.getName());
                    if (file.exists()) {
                        this.f20366i.add(new C5748d(string2, str));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: az */
    public void m28308az() {
        String str = "";
        if (mo1318s() != null) {
            Editor edit = mo1318s().getSharedPreferences(this.f20362e, 0).edit();
            for (int i = 0; i < this.f20366i.size(); i++) {
                String str2 = ((C5748d) this.f20366i.get(i)).f20390b;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(str2);
                str = sb.toString();
                edit.putString(str2, ((C5748d) this.f20366i.get(i)).f20389a);
                if (i < this.f20366i.size() - 1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append("|");
                    str = sb2.toString();
                }
            }
            edit.putString("imageListKey", str);
            edit.apply();
        }
    }

    /* renamed from: b */
    private void m28310b(Uri uri) {
        File file = new File(m28305aA());
        if (mo1318s() != null) {
            try {
                new C5744a(mo1318s().getContentResolver().openInputStream(uri), file, new C5745a() {
                    /* renamed from: a */
                    public void mo18410a(File file, boolean z) {
                        if (C5734a.this.mo1318s() != null) {
                            C5734a.this.f20366i.add(0, new C5748d(file.getName(), file.getAbsolutePath(), true));
                            C5734a.this.m28308az();
                            if (C5734a.this.f20364g != null) {
                                C5734a.this.f20364g.notifyDataSetChanged();
                            }
                            if (!z) {
                                Toast.makeText(C5734a.this.mo1318s(), C5462k.imagelist_error_adding_from_gallery, 0).show();
                            }
                        }
                    }
                }).execute(new Void[0]);
            } catch (FileNotFoundException unused) {
                Toast.makeText(mo1318s(), C5462k.imagelist_error_adding_from_gallery, 0).show();
            }
        }
    }

    /* renamed from: c */
    private void m28311c() {
        startActivityForResult(new Intent("android.intent.action.PICK", Media.EXTERNAL_CONTENT_URI), 1888);
    }

    /* access modifiers changed from: private */
    @SuppressLint({"SimpleDateFormat"})
    /* renamed from: d */
    public void m28314d() {
        if (!m28322f(31)) {
            if (!App.m25663l()) {
                Toast.makeText(mo1318s(), C5462k.imagelist_error_no_sdcard, 0).show();
                return;
            }
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            this.f20357ae = m28305aA();
            intent.putExtra("output", C6598aq.m31937a(new File(this.f20357ae)));
            startActivityForResult(intent, 2888);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m28316d(String str) {
        for (int i = 0; i < ":\"{}|,/;'[]\\*?<>".length(); i++) {
            if (str.indexOf(":\"{}|,/;'[]\\*?<>".charAt(i), 0) > 0) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public Bitmap m28317e(String str) {
        Bitmap a = this.f20365h.mo20624a(str);
        if (a == null) {
            try {
                Bitmap b = C6638s.m32077b(str, 100);
                try {
                    if (Math.max(b.getWidth(), b.getHeight()) > 100) {
                        a = C6638s.m32066a(b, 100, 100, true);
                    }
                } catch (Exception unused) {
                }
                a = b;
            } catch (Exception unused2) {
            }
        }
        this.f20365h.mo20626a(str, a);
        return a;
    }

    /* renamed from: e */
    private void m28319e() {
        Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
        intent.setType("image/*");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{this.f20361d});
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f20366i.iterator();
        while (it.hasNext()) {
            File file = new File(((C5748d) it.next()).f20390b);
            if (file.exists()) {
                arrayList.add(C6598aq.m31937a(file));
            }
        }
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        mo1230a(Intent.createChooser(intent, null));
    }

    /* renamed from: e */
    private void m28320e(final int i) {
        if (mo1318s() != null) {
            new C0766a(mo1318s()).mo3060b(C5462k.imagelist_delete_confirm_dialog).mo3056a(false).mo3048a(17039379, (OnClickListener) new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    C5748d dVar = (C5748d) C5734a.this.f20366i.get(i);
                    File file = new File(dVar.f20390b);
                    if ((file.getAbsolutePath().contains(App.m25661k()) || dVar.f20391c) && !file.delete()) {
                        Toast.makeText(C5734a.this.mo1318s(), C5462k.imagelist_error_deleting_photo, 0).show();
                        return;
                    }
                    C5734a.this.f20366i.remove(i);
                    C5734a.this.f20364g.notifyDataSetChanged();
                    C5734a.this.m28308az();
                }
            }).mo3061b(17039369, (OnClickListener) null).mo3068c();
        }
    }

    /* renamed from: f */
    private boolean m28322f(int i) {
        if (C6569aa.m31796a() && mo1318s() != null) {
            switch (i) {
                case 31:
                    boolean z = C0452b.m2065b((Context) mo1318s(), "android.permission.CAMERA") == 0;
                    if (!z) {
                        C6569aa.m31791a((Fragment) this, 31, "android.permission.CAMERA", new int[]{C5462k.imagelist_permission_camera_rational, C5462k.imagelist_permission_camera_required_toast});
                    }
                    return !z;
                case 32:
                    boolean z2 = C0452b.m2065b((Context) mo1318s(), "android.permission.READ_EXTERNAL_STORAGE") == 0;
                    if (this.f20359b) {
                        return z2;
                    }
                    if (!z2) {
                        this.f20360c = true;
                        this.f20359b = true;
                        C6569aa.m31791a((Fragment) this, 32, "android.permission.READ_EXTERNAL_STORAGE", new int[]{C5462k.imagelist_permission_storage_read_rational, C5462k.imagelist_permission_storage_read_toast});
                    }
                    return !z2;
            }
        }
        return false;
    }

    /* renamed from: g */
    private void m28324g(int i) {
        String d = C6731c.m32476d(((C5748d) this.f20366i.get(i)).f20389a);
        final String e = C6731c.m32477e(((C5748d) this.f20366i.get(i)).f20389a);
        final EditText editText = new EditText(mo1318s());
        editText.setText(d);
        editText.selectAll();
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        if (mo1318s() != null) {
            C0766a aVar = new C0766a(mo1318s());
            aVar.mo3047a(C5462k.imagelist_new_filename).mo3062b((View) editText).mo3048a(C5462k.save, (OnClickListener) null).mo3061b(C5462k.cancel, (OnClickListener) null);
            C0765d b = aVar.mo3065b();
            b.getWindow().setSoftInputMode(5);
            final C0765d dVar = b;
            final int i2 = i;
            C57406 r2 = new OnShowListener() {
                public void onShow(DialogInterface dialogInterface) {
                    dVar.mo3039a(-1).setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            C0367h hVar;
                            int i;
                            String obj = editText.getText().toString();
                            if (obj.length() != 0) {
                                if (C5734a.m28316d(obj)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(obj);
                                    sb.append(".");
                                    sb.append(e);
                                    String sb2 = sb.toString();
                                    boolean z = false;
                                    Iterator it = C5734a.this.f20366i.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (((C5748d) it.next()).f20389a.equalsIgnoreCase(sb2)) {
                                                Toast.makeText(C5734a.this.mo1318s(), C5462k.imagelist_filename_exists, 1).show();
                                                z = true;
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                    if (!z) {
                                        C5748d dVar = (C5748d) C5734a.this.f20366i.get(i2);
                                        File file = new File(dVar.f20390b);
                                        File file2 = new File(file.getParent(), sb2);
                                        if (file.renameTo(file2)) {
                                            dVar.f20390b = file2.getAbsolutePath();
                                            dVar.f20389a = sb2;
                                            C5734a.this.f20364g.notifyDataSetChanged();
                                            C5734a.this.m28308az();
                                            dVar.dismiss();
                                            return;
                                        }
                                        hVar = C5734a.this.mo1318s();
                                        i = C5462k.imagelist_rename_fail;
                                    } else {
                                        return;
                                    }
                                } else {
                                    hVar = C5734a.this.mo1318s();
                                    i = C5462k.imagelist_invalid_filename;
                                }
                                Toast.makeText(hVar, i, 1).show();
                            }
                        }
                    });
                }
            };
            b.setOnShowListener(r2);
            b.show();
        }
    }

    /* renamed from: J */
    public void mo1200J() {
        super.mo1200J();
        new Handler().postDelayed(new Runnable() {
            public void run() {
                if (C5734a.this.f20363f) {
                    C5734a.this.f20363f = false;
                    C5734a.this.m28314d();
                }
            }
        }, 1000);
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f20358af = layoutInflater.inflate(C5460i.imagelist_activity, viewGroup, false);
        Bundle m = mo1307m();
        if (m != null) {
            String string = m.getString("EMAIL_TO_SEND");
            if (string != null) {
                this.f20361d = string;
            }
            String string2 = m.getString("PAGE_ID");
            if (string2 != null) {
                this.f20362e = string2;
            }
            this.f20363f = m.getBoolean("PICTURE_ON_OPEN");
        }
        if (bundle != null && bundle.containsKey("pickOnOpen")) {
            this.f20363f = bundle.getBoolean("pickOnOpen");
        }
        mo1450b();
        return this.f20358af;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        if (r5.f20364g != null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        if (r5.f20364g != null) goto L_0x0036;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1222a(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            r0 = 0
            r5.f20363f = r0
            r1 = 1888(0x760, float:2.646E-42)
            r2 = -1
            if (r6 == r1) goto L_0x003c
            r1 = 2888(0xb48, float:4.047E-42)
            if (r6 == r1) goto L_0x000d
            goto L_0x007a
        L_0x000d:
            r1 = 31
            boolean r1 = r5.m28322f(r1)
            if (r1 == 0) goto L_0x0016
            return
        L_0x0016:
            if (r7 != r2) goto L_0x007a
            java.util.ArrayList<com.seattleclouds.modules.i.a$d> r1 = r5.f20366i
            com.seattleclouds.modules.i.a$d r2 = new com.seattleclouds.modules.i.a$d
            java.io.File r3 = new java.io.File
            java.lang.String r4 = r5.f20357ae
            r3.<init>(r4)
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = r5.f20357ae
            r2.<init>(r3, r4)
            r1.add(r0, r2)
            r5.m28308az()
            com.seattleclouds.modules.i.a$e r0 = r5.f20364g
            if (r0 == 0) goto L_0x007a
        L_0x0036:
            com.seattleclouds.modules.i.a$e r0 = r5.f20364g
            r0.notifyDataSetChanged()
            goto L_0x007a
        L_0x003c:
            if (r7 != r2) goto L_0x007a
            android.net.Uri r1 = r8.getData()
            java.lang.String r2 = r5.m28302a(r1)
            if (r2 != 0) goto L_0x004c
            r5.m28310b(r1)
            return
        L_0x004c:
            java.io.File r1 = new java.io.File
            r1.<init>(r2)
            boolean r3 = r1.exists()
            if (r3 == 0) goto L_0x006d
            java.lang.String r1 = r1.getName()
            java.util.ArrayList<com.seattleclouds.modules.i.a$d> r3 = r5.f20366i
            com.seattleclouds.modules.i.a$d r4 = new com.seattleclouds.modules.i.a$d
            r4.<init>(r1, r2)
            r3.add(r0, r4)
            r5.m28308az()
            com.seattleclouds.modules.i.a$e r0 = r5.f20364g
            if (r0 == 0) goto L_0x007a
            goto L_0x0036
        L_0x006d:
            android.support.v4.app.h r1 = r5.mo1318s()
            int r2 = com.seattleclouds.C5451m.C5462k.imagelist_error_adding_from_gallery
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r2, r0)
            r0.show()
        L_0x007a:
            super.mo1222a(r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.p171i.C5734a.mo1222a(int, int, android.content.Intent):void");
    }

    /* renamed from: a */
    public void mo1224a(int i, String[] strArr, int[] iArr) {
        switch (i) {
            case 31:
                if (!C6569aa.m31801a(strArr, iArr, "android.permission.CAMERA")) {
                    new Handler(Looper.myLooper()).postDelayed(new Runnable() {
                        public void run() {
                            if (C5734a.this.mo1318s() != null) {
                                C6570a.m31804a(false, C5462k.imagelist_permission_camera_denied).mo1448a(C5734a.this.mo1318s().mo1469g(), "permissionDialog");
                            }
                        }
                    }, 400);
                    return;
                } else {
                    Toast.makeText(mo1318s(), C5462k.common_permission_granted, 0).show();
                    return;
                }
            case 32:
                this.f20359b = false;
                if (!C6569aa.m31801a(strArr, iArr, "android.permission.READ_EXTERNAL_STORAGE")) {
                    new Handler(Looper.myLooper()).postDelayed(new Runnable() {
                        public void run() {
                            if (C5734a.this.mo1318s() != null) {
                                C6570a.m31804a(false, C5462k.imagelist_permission_storage_read_denied).mo1448a(C5734a.this.mo1318s().mo1469g(), "permissionDialog");
                            }
                        }
                    }, 400);
                    return;
                }
                mo1450b();
                Toast.makeText(mo1318s(), C5462k.common_permission_granted, 0).show();
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        if (bundle != null) {
            this.f20359b = bundle.getBoolean("STORAGE_PERMISSION_DIALOG_OPEN_KEY", false);
        }
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(C5461j.imagelist_menu, menu);
        super.mo1240a(menu, menuInflater);
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (z && !this.f20360c) {
            m28322f(32);
        }
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C5458g.imagelist_add_from_gallery) {
            m28311c();
            return true;
        } else if (itemId == C5458g.imagelist_add_from_camera) {
            m28314d();
            return true;
        } else if (itemId == C5458g.imagelist_send_all) {
            m28319e();
            return true;
        } else if (itemId != C5458g.imagelist_delete_all) {
            return super.mo1245a(menuItem);
        } else {
            m28306as();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1450b() {
        m28307at();
        ListView listView = (ListView) this.f20358af.findViewById(C5458g.imageListView);
        this.f20364g = new C5749e();
        listView.setAdapter(this.f20364g);
        mo1241a((View) listView);
        listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                ArrayList arrayList = new ArrayList();
                Iterator it = C5734a.this.f20366i.iterator();
                while (it.hasNext()) {
                    C5748d dVar = (C5748d) it.next();
                    ImgMetadata imgMetadata = new ImgMetadata();
                    imgMetadata.f20779a = dVar.f20389a;
                    imgMetadata.f20780b = dVar.f20390b;
                    imgMetadata.f20781c = "";
                    imgMetadata.f20782d = true;
                    arrayList.add(imgMetadata);
                }
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("mosaicimages", arrayList);
                bundle.putInt("selectedIndex", i);
                bundle.putString("EMAIL_TO_SEND", C5734a.this.f20361d);
                App.m25620a(new FragmentInfo(C5876c.class.getName(), bundle), (Fragment) C5734a.this);
            }
        });
    }

    /* renamed from: b */
    public boolean mo1271b(MenuItem menuItem) {
        AdapterContextMenuInfo adapterContextMenuInfo = (AdapterContextMenuInfo) menuItem.getMenuInfo();
        int itemId = menuItem.getItemId();
        if (itemId == C5458g.itemlist_delete) {
            m28320e(adapterContextMenuInfo.position);
            return true;
        } else if (itemId != C5458g.itemlist_rename) {
            return super.mo1271b(menuItem);
        } else {
            m28324g(adapterContextMenuInfo.position);
            return true;
        }
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        super.mo1282e(bundle);
        bundle.putBoolean("pickOnOpen", this.f20363f);
        bundle.putBoolean("STORAGE_PERMISSION_DIALOG_OPEN_KEY", this.f20359b);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        contextMenu.setHeaderTitle(((C5748d) this.f20366i.get(((AdapterContextMenuInfo) contextMenuInfo).position)).f20389a);
        if (mo1318s() != null) {
            mo1318s().getMenuInflater().inflate(C5461j.imagelist_context, contextMenu);
        }
    }
}
