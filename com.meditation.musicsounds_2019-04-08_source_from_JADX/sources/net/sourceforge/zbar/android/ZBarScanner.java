package net.sourceforge.zbar.android;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p009v4.content.C0452b;
import android.support.p023v7.app.C0751a;
import android.support.p023v7.app.C0767e;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.sczxing.client.p140a.C4988f;
import com.google.sczxing.client.p140a.C4991i;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6348n;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.modules.p163b.C5472b;
import com.seattleclouds.util.C6569aa;
import com.seattleclouds.util.C6569aa.C6570a;
import com.seattleclouds.util.C6573ab;
import com.seattleclouds.util.C6620n;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import net.sourceforge.zbar.Image;
import net.sourceforge.zbar.ImageScanner;
import net.sourceforge.zbar.Symbol;
import p194nl.siegmann.epublib.domain.TableOfContents;

public class ZBarScanner extends C6348n {

    /* renamed from: E */
    private static boolean f23548E = true;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f23549A = true;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public Intent f23550B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f23551C = false;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f23552D = false;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public Runnable f23553F = new Runnable() {
        public void run() {
            if (ZBarScanner.this.f23565y) {
                ZBarScanner.this.f23560t.autoFocus(ZBarScanner.this.f23559s);
            }
        }
    };

    /* renamed from: n */
    TextView f23554n;

    /* renamed from: o */
    Button f23555o;

    /* renamed from: p */
    Button f23556p;

    /* renamed from: q */
    ImageScanner f23557q;

    /* renamed from: r */
    PreviewCallback f23558r = new PreviewCallback() {
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            Size previewSize = camera.getParameters().getPreviewSize();
            Image image = new Image(previewSize.width, previewSize.height, "Y800");
            image.setData(bArr);
            if (ZBarScanner.this.f23557q.scanImage(image) != 0) {
                Iterator it = ZBarScanner.this.f23557q.mo20841b().iterator();
                while (it.hasNext()) {
                    Symbol symbol = (Symbol) it.next();
                    if (!ZBarScanner.this.f23566z || !ZBarScanner.this.f23549A) {
                        boolean z = symbol.mo20846b() == 64;
                        if (ZBarScanner.this.f23549A) {
                            if (z) {
                            }
                        }
                        if (ZBarScanner.this.f23566z && !z) {
                        }
                    }
                    ZBarScanner.this.f23554n.setText(C4991i.m24774a(ZBarScanner.this, new C4988f(symbol.getData())).mo16289c());
                    ZBarScanner.this.f23564x = true;
                    ZBarScanner.this.f23550B = new Intent();
                    ZBarScanner.this.f23550B.putExtra("SCAN_RESULT", symbol.getData());
                    StringBuilder sb = new StringBuilder();
                    sb.append("");
                    sb.append(symbol.mo20846b());
                    ZBarScanner.this.f23550B.putExtra("SCAN_RESULT_FORMAT", sb.toString());
                    if (ZBarScanner.this.f23565y) {
                        ZBarScanner.this.f23565y = false;
                        ZBarScanner.this.f23560t.setPreviewCallback(null);
                        ZBarScanner.this.f23560t.stopPreview();
                    }
                    if (ZBarScanner.this.f23551C) {
                        int[] c = symbol.mo20847c();
                        try {
                            C6573ab abVar = new C6573ab(bArr, previewSize.width, previewSize.height, c[0], c[1], c[2], c[3], false);
                            ZBarScanner.this.m32329a(abVar.mo20544c());
                        } catch (Exception e) {
                            Log.e("ZBarCodeScanner", "Crop Exception", e);
                        }
                    }
                    ZBarScanner.this.f23556p.setEnabled(true);
                    ZBarScanner.this.f23555o.setEnabled(true);
                    if (ZBarScanner.this.f23552D) {
                        ZBarScanner.this.m32345q();
                        Bundle bundle = new Bundle();
                        bundle.putString("RAW_DATA", symbol.getData());
                        bundle.putString("CROP_PATH", ZBarScanner.this.f23550B.getExtras().getString("BARCODE_CROP"));
                        ZBarScanner.this.startActivityForResult(App.m25603a(new FragmentInfo(C5472b.class.getName(), bundle), (Context) ZBarScanner.this), 1000);
                    }
                }
            }
        }
    };

    /* renamed from: s */
    AutoFocusCallback f23559s = new AutoFocusCallback() {
        public void onAutoFocus(boolean z, Camera camera) {
            ZBarScanner.this.f23562v.postDelayed(ZBarScanner.this.f23553F, 1000);
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: t */
    public Camera f23560t;

    /* renamed from: u */
    private C6710a f23561u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public Handler f23562v;

    /* renamed from: w */
    private boolean f23563w = false;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f23564x = false;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f23565y = true;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f23566z = true;

    static {
        try {
            System.loadLibrary("iconv");
        } catch (UnsatisfiedLinkError unused) {
            Log.w("ZBarScanner", "Could not load native library: iconv");
            f23548E = false;
        }
        try {
            System.loadLibrary("zbarjni");
        } catch (UnsatisfiedLinkError unused2) {
            Log.w("ZBarScanner", "Could not load native library: zbarjni");
            f23548E = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m32329a(Bitmap bitmap) {
        StringBuilder sb = new StringBuilder();
        sb.append(App.m25665m());
        sb.append("/Barcodes");
        String sb2 = sb.toString();
        new File(sb2).mkdirs();
        String format = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(new Date());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(format);
        sb3.append(".png");
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb2);
        sb5.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb5.append(sb4);
        String sb6 = sb5.toString();
        try {
            bitmap.compress(CompressFormat.PNG, 90, new FileOutputStream(sb6));
            this.f23550B.putExtra("BARCODE_CROP", sb6);
        } catch (Exception e) {
            Log.d("ZBarScanner", "saveBarcodeImage: ", e);
        }
    }

    /* renamed from: n */
    public static Camera m32344n() {
        try {
            return Camera.open();
        } catch (Exception e) {
            Log.e("ZBAR", "Exception", e);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m32345q() {
        if (this.f23560t != null) {
            this.f23565y = false;
            this.f23560t.setPreviewCallback(null);
            this.f23560t.release();
            this.f23560t = null;
        }
    }

    /* renamed from: r */
    private boolean m32346r() {
        if (C6569aa.m31796a() && !this.f23563w) {
            this.f23563w = C0452b.m2065b((Context) this, "android.permission.CAMERA") == 0;
            if (!this.f23563w) {
                C6569aa.m31795a((C0767e) this, 100, "android.permission.CAMERA", new int[]{C5462k.zbar_permission_rationale_camera, C5462k.zbar_camera_permission_required_toast});
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public void mo16842m() {
        this.f23562v = new Handler();
        this.f23560t = m32344n();
        this.f23557q = new ImageScanner();
        this.f23557q.setConfig(0, 256, 3);
        this.f23557q.setConfig(0, 257, 3);
        this.f23561u = new C6710a(this, this.f23560t, this.f23558r, this.f23559s);
        ((FrameLayout) findViewById(C5458g.camera_preview)).addView(this.f23561u);
        this.f23554n = (TextView) findViewById(C5458g.scan_text);
        this.f23555o = (Button) findViewById(C5458g.scan_button);
        this.f23555o.setEnabled(false);
        this.f23555o.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (ZBarScanner.this.f23564x) {
                    ZBarScanner.this.f23564x = false;
                    ZBarScanner.this.f23554n.setText(C5462k.barcode_scanner_scanning);
                    ZBarScanner.this.f23560t.setPreviewCallback(ZBarScanner.this.f23558r);
                    ZBarScanner.this.f23560t.startPreview();
                    ZBarScanner.this.f23565y = true;
                    ZBarScanner.this.f23560t.autoFocus(ZBarScanner.this.f23559s);
                    ZBarScanner.this.f23555o.setEnabled(false);
                }
            }
        });
        this.f23556p = (Button) findViewById(C5458g.done_button);
        if (!this.f23552D) {
            this.f23556p.setEnabled(false);
            this.f23556p.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    ZBarScanner.this.setResult(-1, ZBarScanner.this.f23550B);
                    ZBarScanner.this.finish();
                }
            });
            return;
        }
        this.f23551C = true;
        this.f23556p.setVisibility(8);
        this.f23555o.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1000) {
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        C0751a i = mo3083i();
        if (i != null) {
            i.mo3003d();
        }
        setContentView(C5460i.zbar_scanner_view);
        setResult(0);
        if (!getPackageManager().hasSystemFeature("android.hardware.camera")) {
            C6620n.m32029a((Context) this, C5462k.barcode_scanner_info, C5462k.barcode_scanner_no_camera, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    ZBarScanner.this.finish();
                }
            });
        }
        if (!f23548E) {
            C6620n.m32029a((Context) this, C5462k.error, C5462k.zbar_no_native_libs, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    ZBarScanner.this.finish();
                }
            });
            return;
        }
        setRequestedOrientation(0);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f23551C = extras.getBoolean("NEED_BARCODE_CROP");
            String string = extras.getString("SCAN_MODE");
            if (string != null) {
                if (string.equalsIgnoreCase("PRODUCT_MODE")) {
                    this.f23566z = false;
                    this.f23549A = true;
                } else if (string.equalsIgnoreCase("QR_CODE_MODE")) {
                    this.f23566z = true;
                    this.f23549A = false;
                }
            }
            this.f23552D = extras.getBoolean("FAST_SCAN");
        }
        if (!m32346r()) {
            mo16842m();
        }
    }

    public void onPause() {
        super.onPause();
        m32345q();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 100) {
            this.f23563w = C6569aa.m31801a(strArr, iArr, "android.permission.CAMERA");
            if (!this.f23563w) {
                new Handler(Looper.myLooper()).postDelayed(new Runnable() {
                    public void run() {
                        C6570a.m31804a(false, C5462k.zbar_camera_permission_denied).mo1448a(ZBarScanner.this.mo1469g(), "permissionDialog");
                    }
                }, 400);
            } else {
                mo16842m();
                Toast.makeText(this, C5462k.common_permission_granted, 0).show();
            }
        }
    }
}
