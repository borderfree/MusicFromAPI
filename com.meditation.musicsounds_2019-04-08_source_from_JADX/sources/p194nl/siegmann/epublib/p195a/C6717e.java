package p194nl.siegmann.epublib.p195a;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.C6876b;
import org.slf4j.C6877c;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import p194nl.siegmann.epublib.domain.Book;
import p194nl.siegmann.epublib.domain.Resource;
import p194nl.siegmann.epublib.domain.TOCReference;
import p194nl.siegmann.epublib.domain.TableOfContents;
import p194nl.siegmann.epublib.util.C6724b;
import p194nl.siegmann.epublib.util.C6725c;

/* renamed from: nl.siegmann.epublib.a.e */
public class C6717e {

    /* renamed from: a */
    private static final C6876b f23586a = C6877c.m32901a(C6717e.class);

    /* renamed from: a */
    private static String m32366a(Element element) {
        String a = C6713b.m32352a(C6713b.m32354c(element, "http://www.daisy.org/z3986/2005/ncx/", "content"), "http://www.daisy.org/z3986/2005/ncx/", "src");
        try {
            return URLDecoder.decode(a, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            f23586a.error(e.getMessage());
            return a;
        }
    }

    /* renamed from: a */
    private static List<TOCReference> m32367a(NodeList nodeList, Book book) {
        if (nodeList == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(nodeList.getLength());
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node item = nodeList.item(i);
            if (item.getNodeType() == 1 && item.getLocalName().equals("navPoint")) {
                arrayList.add(m32369a((Element) item, book));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Resource m32368a(Book book, C6716d dVar) {
        Resource resource;
        if (book.getSpine().getTocResource() == null) {
            f23586a.error("Book does not contain a table of contents file");
            return null;
        }
        try {
            resource = book.getSpine().getTocResource();
            if (resource == null) {
                return resource;
            }
            try {
                book.setTableOfContents(new TableOfContents(m32367a(C6713b.m32354c(C6724b.m32417b(resource).getDocumentElement(), "http://www.daisy.org/z3986/2005/ncx/", "navMap").getChildNodes(), book)));
            } catch (Exception e) {
                e = e;
            }
            return resource;
        } catch (Exception e2) {
            e = e2;
            resource = null;
            f23586a.error(e.getMessage(), (Throwable) e);
            return resource;
        }
    }

    /* renamed from: a */
    private static TOCReference m32369a(Element element, Book book) {
        String b = m32370b(element);
        String a = m32366a(element);
        String a2 = C6725c.m32419a(a, '#');
        String d = C6725c.m32430d(a, '#');
        Resource byHref = book.getResources().getByHref(a2);
        if (byHref == null) {
            C6876b bVar = f23586a;
            StringBuilder sb = new StringBuilder();
            sb.append("Resource with href ");
            sb.append(a2);
            sb.append(" in NCX document not found");
            bVar.error(sb.toString());
        }
        TOCReference tOCReference = new TOCReference(b, byHref, d);
        m32367a(element.getChildNodes(), book);
        tOCReference.setChildren(m32367a(element.getChildNodes(), book));
        return tOCReference;
    }

    /* renamed from: b */
    private static String m32370b(Element element) {
        return C6713b.m32351a(C6713b.m32354c(C6713b.m32354c(element, "http://www.daisy.org/z3986/2005/ncx/", "navLabel"), "http://www.daisy.org/z3986/2005/ncx/", "text"));
    }
}
