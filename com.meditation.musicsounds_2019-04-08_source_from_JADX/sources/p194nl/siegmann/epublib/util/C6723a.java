package p194nl.siegmann.epublib.util;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: nl.siegmann.epublib.util.a */
public class C6723a {
    /* renamed from: a */
    protected static int m32409a(int i, int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 > Integer.MAX_VALUE - i) {
            return -1;
        }
        return i2 + i;
    }

    /* renamed from: a */
    public static int m32410a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        int i = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
                i = m32409a(read, i);
            } else {
                outputStream.flush();
                return i;
            }
        }
    }

    /* renamed from: a */
    public static int m32411a(Reader reader, Writer writer) {
        char[] cArr = new char[4096];
        int i = 0;
        while (true) {
            int read = reader.read(cArr);
            if (read >= 0) {
                writer.write(cArr, 0, read);
                i = m32409a(read, i);
            } else {
                writer.flush();
                return i;
            }
        }
    }

    /* renamed from: a */
    public static byte[] m32412a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m32410a(inputStream, (OutputStream) byteArrayOutputStream);
        byteArrayOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public static byte[] m32413a(Reader reader, String str) {
        StringWriter stringWriter = new StringWriter();
        m32411a(reader, (Writer) stringWriter);
        stringWriter.flush();
        return stringWriter.toString().getBytes(str);
    }
}
