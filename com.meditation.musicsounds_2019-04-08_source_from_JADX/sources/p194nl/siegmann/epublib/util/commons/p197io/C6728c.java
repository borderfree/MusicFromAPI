package p194nl.siegmann.epublib.util.commons.p197io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.text.MessageFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: nl.siegmann.epublib.util.commons.io.c */
public class C6728c extends Reader {

    /* renamed from: a */
    public static final Pattern f23616a = Pattern.compile("<\\?xml.*encoding[\\s]*=[\\s]*((?:\".[^\"]*\")|(?:'.[^']*'))", 8);

    /* renamed from: b */
    private static final ByteOrderMark[] f23617b = {ByteOrderMark.UTF_8, ByteOrderMark.UTF_16BE, ByteOrderMark.UTF_16LE};

    /* renamed from: c */
    private static final ByteOrderMark[] f23618c = {new ByteOrderMark("UTF-8", 60, 63, 120, 109), new ByteOrderMark("UTF-16BE", 0, 60, 0, 63), new ByteOrderMark("UTF-16LE", 60, 0, 63, 0), new ByteOrderMark("CP1047", 76, 111, 167, 148)};

    /* renamed from: g */
    private static final Pattern f23619g = Pattern.compile("charset=[\"']?([.[^; \"']]*)[\"']?");

    /* renamed from: d */
    private final Reader f23620d;

    /* renamed from: e */
    private final String f23621e;

    /* renamed from: f */
    private final String f23622f;

    public C6728c(InputStream inputStream, String str) {
        this(inputStream, str, true);
    }

    public C6728c(InputStream inputStream, String str, boolean z) {
        this(inputStream, str, z, null);
    }

    public C6728c(InputStream inputStream, String str, boolean z, String str2) {
        this.f23622f = str2;
        C6726a aVar = new C6726a(new BufferedInputStream(inputStream, 4096), false, f23617b);
        C6726a aVar2 = new C6726a(aVar, true, f23618c);
        this.f23621e = m32442a(aVar, aVar2, str, z);
        this.f23620d = new InputStreamReader(aVar2, this.f23621e);
    }

    /* renamed from: a */
    private static String m32439a(InputStream inputStream, String str) {
        if (str == null) {
            return null;
        }
        byte[] bArr = new byte[4096];
        inputStream.mark(4096);
        int read = inputStream.read(bArr, 0, 4096);
        String str2 = null;
        int i = -1;
        int i2 = 0;
        int i3 = 4096;
        while (read != -1 && i == -1 && i2 < 4096) {
            i2 += read;
            i3 -= read;
            read = inputStream.read(bArr, i2, i3);
            str2 = new String(bArr, 0, i2, str);
            i = str2.indexOf(62);
        }
        if (i == -1) {
            if (read == -1) {
                throw new IOException("Unexpected end of XML stream");
            }
            StringBuilder sb = new StringBuilder();
            sb.append("XML prolog or ROOT element not found on first ");
            sb.append(i2);
            sb.append(" bytes");
            throw new IOException(sb.toString());
        } else if (i2 <= 0) {
            return null;
        } else {
            inputStream.reset();
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str2.substring(0, i + 1)));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            Matcher matcher = f23616a.matcher(stringBuffer);
            if (!matcher.find()) {
                return null;
            }
            String upperCase = matcher.group(1).toUpperCase();
            return upperCase.substring(1, upperCase.length() - 1);
        }
    }

    /* renamed from: a */
    static String m32440a(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(";");
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        return str.trim();
    }

    /* renamed from: a */
    private String m32441a(String str, XmlStreamReaderException xmlStreamReaderException) {
        if (str != null && str.startsWith("text/html")) {
            String substring = str.substring("text/html".length());
            StringBuilder sb = new StringBuilder();
            sb.append("text/xml");
            sb.append(substring);
            try {
                return mo21083a(sb.toString(), xmlStreamReaderException.getBomEncoding(), xmlStreamReaderException.getXmlGuessEncoding(), xmlStreamReaderException.getXmlEncoding(), true);
            } catch (XmlStreamReaderException e) {
                xmlStreamReaderException = e;
            }
        }
        String xmlEncoding = xmlStreamReaderException.getXmlEncoding();
        if (xmlEncoding == null) {
            xmlEncoding = xmlStreamReaderException.getContentTypeEncoding();
        }
        if (xmlEncoding == null) {
            xmlEncoding = this.f23622f == null ? "UTF-8" : this.f23622f;
        }
        return xmlEncoding;
    }

    /* renamed from: a */
    private String m32442a(C6726a aVar, C6726a aVar2, String str, boolean z) {
        String b = aVar.mo21069b();
        String b2 = aVar2.mo21069b();
        try {
            return mo21083a(str, b, b2, m32439a((InputStream) aVar2, b2), z);
        } catch (XmlStreamReaderException e) {
            if (z) {
                return m32441a(str, e);
            }
            throw e;
        }
    }

    /* renamed from: b */
    static String m32443b(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(";");
        if (indexOf <= -1) {
            return null;
        }
        Matcher matcher = f23619g.matcher(str.substring(indexOf + 1));
        String group = matcher.find() ? matcher.group(1) : null;
        if (group != null) {
            return group.toUpperCase();
        }
        return null;
    }

    /* renamed from: c */
    static boolean m32444c(String str) {
        return str != null && (str.equals("application/xml") || str.equals("application/xml-dtd") || str.equals("application/xml-external-parsed-entity") || (str.startsWith("application/") && str.endsWith("+xml")));
    }

    /* renamed from: d */
    static boolean m32445d(String str) {
        return str != null && (str.equals("text/xml") || str.equals("text/xml-external-parsed-entity") || (str.startsWith("text/") && str.endsWith("+xml")));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo21082a(String str, String str2, String str3) {
        if (str == null) {
            if (str2 != null && str3 != null) {
                return (!str3.equals("UTF-16") || (!str2.equals("UTF-16BE") && !str2.equals("UTF-16LE"))) ? str3 : str2;
            }
            return this.f23622f == null ? "UTF-8" : this.f23622f;
        } else if (str.equals("UTF-8")) {
            if (str2 != null && !str2.equals("UTF-8")) {
                throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", new Object[]{str, str2, str3}), str, str2, str3);
            } else if (str3 == null || str3.equals("UTF-8")) {
                return str;
            } else {
                throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", new Object[]{str, str2, str3}), str, str2, str3);
            }
        } else if (!str.equals("UTF-16BE") && !str.equals("UTF-16LE")) {
            throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] unknown BOM", new Object[]{str, str2, str3}), str, str2, str3);
        } else if (str2 != null && !str2.equals(str)) {
            throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", new Object[]{str, str2, str3}), str, str2, str3);
        } else if (str3 == null || str3.equals("UTF-16") || str3.equals(str)) {
            return str;
        } else {
            throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", new Object[]{str, str2, str3}), str, str2, str3);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo21083a(String str, String str2, String str3, String str4, boolean z) {
        if (z && str4 != null) {
            return str4;
        }
        String a = m32440a(str);
        String b = m32443b(str);
        boolean c = m32444c(a);
        boolean d = m32445d(a);
        if (!c && !d) {
            XmlStreamReaderException xmlStreamReaderException = new XmlStreamReaderException(MessageFormat.format("Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], Invalid MIME", new Object[]{a, b, str2, str3, str4}), a, b, str2, str3, str4);
            throw xmlStreamReaderException;
        } else if (b == null) {
            if (c) {
                return mo21082a(str2, str3, str4);
            }
            return this.f23622f == null ? "US-ASCII" : this.f23622f;
        } else if (b.equals("UTF-16BE") || b.equals("UTF-16LE")) {
            if (str2 == null) {
                return b;
            }
            XmlStreamReaderException xmlStreamReaderException2 = new XmlStreamReaderException(MessageFormat.format("Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be NULL", new Object[]{a, b, str2, str3, str4}), a, b, str2, str3, str4);
            throw xmlStreamReaderException2;
        } else if (!b.equals("UTF-16")) {
            return b;
        } else {
            if (str2 != null && str2.startsWith("UTF-16")) {
                return str2;
            }
            XmlStreamReaderException xmlStreamReaderException3 = new XmlStreamReaderException(MessageFormat.format("Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch", new Object[]{a, b, str2, str3, str4}), a, b, str2, str3, str4);
            throw xmlStreamReaderException3;
        }
    }

    public void close() {
        this.f23620d.close();
    }

    public int read(char[] cArr, int i, int i2) {
        return this.f23620d.read(cArr, i, i2);
    }
}
