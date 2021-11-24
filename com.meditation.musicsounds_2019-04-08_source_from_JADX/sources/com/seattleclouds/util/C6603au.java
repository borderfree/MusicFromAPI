package com.seattleclouds.util;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: com.seattleclouds.util.au */
public class C6603au {
    /* renamed from: a */
    public static void m31952a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 3) {
                i--;
            } else if (next == 2) {
                i++;
            }
        }
    }
}
