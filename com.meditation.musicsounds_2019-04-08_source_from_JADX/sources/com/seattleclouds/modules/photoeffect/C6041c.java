package com.seattleclouds.modules.photoeffect;

import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.ColorFilter;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Debug;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore.Images.Media;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.content.C0452b;
import android.support.p023v7.app.C0765d;
import android.support.p023v7.app.C0765d.C0766a;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Toast;
import com.google.android.gms.ads.AdRequest;
import com.seattleclouds.App;
import com.seattleclouds.C5230aa;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.modules.mosaic.C5870a;
import com.seattleclouds.modules.photoeffect.C6066d.C6067a;
import com.seattleclouds.util.C6569aa;
import com.seattleclouds.util.C6569aa.C6570a;
import com.seattleclouds.util.C6598aq;
import com.seattleclouds.util.C6599ar;
import com.seattleclouds.util.C6617k;
import com.seattleclouds.util.C6620n;
import com.seattleclouds.util.C6630o;
import com.seattleclouds.util.C6630o.C6632b;
import com.seattleclouds.util.C6638s;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/* renamed from: com.seattleclouds.modules.photoeffect.c */
public class C6041c extends C6557s implements OnSeekBarChangeListener, C6067a {

    /* renamed from: a */
    public static final String f21483a = "c";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static boolean f21484b = false;

    /* renamed from: c */
    private static final String f21485c;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static int f21486e = 0;

    /* renamed from: ae */
    private ProgressDialog f21487ae = null;

    /* renamed from: af */
    private ArrayList<String> f21488af;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public boolean f21489ag = false;
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public View f21490ah = null;

    /* renamed from: ai */
    private ImageView f21491ai;
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public File f21492aj;
    /* access modifiers changed from: private */

    /* renamed from: ak */
    public State f21493ak;

    /* renamed from: al */
    private boolean f21494al = true;
    /* access modifiers changed from: private */

    /* renamed from: am */
    public String f21495am;

    /* renamed from: an */
    private String f21496an;

    /* renamed from: ao */
    private Bitmap f21497ao;
    /* access modifiers changed from: private */

    /* renamed from: ap */
    public Uri f21498ap;

    /* renamed from: d */
    private int f21499d = AdRequest.MAX_CONTENT_URL_LENGTH;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C6040b f21500f;

    /* renamed from: g */
    private boolean f21501g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f21502h = false;

    /* renamed from: i */
    private boolean f21503i;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getAbsolutePath());
        sb.append("/PhotoEffect/");
        f21485c = sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0088 A[LOOP:0: B:22:0x0082->B:24:0x0088, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap m29620a(android.graphics.Bitmap r10, java.util.ArrayList<com.seattleclouds.modules.photoeffect.C6039a> r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.widget.ImageView r1 = r9.f21491ai
            int r1 = r1.getWidth()
            android.widget.ImageView r2 = r9.f21491ai
            int r2 = r2.getHeight()
            if (r11 == 0) goto L_0x0018
            int r3 = r11.size()
            if (r3 != 0) goto L_0x0020
        L_0x0018:
            com.seattleclouds.modules.photoeffect.State r3 = r9.f21493ak
            int r3 = r3.f21448b
            r4 = -1
            if (r3 != r4) goto L_0x0020
            return r10
        L_0x0020:
            int r3 = r10.getWidth()
            int r4 = r10.getHeight()
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.RGB_565
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r3, r4, r5)
            android.graphics.Canvas r6 = new android.graphics.Canvas
            r6.<init>(r5)
            com.seattleclouds.modules.photoeffect.State r7 = r9.f21493ak
            int r7 = r7.f21448b
            r8 = 1
            if (r7 != r8) goto L_0x0047
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            android.graphics.ColorFilter r7 = com.seattleclouds.modules.photoeffect.C6068e.m29689a()
        L_0x0043:
            r0.setColorFilter(r7)
            goto L_0x0057
        L_0x0047:
            com.seattleclouds.modules.photoeffect.State r7 = r9.f21493ak
            int r7 = r7.f21448b
            if (r7 != 0) goto L_0x0057
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            android.graphics.ColorFilter r7 = com.seattleclouds.modules.photoeffect.C6068e.m29692b()
            goto L_0x0043
        L_0x0057:
            r7 = 0
            r6.drawBitmap(r10, r7, r7, r0)
            com.seattleclouds.util.C6638s.m32073a(r10)
            if (r11 == 0) goto L_0x009c
            int r10 = r11.size()
            if (r10 != 0) goto L_0x0067
            goto L_0x009c
        L_0x0067:
            float r10 = (float) r3
            float r0 = (float) r1
            float r1 = r10 / r0
            float r3 = (float) r4
            float r2 = (float) r2
            float r4 = r3 / r2
            float r1 = java.lang.Math.max(r1, r4)
            float r10 = r10 / r1
            float r0 = r0 - r10
            r10 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r10
            float r3 = r3 / r1
            float r2 = r2 - r3
            float r2 = r2 / r10
            r6.scale(r1, r1)
            java.util.Iterator r10 = r11.iterator()
        L_0x0082:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0099
            java.lang.Object r1 = r10.next()
            com.seattleclouds.modules.photoeffect.a r1 = (com.seattleclouds.modules.photoeffect.C6039a) r1
            r3 = 0
            r1.mo19085b(r3)
            r1.mo19078a(r6, r0, r2)
            r1.mo19094h()
            goto L_0x0082
        L_0x0099:
            r11.clear()
        L_0x009c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.photoeffect.C6041c.m29620a(android.graphics.Bitmap, java.util.ArrayList):android.graphics.Bitmap");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0045 A[Catch:{ all -> 0x003e }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0061 A[SYNTHETIC, Splitter:B:29:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0076 A[SYNTHETIC, Splitter:B:37:0x0076] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Boolean m29624a(android.graphics.Bitmap r5, java.lang.String r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x0089
            java.io.File r1 = new java.io.File
            r1.<init>(r6)
            r6 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0040 }
            r2.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0040 }
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ FileNotFoundException -> 0x003b, all -> 0x0038 }
            r1 = 100
            r5.compress(r6, r1, r2)     // Catch:{ FileNotFoundException -> 0x003b, all -> 0x0038 }
            boolean r5 = f21484b     // Catch:{ FileNotFoundException -> 0x003b, all -> 0x0038 }
            if (r5 == 0) goto L_0x0020
            java.lang.String r5 = f21483a     // Catch:{ FileNotFoundException -> 0x003b, all -> 0x0038 }
            java.lang.String r6 = "Photo Saved OK"
            android.util.Log.v(r5, r6)     // Catch:{ FileNotFoundException -> 0x003b, all -> 0x0038 }
        L_0x0020:
            r5 = 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ FileNotFoundException -> 0x003b, all -> 0x0038 }
            r2.close()     // Catch:{ IOException -> 0x0029 }
            goto L_0x0037
        L_0x0029:
            r6 = move-exception
            boolean r0 = f21484b
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = f21483a
            java.lang.String r6 = r6.getMessage()
            android.util.Log.e(r0, r6)
        L_0x0037:
            return r5
        L_0x0038:
            r5 = move-exception
            r6 = r2
            goto L_0x0074
        L_0x003b:
            r5 = move-exception
            r6 = r2
            goto L_0x0041
        L_0x003e:
            r5 = move-exception
            goto L_0x0074
        L_0x0040:
            r5 = move-exception
        L_0x0041:
            boolean r1 = f21484b     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x005b
            java.lang.String r1 = f21483a     // Catch:{ all -> 0x003e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x003e }
            r2.<init>()     // Catch:{ all -> 0x003e }
            java.lang.String r3 = "Photo save: "
            r2.append(r3)     // Catch:{ all -> 0x003e }
            r2.append(r5)     // Catch:{ all -> 0x003e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x003e }
            android.util.Log.e(r1, r2, r5)     // Catch:{ all -> 0x003e }
        L_0x005b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x003e }
            if (r6 == 0) goto L_0x0073
            r6.close()     // Catch:{ IOException -> 0x0065 }
            goto L_0x0073
        L_0x0065:
            r6 = move-exception
            boolean r0 = f21484b
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = f21483a
            java.lang.String r6 = r6.getMessage()
            android.util.Log.e(r0, r6)
        L_0x0073:
            return r5
        L_0x0074:
            if (r6 == 0) goto L_0x0088
            r6.close()     // Catch:{ IOException -> 0x007a }
            goto L_0x0088
        L_0x007a:
            r6 = move-exception
            boolean r0 = f21484b
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = f21483a
            java.lang.String r6 = r6.getMessage()
            android.util.Log.e(r0, r6)
        L_0x0088:
            throw r5
        L_0x0089:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.photoeffect.C6041c.m29624a(android.graphics.Bitmap, java.lang.String):java.lang.Boolean");
    }

    /* renamed from: a */
    private void m29625a(MaskProperty maskProperty) {
        this.f21500f.mo19098a(m29646c(maskProperty), maskProperty);
    }

    /* access modifiers changed from: private */
    /* renamed from: aA */
    public void m29628aA() {
        if (mo1318s() != null && C6599ar.f23317b) {
            if (!(C0452b.m2065b((Context) mo1318s(), "android.permission.READ_EXTERNAL_STORAGE") == 0)) {
                C6569aa.m31791a((Fragment) this, 33, "android.permission.READ_EXTERNAL_STORAGE", new int[]{C5462k.photoeffect_permission_photo_library});
                return;
            }
        }
        startActivityForResult(new Intent("android.intent.action.PICK", Media.EXTERNAL_CONTENT_URI), 2300);
    }

    /* access modifiers changed from: private */
    /* renamed from: aB */
    public void m29629aB() {
        mo1453c();
        if (mo1318s() != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(mo1318s(), 17367057);
            arrayAdapter.add(mo1219a(C5462k.photoeffect_button_gallery));
            arrayAdapter.add(mo1219a(C5462k.photoeffect_button_camera));
            C0766a aVar = new C0766a(mo1318s());
            aVar.mo3047a(C5462k.photoeffect_button_choose_photo).mo3053a((ListAdapter) arrayAdapter, (OnClickListener) new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (i == 0) {
                        C6041c.this.m29628aA();
                    } else if (i == 1 && !C6041c.this.m29654g(31)) {
                        C6041c.this.f21492aj = C6068e.m29693c();
                        if (C6041c.this.f21492aj != null) {
                            try {
                                C6041c.this.f21498ap = C6598aq.m31937a(C6041c.this.f21492aj);
                                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                                intent.putExtra("output", C6041c.this.f21498ap);
                                C6041c.this.startActivityForResult(intent, 2400);
                            } catch (ActivityNotFoundException unused) {
                                C6620n.m32028a((Context) C6041c.this.mo1318s(), C5462k.warning, C5462k.feature_cant_take_photos);
                            }
                        }
                    }
                }
            });
            aVar.mo3068c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aC */
    public void m29630aC() {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            C6620n.m32029a((Context) mo1318s(), C5462k.warning, C5462k.mosaic_image_share_no_sc_card, (OnClickListener) null);
            return;
        }
        if (m29631aD()) {
            String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            File file = new File(this.f21493ak.f21447a);
            String parent = file.getParent();
            StringBuilder sb = new StringBuilder();
            sb.append(format);
            sb.append(".jpeg");
            File file2 = new File(parent, sb.toString());
            file.renameTo(file2);
            this.f21493ak.f21447a = file2.getAbsolutePath();
            Uri a = C6598aq.m31937a(file2);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("image/png");
            intent.putExtra("android.intent.extra.EMAIL", (String[]) this.f21488af.toArray(new String[this.f21488af.size()]));
            intent.putExtra("android.intent.extra.STREAM", a);
            mo1230a(Intent.createChooser(intent, "Share via"));
        } else if (mo1318s() != null) {
            C0765d b = new C0766a(mo1318s()).mo3065b();
            b.setTitle("Error");
            b.mo3041a((CharSequence) "Please make a photo.");
            b.mo3040a(-1, "OK", new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            b.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aD */
    public boolean m29631aD() {
        m29637aJ();
        try {
            mo1453c();
            if (this.f21502h) {
                return true;
            }
            if (this.f21497ao == null) {
                this.f21497ao = m29634aG();
            }
            if (this.f21497ao == null) {
                m29638aK();
                return false;
            }
            m29635aH();
            this.f21489ag = false;
            this.f21502h = true;
            System.gc();
            this.f21497ao = m29620a(this.f21497ao, this.f21500f.getArrayOfChoosedImages());
            this.f21500f.mo19099b();
            boolean booleanValue = m29641b(this.f21497ao).booleanValue();
            this.f21491ai.setImageBitmap(this.f21497ao);
            SeekBar seekBar = (SeekBar) this.f21490ah.findViewById(C5458g.AlphaSeekBar);
            seekBar.setProgress(seekBar.getMax());
            m29636aI();
            if (booleanValue) {
                m29655h(-1);
            }
            m29638aK();
            return booleanValue;
        } finally {
            m29638aK();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aE */
    public void m29632aE() {
        if (!m29654g(32)) {
            m29633aF();
        }
    }

    /* renamed from: aF */
    private void m29633aF() {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            C6620n.m32029a((Context) mo1318s(), C5462k.warning, C5462k.mosaic_image_share_no_sc_card, (OnClickListener) null);
            return;
        }
        if (m29631aD()) {
            if (this.f21497ao == null) {
                this.f21497ao = m29634aG();
            }
            if (this.f21497ao != null) {
                String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
                StringBuilder sb = new StringBuilder();
                sb.append(f21485c);
                sb.append(format);
                sb.append(".jpeg");
                File file = new File(sb.toString());
                file.getParentFile().mkdirs();
                try {
                    file.createNewFile();
                } catch (IOException unused) {
                    if (f21484b) {
                        Log.d(f21483a, "IOexeption on create new file");
                    }
                }
                try {
                    this.f21497ao.compress(CompressFormat.JPEG, 90, new FileOutputStream(file));
                    C6630o.m32048a(mo1318s(), file.getAbsolutePath(), "image/jpeg", new C6632b() {
                        /* renamed from: a */
                        public void mo19146a(String str, Uri uri) {
                            if (C6041c.f21484b) {
                                String str2 = C6041c.f21483a;
                                StringBuilder sb = new StringBuilder();
                                sb.append("onScanCompleted path: ");
                                sb.append(str);
                                sb.append(", uri: ");
                                sb.append(uri);
                                Log.v(str2, sb.toString());
                            }
                        }
                    });
                    C6620n.m32028a((Context) mo1318s(), C5462k.message, C5462k.photoeffect_photo_saved);
                } catch (FileNotFoundException e) {
                    if (f21484b) {
                        String str = f21483a;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Photo save: ");
                        sb2.append(e);
                        Log.e(str, sb2.toString(), e);
                    }
                }
            }
        } else {
            C6620n.m32028a((Context) mo1318s(), C5462k.error, C5462k.photoeffect_take_photo);
        }
    }

    /* renamed from: aG */
    private Bitmap m29634aG() {
        if (this.f21493ak.f21447a != null) {
            try {
                return C6638s.m32077b(this.f21493ak.f21447a, this.f21499d);
            } catch (Exception e) {
                if (f21484b) {
                    String str = f21483a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("onActivityResult: ");
                    sb.append(e.toString());
                    Log.e(str, sb.toString(), e);
                }
            }
        }
        return null;
    }

    /* renamed from: aH */
    private synchronized void m29635aH() {
        this.f21487ae = new ProgressDialog(mo1318s());
        this.f21487ae.setProgressStyle(0);
        this.f21487ae.setMessage(mo1320t().getString(C5462k.photoeffect_processing));
        this.f21487ae.setCancelable(false);
        this.f21487ae.show();
    }

    /* renamed from: aI */
    private synchronized void m29636aI() {
        if (this.f21487ae != null) {
            this.f21487ae.dismiss();
        }
    }

    /* renamed from: aJ */
    private void m29637aJ() {
        if (this.f21490ah != null) {
            View findViewById = this.f21490ah.findViewById(C5458g.loading_view);
            findViewById.setOnTouchListener(new OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return true;
                }
            });
            findViewById.setVisibility(0);
        }
    }

    /* renamed from: aK */
    private void m29638aK() {
        if (this.f21490ah != null) {
            this.f21490ah.findViewById(C5458g.loading_view).setVisibility(8);
        }
    }

    /* renamed from: b */
    private Boolean m29641b(Bitmap bitmap) {
        return m29624a(bitmap, this.f21493ak.f21447a);
    }

    /* renamed from: b */
    private void m29642b(MaskProperty maskProperty) {
        SeekBar seekBar = (SeekBar) this.f21490ah.findViewById(C5458g.AlphaSeekBar);
        seekBar.setProgress(seekBar.getMax());
        this.f21500f.mo19100b(m29646c(maskProperty), maskProperty);
    }

    /* renamed from: c */
    private Bitmap m29646c(MaskProperty maskProperty) {
        Options options = new Options();
        int i = 1;
        options.inJustDecodeBounds = true;
        if (!App.m25667n(maskProperty.f21446i)) {
            C6620n.m32028a((Context) mo1318s(), C5462k.error, C5462k.photoeffect_error_image_doesnt_exist);
            return null;
        }
        BitmapFactory.decodeStream(App.m25649e(maskProperty.f21446i), null, options);
        if (options.outHeight > this.f21499d / 2 || options.outWidth > this.f21499d / 2) {
            double d = (double) (this.f21499d / 2);
            double min = (double) Math.min(options.outHeight, options.outWidth);
            Double.isNaN(d);
            Double.isNaN(min);
            i = (int) Math.pow(2.0d, (double) ((int) (Math.log(d / min) / Math.log(0.5d))));
        }
        Options options2 = new Options();
        options2.inPreferredConfig = Config.RGB_565;
        options2.inSampleSize = i;
        return BitmapFactory.decodeStream(App.m25649e(maskProperty.f21446i), null, options2);
    }

    /* renamed from: f */
    private void m29652f(int i) {
        switch (i) {
            case 1:
                this.f21490ah.findViewById(C5458g.rotate_to_portrait_textview).setVisibility(8);
                this.f21490ah.findViewById(C5458g.view_container).setVisibility(0);
                return;
            case 2:
                this.f21490ah.findViewById(C5458g.rotate_to_portrait_textview).setVisibility(0);
                this.f21490ah.findViewById(C5458g.view_container).setVisibility(8);
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m29654g(int i) {
        if (C6569aa.m31796a()) {
            if (mo1318s() == null) {
                return true;
            }
            switch (i) {
                case 31:
                    boolean z = C0452b.m2065b((Context) mo1318s(), "android.permission.CAMERA") == 0;
                    if (!z) {
                        C6569aa.m31791a((Fragment) this, 31, "android.permission.CAMERA", new int[]{C5462k.photoeffect_permission_camera_rational, C5462k.photoeffect_permission_camera_required_toast});
                    }
                    return !z;
                case 32:
                    boolean z2 = C0452b.m2065b((Context) mo1318s(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
                    if (!z2) {
                        C6569aa.m31791a((Fragment) this, 32, "android.permission.WRITE_EXTERNAL_STORAGE", new int[]{C5462k.photoeffect_permission_write_storage_rational, C5462k.photoeffect_permission_write_storage_toast});
                    }
                    return !z2;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m29655h(int i) {
        ColorFilter colorFilter;
        ImageView imageView;
        switch (i) {
            case 0:
                imageView = this.f21491ai;
                colorFilter = C6068e.m29692b();
                break;
            case 1:
                imageView = this.f21491ai;
                colorFilter = C6068e.m29689a();
                break;
            default:
                this.f21491ai.clearColorFilter();
                break;
        }
        imageView.setColorFilter(colorFilter);
        this.f21493ak.f21448b = i;
    }

    /* renamed from: K */
    public void mo1201K() {
        super.mo1201K();
        this.f21494al = true;
    }

    /* renamed from: L */
    public void mo1202L() {
        if (this.f21494al && this.f21493ak.f21447a != null) {
            new File(this.f21493ak.f21447a).delete();
        }
        if (this.f21497ao != null) {
            this.f21497ao.recycle();
            this.f21497ao = null;
        }
        super.mo1202L();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f21490ah = layoutInflater.inflate(C5460i.photo_effect, viewGroup, false);
        int i = App.m25651f().getConfiguration().orientation;
        m29652f(i);
        if (i == 2) {
            return this.f21490ah;
        }
        mo1450b();
        if (this.f21493ak.f21447a != null) {
            if (this.f21497ao == null) {
                this.f21497ao = m29634aG();
            }
            this.f21491ai.setImageBitmap(this.f21497ao);
            m29655h(this.f21493ak.f21448b);
            this.f21501g = false;
        }
        Iterator it = this.f21493ak.f21449c.iterator();
        while (it.hasNext()) {
            m29625a((MaskProperty) it.next());
        }
        return this.f21490ah;
    }

    /* renamed from: a */
    public void mo1222a(int i, int i2, Intent intent) {
        System.gc();
        C6066d dVar = null;
        if (this.f21501g) {
            this.f21501g = false;
            this.f21491ai.setImageBitmap(null);
        }
        mo1453c();
        this.f21502h = false;
        if (i == 2400) {
            if (!m29654g(31)) {
                if (i2 != 0) {
                    if (this.f21493ak.f21447a != null) {
                        new File(this.f21493ak.f21447a).delete();
                    }
                    if (this.f21492aj == null) {
                        this.f21492aj = new File(this.f21498ap.getPath());
                    }
                    this.f21493ak.f21447a = this.f21492aj.getAbsolutePath();
                    C6066d dVar2 = new C6066d(this.f21492aj, this.f21499d);
                    dVar2.mo19149a((C6067a) this);
                    dVar2.mo8524c((Params[]) new Void[0]);
                } else if (this.f21492aj != null && this.f21492aj.exists()) {
                    this.f21492aj.delete();
                }
                this.f21492aj = null;
            } else {
                return;
            }
        } else if (i == 2500) {
            if (i2 != 0) {
                Point center = this.f21500f.getCenter();
                MaskProperty maskProperty = new MaskProperty(center.x, center.y, 0, 0, 255, 1.0f, 0.0f, true, intent.getStringExtra("imgName"));
                m29642b(maskProperty);
            }
        } else if (i == 2300 && i2 != 0) {
            File c = C6068e.m29693c();
            if (c != null) {
                this.f21493ak.f21447a = c.getAbsolutePath();
                String a = C6598aq.m31938a(mo1316q(), intent.getData());
                if (a != null) {
                    dVar = new C6066d(new File(a), this.f21499d);
                } else if (mo1318s() != null) {
                    dVar = new C6066d(intent.getData(), mo1318s().getContentResolver(), c, this.f21499d);
                }
                if (dVar != null) {
                    dVar.mo19149a((C6067a) this);
                    dVar.mo8524c((Params[]) new Void[0]);
                }
            } else {
                return;
            }
        }
        System.gc();
        C6617k.m32010a(C6041c.class);
        Double valueOf = Double.valueOf((double) (Runtime.getRuntime().maxMemory() / 1048576));
        double nativeHeapAllocatedSize = (double) Debug.getNativeHeapAllocatedSize();
        Double.isNaN(nativeHeapAllocatedSize);
        if (valueOf.doubleValue() - Double.valueOf(nativeHeapAllocatedSize / 1048576.0d).doubleValue() <= 4.0d) {
            this.f21489ag = true;
            Log.d("MEMORY", "debug FULL");
        }
    }

    /* renamed from: a */
    public void mo1224a(int i, String[] strArr, int[] iArr) {
        switch (i) {
            case 31:
                if (!C6569aa.m31801a(strArr, iArr, "android.permission.CAMERA")) {
                    new Handler(Looper.myLooper()).postDelayed(new Runnable() {
                        public void run() {
                            if (C6041c.this.mo1318s() != null) {
                                C6570a.m31804a(false, C5462k.photoeffect_permission_camera_denied).mo1448a(C6041c.this.mo1318s().mo1469g(), "permissionDialog");
                            }
                        }
                    }, 400);
                    return;
                } else {
                    Toast.makeText(mo1318s(), C5462k.common_permission_granted, 0).show();
                    return;
                }
            case 32:
                if (!C6569aa.m31801a(strArr, iArr, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                    new Handler(Looper.myLooper()).postDelayed(new Runnable() {
                        public void run() {
                            if (C6041c.this.mo1318s() != null) {
                                C6570a.m31804a(false, C5462k.photoeffect_permission_write_storage_denied).mo1448a(C6041c.this.mo1318s().mo1469g(), "permissionDialog");
                            }
                        }
                    }, 400);
                    return;
                }
                Toast.makeText(mo1318s(), C5462k.common_permission_granted, 0).show();
                m29633aF();
                return;
            case 33:
                m29628aA();
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo19115a(Bitmap bitmap) {
        if (this.f21491ai == null) {
            m29638aK();
            return;
        }
        m29655h(-1);
        this.f21497ao = bitmap;
        this.f21491ai.setImageBitmap(this.f21497ao);
        m29638aK();
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        if (bundle != null) {
            this.f21493ak = (State) bundle.getParcelable("STATE_CONSTANT");
            this.f21498ap = (Uri) bundle.getParcelable("TEMP_URI");
        }
        if (this.f21493ak == null) {
            this.f21493ak = new State();
        }
        Bundle m = mo1307m();
        if (m != null) {
            this.f21488af = m.getStringArrayList("sendtoaddresses");
            this.f21495am = m.getString("pageId");
            this.f21496an = m.getString("welcomeimg");
            this.f21503i = m.getBoolean("allowSharingAndroid");
        }
    }

    /* renamed from: a */
    public void mo19116a(ArrayList<MaskProperty> arrayList) {
        this.f21493ak.f21449c = arrayList;
    }

    /* renamed from: as */
    public void mo19117as() {
        m29638aK();
    }

    /* renamed from: b */
    public void mo1450b() {
        View.OnClickListener r1;
        this.f21490ah.setLayerType(1, null);
        this.f21490ah.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                C6041c.this.f21490ah.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });
        this.f21500f = new C6040b(this);
        this.f21500f.setId(C5458g.photo_effect_mask);
        RelativeLayout relativeLayout = (RelativeLayout) this.f21490ah.findViewById(C5458g.popmenuLayout);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.addRule(13, this.f21500f.getId());
        relativeLayout.addView(this.f21500f, layoutParams);
        ((SeekBar) this.f21490ah.findViewById(C5458g.AlphaSeekBar)).setOnSeekBarChangeListener(this);
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            C6620n.m32029a((Context) mo1318s(), C5462k.warning, C5462k.mosaic_image_share_no_sc_card, (OnClickListener) null);
        }
        this.f21491ai = (ImageView) this.f21490ah.findViewById(C5458g.imgView);
        ((Button) this.f21490ah.findViewById(C5458g.btOpenCamOrLib)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C6041c.this.m29629aB();
            }
        });
        Button button = (Button) this.f21490ah.findViewById(C5458g.btSend);
        if (!this.f21503i) {
            button.setText(mo1320t().getString(C5462k.photoeffect_button_savetogallery));
            r1 = new View.OnClickListener() {
                public void onClick(View view) {
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            C6041c.this.m29632aE();
                        }
                    }, 500);
                }
            };
        } else {
            r1 = new View.OnClickListener() {
                public void onClick(View view) {
                    String[] strArr = {C6041c.this.mo1320t().getString(C5462k.photoeffect_radiobutton_savetogallery), C6041c.this.mo1320t().getString(C5462k.photoeffect_radiobutton_shareviaapps)};
                    if (C6041c.this.mo1318s() != null) {
                        C0766a aVar = new C0766a(C6041c.this.mo1318s());
                        aVar.mo3047a(C5462k.photoeffect_button_send).mo3056a(true).mo3057a((CharSequence[]) strArr, C6041c.f21486e, (OnClickListener) new OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                                C6041c.f21486e = i;
                            }
                        }).mo3048a(17039370, (OnClickListener) new OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Handler handler;
                                Runnable r4;
                                C6041c.this.mo1453c();
                                if (C6041c.f21486e == 0) {
                                    handler = new Handler();
                                    r4 = new Runnable() {
                                        public void run() {
                                            C6041c.this.m29632aE();
                                        }
                                    };
                                } else {
                                    handler = new Handler();
                                    r4 = new Runnable() {
                                        public void run() {
                                            C6041c.this.m29630aC();
                                        }
                                    };
                                }
                                handler.postDelayed(r4, 500);
                                SeekBar seekBar = (SeekBar) C6041c.this.f21490ah.findViewById(C5458g.AlphaSeekBar);
                                seekBar.setProgress(seekBar.getMax());
                                System.gc();
                            }
                        }).mo3061b(17039360, (OnClickListener) new OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                        aVar.mo3065b().show();
                    }
                }
            };
        }
        button.setOnClickListener(r1);
        ((Button) this.f21490ah.findViewById(C5458g.btMask)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                LinearLayout linearLayout = (LinearLayout) C6041c.this.f21490ah.findViewById(C5458g.popmenumaskLayout);
                LinearLayout linearLayout2 = (LinearLayout) C6041c.this.f21490ah.findViewById(C5458g.popmenueffectLayout);
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.bringToFront();
                } else {
                    linearLayout.setVisibility(8);
                }
                linearLayout2.setVisibility(8);
                System.gc();
            }
        });
        ((Button) this.f21490ah.findViewById(C5458g.btChooseMask)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                System.gc();
                if (C6041c.this.f21489ag) {
                    C6620n.m32034a((Context) C6041c.this.mo1318s(), C6041c.this.mo1320t().getString(C5462k.warning), C6041c.this.mo1320t().getString(C5462k.photoeffect_mess_mask_not_added));
                    return;
                }
                C5230aa aaVar = (C5230aa) App.f18501c.mo16902D().get(C6041c.this.f21495am);
                Bundle bundle = new Bundle();
                bundle.putBoolean("isOnlyChoose", true);
                bundle.putParcelableArrayList("mosaicimages", aaVar.f18742d);
                C6041c.this.startActivityForResult(App.m25603a(new FragmentInfo(C5870a.class.getName(), bundle), (Context) C6041c.this.mo1318s()), 2500);
            }
        });
        ((Button) this.f21490ah.findViewById(C5458g.btDelete)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C6041c.this.f21500f.mo19096a();
                C6041c.this.mo1453c();
                SeekBar seekBar = (SeekBar) C6041c.this.f21490ah.findViewById(C5458g.AlphaSeekBar);
                seekBar.setProgress(seekBar.getMax());
                C6041c.this.f21489ag = false;
            }
        });
        ((Button) this.f21490ah.findViewById(C5458g.btApply)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C6041c.this.m29631aD();
            }
        });
        ((Button) this.f21490ah.findViewById(C5458g.btEffect)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C6617k.m32010a(C6041c.class);
                LinearLayout linearLayout = (LinearLayout) C6041c.this.f21490ah.findViewById(C5458g.popmenumaskLayout);
                LinearLayout linearLayout2 = (LinearLayout) C6041c.this.f21490ah.findViewById(C5458g.popmenueffectLayout);
                if (linearLayout2.getVisibility() == 8) {
                    linearLayout2.setVisibility(0);
                    linearLayout2.bringToFront();
                } else {
                    linearLayout2.setVisibility(8);
                }
                linearLayout.setVisibility(8);
                System.gc();
            }
        });
        ((Button) this.f21490ah.findViewById(C5458g.btGrey)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C6041c.this.mo1453c();
                if (C6041c.this.f21493ak.f21448b != 0) {
                    C6041c.this.m29655h(0);
                    C6041c.this.f21502h = false;
                }
            }
        });
        ((Button) this.f21490ah.findViewById(C5458g.btColor)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C6041c.this.mo1453c();
                if (C6041c.this.f21493ak.f21448b != -1) {
                    C6041c.this.m29655h(-1);
                    C6041c.this.mo1453c();
                    C6041c.this.f21502h = false;
                }
            }
        });
        ((Button) this.f21490ah.findViewById(C5458g.btSepia)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C6041c.this.mo1453c();
                if (C6041c.this.f21493ak.f21448b != 1) {
                    C6041c.this.m29655h(1);
                    C6041c.this.f21502h = false;
                }
            }
        });
        if (this.f21496an != null) {
            Drawable j = App.m25658j(this.f21496an);
            if (j != null) {
                this.f21501g = true;
                this.f21491ai.setImageDrawable(j);
            }
        }
        if (((double) (Runtime.getRuntime().maxMemory() / 1048576)) > 18.0d) {
            this.f21499d = 800;
        }
    }

    /* renamed from: c */
    public void mo1453c() {
        LinearLayout linearLayout = (LinearLayout) this.f21490ah.findViewById(C5458g.popmenueffectLayout);
        ((LinearLayout) this.f21490ah.findViewById(C5458g.popmenumaskLayout)).setVisibility(8);
        linearLayout.setVisibility(8);
    }

    /* renamed from: d */
    public View mo19118d() {
        return this.f21490ah;
    }

    /* renamed from: e */
    public void mo19119e() {
        m29637aJ();
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        bundle.putParcelable("STATE_CONSTANT", this.f21493ak);
        bundle.putParcelable("TEMP_URI", this.f21498ap);
        this.f21494al = false;
        super.mo1282e(bundle);
    }

    /* renamed from: k */
    public void mo1301k(Bundle bundle) {
        super.mo1301k(bundle);
        this.f21494al = true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        m29652f(configuration.orientation);
        super.onConfigurationChanged(configuration);
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f21500f.mo19097a(i);
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}
