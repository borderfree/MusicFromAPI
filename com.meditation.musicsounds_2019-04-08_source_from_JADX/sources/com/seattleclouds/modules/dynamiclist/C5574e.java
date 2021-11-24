package com.seattleclouds.modules.dynamiclist;

import android.app.Activity;
import android.util.Log;
import android.util.Xml;
import com.seattleclouds.App;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.seattleclouds.modules.dynamiclist.e */
public class C5574e {

    /* renamed from: a */
    private static final String f19861a = "e";

    /* renamed from: b */
    private static List<Map<String, String>> f19862b;

    /* renamed from: c */
    private static long f19863c;

    /* renamed from: com.seattleclouds.modules.dynamiclist.e$a */
    private static class C5576a {

        /* renamed from: a */
        private String f19864a;

        private C5576a() {
            this.f19864a = null;
        }

        /* renamed from: a */
        private String m27729a(XmlPullParser xmlPullParser, String str) {
            xmlPullParser.require(2, this.f19864a, str);
            String c = m27732c(xmlPullParser);
            xmlPullParser.require(3, this.f19864a, str);
            return c;
        }

        /* renamed from: a */
        private List<Map<String, String>> m27730a(XmlPullParser xmlPullParser) {
            ArrayList arrayList = new ArrayList();
            xmlPullParser.require(2, this.f19864a, "language_codes");
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("code")) {
                        arrayList.add(m27731b(xmlPullParser));
                    } else {
                        m27733d(xmlPullParser);
                    }
                }
            }
            return arrayList;
        }

        /* renamed from: b */
        private Map<String, String> m27731b(XmlPullParser xmlPullParser) {
            String str;
            String str2;
            xmlPullParser.require(2, this.f19864a, "code");
            HashMap hashMap = new HashMap();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    String name = xmlPullParser.getName();
                    if (name.equals("locale")) {
                        str = "locale";
                        str2 = "locale";
                    } else if (name.equals("language_code")) {
                        str = "language_code";
                        str2 = "language_code";
                    } else if (name.equals("lcid_string")) {
                        str = "lcid_string";
                        str2 = "lcid_string";
                    } else {
                        m27733d(xmlPullParser);
                    }
                    hashMap.put(str, m27729a(xmlPullParser, str2));
                }
            }
            return hashMap;
        }

        /* renamed from: c */
        private String m27732c(XmlPullParser xmlPullParser) {
            String str = "";
            if (xmlPullParser.next() != 4) {
                return str;
            }
            String text = xmlPullParser.getText();
            xmlPullParser.nextTag();
            return text;
        }

        /* renamed from: d */
        private void m27733d(XmlPullParser xmlPullParser) {
            if (xmlPullParser.getEventType() == 2) {
                int i = 1;
                while (i != 0) {
                    switch (xmlPullParser.next()) {
                        case 2:
                            i++;
                            break;
                        case 3:
                            i--;
                            break;
                    }
                }
                return;
            }
            throw new IllegalStateException();
        }

        /* renamed from: a */
        public List<Map<String, String>> mo18052a(InputStream inputStream) {
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                newPullParser.setInput(inputStream, null);
                newPullParser.nextTag();
                return m27730a(newPullParser);
            } finally {
                inputStream.close();
            }
        }
    }

    /* renamed from: a */
    public static String m27723a(Activity activity) {
        m27727b(activity);
        if (f19862b == null) {
            return "en-us";
        }
        Locale locale = Locale.getDefault();
        String country = locale.getCountry();
        String language = locale.getLanguage();
        String format = String.format("%1$s-%2$s", new Object[]{language, country});
        String str = f19861a;
        StringBuilder sb = new StringBuilder();
        sb.append("Code from device locale: ");
        sb.append(format);
        Log.d(str, sb.toString());
        return m27725a(format) ? format : m27726b(language);
    }

    /* renamed from: a */
    private static boolean m27724a() {
        if (f19862b == null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(App.m25654h());
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append("language_codes.xml");
        File file = new File(sb.toString());
        if (!file.exists() || f19863c == file.lastModified()) {
            return false;
        }
        f19863c = file.lastModified();
        return true;
    }

    /* renamed from: a */
    private static boolean m27725a(String str) {
        for (Map map : f19862b) {
            if (str.equalsIgnoreCase((String) map.get("lcid_string"))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static String m27726b(String str) {
        for (Map map : f19862b) {
            if (str.equalsIgnoreCase((String) map.get("language_code"))) {
                String str2 = f19861a;
                StringBuilder sb = new StringBuilder();
                sb.append("First valid code: ");
                sb.append((String) map.get("lcid"));
                Log.d(str2, sb.toString());
                return (String) map.get("language_code");
            }
        }
        return "en-us";
    }

    /* renamed from: b */
    private static void m27727b(Activity activity) {
        String str;
        StringBuilder sb;
        String str2;
        try {
            if (m27724a()) {
                f19862b = m27728c(activity);
            }
        } catch (IOException e) {
            str2 = f19861a;
            sb = new StringBuilder();
            sb.append("ERROR:");
            str = e.getLocalizedMessage();
            r3 = e;
            sb.append(str);
            Log.e(str2, sb.toString(), r3);
        } catch (XmlPullParserException e2) {
            str2 = f19861a;
            sb = new StringBuilder();
            sb.append("ERROR:");
            str = e2.getLocalizedMessage();
            r3 = e2;
            sb.append(str);
            Log.e(str2, sb.toString(), r3);
        }
    }

    /* renamed from: c */
    private static List<Map<String, String>> m27728c(Activity activity) {
        InputStream inputStream;
        C5576a aVar = new C5576a();
        if (App.m25667n("language_codes.xml")) {
            inputStream = App.m25649e("language_codes.xml");
        } else {
            inputStream = activity.getAssets().open("Modules/SCDynamicList/sharepoint/language_codes.xml");
        }
        return aVar.mo18052a(inputStream);
    }
}
