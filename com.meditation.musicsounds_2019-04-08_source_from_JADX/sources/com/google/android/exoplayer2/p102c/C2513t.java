package com.google.android.exoplayer2.p102c;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: com.google.android.exoplayer2.c.t */
public final class C2513t {
    /* renamed from: a */
    public static boolean m11821a(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    /* renamed from: a */
    public static boolean m11822a(XmlPullParser xmlPullParser, String str) {
        return m11821a(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: b */
    public static boolean m11823b(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    /* renamed from: b */
    public static boolean m11824b(XmlPullParser xmlPullParser, String str) {
        return m11823b(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: c */
    public static String m11825c(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (str.equals(xmlPullParser.getAttributeName(i))) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }
}
