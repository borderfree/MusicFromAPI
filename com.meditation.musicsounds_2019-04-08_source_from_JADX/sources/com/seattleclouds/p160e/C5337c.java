package com.seattleclouds.p160e;

import android.graphics.Color;
import android.util.Log;
import com.seattleclouds.App;
import com.seattleclouds.util.C6592al;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.seattleclouds.e.c */
public class C5337c {

    /* renamed from: a */
    private static final String f19127a = "c";

    /* renamed from: b */
    private HashMap<String, C5333a> f19128b = new HashMap<>();

    /* renamed from: c */
    private String f19129c;

    /* renamed from: d */
    private String f19130d;

    /* renamed from: a */
    private C5333a m26777a(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "name");
        if (C6592al.m31910c(attributeValue)) {
            return null;
        }
        C5333a dVar = attributeValue.startsWith("Theme.") ? new C5338d(attributeValue) : new C5333a(attributeValue);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "parent");
        if (!C6592al.m31910c(attributeValue2)) {
            dVar.mo17535b(attributeValue2);
        }
        dVar.mo17533a((Map<String, C5333a>) this.f19128b);
        return dVar;
    }

    /* renamed from: b */
    private String m26778b(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "name");
        if (C6592al.m31910c(attributeValue)) {
            return null;
        }
        return attributeValue;
    }

    /* renamed from: c */
    private void m26779c(XmlPullParser xmlPullParser) {
        if (this.f19130d != null) {
            String text = xmlPullParser.getText();
            if (!C6592al.m31910c(text)) {
                C5333a aVar = (C5333a) this.f19128b.get(this.f19129c);
                if (text.startsWith("@style/")) {
                    aVar.mo17531a(this.f19130d, text.substring(7));
                } else if (text.startsWith("#")) {
                    try {
                        aVar.mo17530a(this.f19130d, Color.parseColor(text));
                    } catch (IllegalArgumentException unused) {
                        String str = f19127a;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid color: ");
                        sb.append(text);
                        sb.append(" in item: ");
                        sb.append(this.f19130d);
                        sb.append(" of style: ");
                        sb.append(this.f19129c);
                        Log.e(str, sb.toString());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public Map<String, C5333a> mo17542a() {
        InputStream e = App.m25649e("appStyles.xml");
        return e == null ? this.f19128b : mo17543a(e);
    }

    /* renamed from: a */
    public Map<String, C5333a> mo17543a(InputStream inputStream) {
        String str;
        StringBuilder sb;
        String str2;
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            newInstance.setNamespaceAware(true);
            XmlPullParser newPullParser = newInstance.newPullParser();
            newPullParser.setInput(new InputStreamReader(inputStream, "UTF-8"));
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                if (eventType != 0) {
                    switch (eventType) {
                        case 2:
                            String name = newPullParser.getName();
                            if (!name.equals("style")) {
                                if (this.f19129c != null && name.equals("item")) {
                                    this.f19130d = m26778b(newPullParser);
                                    break;
                                }
                            } else {
                                C5333a a = m26777a(newPullParser);
                                if (a == null) {
                                    break;
                                } else {
                                    this.f19129c = a.mo17528a();
                                    this.f19128b.put(a.mo17528a(), a);
                                    break;
                                }
                            }
                        case 3:
                            String name2 = newPullParser.getName();
                            if (!name2.equalsIgnoreCase("style")) {
                                if (!name2.equals("item")) {
                                    break;
                                } else {
                                    this.f19130d = null;
                                    break;
                                }
                            } else {
                                this.f19129c = null;
                                break;
                            }
                        case 4:
                            m26779c(newPullParser);
                            break;
                    }
                }
            }
        } catch (XmlPullParserException e) {
            str2 = f19127a;
            sb = new StringBuilder();
            sb.append("Error parsing styles config file: ");
            str = e.toString();
            r5 = e;
            sb.append(str);
            Log.e(str2, sb.toString(), r5);
            return this.f19128b;
        } catch (IOException e2) {
            str2 = f19127a;
            sb = new StringBuilder();
            sb.append("Error parsing styles config file: ");
            str = e2.toString();
            r5 = e2;
            sb.append(str);
            Log.e(str2, sb.toString(), r5);
            return this.f19128b;
        }
        return this.f19128b;
    }
}
