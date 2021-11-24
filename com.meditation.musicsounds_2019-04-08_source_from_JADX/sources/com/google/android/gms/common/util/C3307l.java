package com.google.android.gms.common.util;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.common.util.l */
public final class C3307l {
    /* renamed from: a */
    private static long m15064a(InputStream inputStream, OutputStream outputStream, boolean z) {
        return m15065a(inputStream, outputStream, z, 1024);
    }

    /* renamed from: a */
    public static long m15065a(InputStream inputStream, OutputStream outputStream, boolean z, int i) {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read == -1) {
                    break;
                }
                j += (long) read;
                outputStream.write(bArr, 0, read);
            } finally {
                if (z) {
                    m15066a(inputStream);
                    m15066a(outputStream);
                }
            }
        }
        return j;
    }

    /* renamed from: a */
    public static void m15066a(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static byte[] m15067a(InputStream inputStream, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m15064a(inputStream, byteArrayOutputStream, z);
        return byteArrayOutputStream.toByteArray();
    }
}
