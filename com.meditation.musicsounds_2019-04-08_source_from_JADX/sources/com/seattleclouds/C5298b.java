package com.seattleclouds;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.ads.p155a.C5246b;
import com.seattleclouds.modules.feedback.Field;
import com.seattleclouds.modules.feedback.LocationModel;
import com.seattleclouds.modules.gcmtopics.GCMTopic;
import com.seattleclouds.modules.loginregister.C5798c;
import com.seattleclouds.modules.loginregister.C5799d;
import com.seattleclouds.modules.magazinestore.MagazineInfo;
import com.seattleclouds.modules.mosaic.ImgMetadata;
import com.seattleclouds.modules.order.OrderConfigInfo;
import com.seattleclouds.modules.videolist.OpenPdfOptions;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6609e;
import com.seattleclouds.util.C6610f;
import com.seattleclouds.util.C6613i;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/* renamed from: com.seattleclouds.b */
public class C5298b extends DefaultHandler {

    /* renamed from: a */
    private Context f18958a;

    /* renamed from: b */
    private C5227a f18959b;

    /* renamed from: c */
    private Map<String, C6650a> f18960c;

    /* renamed from: d */
    private C6650a f18961d;

    /* renamed from: e */
    private String f18962e;

    /* renamed from: f */
    private StringBuilder f18963f;

    /* renamed from: g */
    private String f18964g;

    /* renamed from: h */
    private ImgMetadata f18965h;

    /* renamed from: i */
    private String f18966i;

    /* renamed from: j */
    private LocationModel f18967j;

    /* renamed from: k */
    private List<String> f18968k;

    /* renamed from: l */
    private List<C6651b> f18969l;

    /* renamed from: m */
    private String f18970m;

    /* renamed from: n */
    private int f18971n = 4;

    /* renamed from: o */
    private String f18972o = "";

    /* renamed from: p */
    private Map<String, String> f18973p = new HashMap();

    public C5298b(Context context) {
        this.f18958a = context;
        this.f18959b = new C5227a();
        this.f18960c = new HashMap();
    }

    /* renamed from: a */
    public static int m26488a(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: a */
    public static int m26489a(Attributes attributes, String str, int i) {
        return m26488a(attributes.getValue(str), i);
    }

    /* renamed from: a */
    public static Integer m26490a(Attributes attributes, String str, Integer num) {
        return C6610f.m31971a(attributes.getValue(str), num);
    }

    /* renamed from: a */
    public static String m26491a(Attributes attributes, String str) {
        String value = attributes.getValue(str);
        return value != null ? value.trim() : value;
    }

    /* renamed from: a */
    public static String m26492a(Attributes attributes, String str, String str2) {
        String value = attributes.getValue(str);
        return value == null ? str2 : value.trim();
    }

    /* renamed from: a */
    public static HashMap<String, String> m26493a(Attributes attributes) {
        HashMap<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < attributes.getLength(); i++) {
            hashMap.put(attributes.getQName(i), attributes.getValue(i));
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
        r5.close();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m26494a(android.content.Context r5) {
        /*
            com.seattleclouds.b r0 = new com.seattleclouds.b
            r0.<init>(r5)
            java.lang.String r5 = "app.xml"
            java.io.InputStream r5 = com.seattleclouds.App.m25649e(r5)
            android.util.Xml$Encoding r1 = android.util.Xml.Encoding.UTF_8     // Catch:{ Exception -> 0x0018 }
            android.util.Xml.parse(r5, r1, r0)     // Catch:{ Exception -> 0x0018 }
            if (r5 == 0) goto L_0x0032
        L_0x0012:
            r5.close()     // Catch:{ IOException -> 0x0032 }
            goto L_0x0032
        L_0x0016:
            r0 = move-exception
            goto L_0x004c
        L_0x0018:
            r1 = move-exception
            java.lang.String r2 = "AppConfigHandler"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0016 }
            r3.<init>()     // Catch:{ all -> 0x0016 }
            java.lang.String r4 = "App config parsing error: "
            r3.append(r4)     // Catch:{ all -> 0x0016 }
            r3.append(r1)     // Catch:{ all -> 0x0016 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0016 }
            android.util.Log.w(r2, r3, r1)     // Catch:{ all -> 0x0016 }
            if (r5 == 0) goto L_0x0032
            goto L_0x0012
        L_0x0032:
            com.seattleclouds.a r5 = r0.mo17386a()
            com.seattleclouds.App.f18501c = r5
            com.seattleclouds.a r5 = com.seattleclouds.App.f18501c
            com.seattleclouds.e.c r1 = new com.seattleclouds.e.c
            r1.<init>()
            java.util.Map r1 = r1.mo17542a()
            r5.mo16927a(r1)
            java.util.Map<java.lang.String, com.seattleclouds.v$a> r5 = r0.f18960c
            com.seattleclouds.C6649v.m32116a(r5)
            return
        L_0x004c:
            if (r5 == 0) goto L_0x0051
            r5.close()     // Catch:{ IOException -> 0x0051 }
        L_0x0051:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.C5298b.m26494a(android.content.Context):void");
    }

    /* renamed from: a */
    private boolean m26495a(String str) {
        return this.f18968k.size() == 1 && str.equalsIgnoreCase(this.f18970m);
    }

    /* renamed from: a */
    private boolean m26496a(String str, String str2) {
        return this.f18968k.size() == 2 && str.equalsIgnoreCase((String) this.f18968k.get(1)) && str2.equalsIgnoreCase(this.f18970m);
    }

    /* renamed from: a */
    private boolean m26497a(String str, String str2, String str3) {
        return this.f18968k.size() == 3 && str.equalsIgnoreCase((String) this.f18968k.get(1)) && str2.equalsIgnoreCase((String) this.f18968k.get(2)) && str3.equalsIgnoreCase(this.f18970m);
    }

    /* renamed from: a */
    public static boolean m26498a(String str, boolean z) {
        if (str == null) {
            return z;
        }
        return str.equalsIgnoreCase("true") || str.equalsIgnoreCase("yes");
    }

    /* renamed from: a */
    public static boolean m26499a(Attributes attributes, String str, boolean z) {
        return m26498a(attributes.getValue(str), z);
    }

    /* renamed from: b */
    public static int m26500b() {
        try {
            return C6613i.m31991b(App.m25649e("template.qbiki")).contains("wheel") ? 3 : 2;
        } catch (IOException | IllegalArgumentException unused) {
            return 1;
        }
    }

    /* renamed from: b */
    public static int m26501b(Attributes attributes, String str, int i) {
        String value = attributes.getValue(str);
        if (value == null) {
            return i;
        }
        if (value.equalsIgnoreCase("admob")) {
            return 1;
        }
        if (value.equalsIgnoreCase("scad")) {
            return 2;
        }
        if (value.equalsIgnoreCase("dfp")) {
            return 4;
        }
        if (value.equalsIgnoreCase("airpush")) {
            return 5;
        }
        if (value.equalsIgnoreCase("skiad")) {
            return 6;
        }
        if (value.equalsIgnoreCase("facebookad")) {
            return 7;
        }
        if (value.equalsIgnoreCase("fbnb")) {
            return 8;
        }
        if (value.equalsIgnoreCase("inherited")) {
            return 100;
        }
        return i;
    }

    /* renamed from: b */
    private C5230aa m26502b(String str) {
        C5230aa aaVar = (C5230aa) this.f18959b.mo16902D().get(str);
        if (aaVar != null) {
            return aaVar;
        }
        C5230aa aaVar2 = new C5230aa(str);
        this.f18959b.mo16902D().put(aaVar2.mo17046a(), aaVar2);
        return aaVar2;
    }

    /* renamed from: b */
    public static String m26503b(Attributes attributes, String str, String str2) {
        String value = attributes.getValue(str);
        return value == null ? str2 : value;
    }

    /* renamed from: c */
    public static int m26504c(Attributes attributes, String str, int i) {
        String value = attributes.getValue(str);
        if (value == null) {
            return i;
        }
        if (value.equalsIgnoreCase("admob")) {
            return 1;
        }
        if (value.equalsIgnoreCase("dfp")) {
            return 2;
        }
        if (value.equalsIgnoreCase("revmob")) {
            return 4;
        }
        if (value.equalsIgnoreCase("airpush")) {
            return 5;
        }
        if (value.equalsIgnoreCase("skiad")) {
            return 6;
        }
        if (value.equalsIgnoreCase("facebookad")) {
            return 7;
        }
        if (value.equalsIgnoreCase("inherited")) {
            return 100;
        }
        return i;
    }

    /* renamed from: c */
    private void m26505c() {
        HashMap x;
        String str;
        Object obj;
        if (this.f18959b.mo16938c() == 0) {
            this.f18959b.mo16925a(m26500b());
        }
        if (this.f18959b.mo16938c() == 3) {
            this.f18959b.mo16925a(1);
        }
        if (this.f18959b.mo16942d().size() != 0) {
            this.f18971n = this.f18959b.mo16942d().size();
        }
        if (this.f18959b.mo16938c() == 5 && this.f18971n > 5) {
            this.f18971n = 5;
        }
        if (this.f18971n < 2) {
            this.f18971n = 2;
        }
        if (this.f18959b.mo16938c() == 1 || this.f18959b.mo16938c() == 4 || this.f18959b.mo16938c() == 5) {
            int size = this.f18959b.mo16942d().size() + 1;
            while (this.f18959b.mo16942d().size() < this.f18971n) {
                C5389j jVar = new C5389j();
                Map y = this.f18959b.mo16990y();
                StringBuilder sb = new StringBuilder();
                sb.append("tab");
                sb.append(size);
                sb.append("text");
                String str2 = (String) y.get(sb.toString());
                if (str2 == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f18958a.getString(C5462k.tab));
                    sb2.append(" ");
                    sb2.append(size);
                    str2 = sb2.toString();
                }
                jVar.mo17656a(str2);
                Map y2 = this.f18959b.mo16990y();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("tab");
                sb3.append(size);
                sb3.append("icon");
                String str3 = (String) y2.get(sb3.toString());
                if (str3 != null) {
                    jVar.mo17659b(str3);
                }
                this.f18959b.mo16942d().add(jVar);
                size++;
            }
            while (this.f18959b.mo16942d().size() > this.f18971n) {
                this.f18959b.mo16942d().remove(this.f18959b.mo16942d().size() - 1);
            }
        }
        if (!App.f18474G) {
            this.f18959b.mo16951f().put("forceSync", Boolean.valueOf(false));
            this.f18959b.mo16951f().put("clearResources", Boolean.valueOf(false));
        }
        for (C5230aa aaVar : this.f18959b.mo16902D().values()) {
            if (!"SCPDFViewer".equals(aaVar.mo17077aW()) || !"pdfviewer".equals(aaVar.mo17118b())) {
                if ("SCSharePoint".equals(aaVar.mo17077aW()) && "sharepointclient".equals(aaVar.mo17118b())) {
                    if (this.f18973p.get("url") != null && aaVar.mo17199x().get("global_url") == null) {
                        aaVar.mo17199x().put("global_url", this.f18973p.get("url"));
                    }
                    if (this.f18973p.get("username") != null && aaVar.mo17199x().get("global_username") == null) {
                        aaVar.mo17199x().put("global_username", this.f18973p.get("username"));
                    }
                    if (this.f18973p.get("password") != null && aaVar.mo17199x().get("global_password") == null) {
                        aaVar.mo17199x().put("global_password", this.f18973p.get("password"));
                    }
                    if (this.f18973p.get("uploadfolderurl") != null && aaVar.mo17199x().get("global_uploadfolderurl") == null) {
                        aaVar.mo17199x().put("global_uploadfolderurl", this.f18973p.get("uploadfolderurl"));
                    }
                    if (this.f18973p.get("lcid") != null && aaVar.mo17199x().get("global_lcid") == null) {
                        aaVar.mo17199x().put("global_lcid", this.f18973p.get("lcid"));
                    }
                    if (this.f18973p.get("detectPlatformLanguage") != null) {
                        if (aaVar.mo17199x().get("global_detectPlatformLanguage") != null) {
                        }
                    }
                } else if ("".equals(aaVar.mo17077aW()) && "dynamicList".equals(aaVar.mo17118b())) {
                    if (this.f18973p.get("lcid") != null && aaVar.mo17199x().get("global_lcid") == null) {
                        aaVar.mo17199x().put("global_lcid", this.f18973p.get("lcid"));
                    }
                    if (this.f18973p.get("detectPlatformLanguage") != null) {
                        if (aaVar.mo17199x().get("global_detectPlatformLanguage") != null) {
                        }
                    }
                }
                x = aaVar.mo17199x();
                str = "global_detectPlatformLanguage";
                obj = this.f18973p.get("detectPlatformLanguage");
            } else if (aaVar.mo17199x().get("pdftronLicenseKey") == null) {
                x = aaVar.mo17199x();
                str = "pdftronLicenseKey";
                obj = this.f18972o;
            }
            x.put(str, obj);
        }
    }

    /* renamed from: d */
    public static int m26506d(Attributes attributes, String str, int i) {
        String value = attributes.getValue(str);
        if (value != null && value.equalsIgnoreCase("fullscreen")) {
            return 202;
        }
        return i;
    }

    /* renamed from: a */
    public C5227a mo17386a() {
        return this.f18959b;
    }

    public void characters(char[] cArr, int i, int i2) {
        super.characters(cArr, i, i2);
        this.f18963f.append(cArr, i, i2);
    }

    public void endDocument() {
        super.endDocument();
        m26505c();
        this.f18959b.mo16936b(true);
        Log.v("AppConfigHandler", "Ended parsing app config file");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:175:0x032c, code lost:
        if (r8.mo17118b().equalsIgnoreCase("appshare") != false) goto L_0x0349;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0347, code lost:
        if (r8.mo17118b().equalsIgnoreCase("appshare") != false) goto L_0x0349;
     */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x016a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void endElement(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            super.endElement(r7, r8, r9)
            java.lang.StringBuilder r7 = r6.f18963f
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = r7.trim()
            java.lang.String r9 = "prop"
            boolean r9 = r8.equalsIgnoreCase(r9)
            r0 = 0
            if (r9 == 0) goto L_0x0023
            com.seattleclouds.a r9 = r6.f18959b
            java.util.Map r9 = r9.mo16990y()
            java.lang.String r1 = r6.f18962e
            r9.put(r1, r7)
            goto L_0x0135
        L_0x0023:
            com.seattleclouds.modules.mosaic.ImgMetadata r9 = r6.f18965h
            if (r9 == 0) goto L_0x0035
            java.lang.String r9 = "title"
            boolean r9 = r8.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x0035
            com.seattleclouds.modules.mosaic.ImgMetadata r9 = r6.f18965h
            r9.f20779a = r7
            goto L_0x0135
        L_0x0035:
            com.seattleclouds.modules.mosaic.ImgMetadata r9 = r6.f18965h
            if (r9 == 0) goto L_0x0047
            java.lang.String r9 = "file"
            boolean r9 = r8.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x0047
            com.seattleclouds.modules.mosaic.ImgMetadata r9 = r6.f18965h
            r9.f20780b = r7
            goto L_0x0135
        L_0x0047:
            com.seattleclouds.modules.mosaic.ImgMetadata r9 = r6.f18965h
            if (r9 == 0) goto L_0x0059
            java.lang.String r9 = "caption"
            boolean r9 = r8.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x0059
            com.seattleclouds.modules.mosaic.ImgMetadata r9 = r6.f18965h
            r9.f20781c = r7
            goto L_0x0135
        L_0x0059:
            java.lang.String r9 = "quizrandomize"
            boolean r9 = r8.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x006c
            com.seattleclouds.a r9 = r6.f18959b
            boolean r1 = m26498a(r7, r0)
            r9.mo16941c(r1)
            goto L_0x0135
        L_0x006c:
            com.seattleclouds.modules.feedback.LocationModel r9 = r6.f18967j
            if (r9 == 0) goto L_0x007e
            java.lang.String r9 = "name"
            boolean r9 = r8.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x007e
            com.seattleclouds.modules.feedback.LocationModel r9 = r6.f18967j
            r9.f19980a = r7
            goto L_0x0135
        L_0x007e:
            com.seattleclouds.modules.feedback.LocationModel r9 = r6.f18967j
            if (r9 == 0) goto L_0x00ad
            java.lang.String r9 = "latitude"
            boolean r9 = r8.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x00ad
            com.seattleclouds.modules.feedback.LocationModel r9 = r6.f18967j     // Catch:{ Exception -> 0x0094 }
            double r1 = java.lang.Double.parseDouble(r7)     // Catch:{ Exception -> 0x0094 }
            r9.f19981b = r1     // Catch:{ Exception -> 0x0094 }
            goto L_0x0135
        L_0x0094:
            r9 = move-exception
            java.lang.String r1 = "AppConfigHandler"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
        L_0x009c:
            java.lang.String r3 = "endElement: "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            android.util.Log.e(r1, r9)
            goto L_0x0135
        L_0x00ad:
            com.seattleclouds.modules.feedback.LocationModel r9 = r6.f18967j
            if (r9 == 0) goto L_0x00cc
            java.lang.String r9 = "longitude"
            boolean r9 = r8.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x00cc
            com.seattleclouds.modules.feedback.LocationModel r9 = r6.f18967j     // Catch:{ Exception -> 0x00c3 }
            double r1 = java.lang.Double.parseDouble(r7)     // Catch:{ Exception -> 0x00c3 }
            r9.f19982c = r1     // Catch:{ Exception -> 0x00c3 }
            goto L_0x0135
        L_0x00c3:
            r9 = move-exception
            java.lang.String r1 = "AppConfigHandler"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            goto L_0x009c
        L_0x00cc:
            com.seattleclouds.modules.feedback.LocationModel r9 = r6.f18967j
            if (r9 == 0) goto L_0x00dd
            java.lang.String r9 = "imageurl"
            boolean r9 = r8.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x00dd
            com.seattleclouds.modules.feedback.LocationModel r9 = r6.f18967j
            r9.f19990k = r7
            goto L_0x0135
        L_0x00dd:
            com.seattleclouds.modules.feedback.LocationModel r9 = r6.f18967j
            if (r9 == 0) goto L_0x00ee
            java.lang.String r9 = "ldescription"
            boolean r9 = r8.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x00ee
            com.seattleclouds.modules.feedback.LocationModel r9 = r6.f18967j
            r9.f19991l = r7
            goto L_0x0135
        L_0x00ee:
            com.seattleclouds.modules.feedback.LocationModel r9 = r6.f18967j
            if (r9 == 0) goto L_0x00ff
            java.lang.String r9 = "ltarget"
            boolean r9 = r8.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x00ff
            com.seattleclouds.modules.feedback.LocationModel r9 = r6.f18967j
            r9.f19988i = r7
            goto L_0x0135
        L_0x00ff:
            com.seattleclouds.modules.feedback.LocationModel r9 = r6.f18967j
            if (r9 == 0) goto L_0x0110
            java.lang.String r9 = "ldistanceMode"
            boolean r9 = r8.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x0110
            com.seattleclouds.modules.feedback.LocationModel r9 = r6.f18967j
            r9.f19992m = r7
            goto L_0x0135
        L_0x0110:
            com.seattleclouds.modules.feedback.LocationModel r9 = r6.f18967j
            if (r9 == 0) goto L_0x0121
            java.lang.String r9 = "markerImage"
            boolean r9 = r8.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x0121
            com.seattleclouds.modules.feedback.LocationModel r9 = r6.f18967j
            r9.f19993n = r7
            goto L_0x0135
        L_0x0121:
            java.lang.String r9 = "rotationapp"
            boolean r9 = r8.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x0135
            boolean r9 = com.seattleclouds.App.f18510l
            if (r9 == 0) goto L_0x0135
            java.lang.String r9 = "true"
            boolean r9 = r7.equalsIgnoreCase(r9)
            com.seattleclouds.App.f18480M = r9
        L_0x0135:
            java.util.List<java.lang.String> r9 = r6.f18968k
            int r9 = r9.size()
            r1 = 2
            r2 = 0
            r3 = 1
            if (r9 <= r1) goto L_0x015f
            java.util.List<java.lang.String> r9 = r6.f18968k
            java.lang.Object r9 = r9.get(r3)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r4 = "page"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x015f
            com.seattleclouds.a r9 = r6.f18959b
            java.util.Map r9 = r9.mo16902D()
            java.lang.String r4 = r6.f18964g
            java.lang.Object r9 = r9.get(r4)
            com.seattleclouds.aa r9 = (com.seattleclouds.C5230aa) r9
            goto L_0x0160
        L_0x015f:
            r9 = r2
        L_0x0160:
            if (r9 == 0) goto L_0x0167
            java.lang.String r4 = r9.mo17118b()
            goto L_0x0168
        L_0x0167:
            r4 = r2
        L_0x0168:
            if (r9 == 0) goto L_0x034c
            java.lang.String r5 = "webpicture"
            boolean r5 = r8.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0181
            com.seattleclouds.modules.mosaic.ImgMetadata r8 = r6.f18965h
            if (r8 == 0) goto L_0x034c
            java.util.ArrayList<com.seattleclouds.modules.mosaic.ImgMetadata> r8 = r9.f18742d
            com.seattleclouds.modules.mosaic.ImgMetadata r9 = r6.f18965h
            r8.add(r9)
            r6.f18965h = r2
            goto L_0x034c
        L_0x0181:
            com.seattleclouds.modules.feedback.LocationModel r5 = r6.f18967j
            if (r5 == 0) goto L_0x019a
            java.lang.String r5 = "location"
            boolean r5 = r8.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x019a
            java.util.ArrayList<com.seattleclouds.modules.feedback.LocationModel> r8 = r9.f18741c
            if (r8 == 0) goto L_0x034c
            java.util.ArrayList<com.seattleclouds.modules.feedback.LocationModel> r8 = r9.f18741c
            com.seattleclouds.modules.feedback.LocationModel r9 = r6.f18967j
            r8.add(r9)
            goto L_0x034c
        L_0x019a:
            java.lang.String r5 = "songfile"
            boolean r5 = r8.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x01a7
            r9.mo17035U(r7)
            goto L_0x034c
        L_0x01a7:
            java.lang.String r5 = "autostart"
            boolean r5 = r8.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x01b8
            boolean r8 = java.lang.Boolean.parseBoolean(r7)
            r9.mo17177p(r8)
            goto L_0x034c
        L_0x01b8:
            java.lang.String r5 = "email"
            boolean r5 = r8.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x01c5
            r9.mo16997B(r7)
            goto L_0x034c
        L_0x01c5:
            java.lang.String r5 = "image"
            boolean r5 = r8.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x01d2
            r9.mo16998C(r7)
            goto L_0x034c
        L_0x01d2:
            java.lang.String r5 = "res"
            boolean r5 = r8.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x01e7
            java.lang.String r5 = "memogame"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x01e7
            r9.mo17001D(r7)
            goto L_0x034c
        L_0x01e7:
            java.lang.String r5 = "appdescription"
            boolean r5 = r8.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x01fc
            java.lang.String r5 = "appshare"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x01fc
            r9.mo17009H(r7)
            goto L_0x034c
        L_0x01fc:
            java.lang.String r5 = "appshare"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x025f
            java.lang.String r4 = "share_link"
            boolean r4 = r8.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0211
            r9.mo17010I(r7)
            goto L_0x034c
        L_0x0211:
            java.lang.String r4 = "iphone"
            boolean r4 = r8.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x021e
            r9.mo17012J(r7)
            goto L_0x034c
        L_0x021e:
            java.lang.String r4 = "ipad"
            boolean r4 = r8.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x022b
            r9.mo17015K(r7)
            goto L_0x034c
        L_0x022b:
            java.lang.String r4 = "android"
            boolean r4 = r8.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0238
            r9.mo17016L(r7)
            goto L_0x034c
        L_0x0238:
            java.lang.String r4 = "kindle"
            boolean r4 = r8.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0245
            r9.mo17018M(r7)
            goto L_0x034c
        L_0x0245:
            java.lang.String r4 = "appmartstore"
            boolean r4 = r8.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0252
            r9.mo17021N(r7)
            goto L_0x034c
        L_0x0252:
            java.lang.String r4 = "primarystore"
            boolean r8 = r8.equalsIgnoreCase(r4)
            if (r8 == 0) goto L_0x034c
            r9.mo17023O(r7)
            goto L_0x034c
        L_0x025f:
            java.lang.String r5 = "epubfile"
            boolean r5 = r8.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0274
            java.lang.String r5 = "epubreader"
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 == 0) goto L_0x0274
            r9.mo17024P(r7)
            goto L_0x034c
        L_0x0274:
            java.lang.String r4 = "recordonopen"
            boolean r4 = r8.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0285
            boolean r8 = java.lang.Boolean.parseBoolean(r7)
            r9.mo17168m(r8)
            goto L_0x034c
        L_0x0285:
            java.lang.String r4 = "pictureonopen"
            boolean r4 = r8.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0296
            boolean r8 = java.lang.Boolean.parseBoolean(r7)
            r9.mo17171n(r8)
            goto L_0x034c
        L_0x0296:
            java.lang.String r4 = "pdffile"
            boolean r4 = r8.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x02b8
            r9.mo17029R(r7)
            java.util.HashMap r8 = r9.mo17199x()
            java.lang.String r4 = "pdffile"
            java.lang.Object r8 = r8.get(r4)
            if (r8 != 0) goto L_0x034c
            java.util.HashMap r8 = r9.mo17199x()
            java.lang.String r9 = "pdffile"
            r8.put(r9, r7)
            goto L_0x034c
        L_0x02b8:
            java.lang.String r4 = "headerImage"
            boolean r4 = r8.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x02c5
            r9.mo17155i(r7)
            goto L_0x034c
        L_0x02c5:
            java.lang.String r4 = "magazine"
            boolean r4 = r8.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x02e5
            java.util.ArrayList r8 = r9.mo17056aB()
            int r9 = r8.size()
            if (r9 <= 0) goto L_0x034c
            int r9 = r8.size()
            int r9 = r9 - r3
            java.lang.Object r8 = r8.get(r9)
            com.seattleclouds.modules.magazinestore.MagazineInfo r8 = (com.seattleclouds.modules.magazinestore.MagazineInfo) r8
            r8.f20645c = r7
            goto L_0x034c
        L_0x02e5:
            java.util.List<java.lang.String> r9 = r6.f18968k
            int r9 = r9.size()
            r4 = 4
            if (r9 != r4) goto L_0x034c
            java.util.List<java.lang.String> r9 = r6.f18968k
            java.lang.Object r9 = r9.get(r3)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r4 = "page"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x034c
            java.util.List<java.lang.String> r9 = r6.f18968k
            java.lang.Object r9 = r9.get(r1)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r4 = "links"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x034c
            boolean r9 = com.seattleclouds.util.C6619m.m32016a()
            if (r9 == 0) goto L_0x032f
            java.lang.String r9 = "kindle"
            boolean r9 = r8.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x032f
            java.lang.String r8 = r6.f18964g
            com.seattleclouds.aa r8 = r6.m26502b(r8)
            java.lang.String r9 = r8.mo17118b()
            java.lang.String r4 = "appshare"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x034c
            goto L_0x0349
        L_0x032f:
            java.lang.String r9 = "android"
            boolean r8 = r8.equalsIgnoreCase(r9)
            if (r8 == 0) goto L_0x034c
            java.lang.String r8 = r6.f18964g
            com.seattleclouds.aa r8 = r6.m26502b(r8)
            java.lang.String r9 = r8.mo17118b()
            java.lang.String r4 = "appshare"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x034c
        L_0x0349:
            r8.mo17093ah(r7)
        L_0x034c:
            com.seattleclouds.v$a r8 = r6.f18961d
            if (r8 == 0) goto L_0x0393
            java.util.List<com.seattleclouds.v$b> r8 = r6.f18969l
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x036a
            java.util.List<com.seattleclouds.v$b> r8 = r6.f18969l
            java.util.List<com.seattleclouds.v$b> r9 = r6.f18969l
            int r9 = r9.size()
            int r9 = r9 - r3
            java.lang.Object r8 = r8.remove(r9)
            com.seattleclouds.v$b r8 = (com.seattleclouds.C6649v.C6651b) r8
            r8.mo20643b(r7)
        L_0x036a:
            java.util.List<java.lang.String> r7 = r6.f18968k
            int r7 = r7.size()
            if (r7 != r1) goto L_0x0393
            java.util.List<java.lang.String> r7 = r6.f18968k
            java.lang.Object r7 = r7.get(r3)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "page"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0393
            java.util.Map<java.lang.String, com.seattleclouds.v$a> r7 = r6.f18960c
            com.seattleclouds.v$a r8 = r6.f18961d
            java.lang.String r9 = "id"
            java.lang.String r8 = r8.mo20641a(r9)
            com.seattleclouds.v$a r9 = r6.f18961d
            r7.put(r8, r9)
            r6.f18961d = r2
        L_0x0393:
            java.lang.StringBuilder r7 = r6.f18963f
            r7.setLength(r0)
            java.util.List<java.lang.String> r7 = r6.f18968k
            int r7 = r7.size()
            if (r7 <= 0) goto L_0x03ac
            java.util.List<java.lang.String> r7 = r6.f18968k
            java.util.List<java.lang.String> r8 = r6.f18968k
            int r8 = r8.size()
            int r8 = r8 - r3
            r7.remove(r8)
        L_0x03ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.C5298b.endElement(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public void startDocument() {
        Log.v("AppConfigHandler", "Started parsing app config file");
        super.startDocument();
        this.f18963f = new StringBuilder();
        this.f18968k = new ArrayList();
        this.f18969l = new ArrayList();
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) {
        Object obj;
        ArrayList<Map<String, String>> arrayList;
        Map<String, String> f;
        String b;
        Object valueOf;
        Bundle aM;
        String str4;
        String str5;
        Bundle bundle;
        String str6;
        Object obj2;
        List<C6651b> e;
        Object value;
        C5227a aVar;
        super.startElement(str, str2, str3, attributes);
        this.f18970m = str2;
        int i = 4;
        int i2 = 0;
        if (m26495a("navigation")) {
            C5390k e2 = this.f18959b.mo16946e();
            e2.mo17673a(m26490a(attributes, "backgroundColor", Integer.valueOf(0)).intValue());
            e2.mo17674a(attributes.getValue("backgroundImage"));
            e2.mo17682c(attributes.getValue("enableHeader"));
            e2.mo17677b(m26489a(attributes, "contentOverlap", 0));
            e2.mo17675a(m26503b(attributes, "itemsPosition", "top").equals("bottom"));
            e2.mo17679b(m26499a(attributes, "iosStyleNavigation", false));
            e2.mo17678b(m26503b(attributes, "textFont", "normal"));
            e2.mo17681c(m26489a(attributes, "textStyle", 0));
            e2.mo17672a((float) m26489a(attributes, "textSize", 10));
            e2.mo17684d(m26489a(attributes, "tabsPerPagePhone", 0));
            if (e2.mo17692k() <= 0) {
                e2.mo17684d(5);
            }
            e2.mo17685e(m26489a(attributes, "tabsPerPageTablet", 0));
            if (e2.mo17693l() <= 0) {
                e2.mo17685e(7);
            }
            if (!e2.mo17686e()) {
                e2.mo17677b(0);
            }
            String value2 = attributes.getValue("type");
            if (value2.equals("tabs")) {
                this.f18959b.mo16925a(1);
            } else if (value2.equals("simple")) {
                this.f18959b.mo16925a(2);
            } else if (value2.equals("wheel")) {
                this.f18959b.mo16925a(3);
            } else {
                if (value2.equals("customtabs")) {
                    aVar = this.f18959b;
                } else if (value2.equals("legacyTabs")) {
                    this.f18959b.mo16925a(5);
                } else if (value2.equals("sidemenu")) {
                    aVar = this.f18959b;
                    i = 6;
                }
                aVar.mo16925a(i);
            }
        } else {
            Field field = null;
            if (m26497a("navigation", "items", "item")) {
                C5389j jVar = new C5389j();
                jVar.mo17656a(attributes.getValue("text"));
                jVar.mo17659b(attributes.getValue("icon"));
                jVar.mo17662c(attributes.getValue("selectedIcon"));
                jVar.mo17654a(m26490a(attributes, "textColor", Integer.valueOf(-3355444)).intValue());
                jVar.mo17658b(m26490a(attributes, "selectedTextColor", Integer.valueOf(-1)).intValue());
                jVar.mo17661c(m26490a(attributes, "backgroundColor", Integer.valueOf(0)).intValue());
                jVar.mo17655a(m26490a(attributes, "selectedBackgroundColor", (Integer) null));
                jVar.mo17664d(attributes.getValue("backgroundImage"));
                jVar.mo17666e(attributes.getValue("selectedBackgroundImage"));
                this.f18959b.mo16942d().add(jVar);
            } else if (str2.equalsIgnoreCase("prop")) {
                this.f18962e = attributes.getValue("id");
            } else if (m26495a("template")) {
                this.f18971n = m26489a(attributes, "tabsnumber", 4);
                this.f18959b.mo16944d(m26501b(attributes, "topadtype", 0));
                this.f18959b.mo16947e(m26501b(attributes, "bottomadtype", 0));
                this.f18959b.mo16972l(m26503b(attributes, "fbnadsheight", "300"));
                this.f18959b.mo16975m(m26503b(attributes, "fbnabannerheight", "100"));
                this.f18959b.mo16952f(m26501b(attributes, "interstitialadtype", 0));
                this.f18959b.mo16945d(m26499a(attributes, "scaleWebPagesToBaseResolution", true));
                this.f18959b.mo16978n(attributes.getValue("globalLogo"));
            } else if (m26495a("ads")) {
                String value3 = attributes.getValue("isAppUsedAsBillboard");
                if (value3 != null && !value3.trim().equals("")) {
                    this.f18959b.mo16956g(value3.equals("yes"));
                }
            } else if (m26495a("pollfish")) {
                this.f18959b.mo16935b(m26491a(attributes, "position"));
                this.f18959b.mo16934b(m26489a(attributes, "padding", 0));
            } else if (m26495a("googleanalyticsid")) {
                String value4 = attributes.getValue("id");
                if (!(value4 == null || value4.trim().length() == 0)) {
                    this.f18959b.mo16948e(value4.trim());
                }
            } else if (m26495a("sentpageid")) {
                String trim = m26503b(attributes, "id", "").trim();
                if (!trim.isEmpty()) {
                    this.f18959b.mo16940c(trim);
                }
            } else {
                if (m26495a("quizrandomize")) {
                    this.f18959b.mo16954g(m26489a(attributes, "nquestions", 20));
                } else if (m26495a("geofencing")) {
                    if (App.f18511m || App.f18512n) {
                        if (App.f18511m || App.f18512n) {
                            String b2 = m26503b(attributes, "source", "");
                            if (!TextUtils.isEmpty(b2)) {
                                if (!TextUtils.isEmpty(b2)) {
                                    if (!b2.equals("google")) {
                                        if (b2.equals("baidu")) {
                                            this.f18959b.mo16953f(m26499a(attributes, "enabled", false));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    this.f18959b.mo16949e(m26499a(attributes, "enabled", false));
                } else {
                    if (str2.equalsIgnoreCase("page")) {
                        this.f18964g = attributes.getValue("id");
                        if (m26495a("page")) {
                            C5230aa b3 = m26502b(this.f18964g);
                            String value5 = attributes.getValue("module");
                            if (C6592al.m31910c(value5)) {
                                value5 = null;
                            }
                            b3.mo17101al(value5);
                            b3.mo17050a(m26503b(attributes, "type", "html"));
                            String value6 = attributes.getValue("kind");
                            if (C6592al.m31910c(value6)) {
                                value6 = "native";
                            }
                            b3.mo17126c(value6);
                            b3.mo17132d(attributes.getValue("title"));
                            b3.mo17138e(attributes.getValue("logo"));
                            b3.mo17053a(m26499a(attributes, "shownavbar", true));
                            b3.mo17142f(attributes.getValue("slidepageid"));
                            b3.mo17147g(attributes.getValue("slidetransition"));
                            b3.mo17151h(attributes.getValue("transition"));
                            b3.mo17155i(attributes.getValue("headerimage"));
                            b3.mo17158j(attributes.getValue("submitbutton"));
                            b3.mo17164l(attributes.getValue("confirmmessage"));
                            b3.mo17161k(attributes.getValue("nextpage"));
                            if (m26499a(attributes, "rightToLeft", false)) {
                                b3.mo17065aK();
                            }
                            b3.mo17167m(attributes.getValue("sendtoaddress"));
                            ArrayList arrayList2 = new ArrayList();
                            int i3 = 0;
                            while (true) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("sendtoaddress");
                                sb.append(i3 == 0 ? "" : Integer.valueOf(i3));
                                String value7 = attributes.getValue(sb.toString());
                                if (value7 == null) {
                                    value7 = "";
                                }
                                if (value7.length() <= 0) {
                                    break;
                                }
                                arrayList2.add(value7);
                                i3++;
                            }
                            b3.mo17051a(arrayList2);
                            b3.mo17159j("yes".equals(attributes.getValue("login")));
                            b3.mo17170n(attributes.getValue("hasreviews"));
                            b3.mo17165l(m26499a(attributes, "hasreviewhtmlkey", false));
                            b3.mo17122b(m26499a(attributes, "hassend", false));
                            b3.mo17129c(m26499a(attributes, "hasfields", false));
                            b3.mo17140e(m26499a(attributes, "dynamicdata", false));
                            if (b3.mo16999C()) {
                                b3.mo17129c(false);
                            }
                            b3.mo17156i(m26499a(attributes, "hashome", b3.mo17017L()));
                            b3.mo17047a(m26501b(attributes, "topadtype", 0));
                            b3.mo17119b(m26501b(attributes, "bottomadtype", 0));
                            b3.mo17135d(m26499a(attributes, "nativetabel", false));
                            b3.mo17137e(m26489a(attributes, "nativerownumber", 0));
                            b3.mo17125c(m26504c(attributes, "interstitialadtype", 0));
                            b3.mo17131d(m26506d(attributes, "interstitialadview", 202));
                            b3.mo17173o(m26491a(attributes, "pollfishPosition"));
                            b3.mo17141f(m26489a(attributes, "pollfishPadding", 0));
                            b3.mo17176p(attributes.getValue("fbpageid"));
                            b3.mo17202y(attributes.getValue("rssSourceURL"));
                            b3.mo17027Q(attributes.getValue("allowbaseurl"));
                            b3.mo17204z(attributes.getValue("welcomeimg"));
                            b3.mo17031S(attributes.getValue("nextpage"));
                            b3.mo17033T(attributes.getValue("textDirection"));
                            b3.mo17186s(m26499a(attributes, "zoomEnabled", false));
                            b3.mo17189t(m26499a(attributes, "loadWebUrlsInSameWebView", false));
                            b3.mo17174o(m26499a(attributes, "autoCaptionsEnabled", false));
                            String value8 = attributes.getValue("quizcategory");
                            if (value8 == null) {
                                value8 = "";
                            }
                            b3.mo16995A(value8);
                            b3.mo17043Y(attributes.getValue("quiztitle"));
                            b3.mo17045Z(attributes.getValue("quizbgimage"));
                            b3.mo17080aa(attributes.getValue("quizbuttonsbgimage"));
                            String value9 = attributes.getValue("quizrandomize");
                            if (value9 != null) {
                                b3.mo17179q(value9.equalsIgnoreCase("1"));
                            }
                            if (b3.mo17118b().equalsIgnoreCase("map")) {
                                b3.f18741c = new ArrayList<>();
                            }
                            String value10 = attributes.getValue("resultType");
                            if (value10 == null || (!value10.equalsIgnoreCase("list") && !value10.equalsIgnoreCase("map"))) {
                                value10 = "list";
                            }
                            b3.mo17200x(value10);
                            b3.mo17143f(m26499a(attributes, "showLocationPicker", true));
                            b3.mo17146g(m26489a(attributes, "locationsLimit", 500));
                            b3.mo17162k(true);
                            if ("km".equalsIgnoreCase(attributes.getValue("resultUnits"))) {
                                b3.mo17162k(false);
                            }
                            b3.mo17148g(m26499a(attributes, "autoFillEnabled", false));
                            b3.mo17152h(m26499a(attributes, "autoFillSaveOnly", false));
                            if (b3.mo17118b().equalsIgnoreCase("quizquestion") && !this.f18959b.mo16903E().contains(b3.mo17046a())) {
                                this.f18959b.mo16903E().add(b3.mo17046a());
                            }
                            if (b3.mo17118b().equalsIgnoreCase("scoreboard")) {
                                String value11 = attributes.getValue("scbemail");
                                if (value11 == null) {
                                    value11 = "";
                                }
                                b3.mo17088ae(value11);
                            } else if (b3.mo17118b().equalsIgnoreCase("order")) {
                                OrderConfigInfo orderConfigInfo = new OrderConfigInfo();
                                orderConfigInfo.mo18805a(attributes);
                                b3.mo17048a(orderConfigInfo);
                            } else if (b3.mo17118b().equalsIgnoreCase("dropboxmedialist") || b3.mo17118b().equalsIgnoreCase("videolist")) {
                                b3.mo17049a(new OpenPdfOptions(attributes));
                            }
                            try {
                                if (attributes.getValue("sourcexml") != null) {
                                    b3.mo17198w(URLDecoder.decode(attributes.getValue("sourcexml"), "UTF-8"));
                                }
                                if (attributes.getValue("loginurl") != null) {
                                    b3.mo17178q(URLDecoder.decode(attributes.getValue("loginurl"), "UTF-8"));
                                }
                                if (attributes.getValue("facebookloginurl") != null) {
                                    b3.mo17181r(URLDecoder.decode(attributes.getValue("facebookloginurl"), "UTF-8"));
                                }
                                if (attributes.getValue("forgotpasswordurl") != null) {
                                    b3.mo17185s(URLDecoder.decode(attributes.getValue("forgotpasswordurl"), "UTF-8"));
                                }
                                if (attributes.getValue("registerurl") != null) {
                                    b3.mo17188t(URLDecoder.decode(attributes.getValue("registerurl"), "UTF-8"));
                                }
                                if (attributes.getValue("targeturl") != null) {
                                    b3.mo17192u(URLDecoder.decode(attributes.getValue("targeturl"), "UTF-8"));
                                }
                                b3.mo17194v(attributes.getValue("jsonurl"));
                                if (b3.mo17160k() != null) {
                                    b3.mo17161k(URLDecoder.decode(b3.mo17160k(), "UTF-8"));
                                }
                                if (b3.mo17157j() != null) {
                                    b3.mo17158j(URLDecoder.decode(b3.mo17157j(), "UTF-8"));
                                }
                                if (b3.mo17118b().equalsIgnoreCase("edituserprofile") && b3.mo17163l() != null) {
                                    b3.mo17164l(URLDecoder.decode(b3.mo17163l(), "UTF-8"));
                                }
                            } catch (UnsupportedEncodingException unused) {
                                Log.e("AppConfigHandler", "UTF-8 is not a valid encoding string");
                            }
                            String value12 = attributes.getValue("categories");
                            if (value12 != null && !value12.trim().equals("")) {
                                ArrayList a = C6609e.m31965a((T[]) value12.trim().split(","));
                                if (a.size() != 0) {
                                    b3.mo17127c(a);
                                }
                            }
                            String value13 = attributes.getValue("categorycolors");
                            if (value13 != null && !value13.trim().equals("")) {
                                ArrayList a2 = C6609e.m31965a((T[]) value13.trim().split(","));
                                if (a2.size() != 0) {
                                    ArrayList arrayList3 = new ArrayList(a2.size());
                                    Iterator it = a2.iterator();
                                    while (it.hasNext()) {
                                        arrayList3.add(C6610f.m31971a((String) it.next(), Integer.valueOf(-1)));
                                    }
                                    b3.mo17133d(arrayList3);
                                }
                            }
                            b3.mo17150h(m26489a(attributes, "coordinateFormatType", b3.mo17020N()));
                            int intValue = m26490a(attributes, "backgroundColor", Integer.valueOf(Integer.MAX_VALUE)).intValue();
                            if (intValue != Integer.MAX_VALUE) {
                                b3.mo17110as().putInt("backgroundColor", intValue);
                            }
                            int intValue2 = m26490a(attributes, "textColor", Integer.valueOf(Integer.MAX_VALUE)).intValue();
                            if (intValue2 != Integer.MAX_VALUE) {
                                b3.mo17110as().putInt("textColor", intValue2);
                            }
                            String value14 = attributes.getValue("backgroundImage");
                            if (value14 != null) {
                                b3.mo17110as().putString("backgroundImage", value14);
                            }
                            String value15 = attributes.getValue("configFile");
                            if (!(value15 == null || value15.trim().length() == 0)) {
                                b3.mo17006G(value15);
                            }
                            b3.mo17037V(m26503b(attributes, "photoBottomText", ""));
                            b3.mo17054a(m26503b(attributes, "leftTextPrefixes", "").split(","));
                            b3.mo17039W(m26503b(attributes, "smsnumber", ""));
                            b3.mo17040X(m26503b(attributes, "smsbody", ""));
                            if (b3.mo17118b().equalsIgnoreCase("purchase")) {
                                b3.mo17082ab(m26491a(attributes, "productID"));
                                b3.mo17084ac(m26503b(attributes, "productType", "nonconsumable"));
                                b3.mo17086ad(m26491a(attributes, "redirectUrl"));
                            } else if (b3.mo17118b().equalsIgnoreCase("magazinestore")) {
                                b3.mo17155i(attributes.getValue("headerImageName"));
                            } else if (b3.mo17118b().equalsIgnoreCase("nearbylocations")) {
                                String a3 = m26491a(attributes, "googleplaceapikey");
                                if (C6592al.m31909b(a3)) {
                                    a3 = m26491a(attributes, "placesApiKey");
                                    if (C6592al.m31909b(a3)) {
                                        a3 = "AIzaSyDcbnDqRozxjllddKHhKwfQEflvej1qd8A";
                                    }
                                }
                                b3.mo17092ag(a3);
                            } else if (b3.mo17118b().equalsIgnoreCase("messenger")) {
                                b3.mo17154i(m26489a(attributes, "maxMessageLength", 0));
                                if (this.f18959b.mo16910L() == null) {
                                    this.f18959b.mo16955g(b3.mo17046a());
                                }
                            } else if (b3.mo17118b().equalsIgnoreCase("slotmachine")) {
                                Bundle aM2 = b3.mo17067aM();
                                aM2.putInt("spinLimit", m26489a(attributes, "spinLimit", 0));
                                aM2.putString("spinLimitExpiration", m26492a(attributes, "spinLimitExpiration", "0:0:0:0:0"));
                            } else if (b3.mo17118b().equalsIgnoreCase("loginregister")) {
                                C5798c Q = this.f18959b.mo16915Q();
                                String value16 = attributes.getValue("fingerPrintEnabled");
                                if (!TextUtils.isEmpty(value16)) {
                                    Q.mo18495a(Boolean.valueOf(Boolean.parseBoolean(value16)));
                                    if (Q.mo18494a().booleanValue()) {
                                        Log.d("AppConfigHandler", "fingerPrintIsEnabled");
                                    }
                                }
                                if (Q.mo18507g() == null) {
                                    Q.mo18506f(this.f18964g);
                                }
                                String value17 = attributes.getValue("resulturl");
                                C5799d.f20549c.add(value17);
                                b3.mo17104am(value17);
                            }
                            b3.mo17090af(attributes.getValue("note"));
                            b3.mo17182r(m26499a(attributes, "searchEnabled", false));
                            b3.mo17052a(m26493a(attributes));
                            HashMap hashMap = new HashMap();
                            for (String str7 : b3.mo17199x().keySet()) {
                                if (str7.startsWith("sc_") && str7.length() > 3) {
                                    hashMap.put(str7.substring(3), b3.mo17199x().get(str7));
                                }
                            }
                            b3.mo17121b(hashMap);
                            b3.mo17193u(m26499a(attributes, "clearFormData", false));
                            if (b3.mo17118b().equalsIgnoreCase("podcast")) {
                                b3.mo17095ai(m26491a(attributes, "feedUrl"));
                                b3.mo17097aj(m26491a(attributes, "headerImageInput"));
                                b3.mo17195v(m26499a(attributes, "autoRefresh", true));
                            }
                            if (b3.mo17118b().equalsIgnoreCase("multipodcast")) {
                                b3.mo17097aj(m26491a(attributes, "headerImageInput"));
                            }
                            this.f18961d = new C6650a(str2, attributes);
                            e = this.f18969l;
                            value = this.f18961d;
                        }
                    } else if (str2.equalsIgnoreCase("location")) {
                        this.f18967j = new LocationModel();
                    } else if (!str2.equalsIgnoreCase("name") && !str2.equalsIgnoreCase("latitude") && !str2.equalsIgnoreCase("longitude") && !str2.equalsIgnoreCase("imageurl") && !str2.equalsIgnoreCase("ldescription") && !str2.equalsIgnoreCase("ltarget")) {
                        if (str2.equalsIgnoreCase("field")) {
                            C5230aa aaVar = (C5230aa) this.f18959b.mo16902D().get(this.f18964g);
                            if (aaVar != null) {
                                if (aaVar.mo17118b().equalsIgnoreCase("loginregister")) {
                                    String value18 = attributes.getValue("name");
                                    String value19 = attributes.getValue("status");
                                    if (!(value18 == null || value19 == null)) {
                                        C5798c Q2 = this.f18959b.mo16915Q();
                                        if (value18.equalsIgnoreCase("name")) {
                                            Q2.mo18496a(value19);
                                        } else if (value18.equalsIgnoreCase("surname")) {
                                            Q2.mo18498b(value19);
                                        } else if (value18.equalsIgnoreCase("dob")) {
                                            Q2.mo18500c(value19);
                                        } else if (value18.equalsIgnoreCase("phone")) {
                                            Q2.mo18502d(value19);
                                        } else if (value18.equalsIgnoreCase("loyaltyid")) {
                                            Q2.mo18504e(value19);
                                        }
                                    }
                                } else {
                                    this.f18966i = attributes.getValue("id");
                                    Field field2 = new Field(this.f18966i);
                                    field2.mo18162a(attributes.getValue("type"));
                                    field2.mo18164b(attributes.getValue("label"));
                                    field2.mo18168d(attributes.getValue("name"));
                                    field2.mo18166c(attributes.getValue("required"));
                                    field2.mo18171e(attributes.getValue("targeturl"));
                                    field2.mo18173f(attributes.getValue("jsonsourcepath"));
                                    field2.mo18175g(attributes.getValue("targetparam"));
                                    if (attributes.getValue("fieldlinescount") != null) {
                                        field2.mo18161a((int) Float.parseFloat(attributes.getValue("fieldlinescount")));
                                    }
                                    if (attributes.getValue("referencefieldid") != null) {
                                        field2.mo18177h(attributes.getValue("referencefieldid"));
                                    }
                                    arrayList = aaVar.mo17172o();
                                    obj = field2;
                                }
                            }
                        } else if (str2.equalsIgnoreCase("listitem")) {
                            C5230aa aaVar2 = (C5230aa) this.f18959b.mo16902D().get(this.f18964g);
                            if (aaVar2 != null) {
                                Iterator it2 = aaVar2.f18675a.iterator();
                                while (it2.hasNext()) {
                                    Field field3 = (Field) it2.next();
                                    if (field3.mo18160a().equalsIgnoreCase(this.f18966i)) {
                                        field = field3;
                                    }
                                }
                                if (field != null) {
                                    e = field.mo18170e();
                                    value = attributes.getValue("value");
                                }
                            }
                        } else if (str2.equalsIgnoreCase("multilist")) {
                            C5230aa aaVar3 = (C5230aa) this.f18959b.mo16902D().get(this.f18964g);
                            if (aaVar3 != null) {
                                Iterator it3 = aaVar3.f18675a.iterator();
                                while (it3.hasNext()) {
                                    Field field4 = (Field) it3.next();
                                    if (field4.mo18160a().equalsIgnoreCase(this.f18966i)) {
                                        field = field4;
                                    }
                                }
                                if (field != null) {
                                    String value20 = attributes.getValue("idlistitem");
                                    ArrayList arrayList4 = new ArrayList();
                                    while (true) {
                                        i2++;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("value");
                                        sb2.append(i2);
                                        String value21 = attributes.getValue(sb2.toString());
                                        if (value21 == null) {
                                            break;
                                        }
                                        arrayList4.add(value21);
                                    }
                                    if (value20 != null) {
                                        field.mo18176h().put(value20, arrayList4);
                                    } else {
                                        field.mo18176h().put("list", arrayList4);
                                    }
                                }
                            }
                        } else if (str2.equalsIgnoreCase("webalbum")) {
                            C5230aa aaVar4 = (C5230aa) this.f18959b.mo16902D().get(this.f18964g);
                            if (aaVar4 != null) {
                                String value22 = attributes.getValue("title");
                                if (value22 != null) {
                                    aaVar4.mo17132d(value22.trim());
                                }
                                aaVar4.f18742d = new ArrayList<>();
                            }
                        } else if (str2.equalsIgnoreCase("webpicture")) {
                            this.f18965h = new ImgMetadata();
                        } else if (str2.equalsIgnoreCase("login")) {
                            C5230aa aaVar5 = (C5230aa) this.f18959b.mo16902D().get(this.f18964g);
                            if (aaVar5 != null) {
                                Map hashMap2 = new HashMap();
                                hashMap2.put("password", attributes.getValue("password"));
                                hashMap2.put("login", attributes.getValue("user"));
                                hashMap2.put("url", attributes.getValue("url"));
                                arrayList = aaVar5.f18728b;
                                obj = hashMap2;
                            }
                        } else if (m26495a("airpush")) {
                            this.f18959b.mo16939c(C5246b.m26185a(attributes.getValue("interstitialAdType")));
                        } else if (str2.equalsIgnoreCase("cover")) {
                            C5230aa aaVar6 = (C5230aa) this.f18959b.mo16902D().get(this.f18964g);
                            if (aaVar6 != null && aaVar6.mo17123b("cameracover")) {
                                aaVar6.mo17005F(attributes.getValue("image"));
                            }
                        } else if (str2.equalsIgnoreCase("pdftron")) {
                            String value23 = attributes.getValue("licenseKey");
                            if (value23 != null) {
                                this.f18972o = value23;
                            }
                        } else if (str2.equalsIgnoreCase("magazine")) {
                            C5230aa aaVar7 = (C5230aa) this.f18959b.mo16902D().get(this.f18964g);
                            if (aaVar7 != null) {
                                arrayList = aaVar7.mo17056aB();
                                obj = new MagazineInfo(attributes);
                            }
                        } else {
                            if (str2.equalsIgnoreCase("sharepointclient")) {
                                if (attributes.getValue("url") != null) {
                                    try {
                                        obj2 = new URI(attributes.getValue("url")).toString();
                                    } catch (URISyntaxException e3) {
                                        Log.e("AppConfigHandler", "Sharepoint parsing error", e3);
                                        obj2 = null;
                                    }
                                    this.f18973p.put("url", obj2);
                                }
                                this.f18973p.put("username", attributes.getValue("username"));
                                this.f18973p.put("password", attributes.getValue("password"));
                                if (attributes.getValue("uploadfolderurl") != null) {
                                    this.f18973p.put("uploadfolderurl", attributes.getValue("uploadfolderurl"));
                                }
                                if (attributes.getValue("lcid") != null) {
                                    this.f18973p.put("lcid", attributes.getValue("lcid"));
                                }
                                if (attributes.getValue("detectPlatformLanguage") != null) {
                                    f = this.f18973p;
                                    b = "detectPlatformLanguage";
                                    valueOf = attributes.getValue("detectPlatformLanguage");
                                }
                            } else if (str2.equalsIgnoreCase("result")) {
                                C5230aa aaVar8 = (C5230aa) this.f18959b.mo16902D().get(this.f18964g);
                                if (aaVar8 != null) {
                                    HashMap hashMap3 = new HashMap();
                                    String value24 = attributes.getValue("message");
                                    String str8 = "message";
                                    if (C6592al.m31909b(value24)) {
                                        value24 = "";
                                    }
                                    hashMap3.put(str8, value24);
                                    String value25 = attributes.getValue("imageName");
                                    String str9 = "imageName";
                                    if (C6592al.m31909b(value25)) {
                                        value25 = "";
                                    }
                                    hashMap3.put(str9, value25);
                                    String value26 = attributes.getValue("pageName");
                                    String str10 = "pageName";
                                    if (C6592al.m31909b(value26)) {
                                        value26 = "";
                                    }
                                    hashMap3.put(str10, value26);
                                    arrayList = aaVar8.mo17062aH();
                                    obj = hashMap3;
                                }
                            } else if (m26496a("pntopics", "topic")) {
                                arrayList = this.f18959b.mo16907I();
                                obj = new GCMTopic(m26503b(attributes, "id", ""), m26503b(attributes, "group", ""));
                            } else if (m26497a("hostedresources", "page", "resource")) {
                                C5230aa b4 = m26502b(this.f18964g);
                                String value27 = attributes.getValue("url");
                                if (value27 != null) {
                                    HashMap hashMap4 = new HashMap();
                                    hashMap4.put("url", value27);
                                    String value28 = attributes.getValue("relPath");
                                    if (value28 != null) {
                                        hashMap4.put("relPath", value28);
                                    }
                                    b4.mo17134d(hashMap4);
                                }
                            } else if (str2.equalsIgnoreCase("levelInfo")) {
                                C5230aa b5 = m26502b(this.f18964g);
                                if (b5.mo17118b().equalsIgnoreCase("puzzle")) {
                                    String value29 = attributes.getValue("title");
                                    String value30 = attributes.getValue("rows");
                                    String value31 = attributes.getValue("nextPage");
                                    if (value29 != null && value29.length() > 0 && value30 != null && value30.length() > 0) {
                                        HashMap hashMap5 = new HashMap();
                                        hashMap5.put("title", value29);
                                        hashMap5.put("rows", value30);
                                        hashMap5.put("nextPage", value31);
                                        b5.mo17139e(hashMap5);
                                    }
                                }
                            } else {
                                if (m26496a("page", "buttonimage")) {
                                    C5230aa b6 = m26502b(this.f18964g);
                                    if (b6.mo17118b().equalsIgnoreCase("slotmachine")) {
                                        bundle = b6.mo17067aM();
                                        str5 = "buttonimage";
                                    }
                                } else if (m26496a("page", "soundbutton")) {
                                    C5230aa b7 = m26502b(this.f18964g);
                                    if (b7.mo17118b().equalsIgnoreCase("slotmachine")) {
                                        bundle = b7.mo17067aM();
                                        str5 = "soundbutton";
                                    }
                                } else if (m26496a("page", "soundcomponentrotation")) {
                                    C5230aa b8 = m26502b(this.f18964g);
                                    if (b8.mo17118b().equalsIgnoreCase("slotmachine")) {
                                        bundle = b8.mo17067aM();
                                        str5 = "soundcomponentrotation";
                                    }
                                } else if (m26496a("page", "soundcomponentstop")) {
                                    C5230aa b9 = m26502b(this.f18964g);
                                    if (b9.mo17118b().equalsIgnoreCase("slotmachine")) {
                                        bundle = b9.mo17067aM();
                                        str5 = "soundcomponentstop";
                                    }
                                } else if (m26496a("page", "soundwin")) {
                                    C5230aa b10 = m26502b(this.f18964g);
                                    if (b10.mo17118b().equalsIgnoreCase("slotmachine")) {
                                        bundle = b10.mo17067aM();
                                        str5 = "soundwin";
                                    }
                                } else if (m26496a("page", "soundloser")) {
                                    C5230aa b11 = m26502b(this.f18964g);
                                    if (b11.mo17118b().equalsIgnoreCase("slotmachine")) {
                                        bundle = b11.mo17067aM();
                                        str5 = "soundloser";
                                    }
                                } else if (m26496a("page", "timerotationofslots")) {
                                    C5230aa b12 = m26502b(this.f18964g);
                                    if (b12.mo17118b().equalsIgnoreCase("slotmachine")) {
                                        b12.mo17067aM().putInt("timerotationofslots", m26489a(attributes, "value", 3));
                                    }
                                } else {
                                    if (m26496a("page", "actionofwinposition")) {
                                        C5230aa b13 = m26502b(this.f18964g);
                                        if (b13.mo17118b().equalsIgnoreCase("slotmachine")) {
                                            aM = b13.mo17067aM();
                                            str4 = "actionofwinposition";
                                        }
                                    } else if (m26496a("page", "winpositionofcomponents")) {
                                        C5230aa b14 = m26502b(this.f18964g);
                                        if (b14.mo17118b().equalsIgnoreCase("slotmachine")) {
                                            aM = b14.mo17067aM();
                                            str4 = "winpositionofcomponents";
                                        }
                                    } else if (str2.equalsIgnoreCase("listcom") && this.f18968k.size() == 3 && ((((String) this.f18968k.get(2)).equalsIgnoreCase("component1") || ((String) this.f18968k.get(2)).equalsIgnoreCase("component2") || ((String) this.f18968k.get(2)).equalsIgnoreCase("component3")) && ((String) this.f18968k.get(1)).equalsIgnoreCase("page"))) {
                                        C5230aa b15 = m26502b(this.f18964g);
                                        if (b15.mo17118b().equalsIgnoreCase("slotmachine")) {
                                            String str11 = (String) this.f18968k.get(2);
                                            Bundle aM3 = b15.mo17067aM();
                                            HashMap hashMap6 = new HashMap(3);
                                            hashMap6.put("action", attributes.getValue("action"));
                                            hashMap6.put("img", attributes.getValue("img"));
                                            hashMap6.put("text", attributes.getValue("text"));
                                            ArrayList arrayList5 = (ArrayList) aM3.getSerializable(str11);
                                            if (arrayList5 == null) {
                                                arrayList5 = new ArrayList();
                                                aM3.putSerializable(str11, arrayList5);
                                            }
                                            arrayList5.add(hashMap6);
                                        }
                                    } else if (m26496a("inAppSettings", "setting")) {
                                        f = this.f18959b.mo16951f();
                                        b = m26503b(attributes, "id", "");
                                        valueOf = Boolean.valueOf(m26499a(attributes, "enabled", false));
                                    } else if (m26495a("webView")) {
                                        this.f18959b.mo16961h(m26499a(attributes, "externalSiteZoomEnabled", false));
                                        this.f18959b.mo16973l(m26499a(attributes, "allowBasicAuth", false));
                                        this.f18959b.mo16969k(m26503b(attributes, "allowedHostsForBasicAuth", ""));
                                        this.f18959b.mo16964i(m26499a(attributes, "optimizeOrientationChange", this.f18959b.mo16913O()));
                                        this.f18959b.mo16967j(m26499a(attributes, "optimizeAppearance", this.f18959b.mo16914P()));
                                    } else if (m26496a("page", "feed")) {
                                        C5230aa b16 = m26502b(this.f18964g);
                                        if (b16.mo17118b().equalsIgnoreCase("multipodcast") && b16.mo17077aW() != null && b16.mo17077aW().equalsIgnoreCase("SCPodcasts")) {
                                            String value32 = attributes.getValue("url");
                                            if (value32 != null) {
                                                String trim2 = value32.trim();
                                                if (trim2.length() > 0) {
                                                    b16.mo17100ak(trim2);
                                                }
                                            }
                                        }
                                    } else if (m26495a("agreementPage")) {
                                        this.f18959b.mo16960h(m26503b(attributes, "pageId", (String) null));
                                        this.f18959b.mo16963i(m26503b(attributes, "denyPageId", (String) null));
                                    } else if (m26495a("wellcomePage")) {
                                        this.f18959b.mo16966j(m26503b(attributes, "pageId", (String) null));
                                        this.f18959b.mo16959h(m26489a(attributes, "showTime", 0));
                                        this.f18959b.mo16970k(m26499a(attributes, "showEveryTime", false));
                                    } else if (m26495a("authentication")) {
                                        this.f18959b.mo16976m(m26499a(attributes, "enabled", false));
                                    } else if (m26495a("authenticationPage")) {
                                        this.f18959b.mo16979n(m26499a(attributes, "enabled", false));
                                    } else if (m26495a("turn_off_pyze")) {
                                        Boolean valueOf2 = Boolean.valueOf(!m26499a(attributes, "disabled", false));
                                        this.f18959b.mo16928a(valueOf2.booleanValue());
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("turn_off_analytic '");
                                        sb3.append(valueOf2);
                                        sb3.append("'");
                                        Log.v("AppConfigHandler", sb3.toString());
                                    }
                                    str6 = "value";
                                    bundle.putString(str5, attributes.getValue(str6));
                                }
                                str6 = "src";
                                bundle.putString(str5, attributes.getValue(str6));
                            }
                            f.put(b, valueOf);
                        }
                        arrayList.add(obj);
                    }
                    e.add(value);
                }
                this.f18963f.setLength(0);
            }
        }
        this.f18968k.add(str2);
        if (this.f18968k.size() > 2 && ((String) this.f18968k.get(1)).equals("page")) {
            C6651b bVar = new C6651b(str2, attributes);
            ((C6651b) this.f18969l.get(this.f18969l.size() - 1)).mo20642a(bVar);
            this.f18969l.add(bVar);
        }
    }
}
