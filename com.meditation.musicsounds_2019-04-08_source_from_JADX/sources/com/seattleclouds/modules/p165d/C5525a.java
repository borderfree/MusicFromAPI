package com.seattleclouds.modules.p165d;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.location.Location;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.content.C0452b;
import android.support.p023v7.app.C0765d.C0766a;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.google.sczxing.p138a.p139a.C4981a;
import com.google.sczxing.p138a.p139a.C4982b;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5452a;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.location.C5420f;
import com.seattleclouds.location.C5431g;
import com.seattleclouds.location.C5431g.C5433b;
import com.seattleclouds.modules.feedback.LocationModel;
import com.seattleclouds.util.C6569aa;
import com.seattleclouds.util.C6569aa.C6570a;
import com.seattleclouds.util.C6602at;
import com.seattleclouds.util.C6620n;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.seattleclouds.modules.d.a */
public class C5525a extends C6557s {

    /* renamed from: a */
    private String f19659a = "";

    /* renamed from: ae */
    private Integer f19660ae;

    /* renamed from: af */
    private Date f19661af;

    /* renamed from: ag */
    private Date f19662ag;
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public boolean f19663ah;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public WebView f19664ai;
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public boolean f19665aj = true;
    /* access modifiers changed from: private */

    /* renamed from: ak */
    public boolean f19666ak = true;

    /* renamed from: al */
    private double f19667al;

    /* renamed from: am */
    private String f19668am;

    /* renamed from: an */
    private C5431g f19669an;
    /* access modifiers changed from: private */

    /* renamed from: ao */
    public Location f19670ao = new Location("code");

    /* renamed from: ap */
    private boolean f19671ap = false;
    /* access modifiers changed from: private */

    /* renamed from: aq */
    public View f19672aq = null;

    /* renamed from: ar */
    private boolean f19673ar = false;

    /* renamed from: b */
    private String f19674b = "";

    /* renamed from: c */
    private String f19675c;

    /* renamed from: d */
    private String[] f19676d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f19677e = "";

    /* renamed from: f */
    private String f19678f;

    /* renamed from: g */
    private String f19679g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Integer f19680h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Integer f19681i;

    /* renamed from: a */
    private double m27464a(double d, double d2, double d3, double d4, boolean z) {
        double d5 = (((d3 - d) * 3.141592653589793d) / 180.0d) / 2.0d;
        double d6 = (((d4 - d2) * 3.141592653589793d) / 180.0d) / 2.0d;
        double sin = (Math.sin(d5) * Math.sin(d5)) + (Math.cos((d * 3.141592653589793d) / 180.0d) * Math.cos((d3 * 3.141592653589793d) / 180.0d) * Math.sin(d6) * Math.sin(d6));
        return (z ? 3959.0d : 6371.0d) * Math.atan2(Math.sqrt(sin), Math.sqrt(1.0d - sin)) * 2.0d;
    }

    /* renamed from: a */
    private Date m27468a(String str, boolean z) {
        int i;
        int i2;
        int i3;
        if (str.length() >= 8) {
            int parseInt = Integer.parseInt(str.substring(0, 4));
            int parseInt2 = Integer.parseInt(str.substring(4, 6)) - 1;
            int parseInt3 = Integer.parseInt(str.substring(6, 8));
            if (!str.contains("T") || str.length() != 15) {
                i3 = 0;
                i2 = 0;
                i = 0;
            } else {
                int parseInt4 = Integer.parseInt(str.substring(9, 11));
                int parseInt5 = Integer.parseInt(str.substring(11, 13));
                i = Integer.parseInt(str.substring(13, 15));
                i3 = parseInt4;
                i2 = parseInt5;
            }
            Calendar instance = Calendar.getInstance();
            instance.set(parseInt, parseInt2, parseInt3, i3, i2, i);
            return instance.getTime();
        }
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(new Date());
        instance2.add(1, z ? 30 : -30);
        return instance2.getTime();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m27469a(double d, double d2) {
        C0367h s;
        int i;
        int i2;
        this.f19667al = Double.MAX_VALUE;
        if (m27478b(d, d2)) {
            if (this.f19669an != null) {
                this.f19669an.mo17731b();
                this.f19669an = null;
            }
            if (this.f19674b == null || this.f19674b.equalsIgnoreCase("")) {
                Integer num = this.f19681i;
                this.f19681i = Integer.valueOf(this.f19681i.intValue() + 1);
                if (mo1318s() != null) {
                    Editor edit = mo1318s().getSharedPreferences("Coupon", 0).edit();
                    edit.putInt(this.f19677e, this.f19681i.intValue());
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f19677e);
                    sb.append("date");
                    edit.putLong(sb.toString(), new Date().getTime());
                    edit.apply();
                }
                if (this.f19681i.intValue() >= this.f19680h.intValue()) {
                    s = mo1318s();
                    i = C5462k.info;
                    i2 = C5462k.coupone_show_to_vendor;
                } else {
                    s = mo1318s();
                    i = C5462k.info;
                    i2 = C5462k.coupone_check_succ;
                }
                C6620n.m32028a((Context) s, i, i2);
                m27474as();
                return;
            }
            C0367h s2 = mo1318s();
            int i3 = C5462k.info;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(mo1320t().getString(C5462k.coupone_check_succ));
            sb2.append(" ");
            sb2.append(mo1320t().getString(C5462k.coupone_haveto_scanqr));
            C6620n.m32031a((Context) s2, i3, sb2.toString());
            this.f19666ak = false;
            this.f19665aj = true;
            if (mo1318s() != null) {
                mo1318s().runOnUiThread(new Runnable() {
                    public void run() {
                        C5525a.this.mo20292ay();
                    }
                });
            }
        } else if (!this.f19671ap) {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("external://http://maps.google.com/maps?saddr=");
            sb3.append(this.f19670ao.getLatitude());
            sb3.append(",");
            sb3.append(this.f19670ao.getLongitude());
            sb3.append("&daddr=");
            sb3.append(Double.parseDouble(this.f19668am.split(",")[0]));
            sb3.append(",");
            sb3.append(Double.parseDouble(this.f19668am.split(",")[1]));
            LocationModel locationModel = new LocationModel(mo1219a(C5462k.coupone_get_directions), Double.parseDouble(this.f19668am.split(",")[0]), Double.parseDouble(this.f19668am.split(",")[1]), sb3.toString(), null, null, null);
            arrayList.add(locationModel);
            for (int i4 = 0; i4 < this.f19676d.length; i4++) {
                if (!this.f19676d[i4].equalsIgnoreCase(this.f19668am)) {
                    String str = this.f19676d[i4];
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("external://http://maps.google.com/maps?saddr=");
                    sb4.append(this.f19670ao.getLatitude());
                    sb4.append(",");
                    sb4.append(this.f19670ao.getLongitude());
                    sb4.append("&daddr=");
                    sb4.append(Double.parseDouble(str.split(",")[0]));
                    sb4.append(",");
                    sb4.append(Double.parseDouble(str.split(",")[1]));
                    LocationModel locationModel2 = new LocationModel(mo1219a(C5462k.coupone_get_directions), Double.parseDouble(str.split(",")[0]), Double.parseDouble(str.split(",")[1]), sb4.toString(), null, null, null);
                    arrayList.add(locationModel2);
                }
            }
            if (this.f19669an != null) {
                this.f19669an.mo17731b();
            }
            this.f19671ap = true;
            App.m25620a(C5420f.m27112a(arrayList), (Fragment) this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aA */
    public void m27472aA() {
        ImageView imageView = (ImageView) this.f19672aq.findViewById(C5458g.coupon_redeem_img);
        imageView.setVisibility(0);
        imageView.bringToFront();
        Animation loadAnimation = AnimationUtils.loadAnimation(mo1318s(), C5452a.coupon_redeem_scale);
        imageView.setAnimation(loadAnimation);
        loadAnimation.start();
    }

    /* renamed from: aB */
    private boolean m27473aB() {
        if (C6569aa.m31796a() && !this.f19673ar) {
            this.f19673ar = C0452b.m2065b((Context) mo1318s(), "android.permission.ACCESS_FINE_LOCATION") == 0;
            if (!this.f19673ar) {
                C6569aa.m31791a((Fragment) this, 101, "android.permission.ACCESS_FINE_LOCATION", new int[]{C5462k.coupone_permission_rationale_location, C5462k.coupone_location_permission_required_toast});
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: as */
    public void m27474as() {
        C6602at.m31951a(this.f19664ai, String.format(Locale.US, "var x=document.getElementById('couponcountscan'); if(x) x.innerHTML = \"%d/%d\";", new Object[]{this.f19681i, this.f19680h}));
        if (mo1318s() != null) {
            SharedPreferences sharedPreferences = mo1318s().getSharedPreferences("Coupon", 0);
            if (this.f19681i.intValue() >= this.f19680h.intValue()) {
                this.f19664ai.setVisibility(4);
                ((LinearLayout) this.f19672aq.findViewById(C5458g.coupon_result_layout)).setVisibility(0);
                this.f19665aj = false;
                this.f19666ak = false;
            } else {
                this.f19665aj = true;
                this.f19666ak = true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f19677e);
            sb.append("canBeScanAgain");
            if (sharedPreferences.contains(sb.toString())) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f19677e);
                sb2.append("canBeScanAgain");
                if (!sharedPreferences.getBoolean(sb2.toString(), false)) {
                    C6602at.m31951a(this.f19664ai, String.format(Locale.US, "var x=document.getElementById('couponcountscan'); if(x) x.innerHTML = \"%d/%d\";", new Object[]{this.f19680h, this.f19680h}));
                    this.f19665aj = false;
                    this.f19666ak = false;
                    m27472aA();
                }
            }
            mo1318s().runOnUiThread(new Runnable() {
                public void run() {
                    C5525a.this.mo20292ay();
                }
            });
        }
    }

    /* renamed from: at */
    private void m27475at() {
        C0367h s;
        int i;
        StringBuilder sb;
        String str;
        this.f19671ap = false;
        if (!this.f19666ak) {
            C6620n.m32028a((Context) mo1318s(), C5462k.info, C5462k.coupon_already_checked_in);
            return;
        }
        SharedPreferences sharedPreferences = mo1318s().getSharedPreferences("Coupon", 0);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f19677e);
        sb2.append("date");
        long j = sharedPreferences.getLong(sb2.toString(), 0);
        Date date = new Date();
        Date date2 = new Date();
        if (j != 0) {
            date = new Date(j);
        }
        int time = (int) (((date2.getTime() - date.getTime()) / 3600000) % 24);
        String str2 = (String) DateFormat.format("yyyy/MM/dd hh:mm:ss", this.f19662ag);
        String str3 = (String) DateFormat.format("yyyy/MM/dd hh:mm:ss", this.f19661af);
        if (date2.getTime() > this.f19662ag.getTime()) {
            s = mo1318s();
            i = C5462k.info;
            sb = new StringBuilder();
            sb.append(mo1320t().getString(C5462k.coupone_expired));
            str = " ";
        } else if (date2.getTime() < this.f19661af.getTime()) {
            s = mo1318s();
            i = C5462k.info;
            sb = new StringBuilder();
            sb.append(mo1320t().getString(C5462k.coupone_will_valid));
            sb.append(" ");
            sb.append(str3);
            str = " - ";
        } else if (time < this.f19660ae.intValue() && j != 0) {
            C6620n.m32031a((Context) mo1318s(), C5462k.info, String.format(mo1320t().getString(C5462k.coupone_will_access_check), new Object[]{Integer.valueOf(this.f19660ae.intValue() - time)}));
        } else if (!m27473aB()) {
            m27476az();
        } else {
            return;
        }
        sb.append(str);
        sb.append(str2);
        C6620n.m32031a((Context) s, i, sb.toString());
    }

    /* renamed from: az */
    private void m27476az() {
        if (this.f19669an == null) {
            this.f19669an = new C5431g(mo1318s(), new C5433b(false) {
                /* renamed from: a */
                public void mo17721a(Location location) {
                    super.mo17721a(location);
                    C5525a.this.f19670ao = location;
                    C5525a.this.m27469a(location.getLatitude(), location.getLongitude());
                }
            });
            this.f19669an.mo17728a(2000);
        }
        this.f19669an.mo17730a();
    }

    /* renamed from: b */
    private boolean m27478b(double d, double d2) {
        for (int i = 0; i < this.f19676d.length; i++) {
            String[] split = this.f19676d[i].split(",");
            if (split.length == 2) {
                double a = m27464a(d, d2, Double.parseDouble(split[0]), Double.parseDouble(split[1]), true);
                if (a < this.f19667al) {
                    this.f19667al = a;
                    this.f19668am = this.f19676d[i];
                }
                if (a <= 0.0170454545d) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m27480c() {
        this.f19664ai = (WebView) this.f19672aq.findViewById(C5458g.coupon_web_view);
        C6602at.m31950a(this.f19664ai);
        this.f19664ai.setWebViewClient(new WebViewClient() {
            public void onPageFinished(WebView webView, String str) {
                C5525a.this.m27474as();
            }
        });
    }

    /* renamed from: d */
    private void m27483d() {
        String str;
        int i;
        C0367h hVar;
        StringBuilder sb;
        String str2;
        if (this.f19665aj && mo1318s() != null) {
            if (!mo1318s().getPackageManager().hasSystemFeature("android.hardware.camera") || !"mounted".equals(Environment.getExternalStorageState())) {
                hVar = mo1318s();
                i = C5462k.info;
                str = "Cannot access camera.";
            } else {
                SharedPreferences sharedPreferences = mo1318s().getSharedPreferences("Coupon", 0);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f19677e);
                sb2.append("date");
                long j = sharedPreferences.getLong(sb2.toString(), 0);
                Date date = new Date();
                Date date2 = new Date();
                if (j != 0) {
                    date = new Date(j);
                }
                int time = (int) ((date2.getTime() - date.getTime()) / 3600000);
                String str3 = (String) DateFormat.format("yyyy/MM/dd hh:mm:ss", this.f19662ag);
                String str4 = (String) DateFormat.format("yyyy/MM/dd hh:mm:ss", this.f19661af);
                if (date2.getTime() > this.f19662ag.getTime()) {
                    hVar = mo1318s();
                    i = C5462k.info;
                    sb = new StringBuilder();
                    sb.append(mo1320t().getString(C5462k.coupone_expired));
                    str2 = " ";
                } else if (date2.getTime() < this.f19661af.getTime()) {
                    hVar = mo1318s();
                    i = C5462k.info;
                    sb = new StringBuilder();
                    sb.append(mo1320t().getString(C5462k.coupone_will_valid));
                    sb.append(" ");
                    sb.append(str4);
                    str2 = " - ";
                } else if (time >= this.f19660ae.intValue() || j == 0) {
                    Intent intent = new Intent("com.google.sczxing.client.android.SCAN");
                    intent.putExtra("NEED_BARCODE_CROP", true);
                    intent.putExtra("SCAN_MODE", "QR_CODE_MODE");
                    startActivityForResult(intent, 49374);
                } else {
                    hVar = mo1318s();
                    i = C5462k.info;
                    str = String.format(mo1320t().getString(C5462k.coupone_will_allowed_scan), new Object[]{Integer.valueOf(this.f19660ae.intValue() - time)});
                }
                sb.append(str2);
                sb.append(str3);
                str = sb.toString();
            }
            C6620n.m32031a((Context) hVar, i, str);
        }
    }

    /* renamed from: e */
    private void m27485e() {
        int i;
        int i2;
        C0367h hVar;
        if (this.f19674b.equalsIgnoreCase(this.f19675c)) {
            this.f19675c = "";
            Integer num = this.f19681i;
            this.f19681i = Integer.valueOf(this.f19681i.intValue() + 1);
            Editor edit = mo1318s().getSharedPreferences("Coupon", 0).edit();
            edit.putInt(this.f19677e, this.f19681i.intValue());
            StringBuilder sb = new StringBuilder();
            sb.append(this.f19677e);
            sb.append("date");
            edit.putLong(sb.toString(), new Date().getTime());
            edit.apply();
            if (this.f19681i.intValue() >= this.f19680h.intValue()) {
                hVar = mo1318s();
                i2 = C5462k.info;
                i = C5462k.coupone_show_to_vendor;
            } else {
                hVar = mo1318s();
                i2 = C5462k.info;
                i = C5462k.coupone_scan_succ;
            }
        } else {
            hVar = mo1318s();
            i2 = C5462k.info;
            i = C5462k.coupone_scan_failed;
        }
        C6620n.m32028a((Context) hVar, i2, i);
        m27474as();
    }

    /* renamed from: J */
    public void mo1200J() {
        if (this.f19669an != null && !mo1194D()) {
            this.f19669an.mo17730a();
        }
        super.mo1200J();
    }

    /* renamed from: K */
    public void mo1201K() {
        if (this.f19669an != null) {
            this.f19669an.mo17731b();
        }
        super.mo1201K();
    }

    /* renamed from: L */
    public void mo1202L() {
        if (this.f19669an != null) {
            this.f19669an.mo17731b();
        }
        this.f19669an = null;
        super.mo1202L();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f19672aq = layoutInflater.inflate(C5460i.coupon_activity, viewGroup, false);
        mo1450b();
        return this.f19672aq;
    }

    /* renamed from: a */
    public void mo1222a(int i, int i2, Intent intent) {
        if (i == 49374 && i2 == -1) {
            C4982b a = C4981a.m24719a(i, i2, intent);
            if (a != null) {
                a.mo16284a();
                this.f19675c = a.mo16284a();
            }
            m27485e();
        }
    }

    /* renamed from: a */
    public void mo1224a(int i, String[] strArr, int[] iArr) {
        if (i == 101) {
            this.f19673ar = C6569aa.m31801a(strArr, iArr, "android.permission.ACCESS_FINE_LOCATION");
            if (!this.f19673ar) {
                new Handler(Looper.myLooper()).postDelayed(new Runnable() {
                    public void run() {
                        C6570a.m31804a(false, C5462k.coupone_location_permission_denied).mo1448a(C5525a.this.mo1318s().mo1469g(), "permissionDialog");
                    }
                }, 400);
            } else {
                Toast.makeText(mo1318s(), C5462k.common_permission_granted, 0).show();
                m27476az();
            }
        }
    }

    /* renamed from: a */
    public void mo1239a(Menu menu) {
        boolean z = true;
        boolean z2 = this.f19676d != null && this.f19676d.length > 0 && this.f19666ak;
        if (this.f19674b == null || this.f19674b.length() <= 0 || !this.f19665aj) {
            z = false;
        }
        MenuItem findItem = menu.findItem(C5458g.coupon_menu_checkin);
        MenuItem findItem2 = menu.findItem(C5458g.coupon_menu_scan);
        if (findItem != null) {
            findItem.setEnabled(z2);
            findItem.setVisible(z2);
        }
        if (findItem2 != null) {
            findItem2.setEnabled(z);
            findItem2.setVisible(z);
        }
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        menuInflater.inflate(C5461j.coupon_menu, menu);
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C5458g.coupon_menu_checkin) {
            m27475at();
            return true;
        } else if (itemId != C5458g.coupon_menu_scan) {
            return super.mo1245a(menuItem);
        } else {
            m27483d();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1450b() {
        Bundle m = mo1307m();
        if (m != null) {
            this.f19679g = m.getString("pageid");
        }
        mo17910c(this.f19679g);
        m27480c();
        this.f19664ai.loadUrl(App.m25655h(this.f19679g));
        ((Button) this.f19672aq.findViewById(C5458g.coupon_bt_use)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (C5525a.this.mo1318s() != null) {
                    C0766a aVar = new C0766a(C5525a.this.mo1318s());
                    aVar.mo3054a((CharSequence) C5525a.this.mo1320t().getString(C5462k.info));
                    aVar.mo3063b((CharSequence) C5525a.this.mo1320t().getString(C5462k.coupone_doyouwantusecoupon));
                    aVar.mo3048a(17039379, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            C5525a.this.f19681i = Integer.valueOf(0);
                            Editor edit = C5525a.this.mo1318s().getSharedPreferences("Coupon", 0).edit();
                            edit.putInt(C5525a.this.f19677e, C5525a.this.f19681i.intValue());
                            StringBuilder sb = new StringBuilder();
                            sb.append(C5525a.this.f19677e);
                            sb.append("date");
                            edit.putLong(sb.toString(), new Date().getTime());
                            if (!C5525a.this.f19663ah) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(C5525a.this.f19677e);
                                sb2.append("canBeScanAgain");
                                edit.putBoolean(sb2.toString(), C5525a.this.f19663ah);
                            }
                            edit.apply();
                            C6602at.m31951a(C5525a.this.f19664ai, String.format(Locale.US, "var x=document.getElementById('couponcountscan'); if(x) x.innerHTML = \"%d/%d\";", new Object[]{C5525a.this.f19681i, C5525a.this.f19680h}));
                            C5525a.this.f19664ai.setVisibility(0);
                            ((LinearLayout) C5525a.this.f19672aq.findViewById(C5458g.coupon_result_layout)).setVisibility(4);
                            if (C5525a.this.f19663ah) {
                                C5525a.this.f19665aj = true;
                                C5525a.this.f19666ak = true;
                            }
                            if (!C5525a.this.f19663ah) {
                                C5525a.this.m27472aA();
                            }
                            C5525a.this.mo1318s().runOnUiThread(new Runnable() {
                                public void run() {
                                    C5525a.this.mo20292ay();
                                }
                            });
                        }
                    });
                    aVar.mo3061b(17039369, (DialogInterface.OnClickListener) null);
                    aVar.mo3068c();
                }
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0205 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01b1 A[EDGE_INSN: B:87:0x01b1->B:74:0x01b1 ?: BREAK  
    EDGE_INSN: B:87:0x01b1->B:74:0x01b1 ?: BREAK  
    EDGE_INSN: B:87:0x01b1->B:74:0x01b1 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01b1 A[EDGE_INSN: B:87:0x01b1->B:74:0x01b1 ?: BREAK  
    EDGE_INSN: B:87:0x01b1->B:74:0x01b1 ?: BREAK  , SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17910c(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "couponcount"
            r0.append(r1)
            java.lang.String r1 = com.seattleclouds.App.f18523y
            r0.append(r1)
            java.lang.String r1 = com.seattleclouds.App.f18524z
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            r10.f19677e = r0
            javax.xml.parsers.DocumentBuilderFactory r0 = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            r1 = 0
            javax.xml.parsers.DocumentBuilder r0 = r0.newDocumentBuilder()     // Catch:{ ParserConfigurationException -> 0x0027 }
            goto L_0x0032
        L_0x0027:
            r0 = move-exception
            java.lang.String r2 = "CouponFragment"
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r2, r0)
            r0 = r1
        L_0x0032:
            java.lang.String r2 = "app.xml"
            java.io.InputStream r2 = com.seattleclouds.App.m25649e(r2)     // Catch:{ SAXException -> 0x0045, IOException -> 0x003d }
            org.w3c.dom.Document r0 = r0.parse(r2)     // Catch:{ SAXException -> 0x0045, IOException -> 0x003d }
            goto L_0x0050
        L_0x003d:
            r0 = move-exception
            java.lang.String r2 = "CouponFragment"
            java.lang.String r0 = r0.toString()
            goto L_0x004c
        L_0x0045:
            r0 = move-exception
            java.lang.String r2 = "CouponFragment"
            java.lang.String r0 = r0.toString()
        L_0x004c:
            android.util.Log.e(r2, r0)
            r0 = r1
        L_0x0050:
            org.w3c.dom.Element r0 = r0.getDocumentElement()
            java.lang.String r2 = "page"
            org.w3c.dom.NodeList r0 = r0.getElementsByTagName(r2)
            r2 = 0
            if (r0 == 0) goto L_0x01b1
            int r3 = r0.getLength()
            if (r3 <= 0) goto L_0x01b1
            r3 = 0
        L_0x0064:
            int r4 = r0.getLength()
            if (r3 >= r4) goto L_0x01b1
            org.w3c.dom.Node r4 = r0.item(r3)
            org.w3c.dom.Element r4 = (org.w3c.dom.Element) r4
            java.lang.String r5 = "id"
            org.w3c.dom.Attr r5 = r4.getAttributeNode(r5)
            if (r5 != 0) goto L_0x007a
            goto L_0x01ad
        L_0x007a:
            java.lang.String r5 = r5.getValue()
            if (r5 == 0) goto L_0x01ad
            boolean r5 = r11.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x01ad
            java.lang.String r0 = "countofscans"
            org.w3c.dom.Attr r0 = r4.getAttributeNode(r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            if (r0 == 0) goto L_0x00a7
            java.lang.String r0 = r0.getValue()     // Catch:{ Exception -> 0x009f }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x009f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x009f }
            goto L_0x00a8
        L_0x009f:
            r0 = move-exception
            java.lang.String r5 = "Coupon"
            java.lang.String r6 = "Exception 236"
            android.util.Log.d(r5, r6, r0)
        L_0x00a7:
            r0 = r3
        L_0x00a8:
            java.lang.String r3 = "startdate"
            org.w3c.dom.Attr r3 = r4.getAttributeNode(r3)
            java.lang.String r5 = ""
            if (r3 == 0) goto L_0x00b6
            java.lang.String r5 = r3.getValue()
        L_0x00b6:
            java.lang.String r3 = "enddate"
            org.w3c.dom.Attr r3 = r4.getAttributeNode(r3)
            java.lang.String r6 = ""
            if (r3 == 0) goto L_0x00c4
            java.lang.String r6 = r3.getValue()
        L_0x00c4:
            java.lang.String r3 = "hoursbeforenextcheck"
            org.w3c.dom.Attr r3 = r4.getAttributeNode(r3)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            if (r3 == 0) goto L_0x00e8
            java.lang.String r8 = r3.getValue()
            java.lang.String r9 = ""
            boolean r8 = r8.equalsIgnoreCase(r9)
            if (r8 != 0) goto L_0x00e8
            java.lang.String r3 = r3.getValue()
            int r3 = java.lang.Integer.parseInt(r3)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
        L_0x00e8:
            java.lang.String r3 = "canbeusedagain"
            org.w3c.dom.Attr r3 = r4.getAttributeNode(r3)
            java.lang.String r8 = ""
            if (r3 == 0) goto L_0x00f6
            java.lang.String r8 = r3.getValue()
        L_0x00f6:
            java.lang.String r3 = "redeemimagename"
            org.w3c.dom.Attr r3 = r4.getAttributeNode(r3)
            if (r3 == 0) goto L_0x0104
            java.lang.String r3 = r3.getValue()
            r10.f19659a = r3
        L_0x0104:
            java.lang.String r3 = r10.f19659a
            if (r3 == 0) goto L_0x0112
            java.lang.String r3 = r10.f19659a
            java.lang.String r9 = ""
            boolean r3 = r3.equalsIgnoreCase(r9)
            if (r3 == 0) goto L_0x0116
        L_0x0112:
            java.lang.String r3 = "redeemed.png"
            r10.f19659a = r3
        L_0x0116:
            java.lang.String r3 = "resultimage"
            org.w3c.dom.Attr r3 = r4.getAttributeNode(r3)
            if (r3 == 0) goto L_0x0124
            java.lang.String r3 = r3.getValue()
            r10.f19678f = r3
        L_0x0124:
            java.lang.String r3 = "barcodedata"
            org.w3c.dom.Attr r3 = r4.getAttributeNode(r3)
            if (r3 == 0) goto L_0x0132
            java.lang.String r3 = r3.getValue()
            r10.f19674b = r3
        L_0x0132:
            java.lang.String r3 = "gpsdata"
            org.w3c.dom.Attr r3 = r4.getAttributeNode(r3)
            if (r3 == 0) goto L_0x0152
            java.lang.String r4 = r3.getValue()
            java.lang.String r9 = ""
            boolean r4 = r4.equalsIgnoreCase(r9)
            if (r4 != 0) goto L_0x0152
            java.lang.String r3 = r3.getValue()
            java.lang.String r4 = ";"
            java.lang.String[] r3 = r3.split(r4)
            r10.f19676d = r3
        L_0x0152:
            r10.f19679g = r11
            r10.f19680h = r0
            r10.f19660ae = r7
            android.support.v4.app.h r11 = r10.mo1318s()
            java.lang.String r0 = "Coupon"
            android.content.SharedPreferences r11 = r11.getSharedPreferences(r0, r2)
            java.lang.String r0 = r10.f19677e
            int r0 = r11.getInt(r0, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.f19681i = r0
            java.util.Date r0 = r10.m27468a(r5, r2)
            r10.f19661af = r0
            r0 = 1
            java.util.Date r3 = r10.m27468a(r6, r0)
            r10.f19662ag = r3
            java.lang.String r3 = "yes"
            boolean r3 = r8.equalsIgnoreCase(r3)
            if (r3 != 0) goto L_0x0187
            if (r8 != 0) goto L_0x0186
            goto L_0x0187
        L_0x0186:
            r0 = 0
        L_0x0187:
            r10.f19663ah = r0
            boolean r0 = r10.f19663ah
            if (r0 == 0) goto L_0x01b1
            android.content.SharedPreferences$Editor r11 = r11.edit()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r10.f19677e
            r0.append(r3)
            java.lang.String r3 = "canBeScanAgain"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            boolean r3 = r10.f19663ah
            r11.putBoolean(r0, r3)
            r11.apply()
            goto L_0x01b1
        L_0x01ad:
            int r3 = r3 + 1
            goto L_0x0064
        L_0x01b1:
            java.lang.String r11 = r10.f19678f
            java.io.InputStream r11 = com.seattleclouds.App.m25649e(r11)
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeStream(r11, r1, r1)
            android.view.View r0 = r10.f19672aq
            int r3 = com.seattleclouds.C5451m.C5458g.coupon_result_img
            android.view.View r0 = r0.findViewById(r3)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageBitmap(r11)
            java.lang.String r11 = r10.f19659a
            java.io.InputStream r11 = com.seattleclouds.App.m25649e(r11)
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeStream(r11, r1, r1)
            android.view.View r0 = r10.f19672aq
            int r1 = com.seattleclouds.C5451m.C5458g.coupon_redeem_img
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageBitmap(r11)
            java.lang.Integer r11 = r10.f19681i
            int r11 = r11.intValue()
            if (r11 >= 0) goto L_0x01ee
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
        L_0x01eb:
            r10.f19681i = r11
            goto L_0x01ff
        L_0x01ee:
            java.lang.Integer r11 = r10.f19681i
            int r11 = r11.intValue()
            java.lang.Integer r0 = r10.f19680h
            int r0 = r0.intValue()
            if (r11 < r0) goto L_0x01ff
            java.lang.Integer r11 = r10.f19680h
            goto L_0x01eb
        L_0x01ff:
            android.support.v4.app.h r11 = r10.mo1318s()
            if (r11 != 0) goto L_0x0206
            return
        L_0x0206:
            android.support.v4.app.h r11 = r10.mo1318s()
            com.seattleclouds.modules.d.a$3 r0 = new com.seattleclouds.modules.d.a$3
            r0.<init>()
            r11.runOnUiThread(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.p165d.C5525a.mo17910c(java.lang.String):void");
    }

    /* renamed from: c */
    public void mo1274c(boolean z) {
        super.mo1274c(z);
        if (this.f19669an != null) {
            if (z) {
                this.f19669an.mo17731b();
            } else {
                this.f19669an.mo17730a();
            }
        }
    }
}
