package android.support.p009v4.content.p015a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.p004a.C0039a.C0041b;
import android.support.p009v4.p017e.C0463a;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v4.content.a.a */
public class C0442a {

    /* renamed from: android.support.v4.content.a.a$a */
    public interface C0443a {
    }

    /* renamed from: android.support.v4.content.a.a$b */
    public static final class C0444b implements C0443a {

        /* renamed from: a */
        private final C0445c[] f1351a;

        public C0444b(C0445c[] cVarArr) {
            this.f1351a = cVarArr;
        }

        /* renamed from: a */
        public C0445c[] mo1805a() {
            return this.f1351a;
        }
    }

    /* renamed from: android.support.v4.content.a.a$c */
    public static final class C0445c {

        /* renamed from: a */
        private final String f1352a;

        /* renamed from: b */
        private int f1353b;

        /* renamed from: c */
        private boolean f1354c;

        /* renamed from: d */
        private int f1355d;

        public C0445c(String str, int i, boolean z, int i2) {
            this.f1352a = str;
            this.f1353b = i;
            this.f1354c = z;
            this.f1355d = i2;
        }

        /* renamed from: a */
        public String mo1806a() {
            return this.f1352a;
        }

        /* renamed from: b */
        public int mo1807b() {
            return this.f1353b;
        }

        /* renamed from: c */
        public boolean mo1808c() {
            return this.f1354c;
        }

        /* renamed from: d */
        public int mo1809d() {
            return this.f1355d;
        }
    }

    /* renamed from: android.support.v4.content.a.a$d */
    public static final class C0446d implements C0443a {

        /* renamed from: a */
        private final C0463a f1356a;

        /* renamed from: b */
        private final int f1357b;

        /* renamed from: c */
        private final int f1358c;

        public C0446d(C0463a aVar, int i, int i2) {
            this.f1356a = aVar;
            this.f1358c = i;
            this.f1357b = i2;
        }

        /* renamed from: a */
        public C0463a mo1810a() {
            return this.f1356a;
        }

        /* renamed from: b */
        public int mo1811b() {
            return this.f1358c;
        }

        /* renamed from: c */
        public int mo1812c() {
            return this.f1357b;
        }
    }

    /* renamed from: a */
    public static C0443a m2027a(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m2031b(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: a */
    public static List<List<byte[]>> m2028a(Resources resources, int i) {
        ArrayList arrayList = null;
        if (i != 0) {
            TypedArray obtainTypedArray = resources.obtainTypedArray(i);
            if (obtainTypedArray.length() > 0) {
                arrayList = new ArrayList();
                if (obtainTypedArray.getResourceId(0, 0) != 0) {
                    for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                        arrayList.add(m2029a(resources.getStringArray(obtainTypedArray.getResourceId(i2, 0))));
                    }
                } else {
                    arrayList.add(m2029a(resources.getStringArray(i)));
                }
            }
            obtainTypedArray.recycle();
        }
        return arrayList != null ? arrayList : Collections.emptyList();
    }

    /* renamed from: a */
    private static List<byte[]> m2029a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m2030a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            switch (xmlPullParser.next()) {
                case 2:
                    i++;
                    break;
                case 3:
                    i--;
                    break;
            }
        }
    }

    /* renamed from: b */
    private static C0443a m2031b(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m2032c(xmlPullParser, resources);
        }
        m2030a(xmlPullParser);
        return null;
    }

    /* renamed from: c */
    private static C0443a m2032c(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0041b.FontFamily);
        String string = obtainAttributes.getString(C0041b.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C0041b.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C0041b.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C0041b.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C0041b.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C0041b.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m2033d(xmlPullParser, resources));
                    } else {
                        m2030a(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C0444b((C0445c[]) arrayList.toArray(new C0445c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            m2030a(xmlPullParser);
        }
        return new C0446d(new C0463a(string, string2, string3, m2028a(resources, resourceId)), integer, integer2);
    }

    /* renamed from: d */
    private static C0445c m2033d(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0041b.FontFamilyFont);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(C0041b.FontFamilyFont_fontWeight) ? C0041b.FontFamilyFont_fontWeight : C0041b.FontFamilyFont_android_fontWeight, 400);
        boolean z = true;
        if (1 != obtainAttributes.getInt(obtainAttributes.hasValue(C0041b.FontFamilyFont_fontStyle) ? C0041b.FontFamilyFont_fontStyle : C0041b.FontFamilyFont_android_fontStyle, 0)) {
            z = false;
        }
        int i2 = obtainAttributes.hasValue(C0041b.FontFamilyFont_font) ? C0041b.FontFamilyFont_font : C0041b.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i2, 0);
        String string = obtainAttributes.getString(i2);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m2030a(xmlPullParser);
        }
        return new C0445c(string, i, z, resourceId);
    }
}
