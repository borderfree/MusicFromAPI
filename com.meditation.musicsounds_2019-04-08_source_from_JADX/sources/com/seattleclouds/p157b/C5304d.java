package com.seattleclouds.p157b;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;
import com.google.android.bitmapfun.C2418b;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.util.C6608d;
import java.util.HashMap;
import java.util.Map.Entry;
import org.apache.commons.p198io.C6730b;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.seattleclouds.b.d */
public class C5304d extends AsyncTask<String, Integer, String> {

    /* renamed from: a */
    public static String f18991a = null;

    /* renamed from: b */
    private static final String f18992b = "d";
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Activity f18993c;

    /* renamed from: d */
    private ProgressDialog f18994d;

    /* renamed from: e */
    private C6608d f18995e = null;

    /* renamed from: f */
    private String f18996f = "";

    /* renamed from: g */
    private String f18997g = "";

    /* renamed from: h */
    private Integer f18998h = Integer.valueOf(0);

    /* renamed from: i */
    private String f18999i = "";

    /* renamed from: j */
    private Integer f19000j = Integer.valueOf(0);

    /* renamed from: k */
    private String f19001k = null;

    /* renamed from: l */
    private String f19002l = null;

    /* renamed from: m */
    private String f19003m = null;

    /* renamed from: n */
    private String f19004n = null;

    /* renamed from: o */
    private HashMap<String, String> f19005o = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f19006p = false;

    /* renamed from: q */
    private int f19007q = 0;

    /* renamed from: r */
    private boolean f19008r = false;

    /* renamed from: s */
    private boolean f19009s = true;

    /* renamed from: t */
    private String f19010t;

    public C5304d(Activity activity) {
        this.f18993c = activity;
    }

    /* renamed from: a */
    private void m26528a() {
        for (String a : new String[]{"magazineCovers"}) {
            C6730b.m32467d(C2418b.m11228a((Context) this.f18993c, a));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m26529a(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            java.lang.String r2 = r8.f18999i     // Catch:{ Exception -> 0x00a9 }
            boolean r2 = com.seattleclouds.util.C6592al.m31909b(r2)     // Catch:{ Exception -> 0x00a9 }
            r3 = 1
            if (r2 == 0) goto L_0x003d
            r2 = 47
            int r2 = r9.lastIndexOf(r2)     // Catch:{ Exception -> 0x00a9 }
            int r2 = r2 + r3
            java.net.URL r4 = new java.net.URL     // Catch:{ Exception -> 0x00a9 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a9 }
            r5.<init>()     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r6 = r9.substring(r0, r2)     // Catch:{ Exception -> 0x00a9 }
            r5.append(r6)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r2 = r9.substring(r2)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r6 = "UTF-8"
            java.lang.String r2 = java.net.URLEncoder.encode(r2, r6)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r6 = "+"
            java.lang.String r7 = "%20"
            java.lang.String r2 = r2.replace(r6, r7)     // Catch:{ Exception -> 0x00a9 }
            r5.append(r2)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x00a9 }
            r4.<init>(r2)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x0042
        L_0x003d:
            java.net.URL r4 = new java.net.URL     // Catch:{ Exception -> 0x00a9 }
            r4.<init>(r9)     // Catch:{ Exception -> 0x00a9 }
        L_0x0042:
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x00a9 }
            r2.<init>(r10)     // Catch:{ Exception -> 0x00a9 }
            java.net.URLConnection r4 = r4.openConnection()     // Catch:{ Exception -> 0x00a9 }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ Exception -> 0x00a9 }
            r1 = 30000(0x7530, float:4.2039E-41)
            r4.setReadTimeout(r1)     // Catch:{ Exception -> 0x00a4, all -> 0x00a1 }
            r4.setConnectTimeout(r1)     // Catch:{ Exception -> 0x00a4, all -> 0x00a1 }
            java.lang.String r1 = "Cookie"
            java.lang.String r5 = r8.f19010t     // Catch:{ Exception -> 0x00a4, all -> 0x00a1 }
            r4.setRequestProperty(r1, r5)     // Catch:{ Exception -> 0x00a4, all -> 0x00a1 }
            java.io.InputStream r1 = r4.getInputStream()     // Catch:{ Exception -> 0x00a4, all -> 0x00a1 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00a4, all -> 0x00a1 }
            r5.<init>(r2)     // Catch:{ Exception -> 0x00a4, all -> 0x00a1 }
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch:{ Exception -> 0x00a4, all -> 0x00a1 }
        L_0x0069:
            int r6 = r1.read(r2)     // Catch:{ Exception -> 0x00a4, all -> 0x00a1 }
            r7 = -1
            if (r6 == r7) goto L_0x0074
            r5.write(r2, r0, r6)     // Catch:{ Exception -> 0x00a4, all -> 0x00a1 }
            goto L_0x0069
        L_0x0074:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a4, all -> 0x00a1 }
            r2.<init>()     // Catch:{ Exception -> 0x00a4, all -> 0x00a1 }
            java.lang.String r6 = java.io.File.separator     // Catch:{ Exception -> 0x00a4, all -> 0x00a1 }
            r2.append(r6)     // Catch:{ Exception -> 0x00a4, all -> 0x00a1 }
            java.lang.String r6 = "app.xml"
            r2.append(r6)     // Catch:{ Exception -> 0x00a4, all -> 0x00a1 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00a4, all -> 0x00a1 }
            boolean r10 = r10.endsWith(r2)     // Catch:{ Exception -> 0x00a4, all -> 0x00a1 }
            if (r10 == 0) goto L_0x0090
            r8.f19008r = r3     // Catch:{ Exception -> 0x00a4, all -> 0x00a1 }
            goto L_0x0095
        L_0x0090:
            int r10 = r8.f19007q     // Catch:{ Exception -> 0x00a4, all -> 0x00a1 }
            int r10 = r10 + r3
            r8.f19007q = r10     // Catch:{ Exception -> 0x00a4, all -> 0x00a1 }
        L_0x0095:
            r1.close()     // Catch:{ Exception -> 0x00a4, all -> 0x00a1 }
            r5.close()     // Catch:{ Exception -> 0x00a4, all -> 0x00a1 }
            if (r4 == 0) goto L_0x00c7
            r4.disconnect()
            goto L_0x00c7
        L_0x00a1:
            r9 = move-exception
            r1 = r4
            goto L_0x00c8
        L_0x00a4:
            r10 = move-exception
            r1 = r4
            goto L_0x00aa
        L_0x00a7:
            r9 = move-exception
            goto L_0x00c8
        L_0x00a9:
            r10 = move-exception
        L_0x00aa:
            r8.f19009s = r0     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = f18992b     // Catch:{ all -> 0x00a7 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            r2.<init>()     // Catch:{ all -> 0x00a7 }
            java.lang.String r3 = "saveRemoteFileToLocalFolder failed on "
            r2.append(r3)     // Catch:{ all -> 0x00a7 }
            r2.append(r9)     // Catch:{ all -> 0x00a7 }
            java.lang.String r9 = r2.toString()     // Catch:{ all -> 0x00a7 }
            android.util.Log.e(r0, r9, r10)     // Catch:{ all -> 0x00a7 }
            if (r1 == 0) goto L_0x00c7
            r1.disconnect()
        L_0x00c7:
            return
        L_0x00c8:
            if (r1 == 0) goto L_0x00cd
            r1.disconnect()
        L_0x00cd:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.p157b.C5304d.m26529a(java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    private String m26531b() {
        HashMap hashMap = new HashMap();
        hashMap.put("scvun", App.f18523y);
        if (App.f18510l) {
            hashMap.put("sc_previewer", "android");
        }
        StringBuilder sb = new StringBuilder();
        for (Entry entry : hashMap.entrySet()) {
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append((String) entry.getValue());
            sb.append("; ");
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:12|13|14|15|16) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0079 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0081 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String doInBackground(java.lang.String... r13) {
        /*
            r12 = this;
            java.io.File r13 = new java.io.File
            java.lang.String r0 = com.seattleclouds.App.m25656i()
            r13.<init>(r0)
            org.apache.commons.p198io.C6730b.m32467d(r13)
            r13 = 0
            java.lang.String r0 = com.seattleclouds.App.m25654h()     // Catch:{ Exception -> 0x03ab }
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x03ab }
            r1.<init>(r0)     // Catch:{ Exception -> 0x03ab }
            boolean r2 = r1.exists()     // Catch:{ Exception -> 0x03ab }
            if (r2 != 0) goto L_0x001f
            r1.mkdirs()     // Catch:{ Exception -> 0x03ab }
        L_0x001f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03ab }
            r1.<init>()     // Catch:{ Exception -> 0x03ab }
            r1.append(r0)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r0 = java.io.File.separator     // Catch:{ Exception -> 0x03ab }
            r1.append(r0)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x03ab }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03ab }
            r1.<init>()     // Catch:{ Exception -> 0x03ab }
            java.lang.String r2 = "http://"
            r1.append(r2)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r2 = com.seattleclouds.App.f18516r     // Catch:{ Exception -> 0x03ab }
            r1.append(r2)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r2 = "/"
            r1.append(r2)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r2 = com.seattleclouds.App.m25673q()     // Catch:{ Exception -> 0x03ab }
            r1.append(r2)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r2 = "/"
            r1.append(r2)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x03ab }
            java.lang.String r2 = r12.m26531b()     // Catch:{ Exception -> 0x03ab }
            r12.f19010t = r2     // Catch:{ Exception -> 0x03ab }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x03ab }
            java.lang.String r3 = f18991a     // Catch:{ Exception -> 0x03ab }
            r2.<init>(r3)     // Catch:{ Exception -> 0x03ab }
            boolean r3 = r2.exists()     // Catch:{ Exception -> 0x03ab }
            if (r3 == 0) goto L_0x0082
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x03ab }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x03ab }
            r4.<init>(r2)     // Catch:{ Exception -> 0x03ab }
            r3.<init>(r4)     // Catch:{ Exception -> 0x03ab }
            java.lang.Object r4 = r3.readObject()     // Catch:{ Exception -> 0x0079, all -> 0x007d }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ Exception -> 0x0079, all -> 0x007d }
            r12.f19005o = r4     // Catch:{ Exception -> 0x0079, all -> 0x007d }
        L_0x0079:
            r3.close()     // Catch:{ Exception -> 0x0082 }
            goto L_0x0082
        L_0x007d:
            r0 = move-exception
            r3.close()     // Catch:{ Exception -> 0x0081 }
        L_0x0081:
            throw r0     // Catch:{ Exception -> 0x03ab }
        L_0x0082:
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r12.f19005o     // Catch:{ Exception -> 0x03ab }
            if (r3 != 0) goto L_0x008d
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ Exception -> 0x03ab }
            r3.<init>()     // Catch:{ Exception -> 0x03ab }
            r12.f19005o = r3     // Catch:{ Exception -> 0x03ab }
        L_0x008d:
            boolean r3 = com.seattleclouds.App.f18510l     // Catch:{ Exception -> 0x03ab }
            if (r3 == 0) goto L_0x0118
            java.net.URL r3 = new java.net.URL     // Catch:{ Exception -> 0x03ab }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03ab }
            r4.<init>()     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = "https://"
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = com.seattleclouds.App.f18516r     // Catch:{ Exception -> 0x03ab }
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = "/getfilelist.ashx?v=2&publisherid="
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = com.seattleclouds.App.f18522x     // Catch:{ Exception -> 0x03ab }
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = "&username="
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = com.seattleclouds.App.f18523y     // Catch:{ Exception -> 0x03ab }
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = "&appid="
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = com.seattleclouds.App.f18524z     // Catch:{ Exception -> 0x03ab }
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = "&uniqueAppId="
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            android.app.Activity r5 = r12.f18993c     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ Exception -> 0x03ab }
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = "&previewerAppPublisherId="
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = com.seattleclouds.App.f18470C     // Catch:{ Exception -> 0x03ab }
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = "&previewerAppUsername="
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = com.seattleclouds.App.f18471D     // Catch:{ Exception -> 0x03ab }
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = "&previewerAppId="
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = com.seattleclouds.App.f18472E     // Catch:{ Exception -> 0x03ab }
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = "&adsKeysType="
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            com.seattleclouds.ads.AdsManagerKeys r5 = com.seattleclouds.ads.AdsManagerKeys.m26119b()     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = r5.mo17220a()     // Catch:{ Exception -> 0x03ab }
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = "&lastUpdateKeys="
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            com.seattleclouds.ads.AdsManagerKeys r5 = com.seattleclouds.ads.AdsManagerKeys.m26119b()     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = r5.mo17223d()     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = android.net.Uri.encode(r5)     // Catch:{ Exception -> 0x03ab }
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x03ab }
            r3.<init>(r4)     // Catch:{ Exception -> 0x03ab }
            goto L_0x0180
        L_0x0118:
            java.net.URL r3 = new java.net.URL     // Catch:{ Exception -> 0x03ab }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03ab }
            r4.<init>()     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = "https://"
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = com.seattleclouds.App.f18516r     // Catch:{ Exception -> 0x03ab }
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = "/getnewsfilelist.ashx?v=2&publisherid="
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = com.seattleclouds.App.f18522x     // Catch:{ Exception -> 0x03ab }
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = "&username="
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = com.seattleclouds.App.f18523y     // Catch:{ Exception -> 0x03ab }
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = "&appid="
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = com.seattleclouds.App.f18524z     // Catch:{ Exception -> 0x03ab }
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = "&uniqueAppId="
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            android.app.Activity r5 = r12.f18993c     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ Exception -> 0x03ab }
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = "&adsKeysType="
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            com.seattleclouds.ads.AdsManagerKeys r5 = com.seattleclouds.ads.AdsManagerKeys.m26119b()     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = r5.mo17220a()     // Catch:{ Exception -> 0x03ab }
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = "&lastUpdateKeys="
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            com.seattleclouds.ads.AdsManagerKeys r5 = com.seattleclouds.ads.AdsManagerKeys.m26119b()     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = r5.mo17223d()     // Catch:{ Exception -> 0x03ab }
            java.lang.String r5 = android.net.Uri.encode(r5)     // Catch:{ Exception -> 0x03ab }
            r4.append(r5)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x03ab }
            r3.<init>(r4)     // Catch:{ Exception -> 0x03ab }
        L_0x0180:
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch:{ Exception -> 0x03ab }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ Exception -> 0x0391 }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ Exception -> 0x0391 }
            java.lang.String r5 = "Cookie"
            java.lang.String r6 = r12.f19010t     // Catch:{ Exception -> 0x0391 }
            r3.setRequestProperty(r5, r6)     // Catch:{ Exception -> 0x0391 }
            r5 = 30000(0x7530, float:4.2039E-41)
            r3.setConnectTimeout(r5)     // Catch:{ Exception -> 0x0391 }
            r3.setReadTimeout(r5)     // Catch:{ Exception -> 0x0391 }
            java.io.InputStream r3 = r3.getInputStream()     // Catch:{ Exception -> 0x0391 }
            r5 = 0
            r4.setInput(r3, r5)     // Catch:{ Exception -> 0x0391 }
            int r3 = r4.getEventType()     // Catch:{ Exception -> 0x0391 }
        L_0x01a5:
            r6 = 1
            if (r3 == r6) goto L_0x037f
            boolean r7 = r12.f19006p     // Catch:{ Exception -> 0x0391 }
            if (r7 != 0) goto L_0x037f
            if (r3 == 0) goto L_0x0379
            switch(r3) {
                case 2: goto L_0x02e4;
                case 3: goto L_0x01b3;
                default: goto L_0x01b1;
            }     // Catch:{ Exception -> 0x0391 }
        L_0x01b1:
            goto L_0x0379
        L_0x01b3:
            java.lang.String r3 = r4.getName()     // Catch:{ Exception -> 0x0391 }
            java.lang.String r7 = "file"
            boolean r3 = r3.equalsIgnoreCase(r7)     // Catch:{ Exception -> 0x0391 }
            if (r3 == 0) goto L_0x0379
            boolean r3 = com.seattleclouds.App.f18474G     // Catch:{ Exception -> 0x0391 }
            if (r3 != 0) goto L_0x01c7
            boolean r3 = com.seattleclouds.App.f18510l     // Catch:{ Exception -> 0x0391 }
            if (r3 == 0) goto L_0x0379
        L_0x01c7:
            java.lang.String r3 = ""
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0391 }
            java.lang.String r8 = "MM/dd/yyyy hh:mm:ss a"
            java.util.Locale r9 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x0391 }
            r7.<init>(r8, r9)     // Catch:{ Exception -> 0x0391 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f3 }
            r8.<init>()     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r9 = "?v="
            r8.append(r9)     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r9 = r12.f18997g     // Catch:{ Exception -> 0x01f3 }
            java.util.Date r9 = r7.parse(r9)     // Catch:{ Exception -> 0x01f3 }
            long r9 = r9.getTime()     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x01f3 }
            r8.append(r9)     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x01f3 }
            r3 = r8
            goto L_0x0224
        L_0x01f3:
            r8 = move-exception
            java.lang.String r9 = f18992b     // Catch:{ Exception -> 0x0391 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0391 }
            r10.<init>()     // Catch:{ Exception -> 0x0391 }
            java.lang.String r11 = "parsing currentDateTime:'"
            r10.append(r11)     // Catch:{ Exception -> 0x0391 }
            java.lang.String r11 = r12.f18997g     // Catch:{ Exception -> 0x0391 }
            r10.append(r11)     // Catch:{ Exception -> 0x0391 }
            java.lang.String r11 = "' with format '"
            r10.append(r11)     // Catch:{ Exception -> 0x0391 }
            java.lang.String r7 = r7.toLocalizedPattern()     // Catch:{ Exception -> 0x0391 }
            r10.append(r7)     // Catch:{ Exception -> 0x0391 }
            java.lang.String r7 = "' throw new exception:"
            r10.append(r7)     // Catch:{ Exception -> 0x0391 }
            java.lang.String r7 = r8.toString()     // Catch:{ Exception -> 0x0391 }
            r10.append(r7)     // Catch:{ Exception -> 0x0391 }
            java.lang.String r7 = r10.toString()     // Catch:{ Exception -> 0x0391 }
            android.util.Log.e(r9, r7)     // Catch:{ Exception -> 0x0391 }
        L_0x0224:
            java.lang.String r7 = r12.f18999i     // Catch:{ Exception -> 0x0391 }
            boolean r7 = com.seattleclouds.util.C6592al.m31909b(r7)     // Catch:{ Exception -> 0x0391 }
            if (r7 != 0) goto L_0x0254
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0391 }
            r7.<init>()     // Catch:{ Exception -> 0x0391 }
            java.lang.String r8 = r12.f18999i     // Catch:{ Exception -> 0x0391 }
            r7.append(r8)     // Catch:{ Exception -> 0x0391 }
            java.lang.String r8 = "/"
            r7.append(r8)     // Catch:{ Exception -> 0x0391 }
            java.lang.String r8 = com.seattleclouds.App.m25673q()     // Catch:{ Exception -> 0x0391 }
            r7.append(r8)     // Catch:{ Exception -> 0x0391 }
            java.lang.String r8 = "/"
            r7.append(r8)     // Catch:{ Exception -> 0x0391 }
            java.lang.String r8 = r12.f18996f     // Catch:{ Exception -> 0x0391 }
            r7.append(r8)     // Catch:{ Exception -> 0x0391 }
            r7.append(r3)     // Catch:{ Exception -> 0x0391 }
        L_0x024f:
            java.lang.String r3 = r7.toString()     // Catch:{ Exception -> 0x0391 }
            goto L_0x0265
        L_0x0254:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0391 }
            r7.<init>()     // Catch:{ Exception -> 0x0391 }
            r7.append(r1)     // Catch:{ Exception -> 0x0391 }
            java.lang.String r8 = r12.f18996f     // Catch:{ Exception -> 0x0391 }
            r7.append(r8)     // Catch:{ Exception -> 0x0391 }
            r7.append(r3)     // Catch:{ Exception -> 0x0391 }
            goto L_0x024f
        L_0x0265:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0391 }
            r7.<init>()     // Catch:{ Exception -> 0x0391 }
            r7.append(r0)     // Catch:{ Exception -> 0x0391 }
            java.lang.String r8 = r12.f18996f     // Catch:{ Exception -> 0x0391 }
            r7.append(r8)     // Catch:{ Exception -> 0x0391 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0391 }
            java.io.File r8 = new java.io.File     // Catch:{ Exception -> 0x0391 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0391 }
            r9.<init>()     // Catch:{ Exception -> 0x0391 }
            r9.append(r0)     // Catch:{ Exception -> 0x0391 }
            java.lang.String r10 = r12.f18996f     // Catch:{ Exception -> 0x0391 }
            r9.append(r10)     // Catch:{ Exception -> 0x0391 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0391 }
            r8.<init>(r9)     // Catch:{ Exception -> 0x0391 }
            boolean r9 = r8.exists()     // Catch:{ Exception -> 0x0391 }
            if (r9 == 0) goto L_0x02ab
            java.util.HashMap<java.lang.String, java.lang.String> r8 = r12.f19005o     // Catch:{ Exception -> 0x0391 }
            java.lang.String r9 = r12.f18996f     // Catch:{ Exception -> 0x0391 }
            java.lang.Object r8 = r8.get(r9)     // Catch:{ Exception -> 0x0391 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0391 }
            if (r8 != 0) goto L_0x02a2
        L_0x029e:
            r12.m26529a(r3, r7)     // Catch:{ Exception -> 0x0391 }
            goto L_0x02c5
        L_0x02a2:
            java.lang.String r9 = r12.f18997g     // Catch:{ Exception -> 0x0391 }
            boolean r8 = r8.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x0391 }
            if (r8 != 0) goto L_0x02c5
            goto L_0x029e
        L_0x02ab:
            java.lang.String r9 = r12.f18996f     // Catch:{ Exception -> 0x0391 }
            java.lang.String r10 = "/"
            boolean r9 = r9.contains(r10)     // Catch:{ Exception -> 0x0391 }
            if (r9 == 0) goto L_0x029e
            java.io.File r8 = r8.getParentFile()     // Catch:{ Exception -> 0x0391 }
            if (r8 == 0) goto L_0x029e
            boolean r9 = r8.exists()     // Catch:{ Exception -> 0x0391 }
            if (r9 != 0) goto L_0x029e
            r8.mkdirs()     // Catch:{ Exception -> 0x0391 }
            goto L_0x029e
        L_0x02c5:
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r12.f19005o     // Catch:{ Exception -> 0x0391 }
            java.lang.String r7 = r12.f18996f     // Catch:{ Exception -> 0x0391 }
            java.lang.String r8 = r12.f18997g     // Catch:{ Exception -> 0x0391 }
            r3.put(r7, r8)     // Catch:{ Exception -> 0x0391 }
            java.lang.Integer[] r3 = new java.lang.Integer[r6]     // Catch:{ Exception -> 0x0391 }
            java.lang.Integer r7 = r12.f19000j     // Catch:{ Exception -> 0x0391 }
            int r7 = r7.intValue()     // Catch:{ Exception -> 0x0391 }
            int r7 = r7 + r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0391 }
            r12.f19000j = r6     // Catch:{ Exception -> 0x0391 }
            r3[r13] = r6     // Catch:{ Exception -> 0x0391 }
            r12.publishProgress(r3)     // Catch:{ Exception -> 0x0391 }
            goto L_0x0379
        L_0x02e4:
            java.lang.String r3 = r4.getName()     // Catch:{ Exception -> 0x0391 }
            java.lang.String r6 = "file"
            boolean r6 = r3.equalsIgnoreCase(r6)     // Catch:{ Exception -> 0x0391 }
            if (r6 == 0) goto L_0x0302
            java.lang.String r3 = "id"
            java.lang.String r3 = r4.getAttributeValue(r5, r3)     // Catch:{ Exception -> 0x0391 }
            r12.f18996f = r3     // Catch:{ Exception -> 0x0391 }
            java.lang.String r3 = "datetime"
            java.lang.String r3 = r4.getAttributeValue(r5, r3)     // Catch:{ Exception -> 0x0391 }
            r12.f18997g = r3     // Catch:{ Exception -> 0x0391 }
            goto L_0x0379
        L_0x0302:
            java.lang.String r6 = "total"
            boolean r6 = r3.equalsIgnoreCase(r6)     // Catch:{ Exception -> 0x0391 }
            if (r6 == 0) goto L_0x032a
            java.lang.String r3 = "nr"
            java.lang.String r3 = r4.getAttributeValue(r5, r3)     // Catch:{ Exception -> 0x0379 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x0379 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0379 }
            r12.f18998h = r3     // Catch:{ Exception -> 0x0379 }
            android.app.ProgressDialog r3 = r12.f18994d     // Catch:{ Exception -> 0x0379 }
            if (r3 == 0) goto L_0x0379
            android.app.ProgressDialog r3 = r12.f18994d     // Catch:{ Exception -> 0x0379 }
            java.lang.Integer r6 = r12.f18998h     // Catch:{ Exception -> 0x0379 }
            int r6 = r6.intValue()     // Catch:{ Exception -> 0x0379 }
            r3.setMax(r6)     // Catch:{ Exception -> 0x0379 }
            goto L_0x0379
        L_0x032a:
            java.lang.String r6 = "cdn"
            boolean r6 = r3.equalsIgnoreCase(r6)     // Catch:{ Exception -> 0x0391 }
            if (r6 == 0) goto L_0x033b
            java.lang.String r3 = "url"
            java.lang.String r3 = r4.getAttributeValue(r5, r3)     // Catch:{ Exception -> 0x0379 }
            r12.f18999i = r3     // Catch:{ Exception -> 0x0379 }
            goto L_0x0379
        L_0x033b:
            java.lang.String r6 = "mustexit"
            boolean r6 = r3.equalsIgnoreCase(r6)     // Catch:{ Exception -> 0x0391 }
            if (r6 == 0) goto L_0x0364
            java.lang.String r3 = "reason"
            java.lang.String r3 = r4.getAttributeValue(r5, r3)     // Catch:{ Exception -> 0x0391 }
            r12.f19001k = r3     // Catch:{ Exception -> 0x0391 }
            java.lang.String r3 = "migrationPageUrl"
            java.lang.String r3 = r4.getAttributeValue(r5, r3)     // Catch:{ Exception -> 0x0391 }
            r12.f19002l = r3     // Catch:{ Exception -> 0x0391 }
            java.lang.String r3 = "migrationButtonText"
            java.lang.String r3 = r4.getAttributeValue(r5, r3)     // Catch:{ Exception -> 0x0391 }
            r12.f19003m = r3     // Catch:{ Exception -> 0x0391 }
            java.lang.String r3 = "cancelButtonText"
            java.lang.String r3 = r4.getAttributeValue(r5, r3)     // Catch:{ Exception -> 0x0391 }
            r12.f19004n = r3     // Catch:{ Exception -> 0x0391 }
            goto L_0x0379
        L_0x0364:
            java.lang.String r6 = "adsState"
            boolean r3 = r3.equalsIgnoreCase(r6)     // Catch:{ Exception -> 0x0391 }
            if (r3 == 0) goto L_0x0379
            com.seattleclouds.ads.AdsManagerKeys r3 = com.seattleclouds.ads.AdsManagerKeys.m26119b()     // Catch:{ Exception -> 0x0391 }
            java.lang.String r6 = "adsResult"
            java.lang.String r6 = r4.getAttributeValue(r5, r6)     // Catch:{ Exception -> 0x0391 }
            r3.mo17221a(r6)     // Catch:{ Exception -> 0x0391 }
        L_0x0379:
            int r3 = r4.next()     // Catch:{ Exception -> 0x0391 }
            goto L_0x01a5
        L_0x037f:
            java.io.ObjectOutputStream r0 = new java.io.ObjectOutputStream     // Catch:{ Exception -> 0x0391 }
            java.io.FileOutputStream r1 = org.apache.commons.p198io.C6730b.m32463b(r2)     // Catch:{ Exception -> 0x0391 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0391 }
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r12.f19005o     // Catch:{ Exception -> 0x0391 }
            r0.writeObject(r1)     // Catch:{ Exception -> 0x0391 }
            r0.close()     // Catch:{ Exception -> 0x0391 }
            goto L_0x03c8
        L_0x0391:
            r0 = move-exception
            r12.f19009s = r13     // Catch:{ Exception -> 0x03ab }
            java.lang.String r1 = f18992b     // Catch:{ Exception -> 0x03ab }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03ab }
            r2.<init>()     // Catch:{ Exception -> 0x03ab }
            java.lang.String r3 = "Resources sync error: "
            r2.append(r3)     // Catch:{ Exception -> 0x03ab }
            r2.append(r0)     // Catch:{ Exception -> 0x03ab }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x03ab }
            android.util.Log.e(r1, r0)     // Catch:{ Exception -> 0x03ab }
            goto L_0x03c8
        L_0x03ab:
            r0 = move-exception
            r12.f19009s = r13
            java.lang.String r13 = f18992b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "doInBackground "
            r1.append(r2)
            java.lang.String r2 = r0.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
        L_0x03c8:
            int r13 = r12.f19007q
            if (r13 <= 0) goto L_0x03cf
            r12.m26528a()
        L_0x03cf:
            boolean r13 = r12.f19009s
            if (r13 == 0) goto L_0x03e6
            android.app.Activity r13 = r12.f18993c
            com.seattleclouds.util.ac r13 = com.seattleclouds.util.C6574ac.m31815a(r13)
            java.lang.String r0 = "lastSyncDate"
            long r1 = java.lang.System.currentTimeMillis()
            com.seattleclouds.util.ac r13 = r13.mo20547b(r0, r1)
            r13.mo20548b()
        L_0x03e6:
            java.lang.String r13 = "ok"
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.p157b.C5304d.doInBackground(java.lang.String[]):java.lang.String");
    }

    /* renamed from: a */
    public void mo17418a(C6608d dVar) {
        this.f18995e = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        super.onPostExecute(str);
        try {
            if (this.f18994d != null && this.f18994d.isShowing()) {
                this.f18994d.dismiss();
            }
        } catch (IllegalArgumentException e) {
            Log.e(f18992b, "Exception while dismissing dialog", e);
        }
        if (this.f18995e == null) {
            return;
        }
        if (this.f19002l == null) {
            this.f18995e.mo16855a(this.f19001k);
            return;
        }
        HashMap hashMap = new HashMap(4);
        hashMap.put("mustExitReason", this.f19001k);
        hashMap.put("migrationPageUrl", this.f19002l);
        hashMap.put("migrationButtonText", this.f19003m);
        hashMap.put("cancelButtonText", this.f19004n);
        this.f18995e.mo16855a(hashMap);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onProgressUpdate(Integer... numArr) {
        super.onProgressUpdate(numArr);
        if (this.f18994d != null) {
            this.f18994d.setProgress(numArr[0].intValue());
        }
    }

    /* access modifiers changed from: protected */
    public void onCancelled() {
        super.onCancelled();
        if (this.f18994d != null) {
            this.f18994d.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        StringBuilder sb = new StringBuilder();
        sb.append(App.m25665m());
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append("sync");
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append("filelist.obj");
        f18991a = sb.toString();
        if (!this.f18993c.isFinishing() && (App.f18474G || App.f18510l)) {
            this.f18994d = new ProgressDialog(this.f18993c);
            this.f18994d.setProgressStyle(1);
            this.f18994d.setMessage(this.f18993c.getString(C5462k.app_state_syncing));
            this.f18994d.setCancelable(true);
            this.f18994d.getWindow().clearFlags(2);
            this.f18994d.show();
            this.f18994d.setOnCancelListener(new OnCancelListener() {
                public void onCancel(DialogInterface dialogInterface) {
                    C5304d.this.f19006p = true;
                    Toast.makeText(C5304d.this.f18993c, C5462k.common_sync_cancelled, 1).show();
                }
            });
        }
        super.onPreExecute();
    }
}
