package com.bumptech.glide.p034a;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.bumptech.glide.a.b */
class C1176b implements Closeable {

    /* renamed from: a */
    private final InputStream f4262a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Charset f4263b;

    /* renamed from: c */
    private byte[] f4264c;

    /* renamed from: d */
    private int f4265d;

    /* renamed from: e */
    private int f4266e;

    public C1176b(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C1178c.f4268a)) {
            this.f4262a = inputStream;
            this.f4263b = charset;
            this.f4264c = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public C1176b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: c */
    private void m6387c() {
        int read = this.f4262a.read(this.f4264c, 0, this.f4264c.length);
        if (read != -1) {
            this.f4265d = 0;
            this.f4266e = read;
            return;
        }
        throw new EOFException();
    }

    /* renamed from: a */
    public String mo5706a() {
        int i;
        int i2;
        synchronized (this.f4262a) {
            if (this.f4264c != null) {
                if (this.f4265d >= this.f4266e) {
                    m6387c();
                }
                for (int i3 = this.f4265d; i3 != this.f4266e; i3++) {
                    if (this.f4264c[i3] == 10) {
                        if (i3 != this.f4265d) {
                            i2 = i3 - 1;
                            if (this.f4264c[i2] == 13) {
                                String str = new String(this.f4264c, this.f4265d, i2 - this.f4265d, this.f4263b.name());
                                this.f4265d = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.f4264c, this.f4265d, i2 - this.f4265d, this.f4263b.name());
                        this.f4265d = i3 + 1;
                        return str2;
                    }
                }
                C11771 r1 = new ByteArrayOutputStream((this.f4266e - this.f4265d) + 80) {
                    public String toString() {
                        try {
                            return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + -1] != 13) ? this.count : this.count - 1, C1176b.this.f4263b.name());
                        } catch (UnsupportedEncodingException e) {
                            throw new AssertionError(e);
                        }
                    }
                };
                loop1:
                while (true) {
                    r1.write(this.f4264c, this.f4265d, this.f4266e - this.f4265d);
                    this.f4266e = -1;
                    m6387c();
                    i = this.f4265d;
                    while (true) {
                        if (i != this.f4266e) {
                            if (this.f4264c[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.f4265d) {
                    r1.write(this.f4264c, this.f4265d, i - this.f4265d);
                }
                this.f4265d = i + 1;
                String byteArrayOutputStream = r1.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }

    /* renamed from: b */
    public boolean mo5707b() {
        return this.f4266e == -1;
    }

    public void close() {
        synchronized (this.f4262a) {
            if (this.f4264c != null) {
                this.f4264c = null;
                this.f4262a.close();
            }
        }
    }
}
