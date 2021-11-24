package p194nl.siegmann.epublib.p195a;

import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.slf4j.C6876b;
import org.slf4j.C6877c;
import org.w3c.dom.Element;
import p194nl.siegmann.epublib.domain.Book;
import p194nl.siegmann.epublib.domain.Resource;
import p194nl.siegmann.epublib.domain.Resources;
import p194nl.siegmann.epublib.p196b.C6721a;
import p194nl.siegmann.epublib.util.C6724b;
import p194nl.siegmann.epublib.util.C6725c;

/* renamed from: nl.siegmann.epublib.a.d */
public class C6716d {

    /* renamed from: a */
    private static final C6876b f23584a = C6877c.m32901a(C6716d.class);

    /* renamed from: b */
    private C6711a f23585b = C6711a.f23579a;

    /* renamed from: a */
    private String m32357a(Resources resources) {
        String str;
        String str2 = "OEBPS/content.opf";
        Resource remove = resources.remove("META-INF/container.xml");
        if (remove == null) {
            return str2;
        }
        try {
            str = ((Element) ((Element) C6724b.m32417b(remove).getDocumentElement().getElementsByTagName("rootfiles").item(0)).getElementsByTagName("rootfile").item(0)).getAttribute("full-path");
        } catch (Exception e) {
            f23584a.error(e.getMessage(), (Throwable) e);
            str = str2;
        }
        if (C6725c.m32425b(str)) {
            str = str2;
        }
        return str;
    }

    /* renamed from: a */
    private Book m32358a(Book book) {
        return this.f23585b != null ? this.f23585b.mo20871a(book) : book;
    }

    /* renamed from: a */
    private Resource m32359a(String str, Book book, Resources resources) {
        Resource remove = resources.remove(str);
        try {
            C6720h.m32386a(remove, this, book, resources);
        } catch (Exception e) {
            f23584a.error(e.getMessage(), (Throwable) e);
        }
        return remove;
    }

    /* renamed from: a */
    private Resource m32360a(Resource resource, Book book) {
        return C6717e.m32368a(book, this);
    }

    /* renamed from: a */
    private void m32361a(Book book, Resources resources) {
        resources.remove("mimetype");
    }

    /* renamed from: b */
    private Resources m32362b(ZipInputStream zipInputStream, String str) {
        Resources resources = new Resources();
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                return resources;
            }
            if (!nextEntry.isDirectory()) {
                Resource a = C6724b.m32414a(nextEntry, zipInputStream);
                if (a.getMediaType() == C6721a.f23590a) {
                    a.setInputEncoding(str);
                }
                resources.add(a);
            }
        }
    }

    /* renamed from: a */
    public Book mo20873a(InputStream inputStream) {
        return mo20874a(inputStream, "UTF-8");
    }

    /* renamed from: a */
    public Book mo20874a(InputStream inputStream, String str) {
        return mo20875a(new ZipInputStream(inputStream), str);
    }

    /* renamed from: a */
    public Book mo20875a(ZipInputStream zipInputStream, String str) {
        Book book = new Book();
        Resources b = m32362b(zipInputStream, str);
        m32361a(book, b);
        Resource a = m32359a(m32357a(b), book, b);
        book.setOpfResource(a);
        book.setNcxResource(m32360a(a, book));
        return m32358a(book);
    }
}
