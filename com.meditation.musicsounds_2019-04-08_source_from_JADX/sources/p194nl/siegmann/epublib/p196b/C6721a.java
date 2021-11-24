package p194nl.siegmann.epublib.p196b;

import java.util.HashMap;
import java.util.Map;
import p194nl.siegmann.epublib.domain.MediaType;
import p194nl.siegmann.epublib.util.C6725c;

/* renamed from: nl.siegmann.epublib.b.a */
public class C6721a {

    /* renamed from: a */
    public static final MediaType f23590a = new MediaType("application/xhtml+xml", ".xhtml", new String[]{".htm", ".html", ".xhtml"});

    /* renamed from: b */
    public static final MediaType f23591b = new MediaType("application/epub+zip", ".epub");

    /* renamed from: c */
    public static final MediaType f23592c = new MediaType("image/jpeg", ".jpg", new String[]{".jpg", ".jpeg"});

    /* renamed from: d */
    public static final MediaType f23593d = new MediaType("image/png", ".png");

    /* renamed from: e */
    public static final MediaType f23594e = new MediaType("image/gif", ".gif");

    /* renamed from: f */
    public static final MediaType f23595f = new MediaType("text/css", ".css");

    /* renamed from: g */
    public static final MediaType f23596g = new MediaType("image/svg+xml", ".svg");

    /* renamed from: h */
    public static final MediaType f23597h = new MediaType("application/x-truetype-font", ".ttf");

    /* renamed from: i */
    public static final MediaType f23598i = new MediaType("application/x-dtbncx+xml", ".ncx");

    /* renamed from: j */
    public static final MediaType f23599j = new MediaType("application/adobe-page-template+xml", ".xpgt");

    /* renamed from: k */
    public static final MediaType f23600k = new MediaType("font/opentype", ".otf");

    /* renamed from: l */
    public static MediaType[] f23601l = {f23590a, f23591b, f23592c, f23593d, f23594e, f23595f, f23596g, f23597h, f23598i, f23599j, f23600k};

    /* renamed from: m */
    public static Map<String, MediaType> f23602m = new HashMap();

    static {
        for (int i = 0; i < f23601l.length; i++) {
            f23602m.put(f23601l[i].getName(), f23601l[i]);
        }
    }

    /* renamed from: a */
    public static MediaType m32389a(String str) {
        for (MediaType mediaType : f23601l) {
            for (String a : mediaType.getExtensions()) {
                if (C6725c.m32422a(str, a)) {
                    return mediaType;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m32390a(MediaType mediaType) {
        return mediaType == f23592c || mediaType == f23593d || mediaType == f23594e;
    }

    /* renamed from: b */
    public static MediaType m32391b(String str) {
        return (MediaType) f23602m.get(str);
    }
}
