package p194nl.siegmann.epublib.util.commons.p197io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: nl.siegmann.epublib.util.commons.io.b */
public abstract class C6727b extends FilterInputStream {
    public C6727b(InputStream inputStream) {
        super(inputStream);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21076a(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21077a(IOException iOException) {
        throw iOException;
    }

    public int available() {
        try {
            return super.available();
        } catch (IOException e) {
            mo21077a(e);
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo21079b(int i) {
    }

    public void close() {
        try {
            this.in.close();
        } catch (IOException e) {
            mo21077a(e);
        }
    }

    public synchronized void mark(int i) {
        this.in.mark(i);
    }

    public boolean markSupported() {
        return this.in.markSupported();
    }

    public int read() {
        int i = 1;
        try {
            mo21076a(1);
            int read = this.in.read();
            if (read == -1) {
                i = -1;
            }
            mo21079b(i);
            return read;
        } catch (IOException e) {
            mo21077a(e);
            return -1;
        }
    }

    public int read(byte[] bArr) {
        int i;
        if (bArr != null) {
            try {
                i = bArr.length;
            } catch (IOException e) {
                mo21077a(e);
                return -1;
            }
        } else {
            i = 0;
        }
        mo21076a(i);
        int read = this.in.read(bArr);
        mo21079b(read);
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            mo21076a(i2);
            int read = this.in.read(bArr, i, i2);
            mo21079b(read);
            return read;
        } catch (IOException e) {
            mo21077a(e);
            return -1;
        }
    }

    public synchronized void reset() {
        try {
            this.in.reset();
        } catch (IOException e) {
            mo21077a(e);
        }
        return;
    }

    public long skip(long j) {
        try {
            return this.in.skip(j);
        } catch (IOException e) {
            mo21077a(e);
            return 0;
        }
    }
}
