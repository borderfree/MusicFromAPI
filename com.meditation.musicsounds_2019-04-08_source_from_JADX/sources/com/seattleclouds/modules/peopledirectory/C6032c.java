package com.seattleclouds.modules.peopledirectory;

import android.os.AsyncTask;
import com.seattleclouds.util.C6592al;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: com.seattleclouds.modules.peopledirectory.c */
public class C6032c extends AsyncTask<String, Void, ArrayList<ListItem>> {

    /* renamed from: a */
    private static final String f21431a = null;

    /* renamed from: b */
    private final WeakReference<C6035a> f21432b;

    /* renamed from: c */
    private int f21433c = -1;

    /* renamed from: com.seattleclouds.modules.peopledirectory.c$a */
    public interface C6035a {
        /* renamed from: a */
        void mo19040a(ArrayList<ListItem> arrayList);

        /* renamed from: e */
        void mo19042e(int i);
    }

    public C6032c(C6035a aVar) {
        this.f21432b = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    private C6035a m29565a() {
        return (C6035a) this.f21432b.get();
    }

    /* renamed from: a */
    private ArrayList<ListItem> m29567a(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        xmlPullParser.require(2, f21431a, "root");
        if (xmlPullParser.nextTag() == 2) {
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("person")) {
                        Person b = m29568b(xmlPullParser);
                        if (b != null) {
                            arrayList.add(b);
                        }
                    } else {
                        m29573e(xmlPullParser);
                    }
                }
            }
        }
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Person person = (Person) it.next();
            String b2 = m29569b(person);
            ArrayList arrayList2 = (ArrayList) hashMap.get(b2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                hashMap.put(b2, arrayList2);
            }
            arrayList2.add(person);
        }
        ArrayList arrayList3 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList3, new Comparator<String>() {
            /* renamed from: a */
            public int compare(String str, String str2) {
                if (str.equals("#") && str2.equals("#")) {
                    return 0;
                }
                if (str.equals("#")) {
                    return 1;
                }
                if (str2.equals("#")) {
                    return -1;
                }
                return str.compareToIgnoreCase(str2);
            }
        });
        ArrayList<ListItem> arrayList4 = new ArrayList<>();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            arrayList4.add(new ListItem(0, null, str));
            ArrayList arrayList5 = (ArrayList) hashMap.get(str);
            Collections.sort(arrayList5, new Comparator<Person>() {
                /* renamed from: a */
                public int compare(Person person, Person person2) {
                    return C6032c.m29570c(person).compareToIgnoreCase(C6032c.m29570c(person2));
                }
            });
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                arrayList4.add(new ListItem(1, (Person) it3.next(), str));
            }
        }
        return arrayList4;
    }

    /* renamed from: b */
    private Person m29568b(XmlPullParser xmlPullParser) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        xmlPullParser2.require(2, f21431a, "person");
        ArrayList arrayList = new ArrayList();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("info")) {
                    if (xmlPullParser.getAttributeCount() > 0) {
                        str = xmlPullParser2.getAttributeValue(f21431a, "name");
                        str2 = xmlPullParser2.getAttributeValue(f21431a, "secondName");
                        str3 = xmlPullParser2.getAttributeValue(f21431a, "title");
                        str4 = xmlPullParser2.getAttributeValue(f21431a, "phone");
                        str5 = xmlPullParser2.getAttributeValue(f21431a, "email");
                        str6 = xmlPullParser2.getAttributeValue(f21431a, "photoSrc");
                        String attributeValue = xmlPullParser2.getAttributeValue(f21431a, "tags");
                        if (!C6592al.m31910c(attributeValue)) {
                            for (String trim : attributeValue.split(",")) {
                                String trim2 = trim.trim();
                                if (trim2.length() > 0) {
                                    arrayList.add(trim2);
                                }
                            }
                        }
                    }
                    xmlPullParser.nextTag();
                } else if (name.equals("description")) {
                    str7 = m29571c(xmlPullParser);
                } else {
                    m29573e(xmlPullParser);
                }
            }
        }
        if (C6592al.m31910c(str) && C6592al.m31910c(str2) && C6592al.m31910c(str3)) {
            return null;
        }
        Person person = new Person(str, str2, str3);
        person.f21407d = str4;
        person.f21408e = str5;
        person.f21409f = str6;
        person.f21410g = str7;
        person.f21411h = arrayList;
        return person;
    }

    /* renamed from: b */
    private static String m29569b(Person person) {
        String str = !C6592al.m31910c(person.f21404a) ? person.f21404a : !C6592al.m31910c(person.f21405b) ? person.f21405b : person.f21406c;
        String upperCase = str.substring(0, 1).toUpperCase();
        return !Character.isLetter(upperCase.charAt(0)) ? "#" : upperCase;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static String m29570c(Person person) {
        return !C6592al.m31910c(person.f21404a) ? person.f21404a : !C6592al.m31910c(person.f21405b) ? person.f21405b : person.f21406c;
    }

    /* renamed from: c */
    private String m29571c(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, f21431a, "description");
        String d = m29572d(xmlPullParser);
        xmlPullParser.require(3, f21431a, "description");
        if (d != null) {
            return d.trim();
        }
        return null;
    }

    /* renamed from: d */
    private String m29572d(XmlPullParser xmlPullParser) {
        String str = "";
        if (xmlPullParser.next() != 4) {
            return str;
        }
        String text = xmlPullParser.getText();
        xmlPullParser.nextTag();
        return text;
    }

    /* renamed from: e */
    private void m29573e(XmlPullParser xmlPullParser) {
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

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = com.seattleclouds.C5451m.C5462k.people_directory_invalid_xml;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        r4.f21433c = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0 = com.seattleclouds.C5451m.C5462k.people_directory_invalid_xml;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:11:0x0028, B:16:0x0030] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0030 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<com.seattleclouds.modules.peopledirectory.ListItem> doInBackground(java.lang.String... r5) {
        /*
            r4 = this;
            r0 = 0
            r5 = r5[r0]
            java.io.InputStream r5 = com.seattleclouds.App.m25649e(r5)
            r1 = 0
            if (r5 != 0) goto L_0x000f
            int r5 = com.seattleclouds.C5451m.C5462k.people_directory_no_config_file
            r4.f21433c = r5
            return r1
        L_0x000f:
            org.xmlpull.v1.XmlPullParser r2 = android.util.Xml.newPullParser()     // Catch:{ XmlPullParserException -> 0x0030, IOException -> 0x0028 }
            java.lang.String r3 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r2.setFeature(r3, r0)     // Catch:{ XmlPullParserException -> 0x0030, IOException -> 0x0028 }
            r2.setInput(r5, r1)     // Catch:{ XmlPullParserException -> 0x0030, IOException -> 0x0028 }
            r2.nextTag()     // Catch:{ XmlPullParserException -> 0x0030, IOException -> 0x0028 }
            java.util.ArrayList r0 = r4.m29567a(r2)     // Catch:{ XmlPullParserException -> 0x0030, IOException -> 0x0028 }
            r5.close()     // Catch:{ IOException -> 0x0025 }
        L_0x0025:
            return r0
        L_0x0026:
            r0 = move-exception
            goto L_0x0034
        L_0x0028:
            int r0 = com.seattleclouds.C5451m.C5462k.people_directory_invalid_xml     // Catch:{ all -> 0x0026 }
        L_0x002a:
            r4.f21433c = r0     // Catch:{ all -> 0x0026 }
            r5.close()     // Catch:{ IOException -> 0x0033 }
            goto L_0x0033
        L_0x0030:
            int r0 = com.seattleclouds.C5451m.C5462k.people_directory_invalid_xml     // Catch:{ all -> 0x0026 }
            goto L_0x002a
        L_0x0033:
            return r1
        L_0x0034:
            r5.close()     // Catch:{ IOException -> 0x0037 }
        L_0x0037:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.peopledirectory.C6032c.doInBackground(java.lang.String[]):java.util.ArrayList");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(ArrayList<ListItem> arrayList) {
        super.onPostExecute(arrayList);
        C6035a a = m29565a();
        if (arrayList == null) {
            if (a != null) {
                a.mo19042e(this.f21433c);
            }
            return;
        }
        if (a != null) {
            a.mo19040a(arrayList);
        }
    }
}
