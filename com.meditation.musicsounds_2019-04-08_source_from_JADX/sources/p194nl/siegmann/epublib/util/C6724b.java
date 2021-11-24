package p194nl.siegmann.epublib.util;

import java.io.InputStream;
import java.io.Reader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import p194nl.siegmann.epublib.domain.Resource;
import p194nl.siegmann.epublib.p195a.C6714c;

/* renamed from: nl.siegmann.epublib.util.b */
public class C6724b {
    /* renamed from: a */
    public static Resource m32414a(ZipEntry zipEntry, ZipInputStream zipInputStream) {
        return new Resource((InputStream) zipInputStream, zipEntry.getName());
    }

    /* renamed from: a */
    public static Document m32415a(Resource resource, DocumentBuilder documentBuilder) {
        InputSource a = m32416a(resource);
        if (a == null) {
            return null;
        }
        return documentBuilder.parse(a);
    }

    /* renamed from: a */
    public static InputSource m32416a(Resource resource) {
        if (resource == null) {
            return null;
        }
        Reader reader = resource.getReader();
        if (reader == null) {
            return null;
        }
        return new InputSource(reader);
    }

    /* renamed from: b */
    public static Document m32417b(Resource resource) {
        return m32415a(resource, C6714c.m32355a());
    }
}
