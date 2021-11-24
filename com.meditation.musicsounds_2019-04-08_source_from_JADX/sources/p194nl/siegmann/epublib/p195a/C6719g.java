package p194nl.siegmann.epublib.p195a;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.C6876b;
import org.slf4j.C6877c;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import p194nl.siegmann.epublib.domain.Author;
import p194nl.siegmann.epublib.domain.Date;
import p194nl.siegmann.epublib.domain.Identifier;
import p194nl.siegmann.epublib.domain.Metadata;
import p194nl.siegmann.epublib.domain.Resource;
import p194nl.siegmann.epublib.domain.Resources;
import p194nl.siegmann.epublib.util.C6725c;

/* renamed from: nl.siegmann.epublib.a.g */
class C6719g extends C6718f {

    /* renamed from: a */
    private static final C6876b f23587a = C6877c.m32901a(C6719g.class);

    C6719g() {
    }

    /* renamed from: a */
    private static String m32371a(Document document) {
        Element c = C6713b.m32354c(document.getDocumentElement(), "http://www.idpf.org/2007/opf", "package");
        if (c == null) {
            return null;
        }
        return c.getAttributeNS("http://www.idpf.org/2007/opf", "unique-identifier");
    }

    /* renamed from: a */
    private static List<Author> m32372a(String str, Element element) {
        NodeList elementsByTagNameNS = element.getElementsByTagNameNS("http://purl.org/dc/elements/1.1/", str);
        ArrayList arrayList = new ArrayList(elementsByTagNameNS.getLength());
        for (int i = 0; i < elementsByTagNameNS.getLength(); i++) {
            Author d = m32378d((Element) elementsByTagNameNS.item(i));
            if (d != null) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static List<Author> m32373a(Element element) {
        return m32372a("creator", element);
    }

    /* renamed from: a */
    public static Metadata m32374a(Document document, Resources resources) {
        Metadata metadata = new Metadata();
        Element c = C6713b.m32354c(document.getDocumentElement(), "http://www.idpf.org/2007/opf", "metadata");
        if (c == null) {
            f23587a.error("Package does not contain element metadata");
            return metadata;
        }
        metadata.setTitles(C6713b.m32353b(c, "http://purl.org/dc/elements/1.1/", "title"));
        metadata.setPublishers(C6713b.m32353b(c, "http://purl.org/dc/elements/1.1/", "publisher"));
        metadata.setDescriptions(C6713b.m32353b(c, "http://purl.org/dc/elements/1.1/", "description"));
        metadata.setRights(C6713b.m32353b(c, "http://purl.org/dc/elements/1.1/", "rights"));
        metadata.setTypes(C6713b.m32353b(c, "http://purl.org/dc/elements/1.1/", "type"));
        metadata.setSubjects(C6713b.m32353b(c, "http://purl.org/dc/elements/1.1/", "subject"));
        metadata.setIdentifiers(m32379e(c));
        metadata.setAuthors(m32373a(c));
        metadata.setContributors(m32376b(c));
        metadata.setDates(m32377c(c));
        if (metadata.getCoverImage() == null) {
            metadata.setCoverImage(m32375a(c, resources));
        }
        return metadata;
    }

    /* renamed from: a */
    private static Resource m32375a(Element element, Resources resources) {
        String a = C6713b.m32350a(element.getOwnerDocument(), "http://www.idpf.org/2007/opf", "meta", "name", "cover", "content");
        if (C6725c.m32425b(a)) {
            return null;
        }
        return resources.getByIdOrHref(a);
    }

    /* renamed from: b */
    private static List<Author> m32376b(Element element) {
        return m32372a("contributor", element);
    }

    /* renamed from: c */
    private static List<Date> m32377c(Element element) {
        NodeList elementsByTagNameNS = element.getElementsByTagNameNS("http://purl.org/dc/elements/1.1/", "date");
        ArrayList arrayList = new ArrayList(elementsByTagNameNS.getLength());
        for (int i = 0; i < elementsByTagNameNS.getLength(); i++) {
            Element element2 = (Element) elementsByTagNameNS.item(i);
            try {
                arrayList.add(new Date(C6713b.m32351a(element2), element2.getAttributeNS("http://www.idpf.org/2007/opf", "event")));
            } catch (IllegalArgumentException e) {
                f23587a.error(e.getMessage());
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    private static Author m32378d(Element element) {
        String a = C6713b.m32351a(element);
        if (C6725c.m32425b(a)) {
            return null;
        }
        int lastIndexOf = a.lastIndexOf(32);
        Author author = lastIndexOf < 0 ? new Author(a) : new Author(a.substring(0, lastIndexOf), a.substring(lastIndexOf + 1));
        author.setRole(element.getAttributeNS("http://www.idpf.org/2007/opf", "role"));
        return author;
    }

    /* renamed from: e */
    private static List<Identifier> m32379e(Element element) {
        NodeList elementsByTagNameNS = element.getElementsByTagNameNS("http://purl.org/dc/elements/1.1/", "identifier");
        if (elementsByTagNameNS.getLength() == 0) {
            f23587a.error("Package does not contain element identifier");
            return new ArrayList();
        }
        String a = m32371a(element.getOwnerDocument());
        ArrayList arrayList = new ArrayList(elementsByTagNameNS.getLength());
        for (int i = 0; i < elementsByTagNameNS.getLength(); i++) {
            Element element2 = (Element) elementsByTagNameNS.item(i);
            String attributeNS = element2.getAttributeNS("http://www.idpf.org/2007/opf", "scheme");
            String a2 = C6713b.m32351a(element2);
            if (!C6725c.m32425b(a2)) {
                Identifier identifier = new Identifier(attributeNS, a2);
                if (element2.getAttribute("id").equals(a)) {
                    identifier.setBookId(true);
                }
                arrayList.add(identifier);
            }
        }
        return arrayList;
    }
}
