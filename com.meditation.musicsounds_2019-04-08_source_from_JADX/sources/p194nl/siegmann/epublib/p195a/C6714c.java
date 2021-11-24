package p194nl.siegmann.epublib.p195a;

import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.slf4j.C6876b;
import org.slf4j.C6877c;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;

/* renamed from: nl.siegmann.epublib.a.c */
public class C6714c {

    /* renamed from: a */
    protected static DocumentBuilderFactory f23580a;

    /* renamed from: b */
    public static EntityResolver f23581b = new EntityResolver() {

        /* renamed from: a */
        private String f23583a;

        public InputSource resolveEntity(String str, String str2) {
            String str3;
            if (str2.startsWith("http:")) {
                URL url = new URL(str2);
                StringBuilder sb = new StringBuilder();
                sb.append("dtd/");
                sb.append(url.getHost());
                sb.append(url.getPath());
                str3 = sb.toString();
                this.f23583a = str3.substring(0, str3.lastIndexOf(47));
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f23583a);
                sb2.append(str2.substring(str2.lastIndexOf(47)));
                str3 = sb2.toString();
            }
            if (getClass().getClassLoader().getResource(str3) != null) {
                return new InputSource(C6714c.class.getClassLoader().getResourceAsStream(str3));
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("remote resource is not cached : [");
            sb3.append(str2);
            sb3.append("] cannot continue");
            throw new RuntimeException(sb3.toString());
        }
    };

    /* renamed from: c */
    private static final C6876b f23582c = C6877c.m32901a(C6714c.class);

    static {
        m32356b();
    }

    /* renamed from: a */
    public static DocumentBuilder m32355a() {
        DocumentBuilder documentBuilder;
        ParserConfigurationException e;
        try {
            documentBuilder = f23580a.newDocumentBuilder();
            try {
                documentBuilder.setEntityResolver(f23581b);
            } catch (ParserConfigurationException e2) {
                e = e2;
            }
        } catch (ParserConfigurationException e3) {
            ParserConfigurationException parserConfigurationException = e3;
            documentBuilder = null;
            e = parserConfigurationException;
            f23582c.error(e.getMessage());
            return documentBuilder;
        }
        return documentBuilder;
    }

    /* renamed from: b */
    private static void m32356b() {
        f23580a = DocumentBuilderFactory.newInstance();
        f23580a.setNamespaceAware(true);
        f23580a.setValidating(false);
    }
}
