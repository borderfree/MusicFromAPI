package android.support.p009v4.content.p015a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v4.content.a.c */
public class C0451c {
    /* renamed from: a */
    public static float m2050a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m2055a(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: a */
    public static int m2051a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m2055a(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: a */
    public static TypedArray m2052a(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: a */
    public static String m2053a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m2055a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: a */
    public static boolean m2054a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !m2055a(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    /* renamed from: a */
    public static boolean m2055a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: b */
    public static int m2056b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m2055a(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    /* renamed from: b */
    public static TypedValue m2057b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m2055a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }

    /* renamed from: c */
    public static int m2058c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m2055a(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }
}
