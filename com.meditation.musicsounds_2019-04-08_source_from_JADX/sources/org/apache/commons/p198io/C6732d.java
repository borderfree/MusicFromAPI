package org.apache.commons.p198io;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import org.apache.commons.p198io.output.StringBuilderWriter;

/* renamed from: org.apache.commons.io.d */
public class C6732d {

    /* renamed from: a */
    public static final char f23642a = File.separatorChar;

    /* renamed from: b */
    public static final String f23643b;

    static {
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter(4);
        PrintWriter printWriter = new PrintWriter(stringBuilderWriter);
        printWriter.println();
        f23643b = stringBuilderWriter.toString();
        printWriter.close();
    }

    /* renamed from: a */
    public static int m32479a(InputStream inputStream, OutputStream outputStream) {
        long b = m32489b(inputStream, outputStream);
        if (b > 2147483647L) {
            return -1;
        }
        return (int) b;
    }

    /* renamed from: a */
    public static int m32480a(Reader reader, Writer writer) {
        long b = m32490b(reader, writer);
        if (b > 2147483647L) {
            return -1;
        }
        return (int) b;
    }

    /* renamed from: a */
    public static long m32481a(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    /* renamed from: a */
    public static long m32482a(Reader reader, Writer writer, char[] cArr) {
        long j = 0;
        while (true) {
            int read = reader.read(cArr);
            if (-1 == read) {
                return j;
            }
            writer.write(cArr, 0, read);
            j += (long) read;
        }
    }

    /* renamed from: a */
    public static String m32483a(InputStream inputStream, Charset charset) {
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter();
        m32486a(inputStream, (Writer) stringBuilderWriter, charset);
        return stringBuilderWriter.toString();
    }

    /* renamed from: a */
    public static void m32484a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m32485a(InputStream inputStream) {
        m32484a((Closeable) inputStream);
    }

    /* renamed from: a */
    public static void m32486a(InputStream inputStream, Writer writer, Charset charset) {
        m32480a((Reader) new InputStreamReader(inputStream, C6729a.m32449a(charset)), writer);
    }

    /* renamed from: a */
    public static void m32487a(OutputStream outputStream) {
        m32484a((Closeable) outputStream);
    }

    /* renamed from: a */
    public static void m32488a(String str, OutputStream outputStream, Charset charset) {
        if (str != null) {
            outputStream.write(str.getBytes(C6729a.m32449a(charset)));
        }
    }

    /* renamed from: b */
    public static long m32489b(InputStream inputStream, OutputStream outputStream) {
        return m32481a(inputStream, outputStream, new byte[4096]);
    }

    /* renamed from: b */
    public static long m32490b(Reader reader, Writer writer) {
        return m32482a(reader, writer, new char[4096]);
    }

    /* renamed from: b */
    public static String m32491b(InputStream inputStream) {
        return m32483a(inputStream, Charset.defaultCharset());
    }
}
