package com.seattleclouds.previewer.appmart.order.p191c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore.Images.Media;
import android.support.design.widget.TextInputLayout;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.content.C0452b;
import android.util.Base64;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import com.google.android.gms.ads.AdRequest;
import com.seattleclouds.C5451m.C5453b;
import com.seattleclouds.C5451m.C5455d;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.previewer.PreviewerTemplatesActivity;
import com.seattleclouds.previewer.appmart.order.C6387b;
import com.seattleclouds.previewer.appmart.order.colorpicker.C6440b;
import com.seattleclouds.previewer.appmart.order.colorpickerpalette.C6443a;
import com.seattleclouds.previewer.appmart.order.p190b.C6388a;
import com.seattleclouds.previewer.data.SCTemplateApp;
import com.seattleclouds.util.C6569aa;
import com.seattleclouds.util.C6569aa.C6570a;
import com.seattleclouds.util.C6638s;
import java.io.ByteArrayOutputStream;
import java.io.File;
import org.apache.commons.p198io.C6731c;

/* renamed from: com.seattleclouds.previewer.appmart.order.c.b */
public class C6402b extends C6557s {

    /* renamed from: a */
    private boolean f22769a = false;

    /* renamed from: b */
    private EditText f22770b;

    /* renamed from: c */
    private EditText f22771c;

    /* renamed from: d */
    private EditText f22772d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f22773e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f22774f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C6388a f22775g;

    /* renamed from: h */
    private EditText f22776h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public TextInputLayout f22777i;

    /* renamed from: com.seattleclouds.previewer.appmart.order.c.b$a */
    public static class C6410a {

        /* renamed from: a */
        public String f22789a;

        /* renamed from: b */
        public long f22790b;

        /* renamed from: c */
        public String f22791c;

        /* renamed from: d */
        public String f22792d;

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("name : ");
            sb.append(this.f22789a);
            sb.append(" ; size : ");
            sb.append(this.f22790b);
            sb.append(" ; path : ");
            sb.append(this.f22792d);
            sb.append(" ; mime : ");
            sb.append(this.f22791c);
            return sb.toString();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008a, code lost:
        if (r1 == null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0093, code lost:
        if (r1 != null) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0095, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0099, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.seattleclouds.previewer.appmart.order.p191c.C6402b.C6410a m31138a(android.content.Context r7, android.net.Uri r8) {
        /*
            com.seattleclouds.previewer.appmart.order.c.b$a r0 = new com.seattleclouds.previewer.appmart.order.c.b$a
            r0.<init>()
            java.lang.String r1 = "file"
            java.lang.String r2 = r8.getScheme()
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x002d
            java.io.File r7 = new java.io.File
            java.lang.String r8 = r8.getPath()
            r7.<init>(r8)
            java.lang.String r8 = r7.getName()
            r0.f22789a = r8
            long r1 = r7.length()
            r0.f22790b = r1
            java.lang.String r7 = r7.getPath()
            r0.f22792d = r7
            return r0
        L_0x002d:
            android.content.ContentResolver r7 = r7.getContentResolver()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r7
            r2 = r8
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)
            java.lang.String r7 = r7.getType(r8)
            r0.f22791c = r7
            if (r1 == 0) goto L_0x0093
            boolean r7 = r1.moveToFirst()     // Catch:{ Exception -> 0x0080 }
            if (r7 == 0) goto L_0x0093
            java.lang.String r7 = "_size"
            int r7 = r1.getColumnIndex(r7)     // Catch:{ Exception -> 0x0080 }
            java.lang.String r8 = "_display_name"
            int r8 = r1.getColumnIndex(r8)     // Catch:{ Exception -> 0x0080 }
            java.lang.String r8 = r1.getString(r8)     // Catch:{ Exception -> 0x0080 }
            r0.f22789a = r8     // Catch:{ Exception -> 0x0080 }
            boolean r8 = r1.isNull(r7)     // Catch:{ Exception -> 0x0080 }
            if (r8 != 0) goto L_0x0068
            long r7 = r1.getLong(r7)     // Catch:{ Exception -> 0x0080 }
            r0.f22790b = r7     // Catch:{ Exception -> 0x0080 }
            goto L_0x006c
        L_0x0068:
            r7 = -1
            r0.f22790b = r7     // Catch:{ Exception -> 0x0080 }
        L_0x006c:
            java.lang.String r7 = "_data"
            int r7 = r1.getColumnIndexOrThrow(r7)     // Catch:{ Exception -> 0x0078 }
            java.lang.String r7 = r1.getString(r7)     // Catch:{ Exception -> 0x0078 }
            r0.f22792d = r7     // Catch:{ Exception -> 0x0078 }
        L_0x0078:
            if (r1 == 0) goto L_0x007d
            r1.close()
        L_0x007d:
            return r0
        L_0x007e:
            r7 = move-exception
            goto L_0x008d
        L_0x0080:
            r7 = move-exception
            java.lang.String r8 = "FileMetaData"
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x007e }
            android.util.Log.e(r8, r7)     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x0098
            goto L_0x0095
        L_0x008d:
            if (r1 == 0) goto L_0x0092
            r1.close()
        L_0x0092:
            throw r7
        L_0x0093:
            if (r1 == 0) goto L_0x0098
        L_0x0095:
            r1.close()
        L_0x0098:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.previewer.appmart.order.p191c.C6402b.m31138a(android.content.Context, android.net.Uri):com.seattleclouds.previewer.appmart.order.c.b$a");
    }

    /* renamed from: a */
    public static String m31139a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            System.gc();
            return Base64.encodeToString(byteArray, 0);
        } catch (OutOfMemoryError unused) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            C6638s.m32066a(bitmap, (int) AdRequest.MAX_CONTENT_URL_LENGTH, (int) AdRequest.MAX_CONTENT_URL_LENGTH, false).compress(CompressFormat.PNG, 50, byteArrayOutputStream2);
            return Base64.encodeToString(byteArrayOutputStream2.toByteArray(), 0);
        }
    }

    /* renamed from: a */
    private void m31140a(int i, int i2, String str, int i3) {
        if (mo1325x() != null) {
            C6440b b = C6440b.m31221b(i, i3);
            b.mo1238a((Fragment) this, i2);
            b.mo1448a(mo1325x().mo1323v(), str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m31141a(int i, int[] iArr, int i2, int i3, int i4, String str) {
        if (mo1325x() != null) {
            C6443a a = C6443a.m31235a(i, iArr, i2, i3, iArr.length);
            a.mo1238a((Fragment) this, i4);
            a.mo1448a(mo1325x().mo1323v(), str);
        }
    }

    /* renamed from: a */
    private boolean m31143a(EditText editText, TextInputLayout textInputLayout) {
        if (editText.getText() != null) {
            String obj = editText.getText().toString();
            if (!obj.isEmpty() && obj.trim().length() > 0) {
                return false;
            }
        }
        textInputLayout.setError(mo1320t().getString(C5462k.new_order_error_text_appearance));
        editText.getParent().requestChildFocus(editText, editText);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int[] m31145a(int[] iArr, int i) {
        int length = iArr.length - 1;
        iArr[length] = i;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                iArr[length] = -1;
            }
        }
        return iArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m31148c() {
        startActivityForResult(new Intent("android.intent.action.PICK", Media.EXTERNAL_CONTENT_URI), 102);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m31150d() {
        if (C6569aa.m31796a() && mo1318s() != null && !this.f22769a) {
            this.f22769a = C0452b.m2065b((Context) mo1318s(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
            if (!this.f22769a) {
                C6569aa.m31793a((Fragment) this, mo1325x(), 100, "android.permission.WRITE_EXTERNAL_STORAGE", new int[]{C5462k.new_order_design_permission_rationale_location, C5462k.new_order_permission_required_toast});
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        TypedValue typedValue = new TypedValue();
        this.f22775g = C6388a.m31014a();
        final ArrayAdapter arrayAdapter = new ArrayAdapter(mo1318s(), C5460i.new_order_spinner_item, new String[]{mo1219a(C5462k.new_order_design_select_theme), mo1219a(C5462k.new_order_design_light_theme), mo1219a(C5462k.new_order_design_dark_theme)});
        View inflate = layoutInflater.inflate(C5460i.fragment_new_order_design, viewGroup, false);
        String t = this.f22775g.mo19929t();
        if (t == null || t.isEmpty()) {
            mo1318s().getTheme().resolveAttribute(C5453b.colorPrimary, typedValue, true);
            i = typedValue.data;
        } else {
            i = Color.parseColor(t);
        }
        this.f22773e = i;
        String u = this.f22775g.mo19931u();
        if (u == null || u.isEmpty()) {
            mo1318s().getTheme().resolveAttribute(C5453b.colorAccent, typedValue, true);
            i2 = typedValue.data;
        } else {
            i2 = Color.parseColor(u);
        }
        this.f22774f = i2;
        final int[] iArr = {C6387b.m31013b(mo1316q(), C5455d.red_color_picker_palette), C6387b.m31013b(mo1316q(), C5455d.pink_color_picker_palette), C6387b.m31013b(mo1316q(), C5455d.purple_color_picker_palette), C6387b.m31013b(mo1316q(), C5455d.deep_purple_color_picker_palette), C6387b.m31013b(mo1316q(), C5455d.indigo_color_picker_palette), C6387b.m31013b(mo1316q(), C5455d.blue_color_picker_palette), C6387b.m31013b(mo1316q(), C5455d.light_blue_color_picker_palette), C6387b.m31013b(mo1316q(), C5455d.cyan_color_picker_palette), C6387b.m31013b(mo1316q(), C5455d.teal_color_picker_palette), C6387b.m31013b(mo1316q(), C5455d.green_color_picker_palette), C6387b.m31013b(mo1316q(), C5455d.light_green_color_picker_palette), C6387b.m31013b(mo1316q(), C5455d.lime_color_picker_palette), C6387b.m31013b(mo1316q(), C5455d.yellow_color_picker_palette), C6387b.m31013b(mo1316q(), C5455d.amber_color_picker_palette), C6387b.m31013b(mo1316q(), C5455d.orange_color_picker_palette), C6387b.m31013b(mo1316q(), C5455d.deep_orange_color_picker_palette), C6387b.m31013b(mo1316q(), C5455d.brown_color_picker_palette), C6387b.m31013b(mo1316q(), C5455d.ic_color), C6387b.m31013b(mo1316q(), C5455d.blue_grey_color_picker_palette)};
        arrayAdapter.setDropDownViewResource(17367049);
        Spinner spinner = (Spinner) inflate.findViewById(C5458g.spinner_theme_order);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                String str = (String) adapterView.getItemAtPosition(i);
                if (!str.equals(arrayAdapter.getItem(0))) {
                    C6402b.this.f22775g.mo19922p(str);
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f22776h = (EditText) inflate.findViewById(C5458g.template_order);
        this.f22776h.setKeyListener(null);
        this.f22776h.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C6402b.this.f22777i.setError(null);
                Bundle bundle = new Bundle();
                bundle.putBoolean("SELECT_TEMPLATE", true);
                Intent a = PreviewerTemplatesActivity.m30893a((Context) C6402b.this.mo1318s());
                a.putExtras(bundle);
                C6402b.this.startActivityForResult(a, 106);
            }
        });
        this.f22777i = (TextInputLayout) inflate.findViewById(C5458g.template_order_error);
        this.f22770b = (EditText) inflate.findViewById(C5458g.edit_text_pick_primary_color_order);
        this.f22770b.setKeyListener(null);
        this.f22770b.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C6402b.this.m31141a(C5462k.new_order_design_dialog_title_primary, C6402b.this.m31145a(iArr, C6402b.this.f22773e), C6402b.this.f22773e, 4, 103, "colorPickerPalettePrimary");
            }
        });
        this.f22771c = (EditText) inflate.findViewById(C5458g.edit_text_pick_your_accent_color_order);
        this.f22771c.setKeyListener(null);
        this.f22771c.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C6402b.this.m31141a(C5462k.new_order_design_dialog_title_accent, C6402b.this.m31145a(iArr, C6402b.this.f22774f), C6402b.this.f22774f, 4, 104, "colorPickerPaletteAccent");
            }
        });
        this.f22772d = (EditText) inflate.findViewById(C5458g.edit_text_chose_file_order);
        this.f22772d.setKeyListener(null);
        this.f22772d.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (!C6402b.this.m31150d()) {
                    C6402b.this.m31148c();
                }
            }
        });
        return inflate;
    }

    /* renamed from: a */
    public void mo1222a(int i, int i2, Intent intent) {
        super.mo1222a(i, i2, intent);
        if (i2 == -1) {
            if (i == 103) {
                String stringExtra = intent.getStringExtra("TAG_SELECTED_COLOR");
                if (!stringExtra.isEmpty()) {
                    this.f22770b.setText(stringExtra);
                    this.f22775g.mo19924q(stringExtra);
                    this.f22773e = Color.parseColor(stringExtra);
                } else {
                    m31140a(this.f22773e, 103, "colorPickerPrimary", C5462k.new_order_design_dialog_title_accent);
                }
            }
            if (i == 104) {
                String stringExtra2 = intent.getStringExtra("TAG_SELECTED_COLOR");
                if (!stringExtra2.isEmpty()) {
                    this.f22771c.setText(stringExtra2);
                    this.f22775g.mo19926r(stringExtra2);
                    this.f22774f = Color.parseColor(stringExtra2);
                } else {
                    m31140a(this.f22774f, 104, "colorPickerAccent", C5462k.new_order_design_dialog_title_accent);
                }
            }
            if (i == 102) {
                final Uri data = intent.getData();
                if (data != null) {
                    C6410a a = m31138a(mo1316q(), data);
                    if (!(a == null || a.f22789a == null)) {
                        String f = C6731c.m32478f(a.f22789a);
                        this.f22772d.setText(f);
                        this.f22775g.mo19928s(f);
                        if (a.f22792d != null) {
                            data = Uri.fromFile(new File(a.f22792d));
                        }
                        new Thread(new Runnable() {
                            public void run() {
                                Bitmap a = C6638s.m32067a(data, 1024, (Activity) C6402b.this.mo1318s());
                                if (a != null) {
                                    C6402b.this.f22775g.mo19930t(C6402b.m31139a(a));
                                    return;
                                }
                                C6402b.this.f22775g.mo19928s(null);
                            }
                        }).start();
                    }
                }
            }
        }
        if (i == 106) {
            PreviewerTemplatesActivity.f22578n = false;
            if (i2 == -1) {
                SCTemplateApp sCTemplateApp = (SCTemplateApp) intent.getExtras().getParcelable("result");
                if (sCTemplateApp != null) {
                    this.f22776h.setText(sCTemplateApp.mo20144e());
                    this.f22775g.mo19920o(sCTemplateApp.mo20144e());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1224a(int i, String[] strArr, int[] iArr) {
        if (i == 100) {
            this.f22769a = C6569aa.m31801a(strArr, iArr, "android.permission.WRITE_EXTERNAL_STORAGE");
            if (!this.f22769a) {
                new Handler(Looper.myLooper()).postDelayed(new Runnable() {
                    public void run() {
                        if (C6402b.this.mo1318s() != null) {
                            C6570a.m31804a(false, C5462k.new_order_design_permission_denied).mo1448a(C6402b.this.mo1318s().mo1469g(), "permissionDialog");
                        }
                    }
                }, 400);
                return;
            }
            Toast.makeText(mo1318s(), C5462k.common_permission_granted, 0).show();
            m31148c();
        }
    }

    /* renamed from: b */
    public boolean mo1450b() {
        return m31143a(this.f22776h, this.f22777i);
    }
}
