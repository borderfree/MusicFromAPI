package p194nl.siegmann.epublib.p195a;

import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import p194nl.siegmann.epublib.util.C6725c;

/* renamed from: nl.siegmann.epublib.a.b */
class C6713b {
    /* renamed from: a */
    public static String m32350a(Document document, String str, String str2, String str3, String str4, String str5) {
        NodeList elementsByTagNameNS = document.getElementsByTagNameNS(str, str2);
        for (int i = 0; i < elementsByTagNameNS.getLength(); i++) {
            Element element = (Element) elementsByTagNameNS.item(i);
            if (str4.equalsIgnoreCase(element.getAttribute(str3)) && C6725c.m32421a(element.getAttribute(str5))) {
                return element.getAttribute(str5);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m32351a(Element element) {
        if (element == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        NodeList childNodes = element.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item != null && item.getNodeType() == 3) {
                sb.append(((Text) item).getData());
            }
        }
        return sb.toString().trim();
    }

    /* renamed from: a */
    public static String m32352a(Element element, String str, String str2) {
        String attributeNS = element.getAttributeNS(str, str2);
        return C6725c.m32427c(attributeNS) ? element.getAttribute(str2) : attributeNS;
    }

    /* renamed from: b */
    public static List<String> m32353b(Element element, String str, String str2) {
        NodeList elementsByTagNameNS = element.getElementsByTagNameNS(str, str2);
        ArrayList arrayList = new ArrayList(elementsByTagNameNS.getLength());
        for (int i = 0; i < elementsByTagNameNS.getLength(); i++) {
            arrayList.add(m32351a((Element) elementsByTagNameNS.item(i)));
        }
        return arrayList;
    }

    /* renamed from: c */
    public static Element m32354c(Element element, String str, String str2) {
        NodeList elementsByTagNameNS = element.getElementsByTagNameNS(str, str2);
        if (elementsByTagNameNS.getLength() == 0) {
            return null;
        }
        return (Element) elementsByTagNameNS.item(0);
    }
}
