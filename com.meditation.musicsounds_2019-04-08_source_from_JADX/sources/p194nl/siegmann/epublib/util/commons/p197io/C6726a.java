package p194nl.siegmann.epublib.util.commons.p197io;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

/* renamed from: nl.siegmann.epublib.util.commons.io.a */
public class C6726a extends C6727b {

    /* renamed from: a */
    private final boolean f23608a;

    /* renamed from: b */
    private final List<ByteOrderMark> f23609b;

    /* renamed from: c */
    private ByteOrderMark f23610c;

    /* renamed from: d */
    private int[] f23611d;

    /* renamed from: e */
    private int f23612e;

    /* renamed from: f */
    private int f23613f;

    /* renamed from: g */
    private int f23614g;

    /* renamed from: h */
    private boolean f23615h;

    public C6726a(InputStream inputStream, boolean z, ByteOrderMark... byteOrderMarkArr) {
        super(inputStream);
        if (byteOrderMarkArr == null || byteOrderMarkArr.length == 0) {
            throw new IllegalArgumentException("No BOMs specified");
        }
        this.f23608a = z;
        this.f23609b = Arrays.asList(byteOrderMarkArr);
    }

    /* renamed from: a */
    private boolean m32431a(ByteOrderMark byteOrderMark) {
        if (byteOrderMark.length() != this.f23612e) {
            return false;
        }
        for (int i = 0; i < byteOrderMark.length(); i++) {
            if (byteOrderMark.get(i) != this.f23611d[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private int m32432c() {
        mo21068a();
        if (this.f23613f >= this.f23612e) {
            return -1;
        }
        int[] iArr = this.f23611d;
        int i = this.f23613f;
        this.f23613f = i + 1;
        return iArr[i];
    }

    /* renamed from: d */
    private ByteOrderMark m32433d() {
        for (ByteOrderMark byteOrderMark : this.f23609b) {
            if (m32431a(byteOrderMark)) {
                return byteOrderMark;
            }
        }
        return null;
    }

    /* renamed from: a */
    public ByteOrderMark mo21068a() {
        if (this.f23611d == null) {
            int i = 0;
            for (ByteOrderMark length : this.f23609b) {
                i = Math.max(i, length.length());
            }
            this.f23611d = new int[i];
            int i2 = 0;
            while (true) {
                if (i2 >= this.f23611d.length) {
                    break;
                }
                this.f23611d[i2] = this.in.read();
                this.f23612e++;
                if (this.f23611d[i2] < 0) {
                    break;
                }
                this.f23610c = m32433d();
                if (this.f23610c == null) {
                    i2++;
                } else if (!this.f23608a) {
                    this.f23612e = 0;
                }
            }
        }
        return this.f23610c;
    }

    /* renamed from: b */
    public String mo21069b() {
        mo21068a();
        if (this.f23610c == null) {
            return null;
        }
        return this.f23610c.getCharsetName();
    }

    public synchronized void mark(int i) {
        this.f23614g = this.f23613f;
        this.f23615h = this.f23611d == null;
        this.in.mark(i);
    }

    public int read() {
        int c = m32432c();
        return c >= 0 ? c : this.in.read();
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        while (i2 > 0 && i3 >= 0) {
            i3 = m32432c();
            if (i3 >= 0) {
                int i5 = i + 1;
                bArr[i] = (byte) (i3 & 255);
                i2--;
                i4++;
                i = i5;
            }
        }
        int read = this.in.read(bArr, i, i2);
        if (read >= 0) {
            return i4 + read;
        }
        if (i4 > 0) {
            return i4;
        }
        return -1;
    }

    public synchronized void reset() {
        this.f23613f = this.f23614g;
        if (this.f23615h) {
            this.f23611d = null;
        }
        this.in.reset();
    }

    public long skip(long j) {
        while (j > 0 && m32432c() >= 0) {
            j--;
        }
        return this.in.skip(j);
    }
}
