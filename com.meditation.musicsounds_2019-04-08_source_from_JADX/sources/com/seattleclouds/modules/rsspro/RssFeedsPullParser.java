package com.seattleclouds.modules.rsspro;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import p194nl.siegmann.epublib.domain.TableOfContents;

public class RssFeedsPullParser {

    /* renamed from: A */
    private static final String f22115A = null;

    /* renamed from: B */
    private C6249c f22116B;

    /* renamed from: C */
    private String f22117C;

    /* renamed from: a */
    final String f22118a = "FeedParser";

    /* renamed from: b */
    final int f22119b = 1;

    /* renamed from: c */
    final int f22120c = 2;

    /* renamed from: d */
    final int f22121d = 3;

    /* renamed from: e */
    final int f22122e = 4;

    /* renamed from: f */
    final int f22123f = 5;

    /* renamed from: g */
    HashSet<String> f22124g = new HashSet<>(Arrays.asList(new String[]{"br", "img", "input", "hr", "link", "base", "basefont", "frame", "meta", "area", "col", "param"}));

    /* renamed from: h */
    FeedType f22125h;

    /* renamed from: i */
    boolean f22126i;

    /* renamed from: j */
    boolean f22127j;

    /* renamed from: k */
    boolean f22128k;

    /* renamed from: l */
    boolean f22129l;

    /* renamed from: m */
    boolean f22130m;

    /* renamed from: n */
    boolean f22131n = false;

    /* renamed from: o */
    String f22132o;

    /* renamed from: p */
    boolean f22133p;

    /* renamed from: q */
    public String f22134q;

    /* renamed from: r */
    public String f22135r;

    /* renamed from: s */
    public String f22136s;

    /* renamed from: t */
    public HashMap<String, String> f22137t;

    /* renamed from: u */
    public C6247a f22138u;

    /* renamed from: v */
    public C6248b f22139v;

    /* renamed from: w */
    XmlPullParser f22140w;

    /* renamed from: x */
    boolean f22141x = false;

    /* renamed from: y */
    DateFormat f22142y;

    /* renamed from: z */
    SimpleDateFormat f22143z;

    public enum FeedType {
        FeedTypeUnknown,
        FeedTypeRSS,
        FeedTypeRSS1,
        FeedTypeAtom
    }

    public RssFeedsPullParser(C6249c cVar, String str) {
        this.f22116B = cVar;
        this.f22117C = str;
        this.f22142y = DateFormat.getDateInstance(1);
        this.f22143z = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z", Locale.US);
    }

    /* renamed from: a */
    private void m30361a(int i, String str) {
        if (!this.f22129l) {
            this.f22128k = true;
            this.f22127j = false;
            this.f22129l = true;
            this.f22126i = true;
            mo19538b();
            if (this.f22116B != null) {
                this.f22116B.mo19570a(new Error(str));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0223 A[Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0355 A[Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0495 A[Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo19537a() {
        /*
            r9 = this;
            com.seattleclouds.modules.rsspro.c r0 = r9.f22116B
            r1 = 0
            if (r0 == 0) goto L_0x06fa
            java.lang.String r0 = r9.f22117C
            if (r0 == 0) goto L_0x06fa
            java.lang.String r0 = r9.f22117C
            java.lang.String r2 = ""
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L_0x06fa
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch:{ XmlPullParserException -> 0x06f2 }
            r2 = 1
            r0.setNamespaceAware(r2)     // Catch:{ XmlPullParserException -> 0x06f2 }
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()     // Catch:{ XmlPullParserException -> 0x06f2 }
            r9.f22140w = r0     // Catch:{ XmlPullParserException -> 0x06f2 }
            r9.mo19539c()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.net.URL r0 = new java.net.URL     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r3 = r9.f22117C     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r0.<init>(r3)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r4 = r0.getProtocol()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r3.append(r4)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r4 = "://"
            r3.append(r4)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r4 = r0.getHost()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r3.append(r4)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r3 = r3.toString()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r4 = r9.f22117C     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r5 = "/"
            int r4 = r4.indexOf(r5)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r5 = -1
            r6 = 0
            if (r4 != r5) goto L_0x005f
            org.xmlpull.v1.XmlPullParser r0 = r9.f22140w     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r4 = r9.f22117C     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.io.InputStream r4 = com.seattleclouds.App.m25639c(r4)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r0.setInput(r4, r6)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x0068
        L_0x005f:
            org.xmlpull.v1.XmlPullParser r4 = r9.f22140w     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.io.InputStream r0 = r0.openStream()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.setInput(r0, r6)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
        L_0x0068:
            org.xmlpull.v1.XmlPullParser r0 = r9.f22140w     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            int r0 = r0.getEventType()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
        L_0x006e:
            if (r0 == r2) goto L_0x06f1
            boolean r4 = r9.f22141x     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 != 0) goto L_0x06f1
            if (r0 == 0) goto L_0x0697
            switch(r0) {
                case 2: goto L_0x0586;
                case 3: goto L_0x0085;
                case 4: goto L_0x007b;
                default: goto L_0x0079;
            }     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
        L_0x0079:
            goto L_0x06c0
        L_0x007b:
            org.xmlpull.v1.XmlPullParser r0 = r9.f22140w     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r0 = r0.getText()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
        L_0x0081:
            r9.f22135r = r0     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x06c0
        L_0x0085:
            java.lang.String r0 = ""
            org.xmlpull.v1.XmlPullParser r4 = r9.f22140w     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r4 = r4.getPrefix()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x00ab
            java.lang.String r5 = ""
            boolean r5 = r4.equalsIgnoreCase(r5)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r5 != 0) goto L_0x00ab
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r5.append(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r5.append(r4)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r0 = ":"
            r5.append(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r0 = r5.toString()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
        L_0x00ab:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.append(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            org.xmlpull.v1.XmlPullParser r0 = r9.f22140w     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r0 = r0.getName()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.append(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r0 = r4.toString()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r4 = r9.f22136s     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            boolean r4 = r0.equalsIgnoreCase(r4)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x00d1
            r9.f22141x = r2     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            com.seattleclouds.modules.rsspro.c r0 = r9.f22116B     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r0.mo19571b()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x06c0
        L_0x00d1:
            boolean r4 = r9.f22133p     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r5 = 47
            if (r4 == 0) goto L_0x0112
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            int r4 = r4.length()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = r9.f22132o     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            int r7 = r7.length()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 <= r7) goto L_0x010e
            java.util.HashSet<java.lang.String> r4 = r9.f22124g     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            boolean r4 = r4.contains(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 != 0) goto L_0x00fe
            java.lang.String r4 = r9.f22135r     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "</"
            java.lang.String r4 = r4.concat(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r0 = r4.concat(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r4 = ">"
            r0.concat(r4)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
        L_0x00fe:
            java.lang.String r0 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            int r4 = r4.lastIndexOf(r5)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r0 = r0.substring(r1, r4)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r9.f22134q = r0     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x06c0
        L_0x010e:
            r9.f22133p = r1     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r9.f22132o = r6     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
        L_0x0112:
            java.lang.String r0 = r9.f22135r     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            com.seattleclouds.modules.rsspro.RssFeedsPullParser$FeedType r4 = r9.f22125h     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            com.seattleclouds.modules.rsspro.RssFeedsPullParser$FeedType r7 = com.seattleclouds.modules.rsspro.RssFeedsPullParser.FeedType.FeedTypeRSS     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 != r7) goto L_0x0295
            com.seattleclouds.modules.rsspro.b r4 = r9.f22139v     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.mo19565h(r3)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/rss/channel/item/title"
            boolean r4 = r4.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x0139
            if (r0 == 0) goto L_0x0136
            int r4 = r0.length()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 <= 0) goto L_0x0136
            com.seattleclouds.modules.rsspro.b r4 = r9.f22139v     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.mo19553b(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
        L_0x0136:
            r4 = 1
            goto L_0x0221
        L_0x0139:
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/rss/channel/item/link"
            boolean r4 = r4.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x0151
            if (r0 == 0) goto L_0x0136
            int r4 = r0.length()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 <= 0) goto L_0x0136
            com.seattleclouds.modules.rsspro.b r4 = r9.f22139v     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.mo19555c(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x0136
        L_0x0151:
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/rss/channel/item/guid"
            boolean r4 = r4.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x0169
            if (r0 == 0) goto L_0x0136
            int r4 = r0.length()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 <= 0) goto L_0x0136
            com.seattleclouds.modules.rsspro.b r4 = r9.f22139v     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.mo19551a(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x0136
        L_0x0169:
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/rss/channel/item/description"
            boolean r4 = r4.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x0181
            if (r0 == 0) goto L_0x0136
            int r4 = r0.length()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 <= 0) goto L_0x0136
            com.seattleclouds.modules.rsspro.b r4 = r9.f22139v     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.mo19557d(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x0136
        L_0x0181:
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/rss/channel/item/content:encoded"
            boolean r4 = r4.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x0199
            if (r0 == 0) goto L_0x0136
            int r4 = r0.length()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 <= 0) goto L_0x0136
            com.seattleclouds.modules.rsspro.b r4 = r9.f22139v     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.mo19561f(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x0136
        L_0x0199:
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/rss/channel/item/media:content"
            boolean r4 = r4.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x01d0
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r9.f22137t     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "type"
            java.lang.Object r4 = r4.get(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x0136
            java.lang.String r7 = "image"
            boolean r4 = r4.contains(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x0136
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r9.f22137t     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "url"
            java.lang.Object r4 = r4.get(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x0136
            int r7 = r4.length()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r7 <= 0) goto L_0x0136
            com.seattleclouds.modules.rsspro.b r7 = r9.f22139v     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r7.mo19563g(r4)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x0136
        L_0x01d0:
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/rss/channel/item/pubDate"
            boolean r4 = r4.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x01e9
            if (r0 == 0) goto L_0x0136
            int r4 = r0.length()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 <= 0) goto L_0x0136
            com.seattleclouds.modules.rsspro.b r4 = r9.f22139v     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
        L_0x01e4:
            r4.mo19559e(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x0136
        L_0x01e9:
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/rss/channel/item/dc:date"
            boolean r4 = r4.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x01fe
            if (r0 == 0) goto L_0x0136
            int r4 = r0.length()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 <= 0) goto L_0x0136
            com.seattleclouds.modules.rsspro.b r4 = r9.f22139v     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x01e4
        L_0x01fe:
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/rss/channel/item/enclosure"
            boolean r4 = r4.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x020a
            goto L_0x0136
        L_0x020a:
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/rss/channel/item"
            boolean r4 = r4.contains(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x0220
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/rss/channel/item"
            boolean r4 = r4.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 != 0) goto L_0x0220
            goto L_0x0136
        L_0x0220:
            r4 = 0
        L_0x0221:
            if (r4 != 0) goto L_0x0501
            com.seattleclouds.modules.rsspro.a r7 = r9.f22138u     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r7 == 0) goto L_0x022c
            com.seattleclouds.modules.rsspro.a r7 = r9.f22138u     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r7.mo19549d(r3)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
        L_0x022c:
            java.lang.String r7 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r8 = "/rss/channel/title"
            boolean r7 = r7.equalsIgnoreCase(r8)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r7 == 0) goto L_0x0246
            if (r0 == 0) goto L_0x0243
            int r4 = r0.length()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 <= 0) goto L_0x0243
            com.seattleclouds.modules.rsspro.a r4 = r9.f22138u     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
        L_0x0240:
            r4.mo19543a(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
        L_0x0243:
            r4 = 1
            goto L_0x0501
        L_0x0246:
            java.lang.String r7 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r8 = "/rss/channel/description"
            boolean r7 = r7.equalsIgnoreCase(r8)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r7 == 0) goto L_0x025e
            if (r0 == 0) goto L_0x0243
            int r4 = r0.length()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 <= 0) goto L_0x0243
            com.seattleclouds.modules.rsspro.a r4 = r9.f22138u     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
        L_0x025a:
            r4.mo19547c(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x0243
        L_0x025e:
            java.lang.String r7 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r8 = "/rss/channel/link"
            boolean r7 = r7.equalsIgnoreCase(r8)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r7 == 0) goto L_0x0276
            if (r0 == 0) goto L_0x0243
            int r4 = r0.length()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 <= 0) goto L_0x0243
            com.seattleclouds.modules.rsspro.a r4 = r9.f22138u     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
        L_0x0272:
            r4.mo19545b(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x0243
        L_0x0276:
            java.lang.String r0 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/rss/channel"
            boolean r0 = r0.contains(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r0 == 0) goto L_0x0501
            java.lang.String r0 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/rss/channel/item"
            boolean r0 = r0.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r0 != 0) goto L_0x0501
            java.lang.String r0 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/rss/channel"
            boolean r0 = r0.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r0 != 0) goto L_0x0501
            goto L_0x0243
        L_0x0295:
            com.seattleclouds.modules.rsspro.RssFeedsPullParser$FeedType r4 = r9.f22125h     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            com.seattleclouds.modules.rsspro.RssFeedsPullParser$FeedType r7 = com.seattleclouds.modules.rsspro.RssFeedsPullParser.FeedType.FeedTypeRSS1     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 != r7) goto L_0x03c0
            com.seattleclouds.modules.rsspro.b r4 = r9.f22139v     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.mo19565h(r3)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/rdf:RDF/item/title"
            boolean r4 = r4.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x02ba
            if (r0 == 0) goto L_0x02b7
            int r4 = r0.length()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 <= 0) goto L_0x02b7
            com.seattleclouds.modules.rsspro.b r4 = r9.f22139v     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.mo19553b(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
        L_0x02b7:
            r4 = 1
            goto L_0x0353
        L_0x02ba:
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/rdf:RDF/item/link"
            boolean r4 = r4.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x02d2
            if (r0 == 0) goto L_0x02b7
            int r4 = r0.length()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 <= 0) goto L_0x02b7
            com.seattleclouds.modules.rsspro.b r4 = r9.f22139v     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.mo19555c(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x02b7
        L_0x02d2:
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/rdf:RDF/item/dc:identifier"
            boolean r4 = r4.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x02ea
            if (r0 == 0) goto L_0x02b7
            int r4 = r0.length()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 <= 0) goto L_0x02b7
            com.seattleclouds.modules.rsspro.b r4 = r9.f22139v     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.mo19551a(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x02b7
        L_0x02ea:
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/rdf:RDF/item/description"
            boolean r4 = r4.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x0302
            if (r0 == 0) goto L_0x02b7
            int r4 = r0.length()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 <= 0) goto L_0x02b7
            com.seattleclouds.modules.rsspro.b r4 = r9.f22139v     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.mo19557d(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x02b7
        L_0x0302:
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/rdf:RDF/item/content:encoded"
            boolean r4 = r4.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x031a
            if (r0 == 0) goto L_0x02b7
            int r4 = r0.length()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 <= 0) goto L_0x02b7
            com.seattleclouds.modules.rsspro.b r4 = r9.f22139v     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.mo19561f(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x02b7
        L_0x031a:
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/rdf:RDF/item/dc:date"
            boolean r4 = r4.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x0330
            int r4 = r0.length()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 <= 0) goto L_0x02b7
            com.seattleclouds.modules.rsspro.b r4 = r9.f22139v     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.mo19559e(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x02b7
        L_0x0330:
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/rdf:RDF/item/enc:enclosure"
            boolean r4 = r4.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x033c
            goto L_0x02b7
        L_0x033c:
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/rdf:RDF/item"
            boolean r4 = r4.contains(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x0352
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/rdf:RDF/item"
            boolean r4 = r4.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 != 0) goto L_0x0352
            goto L_0x02b7
        L_0x0352:
            r4 = 0
        L_0x0353:
            if (r4 != 0) goto L_0x0501
            com.seattleclouds.modules.rsspro.a r7 = r9.f22138u     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r7 == 0) goto L_0x035e
            com.seattleclouds.modules.rsspro.a r7 = r9.f22138u     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r7.mo19549d(r3)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
        L_0x035e:
            java.lang.String r7 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r8 = "/rdf:RDF/channel/title"
            boolean r7 = r7.equalsIgnoreCase(r8)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r7 == 0) goto L_0x0374
            if (r0 == 0) goto L_0x0243
            int r4 = r0.length()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 <= 0) goto L_0x0243
            com.seattleclouds.modules.rsspro.a r4 = r9.f22138u     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x0240
        L_0x0374:
            java.lang.String r7 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r8 = "/rdf:RDF/channel/description"
            boolean r7 = r7.equalsIgnoreCase(r8)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r7 == 0) goto L_0x038a
            if (r0 == 0) goto L_0x0243
            int r4 = r0.length()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 <= 0) goto L_0x0243
            com.seattleclouds.modules.rsspro.a r4 = r9.f22138u     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x025a
        L_0x038a:
            java.lang.String r7 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r8 = "/rdf:RDF/channel/link"
            boolean r7 = r7.equalsIgnoreCase(r8)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r7 == 0) goto L_0x03a0
            if (r0 == 0) goto L_0x0243
            int r4 = r0.length()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 <= 0) goto L_0x0243
            com.seattleclouds.modules.rsspro.a r4 = r9.f22138u     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x0272
        L_0x03a0:
            java.lang.String r0 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/rdf:RDF/channel"
            boolean r0 = r0.contains(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r0 == 0) goto L_0x0501
            java.lang.String r0 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/rdf:RDF/channel/item"
            boolean r0 = r0.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r0 != 0) goto L_0x0501
            java.lang.String r0 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/rdf:RDF/channel"
            boolean r0 = r0.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r0 != 0) goto L_0x0501
            goto L_0x0243
        L_0x03c0:
            com.seattleclouds.modules.rsspro.RssFeedsPullParser$FeedType r4 = r9.f22125h     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            com.seattleclouds.modules.rsspro.RssFeedsPullParser$FeedType r7 = com.seattleclouds.modules.rsspro.RssFeedsPullParser.FeedType.FeedTypeAtom     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 != r7) goto L_0x0500
            com.seattleclouds.modules.rsspro.b r4 = r9.f22139v     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.mo19565h(r3)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/feed/entry/title"
            boolean r4 = r4.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x03e5
            if (r0 == 0) goto L_0x03e2
            int r4 = r0.length()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 <= 0) goto L_0x03e2
            com.seattleclouds.modules.rsspro.b r4 = r9.f22139v     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.mo19553b(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
        L_0x03e2:
            r4 = 1
            goto L_0x0493
        L_0x03e5:
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/feed/entry/link"
            boolean r4 = r4.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x0411
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r9.f22137t     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "rel"
            java.lang.Object r4 = r4.get(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "alternate"
            boolean r4 = r4.equals(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x03e2
            com.seattleclouds.modules.rsspro.b r4 = r9.f22139v     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.util.HashMap<java.lang.String, java.lang.String> r7 = r9.f22137t     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r8 = "href"
            java.lang.Object r7 = r7.get(r8)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.mo19555c(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x03e2
        L_0x0411:
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/feed/entry/id"
            boolean r4 = r4.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x0429
            if (r0 == 0) goto L_0x03e2
            int r4 = r0.length()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 <= 0) goto L_0x03e2
            com.seattleclouds.modules.rsspro.b r4 = r9.f22139v     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.mo19551a(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x03e2
        L_0x0429:
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/feed/entry/summary"
            boolean r4 = r4.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x0441
            if (r0 == 0) goto L_0x03e2
            int r4 = r0.length()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 <= 0) goto L_0x03e2
            com.seattleclouds.modules.rsspro.b r4 = r9.f22139v     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.mo19557d(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x03e2
        L_0x0441:
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/feed/entry/content"
            boolean r4 = r4.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x0459
            if (r0 == 0) goto L_0x03e2
            int r4 = r0.length()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 <= 0) goto L_0x03e2
            com.seattleclouds.modules.rsspro.b r4 = r9.f22139v     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.mo19561f(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x03e2
        L_0x0459:
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/feed/entry/published"
            boolean r4 = r4.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x0470
            int r4 = r0.length()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 <= 0) goto L_0x03e2
            com.seattleclouds.modules.rsspro.b r4 = r9.f22139v     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.mo19559e(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x03e2
        L_0x0470:
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/feed/entry/updated"
            boolean r4 = r4.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x047c
            goto L_0x03e2
        L_0x047c:
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/feed/entry"
            boolean r4 = r4.contains(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x0492
            java.lang.String r4 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/feed/entry"
            boolean r4 = r4.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 != 0) goto L_0x0492
            goto L_0x03e2
        L_0x0492:
            r4 = 0
        L_0x0493:
            if (r4 != 0) goto L_0x0501
            com.seattleclouds.modules.rsspro.a r7 = r9.f22138u     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r7 == 0) goto L_0x049e
            com.seattleclouds.modules.rsspro.a r7 = r9.f22138u     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r7.mo19549d(r3)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
        L_0x049e:
            java.lang.String r7 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r8 = "/feed/title"
            boolean r7 = r7.equalsIgnoreCase(r8)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r7 == 0) goto L_0x04b4
            if (r0 == 0) goto L_0x0243
            int r4 = r0.length()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 <= 0) goto L_0x0243
            com.seattleclouds.modules.rsspro.a r4 = r9.f22138u     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x0240
        L_0x04b4:
            java.lang.String r7 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r8 = "/feed/description"
            boolean r7 = r7.equalsIgnoreCase(r8)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r7 == 0) goto L_0x04ca
            if (r0 == 0) goto L_0x0243
            int r4 = r0.length()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 <= 0) goto L_0x0243
            com.seattleclouds.modules.rsspro.a r4 = r9.f22138u     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x025a
        L_0x04ca:
            java.lang.String r7 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r8 = "/feed/link"
            boolean r7 = r7.equalsIgnoreCase(r8)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r7 == 0) goto L_0x04e0
            if (r0 == 0) goto L_0x0243
            int r4 = r0.length()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 <= 0) goto L_0x0243
            com.seattleclouds.modules.rsspro.a r4 = r9.f22138u     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x0272
        L_0x04e0:
            java.lang.String r0 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/feed"
            boolean r0 = r0.contains(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r0 == 0) goto L_0x0501
            java.lang.String r0 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/feed/entry"
            boolean r0 = r0.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r0 != 0) goto L_0x0501
            java.lang.String r0 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/feed"
            boolean r0 = r0.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r0 != 0) goto L_0x0501
            goto L_0x0243
        L_0x0500:
            r4 = 0
        L_0x0501:
            if (r4 != 0) goto L_0x053d
            com.seattleclouds.modules.rsspro.RssFeedsPullParser$FeedType r0 = r9.f22125h     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            com.seattleclouds.modules.rsspro.RssFeedsPullParser$FeedType r7 = com.seattleclouds.modules.rsspro.RssFeedsPullParser.FeedType.FeedTypeRSS     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r0 != r7) goto L_0x0513
            java.lang.String r0 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/rss/channel/item"
            boolean r0 = r0.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r0 != 0) goto L_0x0533
        L_0x0513:
            com.seattleclouds.modules.rsspro.RssFeedsPullParser$FeedType r0 = r9.f22125h     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            com.seattleclouds.modules.rsspro.RssFeedsPullParser$FeedType r7 = com.seattleclouds.modules.rsspro.RssFeedsPullParser.FeedType.FeedTypeRSS1     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r0 != r7) goto L_0x0523
            java.lang.String r0 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/rdf:RDF/item"
            boolean r0 = r0.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r0 != 0) goto L_0x0533
        L_0x0523:
            com.seattleclouds.modules.rsspro.RssFeedsPullParser$FeedType r0 = r9.f22125h     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            com.seattleclouds.modules.rsspro.RssFeedsPullParser$FeedType r7 = com.seattleclouds.modules.rsspro.RssFeedsPullParser.FeedType.FeedTypeAtom     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r0 != r7) goto L_0x053d
            java.lang.String r0 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = "/feed/entry"
            boolean r0 = r0.equalsIgnoreCase(r7)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r0 == 0) goto L_0x053d
        L_0x0533:
            r9.mo19541e()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            com.seattleclouds.modules.rsspro.b r0 = new com.seattleclouds.modules.rsspro.b     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r9.f22139v = r0     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
        L_0x053d:
            java.lang.String r0 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            int r5 = r7.lastIndexOf(r5)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r0 = r0.substring(r1, r5)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r9.f22134q = r0     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 != 0) goto L_0x06c0
            com.seattleclouds.modules.rsspro.RssFeedsPullParser$FeedType r0 = r9.f22125h     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            com.seattleclouds.modules.rsspro.RssFeedsPullParser$FeedType r4 = com.seattleclouds.modules.rsspro.RssFeedsPullParser.FeedType.FeedTypeRSS     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r0 != r4) goto L_0x055d
            java.lang.String r0 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r4 = "/rss/channel"
            boolean r0 = r0.equalsIgnoreCase(r4)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r0 != 0) goto L_0x057d
        L_0x055d:
            com.seattleclouds.modules.rsspro.RssFeedsPullParser$FeedType r0 = r9.f22125h     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            com.seattleclouds.modules.rsspro.RssFeedsPullParser$FeedType r4 = com.seattleclouds.modules.rsspro.RssFeedsPullParser.FeedType.FeedTypeRSS1     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r0 != r4) goto L_0x056d
            java.lang.String r0 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r4 = "/rdf:RDF/channel"
            boolean r0 = r0.equalsIgnoreCase(r4)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r0 != 0) goto L_0x057d
        L_0x056d:
            com.seattleclouds.modules.rsspro.RssFeedsPullParser$FeedType r0 = r9.f22125h     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            com.seattleclouds.modules.rsspro.RssFeedsPullParser$FeedType r4 = com.seattleclouds.modules.rsspro.RssFeedsPullParser.FeedType.FeedTypeAtom     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r0 != r4) goto L_0x06c0
            java.lang.String r0 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r4 = "/feed"
            boolean r0 = r0.equalsIgnoreCase(r4)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r0 == 0) goto L_0x06c0
        L_0x057d:
            com.seattleclouds.modules.rsspro.a r0 = r9.f22138u     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r0 == 0) goto L_0x06c0
            r9.mo19540d()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x06c0
        L_0x0586:
            java.lang.String r0 = ""
            org.xmlpull.v1.XmlPullParser r4 = r9.f22140w     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r4 = r4.getPrefix()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x05ac
            java.lang.String r5 = ""
            boolean r5 = r4.equalsIgnoreCase(r5)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r5 != 0) goto L_0x05ac
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r5.append(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r5.append(r4)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r0 = ":"
            r5.append(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r0 = r5.toString()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
        L_0x05ac:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.append(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            org.xmlpull.v1.XmlPullParser r0 = r9.f22140w     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r0 = r0.getName()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.append(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r0 = r4.toString()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            boolean r4 = r9.f22131n     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 != 0) goto L_0x05c9
            r9.f22136s = r0     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r9.f22131n = r2     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
        L_0x05c9:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r5 = r9.f22134q     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.append(r5)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r5 = "/"
            r4.append(r5)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.append(r0)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r4 = r4.toString()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r9.f22134q = r4     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r9.f22137t     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4.clear()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4 = 0
        L_0x05e7:
            org.xmlpull.v1.XmlPullParser r5 = r9.f22140w     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            int r5 = r5.getAttributeCount()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 >= r5) goto L_0x0603
            java.util.HashMap<java.lang.String, java.lang.String> r5 = r9.f22137t     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            org.xmlpull.v1.XmlPullParser r7 = r9.f22140w     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r7 = r7.getAttributeName(r4)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            org.xmlpull.v1.XmlPullParser r8 = r9.f22140w     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r8 = r8.getAttributeValue(r4)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r5.put(r7, r8)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            int r4 = r4 + 1
            goto L_0x05e7
        L_0x0603:
            boolean r4 = r9.f22133p     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x0663
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r4 = "<"
            r0.append(r4)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            org.xmlpull.v1.XmlPullParser r4 = r9.f22140w     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r4 = r4.getName()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r0.append(r4)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r4 = 0
        L_0x061b:
            org.xmlpull.v1.XmlPullParser r5 = r9.f22140w     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            int r5 = r5.getAttributeCount()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 >= r5) goto L_0x0646
            org.xmlpull.v1.XmlPullParser r5 = r9.f22140w     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r5 = r5.getAttributeName(r4)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r0.append(r5)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r5 = "=\""
            r0.append(r5)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            org.xmlpull.v1.XmlPullParser r5 = r9.f22140w     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r5 = r5.getAttributeValue(r4)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r5 = android.text.TextUtils.htmlEncode(r5)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r0.append(r5)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r5 = "\""
            r0.append(r5)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            int r4 = r4 + 1
            goto L_0x061b
        L_0x0646:
            java.util.HashSet<java.lang.String> r4 = r9.f22124g     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            org.xmlpull.v1.XmlPullParser r5 = r9.f22140w     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r5 = r5.getName()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            boolean r4 = r4.contains(r5)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x065a
            java.lang.String r4 = " />"
        L_0x0656:
            r0.append(r4)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x065d
        L_0x065a:
            java.lang.String r4 = ">"
            goto L_0x0656
        L_0x065d:
            java.lang.String r0 = r0.toString()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x0081
        L_0x0663:
            java.lang.String r4 = ""
            r9.f22135r = r4     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            com.seattleclouds.modules.rsspro.RssFeedsPullParser$FeedType r4 = r9.f22125h     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            com.seattleclouds.modules.rsspro.RssFeedsPullParser$FeedType r5 = com.seattleclouds.modules.rsspro.RssFeedsPullParser.FeedType.FeedTypeUnknown     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 != r5) goto L_0x06c0
            java.lang.String r4 = "rss"
            boolean r4 = r0.equalsIgnoreCase(r4)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x067a
            com.seattleclouds.modules.rsspro.RssFeedsPullParser$FeedType r0 = com.seattleclouds.modules.rsspro.RssFeedsPullParser.FeedType.FeedTypeRSS     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
        L_0x0677:
            r9.f22125h = r0     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x06c0
        L_0x067a:
            java.lang.String r4 = "rdf:RDF"
            boolean r4 = r0.equalsIgnoreCase(r4)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x0685
            com.seattleclouds.modules.rsspro.RssFeedsPullParser$FeedType r0 = com.seattleclouds.modules.rsspro.RssFeedsPullParser.FeedType.FeedTypeRSS1     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x0677
        L_0x0685:
            java.lang.String r4 = "feed"
            boolean r0 = r0.equalsIgnoreCase(r4)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            if (r0 == 0) goto L_0x0690
            com.seattleclouds.modules.rsspro.RssFeedsPullParser$FeedType r0 = com.seattleclouds.modules.rsspro.RssFeedsPullParser.FeedType.FeedTypeAtom     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x0677
        L_0x0690:
            r0 = 3
            java.lang.String r4 = "XML document is not a valid web feed document."
            r9.m30361a(r0, r4)     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x06c0
        L_0x0697:
            java.lang.String r0 = ""
            r9.f22134q = r0     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r0 = ""
            r9.f22135r = r0     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r0 = ""
            r9.f22132o = r0     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.lang.String r0 = "rss"
            r9.f22136s = r0     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r9.f22137t = r0     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            com.seattleclouds.modules.rsspro.RssFeedsPullParser$FeedType r0 = com.seattleclouds.modules.rsspro.RssFeedsPullParser.FeedType.FeedTypeUnknown     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r9.f22125h = r0     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            com.seattleclouds.modules.rsspro.a r0 = new com.seattleclouds.modules.rsspro.a     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r9.f22138u = r0     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            com.seattleclouds.modules.rsspro.b r0 = new com.seattleclouds.modules.rsspro.b     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            r9.f22139v = r0     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
        L_0x06c0:
            org.xmlpull.v1.XmlPullParser r0 = r9.f22140w     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            int r0 = r0.next()     // Catch:{ XmlPullParserException -> 0x06da, FileNotFoundException -> 0x06d1, IOException -> 0x06c8 }
            goto L_0x006e
        L_0x06c8:
            r0 = move-exception
            java.lang.String r2 = f22115A
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            goto L_0x06e2
        L_0x06d1:
            r0 = move-exception
            java.lang.String r2 = f22115A
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            goto L_0x06e2
        L_0x06da:
            r0 = move-exception
            java.lang.String r2 = f22115A
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L_0x06e2:
            java.lang.String r4 = "doFindLocationParsing: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r2, r3, r0)
        L_0x06f1:
            return r1
        L_0x06f2:
            r0 = move-exception
            java.lang.String r2 = f22115A
            java.lang.String r3 = "XMLPullParserFactory error initialization: "
            android.util.Log.e(r2, r3, r0)
        L_0x06fa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.rsspro.RssFeedsPullParser.mo19537a():boolean");
    }

    /* renamed from: b */
    public void mo19538b() {
        this.f22125h = FeedType.FeedTypeUnknown;
        this.f22134q = TableOfContents.DEFAULT_PATH_SEPARATOR;
        this.f22135r = new String();
        this.f22139v = null;
        this.f22138u = null;
        this.f22137t = null;
        this.f22133p = false;
        this.f22132o = null;
        this.f22130m = false;
    }

    /* renamed from: c */
    public void mo19539c() {
        if (this.f22116B != null) {
            this.f22116B.mo19567a();
        }
    }

    /* renamed from: d */
    public void mo19540d() {
        if (this.f22138u != null) {
            if (this.f22116B != null) {
                this.f22116B.mo19568a(this.f22138u);
            }
            this.f22138u = null;
        }
    }

    /* renamed from: e */
    public void mo19541e() {
        Date date;
        if (this.f22139v != null) {
            if (this.f22139v.mo19560f() != null && this.f22139v.mo19560f().equalsIgnoreCase("") && this.f22139v.mo19556d() != null && !this.f22139v.mo19556d().equalsIgnoreCase("")) {
                this.f22139v.mo19561f(this.f22139v.mo19556d());
            }
            if (this.f22139v.mo19558e() == null && this.f22139v.mo19564h() != null) {
                this.f22139v.mo19559e(this.f22139v.mo19564h());
            }
            if (this.f22139v.mo19558e() != null && this.f22139v.mo19558e().trim().length() > 0) {
                try {
                    date = this.f22143z.parse(this.f22139v.mo19558e());
                } catch (ParseException unused) {
                    date = null;
                }
                if (date != null) {
                    this.f22139v.mo19559e(this.f22142y.format(date));
                }
            }
            if (this.f22116B != null) {
                this.f22116B.mo19569a(this.f22139v);
            }
            this.f22139v = null;
        }
    }
}
