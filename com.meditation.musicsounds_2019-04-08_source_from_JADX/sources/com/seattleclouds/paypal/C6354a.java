package com.seattleclouds.paypal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.AsyncTask;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.util.C6618l;
import com.seattleclouds.util.C6620n;
import com.seattleclouds.util.HTTPUtil;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Hashtable;
import org.slf4j.Marker;

/* renamed from: com.seattleclouds.paypal.a */
public class C6354a {

    /* renamed from: a */
    private boolean f22561a = false;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Activity f22562b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public URL f22563c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Hashtable<String, String> f22564d;

    public C6354a(boolean z, Activity activity) {
        this.f22561a = z;
        this.f22562b = activity;
    }

    /* renamed from: a */
    private void m30864a() {
        boolean z;
        Hashtable<String, String> hashtable = this.f22564d;
        SharedPreferences sharedPreferences = this.f22562b.getSharedPreferences("PayPal", 0);
        int i = 0;
        while (true) {
            StringBuilder sb = new StringBuilder();
            sb.append("paypalitems");
            sb.append(i);
            z = true;
            if (!sharedPreferences.contains(sb.toString())) {
                z = false;
                break;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("paypalitems");
            sb2.append(i);
            String[] split = sharedPreferences.getString(sb2.toString(), "").split("\\|\\|");
            if (split.length >= 6) {
                Hashtable hashtable2 = new Hashtable();
                hashtable2.put(split[0], split[1]);
                hashtable2.put(split[2], split[3]);
                hashtable2.put(split[4], split[5]);
                if (((String) hashtable2.get("productid")).equalsIgnoreCase((String) hashtable.get("itemid")) && ((String) hashtable2.get("deviceid")).equalsIgnoreCase(m30867b())) {
                    String str = (String) hashtable2.get("appid");
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(App.f18523y);
                    sb3.append(".");
                    sb3.append(App.f18524z);
                    if (str.equalsIgnoreCase(sb3.toString())) {
                        m30873c((String) hashtable.get("itemid"));
                        break;
                    }
                }
            }
            i++;
        }
        if (!z) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("http://");
            sb4.append(App.f18516r);
            sb4.append("/paypalcheckproduct.ashx?");
            final String sb5 = sb4.toString();
            final HashMap hashMap = new HashMap(3);
            hashMap.put("productid", hashtable.get("itemid"));
            hashMap.put("deviceid", m30867b());
            StringBuilder sb6 = new StringBuilder();
            sb6.append(App.f18523y);
            sb6.append(".");
            sb6.append(App.f18524z);
            hashMap.put("appid", sb6.toString());
            new AsyncTask<Void, Void, Boolean>() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public Boolean doInBackground(Void... voidArr) {
                    try {
                        String b = HTTPUtil.m31768b(sb5, hashMap);
                        if (b == null || !b.equalsIgnoreCase("ok")) {
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setFlags(268435456);
                            intent.setData(Uri.parse(C6354a.this.f22563c.toString()));
                            C6354a.this.f22562b.startActivity(intent);
                        } else {
                            C6354a.this.m30873c((String) C6354a.this.f22564d.get("itemid"));
                        }
                        return Boolean.valueOf(true);
                    } catch (IOException unused) {
                        return Boolean.valueOf(false);
                    }
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void onPostExecute(Boolean bool) {
                    if (!bool.booleanValue()) {
                        C6620n.m32034a((Context) C6354a.this.f22562b, C6354a.this.f22562b.getString(C5462k.error), C6354a.this.f22562b.getString(C5462k.common_network_error));
                    }
                }
            }.execute(new Void[0]);
        }
    }

    /* renamed from: a */
    private void m30866a(Hashtable<String, String> hashtable, URL url) {
        if (hashtable.size() == 0) {
            C6620n.m32034a((Context) this.f22562b, "ERROR", "The URL scheme is not configured correctly.");
            return;
        }
        this.f22564d = hashtable;
        this.f22563c = url;
        m30864a();
    }

    /* renamed from: b */
    private static String m30867b() {
        return C6618l.m32012a();
    }

    /* renamed from: b */
    private String m30868b(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace(Marker.ANY_NON_NULL_MARKER, "%20");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* renamed from: b */
    private void m30870b(Hashtable<String, String> hashtable) {
        this.f22564d = hashtable;
        if (!this.f22561a) {
            m30872c();
        }
        String str = (String) hashtable.get("itemid");
        if (m30874d(str)) {
            App.f18489V.mo17514a();
        } else {
            m30873c(str);
        }
    }

    /* renamed from: c */
    private void m30872c() {
        Hashtable<String, String> hashtable = this.f22564d;
        int i = 0;
        SharedPreferences sharedPreferences = this.f22562b.getSharedPreferences("PayPal", 0);
        while (true) {
            StringBuilder sb = new StringBuilder();
            sb.append("paypalitems");
            sb.append(i);
            if (!sharedPreferences.contains(sb.toString())) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("productid||");
                sb2.append((String) hashtable.get("itemid"));
                sb2.append("||deviceid||");
                sb2.append(m30867b());
                sb2.append("||appid||");
                sb2.append(App.f18523y);
                sb2.append(".");
                sb2.append(App.f18524z);
                String sb3 = sb2.toString();
                Editor edit = sharedPreferences.edit();
                StringBuilder sb4 = new StringBuilder();
                sb4.append("paypalitems");
                sb4.append(i);
                edit.putString(sb4.toString(), sb3);
                edit.commit();
                return;
            }
            i++;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m30873c(String str) {
        App.m25621a(str, this.f22562b);
    }

    /* renamed from: d */
    private boolean m30874d(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public String mo19796a(Hashtable<String, String> hashtable) {
        if (!((String) hashtable.get("succ")).equalsIgnoreCase("YES")) {
            return "Failed pay.";
        }
        boolean z = false;
        if (hashtable.get("istest") != null) {
            z = ((String) hashtable.get("istest")).equalsIgnoreCase("YES");
        }
        if (App.f18488U == null) {
            App.f18488U = new C6354a(z, this.f22562b);
        }
        Hashtable hashtable2 = new Hashtable();
        hashtable2.put("itemid", hashtable.get("idtran"));
        App.f18488U.m30870b(hashtable2);
        return "Successful pay.";
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01d1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19797a(java.lang.String r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = 6
            java.lang.String[] r2 = new java.lang.String[r0]
            java.lang.String r0 = "recipient"
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "currency"
            r4 = 1
            r2[r4] = r0
            java.lang.String r0 = "description"
            r5 = 2
            r2[r5] = r0
            java.lang.String r0 = "merchant"
            r6 = 3
            r2[r6] = r0
            java.lang.String r0 = "totalship"
            r7 = 4
            r2[r7] = r0
            java.lang.String r0 = "totaltax"
            r8 = 5
            r2[r8] = r0
            java.lang.String[] r8 = new java.lang.String[r7]
            java.lang.String r0 = "itemid"
            r8[r3] = r0
            java.lang.String r0 = "itemname"
            r8[r4] = r0
            java.lang.String r0 = "itemprice"
            r8[r5] = r0
            java.lang.String r0 = "itemcount"
            r8[r6] = r0
            android.net.Uri r0 = android.net.Uri.parse(r17)
            java.lang.String r4 = r0.getHost()
            java.util.Hashtable r5 = new java.util.Hashtable
            r5.<init>()
            java.util.Hashtable r9 = new java.util.Hashtable
            r9.<init>()
            javax.xml.parsers.DocumentBuilderFactory r0 = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            r10 = 0
            javax.xml.parsers.DocumentBuilder r0 = r0.newDocumentBuilder()     // Catch:{ ParserConfigurationException -> 0x0051 }
            goto L_0x005d
        L_0x0051:
            r0 = move-exception
            r11 = r0
            java.lang.String r0 = "PayPalProcessing"
            java.lang.String r11 = r11.toString()
            android.util.Log.e(r0, r11)
            r0 = r10
        L_0x005d:
            java.lang.String r11 = "app.xml"
            java.io.InputStream r11 = com.seattleclouds.App.m25649e(r11)     // Catch:{ SAXException -> 0x0070, IOException -> 0x0068 }
            org.w3c.dom.Document r0 = r0.parse(r11)     // Catch:{ SAXException -> 0x0070, IOException -> 0x0068 }
            goto L_0x007b
        L_0x0068:
            r0 = move-exception
            java.lang.String r11 = "PayPalProcessing"
            java.lang.String r0 = r0.toString()
            goto L_0x0077
        L_0x0070:
            r0 = move-exception
            java.lang.String r11 = "PayPalProcessing"
            java.lang.String r0 = r0.toString()
        L_0x0077:
            android.util.Log.e(r11, r0)
            r0 = r10
        L_0x007b:
            org.w3c.dom.Element r0 = r0.getDocumentElement()
            java.lang.String r11 = "paypalbt"
            org.w3c.dom.NodeList r0 = r0.getElementsByTagName(r11)
            if (r0 == 0) goto L_0x0113
            int r11 = r0.getLength()
            if (r11 <= 0) goto L_0x0113
            r11 = 0
        L_0x008e:
            int r12 = r0.getLength()
            if (r11 >= r12) goto L_0x0113
            org.w3c.dom.Node r12 = r0.item(r11)
            org.w3c.dom.Node r13 = r12.getParentNode()
            org.w3c.dom.Element r13 = (org.w3c.dom.Element) r13
            java.lang.String r14 = "id"
            org.w3c.dom.Attr r13 = r13.getAttributeNode(r14)
            java.lang.String r13 = r13.getValue()
            if (r13 == 0) goto L_0x010e
            boolean r13 = r4.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x010e
            if (r12 == 0) goto L_0x010e
            int r13 = r8.length
            r14 = 0
        L_0x00b4:
            if (r14 >= r13) goto L_0x00cc
            r15 = r8[r14]
            r3 = r12
            org.w3c.dom.Element r3 = (org.w3c.dom.Element) r3
            org.w3c.dom.Attr r3 = r3.getAttributeNode(r15)
            if (r3 == 0) goto L_0x00c8
            java.lang.String r3 = r3.getValue()
            r5.put(r15, r3)
        L_0x00c8:
            int r14 = r14 + 1
            r3 = 0
            goto L_0x00b4
        L_0x00cc:
            int r3 = r2.length
            r13 = 0
        L_0x00ce:
            if (r13 >= r3) goto L_0x00e5
            r14 = r2[r13]
            r15 = r12
            org.w3c.dom.Element r15 = (org.w3c.dom.Element) r15
            org.w3c.dom.Attr r15 = r15.getAttributeNode(r14)
            if (r15 == 0) goto L_0x00e2
            java.lang.String r15 = r15.getValue()
            r9.put(r14, r15)
        L_0x00e2:
            int r13 = r13 + 1
            goto L_0x00ce
        L_0x00e5:
            java.lang.String r3 = "itemcount"
            java.lang.String r12 = "1"
            r5.put(r3, r12)
            r3 = 0
        L_0x00ed:
            int r12 = r2.length
            if (r3 >= r12) goto L_0x010e
            r12 = r2[r3]
            boolean r13 = r9.containsKey(r12)
            if (r13 != 0) goto L_0x0100
            if (r3 >= r7) goto L_0x0100
            java.lang.String r13 = ""
        L_0x00fc:
            r9.put(r12, r13)
            goto L_0x010b
        L_0x0100:
            boolean r13 = r9.containsKey(r12)
            if (r13 != 0) goto L_0x010b
            if (r3 <= r6) goto L_0x010b
            java.lang.String r13 = "0"
            goto L_0x00fc
        L_0x010b:
            int r3 = r3 + 1
            goto L_0x00ed
        L_0x010e:
            int r11 = r11 + 1
            r3 = 0
            goto L_0x008e
        L_0x0113:
            java.lang.String r0 = ""
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "http://"
            r2.append(r0)
            java.lang.String r0 = com.seattleclouds.App.f18517s
            r2.append(r0)
            java.lang.String r0 = "/PayPalShop.aspx?business="
            r2.append(r0)
            java.lang.String r0 = "recipient"
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "&currency="
            r2.append(r0)
            java.lang.String r0 = "currency"
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "itemprice"
            java.lang.Object r2 = r5.get(r2)
            if (r2 == 0) goto L_0x017c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "&amount="
            r2.append(r0)
            java.lang.String r0 = "itemprice"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0174:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x0187
        L_0x017c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "&amount=0"
            goto L_0x0174
        L_0x0187:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "&return="
            r2.append(r0)
            java.lang.String r0 = com.seattleclouds.App.f18483P
            java.lang.String r0 = r1.m30868b(r0)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "itemname"
            java.lang.Object r2 = r5.get(r2)
            if (r2 == 0) goto L_0x01c9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "&name="
            r2.append(r0)
            java.lang.String r0 = "itemname"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r1.m30868b(r0)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L_0x01c9:
            java.lang.String r2 = "itemid"
            java.lang.Object r2 = r5.get(r2)
            if (r2 == 0) goto L_0x01f1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "&number="
            r2.append(r0)
            java.lang.String r0 = "itemid"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r1.m30868b(r0)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L_0x01f1:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "&test=NO"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "&page="
            r2.append(r0)
            java.lang.String r0 = r1.m30868b(r4)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.net.URI r2 = new java.net.URI     // Catch:{ URISyntaxException -> 0x022c, MalformedURLException -> 0x0224 }
            r2.<init>(r0)     // Catch:{ URISyntaxException -> 0x022c, MalformedURLException -> 0x0224 }
            java.net.URL r0 = r2.toURL()     // Catch:{ URISyntaxException -> 0x022c, MalformedURLException -> 0x0224 }
            goto L_0x0237
        L_0x0224:
            r0 = move-exception
            java.lang.String r2 = "PayPalProcessing"
            java.lang.String r0 = r0.toString()
            goto L_0x0233
        L_0x022c:
            r0 = move-exception
            java.lang.String r2 = "PayPalProcessing"
            java.lang.String r0 = r0.toString()
        L_0x0233:
            android.util.Log.e(r2, r0)
            r0 = r10
        L_0x0237:
            r1.m30866a(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.paypal.C6354a.mo19797a(java.lang.String):void");
    }
}
