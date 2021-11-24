package com.google.sczxing.client.result;

import com.google.sczxing.client.p140a.C4988f;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.sczxing.client.result.x */
public final class C5020x extends C5010n {

    /* renamed from: a */
    private static final Pattern f17911a = Pattern.compile("BEGIN:VCARD", 2);

    /* renamed from: b */
    private static final Pattern f17912b = Pattern.compile("\\d{4}-?\\d{2}-?\\d{2}");

    /* renamed from: c */
    private static final Pattern f17913c = Pattern.compile("\r\n[ \t]");

    /* renamed from: d */
    private static final Pattern f17914d = Pattern.compile("\\\\[nN]");

    /* renamed from: e */
    private static final Pattern f17915e = Pattern.compile("\\\\([,;\\\\])");

    /* renamed from: f */
    private static final Pattern f17916f = Pattern.compile("=");

    /* renamed from: g */
    private static final Pattern f17917g = Pattern.compile(";");

    /* renamed from: a */
    private static String m24883a(CharSequence charSequence, String str) {
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (!(charAt == 10 || charAt == 13)) {
                if (charAt != '=') {
                    m24886a(byteArrayOutputStream, str, sb);
                    sb.append(charAt);
                } else if (i < length - 2) {
                    char charAt2 = charSequence.charAt(i + 1);
                    if (!(charAt2 == 13 || charAt2 == 10)) {
                        i += 2;
                        char charAt3 = charSequence.charAt(i);
                        int a = m24849a(charAt2);
                        int a2 = m24849a(charAt3);
                        if (a >= 0 && a2 >= 0) {
                            byteArrayOutputStream.write((a << 4) + a2);
                        }
                    }
                }
            }
            i++;
        }
        m24886a(byteArrayOutputStream, str, sb);
        return sb.toString();
    }

    /* renamed from: a */
    private static String m24884a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    /* renamed from: a */
    static List<String> m24885a(CharSequence charSequence, String str, boolean z) {
        List b = m24891b(charSequence, str, z);
        if (b == null || b.isEmpty()) {
            return null;
        }
        return (List) b.get(0);
    }

    /* renamed from: a */
    private static void m24886a(ByteArrayOutputStream byteArrayOutputStream, String str, StringBuilder sb) {
        String str2;
        if (byteArrayOutputStream.size() > 0) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (str == null) {
                str2 = new String(byteArray);
            } else {
                try {
                    str2 = new String(byteArray, str);
                } catch (UnsupportedEncodingException unused) {
                    str2 = new String(byteArray);
                }
            }
            byteArrayOutputStream.reset();
            sb.append(str2);
        }
    }

    /* renamed from: a */
    private static void m24887a(Iterable<List<String>> iterable) {
        if (iterable != null) {
            for (List list : iterable) {
                String str = (String) list.get(0);
                String[] strArr = new String[5];
                int i = 0;
                int i2 = 0;
                while (true) {
                    int indexOf = str.indexOf(59, i);
                    if (indexOf <= 0) {
                        break;
                    }
                    strArr[i2] = str.substring(i, indexOf);
                    i2++;
                    i = indexOf + 1;
                }
                strArr[i2] = str.substring(i);
                StringBuilder sb = new StringBuilder(100);
                m24888a(strArr, 3, sb);
                m24888a(strArr, 1, sb);
                m24888a(strArr, 2, sb);
                m24888a(strArr, 0, sb);
                m24888a(strArr, 4, sb);
                list.set(0, sb.toString().trim());
            }
        }
    }

    /* renamed from: a */
    private static void m24888a(String[] strArr, int i, StringBuilder sb) {
        if (strArr[i] != null) {
            sb.append(' ');
            sb.append(strArr[i]);
        }
    }

    /* renamed from: a */
    private static boolean m24889a(CharSequence charSequence) {
        return charSequence == null || f17912b.matcher(charSequence).matches();
    }

    /* renamed from: a */
    private static String[] m24890a(Collection<List<String>> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (List list : collection) {
            arrayList.add(list.get(0));
        }
        return (String[]) arrayList.toArray(new String[collection.size()]);
    }

    /* renamed from: b */
    private static List<List<String>> m24891b(CharSequence charSequence, String str, boolean z) {
        String str2;
        boolean z2;
        ArrayList arrayList;
        int indexOf;
        String str3;
        String str4 = str;
        int length = str.length();
        int i = 0;
        ArrayList arrayList2 = null;
        while (i < length) {
            StringBuilder sb = new StringBuilder();
            sb.append("(?:^|\n)");
            sb.append(charSequence);
            sb.append("(?:;([^:]*))?:");
            int i2 = 2;
            Matcher matcher = Pattern.compile(sb.toString(), 2).matcher(str4);
            if (i > 0) {
                i--;
            }
            if (!matcher.find(i)) {
                break;
            }
            int end = matcher.end(0);
            String group = matcher.group(1);
            if (group != null) {
                String[] split = f17917g.split(group);
                int length2 = split.length;
                int i3 = 0;
                arrayList = null;
                z2 = false;
                str2 = null;
                while (i3 < length2) {
                    String str5 = split[i3];
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    arrayList.add(str5);
                    String[] split2 = f17916f.split(str5, i2);
                    if (split2.length > 1) {
                        String str6 = split2[0];
                        String str7 = split2[1];
                        if ("ENCODING".equalsIgnoreCase(str6) && "QUOTED-PRINTABLE".equalsIgnoreCase(str7)) {
                            z2 = true;
                        } else if ("CHARSET".equalsIgnoreCase(str6)) {
                            str2 = str7;
                        }
                    }
                    i3++;
                    i2 = 2;
                }
            } else {
                arrayList = null;
                z2 = false;
                str2 = null;
            }
            int i4 = end;
            while (true) {
                indexOf = str4.indexOf(10, i4);
                if (indexOf >= 0) {
                    if (indexOf < str.length() - 1) {
                        int i5 = indexOf + 1;
                        if (str4.charAt(i5) == ' ' || str4.charAt(i5) == 9) {
                            i4 = indexOf + 2;
                        }
                    }
                    if (!z2 || (str4.charAt(indexOf - 1) != '=' && str4.charAt(indexOf - 2) != '=')) {
                        break;
                    }
                    i4 = indexOf + 1;
                } else {
                    break;
                }
            }
            if (indexOf < 0) {
                i = length;
            } else {
                if (indexOf > end) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                    }
                    if (str4.charAt(indexOf - 1) == 13) {
                        indexOf--;
                    }
                    String substring = str4.substring(end, indexOf);
                    if (z) {
                        substring = substring.trim();
                    }
                    if (z2) {
                        str3 = m24883a(substring, str2);
                    } else {
                        str3 = f17915e.matcher(f17914d.matcher(f17913c.matcher(substring).replaceAll("")).replaceAll("\n")).replaceAll("$1");
                    }
                    if (arrayList == null) {
                        ArrayList arrayList3 = new ArrayList(1);
                        arrayList3.add(str3);
                        arrayList2.add(arrayList3);
                    } else {
                        arrayList.add(0, str3);
                        arrayList2.add(arrayList);
                    }
                }
                i = indexOf + 1;
            }
        }
        return arrayList2;
    }

    /* renamed from: b */
    private static String[] m24892b(Collection<List<String>> collection) {
        String str;
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (List list : collection) {
            int i = 1;
            while (true) {
                if (i >= list.size()) {
                    str = null;
                    break;
                }
                String str2 = (String) list.get(i);
                int indexOf = str2.indexOf(61);
                if (indexOf < 0) {
                    str = str2;
                    break;
                } else if ("TYPE".equalsIgnoreCase(str2.substring(0, indexOf))) {
                    str = str2.substring(indexOf + 1);
                    break;
                } else {
                    i++;
                }
            }
            arrayList.add(str);
        }
        return (String[]) arrayList.toArray(new String[collection.size()]);
    }

    /* renamed from: a */
    public C5000d mo16314b(C4988f fVar) {
        String a = fVar.mo16290a();
        Matcher matcher = f17911a.matcher(a);
        List list = null;
        if (!matcher.find() || matcher.start() != 0) {
            return null;
        }
        List b = m24891b("FN", a, true);
        if (b == null) {
            b = m24891b("N", a, true);
            m24887a((Iterable<List<String>>) b);
        }
        List b2 = m24891b("TEL", a, true);
        List b3 = m24891b("EMAIL", a, true);
        List a2 = m24885a((CharSequence) "NOTE", a, false);
        List<List> b4 = m24891b("ADR", a, true);
        if (b4 != null) {
            for (List list2 : b4) {
                list2.set(0, list2.get(0));
            }
        }
        List a3 = m24885a((CharSequence) "ORG", a, true);
        List a4 = m24885a((CharSequence) "BDAY", a, true);
        if (a4 == null || m24889a((CharSequence) a4.get(0))) {
            list = a4;
        }
        List a5 = m24885a((CharSequence) "TITLE", a, true);
        List a6 = m24885a((CharSequence) "URL", a, true);
        C5000d dVar = new C5000d(m24890a((Collection<List<String>>) b), null, m24890a((Collection<List<String>>) b2), m24892b((Collection<List<String>>) b2), m24890a((Collection<List<String>>) b3), m24892b((Collection<List<String>>) b3), m24884a(m24885a((CharSequence) "IMPP", a, true)), m24884a(a2), m24890a((Collection<List<String>>) b4), m24892b((Collection<List<String>>) b4), m24884a(a3), m24884a(list), m24884a(a5), m24884a(a6));
        return dVar;
    }
}
