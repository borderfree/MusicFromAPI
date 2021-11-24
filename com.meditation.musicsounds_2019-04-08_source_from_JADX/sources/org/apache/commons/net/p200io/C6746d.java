package org.apache.commons.net.p200io;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: org.apache.commons.net.io.d */
public final class C6746d extends FilterOutputStream {

    /* renamed from: a */
    private boolean f23709a = false;

    public C6746d(OutputStream outputStream) {
        super(outputStream);
    }

    public synchronized void write(int i) {
        if (i != 10) {
            if (i == 13) {
                this.f23709a = true;
                this.out.write(13);
                return;
            }
        } else if (!this.f23709a) {
            this.out.write(13);
        }
        this.f23709a = false;
        this.out.write(i);
    }

    public synchronized void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                int i4 = i + 1;
                write((int) bArr[i]);
                i = i4;
                i2 = i3;
            }
        }
    }
}
