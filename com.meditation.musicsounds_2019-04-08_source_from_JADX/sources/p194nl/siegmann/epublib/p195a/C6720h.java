package p194nl.siegmann.epublib.p195a;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.slf4j.C6876b;
import org.slf4j.C6877c;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import p194nl.siegmann.epublib.domain.Book;
import p194nl.siegmann.epublib.domain.Guide;
import p194nl.siegmann.epublib.domain.GuideReference;
import p194nl.siegmann.epublib.domain.MediaType;
import p194nl.siegmann.epublib.domain.Resource;
import p194nl.siegmann.epublib.domain.Resources;
import p194nl.siegmann.epublib.domain.Spine;
import p194nl.siegmann.epublib.domain.SpineReference;
import p194nl.siegmann.epublib.p196b.C6721a;
import p194nl.siegmann.epublib.util.C6724b;
import p194nl.siegmann.epublib.util.C6725c;

/* renamed from: nl.siegmann.epublib.a.h */
public class C6720h extends C6718f {

    /* renamed from: a */
    private static final C6876b f23588a = C6877c.m32901a(C6720h.class);

    /* renamed from: b */
    private static final String[] f23589b = {"toc", "ncx"};

    /* renamed from: a */
    static Set<String> m32380a(Document document) {
        HashSet hashSet = new HashSet();
        String a = C6713b.m32350a(document, "http://www.idpf.org/2007/opf", "meta", "name", "cover", "content");
        if (C6725c.m32421a(a)) {
            String a2 = C6713b.m32350a(document, "http://www.idpf.org/2007/opf", "item", "id", a, "href");
            if (C6725c.m32421a(a2)) {
                hashSet.add(a2);
            } else {
                hashSet.add(a);
            }
        }
        String a3 = C6713b.m32350a(document, "http://www.idpf.org/2007/opf", "reference", "type", "cover", "href");
        if (C6725c.m32421a(a3)) {
            hashSet.add(a3);
        }
        return hashSet;
    }

    /* renamed from: a */
    private static Resource m32381a(Element element, Resources resources) {
        String a = C6713b.m32352a(element, "http://www.idpf.org/2007/opf", "toc");
        Resource byIdOrHref = C6725c.m32421a(a) ? resources.getByIdOrHref(a) : null;
        if (byIdOrHref != null) {
            return byIdOrHref;
        }
        for (int i = 0; i < f23589b.length; i++) {
            Resource byIdOrHref2 = resources.getByIdOrHref(f23589b[i]);
            if (byIdOrHref2 != null) {
                return byIdOrHref2;
            }
            Resource byIdOrHref3 = resources.getByIdOrHref(f23589b[i].toUpperCase());
            if (byIdOrHref3 != null) {
                return byIdOrHref3;
            }
        }
        Resource findFirstResourceByMediaType = resources.findFirstResourceByMediaType(C6721a.f23598i);
        if (findFirstResourceByMediaType == null) {
            C6876b bVar = f23588a;
            StringBuilder sb = new StringBuilder();
            sb.append("Could not find table of contents resource. Tried resource with id '");
            sb.append(a);
            sb.append("', ");
            sb.append("toc");
            sb.append(", ");
            sb.append("toc".toUpperCase());
            sb.append(" and any NCX resource.");
            bVar.error(sb.toString());
        }
        return findFirstResourceByMediaType;
    }

    /* renamed from: a */
    private static Resources m32382a(String str, Resources resources) {
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf < 0) {
            return resources;
        }
        Resources resources2 = new Resources();
        for (Resource resource : resources.getAll()) {
            if (C6725c.m32421a(resource.getHref()) || resource.getHref().length() > lastIndexOf) {
                resource.setHref(resource.getHref().substring(lastIndexOf + 1));
            }
            resources2.add(resource);
        }
        return resources2;
    }

    /* renamed from: a */
    private static Resources m32383a(Document document, String str, C6716d dVar, Resources resources, Map<String, String> map) {
        Element c = C6713b.m32354c(document.getDocumentElement(), "http://www.idpf.org/2007/opf", "manifest");
        Resources resources2 = new Resources();
        if (c == null) {
            f23588a.error("Package document does not contain element manifest");
            return resources2;
        }
        NodeList elementsByTagNameNS = c.getElementsByTagNameNS("http://www.idpf.org/2007/opf", "item");
        for (int i = 0; i < elementsByTagNameNS.getLength(); i++) {
            Element element = (Element) elementsByTagNameNS.item(i);
            String a = C6713b.m32352a(element, "http://www.idpf.org/2007/opf", "id");
            String a2 = C6713b.m32352a(element, "http://www.idpf.org/2007/opf", "href");
            try {
                a2 = URLDecoder.decode(a2, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                f23588a.error(e.getMessage());
            }
            String a3 = C6713b.m32352a(element, "http://www.idpf.org/2007/opf", "media-type");
            Resource remove = resources.remove(a2);
            if (remove == null) {
                C6876b bVar = f23588a;
                StringBuilder sb = new StringBuilder();
                sb.append("resource with href '");
                sb.append(a2);
                sb.append("' not found");
                bVar.error(sb.toString());
            } else {
                remove.setId(a);
                MediaType b = C6721a.m32391b(a3);
                if (b != null) {
                    remove.setMediaType(b);
                }
                resources2.add(remove);
                map.put(a, remove.getId());
            }
        }
        return resources2;
    }

    /* renamed from: a */
    private static Spine m32384a(Resources resources) {
        Spine spine = new Spine();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(resources.getAllHrefs());
        Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
        for (String byHref : arrayList) {
            Resource byHref2 = resources.getByHref(byHref);
            if (byHref2.getMediaType() == C6721a.f23598i) {
                spine.setTocResource(byHref2);
            } else if (byHref2.getMediaType() == C6721a.f23590a) {
                spine.addSpineReference(new SpineReference(byHref2));
            }
        }
        return spine;
    }

    /* renamed from: a */
    private static Spine m32385a(Document document, C6716d dVar, Resources resources, Map<String, String> map) {
        C6876b bVar;
        String sb;
        Element c = C6713b.m32354c(document.getDocumentElement(), "http://www.idpf.org/2007/opf", "spine");
        if (c == null) {
            f23588a.error("Element spine not found in package document, generating one automatically");
            return m32384a(resources);
        }
        Spine spine = new Spine();
        spine.setTocResource(m32381a(c, resources));
        NodeList elementsByTagNameNS = document.getElementsByTagNameNS("http://www.idpf.org/2007/opf", "itemref");
        ArrayList arrayList = new ArrayList(elementsByTagNameNS.getLength());
        for (int i = 0; i < elementsByTagNameNS.getLength(); i++) {
            Element element = (Element) elementsByTagNameNS.item(i);
            String a = C6713b.m32352a(element, "http://www.idpf.org/2007/opf", "idref");
            if (C6725c.m32425b(a)) {
                bVar = f23588a;
                sb = "itemref with missing or empty idref";
            } else {
                String str = (String) map.get(a);
                if (str != null) {
                    a = str;
                }
                Resource byIdOrHref = resources.getByIdOrHref(a);
                if (byIdOrHref == null) {
                    bVar = f23588a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("resource with id '");
                    sb2.append(a);
                    sb2.append("' not found");
                    sb = sb2.toString();
                } else {
                    SpineReference spineReference = new SpineReference(byIdOrHref);
                    if ("no".equalsIgnoreCase(C6713b.m32352a(element, "http://www.idpf.org/2007/opf", "linear"))) {
                        spineReference.setLinear(false);
                    }
                    arrayList.add(spineReference);
                }
            }
            bVar.error(sb);
        }
        spine.setSpineReferences(arrayList);
        return spine;
    }

    /* renamed from: a */
    public static void m32386a(Resource resource, C6716d dVar, Book book, Resources resources) {
        Document b = C6724b.m32417b(resource);
        String href = resource.getHref();
        Resources a = m32382a(href, resources);
        m32387a(b, dVar, book, a);
        HashMap hashMap = new HashMap();
        book.setResources(m32383a(b, href, dVar, a, hashMap));
        m32388a(b, book);
        book.setMetadata(C6719g.m32374a(b, book.getResources()));
        book.setSpine(m32385a(b, dVar, book.getResources(), (Map<String, String>) hashMap));
        if (book.getCoverPage() == null && book.getSpine().size() > 0) {
            book.setCoverPage(book.getSpine().getResource(0));
        }
    }

    /* renamed from: a */
    private static void m32387a(Document document, C6716d dVar, Book book, Resources resources) {
        C6876b bVar;
        StringBuilder sb;
        String str;
        Element c = C6713b.m32354c(document.getDocumentElement(), "http://www.idpf.org/2007/opf", "guide");
        if (c != null) {
            Guide guide = book.getGuide();
            NodeList elementsByTagNameNS = c.getElementsByTagNameNS("http://www.idpf.org/2007/opf", "reference");
            for (int i = 0; i < elementsByTagNameNS.getLength(); i++) {
                Element element = (Element) elementsByTagNameNS.item(i);
                String a = C6713b.m32352a(element, "http://www.idpf.org/2007/opf", "href");
                if (!C6725c.m32425b(a)) {
                    Resource byHref = resources.getByHref(C6725c.m32419a(a, '#'));
                    if (byHref == null) {
                        bVar = f23588a;
                        sb = new StringBuilder();
                        sb.append("Guide is referencing resource with href ");
                        sb.append(a);
                        str = " which could not be found";
                    } else {
                        String a2 = C6713b.m32352a(element, "http://www.idpf.org/2007/opf", "type");
                        if (C6725c.m32425b(a2)) {
                            bVar = f23588a;
                            sb = new StringBuilder();
                            sb.append("Guide is referencing resource with href ");
                            sb.append(a);
                            str = " which is missing the 'type' attribute";
                        } else {
                            String a3 = C6713b.m32352a(element, "http://www.idpf.org/2007/opf", "title");
                            if (!GuideReference.COVER.equalsIgnoreCase(a2)) {
                                guide.addReference(new GuideReference(byHref, a2, a3, C6725c.m32430d(a, '#')));
                            }
                        }
                    }
                    sb.append(str);
                    bVar.error(sb.toString());
                }
            }
        }
    }

    /* renamed from: a */
    private static void m32388a(Document document, Book book) {
        for (String str : m32380a(document)) {
            Resource byHref = book.getResources().getByHref(str);
            if (byHref == null) {
                C6876b bVar = f23588a;
                StringBuilder sb = new StringBuilder();
                sb.append("Cover resource ");
                sb.append(str);
                sb.append(" not found");
                bVar.error(sb.toString());
            } else if (byHref.getMediaType() == C6721a.f23590a) {
                book.setCoverPage(byHref);
            } else if (C6721a.m32390a(byHref.getMediaType())) {
                book.setCoverImage(byHref);
            }
        }
    }
}
