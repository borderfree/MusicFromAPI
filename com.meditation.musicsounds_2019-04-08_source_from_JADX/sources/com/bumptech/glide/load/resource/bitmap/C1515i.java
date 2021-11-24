package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.engine.p046a.C1393b;
import com.bumptech.glide.p040g.C1257i;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: com.bumptech.glide.load.resource.bitmap.i */
public final class C1515i implements ImageHeaderParser {

    /* renamed from: a */
    static final byte[] f4970a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    private static final int[] f4971b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: com.bumptech.glide.load.resource.bitmap.i$a */
    private static final class C1516a implements C1518c {

        /* renamed from: a */
        private final ByteBuffer f4972a;

        C1516a(ByteBuffer byteBuffer) {
            this.f4972a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int mo6319a() {
            return ((mo6323c() << 8) & 65280) | (mo6323c() & 255);
        }

        /* renamed from: a */
        public int mo6320a(byte[] bArr, int i) {
            int min = Math.min(i, this.f4972a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f4972a.get(bArr, 0, min);
            return min;
        }

        /* renamed from: a */
        public long mo6321a(long j) {
            int min = (int) Math.min((long) this.f4972a.remaining(), j);
            this.f4972a.position(this.f4972a.position() + min);
            return (long) min;
        }

        /* renamed from: b */
        public short mo6322b() {
            return (short) (mo6323c() & 255);
        }

        /* renamed from: c */
        public int mo6323c() {
            if (this.f4972a.remaining() < 1) {
                return -1;
            }
            return this.f4972a.get();
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.i$b */
    private static final class C1517b {

        /* renamed from: a */
        private final ByteBuffer f4973a;

        C1517b(byte[] bArr, int i) {
            this.f4973a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* renamed from: a */
        private boolean m7555a(int i, int i2) {
            return this.f4973a.remaining() - i >= i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo6324a() {
            return this.f4973a.remaining();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo6325a(int i) {
            if (m7555a(i, 4)) {
                return this.f4973a.getInt(i);
            }
            return -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6326a(ByteOrder byteOrder) {
            this.f4973a.order(byteOrder);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public short mo6327b(int i) {
            if (m7555a(i, 2)) {
                return this.f4973a.getShort(i);
            }
            return -1;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.i$c */
    private interface C1518c {
        /* renamed from: a */
        int mo6319a();

        /* renamed from: a */
        int mo6320a(byte[] bArr, int i);

        /* renamed from: a */
        long mo6321a(long j);

        /* renamed from: b */
        short mo6322b();

        /* renamed from: c */
        int mo6323c();
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.i$d */
    private static final class C1519d implements C1518c {

        /* renamed from: a */
        private final InputStream f4974a;

        C1519d(InputStream inputStream) {
            this.f4974a = inputStream;
        }

        /* renamed from: a */
        public int mo6319a() {
            return ((this.f4974a.read() << 8) & 65280) | (this.f4974a.read() & 255);
        }

        /* renamed from: a */
        public int mo6320a(byte[] bArr, int i) {
            int i2 = i;
            while (i2 > 0) {
                int read = this.f4974a.read(bArr, i - i2, i2);
                if (read == -1) {
                    break;
                }
                i2 -= read;
            }
            return i - i2;
        }

        /* renamed from: a */
        public long mo6321a(long j) {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f4974a.skip(j2);
                if (skip <= 0) {
                    if (this.f4974a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }

        /* renamed from: b */
        public short mo6322b() {
            return (short) (this.f4974a.read() & 255);
        }

        /* renamed from: c */
        public int mo6323c() {
            return this.f4974a.read();
        }
    }

    /* renamed from: a */
    private static int m7539a(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: a */
    private static int m7540a(C1517b bVar) {
        ByteOrder byteOrder;
        String str;
        String str2;
        String str3;
        StringBuilder sb;
        int length = "Exif\u0000\u0000".length();
        short b = bVar.mo6327b(length);
        if (b != 18761) {
            if (b != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown endianness = ");
                sb2.append(b);
                Log.d("DfltImageHeaderParser", sb2.toString());
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.mo6326a(byteOrder);
        int a = bVar.mo6325a(length + 4) + length;
        short b2 = bVar.mo6327b(a);
        for (int i = 0; i < b2; i++) {
            int a2 = m7539a(a, i);
            short b3 = bVar.mo6327b(a2);
            if (b3 == 274) {
                short b4 = bVar.mo6327b(a2 + 2);
                if (b4 >= 1 && b4 <= 12) {
                    int a3 = bVar.mo6325a(a2 + 4);
                    if (a3 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Got tagIndex=");
                            sb3.append(i);
                            sb3.append(" tagType=");
                            sb3.append(b3);
                            sb3.append(" formatCode=");
                            sb3.append(b4);
                            sb3.append(" componentCount=");
                            sb3.append(a3);
                            Log.d("DfltImageHeaderParser", sb3.toString());
                        }
                        int i2 = a3 + f4971b[b4];
                        if (i2 <= 4) {
                            int i3 = a2 + 8;
                            if (i3 < 0 || i3 > bVar.mo6324a()) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("Illegal tagValueOffset=");
                                    sb4.append(i3);
                                    sb4.append(" tagType=");
                                    sb4.append(b3);
                                    Log.d("DfltImageHeaderParser", sb4.toString());
                                }
                            } else if (i2 >= 0 && i2 + i3 <= bVar.mo6324a()) {
                                return bVar.mo6327b(i3);
                            } else {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    str2 = "DfltImageHeaderParser";
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("Illegal number of bytes for TI tag data tagType=");
                                    sb5.append(b3);
                                    str = sb5.toString();
                                    Log.d(str2, str);
                                }
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            str2 = "DfltImageHeaderParser";
                            sb = new StringBuilder();
                            str3 = "Got byte count > 4, not orientation, continuing, formatCode=";
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        str2 = "DfltImageHeaderParser";
                        str = "Negative tiff component count";
                        Log.d(str2, str);
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    str2 = "DfltImageHeaderParser";
                    sb = new StringBuilder();
                    str3 = "Got invalid format code = ";
                }
                sb.append(str3);
                sb.append(b4);
                str = sb.toString();
                Log.d(str2, str);
            }
        }
        return -1;
    }

    /* renamed from: a */
    private int m7541a(C1518c cVar, C1393b bVar) {
        int a = cVar.mo6319a();
        if (!m7544a(a)) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Parser doesn't handle magic number: ");
                sb.append(a);
                Log.d("DfltImageHeaderParser", sb.toString());
            }
            return -1;
        }
        int b = m7546b(cVar);
        if (b == -1) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
            }
            return -1;
        }
        byte[] bArr = (byte[]) bVar.mo6116a(b, byte[].class);
        try {
            return m7542a(cVar, bArr, b);
        } finally {
            bVar.mo6119a(bArr);
        }
    }

    /* renamed from: a */
    private int m7542a(C1518c cVar, byte[] bArr, int i) {
        int a = cVar.mo6320a(bArr, i);
        if (a != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to read exif segment data, length: ");
                sb.append(i);
                sb.append(", actually read: ");
                sb.append(a);
                Log.d("DfltImageHeaderParser", sb.toString());
            }
            return -1;
        } else if (m7545a(bArr, i)) {
            return m7540a(new C1517b(bArr, i));
        } else {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
    }

    /* renamed from: a */
    private ImageType m7543a(C1518c cVar) {
        int a = cVar.mo6319a();
        if (a == 65496) {
            return ImageType.JPEG;
        }
        int a2 = ((a << 16) & -65536) | (cVar.mo6319a() & 65535);
        if (a2 == -1991225785) {
            cVar.mo6321a(21);
            return cVar.mo6323c() >= 3 ? ImageType.PNG_A : ImageType.PNG;
        } else if ((a2 >> 8) == 4671814) {
            return ImageType.GIF;
        } else {
            if (a2 != 1380533830) {
                return ImageType.UNKNOWN;
            }
            cVar.mo6321a(4);
            if ((((cVar.mo6319a() << 16) & -65536) | (cVar.mo6319a() & 65535)) != 1464156752) {
                return ImageType.UNKNOWN;
            }
            int a3 = ((cVar.mo6319a() << 16) & -65536) | (cVar.mo6319a() & 65535);
            if ((a3 & -256) != 1448097792) {
                return ImageType.UNKNOWN;
            }
            int i = a3 & 255;
            if (i == 88) {
                cVar.mo6321a(4);
                return (cVar.mo6323c() & 16) != 0 ? ImageType.WEBP_A : ImageType.WEBP;
            } else if (i != 76) {
                return ImageType.WEBP;
            } else {
                cVar.mo6321a(4);
                return (cVar.mo6323c() & 8) != 0 ? ImageType.WEBP_A : ImageType.WEBP;
            }
        }
    }

    /* renamed from: a */
    private static boolean m7544a(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* renamed from: a */
    private boolean m7545a(byte[] bArr, int i) {
        boolean z = bArr != null && i > f4970a.length;
        if (!z) {
            return z;
        }
        for (int i2 = 0; i2 < f4970a.length; i2++) {
            if (bArr[i2] != f4970a[i2]) {
                return false;
            }
        }
        return z;
    }

    /* renamed from: b */
    private int m7546b(C1518c cVar) {
        short b;
        int a;
        long j;
        long a2;
        do {
            short b2 = cVar.mo6322b();
            if (b2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown segmentId=");
                    sb.append(b2);
                    Log.d("DfltImageHeaderParser", sb.toString());
                }
                return -1;
            }
            b = cVar.mo6322b();
            if (b == 218) {
                return -1;
            }
            if (b == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            a = cVar.mo6319a() - 2;
            if (b == 225) {
                return a;
            }
            j = (long) a;
            a2 = cVar.mo6321a(j);
        } while (a2 == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to skip enough data, type: ");
            sb2.append(b);
            sb2.append(", wanted to skip: ");
            sb2.append(a);
            sb2.append(", but actually skipped: ");
            sb2.append(a2);
            Log.d("DfltImageHeaderParser", sb2.toString());
        }
        return -1;
    }

    /* renamed from: a */
    public int mo5918a(InputStream inputStream, C1393b bVar) {
        return m7541a((C1518c) new C1519d((InputStream) C1257i.m6691a(inputStream)), (C1393b) C1257i.m6691a(bVar));
    }

    /* renamed from: a */
    public ImageType mo5919a(InputStream inputStream) {
        return m7543a((C1518c) new C1519d((InputStream) C1257i.m6691a(inputStream)));
    }

    /* renamed from: a */
    public ImageType mo5920a(ByteBuffer byteBuffer) {
        return m7543a((C1518c) new C1516a((ByteBuffer) C1257i.m6691a(byteBuffer)));
    }
}
