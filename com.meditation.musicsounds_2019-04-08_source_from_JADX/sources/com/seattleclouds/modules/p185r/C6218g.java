package com.seattleclouds.modules.p185r;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.C0374l;
import android.support.p009v4.app.C0395p;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.content.C0452b;
import android.support.p009v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.modules.p185r.C6195b.C6198b;
import com.seattleclouds.modules.p185r.C6211d.C6215b;
import com.seattleclouds.util.C6569aa;
import com.seattleclouds.util.C6569aa.C6570a;
import com.seattleclouds.util.C6593am;
import com.seattleclouds.util.C6598aq;
import com.seattleclouds.util.C6620n;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import org.apache.commons.p198io.C6730b;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.seattleclouds.modules.r.g */
public class C6218g extends C6557s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public LinearLayout f22052a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ViewPager f22053b;

    /* renamed from: c */
    private C6226a f22054c;

    /* renamed from: d */
    private String f22055d;

    /* renamed from: e */
    private String f22056e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C6216e f22057f = null;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public File f22058g;

    /* renamed from: h */
    private boolean f22059h = true;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f22060i;

    /* renamed from: com.seattleclouds.modules.r.g$a */
    private class C6226a extends C0395p {

        /* renamed from: b */
        private String f22071b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public File[] f22072c = null;

        /* renamed from: d */
        private final FilenameFilter f22073d = new FilenameFilter() {
            public boolean accept(File file, String str) {
                return str.toLowerCase().endsWith(".jpg");
            }
        };

        /* renamed from: e */
        private final Comparator<File> f22074e = new Comparator<File>() {
            /* renamed from: a */
            private long m30319a(String str) {
                int lastIndexOf = str.lastIndexOf(".");
                if (lastIndexOf > 0) {
                    try {
                        return Long.parseLong(str.substring(0, lastIndexOf));
                    } catch (NumberFormatException unused) {
                    }
                }
                return -1;
            }

            /* renamed from: a */
            public int compare(File file, File file2) {
                return m30319a(file.getName()) > m30319a(file2.getName()) ? 1 : -1;
            }
        };

        public C6226a(C0374l lVar, String str) {
            super(lVar);
            this.f22071b = str;
            mo19501d();
        }

        /* renamed from: a */
        public int mo2475a(Object obj) {
            return -2;
        }

        /* renamed from: a */
        public int mo19499a(String str) {
            if (!(this.f22072c == null || str == null)) {
                for (int i = 0; i < this.f22072c.length; i++) {
                    if (this.f22072c[i].getAbsolutePath().equals(str)) {
                        return i;
                    }
                }
            }
            return -1;
        }

        /* renamed from: a */
        public Fragment mo1664a(int i) {
            Bundle bundle = new Bundle(1);
            if (this.f22072c != null) {
                bundle.putString("ARG_IMAGE_PATH", this.f22072c[i].getAbsolutePath());
            }
            C6211d dVar = new C6211d();
            dVar.mo1289g(bundle);
            dVar.mo19479a(C6218g.this.f22057f);
            dVar.mo19478a((C6215b) new C6215b() {
                public void onClick(C6211d dVar) {
                    C6218g.this.m30286a(dVar.mo1450b(), true);
                }
            });
            return dVar;
        }

        /* renamed from: b */
        public int mo2480b() {
            if (this.f22072c != null) {
                return this.f22072c.length;
            }
            return 0;
        }

        /* renamed from: b */
        public String mo19500b(int i) {
            if (this.f22072c != null && i >= 0 && i < this.f22072c.length) {
                return this.f22072c[i].getAbsolutePath();
            }
            return null;
        }

        /* renamed from: d */
        public void mo19501d() {
            if (this.f22071b == null) {
                this.f22072c = null;
                return;
            }
            File file = new File(this.f22071b);
            if (file.exists()) {
                this.f22072c = file.listFiles(this.f22073d);
                if (this.f22072c.length > 1) {
                    Arrays.sort(this.f22072c, this.f22074e);
                }
            } else {
                this.f22072c = null;
            }
            mo2485c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m30286a(String str, boolean z) {
        if (str != null) {
            this.f22056e = str;
            Bundle bundle = new Bundle();
            bundle.putBoolean("SAVE_ON_CANCEL", z);
            bundle.putString("ARG_IMAGE_PATH", str);
            startActivityForResult(App.m25603a(new FragmentInfo(C6199c.class.getName(), bundle), (Context) mo1318s()), 2);
        }
    }

    /* renamed from: as */
    private File m30288as() {
        String valueOf = String.valueOf(new Date().getTime());
        StringBuilder sb = new StringBuilder();
        sb.append(valueOf);
        sb.append(".jpg");
        String sb2 = sb.toString();
        File file = new File(this.f22055d);
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f22055d);
        sb3.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb3.append(sb2);
        File file2 = new File(sb3.toString());
        if (file2.createNewFile()) {
            return file2;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: at */
    public void m30289at() {
        if (!m30300e(31) && !m30300e(32)) {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            PackageManager packageManager = mo1318s().getPackageManager();
            if (!(packageManager == null || intent.resolveActivity(packageManager) == null)) {
                File file = null;
                try {
                    file = m30288as();
                } catch (IOException unused) {
                }
                if (file != null) {
                    this.f22056e = file.getAbsolutePath();
                    intent.putExtra("output", C6598aq.m31937a(file));
                    startActivityForResult(intent, 1);
                }
            }
        }
    }

    /* renamed from: b */
    private void m30290b() {
        if (this.f22054c.f22072c != null && this.f22054c.f22072c.length != 0) {
            Bundle bundle = new Bundle();
            bundle.putString("ARG_PDF_FILE", this.f22058g.getAbsolutePath());
            ArrayList arrayList = new ArrayList(this.f22054c.f22072c.length);
            for (File absolutePath : this.f22054c.f22072c) {
                arrayList.add(absolutePath.getAbsolutePath());
            }
            bundle.putStringArrayList("ARG_IMAGE_PATH_LIST", arrayList);
            C6195b bVar = new C6195b();
            bVar.mo1289g(bundle);
            bVar.mo19452a((C6198b) new C6198b() {
                /* renamed from: a */
                public void mo19457a() {
                    C6218g.this.f22060i = C6218g.this.f22058g.exists();
                    C6218g.this.mo20292ay();
                }

                /* renamed from: a */
                public void mo19458a(int i) {
                    C6218g.this.m30291b(C5462k.info, i);
                }
            });
            bVar.mo1448a(mo1322u(), "createPdfDialog");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m30291b(int i, int i2) {
        C0367h s = mo1318s();
        if (s != null) {
            C6620n.m32028a((Context) s, i, i2);
        }
    }

    /* renamed from: c */
    private void m30294c() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("application/pdf");
        intent.putExtra("android.intent.extra.STREAM", C6598aq.m31937a(this.f22058g));
        mo1230a(Intent.createChooser(intent, mo1320t().getText(C5462k.scan_document_share)));
    }

    /* renamed from: c */
    private void m30295c(final int i, int i2) {
        if (this.f22054c != null) {
            this.f22054c.mo19501d();
            if (i >= 0) {
                if (i2 > 0) {
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            C6218g.this.f22053b.mo2249a(i, true);
                        }
                    }, (long) i2);
                } else {
                    this.f22053b.mo2249a(i, true);
                }
            }
        }
    }

    /* renamed from: d */
    private void m30297d() {
        this.f22057f = new C6216e();
    }

    /* renamed from: e */
    private void m30299e() {
        m30295c(-1, -1);
    }

    /* renamed from: e */
    private boolean m30300e(int i) {
        if (C6569aa.m31796a()) {
            switch (i) {
                case 31:
                    boolean z = C0452b.m2065b((Context) mo1318s(), "android.permission.CAMERA") == 0;
                    if (!z) {
                        C6569aa.m31791a((Fragment) this, 31, "android.permission.CAMERA", new int[]{C5462k.scan_document_permission_camera_rational, C5462k.scan_document_permission_camera_toast});
                    }
                    return !z;
                case 32:
                    boolean z2 = C0452b.m2065b((Context) mo1318s(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
                    if (!z2) {
                        C6569aa.m31791a((Fragment) this, 32, "android.permission.WRITE_EXTERNAL_STORAGE", new int[]{C5462k.scan_document_permission_rationale_write_external_storage, C5462k.scan_document_permission_write_external_storage_required_toast});
                    }
                    return !z2;
            }
        }
        return false;
    }

    /* renamed from: L */
    public void mo1202L() {
        if (this.f22057f != null) {
            this.f22057f.mo19488a();
        }
        super.mo1202L();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f22052a = (LinearLayout) layoutInflater.inflate(C5460i.fragment_scan_document, viewGroup, false);
        return this.f22052a;
    }

    /* renamed from: a */
    public void mo1222a(int i, int i2, Intent intent) {
        if (i == 1) {
            if (i2 == -1) {
                m30286a(this.f22056e, false);
            } else if (this.f22056e != null) {
                new File(this.f22056e).delete();
                this.f22056e = null;
            }
        } else if (i == 2) {
            m30295c(-1, -1);
            final int a = this.f22054c.mo19499a(this.f22056e);
            if (a >= 0) {
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        C6218g.this.f22053b.mo2249a(a, true);
                    }
                }, 400);
            }
        }
    }

    /* renamed from: a */
    public void mo1224a(int i, String[] strArr, int[] iArr) {
        switch (i) {
            case 31:
                if (!C6569aa.m31801a(strArr, iArr, "android.permission.CAMERA")) {
                    new Handler(Looper.myLooper()).postDelayed(new Runnable() {
                        public void run() {
                            C6570a.m31804a(false, C5462k.scan_document_permission_camera_denied).mo1448a(C6218g.this.mo1318s().mo1469g(), "permissionDialog");
                        }
                    }, 400);
                } else {
                    Toast.makeText(mo1318s(), C5462k.common_permission_granted, 0).show();
                }
                return;
            case 32:
                if (!C6569aa.m31801a(strArr, iArr, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                    new Handler(Looper.myLooper()).postDelayed(new Runnable() {
                        public void run() {
                            C6570a.m31804a(false, C5462k.scan_document_permission_write_external_storage_denied).mo1448a(C6218g.this.mo1318s().mo1469g(), "permissionDialog");
                        }
                    }, 400);
                } else {
                    Toast.makeText(mo1318s(), C5462k.common_permission_granted, 0).show();
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo1239a(Menu menu) {
        if (this.f22059h) {
            boolean z = this.f22054c != null && this.f22054c.mo2480b() > 0;
            menu.findItem(C5458g.delete).setEnabled(z).setVisible(z);
            menu.findItem(C5458g.delete_all).setEnabled(z).setVisible(z);
            menu.findItem(C5458g.generate_pdf).setEnabled(z).setVisible(z);
            menu.findItem(C5458g.share).setEnabled(this.f22060i).getIcon().setAlpha(this.f22060i ? 255 : 65);
        }
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        menuInflater.inflate(C5461j.scan_document_menu, menu);
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        Bundle m = mo1307m();
        if (m != null) {
            Bundle bundle2 = m.getBundle("PAGE_STYLE");
            C6593am.m31914a((View) this.f22052a, bundle2);
            String string = m.getString("PAGE_ID");
            if (string == null) {
                throw new IllegalArgumentException("Missing pageId");
            } else if (!App.m25663l()) {
                this.f22059h = false;
                this.f22052a.findViewById(C5458g.take_picture_button).setEnabled(false);
                TextView textView = new TextView(mo1318s());
                textView.setText(C5462k.scan_document_no_storage);
                textView.setGravity(17);
                textView.setLayoutParams(new LayoutParams(-1, -1, 1.0f));
                C6593am.m31915a(textView, bundle2);
                this.f22052a.removeViewAt(0);
                this.f22052a.addView(textView, 0);
                this.f22052a.findViewById(C5458g.take_picture_button).setEnabled(false);
            } else {
                this.f22052a.setOnTouchListener(new OnTouchListener() {
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        C6218g.this.f22052a.getParent().requestDisallowInterceptTouchEvent(true);
                        return false;
                    }
                });
                m30297d();
                this.f22055d = m.getString("ARG_CURRENT_SESSION_PATH");
                if (this.f22055d == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(App.m25659j());
                    sb.append("/ScanDocument/");
                    sb.append(string);
                    sb.append("/temp");
                    this.f22055d = sb.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f22055d);
                sb2.append("/out.pdf");
                this.f22058g = new File(sb2.toString());
                this.f22060i = this.f22058g.exists();
                this.f22053b = (ViewPager) this.f22052a.findViewById(C5458g.image_pager);
                this.f22053b.setHorizontalFadingEdgeEnabled(true);
                this.f22053b.setFadingEdgeLength(30);
                this.f22054c = new C6226a(mo1323v(), this.f22055d);
                ((Button) this.f22052a.findViewById(C5458g.take_picture_button)).setOnClickListener(new OnClickListener() {
                    public void onClick(View view) {
                        C6218g.this.m30289at();
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        ViewPager viewPager;
        C6226a aVar;
        super.mo17454a(z);
        if (this.f22053b != null) {
            if (z) {
                viewPager = this.f22053b;
                aVar = this.f22054c;
            } else {
                viewPager = this.f22053b;
                aVar = null;
            }
            viewPager.setAdapter(aVar);
        }
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C5458g.share) {
            m30294c();
            return true;
        } else if (itemId == C5458g.delete) {
            String b = this.f22054c.mo19500b(this.f22053b.getCurrentItem());
            if (b != null) {
                C6730b.m32467d(new File(b));
                m30299e();
                mo20292ay();
            }
            return true;
        } else if (itemId == C5458g.delete_all) {
            if (this.f22055d != null) {
                C6730b.m32467d(new File(this.f22055d));
                this.f22058g.delete();
                this.f22060i = false;
                m30299e();
                mo20292ay();
            }
            return true;
        } else if (itemId != C5458g.generate_pdf) {
            return super.mo1245a(menuItem);
        } else {
            m30290b();
            return true;
        }
    }
}
