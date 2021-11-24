package org.apache.commons.net.p200io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* renamed from: org.apache.commons.net.io.e */
public final class C6747e {
    /* renamed from: a */
    public static final long m32580a(InputStream inputStream, OutputStream outputStream, int i, long j, C6745c cVar, boolean z) {
        long j2;
        OutputStream outputStream2 = outputStream;
        byte[] bArr = new byte[(i >= 0 ? i : 1024)];
        long j3 = 0;
        InputStream inputStream2 = inputStream;
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                if (read == 0) {
                    int read2 = inputStream.read();
                    if (read2 < 0) {
                        break;
                    }
                    outputStream.write(read2);
                    if (z) {
                        outputStream.flush();
                    }
                    j2 = j3 + 1;
                    if (cVar != null) {
                        try {
                            cVar.mo19748a(j2, 1, j);
                        } catch (IOException e) {
                            e = e;
                            j3 = j2;
                        }
                    }
                } else {
                    outputStream.write(bArr, 0, read);
                    if (z) {
                        outputStream.flush();
                    }
                    j2 = j3 + ((long) read);
                    if (cVar != null) {
                        cVar.mo19748a(j2, read, j);
                    }
                }
                j3 = j2;
            } catch (IOException e2) {
                e = e2;
                throw new CopyStreamException("IOException caught while copying.", j3, e);
            }
        }
        return j3;
    }

    /* renamed from: a */
    public static void m32581a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
    }
}
