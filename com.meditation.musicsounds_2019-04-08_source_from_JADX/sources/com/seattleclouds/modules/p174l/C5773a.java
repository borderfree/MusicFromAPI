package com.seattleclouds.modules.p174l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.Fragment;
import android.support.p023v7.app.C0765d.C0766a;
import android.util.Log;
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
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5452a;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.api.C5268b;
import com.seattleclouds.api.C5270d;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6602at;
import com.seattleclouds.util.C6620n;
import com.seattleclouds.util.C6620n.C6629b;
import com.seattleclouds.util.p192a.C6567c;
import com.seattleclouds.util.p192a.C6568d;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.l.a */
public class C5773a extends C6557s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f20449a = "";
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public boolean f20450ae = true;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public View f20451af = null;

    /* renamed from: ag */
    private String f20452ag;
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public boolean f20453ah;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public WebView f20454b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f20455c;

    /* renamed from: d */
    private String f20456d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f20457e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f20458f;

    /* renamed from: g */
    private String f20459g;

    /* renamed from: h */
    private String f20460h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f20461i;

    /* renamed from: com.seattleclouds.modules.l.a$a */
    private class C5779a extends C5270d<Void, String, String> {
        public C5779a(Fragment fragment) {
            super(fragment);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo17335a(Void... voidArr) {
            if (C5268b.m26272a().mo17309b((Context) C5773a.this.mo1318s(), C5773a.this.f20449a).getBoolean("couponWasUsed")) {
                return "couponWasUsed";
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(String str) {
            boolean z = !C6592al.m31909b(str) && str.equals("couponWasUsed");
            Editor edit = C5773a.this.mo1318s().getSharedPreferences("Loyalty", 0).edit();
            StringBuilder sb = new StringBuilder();
            sb.append(C5773a.this.f20455c);
            sb.append("couponWasUsed");
            edit.putBoolean(sb.toString(), z);
            edit.commit();
            if (z) {
                Toast.makeText(C5773a.this.mo1318s(), C5462k.loyalty_offer_already_used, 1).show();
                C5773a.this.f20450ae = false;
            } else {
                C5773a.this.f20450ae = true;
            }
            C5773a.this.mo20292ay();
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* renamed from: com.seattleclouds.modules.l.a$b */
    private class C5780b extends C5270d<Void, String, String> {
        public C5780b(Fragment fragment) {
            super(fragment);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo17335a(Void... voidArr) {
            JSONObject a = C5268b.m26272a().mo17297a((Context) C5773a.this.mo1318s(), C5773a.this.f20449a);
            boolean z = a.getBoolean("created");
            boolean z2 = a.getBoolean("alreadyExists");
            if (z) {
                return "created";
            }
            if (z2) {
                return "alreadyExists";
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(String str) {
            if (C6592al.m31909b(str) || str.equals("created") || str.equals("alreadyExists")) {
                C5773a.this.f20450ae = false;
            }
            Editor edit = C5773a.this.mo1318s().getSharedPreferences("Loyalty", 0).edit();
            StringBuilder sb = new StringBuilder();
            sb.append(C5773a.this.f20455c);
            sb.append("couponWasUsed");
            edit.putBoolean(sb.toString(), true);
            edit.commit();
            C5773a.this.mo20292ay();
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: as */
    public void m28418as() {
        ImageView imageView = (ImageView) this.f20451af.findViewById(C5458g.loyalty_redeem_img);
        imageView.setVisibility(0);
        imageView.bringToFront();
        Animation loadAnimation = AnimationUtils.loadAnimation(mo1318s(), C5452a.coupon_redeem_scale);
        imageView.setAnimation(loadAnimation);
        loadAnimation.start();
    }

    /* renamed from: at */
    private void m28419at() {
        C6620n.m32030a((Context) mo1318s(), C5462k.loyalty_secretcode, C5462k.loyalty_entercode, true, C5462k.loyalty_stamp, (C6629b) new C6629b() {
            /* renamed from: a */
            public void mo18346a() {
            }

            /* renamed from: a */
            public void mo18347a(String str) {
                C0367h hVar;
                int i;
                int i2;
                if (str.equalsIgnoreCase(C5773a.this.f20457e)) {
                    C5773a.this.f20461i = C5773a.this.f20461i + 1;
                    Editor edit = C5773a.this.mo1318s().getSharedPreferences("Loyalty", 0).edit();
                    edit.putInt(C5773a.this.f20455c, C5773a.this.f20461i);
                    edit.commit();
                    C5773a.this.mo1453c();
                    if (C5773a.this.f20461i >= C5773a.this.f20458f) {
                        hVar = C5773a.this.mo1318s();
                        i2 = C5462k.info;
                        i = C5462k.coupone_show_to_vendor;
                    } else {
                        hVar = C5773a.this.mo1318s();
                        i2 = C5462k.info;
                        i = C5462k.loyalty_stamp_succ;
                    }
                } else {
                    hVar = C5773a.this.mo1318s();
                    i2 = C5462k.info;
                    i = C5462k.loyalty_secretcode_wrong;
                }
                C6620n.m32028a((Context) hVar, i2, i);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m28423d() {
        StringBuilder sb = new StringBuilder();
        sb.append("http://");
        sb.append(App.f18516r);
        sb.append("/loyaltypagesendfeedback.ashx");
        String sb2 = sb.toString();
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new BasicNameValuePair("publisherid", App.f18522x));
        arrayList.add(new BasicNameValuePair("username", App.f18523y));
        arrayList.add(new BasicNameValuePair("appid", App.f18524z));
        arrayList.add(new BasicNameValuePair("pageid", this.f20449a));
        HttpPost httpPost = new HttpPost(sb2);
        try {
            httpPost.setEntity(new UrlEncodedFormEntity(arrayList, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            Log.e("LoyaltyFragment", e.getMessage());
        }
        C6567c.m31787a(httpPost, new C6568d() {
            /* renamed from: a */
            public void mo18224a(HttpResponse httpResponse) {
            }

            /* renamed from: b */
            public void mo1450b() {
            }
        });
    }

    /* renamed from: e */
    private void m28425e() {
        this.f20454b = (WebView) this.f20451af.findViewById(C5458g.loyalty_web_view);
        C6602at.m31950a(this.f20454b);
        this.f20454b.setWebViewClient(new WebViewClient() {
            public void onPageFinished(WebView webView, String str) {
                C5773a.this.mo1453c();
            }
        });
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f20451af = layoutInflater.inflate(C5460i.loyalty_activity, viewGroup, false);
        mo1450b();
        return this.f20451af;
    }

    /* renamed from: a */
    public void mo1239a(Menu menu) {
        MenuItem findItem = menu.findItem(C5458g.loyalty_menu_getstamp);
        findItem.setVisible(this.f20450ae);
        findItem.setEnabled(this.f20450ae);
        super.mo1239a(menu);
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        menuInflater.inflate(C5461j.loyalty_menu_getstamp, menu);
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        if (menuItem.getItemId() != C5458g.loyalty_menu_getstamp) {
            return super.mo1245a(menuItem);
        }
        m28419at();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1450b() {
        Bundle m = mo1307m();
        if (m != null) {
            this.f20449a = m.getString("pageid");
        }
        mo18455c(this.f20449a);
        m28425e();
        this.f20454b.loadUrl(App.m25655h(this.f20449a));
        ((Button) this.f20451af.findViewById(C5458g.loyalty_bt_use)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C0766a aVar = new C0766a(C5773a.this.mo1318s());
                aVar.mo3054a((CharSequence) C5773a.this.mo1320t().getString(C5462k.info));
                aVar.mo3063b((CharSequence) C5773a.this.mo1320t().getString(C5462k.coupone_doyouwantusecoupon));
                aVar.mo3048a(17039379, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        C5773a.this.f20461i = 0;
                        Editor edit = C5773a.this.mo1318s().getSharedPreferences("Loyalty", 0).edit();
                        edit.putInt(C5773a.this.f20455c, C5773a.this.f20461i);
                        StringBuilder sb = new StringBuilder();
                        sb.append(C5773a.this.f20455c);
                        sb.append("canBeScanAgain");
                        edit.putBoolean(sb.toString(), C5773a.this.f20453ah);
                        edit.commit();
                        C5773a.this.mo1453c();
                        C5773a.this.f20454b.setVisibility(0);
                        ((LinearLayout) C5773a.this.f20451af.findViewById(C5458g.loyalty_result_layout)).setVisibility(4);
                        if (C5773a.this.f20453ah) {
                            C5773a.this.f20450ae = true;
                        }
                        if (!C5773a.this.f20453ah) {
                            C5773a.this.m28418as();
                            new C5780b(C5773a.this).execute(new Void[0]);
                        }
                        C5773a.this.m28423d();
                        C5773a.this.mo20292ay();
                    }
                });
                aVar.mo3061b(17039369, (DialogInterface.OnClickListener) null);
                aVar.mo3068c();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo1453c() {
        StringBuilder sb;
        String sb2;
        Object[] objArr;
        String str = "";
        for (int i = 0; i < this.f20458f; i++) {
            if (i < this.f20461i) {
                sb = new StringBuilder();
                sb.append(str);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("var x%d=document.getElementById('loyaltystamp%d'); if(x%d) x%d.src=\"");
                sb3.append(this.f20459g);
                sb3.append("\"; ");
                sb2 = sb3.toString();
                objArr = new Object[]{Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i)};
            } else {
                sb = new StringBuilder();
                sb.append(str);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("var x%d=document.getElementById('loyaltystamp%d'); if(x%d) x%d.src=\"");
                sb4.append(this.f20460h);
                sb4.append("\"; ");
                sb2 = sb4.toString();
                objArr = new Object[]{Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i)};
            }
            sb.append(String.format(sb2, objArr));
            str = sb.toString();
        }
        C6602at.m31951a(this.f20454b, str);
        if (this.f20461i >= this.f20458f) {
            this.f20454b.setVisibility(4);
            ((LinearLayout) this.f20451af.findViewById(C5458g.loyalty_result_layout)).setVisibility(0);
            this.f20450ae = false;
        } else {
            this.f20450ae = true;
        }
        SharedPreferences sharedPreferences = mo1318s().getSharedPreferences("Loyalty", 0);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f20455c);
        sb5.append("couponWasUsed");
        if (sharedPreferences.getBoolean(sb5.toString(), false)) {
            this.f20450ae = false;
            m28418as();
        }
        mo20292ay();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x012d A[EDGE_INSN: B:83:0x012d->B:65:0x012d ?: BREAK  
    EDGE_INSN: B:83:0x012d->B:65:0x012d ?: BREAK  
    EDGE_INSN: B:83:0x012d->B:65:0x012d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x012d A[EDGE_INSN: B:83:0x012d->B:65:0x012d ?: BREAK  
    EDGE_INSN: B:83:0x012d->B:65:0x012d ?: BREAK  , SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18455c(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "loyaltycount"
            r0.append(r1)
            java.lang.String r1 = com.seattleclouds.App.f18523y
            r0.append(r1)
            java.lang.String r1 = com.seattleclouds.App.f18524z
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r7.f20455c = r0
            javax.xml.parsers.DocumentBuilderFactory r0 = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            r1 = 0
            javax.xml.parsers.DocumentBuilder r0 = r0.newDocumentBuilder()     // Catch:{ ParserConfigurationException -> 0x0027 }
            goto L_0x0032
        L_0x0027:
            r0 = move-exception
            java.lang.String r2 = "LoyaltyFragment"
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
            java.lang.String r2 = "LoyaltyFragment"
            java.lang.String r0 = r0.toString()
            goto L_0x004c
        L_0x0045:
            r0 = move-exception
            java.lang.String r2 = "LoyaltyFragment"
            java.lang.String r0 = r0.toString()
        L_0x004c:
            android.util.Log.e(r2, r0)
            r0 = r1
        L_0x0050:
            org.w3c.dom.Element r0 = r0.getDocumentElement()
            java.lang.String r2 = "page"
            org.w3c.dom.NodeList r0 = r0.getElementsByTagName(r2)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x012d
            int r4 = r0.getLength()
            if (r4 <= 0) goto L_0x012d
            r4 = 0
        L_0x0065:
            int r5 = r0.getLength()
            if (r4 >= r5) goto L_0x012d
            org.w3c.dom.Node r5 = r0.item(r4)
            org.w3c.dom.Element r5 = (org.w3c.dom.Element) r5
            java.lang.String r6 = "id"
            org.w3c.dom.Attr r6 = r5.getAttributeNode(r6)
            if (r6 != 0) goto L_0x007b
            goto L_0x0129
        L_0x007b:
            java.lang.String r6 = r6.getValue()
            if (r6 == 0) goto L_0x0129
            boolean r6 = r8.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x0129
            java.lang.String r8 = "countofstamp"
            org.w3c.dom.Attr r8 = r5.getAttributeNode(r8)
            if (r8 == 0) goto L_0x00a6
            java.lang.String r0 = r8.getValue()
            boolean r0 = com.seattleclouds.util.C6592al.m31909b(r0)
            if (r0 == 0) goto L_0x009c
            java.lang.String r8 = "0"
            goto L_0x00a0
        L_0x009c:
            java.lang.String r8 = r8.getValue()
        L_0x00a0:
            int r8 = java.lang.Integer.parseInt(r8)
            r7.f20458f = r8
        L_0x00a6:
            java.lang.String r8 = "secretcode"
            org.w3c.dom.Attr r8 = r5.getAttributeNode(r8)
            if (r8 == 0) goto L_0x00b4
            java.lang.String r8 = r8.getValue()
            r7.f20457e = r8
        L_0x00b4:
            java.lang.String r8 = "resultimage"
            org.w3c.dom.Attr r8 = r5.getAttributeNode(r8)
            if (r8 == 0) goto L_0x00c2
            java.lang.String r8 = r8.getValue()
            r7.f20456d = r8
        L_0x00c2:
            java.lang.String r8 = "stampnameimg"
            org.w3c.dom.Attr r8 = r5.getAttributeNode(r8)
            if (r8 == 0) goto L_0x00d0
            java.lang.String r8 = r8.getValue()
            r7.f20459g = r8
        L_0x00d0:
            java.lang.String r8 = "placestampnameimg"
            org.w3c.dom.Attr r8 = r5.getAttributeNode(r8)
            if (r8 == 0) goto L_0x00ea
            java.lang.String r0 = r8.getValue()
            java.lang.String r4 = ""
            boolean r0 = r0.equalsIgnoreCase(r4)
            if (r0 != 0) goto L_0x00ea
            java.lang.String r8 = r8.getValue()
            r7.f20460h = r8
        L_0x00ea:
            java.lang.String r8 = "allowreset"
            org.w3c.dom.Attr r8 = r5.getAttributeNode(r8)
            if (r8 == 0) goto L_0x00f7
            java.lang.String r8 = r8.getValue()
            goto L_0x00f8
        L_0x00f7:
            r8 = r1
        L_0x00f8:
            if (r8 == 0) goto L_0x0106
            java.lang.String r0 = "yes"
            boolean r8 = r8.equalsIgnoreCase(r0)
            if (r8 == 0) goto L_0x0103
            goto L_0x0106
        L_0x0103:
            r7.f20453ah = r3
            goto L_0x0108
        L_0x0106:
            r7.f20453ah = r2
        L_0x0108:
            java.lang.String r8 = "redeemimagename"
            org.w3c.dom.Attr r8 = r5.getAttributeNode(r8)
            if (r8 == 0) goto L_0x0116
            java.lang.String r8 = r8.getValue()
            r7.f20452ag = r8
        L_0x0116:
            java.lang.String r8 = r7.f20452ag
            if (r8 == 0) goto L_0x0124
            java.lang.String r8 = r7.f20452ag
            java.lang.String r0 = ""
            boolean r8 = r8.equalsIgnoreCase(r0)
            if (r8 == 0) goto L_0x012d
        L_0x0124:
            java.lang.String r8 = "redeemed.png"
            r7.f20452ag = r8
            goto L_0x012d
        L_0x0129:
            int r4 = r4 + 1
            goto L_0x0065
        L_0x012d:
            android.support.v4.app.h r8 = r7.mo1318s()
            java.lang.String r0 = "Loyalty"
            android.content.SharedPreferences r8 = r8.getSharedPreferences(r0, r3)
            java.lang.String r0 = r7.f20455c
            int r0 = r8.getInt(r0, r3)
            r7.f20461i = r0
            android.content.SharedPreferences$Editor r0 = r8.edit()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r7.f20455c
            r4.append(r5)
            java.lang.String r5 = "canBeScanAgain"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            boolean r5 = r7.f20453ah
            r0.putBoolean(r4, r5)
            r0.commit()
            boolean r0 = r7.f20453ah
            if (r0 != 0) goto L_0x01c6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = r7.f20455c
            r0.append(r4)
            java.lang.String r4 = "couponWasUsed"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L_0x0186
            com.seattleclouds.modules.l.a$a r0 = new com.seattleclouds.modules.l.a$a
            r0.<init>(r7)
            java.lang.Void[] r4 = new java.lang.Void[r3]
            r0.execute(r4)
            goto L_0x01ac
        L_0x0186:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = r7.f20455c
            r0.append(r4)
            java.lang.String r4 = "couponWasUsed"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            boolean r0 = r8.getBoolean(r0, r3)
            if (r0 == 0) goto L_0x01ac
            android.support.v4.app.h r0 = r7.mo1318s()
            int r4 = com.seattleclouds.C5451m.C5462k.loyalty_offer_already_used
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r4, r2)
            r0.show()
        L_0x01ac:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = r7.f20455c
            r0.append(r4)
            java.lang.String r4 = "couponWasUsed"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            boolean r8 = r8.getBoolean(r0, r2)
            r8 = r8 ^ r2
            r7.f20450ae = r8
        L_0x01c6:
            java.lang.String r8 = r7.f20456d
            java.io.InputStream r8 = com.seattleclouds.App.m25649e(r8)
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r8, r1, r1)
            android.view.View r0 = r7.f20451af
            int r2 = com.seattleclouds.C5451m.C5458g.loyalty_result_img
            android.view.View r0 = r0.findViewById(r2)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageBitmap(r8)
            java.lang.String r8 = r7.f20452ag
            java.io.InputStream r8 = com.seattleclouds.App.m25649e(r8)
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r8, r1, r1)
            android.view.View r0 = r7.f20451af
            int r1 = com.seattleclouds.C5451m.C5458g.loyalty_redeem_img
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageBitmap(r8)
            int r8 = r7.f20461i
            if (r8 >= 0) goto L_0x01fb
            r7.f20461i = r3
            goto L_0x0205
        L_0x01fb:
            int r8 = r7.f20461i
            int r0 = r7.f20458f
            if (r8 < r0) goto L_0x0205
            int r8 = r7.f20458f
            r7.f20461i = r8
        L_0x0205:
            r7.mo20292ay()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.p174l.C5773a.mo18455c(java.lang.String):void");
    }
}
