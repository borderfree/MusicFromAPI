package com.seattleclouds.modules.mosaic;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.support.p009v4.app.C0394o;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.view.ViewPager;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.util.C6569aa;
import com.seattleclouds.util.C6569aa.C6570a;
import com.seattleclouds.util.C6593am;
import com.seattleclouds.util.C6619m;
import com.seattleclouds.util.C6620n;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.seattleclouds.modules.mosaic.c */
public class C5876c extends C6557s {

    /* renamed from: a */
    private static String f20804a = "c";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f20805b;
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public boolean f20806ae = false;

    /* renamed from: af */
    private LinearLayout f20807af;

    /* renamed from: ag */
    private TextView f20808ag;

    /* renamed from: ah */
    private TextView f20809ah;

    /* renamed from: c */
    private ViewPager f20810c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C5874b f20811d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ArrayList<ImgMetadata> f20812e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f20813f;

    /* renamed from: g */
    private Bundle f20814g;

    /* renamed from: h */
    private int f20815h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f20816i;

    /* renamed from: com.seattleclouds.modules.mosaic.c$a */
    private class C5882a extends SimpleOnGestureListener {
        private C5882a() {
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            C5876c.this.m28851m(!C5876c.this.f20816i);
            return false;
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getAbsolutePath());
        sb.append("/.sc_mosaic_temp");
        f20805b = sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m28841a(Exception exc) {
        Log.e(f20804a, "Error sharing image: ", exc);
        if (mo1318s() != null) {
            mo1318s().runOnUiThread(new Runnable() {
                public void run() {
                    Toast.makeText(C5876c.this.mo1318s(), C5462k.error_action_failed_try_again, 0).show();
                }
            });
        }
    }

    /* renamed from: c */
    private void m28847c() {
        if (!m28848d()) {
            if (!"mounted".equals(Environment.getExternalStorageState())) {
                C6620n.m32029a((Context) mo1318s(), C5462k.warning, C5462k.mosaic_image_share_no_sc_card, (OnClickListener) null);
                return;
            }
            File file = new File(f20805b);
            if (!file.exists()) {
                file.mkdirs();
            }
            final String str = this.f20811d.mo1450b().f20780b;
            if (!this.f20806ae) {
                this.f20806ae = true;
                new Thread(new Runnable() {
                    /* JADX WARNING: Removed duplicated region for block: B:24:0x006d A[SYNTHETIC, Splitter:B:24:0x006d] */
                    /* JADX WARNING: Removed duplicated region for block: B:30:0x007a A[Catch:{ Exception -> 0x0141 }] */
                    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ef A[SYNTHETIC, Splitter:B:49:0x00ef] */
                    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f6 A[Catch:{ Exception -> 0x0141 }] */
                    /* JADX WARNING: Removed duplicated region for block: B:61:0x0123  */
                    /* JADX WARNING: Unknown top exception splitter block from list: {B:21:0x0066=Splitter:B:21:0x0066, B:46:0x00e8=Splitter:B:46:0x00e8} */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void run() {
                        /*
                            r8 = this;
                            r0 = 0
                            java.lang.String r1 = r0     // Catch:{ Exception -> 0x0141 }
                            java.io.InputStream r1 = com.seattleclouds.App.m25649e(r1)     // Catch:{ Exception -> 0x0141 }
                            r2 = 0
                            if (r1 == 0) goto L_0x0081
                            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0064, all -> 0x005f }
                            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0064, all -> 0x005f }
                            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0064, all -> 0x005f }
                            r5.<init>()     // Catch:{ Exception -> 0x0064, all -> 0x005f }
                            java.lang.String r6 = com.seattleclouds.modules.mosaic.C5876c.f20805b     // Catch:{ Exception -> 0x0064, all -> 0x005f }
                            r5.append(r6)     // Catch:{ Exception -> 0x0064, all -> 0x005f }
                            java.lang.String r6 = "/picture.png"
                            r5.append(r6)     // Catch:{ Exception -> 0x0064, all -> 0x005f }
                            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0064, all -> 0x005f }
                            r4.<init>(r5)     // Catch:{ Exception -> 0x0064, all -> 0x005f }
                            r3.<init>(r4)     // Catch:{ Exception -> 0x0064, all -> 0x005f }
                            r4 = 8064(0x1f80, float:1.13E-41)
                            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x005d }
                        L_0x002d:
                            int r5 = r4.length     // Catch:{ Exception -> 0x005d }
                            int r5 = r1.read(r4, r0, r5)     // Catch:{ Exception -> 0x005d }
                            if (r5 < 0) goto L_0x0038
                            r3.write(r4, r0, r5)     // Catch:{ Exception -> 0x005d }
                            goto L_0x002d
                        L_0x0038:
                            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x005d }
                            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005d }
                            r5.<init>()     // Catch:{ Exception -> 0x005d }
                            java.lang.String r6 = com.seattleclouds.modules.mosaic.C5876c.f20805b     // Catch:{ Exception -> 0x005d }
                            r5.append(r6)     // Catch:{ Exception -> 0x005d }
                            java.lang.String r6 = "/picture.png"
                            r5.append(r6)     // Catch:{ Exception -> 0x005d }
                            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x005d }
                            r4.<init>(r5)     // Catch:{ Exception -> 0x005d }
                            android.net.Uri r4 = com.seattleclouds.util.C6598aq.m31937a(r4)     // Catch:{ Exception -> 0x005d }
                            r3.close()     // Catch:{ Exception -> 0x0141 }
                            r1.close()     // Catch:{ Exception -> 0x0141 }
                            goto L_0x0074
                        L_0x005d:
                            r4 = move-exception
                            goto L_0x0066
                        L_0x005f:
                            r3 = move-exception
                            r7 = r3
                            r3 = r2
                            r2 = r7
                            goto L_0x0078
                        L_0x0064:
                            r4 = move-exception
                            r3 = r2
                        L_0x0066:
                            com.seattleclouds.modules.mosaic.c r5 = com.seattleclouds.modules.mosaic.C5876c.this     // Catch:{ all -> 0x0077 }
                            r5.m28841a(r4)     // Catch:{ all -> 0x0077 }
                            if (r3 == 0) goto L_0x0070
                            r3.close()     // Catch:{ Exception -> 0x0141 }
                        L_0x0070:
                            r1.close()     // Catch:{ Exception -> 0x0141 }
                            r4 = r2
                        L_0x0074:
                            r3 = r4
                            goto L_0x00fb
                        L_0x0077:
                            r2 = move-exception
                        L_0x0078:
                            if (r3 == 0) goto L_0x007d
                            r3.close()     // Catch:{ Exception -> 0x0141 }
                        L_0x007d:
                            r1.close()     // Catch:{ Exception -> 0x0141 }
                            throw r2     // Catch:{ Exception -> 0x0141 }
                        L_0x0081:
                            com.seattleclouds.modules.mosaic.c r1 = com.seattleclouds.modules.mosaic.C5876c.this     // Catch:{ Exception -> 0x0141 }
                            com.seattleclouds.modules.mosaic.b r1 = r1.f20811d     // Catch:{ Exception -> 0x0141 }
                            android.graphics.Bitmap r1 = r1.mo1453c()     // Catch:{ Exception -> 0x0141 }
                            if (r1 == 0) goto L_0x00fa
                            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00e6, all -> 0x00e1 }
                            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00e6, all -> 0x00e1 }
                            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e6, all -> 0x00e1 }
                            r4.<init>()     // Catch:{ Exception -> 0x00e6, all -> 0x00e1 }
                            java.lang.String r5 = com.seattleclouds.modules.mosaic.C5876c.f20805b     // Catch:{ Exception -> 0x00e6, all -> 0x00e1 }
                            r4.append(r5)     // Catch:{ Exception -> 0x00e6, all -> 0x00e1 }
                            java.lang.String r5 = "/picture.png"
                            r4.append(r5)     // Catch:{ Exception -> 0x00e6, all -> 0x00e1 }
                            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00e6, all -> 0x00e1 }
                            r3.<init>(r4)     // Catch:{ Exception -> 0x00e6, all -> 0x00e1 }
                            r1.<init>(r3)     // Catch:{ Exception -> 0x00e6, all -> 0x00e1 }
                            com.seattleclouds.modules.mosaic.c r3 = com.seattleclouds.modules.mosaic.C5876c.this     // Catch:{ Exception -> 0x00df }
                            com.seattleclouds.modules.mosaic.b r3 = r3.f20811d     // Catch:{ Exception -> 0x00df }
                            android.graphics.Bitmap r3 = r3.mo1453c()     // Catch:{ Exception -> 0x00df }
                            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x00df }
                            r5 = 100
                            r3.compress(r4, r5, r1)     // Catch:{ Exception -> 0x00df }
                            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x00df }
                            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00df }
                            r4.<init>()     // Catch:{ Exception -> 0x00df }
                            java.lang.String r5 = com.seattleclouds.modules.mosaic.C5876c.f20805b     // Catch:{ Exception -> 0x00df }
                            r4.append(r5)     // Catch:{ Exception -> 0x00df }
                            java.lang.String r5 = "/picture.png"
                            r4.append(r5)     // Catch:{ Exception -> 0x00df }
                            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00df }
                            r3.<init>(r4)     // Catch:{ Exception -> 0x00df }
                            android.net.Uri r3 = com.seattleclouds.util.C6598aq.m31937a(r3)     // Catch:{ Exception -> 0x00df }
                            r1.close()     // Catch:{ Exception -> 0x0141 }
                            goto L_0x00fb
                        L_0x00df:
                            r3 = move-exception
                            goto L_0x00e8
                        L_0x00e1:
                            r1 = move-exception
                            r7 = r2
                            r2 = r1
                            r1 = r7
                            goto L_0x00f4
                        L_0x00e6:
                            r3 = move-exception
                            r1 = r2
                        L_0x00e8:
                            com.seattleclouds.modules.mosaic.c r4 = com.seattleclouds.modules.mosaic.C5876c.this     // Catch:{ all -> 0x00f3 }
                            r4.m28841a(r3)     // Catch:{ all -> 0x00f3 }
                            if (r1 == 0) goto L_0x00fa
                            r1.close()     // Catch:{ Exception -> 0x0141 }
                            goto L_0x00fa
                        L_0x00f3:
                            r2 = move-exception
                        L_0x00f4:
                            if (r1 == 0) goto L_0x00f9
                            r1.close()     // Catch:{ Exception -> 0x0141 }
                        L_0x00f9:
                            throw r2     // Catch:{ Exception -> 0x0141 }
                        L_0x00fa:
                            r3 = r2
                        L_0x00fb:
                            com.seattleclouds.modules.mosaic.c r1 = com.seattleclouds.modules.mosaic.C5876c.this
                            r1.f20806ae = r0
                            com.seattleclouds.modules.mosaic.c r1 = com.seattleclouds.modules.mosaic.C5876c.this
                            android.support.v4.app.h r1 = r1.mo1318s()
                            if (r1 == 0) goto L_0x0140
                            if (r3 == 0) goto L_0x0140
                            android.content.Intent r1 = new android.content.Intent
                            java.lang.String r4 = "android.intent.action.SEND"
                            r1.<init>(r4)
                            java.lang.String r4 = "image/*"
                            r1.setType(r4)
                            java.lang.String r4 = "android.intent.extra.STREAM"
                            r1.putExtra(r4, r3)
                            com.seattleclouds.modules.mosaic.c r3 = com.seattleclouds.modules.mosaic.C5876c.this
                            java.lang.String r3 = r3.f20813f
                            if (r3 == 0) goto L_0x0133
                            r3 = 1
                            java.lang.String[] r3 = new java.lang.String[r3]
                            com.seattleclouds.modules.mosaic.c r4 = com.seattleclouds.modules.mosaic.C5876c.this
                            java.lang.String r4 = r4.f20813f
                            r3[r0] = r4
                            java.lang.String r0 = "android.intent.extra.EMAIL"
                            r1.putExtra(r0, r3)
                        L_0x0133:
                            com.seattleclouds.modules.mosaic.c r0 = com.seattleclouds.modules.mosaic.C5876c.this
                            android.support.v4.app.h r0 = r0.mo1318s()
                            android.content.Intent r1 = android.content.Intent.createChooser(r1, r2)
                            r0.startActivity(r1)
                        L_0x0140:
                            return
                        L_0x0141:
                            r1 = move-exception
                            com.seattleclouds.modules.mosaic.c r2 = com.seattleclouds.modules.mosaic.C5876c.this
                            r2.m28841a(r1)
                            com.seattleclouds.modules.mosaic.c r1 = com.seattleclouds.modules.mosaic.C5876c.this
                            r1.f20806ae = r0
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.mosaic.C5876c.C58793.run():void");
                    }
                }).start();
                return;
            }
            Toast.makeText(mo1318s(), C5462k.mosaic_processing, 0).show();
        }
    }

    /* renamed from: d */
    private boolean m28848d() {
        if (!C6569aa.m31796a()) {
            return false;
        }
        boolean a = C6569aa.m31798a((Context) mo1318s(), C6569aa.f23243b);
        if (!a) {
            C6569aa.m31792a((Fragment) this, 98, C6569aa.f23243b, new int[]{C5462k.mosaic_permission_storage_read_rational, C5462k.mosaic_permission_storage_read_toast});
        }
        return !a;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m28850e(int i) {
        ImgMetadata imgMetadata = (ImgMetadata) this.f20812e.get(i);
        this.f20808ag.setText(imgMetadata.f20779a);
        this.f20809ah.setText(imgMetadata.f20781c);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m28851m(boolean z) {
        LinearLayout linearLayout;
        int i;
        if (z) {
            m28850e(this.f20810c.getCurrentItem());
            linearLayout = this.f20807af;
            i = 0;
        } else {
            linearLayout = this.f20807af;
            i = 8;
        }
        linearLayout.setVisibility(i);
        this.f20816i = z;
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(C5460i.fragment_mosaic_image_slide, viewGroup, false);
        this.f20807af = (LinearLayout) frameLayout.findViewById(C5458g.caption_layout);
        this.f20808ag = (TextView) frameLayout.findViewById(C5458g.caption_title);
        this.f20809ah = (TextView) frameLayout.findViewById(C5458g.caption_text);
        this.f20810c = (ViewPager) frameLayout.findViewById(C5458g.view_pager);
        if (this.f20812e != null && this.f20812e.size() > 0) {
            final GestureDetector gestureDetector = new GestureDetector(mo1318s(), new C5882a());
            this.f20810c.setOnTouchListener(new OnTouchListener() {
                @SuppressLint({"ClickableViewAccessibility"})
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    gestureDetector.onTouchEvent(motionEvent);
                    return false;
                }
            });
            this.f20810c.setAdapter(new C0394o(mo1322u()) {
                /* renamed from: a */
                public Fragment mo1655a(int i) {
                    ImgMetadata imgMetadata = (ImgMetadata) C5876c.this.f20812e.get(i);
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("ARG_IMG_METADATA", imgMetadata);
                    C5874b bVar = new C5874b();
                    bVar.mo1289g(bundle);
                    if (C5876c.this.f20811d == null) {
                        C5876c.this.f20811d = bVar;
                    }
                    return bVar;
                }

                /* renamed from: b */
                public int mo2480b() {
                    return C5876c.this.f20812e.size();
                }

                /* renamed from: b */
                public void mo1663b(ViewGroup viewGroup, int i, Object obj) {
                    super.mo1663b(viewGroup, i, obj);
                    C5876c.this.f20811d = (C5874b) obj;
                    C5876c.this.m28850e(i);
                    C5876c.this.mo20292ay();
                }
            });
            this.f20810c.setCurrentItem(this.f20815h);
            if (mo1318s() != null) {
                this.f20810c.setPageMargin(C6619m.m32014a(mo1318s(), 16.0f));
            }
            m28851m(this.f20816i);
        }
        C6593am.m31914a((View) this.f20810c, this.f20814g);
        C6593am.m31915a(this.f20808ag, this.f20814g);
        C6593am.m31915a(this.f20809ah, this.f20814g);
        return frameLayout;
    }

    /* renamed from: a */
    public void mo1224a(int i, String[] strArr, int[] iArr) {
        if (i != 98 || mo1318s() == null) {
            return;
        }
        if (!C6569aa.m31802a(strArr, iArr, C6569aa.f23243b)) {
            new Handler(Looper.myLooper()).postDelayed(new Runnable() {
                public void run() {
                    C6570a.m31804a(false, C5462k.mosaic_permission_storage_read_denied).mo1448a(C5876c.this.mo1318s().mo1469g(), "permissionDialog");
                }
            }, 400);
        } else {
            Toast.makeText(mo1318s(), C5462k.common_permission_granted, 0).show();
        }
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        Bundle m = mo1307m();
        if (m != null) {
            this.f20812e = m.getParcelableArrayList("mosaicimages");
            this.f20815h = m.getInt("selectedIndex");
            this.f20813f = m.getString("EMAIL_TO_SEND");
            this.f20814g = m.getBundle("PAGE_STYLE");
            this.f20816i = m.getBoolean("mosaicAutoCaptionsEnabled");
        }
        if (bundle != null) {
            this.f20815h = bundle.getInt("STATE_SELECTED_INDEX", this.f20815h);
            this.f20816i = bundle.getBoolean("STATE_CAPTION_VISIBLE", this.f20816i);
        }
    }

    /* renamed from: a */
    public void mo1239a(Menu menu) {
        MenuItem menuItem;
        boolean z;
        super.mo1239a(menu);
        if (this.f20811d == null || !this.f20811d.mo18637d()) {
            menuItem = menu.findItem(C5458g.share);
            z = false;
        } else {
            menuItem = menu.findItem(C5458g.share);
            z = true;
        }
        menuItem.setEnabled(z);
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(C5461j.mosaic_image_menu, menu);
        super.mo1240a(menu, menuInflater);
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        if (menuItem.getItemId() != C5458g.share) {
            return super.mo1245a(menuItem);
        }
        m28847c();
        return true;
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        bundle.putInt("STATE_SELECTED_INDEX", this.f20815h);
        bundle.putBoolean("STATE_CAPTION_VISIBLE", this.f20816i);
        super.mo1282e(bundle);
    }
}
