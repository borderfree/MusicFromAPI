package com.google.android.exoplayer2.text.p112d;

import android.util.Log;
import com.google.android.exoplayer2.p102c.C2513t;
import com.google.android.exoplayer2.text.C2753b;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.google.android.exoplayer2.text.d.a */
public final class C2769a extends C2753b {

    /* renamed from: a */
    private static final Pattern f9550a = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: b */
    private static final Pattern f9551b = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: c */
    private static final Pattern f9552c = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: d */
    private static final Pattern f9553d = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: e */
    private static final C2770a f9554e = new C2770a(30.0f, 1, 1);

    /* renamed from: f */
    private final XmlPullParserFactory f9555f;

    /* renamed from: com.google.android.exoplayer2.text.d.a$a */
    private static final class C2770a {

        /* renamed from: a */
        final float f9556a;

        /* renamed from: b */
        final int f9557b;

        /* renamed from: c */
        final int f9558c;

        C2770a(float f, int i, int i2) {
            this.f9556a = f;
            this.f9557b = i;
            this.f9558c = i2;
        }
    }

    public C2769a() {
        super("TtmlDecoder");
        try {
            this.f9555f = XmlPullParserFactory.newInstance();
            this.f9555f.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c2, code lost:
        if (r14.equals("t") != false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0103, code lost:
        java.lang.Double.isNaN(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010c, code lost:
        r9 = r9 / r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0116, code lost:
        r9 = r9 * r14;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0118 A[PHI: r9 
      PHI: (r9v1 double) = (r9v0 double), (r9v3 double), (r9v4 double) binds: [B:44:0x00f8, B:52:0x0116, B:49:0x010c] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m13144a(java.lang.String r14, com.google.android.exoplayer2.text.p112d.C2769a.C2770a r15) {
        /*
            java.util.regex.Pattern r0 = f9550a
            java.util.regex.Matcher r0 = r0.matcher(r14)
            boolean r1 = r0.matches()
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L_0x008b
            java.lang.String r14 = r0.group(r8)
            long r8 = java.lang.Long.parseLong(r14)
            r10 = 3600(0xe10, double:1.7786E-320)
            long r8 = r8 * r10
            double r8 = (double) r8
            java.lang.String r14 = r0.group(r7)
            long r10 = java.lang.Long.parseLong(r14)
            r12 = 60
            long r10 = r10 * r12
            double r10 = (double) r10
            java.lang.Double.isNaN(r8)
            java.lang.Double.isNaN(r10)
            double r8 = r8 + r10
            java.lang.String r14 = r0.group(r6)
            long r6 = java.lang.Long.parseLong(r14)
            double r6 = (double) r6
            java.lang.Double.isNaN(r6)
            double r8 = r8 + r6
            java.lang.String r14 = r0.group(r5)
            r5 = 0
            if (r14 == 0) goto L_0x0051
            double r10 = java.lang.Double.parseDouble(r14)
            goto L_0x0052
        L_0x0051:
            r10 = r5
        L_0x0052:
            r14 = 0
            double r8 = r8 + r10
            java.lang.String r14 = r0.group(r4)
            if (r14 == 0) goto L_0x0064
            long r10 = java.lang.Long.parseLong(r14)
            float r14 = (float) r10
            float r1 = r15.f9556a
            float r14 = r14 / r1
            double r10 = (double) r14
            goto L_0x0065
        L_0x0064:
            r10 = r5
        L_0x0065:
            r14 = 0
            double r8 = r8 + r10
            r14 = 6
            java.lang.String r14 = r0.group(r14)
            if (r14 == 0) goto L_0x0085
            long r0 = java.lang.Long.parseLong(r14)
            double r0 = (double) r0
            int r14 = r15.f9557b
            double r4 = (double) r14
            java.lang.Double.isNaN(r0)
            java.lang.Double.isNaN(r4)
            double r0 = r0 / r4
            float r14 = r15.f9556a
            double r14 = (double) r14
            java.lang.Double.isNaN(r14)
            double r5 = r0 / r14
        L_0x0085:
            r14 = 0
            double r8 = r8 + r5
            double r8 = r8 * r2
            long r14 = (long) r8
            return r14
        L_0x008b:
            java.util.regex.Pattern r0 = f9551b
            java.util.regex.Matcher r0 = r0.matcher(r14)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L_0x011c
            java.lang.String r14 = r0.group(r8)
            double r9 = java.lang.Double.parseDouble(r14)
            java.lang.String r14 = r0.group(r7)
            r0 = -1
            int r1 = r14.hashCode()
            r11 = 102(0x66, float:1.43E-43)
            if (r1 == r11) goto L_0x00ed
            r5 = 104(0x68, float:1.46E-43)
            if (r1 == r5) goto L_0x00e3
            r5 = 109(0x6d, float:1.53E-43)
            if (r1 == r5) goto L_0x00d9
            r5 = 3494(0xda6, float:4.896E-42)
            if (r1 == r5) goto L_0x00cf
            switch(r1) {
                case 115: goto L_0x00c5;
                case 116: goto L_0x00bc;
                default: goto L_0x00bb;
            }
        L_0x00bb:
            goto L_0x00f7
        L_0x00bc:
            java.lang.String r1 = "t"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00f7
            goto L_0x00f8
        L_0x00c5:
            java.lang.String r1 = "s"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00f7
            r4 = 2
            goto L_0x00f8
        L_0x00cf:
            java.lang.String r1 = "ms"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00f7
            r4 = 3
            goto L_0x00f8
        L_0x00d9:
            java.lang.String r1 = "m"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00f7
            r4 = 1
            goto L_0x00f8
        L_0x00e3:
            java.lang.String r1 = "h"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00f7
            r4 = 0
            goto L_0x00f8
        L_0x00ed:
            java.lang.String r1 = "f"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00f7
            r4 = 4
            goto L_0x00f8
        L_0x00f7:
            r4 = -1
        L_0x00f8:
            switch(r4) {
                case 0: goto L_0x0111;
                case 1: goto L_0x010e;
                case 2: goto L_0x0118;
                case 3: goto L_0x0107;
                case 4: goto L_0x0100;
                case 5: goto L_0x00fc;
                default: goto L_0x00fb;
            }
        L_0x00fb:
            goto L_0x0118
        L_0x00fc:
            int r14 = r15.f9558c
            double r14 = (double) r14
            goto L_0x0103
        L_0x0100:
            float r14 = r15.f9556a
            double r14 = (double) r14
        L_0x0103:
            java.lang.Double.isNaN(r14)
            goto L_0x010c
        L_0x0107:
            r14 = 4652007308841189376(0x408f400000000000, double:1000.0)
        L_0x010c:
            double r9 = r9 / r14
            goto L_0x0118
        L_0x010e:
            r14 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L_0x0116
        L_0x0111:
            r14 = 4660134898793709568(0x40ac200000000000, double:3600.0)
        L_0x0116:
            double r9 = r9 * r14
        L_0x0118:
            double r9 = r9 * r2
            long r14 = (long) r9
            return r14
        L_0x011c:
            com.google.android.exoplayer2.text.SubtitleDecoderException r15 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Malformed time expression: "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r15.<init>(r14)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.p112d.C2769a.m13144a(java.lang.String, com.google.android.exoplayer2.text.d.a$a):long");
    }

    /* renamed from: a */
    private C2770a m13145a(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split(" ");
            if (split.length == 2) {
                f = ((float) Integer.parseInt(split[0])) / ((float) Integer.parseInt(split[1]));
            } else {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
        }
        int i = f9554e.f9557b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i = Integer.parseInt(attributeValue3);
        }
        int i2 = f9554e.f9558c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i2 = Integer.parseInt(attributeValue4);
        }
        return new C2770a(((float) parseInt) * f, i, i2);
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.android.exoplayer2.text.p112d.C2771b m13146a(org.xmlpull.v1.XmlPullParser r20, com.google.android.exoplayer2.text.p112d.C2771b r21, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.p112d.C2772c> r22, com.google.android.exoplayer2.text.p112d.C2769a.C2770a r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r23
            java.lang.String r4 = ""
            int r5 = r20.getAttributeCount()
            r6 = 0
            com.google.android.exoplayer2.text.d.e r12 = r0.m13148a(r1, r6)
            r17 = r6
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r4
            r4 = 0
        L_0x0026:
            if (r4 >= r5) goto L_0x00a1
            java.lang.String r7 = r1.getAttributeName(r4)
            java.lang.String r8 = r1.getAttributeValue(r4)
            int r18 = r7.hashCode()
            switch(r18) {
                case -934795532: goto L_0x0060;
                case 99841: goto L_0x0056;
                case 100571: goto L_0x004c;
                case 93616297: goto L_0x0042;
                case 109780401: goto L_0x0038;
                default: goto L_0x0037;
            }
        L_0x0037:
            goto L_0x006a
        L_0x0038:
            java.lang.String r9 = "style"
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L_0x006a
            r7 = 3
            goto L_0x006b
        L_0x0042:
            java.lang.String r9 = "begin"
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L_0x006a
            r7 = 0
            goto L_0x006b
        L_0x004c:
            java.lang.String r9 = "end"
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L_0x006a
            r7 = 1
            goto L_0x006b
        L_0x0056:
            java.lang.String r9 = "dur"
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L_0x006a
            r7 = 2
            goto L_0x006b
        L_0x0060:
            java.lang.String r9 = "region"
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L_0x006a
            r7 = 4
            goto L_0x006b
        L_0x006a:
            r7 = -1
        L_0x006b:
            switch(r7) {
                case 0: goto L_0x0097;
                case 1: goto L_0x008f;
                case 2: goto L_0x0087;
                case 3: goto L_0x007b;
                case 4: goto L_0x0071;
                default: goto L_0x006e;
            }
        L_0x006e:
            r7 = r22
            goto L_0x009e
        L_0x0071:
            r7 = r22
            boolean r9 = r7.containsKey(r8)
            if (r9 == 0) goto L_0x009e
            r6 = r8
            goto L_0x009e
        L_0x007b:
            r7 = r22
            java.lang.String[] r8 = r0.m13151a(r8)
            int r9 = r8.length
            if (r9 <= 0) goto L_0x009e
            r17 = r8
            goto L_0x009e
        L_0x0087:
            r7 = r22
            long r8 = m13144a(r8, r3)
            r15 = r8
            goto L_0x009e
        L_0x008f:
            r7 = r22
            long r8 = m13144a(r8, r3)
            r13 = r8
            goto L_0x009e
        L_0x0097:
            r7 = r22
            long r8 = m13144a(r8, r3)
            r10 = r8
        L_0x009e:
            int r4 = r4 + 1
            goto L_0x0026
        L_0x00a1:
            if (r2 == 0) goto L_0x00bd
            long r3 = r2.f9562d
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x00c2
            int r3 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x00b5
            long r3 = r2.f9562d
            long r10 = r10 + r3
        L_0x00b5:
            int r3 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x00c2
            long r3 = r2.f9562d
            long r13 = r13 + r3
            goto L_0x00c2
        L_0x00bd:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00c2:
            int r3 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x00d8
            int r3 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x00cd
            long r15 = r15 + r10
            r13 = r15
            goto L_0x00d8
        L_0x00cd:
            if (r2 == 0) goto L_0x00d8
            long r3 = r2.f9563e
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x00d8
            long r2 = r2.f9563e
            r13 = r2
        L_0x00d8:
            java.lang.String r7 = r20.getName()
            r8 = r10
            r10 = r13
            r13 = r17
            r14 = r6
            com.google.android.exoplayer2.text.d.b r1 = com.google.android.exoplayer2.text.p112d.C2771b.m13159a(r7, r8, r10, r12, r13, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.p112d.C2769a.m13146a(org.xmlpull.v1.XmlPullParser, com.google.android.exoplayer2.text.d.b, java.util.Map, com.google.android.exoplayer2.text.d.a$a):com.google.android.exoplayer2.text.d.b");
    }

    /* renamed from: a */
    private C2774e m13147a(C2774e eVar) {
        return eVar == null ? new C2774e() : eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b6, code lost:
        if (r3.equals("underline") != false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x012b, code lost:
        if (r3.equals("center") != false) goto L_0x012f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01d8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.android.exoplayer2.text.p112d.C2774e m13148a(org.xmlpull.v1.XmlPullParser r12, com.google.android.exoplayer2.text.p112d.C2774e r13) {
        /*
            r11 = this;
            int r0 = r12.getAttributeCount()
            r1 = 0
            r2 = r13
            r13 = 0
        L_0x0007:
            if (r13 >= r0) goto L_0x01dc
            java.lang.String r3 = r12.getAttributeValue(r13)
            java.lang.String r4 = r12.getAttributeName(r13)
            int r5 = r4.hashCode()
            r6 = 4
            r7 = 2
            r8 = 3
            r9 = -1
            r10 = 1
            switch(r5) {
                case -1550943582: goto L_0x006f;
                case -1224696685: goto L_0x0065;
                case -1065511464: goto L_0x005b;
                case -879295043: goto L_0x0050;
                case -734428249: goto L_0x0046;
                case 3355: goto L_0x003c;
                case 94842723: goto L_0x0032;
                case 365601008: goto L_0x0028;
                case 1287124693: goto L_0x001e;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0079
        L_0x001e:
            java.lang.String r5 = "backgroundColor"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0079
            r4 = 1
            goto L_0x007a
        L_0x0028:
            java.lang.String r5 = "fontSize"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0079
            r4 = 4
            goto L_0x007a
        L_0x0032:
            java.lang.String r5 = "color"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0079
            r4 = 2
            goto L_0x007a
        L_0x003c:
            java.lang.String r5 = "id"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0079
            r4 = 0
            goto L_0x007a
        L_0x0046:
            java.lang.String r5 = "fontWeight"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0079
            r4 = 5
            goto L_0x007a
        L_0x0050:
            java.lang.String r5 = "textDecoration"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0079
            r4 = 8
            goto L_0x007a
        L_0x005b:
            java.lang.String r5 = "textAlign"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0079
            r4 = 7
            goto L_0x007a
        L_0x0065:
            java.lang.String r5 = "fontFamily"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0079
            r4 = 3
            goto L_0x007a
        L_0x006f:
            java.lang.String r5 = "fontStyle"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0079
            r4 = 6
            goto L_0x007a
        L_0x0079:
            r4 = -1
        L_0x007a:
            switch(r4) {
                case 0: goto L_0x01c4;
                case 1: goto L_0x01ae;
                case 2: goto L_0x0198;
                case 3: goto L_0x018f;
                case 4: goto L_0x016e;
                case 5: goto L_0x015e;
                case 6: goto L_0x014e;
                case 7: goto L_0x00f1;
                case 8: goto L_0x007f;
                default: goto L_0x007d;
            }
        L_0x007d:
            goto L_0x01d8
        L_0x007f:
            java.lang.String r3 = com.google.android.exoplayer2.p102c.C2511s.m11818d(r3)
            int r4 = r3.hashCode()
            r5 = -1461280213(0xffffffffa8e6a22b, float:-2.5605459E-14)
            if (r4 == r5) goto L_0x00b9
            r5 = -1026963764(0xffffffffc2c9c6cc, float:-100.888275)
            if (r4 == r5) goto L_0x00b0
            r5 = 913457136(0x36723ff0, float:3.6098027E-6)
            if (r4 == r5) goto L_0x00a6
            r5 = 1679736913(0x641ec051, float:1.1713774E22)
            if (r4 == r5) goto L_0x009c
            goto L_0x00c3
        L_0x009c:
            java.lang.String r4 = "linethrough"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00c3
            r7 = 0
            goto L_0x00c4
        L_0x00a6:
            java.lang.String r4 = "nolinethrough"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00c3
            r7 = 1
            goto L_0x00c4
        L_0x00b0:
            java.lang.String r4 = "underline"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00c3
            goto L_0x00c4
        L_0x00b9:
            java.lang.String r4 = "nounderline"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00c3
            r7 = 3
            goto L_0x00c4
        L_0x00c3:
            r7 = -1
        L_0x00c4:
            switch(r7) {
                case 0: goto L_0x00e7;
                case 1: goto L_0x00dd;
                case 2: goto L_0x00d3;
                case 3: goto L_0x00c9;
                default: goto L_0x00c7;
            }
        L_0x00c7:
            goto L_0x01d8
        L_0x00c9:
            com.google.android.exoplayer2.text.d.e r2 = r11.m13147a(r2)
            com.google.android.exoplayer2.text.d.e r2 = r2.mo9455b(r1)
            goto L_0x01d8
        L_0x00d3:
            com.google.android.exoplayer2.text.d.e r2 = r11.m13147a(r2)
            com.google.android.exoplayer2.text.d.e r2 = r2.mo9455b(r10)
            goto L_0x01d8
        L_0x00dd:
            com.google.android.exoplayer2.text.d.e r2 = r11.m13147a(r2)
            com.google.android.exoplayer2.text.d.e r2 = r2.mo9452a(r1)
            goto L_0x01d8
        L_0x00e7:
            com.google.android.exoplayer2.text.d.e r2 = r11.m13147a(r2)
            com.google.android.exoplayer2.text.d.e r2 = r2.mo9452a(r10)
            goto L_0x01d8
        L_0x00f1:
            java.lang.String r3 = com.google.android.exoplayer2.p102c.C2511s.m11818d(r3)
            int r4 = r3.hashCode()
            switch(r4) {
                case -1364013995: goto L_0x0125;
                case 100571: goto L_0x011b;
                case 3317767: goto L_0x0111;
                case 108511772: goto L_0x0107;
                case 109757538: goto L_0x00fd;
                default: goto L_0x00fc;
            }
        L_0x00fc:
            goto L_0x012e
        L_0x00fd:
            java.lang.String r4 = "start"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x012e
            r6 = 1
            goto L_0x012f
        L_0x0107:
            java.lang.String r4 = "right"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x012e
            r6 = 2
            goto L_0x012f
        L_0x0111:
            java.lang.String r4 = "left"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x012e
            r6 = 0
            goto L_0x012f
        L_0x011b:
            java.lang.String r4 = "end"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x012e
            r6 = 3
            goto L_0x012f
        L_0x0125:
            java.lang.String r4 = "center"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x012e
            goto L_0x012f
        L_0x012e:
            r6 = -1
        L_0x012f:
            switch(r6) {
                case 0: goto L_0x0142;
                case 1: goto L_0x0142;
                case 2: goto L_0x013b;
                case 3: goto L_0x013b;
                case 4: goto L_0x0134;
                default: goto L_0x0132;
            }
        L_0x0132:
            goto L_0x01d8
        L_0x0134:
            com.google.android.exoplayer2.text.d.e r2 = r11.m13147a(r2)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x0148
        L_0x013b:
            com.google.android.exoplayer2.text.d.e r2 = r11.m13147a(r2)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x0148
        L_0x0142:
            com.google.android.exoplayer2.text.d.e r2 = r11.m13147a(r2)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
        L_0x0148:
            com.google.android.exoplayer2.text.d.e r2 = r2.mo9449a(r3)
            goto L_0x01d8
        L_0x014e:
            com.google.android.exoplayer2.text.d.e r2 = r11.m13147a(r2)
            java.lang.String r4 = "italic"
            boolean r3 = r4.equalsIgnoreCase(r3)
            com.google.android.exoplayer2.text.d.e r2 = r2.mo9460d(r3)
            goto L_0x01d8
        L_0x015e:
            com.google.android.exoplayer2.text.d.e r2 = r11.m13147a(r2)
            java.lang.String r4 = "bold"
            boolean r3 = r4.equalsIgnoreCase(r3)
            com.google.android.exoplayer2.text.d.e r2 = r2.mo9458c(r3)
            goto L_0x01d8
        L_0x016e:
            com.google.android.exoplayer2.text.d.e r4 = r11.m13147a(r2)     // Catch:{ SubtitleDecoderException -> 0x0178 }
            m13150a(r3, r4)     // Catch:{ SubtitleDecoderException -> 0x0177 }
            r2 = r4
            goto L_0x01d8
        L_0x0177:
            r2 = r4
        L_0x0178:
            java.lang.String r4 = "TtmlDecoder"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed parsing fontSize value: "
        L_0x0181:
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            android.util.Log.w(r4, r3)
            goto L_0x01d8
        L_0x018f:
            com.google.android.exoplayer2.text.d.e r2 = r11.m13147a(r2)
            com.google.android.exoplayer2.text.d.e r2 = r2.mo9451a(r3)
            goto L_0x01d8
        L_0x0198:
            com.google.android.exoplayer2.text.d.e r2 = r11.m13147a(r2)
            int r4 = com.google.android.exoplayer2.p102c.C2490c.m11677a(r3)     // Catch:{ IllegalArgumentException -> 0x01a4 }
            r2.mo9448a(r4)     // Catch:{ IllegalArgumentException -> 0x01a4 }
            goto L_0x01d8
        L_0x01a4:
            java.lang.String r4 = "TtmlDecoder"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed parsing color value: "
            goto L_0x0181
        L_0x01ae:
            com.google.android.exoplayer2.text.d.e r2 = r11.m13147a(r2)
            int r4 = com.google.android.exoplayer2.p102c.C2490c.m11677a(r3)     // Catch:{ IllegalArgumentException -> 0x01ba }
            r2.mo9453b(r4)     // Catch:{ IllegalArgumentException -> 0x01ba }
            goto L_0x01d8
        L_0x01ba:
            java.lang.String r4 = "TtmlDecoder"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed parsing background value: "
            goto L_0x0181
        L_0x01c4:
            java.lang.String r4 = "style"
            java.lang.String r5 = r12.getName()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x01d8
            com.google.android.exoplayer2.text.d.e r2 = r11.m13147a(r2)
            com.google.android.exoplayer2.text.d.e r2 = r2.mo9454b(r3)
        L_0x01d8:
            int r13 = r13 + 1
            goto L_0x0007
        L_0x01dc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.p112d.C2769a.m13148a(org.xmlpull.v1.XmlPullParser, com.google.android.exoplayer2.text.d.e):com.google.android.exoplayer2.text.d.e");
    }

    /* renamed from: a */
    private Map<String, C2774e> m13149a(XmlPullParser xmlPullParser, Map<String, C2774e> map, Map<String, C2772c> map2) {
        do {
            xmlPullParser.next();
            if (C2513t.m11824b(xmlPullParser, "style")) {
                String c = C2513t.m11825c(xmlPullParser, "style");
                C2774e a = m13148a(xmlPullParser, new C2774e());
                if (c != null) {
                    for (String str : m13151a(c)) {
                        a.mo9450a((C2774e) map.get(str));
                    }
                }
                if (a.mo9466i() != null) {
                    map.put(a.mo9466i(), a);
                }
            } else if (C2513t.m11824b(xmlPullParser, "region")) {
                C2772c b = m13152b(xmlPullParser);
                if (b != null) {
                    map2.put(b.f9570a, b);
                }
            }
        } while (!C2513t.m11822a(xmlPullParser, "head"));
        return map;
    }

    /* renamed from: a */
    private static void m13150a(String str, C2774e eVar) {
        Matcher matcher;
        String[] split = str.split("\\s+");
        if (split.length == 1) {
            matcher = f9552c.matcher(str);
        } else if (split.length == 2) {
            matcher = f9552c.matcher(split[1]);
            Log.w("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid number of entries for fontSize: ");
            sb.append(split.length);
            sb.append(".");
            throw new SubtitleDecoderException(sb.toString());
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            char c = 65535;
            int hashCode = group.hashCode();
            if (hashCode != 37) {
                if (hashCode != 3240) {
                    if (hashCode == 3592 && group.equals("px")) {
                        c = 0;
                    }
                } else if (group.equals("em")) {
                    c = 1;
                }
            } else if (group.equals("%")) {
                c = 2;
            }
            switch (c) {
                case 0:
                    eVar.mo9457c(1);
                    break;
                case 1:
                    eVar.mo9457c(2);
                    break;
                case 2:
                    eVar.mo9457c(3);
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid unit for fontSize: '");
                    sb2.append(group);
                    sb2.append("'.");
                    throw new SubtitleDecoderException(sb2.toString());
            }
            eVar.mo9447a(Float.valueOf(matcher.group(1)).floatValue());
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Invalid expression for fontSize: '");
        sb3.append(str);
        sb3.append("'.");
        throw new SubtitleDecoderException(sb3.toString());
    }

    /* renamed from: a */
    private String[] m13151a(String str) {
        return str.split("\\s+");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a4  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.android.exoplayer2.text.p112d.C2772c m13152b(org.xmlpull.v1.XmlPullParser r13) {
        /*
            r12 = this;
            java.lang.String r0 = "id"
            java.lang.String r2 = com.google.android.exoplayer2.p102c.C2513t.m11825c(r13, r0)
            r0 = 0
            if (r2 != 0) goto L_0x000a
            return r0
        L_0x000a:
            java.lang.String r1 = "origin"
            java.lang.String r1 = com.google.android.exoplayer2.p102c.C2513t.m11825c(r13, r1)
            r3 = 0
            r4 = 2
            r5 = 1120403456(0x42c80000, float:100.0)
            r6 = 1
            if (r1 == 0) goto L_0x005a
            java.util.regex.Pattern r3 = f9553d
            java.util.regex.Matcher r3 = r3.matcher(r1)
            boolean r7 = r3.matches()
            if (r7 == 0) goto L_0x0050
            java.lang.String r7 = r3.group(r6)     // Catch:{ NumberFormatException -> 0x0039 }
            float r7 = java.lang.Float.parseFloat(r7)     // Catch:{ NumberFormatException -> 0x0039 }
            float r7 = r7 / r5
            java.lang.String r3 = r3.group(r4)     // Catch:{ NumberFormatException -> 0x0039 }
            float r3 = java.lang.Float.parseFloat(r3)     // Catch:{ NumberFormatException -> 0x0039 }
            float r3 = r3 / r5
            r11 = r7
            r7 = r3
            r3 = r11
            goto L_0x005b
        L_0x0039:
            java.lang.String r13 = "TtmlDecoder"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Ignoring region with malformed origin: "
        L_0x0042:
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.util.Log.w(r13, r1)
            return r0
        L_0x0050:
            java.lang.String r13 = "TtmlDecoder"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Ignoring region with unsupported origin: "
            goto L_0x0042
        L_0x005a:
            r7 = 0
        L_0x005b:
            java.lang.String r8 = "extent"
            java.lang.String r8 = com.google.android.exoplayer2.p102c.C2513t.m11825c(r13, r8)
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x0099
            java.util.regex.Pattern r9 = f9553d
            java.util.regex.Matcher r8 = r9.matcher(r8)
            boolean r9 = r8.matches()
            if (r9 == 0) goto L_0x008f
            java.lang.String r9 = r8.group(r6)     // Catch:{ NumberFormatException -> 0x0085 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0085 }
            float r9 = r9 / r5
            java.lang.String r8 = r8.group(r4)     // Catch:{ NumberFormatException -> 0x0085 }
            float r8 = java.lang.Float.parseFloat(r8)     // Catch:{ NumberFormatException -> 0x0085 }
            float r0 = r8 / r5
            goto L_0x009b
        L_0x0085:
            java.lang.String r13 = "TtmlDecoder"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Ignoring region with malformed extent: "
            goto L_0x0042
        L_0x008f:
            java.lang.String r13 = "TtmlDecoder"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Ignoring region with unsupported extent: "
            goto L_0x0042
        L_0x0099:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x009b:
            java.lang.String r1 = "displayAlign"
            java.lang.String r13 = com.google.android.exoplayer2.p102c.C2513t.m11825c(r13, r1)
            r1 = 0
            if (r13 == 0) goto L_0x00d9
            java.lang.String r13 = r13.toLowerCase()
            r5 = -1
            int r8 = r13.hashCode()
            r10 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            if (r8 == r10) goto L_0x00c2
            r10 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r8 == r10) goto L_0x00b8
            goto L_0x00cb
        L_0x00b8:
            java.lang.String r8 = "after"
            boolean r13 = r13.equals(r8)
            if (r13 == 0) goto L_0x00cb
            r5 = 1
            goto L_0x00cb
        L_0x00c2:
            java.lang.String r8 = "center"
            boolean r13 = r13.equals(r8)
            if (r13 == 0) goto L_0x00cb
            r5 = 0
        L_0x00cb:
            switch(r5) {
                case 0: goto L_0x00d3;
                case 1: goto L_0x00cf;
                default: goto L_0x00ce;
            }
        L_0x00ce:
            goto L_0x00d9
        L_0x00cf:
            float r7 = r7 + r0
            r4 = r7
            r6 = 2
            goto L_0x00db
        L_0x00d3:
            r13 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r13
            float r7 = r7 + r0
            r4 = r7
            goto L_0x00db
        L_0x00d9:
            r4 = r7
            r6 = 0
        L_0x00db:
            com.google.android.exoplayer2.text.d.c r13 = new com.google.android.exoplayer2.text.d.c
            r5 = 0
            r1 = r13
            r7 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.p112d.C2769a.m13152b(org.xmlpull.v1.XmlPullParser):com.google.android.exoplayer2.text.d.c");
    }

    /* renamed from: b */
    private static boolean m13153b(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("smpte:image") || str.equals("smpte:data") || str.equals("smpte:information");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C2775f mo9429a(byte[] bArr, int i, boolean z) {
        try {
            XmlPullParser newPullParser = this.f9555f.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            C2775f fVar = null;
            hashMap2.put("", new C2772c(null));
            int i2 = 0;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            LinkedList linkedList = new LinkedList();
            C2770a aVar = f9554e;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                C2771b bVar = (C2771b) linkedList.peekLast();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            aVar = m13145a(newPullParser);
                        }
                        if (!m13153b(name)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Ignoring unsupported tag: ");
                            sb.append(newPullParser.getName());
                            Log.i("TtmlDecoder", sb.toString());
                        } else if ("head".equals(name)) {
                            m13149a(newPullParser, (Map<String, C2774e>) hashMap, (Map<String, C2772c>) hashMap2);
                        } else {
                            try {
                                C2771b a = m13146a(newPullParser, bVar, hashMap2, aVar);
                                linkedList.addLast(a);
                                if (bVar != null) {
                                    bVar.mo9443a(a);
                                }
                            } catch (SubtitleDecoderException e) {
                                Log.w("TtmlDecoder", "Suppressing parser error", e);
                            }
                        }
                    } else if (eventType == 4) {
                        bVar.mo9443a(C2771b.m13158a(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            fVar = new C2775f((C2771b) linkedList.getLast(), hashMap, hashMap2);
                        }
                        linkedList.removeLast();
                    }
                    newPullParser.next();
                } else if (eventType != 2) {
                    if (eventType == 3) {
                        i2--;
                    }
                    newPullParser.next();
                }
                i2++;
                newPullParser.next();
            }
            return fVar;
        } catch (XmlPullParserException e2) {
            throw new SubtitleDecoderException("Unable to decode source", e2);
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        }
    }
}
