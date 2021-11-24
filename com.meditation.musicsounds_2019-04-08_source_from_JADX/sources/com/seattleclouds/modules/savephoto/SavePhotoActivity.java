package com.seattleclouds.modules.savephoto;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.location.Location;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import com.google.android.p099a.C2402a;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6348n;
import com.seattleclouds.location.C5395a;
import com.seattleclouds.location.C5415d;
import com.seattleclouds.location.C5431g;
import com.seattleclouds.location.C5431g.C5433b;
import com.seattleclouds.location.LocationDetectorActivity;
import com.seattleclouds.util.C6598aq;
import com.seattleclouds.util.C6608d;
import com.seattleclouds.util.C6609e;
import com.seattleclouds.util.C6620n;
import com.seattleclouds.util.C6620n.C6629b;
import com.seattleclouds.util.C6638s;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import p194nl.siegmann.epublib.domain.TableOfContents;

public class SavePhotoActivity extends C6348n {

    /* renamed from: n */
    private static final String f22227n = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static int f22228p = 1;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static int f22229q = 1;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public Button f22230A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public Button f22231B;

    /* renamed from: C */
    private String f22232C;

    /* renamed from: D */
    private String[] f22233D;

    /* renamed from: E */
    private String f22234E = "com.seattleclouds.modules.savephoto";

    /* renamed from: F */
    private String f22235F = "";

    /* renamed from: G */
    private C5431g f22236G;

    /* renamed from: H */
    private NumberFormat f22237H;

    /* renamed from: I */
    private C5395a f22238I;

    /* renamed from: J */
    private boolean f22239J = false;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public boolean f22240K = true;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public Location f22241L = new Location("code");
    /* access modifiers changed from: private */

    /* renamed from: M */
    public Location f22242M = new Location("code");
    /* access modifiers changed from: private */

    /* renamed from: N */
    public Date f22243N = new Date();
    /* access modifiers changed from: private */

    /* renamed from: O */
    public boolean f22244O = false;

    /* renamed from: o */
    private Map<String, String> f22245o = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public String f22246r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public File f22247s;

    /* renamed from: t */
    private EditText f22248t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public EditText f22249u;

    /* renamed from: v */
    private CheckBox f22250v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public Spinner f22251w;

    /* renamed from: x */
    private Spinner f22252x;

    /* renamed from: y */
    private EditText f22253y;

    /* renamed from: z */
    private EditText f22254z;

    /* renamed from: com.seattleclouds.modules.savephoto.SavePhotoActivity$a */
    private class C6275a extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: b */
        private Long f22267b;

        private C6275a() {
            this.f22267b = null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            String str = "pool.ntp.org";
            C2402a aVar = new C2402a();
            boolean z = false;
            int i = 0;
            while (!z) {
                int i2 = i + 1;
                if (i >= 10) {
                    break;
                }
                z = aVar.mo8514a(str, 300);
                if (z) {
                    this.f22267b = Long.valueOf((aVar.mo8513a() + SystemClock.elapsedRealtime()) - aVar.mo8515b());
                }
                i = i2;
            }
            return Boolean.valueOf(z);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Boolean bool) {
            SavePhotoActivity.this.f22244O = bool.booleanValue();
            if (SavePhotoActivity.this.f22244O) {
                SavePhotoActivity.this.f22243N = new Date(this.f22267b.longValue());
            }
            SavePhotoActivity.this.f22230A.setEnabled(true);
            SavePhotoActivity.this.f22231B.setEnabled(true);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            SavePhotoActivity.this.f22243N = new Date();
            SavePhotoActivity.this.f22230A.setEnabled(false);
            SavePhotoActivity.this.f22231B.setEnabled(false);
        }
    }

    /* renamed from: com.seattleclouds.modules.savephoto.SavePhotoActivity$b */
    private class C6276b extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: b */
        private ProgressDialog f22269b;

        private C6276b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            SavePhotoActivity.this.m30496w();
            System.gc();
            Options options = new Options();
            int i = 1;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(SavePhotoActivity.this.f22247s.getAbsolutePath(), options);
            boolean z = options.outWidth < options.outHeight;
            int m = (z ? SavePhotoActivity.f22228p : SavePhotoActivity.f22229q) - 1;
            if (m >= 1) {
                i = m;
            }
            boolean z2 = false;
            while (true) {
                if (i >= 12) {
                    break;
                }
                try {
                    z2 = SavePhotoActivity.this.m30478e(i);
                } catch (OutOfMemoryError unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OutOfMemoryError while loading or processing bitmap of size: ");
                    sb.append(options.outWidth);
                    sb.append(", ");
                    sb.append(options.outHeight);
                    sb.append(", with sampleSize ");
                    sb.append(i);
                    Log.i("SavePhotoActivity", sb.toString());
                    z2 = false;
                }
                if (!z2) {
                    i++;
                } else if (z) {
                    SavePhotoActivity.f22228p = i;
                } else {
                    SavePhotoActivity.f22229q = i;
                }
            }
            return Boolean.valueOf(z2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Boolean bool) {
            this.f22269b.dismiss();
            if (bool.booleanValue()) {
                if (SavePhotoActivity.this.f22247s != null) {
                    SavePhotoActivity.this.f22247s.delete();
                }
                SavePhotoActivity.this.m30493t();
                SavePhotoActivity.this.m30492s();
                return;
            }
            Toast.makeText(SavePhotoActivity.this, C5462k.save_photo_error_saving, 1).show();
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            SavePhotoActivity.this.m30494u();
            this.f22269b = new ProgressDialog(SavePhotoActivity.this);
            this.f22269b.setMessage(SavePhotoActivity.this.getResources().getString(C5462k.save_photo_saving_progress));
            this.f22269b.setCancelable(false);
            this.f22269b.show();
        }
    }

    /* renamed from: a */
    private Bitmap m30450a(Bitmap bitmap, String str, String str2, String str3, String str4) {
        float f;
        int i;
        String str5 = str2;
        String str6 = str3;
        String str7 = str4;
        boolean z = (str5 != null) & (str5.equals("") ^ true);
        boolean z2 = (str6 != null) & (str6.equals("") ^ true);
        boolean z3 = (str7 != null) & (str7.equals("") ^ true);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i2 = height < width ? height / 25 : width / 25;
        String[] split = str.split("\\n");
        int length = split.length * i2;
        Bitmap createBitmap = Bitmap.createBitmap(width, height + length + (z ? i2 : 0) + ((z2 || z3) ? i2 : 0), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        int height2 = canvas.getHeight();
        int width2 = canvas.getWidth();
        float f2 = (float) length;
        Bitmap bitmap2 = createBitmap;
        canvas.drawBitmap(bitmap, 0.0f, f2, paint);
        bitmap.recycle();
        paint.setColor(-16777216);
        float f3 = (float) width2;
        int i3 = width2;
        Paint paint2 = paint;
        canvas.drawRect(0.0f, 0.0f, f3, f2, paint2);
        Paint paint3 = paint2;
        paint3.setColor(-1);
        float f4 = (float) i2;
        float f5 = f4 / 1.3f;
        float f6 = f5 / 4.0f;
        float f7 = f4;
        int i4 = 0;
        Typeface create = Typeface.create(Typeface.MONOSPACE, 0);
        paint3.setTextSize(f5);
        paint3.setTypeface(create);
        paint3.setTextAlign(Align.CENTER);
        float f8 = f3 - f6;
        float f9 = f5;
        while (i4 < split.length) {
            String a = m30453a(paint3, split[i4], f8);
            String[] strArr = split;
            canvas.drawText(a, (float) (i3 / 2), ((float) ((i2 * i4) + (m30451a(paint3, a).top * -1))) + f6, paint3);
            i4++;
            split = strArr;
            String str8 = str4;
        }
        if (z) {
            paint3.setColor(-16777216);
            int i5 = height2 - i2;
            f = f9;
            canvas.drawRect(0.0f, (float) i5, f3, (float) height2, paint3);
            paint3.setColor(-1);
            canvas.drawText(m30453a(paint3, str5, f8), (float) (i3 / 2), ((float) (i5 + (m30451a(paint3, str5).top * -1))) + f6, paint3);
        } else {
            f = f9;
        }
        float f10 = (float) height2;
        if (z) {
            f10 = (float) (height2 - i2);
        }
        if (z2 || z3) {
            paint3.setColor(-16777216);
            canvas.drawRect(0.0f, f10 - f7, f3, f10, paint3);
        }
        float f11 = f / 3.0f;
        float f12 = (((float) (i3 / 2)) - (f11 / 2.0f)) - f11;
        if (z2) {
            i = -1;
            paint3.setColor(-1);
            paint3.setTextAlign(Align.LEFT);
            String a2 = m30453a(paint3, str6, f12);
            canvas.drawText(a2, f11, (f10 - f7) + ((float) (m30451a(paint3, a2).top * -1)) + f6, paint3);
        } else {
            i = -1;
        }
        if (z3) {
            paint3.setColor(i);
            paint3.setTextAlign(Align.RIGHT);
            String a3 = m30453a(paint3, str4, f12);
            canvas.drawText(a3, f3 - f11, (f10 - f7) + ((float) (m30451a(paint3, a3).top * -1)) + f6, paint3);
        }
        return bitmap2;
    }

    /* renamed from: a */
    private Rect m30451a(Paint paint, String str) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect;
    }

    /* renamed from: a */
    private String m30453a(Paint paint, String str, float f) {
        int breakText = paint.breakText(str, true, f, null);
        if (str.length() <= breakText) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, breakText - 1));
        sb.append("…");
        return sb.toString();
    }

    /* renamed from: a */
    private String m30454a(Location location) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22237H.format(location.getLatitude()));
        sb.append(", ");
        sb.append(this.f22237H.format(location.getLongitude()));
        return sb.toString();
    }

    /* renamed from: a */
    private String m30455a(Date date) {
        return DateFormat.getDateTimeInstance(3, 2).format(date).replaceAll("[|\\\\?*<\\\":>+\\[\\]/']", "-");
    }

    /* renamed from: a */
    private void m30457a(Spinner spinner, String str) {
        if (str != null) {
            for (int i = 0; i < spinner.getAdapter().getCount(); i++) {
                if (((String) spinner.getAdapter().getItem(i)).equalsIgnoreCase(str)) {
                    spinner.setSelection(i);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m30460a(File file) {
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(file));
        sendBroadcast(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m30461a(String str) {
        File file = new File(this.f22246r);
        file.mkdirs();
        ArrayList a = C6609e.m31965a((T[]) file.list(new FilenameFilter() {
            public boolean accept(File file, String str) {
                return new File(file, str).isDirectory();
            }
        }));
        Collections.sort(a);
        if (a.isEmpty()) {
            a.add("");
        }
        a.add(getResources().getString(C5462k.save_photo_create_new_album));
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, a);
        arrayAdapter.setDropDownViewResource(17367049);
        this.f22251w.setAdapter(arrayAdapter);
        m30457a(this.f22251w, str);
    }

    /* renamed from: a */
    private boolean m30462a(double d, double d2) {
        return C5415d.m27090a(this.f22242M.getLatitude(), this.f22242M.getLongitude(), d, d2, true) <= 0.056818181818181816d;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m30467b(Location location) {
        this.f22249u.setText(m30454a(location));
        if (this.f22238I == null) {
            this.f22238I = new C5395a(this, new C6608d() {
                /* renamed from: a */
                public void mo16855a(Object obj) {
                    if (obj == null || !(obj instanceof String)) {
                        SavePhotoActivity.this.m30474c(SavePhotoActivity.this.f22249u.getText().toString());
                    } else {
                        SavePhotoActivity.this.m30474c((String) obj);
                    }
                }
            });
        }
        this.f22238I.mo17703a(location);
    }

    /* renamed from: b */
    private void m30469b(String str) {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, this.f22233D);
        arrayAdapter.setDropDownViewResource(17367049);
        this.f22252x.setAdapter(arrayAdapter);
        m30457a(this.f22252x, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m30474c(String str) {
        this.f22235F = str;
        m30497x();
    }

    /* access modifiers changed from: private */
    @SuppressLint({"SimpleDateFormat"})
    /* renamed from: e */
    public boolean m30478e(int i) {
        String obj;
        Bitmap f = m30479f(i);
        if (f == null) {
            return false;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy HHmm 'UTC'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(this.f22243N);
        String str = "";
        if (!this.f22244O) {
            str = " *";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(format);
        sb.append(str);
        sb.append(" | ");
        sb.append(this.f22249u.getText());
        sb.append("\n");
        sb.append(this.f22248t.getText());
        String sb2 = sb.toString();
        if (this.f22253y.getText().toString().length() == 0) {
            obj = "";
        } else if (((String) this.f22252x.getSelectedItem()).length() != 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f22252x.getSelectedItem());
            sb3.append(" ");
            sb3.append(this.f22253y.getText().toString());
            obj = sb3.toString();
        } else {
            obj = this.f22253y.getText().toString();
        }
        String str2 = obj;
        Bitmap a = m30450a(f, sb2, this.f22232C, str2, this.f22254z.getText().toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f22246r);
        sb4.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb4.append(this.f22251w.getSelectedItem());
        sb4.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb4.append(m30455a(this.f22243N));
        sb4.append(".jpg");
        File file = new File(sb4.toString());
        try {
            a.compress(CompressFormat.JPEG, 90, new FileOutputStream(file));
            a.recycle();
            m30460a(file);
            return true;
        } catch (FileNotFoundException e) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Photo save: ");
            sb5.append(e);
            Log.e("SavePhotoActivity", sb5.toString());
            return false;
        }
    }

    /* renamed from: f */
    private Bitmap m30479f(int i) {
        Options options = new Options();
        options.inSampleSize = i;
        options.inPurgeable = true;
        return C6638s.m32070a(this.f22247s.getAbsolutePath(), BitmapFactory.decodeFile(this.f22247s.getAbsolutePath(), options));
    }

    /* renamed from: q */
    private void m30490q() {
        m30495v();
        m30461a((String) this.f22245o.get("albumName"));
        m30469b((String) this.f22245o.get("leftTextPrefix"));
        this.f22253y.setText((CharSequence) this.f22245o.get("leftText"));
        this.f22254z.setText((CharSequence) this.f22245o.get("rightText"));
    }

    /* renamed from: r */
    private void m30491r() {
        Button button = (Button) findViewById(C5458g.refine_location_button);
        C62673 r1 = new OnClickListener() {
            public void onClick(View view) {
                SavePhotoActivity.this.f22240K = false;
                SavePhotoActivity.this.m30494u();
                Intent intent = new Intent(SavePhotoActivity.this, LocationDetectorActivity.class);
                intent.setAction("com.seattleclouds.location.ACTION_PICK_LOCATION");
                if (!(SavePhotoActivity.this.f22241L.getLatitude() == 0.0d || SavePhotoActivity.this.f22241L.getLongitude() == 0.0d)) {
                    intent.putExtra("latitude", SavePhotoActivity.this.f22241L.getLatitude());
                    intent.putExtra("longitude", SavePhotoActivity.this.f22241L.getLongitude());
                }
                SavePhotoActivity.this.startActivityForResult(intent, 2);
            }
        };
        button.setOnClickListener(r1);
        this.f22249u.setOnClickListener(r1);
        this.f22250v.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                SavePhotoActivity.this.m30497x();
            }
        });
        this.f22251w.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                if (SavePhotoActivity.this.f22251w.getSelectedItem().toString().equals(SavePhotoActivity.this.getResources().getString(C5462k.save_photo_create_new_album))) {
                    SavePhotoActivity.this.f22251w.setSelection(0);
                    C6620n.m32040a((Context) SavePhotoActivity.this, SavePhotoActivity.this.getResources().getString(C5462k.save_photo_create_new_album_dialog_title), (String) null, false, (C6629b) new C6629b() {
                        /* renamed from: a */
                        public void mo18346a() {
                        }

                        /* renamed from: a */
                        public void mo18347a(String str) {
                            new File(SavePhotoActivity.this.f22246r, str.replaceAll("[|\\\\?*<\\\":>+\\[\\]/']", " ")).mkdir();
                            SavePhotoActivity.this.m30461a(str);
                        }
                    });
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f22230A.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (!"mounted".equals(Environment.getExternalStorageState())) {
                    Toast.makeText(SavePhotoActivity.this, C5462k.save_photo_external_storage_not_mounted_error, 1).show();
                } else if (SavePhotoActivity.this.f22251w.getSelectedItem().toString().equals("")) {
                    Toast.makeText(SavePhotoActivity.this, C5462k.save_photo_no_album_selected_error, 1).show();
                } else {
                    new C6276b().execute(new Void[0]);
                }
            }
        });
        this.f22231B.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                SavePhotoActivity.this.finish();
            }
        });
        this.f22248t.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                SavePhotoActivity.this.m30494u();
            }
        });
        this.f22248t.setOnFocusChangeListener(new OnFocusChangeListener() {
            public void onFocusChange(View view, boolean z) {
                if (z) {
                    SavePhotoActivity.this.m30494u();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m30492s() {
        this.f22230A.setEnabled(false);
        this.f22231B.setEnabled(false);
        new File(this.f22246r).mkdirs();
        try {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", C6598aq.m31937a(this.f22247s));
            startActivityForResult(intent, 1);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this, C5462k.feature_cant_take_photos, 1).show();
            finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m30493t() {
        this.f22236G = new C5431g(this, new C5433b(false) {
            /* renamed from: a */
            public void mo17721a(Location location) {
                super.mo17721a(location);
                SavePhotoActivity.this.f22242M = SavePhotoActivity.this.f22241L = location;
                SavePhotoActivity.this.m30467b(location);
            }
        });
        this.f22236G.mo17728a(2000);
        this.f22236G.mo17730a();
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m30494u() {
        if (this.f22236G != null) {
            this.f22236G.mo17731b();
            this.f22236G = null;
        }
    }

    /* renamed from: v */
    private void m30495v() {
        SharedPreferences sharedPreferences = getSharedPreferences(this.f22234E, 0);
        this.f22245o.put("albumName", sharedPreferences.getString("albumName", "NON_EXISTING_VALUE"));
        this.f22245o.put("leftTextPrefix", sharedPreferences.getString("leftTextPrefix", "NON_EXISTING_VALUE"));
        this.f22245o.put("leftText", sharedPreferences.getString("leftText", ""));
        this.f22245o.put("rightText", sharedPreferences.getString("rightText", ""));
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m30496w() {
        Editor edit = getSharedPreferences(this.f22234E, 0).edit();
        edit.putString("albumName", this.f22251w.getSelectedItem().toString());
        edit.putString("leftTextPrefix", this.f22252x.getSelectedItem().toString());
        edit.putString("leftText", this.f22253y.getText().toString());
        edit.putString("rightText", this.f22254z.getText().toString());
        edit.commit();
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m30497x() {
        EditText editText;
        String a;
        if (this.f22250v.isChecked()) {
            editText = this.f22248t;
            a = this.f22235F;
        } else {
            editText = this.f22248t;
            a = C5415d.m27094a(this.f22235F);
        }
        editText.setText(a);
    }

    public void finish() {
        if (this.f22247s != null) {
            this.f22247s.delete();
        }
        super.finish();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (i2 == -1) {
                new C6275a().execute(new Void[0]);
            } else {
                finish();
            }
        } else if (i == 2 && i2 == -1) {
            double d = intent.getExtras().getDouble("latitude");
            double d2 = intent.getExtras().getDouble("longitude");
            if (m30462a(d, d2)) {
                this.f22241L = new Location("user");
                this.f22241L.setLatitude(d);
                this.f22241L.setLongitude(d2);
                this.f22249u.setText(m30454a(this.f22241L));
                m30474c(intent.getExtras().getString("address"));
                return;
            }
            C6620n.m32031a((Context) this, C5462k.warning, getString(C5462k.save_photo_location_refine_limit, new Object[]{Integer.valueOf(100)}));
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5460i.save_photo);
        String trim = getResources().getString(C5462k.app_name).replaceAll("[|\\\\?*<\\\":>+\\[\\]/']", " ").trim();
        StringBuilder sb = new StringBuilder();
        sb.append(f22227n);
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append(trim);
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        this.f22246r = sb.toString();
        this.f22247s = new File(this.f22246r, "temp.jpg");
        this.f22248t = (EditText) findViewById(C5458g.address);
        this.f22249u = (EditText) findViewById(C5458g.location);
        this.f22250v = (CheckBox) findViewById(C5458g.use_street_address);
        this.f22251w = (Spinner) findViewById(C5458g.folder_spinner);
        this.f22252x = (Spinner) findViewById(C5458g.left_text_prefix_spinner);
        this.f22253y = (EditText) findViewById(C5458g.left_text);
        this.f22254z = (EditText) findViewById(C5458g.right_text);
        this.f22230A = (Button) findViewById(C5458g.save_button);
        this.f22231B = (Button) findViewById(C5458g.cancel_button);
        this.f22237H = NumberFormat.getInstance();
        this.f22237H.setMaximumFractionDigits(6);
        this.f22237H.setMinimumFractionDigits(6);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f22232C = extras.getString("EXTRA_BOTTOM_TEXT");
            this.f22233D = extras.getStringArray("EXTRA_LEFT_TEXT_PREFIXES");
            String string = extras.getString("EXTRA_STORE_ID");
            if (string != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f22234E);
                sb2.append(".");
                sb2.append(string);
                this.f22234E = sb2.toString();
            }
        }
        if (this.f22232C == null) {
            this.f22232C = "";
        }
        if (this.f22233D == null) {
            this.f22233D = new String[]{""};
        }
        m30490q();
        if (bundle != null) {
            this.f22240K = bundle.getBoolean("updateCurrentLocation");
            this.f22239J = bundle.getBoolean("cameraStarted");
            double d = bundle.getDouble("currentLatitude");
            double d2 = bundle.getDouble("currentLongitude");
            this.f22241L.setLatitude(d);
            this.f22241L.setLongitude(d2);
        }
        if (this.f22240K) {
            m30493t();
        }
        if (!this.f22239J) {
            m30492s();
            this.f22239J = true;
        }
        m30491r();
        getWindow().setSoftInputMode(3);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        m30494u();
    }

    public void onPause() {
        if (this.f22236G != null) {
            this.f22236G.mo17731b();
        }
        super.onPause();
    }

    public void onResume() {
        if (this.f22236G != null) {
            this.f22236G.mo17730a();
        }
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("cameraStarted", this.f22239J);
        bundle.putBoolean("updateCurrentLocation", this.f22240K);
        bundle.putDouble("currentLatitude", this.f22241L.getLatitude());
        bundle.putDouble("currentLongitude", this.f22241L.getLongitude());
        super.onSaveInstanceState(bundle);
    }
}
